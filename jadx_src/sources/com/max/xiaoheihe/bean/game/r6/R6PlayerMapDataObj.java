package com.max.xiaoheihe.bean.game.r6;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: R6PlayerMapDataObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class R6PlayerMapDataObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: kd, reason: collision with root package name */
    @e
    private String f76999kd;

    @e
    private String kostRatio;

    @e
    private String mapImg;

    @e
    private String mapName;

    @e
    private String minutesPlayed;

    @e
    private String roundsPlayed;

    @e
    private String roundsWithOpeningDeath;

    @e
    private String roundsWithOpeningKill;

    @e
    private String roundsWon;

    @e
    private String timePlayed;

    @e
    private String wonRatio;

    public R6PlayerMapDataObj(@e String str, @e String str2, @e String str3, @e String str4, @e String str5, @e String str6, @e String str7, @e String str8, @e String str9, @e String str10, @e String str11) {
        this.f76999kd = str;
        this.kostRatio = str2;
        this.mapImg = str3;
        this.mapName = str4;
        this.minutesPlayed = str5;
        this.roundsPlayed = str6;
        this.roundsWithOpeningDeath = str7;
        this.roundsWithOpeningKill = str8;
        this.roundsWon = str9;
        this.timePlayed = str10;
        this.wonRatio = str11;
    }

    public static /* synthetic */ R6PlayerMapDataObj copy$default(R6PlayerMapDataObj r6PlayerMapDataObj, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{r6PlayerMapDataObj, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, new Integer(i10), obj}, null, changeQuickRedirect, true, 15306, new Class[]{R6PlayerMapDataObj.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, Integer.TYPE, Object.class}, R6PlayerMapDataObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (R6PlayerMapDataObj) patchProxyResultProxy.result;
        }
        return r6PlayerMapDataObj.copy((i10 & 1) != 0 ? r6PlayerMapDataObj.f76999kd : str, (i10 & 2) != 0 ? r6PlayerMapDataObj.kostRatio : str2, (i10 & 4) != 0 ? r6PlayerMapDataObj.mapImg : str3, (i10 & 8) != 0 ? r6PlayerMapDataObj.mapName : str4, (i10 & 16) != 0 ? r6PlayerMapDataObj.minutesPlayed : str5, (i10 & 32) != 0 ? r6PlayerMapDataObj.roundsPlayed : str6, (i10 & 64) != 0 ? r6PlayerMapDataObj.roundsWithOpeningDeath : str7, (i10 & 128) != 0 ? r6PlayerMapDataObj.roundsWithOpeningKill : str8, (i10 & 256) != 0 ? r6PlayerMapDataObj.roundsWon : str9, (i10 & 512) != 0 ? r6PlayerMapDataObj.timePlayed : str10, (i10 & 1024) != 0 ? r6PlayerMapDataObj.wonRatio : str11);
    }

    @e
    public final String component1() {
        return this.f76999kd;
    }

    @e
    public final String component10() {
        return this.timePlayed;
    }

    @e
    public final String component11() {
        return this.wonRatio;
    }

    @e
    public final String component2() {
        return this.kostRatio;
    }

    @e
    public final String component3() {
        return this.mapImg;
    }

    @e
    public final String component4() {
        return this.mapName;
    }

    @e
    public final String component5() {
        return this.minutesPlayed;
    }

    @e
    public final String component6() {
        return this.roundsPlayed;
    }

    @e
    public final String component7() {
        return this.roundsWithOpeningDeath;
    }

    @e
    public final String component8() {
        return this.roundsWithOpeningKill;
    }

    @e
    public final String component9() {
        return this.roundsWon;
    }

    @d
    public final R6PlayerMapDataObj copy(@e String str, @e String str2, @e String str3, @e String str4, @e String str5, @e String str6, @e String str7, @e String str8, @e String str9, @e String str10, @e String str11) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11}, this, changeQuickRedirect, false, 15305, new Class[]{String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class}, R6PlayerMapDataObj.class);
        return patchProxyResultProxy.isSupported ? (R6PlayerMapDataObj) patchProxyResultProxy.result : new R6PlayerMapDataObj(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15309, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof R6PlayerMapDataObj)) {
            return false;
        }
        R6PlayerMapDataObj r6PlayerMapDataObj = (R6PlayerMapDataObj) obj;
        return f0.g(this.f76999kd, r6PlayerMapDataObj.f76999kd) && f0.g(this.kostRatio, r6PlayerMapDataObj.kostRatio) && f0.g(this.mapImg, r6PlayerMapDataObj.mapImg) && f0.g(this.mapName, r6PlayerMapDataObj.mapName) && f0.g(this.minutesPlayed, r6PlayerMapDataObj.minutesPlayed) && f0.g(this.roundsPlayed, r6PlayerMapDataObj.roundsPlayed) && f0.g(this.roundsWithOpeningDeath, r6PlayerMapDataObj.roundsWithOpeningDeath) && f0.g(this.roundsWithOpeningKill, r6PlayerMapDataObj.roundsWithOpeningKill) && f0.g(this.roundsWon, r6PlayerMapDataObj.roundsWon) && f0.g(this.timePlayed, r6PlayerMapDataObj.timePlayed) && f0.g(this.wonRatio, r6PlayerMapDataObj.wonRatio);
    }

    @e
    public final String getKd() {
        return this.f76999kd;
    }

    @e
    public final String getKostRatio() {
        return this.kostRatio;
    }

    @e
    public final String getMapImg() {
        return this.mapImg;
    }

    @e
    public final String getMapName() {
        return this.mapName;
    }

    @e
    public final String getMinutesPlayed() {
        return this.minutesPlayed;
    }

    @e
    public final String getRoundsPlayed() {
        return this.roundsPlayed;
    }

    @e
    public final String getRoundsWithOpeningDeath() {
        return this.roundsWithOpeningDeath;
    }

    @e
    public final String getRoundsWithOpeningKill() {
        return this.roundsWithOpeningKill;
    }

    @e
    public final String getRoundsWon() {
        return this.roundsWon;
    }

    @e
    public final String getTimePlayed() {
        return this.timePlayed;
    }

    @e
    public final String getWonRatio() {
        return this.wonRatio;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15308, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.f76999kd;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.kostRatio;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.mapImg;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.mapName;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.minutesPlayed;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.roundsPlayed;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.roundsWithOpeningDeath;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.roundsWithOpeningKill;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.roundsWon;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.timePlayed;
        int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.wonRatio;
        return iHashCode10 + (str11 != null ? str11.hashCode() : 0);
    }

    public final void setKd(@e String str) {
        this.f76999kd = str;
    }

    public final void setKostRatio(@e String str) {
        this.kostRatio = str;
    }

    public final void setMapImg(@e String str) {
        this.mapImg = str;
    }

    public final void setMapName(@e String str) {
        this.mapName = str;
    }

    public final void setMinutesPlayed(@e String str) {
        this.minutesPlayed = str;
    }

    public final void setRoundsPlayed(@e String str) {
        this.roundsPlayed = str;
    }

    public final void setRoundsWithOpeningDeath(@e String str) {
        this.roundsWithOpeningDeath = str;
    }

    public final void setRoundsWithOpeningKill(@e String str) {
        this.roundsWithOpeningKill = str;
    }

    public final void setRoundsWon(@e String str) {
        this.roundsWon = str;
    }

    public final void setTimePlayed(@e String str) {
        this.timePlayed = str;
    }

    public final void setWonRatio(@e String str) {
        this.wonRatio = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15307, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "R6PlayerMapDataObj(kd=" + this.f76999kd + ", kostRatio=" + this.kostRatio + ", mapImg=" + this.mapImg + ", mapName=" + this.mapName + ", minutesPlayed=" + this.minutesPlayed + ", roundsPlayed=" + this.roundsPlayed + ", roundsWithOpeningDeath=" + this.roundsWithOpeningDeath + ", roundsWithOpeningKill=" + this.roundsWithOpeningKill + ", roundsWon=" + this.roundsWon + ", timePlayed=" + this.timePlayed + ", wonRatio=" + this.wonRatio + ')';
    }
}
