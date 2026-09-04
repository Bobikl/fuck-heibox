package com.max.xiaoheihe.bean.game.pubg;

import com.meituan.robust.ChangeQuickRedirect;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class PUBGGameStatsObj {
    public static ChangeQuickRedirect changeQuickRedirect;
    private List<PUBGGameModeObj> modes;

    public List<PUBGGameModeObj> getModes() {
        return this.modes;
    }

    public void setModes(List<PUBGGameModeObj> list) {
        this.modes = list;
    }
}
