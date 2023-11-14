package Design_Patterns.Structural_Patterns.Proxy_Pattern;

public class EmployeeDaoImpl implements  EmpoyeeDao{
    @Override
    public String getEmployee() {
        System.out.println("getting employee!");
        return "new Employee";
    }

    @Override
    public void createEmployee(String emp) {
        System.out.println("new Employee created!");
    }
}
