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

/* JADX INFO: compiled from: MMRInfo.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class MMRInfo implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String dan_desc;

    @e
    private String dan_icon;

    @e
    private String dan_name;

    @e
    private String dan_value;

    @e
    private List<KeyDescObj> match_stats;

    public MMRInfo(@e String str, @e String str2, @e String str3, @e String str4, @e List<KeyDescObj> list) {
        this.dan_icon = str;
        this.dan_value = str2;
        this.dan_desc = str3;
        this.dan_name = str4;
        this.match_stats = list;
    }

    public static /* synthetic */ MMRInfo copy$default(MMRInfo mMRInfo, String str, String str2, String str3, String str4, List list, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{mMRInfo, str, str2, str3, str4, list, new Integer(i10), obj}, null, changeQuickRedirect, true, 15261, new Class[]{MMRInfo.class, String.class, String.class, String.class, String.class, List.class, Integer.TYPE, Object.class}, MMRInfo.class);
        if (patchProxyResultProxy.isSupported) {
            return (MMRInfo) patchProxyResultProxy.result;
        }
        return mMRInfo.copy((i10 & 1) != 0 ? mMRInfo.dan_icon : str, (i10 & 2) != 0 ? mMRInfo.dan_value : str2, (i10 & 4) != 0 ? mMRInfo.dan_desc : str3, (i10 & 8) != 0 ? mMRInfo.dan_name : str4, (i10 & 16) != 0 ? mMRInfo.match_stats : list);
    }

    @e
    public final String component1() {
        return this.dan_icon;
    }

    @e
    public final String component2() {
        return this.dan_value;
    }

    @e
    public final String component3() {
        return this.dan_desc;
    }

    @e
    public final String component4() {
        return this.dan_name;
    }

    @e
    public final List<KeyDescObj> component5() {
        return this.match_stats;
    }

    @d
    public final MMRInfo copy(@e String str, @e String str2, @e String str3, @e String str4, @e List<KeyDescObj> list) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3, str4, list}, this, changeQuickRedirect, false, 15260, new Class[]{String.class, String.class, String.class, String.class, List.class}, MMRInfo.class);
        return patchProxyResultProxy.isSupported ? (MMRInfo) patchProxyResultProxy.result : new MMRInfo(str, str2, str3, str4, list);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15264, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MMRInfo)) {
            return false;
        }
        MMRInfo mMRInfo = (MMRInfo) obj;
        return f0.g(this.dan_icon, mMRInfo.dan_icon) && f0.g(this.dan_value, mMRInfo.dan_value) && f0.g(this.dan_desc, mMRInfo.dan_desc) && f0.g(this.dan_name, mMRInfo.dan_name) && f0.g(this.match_stats, mMRInfo.match_stats);
    }

    @e
    public final String getDan_desc() {
        return this.dan_desc;
    }

    @e
    public final String getDan_icon() {
        return this.dan_icon;
    }

    @e
    public final String getDan_name() {
        return this.dan_name;
    }

    @e
    public final String getDan_value() {
        return this.dan_value;
    }

    @e
    public final List<KeyDescObj> getMatch_stats() {
        return this.match_stats;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15263, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.dan_icon;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.dan_value;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.dan_desc;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.dan_name;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<KeyDescObj> list = this.match_stats;
        return iHashCode4 + (list != null ? list.hashCode() : 0);
    }

    public final void setDan_desc(@e String str) {
        this.dan_desc = str;
    }

    public final void setDan_icon(@e String str) {
        this.dan_icon = str;
    }

    public final void setDan_name(@e String str) {
        this.dan_name = str;
    }

    public final void setDan_value(@e String str) {
        this.dan_value = str;
    }

    public final void setMatch_stats(@e List<KeyDescObj> list) {
        this.match_stats = list;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15262, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "MMRInfo(dan_icon=" + this.dan_icon + ", dan_value=" + this.dan_value + ", dan_desc=" + this.dan_desc + ", dan_name=" + this.dan_name + ", match_stats=" + this.match_stats + ')';
    }
}
