package d3;

import androidx.annotation.n0;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: compiled from: Attribute.java */
/* JADX INFO: loaded from: classes6.dex */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.SOURCE)
public @interface b {

    /* JADX INFO: compiled from: Attribute.java */
    @Target({})
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
        int mask() default 0;

        @n0
        String name();

        int value();
    }

    @n0
    a[] intMapping() default {};

    @n0
    String value();
}
