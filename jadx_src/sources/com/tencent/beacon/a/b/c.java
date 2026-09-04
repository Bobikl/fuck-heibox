package com.tencent.beacon.a.b;

import com.tencent.beacon.base.net.HttpMethod;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: AbstractAttaReport.java */
/* JADX INFO: loaded from: classes4.dex */
public class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f98748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f98749b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ Throwable f98750c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ boolean f98751d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ com.tencent.beacon.base.net.a.b f98752e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ e f98753f;

    c(e eVar, String str, String str2, Throwable th2, boolean z10, com.tencent.beacon.base.net.a.b bVar) {
        this.f98753f = eVar;
        this.f98748a = str;
        this.f98749b = str2;
        this.f98750c = th2;
        this.f98751d = z10;
        this.f98752e = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f98753f) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(e.f98755a);
            linkedHashMap.put("error_code", this.f98748a);
            linkedHashMap.put("error_msg", this.f98749b);
            linkedHashMap.put("error_stack_full", com.tencent.beacon.base.util.b.a(this.f98750c));
            linkedHashMap.put("_dc", String.valueOf(Math.random()));
            com.tencent.beacon.base.net.d.c().a(com.tencent.beacon.base.net.a.f.b().b(this.f98751d ? "https://htrace.wetvinfo.com/kv" : "https://h.trace.qq.com/kv").a("atta").a(linkedHashMap).a(HttpMethod.POST).a()).a(this.f98752e);
            com.tencent.beacon.base.util.c.d("[atta] upload a new error, errorCode: %s, message: %s, stack: %s", this.f98748a, this.f98749b, com.tencent.beacon.base.util.b.a(this.f98750c));
        }
    }
}
