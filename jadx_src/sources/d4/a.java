package d4;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import androidx.core.view.j1;
import androidx.core.view.q0;
import com.alipay.zoloz.toyger.ToygerLog;
import com.alipay.zoloz.toyger.face.FaceBlobManager;
import com.alipay.zoloz.toyger.face.ToygerFaceAttr;
import com.max.xiaoheihe.module.upload.g;
import java.lang.reflect.Array;

/* JADX INFO: compiled from: Avatar.java */
/* JADX INFO: loaded from: classes6.dex */
public class a {
    public static Bitmap a(Bitmap bitmap, int i10, float f10) {
        ToygerLog.d("blur()...radius:" + i10 + " scale:" + f10);
        if (f10 <= 0.0f) {
            f10 = 1.0f;
        }
        Bitmap bitmapCreateBitmap = null;
        try {
            bitmapCreateBitmap = Bitmap.createBitmap((int) (bitmap.getWidth() / f10), (int) (bitmap.getHeight() / f10), Bitmap.Config.ARGB_4444);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            float f11 = 1.0f / f10;
            canvas.scale(f11, f11);
            Paint paint = new Paint();
            paint.setFlags(2);
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
            return b(bitmapCreateBitmap, i10, true);
        } catch (OutOfMemoryError e10) {
            ToygerLog.e(e10);
            return bitmapCreateBitmap;
        }
    }

    public static Bitmap b(Bitmap bitmap, int i10, boolean z10) {
        int i11 = i10;
        ToygerLog.d("radius:" + i11);
        Bitmap bitmapCopy = z10 ? bitmap : bitmap.copy(bitmap.getConfig(), true);
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
        ToygerLog.d("radius:" + i11 + " div:" + i15 + " divsum:" + i16);
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
            int i24 = height;
            int i25 = 0;
            int i26 = 0;
            int i27 = 0;
            int i28 = 0;
            int i29 = 0;
            int i30 = 0;
            int i31 = 0;
            int i32 = 0;
            int i33 = -i11;
            int i34 = 0;
            while (i33 <= i11) {
                int i35 = i14;
                int[] iArr8 = iArr5;
                int i36 = iArr[i22 + Math.min(i13, Math.max(i33, 0))];
                int[] iArr9 = iArr7[i33 + i11];
                iArr9[0] = (i36 & 16711680) >> 16;
                iArr9[1] = (i36 & q0.f21790f) >> 8;
                iArr9[2] = i36 & 255;
                int iAbs = i20 - Math.abs(i33);
                int i37 = iArr9[0];
                i34 += i37 * iAbs;
                int i38 = iArr9[1];
                i25 += i38 * iAbs;
                int i39 = iArr9[2];
                i26 += iAbs * i39;
                if (i33 > 0) {
                    i30 += i37;
                    i31 += i38;
                    i32 += i39;
                } else {
                    i27 += i37;
                    i28 += i38;
                    i29 += i39;
                }
                i33++;
                i14 = i35;
                iArr5 = iArr8;
            }
            int i40 = i14;
            int[] iArr10 = iArr5;
            int i41 = i11;
            int i42 = i34;
            int i43 = 0;
            while (i43 < width) {
                iArr2[i22] = iArr6[i42];
                iArr3[i22] = iArr6[i25];
                iArr4[i22] = iArr6[i26];
                int i44 = i42 - i27;
                int i45 = i25 - i28;
                int i46 = i26 - i29;
                int[] iArr11 = iArr7[((i41 - i11) + i15) % i15];
                int i47 = i27 - iArr11[0];
                int i48 = i28 - iArr11[1];
                int i49 = i29 - iArr11[2];
                if (i21 == 0) {
                    iArr10[i43] = Math.min(i43 + i11 + 1, i13);
                }
                int i50 = iArr[i23 + iArr10[i43]];
                int i51 = (i50 & 16711680) >> 16;
                iArr11[0] = i51;
                int i52 = (i50 & q0.f21790f) >> 8;
                iArr11[1] = i52;
                int i53 = i50 & 255;
                iArr11[2] = i53;
                int i54 = i30 + i51;
                int i55 = i31 + i52;
                int i56 = i32 + i53;
                i42 = i44 + i54;
                i25 = i45 + i55;
                i26 = i46 + i56;
                i41 = (i41 + 1) % i15;
                int[] iArr12 = iArr7[i41 % i15];
                int i57 = iArr12[0];
                i27 = i47 + i57;
                int i58 = iArr12[1];
                i28 = i48 + i58;
                int i59 = iArr12[2];
                i29 = i49 + i59;
                i30 = i54 - i57;
                i31 = i55 - i58;
                i32 = i56 - i59;
                i22++;
                i43++;
                iArr6 = iArr6;
            }
            i23 += width;
            i21++;
            bitmapCopy = bitmap2;
            height = i24;
            i14 = i40;
            iArr5 = iArr10;
        }
        Bitmap bitmap3 = bitmapCopy;
        int i60 = i14;
        int[] iArr13 = iArr5;
        int i61 = height;
        int[] iArr14 = iArr6;
        int i62 = 0;
        while (i62 < width) {
            int i63 = -i11;
            int i64 = i15;
            int[] iArr15 = iArr;
            int i65 = 0;
            int i66 = 0;
            int i67 = 0;
            int i68 = 0;
            int i69 = 0;
            int i70 = 0;
            int i71 = 0;
            int i72 = i63;
            int i73 = i63 * width;
            int i74 = 0;
            int i75 = 0;
            while (i72 <= i11) {
                int i76 = width;
                int iMax = Math.max(0, i73) + i62;
                int[] iArr16 = iArr7[i72 + i11];
                iArr16[0] = iArr2[iMax];
                iArr16[1] = iArr3[iMax];
                iArr16[2] = iArr4[iMax];
                int iAbs2 = i20 - Math.abs(i72);
                i74 += iArr2[iMax] * iAbs2;
                i75 += iArr3[iMax] * iAbs2;
                i65 += iArr4[iMax] * iAbs2;
                if (i72 > 0) {
                    i69 += iArr16[0];
                    i70 += iArr16[1];
                    i71 += iArr16[2];
                } else {
                    i66 += iArr16[0];
                    i67 += iArr16[1];
                    i68 += iArr16[2];
                }
                int i77 = i60;
                if (i72 < i77) {
                    i73 += i76;
                }
                i72++;
                i60 = i77;
                width = i76;
            }
            int i78 = width;
            int i79 = i60;
            int i80 = i11;
            int i81 = i62;
            int i82 = i65;
            int i83 = i61;
            int i84 = i75;
            int i85 = i74;
            int i86 = 0;
            while (i86 < i83) {
                iArr15[i81] = (iArr15[i81] & j1.f21601t) | (iArr14[i85] << 16) | (iArr14[i84] << 8) | iArr14[i82];
                int i87 = i85 - i66;
                int i88 = i84 - i67;
                int i89 = i82 - i68;
                int[] iArr17 = iArr7[((i80 - i11) + i64) % i64];
                int i90 = i66 - iArr17[0];
                int i91 = i67 - iArr17[1];
                int i92 = i68 - iArr17[2];
                if (i62 == 0) {
                    iArr13[i86] = Math.min(i86 + i20, i79) * i78;
                }
                int i93 = iArr13[i86] + i62;
                int i94 = iArr2[i93];
                iArr17[0] = i94;
                int i95 = iArr3[i93];
                iArr17[1] = i95;
                int i96 = iArr4[i93];
                iArr17[2] = i96;
                int i97 = i69 + i94;
                int i98 = i70 + i95;
                int i99 = i71 + i96;
                i85 = i87 + i97;
                i84 = i88 + i98;
                i82 = i89 + i99;
                i80 = (i80 + 1) % i64;
                int[] iArr18 = iArr7[i80];
                int i100 = iArr18[0];
                i66 = i90 + i100;
                int i101 = iArr18[1];
                i67 = i91 + i101;
                int i102 = iArr18[2];
                i68 = i92 + i102;
                i69 = i97 - i100;
                i70 = i98 - i101;
                i71 = i99 - i102;
                i81 += i78;
                i86++;
                i11 = i10;
            }
            i62++;
            i11 = i10;
            i60 = i79;
            i61 = i83;
            i15 = i64;
            iArr = iArr15;
            width = i78;
        }
        int i103 = width;
        bitmap3.setPixels(iArr, 0, i103, 0, 0, i103, i61);
        return bitmap3;
    }

    public static Bitmap c(Bitmap bitmap, ToygerFaceAttr toygerFaceAttr) {
        if (bitmap == null) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Rect rectConvertFaceRegion = FaceBlobManager.convertFaceRegion(toygerFaceAttr.faceRegion, width, height, 0, false);
        ToygerLog.d(g.f93525b, "bitmapWidth=" + width + ", bitmapHeight=" + height + ", attr.faceRegion=" + toygerFaceAttr.faceRegion + ", rect=" + rectConvertFaceRegion);
        int i10 = rectConvertFaceRegion.left;
        int i11 = rectConvertFaceRegion.top;
        int i12 = rectConvertFaceRegion.right;
        int i13 = rectConvertFaceRegion.bottom;
        int i14 = (i12 - i10) / 2;
        int iMax = Math.max(0, i10 - i14);
        int i15 = (i13 - i11) / 2;
        int iMax2 = Math.max(0, i11 - i15);
        int iMin = Math.min(width, i12 + i14);
        int iMin2 = Math.min(height, i13 + i15);
        int i16 = iMin - iMax;
        int i17 = iMin2 - iMax2;
        ToygerLog.d(g.f93525b, "left=" + iMax + ", top=" + iMax2 + ", right=" + iMin + ", bottom=" + iMin2 + ", width=" + i16 + ", height=" + i17);
        if (i16 > i17) {
            i16 = i17;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, iMax, iMax2, i16, i16);
        Bitmap bitmapA = a(bitmapCreateBitmap, 1, 6.0f);
        bitmapCreateBitmap.recycle();
        return bitmapA;
    }
}
