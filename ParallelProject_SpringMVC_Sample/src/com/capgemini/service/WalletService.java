package com.capgemini.service;
import java.math.BigDecimal;
import java.util.List;

import com.capgemini.beans.Customer;
import com.capgemini.exception.InsufficientBalanceException;
import com.capgemini.exception.InvalidInputException;

public interface WalletService {
public Customer createAccount(Customer customer);
public Customer showBalance (String mobileno);
public Customer fundTransfer (String sourceMobileNo,String targetMobileNo, BigDecimal amount) throws InvalidInputException, InsufficientBalanceException;
public Customer depositAmount (String mobileNo,BigDecimal amount )throws InvalidInputException;
public Customer withdrawAmount(String mobileNo, BigDecimal amount)throws InvalidInputException, InsufficientBalanceException;

public List getTransaction(String mob);
}
