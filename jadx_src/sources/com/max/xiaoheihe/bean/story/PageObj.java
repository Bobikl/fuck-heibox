package com.max.xiaoheihe.bean.story;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: StoryModeListObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class PageObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private NextOffsetCardObj next_offset_card;

    /* JADX WARN: Multi-variable type inference failed */
    public PageObj() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public PageObj(@e NextOffsetCardObj nextOffsetCardObj) {
        this.next_offset_card = nextOffsetCardObj;
    }

    public /* synthetic */ PageObj(NextOffsetCardObj nextOffsetCardObj, int i10, u uVar) {
        this((i10 & 1) != 0 ? null : nextOffsetCardObj);
    }

    public static /* synthetic */ PageObj copy$default(PageObj pageObj, NextOffsetCardObj nextOffsetCardObj, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{pageObj, nextOffsetCardObj, new Integer(i10), obj}, null, changeQuickRedirect, true, 15974, new Class[]{PageObj.class, NextOffsetCardObj.class, Integer.TYPE, Object.class}, PageObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (PageObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            nextOffsetCardObj = pageObj.next_offset_card;
        }
        return pageObj.copy(nextOffsetCardObj);
    }

    @e
    public final NextOffsetCardObj component1() {
        return this.next_offset_card;
    }

    @d
    public final PageObj copy(@e NextOffsetCardObj nextOffsetCardObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{nextOffsetCardObj}, this, changeQuickRedirect, false, 15973, new Class[]{NextOffsetCardObj.class}, PageObj.class);
        return patchProxyResultProxy.isSupported ? (PageObj) patchProxyResultProxy.result : new PageObj(nextOffsetCardObj);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15977, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        return (obj instanceof PageObj) && f0.g(this.next_offset_card, ((PageObj) obj).next_offset_card);
    }

    @e
    public final NextOffsetCardObj getNext_offset_card() {
        return this.next_offset_card;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15976, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        NextOffsetCardObj nextOffsetCardObj = this.next_offset_card;
        if (nextOffsetCardObj == null) {
            return 0;
        }
        return nextOffsetCardObj.hashCode();
    }

    public final void setNext_offset_card(@e NextOffsetCardObj nextOffsetCardObj) {
        this.next_offset_card = nextOffsetCardObj;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15975, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "PageObj(next_offset_card=" + this.next_offset_card + ')';
    }
}
