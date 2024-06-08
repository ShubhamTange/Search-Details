package com.wipro.SearchDetails.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.SearchDetails.Repository.AccountDetailsRepository;
import com.wipro.SearchDetails.domain.AccountDetails;

@Service
public class AccountDetailsService {
	@Autowired
	private AccountDetailsRepository repo;
	
	public List<AccountDetails> listAll(){
		return repo.findAll();
	}
	
	public AccountDetails get(long id) {
		return repo.findById(id).get();
	}
}
