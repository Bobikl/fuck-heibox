package com.max.xiaoheihe.bean.game;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: MultiDimensionObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class PostMultiDimensionObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String user_label;

    @e
    private String user_star;

    public PostMultiDimensionObj(@e String str, @e String str2) {
        this.user_star = str;
        this.user_label = str2;
    }

    public static /* synthetic */ PostMultiDimensionObj copy$default(PostMultiDimensionObj postMultiDimensionObj, String str, String str2, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{postMultiDimensionObj, str, str2, new Integer(i10), obj}, null, changeQuickRedirect, true, 14946, new Class[]{PostMultiDimensionObj.class, String.class, String.class, Integer.TYPE, Object.class}, PostMultiDimensionObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (PostMultiDimensionObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            str = postMultiDimensionObj.user_star;
        }
        if ((i10 & 2) != 0) {
            str2 = postMultiDimensionObj.user_label;
        }
        return postMultiDimensionObj.copy(str, str2);
    }

    @e
    public final String component1() {
        return this.user_star;
    }

    @e
    public final String component2() {
        return this.user_label;
    }

    @d
    public final PostMultiDimensionObj copy(@e String str, @e String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 14945, new Class[]{String.class, String.class}, PostMultiDimensionObj.class);
        return patchProxyResultProxy.isSupported ? (PostMultiDimensionObj) patchProxyResultProxy.result : new PostMultiDimensionObj(str, str2);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14949, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PostMultiDimensionObj)) {
            return false;
        }
        PostMultiDimensionObj postMultiDimensionObj = (PostMultiDimensionObj) obj;
        return f0.g(this.user_star, postMultiDimensionObj.user_star) && f0.g(this.user_label, postMultiDimensionObj.user_label);
    }

    @e
    public final String getUser_label() {
        return this.user_label;
    }

    @e
    public final String getUser_star() {
        return this.user_star;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14948, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.user_star;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.user_label;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setUser_label(@e String str) {
        this.user_label = str;
    }

    public final void setUser_star(@e String str) {
        this.user_star = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14947, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "PostMultiDimensionObj(user_star=" + this.user_star + ", user_label=" + this.user_label + ')';
    }
}
