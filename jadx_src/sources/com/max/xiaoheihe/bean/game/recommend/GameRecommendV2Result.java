package com.max.xiaoheihe.bean.game.recommend;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: GameRecommendV2Result.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class GameRecommendV2Result implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private List<GameRecommendBaseObj> all_list;

    public GameRecommendV2Result(@e List<GameRecommendBaseObj> list) {
        this.all_list = list;
    }

    public static /* synthetic */ GameRecommendV2Result copy$default(GameRecommendV2Result gameRecommendV2Result, List list, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{gameRecommendV2Result, list, new Integer(i10), obj}, null, changeQuickRedirect, true, 15374, new Class[]{GameRecommendV2Result.class, List.class, Integer.TYPE, Object.class}, GameRecommendV2Result.class);
        if (patchProxyResultProxy.isSupported) {
            return (GameRecommendV2Result) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            list = gameRecommendV2Result.all_list;
        }
        return gameRecommendV2Result.copy(list);
    }

    @e
    public final List<GameRecommendBaseObj> component1() {
        return this.all_list;
    }

    @d
    public final GameRecommendV2Result copy(@e List<GameRecommendBaseObj> list) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 15373, new Class[]{List.class}, GameRecommendV2Result.class);
        return patchProxyResultProxy.isSupported ? (GameRecommendV2Result) patchProxyResultProxy.result : new GameRecommendV2Result(list);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15377, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        return (obj instanceof GameRecommendV2Result) && f0.g(this.all_list, ((GameRecommendV2Result) obj).all_list);
    }

    @e
    public final List<GameRecommendBaseObj> getAll_list() {
        return this.all_list;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15376, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        List<GameRecommendBaseObj> list = this.all_list;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final void setAll_list(@e List<GameRecommendBaseObj> list) {
        this.all_list = list;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15375, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "GameRecommendV2Result(all_list=" + this.all_list + ')';
    }
}
