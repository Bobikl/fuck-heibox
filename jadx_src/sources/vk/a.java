package vk;

import cl.p;
import cl.w;
import cl.z;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: compiled from: EnsuresInitializedFields.java */
/* JADX INFO: loaded from: classes5.dex */
@p
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
@w(qualifier = b.class)
@Documented
@Repeatable(InterfaceC1273a.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface a {

    /* JADX INFO: renamed from: vk.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: EnsuresInitializedFields.java */
    @p
    @Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
    @w(qualifier = b.class)
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    public @interface InterfaceC1273a {
        a[] value();
    }

    @z("value")
    String[] fields();

    String[] value() default {"this"};
}
