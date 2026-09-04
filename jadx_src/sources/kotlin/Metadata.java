package kotlin;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;

/* JADX INFO: compiled from: Metadata.kt */
/* JADX INFO: loaded from: classes5.dex */
@Target({ElementType.TYPE})
@u0(version = "1.3")
@mh.c(AnnotationRetention.RUNTIME)
@Retention(RetentionPolicy.RUNTIME)
@mh.d(allowedTargets = {AnnotationTarget.CLASS})
public @interface Metadata {

    /* JADX INFO: compiled from: Metadata.kt */
    public static final class a {
        @k(level = DeprecationLevel.WARNING, message = "Bytecode version had no significant use in Kotlin metadata and it will be removed in a future version.")
        public static /* synthetic */ void a() {
        }

        @u0(version = "1.2")
        public static /* synthetic */ void b() {
        }

        @u0(version = "1.1")
        public static /* synthetic */ void c() {
        }
    }

    @xh.h(name = "bv")
    int[] bv() default {1, 0, 3};

    @xh.h(name = "d1")
    String[] d1() default {};

    @xh.h(name = "d2")
    String[] d2() default {};

    @xh.h(name = "k")
    int k() default 1;

    @xh.h(name = "mv")
    int[] mv() default {};

    @xh.h(name = "pn")
    String pn() default "";

    @xh.h(name = "xi")
    int xi() default 0;

    @xh.h(name = "xs")
    String xs() default "";
}
