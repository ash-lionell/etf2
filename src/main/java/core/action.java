package core;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface action {
    String name() default "";
    outcome[] outcome() default {};
    String[] srcAction() default {};
    String[] noSrcAction() default {};
    String[] srcState() default {};
    String[] noSrcState() default {};
}
