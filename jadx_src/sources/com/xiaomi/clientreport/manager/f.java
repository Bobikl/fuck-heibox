package com.xiaomi.clientreport.manager;

import com.xiaomi.push.ah;

/* JADX INFO: loaded from: classes4.dex */
public class f extends ah.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ a f106723a;

    f(a aVar) {
        this.f106723a = aVar;
    }

    @Override // com.xiaomi.push.ah.a
    /* JADX INFO: renamed from: a */
    public String mo195a() {
        return "100889";
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f106723a.b() > 0) {
            this.f106723a.f94a.execute(new g(this));
        }
    }
}
