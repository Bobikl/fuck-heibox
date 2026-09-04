package com.igexin.push.core;

import android.content.ContentValues;

/* JADX INFO: loaded from: classes.dex */
public class q implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ ContentValues f63769a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f63770b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ n f63771c;

    q(n nVar, ContentValues contentValues, String str) {
        this.f63771c = nVar;
        this.f63769a = contentValues;
        this.f63770b = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        c.a().k().a("message", this.f63769a, new String[]{"taskid"}, new String[]{this.f63770b});
    }
}
