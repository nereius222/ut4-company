import org.iesfm.company.*;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("5454554584", "Pepito", "Peiico", "235698747"),
                new Employee("5458545", "Grillo", "Leiito", "54565155")
        };
        Department[] department = {
                new Department("Informática", employees),
                new Department("Marketing", employees)
        };

        Company company = new Company("Patata Frita", "22021999", department);

        try {
            Employee[] employees1 = company.findDepartmentEmployees("Informática");
            for (Employee employee:employees1) {
                System.out.println(employee.getName());
            }
        } catch (DepartmentNotFoundException e) {
            System.out.println("No se ha encontrado el departamento");
        }

        try {
            Department department1 = company.findDepartmentByName("Marketing");
            System.out.println(department.toString());
        } catch (EmployeeNotFoundException e) {
            System.out.println("No se ha encontrado el empleado");
        }
    }
}
