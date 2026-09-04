package com.xiaomi.push;

import android.content.Context;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes4.dex */
public class ck implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f106915a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private WeakReference<Context> f240a;

    public ck(String str, WeakReference<Context> weakReference) {
        this.f106915a = str;
        this.f240a = weakReference;
    }

    @Override // java.lang.Runnable
    public void run() {
        Context context;
        WeakReference<Context> weakReference = this.f240a;
        if (weakReference == null || (context = weakReference.get()) == null) {
            return;
        }
        if (cx.a(this.f106915a) <= cj.f238a) {
            com.xiaomi.channel.commonutils.logger.b.b("=====> do not need clean db");
            return;
        }
        cn cnVarA = cn.a(this.f106915a);
        cm cmVarA = cm.a(this.f106915a);
        cnVarA.a(cmVarA);
        cmVarA.a(cl.a(context, this.f106915a, 1000));
        cr.a(context).a((cr.a) cnVarA);
    }
}
