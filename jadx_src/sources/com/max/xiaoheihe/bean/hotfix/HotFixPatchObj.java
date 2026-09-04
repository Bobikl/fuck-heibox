package com.max.xiaoheihe.bean.hotfix;

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

/* JADX INFO: compiled from: HotFixPatchObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class HotFixPatchObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private EncryptionParamsObj fix_package_url;

    @e
    private String fix_package_version;

    @e
    private Boolean install;

    @e
    private String md5;

    public HotFixPatchObj(@e EncryptionParamsObj encryptionParamsObj, @e String str, @e Boolean bool, @e String str2) {
        this.fix_package_url = encryptionParamsObj;
        this.fix_package_version = str;
        this.install = bool;
        this.md5 = str2;
    }

    public /* synthetic */ HotFixPatchObj(EncryptionParamsObj encryptionParamsObj, String str, Boolean bool, String str2, int i10, u uVar) {
        this(encryptionParamsObj, str, (i10 & 4) != 0 ? Boolean.TRUE : bool, str2);
    }

    public static /* synthetic */ HotFixPatchObj copy$default(HotFixPatchObj hotFixPatchObj, EncryptionParamsObj encryptionParamsObj, String str, Boolean bool, String str2, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{hotFixPatchObj, encryptionParamsObj, str, bool, str2, new Integer(i10), obj}, null, changeQuickRedirect, true, 15469, new Class[]{HotFixPatchObj.class, EncryptionParamsObj.class, String.class, Boolean.class, String.class, Integer.TYPE, Object.class}, HotFixPatchObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (HotFixPatchObj) patchProxyResultProxy.result;
        }
        return hotFixPatchObj.copy((i10 & 1) != 0 ? hotFixPatchObj.fix_package_url : encryptionParamsObj, (i10 & 2) != 0 ? hotFixPatchObj.fix_package_version : str, (i10 & 4) != 0 ? hotFixPatchObj.install : bool, (i10 & 8) != 0 ? hotFixPatchObj.md5 : str2);
    }

    @e
    public final EncryptionParamsObj component1() {
        return this.fix_package_url;
    }

    @e
    public final String component2() {
        return this.fix_package_version;
    }

    @e
    public final Boolean component3() {
        return this.install;
    }

    @e
    public final String component4() {
        return this.md5;
    }

    @d
    public final HotFixPatchObj copy(@e EncryptionParamsObj encryptionParamsObj, @e String str, @e Boolean bool, @e String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{encryptionParamsObj, str, bool, str2}, this, changeQuickRedirect, false, 15468, new Class[]{EncryptionParamsObj.class, String.class, Boolean.class, String.class}, HotFixPatchObj.class);
        return patchProxyResultProxy.isSupported ? (HotFixPatchObj) patchProxyResultProxy.result : new HotFixPatchObj(encryptionParamsObj, str, bool, str2);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15472, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HotFixPatchObj)) {
            return false;
        }
        HotFixPatchObj hotFixPatchObj = (HotFixPatchObj) obj;
        return f0.g(this.fix_package_url, hotFixPatchObj.fix_package_url) && f0.g(this.fix_package_version, hotFixPatchObj.fix_package_version) && f0.g(this.install, hotFixPatchObj.install) && f0.g(this.md5, hotFixPatchObj.md5);
    }

    @e
    public final EncryptionParamsObj getFix_package_url() {
        return this.fix_package_url;
    }

    @e
    public final String getFix_package_version() {
        return this.fix_package_version;
    }

    @e
    public final Boolean getInstall() {
        return this.install;
    }

    @e
    public final String getMd5() {
        return this.md5;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15471, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        EncryptionParamsObj encryptionParamsObj = this.fix_package_url;
        int iHashCode = (encryptionParamsObj == null ? 0 : encryptionParamsObj.hashCode()) * 31;
        String str = this.fix_package_version;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.install;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.md5;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setFix_package_url(@e EncryptionParamsObj encryptionParamsObj) {
        this.fix_package_url = encryptionParamsObj;
    }

    public final void setFix_package_version(@e String str) {
        this.fix_package_version = str;
    }

    public final void setInstall(@e Boolean bool) {
        this.install = bool;
    }

    public final void setMd5(@e String str) {
        this.md5 = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15470, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "HotFixPatchObj(fix_package_url=" + this.fix_package_url + ", fix_package_version=" + this.fix_package_version + ", install=" + this.install + ", md5=" + this.md5 + ')';
    }
}
