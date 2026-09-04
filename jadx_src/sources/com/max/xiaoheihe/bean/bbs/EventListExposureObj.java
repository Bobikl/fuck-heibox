package com.max.xiaoheihe.bean.bbs;

import androidx.compose.runtime.internal.o;
import com.max.xiaoheihe.bean.news.events.EventObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: EventListExposureObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class EventListExposureObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @d
    private List<EventObj> disappear;

    @d
    private List<EventObj> show;

    public EventListExposureObj(@d List<EventObj> show, @d List<EventObj> disappear) {
        f0.p(show, "show");
        f0.p(disappear, "disappear");
        this.show = show;
        this.disappear = disappear;
    }

    public static /* synthetic */ EventListExposureObj copy$default(EventListExposureObj eventListExposureObj, List list, List list2, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{eventListExposureObj, list, list2, new Integer(i10), obj}, null, changeQuickRedirect, true, 14277, new Class[]{EventListExposureObj.class, List.class, List.class, Integer.TYPE, Object.class}, EventListExposureObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (EventListExposureObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            list = eventListExposureObj.show;
        }
        if ((i10 & 2) != 0) {
            list2 = eventListExposureObj.disappear;
        }
        return eventListExposureObj.copy(list, list2);
    }

    @d
    public final List<EventObj> component1() {
        return this.show;
    }

    @d
    public final List<EventObj> component2() {
        return this.disappear;
    }

    @d
    public final EventListExposureObj copy(@d List<EventObj> show, @d List<EventObj> disappear) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{show, disappear}, this, changeQuickRedirect, false, 14276, new Class[]{List.class, List.class}, EventListExposureObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (EventListExposureObj) patchProxyResultProxy.result;
        }
        f0.p(show, "show");
        f0.p(disappear, "disappear");
        return new EventListExposureObj(show, disappear);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14280, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EventListExposureObj)) {
            return false;
        }
        EventListExposureObj eventListExposureObj = (EventListExposureObj) obj;
        return f0.g(this.show, eventListExposureObj.show) && f0.g(this.disappear, eventListExposureObj.disappear);
    }

    @d
    public final List<EventObj> getDisappear() {
        return this.disappear;
    }

    @d
    public final List<EventObj> getShow() {
        return this.show;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14279, new Class[0], Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : (this.show.hashCode() * 31) + this.disappear.hashCode();
    }

    public final void setDisappear(@d List<EventObj> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 14275, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(list, "<set-?>");
        this.disappear = list;
    }

    public final void setShow(@d List<EventObj> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 14274, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(list, "<set-?>");
        this.show = list;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14278, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "EventListExposureObj(show=" + this.show + ", disappear=" + this.disappear + ')';
    }
}
