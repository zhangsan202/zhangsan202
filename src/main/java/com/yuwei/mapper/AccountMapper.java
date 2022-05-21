package com.yuwei.mapper;

import com.yuwei.domain.Account;

import java.util.List;

public interface AccountMapper {
    public void save(Account account);
    public List<Account> findAll();
}
