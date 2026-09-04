package pl.droidsonroids.gif;

import androidx.annotation.f0;
import androidx.annotation.p0;
import androidx.annotation.x;
import java.io.IOException;

/* JADX INFO: compiled from: GifTexImage2D.java */
/* JADX INFO: loaded from: classes5.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final GifInfoHandle f138371a;

    public i(k kVar, @p0 g gVar) throws IOException {
        gVar = gVar == null ? new g() : gVar;
        GifInfoHandle gifInfoHandleC = kVar.c();
        this.f138371a = gifInfoHandleC;
        gifInfoHandleC.K(gVar.f138368a, gVar.f138369b);
        gifInfoHandleC.t();
    }

    public int a() {
        return this.f138371a.d();
    }

    public int b() {
        return this.f138371a.g();
    }

    public int c(@f0(from = 0) int i10) {
        return this.f138371a.h(i10);
    }

    public int d() {
        return this.f138371a.i();
    }

    public int e() {
        return this.f138371a.n();
    }

    public int f() {
        return this.f138371a.q();
    }

    protected final void finalize() throws Throwable {
        try {
            i();
        } finally {
            super.finalize();
        }
    }

    public void g(int i10, int i11) {
        this.f138371a.r(i10, i11);
    }

    public void h(int i10, int i11) {
        this.f138371a.s(i10, i11);
    }

    public void i() {
        GifInfoHandle gifInfoHandle = this.f138371a;
        if (gifInfoHandle != null) {
            gifInfoHandle.A();
        }
    }

    public void j(@f0(from = 0) int i10) {
        this.f138371a.H(i10);
    }

    public void k(@x(from = 0.0d, fromInclusive = false) float f10) {
        this.f138371a.L(f10);
    }

    public void l() {
        this.f138371a.M();
    }

    public void m() {
        this.f138371a.N();
    }
}
