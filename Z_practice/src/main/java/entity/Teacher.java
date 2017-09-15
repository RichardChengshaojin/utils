package entity;

/**
 * DEC
 *
 * @auther chengshaojin
 * @since 2016/12/20
 */
public class Teacher extends Person {
    private double salary;

    private String subject;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "salary=" + salary +
                ", subject='" + subject + '\'' +
                "} " + super.toString();
    }
}
