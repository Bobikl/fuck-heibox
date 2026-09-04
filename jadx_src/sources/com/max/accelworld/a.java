package com.max.accelworld;

import android.graphics.Color;
import androidx.annotation.l;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.Locale;
import kotlin.jvm.internal.f0;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: compiled from: AccelWorldColor.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class a {
    public static ChangeQuickRedirect changeQuickRedirect;

    @dl.d
    public static final String a(@l int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, null, changeQuickRedirect, true, bb.c.b.f30613ef, new Class[]{Integer.TYPE}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append('#');
        String hexString = Integer.toHexString(i10);
        f0.o(hexString, "toHexString(...)");
        String upperCase = hexString.toUpperCase(Locale.ROOT);
        f0.o(upperCase, "toUpperCase(...)");
        sb2.append(StringsKt__StringsKt.U3(upperCase, 8, '0'));
        return sb2.toString();
    }

    @l
    public static final int b(int i10, float f10) {
        Object[] objArr = {new Integer(i10), new Float(f10)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.b.f30659gf, new Class[]{cls, Float.TYPE}, cls);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : Color.argb((int) (255 * f10), Color.red(i10), Color.green(i10), Color.blue(i10));
    }

    @dl.d
    public static final String c(int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, null, changeQuickRedirect, true, bb.c.b.f30636ff, new Class[]{Integer.TYPE}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append('#');
        String hexString = Integer.toHexString(i10);
        f0.o(hexString, "toHexString(...)");
        String upperCase = hexString.toUpperCase(Locale.ROOT);
        f0.o(upperCase, "toUpperCase(...)");
        sb2.append(StringsKt__StringsKt.U3(upperCase, 8, '0'));
        return sb2.toString();
    }
}
