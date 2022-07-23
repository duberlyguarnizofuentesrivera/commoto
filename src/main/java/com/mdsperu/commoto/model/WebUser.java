package com.mdsperu.commoto.model;


import com.mdsperu.commoto.enums.Country;
import com.mdsperu.commoto.enums.UserState;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@NoArgsConstructor
@Getter
@Setter
@Entity
public class WebUser {
    @Id
    @GeneratedValue
    long id;
    @Column(length = 32)
    private String username;
    private String password;
    private String email;
    private String names;
    @Enumerated(EnumType.STRING)
    private Country country;
    @Enumerated(EnumType.STRING)
    private UserState state;
    @Column(nullable = false, updatable = false)
    @CreationTimestamp
    private LocalDateTime createdAt;
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime updatedAt;
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime lastLogin;
}
