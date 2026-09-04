package com.max.xiaoheihe.bean.news.events;

import androidx.compose.runtime.internal.o;
import com.max.xiaoheihe.bean.news.FeedsContentBaseObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: FeedsEventObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class FeedsEventObj extends FeedsContentBaseObj {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private EventObj event;

    public FeedsEventObj(@e EventObj eventObj) {
        this.event = eventObj;
    }

    public static /* synthetic */ FeedsEventObj copy$default(FeedsEventObj feedsEventObj, EventObj eventObj, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{feedsEventObj, eventObj, new Integer(i10), obj}, null, changeQuickRedirect, true, 15786, new Class[]{FeedsEventObj.class, EventObj.class, Integer.TYPE, Object.class}, FeedsEventObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (FeedsEventObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            eventObj = feedsEventObj.event;
        }
        return feedsEventObj.copy(eventObj);
    }

    @e
    public final EventObj component1() {
        return this.event;
    }

    @d
    public final FeedsEventObj copy(@e EventObj eventObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{eventObj}, this, changeQuickRedirect, false, 15785, new Class[]{EventObj.class}, FeedsEventObj.class);
        return patchProxyResultProxy.isSupported ? (FeedsEventObj) patchProxyResultProxy.result : new FeedsEventObj(eventObj);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15789, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        return (obj instanceof FeedsEventObj) && f0.g(this.event, ((FeedsEventObj) obj).event);
    }

    @e
    public final EventObj getEvent() {
        return this.event;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15788, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        EventObj eventObj = this.event;
        if (eventObj == null) {
            return 0;
        }
        return eventObj.hashCode();
    }

    public final void setEvent(@e EventObj eventObj) {
        this.event = eventObj;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15787, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "FeedsEventObj(event=" + this.event + ')';
    }
}
