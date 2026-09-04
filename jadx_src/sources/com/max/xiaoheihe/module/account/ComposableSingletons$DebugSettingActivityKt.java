package com.max.xiaoheihe.module.account;

import androidx.compose.material3.MaterialThemeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposerKt;
import com.google.android.exoplayer2.audio.v0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.b2;

/* JADX INFO: compiled from: DebugSettingActivity.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class ComposableSingletons$DebugSettingActivityKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final ComposableSingletons$DebugSettingActivityKt f77586a = new ComposableSingletons$DebugSettingActivityKt();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    public static yh.p<androidx.compose.runtime.p, Integer, b2> f77587b = androidx.compose.runtime.internal.b.c(-770367084, false, new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: com.max.xiaoheihe.module.account.ComposableSingletons$DebugSettingActivityKt$lambda-1$1
        public static ChangeQuickRedirect changeQuickRedirect;

        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
        @androidx.compose.runtime.h
        public final void a(@dl.e androidx.compose.runtime.p pVar, int i10) {
            if (PatchProxy.proxy(new Object[]{pVar, new Integer(i10)}, this, changeQuickRedirect, false, 22616, new Class[]{androidx.compose.runtime.p.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            if ((i10 & 11) == 2 && pVar.b()) {
                pVar.l();
                return;
            }
            if (ComposerKt.g0()) {
                ComposerKt.w0(-770367084, i10, -1, "com.max.xiaoheihe.module.account.ComposableSingletons$DebugSettingActivityKt.lambda-1.<anonymous> (DebugSettingActivity.kt:1087)");
            }
            TextKt.c("Hello Compose!", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, pVar, 6, 0, v0.f44322j);
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
        }

        /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Object, kotlin.b2] */
        @Override // yh.p
        public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar, Integer num) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{pVar, num}, this, changeQuickRedirect, false, 22617, new Class[]{Object.class, Object.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            a(pVar, num.intValue());
            return b2.f124493a;
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    public static yh.p<androidx.compose.runtime.p, Integer, b2> f77588c = androidx.compose.runtime.internal.b.c(-606469656, false, new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: com.max.xiaoheihe.module.account.ComposableSingletons$DebugSettingActivityKt$lambda-2$1
        public static ChangeQuickRedirect changeQuickRedirect;

        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
        @androidx.compose.runtime.h
        public final void a(@dl.e androidx.compose.runtime.p pVar, int i10) {
            if (PatchProxy.proxy(new Object[]{pVar, new Integer(i10)}, this, changeQuickRedirect, false, 22618, new Class[]{androidx.compose.runtime.p.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            if ((i10 & 11) == 2 && pVar.b()) {
                pVar.l();
                return;
            }
            if (ComposerKt.g0()) {
                ComposerKt.w0(-606469656, i10, -1, "com.max.xiaoheihe.module.account.ComposableSingletons$DebugSettingActivityKt.lambda-2.<anonymous> (DebugSettingActivity.kt:1085)");
            }
            MaterialThemeKt.a(null, null, null, ComposableSingletons$DebugSettingActivityKt.f77586a.a(), pVar, bb.c.d.f31193dj, 7);
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
        }

        /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Object, kotlin.b2] */
        @Override // yh.p
        public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar, Integer num) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{pVar, num}, this, changeQuickRedirect, false, 22619, new Class[]{Object.class, Object.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            a(pVar, num.intValue());
            return b2.f124493a;
        }
    });
    public static ChangeQuickRedirect changeQuickRedirect;

    @dl.d
    public final yh.p<androidx.compose.runtime.p, Integer, b2> a() {
        return f77587b;
    }

    @dl.d
    public final yh.p<androidx.compose.runtime.p, Integer, b2> b() {
        return f77588c;
    }
}
