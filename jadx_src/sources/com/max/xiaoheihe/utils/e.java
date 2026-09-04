package com.max.xiaoheihe.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.Arrays;
import kotlin.jvm.internal.v0;

/* JADX INFO: compiled from: ConvertHelper.kt */
/* JADX INFO: loaded from: classes13.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final e f95366a = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f95367b = 0;
    public static ChangeQuickRedirect changeQuickRedirect;

    private e() {
    }

    @dl.d
    public final String a(int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 48653, new Class[]{Integer.TYPE}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        v0 v0Var = v0.f124986a;
        String str = String.format("#%06X", Arrays.copyOf(new Object[]{Integer.valueOf(i10)}, 1));
        kotlin.jvm.internal.f0.o(str, "format(format, *args)");
        return str;
    }
}
