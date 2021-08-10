package br.com.delazari.springMongo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.delazari.springMongo.entity.Student;
import br.com.delazari.springMongo.repository.StudentRepository;

/**
 * 
 * @author delazari
 * 
 */

@Service
public class StudentService {

    @Autowired
    public StudentRepository studentRepository;

    public List<Student> buscarTodosEstudantes() {
        return studentRepository.findAll();
    }

    public Student gravar(Student student) {
        return studentRepository.insert(student);
    }
}
