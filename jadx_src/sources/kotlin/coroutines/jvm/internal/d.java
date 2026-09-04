package kotlin.coroutines.jvm.internal;

import com.umeng.analytics.pro.ak;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.annotation.AnnotationTarget;
import kotlin.u0;

/* JADX INFO: compiled from: DebugMetadata.kt */
/* JADX INFO: loaded from: classes5.dex */
@Target({ElementType.TYPE})
@u0(version = "1.3")
@Retention(RetentionPolicy.RUNTIME)
@mh.d(allowedTargets = {AnnotationTarget.CLASS})
public @interface d {
    @xh.h(name = ak.aF)
    String c() default "";

    @xh.h(name = "f")
    String f() default "";

    @xh.h(name = "i")
    int[] i() default {};

    @xh.h(name = "l")
    int[] l() default {};

    @xh.h(name = "m")
    String m() default "";

    @xh.h(name = "n")
    String[] n() default {};

    @xh.h(name = ak.aB)
    String[] s() default {};

    @xh.h(name = "v")
    int v() default 1;
}
