package filter;

public class HandleB extends HandleFilter {
    @Override
    String handleRequest(String msg) {
        if (msg.contains("b")) {
            msg = msg.replace("b", "*");
        }
        if (this.successor != null) {
            msg = this.successor.handleRequest(msg);
        }
        return msg;
    }
}
