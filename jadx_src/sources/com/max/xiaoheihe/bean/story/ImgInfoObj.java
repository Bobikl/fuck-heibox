package com.max.xiaoheihe.bean.story;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: StoryModeListObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class ImgInfoObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private List<ImgObj> images;
    private int play_time_duration;

    /* JADX WARN: Multi-variable type inference failed */
    public ImgInfoObj() {
        this(null, 0, 3, 0 == true ? 1 : 0);
    }

    public ImgInfoObj(@e List<ImgObj> list, int i10) {
        this.images = list;
        this.play_time_duration = i10;
    }

    public /* synthetic */ ImgInfoObj(List list, int i10, int i11, u uVar) {
        this((i11 & 1) != 0 ? null : list, (i11 & 2) != 0 ? 0 : i10);
    }

    public static /* synthetic */ ImgInfoObj copy$default(ImgInfoObj imgInfoObj, List list, int i10, int i11, Object obj) {
        Object[] objArr = {imgInfoObj, list, new Integer(i10), new Integer(i11), obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 15944, new Class[]{ImgInfoObj.class, List.class, cls, cls, Object.class}, ImgInfoObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (ImgInfoObj) patchProxyResultProxy.result;
        }
        if ((i11 & 1) != 0) {
            list = imgInfoObj.images;
        }
        if ((i11 & 2) != 0) {
            i10 = imgInfoObj.play_time_duration;
        }
        return imgInfoObj.copy(list, i10);
    }

    @e
    public final List<ImgObj> component1() {
        return this.images;
    }

    public final int component2() {
        return this.play_time_duration;
    }

    @d
    public final ImgInfoObj copy(@e List<ImgObj> list, int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{list, new Integer(i10)}, this, changeQuickRedirect, false, 15943, new Class[]{List.class, Integer.TYPE}, ImgInfoObj.class);
        return patchProxyResultProxy.isSupported ? (ImgInfoObj) patchProxyResultProxy.result : new ImgInfoObj(list, i10);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15947, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImgInfoObj)) {
            return false;
        }
        ImgInfoObj imgInfoObj = (ImgInfoObj) obj;
        return f0.g(this.images, imgInfoObj.images) && this.play_time_duration == imgInfoObj.play_time_duration;
    }

    @e
    public final List<ImgObj> getImages() {
        return this.images;
    }

    public final int getPlay_time_duration() {
        return this.play_time_duration;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15946, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        List<ImgObj> list = this.images;
        return ((list != null ? list.hashCode() : 0) * 31) + this.play_time_duration;
    }

    public final void setImages(@e List<ImgObj> list) {
        this.images = list;
    }

    public final void setPlay_time_duration(int i10) {
        this.play_time_duration = i10;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15945, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "ImgInfoObj(images=" + this.images + ", play_time_duration=" + this.play_time_duration + ')';
    }
}
