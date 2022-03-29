package com.joaomedeiros.rediscache.service;

import com.joaomedeiros.rediscache.model.EntityCached;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class CacheEntityService {

    @Cacheable(value = "findEntity", key = "#id")
    public EntityCached getEntityCached(Long id) {
        return new EntityCached(id, LocalDate.now());
    }
}
