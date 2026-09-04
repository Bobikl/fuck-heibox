package com.xiaomi.push.service;

import com.xiaomi.push.go;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class ap implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ List f107880a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    final /* synthetic */ boolean f1016a;

    ap(List list, boolean z10) {
        this.f107880a = list;
        this.f1016a = z10;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean zB = ao.b("www.baidu.com:80");
        Iterator it = this.f107880a.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            zB = zB || ao.b((String) it.next());
            if (zB && !this.f1016a) {
                break;
            }
        }
        go.a(zB ? 1 : 2);
    }
}
