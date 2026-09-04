package com.max.xiaoheihe.bean.game.dota2;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: Dota2BanPickObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class Dota2BanPickObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private List<Dota2BanPickDataObj> dire_ban;

    @e
    private List<Dota2BanPickDataObj> dire_pick;

    @d
    private Dota2TeamObj dire_team_info;

    @e
    private List<Dota2BanPickDataObj> radiant_ban;

    @e
    private List<Dota2BanPickDataObj> radiant_pick;

    @d
    private Dota2TeamObj radiant_team_info;

    @e
    private String state;

    public Dota2BanPickObj(@e List<Dota2BanPickDataObj> list, @e List<Dota2BanPickDataObj> list2, @e List<Dota2BanPickDataObj> list3, @e List<Dota2BanPickDataObj> list4, @e String str, @d Dota2TeamObj radiant_team_info, @d Dota2TeamObj dire_team_info) {
        f0.p(radiant_team_info, "radiant_team_info");
        f0.p(dire_team_info, "dire_team_info");
        this.radiant_pick = list;
        this.radiant_ban = list2;
        this.dire_pick = list3;
        this.dire_ban = list4;
        this.state = str;
        this.radiant_team_info = radiant_team_info;
        this.dire_team_info = dire_team_info;
    }

    public static /* synthetic */ Dota2BanPickObj copy$default(Dota2BanPickObj dota2BanPickObj, List list, List list2, List list3, List list4, String str, Dota2TeamObj dota2TeamObj, Dota2TeamObj dota2TeamObj2, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{dota2BanPickObj, list, list2, list3, list4, str, dota2TeamObj, dota2TeamObj2, new Integer(i10), obj}, null, changeQuickRedirect, true, 15062, new Class[]{Dota2BanPickObj.class, List.class, List.class, List.class, List.class, String.class, Dota2TeamObj.class, Dota2TeamObj.class, Integer.TYPE, Object.class}, Dota2BanPickObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (Dota2BanPickObj) patchProxyResultProxy.result;
        }
        return dota2BanPickObj.copy((i10 & 1) != 0 ? dota2BanPickObj.radiant_pick : list, (i10 & 2) != 0 ? dota2BanPickObj.radiant_ban : list2, (i10 & 4) != 0 ? dota2BanPickObj.dire_pick : list3, (i10 & 8) != 0 ? dota2BanPickObj.dire_ban : list4, (i10 & 16) != 0 ? dota2BanPickObj.state : str, (i10 & 32) != 0 ? dota2BanPickObj.radiant_team_info : dota2TeamObj, (i10 & 64) != 0 ? dota2BanPickObj.dire_team_info : dota2TeamObj2);
    }

    @e
    public final List<Dota2BanPickDataObj> component1() {
        return this.radiant_pick;
    }

    @e
    public final List<Dota2BanPickDataObj> component2() {
        return this.radiant_ban;
    }

    @e
    public final List<Dota2BanPickDataObj> component3() {
        return this.dire_pick;
    }

    @e
    public final List<Dota2BanPickDataObj> component4() {
        return this.dire_ban;
    }

    @e
    public final String component5() {
        return this.state;
    }

    @d
    public final Dota2TeamObj component6() {
        return this.radiant_team_info;
    }

    @d
    public final Dota2TeamObj component7() {
        return this.dire_team_info;
    }

    @d
    public final Dota2BanPickObj copy(@e List<Dota2BanPickDataObj> list, @e List<Dota2BanPickDataObj> list2, @e List<Dota2BanPickDataObj> list3, @e List<Dota2BanPickDataObj> list4, @e String str, @d Dota2TeamObj radiant_team_info, @d Dota2TeamObj dire_team_info) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{list, list2, list3, list4, str, radiant_team_info, dire_team_info}, this, changeQuickRedirect, false, 15061, new Class[]{List.class, List.class, List.class, List.class, String.class, Dota2TeamObj.class, Dota2TeamObj.class}, Dota2BanPickObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (Dota2BanPickObj) patchProxyResultProxy.result;
        }
        f0.p(radiant_team_info, "radiant_team_info");
        f0.p(dire_team_info, "dire_team_info");
        return new Dota2BanPickObj(list, list2, list3, list4, str, radiant_team_info, dire_team_info);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15065, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Dota2BanPickObj)) {
            return false;
        }
        Dota2BanPickObj dota2BanPickObj = (Dota2BanPickObj) obj;
        return f0.g(this.radiant_pick, dota2BanPickObj.radiant_pick) && f0.g(this.radiant_ban, dota2BanPickObj.radiant_ban) && f0.g(this.dire_pick, dota2BanPickObj.dire_pick) && f0.g(this.dire_ban, dota2BanPickObj.dire_ban) && f0.g(this.state, dota2BanPickObj.state) && f0.g(this.radiant_team_info, dota2BanPickObj.radiant_team_info) && f0.g(this.dire_team_info, dota2BanPickObj.dire_team_info);
    }

    @e
    public final List<Dota2BanPickDataObj> getDire_ban() {
        return this.dire_ban;
    }

    @e
    public final List<Dota2BanPickDataObj> getDire_pick() {
        return this.dire_pick;
    }

    @d
    public final Dota2TeamObj getDire_team_info() {
        return this.dire_team_info;
    }

    @e
    public final List<Dota2BanPickDataObj> getRadiant_ban() {
        return this.radiant_ban;
    }

    @e
    public final List<Dota2BanPickDataObj> getRadiant_pick() {
        return this.radiant_pick;
    }

    @d
    public final Dota2TeamObj getRadiant_team_info() {
        return this.radiant_team_info;
    }

    @e
    public final String getState() {
        return this.state;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15064, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        List<Dota2BanPickDataObj> list = this.radiant_pick;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<Dota2BanPickDataObj> list2 = this.radiant_ban;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<Dota2BanPickDataObj> list3 = this.dire_pick;
        int iHashCode3 = (iHashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<Dota2BanPickDataObj> list4 = this.dire_ban;
        int iHashCode4 = (iHashCode3 + (list4 == null ? 0 : list4.hashCode())) * 31;
        String str = this.state;
        return ((((iHashCode4 + (str != null ? str.hashCode() : 0)) * 31) + this.radiant_team_info.hashCode()) * 31) + this.dire_team_info.hashCode();
    }

    public final void setDire_ban(@e List<Dota2BanPickDataObj> list) {
        this.dire_ban = list;
    }

    public final void setDire_pick(@e List<Dota2BanPickDataObj> list) {
        this.dire_pick = list;
    }

    public final void setDire_team_info(@d Dota2TeamObj dota2TeamObj) {
        if (PatchProxy.proxy(new Object[]{dota2TeamObj}, this, changeQuickRedirect, false, 15060, new Class[]{Dota2TeamObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(dota2TeamObj, "<set-?>");
        this.dire_team_info = dota2TeamObj;
    }

    public final void setRadiant_ban(@e List<Dota2BanPickDataObj> list) {
        this.radiant_ban = list;
    }

    public final void setRadiant_pick(@e List<Dota2BanPickDataObj> list) {
        this.radiant_pick = list;
    }

    public final void setRadiant_team_info(@d Dota2TeamObj dota2TeamObj) {
        if (PatchProxy.proxy(new Object[]{dota2TeamObj}, this, changeQuickRedirect, false, 15059, new Class[]{Dota2TeamObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(dota2TeamObj, "<set-?>");
        this.radiant_team_info = dota2TeamObj;
    }

    public final void setState(@e String str) {
        this.state = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15063, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "Dota2BanPickObj(radiant_pick=" + this.radiant_pick + ", radiant_ban=" + this.radiant_ban + ", dire_pick=" + this.dire_pick + ", dire_ban=" + this.dire_ban + ", state=" + this.state + ", radiant_team_info=" + this.radiant_team_info + ", dire_team_info=" + this.dire_team_info + ')';
    }
}
