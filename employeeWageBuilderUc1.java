package employeeWageBuilder.Oops;

public class employeeWageBuilderUc1 {
    int IS_FULL_TIME = 1;

    public void employeePresenty() {
        //computation
        double empCheck = Math.floor(Math.random() * 10) % 2;

        if (empCheck == IS_FULL_TIME) {
            System.out.println("Employee is Present.");
        } else {
            System.out.println("Employee is Absent");
        }
    }

    public static void main(String[] args) {
        employeeWageBuilderUc1 employeeWageBuilderUc1 = new employeeWageBuilderUc1();
        employeeWageBuilderUc1.employeePresenty();
    }
}
