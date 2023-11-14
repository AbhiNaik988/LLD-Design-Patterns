package Design_Patterns.Structural_Patterns.Proxy_Pattern;

public class EmployeeProxy implements EmpoyeeDao{
    private EmployeeDaoImpl employeeDaoImpl;

    public EmployeeProxy(EmployeeDaoImpl employeeDaoImpl){
        this.employeeDaoImpl = employeeDaoImpl;
    }

    @Override
    public String getEmployee() {
        return this.employeeDaoImpl.getEmployee();
    }

    @Override
    public void createEmployee(String emp) {
        if(emp == "ADMIN"){
            this.employeeDaoImpl.createEmployee(emp);
        }
    }
}
