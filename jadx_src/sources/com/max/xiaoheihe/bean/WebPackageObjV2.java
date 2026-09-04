package com.max.xiaoheihe.bean;

import androidx.compose.runtime.internal.o;
import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: WebPackageResultObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class WebPackageObjV2 implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @e
    private String f76944id;

    @d
    private String key;

    @d
    private String source_url;

    public WebPackageObjV2(@e String str, @d String source_url, @d String key) {
        f0.p(source_url, "source_url");
        f0.p(key, "key");
        this.f76944id = str;
        this.source_url = source_url;
        this.key = key;
    }

    public static /* synthetic */ WebPackageObjV2 copy$default(WebPackageObjV2 webPackageObjV2, String str, String str2, String str3, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{webPackageObjV2, str, str2, str3, new Integer(i10), obj}, null, changeQuickRedirect, true, c.m.AN, new Class[]{WebPackageObjV2.class, String.class, String.class, String.class, Integer.TYPE, Object.class}, WebPackageObjV2.class);
        if (patchProxyResultProxy.isSupported) {
            return (WebPackageObjV2) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            str = webPackageObjV2.f76944id;
        }
        if ((i10 & 2) != 0) {
            str2 = webPackageObjV2.source_url;
        }
        if ((i10 & 4) != 0) {
            str3 = webPackageObjV2.key;
        }
        return webPackageObjV2.copy(str, str2, str3);
    }

    @e
    public final String component1() {
        return this.f76944id;
    }

    @d
    public final String component2() {
        return this.source_url;
    }

    @d
    public final String component3() {
        return this.key;
    }

    @d
    public final WebPackageObjV2 copy(@e String str, @d String source_url, @d String key) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, source_url, key}, this, changeQuickRedirect, false, c.m.zN, new Class[]{String.class, String.class, String.class}, WebPackageObjV2.class);
        if (patchProxyResultProxy.isSupported) {
            return (WebPackageObjV2) patchProxyResultProxy.result;
        }
        f0.p(source_url, "source_url");
        f0.p(key, "key");
        return new WebPackageObjV2(str, source_url, key);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, c.m.DN, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebPackageObjV2)) {
            return false;
        }
        WebPackageObjV2 webPackageObjV2 = (WebPackageObjV2) obj;
        return f0.g(this.f76944id, webPackageObjV2.f76944id) && f0.g(this.source_url, webPackageObjV2.source_url) && f0.g(this.key, webPackageObjV2.key);
    }

    @e
    public final String getId() {
        return this.f76944id;
    }

    @d
    public final String getKey() {
        return this.key;
    }

    @d
    public final String getSource_url() {
        return this.source_url;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.CN, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.f76944id;
        return ((((str != null ? str.hashCode() : 0) * 31) + this.source_url.hashCode()) * 31) + this.key.hashCode();
    }

    public final void setId(@e String str) {
        this.f76944id = str;
    }

    public final void setKey(@d String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, c.m.yN, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(str, "<set-?>");
        this.key = str;
    }

    public final void setSource_url(@d String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, c.m.xN, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(str, "<set-?>");
        this.source_url = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.BN, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "WebPackageObjV2(id=" + this.f76944id + ", source_url=" + this.source_url + ", key=" + this.key + ')';
    }
}
