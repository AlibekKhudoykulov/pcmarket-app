package com.example.pcmarketapp.Projection;

import com.example.pcmarketapp.Entity.Attachment;
import com.example.pcmarketapp.Entity.Users;
import org.springframework.data.rest.core.config.Projection;

import javax.persistence.OneToOne;

@Projection(types = Users.class)
public interface UsersProjection {
     Integer getId();

     String getFullName();

     String getEmail();

     String getPassword();

     Attachment getAttachment();
}
