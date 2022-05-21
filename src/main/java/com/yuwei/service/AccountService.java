package com.yuwei.service;

import com.yuwei.domain.Account;

import java.util.List;

public interface AccountService {
    public void save(Account account);
    public List<Account> findAll();
}
