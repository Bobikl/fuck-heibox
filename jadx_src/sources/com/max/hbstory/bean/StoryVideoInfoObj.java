package com.max.hbstory.bean;

import bb.c;
import com.alibaba.fastjson.annotation.JSONField;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: StoryData.kt */
/* JADX INFO: loaded from: classes13.dex */
public final class StoryVideoInfoObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;

    @SerializedName(alternate = {"thumb"}, value = "cover")
    @e
    private String cover;

    @e
    private String duration;
    private int height;

    @e
    private String link_id;

    @SerializedName(alternate = {"url"}, value = "play_url")
    @e
    private String play_url;
    private int width;

    public StoryVideoInfoObj(@e String str, int i10, @e @JSONField(alternateNames = {"url"}, name = "play_url") String str2, @e @JSONField(alternateNames = {"thumb"}, name = "cover") String str3, int i11, @e String str4) {
        this.duration = str;
        this.width = i10;
        this.play_url = str2;
        this.cover = str3;
        this.height = i11;
        this.link_id = str4;
    }

    public /* synthetic */ StoryVideoInfoObj(String str, int i10, String str2, String str3, int i11, String str4, int i12, u uVar) {
        this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? 0 : i10, (i12 & 4) != 0 ? null : str2, (i12 & 8) != 0 ? null : str3, (i12 & 16) != 0 ? 0 : i11, str4);
    }

    public static /* synthetic */ StoryVideoInfoObj copy$default(StoryVideoInfoObj storyVideoInfoObj, String str, int i10, String str2, String str3, int i11, String str4, int i12, Object obj) {
        int i13 = i10;
        int i14 = i11;
        Object[] objArr = {storyVideoInfoObj, str, new Integer(i13), str2, str3, new Integer(i14), str4, new Integer(i12), obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, c.k.Fe, new Class[]{StoryVideoInfoObj.class, String.class, cls, String.class, String.class, cls, String.class, cls, Object.class}, StoryVideoInfoObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (StoryVideoInfoObj) patchProxyResultProxy.result;
        }
        String str5 = (i12 & 1) != 0 ? storyVideoInfoObj.duration : str;
        if ((i12 & 2) != 0) {
            i13 = storyVideoInfoObj.width;
        }
        String str6 = (i12 & 4) != 0 ? storyVideoInfoObj.play_url : str2;
        String str7 = (i12 & 8) != 0 ? storyVideoInfoObj.cover : str3;
        if ((i12 & 16) != 0) {
            i14 = storyVideoInfoObj.height;
        }
        return storyVideoInfoObj.copy(str5, i13, str6, str7, i14, (i12 & 32) != 0 ? storyVideoInfoObj.link_id : str4);
    }

    public static /* synthetic */ StoryItemsObj toStoryItemsObj$default(StoryVideoInfoObj storyVideoInfoObj, boolean z10, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{storyVideoInfoObj, new Byte(z10 ? (byte) 1 : (byte) 0), new Integer(i10), obj}, null, changeQuickRedirect, true, c.k.De, new Class[]{StoryVideoInfoObj.class, Boolean.TYPE, Integer.TYPE, Object.class}, StoryItemsObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (StoryItemsObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return storyVideoInfoObj.toStoryItemsObj(z10);
    }

    @e
    public final String component1() {
        return this.duration;
    }

    public final int component2() {
        return this.width;
    }

    @e
    public final String component3() {
        return this.play_url;
    }

    @e
    public final String component4() {
        return this.cover;
    }

    public final int component5() {
        return this.height;
    }

    @e
    public final String component6() {
        return this.link_id;
    }

    @d
    public final StoryVideoInfoObj copy(@e String str, int i10, @e @JSONField(alternateNames = {"url"}, name = "play_url") String str2, @e @JSONField(alternateNames = {"thumb"}, name = "cover") String str3, int i11, @e String str4) {
        Object[] objArr = {str, new Integer(i10), str2, str3, new Integer(i11), str4};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, c.k.Ee, new Class[]{String.class, cls, String.class, String.class, cls, String.class}, StoryVideoInfoObj.class);
        return patchProxyResultProxy.isSupported ? (StoryVideoInfoObj) patchProxyResultProxy.result : new StoryVideoInfoObj(str, i10, str2, str3, i11, str4);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, c.k.Ie, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoryVideoInfoObj)) {
            return false;
        }
        StoryVideoInfoObj storyVideoInfoObj = (StoryVideoInfoObj) obj;
        return f0.g(this.duration, storyVideoInfoObj.duration) && this.width == storyVideoInfoObj.width && f0.g(this.play_url, storyVideoInfoObj.play_url) && f0.g(this.cover, storyVideoInfoObj.cover) && this.height == storyVideoInfoObj.height && f0.g(this.link_id, storyVideoInfoObj.link_id);
    }

    @e
    public final String getCover() {
        return this.cover;
    }

    @e
    public final String getDuration() {
        return this.duration;
    }

    public final int getHeight() {
        return this.height;
    }

    @e
    public final String getLink_id() {
        return this.link_id;
    }

    @e
    public final String getPlay_url() {
        return this.play_url;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.k.He, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.duration;
        int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.width) * 31;
        String str2 = this.play_url;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.cover;
        int iHashCode3 = (((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.height) * 31;
        String str4 = this.link_id;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final void setCover(@e String str) {
        this.cover = str;
    }

    public final void setDuration(@e String str) {
        this.duration = str;
    }

    public final void setHeight(int i10) {
        this.height = i10;
    }

    public final void setLink_id(@e String str) {
        this.link_id = str;
    }

    public final void setPlay_url(@e String str) {
        this.play_url = str;
    }

    public final void setWidth(int i10) {
        this.width = i10;
    }

    @d
    public final StoryItemsObj toStoryItemsObj(boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, c.k.Ce, new Class[]{Boolean.TYPE}, StoryItemsObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (StoryItemsObj) patchProxyResultProxy.result;
        }
        return new StoryItemsObj(new StoryCardIdInfoObj(z10 ? this.link_id : null, 1), new StoryLinkCardInfoObj(null, null, null, null, null, this), null, null, null, false, 56, null);
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.k.Ge, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "StoryVideoInfoObj(duration=" + this.duration + ", width=" + this.width + ", play_url=" + this.play_url + ", cover=" + this.cover + ", height=" + this.height + ", link_id=" + this.link_id + ')';
    }
}
