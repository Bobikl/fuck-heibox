package com.max.xiaoheihe.bean.account;

import androidx.compose.runtime.internal.o;
import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: DialogButtonObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class DialogButtonObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String desc;

    @e
    private List<String> hashtags;

    public DialogButtonObj(@e String str, @e List<String> list) {
        this.desc = str;
        this.hashtags = list;
    }

    public static /* synthetic */ DialogButtonObj copy$default(DialogButtonObj dialogButtonObj, String str, List list, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{dialogButtonObj, str, list, new Integer(i10), obj}, null, changeQuickRedirect, true, c.m.YO, new Class[]{DialogButtonObj.class, String.class, List.class, Integer.TYPE, Object.class}, DialogButtonObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (DialogButtonObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            str = dialogButtonObj.desc;
        }
        if ((i10 & 2) != 0) {
            list = dialogButtonObj.hashtags;
        }
        return dialogButtonObj.copy(str, list);
    }

    @e
    public final String component1() {
        return this.desc;
    }

    @e
    public final List<String> component2() {
        return this.hashtags;
    }

    @d
    public final DialogButtonObj copy(@e String str, @e List<String> list) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, list}, this, changeQuickRedirect, false, c.m.XO, new Class[]{String.class, List.class}, DialogButtonObj.class);
        return patchProxyResultProxy.isSupported ? (DialogButtonObj) patchProxyResultProxy.result : new DialogButtonObj(str, list);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, c.m.bP, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DialogButtonObj)) {
            return false;
        }
        DialogButtonObj dialogButtonObj = (DialogButtonObj) obj;
        return f0.g(this.desc, dialogButtonObj.desc) && f0.g(this.hashtags, dialogButtonObj.hashtags);
    }

    @e
    public final String getDesc() {
        return this.desc;
    }

    @e
    public final List<String> getHashtags() {
        return this.hashtags;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.aP, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.desc;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<String> list = this.hashtags;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final void setDesc(@e String str) {
        this.desc = str;
    }

    public final void setHashtags(@e List<String> list) {
        this.hashtags = list;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.ZO, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "DialogButtonObj(desc=" + this.desc + ", hashtags=" + this.hashtags + ')';
    }
}
