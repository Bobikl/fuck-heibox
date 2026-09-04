package kotlinx.coroutines.debug.internal;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.f0;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.sequences.q;

/* JADX INFO: renamed from: kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl, reason: from toString */
/* JADX INFO: compiled from: DebugCoroutineInfoImpl.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0000\u0018\u00002\u00020\u0001B#\u0012\b\u0010)\u001a\u0004\u0018\u00010\u001c\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u001a\u001a\u00020\u0018¢\u0006\u0004\b3\u00104J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J'\u0010\t\u001a\u00020\b*\b\u0012\u0004\u0012\u00020\u00030\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0082Pø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J#\u0010\u000f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u000eH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0011\u001a\u00020\fH\u0016R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00188\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0019R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010!\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010 R\u0018\u0010%\u001a\u0004\u0018\u00010\"8\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u001e\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010\u001eR\u0013\u0010)\u001a\u0004\u0018\u00010\u001c8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010(R\u0017\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028F¢\u0006\u0006\u001a\u0004\b#\u0010*R\u0011\u0010\r\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b,\u0010-R(\u00102\u001a\u0004\u0018\u00010\u00062\b\u0010.\u001a\u0004\u0018\u00010\u00068@@@X\u0080\u000e¢\u0006\f\u001a\u0004\b&\u0010/\"\u0004\b0\u00101\u0082\u0002\u0004\n\u0002\b\u0019¨\u00065"}, d2 = {"Lkotlinx/coroutines/debug/internal/DebugCoroutineInfoImpl;", "", "", "Ljava/lang/StackTraceElement;", "b", "Lkotlin/sequences/o;", "Lkotlin/coroutines/jvm/internal/c;", "frame", "Lkotlin/b2;", "k", "(Lkotlin/sequences/o;Lkotlin/coroutines/jvm/internal/c;Lkotlin/coroutines/c;)Ljava/lang/Object;", RXScreenCaptureService.KEY_HEIGHT, "", "state", "Lkotlin/coroutines/c;", "j", "(Ljava/lang/String;Lkotlin/coroutines/c;)V", "toString", "Lkotlinx/coroutines/debug/internal/i;", ak.av, "Lkotlinx/coroutines/debug/internal/i;", "d", "()Lkotlinx/coroutines/debug/internal/i;", "creationStackBottom", "", "J", "sequenceNumber", "Ljava/lang/ref/WeakReference;", "Lkotlin/coroutines/CoroutineContext;", ak.aF, "Ljava/lang/ref/WeakReference;", "_context", "Ljava/lang/String;", "_state", "Ljava/lang/Thread;", "e", "Ljava/lang/Thread;", "lastObservedThread", "f", "_lastObservedFrame", "()Lkotlin/coroutines/CoroutineContext;", com.umeng.analytics.pro.d.R, "()Ljava/util/List;", "creationStackTrace", "g", "()Ljava/lang/String;", "value", "()Lkotlin/coroutines/jvm/internal/c;", "i", "(Lkotlin/coroutines/jvm/internal/c;)V", "lastObservedFrame", "<init>", "(Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/debug/internal/i;J)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class DebugCoroutineInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private final i creationStackBottom;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @xh.e
    public final long sequenceNumber;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final WeakReference<CoroutineContext> _context;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private String _state = d.f129169a;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.e
    @xh.e
    public Thread lastObservedThread;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private WeakReference<kotlin.coroutines.jvm.internal.c> _lastObservedFrame;

    public DebugCoroutineInfo(@dl.e CoroutineContext coroutineContext, @dl.e i iVar, long j10) {
        this.creationStackBottom = iVar;
        this.sequenceNumber = j10;
        this._context = new WeakReference<>(coroutineContext);
    }

    private final List<StackTraceElement> b() {
        i iVar = this.creationStackBottom;
        return iVar == null ? CollectionsKt__CollectionsKt.E() : SequencesKt___SequencesKt.c3(q.b(new DebugCoroutineInfoImpl$creationStackTrace$1(this, iVar, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:18:0x0046  */
    /* JADX WARN: Code duplicated, block: B:20:0x004c  */
    /* JADX WARN: Code duplicated, block: B:22:0x005a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:23:0x005b  */
    /* JADX WARN: Code duplicated, block: B:28:0x0068  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x004a -> B:25:0x0061). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x005b -> B:24:0x005e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:20:0x004c
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object k(kotlin.sequences.o<? super java.lang.StackTraceElement> r6, kotlin.coroutines.jvm.internal.c r7, kotlin.coroutines.c<? super kotlin.b2> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl$yieldFrames$1
            if (r0 == 0) goto L13
            r0 = r8
            kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl$yieldFrames$1 r0 = (kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl$yieldFrames$1) r0
            int r1 = r0.f129127g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f129127g = r1
            goto L18
        L13:
            kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl$yieldFrames$1 r0 = new kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl$yieldFrames$1
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f129125e
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.h()
            int r2 = r0.f129127g
            r3 = 1
            if (r2 == 0) goto L3d
            if (r2 != r3) goto L35
            java.lang.Object r6 = r0.f129124d
            kotlin.coroutines.jvm.internal.c r6 = (kotlin.coroutines.jvm.internal.c) r6
            java.lang.Object r7 = r0.f129123c
            kotlin.sequences.o r7 = (kotlin.sequences.o) r7
            java.lang.Object r2 = r0.f129122b
            kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl r2 = (kotlinx.coroutines.debug.internal.DebugCoroutineInfo) r2
            kotlin.t0.n(r8)
            goto L5e
        L35:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3d:
            kotlin.t0.n(r8)
            r2 = r5
        L41:
            if (r7 != 0) goto L46
            kotlin.b2 r6 = kotlin.b2.f124493a
            return r6
        L46:
            java.lang.StackTraceElement r8 = r7.getStackTraceElement()
            if (r8 == 0) goto L61
            r0.f129122b = r2
            r0.f129123c = r6
            r0.f129124d = r7
            r0.f129127g = r3
            java.lang.Object r8 = r6.a(r8, r0)
            if (r8 != r1) goto L5b
            return r1
        L5b:
            r4 = r7
            r7 = r6
            r6 = r4
        L5e:
            r4 = r7
            r7 = r6
            r6 = r4
        L61:
            kotlin.coroutines.jvm.internal.c r7 = r7.getCallerFrame()
            if (r7 == 0) goto L68
            goto L41
        L68:
            kotlin.b2 r6 = kotlin.b2.f124493a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.debug.internal.DebugCoroutineInfo.k(kotlin.sequences.o, kotlin.coroutines.jvm.internal.c, kotlin.coroutines.c):java.lang.Object");
    }

    @dl.e
    public final CoroutineContext c() {
        return this._context.get();
    }

    @dl.e
    /* JADX INFO: renamed from: d, reason: from getter */
    public final i getCreationStackBottom() {
        return this.creationStackBottom;
    }

    @dl.d
    public final List<StackTraceElement> e() {
        return b();
    }

    @dl.e
    public final kotlin.coroutines.jvm.internal.c f() {
        WeakReference<kotlin.coroutines.jvm.internal.c> weakReference = this._lastObservedFrame;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @dl.d
    /* JADX INFO: renamed from: g, reason: from getter */
    public final String get_state() {
        return this._state;
    }

    @dl.d
    public final List<StackTraceElement> h() {
        kotlin.coroutines.jvm.internal.c cVarF = f();
        if (cVarF == null) {
            return CollectionsKt__CollectionsKt.E();
        }
        ArrayList arrayList = new ArrayList();
        while (cVarF != null) {
            StackTraceElement stackTraceElement = cVarF.getStackTraceElement();
            if (stackTraceElement != null) {
                arrayList.add(stackTraceElement);
            }
            cVarF = cVarF.getCallerFrame();
        }
        return arrayList;
    }

    public final void i(@dl.e kotlin.coroutines.jvm.internal.c cVar) {
        this._lastObservedFrame = cVar != null ? new WeakReference<>(cVar) : null;
    }

    public final void j(@dl.d String state, @dl.d kotlin.coroutines.c<?> frame) {
        if (f0.g(this._state, state) && f0.g(state, d.f129171c) && f() != null) {
            return;
        }
        this._state = state;
        i(frame instanceof kotlin.coroutines.jvm.internal.c ? (kotlin.coroutines.jvm.internal.c) frame : null);
        this.lastObservedThread = f0.g(state, d.f129170b) ? Thread.currentThread() : null;
    }

    @dl.d
    public String toString() {
        return "DebugCoroutineInfo(state=" + get_state() + ",context=" + c() + ')';
    }
}
