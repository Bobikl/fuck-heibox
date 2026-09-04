package com.max.xiaoheihe.bean.game;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: PushBtnClickInfoObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class PushBtnClickInfoObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String msg;

    @e
    private List<String> push_types;

    @e
    private String type;

    public PushBtnClickInfoObj(@e String str, @e List<String> list, @e String str2) {
        this.msg = str;
        this.push_types = list;
        this.type = str2;
    }

    public static /* synthetic */ PushBtnClickInfoObj copy$default(PushBtnClickInfoObj pushBtnClickInfoObj, String str, List list, String str2, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{pushBtnClickInfoObj, str, list, str2, new Integer(i10), obj}, null, changeQuickRedirect, true, 14967, new Class[]{PushBtnClickInfoObj.class, String.class, List.class, String.class, Integer.TYPE, Object.class}, PushBtnClickInfoObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (PushBtnClickInfoObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            str = pushBtnClickInfoObj.msg;
        }
        if ((i10 & 2) != 0) {
            list = pushBtnClickInfoObj.push_types;
        }
        if ((i10 & 4) != 0) {
            str2 = pushBtnClickInfoObj.type;
        }
        return pushBtnClickInfoObj.copy(str, list, str2);
    }

    @e
    public final String component1() {
        return this.msg;
    }

    @e
    public final List<String> component2() {
        return this.push_types;
    }

    @e
    public final String component3() {
        return this.type;
    }

    @d
    public final PushBtnClickInfoObj copy(@e String str, @e List<String> list, @e String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, list, str2}, this, changeQuickRedirect, false, 14966, new Class[]{String.class, List.class, String.class}, PushBtnClickInfoObj.class);
        return patchProxyResultProxy.isSupported ? (PushBtnClickInfoObj) patchProxyResultProxy.result : new PushBtnClickInfoObj(str, list, str2);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14970, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PushBtnClickInfoObj)) {
            return false;
        }
        PushBtnClickInfoObj pushBtnClickInfoObj = (PushBtnClickInfoObj) obj;
        return f0.g(this.msg, pushBtnClickInfoObj.msg) && f0.g(this.push_types, pushBtnClickInfoObj.push_types) && f0.g(this.type, pushBtnClickInfoObj.type);
    }

    @e
    public final String getMsg() {
        return this.msg;
    }

    @e
    public final List<String> getPush_types() {
        return this.push_types;
    }

    @e
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14969, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.msg;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<String> list = this.push_types;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.type;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setMsg(@e String str) {
        this.msg = str;
    }

    public final void setPush_types(@e List<String> list) {
        this.push_types = list;
    }

    public final void setType(@e String str) {
        this.type = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14968, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "PushBtnClickInfoObj(msg=" + this.msg + ", push_types=" + this.push_types + ", type=" + this.type + ')';
    }
}
