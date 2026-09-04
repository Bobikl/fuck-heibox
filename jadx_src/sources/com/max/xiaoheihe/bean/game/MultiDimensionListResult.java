package com.max.xiaoheihe.bean.game;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: MultiDimensionListResult.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class MultiDimensionListResult implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private ArrayList<GameCommentDimensionObj> dimension_list;

    public MultiDimensionListResult(@e ArrayList<GameCommentDimensionObj> arrayList) {
        this.dimension_list = arrayList;
    }

    public static /* synthetic */ MultiDimensionListResult copy$default(MultiDimensionListResult multiDimensionListResult, ArrayList arrayList, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{multiDimensionListResult, arrayList, new Integer(i10), obj}, null, changeQuickRedirect, true, 14924, new Class[]{MultiDimensionListResult.class, ArrayList.class, Integer.TYPE, Object.class}, MultiDimensionListResult.class);
        if (patchProxyResultProxy.isSupported) {
            return (MultiDimensionListResult) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            arrayList = multiDimensionListResult.dimension_list;
        }
        return multiDimensionListResult.copy(arrayList);
    }

    @e
    public final ArrayList<GameCommentDimensionObj> component1() {
        return this.dimension_list;
    }

    @d
    public final MultiDimensionListResult copy(@e ArrayList<GameCommentDimensionObj> arrayList) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{arrayList}, this, changeQuickRedirect, false, 14923, new Class[]{ArrayList.class}, MultiDimensionListResult.class);
        return patchProxyResultProxy.isSupported ? (MultiDimensionListResult) patchProxyResultProxy.result : new MultiDimensionListResult(arrayList);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14927, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        return (obj instanceof MultiDimensionListResult) && f0.g(this.dimension_list, ((MultiDimensionListResult) obj).dimension_list);
    }

    @e
    public final ArrayList<GameCommentDimensionObj> getDimension_list() {
        return this.dimension_list;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14926, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        ArrayList<GameCommentDimensionObj> arrayList = this.dimension_list;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.hashCode();
    }

    public final void setDimension_list(@e ArrayList<GameCommentDimensionObj> arrayList) {
        this.dimension_list = arrayList;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14925, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "MultiDimensionListResult(dimension_list=" + this.dimension_list + ')';
    }
}
