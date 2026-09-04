package com.max.xiaoheihe.bean.game.recommend;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.e;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: GameCardVideoObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class GameCardVideoObj extends GameCardObj {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private GameCardVideoMovieObj movie;

    @Override // com.max.xiaoheihe.bean.game.recommend.GameCardObj, com.max.xiaoheihe.bean.game.recommend.GameRecommendBaseObj
    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15361, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        return (obj instanceof GameCardVideoObj) && super.equals(obj) && f0.g(this.movie, ((GameCardVideoObj) obj).movie);
    }

    @e
    public final GameCardVideoMovieObj getMovie() {
        return this.movie;
    }

    @Override // com.max.xiaoheihe.bean.game.recommend.GameCardObj, com.max.xiaoheihe.bean.game.recommend.GameRecommendBaseObj
    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15362, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        int iHashCode = super.hashCode() * 31;
        GameCardVideoMovieObj gameCardVideoMovieObj = this.movie;
        return iHashCode + (gameCardVideoMovieObj != null ? gameCardVideoMovieObj.hashCode() : 0);
    }

    public final void setMovie(@e GameCardVideoMovieObj gameCardVideoMovieObj) {
        this.movie = gameCardVideoMovieObj;
    }
}
