package com.tencent.thumbplayer.tcmedia.c.a;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.tencent.thumbplayer.tcmedia.api.resourceloader.ITPAssetResourceLoaderListener;
import com.tencent.thumbplayer.tcmedia.api.resourceloader.TPAssetResourceLoadingContentInformationRequest;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.utils.TPDLFileSystem;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.utils.TPDLIOUtil;
import com.tencent.thumbplayer.tcmedia.utils.TPLogUtil;
import com.tencent.thumbplayer.tcmedia.utils.o;
import com.xiaomi.mipush.sdk.Constants;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/* JADX INFO: loaded from: classes4.dex */
public class b implements com.tencent.thumbplayer.tcmedia.c.a.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f102458a = "TPAssetResourceLoader";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f102459b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ITPAssetResourceLoaderListener f102460c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f102461d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f102462e = "";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f102463f = "";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f102464g = "";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f102465h = ".mp4";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f102466i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private ArrayList<d> f102467j = new ArrayList<>();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private TPAssetResourceLoadingContentInformationRequest f102468k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private HandlerThread f102469l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private HandlerThread f102470m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private a f102471n;

    public class a extends Handler {
        a(Looper looper) {
            super(looper);
        }

        private void a(long j10, long j11, String str, int i10, int i11) {
            d dVar = new d(j10, j11, i11, a(j10, j11));
            dVar.a(b.this.f102470m.getLooper());
            dVar.a(b.this.b(i10, str));
            dVar.a(b.this.f102468k);
            if (b.this.f102460c.shouldWaitForLoadingOfRequestedResource(dVar)) {
                b.this.a(dVar);
                TPLogUtil.i(b.f102458a, "add to mLoadingRequests, requestId: ".concat(String.valueOf(i11)));
            }
        }

        private boolean a(long j10, long j11) {
            boolean z10 = b.this.f102461d > 0 && j11 + j10 >= b.this.f102461d;
            if (z10) {
                b.this.f();
            }
            return z10;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            TPLogUtil.d(b.f102458a, "mCallbackForResourceLoaderHandler msg : " + message.what);
            if (b.this.f102460c == null) {
                return;
            }
            int i10 = message.what;
            if (i10 != 256) {
                if (i10 != 257) {
                    return;
                }
                TPLogUtil.i(b.f102458a, "stop read data");
                b.this.b(message.arg1);
                return;
            }
            TPLogUtil.i(b.f102458a, "start read data");
            C1015b c1015b = (C1015b) message.obj;
            long j10 = c1015b.f102473a;
            long j11 = c1015b.f102474b;
            String str = c1015b.f102475c;
            int i11 = message.arg1;
            int i12 = message.arg2;
            TPLogUtil.i(b.f102458a, "start read data, requestStart: " + j10 + " requestEnd:" + j11 + " requestId:" + i12);
            long jA = b.this.a(j10, j11);
            if (jA <= 0) {
                TPLogUtil.e(b.f102458a, "requestLength invalid, check requestStart and requestEnd");
            } else {
                a(j10, jA, str, i11, i12);
            }
        }
    }

    /* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.c.a.b$b, reason: collision with other inner class name */
    public static class C1015b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        long f102473a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        long f102474b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        String f102475c;

        private C1015b() {
        }
    }

    public b(Context context, Looper looper) {
        this.f102459b = context;
        if (looper == null) {
            HandlerThread handlerThreadB = o.a().b();
            this.f102469l = handlerThreadB;
            looper = handlerThreadB.getLooper();
        }
        this.f102471n = new a(looper);
        this.f102470m = o.a().a("TPAssetResourceLoader-dataWriteThread");
    }

    private synchronized int a(long j10) {
        if (this.f102467j == null) {
            return 0;
        }
        int iMax = 0;
        for (int i10 = 0; i10 < this.f102467j.size(); i10++) {
            iMax = Math.max(iMax, this.f102467j.get(i10).a(j10));
        }
        return iMax;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long a(long j10, long j11) {
        if (j11 > 0) {
            return j11 - j10;
        }
        long j12 = this.f102461d;
        if (j12 <= 0) {
            return 536870912L;
        }
        return j12 - j10;
    }

    private synchronized d a(int i10) {
        if (this.f102467j == null) {
            return null;
        }
        for (int i11 = 0; i11 < this.f102467j.size(); i11++) {
            d dVar = this.f102467j.get(i11);
            if (dVar.getLoadingDataRequest().a() == i10) {
                return dVar;
            }
        }
        return null;
    }

    private String a(Context context, int i10) {
        if (TextUtils.isEmpty(this.f102464g)) {
            File externalCacheFile = TPDLFileSystem.getExternalCacheFile(context, "resourceLoader", new SimpleDateFormat("yyyy-MM-dd").format(new Date()) + Constants.ACCEPT_TIME_SEPARATOR_SERVER + i10 + this.f102465h);
            TPDLIOUtil.createFile(externalCacheFile);
            this.f102464g = externalCacheFile.getAbsolutePath();
        }
        return this.f102464g;
    }

    private void a(int i10, int i11, int i12, Object obj) {
        a aVar = this.f102471n;
        if (aVar != null) {
            Message messageObtainMessage = aVar.obtainMessage();
            messageObtainMessage.what = i10;
            messageObtainMessage.arg1 = i11;
            messageObtainMessage.arg2 = i12;
            messageObtainMessage.obj = obj;
            this.f102471n.sendMessage(messageObtainMessage);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(d dVar) {
        ArrayList<d> arrayList = this.f102467j;
        if (arrayList != null) {
            arrayList.add(dVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i10) {
        d dVarA = a(i10);
        if (dVarA != null) {
            dVarA.b();
            TPLogUtil.i(f102458a, "handleStopReadData, cancel the loading request with id ".concat(String.valueOf(i10)));
            b(dVarA);
            this.f102460c.didCancelLoadingRequest(dVarA);
            return;
        }
        TPLogUtil.e(f102458a, "TPAssetLoader can't find the request " + i10 + " with current loading requests");
    }

    private synchronized void b(d dVar) {
        ArrayList<d> arrayList = this.f102467j;
        if (arrayList != null) {
            arrayList.remove(dVar);
        }
    }

    private String e() {
        return this.f102463f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void f() {
        ArrayList<d> arrayList = this.f102467j;
        if (arrayList != null) {
            for (d dVar : arrayList) {
                dVar.b();
                this.f102460c.didCancelLoadingRequest(dVar);
            }
            this.f102467j.clear();
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.c.a.a
    public int a(int i10, String str, int i11) {
        if (this.f102460c == null) {
            TPLogUtil.e(f102458a, "listener not set");
            return 0;
        }
        a(257, i11, 0, (Object) null);
        return 0;
    }

    @Override // com.tencent.thumbplayer.tcmedia.c.a.a
    public int a(int i10, String str, long j10, long j11) {
        if (this.f102460c == null) {
            TPLogUtil.e(f102458a, "listener not set");
            return 0;
        }
        TPLogUtil.i(f102458a, "onStartReadData, fileId:" + i10 + ", fileKey:" + str + ", requestStart:" + j10 + ", requestEnd:" + j11);
        int i11 = this.f102466i + 1;
        C1015b c1015b = new C1015b();
        c1015b.f102473a = j10;
        c1015b.f102474b = j11;
        c1015b.f102475c = str;
        a(256, i10, i11, c1015b);
        this.f102466i = i11;
        return i11;
    }

    @Override // com.tencent.thumbplayer.tcmedia.c.a.a
    public long a(int i10, String str) {
        return this.f102461d;
    }

    @Override // com.tencent.thumbplayer.tcmedia.c.a.a
    public void a() {
        if (this.f102460c == null) {
            TPLogUtil.e(f102458a, "listener not set");
            return;
        }
        TPAssetResourceLoadingContentInformationRequest tPAssetResourceLoadingContentInformationRequest = new TPAssetResourceLoadingContentInformationRequest();
        this.f102468k = tPAssetResourceLoadingContentInformationRequest;
        this.f102460c.fillInContentInformation(tPAssetResourceLoadingContentInformationRequest);
        TPAssetResourceLoadingContentInformationRequest tPAssetResourceLoadingContentInformationRequest2 = this.f102468k;
        this.f102462e = tPAssetResourceLoadingContentInformationRequest2.contentType;
        this.f102461d = tPAssetResourceLoadingContentInformationRequest2.dataTotalSize;
        this.f102463f = tPAssetResourceLoadingContentInformationRequest2.dataFilePath;
        TPLogUtil.i(f102458a, "proxy start, mDataTotalSize: " + this.f102461d + " businessPath:" + this.f102463f);
    }

    @Override // com.tencent.thumbplayer.tcmedia.c.a.a
    public void a(ITPAssetResourceLoaderListener iTPAssetResourceLoaderListener) {
        this.f102460c = iTPAssetResourceLoaderListener;
    }

    @Override // com.tencent.thumbplayer.tcmedia.c.a.a
    public int b(int i10, String str, long j10, long j11) {
        TPLogUtil.d(f102458a, "read data, offset:" + j10 + ", length:" + j11);
        int iMin = (int) Math.min((long) a(j10), j11);
        if (iMin <= 0) {
            return -1;
        }
        TPLogUtil.d(f102458a, "on read data, fileId: " + i10 + " readOffset: " + j10 + " readLength:" + j11 + " readyLength:" + iMin);
        return iMin;
    }

    @Override // com.tencent.thumbplayer.tcmedia.c.a.a
    public String b(int i10, String str) {
        String strE = e();
        return !TextUtils.isEmpty(strE) ? strE : a(this.f102459b, i10);
    }

    @Override // com.tencent.thumbplayer.tcmedia.c.a.a
    public void b() {
        TPLogUtil.i(f102458a, "reset start");
        f();
        this.f102461d = 0L;
        this.f102462e = "";
        this.f102463f = "";
        if (!TextUtils.isEmpty(this.f102464g)) {
            try {
                new File(this.f102464g).deleteOnExit();
                this.f102464g = "";
            } catch (Exception e10) {
                TPLogUtil.e(f102458a, "reset, delete cache file has exception:" + e10.toString());
            }
        }
        a aVar = this.f102471n;
        if (aVar != null) {
            aVar.removeCallbacksAndMessages(null);
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.c.a.a
    public String c(int i10, String str) {
        return this.f102462e;
    }

    @Override // com.tencent.thumbplayer.tcmedia.c.a.a
    public void c() {
        TPLogUtil.i(f102458a, "release start");
        b();
        o.a().a(this.f102469l, this.f102471n);
        o.a().a(this.f102470m, (Handler) null);
        this.f102469l = null;
        this.f102470m = null;
        this.f102471n = null;
        this.f102467j = null;
    }
}
