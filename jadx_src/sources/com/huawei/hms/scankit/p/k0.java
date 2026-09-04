package com.huawei.hms.scankit.p;

import android.graphics.Rect;

/* JADX INFO: compiled from: CameraMeteringData.java */
/* JADX INFO: loaded from: classes7.dex */
public class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f62023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Rect f62024b;

    /* JADX INFO: compiled from: CameraMeteringData.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Rect f62025a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f62026b;

        public a(Rect rect, int i10) {
            this.f62025a = rect;
            this.f62026b = i10;
        }
    }

    public k0(int i10, Rect rect) {
        this.f62023a = i10;
        this.f62024b = new Rect(rect);
    }

    public int a() {
        return this.f62023a;
    }

    public Rect b() {
        return this.f62024b;
    }
}
