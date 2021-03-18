package filter;

public class HandleA extends HandleFilter {
    @Override
    String handleRequest(String msg) {
        if (msg.contains("a")) {
            msg = msg.replace("a", "*");
        }
        if (this.successor != null) {
            msg = this.successor.handleRequest(msg);
        }
        return msg;
    }
}
