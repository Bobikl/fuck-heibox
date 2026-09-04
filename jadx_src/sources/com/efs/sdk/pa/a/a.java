package com.efs.sdk.pa.a;

import android.app.Application;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import com.efs.sdk.pa.PAANRListener;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    volatile boolean f42762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Handler f42763b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Thread f42764c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    long f42765d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    long f42766e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    boolean f42767f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    Handler f42768g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    PAANRListener f42769h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    long f42770i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    long f42771j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final long f42772k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    boolean f42773l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final Runnable f42774m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final Runnable f42775n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private HandlerThread f42776o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Application f42777p;

    public a(Application application, long j10) {
        this(application, j10, true);
    }

    public a(Application application, long j10, boolean z10) {
        this.f42762a = true;
        this.f42766e = 4L;
        this.f42767f = true;
        this.f42770i = 0L;
        this.f42774m = new Runnable() { // from class: com.efs.sdk.pa.a.a.1
            @Override // java.lang.Runnable
            public final void run() {
                PAANRListener pAANRListener;
                if (a.this.f42767f) {
                    return;
                }
                long jUptimeMillis = SystemClock.uptimeMillis();
                a aVar = a.this;
                long j11 = jUptimeMillis - aVar.f42771j;
                if (j11 > aVar.f42772k && (pAANRListener = aVar.f42769h) != null) {
                    pAANRListener.unexcept(Long.valueOf(j11));
                }
                if (a.this.f42762a) {
                    a aVar2 = a.this;
                    aVar2.f42770i = 0L;
                    aVar2.f42762a = false;
                    a aVar3 = a.this;
                    aVar3.f42763b.postAtFrontOfQueue(aVar3.f42775n);
                } else {
                    a aVar4 = a.this;
                    aVar4.f42770i++;
                    if (!aVar4.f42762a) {
                        a aVar5 = a.this;
                        long j12 = aVar5.f42770i;
                        long j13 = aVar5.f42766e;
                        if (j12 >= j13 && j12 == j13) {
                            StringBuilder sb2 = new StringBuilder();
                            if (aVar5.f42773l) {
                                sb2.append(a.a(aVar5.f42764c));
                            } else if (a.a(sb2)) {
                            }
                            if (aVar5.f42769h != null && sb2.length() > 0) {
                                aVar5.f42769h.anrStack(sb2.toString());
                            }
                        }
                    }
                }
                a.this.f42771j = SystemClock.uptimeMillis();
                a aVar6 = a.this;
                aVar6.f42768g.postDelayed(aVar6.f42774m, aVar6.f42765d);
            }
        };
        this.f42775n = new Runnable() { // from class: com.efs.sdk.pa.a.a.2
            @Override // java.lang.Runnable
            public final void run() {
                a.this.f42762a = true;
            }
        };
        this.f42772k = j10;
        this.f42777p = application;
        this.f42773l = z10;
        long j11 = ((long) (j10 * 0.8f)) / this.f42766e;
        this.f42765d = j11;
        if (j11 < 100) {
            this.f42765d = 100L;
            this.f42766e = j10 / 100;
        }
        Log.i("Matrix.AnrTracer", "anrTrace, final mAnrBeatTime:" + this.f42765d + ", mAnrBeatRate:" + this.f42765d);
        this.f42764c = Looper.getMainLooper().getThread();
        this.f42763b = new Handler(Looper.getMainLooper());
        HandlerThread handlerThread = new HandlerThread("ANR HANDLER THREAD");
        this.f42776o = handlerThread;
        handlerThread.start();
        this.f42768g = new Handler(this.f42776o.getLooper());
    }

    static String a(Thread thread) {
        StringBuilder sb2 = new StringBuilder();
        StackTraceElement[] stackTrace = thread.getStackTrace();
        sb2.append(thread.getName());
        sb2.append(" ");
        sb2.append(thread.getPriority());
        sb2.append(" ");
        sb2.append(thread.getState());
        sb2.append("\n");
        for (StackTraceElement stackTraceElement : stackTrace) {
            String string = stackTraceElement.toString();
            sb2.append("  at  ");
            sb2.append(string);
            sb2.append('\n');
        }
        sb2.append("\n");
        return sb2.toString();
    }

    static boolean a(StringBuilder sb2) {
        Set<Map.Entry<Thread, StackTraceElement[]>> setEntrySet = Thread.getAllStackTraces().entrySet();
        if (setEntrySet.size() == 0) {
            return false;
        }
        boolean z10 = false;
        for (Map.Entry<Thread, StackTraceElement[]> entry : setEntrySet) {
            Thread key = entry.getKey();
            StackTraceElement[] value = entry.getValue();
            if (key.getId() == Looper.getMainLooper().getThread().getId()) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(key.getName());
                sb3.append(" ");
                sb3.append(key.getPriority());
                sb3.append(" ");
                sb3.append(key.getState());
                sb3.append("\n");
                for (StackTraceElement stackTraceElement : value) {
                    String string = stackTraceElement.toString();
                    sb3.append("  at  ");
                    sb3.append(string);
                    sb3.append('\n');
                }
                sb3.append("\n");
                sb2.insert(0, (CharSequence) sb3);
                z10 = true;
            } else {
                sb2.append(key.getName());
                sb2.append(" ");
                sb2.append(key.getPriority());
                sb2.append(" ");
                sb2.append(key.getState());
                sb2.append("\n");
                for (StackTraceElement stackTraceElement2 : value) {
                    String string2 = stackTraceElement2.toString();
                    sb2.append("  at  ");
                    sb2.append(string2);
                    sb2.append('\n');
                }
                sb2.append("\n");
            }
        }
        if (!z10) {
            sb2.insert(0, a(Looper.getMainLooper().getThread()));
        }
        return true;
    }
}
