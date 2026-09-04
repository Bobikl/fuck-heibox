package com.max.xiaoheihe.bean;

import androidx.compose.runtime.internal.o;
import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: WebPackageResultObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class WebPackageResultObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private ArrayList<WebPackageObjV2> list;

    public WebPackageResultObj(@e ArrayList<WebPackageObjV2> arrayList) {
        this.list = arrayList;
    }

    public static /* synthetic */ WebPackageResultObj copy$default(WebPackageResultObj webPackageResultObj, ArrayList arrayList, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{webPackageResultObj, arrayList, new Integer(i10), obj}, null, changeQuickRedirect, true, c.m.FN, new Class[]{WebPackageResultObj.class, ArrayList.class, Integer.TYPE, Object.class}, WebPackageResultObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (WebPackageResultObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            arrayList = webPackageResultObj.list;
        }
        return webPackageResultObj.copy(arrayList);
    }

    @e
    public final ArrayList<WebPackageObjV2> component1() {
        return this.list;
    }

    @d
    public final WebPackageResultObj copy(@e ArrayList<WebPackageObjV2> arrayList) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{arrayList}, this, changeQuickRedirect, false, c.m.EN, new Class[]{ArrayList.class}, WebPackageResultObj.class);
        return patchProxyResultProxy.isSupported ? (WebPackageResultObj) patchProxyResultProxy.result : new WebPackageResultObj(arrayList);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, c.m.IN, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        return (obj instanceof WebPackageResultObj) && f0.g(this.list, ((WebPackageResultObj) obj).list);
    }

    @e
    public final ArrayList<WebPackageObjV2> getList() {
        return this.list;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.HN, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        ArrayList<WebPackageObjV2> arrayList = this.list;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.hashCode();
    }

    public final void setList(@e ArrayList<WebPackageObjV2> arrayList) {
        this.list = arrayList;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.GN, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "WebPackageResultObj(list=" + this.list + ')';
    }
}
