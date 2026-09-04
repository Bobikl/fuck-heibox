package com.max.hbcommon.bean.analytics;

import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: PageEventEntity.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class ReportObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;

    @d
    private final List<PageEventEntity> events;

    public ReportObj(@d List<PageEventEntity> events) {
        f0.p(events, "events");
        this.events = events;
    }

    public static /* synthetic */ ReportObj copy$default(ReportObj reportObj, List list, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{reportObj, list, new Integer(i10), obj}, null, changeQuickRedirect, true, c.d.f31271h5, new Class[]{ReportObj.class, List.class, Integer.TYPE, Object.class}, ReportObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (ReportObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            list = reportObj.events;
        }
        return reportObj.copy(list);
    }

    @d
    public final List<PageEventEntity> component1() {
        return this.events;
    }

    @d
    public final ReportObj copy(@d List<PageEventEntity> events) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{events}, this, changeQuickRedirect, false, c.d.f31248g5, new Class[]{List.class}, ReportObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (ReportObj) patchProxyResultProxy.result;
        }
        f0.p(events, "events");
        return new ReportObj(events);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, c.d.f31340k5, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        return (obj instanceof ReportObj) && f0.g(this.events, ((ReportObj) obj).events);
    }

    @d
    public final List<PageEventEntity> getEvents() {
        return this.events;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.d.f31317j5, new Class[0], Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : this.events.hashCode();
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.d.f31294i5, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "ReportObj(events=" + this.events + ')';
    }
}
