package com.project.onlyfactdb.repositories;

import org.springframework.data.repository.CrudRepository;

import com.project.onlyfactdb.model.Publication;

public interface PublicationRepository extends CrudRepository<Publication, Long>{
}
