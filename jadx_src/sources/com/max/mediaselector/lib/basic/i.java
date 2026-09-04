package com.max.mediaselector.lib.basic;

import android.content.Context;
import android.content.ContextWrapper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: PictureContextWrapper.java */
/* JADX INFO: loaded from: classes2.dex */
public class i extends ContextWrapper {
    public static ChangeQuickRedirect changeQuickRedirect;

    public i(Context context) {
        super(context);
    }

    public static ContextWrapper a(Context context, int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, new Integer(i10)}, null, changeQuickRedirect, true, bb.c.l.Xj, new Class[]{Context.class, Integer.TYPE}, ContextWrapper.class);
        if (patchProxyResultProxy.isSupported) {
            return (ContextWrapper) patchProxyResultProxy.result;
        }
        if (i10 != -2) {
            pe.c.e(context, i10);
        }
        return new i(context);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, bb.c.l.Yj, new Class[]{String.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        return "audio".equals(str) ? getApplicationContext().getSystemService(str) : super.getSystemService(str);
    }
}
