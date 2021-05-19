package com.example.pcmarketapp.Repository;

import com.example.pcmarketapp.Entity.Attachment;
import com.example.pcmarketapp.Projection.AttachmentProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "attachment",excerptProjection = AttachmentProjection.class)
public interface AttachmentRepository extends JpaRepository<Attachment,Integer> {
}
