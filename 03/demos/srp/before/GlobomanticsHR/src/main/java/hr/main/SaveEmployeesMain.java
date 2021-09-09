package hr.main;

import hr.logging.ConsoleLogger;
import hr.persistence.EmployeeRepository;
import hr.persistence.EmployeeSerializer;
import hr.personnel.Employee;

import java.io.IOException;
import java.util.List;

public class SaveEmployeesMain {
    public static void main(String[] args) {
        // Grab employees
        EmployeeSerializer employeeSerializer = new EmployeeSerializer();
        ConsoleLogger consoleLogger = new ConsoleLogger();
        EmployeeRepository repository = new EmployeeRepository(employeeSerializer);
        List<Employee> employees = repository.findAll();

        // Save all
        for (Employee e : employees) {
            try {
                repository.save(e);
                consoleLogger.writeInfo("Saved employee" + e.toString());
            } catch (IOException exception) {
                consoleLogger.writeError("Error saving employee", exception);
            }
        }
    }
}
