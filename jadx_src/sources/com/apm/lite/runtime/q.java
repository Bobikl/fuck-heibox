package com.apm.lite.runtime;

import android.content.Context;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes6.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f40219a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f40220b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f40221c = -1;

    public q(Context context) {
    }

    public String a() {
        if (!TextUtils.isEmpty(this.f40219a) && !"0".equals(this.f40219a)) {
            return this.f40219a;
        }
        if (!TextUtils.isEmpty(this.f40220b) && !"0".equals(this.f40220b)) {
            return this.f40220b;
        }
        String strF = com.apm.lite.e.a().f();
        this.f40219a = strF;
        if (!TextUtils.isEmpty(strF) && !"0".equals(this.f40219a)) {
            return this.f40219a;
        }
        String strG = p.b().g();
        this.f40220b = strG;
        return strG;
    }

    public void b(String str) {
        this.f40219a = str;
        p.b().i(str);
    }

    public boolean c() {
        return this.f40219a != null;
    }
}
