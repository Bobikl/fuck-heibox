package com.max.xiaoheihe.bean.game.recommend;

import androidx.compose.runtime.internal.o;
import com.max.hbutils.utils.n;
import com.max.xiaoheihe.bean.game.GameObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.e;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: GameListWithTabObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public class GameListWithTabObj extends GameRecommendBaseObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String current_tab;
    private boolean dirty;

    @e
    private ArrayList<GameTabListObj> tabs;

    @Override // com.max.xiaoheihe.bean.game.recommend.GameRecommendBaseObj
    public boolean equals(@e Object obj) {
        return this == obj;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0035  */
    public final int getCurrentSize() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15368, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        if (this.tabs == null) {
            return 0;
        }
        int iQ = n.q(this.current_tab);
        if (iQ >= 0) {
            ArrayList<GameTabListObj> arrayList = this.tabs;
            f0.m(arrayList);
            if (iQ >= arrayList.size()) {
                iQ = 0;
            }
        } else {
            iQ = 0;
        }
        ArrayList<GameTabListObj> arrayList2 = this.tabs;
        f0.m(arrayList2);
        List<GameObj> games = arrayList2.get(iQ).getGames();
        if (games != null) {
            return games.size();
        }
        return 0;
    }

    public final int getCurrentTab() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15367, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        int iQ = n.q(this.current_tab);
        if (iQ < 0) {
            return 0;
        }
        ArrayList<GameTabListObj> arrayList = this.tabs;
        f0.m(arrayList);
        if (iQ >= arrayList.size()) {
            return 0;
        }
        return iQ;
    }

    @e
    public final String getCurrent_tab() {
        return this.current_tab;
    }

    public final boolean getDirty() {
        return this.dirty;
    }

    @e
    public final ArrayList<GameTabListObj> getTabs() {
        return this.tabs;
    }

    @Override // com.max.xiaoheihe.bean.game.recommend.GameRecommendBaseObj
    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15369, new Class[0], Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : super.hashCode();
    }

    public final void setCurrent_tab(@e String str) {
        this.current_tab = str;
    }

    public final void setDirty(boolean z10) {
        this.dirty = z10;
    }

    public final void setTabs(@e ArrayList<GameTabListObj> arrayList) {
        this.tabs = arrayList;
    }
}
