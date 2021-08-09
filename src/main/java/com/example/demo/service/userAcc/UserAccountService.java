package com.example.demo.service.userAcc;

import com.example.demo.dto.request.RegisterAccountRequest;
import com.example.demo.model.Role;
import com.example.demo.model.UserAccount;
import com.example.demo.model.relationClass.User_Role;
import com.example.demo.repository.RoleRepository;
import com.example.demo.repository.UserAccountRepository;
import com.example.demo.repository.relationRepo.User_Role_Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class UserAccountService implements IUserAccountService{
    @Autowired
    UserAccountRepository userAccountRepository;
    @Autowired
    RoleRepository roleRepository;

    @Autowired
    User_Role_Repo user_role_repo;


    @Override
    public Iterable<UserAccount> findAll() {
        return userAccountRepository.findAll();
    }

    @Override
    public Optional<UserAccount> findById(Long id) {
        return userAccountRepository.findById(id);
    }

    @Override
    public void delete(Long id) {
          userAccountRepository.deleteById(id);
    }

    @Override
    public UserAccount save(UserAccount userAccount) {
        return userAccountRepository.save(userAccount);
    }


    @Override
    public void saveAccount(RegisterAccountRequest registerAccountRequest) {
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername(registerAccountRequest.getUsername());
        userAccount.setPassword(registerAccountRequest.getPassword());
        userAccount.setEmail(registerAccountRequest.getEmail());
        userAccount.setPhone(registerAccountRequest.getPhone());
        UserAccount newAccount = userAccountRepository.save(userAccount);

        Long newId = newAccount.getId();

//        registerAccountRequest.getRole().stream().forEach(role->{
//            User_Role  user_role = new User_Role(newId, role);
//             user_role_repo.save(user_role)});

        Long[] roleList = registerAccountRequest.getRole();
        for (Long roleId:roleList) {
            user_role_repo.save(new User_Role(newId, roleId));
        }


    }



}
