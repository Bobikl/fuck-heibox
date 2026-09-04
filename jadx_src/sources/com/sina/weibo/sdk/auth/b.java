package com.sina.weibo.sdk.auth;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Map<String, WbAuthListener> f96814e;

    public static final class a {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final b f96815f = new b(0);
    }

    private b() {
        this.f96814e = new HashMap();
    }

    /* synthetic */ b(byte b10) {
        this();
    }

    public static synchronized b b() {
        return a.f96815f;
    }

    public final synchronized WbAuthListener a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.f96814e.get(str);
    }

    public final synchronized void a(String str, WbAuthListener wbAuthListener) {
        if (!TextUtils.isEmpty(str) && wbAuthListener != null) {
            this.f96814e.put(str, wbAuthListener);
        }
    }

    public final synchronized void b(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f96814e.remove(str);
    }
}
