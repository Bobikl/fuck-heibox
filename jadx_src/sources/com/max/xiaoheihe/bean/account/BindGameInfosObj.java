package com.max.xiaoheihe.bean.account;

import androidx.compose.runtime.internal.o;
import bb.c;
import com.max.heybox.hblog.g;
import com.max.xiaoheihe.bean.game.GameCardObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;

/* JADX INFO: compiled from: BindGameInfosObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@t0({"SMAP\nBindGameInfosObj.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BindGameInfosObj.kt\ncom/max/xiaoheihe/bean/account/BindGameInfosObj\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,43:1\n1855#2,2:44\n*S KotlinDebug\n*F\n+ 1 BindGameInfosObj.kt\ncom/max/xiaoheihe/bean/account/BindGameInfosObj\n*L\n18#1:44,2\n*E\n"})
@o(parameters = 0)
public final class BindGameInfosObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private ArrayList<GameCardObj> cards;

    @e
    private String csgo_bind_protocol;

    @d
    private ArrayList<String> platform_list;

    @e
    private String show_console_game_first;

    @e
    private ArrayList<String> stats_orders;

    public BindGameInfosObj(@e ArrayList<String> arrayList, @e ArrayList<GameCardObj> arrayList2, @d ArrayList<String> platform_list, @e String str, @e String str2) {
        f0.p(platform_list, "platform_list");
        this.stats_orders = arrayList;
        this.cards = arrayList2;
        this.platform_list = platform_list;
        this.show_console_game_first = str;
        this.csgo_bind_protocol = str2;
    }

    public static /* synthetic */ BindGameInfosObj copy$default(BindGameInfosObj bindGameInfosObj, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, String str, String str2, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bindGameInfosObj, arrayList, arrayList2, arrayList3, str, str2, new Integer(i10), obj}, null, changeQuickRedirect, true, c.m.PO, new Class[]{BindGameInfosObj.class, ArrayList.class, ArrayList.class, ArrayList.class, String.class, String.class, Integer.TYPE, Object.class}, BindGameInfosObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (BindGameInfosObj) patchProxyResultProxy.result;
        }
        return bindGameInfosObj.copy((i10 & 1) != 0 ? bindGameInfosObj.stats_orders : arrayList, (i10 & 2) != 0 ? bindGameInfosObj.cards : arrayList2, (i10 & 4) != 0 ? bindGameInfosObj.platform_list : arrayList3, (i10 & 8) != 0 ? bindGameInfosObj.show_console_game_first : str, (i10 & 16) != 0 ? bindGameInfosObj.csgo_bind_protocol : str2);
    }

    @e
    public final ArrayList<String> component1() {
        return this.stats_orders;
    }

    @e
    public final ArrayList<GameCardObj> component2() {
        return this.cards;
    }

    @d
    public final ArrayList<String> component3() {
        return this.platform_list;
    }

    @e
    public final String component4() {
        return this.show_console_game_first;
    }

    @e
    public final String component5() {
        return this.csgo_bind_protocol;
    }

    @d
    public final BindGameInfosObj copy(@e ArrayList<String> arrayList, @e ArrayList<GameCardObj> arrayList2, @d ArrayList<String> platform_list, @e String str, @e String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{arrayList, arrayList2, platform_list, str, str2}, this, changeQuickRedirect, false, c.m.OO, new Class[]{ArrayList.class, ArrayList.class, ArrayList.class, String.class, String.class}, BindGameInfosObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (BindGameInfosObj) patchProxyResultProxy.result;
        }
        f0.p(platform_list, "platform_list");
        return new BindGameInfosObj(arrayList, arrayList2, platform_list, str, str2);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, c.m.RO, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BindGameInfosObj)) {
            return false;
        }
        BindGameInfosObj bindGameInfosObj = (BindGameInfosObj) obj;
        return f0.g(this.stats_orders, bindGameInfosObj.stats_orders) && f0.g(this.cards, bindGameInfosObj.cards) && f0.g(this.platform_list, bindGameInfosObj.platform_list) && f0.g(this.show_console_game_first, bindGameInfosObj.show_console_game_first) && f0.g(this.csgo_bind_protocol, bindGameInfosObj.csgo_bind_protocol);
    }

    @d
    public final ArrayList<GameCardObj> getCardModels() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.MO, new Class[0], ArrayList.class);
        if (patchProxyResultProxy.isSupported) {
            return (ArrayList) patchProxyResultProxy.result;
        }
        ArrayList<GameCardObj> arrayList = new ArrayList<>();
        ArrayList<GameCardObj> arrayList2 = this.cards;
        if (arrayList2 != null) {
            for (GameCardObj gameCardObj : arrayList2) {
                if (gameCardObj.isCanAddAccounts()) {
                    gameCardObj.getAccounts().add(new GameCardChildObj(-99, null, gameCardObj.getGame_type(), null, null, null, null));
                }
                arrayList.add(gameCardObj);
            }
        }
        g.f74531b.q("BindGameInfosObj, cardModels, ret = " + arrayList);
        return arrayList;
    }

    @e
    public final ArrayList<GameCardObj> getCards() {
        return this.cards;
    }

    @e
    public final String getCsgo_bind_protocol() {
        return this.csgo_bind_protocol;
    }

    @d
    public final ArrayList<String> getPlatform_list() {
        return this.platform_list;
    }

    @e
    public final String getShow_console_game_first() {
        return this.show_console_game_first;
    }

    @e
    public final ArrayList<String> getStats_orders() {
        return this.stats_orders;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.QO, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        ArrayList<String> arrayList = this.stats_orders;
        int iHashCode = (arrayList == null ? 0 : arrayList.hashCode()) * 31;
        ArrayList<GameCardObj> arrayList2 = this.cards;
        int iHashCode2 = (((iHashCode + (arrayList2 == null ? 0 : arrayList2.hashCode())) * 31) + this.platform_list.hashCode()) * 31;
        String str = this.show_console_game_first;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.csgo_bind_protocol;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setCards(@e ArrayList<GameCardObj> arrayList) {
        this.cards = arrayList;
    }

    public final void setCsgo_bind_protocol(@e String str) {
        this.csgo_bind_protocol = str;
    }

    public final void setPlatform_list(@d ArrayList<String> arrayList) {
        if (PatchProxy.proxy(new Object[]{arrayList}, this, changeQuickRedirect, false, c.m.LO, new Class[]{ArrayList.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(arrayList, "<set-?>");
        this.platform_list = arrayList;
    }

    public final void setShow_console_game_first(@e String str) {
        this.show_console_game_first = str;
    }

    public final void setStats_orders(@e ArrayList<String> arrayList) {
        this.stats_orders = arrayList;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.NO, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "BindGameInfosObj(stats_orders=" + this.stats_orders + ", cards=" + this.cards + ", platform_list=" + this.platform_list + ", show_console_game_first=" + this.show_console_game_first + ')';
    }
}
