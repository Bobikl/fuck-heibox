package com.huawei.hms.scankit.p;

import android.graphics.Point;

/* JADX INFO: compiled from: CameraConfig.java */
/* JADX INFO: loaded from: classes7.dex */
public class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f61734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f61735b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f61736c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Point f61737d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f61738e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f61739f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f61740g;

    /* JADX INFO: compiled from: CameraConfig.java */
    public static class b {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Point f61745e;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f61741a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f61742b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f61743c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f61744d = kotlinx.coroutines.s0.f130317e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f61746f = true;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f61747g = false;

        public b a(int i10) {
            this.f61742b = i10;
            return this;
        }

        public b a(Point point) {
            this.f61745e = point;
            return this;
        }

        public b a(boolean z10) {
            this.f61747g = z10;
            return this;
        }

        public e0 a() {
            return new e0(this.f61741a, this.f61742b, this.f61743c, this.f61744d, this.f61745e, this.f61746f).a(this.f61747g);
        }

        public b b(int i10) {
            this.f61743c = i10;
            return this;
        }

        public b b(boolean z10) {
            this.f61746f = z10;
            return this;
        }
    }

    private e0(int i10, int i11, int i12, String str, Point point, boolean z10) {
        this.f61734a = i10;
        this.f61735b = i11;
        this.f61738e = i12;
        this.f61736c = str;
        this.f61737d = point;
        this.f61739f = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public e0 a(boolean z10) {
        this.f61740g = z10;
        return this;
    }

    public Point a() {
        return this.f61737d;
    }

    public void a(int i10) {
        this.f61738e = i10;
    }

    public void a(Point point) {
        this.f61737d = point;
    }

    public int b() {
        return this.f61734a;
    }

    public int c() {
        return this.f61735b;
    }

    public int d() {
        return this.f61738e;
    }

    public boolean e() {
        return this.f61739f;
    }

    public String f() {
        return this.f61736c;
    }
}
