package com.vivo.push;

import android.text.TextUtils;
import com.vivo.push.util.z;

/* JADX INFO: compiled from: PushClientManager.java */
/* JADX INFO: loaded from: classes4.dex */
public final class f implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f106597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ e f106598b;

    f(e eVar, String str) {
        this.f106598b = eVar;
        this.f106597a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f106598b.f106577h == null || TextUtils.isEmpty(this.f106597a) || !z.b(this.f106598b.f106577h, this.f106598b.f106577h.getPackageName(), this.f106597a)) {
            return;
        }
        this.f106598b.i();
    }
}
