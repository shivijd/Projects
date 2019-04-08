package com.capgemini.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.capgemini.beans.Transactions;


public interface WalletRepo2 extends JpaRepository<Transactions, Integer> {
	@Query("select t.statements from Transactions t where t.mobileNo=?1")
	List findTranscations(String mob);
	
}
