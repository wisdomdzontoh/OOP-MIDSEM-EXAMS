public class Employee {
    private String employeeID;
    private String name;
    private String role;
    private int hoursWorked;

    public Employee(String employeeID, String name, String role) {
        this.employeeID = employeeID;
        this.name = name;
        this.role = role;
    }

    public void trackHours(int hours) {
        this.hoursWorked += hours;
    }

    public void managePermissions() {
        // Implementation here
    }

    public void generatePayroll() {
        // Implementation here
    }
}
