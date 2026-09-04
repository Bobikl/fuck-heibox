package com.max.xiaoheihe.bean.bbs;

import androidx.annotation.p0;
import com.max.hbcustomview.indexbar.bean.BaseIndexPinyinBean;
import com.max.xiaoheihe.bean.EntryObj;
import com.meituan.robust.ChangeQuickRedirect;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class WikiListObj extends BaseIndexPinyinBean {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String admin_num;
    private String appicon;
    private String appid;
    private String article_num;
    private String bg_img;
    private String custom_index;
    private String custom_suggested_from;
    private String edit_num;
    private String game_type;
    private String h_src;
    private String head_image;
    private List<WikiArticelObj> hot_articles;
    private String name;
    private String report_id;
    private Boolean showDivider = Boolean.TRUE;
    private List<EntryObj> title_list;
    private String up_right_tag;
    private String up_right_tag_end_color;
    private String up_right_tag_start_color;
    private String url;

    public String getAdmin_num() {
        return this.admin_num;
    }

    public String getAppicon() {
        return this.appicon;
    }

    public String getAppid() {
        return this.appid;
    }

    public String getArticle_num() {
        return this.article_num;
    }

    public String getBg_img() {
        return this.bg_img;
    }

    public String getCustom_index() {
        return this.custom_index;
    }

    public String getCustom_suggested_from() {
        return this.custom_suggested_from;
    }

    public String getEdit_num() {
        return this.edit_num;
    }

    public String getGame_type() {
        return this.game_type;
    }

    public String getH_src() {
        return this.h_src;
    }

    public String getHead_image() {
        return this.head_image;
    }

    public List<WikiArticelObj> getHot_articles() {
        return this.hot_articles;
    }

    public String getName() {
        return this.name;
    }

    @p0
    public String getReport_id() {
        return this.report_id;
    }

    public Boolean getShowDivider() {
        return this.showDivider;
    }

    @Override // com.max.hbcustomview.indexbar.a
    public String getTarget() {
        return this.name;
    }

    public List<EntryObj> getTitle_list() {
        return this.title_list;
    }

    public String getUp_right_tag() {
        return this.up_right_tag;
    }

    public String getUp_right_tag_end_color() {
        return this.up_right_tag_end_color;
    }

    public String getUp_right_tag_start_color() {
        return this.up_right_tag_start_color;
    }

    public String getUrl() {
        return this.url;
    }

    public void setAdmin_num(String str) {
        this.admin_num = str;
    }

    public void setAppicon(String str) {
        this.appicon = str;
    }

    public void setAppid(String str) {
        this.appid = str;
    }

    public void setArticle_num(String str) {
        this.article_num = str;
    }

    public void setBg_img(String str) {
        this.bg_img = str;
    }

    public void setCustom_index(String str) {
        this.custom_index = str;
    }

    public void setCustom_suggested_from(String str) {
        this.custom_suggested_from = str;
    }

    public void setEdit_num(String str) {
        this.edit_num = str;
    }

    public void setGame_type(String str) {
        this.game_type = str;
    }

    public void setH_src(String str) {
        this.h_src = str;
    }

    public void setHead_image(String str) {
        this.head_image = str;
    }

    public void setHot_articles(List<WikiArticelObj> list) {
        this.hot_articles = list;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setReport_id(@p0 String str) {
        this.report_id = str;
    }

    public void setShowDivider(Boolean bool) {
        this.showDivider = bool;
    }

    public void setTitle_list(List<EntryObj> list) {
        this.title_list = list;
    }

    public void setUp_right_tag(String str) {
        this.up_right_tag = str;
    }

    public void setUp_right_tag_end_color(String str) {
        this.up_right_tag_end_color = str;
    }

    public void setUp_right_tag_start_color(String str) {
        this.up_right_tag_start_color = str;
    }

    public void setUrl(String str) {
        this.url = str;
    }
}
