package ik;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: compiled from: HasSubsequence.java */
/* JADX INFO: loaded from: classes5.dex */
@Target({ElementType.FIELD})
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface d {
    @cl.r
    String from();

    @cl.r
    String subsequence();

    @cl.r
    String to();
}
