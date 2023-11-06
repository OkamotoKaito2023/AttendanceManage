package com.example.AttendanceManage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.DataClassRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.List;
import java.sql.Time;

@Controller
public class AttendanceManageController {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @GetMapping("/attendanceList")
    public String attendances(Model model) {
        String sql = "SELECT id, begin_time, end_time FROM ATTENDANCES";
        List<Attendance> attendances = jdbcTemplate.query(sql,new DataClassRowMapper<>(Attendance.class));
        model.addAttribute("attendances",attendances);
        return "attendanceList";
    }
}
























