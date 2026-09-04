package com.max.component.bean;

import bb.c;
import com.max.component.R;
import com.max.component.adapter.tree.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: ComponentPathObj.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class ComponentPathObj implements a, Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    private int layoutId;

    @d
    private String path;

    public ComponentPathObj(@d String path, int i10) {
        f0.p(path, "path");
        this.path = path;
        this.layoutId = i10;
    }

    public /* synthetic */ ComponentPathObj(String str, int i10, int i11, u uVar) {
        this(str, (i11 & 2) != 0 ? R.layout.item_tree_path : i10);
    }

    public static /* synthetic */ ComponentPathObj copy$default(ComponentPathObj componentPathObj, String str, int i10, int i11, Object obj) {
        Object[] objArr = {componentPathObj, str, new Integer(i10), new Integer(i11), obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, c.b.fm, new Class[]{ComponentPathObj.class, String.class, cls, cls, Object.class}, ComponentPathObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (ComponentPathObj) patchProxyResultProxy.result;
        }
        if ((i11 & 1) != 0) {
            str = componentPathObj.path;
        }
        if ((i11 & 2) != 0) {
            i10 = componentPathObj.layoutId;
        }
        return componentPathObj.copy(str, i10);
    }

    @d
    public final String component1() {
        return this.path;
    }

    public final int component2() {
        return this.layoutId;
    }

    @d
    public final ComponentPathObj copy(@d String path, int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{path, new Integer(i10)}, this, changeQuickRedirect, false, c.b.em, new Class[]{String.class, Integer.TYPE}, ComponentPathObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (ComponentPathObj) patchProxyResultProxy.result;
        }
        f0.p(path, "path");
        return new ComponentPathObj(path, i10);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, c.b.im, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ComponentPathObj)) {
            return false;
        }
        ComponentPathObj componentPathObj = (ComponentPathObj) obj;
        return f0.g(this.path, componentPathObj.path) && this.layoutId == componentPathObj.layoutId;
    }

    @Override // com.max.component.adapter.tree.a
    public int getLayoutId() {
        return this.layoutId;
    }

    @d
    public final String getPath() {
        return this.path;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.b.hm, new Class[0], Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : (this.path.hashCode() * 31) + this.layoutId;
    }

    @Override // com.max.component.adapter.tree.a
    @d
    public String key() {
        return this.path;
    }

    @Override // com.max.component.adapter.tree.a
    public void setLayoutId(int i10) {
        this.layoutId = i10;
    }

    public final void setPath(@d String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, c.b.dm, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(str, "<set-?>");
        this.path = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.b.gm, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "ComponentPathObj(path=" + this.path + ", layoutId=" + this.layoutId + ')';
    }
}
