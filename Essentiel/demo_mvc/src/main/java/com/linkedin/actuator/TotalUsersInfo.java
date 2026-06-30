
package com.linkedin.actuator;

import org.springframework.boot.actuate.info.Info.Builder;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.stereotype.Component;

import com.linkedin.data.UserRepository;

@Component
public class TotalUsersInfo implements InfoContributor{

    private final UserRepository repository;

    public TotalUsersInfo(UserRepository repository){
        this.repository=repository;
    }

    @Override
    public void contribute(Builder builder) {
        
        builder.withDetail("users", this.repository.count());
    }
}
