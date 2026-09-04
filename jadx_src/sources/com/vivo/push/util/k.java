package com.vivo.push.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.vivo.push.model.InsideNotificationItem;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: ImageDownTask.java */
/* JADX INFO: loaded from: classes4.dex */
public final class k extends AsyncTask<String, Void, List<Bitmap>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f106679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private InsideNotificationItem f106680b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f106681c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f106682d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f106683e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.vivo.push.d.r.a f106684f;

    public k(Context context, InsideNotificationItem insideNotificationItem, long j10, boolean z10, com.vivo.push.d.r.a aVar) {
        this.f106679a = context;
        this.f106680b = insideNotificationItem;
        this.f106681c = j10;
        this.f106682d = z10;
        this.f106684f = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:49:0x008a A[EXC_TOP_SPLITTER, PHI: r5
  0x008a: PHI (r5v5 java.io.InputStream) = (r5v4 java.io.InputStream), (r5v6 java.io.InputStream) binds: [B:24:0x0088, B:29:0x0094] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public List<Bitmap> doInBackground(String... strArr) throws Throwable {
        InputStream inputStream;
        Bitmap bitmapDecodeStream;
        this.f106683e = this.f106680b.getNotifyDisplayStatus();
        InputStream inputStream2 = null;
        if (!this.f106682d) {
            p.d("ImageDownTask", "bitmap is not display by forbid net");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < 2; i10++) {
            String str = strArr[i10];
            p.d("ImageDownTask", "imgUrl=" + str + " i=" + i10);
            if (!TextUtils.isEmpty(str)) {
                try {
                    HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
                    httpURLConnection.setConnectTimeout(30000);
                    httpURLConnection.setDoInput(true);
                    httpURLConnection.setUseCaches(false);
                    httpURLConnection.connect();
                    int responseCode = httpURLConnection.getResponseCode();
                    p.c("ImageDownTask", "code=".concat(String.valueOf(responseCode)));
                    if (responseCode == 200) {
                        inputStream = httpURLConnection.getInputStream();
                        try {
                            try {
                                bitmapDecodeStream = BitmapFactory.decodeStream(inputStream);
                            } catch (Throwable th2) {
                                th = th2;
                                inputStream2 = inputStream;
                                if (inputStream2 != null) {
                                    try {
                                        inputStream2.close();
                                    } catch (Exception unused) {
                                    }
                                }
                                throw th;
                            }
                        } catch (MalformedURLException unused2) {
                            p.a("ImageDownTask", "MalformedURLException");
                            if (inputStream != null) {
                                try {
                                    inputStream.close();
                                } catch (Exception unused3) {
                                }
                            }
                            bitmapDecodeStream = null;
                        } catch (IOException unused4) {
                            p.a("ImageDownTask", "IOException");
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            bitmapDecodeStream = null;
                        }
                    } else {
                        inputStream = null;
                        bitmapDecodeStream = null;
                    }
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (Exception unused5) {
                        }
                    }
                } catch (MalformedURLException unused6) {
                    inputStream = null;
                } catch (IOException unused7) {
                    inputStream = null;
                } catch (Throwable th3) {
                    th = th3;
                }
                arrayList.add(bitmapDecodeStream);
            } else if (i10 == 0) {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ void onPostExecute(List<Bitmap> list) {
        List<Bitmap> list2 = list;
        super.onPostExecute(list2);
        p.c("ImageDownTask", "onPostExecute");
        com.vivo.push.m.c(new l(this, list2));
    }
}
