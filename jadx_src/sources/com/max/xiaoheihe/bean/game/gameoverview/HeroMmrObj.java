package com.max.xiaoheihe.bean.game.gameoverview;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: HeroMmrObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class HeroMmrObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String color;

    @e
    private String delta;

    @e
    private String is_grading;

    @e
    private String mmr;

    @e
    private String rank;

    public HeroMmrObj(@e String str, @e String str2, @e String str3, @e String str4, @e String str5) {
        this.mmr = str;
        this.rank = str2;
        this.color = str3;
        this.delta = str4;
        this.is_grading = str5;
    }

    public static /* synthetic */ HeroMmrObj copy$default(HeroMmrObj heroMmrObj, String str, String str2, String str3, String str4, String str5, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{heroMmrObj, str, str2, str3, str4, str5, new Integer(i10), obj}, null, changeQuickRedirect, true, 15246, new Class[]{HeroMmrObj.class, String.class, String.class, String.class, String.class, String.class, Integer.TYPE, Object.class}, HeroMmrObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (HeroMmrObj) patchProxyResultProxy.result;
        }
        return heroMmrObj.copy((i10 & 1) != 0 ? heroMmrObj.mmr : str, (i10 & 2) != 0 ? heroMmrObj.rank : str2, (i10 & 4) != 0 ? heroMmrObj.color : str3, (i10 & 8) != 0 ? heroMmrObj.delta : str4, (i10 & 16) != 0 ? heroMmrObj.is_grading : str5);
    }

    @e
    public final String component1() {
        return this.mmr;
    }

    @e
    public final String component2() {
        return this.rank;
    }

    @e
    public final String component3() {
        return this.color;
    }

    @e
    public final String component4() {
        return this.delta;
    }

    @e
    public final String component5() {
        return this.is_grading;
    }

    @d
    public final HeroMmrObj copy(@e String str, @e String str2, @e String str3, @e String str4, @e String str5) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3, str4, str5}, this, changeQuickRedirect, false, 15245, new Class[]{String.class, String.class, String.class, String.class, String.class}, HeroMmrObj.class);
        return patchProxyResultProxy.isSupported ? (HeroMmrObj) patchProxyResultProxy.result : new HeroMmrObj(str, str2, str3, str4, str5);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15249, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HeroMmrObj)) {
            return false;
        }
        HeroMmrObj heroMmrObj = (HeroMmrObj) obj;
        return f0.g(this.mmr, heroMmrObj.mmr) && f0.g(this.rank, heroMmrObj.rank) && f0.g(this.color, heroMmrObj.color) && f0.g(this.delta, heroMmrObj.delta) && f0.g(this.is_grading, heroMmrObj.is_grading);
    }

    @e
    public final String getColor() {
        return this.color;
    }

    @e
    public final String getDelta() {
        return this.delta;
    }

    @e
    public final String getMmr() {
        return this.mmr;
    }

    @e
    public final String getRank() {
        return this.rank;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15248, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.mmr;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.rank;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.color;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.delta;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.is_grading;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    @e
    public final String is_grading() {
        return this.is_grading;
    }

    public final void setColor(@e String str) {
        this.color = str;
    }

    public final void setDelta(@e String str) {
        this.delta = str;
    }

    public final void setMmr(@e String str) {
        this.mmr = str;
    }

    public final void setRank(@e String str) {
        this.rank = str;
    }

    public final void set_grading(@e String str) {
        this.is_grading = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15247, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "HeroMmrObj(mmr=" + this.mmr + ", rank=" + this.rank + ", color=" + this.color + ", delta=" + this.delta + ", is_grading=" + this.is_grading + ')';
    }
}
