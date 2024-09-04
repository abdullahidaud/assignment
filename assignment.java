public class assignment {

    private int instanceVariable;

    private static int staticVariable;

    public assignment(int instanceVarValue) {
        this.instanceVariable = instanceVarValue;
    }

    public void displayInstanceVariable() {
        int localVariable = 10;

        System.out.println("Local Variable: " + localVariable);
        System.out.println("Instance Variable: " + instanceVariable);
    }

    public static void displayStaticVariable() {

        int localVariable = 20;

        System.out.println("Local Variable: " + localVariable);
        System.out.println("Static Variable: " + staticVariable);
    }

 
    public void modifyVariables(int newInstanceVarValue, int newStaticVarValue) {
        this.instanceVariable = newInstanceVarValue;
        assignment.staticVariable = newStaticVarValue;
    }

    public static void main(String[] args) {

        assignment obj1 = new assignment(5);

        obj1.displayInstanceVariable();
        assignment.displayStaticVariable();

        obj1.modifyVariables(15, 30);

        obj1.displayInstanceVariable();
        assignment.displayStaticVariable();

        assignment obj2 = new assignment(50);
        obj2.displayInstanceVariable();
        assignment.displayStaticVariable(); 
    }
}
