package br.com.delazari.springMongo.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.com.delazari.springMongo.entity.Student;

/**
 * 
 * @author delazari
 * 
 */

@Repository
public interface StudentRepository extends MongoRepository<Student, String>{

    Optional<Student> findByEmail(String email);
}
