package com.starlightc.ucropplus.model;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: StickerInfo.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class StickerInfo implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String groupID;

    @e
    private String img_name;

    @e
    private String path;

    @e
    private String type;

    @e
    private String url;

    public StickerInfo(@e String str, @e String str2, @e String str3, @e String str4, @e String str5) {
        this.path = str;
        this.groupID = str2;
        this.url = str3;
        this.img_name = str4;
        this.type = str5;
    }

    public /* synthetic */ StickerInfo(String str, String str2, String str3, String str4, String str5, int i10, u uVar) {
        this(str, str2, str3, str4, (i10 & 16) != 0 ? "local" : str5);
    }

    public static /* synthetic */ StickerInfo copy$default(StickerInfo stickerInfo, String str, String str2, String str3, String str4, String str5, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{stickerInfo, str, str2, str3, str4, str5, new Integer(i10), obj}, null, changeQuickRedirect, true, 50105, new Class[]{StickerInfo.class, String.class, String.class, String.class, String.class, String.class, Integer.TYPE, Object.class}, StickerInfo.class);
        if (patchProxyResultProxy.isSupported) {
            return (StickerInfo) patchProxyResultProxy.result;
        }
        return stickerInfo.copy((i10 & 1) != 0 ? stickerInfo.path : str, (i10 & 2) != 0 ? stickerInfo.groupID : str2, (i10 & 4) != 0 ? stickerInfo.url : str3, (i10 & 8) != 0 ? stickerInfo.img_name : str4, (i10 & 16) != 0 ? stickerInfo.type : str5);
    }

    @e
    public final String component1() {
        return this.path;
    }

    @e
    public final String component2() {
        return this.groupID;
    }

    @e
    public final String component3() {
        return this.url;
    }

    @e
    public final String component4() {
        return this.img_name;
    }

    @e
    public final String component5() {
        return this.type;
    }

    @d
    public final StickerInfo copy(@e String str, @e String str2, @e String str3, @e String str4, @e String str5) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3, str4, str5}, this, changeQuickRedirect, false, 50104, new Class[]{String.class, String.class, String.class, String.class, String.class}, StickerInfo.class);
        return patchProxyResultProxy.isSupported ? (StickerInfo) patchProxyResultProxy.result : new StickerInfo(str, str2, str3, str4, str5);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 50108, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StickerInfo)) {
            return false;
        }
        StickerInfo stickerInfo = (StickerInfo) obj;
        return f0.g(this.path, stickerInfo.path) && f0.g(this.groupID, stickerInfo.groupID) && f0.g(this.url, stickerInfo.url) && f0.g(this.img_name, stickerInfo.img_name) && f0.g(this.type, stickerInfo.type);
    }

    @e
    public final String getGroupID() {
        return this.groupID;
    }

    @e
    public final String getImg_name() {
        return this.img_name;
    }

    @e
    public final String getPath() {
        return this.path;
    }

    @e
    public final String getType() {
        return this.type;
    }

    @e
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50107, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.path;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.groupID;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.url;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.img_name;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.type;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public final void setGroupID(@e String str) {
        this.groupID = str;
    }

    public final void setImg_name(@e String str) {
        this.img_name = str;
    }

    public final void setPath(@e String str) {
        this.path = str;
    }

    public final void setType(@e String str) {
        this.type = str;
    }

    public final void setUrl(@e String str) {
        this.url = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50106, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "StickerInfo(path=" + this.path + ", groupID=" + this.groupID + ", url=" + this.url + ", img_name=" + this.img_name + ", type=" + this.type + ')';
    }
}
