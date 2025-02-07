package nested.test;

public class OuterClass3 {
    public void myMethod() {
        //여기에 지역 클래스 LocalClass를 구현해라. 그리고 hello() 메서드를 만들어라.
        class LoccalClass {
            public void hello() {
                System.out.println("LocalClass.hello");
            }
        }
        LoccalClass loccalClass = new LoccalClass();
        loccalClass.hello();
    }
}