package com.springdata.populator.repository;

import com.springdata.populator.model.Film;
import java.util.UUID;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface FilmRepository extends MongoRepository<Film, UUID> {
}
