package com.tencent.open.utils;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Environment;
import android.os.Handler;
import android.os.Message;
import com.tencent.open.log.SLog;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.URL;

/* JADX INFO: compiled from: ProGuard */
/* JADX INFO: loaded from: classes4.dex */
public class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static String f101159c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f101160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private d f101161b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f101162d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Handler f101163e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private WeakReference<Activity> f101164f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Runnable f101165g = new Runnable() { // from class: com.tencent.open.utils.c.2
        @Override // java.lang.Runnable
        public void run() throws Throwable {
            boolean zA;
            SLog.v("AsynLoadImg", "saveFileRunnable:");
            String str = "share_qq_" + m.g(c.this.f101160a) + ".jpg";
            String str2 = c.f101159c + str;
            File file = new File(str2);
            Message messageObtainMessage = c.this.f101163e.obtainMessage();
            if (file.exists()) {
                messageObtainMessage.arg1 = 0;
                messageObtainMessage.obj = str2;
                SLog.v("AsynLoadImg", "file exists: time:" + (System.currentTimeMillis() - c.this.f101162d));
            } else {
                Bitmap bitmapA = c.a(c.this.f101160a);
                if (bitmapA != null) {
                    zA = c.this.a(bitmapA, str);
                } else {
                    SLog.v("AsynLoadImg", "saveFileRunnable:get bmp fail---");
                    zA = false;
                }
                if (zA) {
                    messageObtainMessage.arg1 = 0;
                    messageObtainMessage.obj = str2;
                } else {
                    messageObtainMessage.arg1 = 1;
                }
                SLog.v("AsynLoadImg", "file not exists: download time:" + (System.currentTimeMillis() - c.this.f101162d));
            }
            c.this.f101163e.sendMessage(messageObtainMessage);
        }
    };

    public c(Activity activity) {
        this.f101164f = new WeakReference<>(activity);
        this.f101163e = new Handler(activity.getMainLooper()) { // from class: com.tencent.open.utils.c.1
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                SLog.v("AsynLoadImg", "handleMessage:" + message.arg1);
                if (message.arg1 == 0) {
                    c.this.f101161b.a(message.arg1, (String) message.obj);
                } else {
                    c.this.f101161b.a(message.arg1, (String) null);
                }
            }
        };
    }

    public static Bitmap a(String str) {
        SLog.v("AsynLoadImg", "getbitmap:" + str);
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setDoInput(true);
            httpURLConnection.connect();
            InputStream inputStream = httpURLConnection.getInputStream();
            Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStream);
            inputStream.close();
            SLog.v("AsynLoadImg", "image download finished." + str);
            return bitmapDecodeStream;
        } catch (IOException e10) {
            e10.printStackTrace();
            SLog.v("AsynLoadImg", "getbitmap bmp fail---");
            return null;
        } catch (OutOfMemoryError e11) {
            e11.printStackTrace();
            SLog.v("AsynLoadImg", "getbitmap bmp fail---");
            return null;
        }
    }

    public void a(String str, d dVar) {
        SLog.v("AsynLoadImg", "--save---");
        if (str == null || str.equals("")) {
            dVar.a(1, (String) null);
            return;
        }
        if (!m.a()) {
            dVar.a(2, (String) null);
            return;
        }
        if (this.f101164f.get() != null) {
            Activity activity = this.f101164f.get();
            File fileH = m.h(activity, "Images");
            File externalStorageDirectory = Environment.getExternalStorageDirectory();
            if (fileH == null) {
                SLog.e("AsynLoadImg", "externalImageFile is null");
                dVar.a(2, (String) null);
                return;
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(k.d(activity) ? fileH.getAbsolutePath() : externalStorageDirectory.getAbsolutePath());
                sb2.append("/tmp/");
                f101159c = sb2.toString();
            }
        }
        this.f101162d = System.currentTimeMillis();
        this.f101160a = str;
        this.f101161b = dVar;
        new Thread(this.f101165g).start();
    }

    public boolean a(Bitmap bitmap, String str) throws Throwable {
        String str2 = f101159c;
        BufferedOutputStream bufferedOutputStream = null;
        try {
            try {
                File file = new File(str2);
                if (!file.exists()) {
                    file.mkdir();
                }
                SLog.v("AsynLoadImg", "saveFile:" + str);
                BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(new FileOutputStream(new File(str2 + str)));
                try {
                    bitmap.compress(Bitmap.CompressFormat.JPEG, 80, bufferedOutputStream2);
                    bufferedOutputStream2.flush();
                    try {
                        bufferedOutputStream2.close();
                        return true;
                    } catch (IOException e10) {
                        e10.printStackTrace();
                        return true;
                    }
                } catch (IOException e11) {
                    e = e11;
                    bufferedOutputStream = bufferedOutputStream2;
                    e.printStackTrace();
                    SLog.e("AsynLoadImg", "saveFile bmp fail---", e);
                    if (bufferedOutputStream != null) {
                        try {
                            bufferedOutputStream.close();
                        } catch (IOException e12) {
                            e12.printStackTrace();
                        }
                    }
                    return false;
                } catch (Throwable th2) {
                    th = th2;
                    bufferedOutputStream = bufferedOutputStream2;
                    if (bufferedOutputStream != null) {
                        try {
                            bufferedOutputStream.close();
                        } catch (IOException e13) {
                            e13.printStackTrace();
                        }
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (IOException e14) {
            e = e14;
        }
    }
}
