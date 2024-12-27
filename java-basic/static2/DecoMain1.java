package static2;

public class DecoMain1 {
    public static void main(String[] args) {
        DecoUtil1 utils = new DecoUtil1();
        String s = "hello java";
        String deco = utils.deco(s);

        System.out.println("before: " + s);
        System.out.println("after: " + deco);
    }
}