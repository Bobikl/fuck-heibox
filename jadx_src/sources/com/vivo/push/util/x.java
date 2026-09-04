package com.vivo.push.util;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: compiled from: SpCache.java */
/* JADX INFO: loaded from: classes4.dex */
public final class x implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f106696a = "SpCache";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String f106697b = "com.vivo.push.cache";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private SharedPreferences f106698c;

    @Override // com.vivo.push.util.d
    public final String a(String str, String str2) {
        String string = this.f106698c.getString(str, str2);
        p.d(f106696a, "getString " + str + " is " + string);
        return string;
    }

    public final void a() {
        SharedPreferences.Editor editorEdit = this.f106698c.edit();
        if (editorEdit != null) {
            editorEdit.clear();
            b.a(editorEdit);
        }
        p.d(f106696a, "system cache is cleared");
    }

    @Override // com.vivo.push.util.d
    public final boolean a(Context context) {
        if (this.f106698c != null) {
            return true;
        }
        this.f106698c = context.getSharedPreferences(f106697b, 0);
        return true;
    }

    @Override // com.vivo.push.util.d
    public final void b(String str, String str2) {
        SharedPreferences.Editor editorEdit = this.f106698c.edit();
        if (editorEdit == null) {
            p.b(f106696a, "putString error by ".concat(String.valueOf(str)));
            return;
        }
        editorEdit.putString(str, str2);
        b.a(editorEdit);
        p.d(f106696a, "putString by ".concat(String.valueOf(str)));
    }
}
