package com.max.mediaselector.lib.basic;

import android.content.Context;
import android.net.Uri;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: compiled from: PictureContentResolver.java */
/* JADX INFO: loaded from: classes2.dex */
public final class h {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static InputStream a(Context context, Uri uri) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, uri}, null, changeQuickRedirect, true, bb.c.l.Vj, new Class[]{Context.class, Uri.class}, InputStream.class);
        if (patchProxyResultProxy.isSupported) {
            return (InputStream) patchProxyResultProxy.result;
        }
        try {
            return context.getContentResolver().openInputStream(uri);
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public static OutputStream b(Context context, Uri uri) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, uri}, null, changeQuickRedirect, true, bb.c.l.Wj, new Class[]{Context.class, Uri.class}, OutputStream.class);
        if (patchProxyResultProxy.isSupported) {
            return (OutputStream) patchProxyResultProxy.result;
        }
        try {
            return context.getContentResolver().openOutputStream(uri);
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }
}
