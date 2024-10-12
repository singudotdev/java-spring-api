package dev.singu.api.services.mongo;

import dev.singu.api.domains.mongo.Domain;
import dev.singu.api.domains.requests.DomainRequest;
import dev.singu.api.domains.responses.DomainResponse;
import dev.singu.api.mappers.DomainMapper;
import dev.singu.api.repositories.mongo.DomainRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class DomainService {

    private final DomainRepository repository;

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
