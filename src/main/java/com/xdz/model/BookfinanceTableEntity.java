package com.xdz.model;

import javax.persistence.*;

@Entity
@Table(name = "bookfinance_table", schema = "xdz_db", catalog = "")
public class BookfinanceTableEntity {
    private int id;
    private Integer jobNo;
    private String jobName;

    @Id
    @Column(name = "Id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "JobNo")
    public Integer getJobNo() {
        return jobNo;
    }

    public void setJobNo(Integer jobNo) {
        this.jobNo = jobNo;
    }

    @Basic
    @Column(name = "JobName")
    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BookfinanceTableEntity that = (BookfinanceTableEntity) o;

        if (id != that.id) return false;
        if (jobNo != null ? !jobNo.equals(that.jobNo) : that.jobNo != null) return false;
        if (jobName != null ? !jobName.equals(that.jobName) : that.jobName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (jobNo != null ? jobNo.hashCode() : 0);
        result = 31 * result + (jobName != null ? jobName.hashCode() : 0);
        return result;
    }
}
