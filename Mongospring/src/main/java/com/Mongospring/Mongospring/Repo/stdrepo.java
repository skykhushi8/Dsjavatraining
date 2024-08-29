package com.Mongospring.Mongospring.Repo;

import com.Mongospring.Mongospring.Model.student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface stdrepo extends MongoRepository<student, Integer> {
}
