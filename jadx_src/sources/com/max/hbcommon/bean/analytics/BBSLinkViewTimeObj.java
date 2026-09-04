package com.max.hbcommon.bean.analytics;

import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class BBSLinkViewTimeObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -871330763060954683L;
    private List<BBSLinkViewShowsObj> disappear;
    private List<BBSLinkViewDurationObj> duration;
    private List<BBSLinkViewShowsObj> shows;

    public void clear() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.d.Q4, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        getDuration().clear();
        getShows().clear();
        getDisappear().clear();
    }

    public List<BBSLinkViewShowsObj> getDisappear() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.d.N4, new Class[0], List.class);
        if (patchProxyResultProxy.isSupported) {
            return (List) patchProxyResultProxy.result;
        }
        if (this.disappear == null) {
            this.disappear = new ArrayList();
        }
        return this.disappear;
    }

    public List<BBSLinkViewDurationObj> getDuration() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.d.O4, new Class[0], List.class);
        if (patchProxyResultProxy.isSupported) {
            return (List) patchProxyResultProxy.result;
        }
        if (this.duration == null) {
            this.duration = new ArrayList();
        }
        return this.duration;
    }

    public List<BBSLinkViewShowsObj> getShows() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.d.P4, new Class[0], List.class);
        if (patchProxyResultProxy.isSupported) {
            return (List) patchProxyResultProxy.result;
        }
        if (this.shows == null) {
            this.shows = new ArrayList();
        }
        return this.shows;
    }

    public void setDisappear(List<BBSLinkViewShowsObj> list) {
        this.disappear = list;
    }

    public void setDuration(List<BBSLinkViewDurationObj> list) {
        this.duration = list;
    }

    public void setShows(List<BBSLinkViewShowsObj> list) {
        this.shows = list;
    }
}
