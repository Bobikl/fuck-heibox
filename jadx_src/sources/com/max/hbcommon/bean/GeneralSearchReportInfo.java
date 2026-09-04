package com.max.hbcommon.bean;

import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: GeneralSearchReportInfo.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class GeneralSearchReportInfo implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String action;

    @e
    private String index;

    @e
    private String report_id;

    @e
    private String suggested_from;

    @e
    private Long time;

    public GeneralSearchReportInfo(@e String str, @e String str2, @e Long l10, @e String str3, @e String str4) {
        this.report_id = str;
        this.action = str2;
        this.time = l10;
        this.index = str3;
        this.suggested_from = str4;
    }

    public static /* synthetic */ GeneralSearchReportInfo copy$default(GeneralSearchReportInfo generalSearchReportInfo, String str, String str2, Long l10, String str3, String str4, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{generalSearchReportInfo, str, str2, l10, str3, str4, new Integer(i10), obj}, null, changeQuickRedirect, true, c.d.K3, new Class[]{GeneralSearchReportInfo.class, String.class, String.class, Long.class, String.class, String.class, Integer.TYPE, Object.class}, GeneralSearchReportInfo.class);
        if (patchProxyResultProxy.isSupported) {
            return (GeneralSearchReportInfo) patchProxyResultProxy.result;
        }
        return generalSearchReportInfo.copy((i10 & 1) != 0 ? generalSearchReportInfo.report_id : str, (i10 & 2) != 0 ? generalSearchReportInfo.action : str2, (i10 & 4) != 0 ? generalSearchReportInfo.time : l10, (i10 & 8) != 0 ? generalSearchReportInfo.index : str3, (i10 & 16) != 0 ? generalSearchReportInfo.suggested_from : str4);
    }

    @e
    public final String component1() {
        return this.report_id;
    }

    @e
    public final String component2() {
        return this.action;
    }

    @e
    public final Long component3() {
        return this.time;
    }

    @e
    public final String component4() {
        return this.index;
    }

    @e
    public final String component5() {
        return this.suggested_from;
    }

    @d
    public final GeneralSearchReportInfo copy(@e String str, @e String str2, @e Long l10, @e String str3, @e String str4) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, l10, str3, str4}, this, changeQuickRedirect, false, c.d.J3, new Class[]{String.class, String.class, Long.class, String.class, String.class}, GeneralSearchReportInfo.class);
        return patchProxyResultProxy.isSupported ? (GeneralSearchReportInfo) patchProxyResultProxy.result : new GeneralSearchReportInfo(str, str2, l10, str3, str4);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, c.d.N3, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GeneralSearchReportInfo)) {
            return false;
        }
        GeneralSearchReportInfo generalSearchReportInfo = (GeneralSearchReportInfo) obj;
        return f0.g(this.report_id, generalSearchReportInfo.report_id) && f0.g(this.action, generalSearchReportInfo.action) && f0.g(this.time, generalSearchReportInfo.time) && f0.g(this.index, generalSearchReportInfo.index) && f0.g(this.suggested_from, generalSearchReportInfo.suggested_from);
    }

    @e
    public final String getAction() {
        return this.action;
    }

    @e
    public final String getIndex() {
        return this.index;
    }

    @e
    public final String getReport_id() {
        return this.report_id;
    }

    @e
    public final String getSuggested_from() {
        return this.suggested_from;
    }

    @e
    public final Long getTime() {
        return this.time;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.d.M3, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.report_id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.action;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l10 = this.time;
        int iHashCode3 = (iHashCode2 + (l10 == null ? 0 : l10.hashCode())) * 31;
        String str3 = this.index;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.suggested_from;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final void setAction(@e String str) {
        this.action = str;
    }

    public final void setIndex(@e String str) {
        this.index = str;
    }

    public final void setReport_id(@e String str) {
        this.report_id = str;
    }

    public final void setSuggested_from(@e String str) {
        this.suggested_from = str;
    }

    public final void setTime(@e Long l10) {
        this.time = l10;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.d.L3, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "GeneralSearchReportInfo(report_id=" + this.report_id + ", action=" + this.action + ", time=" + this.time + ", index=" + this.index + ", suggested_from=" + this.suggested_from + ')';
    }
}
