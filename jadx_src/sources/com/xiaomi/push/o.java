package com.xiaomi.push;

import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes4.dex */
public class o implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ n f107820a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    final /* synthetic */ String f937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f107821b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f107822c;

    o(n nVar, String str, String str2, String str3) {
        this.f107820a = nVar;
        this.f937a = str;
        this.f107821b = str2;
        this.f107822c = str3;
    }

    @Override // java.lang.Runnable
    public void run() {
        SharedPreferences.Editor editorEdit = this.f107820a.f934a.getSharedPreferences(this.f937a, 4).edit();
        editorEdit.putString(this.f107821b, this.f107822c);
        editorEdit.commit();
    }
}
