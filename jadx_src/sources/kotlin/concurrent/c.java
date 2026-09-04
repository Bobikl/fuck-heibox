package kotlin.concurrent;

import dl.d;
import dl.e;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import kotlin.r0;
import sh.f;
import xh.h;
import yh.l;

/* JADX INFO: compiled from: Timer.kt */
/* JADX INFO: loaded from: classes5.dex */
@h(name = "TimersKt")
public final class c {

    /* JADX INFO: compiled from: Timer.kt */
    public static final class a extends TimerTask {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ l<TimerTask, b2> f124685b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(l<? super TimerTask, b2> lVar) {
            this.f124685b = lVar;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            this.f124685b.invoke(this);
        }
    }

    @f
    private static final Timer a(String str, boolean z10, long j10, long j11, l<? super TimerTask, b2> action) {
        f0.p(action, "action");
        Timer timerK = k(str, z10);
        timerK.scheduleAtFixedRate(new a(action), j10, j11);
        return timerK;
    }

    @f
    private static final Timer b(String str, boolean z10, Date startAt, long j10, l<? super TimerTask, b2> action) {
        f0.p(startAt, "startAt");
        f0.p(action, "action");
        Timer timerK = k(str, z10);
        timerK.scheduleAtFixedRate(new a(action), startAt, j10);
        return timerK;
    }

    static /* synthetic */ Timer c(String str, boolean z10, long j10, long j11, l action, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            j10 = 0;
        }
        f0.p(action, "action");
        Timer timerK = k(str, z10);
        timerK.scheduleAtFixedRate(new a(action), j10, j11);
        return timerK;
    }

    static /* synthetic */ Timer d(String str, boolean z10, Date startAt, long j10, l action, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        f0.p(startAt, "startAt");
        f0.p(action, "action");
        Timer timerK = k(str, z10);
        timerK.scheduleAtFixedRate(new a(action), startAt, j10);
        return timerK;
    }

    @f
    private static final TimerTask e(Timer timer, long j10, long j11, l<? super TimerTask, b2> action) {
        f0.p(timer, "<this>");
        f0.p(action, "action");
        a aVar = new a(action);
        timer.schedule(aVar, j10, j11);
        return aVar;
    }

    @f
    private static final TimerTask f(Timer timer, long j10, l<? super TimerTask, b2> action) {
        f0.p(timer, "<this>");
        f0.p(action, "action");
        a aVar = new a(action);
        timer.schedule(aVar, j10);
        return aVar;
    }

    @f
    private static final TimerTask g(Timer timer, Date time, long j10, l<? super TimerTask, b2> action) {
        f0.p(timer, "<this>");
        f0.p(time, "time");
        f0.p(action, "action");
        a aVar = new a(action);
        timer.schedule(aVar, time, j10);
        return aVar;
    }

    @f
    private static final TimerTask h(Timer timer, Date time, l<? super TimerTask, b2> action) {
        f0.p(timer, "<this>");
        f0.p(time, "time");
        f0.p(action, "action");
        a aVar = new a(action);
        timer.schedule(aVar, time);
        return aVar;
    }

    @f
    private static final TimerTask i(Timer timer, long j10, long j11, l<? super TimerTask, b2> action) {
        f0.p(timer, "<this>");
        f0.p(action, "action");
        a aVar = new a(action);
        timer.scheduleAtFixedRate(aVar, j10, j11);
        return aVar;
    }

    @f
    private static final TimerTask j(Timer timer, Date time, long j10, l<? super TimerTask, b2> action) {
        f0.p(timer, "<this>");
        f0.p(time, "time");
        f0.p(action, "action");
        a aVar = new a(action);
        timer.scheduleAtFixedRate(aVar, time, j10);
        return aVar;
    }

    @d
    @r0
    public static final Timer k(@e String str, boolean z10) {
        return str == null ? new Timer(z10) : new Timer(str, z10);
    }

    @f
    private static final Timer l(String str, boolean z10, long j10, long j11, l<? super TimerTask, b2> action) {
        f0.p(action, "action");
        Timer timerK = k(str, z10);
        timerK.schedule(new a(action), j10, j11);
        return timerK;
    }

    @f
    private static final Timer m(String str, boolean z10, Date startAt, long j10, l<? super TimerTask, b2> action) {
        f0.p(startAt, "startAt");
        f0.p(action, "action");
        Timer timerK = k(str, z10);
        timerK.schedule(new a(action), startAt, j10);
        return timerK;
    }

    static /* synthetic */ Timer n(String str, boolean z10, long j10, long j11, l action, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            j10 = 0;
        }
        f0.p(action, "action");
        Timer timerK = k(str, z10);
        timerK.schedule(new a(action), j10, j11);
        return timerK;
    }

    static /* synthetic */ Timer o(String str, boolean z10, Date startAt, long j10, l action, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        f0.p(startAt, "startAt");
        f0.p(action, "action");
        Timer timerK = k(str, z10);
        timerK.schedule(new a(action), startAt, j10);
        return timerK;
    }

    @f
    private static final TimerTask p(l<? super TimerTask, b2> action) {
        f0.p(action, "action");
        return new a(action);
    }
}
