package com.google.android.gms.tasks;

/* JADX INFO: compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
/* JADX INFO: loaded from: classes7.dex */
public class l<TResult> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q0 f52774a = new q0();

    public l() {
    }

    public l(@androidx.annotation.n0 a aVar) {
        aVar.b(new m0(this));
    }

    @androidx.annotation.n0
    public k<TResult> a() {
        return this.f52774a;
    }

    public void b(@androidx.annotation.n0 Exception exc) {
        this.f52774a.y(exc);
    }

    public void c(@androidx.annotation.p0 TResult tresult) {
        this.f52774a.z(tresult);
    }

    public boolean d(@androidx.annotation.n0 Exception exc) {
        return this.f52774a.B(exc);
    }

    public boolean e(@androidx.annotation.p0 TResult tresult) {
        return this.f52774a.C(tresult);
    }
}
