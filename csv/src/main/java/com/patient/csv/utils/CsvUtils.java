package com.patient.csv.utils;

import com.patient.csv.model.Patient;

import java.io.PrintWriter;
import java.util.List;

public class CsvUtils {

    public static void downloadCsv(PrintWriter writer, List<Patient> patients) {
        writer.write("Patient ID, First Name, Last Name \n");
        for (Patient patient : patients) {
            writer.write(
                    patient.getPatientId() + "," + patient.getFirstName() + "," + patient.getLastName() + "\n");
        }
    }

}
