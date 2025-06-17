package ru.aston.hometask.task5.builder;

public class ConstructableObject {
    private final String partA;
    private final String partB;
    private final String partC;

    public ConstructableObject(ConstructableObjectBuilder builder) {
        this.partA = builder.partA;
        this.partB = builder.partB;
        this.partC = builder.partC;
    }

    public String getPartA() {
        return partA;
    }

    public String getPartB() {
        return partB;
    }

    public String getPartC() {
        return partC;
    }

    public static class ConstructableObjectBuilder {
        private String partA;
        private String partB;
        private String partC;

        public ConstructableObjectBuilder() {}

        public ConstructableObjectBuilder partA(String partA) {
            this.partA = partA;
            return this;
        }

        public ConstructableObjectBuilder partB(String partB) {
            this.partB = partB;
            return this;
        }

        public ConstructableObjectBuilder partC(String partC) {
            this.partC = partC;
            return this;
        }

        public ConstructableObject build() {
            return new ConstructableObject(this);
        }
    }
}
