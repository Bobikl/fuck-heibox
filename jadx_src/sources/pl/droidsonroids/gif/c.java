package pl.droidsonroids.gif;

import android.graphics.Bitmap;
import androidx.annotation.f0;
import androidx.annotation.n0;
import androidx.annotation.p0;
import java.io.IOException;

/* JADX INFO: compiled from: GifDecoder.java */
/* JADX INFO: loaded from: classes5.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final GifInfoHandle f138338a;

    public c(@n0 k kVar) throws IOException {
        this(kVar, null);
    }

    public c(@n0 k kVar, @p0 g gVar) throws IOException {
        GifInfoHandle gifInfoHandleC = kVar.c();
        this.f138338a = gifInfoHandleC;
        if (gVar != null) {
            gifInfoHandleC.K(gVar.f138368a, gVar.f138369b);
        }
    }

    private void a(Bitmap bitmap) {
        if (bitmap.isRecycled()) {
            throw new IllegalArgumentException("Bitmap is recycled");
        }
        if (bitmap.getWidth() < this.f138338a.q() || bitmap.getHeight() < this.f138338a.i()) {
            throw new IllegalArgumentException("Bitmap ia too small, size must be greater than or equal to GIF size");
        }
        if (bitmap.getConfig() == Bitmap.Config.ARGB_8888) {
            return;
        }
        throw new IllegalArgumentException("Only Config.ARGB_8888 is supported. Current bitmap config: " + bitmap.getConfig());
    }

    public long b() {
        return this.f138338a.b();
    }

    public String c() {
        return this.f138338a.c();
    }

    public int d() {
        return this.f138338a.g();
    }

    public int e(@f0(from = 0) int i10) {
        return this.f138338a.h(i10);
    }

    public int f() {
        return this.f138338a.i();
    }

    public int g() {
        return this.f138338a.j();
    }

    public int h() {
        return this.f138338a.n();
    }

    public long i() {
        return this.f138338a.p();
    }

    public int j() {
        return this.f138338a.q();
    }

    public boolean k() {
        return this.f138338a.n() > 1 && d() > 0;
    }

    public void l() {
        this.f138338a.A();
    }

    public void m(@f0(from = 0, to = 2147483647L) int i10, @n0 Bitmap bitmap) {
        a(bitmap);
        this.f138338a.G(i10, bitmap);
    }

    public void n(@f0(from = 0, to = 2147483647L) int i10, @n0 Bitmap bitmap) {
        a(bitmap);
        this.f138338a.I(i10, bitmap);
    }
}
