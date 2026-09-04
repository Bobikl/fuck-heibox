package com.max.xiaoheihe.bean.game;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: GameDurationObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class GameDurationObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private GameTimeObj game_time;

    @e
    private GamePlayTimeObj play_time;

    public GameDurationObj(@e GamePlayTimeObj gamePlayTimeObj, @e GameTimeObj gameTimeObj) {
        this.play_time = gamePlayTimeObj;
        this.game_time = gameTimeObj;
    }

    public static /* synthetic */ GameDurationObj copy$default(GameDurationObj gameDurationObj, GamePlayTimeObj gamePlayTimeObj, GameTimeObj gameTimeObj, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{gameDurationObj, gamePlayTimeObj, gameTimeObj, new Integer(i10), obj}, null, changeQuickRedirect, true, 14822, new Class[]{GameDurationObj.class, GamePlayTimeObj.class, GameTimeObj.class, Integer.TYPE, Object.class}, GameDurationObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (GameDurationObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            gamePlayTimeObj = gameDurationObj.play_time;
        }
        if ((i10 & 2) != 0) {
            gameTimeObj = gameDurationObj.game_time;
        }
        return gameDurationObj.copy(gamePlayTimeObj, gameTimeObj);
    }

    @e
    public final GamePlayTimeObj component1() {
        return this.play_time;
    }

    @e
    public final GameTimeObj component2() {
        return this.game_time;
    }

    @d
    public final GameDurationObj copy(@e GamePlayTimeObj gamePlayTimeObj, @e GameTimeObj gameTimeObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{gamePlayTimeObj, gameTimeObj}, this, changeQuickRedirect, false, 14821, new Class[]{GamePlayTimeObj.class, GameTimeObj.class}, GameDurationObj.class);
        return patchProxyResultProxy.isSupported ? (GameDurationObj) patchProxyResultProxy.result : new GameDurationObj(gamePlayTimeObj, gameTimeObj);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14825, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GameDurationObj)) {
            return false;
        }
        GameDurationObj gameDurationObj = (GameDurationObj) obj;
        return f0.g(this.play_time, gameDurationObj.play_time) && f0.g(this.game_time, gameDurationObj.game_time);
    }

    @e
    public final GameTimeObj getGame_time() {
        return this.game_time;
    }

    @e
    public final GamePlayTimeObj getPlay_time() {
        return this.play_time;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14824, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        GamePlayTimeObj gamePlayTimeObj = this.play_time;
        int iHashCode = (gamePlayTimeObj == null ? 0 : gamePlayTimeObj.hashCode()) * 31;
        GameTimeObj gameTimeObj = this.game_time;
        return iHashCode + (gameTimeObj != null ? gameTimeObj.hashCode() : 0);
    }

    public final void setGame_time(@e GameTimeObj gameTimeObj) {
        this.game_time = gameTimeObj;
    }

    public final void setPlay_time(@e GamePlayTimeObj gamePlayTimeObj) {
        this.play_time = gamePlayTimeObj;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14823, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "GameDurationObj(play_time=" + this.play_time + ", game_time=" + this.game_time + ')';
    }
}
