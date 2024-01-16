package com.singu.api.services.mongo;

import com.singu.api.domains.mongo.Domain;
import com.singu.api.domains.requests.DomainRequest;
import com.singu.api.domains.responses.DomainResponse;
import com.singu.api.mappers.DomainMapper;
import com.singu.api.repositories.mongo.DomainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DomainService {

    @Autowired
    private DomainRepository repository;

    public Domain getByName(String name) {
        return repository.findByName(name);
    }

    public List<DomainResponse> getAll() {
        final List<Domain> domains = repository.findAll();

        List<DomainResponse> domainResponses = new ArrayList<>();

        domains.forEach(domain -> domainResponses.add(DomainMapper.generateResponse(domain)));
        return domainResponses;
    }

    public DomainResponse create(DomainRequest request) {
        final Domain createdDomain = repository.save(DomainMapper.createDomain(request));

        return DomainMapper.generateResponse(createdDomain);
    }
}
