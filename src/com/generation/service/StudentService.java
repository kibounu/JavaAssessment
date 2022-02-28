package com.generation.service;

import com.generation.model.Course;
import com.generation.model.Student;

import java.util.*;

public class StudentService
{
    private final Map<String, Student> students = new HashMap<>();
    private final Map<String, CourseService> courseServiceMap = new HashMap<>();

    public void subscribeStudent( Student student )
    {
        students.put( student.getId(), student );
    }

    public Student findStudent( String studentId )
    {
        //TODO - DONE!!!
        if (this.students.containsKey(studentId)) {
            return this.students.get(studentId);
        }
        return null;
    }

    public boolean showSummary() {
        //TODO - done?
        //System.out.println("List of Students: ");
        for (String key : students.keySet()) {
            Student student = students.get(key);
            System.out.println(student);
        }
        return false;
    }

    public void enrollToCourse(String studentId, Course course )
    {
        //TODO - done?
        Student student = this.students.get(studentId);
        CourseService courseService = this.courseServiceMap.get(course);
        student.enrollToCourse(course);
        //return null;

    }
}
