package com.ss.android.ttvecamera;

import android.graphics.Rect;
import androidx.annotation.n0;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes8.dex */
public class TEFocusSettings {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f97189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f97190b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f97191c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f97192d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f97193e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f97194f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f97195g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f97196h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f97197i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f97198j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private CoordinatesMode f97199k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private com.ss.android.ttvecamera.b.a f97200l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private com.ss.android.ttvecamera.b.InterfaceC0924b f97201m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private b f97202n;

    public enum CoordinatesMode {
        VIEW,
        ORIGINAL_FRAME
    }

    public interface b {
        void a(int i10, int i11, String str);
    }

    public static class c implements b {
        private c() {
        }

        @Override // com.ss.android.ttvecamera.TEFocusSettings.b
        public void a(int i10, int i11, String str) {
            if (i10 > 0) {
                q.b("TEFocusNullCallback", "Focus done, cost: " + i10 + "ms");
            } else {
                q.k("TEFocusNullCallback", "Focus failed, error code: " + i10 + ", msg: " + str);
            }
            q.m();
        }
    }

    public TEFocusSettings(int i10, int i11, int i12, int i13, float f10) {
        this.f97195g = true;
        this.f97196h = true;
        this.f97197i = false;
        this.f97198j = true;
        this.f97199k = CoordinatesMode.VIEW;
        this.f97200l = null;
        this.f97201m = null;
        this.f97202n = new c();
        this.f97189a = i10;
        this.f97190b = i11;
        this.f97191c = i12;
        this.f97192d = i13;
        this.f97193e = f10;
    }

    public TEFocusSettings(int i10, int i11, int i12, int i13, float f10, b bVar) {
        this.f97195g = true;
        this.f97196h = true;
        this.f97197i = false;
        this.f97198j = true;
        this.f97199k = CoordinatesMode.VIEW;
        this.f97200l = null;
        this.f97201m = null;
        this.f97202n = new c();
        this.f97189a = i10;
        this.f97190b = i11;
        this.f97191c = i12;
        this.f97192d = i13;
        this.f97193e = f10;
        if (bVar != null) {
            this.f97202n = bVar;
        }
    }

    public Rect a(int i10, boolean z10) {
        com.ss.android.ttvecamera.b.a aVar = this.f97200l;
        if (aVar != null) {
            return aVar.a(this.f97189a, this.f97190b, this.f97191c, this.f97192d, i10, z10).get(0).rect;
        }
        return null;
    }

    public Rect b(int i10, boolean z10) {
        com.ss.android.ttvecamera.b.InterfaceC0924b interfaceC0924b = this.f97201m;
        if (interfaceC0924b != null) {
            return interfaceC0924b.a(this.f97189a, this.f97190b, this.f97191c, this.f97192d, i10, z10).get(0).rect;
        }
        return null;
    }

    @p0
    public com.ss.android.ttvecamera.b.a c() {
        return this.f97200l;
    }

    @n0
    public com.ss.android.ttvecamera.b.InterfaceC0924b d() {
        return this.f97201m;
    }

    public CoordinatesMode e() {
        return this.f97199k;
    }

    public float f() {
        return this.f97193e;
    }

    public b g() {
        return this.f97202n;
    }

    public int h() {
        return (int) (System.currentTimeMillis() - this.f97194f);
    }

    public int i() {
        return this.f97190b;
    }

    public int j() {
        return this.f97189a;
    }

    public int k() {
        return this.f97191c;
    }

    public int l() {
        return this.f97192d;
    }

    public boolean m() {
        return this.f97198j;
    }

    public boolean n() {
        return this.f97197i;
    }

    public boolean o() {
        return this.f97195g;
    }

    public boolean p() {
        return this.f97196h;
    }

    public void q() {
        this.f97194f = System.currentTimeMillis();
    }

    public void r(@p0 com.ss.android.ttvecamera.b.a aVar) {
        this.f97200l = aVar;
    }

    public void s(@p0 com.ss.android.ttvecamera.b.InterfaceC0924b interfaceC0924b) {
        this.f97201m = interfaceC0924b;
    }

    public void t(CoordinatesMode coordinatesMode) {
        this.f97199k = coordinatesMode;
    }

    public String toString() {
        return "TEFocusSettings{width =" + this.f97189a + ", height =" + this.f97190b + ", x =" + this.f97191c + ", y =" + this.f97192d + ", need focus =" + this.f97195g + ", need meter =" + this.f97196h + ", lock =" + this.f97197i + ", from user=" + this.f97198j + ", CoordinatesMode" + this.f97199k + '}';
    }

    public void u(b bVar) {
        if (bVar != null) {
            this.f97202n = bVar;
        } else {
            this.f97202n = new c();
        }
    }

    public void v(boolean z10) {
        this.f97198j = z10;
    }

    public void w(boolean z10) {
        this.f97197i = z10;
    }

    public void x(boolean z10) {
        this.f97195g = z10;
    }

    public void y(boolean z10) {
        this.f97196h = z10;
    }
}
