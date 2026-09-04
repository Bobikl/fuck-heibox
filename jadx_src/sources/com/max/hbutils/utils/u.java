package com.max.hbutils.utils;

import android.app.Activity;
import android.app.UiModeManager;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.util.Log;
import androidx.core.app.l2;
import com.bytedance.bpea.entry.common.DataType;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: SystemServiceUtil.java */
/* JADX INFO: loaded from: classes13.dex */
public class u {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static void a(Context context, CharSequence charSequence) {
        if (PatchProxy.proxy(new Object[]{context, charSequence}, null, changeQuickRedirect, true, bb.c.k.rs, new Class[]{Context.class, CharSequence.class}, Void.TYPE).isSupported) {
            return;
        }
        ((ClipboardManager) context.getSystemService(DataType.CLIPBOARD)).setPrimaryClip(ClipData.newPlainText("Label", charSequence));
    }

    public static boolean b(Context context) {
        Activity activityA;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, bb.c.k.ts, new Class[]{Context.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (!(context instanceof Activity) && (activityA = e.b().a()) != null) {
            context = activityA;
        }
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }

    public static boolean c(Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, bb.c.k.ss, new Class[]{Context.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        try {
            return l2.p(context).a();
        } catch (Exception e10) {
            e10.printStackTrace();
            return false;
        }
    }

    public static boolean d(Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, bb.c.k.us, new Class[]{Context.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        UiModeManager uiModeManager = (UiModeManager) context.getSystemService("uimode");
        if (uiModeManager.getNightMode() == 2) {
            Log.d("isSystemDark", "system night");
        } else {
            Log.d("isSystemDark", "system not night");
        }
        return uiModeManager.getNightMode() == 2;
    }
}
