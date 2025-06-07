package annotation.basic;

import util.MyLogger;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface AnnoElement {
    String value();

    int count() default 0;
    String[] tags() default {};

    // MyLogger data(); // 다른 타입은 적용X
    // MyLogger는 인터페이스나 애너테이션이 아니라 일반 클래스이기 때문에
    // 직접 사용할 수 없다는 걸 보여주는 예시임
    Class<? extends MyLogger> annoData() default MyLogger.class; // 클래스 정보는 가능
}