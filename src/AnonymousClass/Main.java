package AnonymousClass;

public class Main {
    int a=7;
    public static void main(String[] args) {
//        Employee employee = new SoftwareEngineer(); // using implementation class
        Employee employee = new Employee() { // using Anonymous inner class
            @Override
            public int getSalary() {
                return 50000;
            }

            @Override
            public String getType() {
                return "Backend Engineer";
            }
        };
        System.out.println(employee.getSalary());
        System.out.println(employee.getType());


//        doSomething();
    }
    public void doSomething(){
//        int a=5;

        Student student = () -> {
//            a=8; // this variable is final
                 a=6; // now i can change it as it is instance variable
            return "Max";
        };
    }

}
