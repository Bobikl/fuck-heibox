package com.max.xiaoheihe.bean.analytics;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: EventLogConfigObj.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class EventLogConfigObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String app_stay_duration_report_period_second;

    public EventLogConfigObj(@e String str) {
        this.app_stay_duration_report_period_second = str;
    }

    public static /* synthetic */ EventLogConfigObj copy$default(EventLogConfigObj eventLogConfigObj, String str, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{eventLogConfigObj, str, new Integer(i10), obj}, null, changeQuickRedirect, true, 14127, new Class[]{EventLogConfigObj.class, String.class, Integer.TYPE, Object.class}, EventLogConfigObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (EventLogConfigObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            str = eventLogConfigObj.app_stay_duration_report_period_second;
        }
        return eventLogConfigObj.copy(str);
    }

    @e
    public final String component1() {
        return this.app_stay_duration_report_period_second;
    }

    @d
    public final EventLogConfigObj copy(@e String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 14126, new Class[]{String.class}, EventLogConfigObj.class);
        return patchProxyResultProxy.isSupported ? (EventLogConfigObj) patchProxyResultProxy.result : new EventLogConfigObj(str);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14130, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        return (obj instanceof EventLogConfigObj) && f0.g(this.app_stay_duration_report_period_second, ((EventLogConfigObj) obj).app_stay_duration_report_period_second);
    }

    @e
    public final String getApp_stay_duration_report_period_second() {
        return this.app_stay_duration_report_period_second;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14129, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.app_stay_duration_report_period_second;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final void setApp_stay_duration_report_period_second(@e String str) {
        this.app_stay_duration_report_period_second = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14128, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "EventLogConfigObj(app_stay_duration_report_period_second=" + this.app_stay_duration_report_period_second + ')';
    }
}
