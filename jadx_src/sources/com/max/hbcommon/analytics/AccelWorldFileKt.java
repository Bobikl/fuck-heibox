package com.max.hbcommon.analytics;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlinx.coroutines.e1;
import kotlinx.coroutines.r0;

/* JADX INFO: compiled from: AccelWorldFile.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class AccelWorldFileKt {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static final void a(@dl.e n.a aVar, long j10, @dl.e String str, @dl.e String str2) {
        if (PatchProxy.proxy(new Object[]{aVar, new Long(j10), str, str2}, null, changeQuickRedirect, true, bb.c.b.gr, new Class[]{n.a.class, Long.TYPE, String.class, String.class}, Void.TYPE).isSupported || str2 == null || aVar == null) {
            return;
        }
        kotlinx.coroutines.k.f(r0.a(e1.c()), null, null, new AccelWorldFileKt$fastRefreshFile$1$1$1(str2, aVar, j10, str, null), 3, null);
    }
}
