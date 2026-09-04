package com.umeng.message.proguard;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.umeng.commonsdk.debug.UMLog;
import com.umeng.message.entity.UInAppMessage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

/* JADX INFO: loaded from: classes4.dex */
public class af extends AsyncTask<String, Void, Bitmap[]> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f105683b = af.class.getName();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f105684a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f105685c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private BitmapFactory.Options f105686d;

    public interface a {
        void a(Bitmap[] bitmapArr);
    }

    public af(Context context, UInAppMessage uInAppMessage) {
        this.f105685c = f.a(context, uInAppMessage.msg_id);
        try {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
            int i10 = displayMetrics.widthPixels;
            int i11 = displayMetrics.heightPixels;
            BitmapFactory.Options options = new BitmapFactory.Options();
            this.f105686d = options;
            options.inSampleSize = a(uInAppMessage, i10, i11);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private static int a(UInAppMessage uInAppMessage, int i10, int i11) {
        int i12 = uInAppMessage.height;
        int i13 = uInAppMessage.width;
        int i14 = 1;
        if (i12 > i11 || i13 > i10) {
            int i15 = i12 / 2;
            int i16 = i13 / 2;
            while (i15 / i14 >= i11 && i16 / i14 >= i10) {
                i14 *= 2;
            }
        }
        return i14;
    }

    private Bitmap a(String str) {
        Bitmap bitmapDecodeFile = null;
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str.hashCode());
            bitmapDecodeFile = BitmapFactory.decodeFile(this.f105685c + sb2.toString());
            UMLog.mutlInfo(f105683b, 2, "load from local");
            return bitmapDecodeFile;
        } catch (Exception e10) {
            e10.printStackTrace();
            return bitmapDecodeFile;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Bitmap[] doInBackground(String... strArr) {
        Bitmap bitmapDecodeStream;
        boolean zCompress;
        Bitmap[] bitmapArr = new Bitmap[strArr.length];
        for (int i10 = 0; i10 < strArr.length; i10++) {
            try {
                String str = strArr[i10];
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str.hashCode());
                if (new File(this.f105685c, sb2.toString()).exists()) {
                    bitmapArr[i10] = a(strArr[i10]);
                } else {
                    Bitmap bitmapA = a(strArr[i10]);
                    bitmapArr[i10] = bitmapA;
                    if (bitmapA == null) {
                        String str2 = strArr[i10];
                        String str3 = f105683b;
                        UMLog.mutlInfo(str3, 2, "Downloading image start");
                        URLConnection uRLConnectionOpenConnection = new URL(str2).openConnection();
                        uRLConnectionOpenConnection.connect();
                        InputStream inputStream = uRLConnectionOpenConnection.getInputStream();
                        if (this.f105686d == null) {
                            bitmapDecodeStream = BitmapFactory.decodeStream(inputStream);
                        } else {
                            UMLog.mutlInfo(str3, 2, "decode options");
                            bitmapDecodeStream = BitmapFactory.decodeStream(inputStream, null, this.f105686d);
                        }
                        inputStream.close();
                        UMLog.mutlInfo(str3, 2, "Downloading image finish");
                        bitmapArr[i10] = bitmapDecodeStream;
                        String str4 = strArr[i10];
                        if (bitmapDecodeStream != null) {
                            try {
                                File file = new File(this.f105685c);
                                if (!file.exists()) {
                                    file.mkdirs();
                                }
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append(str4.hashCode());
                                FileOutputStream fileOutputStream = new FileOutputStream(new File(this.f105685c, sb3.toString()));
                                zCompress = bitmapDecodeStream.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                                try {
                                    fileOutputStream.close();
                                } catch (Exception e10) {
                                    e = e10;
                                    e.printStackTrace();
                                }
                            } catch (Exception e11) {
                                e = e11;
                                zCompress = false;
                            }
                            UMLog.mutlInfo(f105683b, 2, "store bitmap".concat(String.valueOf(zCompress)));
                        }
                    }
                }
            } catch (IOException e12) {
                e12.printStackTrace();
            }
        }
        return bitmapArr;
    }

    @Override // android.os.AsyncTask
    protected /* synthetic */ void onPostExecute(Bitmap[] bitmapArr) {
        Bitmap[] bitmapArr2 = bitmapArr;
        super.onPostExecute(bitmapArr2);
        for (Bitmap bitmap : bitmapArr2) {
            if (bitmap == null) {
                return;
            }
        }
        a aVar = this.f105684a;
        if (aVar != null) {
            aVar.a(bitmapArr2);
        }
    }
}
