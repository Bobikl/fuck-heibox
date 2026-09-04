package com.max.xiaoheihe.bean.game.gameoverview;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: GameOverviewMatchObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class GameOverviewMatchObj extends BaseGameOverviewObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private MatchObj match_item;

    public GameOverviewMatchObj(@e MatchObj matchObj) {
        this.match_item = matchObj;
    }

    public static /* synthetic */ GameOverviewMatchObj copy$default(GameOverviewMatchObj gameOverviewMatchObj, MatchObj matchObj, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{gameOverviewMatchObj, matchObj, new Integer(i10), obj}, null, changeQuickRedirect, true, 15240, new Class[]{GameOverviewMatchObj.class, MatchObj.class, Integer.TYPE, Object.class}, GameOverviewMatchObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (GameOverviewMatchObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            matchObj = gameOverviewMatchObj.match_item;
        }
        return gameOverviewMatchObj.copy(matchObj);
    }

    @e
    public final MatchObj component1() {
        return this.match_item;
    }

    @d
    public final GameOverviewMatchObj copy(@e MatchObj matchObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{matchObj}, this, changeQuickRedirect, false, 15239, new Class[]{MatchObj.class}, GameOverviewMatchObj.class);
        return patchProxyResultProxy.isSupported ? (GameOverviewMatchObj) patchProxyResultProxy.result : new GameOverviewMatchObj(matchObj);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15243, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        return (obj instanceof GameOverviewMatchObj) && f0.g(this.match_item, ((GameOverviewMatchObj) obj).match_item);
    }

    @e
    public final MatchObj getMatch_item() {
        return this.match_item;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15242, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        MatchObj matchObj = this.match_item;
        if (matchObj == null) {
            return 0;
        }
        return matchObj.hashCode();
    }

    public final void setMatch_item(@e MatchObj matchObj) {
        this.match_item = matchObj;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15241, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "GameOverviewMatchObj(match_item=" + this.match_item + ')';
    }
}
