package ck;

import cl.w;
import cl.z;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/* JADX INFO: compiled from: EnsuresCalledMethods.java */
/* JADX INFO: loaded from: classes5.dex */
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
@w(qualifier = a.class)
public @interface d {
    @z("value")
    String[] methods();

    String[] value();
}
