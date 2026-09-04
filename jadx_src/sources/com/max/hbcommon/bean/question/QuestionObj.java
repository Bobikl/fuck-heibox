package com.max.hbcommon.bean.question;

import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: QuestionObj.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class QuestionObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private List<OptionObj> options;

    @e
    private String q_desc;

    @e
    private String q_id;

    @e
    private String q_version;

    @e
    private String selected;

    public QuestionObj(@e String str, @e String str2, @e String str3, @e String str4, @e List<OptionObj> list) {
        this.q_id = str;
        this.q_desc = str2;
        this.q_version = str3;
        this.selected = str4;
        this.options = list;
    }

    public static /* synthetic */ QuestionObj copy$default(QuestionObj questionObj, String str, String str2, String str3, String str4, List list, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{questionObj, str, str2, str3, str4, list, new Integer(i10), obj}, null, changeQuickRedirect, true, c.d.C5, new Class[]{QuestionObj.class, String.class, String.class, String.class, String.class, List.class, Integer.TYPE, Object.class}, QuestionObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (QuestionObj) patchProxyResultProxy.result;
        }
        return questionObj.copy((i10 & 1) != 0 ? questionObj.q_id : str, (i10 & 2) != 0 ? questionObj.q_desc : str2, (i10 & 4) != 0 ? questionObj.q_version : str3, (i10 & 8) != 0 ? questionObj.selected : str4, (i10 & 16) != 0 ? questionObj.options : list);
    }

    @e
    public final String component1() {
        return this.q_id;
    }

    @e
    public final String component2() {
        return this.q_desc;
    }

    @e
    public final String component3() {
        return this.q_version;
    }

    @e
    public final String component4() {
        return this.selected;
    }

    @e
    public final List<OptionObj> component5() {
        return this.options;
    }

    @d
    public final QuestionObj copy(@e String str, @e String str2, @e String str3, @e String str4, @e List<OptionObj> list) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3, str4, list}, this, changeQuickRedirect, false, c.d.B5, new Class[]{String.class, String.class, String.class, String.class, List.class}, QuestionObj.class);
        return patchProxyResultProxy.isSupported ? (QuestionObj) patchProxyResultProxy.result : new QuestionObj(str, str2, str3, str4, list);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, c.d.F5, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QuestionObj)) {
            return false;
        }
        QuestionObj questionObj = (QuestionObj) obj;
        return f0.g(this.q_id, questionObj.q_id) && f0.g(this.q_desc, questionObj.q_desc) && f0.g(this.q_version, questionObj.q_version) && f0.g(this.selected, questionObj.selected) && f0.g(this.options, questionObj.options);
    }

    @e
    public final List<OptionObj> getOptions() {
        return this.options;
    }

    @e
    public final String getQ_desc() {
        return this.q_desc;
    }

    @e
    public final String getQ_id() {
        return this.q_id;
    }

    @e
    public final String getQ_version() {
        return this.q_version;
    }

    @e
    public final OptionObj getSelectOption() {
        List<OptionObj> list;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.d.A5, new Class[0], OptionObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (OptionObj) patchProxyResultProxy.result;
        }
        if (this.selected == null || (list = this.options) == null) {
            return null;
        }
        f0.m(list);
        for (OptionObj optionObj : list) {
            if (f0.g(this.selected, optionObj.getO_id())) {
                return optionObj;
            }
        }
        return null;
    }

    @e
    public final String getSelected() {
        return this.selected;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.d.E5, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.q_id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.q_desc;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.q_version;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.selected;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<OptionObj> list = this.options;
        return iHashCode4 + (list != null ? list.hashCode() : 0);
    }

    public final void setOptions(@e List<OptionObj> list) {
        this.options = list;
    }

    public final void setQ_desc(@e String str) {
        this.q_desc = str;
    }

    public final void setQ_id(@e String str) {
        this.q_id = str;
    }

    public final void setQ_version(@e String str) {
        this.q_version = str;
    }

    public final void setSelected(@e String str) {
        this.selected = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.d.D5, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "QuestionObj(q_id=" + this.q_id + ", q_desc=" + this.q_desc + ", q_version=" + this.q_version + ", selected=" + this.selected + ", options=" + this.options + ')';
    }
}
