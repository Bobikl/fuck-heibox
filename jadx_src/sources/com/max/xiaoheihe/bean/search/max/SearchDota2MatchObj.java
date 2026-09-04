package com.max.xiaoheihe.bean.search.max;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: SearchDota2MatchObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class SearchDota2MatchObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String match_id;

    @e
    private String protocol;

    public SearchDota2MatchObj(@e String str, @e String str2) {
        this.protocol = str;
        this.match_id = str2;
    }

    public static /* synthetic */ SearchDota2MatchObj copy$default(SearchDota2MatchObj searchDota2MatchObj, String str, String str2, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{searchDota2MatchObj, str, str2, new Integer(i10), obj}, null, changeQuickRedirect, true, 15888, new Class[]{SearchDota2MatchObj.class, String.class, String.class, Integer.TYPE, Object.class}, SearchDota2MatchObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (SearchDota2MatchObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            str = searchDota2MatchObj.protocol;
        }
        if ((i10 & 2) != 0) {
            str2 = searchDota2MatchObj.match_id;
        }
        return searchDota2MatchObj.copy(str, str2);
    }

    @e
    public final String component1() {
        return this.protocol;
    }

    @e
    public final String component2() {
        return this.match_id;
    }

    @d
    public final SearchDota2MatchObj copy(@e String str, @e String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 15887, new Class[]{String.class, String.class}, SearchDota2MatchObj.class);
        return patchProxyResultProxy.isSupported ? (SearchDota2MatchObj) patchProxyResultProxy.result : new SearchDota2MatchObj(str, str2);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15891, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchDota2MatchObj)) {
            return false;
        }
        SearchDota2MatchObj searchDota2MatchObj = (SearchDota2MatchObj) obj;
        return f0.g(this.protocol, searchDota2MatchObj.protocol) && f0.g(this.match_id, searchDota2MatchObj.match_id);
    }

    @e
    public final String getMatch_id() {
        return this.match_id;
    }

    @e
    public final String getProtocol() {
        return this.protocol;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15890, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.protocol;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.match_id;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setMatch_id(@e String str) {
        this.match_id = str;
    }

    public final void setProtocol(@e String str) {
        this.protocol = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15889, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "SearchDota2MatchObj(protocol=" + this.protocol + ", match_id=" + this.match_id + ')';
    }
}
