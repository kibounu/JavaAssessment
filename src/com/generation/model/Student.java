package com.generation.model;

import com.generation.service.CourseService;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Student
    extends Person
    implements Evaluation
{

    float PASS_MIN_GRADE = 3.0f;

    public List<Course> enrolledCourses;

    public Student( String id, String name, String email, Date birthDate )
    {
        super( id, name, email, birthDate );
        this.enrolledCourses = new ArrayList<>();
    }

    public void enrollToCourse( Course course )
    {
        //TODO - DONE!!!
        this.enrolledCourses.add(course);
    }

    @Override
    public List<Course> findPassedCourses()
    {
        //TODO
        //if (courseGrade >= 3) {
        //    return findPassedCourses();
        //}
        return null;
    }

    public Course findCourseById( String courseId )
    {
        //TODO
        if (this.enrolledCourses.contains(courseId)) {
            return this.findCourseById(courseId);
        }
       return null;
    }

    @Override
    public List<Course> getEnrolledCourses()
    {
        //TODO - done?
        return this.enrolledCourses;
    }

    @Override
    public String toString()
    {
        return "Student {" + super.toString() + "}";
    }

}
