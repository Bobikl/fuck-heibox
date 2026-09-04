package com.max.xiaoheihe.bean.game;

import com.meituan.robust.ChangeQuickRedirect;

/* JADX INFO: loaded from: classes3.dex */
public class GameShoppingCartWrapperObj {
    public static final int ITEM_CART_ITEM = 0;
    public static final int ITEM_PLACEHOLDER = 3;
    public static final int ITEM_RECOMMEND_GAME = 1;
    public static final int ITEM_TITLE = 2;
    public static ChangeQuickRedirect changeQuickRedirect;
    private GameStoreOrderObj cartItem;
    private int itemType;
    private RecommendGameListItemObj recommendGame;
    private int recommendIndex;
    private String title;

    public GameStoreOrderObj getCartItem() {
        return this.cartItem;
    }

    public int getItemType() {
        return this.itemType;
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

    public void setCartItem(GameStoreOrderObj gameStoreOrderObj) {
        this.cartItem = gameStoreOrderObj;
    }

    public void setItemType(int i10) {
        this.itemType = i10;
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
