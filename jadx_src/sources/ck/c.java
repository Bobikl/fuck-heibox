package ck;

import cl.e0;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: compiled from: CalledMethodsPredicate.java */
/* JADX INFO: loaded from: classes5.dex */
@e0({a.class})
@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface c {
    String value();
}
