package com.max.xiaoheihe.bean.search;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: SearchCorrectionObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class SearchCorrectionInfo implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String custom_idx;

    @e
    private String report_id;

    @e
    private String text;

    @e
    private String type;

    public SearchCorrectionInfo(@e String str, @e String str2, @e String str3, @e String str4) {
        this.type = str;
        this.text = str2;
        this.report_id = str3;
        this.custom_idx = str4;
    }

    public static /* synthetic */ SearchCorrectionInfo copy$default(SearchCorrectionInfo searchCorrectionInfo, String str, String str2, String str3, String str4, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{searchCorrectionInfo, str, str2, str3, str4, new Integer(i10), obj}, null, changeQuickRedirect, true, 15832, new Class[]{SearchCorrectionInfo.class, String.class, String.class, String.class, String.class, Integer.TYPE, Object.class}, SearchCorrectionInfo.class);
        if (patchProxyResultProxy.isSupported) {
            return (SearchCorrectionInfo) patchProxyResultProxy.result;
        }
        return searchCorrectionInfo.copy((i10 & 1) != 0 ? searchCorrectionInfo.type : str, (i10 & 2) != 0 ? searchCorrectionInfo.text : str2, (i10 & 4) != 0 ? searchCorrectionInfo.report_id : str3, (i10 & 8) != 0 ? searchCorrectionInfo.custom_idx : str4);
    }

    @e
    public final String component1() {
        return this.type;
    }

    @e
    public final String component2() {
        return this.text;
    }

    @e
    public final String component3() {
        return this.report_id;
    }

    @e
    public final String component4() {
        return this.custom_idx;
    }

    @d
    public final SearchCorrectionInfo copy(@e String str, @e String str2, @e String str3, @e String str4) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3, str4}, this, changeQuickRedirect, false, 15831, new Class[]{String.class, String.class, String.class, String.class}, SearchCorrectionInfo.class);
        return patchProxyResultProxy.isSupported ? (SearchCorrectionInfo) patchProxyResultProxy.result : new SearchCorrectionInfo(str, str2, str3, str4);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15835, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchCorrectionInfo)) {
            return false;
        }
        SearchCorrectionInfo searchCorrectionInfo = (SearchCorrectionInfo) obj;
        return f0.g(this.type, searchCorrectionInfo.type) && f0.g(this.text, searchCorrectionInfo.text) && f0.g(this.report_id, searchCorrectionInfo.report_id) && f0.g(this.custom_idx, searchCorrectionInfo.custom_idx);
    }

    @e
    public final String getCustom_idx() {
        return this.custom_idx;
    }

    @e
    public final String getReport_id() {
        return this.report_id;
    }

    @e
    public final String getText() {
        return this.text;
    }

    @e
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15834, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.type;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.text;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.report_id;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.custom_idx;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final void setCustom_idx(@e String str) {
        this.custom_idx = str;
    }

    public final void setReport_id(@e String str) {
        this.report_id = str;
    }

    public final void setText(@e String str) {
        this.text = str;
    }

    public final void setType(@e String str) {
        this.type = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15833, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "SearchCorrectionInfo(type=" + this.type + ", text=" + this.text + ", report_id=" + this.report_id + ", custom_idx=" + this.custom_idx + ')';
    }
}
