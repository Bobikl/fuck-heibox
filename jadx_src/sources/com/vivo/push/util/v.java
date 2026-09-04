package com.vivo.push.util;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;

/* JADX INFO: compiled from: SettingsCache.java */
/* JADX INFO: loaded from: classes4.dex */
public final class v implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ContentResolver f106694a;

    v() {
    }

    @Override // com.vivo.push.util.d
    public final String a(String str, String str2) {
        try {
            return Settings.System.getString(this.f106694a, str);
        } catch (Exception e10) {
            e10.printStackTrace();
            p.b("SettingsCache", "getString error by ".concat(String.valueOf(str)));
            return str2;
        }
    }

    @Override // com.vivo.push.util.d
    public final boolean a(Context context) {
        if (!j.b()) {
            return false;
        }
        this.f106694a = context.getContentResolver();
        return true;
    }

    @Override // com.vivo.push.util.d
    public final void b(String str, String str2) {
        try {
            Settings.System.putString(this.f106694a, str, str2);
        } catch (Exception e10) {
            e10.printStackTrace();
            p.b("SettingsCache", "putString error by ".concat(String.valueOf(str)));
        }
    }
}
