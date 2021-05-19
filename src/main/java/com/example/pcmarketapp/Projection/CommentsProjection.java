package com.example.pcmarketapp.Projection;

import com.example.pcmarketapp.Entity.Comments;
import com.example.pcmarketapp.Entity.Users;
import org.springframework.data.rest.core.config.Projection;

import javax.persistence.ManyToOne;

@Projection(types = Comments.class)
public interface CommentsProjection {
     Integer getId();

     String getBody();

     Users getUsers();
}
