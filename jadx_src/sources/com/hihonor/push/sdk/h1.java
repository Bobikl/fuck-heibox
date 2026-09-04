package com.hihonor.push.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;

/* JADX INFO: loaded from: classes7.dex */
public class h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences f60041a;

    public h1(Context context, String str) {
        if (context == null) {
            throw new NullPointerException("context is null!");
        }
        if (Build.VERSION.SDK_INT < 24) {
            this.f60041a = context.getSharedPreferences(str, 0);
            return;
        }
        Context contextCreateDeviceProtectedStorageContext = context.createDeviceProtectedStorageContext();
        SharedPreferences sharedPreferences = contextCreateDeviceProtectedStorageContext.getSharedPreferences("move_to_de_records", 0);
        if (contextCreateDeviceProtectedStorageContext.moveSharedPreferencesFrom(context, str) & (!sharedPreferences.getBoolean(str, false))) {
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            editorEdit.putBoolean(str, true);
            editorEdit.apply();
        }
        this.f60041a = contextCreateDeviceProtectedStorageContext.getSharedPreferences(str, 0);
    }

    public boolean a(String str) {
        SharedPreferences.Editor editorEdit;
        SharedPreferences sharedPreferences = this.f60041a;
        if (sharedPreferences == null || (editorEdit = sharedPreferences.edit()) == null) {
            return false;
        }
        return editorEdit.remove(str).commit();
    }

    public boolean a(String str, String str2) {
        SharedPreferences.Editor editorEdit;
        SharedPreferences sharedPreferences = this.f60041a;
        if (sharedPreferences == null || (editorEdit = sharedPreferences.edit()) == null) {
            return false;
        }
        return editorEdit.putString(str, str2).commit();
    }
}
