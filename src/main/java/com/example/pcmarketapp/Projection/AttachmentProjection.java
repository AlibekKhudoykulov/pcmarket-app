package com.example.pcmarketapp.Projection;

import com.example.pcmarketapp.Entity.Attachment;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Attachment.class)
public interface AttachmentProjection {
    Integer getId();

    String getName();

    long getSize();

    String getContentType();
}
