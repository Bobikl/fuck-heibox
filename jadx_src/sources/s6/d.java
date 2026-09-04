package s6;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: compiled from: GlideOption.java */
/* JADX INFO: loaded from: classes6.dex */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.CLASS)
public @interface d {

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public static final int f139326p1 = 0;

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    public static final int f139327q1 = 1;

    /* JADX INFO: renamed from: r1, reason: collision with root package name */
    public static final int f139328r1 = 2;

    boolean memoizeStaticMethod() default false;

    int override() default 0;

    boolean skipStaticMethod() default false;

    String staticMethodName() default "";
}
