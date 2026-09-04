package com.max.hbsearch.bean;

import com.max.hbcommon.bean.AdsBannerObj;
import com.max.hbminiprogram.bean.MiniProgramObj;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class SearchHotwordsObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -2043791509127149888L;
    private List<AdsBannerObj> ads_banner;
    private String default_q;
    private List<SearchHotwordObj> hashtag_list;
    private HotSearchObj hot_discussion;
    private HotSearchObj hot_search;
    private List<SearchHotwordObj> list;
    private List<MiniProgramObj> mini_programs;

    public List<AdsBannerObj> getAds_banner() {
        return this.ads_banner;
    }

    public String getDefault_q() {
        return this.default_q;
    }

    public List<SearchHotwordObj> getHashtag_list() {
        return this.hashtag_list;
    }

    public HotSearchObj getHot_discussion() {
        return this.hot_discussion;
    }

    public HotSearchObj getHot_search() {
        return this.hot_search;
    }

    public List<SearchHotwordObj> getList() {
        return this.list;
    }

    public List<MiniProgramObj> getMini_programs() {
        return this.mini_programs;
    }

    public void setAds_banner(List<AdsBannerObj> list) {
        this.ads_banner = list;
    }

    public void setDefault_q(String str) {
        this.default_q = str;
    }

    public void setHashtag_list(List<SearchHotwordObj> list) {
        this.hashtag_list = list;
    }

    public void setHot_discussion(HotSearchObj hotSearchObj) {
        this.hot_discussion = hotSearchObj;
    }

    public void setHot_search(HotSearchObj hotSearchObj) {
        this.hot_search = hotSearchObj;
    }

    public void setList(List<SearchHotwordObj> list) {
        this.list = list;
    }

    public void setMini_programs(List<MiniProgramObj> list) {
        this.mini_programs = list;
    }
}
