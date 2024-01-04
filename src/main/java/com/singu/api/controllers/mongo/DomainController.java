package com.singu.api.controllers.mongo;

import com.singu.api.domains.mongo.Domain;
import com.singu.api.services.mongo.DomainService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Tag(name = "Domain MongoDB")
@RequestMapping("/api/v1/mongo/domains")
public class DomainController {

    @Autowired
    private DomainService service;

    @GetMapping("/{name}")
    public ResponseEntity<Domain> getByName(@RequestParam("name") String name) {

        return ResponseEntity.ok(service.getByName(name));

    }

    @GetMapping
    public ResponseEntity<List<Domain>> getAll(){
        return ResponseEntity.ok(service.getAll());
    }

    @PostMapping
    public ResponseEntity<Domain> create(@RequestBody Domain domain){
        return ResponseEntity.ok(service.create(domain));
    }

}
