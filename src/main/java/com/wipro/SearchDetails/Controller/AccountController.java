package com.wipro.SearchDetails.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.wipro.SearchDetails.Service.AccountDetailsService;
import com.wipro.SearchDetails.domain.AccountDetails;

@Controller
public class AccountController {
	
	@Autowired
	private AccountDetailsService service;
	
	@GetMapping("/")
	public String add(Model model){
		List<AccountDetails> listdetails = service.listAll();
		
		model.addAttribute("accountdetails", new AccountDetails());
		return "index";
	}
	
	@PostMapping("/search")
	public String doSearchEmployee(@ModelAttribute("accountdetailsSearchFormData") AccountDetails formData, Model model) {
		AccountDetails details = service.get(formData.getId());
		model.addAttribute("accountdetails", details);
		return "index";
	}
}
