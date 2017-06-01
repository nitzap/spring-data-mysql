package com.stackoverflow.repositorydontsave;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * Created by gcasanova on 5/31/17.
 */
@RestController
public class MainController {

    @Autowired
    private DatabaseEntityRepository repository;

    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    public Iterable<DatabaseEntity> getAll() {

        return repository.findAll();
    }

    @RequestMapping(method = RequestMethod.POST, produces = "application/json")
    public DatabaseEntity saveMyEntity(@Valid @RequestBody final DatabaseEntity myEntity) {
        Assert.notNull(myEntity, "The entry cannot be null");
        return repository.save(myEntity);
    }
}
