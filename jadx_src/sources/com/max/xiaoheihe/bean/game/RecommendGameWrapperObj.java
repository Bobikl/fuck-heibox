package com.max.xiaoheihe.bean.game;

import com.meituan.robust.ChangeQuickRedirect;

/* JADX INFO: loaded from: classes3.dex */
public class RecommendGameWrapperObj {
    public static final int ITEM_RECOMMEND_CATEGORY = 0;
    public static final int ITEM_RECOMMEND_GAME = 1;
    public static final int ITEM_TITLE = 2;
    public static ChangeQuickRedirect changeQuickRedirect;
    private int itemType;
    private AllRecommendGameCategoryObj recommendCategory;
    private RecommendGameListItemObj recommendGame;
    private int recommendIndex;
    private String title;

    public int getItemType() {
        return this.itemType;
    }

    public AllRecommendGameCategoryObj getRecommendCategory() {
        return this.recommendCategory;
    }

    public RecommendGameListItemObj getRecommendGame() {
        return this.recommendGame;
    }

    public int getRecommendIndex() {
        return this.recommendIndex;
    }

    public String getTitle() {
        return this.title;
    }

    public void setItemType(int i10) {
        this.itemType = i10;
    }

    public void setRecommendCategory(AllRecommendGameCategoryObj allRecommendGameCategoryObj) {
        this.recommendCategory = allRecommendGameCategoryObj;
    }

    public void setRecommendGame(RecommendGameListItemObj recommendGameListItemObj) {
        this.recommendGame = recommendGameListItemObj;
    }

    public void setRecommendIndex(int i10) {
        this.recommendIndex = i10;
    }

    public void setTitle(String str) {
        this.title = str;
    }
}
