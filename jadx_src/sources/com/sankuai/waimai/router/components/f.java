package com.sankuai.waimai.router.components;

import android.util.Log;

/* JADX INFO: compiled from: DefaultLogger.java */
/* JADX INFO: loaded from: classes8.dex */
public class f implements com.sankuai.waimai.router.core.c.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f96465a = new f();

    @Override // com.sankuai.waimai.router.core.c.a
    public void a(String str, Object... objArr) {
        if (com.sankuai.waimai.router.core.c.h()) {
            Log.i("WMRouter", i(str, objArr));
        }
    }

    @Override // com.sankuai.waimai.router.core.c.a
    public void b(String str, Object... objArr) {
        if (com.sankuai.waimai.router.core.c.h()) {
            Log.d("WMRouter", i(str, objArr));
        }
    }

    @Override // com.sankuai.waimai.router.core.c.a
    public void c(String str, Object... objArr) {
        if (com.sankuai.waimai.router.core.c.h()) {
            Log.e("WMRouter", i(str, objArr));
        }
    }

    @Override // com.sankuai.waimai.router.core.c.a
    public void d(String str, Object... objArr) {
        if (com.sankuai.waimai.router.core.c.h()) {
            Log.w("WMRouter", i(str, objArr));
        }
    }

    @Override // com.sankuai.waimai.router.core.c.a
    public void e(String str, Object... objArr) {
        if (com.sankuai.waimai.router.core.c.h()) {
            Log.e("WMRouter", i(str, objArr));
        }
        j(new RuntimeException(i(str, objArr)));
    }

    @Override // com.sankuai.waimai.router.core.c.a
    public void f(Throwable th2) {
        if (com.sankuai.waimai.router.core.c.h()) {
            Log.w("WMRouter", th2);
        }
    }

    @Override // com.sankuai.waimai.router.core.c.a
    public void g(Throwable th2) {
        if (com.sankuai.waimai.router.core.c.h()) {
            Log.e("WMRouter", "", th2);
        }
        j(th2);
    }

    @Override // com.sankuai.waimai.router.core.c.a
    public void h(Throwable th2) {
        if (com.sankuai.waimai.router.core.c.h()) {
            Log.e("WMRouter", "", th2);
        }
    }

    protected String i(String str, Object... objArr) {
        if (objArr != null && objArr.length > 0) {
            try {
                return String.format(str, objArr);
            } catch (Throwable th2) {
                h(th2);
            }
        }
        return str;
    }

    protected void j(Throwable th2) {
        if (com.sankuai.waimai.router.core.c.g()) {
            if (!(th2 instanceof RuntimeException)) {
                throw new RuntimeException(th2);
            }
            throw ((RuntimeException) th2);
        }
    }
}
