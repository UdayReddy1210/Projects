package com.ibm.dao;

import java.util.ArrayList;
import java.util.List;

import com.ibm.bean.Professor;
import com.ibm.bean.RegisteredCourse;

import org.springframework.stereotype.Repository;
@Repository
public class ProfessorImpl implements ProfessorDAO {

    public static List<Professor> professors;
    {
        professors = new ArrayList<>();
        professors.add(new Professor(1, "Professor 1", "prof1@gmail.com","100001"));
        professors.add(new Professor(2, "Professor 2", "prof2@gmail.com","100002"));
        professors.add(new Professor(3, "Professor 3", "prof3@gmail.com","100003"));
    }
    @Override
    public List list() {
        // List all professors
        return StudentImpl.registrations;
    }

    @Override
    public RegisteredCourse grade(RegisteredCourse registeredCourse) {
        // TODO Auto-generated method stub
        StudentImpl.regCourse.add(registeredCourse);
        return registeredCourse;
    }

    

}
    
