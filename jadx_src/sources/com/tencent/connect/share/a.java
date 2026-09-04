package com.tencent.connect.share;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import bb.c;
import com.tencent.connect.common.Constants;
import com.tencent.open.log.SLog;
import com.tencent.open.utils.d;
import com.tencent.open.utils.g;
import com.tencent.open.utils.m;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: compiled from: ProGuard */
/* JADX INFO: loaded from: classes4.dex */
public class a {
    public static final int a(BitmapFactory.Options options, int i10, int i11) {
        int iB = b(options, i10, i11);
        if (iB > 8) {
            return 8 * ((iB + 7) / 8);
        }
        int i12 = 1;
        while (i12 < iB) {
            i12 <<= 1;
        }
        return i12;
    }

    private static Bitmap a(Bitmap bitmap, int i10) {
        Matrix matrix = new Matrix();
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width <= height) {
            width = height;
        }
        float f10 = i10 / width;
        matrix.postScale(f10, f10);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    public static final Bitmap a(String str, int i10) {
        Bitmap bitmapDecodeFile;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        try {
            BitmapFactory.decodeFile(str, options);
        } catch (OutOfMemoryError e10) {
            SLog.e("openSDK_LOG.AsynScaleCompressImage", "scaleBitmap exception1:", e10);
        }
        int i11 = options.outWidth;
        int i12 = options.outHeight;
        if (options.mCancel || i11 == -1 || i12 == -1) {
            return null;
        }
        if (i11 <= i12) {
            i11 = i12;
        }
        options.inPreferredConfig = Bitmap.Config.RGB_565;
        if (i11 > i10) {
            options.inSampleSize = a(options, -1, i10 * i10);
        }
        options.inJustDecodeBounds = false;
        try {
            bitmapDecodeFile = BitmapFactory.decodeFile(str, options);
        } catch (Exception e11) {
            SLog.e("openSDK_LOG.AsynScaleCompressImage", "scaleBitmap exception2:", e11);
            bitmapDecodeFile = null;
        } catch (OutOfMemoryError e12) {
            SLog.e("openSDK_LOG.AsynScaleCompressImage", "scaleBitmap OutOfMemoryError:", e12);
            bitmapDecodeFile = null;
        }
        if (bitmapDecodeFile == null) {
            SLog.e("openSDK_LOG.AsynScaleCompressImage", "scaleBitmap return null");
            return null;
        }
        int i13 = options.outWidth;
        int i14 = options.outHeight;
        if (i13 <= i14) {
            i13 = i14;
        }
        return i13 > i10 ? a(bitmapDecodeFile, i10) : bitmapDecodeFile;
    }

    protected static final String a(Bitmap bitmap, String str, String str2) {
        File file = new File(str);
        if (!file.exists()) {
            file.mkdirs();
        }
        StringBuffer stringBuffer = new StringBuffer(str);
        stringBuffer.append(str2);
        String string = stringBuffer.toString();
        File file2 = new File(string);
        if (file2.exists()) {
            file2.delete();
        }
        if (bitmap == null) {
            return null;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            bitmap.compress(Bitmap.CompressFormat.JPEG, 80, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
            bitmap.recycle();
            return string;
        } catch (FileNotFoundException e10) {
            e10.printStackTrace();
            return null;
        } catch (IOException e11) {
            e11.printStackTrace();
            return null;
        }
    }

    public static final void a(final Context context, final String str, final d dVar) {
        SLog.i("openSDK_LOG.AsynScaleCompressImage", "scaleCompressImage()");
        if (TextUtils.isEmpty(str)) {
            dVar.a(1, (String) null);
        } else if (!m.a()) {
            dVar.a(2, (String) null);
        } else {
            final Handler handler = new Handler(context.getMainLooper()) { // from class: com.tencent.connect.share.a.1
                @Override // android.os.Handler
                public void handleMessage(Message message) {
                    int i10 = message.what;
                    if (i10 == 101) {
                        dVar.a(0, (ArrayList<String>) message.obj);
                    } else if (i10 != 102) {
                        super.handleMessage(message);
                    } else {
                        dVar.a(message.arg1, (String) null);
                    }
                }
            };
            new Thread(new Runnable() { // from class: com.tencent.connect.share.a.2
                @Override // java.lang.Runnable
                public void run() {
                    String str2;
                    String string;
                    try {
                        Bitmap bitmapA = a.a(str, c.b.f30703id);
                        if (bitmapA != null) {
                            File fileA = g.a("Images");
                            String str3 = null;
                            if (fileA != null) {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(fileA.getAbsolutePath());
                                String str4 = File.separator;
                                sb2.append(str4);
                                sb2.append(Constants.QQ_SHARE_TEMP_DIR);
                                sb2.append(str4);
                                string = sb2.toString();
                                str2 = null;
                            } else {
                                File fileD = g.d();
                                if (fileD == null) {
                                    SLog.i("openSDK_LOG.AsynScaleCompressImage", "scaleCompressImage() getCacheDir = null,return error");
                                    Message messageObtainMessage = handler.obtainMessage();
                                    messageObtainMessage.arg1 = 102;
                                    handler.sendMessage(messageObtainMessage);
                                    return;
                                }
                                String absolutePath = fileD.getAbsolutePath();
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append(absolutePath);
                                String str5 = File.separator;
                                sb3.append(str5);
                                sb3.append(Constants.QQ_SHARE_TEMP_DIR);
                                sb3.append(str5);
                                String string2 = sb3.toString();
                                SLog.i("openSDK_LOG.AsynScaleCompressImage", "scaleCompressImage() use cache dir=" + string2);
                                str2 = absolutePath;
                                string = string2;
                            }
                            String str6 = "share2qq_temp" + m.g(str) + ".jpg";
                            String str7 = str;
                            if (a.b(str7, c.b.f30703id, c.b.f30703id)) {
                                SLog.i("openSDK_LOG.AsynScaleCompressImage", "scaleCompressImage() out of bound,compress!");
                                String strA = a.a(bitmapA, string, str6);
                                if (!TextUtils.isEmpty(strA)) {
                                    str7 = strA;
                                }
                            } else {
                                SLog.i("openSDK_LOG.AsynScaleCompressImage", "scaleCompressImage() not out of bound,not compress!");
                            }
                            boolean zM = m.m(str7);
                            SLog.i("openSDK_LOG.AsynScaleCompressImage", "scaleCompressImage() check file isAppSpecificDir=" + zM);
                            ArrayList arrayList = new ArrayList(2);
                            if (zM) {
                                str3 = str7;
                            } else if (TextUtils.isEmpty(str2)) {
                                String str8 = string + str6;
                                boolean zA = m.a(context, str7, str8);
                                SLog.i("openSDK_LOG.AsynScaleCompressImage", "scaleCompressImage() sd permission not denied. copy to app sepcific:" + str8 + ",isSuccess=" + zA);
                                if (zA) {
                                    str3 = str8;
                                }
                            }
                            arrayList.add(str7);
                            arrayList.add(str3);
                            if (arrayList.size() >= 2 && (arrayList.get(0) != null || arrayList.get(1) != null)) {
                                SLog.i("openSDK_LOG.AsynScaleCompressImage", "scaleCompressImage() return success ! destFilePath=[" + ((String) arrayList.get(0)) + com.xiaomi.mipush.sdk.Constants.ACCEPT_TIME_SEPARATOR_SP + ((String) arrayList.get(1)) + "]");
                                Message messageObtainMessage2 = handler.obtainMessage(101);
                                messageObtainMessage2.obj = arrayList;
                                handler.sendMessage(messageObtainMessage2);
                                return;
                            }
                        }
                    } catch (Exception e10) {
                        SLog.e("openSDK_LOG.AsynScaleCompressImage", "scaleCompressImage runnable exception e:", e10);
                    }
                    SLog.d("openSDK_LOG.AsynScaleCompressImage", "scaleCompressImage() return failed!");
                    Message messageObtainMessage3 = handler.obtainMessage(102);
                    messageObtainMessage3.arg1 = 3;
                    handler.sendMessage(messageObtainMessage3);
                }
            }).start();
        }
    }

    private static int b(BitmapFactory.Options options, int i10, int i11) {
        int iMin;
        double d10 = options.outWidth;
        double d11 = options.outHeight;
        int iCeil = i11 == -1 ? 1 : (int) Math.ceil(Math.sqrt((d10 * d11) / ((double) i11)));
        if (i10 == -1) {
            iMin = 128;
        } else {
            double d12 = i10;
            iMin = (int) Math.min(Math.floor(d10 / d12), Math.floor(d11 / d12));
        }
        if (iMin < iCeil) {
            return iCeil;
        }
        if (i11 == -1 && i10 == -1) {
            return 1;
        }
        return i10 == -1 ? iCeil : iMin;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b(String str, int i10, int i11) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        try {
            BitmapFactory.decodeFile(str, options);
        } catch (OutOfMemoryError e10) {
            SLog.e("openSDK_LOG.AsynScaleCompressImage", "isBitMapNeedToCompress exception:", e10);
        }
        int i12 = options.outWidth;
        int i13 = options.outHeight;
        if (options.mCancel || i12 == -1 || i13 == -1) {
            return false;
        }
        int i14 = i12 > i13 ? i12 : i13;
        if (i12 >= i13) {
            i12 = i13;
        }
        SLog.d("openSDK_LOG.AsynScaleCompressImage", "longSide=" + i14 + "shortSide=" + i12);
        options.inPreferredConfig = Bitmap.Config.RGB_565;
        return i14 > i11 || i12 > i10;
    }
}
