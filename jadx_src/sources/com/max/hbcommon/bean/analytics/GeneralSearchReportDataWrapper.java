package com.max.hbcommon.bean.analytics;

import bb.c;
import com.max.hbcommon.bean.GeneralSearchReportInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: GeneralSearchReportDataWrapper.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class GeneralSearchReportDataWrapper implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private List<GeneralSearchReportInfo> items;

    @e
    private String report_type;

    public GeneralSearchReportDataWrapper(@e String str, @e List<GeneralSearchReportInfo> list) {
        this.report_type = str;
        this.items = list;
    }

    public static /* synthetic */ GeneralSearchReportDataWrapper copy$default(GeneralSearchReportDataWrapper generalSearchReportDataWrapper, String str, List list, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{generalSearchReportDataWrapper, str, list, new Integer(i10), obj}, null, changeQuickRedirect, true, c.d.S4, new Class[]{GeneralSearchReportDataWrapper.class, String.class, List.class, Integer.TYPE, Object.class}, GeneralSearchReportDataWrapper.class);
        if (patchProxyResultProxy.isSupported) {
            return (GeneralSearchReportDataWrapper) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            str = generalSearchReportDataWrapper.report_type;
        }
        if ((i10 & 2) != 0) {
            list = generalSearchReportDataWrapper.items;
        }
        return generalSearchReportDataWrapper.copy(str, list);
    }

    @e
    public final String component1() {
        return this.report_type;
    }

    @e
    public final List<GeneralSearchReportInfo> component2() {
        return this.items;
    }

    @d
    public final GeneralSearchReportDataWrapper copy(@e String str, @e List<GeneralSearchReportInfo> list) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, list}, this, changeQuickRedirect, false, c.d.R4, new Class[]{String.class, List.class}, GeneralSearchReportDataWrapper.class);
        return patchProxyResultProxy.isSupported ? (GeneralSearchReportDataWrapper) patchProxyResultProxy.result : new GeneralSearchReportDataWrapper(str, list);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, c.d.V4, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GeneralSearchReportDataWrapper)) {
            return false;
        }
        GeneralSearchReportDataWrapper generalSearchReportDataWrapper = (GeneralSearchReportDataWrapper) obj;
        return f0.g(this.report_type, generalSearchReportDataWrapper.report_type) && f0.g(this.items, generalSearchReportDataWrapper.items);
    }

    @e
    public final List<GeneralSearchReportInfo> getItems() {
        return this.items;
    }

    @e
    public final String getReport_type() {
        return this.report_type;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.d.U4, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.report_type;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<GeneralSearchReportInfo> list = this.items;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final void setItems(@e List<GeneralSearchReportInfo> list) {
        this.items = list;
    }

    public final void setReport_type(@e String str) {
        this.report_type = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.d.T4, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "GeneralSearchReportDataWrapper(report_type=" + this.report_type + ", items=" + this.items + ')';
    }
}
