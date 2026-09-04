package com.tencent.rtmp.a;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import com.tencent.liteav.base.system.LiteavSystemInfo;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.rtmp.TXImageSprite;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends TXImageSprite {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BitmapFactory.Options f102039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HandlerThread f102040b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Handler f102041c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private List<c> f102042d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Map<String, BitmapRegionDecoder> f102043e;

    /* JADX INFO: renamed from: com.tencent.rtmp.a.a$a, reason: collision with other inner class name */
    public static final class RunnableC1008a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakReference<a> f102045a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f102046b;

        public RunnableC1008a(a aVar, String str) {
            this.f102045a = new WeakReference<>(aVar);
            this.f102046b = str;
        }

        private static float a(String str) {
            String str2;
            String[] strArrSplit = str.split(":");
            String str3 = null;
            if (strArrSplit.length == 3) {
                String str4 = strArrSplit[0];
                str3 = strArrSplit[1];
                str2 = strArrSplit[2];
            } else if (strArrSplit.length == 2) {
                str3 = strArrSplit[0];
                str2 = strArrSplit[1];
            } else {
                str2 = strArrSplit.length == 1 ? strArrSplit[0] : null;
            }
            float fFloatValue = str3 != null ? 0.0f + (Float.valueOf(str3).floatValue() * 60.0f) : 0.0f;
            return str2 != null ? fFloatValue + Float.valueOf(str2).floatValue() : fFloatValue;
        }

        /* JADX WARN: Code restructure failed: missing block: B:80:?, code lost:
        
            return;
         */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void run() throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 264
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.rtmp.a.a.RunnableC1008a.run():void");
        }
    }

    public static final class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakReference<a> f102047a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f102048b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f102049c;

        public b(a aVar, String str, String str2) {
            this.f102047a = new WeakReference<>(aVar);
            this.f102048b = str;
            this.f102049c = str2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            a aVar = this.f102047a.get();
            if (this.f102047a == null || aVar == null) {
                return;
            }
            InputStream inputStreamA = null;
            try {
                inputStreamA = a.a(this.f102049c);
                String lastPathSegment = Uri.parse(this.f102049c).getLastPathSegment();
                if (aVar.f102043e != null) {
                    aVar.f102043e.put(lastPathSegment, BitmapRegionDecoder.newInstance(inputStreamA, true));
                }
            } catch (IOException e10) {
                LiteavLog.e("TXImageSprite", "load bitmap from network failed.", e10);
            } finally {
                if (inputStreamA != null) {
                    try {
                        inputStreamA.close();
                    } catch (IOException unused) {
                    }
                }
            }
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f102050a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f102051b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f102052c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f102053d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f102054e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f102055f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f102056g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f102057h;

        private c() {
        }

        /* synthetic */ c(byte b10) {
            this();
        }
    }

    public a(Context context) {
        super(context);
        this.f102039a = new BitmapFactory.Options();
        ArrayList arrayList = new ArrayList();
        this.f102042d = arrayList;
        this.f102042d = Collections.synchronizedList(arrayList);
        HashMap map = new HashMap();
        this.f102043e = map;
        this.f102043e = Collections.synchronizedMap(map);
    }

    static /* synthetic */ InputStream a(String str) throws IOException {
        URLConnection uRLConnectionOpenConnection = new URL(str).openConnection();
        uRLConnectionOpenConnection.connect();
        uRLConnectionOpenConnection.getInputStream();
        uRLConnectionOpenConnection.setConnectTimeout(15000);
        uRLConnectionOpenConnection.setReadTimeout(15000);
        return uRLConnectionOpenConnection.getInputStream();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        if (this.f102041c != null) {
            LiteavLog.i("TXImageSprite", " remove all tasks!");
            this.f102041c.removeCallbacksAndMessages(null);
            this.f102041c.post(new Runnable() { // from class: com.tencent.rtmp.a.a.1
                @Override // java.lang.Runnable
                public final void run() {
                    if (a.this.f102042d != null) {
                        a.this.f102042d.clear();
                    }
                    if (a.this.f102043e != null) {
                        for (BitmapRegionDecoder bitmapRegionDecoder : a.this.f102043e.values()) {
                            if (bitmapRegionDecoder != null) {
                                bitmapRegionDecoder.recycle();
                            }
                        }
                        a.this.f102043e.clear();
                    }
                }
            });
        }
    }

    @Override // com.tencent.rtmp.TXImageSprite
    public final Bitmap getThumbnail(float f10) {
        c cVar;
        if (this.f102042d.size() == 0) {
            return null;
        }
        int i10 = 0;
        int size = this.f102042d.size() - 1;
        while (true) {
            int i11 = ((size - i10) / 2) + i10;
            if (this.f102042d.get(i11).f102050a <= f10 && this.f102042d.get(i11).f102051b > f10) {
                cVar = this.f102042d.get(i11);
                break;
            }
            if (i10 < size) {
                if (f10 < this.f102042d.get(i11).f102051b) {
                    if (f10 >= this.f102042d.get(i11).f102050a) {
                        cVar = null;
                        break;
                    }
                    size = i11 - 1;
                } else {
                    i10 = i11 + 1;
                }
            } else {
                cVar = this.f102042d.get(i10);
                break;
            }
        }
        if (cVar == null) {
            return null;
        }
        BitmapRegionDecoder bitmapRegionDecoder = this.f102043e.get(cVar.f102053d);
        if (bitmapRegionDecoder == null) {
            return null;
        }
        Rect rect = new Rect();
        int i12 = cVar.f102054e;
        rect.left = i12;
        int i13 = cVar.f102055f;
        rect.top = i13;
        rect.right = i12 + cVar.f102056g;
        rect.bottom = i13 + cVar.f102057h;
        return bitmapRegionDecoder.decodeRegion(rect, this.f102039a);
    }

    @Override // com.tencent.rtmp.TXImageSprite
    public final void release() {
        a();
        if (this.f102040b == null || this.f102041c == null) {
            return;
        }
        if (LiteavSystemInfo.getSystemOSVersionInt() >= 18) {
            this.f102040b.quitSafely();
        } else {
            this.f102040b.quit();
        }
        this.f102041c = null;
        this.f102040b = null;
    }

    @Override // com.tencent.rtmp.TXImageSprite
    public final void setVTTUrlAndImageUrls(String str, List<String> list) {
        if (TextUtils.isEmpty(str)) {
            LiteavLog.e("TXImageSprite", "setVTTUrlAndImageUrls: vttUrl can't be null!");
            return;
        }
        a();
        if (this.f102040b == null) {
            HandlerThread handlerThread = new HandlerThread("SuperVodThumbnailsWorkThread");
            this.f102040b = handlerThread;
            handlerThread.start();
            this.f102041c = new Handler(this.f102040b.getLooper());
        }
        this.f102041c.post(new RunnableC1008a(this, str));
        if (list == null || list.size() == 0) {
            return;
        }
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            this.f102041c.post(new b(this, str, it.next()));
        }
    }
}
