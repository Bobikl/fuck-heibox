package com.max.xiaoheihe.bean.game.gameoverview;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.e;
import java.util.List;

/* JADX INFO: compiled from: GameOverviewUserListObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class GameOverviewUserListObj extends BaseGameOverviewObj {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;
    private boolean isTeammate = true;

    @e
    private List<Dota2UserObj> opponents;

    @e
    private List<Dota2UserObj> teammates;

    @e
    private String title;

    public final int getCurrentSize() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15244, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        if (this.isTeammate) {
            List<Dota2UserObj> list = this.teammates;
            if (list != null) {
                return list.size();
            }
            return 0;
        }
        List<Dota2UserObj> list2 = this.opponents;
        if (list2 != null) {
            return list2.size();
        }
        return 0;
    }

    public final int getCurrentTab() {
        return !this.isTeammate ? 1 : 0;
    }

    @e
    public final List<Dota2UserObj> getOpponents() {
        return this.opponents;
    }

    @e
    public final List<Dota2UserObj> getTeammates() {
        return this.teammates;
    }

    @e
    public final String getTitle() {
        return this.title;
    }

    public final boolean isTeammate() {
        return this.isTeammate;
    }

    public final void setOpponents(@e List<Dota2UserObj> list) {
        this.opponents = list;
    }

    public final void setTeammate(boolean z10) {
        this.isTeammate = z10;
    }

    public final void setTeammates(@e List<Dota2UserObj> list) {
        this.teammates = list;
    }

    public final void setTitle(@e String str) {
        this.title = str;
    }
}
