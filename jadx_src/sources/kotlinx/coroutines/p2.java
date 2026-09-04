package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.sequences.SequencesKt__SequencesKt;

/* JADX INFO: compiled from: NonCancellable.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b5\u0010%J\b\u0010\u0004\u001a\u00020\u0003H\u0017J\u0013\u0010\u0006\u001a\u00020\u0005H\u0097@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\f\u0010\n\u001a\u00060\bj\u0002`\tH\u0017J1\u0010\u0013\u001a\u00020\u00122'\u0010\u0011\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00050\u000bj\u0002`\u0010H\u0017JA\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00032'\u0010\u0011\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00050\u000bj\u0002`\u0010H\u0017J\u0018\u0010\u0017\u001a\u00020\u00052\u000e\u0010\u000f\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\tH\u0017J\u0012\u0010\u0018\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\fH\u0017J\u0010\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0017J\b\u0010\u001e\u001a\u00020\u001dH\u0016R\u0014\u0010!\u001a\u00020\u001d8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001a\u0010\"\u001a\u00020\u00038VX\u0097\u0004¢\u0006\f\u0012\u0004\b$\u0010%\u001a\u0004\b\"\u0010#R\u001a\u0010(\u001a\u00020\u00038VX\u0097\u0004¢\u0006\f\u0012\u0004\b'\u0010%\u001a\u0004\b&\u0010#R\u001a\u0010)\u001a\u00020\u00038VX\u0097\u0004¢\u0006\f\u0012\u0004\b*\u0010%\u001a\u0004\b)\u0010#R\u001a\u0010/\u001a\u00020+8VX\u0097\u0004¢\u0006\f\u0012\u0004\b.\u0010%\u001a\u0004\b,\u0010-R \u00104\u001a\b\u0012\u0004\u0012\u00020\u0002008VX\u0097\u0004¢\u0006\f\u0012\u0004\b3\u0010%\u001a\u0004\b1\u00102\u0082\u0002\u0004\n\u0002\b\u0019¨\u00066"}, d2 = {"Lkotlinx/coroutines/p2;", "Lkotlin/coroutines/a;", "Lkotlinx/coroutines/d2;", "", com.google.android.exoplayer2.text.ttml.d.f49798o0, "Lkotlin/b2;", "g0", "(Lkotlin/coroutines/c;)Ljava/lang/Object;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "Z", "Lkotlin/Function1;", "", "Lkotlin/m0;", "name", "cause", "Lkotlinx/coroutines/CompletionHandler;", "handler", "Lkotlinx/coroutines/h1;", "K", "onCancelling", "invokeImmediately", "i0", "e", "b", "Lkotlinx/coroutines/x;", "child", "Lkotlinx/coroutines/v;", "P", "", "toString", "d", "Ljava/lang/String;", "message", "isActive", "()Z", "isActive$annotations", "()V", "x", "isCompleted$annotations", "isCompleted", "isCancelled", "isCancelled$annotations", "Lkotlinx/coroutines/selects/c;", "M", "()Lkotlinx/coroutines/selects/c;", "getOnJoin$annotations", "onJoin", "Lkotlin/sequences/m;", androidx.exifinterface.media.a.R4, "()Lkotlin/sequences/m;", "getChildren$annotations", "children", "<init>", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class p2 extends kotlin.coroutines.a implements d2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    public static final p2 f130297c = new p2();

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private static final String message = "NonCancellable can be used only as an argument for 'withContext', direct usages of its API are prohibited";

    private p2() {
        super(d2.INSTANCE);
    }

    @kotlin.k(level = DeprecationLevel.WARNING, message = message)
    public static /* synthetic */ void O() {
    }

    @kotlin.k(level = DeprecationLevel.WARNING, message = message)
    public static /* synthetic */ void R() {
    }

    @kotlin.k(level = DeprecationLevel.WARNING, message = message)
    public static /* synthetic */ void V() {
    }

    @kotlin.k(level = DeprecationLevel.WARNING, message = message)
    public static /* synthetic */ void c0() {
    }

    @kotlin.k(level = DeprecationLevel.WARNING, message = message)
    public static /* synthetic */ void j0() {
    }

    @Override // kotlinx.coroutines.d2
    @dl.d
    @kotlin.k(level = DeprecationLevel.WARNING, message = message)
    public h1 K(@dl.d yh.l<? super Throwable, kotlin.b2> lVar) {
        return q2.f130305b;
    }

    @Override // kotlinx.coroutines.d2
    @dl.d
    public kotlinx.coroutines.selects.c M() {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // kotlinx.coroutines.d2
    @dl.d
    @kotlin.k(level = DeprecationLevel.WARNING, message = message)
    public v P(@dl.d x child) {
        return q2.f130305b;
    }

    @Override // kotlinx.coroutines.d2
    @dl.d
    public kotlin.sequences.m<d2> S() {
        return SequencesKt__SequencesKt.g();
    }

    @Override // kotlinx.coroutines.d2
    @dl.d
    @kotlin.k(level = DeprecationLevel.WARNING, message = message)
    public CancellationException Z() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // kotlinx.coroutines.d2
    @kotlin.k(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public /* synthetic */ boolean b(Throwable cause) {
        return false;
    }

    @Override // kotlinx.coroutines.d2
    @kotlin.k(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public /* synthetic */ void cancel() {
        e(null);
    }

    @Override // kotlinx.coroutines.d2
    @kotlin.k(level = DeprecationLevel.WARNING, message = message)
    public void e(@dl.e CancellationException cancellationException) {
    }

    @Override // kotlinx.coroutines.d2
    @kotlin.k(level = DeprecationLevel.WARNING, message = message)
    @dl.e
    public Object g0(@dl.d kotlin.coroutines.c<? super kotlin.b2> cVar) {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // kotlinx.coroutines.d2
    @dl.d
    @kotlin.k(level = DeprecationLevel.WARNING, message = message)
    public h1 i0(boolean z10, boolean z11, @dl.d yh.l<? super Throwable, kotlin.b2> lVar) {
        return q2.f130305b;
    }

    @Override // kotlinx.coroutines.d2
    public boolean isActive() {
        return true;
    }

    @Override // kotlinx.coroutines.d2
    public boolean isCancelled() {
        return false;
    }

    @Override // kotlinx.coroutines.d2
    @dl.d
    @kotlin.k(level = DeprecationLevel.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
    public d2 s(@dl.d d2 d2Var) {
        return d2.a.i(this, d2Var);
    }

    @Override // kotlinx.coroutines.d2
    @kotlin.k(level = DeprecationLevel.WARNING, message = message)
    public boolean start() {
        return false;
    }

    @dl.d
    public String toString() {
        return "NonCancellable";
    }

    @Override // kotlinx.coroutines.d2
    public boolean x() {
        return false;
    }
}
