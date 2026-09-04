package androidx.versionedparcelable;

import androidx.annotation.RestrictTo;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: compiled from: VersionedParcelize.java */
/* JADX INFO: loaded from: classes6.dex */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.SOURCE)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public @interface h {
    boolean allowSerialization() default false;

    int[] deprecatedIds() default {};

    Class factory() default void.class;

    boolean ignoreParcelables() default false;

    boolean isCustom() default false;

    String jetifyAs() default "";
}
