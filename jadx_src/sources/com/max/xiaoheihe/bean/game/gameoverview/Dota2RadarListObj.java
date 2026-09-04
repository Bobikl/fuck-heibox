package com.max.xiaoheihe.bean.game.gameoverview;

import androidx.compose.runtime.internal.o;
import com.max.hbcommon.bean.KeyDescObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: Dota2RadarListObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class Dota2RadarListObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String desc;

    @e
    private String kda;

    @e
    private String lose;

    @e
    private List<KeyDescObj> radar_data_list;

    @e
    private List<KeyDescObj> stats_list;

    @e
    private String win;

    @e
    private String win_rate;

    public Dota2RadarListObj(@e String str, @e String str2, @e String str3, @e String str4, @e String str5, @e List<KeyDescObj> list, @e List<KeyDescObj> list2) {
        this.desc = str;
        this.win = str2;
        this.lose = str3;
        this.win_rate = str4;
        this.kda = str5;
        this.stats_list = list;
        this.radar_data_list = list2;
    }

    public static /* synthetic */ Dota2RadarListObj copy$default(Dota2RadarListObj dota2RadarListObj, String str, String str2, String str3, String str4, String str5, List list, List list2, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{dota2RadarListObj, str, str2, str3, str4, str5, list, list2, new Integer(i10), obj}, null, changeQuickRedirect, true, 15220, new Class[]{Dota2RadarListObj.class, String.class, String.class, String.class, String.class, String.class, List.class, List.class, Integer.TYPE, Object.class}, Dota2RadarListObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (Dota2RadarListObj) patchProxyResultProxy.result;
        }
        return dota2RadarListObj.copy((i10 & 1) != 0 ? dota2RadarListObj.desc : str, (i10 & 2) != 0 ? dota2RadarListObj.win : str2, (i10 & 4) != 0 ? dota2RadarListObj.lose : str3, (i10 & 8) != 0 ? dota2RadarListObj.win_rate : str4, (i10 & 16) != 0 ? dota2RadarListObj.kda : str5, (i10 & 32) != 0 ? dota2RadarListObj.stats_list : list, (i10 & 64) != 0 ? dota2RadarListObj.radar_data_list : list2);
    }

    @e
    public final String component1() {
        return this.desc;
    }

    @e
    public final String component2() {
        return this.win;
    }

    @e
    public final String component3() {
        return this.lose;
    }

    @e
    public final String component4() {
        return this.win_rate;
    }

    @e
    public final String component5() {
        return this.kda;
    }

    @e
    public final List<KeyDescObj> component6() {
        return this.stats_list;
    }

    @e
    public final List<KeyDescObj> component7() {
        return this.radar_data_list;
    }

    @d
    public final Dota2RadarListObj copy(@e String str, @e String str2, @e String str3, @e String str4, @e String str5, @e List<KeyDescObj> list, @e List<KeyDescObj> list2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3, str4, str5, list, list2}, this, changeQuickRedirect, false, 15219, new Class[]{String.class, String.class, String.class, String.class, String.class, List.class, List.class}, Dota2RadarListObj.class);
        return patchProxyResultProxy.isSupported ? (Dota2RadarListObj) patchProxyResultProxy.result : new Dota2RadarListObj(str, str2, str3, str4, str5, list, list2);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15223, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Dota2RadarListObj)) {
            return false;
        }
        Dota2RadarListObj dota2RadarListObj = (Dota2RadarListObj) obj;
        return f0.g(this.desc, dota2RadarListObj.desc) && f0.g(this.win, dota2RadarListObj.win) && f0.g(this.lose, dota2RadarListObj.lose) && f0.g(this.win_rate, dota2RadarListObj.win_rate) && f0.g(this.kda, dota2RadarListObj.kda) && f0.g(this.stats_list, dota2RadarListObj.stats_list) && f0.g(this.radar_data_list, dota2RadarListObj.radar_data_list);
    }

    @e
    public final String getDesc() {
        return this.desc;
    }

    @e
    public final String getKda() {
        return this.kda;
    }

    @e
    public final String getLose() {
        return this.lose;
    }

    @e
    public final List<KeyDescObj> getRadar_data_list() {
        return this.radar_data_list;
    }

    @e
    public final List<KeyDescObj> getStats_list() {
        return this.stats_list;
    }

    @e
    public final String getWin() {
        return this.win;
    }

    @e
    public final String getWin_rate() {
        return this.win_rate;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15222, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.desc;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.win;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.lose;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.win_rate;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.kda;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        List<KeyDescObj> list = this.stats_list;
        int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        List<KeyDescObj> list2 = this.radar_data_list;
        return iHashCode6 + (list2 != null ? list2.hashCode() : 0);
    }

    public final void setDesc(@e String str) {
        this.desc = str;
    }

    public final void setKda(@e String str) {
        this.kda = str;
    }

    public final void setLose(@e String str) {
        this.lose = str;
    }

    public final void setRadar_data_list(@e List<KeyDescObj> list) {
        this.radar_data_list = list;
    }

    public final void setStats_list(@e List<KeyDescObj> list) {
        this.stats_list = list;
    }

    public final void setWin(@e String str) {
        this.win = str;
    }

    public final void setWin_rate(@e String str) {
        this.win_rate = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15221, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "Dota2RadarListObj(desc=" + this.desc + ", win=" + this.win + ", lose=" + this.lose + ", win_rate=" + this.win_rate + ", kda=" + this.kda + ", stats_list=" + this.stats_list + ", radar_data_list=" + this.radar_data_list + ')';
    }
}
