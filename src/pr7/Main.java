package pr7;

public class Main {
    public static void main(String args[]) {
        Department salesDepartment = new SalesDepartment(1, "Sales department");
        Department financialDepartment = new FinancialDepartment(2, "Financial department");

        HeadDepartment headDepartment = new HeadDepartment(3, "Head department");

        System.out.println("List of departments:");
        headDepartment.printDepartmentName();

        System.out.println("Adding new departments...");
        headDepartment.addDepartment(salesDepartment);
        headDepartment.addDepartment(financialDepartment);
        System.out.println("List of departments:");
        headDepartment.printDepartmentName();

        System.out.println("Deleting Sales Department...");
        headDepartment.removeDepartment(salesDepartment);
        System.out.println("List of departments:");
        headDepartment.printDepartmentName();
    }
}
