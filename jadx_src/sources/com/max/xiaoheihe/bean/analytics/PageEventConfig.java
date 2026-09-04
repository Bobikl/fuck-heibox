package com.max.xiaoheihe.bean.analytics;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: PageEventConfig.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class PageEventConfig {
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private Boolean batch_report;

    @e
    private Boolean duration;

    @e
    private Boolean show;

    public PageEventConfig() {
        this(null, null, null, 7, null);
    }

    public PageEventConfig(@e Boolean bool, @e Boolean bool2, @e Boolean bool3) {
        this.batch_report = bool;
        this.show = bool2;
        this.duration = bool3;
    }

    public /* synthetic */ PageEventConfig(Boolean bool, Boolean bool2, Boolean bool3, int i10, u uVar) {
        this((i10 & 1) != 0 ? Boolean.FALSE : bool, (i10 & 2) != 0 ? Boolean.TRUE : bool2, (i10 & 4) != 0 ? Boolean.FALSE : bool3);
    }

    public static /* synthetic */ PageEventConfig copy$default(PageEventConfig pageEventConfig, Boolean bool, Boolean bool2, Boolean bool3, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{pageEventConfig, bool, bool2, bool3, new Integer(i10), obj}, null, changeQuickRedirect, true, 14132, new Class[]{PageEventConfig.class, Boolean.class, Boolean.class, Boolean.class, Integer.TYPE, Object.class}, PageEventConfig.class);
        if (patchProxyResultProxy.isSupported) {
            return (PageEventConfig) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            bool = pageEventConfig.batch_report;
        }
        if ((i10 & 2) != 0) {
            bool2 = pageEventConfig.show;
        }
        if ((i10 & 4) != 0) {
            bool3 = pageEventConfig.duration;
        }
        return pageEventConfig.copy(bool, bool2, bool3);
    }

    @e
    public final Boolean component1() {
        return this.batch_report;
    }

    @e
    public final Boolean component2() {
        return this.show;
    }

    @e
    public final Boolean component3() {
        return this.duration;
    }

    @d
    public final PageEventConfig copy(@e Boolean bool, @e Boolean bool2, @e Boolean bool3) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bool, bool2, bool3}, this, changeQuickRedirect, false, 14131, new Class[]{Boolean.class, Boolean.class, Boolean.class}, PageEventConfig.class);
        return patchProxyResultProxy.isSupported ? (PageEventConfig) patchProxyResultProxy.result : new PageEventConfig(bool, bool2, bool3);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14135, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PageEventConfig)) {
            return false;
        }
        PageEventConfig pageEventConfig = (PageEventConfig) obj;
        return f0.g(this.batch_report, pageEventConfig.batch_report) && f0.g(this.show, pageEventConfig.show) && f0.g(this.duration, pageEventConfig.duration);
    }

    @e
    public final Boolean getBatch_report() {
        return this.batch_report;
    }

    @e
    public final Boolean getDuration() {
        return this.duration;
    }

    @e
    public final Boolean getShow() {
        return this.show;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14134, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        Boolean bool = this.batch_report;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.show;
        int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.duration;
        return iHashCode2 + (bool3 != null ? bool3.hashCode() : 0);
    }

    public final void setBatch_report(@e Boolean bool) {
        this.batch_report = bool;
    }

    public final void setDuration(@e Boolean bool) {
        this.duration = bool;
    }

    public final void setShow(@e Boolean bool) {
        this.show = bool;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14133, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "PageEventConfig(batch_report=" + this.batch_report + ", show=" + this.show + ", duration=" + this.duration + ')';
    }
}
