package com.alipay.zoloz.toyger.blob;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.YuvImage;
import androidx.core.view.j1;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes6.dex */
public class BitmapHelper {
    public static final int FRAME_MODE_BGR = 2;
    public static final int FRAME_MODE_BGRA = 1;
    public static final int FRAME_MODE_GRAY_16 = 5;
    public static final int FRAME_MODE_GRAY_8 = 6;
    public static final int FRAME_MODE_NV21 = 0;
    public static final int FRAME_MODE_RGB = 4;
    public static final int FRAME_MODE_RGBA = 3;

    public static byte[] Bitmap2BytesEx(Bitmap bitmap) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int[] iArr = new int[width * height];
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        return addBMP_RGB_888(iArr, width, height);
    }

    public static Bitmap RGBABytes2Bitmap(byte[] bArr, int i10, int i11) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.copyPixelsFromBuffer(ByteBuffer.wrap(bArr));
        return bitmapCreateBitmap;
    }

    public static Bitmap RGBBytes2Bitmap(byte[] bArr, int i10, int i11) {
        int[] iArrConvertBytesToInts = convertBytesToInts(bArr);
        if (iArrConvertBytesToInts == null) {
            return null;
        }
        return Bitmap.createBitmap(iArrConvertBytesToInts, 0, i10, i10, i11, Bitmap.Config.ARGB_8888);
    }

    private static byte[] addBMP_RGB_888(int[] iArr, int i10, int i11) {
        byte[] bArr = new byte[i11 * i10 * 4];
        int length = iArr.length - 1;
        int i12 = 0;
        while (length >= i10) {
            int i13 = length - i10;
            for (int i14 = i13 + 1; i14 <= length; i14++) {
                int i15 = iArr[i14];
                bArr[i12] = (byte) (i15 >> 0);
                bArr[i12 + 1] = (byte) (i15 >> 8);
                bArr[i12 + 2] = (byte) (i15 >> 16);
                bArr[i12 + 3] = (byte) (i15 >> 24);
                i12 += 4;
            }
            length = i13;
        }
        return bArr;
    }

    public static byte[] bitmap2Bytes(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (bitmap != null) {
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        }
        return byteArrayOutputStream.toByteArray();
    }

    public static byte[] bitmapToByteArray(Bitmap bitmap, float f10) {
        int i10;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            if (f10 > 1.0f || f10 <= 0.0f) {
                if (f10 <= 0.0f) {
                    i10 = 70;
                }
                bitmap.compress(Bitmap.CompressFormat.JPEG, i10, byteArrayOutputStream);
                byteArrayOutputStream.flush();
                byteArrayOutputStream.close();
                return byteArrayOutputStream.toByteArray();
            }
            f10 *= 100.0f;
            byteArrayOutputStream.flush();
            byteArrayOutputStream.close();
        } catch (IOException e10) {
            e10.printStackTrace();
        }
        i10 = (int) f10;
        bitmap.compress(Bitmap.CompressFormat.JPEG, i10, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public static Bitmap bytes2Bitmap(byte[] bArr) {
        if (bArr.length != 0) {
            return BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
        }
        return null;
    }

    public static Bitmap bytes2Bitmap(byte[] bArr, int i10, int i11, int i12) {
        if (i12 == 0) {
            return getYUVBitmap(bArr, i10, i11);
        }
        if (i12 == 3) {
            return RGBABytes2Bitmap(bArr, i10, i11);
        }
        if (i12 != 4) {
            return null;
        }
        return RGBBytes2Bitmap(bArr, i10, i11);
    }

    public static byte[] compressRGBAImage(byte[] bArr, int i10, int i11, int i12, int i13) {
        byte[] bArrBitmapToByteArray;
        Bitmap bitmapRGBABytes2Bitmap = RGBABytes2Bitmap(bArr, i10, i11);
        if (i12 == 90 || i12 == 270) {
            Matrix matrix = new Matrix();
            matrix.setRotate(i12);
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapRGBABytes2Bitmap, 0, 0, bitmapRGBABytes2Bitmap.getWidth(), bitmapRGBABytes2Bitmap.getHeight(), matrix, true);
            byte[] bArrBitmapToByteArray2 = bitmapToByteArray(bitmapCreateBitmap, i13);
            bitmapCreateBitmap.recycle();
            bArrBitmapToByteArray = bArrBitmapToByteArray2;
        } else {
            bArrBitmapToByteArray = bitmapToByteArray(bitmapRGBABytes2Bitmap, i13);
        }
        bitmapRGBABytes2Bitmap.recycle();
        return bArrBitmapToByteArray;
    }

    public static byte[] compressRGBImage(byte[] bArr, int i10, int i11, int i12, int i13) {
        byte[] bArrBitmapToByteArray;
        Bitmap bitmapRGBBytes2Bitmap = RGBBytes2Bitmap(bArr, i10, i11);
        if (i12 == 90 || i12 == 270) {
            Matrix matrix = new Matrix();
            matrix.setRotate(i12);
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapRGBBytes2Bitmap, 0, 0, bitmapRGBBytes2Bitmap.getWidth(), bitmapRGBBytes2Bitmap.getHeight(), matrix, true);
            byte[] bArrBitmapToByteArray2 = bitmapToByteArray(bitmapCreateBitmap, i13);
            bitmapCreateBitmap.recycle();
            bArrBitmapToByteArray = bArrBitmapToByteArray2;
        } else {
            bArrBitmapToByteArray = bitmapToByteArray(bitmapRGBBytes2Bitmap, i13);
        }
        bitmapRGBBytes2Bitmap.recycle();
        return bArrBitmapToByteArray;
    }

    public static int convertByteToInt(byte b10) {
        return (((b10 >> 4) & 15) * 16) + (b10 & 15);
    }

    public static int[] convertBytesToInts(byte[] bArr) {
        int i10;
        int length = bArr.length;
        if (length == 0) {
            return null;
        }
        int i11 = 0;
        int i12 = length % 3 != 0 ? 1 : 0;
        int i13 = (length / 3) + i12;
        int[] iArr = new int[i13];
        if (i12 == 0) {
            while (i11 < i13) {
                int i14 = i11 * 3;
                iArr[i11] = convertByteToInt(bArr[i14 + 2]) | (convertByteToInt(bArr[i14]) << 16) | (convertByteToInt(bArr[i14 + 1]) << 8) | j1.f21601t;
                i11++;
            }
        } else {
            while (true) {
                i10 = i13 - 1;
                if (i11 >= i10) {
                    break;
                }
                int i15 = i11 * 3;
                iArr[i11] = convertByteToInt(bArr[i15 + 2]) | (convertByteToInt(bArr[i15]) << 16) | (convertByteToInt(bArr[i15 + 1]) << 8) | j1.f21601t;
                i11++;
            }
            iArr[i10] = -16777216;
        }
        return iArr;
    }

    public static Bitmap cropBitmap(Bitmap bitmap, Rect rect) {
        bitmap.getWidth();
        bitmap.getHeight();
        int i10 = rect.left;
        int i11 = rect.top;
        return Bitmap.createBitmap(bitmap, i10, i11, rect.right - i10, rect.bottom - i11);
    }

    public static Bitmap flipBitmap(Bitmap bitmap, int i10) {
        if (bitmap == null) {
            return null;
        }
        float[] fArr = i10 != 0 ? new float[]{1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 1.0f} : new float[]{-1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f};
        Matrix matrix = new Matrix();
        matrix.setValues(fArr);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        bitmap.recycle();
        return bitmapCreateBitmap;
    }

    public static Bitmap getBitmap(byte[] bArr, int i10, int i11) {
        if (bArr == 0) {
            return null;
        }
        int length = bArr.length / 3;
        int[] iArr = new int[length];
        for (int i12 = 0; i12 < length; i12++) {
            int i13 = i12 * 3;
            int i14 = bArr[i13];
            int i15 = bArr[i13 + 1];
            int i16 = bArr[i13 + 2];
            if (i14 < 0) {
                i14 += 256;
            }
            if (i15 < 0) {
                i15 += 256;
            }
            if (i16 < 0) {
                i16 += 256;
            }
            iArr[i12] = Color.rgb(i14, i15, i16);
        }
        return Bitmap.createBitmap(iArr, i10, i11, Bitmap.Config.ARGB_8888);
    }

    public static Bitmap getYUVBitmap(byte[] bArr, int i10, int i11) {
        YuvImage yuvImage = new YuvImage(bArr, 17, i10, i11, null);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        yuvImage.compressToJpeg(new Rect(0, 0, i10, i11), 100, byteArrayOutputStream);
        try {
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            return BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
        } catch (OutOfMemoryError | Error unused) {
            return null;
        }
    }

    public static Bitmap getYUVBitmap(byte[] bArr, int i10, int i11, int i12) {
        YuvImage yuvImage = new YuvImage(bArr, 17, i10, i11, null);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        yuvImage.compressToJpeg(new Rect(0, 0, i10, i11), i12, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        try {
            return BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
        } catch (OutOfMemoryError unused) {
            return null;
        }
    }

    public static byte[] processImage(byte[] bArr, int i10, int i11, int i12, int i13, int i14) {
        if (i10 == 0) {
            return rotateYUVImage(bArr, i11, i12, i13, i14);
        }
        if (i10 == 3) {
            return compressRGBAImage(bArr, i11, i12, i13, i14);
        }
        if (i10 != 4) {
            return null;
        }
        return compressRGBImage(bArr, i11, i12, i13, i14);
    }

    public static Bitmap readBitMap(Context context, int i10) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPreferredConfig = Bitmap.Config.RGB_565;
        options.inPurgeable = true;
        options.inInputShareable = true;
        return BitmapFactory.decodeStream(context.getResources().openRawResource(i10), null, options);
    }

    public static void recycle(Bitmap bitmap) {
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        bitmap.recycle();
    }

    public static Bitmap resize(Bitmap bitmap, int i10) {
        if (bitmap == null) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        float f10 = i10 / width;
        Matrix matrix = new Matrix();
        matrix.postScale(f10, f10);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
        bitmap.recycle();
        return bitmapCreateBitmap;
    }

    public static Bitmap resize(Bitmap bitmap, int i10, int i11) {
        if (bitmap == null) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Matrix matrix = new Matrix();
        matrix.postScale(i10 / width, i11 / height);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
        bitmap.recycle();
        return bitmapCreateBitmap;
    }

    public static Bitmap rotateBitmap(Bitmap bitmap, int i10) {
        if (bitmap == null) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Matrix matrix = new Matrix();
        matrix.setRotate(i10);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, false);
        if (bitmapCreateBitmap.equals(bitmap)) {
            return bitmapCreateBitmap;
        }
        bitmap.recycle();
        return bitmapCreateBitmap;
    }

    private static byte[] rotateYUV420Degree180(byte[] bArr, int i10, int i11) {
        int i12 = i10 * i11;
        int i13 = (i12 * 3) / 2;
        byte[] bArr2 = new byte[i13];
        int i14 = 0;
        for (int i15 = i12 - 1; i15 >= 0; i15--) {
            bArr2[i14] = bArr[i15];
            i14++;
        }
        for (int i16 = i13 - 1; i16 >= i12; i16 -= 2) {
            int i17 = i14 + 1;
            bArr2[i14] = bArr[i16 - 1];
            i14 = i17 + 1;
            bArr2[i17] = bArr[i16];
        }
        return bArr2;
    }

    public static byte[] rotateYUV420Degree270(byte[] bArr, int i10, int i11) {
        return rotateYUV420Degree180(rotateYUV420Degree90(bArr, i10, i11), i10, i11);
    }

    private static byte[] rotateYUV420Degree90(byte[] bArr, int i10, int i11) {
        int i12 = i10 * i11;
        int i13 = (i12 * 3) / 2;
        byte[] bArr2 = new byte[i13];
        int i14 = 0;
        for (int i15 = 0; i15 < i10; i15++) {
            for (int i16 = i11 - 1; i16 >= 0; i16--) {
                bArr2[i14] = bArr[(i16 * i10) + i15];
                i14++;
            }
        }
        int i17 = i13 - 1;
        for (int i18 = i10 - 1; i18 > 0; i18 -= 2) {
            for (int i19 = 0; i19 < i11 / 2; i19++) {
                int i20 = (i19 * i10) + i12;
                bArr2[i17] = bArr[i20 + i18];
                int i21 = i17 - 1;
                bArr2[i21] = bArr[i20 + (i18 - 1)];
                i17 = i21 - 1;
            }
        }
        return bArr2;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001e  */
    public static byte[] rotateYUVImage(byte[] bArr, int i10, int i11, int i12, int i13) {
        byte[] bArr2;
        byte[] bArrRotateYUV420Degree90;
        ByteArrayOutputStream byteArrayOutputStream;
        try {
            if (i12 != 90) {
                if (i12 == 270) {
                    bArrRotateYUV420Degree90 = rotateYUV420Degree90(bArr, i10, i11);
                } else {
                    bArr2 = bArr;
                }
                byteArrayOutputStream = new ByteArrayOutputStream();
                if (bArr2 != null) {
                    new YuvImage(bArr2, 17, i10, i11, null).compressToJpeg(new Rect(0, 0, i10, i11), i13, byteArrayOutputStream);
                }
                byteArrayOutputStream.close();
                return byteArrayOutputStream.toByteArray();
            }
            bArrRotateYUV420Degree90 = rotateYUV420Degree270(bArr, i10, i11);
            byteArrayOutputStream.close();
        } catch (IOException unused) {
        }
        bArr2 = bArrRotateYUV420Degree90;
        i11 = i10;
        i10 = i11;
        byteArrayOutputStream = new ByteArrayOutputStream();
        if (bArr2 != null) {
            new YuvImage(bArr2, 17, i10, i11, null).compressToJpeg(new Rect(0, 0, i10, i11), i13, byteArrayOutputStream);
        }
        return byteArrayOutputStream.toByteArray();
    }

    public static Bitmap zoomBitmap(Bitmap bitmap, int i10, int i11) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Matrix matrix = new Matrix();
        matrix.postScale(i10 / width, i11 / height);
        return Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
    }
}
