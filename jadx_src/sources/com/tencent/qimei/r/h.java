package com.tencent.qimei.r;

import com.tencent.qimei.sdk.Qimei;

/* JADX INFO: compiled from: QimeiQueryTask.java */
/* JADX INFO: loaded from: classes4.dex */
public class h implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f101395a;

    public h(j jVar) {
        this.f101395a = jVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        Qimei qimeiM = p.m(this.f101395a.f101405i);
        if (qimeiM != null && !qimeiM.isEmpty()) {
            this.f101395a.f();
        } else {
            if (this.f101395a.f101399c.getAndIncrement() > 30) {
                return;
            }
            this.f101395a.h();
        }
    }
}
