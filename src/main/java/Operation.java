public enum Operation {
    ADD("ADD"),
    SUBTRACT("SUBTRACT"),
    MULTIPLY("MULTIPLY"),
    DIVIDE("DIVIDE"),
    POWER("POWER");

    private final String operation;

    Operation(String operation) {
        this.operation = operation;
    }
}
