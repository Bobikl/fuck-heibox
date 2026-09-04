package com.max.xiaoheihe.bean.account;

import androidx.compose.runtime.internal.o;
import com.max.xiaoheihe.module.account.ShareImageDialogFragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import xh.i;

/* JADX INFO: compiled from: ShareTypeObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class ShareTypeObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;
    private boolean clearColorFilter;
    private int cornerRadius;
    private int iconId;

    @e
    private String iconUrl;

    @e
    private String name;

    @d
    private ShareImageDialogFragment.ShareType type;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @i
    public ShareTypeObj(@e String str, int i10, @e String str2, @d ShareImageDialogFragment.ShareType type) {
        this(str, i10, str2, type, false, 0, 48, null);
        f0.p(type, "type");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @i
    public ShareTypeObj(@e String str, int i10, @e String str2, @d ShareImageDialogFragment.ShareType type, boolean z10) {
        this(str, i10, str2, type, z10, 0, 32, null);
        f0.p(type, "type");
    }

    @i
    public ShareTypeObj(@e String str, int i10, @e String str2, @d ShareImageDialogFragment.ShareType type, boolean z10, int i11) {
        f0.p(type, "type");
        this.name = str;
        this.iconId = i10;
        this.iconUrl = str2;
        this.type = type;
        this.clearColorFilter = z10;
        this.cornerRadius = i11;
    }

    public /* synthetic */ ShareTypeObj(String str, int i10, String str2, ShareImageDialogFragment.ShareType shareType, boolean z10, int i11, int i12, u uVar) {
        this(str, (i12 & 2) != 0 ? -1 : i10, str2, shareType, (i12 & 16) != 0 ? false : z10, (i12 & 32) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @i
    public ShareTypeObj(@e String str, @e String str2, @d ShareImageDialogFragment.ShareType type) {
        this(str, 0, str2, type, false, 0, 50, null);
        f0.p(type, "type");
    }

    public static /* synthetic */ ShareTypeObj copy$default(ShareTypeObj shareTypeObj, String str, int i10, String str2, ShareImageDialogFragment.ShareType shareType, boolean z10, int i11, int i12, Object obj) {
        int i13 = i10;
        boolean z11 = z10;
        int i14 = i11;
        Object[] objArr = {shareTypeObj, str, new Integer(i13), str2, shareType, new Byte(z11 ? (byte) 1 : (byte) 0), new Integer(i14), new Integer(i12), obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 13946, new Class[]{ShareTypeObj.class, String.class, cls, String.class, ShareImageDialogFragment.ShareType.class, Boolean.TYPE, cls, cls, Object.class}, ShareTypeObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (ShareTypeObj) patchProxyResultProxy.result;
        }
        String str3 = (i12 & 1) != 0 ? shareTypeObj.name : str;
        if ((i12 & 2) != 0) {
            i13 = shareTypeObj.iconId;
        }
        String str4 = (i12 & 4) != 0 ? shareTypeObj.iconUrl : str2;
        ShareImageDialogFragment.ShareType shareType2 = (i12 & 8) != 0 ? shareTypeObj.type : shareType;
        if ((i12 & 16) != 0) {
            z11 = shareTypeObj.clearColorFilter;
        }
        if ((i12 & 32) != 0) {
            i14 = shareTypeObj.cornerRadius;
        }
        return shareTypeObj.copy(str3, i13, str4, shareType2, z11, i14);
    }

    @e
    public final String component1() {
        return this.name;
    }

    public final int component2() {
        return this.iconId;
    }

    @e
    public final String component3() {
        return this.iconUrl;
    }

    @d
    public final ShareImageDialogFragment.ShareType component4() {
        return this.type;
    }

    public final boolean component5() {
        return this.clearColorFilter;
    }

    public final int component6() {
        return this.cornerRadius;
    }

    @d
    public final ShareTypeObj copy(@e String str, int i10, @e String str2, @d ShareImageDialogFragment.ShareType type, boolean z10, int i11) {
        Object[] objArr = {str, new Integer(i10), str2, type, new Byte(z10 ? (byte) 1 : (byte) 0), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 13945, new Class[]{String.class, cls, String.class, ShareImageDialogFragment.ShareType.class, Boolean.TYPE, cls}, ShareTypeObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (ShareTypeObj) patchProxyResultProxy.result;
        }
        f0.p(type, "type");
        return new ShareTypeObj(str, i10, str2, type, z10, i11);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 13949, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShareTypeObj)) {
            return false;
        }
        ShareTypeObj shareTypeObj = (ShareTypeObj) obj;
        return f0.g(this.name, shareTypeObj.name) && this.iconId == shareTypeObj.iconId && f0.g(this.iconUrl, shareTypeObj.iconUrl) && this.type == shareTypeObj.type && this.clearColorFilter == shareTypeObj.clearColorFilter && this.cornerRadius == shareTypeObj.cornerRadius;
    }

    public final boolean getClearColorFilter() {
        return this.clearColorFilter;
    }

    public final int getCornerRadius() {
        return this.cornerRadius;
    }

    public final int getIconId() {
        return this.iconId;
    }

    @e
    public final String getIconUrl() {
        return this.iconUrl;
    }

    @e
    public final String getName() {
        return this.name;
    }

    @d
    public final ShareImageDialogFragment.ShareType getType() {
        return this.type;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r1v12, types: [int] */
    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 13948, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.name;
        int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.iconId) * 31;
        String str2 = this.iconUrl;
        int iHashCode2 = (((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.type.hashCode()) * 31;
        boolean z10 = this.clearColorFilter;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        return ((iHashCode2 + r10) * 31) + this.cornerRadius;
    }

    public final void setClearColorFilter(boolean z10) {
        this.clearColorFilter = z10;
    }

    public final void setCornerRadius(int i10) {
        this.cornerRadius = i10;
    }

    public final void setIconId(int i10) {
        this.iconId = i10;
    }

    public final void setIconUrl(@e String str) {
        this.iconUrl = str;
    }

    public final void setName(@e String str) {
        this.name = str;
    }

    public final void setType(@d ShareImageDialogFragment.ShareType shareType) {
        if (PatchProxy.proxy(new Object[]{shareType}, this, changeQuickRedirect, false, 13944, new Class[]{ShareImageDialogFragment.ShareType.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(shareType, "<set-?>");
        this.type = shareType;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 13947, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "ShareTypeObj(name=" + this.name + ", iconId=" + this.iconId + ", iconUrl=" + this.iconUrl + ", type=" + this.type + ", clearColorFilter=" + this.clearColorFilter + ", cornerRadius=" + this.cornerRadius + ')';
    }
}
