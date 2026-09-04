package com.starlightc.ucropplus.model;

import android.net.Uri;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.starlightc.ucropplus.view.UCropView;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: CropPageInfo.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class CropPageInfo implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;

    @d
    private WeakReference<View> blockViewRef;

    @d
    private WeakReference<UCropView> cropViewRef;

    @d
    private Uri uri;

    public CropPageInfo(@d Uri uri, @d WeakReference<UCropView> cropViewRef, @d WeakReference<View> blockViewRef) {
        f0.p(uri, "uri");
        f0.p(cropViewRef, "cropViewRef");
        f0.p(blockViewRef, "blockViewRef");
        this.uri = uri;
        this.cropViewRef = cropViewRef;
        this.blockViewRef = blockViewRef;
    }

    public /* synthetic */ CropPageInfo(Uri uri, WeakReference weakReference, WeakReference weakReference2, int i10, u uVar) {
        this(uri, (i10 & 2) != 0 ? new WeakReference(null) : weakReference, (i10 & 4) != 0 ? new WeakReference(null) : weakReference2);
    }

    public static /* synthetic */ CropPageInfo copy$default(CropPageInfo cropPageInfo, Uri uri, WeakReference weakReference, WeakReference weakReference2, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cropPageInfo, uri, weakReference, weakReference2, new Integer(i10), obj}, null, changeQuickRedirect, true, 50050, new Class[]{CropPageInfo.class, Uri.class, WeakReference.class, WeakReference.class, Integer.TYPE, Object.class}, CropPageInfo.class);
        if (patchProxyResultProxy.isSupported) {
            return (CropPageInfo) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            uri = cropPageInfo.uri;
        }
        if ((i10 & 2) != 0) {
            weakReference = cropPageInfo.cropViewRef;
        }
        if ((i10 & 4) != 0) {
            weakReference2 = cropPageInfo.blockViewRef;
        }
        return cropPageInfo.copy(uri, weakReference, weakReference2);
    }

    @d
    public final Uri component1() {
        return this.uri;
    }

    @d
    public final WeakReference<UCropView> component2() {
        return this.cropViewRef;
    }

    @d
    public final WeakReference<View> component3() {
        return this.blockViewRef;
    }

    @d
    public final CropPageInfo copy(@d Uri uri, @d WeakReference<UCropView> cropViewRef, @d WeakReference<View> blockViewRef) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{uri, cropViewRef, blockViewRef}, this, changeQuickRedirect, false, 50049, new Class[]{Uri.class, WeakReference.class, WeakReference.class}, CropPageInfo.class);
        if (patchProxyResultProxy.isSupported) {
            return (CropPageInfo) patchProxyResultProxy.result;
        }
        f0.p(uri, "uri");
        f0.p(cropViewRef, "cropViewRef");
        f0.p(blockViewRef, "blockViewRef");
        return new CropPageInfo(uri, cropViewRef, blockViewRef);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 50053, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CropPageInfo)) {
            return false;
        }
        CropPageInfo cropPageInfo = (CropPageInfo) obj;
        return f0.g(this.uri, cropPageInfo.uri) && f0.g(this.cropViewRef, cropPageInfo.cropViewRef) && f0.g(this.blockViewRef, cropPageInfo.blockViewRef);
    }

    @d
    public final WeakReference<View> getBlockViewRef() {
        return this.blockViewRef;
    }

    @d
    public final WeakReference<UCropView> getCropViewRef() {
        return this.cropViewRef;
    }

    @d
    public final Uri getUri() {
        return this.uri;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50052, new Class[0], Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : (((this.uri.hashCode() * 31) + this.cropViewRef.hashCode()) * 31) + this.blockViewRef.hashCode();
    }

    public final void setBlockViewRef(@d WeakReference<View> weakReference) {
        if (PatchProxy.proxy(new Object[]{weakReference}, this, changeQuickRedirect, false, 50048, new Class[]{WeakReference.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(weakReference, "<set-?>");
        this.blockViewRef = weakReference;
    }

    public final void setCropViewRef(@d WeakReference<UCropView> weakReference) {
        if (PatchProxy.proxy(new Object[]{weakReference}, this, changeQuickRedirect, false, 50047, new Class[]{WeakReference.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(weakReference, "<set-?>");
        this.cropViewRef = weakReference;
    }

    public final void setUri(@d Uri uri) {
        if (PatchProxy.proxy(new Object[]{uri}, this, changeQuickRedirect, false, 50046, new Class[]{Uri.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(uri, "<set-?>");
        this.uri = uri;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50051, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "CropPageInfo(uri=" + this.uri + ", cropViewRef=" + this.cropViewRef + ", blockViewRef=" + this.blockViewRef + ')';
    }
}
