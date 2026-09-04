package androidx.core.util;

import android.annotation.SuppressLint;
import android.util.Half;
import androidx.annotation.w0;
import kotlin.jvm.internal.t0;

/* JADX INFO: compiled from: Half.kt */
/* JADX INFO: loaded from: classes.dex */
@t0({"SMAP\nHalf.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Half.kt\nandroidx/core/util/HalfKt\n*L\n1#1,60:1\n43#1:61\n*S KotlinDebug\n*F\n+ 1 Half.kt\nandroidx/core/util/HalfKt\n*L\n51#1:61\n*E\n"})
@SuppressLint({"ClassVerificationFailure"})
public final class g {
    @dl.d
    @w0(26)
    public static final Half a(double d10) {
        Half halfValueOf = Half.valueOf((float) d10);
        kotlin.jvm.internal.f0.o(halfValueOf, "valueOf(this)");
        return halfValueOf;
    }

    @dl.d
    @w0(26)
    public static final Half b(float f10) {
        Half halfValueOf = Half.valueOf(f10);
        kotlin.jvm.internal.f0.o(halfValueOf, "valueOf(this)");
        return halfValueOf;
    }

    @dl.d
    @w0(26)
    public static final Half c(@dl.d String str) {
        kotlin.jvm.internal.f0.p(str, "<this>");
        Half halfValueOf = Half.valueOf(str);
        kotlin.jvm.internal.f0.o(halfValueOf, "valueOf(this)");
        return halfValueOf;
    }

    @dl.d
    @w0(26)
    public static final Half d(short s10) {
        Half halfValueOf = Half.valueOf(s10);
        kotlin.jvm.internal.f0.o(halfValueOf, "valueOf(this)");
        return halfValueOf;
    }
}
