package com.max.xiaoheihe.bean.bbs.webwithnative;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: RecommendStateObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class RecommendStateObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String extra;

    @e
    private String state;

    @e
    private String user_id;

    public RecommendStateObj(@e String str, @e String str2, @e String str3) {
        this.user_id = str;
        this.state = str2;
        this.extra = str3;
    }

    public static /* synthetic */ RecommendStateObj copy$default(RecommendStateObj recommendStateObj, String str, String str2, String str3, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{recommendStateObj, str, str2, str3, new Integer(i10), obj}, null, changeQuickRedirect, true, 14576, new Class[]{RecommendStateObj.class, String.class, String.class, String.class, Integer.TYPE, Object.class}, RecommendStateObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (RecommendStateObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            str = recommendStateObj.user_id;
        }
        if ((i10 & 2) != 0) {
            str2 = recommendStateObj.state;
        }
        if ((i10 & 4) != 0) {
            str3 = recommendStateObj.extra;
        }
        return recommendStateObj.copy(str, str2, str3);
    }

    @e
    public final String component1() {
        return this.user_id;
    }

    @e
    public final String component2() {
        return this.state;
    }

    @e
    public final String component3() {
        return this.extra;
    }

    @d
    public final RecommendStateObj copy(@e String str, @e String str2, @e String str3) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3}, this, changeQuickRedirect, false, 14575, new Class[]{String.class, String.class, String.class}, RecommendStateObj.class);
        return patchProxyResultProxy.isSupported ? (RecommendStateObj) patchProxyResultProxy.result : new RecommendStateObj(str, str2, str3);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14579, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecommendStateObj)) {
            return false;
        }
        RecommendStateObj recommendStateObj = (RecommendStateObj) obj;
        return f0.g(this.user_id, recommendStateObj.user_id) && f0.g(this.state, recommendStateObj.state) && f0.g(this.extra, recommendStateObj.extra);
    }

    @e
    public final String getExtra() {
        return this.extra;
    }

    @e
    public final String getState() {
        return this.state;
    }

    @e
    public final String getUser_id() {
        return this.user_id;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14578, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.user_id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.state;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.extra;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final void setExtra(@e String str) {
        this.extra = str;
    }

    public final void setState(@e String str) {
        this.state = str;
    }

    public final void setUser_id(@e String str) {
        this.user_id = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14577, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "RecommendStateObj(user_id=" + this.user_id + ", state=" + this.state + ", extra=" + this.extra + ')';
    }
}
