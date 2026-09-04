package com.max.xiaoheihe.bean.bbs;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: PostExposureRatioResult.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class PostExposureRatioObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String desc;

    @e
    private String ratio;

    public PostExposureRatioObj(@e String str, @e String str2) {
        this.ratio = str;
        this.desc = str2;
    }

    public static /* synthetic */ PostExposureRatioObj copy$default(PostExposureRatioObj postExposureRatioObj, String str, String str2, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{postExposureRatioObj, str, str2, new Integer(i10), obj}, null, changeQuickRedirect, true, 14399, new Class[]{PostExposureRatioObj.class, String.class, String.class, Integer.TYPE, Object.class}, PostExposureRatioObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (PostExposureRatioObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            str = postExposureRatioObj.ratio;
        }
        if ((i10 & 2) != 0) {
            str2 = postExposureRatioObj.desc;
        }
        return postExposureRatioObj.copy(str, str2);
    }

    @e
    public final String component1() {
        return this.ratio;
    }

    @e
    public final String component2() {
        return this.desc;
    }

    @d
    public final PostExposureRatioObj copy(@e String str, @e String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 14398, new Class[]{String.class, String.class}, PostExposureRatioObj.class);
        return patchProxyResultProxy.isSupported ? (PostExposureRatioObj) patchProxyResultProxy.result : new PostExposureRatioObj(str, str2);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14402, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PostExposureRatioObj)) {
            return false;
        }
        PostExposureRatioObj postExposureRatioObj = (PostExposureRatioObj) obj;
        return f0.g(this.ratio, postExposureRatioObj.ratio) && f0.g(this.desc, postExposureRatioObj.desc);
    }

    @e
    public final String getDesc() {
        return this.desc;
    }

    @e
    public final String getRatio() {
        return this.ratio;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14401, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.ratio;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.desc;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setDesc(@e String str) {
        this.desc = str;
    }

    public final void setRatio(@e String str) {
        this.ratio = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14400, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "PostExposureRatioObj(ratio=" + this.ratio + ", desc=" + this.desc + ')';
    }
}
