package Design_Patterns.Structural_Patterns.Facade_Pattern.example_1;

public class MainClass {
    public static void main(String[] args) {
        EmploeeFacade emploeeFacade = new EmploeeFacade(new EmployeeDaoImpl());
        emploeeFacade.insertEmployee("Employee");
        //Giving only insertEmployee for user convenience.

        //That doesn't mean user can't access underlying complex structure.
        EmployeeDaoImpl employeeDao = new EmployeeDaoImpl();
        employeeDao.updateEmployee(1);
        //User is having access to both underlying complex structure as well as facade.
    }
}
