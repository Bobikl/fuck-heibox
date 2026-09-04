package com.max.xiaoheihe.bean;

import androidx.compose.runtime.internal.o;
import bb.c;
import com.max.xiaoheihe.bean.bbs.LinkToolCardObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ToolCardResultObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class ToolCardResultObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private List<LinkToolCardObj> tool_cards;

    public ToolCardResultObj(@e List<LinkToolCardObj> list) {
        this.tool_cards = list;
    }

    public static /* synthetic */ ToolCardResultObj copy$default(ToolCardResultObj toolCardResultObj, List list, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{toolCardResultObj, list, new Integer(i10), obj}, null, changeQuickRedirect, true, c.m.oN, new Class[]{ToolCardResultObj.class, List.class, Integer.TYPE, Object.class}, ToolCardResultObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (ToolCardResultObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            list = toolCardResultObj.tool_cards;
        }
        return toolCardResultObj.copy(list);
    }

    @e
    public final List<LinkToolCardObj> component1() {
        return this.tool_cards;
    }

    @d
    public final ToolCardResultObj copy(@e List<LinkToolCardObj> list) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, c.m.nN, new Class[]{List.class}, ToolCardResultObj.class);
        return patchProxyResultProxy.isSupported ? (ToolCardResultObj) patchProxyResultProxy.result : new ToolCardResultObj(list);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, c.m.rN, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        return (obj instanceof ToolCardResultObj) && f0.g(this.tool_cards, ((ToolCardResultObj) obj).tool_cards);
    }

    @e
    public final List<LinkToolCardObj> getTool_cards() {
        return this.tool_cards;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.qN, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        List<LinkToolCardObj> list = this.tool_cards;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final void setTool_cards(@e List<LinkToolCardObj> list) {
        this.tool_cards = list;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.pN, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "ToolCardResultObj(tool_cards=" + this.tool_cards + ')';
    }
}
