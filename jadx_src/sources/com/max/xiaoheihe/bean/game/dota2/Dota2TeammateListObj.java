package com.max.xiaoheihe.bean.game.dota2;

import androidx.compose.runtime.internal.o;
import com.max.xiaoheihe.bean.game.gameoverview.Dota2UserObj;
import com.max.xiaoheihe.bean.game.gameoverview.GameOverviewHeaderInfoObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: Dota2TeammateListObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class Dota2TeammateListObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private GameOverviewHeaderInfoObj header_info;

    @e
    private String order_by;

    @e
    private List<Dota2UserObj> user_list;

    public Dota2TeammateListObj(@e String str, @e List<Dota2UserObj> list, @e GameOverviewHeaderInfoObj gameOverviewHeaderInfoObj) {
        this.order_by = str;
        this.user_list = list;
        this.header_info = gameOverviewHeaderInfoObj;
    }

    public static /* synthetic */ Dota2TeammateListObj copy$default(Dota2TeammateListObj dota2TeammateListObj, String str, List list, GameOverviewHeaderInfoObj gameOverviewHeaderInfoObj, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{dota2TeammateListObj, str, list, gameOverviewHeaderInfoObj, new Integer(i10), obj}, null, changeQuickRedirect, true, 15112, new Class[]{Dota2TeammateListObj.class, String.class, List.class, GameOverviewHeaderInfoObj.class, Integer.TYPE, Object.class}, Dota2TeammateListObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (Dota2TeammateListObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            str = dota2TeammateListObj.order_by;
        }
        if ((i10 & 2) != 0) {
            list = dota2TeammateListObj.user_list;
        }
        if ((i10 & 4) != 0) {
            gameOverviewHeaderInfoObj = dota2TeammateListObj.header_info;
        }
        return dota2TeammateListObj.copy(str, list, gameOverviewHeaderInfoObj);
    }

    @e
    public final String component1() {
        return this.order_by;
    }

    @e
    public final List<Dota2UserObj> component2() {
        return this.user_list;
    }

    @e
    public final GameOverviewHeaderInfoObj component3() {
        return this.header_info;
    }

    @d
    public final Dota2TeammateListObj copy(@e String str, @e List<Dota2UserObj> list, @e GameOverviewHeaderInfoObj gameOverviewHeaderInfoObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, list, gameOverviewHeaderInfoObj}, this, changeQuickRedirect, false, 15111, new Class[]{String.class, List.class, GameOverviewHeaderInfoObj.class}, Dota2TeammateListObj.class);
        return patchProxyResultProxy.isSupported ? (Dota2TeammateListObj) patchProxyResultProxy.result : new Dota2TeammateListObj(str, list, gameOverviewHeaderInfoObj);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15115, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Dota2TeammateListObj)) {
            return false;
        }
        Dota2TeammateListObj dota2TeammateListObj = (Dota2TeammateListObj) obj;
        return f0.g(this.order_by, dota2TeammateListObj.order_by) && f0.g(this.user_list, dota2TeammateListObj.user_list) && f0.g(this.header_info, dota2TeammateListObj.header_info);
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
    public final List<Dota2UserObj> getUser_list() {
        return this.user_list;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15114, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.order_by;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<Dota2UserObj> list = this.user_list;
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

    public final void setUser_list(@e List<Dota2UserObj> list) {
        this.user_list = list;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15113, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "Dota2TeammateListObj(order_by=" + this.order_by + ", user_list=" + this.user_list + ", header_info=" + this.header_info + ')';
    }
}
