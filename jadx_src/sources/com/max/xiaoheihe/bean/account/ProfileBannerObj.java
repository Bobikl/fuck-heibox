package com.max.xiaoheihe.bean.account;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ProfileBannerObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class ProfileBannerObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String img;

    @e
    private String protocol;

    public ProfileBannerObj(@e String str, @e String str2) {
        this.img = str;
        this.protocol = str2;
    }

    public static /* synthetic */ ProfileBannerObj copy$default(ProfileBannerObj profileBannerObj, String str, String str2, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{profileBannerObj, str, str2, new Integer(i10), obj}, null, changeQuickRedirect, true, 13915, new Class[]{ProfileBannerObj.class, String.class, String.class, Integer.TYPE, Object.class}, ProfileBannerObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (ProfileBannerObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            str = profileBannerObj.img;
        }
        if ((i10 & 2) != 0) {
            str2 = profileBannerObj.protocol;
        }
        return profileBannerObj.copy(str, str2);
    }

    @e
    public final String component1() {
        return this.img;
    }

    @e
    public final String component2() {
        return this.protocol;
    }

    @d
    public final ProfileBannerObj copy(@e String str, @e String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 13914, new Class[]{String.class, String.class}, ProfileBannerObj.class);
        return patchProxyResultProxy.isSupported ? (ProfileBannerObj) patchProxyResultProxy.result : new ProfileBannerObj(str, str2);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 13918, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfileBannerObj)) {
            return false;
        }
        ProfileBannerObj profileBannerObj = (ProfileBannerObj) obj;
        return f0.g(this.img, profileBannerObj.img) && f0.g(this.protocol, profileBannerObj.protocol);
    }

    @e
    public final String getImg() {
        return this.img;
    }

    @e
    public final String getProtocol() {
        return this.protocol;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 13917, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.img;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.protocol;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setImg(@e String str) {
        this.img = str;
    }

    public final void setProtocol(@e String str) {
        this.protocol = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 13916, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "ProfileBannerObj(img=" + this.img + ", protocol=" + this.protocol + ')';
    }
}
