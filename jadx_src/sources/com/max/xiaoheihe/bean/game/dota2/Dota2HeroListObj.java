package com.max.xiaoheihe.bean.game.dota2;

import androidx.compose.runtime.internal.o;
import com.max.xiaoheihe.bean.game.gameoverview.GameOverviewHeaderInfoObj;
import com.max.xiaoheihe.bean.game.gameoverview.GameOverviewHeroObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: Dota2HeroListObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class Dota2HeroListObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private GameOverviewHeaderInfoObj header_info;

    @e
    private String order_by;

    @e
    private List<GameOverviewHeroObj> status_list;

    public Dota2HeroListObj(@e String str, @e List<GameOverviewHeroObj> list, @e GameOverviewHeaderInfoObj gameOverviewHeaderInfoObj) {
        this.order_by = str;
        this.status_list = list;
        this.header_info = gameOverviewHeaderInfoObj;
    }

    public static /* synthetic */ Dota2HeroListObj copy$default(Dota2HeroListObj dota2HeroListObj, String str, List list, GameOverviewHeaderInfoObj gameOverviewHeaderInfoObj, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{dota2HeroListObj, str, list, gameOverviewHeaderInfoObj, new Integer(i10), obj}, null, changeQuickRedirect, true, 15072, new Class[]{Dota2HeroListObj.class, String.class, List.class, GameOverviewHeaderInfoObj.class, Integer.TYPE, Object.class}, Dota2HeroListObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (Dota2HeroListObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            str = dota2HeroListObj.order_by;
        }
        if ((i10 & 2) != 0) {
            list = dota2HeroListObj.status_list;
        }
        if ((i10 & 4) != 0) {
            gameOverviewHeaderInfoObj = dota2HeroListObj.header_info;
        }
        return dota2HeroListObj.copy(str, list, gameOverviewHeaderInfoObj);
    }

    @e
    public final String component1() {
        return this.order_by;
    }

    @e
    public final List<GameOverviewHeroObj> component2() {
        return this.status_list;
    }

    @e
    public final GameOverviewHeaderInfoObj component3() {
        return this.header_info;
    }

    @d
    public final Dota2HeroListObj copy(@e String str, @e List<GameOverviewHeroObj> list, @e GameOverviewHeaderInfoObj gameOverviewHeaderInfoObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, list, gameOverviewHeaderInfoObj}, this, changeQuickRedirect, false, 15071, new Class[]{String.class, List.class, GameOverviewHeaderInfoObj.class}, Dota2HeroListObj.class);
        return patchProxyResultProxy.isSupported ? (Dota2HeroListObj) patchProxyResultProxy.result : new Dota2HeroListObj(str, list, gameOverviewHeaderInfoObj);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15075, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Dota2HeroListObj)) {
            return false;
        }
        Dota2HeroListObj dota2HeroListObj = (Dota2HeroListObj) obj;
        return f0.g(this.order_by, dota2HeroListObj.order_by) && f0.g(this.status_list, dota2HeroListObj.status_list) && f0.g(this.header_info, dota2HeroListObj.header_info);
    }

    @e
    public final GameOverviewHeaderInfoObj getHeader_info() {
        return this.header_info;
    }

    @e
    public final String getOrder_by() {
        return this.order_by;
    }

    @e
    public final List<GameOverviewHeroObj> getStatus_list() {
        return this.status_list;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15074, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.order_by;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<GameOverviewHeroObj> list = this.status_list;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        GameOverviewHeaderInfoObj gameOverviewHeaderInfoObj = this.header_info;
        return iHashCode2 + (gameOverviewHeaderInfoObj != null ? gameOverviewHeaderInfoObj.hashCode() : 0);
    }

    public final void setHeader_info(@e GameOverviewHeaderInfoObj gameOverviewHeaderInfoObj) {
        this.header_info = gameOverviewHeaderInfoObj;
    }

    public final void setOrder_by(@e String str) {
        this.order_by = str;
    }

    public final void setStatus_list(@e List<GameOverviewHeroObj> list) {
        this.status_list = list;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15073, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "Dota2HeroListObj(order_by=" + this.order_by + ", status_list=" + this.status_list + ", header_info=" + this.header_info + ')';
    }
}
