package com.java8.funcProgramming;

import java.util.List;

public interface IInstructorFactory {
    Instructor getInstructor(String name, int yearsOfExperience, String title,
                                    String gender, boolean onlineCourses, List<String> courses);
}
