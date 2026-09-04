package com.max.xiaoheihe.bean.search;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: SearchFeedbackInfo.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class SearchFeedbackInfo implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String protocol;

    public SearchFeedbackInfo(@e String str) {
        this.protocol = str;
    }

    public static /* synthetic */ SearchFeedbackInfo copy$default(SearchFeedbackInfo searchFeedbackInfo, String str, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{searchFeedbackInfo, str, new Integer(i10), obj}, null, changeQuickRedirect, true, 15842, new Class[]{SearchFeedbackInfo.class, String.class, Integer.TYPE, Object.class}, SearchFeedbackInfo.class);
        if (patchProxyResultProxy.isSupported) {
            return (SearchFeedbackInfo) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            str = searchFeedbackInfo.protocol;
        }
        return searchFeedbackInfo.copy(str);
    }

    @e
    public final String component1() {
        return this.protocol;
    }

    @d
    public final SearchFeedbackInfo copy(@e String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 15841, new Class[]{String.class}, SearchFeedbackInfo.class);
        return patchProxyResultProxy.isSupported ? (SearchFeedbackInfo) patchProxyResultProxy.result : new SearchFeedbackInfo(str);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15845, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        return (obj instanceof SearchFeedbackInfo) && f0.g(this.protocol, ((SearchFeedbackInfo) obj).protocol);
    }

    @e
    public final String getProtocol() {
        return this.protocol;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15844, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.protocol;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final void setProtocol(@e String str) {
        this.protocol = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15843, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "SearchFeedbackInfo(protocol=" + this.protocol + ')';
    }
}
