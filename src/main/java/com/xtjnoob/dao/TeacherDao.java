package com.xtjnoob.dao;

import com.xtjnoob.entity.Teacher;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TeacherDao {
    private Map<String, Teacher> teacherMap = new HashMap<>();

    public void addTeacher(Teacher teacher) {
        teacherMap.put(teacher.getId(), teacher);
    }

    public List<Teacher> getAllTeacher() {
        return new ArrayList<>(teacherMap.values());
    }

    public void updateTeacher(Teacher teacher) {
        teacherMap.put(teacher.getId(), teacher);
    }
}
