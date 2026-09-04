package com.starlightc.ucropplus.util;

import android.graphics.Bitmap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: BitmapConvertKt.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class BitmapConvertKtKt {
    public static ChangeQuickRedirect changeQuickRedirect;

    @d
    public static final Bitmap toBitmap(@d int[] iArr, int i10, int i11) {
        Object[] objArr = {iArr, new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 50896, new Class[]{int[].class, cls, cls}, Bitmap.class);
        if (patchProxyResultProxy.isSupported) {
            return (Bitmap) patchProxyResultProxy.result;
        }
        f0.p(iArr, "<this>");
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
        f0.o(bitmapCreateBitmap, "createBitmap(...)");
        bitmapCreateBitmap.setPixels(iArr, 0, i10, 0, 0, i10, i11);
        return bitmapCreateBitmap;
    }

    @d
    public static final int[] toPixels(@d Bitmap bitmap) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bitmap}, null, changeQuickRedirect, true, 50895, new Class[]{Bitmap.class}, int[].class);
        if (patchProxyResultProxy.isSupported) {
            return (int[]) patchProxyResultProxy.result;
        }
        f0.p(bitmap, "<this>");
        int height = bitmap.getHeight();
        int width = bitmap.getWidth();
        int[] iArr = new int[height * width];
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        return iArr;
    }
}
