package com.tencent.ugc.videobase.utils;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import bb.c;
import com.meituan.robust.Constants;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.ugc.videobase.frame.GLTexture;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes4.dex */
public class DebugUtils {
    private static final String TAG = "DebugUtils";

    public static void closeQuietly(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static String dump(float[] fArr) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('[');
        for (float f10 : fArr) {
            sb2.append(f10);
            sb2.append(", ");
        }
        sb2.append(']');
        return sb2.toString();
    }

    public static String getStack(boolean z10) {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        if (stackTrace == null || stackTrace.length < 4) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 1; i10 < stackTrace.length; i10++) {
            sb2.append(Constants.ARRAY_TYPE);
            sb2.append(stackTrace[i10].getClassName());
            sb2.append(":");
            sb2.append(stackTrace[i10].getMethodName());
            if (z10) {
                sb2.append("(");
                sb2.append(stackTrace[i10].getLineNumber());
                sb2.append(")]\n");
            } else {
                sb2.append("]\n");
            }
        }
        return sb2.toString();
    }

    public static String getStackAsComment() {
        String[] strArrSplit = getStack(true).split("\n");
        StringBuilder sb2 = new StringBuilder();
        for (String str : strArrSplit) {
            sb2.append("// ");
            sb2.append(str);
            sb2.append("\n");
        }
        return sb2.toString();
    }

    public static boolean saveBmpToFile(Bitmap bitmap, File file, Bitmap.CompressFormat compressFormat) {
        if (bitmap == null || file == null) {
            LiteavLog.e(TAG, "bmp or file is null");
            return false;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(compressFormat, 100, byteArrayOutputStream);
        return writeToFile(byteArrayOutputStream.toByteArray(), file);
    }

    public static void saveImage(File file, int i10, int i11, int i12) {
        int iGenerateFrameBufferId = OpenGlUtils.generateFrameBufferId();
        OpenGlUtils.attachTextureToFrameBuffer(i10, iGenerateFrameBufferId);
        OpenGlUtils.bindFramebuffer(36160, iGenerateFrameBufferId);
        ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(i11 * i12 * 4).order(ByteOrder.nativeOrder());
        GLES20.glReadPixels(0, 0, i11, i12, c.f.OB, c.f.Zc, byteBufferOrder);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i11, i12, Bitmap.Config.ARGB_8888);
        byteBufferOrder.position(0);
        bitmapCreateBitmap.copyPixelsFromBuffer(byteBufferOrder);
        saveBmpToFile(bitmapCreateBitmap, file, Bitmap.CompressFormat.PNG);
        OpenGlUtils.bindFramebuffer(36160, 0);
        OpenGlUtils.detachTextureFromFrameBuffer(iGenerateFrameBufferId);
        OpenGlUtils.deleteFrameBuffer(iGenerateFrameBufferId);
    }

    public static void saveImage(File file, GLTexture gLTexture, int i10, int i11) {
        OpenGlUtils.generateFrameBufferId();
        saveImage(file, gLTexture.getId(), i10, i11);
    }

    public static boolean writeToFile(byte[] bArr, File file) throws Throwable {
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
            try {
                fileOutputStream2.write(bArr);
                fileOutputStream2.flush();
                closeQuietly(fileOutputStream2);
                return true;
            } catch (IOException unused) {
                fileOutputStream = fileOutputStream2;
                closeQuietly(fileOutputStream);
                return false;
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = fileOutputStream2;
                closeQuietly(fileOutputStream);
                throw th;
            }
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
