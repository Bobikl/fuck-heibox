package com.xiaomi.push;

/* JADX INFO: loaded from: classes4.dex */
public class am implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ ak.b f106819a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    final /* synthetic */ ak f177a;

    am(ak akVar, ak.b bVar) {
        this.f177a = akVar;
        this.f106819a = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f177a.a(this.f106819a);
    }
}
