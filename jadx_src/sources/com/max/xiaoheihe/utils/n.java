package com.max.xiaoheihe.utils;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Vector;

/* JADX INFO: compiled from: ImageCompressor.java */
/* JADX INFO: loaded from: classes13.dex */
public class n {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static Vector<Integer> a(String str, File file) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, file}, null, changeQuickRedirect, true, 48739, new Class[]{String.class, File.class}, Vector.class);
        if (patchProxyResultProxy.isSupported) {
            return (Vector) patchProxyResultProxy.result;
        }
        try {
            return b(str, file, 800.0f, 800.0f, 0);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:22:0x00ae  */
    public static Vector<Integer> b(String str, File file, float f10, float f11, int i10) throws Throwable {
        int i11;
        Object[] objArr = {str, file, new Float(f10), new Float(f11), new Integer(i10)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 48742, new Class[]{String.class, File.class, cls, cls, Integer.TYPE}, Vector.class);
        if (patchProxyResultProxy.isSupported) {
            return (Vector) patchProxyResultProxy.result;
        }
        if (str == null || file == null) {
            return null;
        }
        File file2 = new File(str);
        if (file2.length() <= 20480) {
            i(file2, file);
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str, options);
            options.inJustDecodeBounds = false;
            int i12 = options.outWidth;
            int i13 = options.outHeight;
            Vector<Integer> vector = new Vector<>();
            vector.add(Integer.valueOf(i12));
            vector.add(Integer.valueOf(i13));
            return vector;
        }
        BitmapFactory.Options options2 = new BitmapFactory.Options();
        options2.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options2);
        options2.inJustDecodeBounds = false;
        int i14 = options2.outWidth;
        int i15 = options2.outHeight;
        if (i14 >= i15) {
            float f12 = i14;
            if (f12 > f10) {
                i11 = (int) (f12 / f10);
            } else if (i15 > i14 || i15 <= f11) {
                i11 = 1;
            } else {
                i11 = (int) (i15 / f11);
            }
        } else if (i15 > i14) {
            i11 = 1;
        } else {
            i11 = 1;
        }
        options2.inSampleSize = i11 > 0 ? i11 : 1;
        Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(str, options2);
        Vector<Integer> vector2 = new Vector<>();
        vector2.add(Integer.valueOf(bitmapDecodeFile.getWidth()));
        vector2.add(Integer.valueOf(bitmapDecodeFile.getHeight()));
        if (i10 != 0) {
            Matrix matrix = new Matrix();
            matrix.setRotate(i10);
            bitmapDecodeFile = Bitmap.createBitmap(bitmapDecodeFile, 0, 0, bitmapDecodeFile.getWidth(), bitmapDecodeFile.getHeight(), matrix, true);
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmapDecodeFile.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        for (int i16 = 60; i16 > 40 && byteArrayOutputStream.toByteArray().length / 1024 > 100; i16 -= 10) {
            byteArrayOutputStream.reset();
            bitmapDecodeFile.compress(Bitmap.CompressFormat.JPEG, i16, byteArrayOutputStream);
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            fileOutputStream.write(byteArrayOutputStream.toByteArray());
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (Exception unused) {
        }
        return vector2;
    }

    public static Vector<Integer> c(String str, File file, int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, file, new Integer(i10)}, null, changeQuickRedirect, true, 48740, new Class[]{String.class, File.class, Integer.TYPE}, Vector.class);
        if (patchProxyResultProxy.isSupported) {
            return (Vector) patchProxyResultProxy.result;
        }
        try {
            return b(str, file, 800.0f, 800.0f, i10);
        } catch (Exception unused) {
            return null;
        }
    }

    public static Bitmap d(Bitmap bitmap, File file) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bitmap, file}, null, changeQuickRedirect, true, 48746, new Class[]{Bitmap.class, File.class}, Bitmap.class);
        if (patchProxyResultProxy.isSupported) {
            return (Bitmap) patchProxyResultProxy.result;
        }
        if (bitmap == null) {
            return bitmap;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        for (int i10 = 80; i10 > 40 && byteArrayOutputStream.toByteArray().length / 1024 > 100; i10 -= 10) {
            byteArrayOutputStream.reset();
            bitmap.compress(Bitmap.CompressFormat.JPEG, i10, byteArrayOutputStream);
        }
        if (file != null) {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                fileOutputStream.write(byteArrayOutputStream.toByteArray());
                fileOutputStream.flush();
                fileOutputStream.close();
            } catch (Exception unused) {
            }
        }
        try {
            return BitmapFactory.decodeStream(new ByteArrayInputStream(byteArrayOutputStream.toByteArray()), null, null);
        } catch (Exception unused2) {
            return null;
        }
    }

    public static byte[] e(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 48743, new Class[]{String.class}, byte[].class);
        if (patchProxyResultProxy.isSupported) {
            return (byte[]) patchProxyResultProxy.result;
        }
        if (str == null) {
            return null;
        }
        long j10 = "1".equals(com.max.hbcache.c.o("compress_image", "1")) ? 307200L : 5242880L;
        boolean zEquals = "image/webp".equals(com.max.hbcommon.utils.f.f(new File(str)));
        File file = new File(str);
        if (file.length() > j10 || zEquals) {
            Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(str);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmapDecodeFile.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
            for (int i10 = 80; i10 > 10 && byteArrayOutputStream.toByteArray().length > j10; i10 -= 10) {
                byteArrayOutputStream.reset();
                bitmapDecodeFile.compress(Bitmap.CompressFormat.JPEG, i10, byteArrayOutputStream);
            }
            bitmapDecodeFile.recycle();
            return byteArrayOutputStream.toByteArray();
        }
        int length = (int) file.length();
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            byte[] bArr = new byte[length];
            while (true) {
                int i11 = fileInputStream.read(bArr);
                if (i11 == -1) {
                    fileInputStream.close();
                    byteArrayOutputStream2.close();
                    return byteArrayOutputStream2.toByteArray();
                }
                byteArrayOutputStream2.write(bArr, 0, i11);
            }
        } catch (FileNotFoundException e10) {
            e10.printStackTrace();
            return null;
        } catch (IOException e11) {
            e11.printStackTrace();
            return null;
        }
    }

    public static Bitmap f(String str, float f10, float f11) {
        Object[] objArr = {str, new Float(f10), new Float(f11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 48747, new Class[]{String.class, cls, cls}, Bitmap.class);
        if (patchProxyResultProxy.isSupported) {
            return (Bitmap) patchProxyResultProxy.result;
        }
        try {
            return g(str, f10, f11, 0, null);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x006b  */
    /* JADX WARN: Code duplicated, block: B:18:0x0076  */
    public static Bitmap g(String str, float f10, float f11, int i10, File file) {
        int i11;
        Object[] objArr = {str, new Float(f10), new Float(f11), new Integer(i10), file};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 48748, new Class[]{String.class, cls, cls, Integer.TYPE, File.class}, Bitmap.class);
        if (patchProxyResultProxy.isSupported) {
            return (Bitmap) patchProxyResultProxy.result;
        }
        if (str == null) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        options.inJustDecodeBounds = false;
        int i12 = options.outWidth;
        int i13 = options.outHeight;
        if (i12 >= i13) {
            float f12 = i12;
            if (f12 > f10) {
                i11 = (int) (f12 / f10);
            } else if (i13 > i12 || i13 <= f11) {
                i11 = 1;
            } else {
                i11 = (int) (i13 / f11);
            }
        } else if (i13 > i12) {
            i11 = 1;
        } else {
            i11 = 1;
        }
        options.inSampleSize = i11 > 0 ? i11 : 1;
        Bitmap bitmapD = d(BitmapFactory.decodeFile(str, options), file);
        if (bitmapD == null) {
            return null;
        }
        if (i10 == 0) {
            return bitmapD;
        }
        Matrix matrix = new Matrix();
        matrix.setRotate(i10);
        return Bitmap.createBitmap(bitmapD, 0, 0, bitmapD.getWidth(), bitmapD.getHeight(), matrix, true);
    }

    public static void h(Bitmap bitmap, File file) {
        if (PatchProxy.proxy(new Object[]{bitmap, file}, null, changeQuickRedirect, true, 48745, new Class[]{Bitmap.class, File.class}, Void.TYPE).isSupported) {
            return;
        }
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(file);
        } catch (FileNotFoundException e10) {
            e10.printStackTrace();
        }
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
        try {
            fileOutputStream.flush();
        } catch (IOException e11) {
            e11.printStackTrace();
        }
        try {
            fileOutputStream.close();
        } catch (IOException e12) {
            e12.printStackTrace();
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0076 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x0078 A[Catch: Exception -> 0x007b, TRY_LEAVE, TryCatch #3 {Exception -> 0x007b, blocks: (B:39:0x0073, B:41:0x0078), top: B:49:0x0073 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x0073 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static void i(File file, File file2) throws Throwable {
        BufferedOutputStream bufferedOutputStream;
        if (PatchProxy.proxy(new Object[]{file, file2}, null, changeQuickRedirect, true, 48741, new Class[]{File.class, File.class}, Void.TYPE).isSupported) {
            return;
        }
        BufferedInputStream bufferedInputStream = null;
        try {
            try {
                BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new FileInputStream(file));
                try {
                    bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file2));
                    try {
                        byte[] bArr = new byte[bb.c.f.Yc];
                        while (true) {
                            int i10 = bufferedInputStream2.read(bArr);
                            if (i10 == -1) {
                                break;
                            } else {
                                bufferedOutputStream.write(bArr, 0, i10);
                            }
                        }
                        bufferedOutputStream.flush();
                        bufferedInputStream2.close();
                    } catch (Exception e10) {
                        e = e10;
                        bufferedInputStream = bufferedInputStream2;
                        try {
                            e.printStackTrace();
                            if (bufferedInputStream != null) {
                                bufferedInputStream.close();
                            }
                            if (bufferedOutputStream == null) {
                                return;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            if (bufferedInputStream != null) {
                                try {
                                    bufferedInputStream.close();
                                    if (bufferedOutputStream != null) {
                                        bufferedOutputStream.close();
                                    }
                                } catch (Exception unused) {
                                    throw th;
                                }
                            } else if (bufferedOutputStream != null) {
                                bufferedOutputStream.close();
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        bufferedInputStream = bufferedInputStream2;
                        if (bufferedInputStream != null) {
                            bufferedInputStream.close();
                            if (bufferedOutputStream != null) {
                                bufferedOutputStream.close();
                            }
                        } else if (bufferedOutputStream != null) {
                            bufferedOutputStream.close();
                        }
                        throw th;
                    }
                } catch (Exception e11) {
                    e = e11;
                    bufferedOutputStream = null;
                } catch (Throwable th4) {
                    th = th4;
                    bufferedOutputStream = null;
                }
            } catch (Exception unused2) {
                return;
            }
        } catch (Exception e12) {
            e = e12;
            bufferedOutputStream = null;
        } catch (Throwable th5) {
            th = th5;
            bufferedOutputStream = null;
        }
        bufferedOutputStream.close();
    }

    @androidx.annotation.p0
    public static byte[] j(String str) {
        Bitmap bitmapDecodeFile;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 48744, new Class[]{String.class}, byte[].class);
        if (patchProxyResultProxy.isSupported) {
            return (byte[]) patchProxyResultProxy.result;
        }
        if (str == null || (bitmapDecodeFile = BitmapFactory.decodeFile(str)) == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmapDecodeFile.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        bitmapDecodeFile.recycle();
        return byteArrayOutputStream.toByteArray();
    }
}
