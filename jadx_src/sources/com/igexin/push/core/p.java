package com.igexin.push.core;

import android.content.ContentValues;

/* JADX INFO: loaded from: classes.dex */
public class p implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ ContentValues f63767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ n f63768b;

    p(n nVar, ContentValues contentValues) {
        this.f63768b = nVar;
        this.f63767a = contentValues;
    }

    @Override // java.lang.Runnable
    public void run() {
        c.a().k().a("message", this.f63767a);
    }
}
