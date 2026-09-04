package com.max.xiaoheihe.bean.game;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: CommentTrendInfo.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class CommentTrendInfo implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private Integer down_count;

    @e
    private Integer time;

    @e
    private Integer up_count;

    public CommentTrendInfo(@e Integer num, @e Integer num2, @e Integer num3) {
        this.time = num;
        this.up_count = num2;
        this.down_count = num3;
    }

    public static /* synthetic */ CommentTrendInfo copy$default(CommentTrendInfo commentTrendInfo, Integer num, Integer num2, Integer num3, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{commentTrendInfo, num, num2, num3, new Integer(i10), obj}, null, changeQuickRedirect, true, 14658, new Class[]{CommentTrendInfo.class, Integer.class, Integer.class, Integer.class, Integer.TYPE, Object.class}, CommentTrendInfo.class);
        if (patchProxyResultProxy.isSupported) {
            return (CommentTrendInfo) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            num = commentTrendInfo.time;
        }
        if ((i10 & 2) != 0) {
            num2 = commentTrendInfo.up_count;
        }
        if ((i10 & 4) != 0) {
            num3 = commentTrendInfo.down_count;
        }
        return commentTrendInfo.copy(num, num2, num3);
    }

    @e
    public final Integer component1() {
        return this.time;
    }

    @e
    public final Integer component2() {
        return this.up_count;
    }

    @e
    public final Integer component3() {
        return this.down_count;
    }

    @d
    public final CommentTrendInfo copy(@e Integer num, @e Integer num2, @e Integer num3) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{num, num2, num3}, this, changeQuickRedirect, false, 14657, new Class[]{Integer.class, Integer.class, Integer.class}, CommentTrendInfo.class);
        return patchProxyResultProxy.isSupported ? (CommentTrendInfo) patchProxyResultProxy.result : new CommentTrendInfo(num, num2, num3);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14661, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommentTrendInfo)) {
            return false;
        }
        CommentTrendInfo commentTrendInfo = (CommentTrendInfo) obj;
        return f0.g(this.time, commentTrendInfo.time) && f0.g(this.up_count, commentTrendInfo.up_count) && f0.g(this.down_count, commentTrendInfo.down_count);
    }

    @e
    public final Integer getDown_count() {
        return this.down_count;
    }

    @e
    public final Integer getTime() {
        return this.time;
    }

    @e
    public final Integer getUp_count() {
        return this.up_count;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14660, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        Integer num = this.time;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.up_count;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.down_count;
        return iHashCode2 + (num3 != null ? num3.hashCode() : 0);
    }

    public final void setDown_count(@e Integer num) {
        this.down_count = num;
    }

    public final void setTime(@e Integer num) {
        this.time = num;
    }

    public final void setUp_count(@e Integer num) {
        this.up_count = num;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14659, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "CommentTrendInfo(time=" + this.time + ", up_count=" + this.up_count + ", down_count=" + this.down_count + ')';
    }
}
