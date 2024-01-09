public class Main {
    public static void main(String[] args) {


        //leaf emplooyes

        Developer developer1 = new Developer("Pelin Üstünel");
        Developer developer2 = new Developer("Pelin Üstünel");
        Manager manager = new Manager("Fatih Bal");
        //

        //composite department
        Department developmentDepartment = new Department("Software Development");
        developmentDepartment.addEmployee(developer1);
        developmentDepartment.addEmployee(developer2);
        developmentDepartment.addEmployee(manager);

        developmentDepartment.showDetails();
    }
}