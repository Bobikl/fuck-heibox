package com.max.xiaoheihe.bean;

import androidx.compose.runtime.internal.o;
import bb.c;
import com.max.xiaoheihe.bean.game.GameObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: SearchGameListObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class SearchGameListObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private List<GameObj> game_list;

    public SearchGameListObj(@e List<GameObj> list) {
        this.game_list = list;
    }

    public static /* synthetic */ SearchGameListObj copy$default(SearchGameListObj searchGameListObj, List list, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{searchGameListObj, list, new Integer(i10), obj}, null, changeQuickRedirect, true, c.m.MM, new Class[]{SearchGameListObj.class, List.class, Integer.TYPE, Object.class}, SearchGameListObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (SearchGameListObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            list = searchGameListObj.game_list;
        }
        return searchGameListObj.copy(list);
    }

    @e
    public final List<GameObj> component1() {
        return this.game_list;
    }

    @d
    public final SearchGameListObj copy(@e List<GameObj> list) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, c.m.LM, new Class[]{List.class}, SearchGameListObj.class);
        return patchProxyResultProxy.isSupported ? (SearchGameListObj) patchProxyResultProxy.result : new SearchGameListObj(list);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, c.m.PM, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        return (obj instanceof SearchGameListObj) && f0.g(this.game_list, ((SearchGameListObj) obj).game_list);
    }

    @e
    public final List<GameObj> getGame_list() {
        return this.game_list;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.OM, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        List<GameObj> list = this.game_list;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final void setGame_list(@e List<GameObj> list) {
        this.game_list = list;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.NM, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "SearchGameListObj(game_list=" + this.game_list + ')';
    }
}
