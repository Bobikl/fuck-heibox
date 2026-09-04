package com.max.xiaoheihe.bean.bbs;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ListExposureObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class ListExposureObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @d
    private List<? extends BBSLinkObj> disappear;

    @d
    private List<? extends BBSLinkObj> show;

    public ListExposureObj(@d List<? extends BBSLinkObj> show, @d List<? extends BBSLinkObj> disappear) {
        f0.p(show, "show");
        f0.p(disappear, "disappear");
        this.show = show;
        this.disappear = disappear;
    }

    public static /* synthetic */ ListExposureObj copy$default(ListExposureObj listExposureObj, List list, List list2, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{listExposureObj, list, list2, new Integer(i10), obj}, null, changeQuickRedirect, true, 14341, new Class[]{ListExposureObj.class, List.class, List.class, Integer.TYPE, Object.class}, ListExposureObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (ListExposureObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            list = listExposureObj.show;
        }
        if ((i10 & 2) != 0) {
            list2 = listExposureObj.disappear;
        }
        return listExposureObj.copy(list, list2);
    }

    @d
    public final List<BBSLinkObj> component1() {
        return this.show;
    }

    @d
    public final List<BBSLinkObj> component2() {
        return this.disappear;
    }

    @d
    public final ListExposureObj copy(@d List<? extends BBSLinkObj> show, @d List<? extends BBSLinkObj> disappear) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{show, disappear}, this, changeQuickRedirect, false, 14340, new Class[]{List.class, List.class}, ListExposureObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (ListExposureObj) patchProxyResultProxy.result;
        }
        f0.p(show, "show");
        f0.p(disappear, "disappear");
        return new ListExposureObj(show, disappear);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14344, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ListExposureObj)) {
            return false;
        }
        ListExposureObj listExposureObj = (ListExposureObj) obj;
        return f0.g(this.show, listExposureObj.show) && f0.g(this.disappear, listExposureObj.disappear);
    }

    @d
    public final List<BBSLinkObj> getDisappear() {
        return this.disappear;
    }

    @d
    public final List<BBSLinkObj> getShow() {
        return this.show;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14343, new Class[0], Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : (this.show.hashCode() * 31) + this.disappear.hashCode();
    }

    public final void setDisappear(@d List<? extends BBSLinkObj> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 14339, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(list, "<set-?>");
        this.disappear = list;
    }

    public final void setShow(@d List<? extends BBSLinkObj> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 14338, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(list, "<set-?>");
        this.show = list;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14342, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "ListExposureObj(show=" + this.show + ", disappear=" + this.disappear + ')';
    }
}
