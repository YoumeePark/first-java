package extends1.overriding;

public class ElectricCar extends Car {

    @Override //이 부분 주석처리 해도 됨
    public void move() {
        System.out.println("전기차를 빠르게 이동합니다.");
    }

    public void charge() {
        System.out.println("충전합니다.");
    }
}