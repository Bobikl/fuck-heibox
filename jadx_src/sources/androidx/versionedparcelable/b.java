package androidx.versionedparcelable;

import androidx.annotation.RestrictTo;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: compiled from: ParcelField.java */
/* JADX INFO: loaded from: classes6.dex */
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.SOURCE)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public @interface b {
    String defaultValue() default "";

    int value();
}
