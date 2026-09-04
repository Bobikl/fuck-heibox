package com.max.xiaoheihe.module.search.pagev2;

import androidx.compose.runtime.internal.o;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: SearchTypeStateManager.kt */
/* JADX INFO: loaded from: classes12.dex */
@o(parameters = 0)
public final class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f91736b = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private SearchType f91737a = SearchType.UNKNOWN;

    private final SearchType c(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 43284, new Class[]{String.class}, SearchType.class);
        if (patchProxyResultProxy.isSupported) {
            return (SearchType) patchProxyResultProxy.result;
        }
        if (f0.g(str, com.max.xiaoheihe.utils.d.n0(R.string.general))) {
            return SearchType.GENERAL;
        }
        if (f0.g(str, com.max.xiaoheihe.utils.d.n0(R.string.content))) {
            return SearchType.LINK;
        }
        if (f0.g(str, com.max.xiaoheihe.utils.d.n0(R.string.wiki))) {
            return SearchType.WIKI;
        }
        if (f0.g(str, com.max.xiaoheihe.utils.d.n0(R.string.user))) {
            return SearchType.USER;
        }
        if (f0.g(str, com.max.xiaoheihe.utils.d.n0(R.string.hashtag))) {
            return SearchType.HASHTAG;
        }
        if (f0.g(str, com.max.xiaoheihe.utils.d.n0(R.string.goods))) {
            return SearchType.MALL;
        }
        if (f0.g(str, com.max.xiaoheihe.utils.d.n0(R.string.game))) {
            return SearchType.GAME;
        }
        if (f0.g(str, com.max.xiaoheihe.utils.d.n0(R.string.mini_program))) {
            return SearchType.MINI_PROGRAM;
        }
        if (f0.g(str, com.max.xiaoheihe.utils.d.n0(R.string.steam_id))) {
            return SearchType.STEAM_USER;
        }
        return f0.g(str, com.max.xiaoheihe.utils.d.n0(R.string.dota2_match)) ? SearchType.DOTA2_MATCH : SearchType.UNKNOWN;
    }

    public final void a(@dl.d String key) {
        if (PatchProxy.proxy(new Object[]{key}, this, changeQuickRedirect, false, 43283, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(key, "key");
        this.f91737a = c(key);
    }

    @dl.d
    public final SearchType b() {
        return this.f91737a;
    }
}
