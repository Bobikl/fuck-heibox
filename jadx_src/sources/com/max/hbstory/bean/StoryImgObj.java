package com.max.hbstory.bean;

import bb.c;
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
public final class StoryImgObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    private int height;

    @e
    private String img_url;
    private int width;

    public StoryImgObj() {
        this(0, 0, null, 7, null);
    }

    public StoryImgObj(int i10, int i11, @e String str) {
        this.width = i10;
        this.height = i11;
        this.img_url = str;
    }

    public /* synthetic */ StoryImgObj(int i10, int i11, String str, int i12, u uVar) {
        this((i12 & 1) != 0 ? 0 : i10, (i12 & 2) != 0 ? 0 : i11, (i12 & 4) != 0 ? null : str);
    }

    public static /* synthetic */ StoryImgObj copy$default(StoryImgObj storyImgObj, int i10, int i11, String str, int i12, Object obj) {
        Object[] objArr = {storyImgObj, new Integer(i10), new Integer(i11), str, new Integer(i12), obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, c.k.Ud, new Class[]{StoryImgObj.class, cls, cls, String.class, cls, Object.class}, StoryImgObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (StoryImgObj) patchProxyResultProxy.result;
        }
        if ((i12 & 1) != 0) {
            i10 = storyImgObj.width;
        }
        if ((i12 & 2) != 0) {
            i11 = storyImgObj.height;
        }
        if ((i12 & 4) != 0) {
            str = storyImgObj.img_url;
        }
        return storyImgObj.copy(i10, i11, str);
    }

    public final int component1() {
        return this.width;
    }

    public final int component2() {
        return this.height;
    }

    @e
    public final String component3() {
        return this.img_url;
    }

    @d
    public final StoryImgObj copy(int i10, int i11, @e String str) {
        Object[] objArr = {new Integer(i10), new Integer(i11), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, c.k.Td, new Class[]{cls, cls, String.class}, StoryImgObj.class);
        return patchProxyResultProxy.isSupported ? (StoryImgObj) patchProxyResultProxy.result : new StoryImgObj(i10, i11, str);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, c.k.Xd, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoryImgObj)) {
            return false;
        }
        StoryImgObj storyImgObj = (StoryImgObj) obj;
        return this.width == storyImgObj.width && this.height == storyImgObj.height && f0.g(this.img_url, storyImgObj.img_url);
    }

    public final int getHeight() {
        return this.height;
    }

    @e
    public final String getImg_url() {
        return this.img_url;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.k.Wd, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        int i10 = ((this.width * 31) + this.height) * 31;
        String str = this.img_url;
        return i10 + (str != null ? str.hashCode() : 0);
    }

    public final void setHeight(int i10) {
        this.height = i10;
    }

    public final void setImg_url(@e String str) {
        this.img_url = str;
    }

    public final void setWidth(int i10) {
        this.width = i10;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.k.Vd, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "StoryImgObj(width=" + this.width + ", height=" + this.height + ", img_url=" + this.img_url + ')';
    }
}
