package com.max.xiaoheihe.bean.game.gameoverview;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import dl.e;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: compiled from: Dota2UserListObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class Dota2UserListObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private List<Dota2UserObj> player_list;

    @e
    private String title;

    @e
    public final List<Dota2UserObj> getPlayer_list() {
        return this.player_list;
    }

    @e
    public final String getTitle() {
        return this.title;
    }

    public final void setPlayer_list(@e List<Dota2UserObj> list) {
        this.player_list = list;
    }

    public final void setTitle(@e String str) {
        this.title = str;
    }
}
