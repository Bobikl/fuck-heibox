package com.vivo.push;

import android.content.Context;

/* JADX INFO: compiled from: PushClientTask.java */
/* JADX INFO: loaded from: classes4.dex */
public abstract class l implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected Context f106610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f106611b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private o f106612c;

    public l(o oVar) {
        this.f106611b = -1;
        this.f106612c = oVar;
        int iB = oVar.b();
        this.f106611b = iB;
        if (iB < 0) {
            throw new IllegalArgumentException("PushTask need a > 0 task id.");
        }
        this.f106610a = e.a().h();
    }

    public final int a() {
        return this.f106611b;
    }

    protected abstract void a(o oVar);

    @Override // java.lang.Runnable
    public final void run() {
        Context context = this.f106610a;
        if (context != null && !(this.f106612c instanceof com.vivo.push.b.n)) {
            com.vivo.push.util.p.a(context, "[执行指令]" + this.f106612c);
        }
        a(this.f106612c);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append("{");
        o oVar = this.f106612c;
        sb2.append(oVar == null ? "[null]" : oVar.toString());
        sb2.append(z5.g.f141884d);
        return sb2.toString();
    }
}
