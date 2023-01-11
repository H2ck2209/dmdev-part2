package com.dmdev.lessons.lesson17;

public enum ProcessorType implements Manualable, Securable {
    BIT_32("bit-32") {
        @Override
        public String getManual() {
            return name() + " Manual";
        }

        @Override
        public String getDescription() {
            return "bit-32 description";
        }
    },
    BIT_64("bit-64") {
        @Override
        public String getManual() {
            return name() + " Manual";
        }

        @Override
        public String getDescription() {
            return "bit-64 description";
        }
    };

    private String name;

    ProcessorType(String name) {
        this.name = name;
    }

public String getSecurity() {
        return name + " Security";
}

    public abstract String getDescription();

    public String getName() {
        return name;
    }
}
