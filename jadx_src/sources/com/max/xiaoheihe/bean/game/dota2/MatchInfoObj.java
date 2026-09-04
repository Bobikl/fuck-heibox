package com.max.xiaoheihe.bean.game.dota2;

import androidx.compose.runtime.internal.o;
import com.max.xiaoheihe.bean.game.gameoverview.Overlaymatch;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: MatchInfoObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class MatchInfoObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String dan_icon;

    @e
    private String duration;

    @e
    private String finish_desc;

    @e
    private String match_id;

    @e
    private Overlaymatch match_rank_change;

    @e
    private String mode_desc;

    @e
    private String win;

    public MatchInfoObj(@e String str, @e String str2, @e String str3, @e String str4, @e String str5, @e String str6, @e Overlaymatch overlaymatch) {
        this.win = str;
        this.dan_icon = str2;
        this.mode_desc = str3;
        this.finish_desc = str4;
        this.duration = str5;
        this.match_id = str6;
        this.match_rank_change = overlaymatch;
    }

    public static /* synthetic */ MatchInfoObj copy$default(MatchInfoObj matchInfoObj, String str, String str2, String str3, String str4, String str5, String str6, Overlaymatch overlaymatch, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{matchInfoObj, str, str2, str3, str4, str5, str6, overlaymatch, new Integer(i10), obj}, null, changeQuickRedirect, true, 15127, new Class[]{MatchInfoObj.class, String.class, String.class, String.class, String.class, String.class, String.class, Overlaymatch.class, Integer.TYPE, Object.class}, MatchInfoObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (MatchInfoObj) patchProxyResultProxy.result;
        }
        return matchInfoObj.copy((i10 & 1) != 0 ? matchInfoObj.win : str, (i10 & 2) != 0 ? matchInfoObj.dan_icon : str2, (i10 & 4) != 0 ? matchInfoObj.mode_desc : str3, (i10 & 8) != 0 ? matchInfoObj.finish_desc : str4, (i10 & 16) != 0 ? matchInfoObj.duration : str5, (i10 & 32) != 0 ? matchInfoObj.match_id : str6, (i10 & 64) != 0 ? matchInfoObj.match_rank_change : overlaymatch);
    }

    @e
    public final String component1() {
        return this.win;
    }

    @e
    public final String component2() {
        return this.dan_icon;
    }

    @e
    public final String component3() {
        return this.mode_desc;
    }

    @e
    public final String component4() {
        return this.finish_desc;
    }

    @e
    public final String component5() {
        return this.duration;
    }

    @e
    public final String component6() {
        return this.match_id;
    }

    @e
    public final Overlaymatch component7() {
        return this.match_rank_change;
    }

    @d
    public final MatchInfoObj copy(@e String str, @e String str2, @e String str3, @e String str4, @e String str5, @e String str6, @e Overlaymatch overlaymatch) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3, str4, str5, str6, overlaymatch}, this, changeQuickRedirect, false, 15126, new Class[]{String.class, String.class, String.class, String.class, String.class, String.class, Overlaymatch.class}, MatchInfoObj.class);
        return patchProxyResultProxy.isSupported ? (MatchInfoObj) patchProxyResultProxy.result : new MatchInfoObj(str, str2, str3, str4, str5, str6, overlaymatch);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15130, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MatchInfoObj)) {
            return false;
        }
        MatchInfoObj matchInfoObj = (MatchInfoObj) obj;
        return f0.g(this.win, matchInfoObj.win) && f0.g(this.dan_icon, matchInfoObj.dan_icon) && f0.g(this.mode_desc, matchInfoObj.mode_desc) && f0.g(this.finish_desc, matchInfoObj.finish_desc) && f0.g(this.duration, matchInfoObj.duration) && f0.g(this.match_id, matchInfoObj.match_id) && f0.g(this.match_rank_change, matchInfoObj.match_rank_change);
    }

    @e
    public final String getDan_icon() {
        return this.dan_icon;
    }

    @e
    public final String getDuration() {
        return this.duration;
    }

    @e
    public final String getFinish_desc() {
        return this.finish_desc;
    }

    @e
    public final String getMatch_id() {
        return this.match_id;
    }

    @e
    public final Overlaymatch getMatch_rank_change() {
        return this.match_rank_change;
    }

    @e
    public final String getMode_desc() {
        return this.mode_desc;
    }

    @e
    public final String getWin() {
        return this.win;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15129, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.win;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.dan_icon;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.mode_desc;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.finish_desc;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.duration;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.match_id;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Overlaymatch overlaymatch = this.match_rank_change;
        return iHashCode6 + (overlaymatch != null ? overlaymatch.hashCode() : 0);
    }

    public final void setDan_icon(@e String str) {
        this.dan_icon = str;
    }

    public final void setDuration(@e String str) {
        this.duration = str;
    }

    public final void setFinish_desc(@e String str) {
        this.finish_desc = str;
    }

    public final void setMatch_id(@e String str) {
        this.match_id = str;
    }

    public final void setMatch_rank_change(@e Overlaymatch overlaymatch) {
        this.match_rank_change = overlaymatch;
    }

    public final void setMode_desc(@e String str) {
        this.mode_desc = str;
    }

    public final void setWin(@e String str) {
        this.win = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15128, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "MatchInfoObj(win=" + this.win + ", dan_icon=" + this.dan_icon + ", mode_desc=" + this.mode_desc + ", finish_desc=" + this.finish_desc + ", duration=" + this.duration + ", match_id=" + this.match_id + ", match_rank_change=" + this.match_rank_change + ')';
    }
}
