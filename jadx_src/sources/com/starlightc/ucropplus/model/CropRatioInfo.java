package com.starlightc.ucropplus.model;

import androidx.compose.foundation.b0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: CropRatioInfo.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class CropRatioInfo implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    private boolean circle;
    private int height;

    @e
    private String imgUrl;
    private boolean isSelected;

    @e
    private String name;
    private int width;

    public CropRatioInfo(int i10, int i11, boolean z10, @e String str, @e String str2, boolean z11) {
        this.width = i10;
        this.height = i11;
        this.isSelected = z10;
        this.imgUrl = str;
        this.name = str2;
        this.circle = z11;
    }

    public /* synthetic */ CropRatioInfo(int i10, int i11, boolean z10, String str, String str2, boolean z11, int i12, u uVar) {
        this((i12 & 1) != 0 ? 1 : i10, (i12 & 2) != 0 ? 1 : i11, (i12 & 4) != 0 ? false : z10, str, str2, (i12 & 32) != 0 ? false : z11);
    }

    public static /* synthetic */ CropRatioInfo copy$default(CropRatioInfo cropRatioInfo, int i10, int i11, boolean z10, String str, String str2, boolean z11, int i12, Object obj) {
        int i13 = i10;
        int i14 = i11;
        boolean z12 = z10;
        boolean z13 = z11;
        Object[] objArr = {cropRatioInfo, new Integer(i13), new Integer(i14), new Byte(z12 ? (byte) 1 : (byte) 0), str, str2, new Byte(z13 ? (byte) 1 : (byte) 0), new Integer(i12), obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        Class cls2 = Boolean.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 50055, new Class[]{CropRatioInfo.class, cls, cls, cls2, String.class, String.class, cls2, cls, Object.class}, CropRatioInfo.class);
        if (patchProxyResultProxy.isSupported) {
            return (CropRatioInfo) patchProxyResultProxy.result;
        }
        if ((i12 & 1) != 0) {
            i13 = cropRatioInfo.width;
        }
        if ((i12 & 2) != 0) {
            i14 = cropRatioInfo.height;
        }
        if ((i12 & 4) != 0) {
            z12 = cropRatioInfo.isSelected;
        }
        String str3 = (i12 & 8) != 0 ? cropRatioInfo.imgUrl : str;
        String str4 = (i12 & 16) != 0 ? cropRatioInfo.name : str2;
        if ((i12 & 32) != 0) {
            z13 = cropRatioInfo.circle;
        }
        return cropRatioInfo.copy(i13, i14, z12, str3, str4, z13);
    }

    public final int component1() {
        return this.width;
    }

    public final int component2() {
        return this.height;
    }

    public final boolean component3() {
        return this.isSelected;
    }

    @e
    public final String component4() {
        return this.imgUrl;
    }

    @e
    public final String component5() {
        return this.name;
    }

    public final boolean component6() {
        return this.circle;
    }

    @d
    public final CropRatioInfo copy(int i10, int i11, boolean z10, @e String str, @e String str2, boolean z11) {
        Object[] objArr = {new Integer(i10), new Integer(i11), new Byte(z10 ? (byte) 1 : (byte) 0), str, str2, new Byte(z11 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        Class cls2 = Boolean.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 50054, new Class[]{cls, cls, cls2, String.class, String.class, cls2}, CropRatioInfo.class);
        return patchProxyResultProxy.isSupported ? (CropRatioInfo) patchProxyResultProxy.result : new CropRatioInfo(i10, i11, z10, str, str2, z11);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 50058, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CropRatioInfo)) {
            return false;
        }
        CropRatioInfo cropRatioInfo = (CropRatioInfo) obj;
        return this.width == cropRatioInfo.width && this.height == cropRatioInfo.height && this.isSelected == cropRatioInfo.isSelected && f0.g(this.imgUrl, cropRatioInfo.imgUrl) && f0.g(this.name, cropRatioInfo.name) && this.circle == cropRatioInfo.circle;
    }

    public final boolean getCircle() {
        return this.circle;
    }

    public final int getHeight() {
        return this.height;
    }

    @e
    public final String getImgUrl() {
        return this.imgUrl;
    }

    @e
    public final String getName() {
        return this.name;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50057, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        int iA = ((((this.width * 31) + this.height) * 31) + b0.a(this.isSelected)) * 31;
        String str = this.imgUrl;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.name;
        return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + b0.a(this.circle);
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    public final void setCircle(boolean z10) {
        this.circle = z10;
    }

    public final void setHeight(int i10) {
        this.height = i10;
    }

    public final void setImgUrl(@e String str) {
        this.imgUrl = str;
    }

    public final void setName(@e String str) {
        this.name = str;
    }

    public final void setSelected(boolean z10) {
        this.isSelected = z10;
    }

    public final void setWidth(int i10) {
        this.width = i10;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50056, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "CropRatioInfo(width=" + this.width + ", height=" + this.height + ", isSelected=" + this.isSelected + ", imgUrl=" + this.imgUrl + ", name=" + this.name + ", circle=" + this.circle + ')';
    }
}
