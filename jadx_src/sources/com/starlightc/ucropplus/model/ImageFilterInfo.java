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

/* JADX INFO: compiled from: ImageFilterInfo.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class ImageFilterInfo implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    private int groupID;
    private boolean isLUT;
    private float lutLevel;

    @d
    private String lutPath;

    @e
    private String name;

    @e
    private Integer previewImageRes;

    @e
    private String previewImageUrl;
    private int type;

    public ImageFilterInfo(@e String str, int i10, int i11, @e String str2, @e Integer num, boolean z10, @d String lutPath, float f10) {
        f0.p(lutPath, "lutPath");
        this.name = str;
        this.type = i10;
        this.groupID = i11;
        this.previewImageUrl = str2;
        this.previewImageRes = num;
        this.isLUT = z10;
        this.lutPath = lutPath;
        this.lutLevel = f10;
    }

    public /* synthetic */ ImageFilterInfo(String str, int i10, int i11, String str2, Integer num, boolean z10, String str3, float f10, int i12, u uVar) {
        this(str, (i12 & 2) != 0 ? -1 : i10, (i12 & 4) != 0 ? 0 : i11, (i12 & 8) != 0 ? null : str2, num, (i12 & 32) != 0 ? false : z10, (i12 & 64) != 0 ? "" : str3, (i12 & 128) != 0 ? 0.6f : f10);
    }

    public static /* synthetic */ ImageFilterInfo copy$default(ImageFilterInfo imageFilterInfo, String str, int i10, int i11, String str2, Integer num, boolean z10, String str3, float f10, int i12, Object obj) {
        int i13 = i10;
        int i14 = i11;
        float f11 = f10;
        Object[] objArr = {imageFilterInfo, str, new Integer(i13), new Integer(i14), str2, num, new Byte(z10 ? (byte) 1 : (byte) 0), str3, new Float(f11), new Integer(i12), obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 50075, new Class[]{ImageFilterInfo.class, String.class, cls, cls, String.class, Integer.class, Boolean.TYPE, String.class, Float.TYPE, cls, Object.class}, ImageFilterInfo.class);
        if (patchProxyResultProxy.isSupported) {
            return (ImageFilterInfo) patchProxyResultProxy.result;
        }
        String str4 = (i12 & 1) != 0 ? imageFilterInfo.name : str;
        if ((i12 & 2) != 0) {
            i13 = imageFilterInfo.type;
        }
        if ((i12 & 4) != 0) {
            i14 = imageFilterInfo.groupID;
        }
        String str5 = (i12 & 8) != 0 ? imageFilterInfo.previewImageUrl : str2;
        Integer num2 = (i12 & 16) != 0 ? imageFilterInfo.previewImageRes : num;
        boolean z11 = (i12 & 32) != 0 ? imageFilterInfo.isLUT : z10 ? 1 : 0;
        String str6 = (i12 & 64) != 0 ? imageFilterInfo.lutPath : str3;
        if ((i12 & 128) != 0) {
            f11 = imageFilterInfo.lutLevel;
        }
        return imageFilterInfo.copy(str4, i13, i14, str5, num2, z11, str6, f11);
    }

    @e
    public final String component1() {
        return this.name;
    }

    public final int component2() {
        return this.type;
    }

    public final int component3() {
        return this.groupID;
    }

    @e
    public final String component4() {
        return this.previewImageUrl;
    }

    @e
    public final Integer component5() {
        return this.previewImageRes;
    }

    public final boolean component6() {
        return this.isLUT;
    }

    @d
    public final String component7() {
        return this.lutPath;
    }

    public final float component8() {
        return this.lutLevel;
    }

    @d
    public final ImageFilterInfo copy(@e String str, int i10, int i11, @e String str2, @e Integer num, boolean z10, @d String lutPath, float f10) {
        Object[] objArr = {str, new Integer(i10), new Integer(i11), str2, num, new Byte(z10 ? (byte) 1 : (byte) 0), lutPath, new Float(f10)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 50074, new Class[]{String.class, cls, cls, String.class, Integer.class, Boolean.TYPE, String.class, Float.TYPE}, ImageFilterInfo.class);
        if (patchProxyResultProxy.isSupported) {
            return (ImageFilterInfo) patchProxyResultProxy.result;
        }
        f0.p(lutPath, "lutPath");
        return new ImageFilterInfo(str, i10, i11, str2, num, z10, lutPath, f10);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 50073, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageFilterInfo)) {
            return false;
        }
        ImageFilterInfo imageFilterInfo = (ImageFilterInfo) obj;
        if (f0.g(imageFilterInfo.name, this.name) && imageFilterInfo.type == this.type && imageFilterInfo.groupID == this.groupID && f0.g(imageFilterInfo.previewImageUrl, this.previewImageUrl) && f0.g(imageFilterInfo.previewImageRes, this.previewImageRes) && imageFilterInfo.isLUT == this.isLUT && f0.g(imageFilterInfo.lutPath, this.lutPath)) {
            return (imageFilterInfo.lutLevel > this.lutLevel ? 1 : (imageFilterInfo.lutLevel == this.lutLevel ? 0 : -1)) == 0;
        }
        return false;
    }

    public final int getGroupID() {
        return this.groupID;
    }

    public final float getLutLevel() {
        return this.lutLevel;
    }

    @d
    public final String getLutPath() {
        return this.lutPath;
    }

    @e
    public final String getName() {
        return this.name;
    }

    @e
    public final Integer getPreviewImageRes() {
        return this.previewImageRes;
    }

    @e
    public final String getPreviewImageUrl() {
        return this.previewImageUrl;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50077, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.name;
        int iHashCode = (((((str == null ? 0 : str.hashCode()) * 31) + this.type) * 31) + this.groupID) * 31;
        String str2 = this.previewImageUrl;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.previewImageRes;
        return ((((((iHashCode2 + (num != null ? num.hashCode() : 0)) * 31) + b0.a(this.isLUT)) * 31) + this.lutPath.hashCode()) * 31) + Float.floatToIntBits(this.lutLevel);
    }

    public final boolean isLUT() {
        return this.isLUT;
    }

    public final void setGroupID(int i10) {
        this.groupID = i10;
    }

    public final void setLUT(boolean z10) {
        this.isLUT = z10;
    }

    public final void setLutLevel(float f10) {
        this.lutLevel = f10;
    }

    public final void setLutPath(@d String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 50072, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(str, "<set-?>");
        this.lutPath = str;
    }

    public final void setName(@e String str) {
        this.name = str;
    }

    public final void setPreviewImageRes(@e Integer num) {
        this.previewImageRes = num;
    }

    public final void setPreviewImageUrl(@e String str) {
        this.previewImageUrl = str;
    }

    public final void setType(int i10) {
        this.type = i10;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50076, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "ImageFilterInfo(name=" + this.name + ", type=" + this.type + ", groupID=" + this.groupID + ", previewImageUrl=" + this.previewImageUrl + ", previewImageRes=" + this.previewImageRes + ", isLUT=" + this.isLUT + ", lutPath=" + this.lutPath + ", lutLevel=" + this.lutLevel + ')';
    }
}
