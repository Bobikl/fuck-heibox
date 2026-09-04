package xj;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: compiled from: SuppressAjWarnings.java */
/* JADX INFO: loaded from: classes5.dex */
@Retention(RetentionPolicy.RUNTIME)
public @interface p {
    String[] value() default {""};
}
