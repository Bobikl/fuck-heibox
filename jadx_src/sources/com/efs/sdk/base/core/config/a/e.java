package com.efs.sdk.base.core.config.a;

import android.content.SharedPreferences;
import androidx.annotation.n0;
import com.efs.sdk.base.core.c.f;
import com.efs.sdk.base.core.config.GlobalEnvStruct;
import com.efs.sdk.base.core.controller.ControllerCenter;
import com.efs.sdk.base.core.util.Log;
import com.efs.sdk.base.newsharedpreferences.SharedPreferencesUtils;
import java.io.File;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class e implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    volatile SharedPreferences f42501a;

    static boolean a() {
        GlobalEnvStruct globalEnvStruct = ControllerCenter.getGlobalEnvStruct();
        File fileB = com.efs.sdk.base.core.util.a.b(globalEnvStruct.mAppContext, globalEnvStruct.getAppid());
        if (!fileB.exists()) {
            return false;
        }
        com.efs.sdk.base.core.util.b.b(fileB);
        return true;
    }

    static void b() {
        File fileA = com.efs.sdk.base.core.util.a.a(ControllerCenter.getGlobalEnvStruct().mAppContext, ControllerCenter.getGlobalEnvStruct().getAppid());
        if (fileA.exists()) {
            fileA.delete();
        }
    }

    private void d() {
        if (this.f42501a == null) {
            synchronized (com.efs.sdk.base.core.c.b.class) {
                if (this.f42501a == null) {
                    this.f42501a = SharedPreferencesUtils.getSharedPreferences(ControllerCenter.getGlobalEnvStruct().mAppContext, com.efs.sdk.base.core.util.b.b.a(("config_" + ControllerCenter.getGlobalEnvStruct().getAppid().toLowerCase()).getBytes()));
                    this.f42501a.registerOnSharedPreferenceChangeListener(this);
                }
            }
        }
    }

    final boolean a(@n0 b bVar) {
        c();
        if (this.f42501a == null) {
            return false;
        }
        SharedPreferences.Editor editorEdit = this.f42501a.edit();
        editorEdit.clear();
        editorEdit.putInt("cver", bVar.f42483a);
        editorEdit.putLong("last_refresh_time", System.currentTimeMillis());
        for (Map.Entry<String, String> entry : bVar.f42488f.entrySet()) {
            editorEdit.putString(entry.getKey(), entry.getValue());
        }
        editorEdit.apply();
        return true;
    }

    final void c() {
        try {
            d();
        } catch (Throwable th2) {
            Log.e("efs.config", "init sharedpreferences error", th2);
        }
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (f.a.f42462a.a()) {
            return;
        }
        c.a().b();
    }
}
