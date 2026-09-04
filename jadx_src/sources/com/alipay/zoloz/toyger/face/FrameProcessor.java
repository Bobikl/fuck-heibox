package com.alipay.zoloz.toyger.face;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.os.Environment;
import android.util.Log;
import com.alipay.zoloz.toyger.algorithm.TGDepthFrame;
import com.alipay.zoloz.toyger.algorithm.TGFrame;
import com.max.mediaselector.lib.config.f;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import lg.a;

/* JADX INFO: loaded from: classes6.dex */
public class FrameProcessor {
    public static final SimpleDateFormat DATE_FORMAT2 = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss-SSS", Locale.US);
    private static final boolean SAVE_BITMAP = false;
    private static final String TAG = "FrameProcessor";
    private TGDepthFrame mTgDepthFrame;
    private TGFrame mTgFrame;

    public static class LogFileNameFilter implements FilenameFilter {
        LogFileNameFilter() {
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return str.endsWith(".bin");
        }
    }

    public static void bitmap2File(Bitmap bitmap, File file) {
        if (file.exists()) {
            file.delete();
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            bitmap.compress(Bitmap.CompressFormat.PNG, 90, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (FileNotFoundException e10) {
            Log.w(TAG, e10);
        } catch (IOException e11) {
            Log.w(TAG, e11);
        }
    }

    @TargetApi(9)
    public static void clearOldBinFiles() {
        File file = new File(Environment.getExternalStorageDirectory(), "Download");
        if (file.exists()) {
            try {
                File[] fileArrListFiles = file.listFiles(new LogFileNameFilter());
                if (fileArrListFiles == null || fileArrListFiles.length <= 0) {
                    return;
                }
                long jCurrentTimeMillis = System.currentTimeMillis() - TimeUnit.DAYS.toMillis(3L);
                for (File file2 : fileArrListFiles) {
                    if (file2.lastModified() < jCurrentTimeMillis) {
                        Log.i(TAG, "Delete File : " + file2);
                        if (file2.delete()) {
                            file2.deleteOnExit();
                        } else {
                            continue;
                        }
                    }
                }
            } catch (Throwable th2) {
                Log.w(TAG, th2);
            }
        }
    }

    public static void close(OutputStream outputStream) {
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (IOException e10) {
                Log.e(TAG, e10.toString());
            }
        }
    }

    public static String getDetailDateFormat(long j10) {
        String str;
        SimpleDateFormat simpleDateFormat = DATE_FORMAT2;
        synchronized (simpleDateFormat) {
            str = simpleDateFormat.format(new Date(j10));
        }
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.io.FileOutputStream, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r3v9 */
    public static synchronized boolean save(File file, byte[] bArr) {
        boolean z10;
        ?? fileOutputStream;
        z10 = false;
        if (file != null && bArr != null) {
            if (file.exists()) {
                file.delete();
            } else {
                try {
                    file.createNewFile();
                } catch (IOException e10) {
                    fileOutputStream = TAG;
                    Log.w(TAG, e10);
                }
            }
            BufferedOutputStream bufferedOutputStream = null;
            try {
                try {
                    fileOutputStream = new FileOutputStream(file);
                    try {
                        BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(fileOutputStream);
                        try {
                            bufferedOutputStream2.write(bArr);
                            bufferedOutputStream2.flush();
                            z10 = true;
                            close(bufferedOutputStream2);
                            fileOutputStream = fileOutputStream;
                        } catch (IOException e11) {
                            e = e11;
                            bufferedOutputStream = bufferedOutputStream2;
                            Log.w(TAG, e);
                            close(bufferedOutputStream);
                            fileOutputStream = fileOutputStream;
                        } catch (Throwable th2) {
                            th = th2;
                            bufferedOutputStream = bufferedOutputStream2;
                            close(bufferedOutputStream);
                            close(fileOutputStream);
                            throw th;
                        }
                    } catch (IOException e12) {
                        e = e12;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (IOException e13) {
                e = e13;
                fileOutputStream = 0;
            } catch (Throwable th4) {
                th = th4;
                fileOutputStream = 0;
            }
            close(fileOutputStream);
        }
        return z10;
    }

    public static void saveBitmap(Bitmap bitmap, String str) {
        String str2 = getDetailDateFormat(System.currentTimeMillis()) + a.f131412e + str + f.f75141t;
        File file = new File(Environment.getExternalStorageDirectory(), "Download");
        if (!file.exists() && !file.mkdirs()) {
            Log.w(TAG, "Failed to mkdirs: " + file);
        }
        File file2 = new File(file, str2);
        bitmap2File(bitmap, file2);
        Log.d(TAG, "Save file : " + file2);
    }

    static void saveBitmap(TGFrame tGFrame, TGDepthFrame tGDepthFrame, ToygerFaceAttr toygerFaceAttr, boolean z10, String str) {
    }

    void clearFrame() {
        this.mTgFrame = null;
        this.mTgDepthFrame = null;
    }

    public TGDepthFrame getTgDepthFrame() {
        return this.mTgDepthFrame;
    }

    public TGFrame getTgFrame() {
        return this.mTgFrame;
    }

    void initFame(TGFrame tGFrame, TGDepthFrame tGDepthFrame) {
        this.mTgFrame = tGFrame;
        this.mTgDepthFrame = tGDepthFrame;
    }

    void saveBitmap(ToygerFaceAttr toygerFaceAttr, boolean z10, String str) {
        saveBitmap(this.mTgFrame, this.mTgDepthFrame, toygerFaceAttr, z10, str);
    }

    public void saveTgDepthFrame(String str) {
    }

    public void saveTgFrame(String str) {
        File file = new File(Environment.getExternalStorageDirectory(), "Download");
        if (!file.exists() && !file.mkdirs()) {
            Log.w(TAG, "Failed to mkdirs: " + file);
        }
        String str2 = getDetailDateFormat(System.currentTimeMillis()) + a.f131412e + str;
        byte[] bArr = this.mTgFrame.data;
        File file2 = new File(file, str2 + "_raw.bin");
        save(file2, bArr);
        Log.d(TAG, "Save file : " + file2 + ", tgFrame.width=" + this.mTgFrame.width + ", tgFrame.height=" + this.mTgFrame.height);
    }
}
