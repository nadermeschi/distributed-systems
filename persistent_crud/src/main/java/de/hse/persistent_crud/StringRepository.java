package de.hse.persistent_crud;

import org.springframework.data.repository.CrudRepository;

public interface StringRepository extends CrudRepository<StringEntity, String> {

}