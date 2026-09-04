package zb;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.renderscript.Allocation;
import android.renderscript.BaseObj;
import android.renderscript.Element;
import android.renderscript.RSRuntimeException;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.view.View;
import androidx.core.view.j1;
import androidx.core.view.q0;
import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.lang.reflect.Array;

/* JADX INFO: compiled from: Blur.java */
/* JADX INFO: loaded from: classes10.dex */
public class a {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static boolean a(int... iArr) {
        for (int i10 : iArr) {
            if (i10 == 0) {
                return true;
            }
        }
        return false;
    }

    public static Bitmap b(Context context, Bitmap bitmap, b bVar) throws Throwable {
        Bitmap bitmapE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, bitmap, bVar}, null, changeQuickRedirect, true, c.f.Hh, new Class[]{Context.class, Bitmap.class, b.class}, Bitmap.class);
        if (patchProxyResultProxy.isSupported) {
            return (Bitmap) patchProxyResultProxy.result;
        }
        int i10 = bVar.f141959a;
        int i11 = bVar.f141962d;
        int i12 = i10 / i11;
        int i13 = bVar.f141960b / i11;
        if (a(i12, i13)) {
            return null;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i12, i13, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        int i14 = bVar.f141962d;
        canvas.scale(1.0f / i14, 1.0f / i14);
        Paint paint = new Paint();
        paint.setFlags(3);
        paint.setColorFilter(new PorterDuffColorFilter(bVar.f141963e, PorterDuff.Mode.SRC_ATOP));
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        try {
            bitmapE = d(context, bitmapCreateBitmap, bVar.f141961c);
        } catch (RSRuntimeException unused) {
            bitmapE = e(bitmapCreateBitmap, bVar.f141961c, true);
        }
        if (bVar.f141962d == 1) {
            return bitmapE;
        }
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapE, bVar.f141959a, bVar.f141960b, true);
        bitmapE.recycle();
        return bitmapCreateScaledBitmap;
    }

    public static Bitmap c(View view, b bVar) throws Throwable {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view, bVar}, null, changeQuickRedirect, true, c.f.Gh, new Class[]{View.class, b.class}, Bitmap.class);
        if (patchProxyResultProxy.isSupported) {
            return (Bitmap) patchProxyResultProxy.result;
        }
        view.setDrawingCacheEnabled(true);
        view.destroyDrawingCache();
        view.setDrawingCacheQuality(524288);
        Bitmap drawingCache = view.getDrawingCache();
        Bitmap bitmapB = b(view.getContext(), drawingCache, bVar);
        drawingCache.recycle();
        return bitmapB;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0085  */
    /* JADX WARN: Code duplicated, block: B:25:0x008a  */
    /* JADX WARN: Code duplicated, block: B:27:0x008f  */
    /* JADX WARN: Code duplicated, block: B:29:0x0094  */
    private static Bitmap d(Context context, Bitmap bitmap, int i10) throws Throwable {
        BaseObj baseObj;
        Allocation allocationCreateFromBitmap;
        Allocation allocationCreateTyped;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, bitmap, new Integer(i10)}, null, changeQuickRedirect, true, c.f.Ih, new Class[]{Context.class, Bitmap.class, Integer.TYPE}, Bitmap.class);
        if (patchProxyResultProxy.isSupported) {
            return (Bitmap) patchProxyResultProxy.result;
        }
        RenderScript renderScript = null;
        ScriptIntrinsicBlur scriptIntrinsicBlurCreate = null;
        try {
            RenderScript renderScriptCreate = RenderScript.create(context);
            try {
                renderScriptCreate.setMessageHandler(new RenderScript.RSMessageHandler());
                allocationCreateFromBitmap = Allocation.createFromBitmap(renderScriptCreate, bitmap, Allocation.MipmapControl.MIPMAP_NONE, 1);
                try {
                    allocationCreateTyped = Allocation.createTyped(renderScriptCreate, allocationCreateFromBitmap.getType());
                    try {
                        scriptIntrinsicBlurCreate = ScriptIntrinsicBlur.create(renderScriptCreate, Element.U8_4(renderScriptCreate));
                        scriptIntrinsicBlurCreate.setInput(allocationCreateFromBitmap);
                        scriptIntrinsicBlurCreate.setRadius(i10);
                        scriptIntrinsicBlurCreate.forEach(allocationCreateTyped);
                        allocationCreateTyped.copyTo(bitmap);
                        renderScriptCreate.destroy();
                        allocationCreateFromBitmap.destroy();
                        allocationCreateTyped.destroy();
                        scriptIntrinsicBlurCreate.destroy();
                        return bitmap;
                    } catch (Throwable th2) {
                        th = th2;
                        BaseObj baseObj2 = scriptIntrinsicBlurCreate;
                        renderScript = renderScriptCreate;
                        baseObj = baseObj2;
                        if (renderScript != null) {
                            renderScript.destroy();
                        }
                        if (allocationCreateFromBitmap != null) {
                            allocationCreateFromBitmap.destroy();
                        }
                        if (allocationCreateTyped != null) {
                            allocationCreateTyped.destroy();
                        }
                        if (baseObj != null) {
                            baseObj.destroy();
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    allocationCreateTyped = null;
                    renderScript = renderScriptCreate;
                    baseObj = allocationCreateTyped;
                    if (renderScript != null) {
                        renderScript.destroy();
                    }
                    if (allocationCreateFromBitmap != null) {
                        allocationCreateFromBitmap.destroy();
                    }
                    if (allocationCreateTyped != null) {
                        allocationCreateTyped.destroy();
                    }
                    if (baseObj != null) {
                        baseObj.destroy();
                    }
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                allocationCreateFromBitmap = null;
                allocationCreateTyped = null;
            }
        } catch (Throwable th5) {
            th = th5;
            baseObj = null;
            allocationCreateFromBitmap = null;
            allocationCreateTyped = null;
        }
    }

    private static Bitmap e(Bitmap bitmap, int i10, boolean z10) {
        Bitmap bitmapCopy = bitmap;
        int i11 = i10;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bitmapCopy, new Integer(i11), new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, c.f.Jh, new Class[]{Bitmap.class, Integer.TYPE, Boolean.TYPE}, Bitmap.class);
        if (patchProxyResultProxy.isSupported) {
            return (Bitmap) patchProxyResultProxy.result;
        }
        if (!z10) {
            bitmapCopy = bitmapCopy.copy(bitmap.getConfig(), true);
        }
        if (i11 < 1) {
            return null;
        }
        int width = bitmapCopy.getWidth();
        int height = bitmapCopy.getHeight();
        int i12 = width * height;
        int[] iArr = new int[i12];
        bitmapCopy.getPixels(iArr, 0, width, 0, 0, width, height);
        int i13 = width - 1;
        int i14 = height - 1;
        int i15 = i11 + i11 + 1;
        int[] iArr2 = new int[i12];
        int[] iArr3 = new int[i12];
        int[] iArr4 = new int[i12];
        int[] iArr5 = new int[Math.max(width, height)];
        int i16 = (i15 + 1) >> 1;
        int i17 = i16 * i16;
        int i18 = i17 * 256;
        int[] iArr6 = new int[i18];
        for (int i19 = 0; i19 < i18; i19++) {
            iArr6[i19] = i19 / i17;
        }
        int[][] iArr7 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i15, 3);
        int i20 = i11 + 1;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        while (i21 < height) {
            Bitmap bitmap2 = bitmapCopy;
            int i24 = -i11;
            int i25 = 0;
            int i26 = 0;
            int i27 = 0;
            int i28 = 0;
            int i29 = 0;
            int i30 = 0;
            int i31 = 0;
            int i32 = 0;
            int i33 = 0;
            while (i24 <= i11) {
                int i34 = height;
                int i35 = i14;
                int i36 = iArr[i22 + Math.min(i13, Math.max(i24, 0))];
                int[] iArr8 = iArr7[i24 + i11];
                iArr8[0] = (i36 & 16711680) >> 16;
                iArr8[1] = (i36 & q0.f21790f) >> 8;
                iArr8[2] = i36 & 255;
                int iAbs = i20 - Math.abs(i24);
                int i37 = iArr8[0];
                i25 += i37 * iAbs;
                int i38 = iArr8[1];
                i26 += i38 * iAbs;
                int i39 = iArr8[2];
                i27 += iAbs * i39;
                if (i24 > 0) {
                    i31 += i37;
                    i32 += i38;
                    i33 += i39;
                } else {
                    i28 += i37;
                    i29 += i38;
                    i30 += i39;
                }
                i24++;
                height = i34;
                i14 = i35;
            }
            int i40 = height;
            int i41 = i14;
            int i42 = i11;
            int i43 = 0;
            while (i43 < width) {
                iArr2[i22] = iArr6[i25];
                iArr3[i22] = iArr6[i26];
                iArr4[i22] = iArr6[i27];
                int i44 = i25 - i28;
                int i45 = i26 - i29;
                int i46 = i27 - i30;
                int[] iArr9 = iArr7[((i42 - i11) + i15) % i15];
                int i47 = i28 - iArr9[0];
                int i48 = i29 - iArr9[1];
                int i49 = i30 - iArr9[2];
                if (i21 == 0) {
                    iArr5[i43] = Math.min(i43 + i11 + 1, i13);
                }
                int i50 = iArr[i23 + iArr5[i43]];
                int i51 = (i50 & 16711680) >> 16;
                iArr9[0] = i51;
                int i52 = (i50 & q0.f21790f) >> 8;
                iArr9[1] = i52;
                int i53 = i50 & 255;
                iArr9[2] = i53;
                int i54 = i31 + i51;
                int i55 = i32 + i52;
                int i56 = i33 + i53;
                i25 = i44 + i54;
                i26 = i45 + i55;
                i27 = i46 + i56;
                i42 = (i42 + 1) % i15;
                int[] iArr10 = iArr7[i42 % i15];
                int i57 = iArr10[0];
                i28 = i47 + i57;
                int i58 = iArr10[1];
                i29 = i48 + i58;
                int i59 = iArr10[2];
                i30 = i49 + i59;
                i31 = i54 - i57;
                i32 = i55 - i58;
                i33 = i56 - i59;
                i22++;
                i43++;
                iArr6 = iArr6;
            }
            i23 += width;
            i21++;
            bitmapCopy = bitmap2;
            height = i40;
            i14 = i41;
        }
        Bitmap bitmap3 = bitmapCopy;
        int i60 = height;
        int i61 = i14;
        int[] iArr11 = iArr6;
        int i62 = 0;
        while (i62 < width) {
            int i63 = -i11;
            int i64 = i63 * width;
            int i65 = 0;
            int i66 = 0;
            int i67 = 0;
            int i68 = 0;
            int i69 = 0;
            int i70 = 0;
            int i71 = 0;
            int i72 = 0;
            int i73 = 0;
            while (i63 <= i11) {
                int[] iArr12 = iArr5;
                int iMax = Math.max(0, i64) + i62;
                int[] iArr13 = iArr7[i63 + i11];
                iArr13[0] = iArr2[iMax];
                iArr13[1] = iArr3[iMax];
                iArr13[2] = iArr4[iMax];
                int iAbs2 = i20 - Math.abs(i63);
                i65 += iArr2[iMax] * iAbs2;
                i66 += iArr3[iMax] * iAbs2;
                i67 += iArr4[iMax] * iAbs2;
                if (i63 > 0) {
                    i71 += iArr13[0];
                    i72 += iArr13[1];
                    i73 += iArr13[2];
                } else {
                    i68 += iArr13[0];
                    i69 += iArr13[1];
                    i70 += iArr13[2];
                }
                int i74 = i61;
                if (i63 < i74) {
                    i64 += width;
                }
                i63++;
                i61 = i74;
                iArr5 = iArr12;
            }
            int[] iArr14 = iArr5;
            int i75 = i61;
            int i76 = i60;
            int i77 = i62;
            int i78 = i11;
            int i79 = 0;
            while (i79 < i76) {
                iArr[i77] = (iArr[i77] & j1.f21601t) | (iArr11[i65] << 16) | (iArr11[i66] << 8) | iArr11[i67];
                int i80 = i65 - i68;
                int i81 = i66 - i69;
                int i82 = i67 - i70;
                int[] iArr15 = iArr7[((i78 - i11) + i15) % i15];
                int i83 = i68 - iArr15[0];
                int i84 = i69 - iArr15[1];
                int i85 = i70 - iArr15[2];
                if (i62 == 0) {
                    iArr14[i79] = Math.min(i79 + i20, i75) * width;
                }
                int i86 = iArr14[i79] + i62;
                int i87 = iArr2[i86];
                iArr15[0] = i87;
                int i88 = iArr3[i86];
                iArr15[1] = i88;
                int i89 = iArr4[i86];
                iArr15[2] = i89;
                int i90 = i71 + i87;
                int i91 = i72 + i88;
                int i92 = i73 + i89;
                i65 = i80 + i90;
                i66 = i81 + i91;
                i67 = i82 + i92;
                i78 = (i78 + 1) % i15;
                int[] iArr16 = iArr7[i78];
                int i93 = iArr16[0];
                i68 = i83 + i93;
                int i94 = iArr16[1];
                i69 = i84 + i94;
                int i95 = iArr16[2];
                i70 = i85 + i95;
                i71 = i90 - i93;
                i72 = i91 - i94;
                i73 = i92 - i95;
                i77 += width;
                i79++;
                i11 = i10;
            }
            i62++;
            i11 = i10;
            i60 = i76;
            i61 = i75;
            iArr5 = iArr14;
        }
        bitmap3.setPixels(iArr, 0, width, 0, 0, width, i60);
        return bitmap3;
    }
}
