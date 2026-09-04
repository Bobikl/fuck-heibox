package androidx.constraintlayout.motion.utils;

import androidx.constraintlayout.core.motion.utils.p;
import androidx.constraintlayout.core.motion.utils.r;
import androidx.constraintlayout.core.motion.utils.s;
import androidx.constraintlayout.motion.widget.q;

/* JADX INFO: compiled from: StopLogic.java */
/* JADX INFO: loaded from: classes.dex */
public class a extends q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private s f18579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private p f18580b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private r f18581c;

    public a() {
        s sVar = new s();
        this.f18579a = sVar;
        this.f18581c = sVar;
    }

    @Override // androidx.constraintlayout.motion.widget.q
    public float a() {
        return this.f18581c.a();
    }

    public void b(float f10, float f11, float f12, float f13, float f14, float f15) {
        s sVar = this.f18579a;
        this.f18581c = sVar;
        sVar.f(f10, f11, f12, f13, f14, f15);
    }

    public String c(String str, float f10) {
        return this.f18581c.c(str, f10);
    }

    public float d(float f10) {
        return this.f18581c.b(f10);
    }

    public boolean e() {
        return this.f18581c.d();
    }

    public void f(float f10, float f11, float f12, float f13, float f14, float f15, float f16, int i10) {
        if (this.f18580b == null) {
            this.f18580b = new p();
        }
        p pVar = this.f18580b;
        this.f18581c = pVar;
        pVar.h(f10, f11, f12, f13, f14, f15, f16, i10);
    }

    @Override // androidx.constraintlayout.motion.widget.q, android.animation.TimeInterpolator
    public float getInterpolation(float f10) {
        return this.f18581c.getInterpolation(f10);
    }
}
