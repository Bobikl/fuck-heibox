package com.max.hbcommon.bean.question;

import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: OptionObj.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class OptionObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String o_desc;

    @e
    private String o_id;

    @e
    private String o_type;

    public OptionObj(@e String str, @e String str2, @e String str3) {
        this.o_id = str;
        this.o_desc = str2;
        this.o_type = str3;
    }

    public static /* synthetic */ OptionObj copy$default(OptionObj optionObj, String str, String str2, String str3, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{optionObj, str, str2, str3, new Integer(i10), obj}, null, changeQuickRedirect, true, c.d.f31500r5, new Class[]{OptionObj.class, String.class, String.class, String.class, Integer.TYPE, Object.class}, OptionObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (OptionObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            str = optionObj.o_id;
        }
        if ((i10 & 2) != 0) {
            str2 = optionObj.o_desc;
        }
        if ((i10 & 4) != 0) {
            str3 = optionObj.o_type;
        }
        return optionObj.copy(str, str2, str3);
    }

    @e
    public final String component1() {
        return this.o_id;
    }

    @e
    public final String component2() {
        return this.o_desc;
    }

    @e
    public final String component3() {
        return this.o_type;
    }

    @d
    public final OptionObj copy(@e String str, @e String str2, @e String str3) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3}, this, changeQuickRedirect, false, c.d.f31478q5, new Class[]{String.class, String.class, String.class}, OptionObj.class);
        return patchProxyResultProxy.isSupported ? (OptionObj) patchProxyResultProxy.result : new OptionObj(str, str2, str3);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, c.d.f31566u5, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OptionObj)) {
            return false;
        }
        OptionObj optionObj = (OptionObj) obj;
        return f0.g(this.o_id, optionObj.o_id) && f0.g(this.o_desc, optionObj.o_desc) && f0.g(this.o_type, optionObj.o_type);
    }

    @e
    public final String getO_desc() {
        return this.o_desc;
    }

    @e
    public final String getO_id() {
        return this.o_id;
    }

    @e
    public final String getO_type() {
        return this.o_type;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.d.f31544t5, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.o_id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.o_desc;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.o_type;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final boolean isPositive() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.d.f31455p5, new Class[0], Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : f0.g("1", this.o_type);
    }

    public final void setO_desc(@e String str) {
        this.o_desc = str;
    }

    public final void setO_id(@e String str) {
        this.o_id = str;
    }

    public final void setO_type(@e String str) {
        this.o_type = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.d.f31522s5, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "OptionObj(o_id=" + this.o_id + ", o_desc=" + this.o_desc + ", o_type=" + this.o_type + ')';
    }
}
