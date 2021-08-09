package com.example.demo.service.userAcc;

import com.example.demo.dto.request.RegisterAccountRequest;
import com.example.demo.model.UserAccount;
import com.example.demo.service.IGeneralService;


public interface IUserAccountService extends IGeneralService<UserAccount> {

    void saveAccount(RegisterAccountRequest registerAccountRequest);
}
