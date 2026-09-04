package com.tencent.liteav.base.storage;

import android.content.SharedPreferences;
import com.tencent.liteav.base.ContextUtils;
import com.tencent.liteav.base.annotations.JNINamespace;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
@JNINamespace("liteav")
public class PersistStorage {
    public static final String GLOBAL_DOMAIN = "com.liteav.storage.global";
    private final SharedPreferences.Editor mEditor;
    private final SharedPreferences mSharedPreferences;

    public PersistStorage(String str) {
        SharedPreferences sharedPreferences = ContextUtils.getApplicationContext().getSharedPreferences(str, 0);
        this.mSharedPreferences = sharedPreferences;
        this.mEditor = sharedPreferences.edit();
    }

    public static int integerToBase(Integer num) {
        return num.intValue();
    }

    public static long longToBase(Long l10) {
        return l10.longValue();
    }

    public void clear(String str) {
        this.mEditor.remove(str);
    }

    public void commit() {
        this.mEditor.apply();
    }

    public String[] getAllKeys() {
        Map<String, ?> all = this.mSharedPreferences.getAll();
        if (all == null || all.isEmpty()) {
            return new String[0];
        }
        Set<String> setKeySet = all.keySet();
        return (String[]) setKeySet.toArray(new String[setKeySet.size()]);
    }

    public Integer getInt(String str) {
        if (!this.mSharedPreferences.contains(str)) {
            return null;
        }
        try {
            return Integer.valueOf(this.mSharedPreferences.getInt(str, -1));
        } catch (ClassCastException unused) {
            return null;
        }
    }

    public Long getLong(String str) {
        if (!this.mSharedPreferences.contains(str)) {
            return null;
        }
        try {
            return Long.valueOf(this.mSharedPreferences.getLong(str, -1L));
        } catch (ClassCastException unused) {
            return null;
        }
    }

    public String getString(String str) {
        if (!this.mSharedPreferences.contains(str)) {
            return null;
        }
        try {
            return this.mSharedPreferences.getString(str, null);
        } catch (ClassCastException unused) {
            return null;
        }
    }

    public void put(String str, int i10) {
        this.mEditor.putInt(str, i10);
    }

    public void put(String str, long j10) {
        this.mEditor.putLong(str, j10);
    }

    public void put(String str, String str2) {
        this.mEditor.putString(str, str2);
    }
}
