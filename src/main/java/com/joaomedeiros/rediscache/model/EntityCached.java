package com.joaomedeiros.rediscache.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;

@Data
@AllArgsConstructor
public class EntityCached implements Serializable {

    private Long id;
    private LocalDate dataInicio;
}
