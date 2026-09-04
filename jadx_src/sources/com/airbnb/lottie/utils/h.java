package com.airbnb.lottie.utils;

/* JADX INFO: compiled from: MeanCalculator.java */
/* JADX INFO: loaded from: classes6.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f37837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f37838b;

    public void a(float f10) {
        float f11 = this.f37837a + f10;
        this.f37837a = f11;
        int i10 = this.f37838b + 1;
        this.f37838b = i10;
        if (i10 == Integer.MAX_VALUE) {
            this.f37837a = f11 / 2.0f;
            this.f37838b = i10 / 2;
        }
    }

    public float b() {
        int i10 = this.f37838b;
        if (i10 == 0) {
            return 0.0f;
        }
        return this.f37837a / i10;
    }
}
