package com.starlightc.ucropplus.model;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: StickerGroupInfoList.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class StickerGroupInfoList implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private ArrayList<StickerGroupInfo> sticker_groups;

    @e
    private String sticker_version;

    public StickerGroupInfoList(@e ArrayList<StickerGroupInfo> arrayList, @e String str) {
        this.sticker_groups = arrayList;
        this.sticker_version = str;
    }

    public static /* synthetic */ StickerGroupInfoList copy$default(StickerGroupInfoList stickerGroupInfoList, ArrayList arrayList, String str, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{stickerGroupInfoList, arrayList, str, new Integer(i10), obj}, null, changeQuickRedirect, true, 50100, new Class[]{StickerGroupInfoList.class, ArrayList.class, String.class, Integer.TYPE, Object.class}, StickerGroupInfoList.class);
        if (patchProxyResultProxy.isSupported) {
            return (StickerGroupInfoList) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            arrayList = stickerGroupInfoList.sticker_groups;
        }
        if ((i10 & 2) != 0) {
            str = stickerGroupInfoList.sticker_version;
        }
        return stickerGroupInfoList.copy(arrayList, str);
    }

    @e
    public final ArrayList<StickerGroupInfo> component1() {
        return this.sticker_groups;
    }

    @e
    public final String component2() {
        return this.sticker_version;
    }

    @d
    public final StickerGroupInfoList copy(@e ArrayList<StickerGroupInfo> arrayList, @e String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{arrayList, str}, this, changeQuickRedirect, false, 50099, new Class[]{ArrayList.class, String.class}, StickerGroupInfoList.class);
        return patchProxyResultProxy.isSupported ? (StickerGroupInfoList) patchProxyResultProxy.result : new StickerGroupInfoList(arrayList, str);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 50103, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StickerGroupInfoList)) {
            return false;
        }
        StickerGroupInfoList stickerGroupInfoList = (StickerGroupInfoList) obj;
        return f0.g(this.sticker_groups, stickerGroupInfoList.sticker_groups) && f0.g(this.sticker_version, stickerGroupInfoList.sticker_version);
    }

    @e
    public final ArrayList<StickerGroupInfo> getSticker_groups() {
        return this.sticker_groups;
    }

    @e
    public final String getSticker_version() {
        return this.sticker_version;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50102, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        ArrayList<StickerGroupInfo> arrayList = this.sticker_groups;
        int iHashCode = (arrayList == null ? 0 : arrayList.hashCode()) * 31;
        String str = this.sticker_version;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final void setSticker_groups(@e ArrayList<StickerGroupInfo> arrayList) {
        this.sticker_groups = arrayList;
    }

    public final void setSticker_version(@e String str) {
        this.sticker_version = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50101, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "StickerGroupInfoList(sticker_groups=" + this.sticker_groups + ", sticker_version=" + this.sticker_version + ')';
    }
}
