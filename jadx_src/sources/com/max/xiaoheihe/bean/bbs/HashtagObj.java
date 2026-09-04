package com.max.xiaoheihe.bean.bbs;

import com.google.gson.annotations.SerializedName;
import com.max.hbsearch.l;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.tencent.open.SocialConstants;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class HashtagObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -1399527266019226613L;
    private String act_protocol;
    private String bg_ed_color;
    private String bg_img;
    private String bg_offset_img;
    private String bg_st_color;
    private String create_at;

    @SerializedName(alternate = {"description"}, value = SocialConstants.PARAM_APP_DESC)
    private String desc;
    private String display_name;
    private String end_color;
    private String hot_value;
    private String icon;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @SerializedName(alternate = {l.f72324c0}, value = "id")
    private String f76962id;
    private String is_deleted;
    private String long_desc;
    private String name;
    private HashtagNumObj num;
    private HashPostLinkInfoObj post_link_info;
    private String rank_trend;

    @SerializedName("rec_src")
    private String recSrc;
    private Boolean showDivider = Boolean.TRUE;
    private String start_color;
    private String sub_title;
    private String type;

    public String getAct_protocol() {
        return this.act_protocol;
    }

    public String getBg_ed_color() {
        return this.bg_ed_color;
    }

    public String getBg_img() {
        return this.bg_img;
    }

    public String getBg_offset_img() {
        return this.bg_offset_img;
    }

    public String getBg_st_color() {
        return this.bg_st_color;
    }

    public String getCreate_at() {
        return this.create_at;
    }

    public String getDesc() {
        return this.desc;
    }

    public String getDisplay_name() {
        return this.display_name;
    }

    public String getEnd_color() {
        return this.end_color;
    }

    public String getHot_value() {
        return this.hot_value;
    }

    public String getIcon() {
        return this.icon;
    }

    public String getId() {
        return this.f76962id;
    }

    public String getIs_deleted() {
        return this.is_deleted;
    }

    public String getLong_desc() {
        return this.long_desc;
    }

    public String getName() {
        return this.name;
    }

    public HashtagNumObj getNum() {
        return this.num;
    }

    public HashPostLinkInfoObj getPost_link_info() {
        return this.post_link_info;
    }

    public String getRank_trend() {
        return this.rank_trend;
    }

    public String getRecSrc() {
        return this.recSrc;
    }

    public Boolean getShowDivider() {
        return this.showDivider;
    }

    public String getStart_color() {
        return this.start_color;
    }

    public String getSub_title() {
        return this.sub_title;
    }

    public String getType() {
        return this.type;
    }

    public void setAct_protocol(String str) {
        this.act_protocol = str;
    }

    public void setBg_ed_color(String str) {
        this.bg_ed_color = str;
    }

    public void setBg_img(String str) {
        this.bg_img = str;
    }

    public void setBg_offset_img(String str) {
        this.bg_offset_img = str;
    }

    public void setBg_st_color(String str) {
        this.bg_st_color = str;
    }

    public void setCreate_at(String str) {
        this.create_at = str;
    }

    public void setDesc(String str) {
        this.desc = str;
    }

    public void setDisplay_name(String str) {
        this.display_name = str;
    }

    public void setEnd_color(String str) {
        this.end_color = str;
    }

    public void setHot_value(String str) {
        this.hot_value = str;
    }

    public void setIcon(String str) {
        this.icon = str;
    }

    public void setId(String str) {
        this.f76962id = str;
    }

    public void setIs_deleted(String str) {
        this.is_deleted = str;
    }

    public void setLong_desc(String str) {
        this.long_desc = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setNum(HashtagNumObj hashtagNumObj) {
        this.num = hashtagNumObj;
    }

    public void setPost_link_info(HashPostLinkInfoObj hashPostLinkInfoObj) {
        this.post_link_info = hashPostLinkInfoObj;
    }

    public void setRank_trend(String str) {
        this.rank_trend = str;
    }

    public void setRecSrc(String str) {
        this.recSrc = str;
    }

    public void setShowDivider(Boolean bool) {
        this.showDivider = bool;
    }

    public void setStart_color(String str) {
        this.start_color = str;
    }

    public void setSub_title(String str) {
        this.sub_title = str;
    }

    public void setType(String str) {
        this.type = str;
    }

    public ConceptPostTagObj toConceptPostTagObj() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14301, new Class[0], ConceptPostTagObj.class);
        return patchProxyResultProxy.isSupported ? (ConceptPostTagObj) patchProxyResultProxy.result : new ConceptPostTagObj(this.name, this.type, this.f76962id, this.icon, this.sub_title, this.start_color, this.end_color, null, null);
    }
}
