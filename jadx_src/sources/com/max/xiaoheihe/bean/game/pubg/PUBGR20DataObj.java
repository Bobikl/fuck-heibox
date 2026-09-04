package com.max.xiaoheihe.bean.game.pubg;

import androidx.compose.runtime.internal.o;
import com.max.xiaoheihe.bean.game.gameoverview.MatchObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: PUBGR20DataObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class PUBGR20DataObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String avg_rank;

    /* JADX INFO: renamed from: kd, reason: collision with root package name */
    @e
    private String f76984kd;

    @e
    private List<MatchObj> match_list;

    @e
    private List<String> tags;

    @e
    private String title;

    public PUBGR20DataObj(@e String str, @e String str2, @e String str3, @e List<MatchObj> list, @e List<String> list2) {
        this.title = str;
        this.f76984kd = str2;
        this.avg_rank = str3;
        this.match_list = list;
        this.tags = list2;
    }

    public static /* synthetic */ PUBGR20DataObj copy$default(PUBGR20DataObj pUBGR20DataObj, String str, String str2, String str3, List list, List list2, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{pUBGR20DataObj, str, str2, str3, list, list2, new Integer(i10), obj}, null, changeQuickRedirect, true, 15295, new Class[]{PUBGR20DataObj.class, String.class, String.class, String.class, List.class, List.class, Integer.TYPE, Object.class}, PUBGR20DataObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (PUBGR20DataObj) patchProxyResultProxy.result;
        }
        return pUBGR20DataObj.copy((i10 & 1) != 0 ? pUBGR20DataObj.title : str, (i10 & 2) != 0 ? pUBGR20DataObj.f76984kd : str2, (i10 & 4) != 0 ? pUBGR20DataObj.avg_rank : str3, (i10 & 8) != 0 ? pUBGR20DataObj.match_list : list, (i10 & 16) != 0 ? pUBGR20DataObj.tags : list2);
    }

    @e
    public final String component1() {
        return this.title;
    }

    @e
    public final String component2() {
        return this.f76984kd;
    }

    @e
    public final String component3() {
        return this.avg_rank;
    }

    @e
    public final List<MatchObj> component4() {
        return this.match_list;
    }

    @e
    public final List<String> component5() {
        return this.tags;
    }

    @d
    public final PUBGR20DataObj copy(@e String str, @e String str2, @e String str3, @e List<MatchObj> list, @e List<String> list2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3, list, list2}, this, changeQuickRedirect, false, 15294, new Class[]{String.class, String.class, String.class, List.class, List.class}, PUBGR20DataObj.class);
        return patchProxyResultProxy.isSupported ? (PUBGR20DataObj) patchProxyResultProxy.result : new PUBGR20DataObj(str, str2, str3, list, list2);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15298, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PUBGR20DataObj)) {
            return false;
        }
        PUBGR20DataObj pUBGR20DataObj = (PUBGR20DataObj) obj;
        return f0.g(this.title, pUBGR20DataObj.title) && f0.g(this.f76984kd, pUBGR20DataObj.f76984kd) && f0.g(this.avg_rank, pUBGR20DataObj.avg_rank) && f0.g(this.match_list, pUBGR20DataObj.match_list) && f0.g(this.tags, pUBGR20DataObj.tags);
    }

    @e
    public final String getAvg_rank() {
        return this.avg_rank;
    }

    @e
    public final String getKd() {
        return this.f76984kd;
    }

    @e
    public final List<MatchObj> getMatch_list() {
        return this.match_list;
    }

    @e
    public final List<String> getTags() {
        return this.tags;
    }

    @e
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15297, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f76984kd;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.avg_rank;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<MatchObj> list = this.match_list;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.tags;
        return iHashCode4 + (list2 != null ? list2.hashCode() : 0);
    }

    public final void setAvg_rank(@e String str) {
        this.avg_rank = str;
    }

    public final void setKd(@e String str) {
        this.f76984kd = str;
    }

    public final void setMatch_list(@e List<MatchObj> list) {
        this.match_list = list;
    }

    public final void setTags(@e List<String> list) {
        this.tags = list;
    }

    public final void setTitle(@e String str) {
        this.title = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15296, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "PUBGR20DataObj(title=" + this.title + ", kd=" + this.f76984kd + ", avg_rank=" + this.avg_rank + ", match_list=" + this.match_list + ", tags=" + this.tags + ')';
    }
}
