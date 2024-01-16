package com.singu.api.mappers;

import com.singu.api.domains.mongo.Domain;
import com.singu.api.domains.requests.DomainRequest;
import com.singu.api.domains.responses.DomainResponse;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

public class DomainMapper {

    private DomainMapper(){

    }

    public static DomainResponse generateResponse(Domain domain) {
        return DomainResponse.builder()
                .id(domain.getId())
                .name(domain.getName())
                .build();
    }

    public static Domain createDomain(DomainRequest domain) {
        return Domain.builder()
                .id(null)
                .name(domain.getName())
                .build();
    }

    public static Domain updatedomain(Domain domain) {
        return Domain.builder()
                .id(domain.getId())
                .name(domain.getName())
                .build();
    }

}
