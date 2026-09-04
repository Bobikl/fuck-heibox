package androidx.core.os;

import android.os.Handler;
import kotlin.b2;
import kotlin.jvm.internal.t0;

/* JADX INFO: compiled from: Handler.kt */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: compiled from: Handler.kt */
    @t0({"SMAP\nHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Handler.kt\nandroidx/core/os/HandlerKt$postAtTime$runnable$1\n*L\n1#1,69:1\n*E\n"})
    public static final class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ yh.a<b2> f20980b;

        public a(yh.a<b2> aVar) {
            this.f20980b = aVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f20980b.invoke();
        }
    }

    /* JADX INFO: compiled from: Handler.kt */
    @t0({"SMAP\nHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Handler.kt\nandroidx/core/os/HandlerKt$postDelayed$runnable$1\n*L\n1#1,69:1\n*E\n"})
    public static final class b implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ yh.a<b2> f20981b;

        public b(yh.a<b2> aVar) {
            this.f20981b = aVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f20981b.invoke();
        }
    }

    @dl.d
    public static final Runnable a(@dl.d Handler handler, long j10, @dl.e Object obj, @dl.d yh.a<b2> action) {
        kotlin.jvm.internal.f0.p(handler, "<this>");
        kotlin.jvm.internal.f0.p(action, "action");
        a aVar = new a(action);
        handler.postAtTime(aVar, obj, j10);
        return aVar;
    }

    public static /* synthetic */ Runnable b(Handler handler, long j10, Object obj, yh.a action, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            obj = null;
        }
        kotlin.jvm.internal.f0.p(handler, "<this>");
        kotlin.jvm.internal.f0.p(action, "action");
        a aVar = new a(action);
        handler.postAtTime(aVar, obj, j10);
        return aVar;
    }

    @dl.d
    public static final Runnable c(@dl.d Handler handler, long j10, @dl.e Object obj, @dl.d yh.a<b2> action) {
        kotlin.jvm.internal.f0.p(handler, "<this>");
        kotlin.jvm.internal.f0.p(action, "action");
        b bVar = new b(action);
        if (obj == null) {
            handler.postDelayed(bVar, j10);
        } else {
            l.d(handler, bVar, obj, j10);
        }
        return bVar;
    }

    public static /* synthetic */ Runnable d(Handler handler, long j10, Object obj, yh.a action, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            obj = null;
        }
        kotlin.jvm.internal.f0.p(handler, "<this>");
        kotlin.jvm.internal.f0.p(action, "action");
        b bVar = new b(action);
        if (obj == null) {
            handler.postDelayed(bVar, j10);
        } else {
            l.d(handler, bVar, obj, j10);
        }
        return bVar;
    }
}
