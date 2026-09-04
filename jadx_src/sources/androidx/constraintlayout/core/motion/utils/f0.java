package androidx.constraintlayout.core.motion.utils;

/* JADX INFO: compiled from: VelocityMatrix.java */
/* JADX INFO: loaded from: classes.dex */
public class f0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static String f17675g = "VelocityMatrix";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    float f17676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    float f17677b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    float f17678c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    float f17679d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    float f17680e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    float f17681f;

    public void a(float f10, float f11, int i10, int i11, float[] fArr) {
        float f12 = fArr[0];
        float f13 = fArr[1];
        float f14 = (f10 - 0.5f) * 2.0f;
        float f15 = (f11 - 0.5f) * 2.0f;
        float f16 = f12 + this.f17678c;
        float f17 = f13 + this.f17679d;
        float f18 = f16 + (this.f17676a * f14);
        float f19 = f17 + (this.f17677b * f15);
        float radians = (float) Math.toRadians(this.f17681f);
        float radians2 = (float) Math.toRadians(this.f17680e);
        double d10 = radians;
        double d11 = i11 * f15;
        float fSin = f18 + (((float) ((((double) ((-i10) * f14)) * Math.sin(d10)) - (Math.cos(d10) * d11))) * radians2);
        float fCos = f19 + (radians2 * ((float) ((((double) (i10 * f14)) * Math.cos(d10)) - (d11 * Math.sin(d10)))));
        fArr[0] = fSin;
        fArr[1] = fCos;
    }

    public void b() {
        this.f17680e = 0.0f;
        this.f17679d = 0.0f;
        this.f17678c = 0.0f;
        this.f17677b = 0.0f;
        this.f17676a = 0.0f;
    }

    public void c(h hVar, float f10) {
        if (hVar != null) {
            this.f17680e = hVar.c(f10);
        }
    }

    public void d(o oVar, float f10) {
        if (oVar != null) {
            this.f17680e = oVar.c(f10);
            this.f17681f = oVar.a(f10);
        }
    }

    public void e(h hVar, h hVar2, float f10) {
        if (hVar != null) {
            this.f17676a = hVar.c(f10);
        }
        if (hVar2 != null) {
            this.f17677b = hVar2.c(f10);
        }
    }

    public void f(o oVar, o oVar2, float f10) {
        if (oVar != null) {
            this.f17676a = oVar.c(f10);
        }
        if (oVar2 != null) {
            this.f17677b = oVar2.c(f10);
        }
    }

    public void g(h hVar, h hVar2, float f10) {
        if (hVar != null) {
            this.f17678c = hVar.c(f10);
        }
        if (hVar2 != null) {
            this.f17679d = hVar2.c(f10);
        }
    }

    public void h(o oVar, o oVar2, float f10) {
        if (oVar != null) {
            this.f17678c = oVar.c(f10);
        }
        if (oVar2 != null) {
            this.f17679d = oVar2.c(f10);
        }
    }
}
