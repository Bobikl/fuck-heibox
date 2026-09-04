package com.max.xiaoheihe.bean.share;

import androidx.compose.runtime.internal.o;
import com.max.xiaoheihe.bean.RectObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ScreenImageInfo.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class ScreenImageInfo implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String delay;

    @e
    private List<List<RectObj>> rects;

    @e
    private List<Integer> single_image_rects;

    @e
    private RectObj target_size;

    public ScreenImageInfo(@e List<List<RectObj>> list, @e RectObj rectObj, @e List<Integer> list2, @e String str) {
        this.rects = list;
        this.target_size = rectObj;
        this.single_image_rects = list2;
        this.delay = str;
    }

    public static /* synthetic */ ScreenImageInfo copy$default(ScreenImageInfo screenImageInfo, List list, RectObj rectObj, List list2, String str, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{screenImageInfo, list, rectObj, list2, str, new Integer(i10), obj}, null, changeQuickRedirect, true, 15908, new Class[]{ScreenImageInfo.class, List.class, RectObj.class, List.class, String.class, Integer.TYPE, Object.class}, ScreenImageInfo.class);
        if (patchProxyResultProxy.isSupported) {
            return (ScreenImageInfo) patchProxyResultProxy.result;
        }
        return screenImageInfo.copy((i10 & 1) != 0 ? screenImageInfo.rects : list, (i10 & 2) != 0 ? screenImageInfo.target_size : rectObj, (i10 & 4) != 0 ? screenImageInfo.single_image_rects : list2, (i10 & 8) != 0 ? screenImageInfo.delay : str);
    }

    @e
    public final List<List<RectObj>> component1() {
        return this.rects;
    }

    @e
    public final RectObj component2() {
        return this.target_size;
    }

    @e
    public final List<Integer> component3() {
        return this.single_image_rects;
    }

    @e
    public final String component4() {
        return this.delay;
    }

    @d
    public final ScreenImageInfo copy(@e List<List<RectObj>> list, @e RectObj rectObj, @e List<Integer> list2, @e String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{list, rectObj, list2, str}, this, changeQuickRedirect, false, 15907, new Class[]{List.class, RectObj.class, List.class, String.class}, ScreenImageInfo.class);
        return patchProxyResultProxy.isSupported ? (ScreenImageInfo) patchProxyResultProxy.result : new ScreenImageInfo(list, rectObj, list2, str);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15911, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScreenImageInfo)) {
            return false;
        }
        ScreenImageInfo screenImageInfo = (ScreenImageInfo) obj;
        return f0.g(this.rects, screenImageInfo.rects) && f0.g(this.target_size, screenImageInfo.target_size) && f0.g(this.single_image_rects, screenImageInfo.single_image_rects) && f0.g(this.delay, screenImageInfo.delay);
    }

    @e
    public final String getDelay() {
        return this.delay;
    }

    @e
    public final List<List<RectObj>> getRects() {
        return this.rects;
    }

    @e
    public final List<Integer> getSingle_image_rects() {
        return this.single_image_rects;
    }

    @e
    public final RectObj getTarget_size() {
        return this.target_size;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15910, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        List<List<RectObj>> list = this.rects;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        RectObj rectObj = this.target_size;
        int iHashCode2 = (iHashCode + (rectObj == null ? 0 : rectObj.hashCode())) * 31;
        List<Integer> list2 = this.single_image_rects;
        int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str = this.delay;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final void setDelay(@e String str) {
        this.delay = str;
    }

    public final void setRects(@e List<List<RectObj>> list) {
        this.rects = list;
    }

    public final void setSingle_image_rects(@e List<Integer> list) {
        this.single_image_rects = list;
    }

    public final void setTarget_size(@e RectObj rectObj) {
        this.target_size = rectObj;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15909, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "ScreenImageInfo(rects=" + this.rects + ", target_size=" + this.target_size + ", single_image_rects=" + this.single_image_rects + ", delay=" + this.delay + ')';
    }
}
