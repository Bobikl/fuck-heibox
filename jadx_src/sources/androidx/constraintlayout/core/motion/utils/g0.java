package androidx.constraintlayout.core.motion.utils;

/* JADX INFO: compiled from: ViewState.java */
/* JADX INFO: loaded from: classes.dex */
public class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f17683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f17684b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f17685c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f17686d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f17687e;

    public void a(androidx.constraintlayout.core.motion.e eVar) {
        this.f17684b = eVar.l();
        this.f17685c = eVar.w();
        this.f17686d = eVar.q();
        this.f17687e = eVar.h();
        this.f17683a = (int) eVar.t();
    }

    public int b() {
        return this.f17687e - this.f17685c;
    }

    public int c() {
        return this.f17686d - this.f17684b;
    }
}
