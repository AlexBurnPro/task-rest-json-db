package com.example.task_db.repositories;

import com.example.task_db.models.Cities;
import org.springframework.data.repository.CrudRepository;

public interface CityRepositories extends CrudRepository<Cities, Integer> {
}
