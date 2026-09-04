package com.jd.jdcache.match;

import androidx.annotation.Keep;
import com.jd.jdcache.util.JDCacheLog;
import dl.d;
import dl.e;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: PreReadInputStream.kt */
/* JADX INFO: loaded from: classes6.dex */
@t0({"SMAP\nPreReadInputStream.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PreReadInputStream.kt\ncom/jd/jdcache/match/PreReadInputStream\n+ 2 JDCacheLog.kt\ncom/jd/jdcache/util/JDCacheLogKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,173:1\n9#2,4:174\n9#2,4:178\n9#2,4:183\n9#2,4:187\n9#2,4:191\n9#2,4:195\n9#2,4:199\n9#2,4:203\n9#2,4:207\n9#2,4:211\n1#3:182\n*S KotlinDebug\n*F\n+ 1 PreReadInputStream.kt\ncom/jd/jdcache/match/PreReadInputStream\n*L\n63#1:174,4\n72#1:178,4\n82#1:183,4\n91#1:187,4\n96#1:191,4\n108#1:195,4\n120#1:199,4\n125#1:203,4\n141#1:207,4\n165#1:211,4\n*E\n"})
@Keep
public final class PreReadInputStream extends InputStream {

    @d
    private static final a Companion = new a(null);

    @d
    @Deprecated
    public static final String TAG = "PreReadInputStream";

    @d
    private final AtomicBoolean closed;

    @d
    private final AtomicBoolean preReadStarted;

    @d
    private final AtomicBoolean preReadStopPoint;

    @e
    private ByteArrayOutputStream readData;

    @e
    private BufferedInputStream readStream;
    private boolean readStreamFinish;

    @e
    private BufferedInputStream unreadStream;
    private boolean unreadStreamFinish;

    /* JADX INFO: compiled from: PreReadInputStream.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }
    }

    public PreReadInputStream(@d BufferedInputStream unreadStream) {
        f0.p(unreadStream, "unreadStream");
        this.unreadStreamFinish = true;
        this.readStreamFinish = true;
        this.preReadStarted = new AtomicBoolean(false);
        this.preReadStopPoint = new AtomicBoolean(false);
        this.closed = new AtomicBoolean(false);
        this.unreadStream = unreadStream;
        this.unreadStreamFinish = false;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.closed.compareAndSet(false, true)) {
            this.preReadStopPoint.set(true);
            JDCacheLog jDCacheLog = JDCacheLog.INSTANCE;
            if (jDCacheLog.getCanLog()) {
                jDCacheLog.d(TAG, "close pre-read stream, readStreamFinish = " + this.readStreamFinish + ", unreadStreamFinish = " + this.unreadStreamFinish);
            }
            BufferedInputStream bufferedInputStream = this.readStream;
            if (bufferedInputStream != null) {
                try {
                    bufferedInputStream.close();
                    this.readStream = null;
                } catch (Throwable th2) {
                    th = th2;
                    this.readStream = null;
                }
            }
            th = null;
            BufferedInputStream bufferedInputStream2 = this.unreadStream;
            if (bufferedInputStream2 != null) {
                try {
                    bufferedInputStream2.close();
                } catch (Throwable th3) {
                    th = th3;
                }
                this.unreadStream = null;
            }
            this.readData = null;
            if (th != null) {
                JDCacheLog jDCacheLog2 = JDCacheLog.INSTANCE;
                if (jDCacheLog2.getCanLog()) {
                    jDCacheLog2.e(TAG, th);
                }
                if (!(th instanceof IOException)) {
                    throw new IOException(th);
                }
                throw th;
            }
        }
    }

    public final void finishPreRead() {
        if (this.preReadStopPoint.compareAndSet(false, true)) {
            JDCacheLog jDCacheLog = JDCacheLog.INSTANCE;
            if (jDCacheLog.getCanLog()) {
                jDCacheLog.d(TAG, "Pre-read stream finished.");
            }
            synchronized (this) {
                ByteArrayOutputStream byteArrayOutputStream = this.readData;
                if (byteArrayOutputStream != null) {
                    this.readStream = new BufferedInputStream(new ByteArrayInputStream(byteArrayOutputStream.toByteArray()));
                    this.readStreamFinish = false;
                    if (jDCacheLog.getCanLog()) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Pre-read data size=");
                        ByteArrayOutputStream byteArrayOutputStream2 = this.readData;
                        sb2.append(byteArrayOutputStream2 != null ? Integer.valueOf(byteArrayOutputStream2.size()) : null);
                        sb2.append(", unreadStreamFinish = ");
                        sb2.append(this.unreadStreamFinish);
                        jDCacheLog.d(TAG, sb2.toString());
                    }
                    b2 b2Var = b2.f124493a;
                }
            }
        }
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        int i10;
        try {
            if (this.readStreamFinish) {
                i10 = -1;
            } else {
                BufferedInputStream bufferedInputStream = this.readStream;
                i10 = bufferedInputStream != null ? bufferedInputStream.read() : -1;
                JDCacheLog jDCacheLog = JDCacheLog.INSTANCE;
                if (jDCacheLog.getCanLog() && -1 == i10) {
                    jDCacheLog.d(TAG, "Read from readStream finished.");
                }
            }
            if (-1 == i10) {
                this.readStreamFinish = true;
                if (!this.unreadStreamFinish) {
                    BufferedInputStream bufferedInputStream2 = this.unreadStream;
                    i10 = bufferedInputStream2 != null ? bufferedInputStream2.read() : -1;
                    if (-1 == i10) {
                        this.unreadStreamFinish = true;
                        JDCacheLog jDCacheLog2 = JDCacheLog.INSTANCE;
                        if (jDCacheLog2.getCanLog()) {
                            jDCacheLog2.d(TAG, "Read from unreadStream finished.");
                        }
                    }
                }
            }
            return i10;
        } catch (Throwable th2) {
            JDCacheLog jDCacheLog3 = JDCacheLog.INSTANCE;
            if (jDCacheLog3.getCanLog()) {
                jDCacheLog3.e(TAG, th2);
            }
            if (th2 instanceof IOException) {
                throw th2;
            }
            throw new IOException(th2);
        }
    }

    public final void startPreRead() {
        BufferedInputStream bufferedInputStream = this.unreadStream;
        if (bufferedInputStream == null) {
            return;
        }
        if (!this.preReadStarted.compareAndSet(false, true)) {
            JDCacheLog jDCacheLog = JDCacheLog.INSTANCE;
            if (jDCacheLog.getCanLog()) {
                jDCacheLog.e(TAG, "Pre-read already started, cannot start twice.");
                return;
            }
            return;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            this.readData = byteArrayOutputStream;
            byte[] bArr = new byte[10240];
            synchronized (this) {
                JDCacheLog jDCacheLog2 = JDCacheLog.INSTANCE;
                if (jDCacheLog2.getCanLog()) {
                    jDCacheLog2.d(TAG, "Start to pre-read stream.");
                }
                int i10 = 0;
                while (!this.preReadStopPoint.get() && (i10 = bufferedInputStream.read(bArr)) != -1) {
                    byteArrayOutputStream.write(bArr, 0, i10);
                }
                if (-1 == i10) {
                    this.unreadStreamFinish = true;
                    finishPreRead();
                }
                b2 b2Var = b2.f124493a;
            }
        } catch (Exception e10) {
            JDCacheLog jDCacheLog3 = JDCacheLog.INSTANCE;
            if (jDCacheLog3.getCanLog()) {
                jDCacheLog3.e(TAG, "Pre-read stream error", e10);
            }
        }
    }
}
