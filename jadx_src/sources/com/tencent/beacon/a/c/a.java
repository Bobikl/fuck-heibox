package com.tencent.beacon.a.c;

import android.content.SharedPreferences;

/* JADX INFO: compiled from: AppInfo.java */
/* JADX INFO: loaded from: classes4.dex */
public final class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.tencent.beacon.a.d.a f98776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f98777b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ long f98778c;

    a(com.tencent.beacon.a.d.a aVar, String str, long j10) {
        this.f98776a = aVar;
        this.f98777b = str;
        this.f98778c = j10;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.beacon.a.d.a.SharedPreferencesEditorC0949a sharedPreferencesEditorC0949aEdit = this.f98776a.edit();
        if (com.tencent.beacon.base.util.b.a((SharedPreferences.Editor) sharedPreferencesEditorC0949aEdit)) {
            sharedPreferencesEditorC0949aEdit.putLong(this.f98777b, this.f98778c);
        }
    }
}
