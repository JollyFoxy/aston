package DZ5.Builder;

public class Computer {
    private final String cpu;
    private final String gpu;
    private final String ram;
    private final String os;
    private final String storage;

    public Computer(Builder builder) {
        this.cpu = builder.cpu;
        this.gpu = builder.gpu;
        this.ram = builder.ram;
        this.os = builder.os;
        this.storage = builder.storage;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Computer = {")
                .append("CPU:").append(cpu)
                .append(", RAM:").append(ram);

        if (os != null)
            sb.append(", OS:").append(os);
        if (storage != null)
            sb.append(", Storage:").append(storage);
        if (gpu != null)
            sb.append(", GPU:").append(gpu);

        return sb.append("}").toString();
    }

    public static class Builder {

        private String cpu;
        private String gpu;
        private String ram;
        private String os;
        private String storage;

        public Builder(String cpu, String ram) {
            this.cpu = cpu;
            this.ram = ram;
            if (this.cpu == null || this.cpu.isEmpty() || this.ram == null || this.ram.isEmpty())
                throw new IllegalArgumentException("CPU & RAM cannot empty");

        }

        public Builder gpu(String gpu) {
            this.gpu = gpu;
            return this;
        }

        public Builder os(String os) {
            this.os = os;
            return this;
        }

        public Builder storage(String storage) {
            this.storage = storage;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }

    }

}
