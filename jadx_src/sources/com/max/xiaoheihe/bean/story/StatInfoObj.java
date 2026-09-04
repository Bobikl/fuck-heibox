package com.max.xiaoheihe.bean.story;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: StoryModeListObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class StatInfoObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;
    private int comment_count;
    private int follow_status;
    private boolean is_award_link;
    private boolean is_favour_link;
    private int link_award_num;
    private int link_favour_num;

    public StatInfoObj() {
        this(0, 0, 0, 0, false, false, 63, null);
    }

    public StatInfoObj(int i10, int i11, int i12, int i13, boolean z10, boolean z11) {
        this.follow_status = i10;
        this.comment_count = i11;
        this.link_favour_num = i12;
        this.link_award_num = i13;
        this.is_award_link = z10;
        this.is_favour_link = z11;
    }

    public /* synthetic */ StatInfoObj(int i10, int i11, int i12, int i13, boolean z10, boolean z11, int i14, u uVar) {
        this((i14 & 1) != 0 ? 0 : i10, (i14 & 2) != 0 ? 0 : i11, (i14 & 4) != 0 ? 0 : i12, (i14 & 8) != 0 ? 0 : i13, (i14 & 16) != 0 ? false : z10, (i14 & 32) != 0 ? false : z11);
    }

    public static /* synthetic */ StatInfoObj copy$default(StatInfoObj statInfoObj, int i10, int i11, int i12, int i13, boolean z10, boolean z11, int i14, Object obj) {
        int i15 = i10;
        int i16 = i11;
        int i17 = i12;
        int i18 = i13;
        boolean z12 = z10;
        boolean z13 = z11;
        Object[] objArr = {statInfoObj, new Integer(i15), new Integer(i16), new Integer(i17), new Integer(i18), new Byte(z12 ? (byte) 1 : (byte) 0), new Byte(z13 ? (byte) 1 : (byte) 0), new Integer(i14), obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        Class cls2 = Boolean.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 15979, new Class[]{StatInfoObj.class, cls, cls, cls, cls, cls2, cls2, cls, Object.class}, StatInfoObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (StatInfoObj) patchProxyResultProxy.result;
        }
        if ((i14 & 1) != 0) {
            i15 = statInfoObj.follow_status;
        }
        if ((i14 & 2) != 0) {
            i16 = statInfoObj.comment_count;
        }
        if ((i14 & 4) != 0) {
            i17 = statInfoObj.link_favour_num;
        }
        if ((i14 & 8) != 0) {
            i18 = statInfoObj.link_award_num;
        }
        if ((i14 & 16) != 0) {
            z12 = statInfoObj.is_award_link;
        }
        if ((i14 & 32) != 0) {
            z13 = statInfoObj.is_favour_link;
        }
        return statInfoObj.copy(i15, i16, i17, i18, z12, z13);
    }

    public final int component1() {
        return this.follow_status;
    }

    public final int component2() {
        return this.comment_count;
    }

    public final int component3() {
        return this.link_favour_num;
    }

    public final int component4() {
        return this.link_award_num;
    }

    public final boolean component5() {
        return this.is_award_link;
    }

    public final boolean component6() {
        return this.is_favour_link;
    }

    @d
    public final StatInfoObj copy(int i10, int i11, int i12, int i13, boolean z10, boolean z11) {
        Object[] objArr = {new Integer(i10), new Integer(i11), new Integer(i12), new Integer(i13), new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z11 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        Class cls2 = Boolean.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 15978, new Class[]{cls, cls, cls, cls, cls2, cls2}, StatInfoObj.class);
        return patchProxyResultProxy.isSupported ? (StatInfoObj) patchProxyResultProxy.result : new StatInfoObj(i10, i11, i12, i13, z10, z11);
    }

    public boolean equals(@e Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StatInfoObj)) {
            return false;
        }
        StatInfoObj statInfoObj = (StatInfoObj) obj;
        return this.follow_status == statInfoObj.follow_status && this.comment_count == statInfoObj.comment_count && this.link_favour_num == statInfoObj.link_favour_num && this.link_award_num == statInfoObj.link_award_num && this.is_award_link == statInfoObj.is_award_link && this.is_favour_link == statInfoObj.is_favour_link;
    }

    public final int getComment_count() {
        return this.comment_count;
    }

    public final int getFollow_status() {
        return this.follow_status;
    }

    public final int getLink_award_num() {
        return this.link_award_num;
    }

    public final int getLink_favour_num() {
        return this.link_favour_num;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [int] */
    /* JADX WARN: Type inference failed for: r0v12, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6, types: [int] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3 */
    public int hashCode() {
        ?? r10;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15981, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        int i10 = ((((((this.follow_status * 31) + this.comment_count) * 31) + this.link_favour_num) * 31) + this.link_award_num) * 31;
        boolean z10 = this.is_award_link;
        if (z10) {
            r10 = z10;
            r10 = 1;
        }
        r10 = z10;
        int i11 = (i10 + r10) * 31;
        boolean z11 = this.is_favour_link;
        return i11 + (z11 ? 1 : z11);
    }

    public final boolean is_award_link() {
        return this.is_award_link;
    }

    public final boolean is_favour_link() {
        return this.is_favour_link;
    }

    public final void setComment_count(int i10) {
        this.comment_count = i10;
    }

    public final void setFollow_status(int i10) {
        this.follow_status = i10;
    }

    public final void setLink_award_num(int i10) {
        this.link_award_num = i10;
    }

    public final void setLink_favour_num(int i10) {
        this.link_favour_num = i10;
    }

    public final void set_award_link(boolean z10) {
        this.is_award_link = z10;
    }

    public final void set_favour_link(boolean z10) {
        this.is_favour_link = z10;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15980, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "StatInfoObj(follow_status=" + this.follow_status + ", comment_count=" + this.comment_count + ", link_favour_num=" + this.link_favour_num + ", link_award_num=" + this.link_award_num + ", is_award_link=" + this.is_award_link + ", is_favour_link=" + this.is_favour_link + ')';
    }
}
