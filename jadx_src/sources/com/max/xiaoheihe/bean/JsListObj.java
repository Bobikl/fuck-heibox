package com.max.xiaoheihe.bean;

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

/* JADX INFO: compiled from: JsListObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class JsListObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private List<String> js_list;

    public JsListObj(@e List<String> list) {
        this.js_list = list;
    }

    public static /* synthetic */ JsListObj copy$default(JsListObj jsListObj, List list, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{jsListObj, list, new Integer(i10), obj}, null, changeQuickRedirect, true, c.m.xM, new Class[]{JsListObj.class, List.class, Integer.TYPE, Object.class}, JsListObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (JsListObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            list = jsListObj.js_list;
        }
        return jsListObj.copy(list);
    }

    @e
    public final List<String> component1() {
        return this.js_list;
    }

    @d
    public final JsListObj copy(@e List<String> list) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, c.m.wM, new Class[]{List.class}, JsListObj.class);
        return patchProxyResultProxy.isSupported ? (JsListObj) patchProxyResultProxy.result : new JsListObj(list);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, c.m.AM, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        return (obj instanceof JsListObj) && f0.g(this.js_list, ((JsListObj) obj).js_list);
    }

    @e
    public final List<String> getJs_list() {
        return this.js_list;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.zM, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        List<String> list = this.js_list;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final void setJs_list(@e List<String> list) {
        this.js_list = list;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.yM, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "JsListObj(js_list=" + this.js_list + ')';
    }
}
