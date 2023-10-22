package com.example.demo.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entity.Student;


//un repository (une interface spécialisée dans l'accès aux données) pour interagir avec une base de données relationnelle
public interface StudentRepository extends JpaRepository<Student, Integer> {
	//Cette interface étend JpaRepository qui est une interface de Spring Data JPA permettant de gérer des opérations de base pour l'entité "Student"
	Student findById(int id);
	
	@Query("select year(s.dateNaissance) as annee, count(*) as nbr from Student s group by year(s.dateNaissance) order by year(s.dateNaissance)")
	//compter le nombre d'étudiants par année de naissance.
	Collection<?> findNbrStudentByYear(); //findNbreStudentByYear utilise Query
}