package com.max.hbsearch.bean;

import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: SearchSuggestionV2Result.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class SearchSuggestionV2Result implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;

    @d
    private List<SearchSuggestionV2Obj> suggestions;

    public SearchSuggestionV2Result(@d List<SearchSuggestionV2Obj> suggestions) {
        f0.p(suggestions, "suggestions");
        this.suggestions = suggestions;
    }

    public static /* synthetic */ SearchSuggestionV2Result copy$default(SearchSuggestionV2Result searchSuggestionV2Result, List list, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{searchSuggestionV2Result, list, new Integer(i10), obj}, null, changeQuickRedirect, true, c.k.N7, new Class[]{SearchSuggestionV2Result.class, List.class, Integer.TYPE, Object.class}, SearchSuggestionV2Result.class);
        if (patchProxyResultProxy.isSupported) {
            return (SearchSuggestionV2Result) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            list = searchSuggestionV2Result.suggestions;
        }
        return searchSuggestionV2Result.copy(list);
    }

    @d
    public final List<SearchSuggestionV2Obj> component1() {
        return this.suggestions;
    }

    @d
    public final SearchSuggestionV2Result copy(@d List<SearchSuggestionV2Obj> suggestions) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{suggestions}, this, changeQuickRedirect, false, c.k.M7, new Class[]{List.class}, SearchSuggestionV2Result.class);
        if (patchProxyResultProxy.isSupported) {
            return (SearchSuggestionV2Result) patchProxyResultProxy.result;
        }
        f0.p(suggestions, "suggestions");
        return new SearchSuggestionV2Result(suggestions);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, c.k.Q7, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        return (obj instanceof SearchSuggestionV2Result) && f0.g(this.suggestions, ((SearchSuggestionV2Result) obj).suggestions);
    }

    @d
    public final List<SearchSuggestionV2Obj> getSuggestions() {
        return this.suggestions;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.k.P7, new Class[0], Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : this.suggestions.hashCode();
    }

    public final void setSuggestions(@d List<SearchSuggestionV2Obj> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 8300, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(list, "<set-?>");
        this.suggestions = list;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.k.O7, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "SearchSuggestionV2Result(suggestions=" + this.suggestions + ')';
    }
}
