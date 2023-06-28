package com.playandvote.inventoryservice.entities;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.io.Serializable;
import java.util.Date;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
@Data
public abstract class BaseEntity implements Serializable {

    @Column(name = "create_date")
    private Date createDate;

    @Column(name = "created_by", length = 50)
    private String createdBy;

    @LastModifiedDate
    private Date updateAt;

    @Column(name = "updated_by")
    private String updatedBy;

    @Enumerated(EnumType.STRING)
    @Column(name="status")
    private Status status;
}
