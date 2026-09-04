package com.max.xiaoheihe.bean.game;

import com.meituan.robust.ChangeQuickRedirect;

/* JADX INFO: loaded from: classes3.dex */
public class GameReleaseScheduleObj {
    public static int ITEM_TYPE_ITEM = 0;
    public static int ITEM_TYPE_SECTION = 1;
    public static ChangeQuickRedirect changeQuickRedirect;
    private GameObj game;
    private int itemType = ITEM_TYPE_ITEM;
    private GameReleaseTimeObj time;

    public GameObj getGame() {
        return this.game;
    }

    public int getItemType() {
        return this.itemType;
    }

    public GameReleaseTimeObj getTime() {
        return this.time;
    }

    public void setGame(GameObj gameObj) {
        this.game = gameObj;
    }

    public void setItemType(int i10) {
        this.itemType = i10;
    }

    public void setTime(GameReleaseTimeObj gameReleaseTimeObj) {
        this.time = gameReleaseTimeObj;
    }
}
