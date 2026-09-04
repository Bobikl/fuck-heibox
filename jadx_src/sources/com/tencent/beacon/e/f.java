package com.tencent.beacon.e;

import android.content.SharedPreferences;
import java.util.Date;

/* JADX INFO: compiled from: StrategyHolder.java */
/* JADX INFO: loaded from: classes4.dex */
public class f implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f99019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f99020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ g f99021c;

    f(g gVar, String str, String str2) {
        this.f99021c = gVar;
        this.f99019a = str;
        this.f99020b = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        Date dateD = com.tencent.beacon.base.util.b.d(this.f99019a);
        long time = dateD != null ? dateD.getTime() / 1000 : 0L;
        if (time == 0) {
            time = (new Date().getTime() / 1000) + 86400;
        }
        com.tencent.beacon.a.d.a.SharedPreferencesEditorC0949a sharedPreferencesEditorC0949aEdit = com.tencent.beacon.a.d.a.a().edit();
        if (com.tencent.beacon.base.util.b.a((SharedPreferences.Editor) sharedPreferencesEditorC0949aEdit)) {
            sharedPreferencesEditorC0949aEdit.putString("sid_value", this.f99020b).putLong("sid_mt", time);
        }
    }
}
