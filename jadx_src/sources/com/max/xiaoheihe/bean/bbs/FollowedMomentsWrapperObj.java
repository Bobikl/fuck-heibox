package com.max.xiaoheihe.bean.bbs;

import com.meituan.robust.ChangeQuickRedirect;

/* JADX INFO: loaded from: classes3.dex */
public class FollowedMomentsWrapperObj {
    public static final int ITEM_TYPE_MOMENTS = 0;
    public static final int ITEM_TYPE_REC_USERS = 1;
    public static ChangeQuickRedirect changeQuickRedirect;
    private int itemType;
    private BBSFollowedMomentObj moments;
    private BBSRecommendUserObj recUsers;

    public int getItemType() {
        return this.itemType;
    }

    public BBSFollowedMomentObj getMoments() {
        return this.moments;
    }

    public BBSRecommendUserObj getRecUsers() {
        return this.recUsers;
    }

    public void setItemType(int i10) {
        this.itemType = i10;
    }

    public void setMoments(BBSFollowedMomentObj bBSFollowedMomentObj) {
        this.moments = bBSFollowedMomentObj;
    }

    public void setRecUsers(BBSRecommendUserObj bBSRecommendUserObj) {
        this.recUsers = bBSRecommendUserObj;
    }
}
