package com.max.accelworld;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.regex.Pattern;
import kotlin.text.Regex;

/* JADX INFO: compiled from: AccelWorldString.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final String f64935a = "[一-龥]";
    public static ChangeQuickRedirect changeQuickRedirect;

    public static final int a(@dl.e String str) {
        boolean z10 = true;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.b.Kf, new Class[]{String.class}, Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        if (str != null && str.length() != 0) {
            z10 = false;
        }
        if (z10) {
            return 0;
        }
        return str.length() + c(str);
    }

    public static final boolean b(@dl.e String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.b.Mf, new Class[]{String.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        Regex regex = new Regex("[一-龥]");
        if (str != null) {
            return regex.b(str);
        }
        return false;
    }

    public static final int c(@dl.e String str) {
        boolean z10 = true;
        int i10 = 0;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.b.Jf, new Class[]{String.class}, Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        if (str != null && str.length() != 0) {
            z10 = false;
        }
        if (z10) {
            return 0;
        }
        while (Pattern.compile("[一-龥]").matcher(str).find()) {
            i10++;
        }
        return i10;
    }

    private static final boolean d(char c10) {
        return 19968 <= c10 && c10 < 40870;
    }

    @dl.e
    public static final String e(@dl.e String str, int i10) {
        boolean z10 = true;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, new Integer(i10)}, null, changeQuickRedirect, true, bb.c.b.Lf, new Class[]{String.class, Integer.TYPE}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        if (str != null && str.length() != 0) {
            z10 = false;
        }
        if (z10) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        int i11 = 0;
        for (int i12 = 0; i12 < str.length(); i12++) {
            char cCharAt = str.charAt(i12);
            i11 = d(cCharAt) ? i11 + 2 : i11 + 1;
            if (i11 > i10) {
                break;
            }
            sb2.append(cCharAt);
        }
        return sb2.toString();
    }
}
