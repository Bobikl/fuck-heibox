package com.max.hbstory.bean;

import bb.c;
import com.alibaba.fastjson.annotation.JSONField;
import com.google.gson.annotations.SerializedName;
import com.max.xiaoheihe.module.game.nswitch.SwitchDetailActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.tencent.open.SocialConstants;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes13.dex */
public class KeyDescObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 5595148558874905929L;
    private boolean checked;
    private String color;
    private List<KeyDescObj> data;
    private String desc;

    @SerializedName(alternate = {"cancelable"}, value = "enable")
    @JSONField(alternateNames = {"cancelable"}, name = "enable")
    private String enable;
    private String enabled;
    private String filter_head;
    private String icon;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private String f72835id;

    @SerializedName(alternate = {"img_url"}, value = SocialConstants.PARAM_IMG_URL)
    @JSONField(alternateNames = {"img_url"}, name = SocialConstants.PARAM_IMG_URL)
    private String img;
    private int index;
    private boolean is_default;

    @SerializedName(alternate = {"k"}, value = "key")
    @JSONField(alternateNames = {"k"}, name = "key")
    private String key;
    private String list_type;
    private String multi;
    private String name;
    private String num;

    @SerializedName(alternate = {"prot"}, value = SwitchDetailActivity.P)
    @JSONField(alternateNames = {"prot"}, name = SwitchDetailActivity.P)
    private String protocol;
    private String selected;
    private boolean showIcon;
    private String sort;
    private String status;
    private String text;
    private String title;
    private String type;
    private String url;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private String f72836v;

    @SerializedName(alternate = {"timestamp"}, value = "value")
    @JSONField(alternateNames = {"timestamp"}, name = "value")
    private String value;
    private boolean canClick = true;
    private int iconId = -1;

    public boolean equals(Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 8605, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KeyDescObj)) {
            return false;
        }
        KeyDescObj keyDescObj = (KeyDescObj) obj;
        return Objects.equals(getId(), keyDescObj.getId()) && Objects.equals(getDesc(), keyDescObj.getDesc()) && Objects.equals(getKey(), keyDescObj.getKey());
    }

    public String getColor() {
        return this.color;
    }

    public List<KeyDescObj> getData() {
        return this.data;
    }

    public String getDesc() {
        return this.desc;
    }

    public String getEnable() {
        return this.enable;
    }

    public String getEnabled() {
        return this.enabled;
    }

    public String getFilter_head() {
        return this.filter_head;
    }

    public String getIcon() {
        return this.icon;
    }

    public int getIconId() {
        return this.iconId;
    }

    public String getId() {
        return this.f72835id;
    }

    public String getImg() {
        return this.img;
    }

    public int getIndex() {
        return this.index;
    }

    public String getKey() {
        return this.key;
    }

    public String getList_type() {
        return this.list_type;
    }

    public String getMulti() {
        return this.multi;
    }

    public String getName() {
        return this.name;
    }

    public String getNum() {
        return this.num;
    }

    public String getProtocol() {
        return this.protocol;
    }

    public String getSelected() {
        return this.selected;
    }

    public String getSort() {
        return this.sort;
    }

    public String getStatus() {
        return this.status;
    }

    public String getText() {
        return this.text;
    }

    public String getTitle() {
        return this.title;
    }

    public String getType() {
        return this.type;
    }

    public String getUrl() {
        return this.url;
    }

    public String getV() {
        return this.f72836v;
    }

    public String getValue() {
        return this.value;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.k.Fd, new Class[0], Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : Objects.hash(getId(), getDesc(), getKey());
    }

    public boolean isCanClick() {
        return this.canClick;
    }

    public boolean isChecked() {
        return this.checked;
    }

    public boolean isIs_default() {
        return this.is_default;
    }

    public boolean isShowIcon() {
        return this.showIcon;
    }

    public void setCanClick(boolean z10) {
        this.canClick = z10;
    }

    public void setChecked(boolean z10) {
        this.checked = z10;
    }

    public void setColor(String str) {
        this.color = str;
    }

    public void setData(List<KeyDescObj> list) {
        this.data = list;
    }

    public void setDesc(String str) {
        this.desc = str;
    }

    public void setEnable(String str) {
        this.enable = str;
    }

    public void setEnabled(String str) {
        this.enabled = str;
    }

    public void setFilter_head(String str) {
        this.filter_head = str;
    }

    public void setIcon(String str) {
        this.icon = str;
    }

    public void setIconId(int i10) {
        this.iconId = i10;
    }

    public void setId(String str) {
        this.f72835id = str;
    }

    public void setImg(String str) {
        this.img = str;
    }

    public void setIndex(int i10) {
        this.index = i10;
    }

    public void setIs_default(boolean z10) {
        this.is_default = z10;
    }

    public void setKey(String str) {
        this.key = str;
    }

    public void setList_type(String str) {
        this.list_type = str;
    }

    public void setMulti(String str) {
        this.multi = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setNum(String str) {
        this.num = str;
    }

    public void setProtocol(String str) {
        this.protocol = str;
    }

    public void setSelected(String str) {
        this.selected = str;
    }

    public void setShowIcon(boolean z10) {
        this.showIcon = z10;
    }

    public void setSort(String str) {
        this.sort = str;
    }

    public void setStatus(String str) {
        this.status = str;
    }

    public void setText(String str) {
        this.text = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setType(String str) {
        this.type = str;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public void setV(String str) {
        this.f72836v = str;
    }

    public void setValue(String str) {
        this.value = str;
    }
}
