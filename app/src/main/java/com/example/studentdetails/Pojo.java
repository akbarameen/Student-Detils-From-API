
package com.example.studentdetails;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Pojo {

    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("Data")
    @Expose
    private List<Datum> data;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Pojo withStatus(String status) {
        this.status = status;
        return this;
    }

    public List<Datum> getData() {
        return data;
    }

    public void setData(List<Datum> data) {
        this.data = data;
    }

    public Pojo withData(List<Datum> data) {
        this.data = data;
        return this;
    }


    public class Datum {

        @SerializedName("id")
        @Expose
        private Integer id;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("Class")
        @Expose
        private String _class;
        @SerializedName("admissiondts")
        @Expose
        private String admissiondts;
        @SerializedName("status")
        @Expose
        private String status;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public Datum withId(Integer id) {
            this.id = id;
            return this;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Datum withName(String name) {
            this.name = name;
            return this;
        }

        public String getClass_() {
            return _class;
        }

        public void setClass_(String _class) {
            this._class = _class;
        }

        public Datum withClass(String _class) {
            this._class = _class;
            return this;
        }

        public String getAdmissiondts() {
            return admissiondts;
        }

        public void setAdmissiondts(String admissiondts) {
            this.admissiondts = admissiondts;
        }

        public Datum withAdmissiondts(String admissiondts) {
            this.admissiondts = admissiondts;
            return this;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public Datum withStatus(String status) {
            this.status = status;
            return this;
        }

    }
}
