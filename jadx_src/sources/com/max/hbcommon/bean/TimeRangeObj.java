package com.max.hbcommon.bean;

import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.Serializable;

/* JADX INFO: loaded from: classes9.dex */
public class TimeRangeObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 1590802729320672716L;
    private long duration;
    private long end;
    private long start;

    public long getDuration() {
        return this.duration;
    }

    public long getEnd() {
        return this.end;
    }

    public long getStart() {
        return this.start;
    }

    public void setDuration(long j10) {
        this.duration = j10;
    }

    public void setEnd(long j10) {
        this.end = j10;
    }

    public void setStart(long j10) {
        this.start = j10;
    }

    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.d.f31675z4, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "TimeRangeObj{end=" + this.end + ", start=" + this.start + ", duration=" + this.duration + '}';
    }
}
