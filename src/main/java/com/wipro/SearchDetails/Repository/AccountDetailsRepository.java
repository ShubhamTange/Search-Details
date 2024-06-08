package com.wipro.SearchDetails.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.SearchDetails.domain.AccountDetails;

public interface AccountDetailsRepository extends JpaRepository<AccountDetails, Long>{

}
