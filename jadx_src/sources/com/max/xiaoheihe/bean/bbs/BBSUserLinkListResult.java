package com.max.xiaoheihe.bean.bbs;

import com.max.hbutils.bean.Result;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class BBSUserLinkListResult<T> extends Result<T> implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    private PostRecommendDetailObj empty_detail;
    private PostRecommendDetailObjV2 empty_detail_v2;
    private String lastval;
    private List<BBSFollowedMomentObj> moments;
    private List<BBSLinkObj> post_links;
    private BBSUserInfoObj user;

    public PostRecommendDetailObj getEmpty_detail() {
        return this.empty_detail;
    }

    public PostRecommendDetailObjV2 getEmpty_detail_v2() {
        return this.empty_detail_v2;
    }

    public String getLastval() {
        return this.lastval;
    }

    public List<BBSFollowedMomentObj> getMoments() {
        return this.moments;
    }

    public List<BBSLinkObj> getPost_links() {
        return this.post_links;
    }

    public BBSUserInfoObj getUser() {
        return this.user;
    }

    public void setEmpty_detail(PostRecommendDetailObj postRecommendDetailObj) {
        this.empty_detail = postRecommendDetailObj;
    }

    public void setEmpty_detail_v2(PostRecommendDetailObjV2 postRecommendDetailObjV2) {
        this.empty_detail_v2 = postRecommendDetailObjV2;
    }

    public void setLastval(String str) {
        this.lastval = str;
    }

    public void setMoments(List<BBSFollowedMomentObj> list) {
        this.moments = list;
    }

    public void setPost_links(List<BBSLinkObj> list) {
        this.post_links = list;
    }

    public void setUser(BBSUserInfoObj bBSUserInfoObj) {
        this.user = bBSUserInfoObj;
    }
}
