package Design_Patterns.Structural_Patterns.Proxy_Pattern;

public class MainClass {
    public static void main(String[] args) {
        EmpoyeeDao empoyeeDao = new EmployeeProxy(new EmployeeDaoImpl());
//        empoyeeDao.createEmployee("USER");
        empoyeeDao.createEmployee("ADMIN");
    }

}
