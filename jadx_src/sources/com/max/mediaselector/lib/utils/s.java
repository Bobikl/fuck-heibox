package com.max.mediaselector.lib.utils;

import android.content.Context;
import android.graphics.ColorFilter;
import android.text.TextUtils;
import androidx.core.graphics.BlendModeCompat;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: StyleUtils.java */
/* JADX INFO: loaded from: classes2.dex */
public class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f75563a = 0;
    public static ChangeQuickRedirect changeQuickRedirect;

    public static boolean a(int[] iArr) {
        return iArr != null && iArr.length > 0;
    }

    public static boolean b(int i10) {
        return i10 > 0;
    }

    public static boolean c(int i10) {
        return i10 != 0;
    }

    public static boolean d(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.m.N9, new Class[]{String.class}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : Pattern.compile("\\([^)]*\\)").matcher(str).find();
    }

    public static boolean e(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.m.O9, new Class[]{String.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        int i10 = 0;
        while (Pattern.compile("%[^%]*\\d").matcher(str).find()) {
            i10++;
        }
        return i10 >= 2;
    }

    public static boolean f(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.m.M9, new Class[]{String.class}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : !TextUtils.isEmpty(str);
    }

    public static ColorFilter g(Context context, int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, new Integer(i10)}, null, changeQuickRedirect, true, bb.c.m.P9, new Class[]{Context.class, Integer.TYPE}, ColorFilter.class);
        return patchProxyResultProxy.isSupported ? (ColorFilter) patchProxyResultProxy.result : androidx.core.graphics.e.a(androidx.core.content.d.f(context, i10), BlendModeCompat.SRC_ATOP);
    }
}
