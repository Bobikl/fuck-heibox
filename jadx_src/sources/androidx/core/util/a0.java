package androidx.core.util;

import android.annotation.SuppressLint;
import android.util.Size;
import android.util.SizeF;
import androidx.annotation.w0;

/* JADX INFO: compiled from: Size.kt */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"ClassVerificationFailure"})
public final class a0 {
    @w0(21)
    public static final float a(@dl.d SizeF sizeF) {
        kotlin.jvm.internal.f0.p(sizeF, "<this>");
        return sizeF.getWidth();
    }

    public static final float b(@dl.d z zVar) {
        kotlin.jvm.internal.f0.p(zVar, "<this>");
        return zVar.b();
    }

    @w0(21)
    public static final int c(@dl.d Size size) {
        kotlin.jvm.internal.f0.p(size, "<this>");
        return size.getWidth();
    }

    @w0(21)
    public static final float d(@dl.d SizeF sizeF) {
        kotlin.jvm.internal.f0.p(sizeF, "<this>");
        return sizeF.getHeight();
    }

    public static final float e(@dl.d z zVar) {
        kotlin.jvm.internal.f0.p(zVar, "<this>");
        return zVar.a();
    }

    @w0(21)
    public static final int f(@dl.d Size size) {
        kotlin.jvm.internal.f0.p(size, "<this>");
        return size.getHeight();
    }
}
