package com.xiaomi.push;

/* JADX INFO: loaded from: classes4.dex */
public class hl implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ hi f107271a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    final /* synthetic */ String f543a;

    hl(hi hiVar, String str) {
        this.f107271a = hiVar;
        this.f543a = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        dd.a().a(this.f543a, true);
    }
}
