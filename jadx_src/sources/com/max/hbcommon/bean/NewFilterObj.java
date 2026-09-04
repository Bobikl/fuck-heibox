package com.max.hbcommon.bean;

import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: NewFilterObj.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class NewFilterObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String desc;

    @e
    private String key;

    @e
    private String text;

    public NewFilterObj(@e String str, @e String str2, @e String str3) {
        this.key = str;
        this.desc = str2;
        this.text = str3;
    }

    public static /* synthetic */ NewFilterObj copy$default(NewFilterObj newFilterObj, String str, String str2, String str3, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{newFilterObj, str, str2, str3, new Integer(i10), obj}, null, changeQuickRedirect, true, c.d.f31431o4, new Class[]{NewFilterObj.class, String.class, String.class, String.class, Integer.TYPE, Object.class}, NewFilterObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (NewFilterObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            str = newFilterObj.key;
        }
        if ((i10 & 2) != 0) {
            str2 = newFilterObj.desc;
        }
        if ((i10 & 4) != 0) {
            str3 = newFilterObj.text;
        }
        return newFilterObj.copy(str, str2, str3);
    }

    @e
    public final String component1() {
        return this.key;
    }

    @e
    public final String component2() {
        return this.desc;
    }

    @e
    public final String component3() {
        return this.text;
    }

    @d
    public final NewFilterObj copy(@e String str, @e String str2, @e String str3) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3}, this, changeQuickRedirect, false, c.d.f31408n4, new Class[]{String.class, String.class, String.class}, NewFilterObj.class);
        return patchProxyResultProxy.isSupported ? (NewFilterObj) patchProxyResultProxy.result : new NewFilterObj(str, str2, str3);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, c.d.f31499r4, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewFilterObj)) {
            return false;
        }
        NewFilterObj newFilterObj = (NewFilterObj) obj;
        return f0.g(this.key, newFilterObj.key) && f0.g(this.desc, newFilterObj.desc) && f0.g(this.text, newFilterObj.text);
    }

    @e
    public final String getDesc() {
        return this.desc;
    }

    @e
    public final String getKey() {
        return this.key;
    }

    @e
    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.d.f31477q4, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.key;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.desc;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.text;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final void setDesc(@e String str) {
        this.desc = str;
    }

    public final void setKey(@e String str) {
        this.key = str;
    }

    public final void setText(@e String str) {
        this.text = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 2304, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "NewFilterObj(key=" + this.key + ", desc=" + this.desc + ", text=" + this.text + ')';
    }
}
