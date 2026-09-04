package com.max.commentimagepainter.sharecard.bean;

import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: CmCardsObj.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class CardBottomInfoObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String additional_desc;

    @e
    private String app_desc;

    public CardBottomInfoObj(@e String str, @e String str2) {
        this.app_desc = str;
        this.additional_desc = str2;
    }

    public static /* synthetic */ CardBottomInfoObj copy$default(CardBottomInfoObj cardBottomInfoObj, String str, String str2, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cardBottomInfoObj, str, str2, new Integer(i10), obj}, null, changeQuickRedirect, true, c.b.f30959tj, new Class[]{CardBottomInfoObj.class, String.class, String.class, Integer.TYPE, Object.class}, CardBottomInfoObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (CardBottomInfoObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            str = cardBottomInfoObj.app_desc;
        }
        if ((i10 & 2) != 0) {
            str2 = cardBottomInfoObj.additional_desc;
        }
        return cardBottomInfoObj.copy(str, str2);
    }

    @e
    public final String component1() {
        return this.app_desc;
    }

    @e
    public final String component2() {
        return this.additional_desc;
    }

    @d
    public final CardBottomInfoObj copy(@e String str, @e String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, c.b.f30937sj, new Class[]{String.class, String.class}, CardBottomInfoObj.class);
        return patchProxyResultProxy.isSupported ? (CardBottomInfoObj) patchProxyResultProxy.result : new CardBottomInfoObj(str, str2);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, c.b.f31025wj, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardBottomInfoObj)) {
            return false;
        }
        CardBottomInfoObj cardBottomInfoObj = (CardBottomInfoObj) obj;
        return f0.g(this.app_desc, cardBottomInfoObj.app_desc) && f0.g(this.additional_desc, cardBottomInfoObj.additional_desc);
    }

    @e
    public final String getAdditional_desc() {
        return this.additional_desc;
    }

    @e
    public final String getApp_desc() {
        return this.app_desc;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.b.f31003vj, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.app_desc;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.additional_desc;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setAdditional_desc(@e String str) {
        this.additional_desc = str;
    }

    public final void setApp_desc(@e String str) {
        this.app_desc = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.b.f30981uj, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "CardBottomInfoObj(app_desc=" + this.app_desc + ", additional_desc=" + this.additional_desc + ')';
    }
}
