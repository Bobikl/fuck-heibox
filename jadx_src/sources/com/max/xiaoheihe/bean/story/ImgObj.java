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
public final class ImgObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;
    private int height;

    @e
    private String img_url;
    private int width;

    public ImgObj() {
        this(0, 0, null, 7, null);
    }

    public ImgObj(int i10, int i11, @e String str) {
        this.width = i10;
        this.height = i11;
        this.img_url = str;
    }

    public /* synthetic */ ImgObj(int i10, int i11, String str, int i12, u uVar) {
        this((i12 & 1) != 0 ? 0 : i10, (i12 & 2) != 0 ? 0 : i11, (i12 & 4) != 0 ? null : str);
    }

    public static /* synthetic */ ImgObj copy$default(ImgObj imgObj, int i10, int i11, String str, int i12, Object obj) {
        Object[] objArr = {imgObj, new Integer(i10), new Integer(i11), str, new Integer(i12), obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 15949, new Class[]{ImgObj.class, cls, cls, String.class, cls, Object.class}, ImgObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (ImgObj) patchProxyResultProxy.result;
        }
        if ((i12 & 1) != 0) {
            i10 = imgObj.width;
        }
        if ((i12 & 2) != 0) {
            i11 = imgObj.height;
        }
        if ((i12 & 4) != 0) {
            str = imgObj.img_url;
        }
        return imgObj.copy(i10, i11, str);
    }

    public final int component1() {
        return this.width;
    }

    public final int component2() {
        return this.height;
    }

    @e
    public final String component3() {
        return this.img_url;
    }

    @d
    public final ImgObj copy(int i10, int i11, @e String str) {
        Object[] objArr = {new Integer(i10), new Integer(i11), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 15948, new Class[]{cls, cls, String.class}, ImgObj.class);
        return patchProxyResultProxy.isSupported ? (ImgObj) patchProxyResultProxy.result : new ImgObj(i10, i11, str);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15952, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImgObj)) {
            return false;
        }
        ImgObj imgObj = (ImgObj) obj;
        return this.width == imgObj.width && this.height == imgObj.height && f0.g(this.img_url, imgObj.img_url);
    }

    public final int getHeight() {
        return this.height;
    }

    @e
    public final String getImg_url() {
        return this.img_url;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15951, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        int i10 = ((this.width * 31) + this.height) * 31;
        String str = this.img_url;
        return i10 + (str != null ? str.hashCode() : 0);
    }

    public final void setHeight(int i10) {
        this.height = i10;
    }

    public final void setImg_url(@e String str) {
        this.img_url = str;
    }

    public final void setWidth(int i10) {
        this.width = i10;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15950, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "ImgObj(width=" + this.width + ", height=" + this.height + ", img_url=" + this.img_url + ')';
    }
}
