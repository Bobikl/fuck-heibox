package com.airbnb.lottie.value;

/* JADX INFO: compiled from: ScaleXY.java */
/* JADX INFO: loaded from: classes6.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f37884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f37885b;

    public k() {
        this(1.0f, 1.0f);
    }

    public k(float f10, float f11) {
        this.f37884a = f10;
        this.f37885b = f11;
    }

    public boolean a(float f10, float f11) {
        return this.f37884a == f10 && this.f37885b == f11;
    }

    public float b() {
        return this.f37884a;
    }

    public float c() {
        return this.f37885b;
    }

    public void d(float f10, float f11) {
        this.f37884a = f10;
        this.f37885b = f11;
    }

    public String toString() {
        return b() + "x" + c();
    }
}
