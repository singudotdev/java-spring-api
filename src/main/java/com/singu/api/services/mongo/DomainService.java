package com.singu.api.services.mongo;

import com.singu.api.domains.mongo.Domain;
import com.singu.api.repositories.mongo.DomainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DomainService {

    @Autowired
    private DomainRepository repository;

    public Domain getByName(String name) {
        return repository.findByName(name);
    }

    public List<Domain> getAll() {
        return repository.findAll();
    }
}
