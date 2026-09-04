package com.max.xiaoheihe.bean.game.r6;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import dl.e;
import java.io.Serializable;

/* JADX INFO: compiled from: R6ContentMapObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class R6ContentMapObj extends R6ContentBaseObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: kd, reason: collision with root package name */
    @e
    private String f76987kd;

    @e
    private String mapImg;

    @e
    private String mapName;

    @e
    private String roundsPlayed;

    @e
    private String timePlayed;

    @e
    private String wonRatio;

    public R6ContentMapObj(@e String str, @e String str2, @e String str3, @e String str4, @e String str5, @e String str6) {
        this.f76987kd = str;
        this.mapImg = str2;
        this.mapName = str3;
        this.roundsPlayed = str4;
        this.timePlayed = str5;
        this.wonRatio = str6;
    }

    @e
    public final String getKd() {
        return this.f76987kd;
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
    public final String getRoundsPlayed() {
        return this.roundsPlayed;
    }

    @e
    public final String getTimePlayed() {
        return this.timePlayed;
    }

    @e
    public final String getWonRatio() {
        return this.wonRatio;
    }

    public final void setKd(@e String str) {
        this.f76987kd = str;
    }

    public final void setMapImg(@e String str) {
        this.mapImg = str;
    }

    public final void setMapName(@e String str) {
        this.mapName = str;
    }

    public final void setRoundsPlayed(@e String str) {
        this.roundsPlayed = str;
    }

    public final void setTimePlayed(@e String str) {
        this.timePlayed = str;
    }

    public final void setWonRatio(@e String str) {
        this.wonRatio = str;
    }
}
