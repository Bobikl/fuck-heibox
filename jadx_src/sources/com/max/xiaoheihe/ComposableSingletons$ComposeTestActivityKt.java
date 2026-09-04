package com.max.xiaoheihe;

import androidx.compose.runtime.ComposerKt;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.b2;
import yh.p;

/* JADX INFO: compiled from: ComposeTestActivity.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$ComposeTestActivityKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final ComposableSingletons$ComposeTestActivityKt f76129a = new ComposableSingletons$ComposeTestActivityKt();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    public static p<androidx.compose.runtime.p, Integer, b2> f76130b = androidx.compose.runtime.internal.b.c(2092463999, false, new p<androidx.compose.runtime.p, Integer, b2>() { // from class: com.max.xiaoheihe.ComposableSingletons$ComposeTestActivityKt$lambda-1$1
        public static ChangeQuickRedirect changeQuickRedirect;

        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
        @androidx.compose.runtime.h
        public final void a(@dl.e androidx.compose.runtime.p pVar, int i10) {
            if (PatchProxy.proxy(new Object[]{pVar, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.m.Yq, new Class[]{androidx.compose.runtime.p.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            if ((i10 & 11) == 2 && pVar.b()) {
                pVar.l();
                return;
            }
            if (ComposerKt.g0()) {
                ComposerKt.w0(2092463999, i10, -1, "com.max.xiaoheihe.ComposableSingletons$ComposeTestActivityKt.lambda-1.<anonymous> (ComposeTestActivity.kt:32)");
            }
            ComposeTestActivityKt.a(pVar, 0);
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
        }

        /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Object, kotlin.b2] */
        @Override // yh.p
        public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar, Integer num) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{pVar, num}, this, changeQuickRedirect, false, bb.c.m.Zq, new Class[]{Object.class, Object.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            a(pVar, num.intValue());
            return b2.f124493a;
        }
    });
    public static ChangeQuickRedirect changeQuickRedirect;

    @dl.d
    public final p<androidx.compose.runtime.p, Integer, b2> a() {
        return f76130b;
    }
}
