package com.max.xiaoheihe.module.game.pubg;

import androidx.compose.runtime.internal.o;
import com.max.xiaoheihe.bean.game.pubg.PUBGGameModeFilter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: GameModeFilterHelper.kt */
/* JADX INFO: loaded from: classes11.dex */
@o(parameters = 0)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final a f88153a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f88154b = 0;
    public static ChangeQuickRedirect changeQuickRedirect;

    private a() {
    }

    @dl.e
    public final PUBGGameModeFilter a(@dl.e List<? extends PUBGGameModeFilter> list) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 38132, new Class[]{List.class}, PUBGGameModeFilter.class);
        if (patchProxyResultProxy.isSupported) {
            return (PUBGGameModeFilter) patchProxyResultProxy.result;
        }
        if (list == null) {
            return null;
        }
        for (PUBGGameModeFilter pUBGGameModeFilter : list) {
            if (pUBGGameModeFilter.isCustom_checked()) {
                return pUBGGameModeFilter;
            }
        }
        return null;
    }

    public final void b(@dl.e List<? extends PUBGGameModeFilter> list, @dl.d PUBGGameModeFilter keyDescObj) {
        if (PatchProxy.proxy(new Object[]{list, keyDescObj}, this, changeQuickRedirect, false, 38133, new Class[]{List.class, PUBGGameModeFilter.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(keyDescObj, "keyDescObj");
        if (list != null) {
            for (PUBGGameModeFilter pUBGGameModeFilter : list) {
                pUBGGameModeFilter.setCustom_checked(pUBGGameModeFilter.getKey() != null && f0.g(pUBGGameModeFilter.getKey(), keyDescObj.getKey()));
            }
        }
    }
}
