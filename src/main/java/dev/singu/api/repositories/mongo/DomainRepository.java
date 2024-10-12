package dev.singu.api.repositories.mongo;

import dev.singu.api.domains.mongo.Domain;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface DomainRepository extends MongoRepository<Domain, String> {

    @Query("{name:'?0'}")
    Domain findByName(String name);

}
