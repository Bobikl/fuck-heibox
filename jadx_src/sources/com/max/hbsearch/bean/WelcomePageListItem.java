package com.max.hbsearch.bean;

import bb.c;
import com.google.gson.JsonObject;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: SearchHotWelcomObj.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class WelcomePageListItem implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private HotSearchListItemColor background_color;

    @e
    private String desc;

    @e
    private String icon;

    @e
    private HotSearchListItemImage image;

    @e
    private HotSearchListItemColor index_color;

    @e
    private String proto;

    @e
    private JsonObject report;

    @e
    private HotSearchListItemTag right_tag;

    @e
    private String text;

    public WelcomePageListItem(@e HotSearchListItemImage hotSearchListItemImage, @e String str, @e String str2, @e HotSearchListItemTag hotSearchListItemTag, @e HotSearchListItemColor hotSearchListItemColor, @e HotSearchListItemColor hotSearchListItemColor2, @e String str3, @e JsonObject jsonObject, @e String str4) {
        this.image = hotSearchListItemImage;
        this.text = str;
        this.icon = str2;
        this.right_tag = hotSearchListItemTag;
        this.index_color = hotSearchListItemColor;
        this.background_color = hotSearchListItemColor2;
        this.proto = str3;
        this.report = jsonObject;
        this.desc = str4;
    }

    public static /* synthetic */ WelcomePageListItem copy$default(WelcomePageListItem welcomePageListItem, HotSearchListItemImage hotSearchListItemImage, String str, String str2, HotSearchListItemTag hotSearchListItemTag, HotSearchListItemColor hotSearchListItemColor, HotSearchListItemColor hotSearchListItemColor2, String str3, JsonObject jsonObject, String str4, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{welcomePageListItem, hotSearchListItemImage, str, str2, hotSearchListItemTag, hotSearchListItemColor, hotSearchListItemColor2, str3, jsonObject, str4, new Integer(i10), obj}, null, changeQuickRedirect, true, c.k.X7, new Class[]{WelcomePageListItem.class, HotSearchListItemImage.class, String.class, String.class, HotSearchListItemTag.class, HotSearchListItemColor.class, HotSearchListItemColor.class, String.class, JsonObject.class, String.class, Integer.TYPE, Object.class}, WelcomePageListItem.class);
        if (patchProxyResultProxy.isSupported) {
            return (WelcomePageListItem) patchProxyResultProxy.result;
        }
        return welcomePageListItem.copy((i10 & 1) != 0 ? welcomePageListItem.image : hotSearchListItemImage, (i10 & 2) != 0 ? welcomePageListItem.text : str, (i10 & 4) != 0 ? welcomePageListItem.icon : str2, (i10 & 8) != 0 ? welcomePageListItem.right_tag : hotSearchListItemTag, (i10 & 16) != 0 ? welcomePageListItem.index_color : hotSearchListItemColor, (i10 & 32) != 0 ? welcomePageListItem.background_color : hotSearchListItemColor2, (i10 & 64) != 0 ? welcomePageListItem.proto : str3, (i10 & 128) != 0 ? welcomePageListItem.report : jsonObject, (i10 & 256) != 0 ? welcomePageListItem.desc : str4);
    }

    @e
    public final HotSearchListItemImage component1() {
        return this.image;
    }

    @e
    public final String component2() {
        return this.text;
    }

    @e
    public final String component3() {
        return this.icon;
    }

    @e
    public final HotSearchListItemTag component4() {
        return this.right_tag;
    }

    @e
    public final HotSearchListItemColor component5() {
        return this.index_color;
    }

    @e
    public final HotSearchListItemColor component6() {
        return this.background_color;
    }

    @e
    public final String component7() {
        return this.proto;
    }

    @e
    public final JsonObject component8() {
        return this.report;
    }

    @e
    public final String component9() {
        return this.desc;
    }

    @d
    public final WelcomePageListItem copy(@e HotSearchListItemImage hotSearchListItemImage, @e String str, @e String str2, @e HotSearchListItemTag hotSearchListItemTag, @e HotSearchListItemColor hotSearchListItemColor, @e HotSearchListItemColor hotSearchListItemColor2, @e String str3, @e JsonObject jsonObject, @e String str4) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{hotSearchListItemImage, str, str2, hotSearchListItemTag, hotSearchListItemColor, hotSearchListItemColor2, str3, jsonObject, str4}, this, changeQuickRedirect, false, c.k.W7, new Class[]{HotSearchListItemImage.class, String.class, String.class, HotSearchListItemTag.class, HotSearchListItemColor.class, HotSearchListItemColor.class, String.class, JsonObject.class, String.class}, WelcomePageListItem.class);
        return patchProxyResultProxy.isSupported ? (WelcomePageListItem) patchProxyResultProxy.result : new WelcomePageListItem(hotSearchListItemImage, str, str2, hotSearchListItemTag, hotSearchListItemColor, hotSearchListItemColor2, str3, jsonObject, str4);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, c.k.f33429a8, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WelcomePageListItem)) {
            return false;
        }
        WelcomePageListItem welcomePageListItem = (WelcomePageListItem) obj;
        return f0.g(this.image, welcomePageListItem.image) && f0.g(this.text, welcomePageListItem.text) && f0.g(this.icon, welcomePageListItem.icon) && f0.g(this.right_tag, welcomePageListItem.right_tag) && f0.g(this.index_color, welcomePageListItem.index_color) && f0.g(this.background_color, welcomePageListItem.background_color) && f0.g(this.proto, welcomePageListItem.proto) && f0.g(this.report, welcomePageListItem.report) && f0.g(this.desc, welcomePageListItem.desc);
    }

    @e
    public final HotSearchListItemColor getBackground_color() {
        return this.background_color;
    }

    @e
    public final String getDesc() {
        return this.desc;
    }

    @e
    public final String getIcon() {
        return this.icon;
    }

    @e
    public final HotSearchListItemImage getImage() {
        return this.image;
    }

    @e
    public final HotSearchListItemColor getIndex_color() {
        return this.index_color;
    }

    @e
    public final String getProto() {
        return this.proto;
    }

    @e
    public final JsonObject getReport() {
        return this.report;
    }

    @e
    public final HotSearchListItemTag getRight_tag() {
        return this.right_tag;
    }

    @e
    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.k.Z7, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        HotSearchListItemImage hotSearchListItemImage = this.image;
        int iHashCode = (hotSearchListItemImage == null ? 0 : hotSearchListItemImage.hashCode()) * 31;
        String str = this.text;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.icon;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        HotSearchListItemTag hotSearchListItemTag = this.right_tag;
        int iHashCode4 = (iHashCode3 + (hotSearchListItemTag == null ? 0 : hotSearchListItemTag.hashCode())) * 31;
        HotSearchListItemColor hotSearchListItemColor = this.index_color;
        int iHashCode5 = (iHashCode4 + (hotSearchListItemColor == null ? 0 : hotSearchListItemColor.hashCode())) * 31;
        HotSearchListItemColor hotSearchListItemColor2 = this.background_color;
        int iHashCode6 = (iHashCode5 + (hotSearchListItemColor2 == null ? 0 : hotSearchListItemColor2.hashCode())) * 31;
        String str3 = this.proto;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        JsonObject jsonObject = this.report;
        int iHashCode8 = (iHashCode7 + (jsonObject == null ? 0 : jsonObject.hashCode())) * 31;
        String str4 = this.desc;
        return iHashCode8 + (str4 != null ? str4.hashCode() : 0);
    }

    public final void setBackground_color(@e HotSearchListItemColor hotSearchListItemColor) {
        this.background_color = hotSearchListItemColor;
    }

    public final void setDesc(@e String str) {
        this.desc = str;
    }

    public final void setIcon(@e String str) {
        this.icon = str;
    }

    public final void setImage(@e HotSearchListItemImage hotSearchListItemImage) {
        this.image = hotSearchListItemImage;
    }

    public final void setIndex_color(@e HotSearchListItemColor hotSearchListItemColor) {
        this.index_color = hotSearchListItemColor;
    }

    public final void setProto(@e String str) {
        this.proto = str;
    }

    public final void setReport(@e JsonObject jsonObject) {
        this.report = jsonObject;
    }

    public final void setRight_tag(@e HotSearchListItemTag hotSearchListItemTag) {
        this.right_tag = hotSearchListItemTag;
    }

    public final void setText(@e String str) {
        this.text = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.k.Y7, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "WelcomePageListItem(image=" + this.image + ", text=" + this.text + ", icon=" + this.icon + ", right_tag=" + this.right_tag + ", index_color=" + this.index_color + ", background_color=" + this.background_color + ", proto=" + this.proto + ", report=" + this.report + ", desc=" + this.desc + ')';
    }
}
