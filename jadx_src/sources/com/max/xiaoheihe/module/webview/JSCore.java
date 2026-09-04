package com.max.xiaoheihe.module.webview;

import android.util.Log;
import com.eclipsesource.v8.V8;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: loaded from: classes12.dex */
public class JSCore {
    public static final String TAG = "JSCore";
    public static ChangeQuickRedirect changeQuickRedirect;

    public void debugLog(Object obj) {
        if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 46916, new Class[]{Object.class}, Void.TYPE).isSupported) {
            return;
        }
        try {
            String strQ = obj instanceof String ? (String) obj : JsCoreManager.q(obj);
            V8 v8M = JsCoreManager.l().m();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("JSCore  debugLog ");
            sb2.append(v8M != null ? Integer.valueOf(v8M.hashCode()) : "hashCode = null");
            sb2.append("  ");
            sb2.append(strQ);
            com.max.heybox.hblog.g.x(sb2.toString());
        } catch (Throwable th2) {
            com.max.heybox.hblog.g.G("JSCore  debugLog : " + th2.getMessage());
        }
    }

    public void fail(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 46913, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        Log.d(TAG, "fail " + str);
    }

    public void invalidate() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46915, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        V8 v8M = JsCoreManager.l().m();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("JSCore  invalidate  ");
        sb2.append(v8M != null ? Integer.valueOf(v8M.hashCode()) : "hashCode = null");
        com.max.heybox.hblog.g.x(sb2.toString());
        JsCoreManager.o();
    }

    public String postMessage(Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 46914, new Class[]{Object.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        try {
            String strQ = obj instanceof String ? (String) obj : JsCoreManager.q(obj);
            com.max.heybox.hblog.g.x("JSCore  postMessage " + strQ);
            return com.max.xiaoheihe.utils.l0.f95687b.C(com.max.hbutils.utils.e.b().a(), null, com.max.xiaoheihe.utils.l0.e0(strQ), null);
        } catch (Throwable th2) {
            com.max.heybox.hblog.g.G("JSCore  postMessage " + th2.getMessage());
            return null;
        }
    }

    public void success(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 46912, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        Log.d(TAG, "success " + str);
    }
}
