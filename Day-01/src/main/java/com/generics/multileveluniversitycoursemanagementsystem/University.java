package com.generics.multileveluniversitycoursemanagementsystem;
import java.util.List;
public class University {
    public static void manageCourses(List<? extends CourseType> courses) {
        for (CourseType course : courses) {
            course.evaluate();
        }
    }
}