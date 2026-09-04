package com.max.xiaoheihe.bean.search;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: SearchFeedbackV2List.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class SearchFeedbackV2Item implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String protocol;

    @e
    private String report_id;

    @e
    private String text;

    public SearchFeedbackV2Item(@e String str, @e String str2, @e String str3) {
        this.text = str;
        this.report_id = str2;
        this.protocol = str3;
    }

    public static /* synthetic */ SearchFeedbackV2Item copy$default(SearchFeedbackV2Item searchFeedbackV2Item, String str, String str2, String str3, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{searchFeedbackV2Item, str, str2, str3, new Integer(i10), obj}, null, changeQuickRedirect, true, 15847, new Class[]{SearchFeedbackV2Item.class, String.class, String.class, String.class, Integer.TYPE, Object.class}, SearchFeedbackV2Item.class);
        if (patchProxyResultProxy.isSupported) {
            return (SearchFeedbackV2Item) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            str = searchFeedbackV2Item.text;
        }
        if ((i10 & 2) != 0) {
            str2 = searchFeedbackV2Item.report_id;
        }
        if ((i10 & 4) != 0) {
            str3 = searchFeedbackV2Item.protocol;
        }
        return searchFeedbackV2Item.copy(str, str2, str3);
    }

    @e
    public final String component1() {
        return this.text;
    }

    @e
    public final String component2() {
        return this.report_id;
    }

    @e
    public final String component3() {
        return this.protocol;
    }

    @d
    public final SearchFeedbackV2Item copy(@e String str, @e String str2, @e String str3) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3}, this, changeQuickRedirect, false, 15846, new Class[]{String.class, String.class, String.class}, SearchFeedbackV2Item.class);
        return patchProxyResultProxy.isSupported ? (SearchFeedbackV2Item) patchProxyResultProxy.result : new SearchFeedbackV2Item(str, str2, str3);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15850, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchFeedbackV2Item)) {
            return false;
        }
        SearchFeedbackV2Item searchFeedbackV2Item = (SearchFeedbackV2Item) obj;
        return f0.g(this.text, searchFeedbackV2Item.text) && f0.g(this.report_id, searchFeedbackV2Item.report_id) && f0.g(this.protocol, searchFeedbackV2Item.protocol);
    }

    @e
    public final String getProtocol() {
        return this.protocol;
    }

    @e
    public final String getReport_id() {
        return this.report_id;
    }

    @e
    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15849, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.text;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.report_id;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.protocol;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final void setProtocol(@e String str) {
        this.protocol = str;
    }

    public final void setReport_id(@e String str) {
        this.report_id = str;
    }

    public final void setText(@e String str) {
        this.text = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15848, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "SearchFeedbackV2Item(text=" + this.text + ", report_id=" + this.report_id + ", protocol=" + this.protocol + ')';
    }
}
