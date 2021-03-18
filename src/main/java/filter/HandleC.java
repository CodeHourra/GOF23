package filter;

public class HandleC extends HandleFilter {
    @Override
    String handleRequest(String msg) {
        if (msg.contains("c")) {
            msg = msg.replace("c", "*");
        }
        if (this.successor != null) {
            msg = this.successor.handleRequest(msg);
        }
        return msg;
    }
}
