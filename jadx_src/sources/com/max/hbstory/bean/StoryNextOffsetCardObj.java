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
public final class StoryNextOffsetCardObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    private int card_type;

    @e
    private String item_id;

    /* JADX WARN: Multi-variable type inference failed */
    public StoryNextOffsetCardObj() {
        this(null, 0, 3, 0 == true ? 1 : 0);
    }

    public StoryNextOffsetCardObj(@e String str, int i10) {
        this.item_id = str;
        this.card_type = i10;
    }

    public /* synthetic */ StoryNextOffsetCardObj(String str, int i10, int i11, u uVar) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? 0 : i10);
    }

    public static /* synthetic */ StoryNextOffsetCardObj copy$default(StoryNextOffsetCardObj storyNextOffsetCardObj, String str, int i10, int i11, Object obj) {
        Object[] objArr = {storyNextOffsetCardObj, str, new Integer(i10), new Integer(i11), obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, c.k.f33666ke, new Class[]{StoryNextOffsetCardObj.class, String.class, cls, cls, Object.class}, StoryNextOffsetCardObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (StoryNextOffsetCardObj) patchProxyResultProxy.result;
        }
        if ((i11 & 1) != 0) {
            str = storyNextOffsetCardObj.item_id;
        }
        if ((i11 & 2) != 0) {
            i10 = storyNextOffsetCardObj.card_type;
        }
        return storyNextOffsetCardObj.copy(str, i10);
    }

    @e
    public final String component1() {
        return this.item_id;
    }

    public final int component2() {
        return this.card_type;
    }

    @d
    public final StoryNextOffsetCardObj copy(@e String str, int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, new Integer(i10)}, this, changeQuickRedirect, false, c.k.f33643je, new Class[]{String.class, Integer.TYPE}, StoryNextOffsetCardObj.class);
        return patchProxyResultProxy.isSupported ? (StoryNextOffsetCardObj) patchProxyResultProxy.result : new StoryNextOffsetCardObj(str, i10);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, c.k.f33735ne, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoryNextOffsetCardObj)) {
            return false;
        }
        StoryNextOffsetCardObj storyNextOffsetCardObj = (StoryNextOffsetCardObj) obj;
        return f0.g(this.item_id, storyNextOffsetCardObj.item_id) && this.card_type == storyNextOffsetCardObj.card_type;
    }

    public final int getCard_type() {
        return this.card_type;
    }

    @e
    public final String getItem_id() {
        return this.item_id;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.k.f33712me, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.item_id;
        return ((str != null ? str.hashCode() : 0) * 31) + this.card_type;
    }

    public final void setCard_type(int i10) {
        this.card_type = i10;
    }

    public final void setItem_id(@e String str) {
        this.item_id = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.k.f33689le, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "StoryNextOffsetCardObj(item_id=" + this.item_id + ", card_type=" + this.card_type + ')';
    }
}
