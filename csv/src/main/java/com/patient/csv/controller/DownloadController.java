package com.patient.csv.controller;

import com.patient.csv.model.Patient;
import com.patient.csv.utils.CsvUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Controller
public class DownloadController {

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/download/patient.csv")
    public void downloadCsv(HttpServletResponse response) throws IOException {
        response.setContentType("text/csv");
        response.setHeader("Content-Disposition", "attachment; file=employee.csv");
        CsvUtils.downloadCsv(response.getWriter(), createTestData()) ;
    }

    private List<Patient> createTestData() {
        List<Patient> data = new ArrayList<>();
        data.add(new Patient(123, "Buffet","Jimmy"));
        data.add(new Patient(456, "Cartman","Eric"));
        data.add(new Patient(789, "Jefferson","George"));
        return data;
    }

}
