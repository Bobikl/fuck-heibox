package com.max.xiaoheihe.bean.search;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: RelevantSearchListObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class RelevantSearchObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String custom_index;

    @e
    private String report_id;

    @e
    private String text;

    public RelevantSearchObj(@e String str, @e String str2, @e String str3) {
        this.text = str;
        this.report_id = str2;
        this.custom_index = str3;
    }

    public static /* synthetic */ RelevantSearchObj copy$default(RelevantSearchObj relevantSearchObj, String str, String str2, String str3, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{relevantSearchObj, str, str2, str3, new Integer(i10), obj}, null, changeQuickRedirect, true, 15827, new Class[]{RelevantSearchObj.class, String.class, String.class, String.class, Integer.TYPE, Object.class}, RelevantSearchObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (RelevantSearchObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            str = relevantSearchObj.text;
        }
        if ((i10 & 2) != 0) {
            str2 = relevantSearchObj.report_id;
        }
        if ((i10 & 4) != 0) {
            str3 = relevantSearchObj.custom_index;
        }
        return relevantSearchObj.copy(str, str2, str3);
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
        return this.custom_index;
    }

    @d
    public final RelevantSearchObj copy(@e String str, @e String str2, @e String str3) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3}, this, changeQuickRedirect, false, 15826, new Class[]{String.class, String.class, String.class}, RelevantSearchObj.class);
        return patchProxyResultProxy.isSupported ? (RelevantSearchObj) patchProxyResultProxy.result : new RelevantSearchObj(str, str2, str3);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15830, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RelevantSearchObj)) {
            return false;
        }
        RelevantSearchObj relevantSearchObj = (RelevantSearchObj) obj;
        return f0.g(this.text, relevantSearchObj.text) && f0.g(this.report_id, relevantSearchObj.report_id) && f0.g(this.custom_index, relevantSearchObj.custom_index);
    }

    @e
    public final String getCustom_index() {
        return this.custom_index;
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
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15829, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.text;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.report_id;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.custom_index;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final void setCustom_index(@e String str) {
        this.custom_index = str;
    }

    public final void setReport_id(@e String str) {
        this.report_id = str;
    }

    public final void setText(@e String str) {
        this.text = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15828, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "RelevantSearchObj(text=" + this.text + ", report_id=" + this.report_id + ", custom_index=" + this.custom_index + ')';
    }
}
