package s9;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/* JADX INFO: compiled from: InlineMe.java */
/* JADX INFO: loaded from: classes7.dex */
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
@Documented
public @interface l {
    String[] imports() default {};

    String replacement();

    String[] staticImports() default {};
}
