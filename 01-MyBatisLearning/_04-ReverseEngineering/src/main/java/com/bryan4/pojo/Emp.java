package com.bryan4.pojo;

@SuppressWarnings("all")
public class Emp {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column emp.eid
     *
     * @mbg.generated Fri Apr 21 20:57:01 CST 2023
     */
    private Integer eid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column emp.emp_name
     *
     * @mbg.generated Fri Apr 21 20:57:01 CST 2023
     */
    private String empName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column emp.age
     *
     * @mbg.generated Fri Apr 21 20:57:01 CST 2023
     */
    private Integer age;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column emp.job
     *
     * @mbg.generated Fri Apr 21 20:57:01 CST 2023
     */
    private String job;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column emp.salary
     *
     * @mbg.generated Fri Apr 21 20:57:01 CST 2023
     */
    private Double salary;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column emp.dept_id
     *
     * @mbg.generated Fri Apr 21 20:57:01 CST 2023
     */
    private Integer deptId;

    public Emp() {}

    public Emp(Integer eid, String empName, Integer age, String job, Double salary, Integer deptId) {
        this.eid = eid;
        this.empName = empName;
        this.age = age;
        this.job = job;
        this.salary = salary;
        this.deptId = deptId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column emp.eid
     *
     * @return the value of emp.eid
     *
     * @mbg.generated Fri Apr 21 20:57:01 CST 2023
     */
    public Integer getEid() {
        return eid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column emp.eid
     *
     * @param eid the value for emp.eid
     *
     * @mbg.generated Fri Apr 21 20:57:01 CST 2023
     */
    public void setEid(Integer eid) {
        this.eid = eid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column emp.emp_name
     *
     * @return the value of emp.emp_name
     *
     * @mbg.generated Fri Apr 21 20:57:01 CST 2023
     */
    public String getEmpName() {
        return empName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column emp.emp_name
     *
     * @param empName the value for emp.emp_name
     *
     * @mbg.generated Fri Apr 21 20:57:01 CST 2023
     */
    public void setEmpName(String empName) {
        this.empName = empName == null ? null : empName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column emp.age
     *
     * @return the value of emp.age
     *
     * @mbg.generated Fri Apr 21 20:57:01 CST 2023
     */
    public Integer getAge() {
        return age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column emp.age
     *
     * @param age the value for emp.age
     *
     * @mbg.generated Fri Apr 21 20:57:01 CST 2023
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column emp.job
     *
     * @return the value of emp.job
     *
     * @mbg.generated Fri Apr 21 20:57:01 CST 2023
     */
    public String getJob() {
        return job;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column emp.job
     *
     * @param job the value for emp.job
     *
     * @mbg.generated Fri Apr 21 20:57:01 CST 2023
     */
    public void setJob(String job) {
        this.job = job == null ? null : job.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column emp.salary
     *
     * @return the value of emp.salary
     *
     * @mbg.generated Fri Apr 21 20:57:01 CST 2023
     */
    public Double getSalary() {
        return salary;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column emp.salary
     *
     * @param salary the value for emp.salary
     *
     * @mbg.generated Fri Apr 21 20:57:01 CST 2023
     */
    public void setSalary(Double salary) {
        this.salary = salary;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column emp.dept_id
     *
     * @return the value of emp.dept_id
     *
     * @mbg.generated Fri Apr 21 20:57:01 CST 2023
     */
    public Integer getDeptId() {
        return deptId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column emp.dept_id
     *
     * @param deptId the value for emp.dept_id
     *
     * @mbg.generated Fri Apr 21 20:57:01 CST 2023
     */
    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "eid=" + eid +
                ", empName='" + empName + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                ", salary=" + salary +
                ", deptId=" + deptId +
                '}';
    }
}