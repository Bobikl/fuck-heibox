package com.tencent.beacon.d;

import android.content.SharedPreferences;
import com.tencent.beacon.base.net.c.d;

/* JADX INFO: compiled from: Heartbeat.java */
/* JADX INFO: loaded from: classes4.dex */
public class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f98972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.tencent.beacon.a.d.a f98973b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ c f98974c;

    b(c cVar, String str, com.tencent.beacon.a.d.a aVar) {
        this.f98974c = cVar;
        this.f98972a = str;
        this.f98973b = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (d.d()) {
            boolean zC = this.f98974c.c();
            if (this.f98974c.f98977c && zC) {
                com.tencent.beacon.base.util.c.a("[event] rqd_heartbeat A85=Y report success : " + this.f98972a, new Object[0]);
                com.tencent.beacon.a.d.a.SharedPreferencesEditorC0949a sharedPreferencesEditorC0949aEdit = this.f98973b.edit();
                if (com.tencent.beacon.base.util.b.a((SharedPreferences.Editor) sharedPreferencesEditorC0949aEdit)) {
                    sharedPreferencesEditorC0949aEdit.putString("active_user_date", this.f98972a).commit();
                    sharedPreferencesEditorC0949aEdit.putString("HEART_DENGTA", this.f98972a).commit();
                }
            }
        }
    }
}
