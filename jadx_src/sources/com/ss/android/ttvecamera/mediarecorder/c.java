package com.ss.android.ttvecamera.mediarecorder;

import android.media.MediaCodec;
import android.media.MediaMetadataRetriever;
import android.media.MediaRecorder;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Log;
import android.util.Size;
import android.util.SparseIntArray;
import android.view.Surface;
import androidx.annotation.w0;
import com.huawei.hms.framework.common.ExceptionCode;
import com.ss.android.ttvecamera.TEFrameSizei;
import com.ss.android.ttvecamera.p;
import com.ss.android.ttvecamera.q;
import java.io.File;
import java.io.IOException;
import java.util.List;

/* JADX INFO: compiled from: TEMediaRecorder.java */
/* JADX INFO: loaded from: classes9.dex */
@w0(api = 23)
public class c {
    public static final int A = 3;
    public static final int B = -604;
    public static final int C = -605;
    public static final int D = -606;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final String f97609p = "TEMediaRecorder";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final SparseIntArray f97610q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int f97611r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final int f97612s = 90;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int f97613t = 180;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final int f97614u = 270;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final int f97615v = 360;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final int f97616w = 30;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f97617x = 0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f97618y = 1;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f97619z = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f97621b;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private List<TEFrameSizei> f97625f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private TEFrameSizei f97626g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f97627h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private HandlerThread f97628i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Handler f97629j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private InterfaceC0930c f97634o;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f97622c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f97623d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Surface f97624e = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Size f97630k = new Size(1280, 720);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f97631l = 30;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f97632m = ExceptionCode.CRASH_EXCEPTION;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f97633n = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private MediaRecorder f97620a = new MediaRecorder();

    /* JADX INFO: compiled from: TEMediaRecorder.java */
    public class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.h();
            c.this.p();
        }
    }

    /* JADX INFO: compiled from: TEMediaRecorder.java */
    public class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.s();
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.mediarecorder.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: TEMediaRecorder.java */
    public interface InterfaceC0930c {
        void onError(int i10);
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f97610q = sparseIntArray;
        sparseIntArray.append(0, 90);
        sparseIntArray.append(1, 0);
        sparseIntArray.append(2, 270);
        sparseIntArray.append(3, 180);
    }

    public c() {
        q();
    }

    private void a() {
        TEFrameSizei tEFrameSizei;
        List<TEFrameSizei> list = this.f97625f;
        if (list == null || (tEFrameSizei = this.f97626g) == null) {
            return;
        }
        p.b(list, tEFrameSizei);
    }

    private void b() throws IOException {
        String str = this.f97621b;
        if (str == null || str.isEmpty()) {
            return;
        }
        File file = new File(this.f97621b);
        q.b(f97609p, "file length = " + file.length());
        if (file.exists() && file.length() == 0) {
            file.delete();
            this.f97621b = "";
            q.b(f97609p, "invalid video file deleted!");
        } else {
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            try {
                mediaMetadataRetriever.setDataSource(this.f97621b);
                Long.parseLong(mediaMetadataRetriever.extractMetadata(9));
            } catch (IllegalArgumentException unused) {
                d();
                q.e(f97609p, "cannot access the file");
            }
            mediaMetadataRetriever.release();
        }
    }

    private void f(int i10) {
        InterfaceC0930c interfaceC0930c = this.f97634o;
        if (interfaceC0930c != null) {
            interfaceC0930c.onError(i10);
        }
    }

    private void q() {
        HandlerThread handlerThread = new HandlerThread("MediaRecorderBackground");
        this.f97628i = handlerThread;
        handlerThread.start();
        this.f97629j = new Handler(this.f97628i.getLooper());
    }

    private void t() {
        HandlerThread handlerThread = this.f97628i;
        if (handlerThread != null) {
            handlerThread.quitSafely();
            try {
                this.f97628i.join();
                this.f97628i = null;
                this.f97629j = null;
            } catch (InterruptedException e10) {
                e10.printStackTrace();
            }
        }
    }

    public Surface c() {
        if (this.f97624e == null) {
            this.f97624e = MediaCodec.createPersistentInputSurface();
        }
        return this.f97624e;
    }

    public void d() {
        String str = this.f97621b;
        if (str == null || str.isEmpty()) {
            return;
        }
        File file = new File(this.f97621b);
        q.b(f97609p, "file length = " + file.length());
        if (file.exists()) {
            file.delete();
            this.f97621b = "";
            q.b(f97609p, "invalid video file deleted!");
        }
    }

    public int e(int i10, int i11) {
        q.b(f97609p, "getImageRotation: mSensorOrientation = " + i10);
        int i12 = 0;
        if (i11 <= 330 && i11 >= 30) {
            if (i11 > 60 && i11 < 120) {
                i12 = 90;
            } else if (i11 > 150 && i11 < 210) {
                i12 = 180;
            } else if (i11 > 240 && i11 < 300) {
                i12 = 270;
            }
        }
        int i13 = (i12 + i10) % 360;
        q.b(f97609p, "getImageRotation: imageRotation = " + i13);
        return i13;
    }

    @w0(api = 24)
    public boolean g() {
        boolean z10;
        try {
            this.f97620a.pause();
            Log.d(f97609p, "mMediaRecorder pause");
            z10 = true;
        } catch (IllegalStateException unused) {
            q.e(f97609p, "mMediaRecorder pause state error");
            f(C);
            z10 = false;
        } finally {
            q.b(f97609p, "pauseRecord end");
        }
        return z10;
    }

    public void h() {
    }

    public void i() throws IOException {
        q.b(f97609p, "[schedule] releaseMediaRecorder");
        if (this.f97620a != null) {
            q.r(f97609p, "Releasing media recorder.");
            try {
                this.f97620a.reset();
            } catch (IllegalStateException e10) {
                q.e(f97609p, "media recorder maybe has been released! msg=" + e10.getMessage());
                f(C);
            }
            b();
            this.f97620a.release();
            this.f97620a = null;
            t();
        }
    }

    @w0(api = 24)
    public boolean j() {
        boolean z10;
        q.b(f97609p, "[schedule] resume recording");
        try {
            this.f97620a.resume();
            z10 = true;
        } catch (IllegalStateException unused) {
            q.e(f97609p, "mMediaRecorder resume state error");
            f(C);
            z10 = false;
        } finally {
            q.b(f97609p, "resume end");
        }
        return z10;
    }

    public void k(InterfaceC0930c interfaceC0930c) {
        this.f97634o = interfaceC0930c;
    }

    public void l(String str) throws IOException {
        if (str == null || str.isEmpty()) {
            q.e(f97609p, "empty file name");
        }
        b();
        this.f97621b = str;
        Log.d(f97609p, "file path = " + this.f97621b);
    }

    public void m(TEFrameSizei tEFrameSizei) {
        this.f97626g = tEFrameSizei;
    }

    public void n(int i10, int i11, int i12, int i13) {
        this.f97630k = new Size(i10, i11);
        this.f97631l = i12;
        this.f97632m = i13;
    }

    public void o(List<TEFrameSizei> list) {
        this.f97625f = list;
    }

    public void p() {
        try {
            try {
                try {
                    this.f97620a.start();
                    q.b(f97609p, "Recording starts!");
                } catch (IllegalStateException unused) {
                    q.e(f97609p, "mMediaRecorder prepare not well!");
                    b();
                    f(C);
                }
            } catch (RuntimeException unused2) {
                q.e(f97609p, "start error: runtime");
                d();
                f(D);
            }
        } finally {
            q.b(f97609p, "start end");
        }
    }

    public void r(int i10) {
        this.f97633n = i10;
        if (this.f97623d != 0) {
            this.f97629j.post(new a());
            this.f97623d = 0;
        }
    }

    public void s() {
        try {
            try {
                this.f97620a.stop();
            } catch (IllegalStateException unused) {
                q.e(f97609p, "mMediaRecorder stop state error");
                f(C);
            } catch (RuntimeException e10) {
                q.e(f97609p, "going to clean up the invalid output file, exception message = " + e10.getMessage());
                d();
                f(D);
            }
        } finally {
            q.b(f97609p, "stopRecord end");
        }
    }

    public void u() {
        if (this.f97623d != 1) {
            this.f97629j.post(new b());
            this.f97623d = 1;
        }
    }
}
