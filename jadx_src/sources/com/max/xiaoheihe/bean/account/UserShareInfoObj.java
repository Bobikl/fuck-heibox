package com.max.xiaoheihe.bean.account;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: UserProfileResultObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class UserShareInfoObj {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String desc;

    @e
    private String image;

    @e
    private String share_link;

    @e
    private String title;

    public UserShareInfoObj(@e String str, @e String str2, @e String str3, @e String str4) {
        this.image = str;
        this.desc = str2;
        this.share_link = str3;
        this.title = str4;
    }

    public static /* synthetic */ UserShareInfoObj copy$default(UserShareInfoObj userShareInfoObj, String str, String str2, String str3, String str4, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{userShareInfoObj, str, str2, str3, str4, new Integer(i10), obj}, null, changeQuickRedirect, true, 14031, new Class[]{UserShareInfoObj.class, String.class, String.class, String.class, String.class, Integer.TYPE, Object.class}, UserShareInfoObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (UserShareInfoObj) patchProxyResultProxy.result;
        }
        return userShareInfoObj.copy((i10 & 1) != 0 ? userShareInfoObj.image : str, (i10 & 2) != 0 ? userShareInfoObj.desc : str2, (i10 & 4) != 0 ? userShareInfoObj.share_link : str3, (i10 & 8) != 0 ? userShareInfoObj.title : str4);
    }

    @e
    public final String component1() {
        return this.image;
    }

    @e
    public final String component2() {
        return this.desc;
    }

    @e
    public final String component3() {
        return this.share_link;
    }

    @e
    public final String component4() {
        return this.title;
    }

    @d
    public final UserShareInfoObj copy(@e String str, @e String str2, @e String str3, @e String str4) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3, str4}, this, changeQuickRedirect, false, 14030, new Class[]{String.class, String.class, String.class, String.class}, UserShareInfoObj.class);
        return patchProxyResultProxy.isSupported ? (UserShareInfoObj) patchProxyResultProxy.result : new UserShareInfoObj(str, str2, str3, str4);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14034, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserShareInfoObj)) {
            return false;
        }
        UserShareInfoObj userShareInfoObj = (UserShareInfoObj) obj;
        return f0.g(this.image, userShareInfoObj.image) && f0.g(this.desc, userShareInfoObj.desc) && f0.g(this.share_link, userShareInfoObj.share_link) && f0.g(this.title, userShareInfoObj.title);
    }

    @e
    public final String getDesc() {
        return this.desc;
    }

    @e
    public final String getImage() {
        return this.image;
    }

    @e
    public final String getShare_link() {
        return this.share_link;
    }

    @e
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14033, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.image;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.desc;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.share_link;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.title;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final void setDesc(@e String str) {
        this.desc = str;
    }

    public final void setImage(@e String str) {
        this.image = str;
    }

    public final void setShare_link(@e String str) {
        this.share_link = str;
    }

    public final void setTitle(@e String str) {
        this.title = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14032, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "UserShareInfoObj(image=" + this.image + ", desc=" + this.desc + ", share_link=" + this.share_link + ", title=" + this.title + ')';
    }
}
