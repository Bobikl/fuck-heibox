package com.xiaomi.mipush.sdk;

import android.content.Context;
import com.xiaomi.push.in;
import com.xiaomi.push.ja;
import com.xiaomi.push.jm;
import com.xiaomi.push.service.bc;

/* JADX INFO: loaded from: classes4.dex */
public class p extends com.xiaomi.push.ah.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Context f106797a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    final /* synthetic */ jm f156a;

    p(jm jmVar, Context context) {
        this.f156a = jmVar;
        this.f106797a = context;
    }

    @Override // com.xiaomi.push.ah.a
    /* JADX INFO: renamed from: a */
    public String mo195a() {
        return "22";
    }

    @Override // java.lang.Runnable
    public void run() {
        jm jmVar = this.f156a;
        if (jmVar != null) {
            jmVar.a(bc.a());
            ao.a(this.f106797a.getApplicationContext()).a(this.f156a, in.Notification, true, (ja) null, true);
        }
    }
}
