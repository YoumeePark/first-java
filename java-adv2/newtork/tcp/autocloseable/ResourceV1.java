package newtork.tcp.autocloseable;

public class ResourceV1 {
    private String name;

    public ResourceV1(String name) {
        this.name = name;
    }

    public void call() {
        System.out.println(name + " call");
    }

    public void callEx() throws CallExceptioin {
        System.out.println(name + " callEx");
        throw new CallExceptioin(name + " ex");
    }

    public void close() {
        System.out.println(name + " close");
    }

    public void closeEx() throws CloseException
    {
        System.out.println(name + " closeEx");
        throw new CloseException(name + " ex");
    }
}