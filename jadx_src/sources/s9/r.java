package s9;

import com.google.errorprone.annotations.Modifier;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: compiled from: RequiredModifiers.java */
/* JADX INFO: loaded from: classes7.dex */
@Target({ElementType.ANNOTATION_TYPE})
@Documented
@Retention(RetentionPolicy.CLASS)
public @interface r {
    Modifier[] modifier() default {};

    @Deprecated
    javax.lang.model.element.Modifier[] value() default {};
}
