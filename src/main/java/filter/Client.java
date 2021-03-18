package filter;

public class Client {
    public static void main(String[] args) {
        HandleFilter handlerA = new HandleA();
        HandleFilter handlerB = new HandleB();
        HandleFilter handlerC = new HandleC();

        handlerA.setSuccessor(handlerB);
//        handlerB.setSuccessor(handlerC);

        String apple = handlerA.handleRequest("apbplce");
        System.out.println(apple);

    }
}
