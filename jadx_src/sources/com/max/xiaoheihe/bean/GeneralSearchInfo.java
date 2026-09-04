package com.max.xiaoheihe.bean;

import androidx.compose.runtime.internal.o;
import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: GeneralSearchInfo.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class GeneralSearchInfo implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;
    private boolean custom_clicked;

    @e
    private String info;

    @e
    private String report_id;

    @e
    private String report_idx;
    private boolean showDivider = true;

    @e
    private String suggested_from;

    @e
    private String type;

    public GeneralSearchInfo(@e String str, @e String str2, @e String str3) {
        this.info = str;
        this.type = str2;
        this.report_id = str3;
    }

    public static /* synthetic */ GeneralSearchInfo copy$default(GeneralSearchInfo generalSearchInfo, String str, String str2, String str3, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{generalSearchInfo, str, str2, str3, new Integer(i10), obj}, null, changeQuickRedirect, true, c.m.fM, new Class[]{GeneralSearchInfo.class, String.class, String.class, String.class, Integer.TYPE, Object.class}, GeneralSearchInfo.class);
        if (patchProxyResultProxy.isSupported) {
            return (GeneralSearchInfo) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            str = generalSearchInfo.info;
        }
        if ((i10 & 2) != 0) {
            str2 = generalSearchInfo.type;
        }
        if ((i10 & 4) != 0) {
            str3 = generalSearchInfo.report_id;
        }
        return generalSearchInfo.copy(str, str2, str3);
    }

    @e
    public final String component1() {
        return this.info;
    }

    @e
    public final String component2() {
        return this.type;
    }

    @e
    public final String component3() {
        return this.report_id;
    }

    @d
    public final GeneralSearchInfo copy(@e String str, @e String str2, @e String str3) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3}, this, changeQuickRedirect, false, c.m.eM, new Class[]{String.class, String.class, String.class}, GeneralSearchInfo.class);
        return patchProxyResultProxy.isSupported ? (GeneralSearchInfo) patchProxyResultProxy.result : new GeneralSearchInfo(str, str2, str3);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, c.m.iM, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GeneralSearchInfo)) {
            return false;
        }
        GeneralSearchInfo generalSearchInfo = (GeneralSearchInfo) obj;
        return f0.g(this.info, generalSearchInfo.info) && f0.g(this.type, generalSearchInfo.type) && f0.g(this.report_id, generalSearchInfo.report_id);
    }

    public final boolean getCustom_clicked() {
        return this.custom_clicked;
    }

    @e
    public final String getInfo() {
        return this.info;
    }

    @e
    public final String getReport_id() {
        return this.report_id;
    }

    @e
    public final String getReport_idx() {
        return this.report_idx;
    }

    public final boolean getShowDivider() {
        return this.showDivider;
    }

    @e
    public final String getSuggested_from() {
        return this.suggested_from;
    }

    @e
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.hM, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.info;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.type;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.report_id;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final void setCustom_clicked(boolean z10) {
        this.custom_clicked = z10;
    }

    public final void setInfo(@e String str) {
        this.info = str;
    }

    public final void setReport_id(@e String str) {
        this.report_id = str;
    }

    public final void setReport_idx(@e String str) {
        this.report_idx = str;
    }

    public final void setShowDivider(boolean z10) {
        this.showDivider = z10;
    }

    public final void setSuggested_from(@e String str) {
        this.suggested_from = str;
    }

    public final void setType(@e String str) {
        this.type = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.gM, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "GeneralSearchInfo(info=" + this.info + ", type=" + this.type + ", report_id=" + this.report_id + ')';
    }
}
