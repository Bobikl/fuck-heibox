package com.max.xiaoheihe.bean.game.r6;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: R6PlayerWeaponDataObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class R6PlayerWeaponDataObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String headshotCount;

    @e
    private String headshotRatio;

    @e
    private String icon;

    @e
    private String kills;

    @e
    private String name;

    @e
    private String roundsLost;

    @e
    private String roundsPlayed;

    @e
    private String roundsWithAKillRatio;

    @e
    private String roundsWithMultiKillRatio;

    @e
    private String roundsWon;

    @e
    private String roundsWonRatio;

    @e
    private String typeId;

    public R6PlayerWeaponDataObj(@e String str, @e String str2, @e String str3, @e String str4, @e String str5, @e String str6, @e String str7, @e String str8, @e String str9, @e String str10, @e String str11, @e String str12) {
        this.headshotCount = str;
        this.headshotRatio = str2;
        this.icon = str3;
        this.kills = str4;
        this.name = str5;
        this.roundsLost = str6;
        this.roundsPlayed = str7;
        this.roundsWithAKillRatio = str8;
        this.roundsWithMultiKillRatio = str9;
        this.roundsWon = str10;
        this.roundsWonRatio = str11;
        this.typeId = str12;
    }

    public static /* synthetic */ R6PlayerWeaponDataObj copy$default(R6PlayerWeaponDataObj r6PlayerWeaponDataObj, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{r6PlayerWeaponDataObj, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, new Integer(i10), obj}, null, changeQuickRedirect, true, 15316, new Class[]{R6PlayerWeaponDataObj.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, Integer.TYPE, Object.class}, R6PlayerWeaponDataObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (R6PlayerWeaponDataObj) patchProxyResultProxy.result;
        }
        return r6PlayerWeaponDataObj.copy((i10 & 1) != 0 ? r6PlayerWeaponDataObj.headshotCount : str, (i10 & 2) != 0 ? r6PlayerWeaponDataObj.headshotRatio : str2, (i10 & 4) != 0 ? r6PlayerWeaponDataObj.icon : str3, (i10 & 8) != 0 ? r6PlayerWeaponDataObj.kills : str4, (i10 & 16) != 0 ? r6PlayerWeaponDataObj.name : str5, (i10 & 32) != 0 ? r6PlayerWeaponDataObj.roundsLost : str6, (i10 & 64) != 0 ? r6PlayerWeaponDataObj.roundsPlayed : str7, (i10 & 128) != 0 ? r6PlayerWeaponDataObj.roundsWithAKillRatio : str8, (i10 & 256) != 0 ? r6PlayerWeaponDataObj.roundsWithMultiKillRatio : str9, (i10 & 512) != 0 ? r6PlayerWeaponDataObj.roundsWon : str10, (i10 & 1024) != 0 ? r6PlayerWeaponDataObj.roundsWonRatio : str11, (i10 & 2048) != 0 ? r6PlayerWeaponDataObj.typeId : str12);
    }

    @e
    public final String component1() {
        return this.headshotCount;
    }

    @e
    public final String component10() {
        return this.roundsWon;
    }

    @e
    public final String component11() {
        return this.roundsWonRatio;
    }

    @e
    public final String component12() {
        return this.typeId;
    }

    @e
    public final String component2() {
        return this.headshotRatio;
    }

    @e
    public final String component3() {
        return this.icon;
    }

    @e
    public final String component4() {
        return this.kills;
    }

    @e
    public final String component5() {
        return this.name;
    }

    @e
    public final String component6() {
        return this.roundsLost;
    }

    @e
    public final String component7() {
        return this.roundsPlayed;
    }

    @e
    public final String component8() {
        return this.roundsWithAKillRatio;
    }

    @e
    public final String component9() {
        return this.roundsWithMultiKillRatio;
    }

    @d
    public final R6PlayerWeaponDataObj copy(@e String str, @e String str2, @e String str3, @e String str4, @e String str5, @e String str6, @e String str7, @e String str8, @e String str9, @e String str10, @e String str11, @e String str12) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12}, this, changeQuickRedirect, false, 15315, new Class[]{String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class}, R6PlayerWeaponDataObj.class);
        return patchProxyResultProxy.isSupported ? (R6PlayerWeaponDataObj) patchProxyResultProxy.result : new R6PlayerWeaponDataObj(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15319, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof R6PlayerWeaponDataObj)) {
            return false;
        }
        R6PlayerWeaponDataObj r6PlayerWeaponDataObj = (R6PlayerWeaponDataObj) obj;
        return f0.g(this.headshotCount, r6PlayerWeaponDataObj.headshotCount) && f0.g(this.headshotRatio, r6PlayerWeaponDataObj.headshotRatio) && f0.g(this.icon, r6PlayerWeaponDataObj.icon) && f0.g(this.kills, r6PlayerWeaponDataObj.kills) && f0.g(this.name, r6PlayerWeaponDataObj.name) && f0.g(this.roundsLost, r6PlayerWeaponDataObj.roundsLost) && f0.g(this.roundsPlayed, r6PlayerWeaponDataObj.roundsPlayed) && f0.g(this.roundsWithAKillRatio, r6PlayerWeaponDataObj.roundsWithAKillRatio) && f0.g(this.roundsWithMultiKillRatio, r6PlayerWeaponDataObj.roundsWithMultiKillRatio) && f0.g(this.roundsWon, r6PlayerWeaponDataObj.roundsWon) && f0.g(this.roundsWonRatio, r6PlayerWeaponDataObj.roundsWonRatio) && f0.g(this.typeId, r6PlayerWeaponDataObj.typeId);
    }

    @e
    public final String getHeadshotCount() {
        return this.headshotCount;
    }

    @e
    public final String getHeadshotRatio() {
        return this.headshotRatio;
    }

    @e
    public final String getIcon() {
        return this.icon;
    }

    @e
    public final String getKills() {
        return this.kills;
    }

    @e
    public final String getName() {
        return this.name;
    }

    @e
    public final String getRoundsLost() {
        return this.roundsLost;
    }

    @e
    public final String getRoundsPlayed() {
        return this.roundsPlayed;
    }

    @e
    public final String getRoundsWithAKillRatio() {
        return this.roundsWithAKillRatio;
    }

    @e
    public final String getRoundsWithMultiKillRatio() {
        return this.roundsWithMultiKillRatio;
    }

    @e
    public final String getRoundsWon() {
        return this.roundsWon;
    }

    @e
    public final String getRoundsWonRatio() {
        return this.roundsWonRatio;
    }

    @e
    public final String getTypeId() {
        return this.typeId;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15318, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.headshotCount;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.headshotRatio;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.icon;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.kills;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.name;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.roundsLost;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.roundsPlayed;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.roundsWithAKillRatio;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.roundsWithMultiKillRatio;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.roundsWon;
        int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.roundsWonRatio;
        int iHashCode11 = (iHashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.typeId;
        return iHashCode11 + (str12 != null ? str12.hashCode() : 0);
    }

    public final void setHeadshotCount(@e String str) {
        this.headshotCount = str;
    }

    public final void setHeadshotRatio(@e String str) {
        this.headshotRatio = str;
    }

    public final void setIcon(@e String str) {
        this.icon = str;
    }

    public final void setKills(@e String str) {
        this.kills = str;
    }

    public final void setName(@e String str) {
        this.name = str;
    }

    public final void setRoundsLost(@e String str) {
        this.roundsLost = str;
    }

    public final void setRoundsPlayed(@e String str) {
        this.roundsPlayed = str;
    }

    public final void setRoundsWithAKillRatio(@e String str) {
        this.roundsWithAKillRatio = str;
    }

    public final void setRoundsWithMultiKillRatio(@e String str) {
        this.roundsWithMultiKillRatio = str;
    }

    public final void setRoundsWon(@e String str) {
        this.roundsWon = str;
    }

    public final void setRoundsWonRatio(@e String str) {
        this.roundsWonRatio = str;
    }

    public final void setTypeId(@e String str) {
        this.typeId = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15317, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "R6PlayerWeaponDataObj(headshotCount=" + this.headshotCount + ", headshotRatio=" + this.headshotRatio + ", icon=" + this.icon + ", kills=" + this.kills + ", name=" + this.name + ", roundsLost=" + this.roundsLost + ", roundsPlayed=" + this.roundsPlayed + ", roundsWithAKillRatio=" + this.roundsWithAKillRatio + ", roundsWithMultiKillRatio=" + this.roundsWithMultiKillRatio + ", roundsWon=" + this.roundsWon + ", roundsWonRatio=" + this.roundsWonRatio + ", typeId=" + this.typeId + ')';
    }
}
