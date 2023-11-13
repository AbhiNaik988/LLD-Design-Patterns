package Design_Patterns.Structural_Patterns.Facade_Pattern.example_1;

public class EmploeeFacade {
    private EmployeeDaoImpl employeeDao;
    public EmploeeFacade(EmployeeDaoImpl employeeDao){
        this.employeeDao = employeeDao;
    }

    public void insertEmployee(String emp){
        this.employeeDao.insertEmployee(emp);
        //Only outsourcing the insert method out of 4 methods
    }

}
