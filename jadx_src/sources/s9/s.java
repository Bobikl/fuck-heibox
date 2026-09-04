package s9;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/* JADX INFO: compiled from: RestrictedApi.java */
/* JADX INFO: loaded from: classes7.dex */
@Target({ElementType.CONSTRUCTOR, ElementType.METHOD})
public @interface s {
    String allowedOnPath() default "";

    Class<? extends Annotation>[] allowlistAnnotations() default {};

    Class<? extends Annotation>[] allowlistWithWarningAnnotations() default {};

    String explanation();

    String link();
}
