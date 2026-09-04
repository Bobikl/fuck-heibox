package com.max.hbimage.image;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.security.MessageDigest;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: RoundedCornersBorderTransformation.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class r extends com.bumptech.glide.load.resource.bitmap.h {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f70493c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f70494d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private final Paint f70495e;

    public r(int i10, int i11, int i12) {
        this.f70493c = i10;
        this.f70494d = i11;
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(i12);
        paint.setStrokeWidth(i11);
        this.f70495e = paint;
    }

    @Override // com.bumptech.glide.load.c
    public void b(@dl.d MessageDigest messageDigest) {
        if (PatchProxy.proxy(new Object[]{messageDigest}, this, changeQuickRedirect, false, bb.c.g.Td, new Class[]{MessageDigest.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(messageDigest, "messageDigest");
        byte[] bytes = ("RoundedCornersBorderTransformation(radius=" + this.f70493c + ", borderSize=" + this.f70494d + ')').getBytes(kotlin.text.d.f128566b);
        f0.o(bytes, "getBytes(...)");
        messageDigest.update(bytes);
    }

    @Override // com.bumptech.glide.load.resource.bitmap.h
    @dl.d
    public Bitmap c(@dl.d com.bumptech.glide.load.engine.bitmap_recycle.e pool, @dl.d Bitmap toTransform, int i10, int i11) {
        Object[] objArr = {pool, toTransform, new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.g.Sd, new Class[]{com.bumptech.glide.load.engine.bitmap_recycle.e.class, Bitmap.class, cls, cls}, Bitmap.class);
        if (patchProxyResultProxy.isSupported) {
            return (Bitmap) patchProxyResultProxy.result;
        }
        f0.p(pool, "pool");
        f0.p(toTransform, "toTransform");
        int width = toTransform.getWidth();
        int height = toTransform.getHeight();
        Bitmap bitmapE = pool.e(width, height, Bitmap.Config.ARGB_8888);
        if (bitmapE == null) {
            bitmapE = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        }
        f0.m(bitmapE);
        Canvas canvas = new Canvas(bitmapE);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint.setShader(new BitmapShader(toTransform, tileMode, tileMode));
        int i12 = this.f70494d;
        RectF rectF = new RectF(i12, i12, width - i12, height - i12);
        int i13 = this.f70493c;
        canvas.drawRoundRect(rectF, i13, i13, paint);
        float f10 = this.f70493c - (this.f70494d / 2);
        int i14 = this.f70494d;
        canvas.drawRoundRect(new RectF(i14 / 2.0f, i14 / 2.0f, width - (i14 / 2), height - (i14 / 2)), f10, f10, this.f70495e);
        return bitmapE;
    }
}
