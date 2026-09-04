package com.max.xiaoheihe.bean.game;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: MultiDimensionRadarObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class MultiDimensionRadarObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private List<MultiDimensionScore> dimension_list;

    @e
    private String total_num;

    public MultiDimensionRadarObj(@e List<MultiDimensionScore> list, @e String str) {
        this.dimension_list = list;
        this.total_num = str;
    }

    public static /* synthetic */ MultiDimensionRadarObj copy$default(MultiDimensionRadarObj multiDimensionRadarObj, List list, String str, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{multiDimensionRadarObj, list, str, new Integer(i10), obj}, null, changeQuickRedirect, true, 14934, new Class[]{MultiDimensionRadarObj.class, List.class, String.class, Integer.TYPE, Object.class}, MultiDimensionRadarObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (MultiDimensionRadarObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            list = multiDimensionRadarObj.dimension_list;
        }
        if ((i10 & 2) != 0) {
            str = multiDimensionRadarObj.total_num;
        }
        return multiDimensionRadarObj.copy(list, str);
    }

    @e
    public final List<MultiDimensionScore> component1() {
        return this.dimension_list;
    }

    @e
    public final String component2() {
        return this.total_num;
    }

    @d
    public final MultiDimensionRadarObj copy(@e List<MultiDimensionScore> list, @e String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{list, str}, this, changeQuickRedirect, false, 14933, new Class[]{List.class, String.class}, MultiDimensionRadarObj.class);
        return patchProxyResultProxy.isSupported ? (MultiDimensionRadarObj) patchProxyResultProxy.result : new MultiDimensionRadarObj(list, str);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14937, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MultiDimensionRadarObj)) {
            return false;
        }
        MultiDimensionRadarObj multiDimensionRadarObj = (MultiDimensionRadarObj) obj;
        return f0.g(this.dimension_list, multiDimensionRadarObj.dimension_list) && f0.g(this.total_num, multiDimensionRadarObj.total_num);
    }

    @e
    public final List<MultiDimensionScore> getDimension_list() {
        return this.dimension_list;
    }

    @e
    public final String getTotal_num() {
        return this.total_num;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14936, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        List<MultiDimensionScore> list = this.dimension_list;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.total_num;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final void setDimension_list(@e List<MultiDimensionScore> list) {
        this.dimension_list = list;
    }

    public final void setTotal_num(@e String str) {
        this.total_num = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14935, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "MultiDimensionRadarObj(dimension_list=" + this.dimension_list + ", total_num=" + this.total_num + ')';
    }
}
