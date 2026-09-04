package com.max.accelworld;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.text.DecimalFormat;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: AccelWorldNumber.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class e {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static final float a(float f10) {
        Object[] objArr = {new Float(f10)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.b.Cf, new Class[]{cls}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Float) patchProxyResultProxy.result).floatValue();
        }
        try {
            DecimalFormat decimalFormat = new DecimalFormat("#.#");
            decimalFormat.setMaximumFractionDigits(1);
            String str = decimalFormat.format(Float.valueOf(f10));
            f0.o(str, "format(...)");
            return Float.parseFloat(str);
        } catch (Throwable unused) {
            return 0.0f;
        }
    }
}
