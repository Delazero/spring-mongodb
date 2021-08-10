package br.com.delazari.springMongo.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.delazari.springMongo.entity.Student;
import br.com.delazari.springMongo.service.StudentService;

/**
 * 
 * @author delazari
 * 
 */

@RestController
@RequestMapping("/student")
public class StudentResource {
    
    @Autowired
    private StudentService studentService;

    @GetMapping("/all")
    public List<Student> fetchAllStudents() {
        return studentService.buscarTodosEstudantes();
    }

    @PostMapping("/salvar")
    public Student salvar(@RequestBody Student student) {
        return studentService.gravar(student);
    }

}
