package com.tencent.qimei.s;

import android.annotation.SuppressLint;
import com.tencent.qimei.l.b;
import com.tencent.qimei.r.j;
import com.tencent.qimei.sdk.debug.IDebugger;
import com.tencent.qimei.v.f;

/* JADX INFO: compiled from: QimeiDebugger.java */
/* JADX INFO: loaded from: classes4.dex */
public class a implements IDebugger {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f101436a;

    public a(String str) {
        this.f101436a = str;
    }

    @Override // com.tencent.qimei.sdk.debug.IDebugger
    @SuppressLint({"MissingPermission"})
    public void requestQimei() {
        if (b.a()) {
            com.tencent.qimei.c.a.a().a(j.a(this.f101436a));
        }
    }

    @Override // com.tencent.qimei.sdk.debug.IDebugger
    public void requestStrategy() {
        if (b.a()) {
            f.a(this.f101436a).c();
        }
    }

    @Override // com.tencent.qimei.sdk.debug.IDebugger
    public void setDebug(boolean z10) {
        b.a(z10);
    }
}
