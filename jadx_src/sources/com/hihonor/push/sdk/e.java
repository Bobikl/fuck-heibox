package com.hihonor.push.sdk;

import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes7.dex */
public class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v f60016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f60017b;

    public e(l lVar, v vVar) {
        this.f60017b = lVar;
        this.f60016a = vVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f60017b.f60052b) {
            return;
        }
        this.f60017b.f60052b = true;
        this.f60017b.getClass();
        this.f60017b.f60051a = new WeakReference<>(this.f60016a.f60092a);
        this.f60017b.f60053c = this.f60016a.f60093b;
        this.f60017b.f60054d = new s(this.f60016a.f60092a);
        if (this.f60017b.f60053c) {
            l lVar = this.f60017b;
            lVar.a(new f(lVar, null, true), (HonorPushCallback<?>) null);
        }
    }
}
