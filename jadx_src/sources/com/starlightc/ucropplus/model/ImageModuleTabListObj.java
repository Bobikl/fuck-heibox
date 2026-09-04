package com.starlightc.ucropplus.model;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ImageModuleTabListObj.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class ImageModuleTabListObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private List<UCropKeyDescObj> tab_list;

    public ImageModuleTabListObj(@e List<UCropKeyDescObj> list) {
        this.tab_list = list;
    }

    public static /* synthetic */ ImageModuleTabListObj copy$default(ImageModuleTabListObj imageModuleTabListObj, List list, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{imageModuleTabListObj, list, new Integer(i10), obj}, null, changeQuickRedirect, true, 50084, new Class[]{ImageModuleTabListObj.class, List.class, Integer.TYPE, Object.class}, ImageModuleTabListObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (ImageModuleTabListObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            list = imageModuleTabListObj.tab_list;
        }
        return imageModuleTabListObj.copy(list);
    }

    @e
    public final List<UCropKeyDescObj> component1() {
        return this.tab_list;
    }

    @d
    public final ImageModuleTabListObj copy(@e List<UCropKeyDescObj> list) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 50083, new Class[]{List.class}, ImageModuleTabListObj.class);
        return patchProxyResultProxy.isSupported ? (ImageModuleTabListObj) patchProxyResultProxy.result : new ImageModuleTabListObj(list);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 50087, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        return (obj instanceof ImageModuleTabListObj) && f0.g(this.tab_list, ((ImageModuleTabListObj) obj).tab_list);
    }

    @e
    public final List<UCropKeyDescObj> getTab_list() {
        return this.tab_list;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50086, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        List<UCropKeyDescObj> list = this.tab_list;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final void setTab_list(@e List<UCropKeyDescObj> list) {
        this.tab_list = list;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50085, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "ImageModuleTabListObj(tab_list=" + this.tab_list + ')';
    }
}
