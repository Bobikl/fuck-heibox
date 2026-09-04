package com.max.xiaoheihe.bean.bbs;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: PostExposureRatioResult.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class PostExposureRatioResult implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String curr_ratio;

    @e
    private List<PostExposureRatioObj> exposure_levels;

    public PostExposureRatioResult(@e String str, @e List<PostExposureRatioObj> list) {
        this.curr_ratio = str;
        this.exposure_levels = list;
    }

    public static /* synthetic */ PostExposureRatioResult copy$default(PostExposureRatioResult postExposureRatioResult, String str, List list, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{postExposureRatioResult, str, list, new Integer(i10), obj}, null, changeQuickRedirect, true, 14404, new Class[]{PostExposureRatioResult.class, String.class, List.class, Integer.TYPE, Object.class}, PostExposureRatioResult.class);
        if (patchProxyResultProxy.isSupported) {
            return (PostExposureRatioResult) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            str = postExposureRatioResult.curr_ratio;
        }
        if ((i10 & 2) != 0) {
            list = postExposureRatioResult.exposure_levels;
        }
        return postExposureRatioResult.copy(str, list);
    }

    @e
    public final String component1() {
        return this.curr_ratio;
    }

    @e
    public final List<PostExposureRatioObj> component2() {
        return this.exposure_levels;
    }

    @d
    public final PostExposureRatioResult copy(@e String str, @e List<PostExposureRatioObj> list) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, list}, this, changeQuickRedirect, false, 14403, new Class[]{String.class, List.class}, PostExposureRatioResult.class);
        return patchProxyResultProxy.isSupported ? (PostExposureRatioResult) patchProxyResultProxy.result : new PostExposureRatioResult(str, list);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14407, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PostExposureRatioResult)) {
            return false;
        }
        PostExposureRatioResult postExposureRatioResult = (PostExposureRatioResult) obj;
        return f0.g(this.curr_ratio, postExposureRatioResult.curr_ratio) && f0.g(this.exposure_levels, postExposureRatioResult.exposure_levels);
    }

    @e
    public final String getCurr_ratio() {
        return this.curr_ratio;
    }

    @e
    public final List<PostExposureRatioObj> getExposure_levels() {
        return this.exposure_levels;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14406, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.curr_ratio;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<PostExposureRatioObj> list = this.exposure_levels;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final void setCurr_ratio(@e String str) {
        this.curr_ratio = str;
    }

    public final void setExposure_levels(@e List<PostExposureRatioObj> list) {
        this.exposure_levels = list;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14405, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "PostExposureRatioResult(curr_ratio=" + this.curr_ratio + ", exposure_levels=" + this.exposure_levels + ')';
    }
}
