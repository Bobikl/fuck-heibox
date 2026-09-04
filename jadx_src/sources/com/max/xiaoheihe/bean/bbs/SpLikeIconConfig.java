package com.max.xiaoheihe.bean.bbs;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: SpLikeIconConfig.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class SpLikeIconConfig implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String like_after_detail;

    @e
    private String like_after_list;

    @e
    private String like_before_detail;

    @e
    private String like_before_list;

    @e
    private String like_motion;

    public SpLikeIconConfig(@e String str, @e String str2, @e String str3, @e String str4, @e String str5) {
        this.like_before_list = str;
        this.like_after_list = str2;
        this.like_before_detail = str3;
        this.like_after_detail = str4;
        this.like_motion = str5;
    }

    public static /* synthetic */ SpLikeIconConfig copy$default(SpLikeIconConfig spLikeIconConfig, String str, String str2, String str3, String str4, String str5, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{spLikeIconConfig, str, str2, str3, str4, str5, new Integer(i10), obj}, null, changeQuickRedirect, true, 14462, new Class[]{SpLikeIconConfig.class, String.class, String.class, String.class, String.class, String.class, Integer.TYPE, Object.class}, SpLikeIconConfig.class);
        if (patchProxyResultProxy.isSupported) {
            return (SpLikeIconConfig) patchProxyResultProxy.result;
        }
        return spLikeIconConfig.copy((i10 & 1) != 0 ? spLikeIconConfig.like_before_list : str, (i10 & 2) != 0 ? spLikeIconConfig.like_after_list : str2, (i10 & 4) != 0 ? spLikeIconConfig.like_before_detail : str3, (i10 & 8) != 0 ? spLikeIconConfig.like_after_detail : str4, (i10 & 16) != 0 ? spLikeIconConfig.like_motion : str5);
    }

    @e
    public final String component1() {
        return this.like_before_list;
    }

    @e
    public final String component2() {
        return this.like_after_list;
    }

    @e
    public final String component3() {
        return this.like_before_detail;
    }

    @e
    public final String component4() {
        return this.like_after_detail;
    }

    @e
    public final String component5() {
        return this.like_motion;
    }

    @d
    public final SpLikeIconConfig copy(@e String str, @e String str2, @e String str3, @e String str4, @e String str5) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3, str4, str5}, this, changeQuickRedirect, false, 14461, new Class[]{String.class, String.class, String.class, String.class, String.class}, SpLikeIconConfig.class);
        return patchProxyResultProxy.isSupported ? (SpLikeIconConfig) patchProxyResultProxy.result : new SpLikeIconConfig(str, str2, str3, str4, str5);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14465, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SpLikeIconConfig)) {
            return false;
        }
        SpLikeIconConfig spLikeIconConfig = (SpLikeIconConfig) obj;
        return f0.g(this.like_before_list, spLikeIconConfig.like_before_list) && f0.g(this.like_after_list, spLikeIconConfig.like_after_list) && f0.g(this.like_before_detail, spLikeIconConfig.like_before_detail) && f0.g(this.like_after_detail, spLikeIconConfig.like_after_detail) && f0.g(this.like_motion, spLikeIconConfig.like_motion);
    }

    @e
    public final String getLike_after_detail() {
        return this.like_after_detail;
    }

    @e
    public final String getLike_after_list() {
        return this.like_after_list;
    }

    @e
    public final String getLike_before_detail() {
        return this.like_before_detail;
    }

    @e
    public final String getLike_before_list() {
        return this.like_before_list;
    }

    @e
    public final String getLike_motion() {
        return this.like_motion;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14464, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.like_before_list;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.like_after_list;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.like_before_detail;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.like_after_detail;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.like_motion;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public final void setLike_after_detail(@e String str) {
        this.like_after_detail = str;
    }

    public final void setLike_after_list(@e String str) {
        this.like_after_list = str;
    }

    public final void setLike_before_detail(@e String str) {
        this.like_before_detail = str;
    }

    public final void setLike_before_list(@e String str) {
        this.like_before_list = str;
    }

    public final void setLike_motion(@e String str) {
        this.like_motion = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14463, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "SpLikeIconConfig(like_before_list=" + this.like_before_list + ", like_after_list=" + this.like_after_list + ", like_before_detail=" + this.like_before_detail + ", like_after_detail=" + this.like_after_detail + ", like_motion=" + this.like_motion + ')';
    }
}
