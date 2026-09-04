package com.max.xiaoheihe.bean.news;

import com.max.xiaoheihe.bean.game.GameObj;
import com.meituan.robust.ChangeQuickRedirect;

/* JADX INFO: loaded from: classes3.dex */
public class FeedsContentGameObj extends FeedsContentBaseObj {
    public static ChangeQuickRedirect changeQuickRedirect;
    private GameObj game;
    private String overlay_color;

    public GameObj getGame() {
        return this.game;
    }

    public String getOverlay_color() {
        return this.overlay_color;
    }

    public void setGame(GameObj gameObj) {
        this.game = gameObj;
    }

    public void setOverlay_color(String str) {
        this.overlay_color = str;
    }
}
