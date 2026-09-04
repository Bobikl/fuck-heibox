package com.max.xiaoheihe.bean.game.gameoverview;

import androidx.compose.runtime.internal.o;
import com.max.hbutils.utils.n;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: GameOverviewOverlayRecordObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class Overlaymatch implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String match_id;

    @e
    private String previous_rank;

    @e
    private String rank_change;

    @e
    private String start_time;

    public Overlaymatch(@e String str, @e String str2, @e String str3, @e String str4) {
        this.start_time = str;
        this.match_id = str2;
        this.rank_change = str3;
        this.previous_rank = str4;
    }

    public static /* synthetic */ Overlaymatch copy$default(Overlaymatch overlaymatch, String str, String str2, String str3, String str4, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{overlaymatch, str, str2, str3, str4, new Integer(i10), obj}, null, changeQuickRedirect, true, 15273, new Class[]{Overlaymatch.class, String.class, String.class, String.class, String.class, Integer.TYPE, Object.class}, Overlaymatch.class);
        if (patchProxyResultProxy.isSupported) {
            return (Overlaymatch) patchProxyResultProxy.result;
        }
        return overlaymatch.copy((i10 & 1) != 0 ? overlaymatch.start_time : str, (i10 & 2) != 0 ? overlaymatch.match_id : str2, (i10 & 4) != 0 ? overlaymatch.rank_change : str3, (i10 & 8) != 0 ? overlaymatch.previous_rank : str4);
    }

    @e
    public final String component1() {
        return this.start_time;
    }

    @e
    public final String component2() {
        return this.match_id;
    }

    @e
    public final String component3() {
        return this.rank_change;
    }

    @e
    public final String component4() {
        return this.previous_rank;
    }

    @d
    public final Overlaymatch copy(@e String str, @e String str2, @e String str3, @e String str4) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3, str4}, this, changeQuickRedirect, false, 15272, new Class[]{String.class, String.class, String.class, String.class}, Overlaymatch.class);
        return patchProxyResultProxy.isSupported ? (Overlaymatch) patchProxyResultProxy.result : new Overlaymatch(str, str2, str3, str4);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15276, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Overlaymatch)) {
            return false;
        }
        Overlaymatch overlaymatch = (Overlaymatch) obj;
        return f0.g(this.start_time, overlaymatch.start_time) && f0.g(this.match_id, overlaymatch.match_id) && f0.g(this.rank_change, overlaymatch.rank_change) && f0.g(this.previous_rank, overlaymatch.previous_rank);
    }

    public final int getDelta() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15270, new Class[0], Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : n.q(this.rank_change);
    }

    @e
    public final String getMatch_id() {
        return this.match_id;
    }

    @e
    public final String getPrevious_rank() {
        return this.previous_rank;
    }

    public final int getRank() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15271, new Class[0], Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : n.q(this.previous_rank) + n.q(this.rank_change);
    }

    @e
    public final String getRank_change() {
        return this.rank_change;
    }

    @e
    public final String getStart_time() {
        return this.start_time;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15275, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.start_time;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.match_id;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.rank_change;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.previous_rank;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final void setMatch_id(@e String str) {
        this.match_id = str;
    }

    public final void setPrevious_rank(@e String str) {
        this.previous_rank = str;
    }

    public final void setRank_change(@e String str) {
        this.rank_change = str;
    }

    public final void setStart_time(@e String str) {
        this.start_time = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15274, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "Overlaymatch(start_time=" + this.start_time + ", match_id=" + this.match_id + ", rank_change=" + this.rank_change + ", previous_rank=" + this.previous_rank + ')';
    }
}
