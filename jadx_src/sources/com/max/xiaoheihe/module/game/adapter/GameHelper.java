package com.max.xiaoheihe.module.game.adapter;

import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.GameObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.LazyThreadSafetyMode;

/* JADX INFO: compiled from: GameHelper.kt */
/* JADX INFO: loaded from: classes11.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class GameHelper {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f85624b = 0;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final a f85623a = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private static final kotlin.z<GameHelper> f85625c = kotlin.b0.b(LazyThreadSafetyMode.SYNCHRONIZED, new yh.a<GameHelper>() { // from class: com.max.xiaoheihe.module.game.adapter.GameHelper$Companion$instance$2
        public static ChangeQuickRedirect changeQuickRedirect;

        @dl.d
        public final GameHelper a() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35630, new Class[0], GameHelper.class);
            return patchProxyResultProxy.isSupported ? (GameHelper) patchProxyResultProxy.result : new GameHelper();
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.max.xiaoheihe.module.game.adapter.GameHelper, java.lang.Object] */
        @Override // yh.a
        public /* bridge */ /* synthetic */ GameHelper invoke() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35631, new Class[0], Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a();
        }
    });

    /* JADX INFO: compiled from: GameHelper.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        @xh.m
        public static /* synthetic */ void b() {
        }

        @dl.d
        public final GameHelper a() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35629, new Class[0], GameHelper.class);
            return patchProxyResultProxy.isSupported ? (GameHelper) patchProxyResultProxy.result : (GameHelper) GameHelper.f85625c.getValue();
        }
    }

    @dl.d
    public static final GameHelper c() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 35628, new Class[0], GameHelper.class);
        return patchProxyResultProxy.isSupported ? (GameHelper) patchProxyResultProxy.result : f85623a.a();
    }

    public final int b(@dl.d GameObj data) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{data}, this, changeQuickRedirect, false, 35627, new Class[]{GameObj.class}, Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        kotlin.jvm.internal.f0.p(data, "data");
        return kotlin.jvm.internal.f0.g(data.getGame_type(), "mobile") ? R.layout.component_game_game_list_mobile : R.layout.component_game_game_list_normal;
    }
}
