package com.xiaomi.push;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes4.dex */
public class ce {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile ce f106904a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private Context f230a;

    private ce(Context context) {
        this.f230a = context;
    }

    public static ce a(Context context) {
        if (f106904a == null) {
            synchronized (ce.class) {
                if (f106904a == null) {
                    f106904a = new ce(context);
                }
            }
        }
        return f106904a;
    }

    public synchronized long a(String str, String str2, long j10) {
        try {
        } catch (Throwable unused) {
            return j10;
        }
        return this.f230a.getSharedPreferences(str, 4).getLong(str2, j10);
    }

    public synchronized String a(String str, String str2, String str3) {
        try {
        } catch (Throwable unused) {
            return str3;
        }
        return this.f230a.getSharedPreferences(str, 4).getString(str2, str3);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public synchronized void m220a(String str, String str2, long j10) {
        SharedPreferences.Editor editorEdit = this.f230a.getSharedPreferences(str, 4).edit();
        editorEdit.putLong(str2, j10);
        editorEdit.commit();
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public synchronized void m221a(String str, String str2, String str3) {
        SharedPreferences.Editor editorEdit = this.f230a.getSharedPreferences(str, 4).edit();
        editorEdit.putString(str2, str3);
        editorEdit.commit();
    }
}
