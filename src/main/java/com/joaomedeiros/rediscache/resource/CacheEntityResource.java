package com.joaomedeiros.rediscache.resource;

import com.joaomedeiros.rediscache.model.EntityCached;
import com.joaomedeiros.rediscache.service.CacheEntityService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class CacheEntityResource {

    private final CacheEntityService cacheEntityService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public EntityCached getEntityCached() {
        return cacheEntityService.getEntityCached(1L);
    }
}
