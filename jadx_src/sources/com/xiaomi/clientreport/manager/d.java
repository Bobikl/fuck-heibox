package com.xiaomi.clientreport.manager;

import com.xiaomi.push.ah;

/* JADX INFO: loaded from: classes4.dex */
public class d extends ah.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ a f106721a;

    d(a aVar) {
        this.f106721a = aVar;
    }

    @Override // com.xiaomi.push.ah.a
    /* JADX INFO: renamed from: a */
    public String mo195a() {
        return "100888";
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f106721a.a() > 0) {
            this.f106721a.f94a.execute(new e(this));
        }
    }
}
