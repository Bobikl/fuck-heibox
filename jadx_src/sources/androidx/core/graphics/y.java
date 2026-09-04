package androidx.core.graphics;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.graphics.ColorSpace;

/* JADX INFO: compiled from: Color.kt */
/* JADX INFO: loaded from: classes.dex */
public final class y {
    @androidx.annotation.w0(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final float A(long j10) {
        return Color.luminance(j10);
    }

    @androidx.annotation.w0(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final float B(long j10) {
        return Color.red(j10);
    }

    public static final int C(@androidx.annotation.l int i10) {
        return (i10 >> 16) & 255;
    }

    @androidx.annotation.w0(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final boolean D(long j10) {
        return Color.isSrgb(j10);
    }

    @androidx.annotation.w0(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final boolean E(long j10) {
        return Color.isWideGamut(j10);
    }

    @dl.d
    @androidx.annotation.w0(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final Color F(@dl.d Color color, @dl.d Color c10) {
        kotlin.jvm.internal.f0.p(color, "<this>");
        kotlin.jvm.internal.f0.p(c10, "c");
        Color colorU = f0.u(c10, color);
        kotlin.jvm.internal.f0.o(colorU, "compositeColors(c, this)");
        return colorU;
    }

    @dl.d
    @androidx.annotation.w0(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final Color G(@androidx.annotation.l int i10) {
        Color colorValueOf = Color.valueOf(i10);
        kotlin.jvm.internal.f0.o(colorValueOf, "valueOf(this)");
        return colorValueOf;
    }

    @dl.d
    @androidx.annotation.w0(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final Color H(long j10) {
        Color colorValueOf = Color.valueOf(j10);
        kotlin.jvm.internal.f0.o(colorValueOf, "valueOf(this)");
        return colorValueOf;
    }

    @androidx.annotation.l
    @androidx.annotation.w0(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final int I(long j10) {
        return Color.toArgb(j10);
    }

    @androidx.annotation.l
    public static final int J(@dl.d String str) {
        kotlin.jvm.internal.f0.p(str, "<this>");
        return Color.parseColor(str);
    }

    @androidx.annotation.w0(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final long K(@androidx.annotation.l int i10) {
        return Color.pack(i10);
    }

    @androidx.annotation.w0(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final float a(long j10) {
        return Color.red(j10);
    }

    @androidx.annotation.w0(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final float b(@dl.d Color color) {
        kotlin.jvm.internal.f0.p(color, "<this>");
        return color.getComponent(0);
    }

    public static final int c(@androidx.annotation.l int i10) {
        return (i10 >> 24) & 255;
    }

    @androidx.annotation.w0(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final float d(long j10) {
        return Color.green(j10);
    }

    @androidx.annotation.w0(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final float e(@dl.d Color color) {
        kotlin.jvm.internal.f0.p(color, "<this>");
        return color.getComponent(1);
    }

    public static final int f(@androidx.annotation.l int i10) {
        return (i10 >> 16) & 255;
    }

    @androidx.annotation.w0(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final float g(long j10) {
        return Color.blue(j10);
    }

    @androidx.annotation.w0(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final float h(@dl.d Color color) {
        kotlin.jvm.internal.f0.p(color, "<this>");
        return color.getComponent(2);
    }

    public static final int i(@androidx.annotation.l int i10) {
        return (i10 >> 8) & 255;
    }

    @androidx.annotation.w0(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final float j(long j10) {
        return Color.alpha(j10);
    }

    @androidx.annotation.w0(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final float k(@dl.d Color color) {
        kotlin.jvm.internal.f0.p(color, "<this>");
        return color.getComponent(3);
    }

    public static final int l(@androidx.annotation.l int i10) {
        return i10 & 255;
    }

    @androidx.annotation.w0(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final long m(@androidx.annotation.l int i10, @dl.d ColorSpace.Named colorSpace) {
        kotlin.jvm.internal.f0.p(colorSpace, "colorSpace");
        return Color.convert(i10, ColorSpace.get(colorSpace));
    }

    @androidx.annotation.w0(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final long n(@androidx.annotation.l int i10, @dl.d ColorSpace colorSpace) {
        kotlin.jvm.internal.f0.p(colorSpace, "colorSpace");
        return Color.convert(i10, colorSpace);
    }

    @androidx.annotation.w0(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final long o(long j10, @dl.d ColorSpace.Named colorSpace) {
        kotlin.jvm.internal.f0.p(colorSpace, "colorSpace");
        return Color.convert(j10, ColorSpace.get(colorSpace));
    }

    @androidx.annotation.w0(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final long p(long j10, @dl.d ColorSpace colorSpace) {
        kotlin.jvm.internal.f0.p(colorSpace, "colorSpace");
        return Color.convert(j10, colorSpace);
    }

    @dl.d
    @androidx.annotation.w0(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final Color q(@dl.d Color color, @dl.d ColorSpace.Named colorSpace) {
        kotlin.jvm.internal.f0.p(color, "<this>");
        kotlin.jvm.internal.f0.p(colorSpace, "colorSpace");
        Color colorConvert = color.convert(ColorSpace.get(colorSpace));
        kotlin.jvm.internal.f0.o(colorConvert, "convert(ColorSpace.get(colorSpace))");
        return colorConvert;
    }

    @dl.d
    @androidx.annotation.w0(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final Color r(@dl.d Color color, @dl.d ColorSpace colorSpace) {
        kotlin.jvm.internal.f0.p(color, "<this>");
        kotlin.jvm.internal.f0.p(colorSpace, "colorSpace");
        Color colorConvert = color.convert(colorSpace);
        kotlin.jvm.internal.f0.o(colorConvert, "convert(colorSpace)");
        return colorConvert;
    }

    @androidx.annotation.w0(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final float s(long j10) {
        return Color.alpha(j10);
    }

    public static final int t(@androidx.annotation.l int i10) {
        return (i10 >> 24) & 255;
    }

    @androidx.annotation.w0(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final float u(long j10) {
        return Color.blue(j10);
    }

    public static final int v(@androidx.annotation.l int i10) {
        return i10 & 255;
    }

    @dl.d
    @androidx.annotation.w0(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final ColorSpace w(long j10) {
        ColorSpace colorSpace = Color.colorSpace(j10);
        kotlin.jvm.internal.f0.o(colorSpace, "colorSpace(this)");
        return colorSpace;
    }

    @androidx.annotation.w0(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final float x(long j10) {
        return Color.green(j10);
    }

    public static final int y(@androidx.annotation.l int i10) {
        return (i10 >> 8) & 255;
    }

    @androidx.annotation.w0(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final float z(@androidx.annotation.l int i10) {
        return Color.luminance(i10);
    }
}
