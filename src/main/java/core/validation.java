package core;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface validation {
    String[] srcAction() default {};
    String[] noSrcAction() default {};
    String[] srcState() default {};
    String[] noSrcState() default {};
    //String state() default "";
}
