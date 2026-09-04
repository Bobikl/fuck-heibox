package com.tencent.thumbplayer.tcmedia.a;

import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.tencent.thumbplayer.tcmedia.core.common.TPGeneralError;
import com.tencent.thumbplayer.tcmedia.core.common.TPSystemInfo;
import com.tencent.thumbplayer.tcmedia.utils.TPLogUtil;
import com.tencent.thumbplayer.tcmedia.utils.o;
import java.io.FileDescriptor;
import java.io.IOException;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static b f102130a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HandlerThread f102131b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private c f102132c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private MediaMetadataRetriever f102133d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f102134e = 0;

    public interface a {
        void a(int i10, int i11);

        void a(int i10, long j10, int i11, int i12, Bitmap bitmap, long j11);
    }

    /* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.a.b$b, reason: collision with other inner class name */
    public static class C1009b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected a f102135a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f102136b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f102137c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private FileDescriptor f102138d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private AssetFileDescriptor f102139e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f102140f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f102141g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f102142h;

        private C1009b() {
        }
    }

    public class c extends Handler {
        public c(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) throws IOException {
            int i10 = message.what;
            if (i10 == 1) {
                TPLogUtil.i("TPSysPlayerImageCapture", "eventHandler EV_CAP_IMAGE");
                b.this.a((C1009b) message.obj);
            } else {
                if (i10 != 2) {
                    TPLogUtil.i("TPSysPlayerImageCapture", "eventHandler unknow msg");
                    return;
                }
                TPLogUtil.i("TPSysPlayerImageCapture", "eventHandler EV_STOP_CAP_IMAGE");
                if (b.this.f102133d != null) {
                    b.this.f102133d.release();
                    b.this.f102133d = null;
                }
            }
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f102144a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public FileDescriptor f102145b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public AssetFileDescriptor f102146c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f102147d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f102148e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f102149f;
    }

    private b() {
        this.f102131b = null;
        this.f102132c = null;
        try {
            this.f102131b = o.a().b();
            this.f102132c = new c(this.f102131b.getLooper());
        } catch (Throwable th2) {
            TPLogUtil.e("TPSysPlayerImageCapture", th2);
            this.f102132c = new c(Looper.getMainLooper());
        }
    }

    public static synchronized b a() {
        if (f102130a == null) {
            f102130a = new b();
        }
        return f102130a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(C1009b c1009b) throws IOException {
        MediaMetadataRetriever mediaMetadataRetriever;
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            MediaMetadataRetriever mediaMetadataRetriever2 = this.f102133d;
            if (mediaMetadataRetriever2 != null) {
                mediaMetadataRetriever2.release();
                this.f102133d = null;
            }
            this.f102133d = new MediaMetadataRetriever();
            if (c1009b.f102138d != null) {
                this.f102133d.setDataSource(c1009b.f102138d);
            } else if (c1009b.f102139e != null) {
                this.f102133d.setDataSource(c1009b.f102139e.getFileDescriptor(), c1009b.f102139e.getStartOffset(), c1009b.f102139e.getLength());
            } else {
                this.f102133d.setDataSource(c1009b.f102137c, new HashMap());
            }
            Bitmap frameAtTime = this.f102133d.getFrameAtTime(c1009b.f102140f * 1000, 2);
            long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
            if (frameAtTime != null) {
                c1009b.f102135a.a(c1009b.f102136b, c1009b.f102140f, c1009b.f102141g, c1009b.f102142h, frameAtTime, jCurrentTimeMillis2);
            } else {
                c1009b.f102135a.a(c1009b.f102136b, TPGeneralError.FAILED);
            }
            mediaMetadataRetriever = this.f102133d;
            if (mediaMetadataRetriever == null) {
                return;
            }
        } catch (Exception e10) {
            TPLogUtil.e("TPSysPlayerImageCapture", e10);
            TPLogUtil.e("TPSysPlayerImageCapture", "doRealCaptureImage, Exception: " + e10.toString());
            c1009b.f102135a.a(c1009b.f102136b, TPGeneralError.FAILED);
            mediaMetadataRetriever = this.f102133d;
            if (mediaMetadataRetriever == null) {
                return;
            }
        } finally {
            MediaMetadataRetriever mediaMetadataRetriever3 = this.f102133d;
            if (mediaMetadataRetriever3 != null) {
                mediaMetadataRetriever3.release();
                this.f102133d = null;
            }
        }
        mediaMetadataRetriever.release();
    }

    public int a(d dVar, a aVar) {
        TPLogUtil.i("TPSysPlayerImageCapture", "captureImageWithPosition, position: " + dVar.f102147d + ", width: " + dVar.f102148e + ", height: " + dVar.f102149f);
        this.f102134e = this.f102134e + 1;
        if (!TextUtils.isEmpty(TPSystemInfo.getDeviceName()) && TPSystemInfo.getDeviceName().equals("Lenovo+K900")) {
            TPLogUtil.i("TPSysPlayerImageCapture", "captureImageWithPosition, Lenovo+K900 no incompatible");
            return -1;
        }
        C1009b c1009b = new C1009b();
        c1009b.f102136b = this.f102134e;
        c1009b.f102138d = dVar.f102145b;
        c1009b.f102139e = dVar.f102146c;
        c1009b.f102137c = dVar.f102144a;
        c1009b.f102140f = dVar.f102147d;
        c1009b.f102141g = dVar.f102148e;
        c1009b.f102142h = dVar.f102149f;
        c1009b.f102135a = aVar;
        Message message = new Message();
        message.what = 1;
        message.obj = c1009b;
        if (!this.f102132c.sendMessage(message)) {
            TPLogUtil.i("TPSysPlayerImageCapture", "captureImageWithPosition, send msg failed ");
        }
        return this.f102134e;
    }
}
