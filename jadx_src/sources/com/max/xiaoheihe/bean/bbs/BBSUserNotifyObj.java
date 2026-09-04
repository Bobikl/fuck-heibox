package com.max.xiaoheihe.bean.bbs;

import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: loaded from: classes3.dex */
public class BBSUserNotifyObj {
    public static ChangeQuickRedirect changeQuickRedirect;

    @SerializedName(alternate = {"app_id"}, value = "appid")
    private String appid;
    private String create_at;
    private String h_src;
    private String has_video;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private String f76959id;
    private String img;
    private int index;
    private String link_tag;
    private String maxjia;
    private String obj_content;
    private String obj_id;
    private String obj_type;
    private String official_type;
    private String protocol;
    private JsonObject report_extra;
    private transient boolean reported_exposure;
    private String sender_avatar;
    private String sender_id;
    private String sender_name;

    @SerializedName("sku_id")
    private String skuId;
    private String state;
    private String text;
    private String thumb;
    private String thumb_size;
    private String timestamp;
    private String title;
    private String type;
    private String user_protocol;
    private String userid;

    public String getAppid() {
        return this.appid;
    }

    public String getCreate_at() {
        return this.create_at;
    }

    public String getH_src() {
        return this.h_src;
    }

    public String getHas_video() {
        return this.has_video;
    }

    public String getId() {
        return this.f76959id;
    }

    public String getImg() {
        return this.img;
    }

    public int getIndex() {
        return this.index;
    }

    public String getLink_tag() {
        return this.link_tag;
    }

    public String getMaxjia() {
        return this.maxjia;
    }

    public String getObj_content() {
        return this.obj_content;
    }

    public String getObj_id() {
        return this.obj_id;
    }

    public String getObj_type() {
        return this.obj_type;
    }

    public String getOfficial_type() {
        return this.official_type;
    }

    public String getProtocol() {
        return this.protocol;
    }

    public JsonObject getReportAddition() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14205, new Class[0], JsonObject.class);
        if (patchProxyResultProxy.isSupported) {
            return (JsonObject) patchProxyResultProxy.result;
        }
        JsonObject jsonObject = this.report_extra;
        JsonObject jsonObject2 = jsonObject == null ? new JsonObject() : jsonObject.deepCopy();
        jsonObject2.addProperty("idx", Integer.valueOf(this.index));
        jsonObject2.addProperty("h_src", this.h_src);
        jsonObject2.addProperty("official_type", this.official_type);
        return jsonObject2;
    }

    public JsonObject getReport_extra() {
        return this.report_extra;
    }

    public String getSender_avatar() {
        return this.sender_avatar;
    }

    public String getSender_id() {
        return this.sender_id;
    }

    public String getSender_name() {
        return this.sender_name;
    }

    public String getSkuId() {
        return this.skuId;
    }

    public String getState() {
        return this.state;
    }

    public String getText() {
        return this.text;
    }

    public String getThumb() {
        return this.thumb;
    }

    public String getThumb_size() {
        return this.thumb_size;
    }

    public String getTimestamp() {
        return this.timestamp;
    }

    public String getTitle() {
        return this.title;
    }

    public String getType() {
        return this.type;
    }

    public String getUser_protocol() {
        return this.user_protocol;
    }

    public String getUserid() {
        return this.userid;
    }

    public boolean isReported_exposure() {
        return this.reported_exposure;
    }

    public void setAppid(String str) {
        this.appid = str;
    }

    public void setCreate_at(String str) {
        this.create_at = str;
    }

    public void setH_src(String str) {
        this.h_src = str;
    }

    public void setHas_video(String str) {
        this.has_video = str;
    }

    public void setId(String str) {
        this.f76959id = str;
    }

    public void setImg(String str) {
        this.img = str;
    }

    public void setIndex(int i10) {
        this.index = i10;
    }

    public void setLink_tag(String str) {
        this.link_tag = str;
    }

    public void setMaxjia(String str) {
        this.maxjia = str;
    }

    public void setObj_content(String str) {
        this.obj_content = str;
    }

    public void setObj_id(String str) {
        this.obj_id = str;
    }

    public void setObj_type(String str) {
        this.obj_type = str;
    }

    public void setOfficial_type(String str) {
        this.official_type = str;
    }

    public void setProtocol(String str) {
        this.protocol = str;
    }

    public void setReport_extra(JsonObject jsonObject) {
        this.report_extra = jsonObject;
    }

    public void setReported_exposure(boolean z10) {
        this.reported_exposure = z10;
    }

    public void setSender_avatar(String str) {
        this.sender_avatar = str;
    }

    public void setSender_id(String str) {
        this.sender_id = str;
    }

    public void setSender_name(String str) {
        this.sender_name = str;
    }

    public void setSkuId(String str) {
        this.skuId = str;
    }

    public void setState(String str) {
        this.state = str;
    }

    public void setText(String str) {
        this.text = str;
    }

    public void setThumb(String str) {
        this.thumb = str;
    }

    public void setThumb_size(String str) {
        this.thumb_size = str;
    }

    public void setTimestamp(String str) {
        this.timestamp = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setType(String str) {
        this.type = str;
    }

    public void setUser_protocol(String str) {
        this.user_protocol = str;
    }

    public void setUserid(String str) {
        this.userid = str;
    }
}
