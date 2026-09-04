package com.google.android.material.internal;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.annotation.RestrictTo;
import androidx.annotation.n0;
import androidx.annotation.p0;
import java.lang.reflect.Constructor;

/* JADX INFO: loaded from: classes7.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class StaticLayoutBuilderCompat {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    static final int f54389o = 1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    static final float f54390p = 0.0f;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    static final float f54391q = 1.0f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final String f54392r = "android.text.TextDirectionHeuristic";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final String f54393s = "android.text.TextDirectionHeuristics";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final String f54394t = "LTR";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final String f54395u = "RTL";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static boolean f54396v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @p0
    private static Constructor<StaticLayout> f54397w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @p0
    private static Object f54398x;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private CharSequence f54399a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TextPaint f54400b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f54401c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f54403e;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f54410l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @p0
    private y f54412n;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f54402d = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Layout.Alignment f54404f = Layout.Alignment.ALIGN_NORMAL;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f54405g = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f54406h = 0.0f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f54407i = 1.0f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f54408j = f54389o;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f54409k = true;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @p0
    private TextUtils.TruncateAt f54411m = null;

    public static class StaticLayoutBuilderCompatException extends Exception {
        StaticLayoutBuilderCompatException(Throwable th2) {
            super("Error thrown initializing StaticLayout " + th2.getMessage(), th2);
        }
    }

    private StaticLayoutBuilderCompat(CharSequence charSequence, TextPaint textPaint, int i10) {
        this.f54399a = charSequence;
        this.f54400b = textPaint;
        this.f54401c = i10;
        this.f54403e = charSequence.length();
    }

    private void b() throws StaticLayoutBuilderCompatException {
        if (f54396v) {
            return;
        }
        try {
            f54398x = this.f54410l ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
            Class cls = Integer.TYPE;
            Class cls2 = Float.TYPE;
            Constructor<StaticLayout> declaredConstructor = StaticLayout.class.getDeclaredConstructor(CharSequence.class, cls, cls, TextPaint.class, cls, Layout.Alignment.class, TextDirectionHeuristic.class, cls2, cls2, Boolean.TYPE, TextUtils.TruncateAt.class, cls, cls);
            f54397w = declaredConstructor;
            declaredConstructor.setAccessible(true);
            f54396v = true;
        } catch (Exception e10) {
            throw new StaticLayoutBuilderCompatException(e10);
        }
    }

    @n0
    public static StaticLayoutBuilderCompat c(@n0 CharSequence charSequence, @n0 TextPaint textPaint, @androidx.annotation.f0(from = 0) int i10) {
        return new StaticLayoutBuilderCompat(charSequence, textPaint, i10);
    }

    public StaticLayout a() throws StaticLayoutBuilderCompatException {
        if (this.f54399a == null) {
            this.f54399a = "";
        }
        int iMax = Math.max(0, this.f54401c);
        CharSequence charSequenceEllipsize = this.f54399a;
        if (this.f54405g == 1) {
            charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, this.f54400b, iMax, this.f54411m);
        }
        int iMin = Math.min(charSequenceEllipsize.length(), this.f54403e);
        this.f54403e = iMin;
        if (this.f54410l && this.f54405g == 1) {
            this.f54404f = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequenceEllipsize, this.f54402d, iMin, this.f54400b, iMax);
        builderObtain.setAlignment(this.f54404f);
        builderObtain.setIncludePad(this.f54409k);
        builderObtain.setTextDirection(this.f54410l ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.f54411m;
        if (truncateAt != null) {
            builderObtain.setEllipsize(truncateAt);
        }
        builderObtain.setMaxLines(this.f54405g);
        float f10 = this.f54406h;
        if (f10 != 0.0f || this.f54407i != 1.0f) {
            builderObtain.setLineSpacing(f10, this.f54407i);
        }
        if (this.f54405g > 1) {
            builderObtain.setHyphenationFrequency(this.f54408j);
        }
        y yVar = this.f54412n;
        if (yVar != null) {
            yVar.a(builderObtain);
        }
        return builderObtain.build();
    }

    @s9.a
    @n0
    public StaticLayoutBuilderCompat d(@n0 Layout.Alignment alignment) {
        this.f54404f = alignment;
        return this;
    }

    @s9.a
    @n0
    public StaticLayoutBuilderCompat e(@p0 TextUtils.TruncateAt truncateAt) {
        this.f54411m = truncateAt;
        return this;
    }

    @s9.a
    @n0
    public StaticLayoutBuilderCompat f(@androidx.annotation.f0(from = 0) int i10) {
        this.f54403e = i10;
        return this;
    }

    @s9.a
    @n0
    public StaticLayoutBuilderCompat g(int i10) {
        this.f54408j = i10;
        return this;
    }

    @s9.a
    @n0
    public StaticLayoutBuilderCompat h(boolean z10) {
        this.f54409k = z10;
        return this;
    }

    public StaticLayoutBuilderCompat i(boolean z10) {
        this.f54410l = z10;
        return this;
    }

    @s9.a
    @n0
    public StaticLayoutBuilderCompat j(float f10, float f11) {
        this.f54406h = f10;
        this.f54407i = f11;
        return this;
    }

    @s9.a
    @n0
    public StaticLayoutBuilderCompat k(@androidx.annotation.f0(from = 0) int i10) {
        this.f54405g = i10;
        return this;
    }

    @s9.a
    @n0
    public StaticLayoutBuilderCompat l(@androidx.annotation.f0(from = 0) int i10) {
        this.f54402d = i10;
        return this;
    }

    @s9.a
    @n0
    public StaticLayoutBuilderCompat m(@p0 y yVar) {
        this.f54412n = yVar;
        return this;
    }
}
