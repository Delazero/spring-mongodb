package br.com.delazari.springMongo.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import br.com.delazari.springMongo.entity.enumerated.Gender;

/***
 * 
 * @author delazari
 * 
 */

@Document
public class Student implements Serializable {

    @Id
    private String id;

    private String firstName;
    private String lastName;
    @Indexed(unique = true)
    private String email;
    private Gender gender;
    private Address address;
    private List<String> favoriteSubjects;
    private BigDecimal totalSpentInBooks;
    private LocalDateTime createdAt;
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<String> getFavoriteSubjects() {
        return favoriteSubjects;
    }

    public void setFavoriteSubjects(List<String> favoriteSubjects) {
        this.favoriteSubjects = favoriteSubjects;
    }

    public BigDecimal getTotalSpentInBooks() {
        return totalSpentInBooks;
    }

    public void setTotalSpentInBooks(BigDecimal totalSpentInBooks) {
        this.totalSpentInBooks = totalSpentInBooks;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public static Student test() {
        Student student = new Student();
        Address address = new Address("Brazil", "15600-000", "Fernandópolis");
        student.setFirstName("Jon");
        student.setLastName("Doe");
        student.setEmail("Jon.Doe@gmail.com");
        student.setGender(Gender.MALE);
        student.setTotalSpentInBooks(BigDecimal.TEN);
        student.setFavoriteSubjects(List.of("Math", "Astronomy"));
        student.setAddress(address);
        student.setCreatedAt(LocalDateTime.now());
        return student;
    }

}