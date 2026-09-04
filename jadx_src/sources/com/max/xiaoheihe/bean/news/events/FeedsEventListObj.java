package com.max.xiaoheihe.bean.news.events;

import androidx.compose.runtime.internal.o;
import com.max.xiaoheihe.bean.news.FeedsContentBaseObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: FeedsEventListObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class FeedsEventListObj extends FeedsContentBaseObj {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private List<EventObj> event_list;

    public FeedsEventListObj(@e List<EventObj> list) {
        this.event_list = list;
    }

    public static /* synthetic */ FeedsEventListObj copy$default(FeedsEventListObj feedsEventListObj, List list, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{feedsEventListObj, list, new Integer(i10), obj}, null, changeQuickRedirect, true, 15781, new Class[]{FeedsEventListObj.class, List.class, Integer.TYPE, Object.class}, FeedsEventListObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (FeedsEventListObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            list = feedsEventListObj.event_list;
        }
        return feedsEventListObj.copy(list);
    }

    @e
    public final List<EventObj> component1() {
        return this.event_list;
    }

    @d
    public final FeedsEventListObj copy(@e List<EventObj> list) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 15780, new Class[]{List.class}, FeedsEventListObj.class);
        return patchProxyResultProxy.isSupported ? (FeedsEventListObj) patchProxyResultProxy.result : new FeedsEventListObj(list);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15784, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        return (obj instanceof FeedsEventListObj) && f0.g(this.event_list, ((FeedsEventListObj) obj).event_list);
    }

    @e
    public final List<EventObj> getEvent_list() {
        return this.event_list;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15783, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        List<EventObj> list = this.event_list;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final void setEvent_list(@e List<EventObj> list) {
        this.event_list = list;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15782, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "FeedsEventListObj(event_list=" + this.event_list + ')';
    }
}
