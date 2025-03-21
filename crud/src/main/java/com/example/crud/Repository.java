package com.example.crud;



import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;

@org.springframework.stereotype.Repository
public interface Repository extends JpaRepository <Employee, Long> {

}
