package com.max.xiaoheihe.bean.bbs;

import androidx.compose.runtime.internal.o;
import com.max.xiaoheihe.bean.news.FeedsContentBaseObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: RecallFeedsResult.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class RecallFeedsResult implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;
    private int insert_index;

    @e
    private ArrayList<FeedsContentBaseObj> unexposed_links;

    @e
    private ArrayList<FeedsContentBaseObj> visible_links;

    public RecallFeedsResult(@e ArrayList<FeedsContentBaseObj> arrayList, @e ArrayList<FeedsContentBaseObj> arrayList2, int i10) {
        this.visible_links = arrayList;
        this.unexposed_links = arrayList2;
        this.insert_index = i10;
    }

    public static /* synthetic */ RecallFeedsResult copy$default(RecallFeedsResult recallFeedsResult, ArrayList arrayList, ArrayList arrayList2, int i10, int i11, Object obj) {
        Object[] objArr = {recallFeedsResult, arrayList, arrayList2, new Integer(i10), new Integer(i11), obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 14457, new Class[]{RecallFeedsResult.class, ArrayList.class, ArrayList.class, cls, cls, Object.class}, RecallFeedsResult.class);
        if (patchProxyResultProxy.isSupported) {
            return (RecallFeedsResult) patchProxyResultProxy.result;
        }
        if ((i11 & 1) != 0) {
            arrayList = recallFeedsResult.visible_links;
        }
        if ((i11 & 2) != 0) {
            arrayList2 = recallFeedsResult.unexposed_links;
        }
        if ((i11 & 4) != 0) {
            i10 = recallFeedsResult.insert_index;
        }
        return recallFeedsResult.copy(arrayList, arrayList2, i10);
    }

    @e
    public final ArrayList<FeedsContentBaseObj> component1() {
        return this.visible_links;
    }

    @e
    public final ArrayList<FeedsContentBaseObj> component2() {
        return this.unexposed_links;
    }

    public final int component3() {
        return this.insert_index;
    }

    @d
    public final RecallFeedsResult copy(@e ArrayList<FeedsContentBaseObj> arrayList, @e ArrayList<FeedsContentBaseObj> arrayList2, int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{arrayList, arrayList2, new Integer(i10)}, this, changeQuickRedirect, false, 14456, new Class[]{ArrayList.class, ArrayList.class, Integer.TYPE}, RecallFeedsResult.class);
        return patchProxyResultProxy.isSupported ? (RecallFeedsResult) patchProxyResultProxy.result : new RecallFeedsResult(arrayList, arrayList2, i10);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14460, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecallFeedsResult)) {
            return false;
        }
        RecallFeedsResult recallFeedsResult = (RecallFeedsResult) obj;
        return f0.g(this.visible_links, recallFeedsResult.visible_links) && f0.g(this.unexposed_links, recallFeedsResult.unexposed_links) && this.insert_index == recallFeedsResult.insert_index;
    }

    public final int getInsert_index() {
        return this.insert_index;
    }

    @e
    public final ArrayList<FeedsContentBaseObj> getUnexposed_links() {
        return this.unexposed_links;
    }

    @e
    public final ArrayList<FeedsContentBaseObj> getVisible_links() {
        return this.visible_links;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14459, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        ArrayList<FeedsContentBaseObj> arrayList = this.visible_links;
        int iHashCode = (arrayList == null ? 0 : arrayList.hashCode()) * 31;
        ArrayList<FeedsContentBaseObj> arrayList2 = this.unexposed_links;
        return ((iHashCode + (arrayList2 != null ? arrayList2.hashCode() : 0)) * 31) + this.insert_index;
    }

    public final void setInsert_index(int i10) {
        this.insert_index = i10;
    }

    public final void setUnexposed_links(@e ArrayList<FeedsContentBaseObj> arrayList) {
        this.unexposed_links = arrayList;
    }

    public final void setVisible_links(@e ArrayList<FeedsContentBaseObj> arrayList) {
        this.visible_links = arrayList;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14458, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "RecallFeedsResult(visible_links=" + this.visible_links + ", unexposed_links=" + this.unexposed_links + ", insert_index=" + this.insert_index + ')';
    }
}
