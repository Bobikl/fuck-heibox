package com.max.xiaoheihe.bean.share;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ScreenUploadInfo.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class ScreenUploadInfo implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String jsCallbackFunc;

    @e
    private Boolean only_upload;

    @e
    private Boolean upload;

    public ScreenUploadInfo(@e Boolean bool, @e Boolean bool2, @e String str) {
        this.upload = bool;
        this.only_upload = bool2;
        this.jsCallbackFunc = str;
    }

    public static /* synthetic */ ScreenUploadInfo copy$default(ScreenUploadInfo screenUploadInfo, Boolean bool, Boolean bool2, String str, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{screenUploadInfo, bool, bool2, str, new Integer(i10), obj}, null, changeQuickRedirect, true, 15923, new Class[]{ScreenUploadInfo.class, Boolean.class, Boolean.class, String.class, Integer.TYPE, Object.class}, ScreenUploadInfo.class);
        if (patchProxyResultProxy.isSupported) {
            return (ScreenUploadInfo) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            bool = screenUploadInfo.upload;
        }
        if ((i10 & 2) != 0) {
            bool2 = screenUploadInfo.only_upload;
        }
        if ((i10 & 4) != 0) {
            str = screenUploadInfo.jsCallbackFunc;
        }
        return screenUploadInfo.copy(bool, bool2, str);
    }

    @e
    public final Boolean component1() {
        return this.upload;
    }

    @e
    public final Boolean component2() {
        return this.only_upload;
    }

    @e
    public final String component3() {
        return this.jsCallbackFunc;
    }

    @d
    public final ScreenUploadInfo copy(@e Boolean bool, @e Boolean bool2, @e String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bool, bool2, str}, this, changeQuickRedirect, false, 15922, new Class[]{Boolean.class, Boolean.class, String.class}, ScreenUploadInfo.class);
        return patchProxyResultProxy.isSupported ? (ScreenUploadInfo) patchProxyResultProxy.result : new ScreenUploadInfo(bool, bool2, str);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15926, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScreenUploadInfo)) {
            return false;
        }
        ScreenUploadInfo screenUploadInfo = (ScreenUploadInfo) obj;
        return f0.g(this.upload, screenUploadInfo.upload) && f0.g(this.only_upload, screenUploadInfo.only_upload) && f0.g(this.jsCallbackFunc, screenUploadInfo.jsCallbackFunc);
    }

    @e
    public final String getJsCallbackFunc() {
        return this.jsCallbackFunc;
    }

    @e
    public final Boolean getOnly_upload() {
        return this.only_upload;
    }

    @e
    public final Boolean getUpload() {
        return this.upload;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15925, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        Boolean bool = this.upload;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.only_upload;
        int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str = this.jsCallbackFunc;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final void setJsCallbackFunc(@e String str) {
        this.jsCallbackFunc = str;
    }

    public final void setOnly_upload(@e Boolean bool) {
        this.only_upload = bool;
    }

    public final void setUpload(@e Boolean bool) {
        this.upload = bool;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15924, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "ScreenUploadInfo(upload=" + this.upload + ", only_upload=" + this.only_upload + ", jsCallbackFunc=" + this.jsCallbackFunc + ')';
    }
}
