package com.max.xiaoheihe.bean.cert;

import androidx.compose.runtime.internal.o;
import com.max.hbcommon.bean.EncryptionParamsObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: AppCertResultObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class AppCertResultObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private EncryptionParamsObj data;

    @d
    private String md5;
    private boolean updated;

    public AppCertResultObj(boolean z10, @d String md5, @e EncryptionParamsObj encryptionParamsObj) {
        f0.p(md5, "md5");
        this.updated = z10;
        this.md5 = md5;
        this.data = encryptionParamsObj;
    }

    public /* synthetic */ AppCertResultObj(boolean z10, String str, EncryptionParamsObj encryptionParamsObj, int i10, u uVar) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? "" : str, encryptionParamsObj);
    }

    public static /* synthetic */ AppCertResultObj copy$default(AppCertResultObj appCertResultObj, boolean z10, String str, EncryptionParamsObj encryptionParamsObj, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{appCertResultObj, new Byte(z10 ? (byte) 1 : (byte) 0), str, encryptionParamsObj, new Integer(i10), obj}, null, changeQuickRedirect, true, 14592, new Class[]{AppCertResultObj.class, Boolean.TYPE, String.class, EncryptionParamsObj.class, Integer.TYPE, Object.class}, AppCertResultObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (AppCertResultObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            z10 = appCertResultObj.updated;
        }
        if ((i10 & 2) != 0) {
            str = appCertResultObj.md5;
        }
        if ((i10 & 4) != 0) {
            encryptionParamsObj = appCertResultObj.data;
        }
        return appCertResultObj.copy(z10, str, encryptionParamsObj);
    }

    public final boolean component1() {
        return this.updated;
    }

    @d
    public final String component2() {
        return this.md5;
    }

    @e
    public final EncryptionParamsObj component3() {
        return this.data;
    }

    @d
    public final AppCertResultObj copy(boolean z10, @d String md5, @e EncryptionParamsObj encryptionParamsObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0), md5, encryptionParamsObj}, this, changeQuickRedirect, false, 14591, new Class[]{Boolean.TYPE, String.class, EncryptionParamsObj.class}, AppCertResultObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (AppCertResultObj) patchProxyResultProxy.result;
        }
        f0.p(md5, "md5");
        return new AppCertResultObj(z10, md5, encryptionParamsObj);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14595, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppCertResultObj)) {
            return false;
        }
        AppCertResultObj appCertResultObj = (AppCertResultObj) obj;
        return this.updated == appCertResultObj.updated && f0.g(this.md5, appCertResultObj.md5) && f0.g(this.data, appCertResultObj.data);
    }

    @e
    public final EncryptionParamsObj getData() {
        return this.data;
    }

    @d
    public final String getMd5() {
        return this.md5;
    }

    public final boolean getUpdated() {
        return this.updated;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    public int hashCode() {
        ?? r10;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14594, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        boolean z10 = this.updated;
        if (z10) {
            r10 = z10;
            r10 = 1;
        }
        r10 = z10;
        int iHashCode = ((r10 * 31) + this.md5.hashCode()) * 31;
        EncryptionParamsObj encryptionParamsObj = this.data;
        return iHashCode + (encryptionParamsObj != null ? encryptionParamsObj.hashCode() : 0);
    }

    public final void setData(@e EncryptionParamsObj encryptionParamsObj) {
        this.data = encryptionParamsObj;
    }

    public final void setMd5(@d String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 14590, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(str, "<set-?>");
        this.md5 = str;
    }

    public final void setUpdated(boolean z10) {
        this.updated = z10;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14593, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "AppCertResultObj(updated=" + this.updated + ", md5=" + this.md5 + ", data=" + this.data + ')';
    }
}
