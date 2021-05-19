package com.example.pcmarketapp.Repository;

import com.example.pcmarketapp.Entity.Users;
import com.example.pcmarketapp.Projection.UsersProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "user",excerptProjection = UsersProjection.class)
public interface UsersRepository extends JpaRepository<Users,Integer> {
}
