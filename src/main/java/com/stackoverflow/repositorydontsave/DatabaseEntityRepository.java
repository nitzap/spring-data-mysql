package com.stackoverflow.repositorydontsave;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by gcasanova on 5/31/17.
 */
public interface DatabaseEntityRepository extends CrudRepository<DatabaseEntity, Long> {

}