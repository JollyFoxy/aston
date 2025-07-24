package DZ1.Transport;

public abstract class Transport {
    protected String name;

    public Transport(String name) {
        this.name = name;
    }

    public abstract void moving();
    public abstract void info();
}
