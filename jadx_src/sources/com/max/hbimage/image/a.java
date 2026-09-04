package com.max.hbimage.image;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: BitmapProcessingUtil.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final a f70419a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f70420b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f70421c;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f70422d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f70423e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f70424f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f70425g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f70426h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f70427i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f70428j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static int f70429k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @dl.e
    private static int[] f70430l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @dl.e
    private static final int[] f70431m = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @dl.e
    private static final int[] f70432n = null;

    private a() {
    }

    @dl.e
    public final Drawable a(@dl.e Bitmap bitmap, @dl.d Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bitmap, context}, this, changeQuickRedirect, false, bb.c.g.I6, new Class[]{Bitmap.class, Context.class}, Drawable.class);
        if (patchProxyResultProxy.isSupported) {
            return (Drawable) patchProxyResultProxy.result;
        }
        f0.p(context, "context");
        if (bitmap == null) {
            return null;
        }
        return new BitmapDrawable(context.getResources(), bitmap);
    }

    @dl.e
    public final Bitmap b(@dl.e Drawable drawable) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{drawable}, this, changeQuickRedirect, false, bb.c.g.H6, new Class[]{Drawable.class}, Bitmap.class);
        if (patchProxyResultProxy.isSupported) {
            return (Bitmap) patchProxyResultProxy.result;
        }
        if (drawable == null) {
            return null;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, drawable.getOpacity() != -1 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565);
        f0.o(bitmapCreateBitmap, "createBitmap(...)");
        drawable.draw(new Canvas(bitmapCreateBitmap));
        return bitmapCreateBitmap;
    }

    @dl.e
    public final Bitmap c(@dl.e Bitmap bitmap) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bitmap}, this, changeQuickRedirect, false, bb.c.g.G6, new Class[]{Bitmap.class}, Bitmap.class);
        if (patchProxyResultProxy.isSupported) {
            return (Bitmap) patchProxyResultProxy.result;
        }
        if (bitmap == null) {
            return null;
        }
        f70420b = bitmap.getWidth();
        int height = bitmap.getHeight();
        f70421c = height;
        int[] iArr = new int[f70420b * height];
        f70430l = iArr;
        f0.m(iArr);
        int i10 = f70420b;
        bitmap.getPixels(iArr, 0, i10, 0, 0, i10, f70421c);
        f70425g = 0;
        f70422d = 0;
        while (true) {
            int i11 = f70422d;
            if (i11 >= f70421c) {
                int[] iArr2 = f70430l;
                f0.m(iArr2);
                int i12 = f70420b;
                bitmap.setPixels(iArr2, 0, i12, 0, 0, i12, f70421c);
                return bitmap;
            }
            f70425g = i11 * f70420b;
            f70423e = 0;
            while (f70423e < f70420b) {
                int[] iArr3 = f70430l;
                f0.m(iArr3);
                int i13 = iArr3[f70425g];
                int i14 = (i13 >> 24) & 255;
                f70426h = i14;
                int i15 = 255 - ((i13 >> 16) & 255);
                f70427i = i15;
                int i16 = 255 - ((i13 >> 8) & 255);
                f70428j = i16;
                int i17 = 255 - (i13 & 255);
                f70429k = i17;
                f70424f = (i17 & 255) | ((i14 & 255) << 24) | ((i15 & 255) << 16) | ((i16 & 255) << 8);
                int[] iArr4 = f70430l;
                f0.m(iArr4);
                int i18 = f70425g;
                iArr4[i18] = f70424f;
                f70425g = i18 + 1;
                f70423e++;
            }
            f70422d++;
        }
    }
}
