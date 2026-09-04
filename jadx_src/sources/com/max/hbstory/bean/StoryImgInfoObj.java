package com.max.hbstory.bean;

import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: StoryData.kt */
/* JADX INFO: loaded from: classes13.dex */
public final class StoryImgInfoObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private List<StoryImgObj> images;

    /* JADX WARN: Multi-variable type inference failed */
    public StoryImgInfoObj() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public StoryImgInfoObj(@e List<StoryImgObj> list) {
        this.images = list;
    }

    public /* synthetic */ StoryImgInfoObj(List list, int i10, u uVar) {
        this((i10 & 1) != 0 ? null : list);
    }

    public static /* synthetic */ StoryImgInfoObj copy$default(StoryImgInfoObj storyImgInfoObj, List list, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{storyImgInfoObj, list, new Integer(i10), obj}, null, changeQuickRedirect, true, c.k.Pd, new Class[]{StoryImgInfoObj.class, List.class, Integer.TYPE, Object.class}, StoryImgInfoObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (StoryImgInfoObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            list = storyImgInfoObj.images;
        }
        return storyImgInfoObj.copy(list);
    }

    @e
    public final List<StoryImgObj> component1() {
        return this.images;
    }

    @d
    public final StoryImgInfoObj copy(@e List<StoryImgObj> list) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, c.k.Od, new Class[]{List.class}, StoryImgInfoObj.class);
        return patchProxyResultProxy.isSupported ? (StoryImgInfoObj) patchProxyResultProxy.result : new StoryImgInfoObj(list);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, c.k.Sd, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        return (obj instanceof StoryImgInfoObj) && f0.g(this.images, ((StoryImgInfoObj) obj).images);
    }

    @e
    public final List<StoryImgObj> getImages() {
        return this.images;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.k.Rd, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        List<StoryImgObj> list = this.images;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final void setImages(@e List<StoryImgObj> list) {
        this.images = list;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.k.Qd, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "StoryImgInfoObj(images=" + this.images + ')';
    }
}
