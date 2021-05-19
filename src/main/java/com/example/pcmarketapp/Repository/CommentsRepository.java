package com.example.pcmarketapp.Repository;

import com.example.pcmarketapp.Entity.Comments;
import com.example.pcmarketapp.Projection.CommentsProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "comments",excerptProjection = CommentsProjection.class)
public interface CommentsRepository extends JpaRepository<Comments,Integer> {
}
