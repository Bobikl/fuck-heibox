package com.max.xiaoheihe.bean.bbs;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ImageCacheObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class ImageCacheObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String additional_url;

    @e
    private String all_zip_url;

    @e
    private String version;

    public ImageCacheObj(@e String str, @e String str2, @e String str3) {
        this.version = str;
        this.all_zip_url = str2;
        this.additional_url = str3;
    }

    public static /* synthetic */ ImageCacheObj copy$default(ImageCacheObj imageCacheObj, String str, String str2, String str3, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{imageCacheObj, str, str2, str3, new Integer(i10), obj}, null, changeQuickRedirect, true, 14309, new Class[]{ImageCacheObj.class, String.class, String.class, String.class, Integer.TYPE, Object.class}, ImageCacheObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (ImageCacheObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            str = imageCacheObj.version;
        }
        if ((i10 & 2) != 0) {
            str2 = imageCacheObj.all_zip_url;
        }
        if ((i10 & 4) != 0) {
            str3 = imageCacheObj.additional_url;
        }
        return imageCacheObj.copy(str, str2, str3);
    }

    @e
    public final String component1() {
        return this.version;
    }

    @e
    public final String component2() {
        return this.all_zip_url;
    }

    @e
    public final String component3() {
        return this.additional_url;
    }

    @d
    public final ImageCacheObj copy(@e String str, @e String str2, @e String str3) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3}, this, changeQuickRedirect, false, 14308, new Class[]{String.class, String.class, String.class}, ImageCacheObj.class);
        return patchProxyResultProxy.isSupported ? (ImageCacheObj) patchProxyResultProxy.result : new ImageCacheObj(str, str2, str3);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14312, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageCacheObj)) {
            return false;
        }
        ImageCacheObj imageCacheObj = (ImageCacheObj) obj;
        return f0.g(this.version, imageCacheObj.version) && f0.g(this.all_zip_url, imageCacheObj.all_zip_url) && f0.g(this.additional_url, imageCacheObj.additional_url);
    }

    @e
    public final String getAdditional_url() {
        return this.additional_url;
    }

    @e
    public final String getAll_zip_url() {
        return this.all_zip_url;
    }

    @e
    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14311, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.version;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.all_zip_url;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.additional_url;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final void setAdditional_url(@e String str) {
        this.additional_url = str;
    }

    public final void setAll_zip_url(@e String str) {
        this.all_zip_url = str;
    }

    public final void setVersion(@e String str) {
        this.version = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14310, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "ImageCacheObj(version=" + this.version + ", all_zip_url=" + this.all_zip_url + ", additional_url=" + this.additional_url + ')';
    }
}
