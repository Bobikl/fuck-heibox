package com.max.xiaoheihe.bean.game;

import com.max.xiaoheihe.bean.bbs.TopicNavObj;
import com.meituan.robust.ChangeQuickRedirect;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class GameMobileBundleWrapperObj {
    public static final int ITEM_BUNDLE = 0;
    public static final int ITEM_HEADER = 1;
    public static final int ITEM_TITLE = 2;
    public static ChangeQuickRedirect changeQuickRedirect;
    private GameMobileBundleObj bundle;
    private List<TopicNavObj> header;
    private int itemType;
    private GameMobileBundleTitleObj title;

    public GameMobileBundleObj getBundle() {
        return this.bundle;
    }

    public List<TopicNavObj> getHeader() {
        return this.header;
    }

    public int getItemType() {
        return this.itemType;
    }

    public GameMobileBundleTitleObj getTitle() {
        return this.title;
    }

    public void setBundle(GameMobileBundleObj gameMobileBundleObj) {
        this.bundle = gameMobileBundleObj;
    }

    public void setHeader(List<TopicNavObj> list) {
        this.header = list;
    }

    public void setItemType(int i10) {
        this.itemType = i10;
    }

    public void setTitle(GameMobileBundleTitleObj gameMobileBundleTitleObj) {
        this.title = gameMobileBundleTitleObj;
    }
}
