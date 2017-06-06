package com.m2i.MiniBank.Presentation;

import java.util.Locale;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.m2i.MiniBank.Entity.Client;
import com.m2i.MiniBank.service.IMininBankClientService;

@Controller
public class ClientController {

	@Resource(name="MiniBankClientService")
	private IMininBankClientService clientService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String clients(Locale locale, Model model) {
		model.addAttribute("client", new Client());
		model.addAttribute("clients", clientService.listerClients());
		return "client";
	}

	@RequestMapping(value="/ajouterClient")
	public String save(Client client, Model model){
//		if(client.getClientID()==0) 
			clientService.ajouterClient(client);
		model.addAttribute("client", new Client());
		model.addAttribute("clients", clientService.listerClients());
		return "detailsComptes";
	}
	
	@RequestMapping(value="/supprimerClient")
	public String delete(Long clientID, Model model){ 
		Client client = new Client(); 
		client.setClientID(clientID);;
		clientService.supprimerClient(client);
		model.addAttribute("client", new Client() );
		model.addAttribute("clients", clientService.listerClients());
		return "client";
	}

	@RequestMapping(value="/modifierClient")
	public String edit(Long clientID, Model model){ 
		Client client = clientService.listerClientParId(clientID);
		model.addAttribute("client", client);
		model.addAttribute("clients", clientService.listerClients());
		return "client";
	}
 	
}
 