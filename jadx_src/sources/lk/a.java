package lk;

import cl.p;
import cl.w;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: compiled from: EnsuresLockHeld.java */
/* JADX INFO: loaded from: classes5.dex */
@p
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
@w(qualifier = h.class)
@Documented
@Repeatable(InterfaceC1199a.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface a {

    /* JADX INFO: renamed from: lk.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: EnsuresLockHeld.java */
    @p
    @Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
    @w(qualifier = h.class)
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    public @interface InterfaceC1199a {
        a[] value();
    }

    String[] value();
}
