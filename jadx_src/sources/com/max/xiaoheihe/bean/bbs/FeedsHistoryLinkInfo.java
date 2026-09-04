package com.max.xiaoheihe.bean.bbs;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: FeedsHistoryLinkInfo.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class FeedsHistoryLinkInfo implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @d
    private String linkid;
    private long timestamp;

    public FeedsHistoryLinkInfo(@d String linkid, long j10) {
        f0.p(linkid, "linkid");
        this.linkid = linkid;
        this.timestamp = j10;
    }

    public /* synthetic */ FeedsHistoryLinkInfo(String str, long j10, int i10, u uVar) {
        this(str, (i10 & 2) != 0 ? 0L : j10);
    }

    public static /* synthetic */ FeedsHistoryLinkInfo copy$default(FeedsHistoryLinkInfo feedsHistoryLinkInfo, String str, long j10, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{feedsHistoryLinkInfo, str, new Long(j10), new Integer(i10), obj}, null, changeQuickRedirect, true, 14286, new Class[]{FeedsHistoryLinkInfo.class, String.class, Long.TYPE, Integer.TYPE, Object.class}, FeedsHistoryLinkInfo.class);
        if (patchProxyResultProxy.isSupported) {
            return (FeedsHistoryLinkInfo) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            str = feedsHistoryLinkInfo.linkid;
        }
        if ((i10 & 2) != 0) {
            j10 = feedsHistoryLinkInfo.timestamp;
        }
        return feedsHistoryLinkInfo.copy(str, j10);
    }

    @d
    public final String component1() {
        return this.linkid;
    }

    public final long component2() {
        return this.timestamp;
    }

    @d
    public final FeedsHistoryLinkInfo copy(@d String linkid, long j10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{linkid, new Long(j10)}, this, changeQuickRedirect, false, 14285, new Class[]{String.class, Long.TYPE}, FeedsHistoryLinkInfo.class);
        if (patchProxyResultProxy.isSupported) {
            return (FeedsHistoryLinkInfo) patchProxyResultProxy.result;
        }
        f0.p(linkid, "linkid");
        return new FeedsHistoryLinkInfo(linkid, j10);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14283, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!f0.g(FeedsHistoryLinkInfo.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        f0.n(obj, "null cannot be cast to non-null type com.max.xiaoheihe.bean.bbs.FeedsHistoryLinkInfo");
        return f0.g(this.linkid, ((FeedsHistoryLinkInfo) obj).linkid);
    }

    @d
    public final String getLinkid() {
        return this.linkid;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14284, new Class[0], Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : this.linkid.hashCode();
    }

    public final void setLinkid(@d String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 14282, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(str, "<set-?>");
        this.linkid = str;
    }

    public final void setTimestamp(long j10) {
        this.timestamp = j10;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14287, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "FeedsHistoryLinkInfo(linkid=" + this.linkid + ", timestamp=" + this.timestamp + ')';
    }
}
