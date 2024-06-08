package com.wipro.SearchDetails.domain;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="accountdetails")
public class AccountDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private Long id;
	
	@Column(name = "Account_Num", nullable=false)
	private Long account_Num;
	
	@Column(name = "Account_Type")
	private String acc_Type;
	
	@Column(name = "Branch_Name")
	private String branch_Name;
	
	@Column(name = "Balance")
	private Long balance;
	
	public AccountDetails() {
		super();
	}

	public AccountDetails(Long account_Num, String acc_Type, String branch_Name, Long balance, Integer amount, Date sdate, Date edate) {
		super();
		this.account_Num = account_Num;
		this.acc_Type = acc_Type;
		this.branch_Name = branch_Name;
		this.balance = balance;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getAccount_Num() {
		return account_Num;
	}
	public void setAccount_Num(Long account_Num) {
		this.account_Num = account_Num;
	}
	public String getAcc_Type() {
		return acc_Type;
	}
	public void setAcc_Type(String acc_Type) {
		this.acc_Type = acc_Type;
	}
	public String getBranch_Name() {
		return branch_Name;
	}
	public void setBranch_Name(String branch_Name) {
		this.branch_Name = branch_Name;
	}
	public Long getBalance() {
		return balance;
	}
	public void setBalance(Long balance) {
		this.balance = balance;
	}	
}