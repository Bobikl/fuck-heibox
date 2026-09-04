package com.max.xiaoheihe.bean.bbs;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: PictureLinkContentTagObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class PictureLinkContentTagObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String bottom;

    @e
    private String desc;

    @e
    private String icon;

    @e
    private String protocol;
    private transient boolean reported_exposure;

    @e
    private String right;

    public PictureLinkContentTagObj(@e String str, @e String str2, @e String str3, @e String str4, @e String str5, boolean z10) {
        this.desc = str;
        this.protocol = str2;
        this.icon = str3;
        this.right = str4;
        this.bottom = str5;
        this.reported_exposure = z10;
    }

    public /* synthetic */ PictureLinkContentTagObj(String str, String str2, String str3, String str4, String str5, boolean z10, int i10, u uVar) {
        this(str, str2, str3, str4, str5, (i10 & 32) != 0 ? false : z10);
    }

    public static /* synthetic */ PictureLinkContentTagObj copy$default(PictureLinkContentTagObj pictureLinkContentTagObj, String str, String str2, String str3, String str4, String str5, boolean z10, int i10, Object obj) {
        boolean z11 = z10;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{pictureLinkContentTagObj, str, str2, str3, str4, str5, new Byte(z11 ? (byte) 1 : (byte) 0), new Integer(i10), obj}, null, changeQuickRedirect, true, 14353, new Class[]{PictureLinkContentTagObj.class, String.class, String.class, String.class, String.class, String.class, Boolean.TYPE, Integer.TYPE, Object.class}, PictureLinkContentTagObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (PictureLinkContentTagObj) patchProxyResultProxy.result;
        }
        String str6 = (i10 & 1) != 0 ? pictureLinkContentTagObj.desc : str;
        String str7 = (i10 & 2) != 0 ? pictureLinkContentTagObj.protocol : str2;
        String str8 = (i10 & 4) != 0 ? pictureLinkContentTagObj.icon : str3;
        String str9 = (i10 & 8) != 0 ? pictureLinkContentTagObj.right : str4;
        String str10 = (i10 & 16) != 0 ? pictureLinkContentTagObj.bottom : str5;
        if ((i10 & 32) != 0) {
            z11 = pictureLinkContentTagObj.reported_exposure;
        }
        return pictureLinkContentTagObj.copy(str6, str7, str8, str9, str10, z11);
    }

    @e
    public final String component1() {
        return this.desc;
    }

    @e
    public final String component2() {
        return this.protocol;
    }

    @e
    public final String component3() {
        return this.icon;
    }

    @e
    public final String component4() {
        return this.right;
    }

    @e
    public final String component5() {
        return this.bottom;
    }

    public final boolean component6() {
        return this.reported_exposure;
    }

    @d
    public final PictureLinkContentTagObj copy(@e String str, @e String str2, @e String str3, @e String str4, @e String str5, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3, str4, str5, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 14352, new Class[]{String.class, String.class, String.class, String.class, String.class, Boolean.TYPE}, PictureLinkContentTagObj.class);
        return patchProxyResultProxy.isSupported ? (PictureLinkContentTagObj) patchProxyResultProxy.result : new PictureLinkContentTagObj(str, str2, str3, str4, str5, z10);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14350, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PictureLinkContentTagObj)) {
            return false;
        }
        PictureLinkContentTagObj pictureLinkContentTagObj = (PictureLinkContentTagObj) obj;
        return f0.g(this.desc, pictureLinkContentTagObj.desc) && f0.g(this.protocol, pictureLinkContentTagObj.protocol) && f0.g(this.icon, pictureLinkContentTagObj.icon) && f0.g(this.right, pictureLinkContentTagObj.right) && f0.g(this.bottom, pictureLinkContentTagObj.bottom);
    }

    @e
    public final String getBottom() {
        return this.bottom;
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
    public final String getProtocol() {
        return this.protocol;
    }

    public final boolean getReported_exposure() {
        return this.reported_exposure;
    }

    @e
    public final String getRight() {
        return this.right;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14351, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.desc;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.protocol;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.icon;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.right;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.bottom;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public final void setBottom(@e String str) {
        this.bottom = str;
    }

    public final void setDesc(@e String str) {
        this.desc = str;
    }

    public final void setIcon(@e String str) {
        this.icon = str;
    }

    public final void setProtocol(@e String str) {
        this.protocol = str;
    }

    public final void setReported_exposure(boolean z10) {
        this.reported_exposure = z10;
    }

    public final void setRight(@e String str) {
        this.right = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14354, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "PictureLinkContentTagObj(desc=" + this.desc + ", protocol=" + this.protocol + ", icon=" + this.icon + ", right=" + this.right + ", bottom=" + this.bottom + ", reported_exposure=" + this.reported_exposure + ')';
    }
}
