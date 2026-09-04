package com.igexin.push.core.d;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public class r implements c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String f63727b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Class f63728a = null;

    @Override // com.igexin.push.core.d.c
    @SuppressLint({"PrivateApi"})
    public boolean a(Context context) {
        try {
            this.f63728a = Class.forName("com.android.id.impl.IdProviderImpl");
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // com.igexin.push.core.d.c
    public String b(Context context) {
        if (TextUtils.isEmpty(f63727b)) {
            try {
                f63727b = String.valueOf(this.f63728a.getMethod("getOAID", Context.class).invoke(this.f63728a.newInstance(), context));
            } catch (Throwable unused) {
                f63727b = null;
            }
        }
        return f63727b;
    }

    @Override // com.igexin.push.core.d.c
    public boolean c(Context context) {
        return true;
    }
}
