package com.max.xiaoheihe.bean.favour;

import com.max.xiaoheihe.bean.bbs.BBSLinkObj;
import com.meituan.robust.ChangeQuickRedirect;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class FavourLinksResult {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String fav_folder_num;
    private String fav_hashtag_num;
    private List<BBSLinkObj> favours;

    public String getFav_folder_num() {
        return this.fav_folder_num;
    }

    public String getFav_hashtag_num() {
        return this.fav_hashtag_num;
    }

    public List<BBSLinkObj> getFavours() {
        return this.favours;
    }

    public void setFav_folder_num(String str) {
        this.fav_folder_num = str;
    }

    public void setFav_hashtag_num(String str) {
        this.fav_hashtag_num = str;
    }

    public void setFavours(List<BBSLinkObj> list) {
        this.favours = list;
    }
}
