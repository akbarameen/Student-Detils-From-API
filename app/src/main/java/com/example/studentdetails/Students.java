package com.example.studentdetails;

import androidx.annotation.NonNull;

import com.google.gson.annotations.SerializedName;

public class Students {
    private String name;
    @SerializedName("Class")
    private String stdClass;
    @SerializedName("admissiondts")
    private String admissionDate;
    private String status;

    public Students(String name, String stdClass, String admissionDate, String status) {
        this.name = name;
        this.stdClass = stdClass;
        this.admissionDate = admissionDate;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public String getStdClass() {
        return stdClass;
    }

    public String getAdmissionDate() {
        return admissionDate;
    }

    public String getStatus() {
        return status;
    }
}
