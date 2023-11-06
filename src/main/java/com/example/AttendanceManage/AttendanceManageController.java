package com.example.AttendanceManage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;
import java.sql.Time;

@Controller
public class AttendanceManageController {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @GetMapping("/attendances")
    public String index(Model model) {
        String sql = "SELECT id, begin_time, end_time FROM ATTENDANCES";

        model.addAttribute("attendances",sql);
        return "attendanceList";
    }
}
























