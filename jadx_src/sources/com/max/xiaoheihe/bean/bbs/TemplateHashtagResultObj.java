package com.max.xiaoheihe.bean.bbs;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: TemplateHashtagResultObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class TemplateHashtagResultObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private ArrayList<TemplateHashtagGroupObj> groups;

    public TemplateHashtagResultObj(@e ArrayList<TemplateHashtagGroupObj> arrayList) {
        this.groups = arrayList;
    }

    public static /* synthetic */ TemplateHashtagResultObj copy$default(TemplateHashtagResultObj templateHashtagResultObj, ArrayList arrayList, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{templateHashtagResultObj, arrayList, new Integer(i10), obj}, null, changeQuickRedirect, true, 14488, new Class[]{TemplateHashtagResultObj.class, ArrayList.class, Integer.TYPE, Object.class}, TemplateHashtagResultObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (TemplateHashtagResultObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            arrayList = templateHashtagResultObj.groups;
        }
        return templateHashtagResultObj.copy(arrayList);
    }

    @e
    public final ArrayList<TemplateHashtagGroupObj> component1() {
        return this.groups;
    }

    @d
    public final TemplateHashtagResultObj copy(@e ArrayList<TemplateHashtagGroupObj> arrayList) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{arrayList}, this, changeQuickRedirect, false, 14487, new Class[]{ArrayList.class}, TemplateHashtagResultObj.class);
        return patchProxyResultProxy.isSupported ? (TemplateHashtagResultObj) patchProxyResultProxy.result : new TemplateHashtagResultObj(arrayList);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14491, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        return (obj instanceof TemplateHashtagResultObj) && f0.g(this.groups, ((TemplateHashtagResultObj) obj).groups);
    }

    @e
    public final ArrayList<TemplateHashtagGroupObj> getGroups() {
        return this.groups;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14490, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        ArrayList<TemplateHashtagGroupObj> arrayList = this.groups;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.hashCode();
    }

    public final void setGroups(@e ArrayList<TemplateHashtagGroupObj> arrayList) {
        this.groups = arrayList;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14489, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "TemplateHashtagResultObj(groups=" + this.groups + ')';
    }
}
