public class ScopeExample {
    int instanceVar = 5; // Instance variable

    public void display() {
        int localVar = 10; // Local variable
        System.out.println("Instance Variable: " + instanceVar);
        System.out.println("Local Variable: " + localVar);
    }
}
