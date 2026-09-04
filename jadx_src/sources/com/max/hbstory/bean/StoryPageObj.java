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
public final class StoryPageObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private StoryNextOffsetCardObj next_offset_card;

    /* JADX WARN: Multi-variable type inference failed */
    public StoryPageObj() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public StoryPageObj(@e StoryNextOffsetCardObj storyNextOffsetCardObj) {
        this.next_offset_card = storyNextOffsetCardObj;
    }

    public /* synthetic */ StoryPageObj(StoryNextOffsetCardObj storyNextOffsetCardObj, int i10, u uVar) {
        this((i10 & 1) != 0 ? null : storyNextOffsetCardObj);
    }

    public static /* synthetic */ StoryPageObj copy$default(StoryPageObj storyPageObj, StoryNextOffsetCardObj storyNextOffsetCardObj, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{storyPageObj, storyNextOffsetCardObj, new Integer(i10), obj}, null, changeQuickRedirect, true, c.k.f33892ue, new Class[]{StoryPageObj.class, StoryNextOffsetCardObj.class, Integer.TYPE, Object.class}, StoryPageObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (StoryPageObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            storyNextOffsetCardObj = storyPageObj.next_offset_card;
        }
        return storyPageObj.copy(storyNextOffsetCardObj);
    }

    @e
    public final StoryNextOffsetCardObj component1() {
        return this.next_offset_card;
    }

    @d
    public final StoryPageObj copy(@e StoryNextOffsetCardObj storyNextOffsetCardObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{storyNextOffsetCardObj}, this, changeQuickRedirect, false, c.k.f33870te, new Class[]{StoryNextOffsetCardObj.class}, StoryPageObj.class);
        return patchProxyResultProxy.isSupported ? (StoryPageObj) patchProxyResultProxy.result : new StoryPageObj(storyNextOffsetCardObj);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, c.k.f33958xe, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        return (obj instanceof StoryPageObj) && f0.g(this.next_offset_card, ((StoryPageObj) obj).next_offset_card);
    }

    @e
    public final StoryNextOffsetCardObj getNext_offset_card() {
        return this.next_offset_card;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.k.f33936we, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        StoryNextOffsetCardObj storyNextOffsetCardObj = this.next_offset_card;
        if (storyNextOffsetCardObj == null) {
            return 0;
        }
        return storyNextOffsetCardObj.hashCode();
    }

    public final void setNext_offset_card(@e StoryNextOffsetCardObj storyNextOffsetCardObj) {
        this.next_offset_card = storyNextOffsetCardObj;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.k.f33914ve, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "StoryPageObj(next_offset_card=" + this.next_offset_card + ')';
    }
}
