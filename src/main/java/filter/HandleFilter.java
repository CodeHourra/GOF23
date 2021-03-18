package filter;

abstract class HandleFilter {
    protected HandleFilter successor;

    public void setSuccessor(HandleFilter successor) {
        this.successor = successor;
    }

    abstract String handleRequest(String msg);
}
