package com.google.android.material.circularreveal;

import android.animation.TypeEvaluator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.Property;
import androidx.annotation.l;
import androidx.annotation.n0;
import androidx.annotation.p0;

/* JADX INFO: compiled from: CircularRevealWidget.java */
/* JADX INFO: loaded from: classes7.dex */
public interface c extends com.google.android.material.circularreveal.b.a {

    /* JADX INFO: compiled from: CircularRevealWidget.java */
    public static class b implements TypeEvaluator<e> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final TypeEvaluator<e> f53635b = new b();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final e f53636a = new e();

        @Override // android.animation.TypeEvaluator
        @n0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public e evaluate(float f10, @n0 e eVar, @n0 e eVar2) {
            this.f53636a.b(h9.a.f(eVar.f53640a, eVar2.f53640a, f10), h9.a.f(eVar.f53641b, eVar2.f53641b, f10), h9.a.f(eVar.f53642c, eVar2.f53642c, f10));
            return this.f53636a;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.circularreveal.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: CircularRevealWidget.java */
    public static class C0422c extends Property<c, e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Property<c, e> f53637a = new C0422c("circularReveal");

        private C0422c(String str) {
            super(e.class, str);
        }

        @Override // android.util.Property
        @p0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public e get(@n0 c cVar) {
            return cVar.getRevealInfo();
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(@n0 c cVar, @p0 e eVar) {
            cVar.setRevealInfo(eVar);
        }
    }

    /* JADX INFO: compiled from: CircularRevealWidget.java */
    public static class d extends Property<c, Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Property<c, Integer> f53638a = new d("circularRevealScrimColor");

        private d(String str) {
            super(Integer.class, str);
        }

        @Override // android.util.Property
        @n0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer get(@n0 c cVar) {
            return Integer.valueOf(cVar.getCircularRevealScrimColor());
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(@n0 c cVar, @n0 Integer num) {
            cVar.setCircularRevealScrimColor(num.intValue());
        }
    }

    /* JADX INFO: compiled from: CircularRevealWidget.java */
    public static class e {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final float f53639d = Float.MAX_VALUE;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f53640a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f53641b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f53642c;

        private e() {
        }

        public e(float f10, float f11, float f12) {
            this.f53640a = f10;
            this.f53641b = f11;
            this.f53642c = f12;
        }

        public e(@n0 e eVar) {
            this(eVar.f53640a, eVar.f53641b, eVar.f53642c);
        }

        public boolean a() {
            return this.f53642c == Float.MAX_VALUE;
        }

        public void b(float f10, float f11, float f12) {
            this.f53640a = f10;
            this.f53641b = f11;
            this.f53642c = f12;
        }

        public void c(@n0 e eVar) {
            b(eVar.f53640a, eVar.f53641b, eVar.f53642c);
        }
    }

    void a();

    void d();

    void draw(Canvas canvas);

    @p0
    Drawable getCircularRevealOverlayDrawable();

    @l
    int getCircularRevealScrimColor();

    @p0
    e getRevealInfo();

    boolean isOpaque();

    void setCircularRevealOverlayDrawable(@p0 Drawable drawable);

    void setCircularRevealScrimColor(@l int i10);

    void setRevealInfo(@p0 e eVar);
}
