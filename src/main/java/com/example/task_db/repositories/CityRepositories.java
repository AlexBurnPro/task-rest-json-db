package com.example.task_db.repositories;

import com.example.task_db.models.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepositories extends JpaRepository<City, Integer> {
}
