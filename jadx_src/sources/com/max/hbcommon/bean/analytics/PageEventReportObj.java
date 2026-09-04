package com.max.hbcommon.bean.analytics;

import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.Serializable;
import java.util.List;
import lb.d;

/* JADX INFO: loaded from: classes9.dex */
public class PageEventReportObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 4744573784828560888L;
    private List<PageEventObj> events;

    public List<PageEventObj> getEvents() {
        return this.events;
    }

    public boolean isAppEvent() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.d.f31179d5, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this.events.size() == 1 && this.events.get(0) != null) {
            return this.events.get(0).getPath().equals(d.f131127b);
        }
        return false;
    }

    public void setEvents(List<PageEventObj> list) {
        this.events = list;
    }
}
