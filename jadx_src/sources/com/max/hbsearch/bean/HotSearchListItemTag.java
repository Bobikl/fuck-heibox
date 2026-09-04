package com.max.hbsearch.bean;

import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: SearchHotWelcomObj.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class HotSearchListItemTag implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private HotSearchListItemColor background_color;

    @e
    private String text;

    public HotSearchListItemTag(@e HotSearchListItemColor hotSearchListItemColor, @e String str) {
        this.background_color = hotSearchListItemColor;
        this.text = str;
    }

    public static /* synthetic */ HotSearchListItemTag copy$default(HotSearchListItemTag hotSearchListItemTag, HotSearchListItemColor hotSearchListItemColor, String str, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{hotSearchListItemTag, hotSearchListItemColor, str, new Integer(i10), obj}, null, changeQuickRedirect, true, c.k.f33728n7, new Class[]{HotSearchListItemTag.class, HotSearchListItemColor.class, String.class, Integer.TYPE, Object.class}, HotSearchListItemTag.class);
        if (patchProxyResultProxy.isSupported) {
            return (HotSearchListItemTag) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            hotSearchListItemColor = hotSearchListItemTag.background_color;
        }
        if ((i10 & 2) != 0) {
            str = hotSearchListItemTag.text;
        }
        return hotSearchListItemTag.copy(hotSearchListItemColor, str);
    }

    @e
    public final HotSearchListItemColor component1() {
        return this.background_color;
    }

    @e
    public final String component2() {
        return this.text;
    }

    @d
    public final HotSearchListItemTag copy(@e HotSearchListItemColor hotSearchListItemColor, @e String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{hotSearchListItemColor, str}, this, changeQuickRedirect, false, c.k.f33705m7, new Class[]{HotSearchListItemColor.class, String.class}, HotSearchListItemTag.class);
        return patchProxyResultProxy.isSupported ? (HotSearchListItemTag) patchProxyResultProxy.result : new HotSearchListItemTag(hotSearchListItemColor, str);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, c.k.f33797q7, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HotSearchListItemTag)) {
            return false;
        }
        HotSearchListItemTag hotSearchListItemTag = (HotSearchListItemTag) obj;
        return f0.g(this.background_color, hotSearchListItemTag.background_color) && f0.g(this.text, hotSearchListItemTag.text);
    }

    @e
    public final HotSearchListItemColor getBackground_color() {
        return this.background_color;
    }

    @e
    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.k.f33774p7, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        HotSearchListItemColor hotSearchListItemColor = this.background_color;
        int iHashCode = (hotSearchListItemColor == null ? 0 : hotSearchListItemColor.hashCode()) * 31;
        String str = this.text;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final void setBackground_color(@e HotSearchListItemColor hotSearchListItemColor) {
        this.background_color = hotSearchListItemColor;
    }

    public final void setText(@e String str) {
        this.text = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.k.f33751o7, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "HotSearchListItemTag(background_color=" + this.background_color + ", text=" + this.text + ')';
    }
}
