package com.max.xiaoheihe.module.game.adapter.viewholderbinder.gamelist;

import androidx.compose.runtime.internal.o;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: GameListVHBFactory.kt */
/* JADX INFO: loaded from: classes11.dex */
@o(parameters = 0)
public final class c implements cb.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final c f86384a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f86385b = 0;
    public static ChangeQuickRedirect changeQuickRedirect;

    private c() {
    }

    @dl.d
    public final e a(@dl.d d param, int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{param, new Integer(i10)}, this, changeQuickRedirect, false, 36220, new Class[]{d.class, Integer.TYPE}, e.class);
        if (patchProxyResultProxy.isSupported) {
            return (e) patchProxyResultProxy.result;
        }
        f0.p(param, "param");
        return i10 == R.layout.component_game_game_list_mobile ? new a(param) : new b(param);
    }
}
