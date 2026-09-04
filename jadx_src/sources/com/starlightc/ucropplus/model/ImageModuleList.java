package com.starlightc.ucropplus.model;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.starlightc.ucropplus.model.puzzle.ImageModuleObj;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ImageModuleList.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class ImageModuleList implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private List<ImageModuleObj> module_list;

    public ImageModuleList(@e List<ImageModuleObj> list) {
        this.module_list = list;
    }

    public static /* synthetic */ ImageModuleList copy$default(ImageModuleList imageModuleList, List list, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{imageModuleList, list, new Integer(i10), obj}, null, changeQuickRedirect, true, 50079, new Class[]{ImageModuleList.class, List.class, Integer.TYPE, Object.class}, ImageModuleList.class);
        if (patchProxyResultProxy.isSupported) {
            return (ImageModuleList) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            list = imageModuleList.module_list;
        }
        return imageModuleList.copy(list);
    }

    @e
    public final List<ImageModuleObj> component1() {
        return this.module_list;
    }

    @d
    public final ImageModuleList copy(@e List<ImageModuleObj> list) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 50078, new Class[]{List.class}, ImageModuleList.class);
        return patchProxyResultProxy.isSupported ? (ImageModuleList) patchProxyResultProxy.result : new ImageModuleList(list);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 50082, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        return (obj instanceof ImageModuleList) && f0.g(this.module_list, ((ImageModuleList) obj).module_list);
    }

    @e
    public final List<ImageModuleObj> getModule_list() {
        return this.module_list;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50081, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        List<ImageModuleObj> list = this.module_list;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final void setModule_list(@e List<ImageModuleObj> list) {
        this.module_list = list;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50080, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "ImageModuleList(module_list=" + this.module_list + ')';
    }
}
