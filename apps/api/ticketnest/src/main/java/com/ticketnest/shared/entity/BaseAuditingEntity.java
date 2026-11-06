package com.ticketnest.shared.entity;

import java.io.Serializable;
import java.time.Instant;
import java.util.UUID;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.SuperBuilder;

@Getter 
@Setter 
@AllArgsConstructor 
@NoArgsConstructor 
@SuperBuilder 
public abstract class BaseAuditingEntity implements Serializable{

    @Id 
    @GeneratedValue (strategy = GenerationType.UUID)
    private UUID id;

    @CreatedDate 
    private Instant createdAt;

    @LastModifiedDate 
    private Instant updatedAt;

    @Builder.Default
    private Boolean is_active = true;

}
