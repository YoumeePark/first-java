package newtork.tcp.autocloseable;

public class ResourceV2 implements AutoCloseable{
    private String name;

    public ResourceV2(String name) {
        this.name = name;
    }

    public void call() {
        System.out.println(name + " call");
    }

    public void callEx() throws CallExceptioin {
        System.out.println(name + " callEx");
        throw new CallExceptioin(name + " ex");
    }

    @Override
    public void close() throws CallExceptioin {
        System.out.println(name + " close");
        throw new CallExceptioin(name + " ex");
    }
}