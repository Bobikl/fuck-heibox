package com.max.xiaoheihe.bean.game;

import com.max.hbwallet.bean.MallCouponObj;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class GameRollItemWrapperObj implements Serializable {
    public static final int ITEM_TYPE_ADD_ITEM = 1;
    public static final int ITEM_TYPE_ROLL_ITEM = 0;
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -5048479217483912796L;
    private MallCouponObj item;
    private int itemType;

    public MallCouponObj getItem() {
        return this.item;
    }

    public int getItemType() {
        return this.itemType;
    }

    public void setItem(MallCouponObj mallCouponObj) {
        this.item = mallCouponObj;
    }

    public void setItemType(int i10) {
        this.itemType = i10;
    }
}
