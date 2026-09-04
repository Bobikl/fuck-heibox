package com.max.xiaoheihe.bean.search;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: SearchFeedbackV2List.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class SearchFeedbackV2List implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String after_feedback_desc;

    @e
    private String feedback_title;

    @e
    private List<SearchFeedbackV2Item> items;

    public SearchFeedbackV2List(@e String str, @e String str2, @e List<SearchFeedbackV2Item> list) {
        this.feedback_title = str;
        this.after_feedback_desc = str2;
        this.items = list;
    }

    public static /* synthetic */ SearchFeedbackV2List copy$default(SearchFeedbackV2List searchFeedbackV2List, String str, String str2, List list, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{searchFeedbackV2List, str, str2, list, new Integer(i10), obj}, null, changeQuickRedirect, true, 15852, new Class[]{SearchFeedbackV2List.class, String.class, String.class, List.class, Integer.TYPE, Object.class}, SearchFeedbackV2List.class);
        if (patchProxyResultProxy.isSupported) {
            return (SearchFeedbackV2List) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            str = searchFeedbackV2List.feedback_title;
        }
        if ((i10 & 2) != 0) {
            str2 = searchFeedbackV2List.after_feedback_desc;
        }
        if ((i10 & 4) != 0) {
            list = searchFeedbackV2List.items;
        }
        return searchFeedbackV2List.copy(str, str2, list);
    }

    @e
    public final String component1() {
        return this.feedback_title;
    }

    @e
    public final String component2() {
        return this.after_feedback_desc;
    }

    @e
    public final List<SearchFeedbackV2Item> component3() {
        return this.items;
    }

    @d
    public final SearchFeedbackV2List copy(@e String str, @e String str2, @e List<SearchFeedbackV2Item> list) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, list}, this, changeQuickRedirect, false, 15851, new Class[]{String.class, String.class, List.class}, SearchFeedbackV2List.class);
        return patchProxyResultProxy.isSupported ? (SearchFeedbackV2List) patchProxyResultProxy.result : new SearchFeedbackV2List(str, str2, list);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15855, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchFeedbackV2List)) {
            return false;
        }
        SearchFeedbackV2List searchFeedbackV2List = (SearchFeedbackV2List) obj;
        return f0.g(this.feedback_title, searchFeedbackV2List.feedback_title) && f0.g(this.after_feedback_desc, searchFeedbackV2List.after_feedback_desc) && f0.g(this.items, searchFeedbackV2List.items);
    }

    @e
    public final String getAfter_feedback_desc() {
        return this.after_feedback_desc;
    }

    @e
    public final String getFeedback_title() {
        return this.feedback_title;
    }

    @e
    public final List<SearchFeedbackV2Item> getItems() {
        return this.items;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15854, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.feedback_title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.after_feedback_desc;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<SearchFeedbackV2Item> list = this.items;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final void setAfter_feedback_desc(@e String str) {
        this.after_feedback_desc = str;
    }

    public final void setFeedback_title(@e String str) {
        this.feedback_title = str;
    }

    public final void setItems(@e List<SearchFeedbackV2Item> list) {
        this.items = list;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15853, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "SearchFeedbackV2List(feedback_title=" + this.feedback_title + ", after_feedback_desc=" + this.after_feedback_desc + ", items=" + this.items + ')';
    }
}
