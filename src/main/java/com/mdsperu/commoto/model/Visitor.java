package com.mdsperu.commoto.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@NoArgsConstructor
@Getter
@Setter
@Entity
public class Visitor {
    @Id
    private long id;
    private String ip;
    private boolean acceptedCookies;
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime visitedAt;
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime leftAt;
}
