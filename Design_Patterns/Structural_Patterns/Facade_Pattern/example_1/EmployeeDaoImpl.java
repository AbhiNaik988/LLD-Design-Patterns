package Design_Patterns.Structural_Patterns.Facade_Pattern.example_1;

public class EmployeeDaoImpl {
    public void insertEmployee(String employee){
        System.out.println("Inserting Employee!!");
    }

    public void deleteEmployee(){
        System.out.println("Deleting Employee!!");
    }

    public void updateEmployee(int id){
        System.out.println("Updating Employee!!");
    }

    public void getEmployee(int id){
        System.out.println("Getting Employee!!");
    }
}
