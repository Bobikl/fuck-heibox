package com.max.xiaoheihe.loader.bean.dynamic_so;

import androidx.compose.foundation.b0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: DynamicSoInfoObj.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class DynamicSoInfoObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String download_url;
    private boolean isLoad;

    @e
    private String key;

    @e
    private String md5;

    public DynamicSoInfoObj(@e String str, @e String str2, @e String str3, boolean z10) {
        this.key = str;
        this.download_url = str2;
        this.md5 = str3;
        this.isLoad = z10;
    }

    public /* synthetic */ DynamicSoInfoObj(String str, String str2, String str3, boolean z10, int i10, u uVar) {
        this(str, str2, str3, (i10 & 8) != 0 ? false : z10);
    }

    public static /* synthetic */ DynamicSoInfoObj copy$default(DynamicSoInfoObj dynamicSoInfoObj, String str, String str2, String str3, boolean z10, int i10, Object obj) {
        boolean z11 = z10;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{dynamicSoInfoObj, str, str2, str3, new Byte(z11 ? (byte) 1 : (byte) 0), new Integer(i10), obj}, null, changeQuickRedirect, true, 22057, new Class[]{DynamicSoInfoObj.class, String.class, String.class, String.class, Boolean.TYPE, Integer.TYPE, Object.class}, DynamicSoInfoObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (DynamicSoInfoObj) patchProxyResultProxy.result;
        }
        String str4 = (i10 & 1) != 0 ? dynamicSoInfoObj.key : str;
        String str5 = (i10 & 2) != 0 ? dynamicSoInfoObj.download_url : str2;
        String str6 = (i10 & 4) != 0 ? dynamicSoInfoObj.md5 : str3;
        if ((i10 & 8) != 0) {
            z11 = dynamicSoInfoObj.isLoad;
        }
        return dynamicSoInfoObj.copy(str4, str5, str6, z11);
    }

    @e
    public final String component1() {
        return this.key;
    }

    @e
    public final String component2() {
        return this.download_url;
    }

    @e
    public final String component3() {
        return this.md5;
    }

    public final boolean component4() {
        return this.isLoad;
    }

    @d
    public final DynamicSoInfoObj copy(@e String str, @e String str2, @e String str3, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 22056, new Class[]{String.class, String.class, String.class, Boolean.TYPE}, DynamicSoInfoObj.class);
        return patchProxyResultProxy.isSupported ? (DynamicSoInfoObj) patchProxyResultProxy.result : new DynamicSoInfoObj(str, str2, str3, z10);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 22060, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DynamicSoInfoObj)) {
            return false;
        }
        DynamicSoInfoObj dynamicSoInfoObj = (DynamicSoInfoObj) obj;
        return f0.g(this.key, dynamicSoInfoObj.key) && f0.g(this.download_url, dynamicSoInfoObj.download_url) && f0.g(this.md5, dynamicSoInfoObj.md5) && this.isLoad == dynamicSoInfoObj.isLoad;
    }

    @e
    public final String getDownload_url() {
        return this.download_url;
    }

    @e
    public final String getKey() {
        return this.key;
    }

    @e
    public final String getMd5() {
        return this.md5;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22059, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.key;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.download_url;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.md5;
        return ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + b0.a(this.isLoad);
    }

    public final boolean isLoad() {
        return this.isLoad;
    }

    public final void setDownload_url(@e String str) {
        this.download_url = str;
    }

    public final void setKey(@e String str) {
        this.key = str;
    }

    public final void setLoad(boolean z10) {
        this.isLoad = z10;
    }

    public final void setMd5(@e String str) {
        this.md5 = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22058, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "DynamicSoInfoObj(key=" + this.key + ", download_url=" + this.download_url + ", md5=" + this.md5 + ", isLoad=" + this.isLoad + ')';
    }
}
