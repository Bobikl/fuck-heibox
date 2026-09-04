package androidx.window.sidecar;

import android.app.Activity;
import com.google.android.gms.common.internal.s;
import dl.e;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.f0;
import kotlinx.coroutines.channels.k;
import kotlinx.coroutines.flow.f;
import yh.p;

/* JADX INFO: compiled from: WindowInfoTrackerImpl.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/flow/f;", "Landroidx/window/layout/v;", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
@d(c = "androidx.window.layout.WindowInfoTrackerImpl$windowLayoutInfo$1", f = "WindowInfoTrackerImpl.kt", i = {0, 0, 1, 1}, l = {54, 55}, m = "invokeSuspend", n = {"$this$flow", s.a.f52543a, "$this$flow", s.a.f52543a}, s = {"L$0", "L$1", "L$0", "L$1"})
public final class WindowInfoTrackerImpl$windowLayoutInfo$1 extends SuspendLambda implements p<f<? super v>, c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f28610b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Object f28611c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f28612d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private /* synthetic */ Object f28613e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ WindowInfoTrackerImpl f28614f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ Activity f28615g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WindowInfoTrackerImpl$windowLayoutInfo$1(WindowInfoTrackerImpl windowInfoTrackerImpl, Activity activity, c<? super WindowInfoTrackerImpl$windowLayoutInfo$1> cVar) {
        super(2, cVar);
        this.f28614f = windowInfoTrackerImpl;
        this.f28615g = activity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(k kVar, v info) {
        f0.o(info, "info");
        kVar.v(info);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final c<b2> create(@e Object obj, @dl.d c<?> cVar) {
        WindowInfoTrackerImpl$windowLayoutInfo$1 windowInfoTrackerImpl$windowLayoutInfo$1 = new WindowInfoTrackerImpl$windowLayoutInfo$1(this.f28614f, this.f28615g, cVar);
        windowInfoTrackerImpl$windowLayoutInfo$1.f28613e = obj;
        return windowInfoTrackerImpl$windowLayoutInfo$1;
    }

    @Override // yh.p
    @e
    public final Object invoke(@dl.d f<? super v> fVar, @e c<? super b2> cVar) {
        return ((WindowInfoTrackerImpl$windowLayoutInfo$1) create(fVar, cVar)).invokeSuspend(b2.f124493a);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0072 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x0073  */
    /* JADX WARN: Code duplicated, block: B:23:0x007e A[Catch: all -> 0x00a1, TRY_LEAVE, TryCatch #0 {all -> 0x00a1, blocks: (B:17:0x0064, B:21:0x0076, B:23:0x007e), top: B:35:0x0064 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x0092 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:26:0x0093  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0093 -> B:35:0x0064). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final java.lang.Object invokeSuspend(@dl.d java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.h()
            int r1 = r9.f28612d
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L39
            if (r1 == r3) goto L27
            if (r1 != r2) goto L1f
            java.lang.Object r1 = r9.f28611c
            kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
            java.lang.Object r4 = r9.f28610b
            androidx.core.util.d r4 = (androidx.core.util.d) r4
            java.lang.Object r5 = r9.f28613e
            kotlinx.coroutines.flow.f r5 = (kotlinx.coroutines.flow.f) r5
            kotlin.t0.n(r10)     // Catch: java.lang.Throwable -> La3
            r10 = r5
            goto L63
        L1f:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L27:
            java.lang.Object r1 = r9.f28611c
            kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
            java.lang.Object r4 = r9.f28610b
            androidx.core.util.d r4 = (androidx.core.util.d) r4
            java.lang.Object r5 = r9.f28613e
            kotlinx.coroutines.flow.f r5 = (kotlinx.coroutines.flow.f) r5
            kotlin.t0.n(r10)     // Catch: java.lang.Throwable -> La3
            r6 = r5
            r5 = r9
            goto L76
        L39:
            kotlin.t0.n(r10)
            java.lang.Object r10 = r9.f28613e
            kotlinx.coroutines.flow.f r10 = (kotlinx.coroutines.flow.f) r10
            r1 = 10
            kotlinx.coroutines.channels.BufferOverflow r4 = kotlinx.coroutines.channels.BufferOverflow.DROP_OLDEST
            r5 = 4
            r6 = 0
            kotlinx.coroutines.channels.k r1 = kotlinx.coroutines.channels.m.d(r1, r4, r6, r5, r6)
            androidx.window.layout.u r4 = new androidx.window.layout.u
            r4.<init>()
            androidx.window.layout.WindowInfoTrackerImpl r5 = r9.f28614f
            androidx.window.layout.q r5 = androidx.window.sidecar.WindowInfoTrackerImpl.b(r5)
            android.app.Activity r6 = r9.f28615g
            androidx.profileinstaller.f r7 = new androidx.profileinstaller.f
            r7.<init>()
            r5.a(r6, r7, r4)
            kotlinx.coroutines.channels.ChannelIterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> La3
        L63:
            r5 = r9
        L64:
            r5.f28613e = r10     // Catch: java.lang.Throwable -> La1
            r5.f28610b = r4     // Catch: java.lang.Throwable -> La1
            r5.f28611c = r1     // Catch: java.lang.Throwable -> La1
            r5.f28612d = r3     // Catch: java.lang.Throwable -> La1
            java.lang.Object r6 = r1.b(r5)     // Catch: java.lang.Throwable -> La1
            if (r6 != r0) goto L73
            return r0
        L73:
            r8 = r6
            r6 = r10
            r10 = r8
        L76:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> La1
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> La1
            if (r10 == 0) goto L95
            java.lang.Object r10 = r1.next()     // Catch: java.lang.Throwable -> La1
            androidx.window.layout.v r10 = (androidx.window.sidecar.v) r10     // Catch: java.lang.Throwable -> La1
            r5.f28613e = r6     // Catch: java.lang.Throwable -> La1
            r5.f28610b = r4     // Catch: java.lang.Throwable -> La1
            r5.f28611c = r1     // Catch: java.lang.Throwable -> La1
            r5.f28612d = r2     // Catch: java.lang.Throwable -> La1
            java.lang.Object r10 = r6.emit(r10, r5)     // Catch: java.lang.Throwable -> La1
            if (r10 != r0) goto L93
            return r0
        L93:
            r10 = r6
            goto L64
        L95:
            androidx.window.layout.WindowInfoTrackerImpl r10 = r5.f28614f
            androidx.window.layout.q r10 = androidx.window.sidecar.WindowInfoTrackerImpl.b(r10)
            r10.b(r4)
            kotlin.b2 r10 = kotlin.b2.f124493a
            return r10
        La1:
            r10 = move-exception
            goto La5
        La3:
            r10 = move-exception
            r5 = r9
        La5:
            androidx.window.layout.WindowInfoTrackerImpl r0 = r5.f28614f
            androidx.window.layout.q r0 = androidx.window.sidecar.WindowInfoTrackerImpl.b(r0)
            r0.b(r4)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.window.sidecar.WindowInfoTrackerImpl$windowLayoutInfo$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
