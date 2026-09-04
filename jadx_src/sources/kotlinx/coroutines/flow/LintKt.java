package kotlinx.coroutines.flow;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.DeprecationLevel;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.c0;
import kotlin.s0;

/* JADX INFO: compiled from: Lint.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000~\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\u001a\u001e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0007\u001a&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\u0007\u001a\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0007\u001a\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0007\u001a\"\u0010\u000f\u001a\u00020\u000e*\u0006\u0012\u0002\b\u00030\n2\u0010\b\u0002\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\fH\u0007\u001ao\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012D\b\b\u0010\u0017\u001a>\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0010¢\u0006\u0002\b\u0016H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001ah\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u001b\u001a\u00020\u001a23\b\n\u0010\u001e\u001a-\b\u0001\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u001cH\u0087\bø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 \u001a\u0084\u0001\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012Y\b\b\u0010\u001e\u001aS\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\u001a¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00150!¢\u0006\u0002\b\u0016H\u0087\bø\u0001\u0000¢\u0006\u0004\b#\u0010$\u001a)\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000%\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0087Hø\u0001\u0000¢\u0006\u0004\b&\u0010'\u001a)\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000(\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0087Hø\u0001\u0000¢\u0006\u0004\b)\u0010'\u001a#\u0010+\u001a\u00020*\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0087Hø\u0001\u0000¢\u0006\u0004\b+\u0010'\"\"\u00100\u001a\u00020\u001d*\u0006\u0012\u0002\b\u00030\n8FX\u0087\u0004¢\u0006\f\u0012\u0004\b.\u0010/\u001a\u0004\b,\u0010-\"\"\u00104\u001a\u00020\u0004*\u0006\u0012\u0002\b\u00030\n8FX\u0087\u0004¢\u0006\f\u0012\u0004\b3\u0010/\u001a\u0004\b1\u00102\u0082\u0002\u0004\n\u0002\b\u0019¨\u00065"}, d2 = {androidx.exifinterface.media.a.f23244d5, "Lkotlinx/coroutines/flow/n;", "Lkotlinx/coroutines/flow/e;", ak.aF, "Lkotlin/coroutines/CoroutineContext;", com.umeng.analytics.pro.d.R, RXScreenCaptureService.KEY_HEIGHT, "Lkotlinx/coroutines/flow/u;", "e", "g", "Lkotlinx/coroutines/flow/f;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "cause", "Lkotlin/b2;", ak.av, "Lkotlin/Function3;", "", "Lkotlin/m0;", "name", "Lkotlin/coroutines/c;", "", "Lkotlin/t;", "action", "d", "(Lkotlinx/coroutines/flow/n;Lyh/q;)Lkotlinx/coroutines/flow/e;", "", "retries", "Lkotlin/Function2;", "", "predicate", "m", "(Lkotlinx/coroutines/flow/n;JLyh/p;)Lkotlinx/coroutines/flow/e;", "Lkotlin/Function4;", "attempt", "o", "(Lkotlinx/coroutines/flow/n;Lyh/r;)Lkotlinx/coroutines/flow/e;", "", "p", "(Lkotlinx/coroutines/flow/n;Lkotlin/coroutines/c;)Ljava/lang/Object;", "", "q", "", "f", "k", "(Lkotlinx/coroutines/flow/f;)Z", "isActive$annotations", "(Lkotlinx/coroutines/flow/f;)V", "isActive", "i", "(Lkotlinx/coroutines/flow/f;)Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext$annotations", "coroutineContext", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
public final class LintKt {
    @kotlin.k(level = DeprecationLevel.ERROR, message = "cancel() is resolved into the extension of outer CoroutineScope which is likely to be an error.Use currentCoroutineContext().cancel() instead or specify the receiver of cancel() explicitly", replaceWith = @s0(expression = "currentCoroutineContext().cancel(cause)", imports = {}))
    public static final void a(@dl.d f<?> fVar, @dl.e CancellationException cancellationException) {
        g.b1();
        throw new KotlinNothingValueException();
    }

    public static /* synthetic */ void b(f fVar, CancellationException cancellationException, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cancellationException = null;
        }
        a(fVar, cancellationException);
    }

    @dl.d
    @kotlin.k(level = DeprecationLevel.ERROR, message = "Applying 'cancellable' to a SharedFlow has no effect. See the SharedFlow documentation on Operator Fusion.", replaceWith = @s0(expression = "this", imports = {}))
    public static final <T> e<T> c(@dl.d n<? extends T> nVar) {
        g.b1();
        throw new KotlinNothingValueException();
    }

    @kotlin.k(level = DeprecationLevel.WARNING, message = "SharedFlow never completes, so this operator typically has not effect, it can only catch exceptions from 'onSubscribe' operator", replaceWith = @s0(expression = "this", imports = {}))
    @sh.f
    private static final <T> e<T> d(n<? extends T> nVar, yh.q<? super f<? super T>, ? super Throwable, ? super kotlin.coroutines.c<? super b2>, ? extends Object> qVar) {
        return g.u(nVar, qVar);
    }

    @dl.d
    @kotlin.k(level = DeprecationLevel.ERROR, message = "Applying 'conflate' to StateFlow has no effect. See the StateFlow documentation on Operator Fusion.", replaceWith = @s0(expression = "this", imports = {}))
    public static final <T> e<T> e(@dl.d u<? extends T> uVar) {
        g.b1();
        throw new KotlinNothingValueException();
    }

    @kotlin.k(level = DeprecationLevel.WARNING, message = "SharedFlow never completes, so this terminal operation never completes.")
    @sh.f
    private static final <T> Object f(n<? extends T> nVar, kotlin.coroutines.c<? super Integer> cVar) {
        c0.e(0);
        Object objY = g.Y(nVar, cVar);
        c0.e(1);
        return objY;
    }

    @dl.d
    @kotlin.k(level = DeprecationLevel.ERROR, message = "Applying 'distinctUntilChanged' to StateFlow has no effect. See the StateFlow documentation on Operator Fusion.", replaceWith = @s0(expression = "this", imports = {}))
    public static final <T> e<T> g(@dl.d u<? extends T> uVar) {
        g.b1();
        throw new KotlinNothingValueException();
    }

    @dl.d
    @kotlin.k(level = DeprecationLevel.ERROR, message = "Applying 'flowOn' to SharedFlow has no effect. See the SharedFlow documentation on Operator Fusion.", replaceWith = @s0(expression = "this", imports = {}))
    public static final <T> e<T> h(@dl.d n<? extends T> nVar, @dl.d CoroutineContext coroutineContext) {
        g.b1();
        throw new KotlinNothingValueException();
    }

    @dl.d
    public static final CoroutineContext i(@dl.d f<?> fVar) {
        g.b1();
        throw new KotlinNothingValueException();
    }

    @kotlin.k(level = DeprecationLevel.ERROR, message = "coroutineContext is resolved into the property of outer CoroutineScope which is likely to be an error.Use currentCoroutineContext() instead or specify the receiver of coroutineContext explicitly", replaceWith = @s0(expression = "currentCoroutineContext()", imports = {}))
    public static /* synthetic */ void j(f fVar) {
    }

    public static final boolean k(@dl.d f<?> fVar) {
        g.b1();
        throw new KotlinNothingValueException();
    }

    @kotlin.k(level = DeprecationLevel.ERROR, message = "isActive is resolved into the extension of outer CoroutineScope which is likely to be an error.Use currentCoroutineContext().isActive or cancellable() operator instead or specify the receiver of isActive explicitly. Additionally, flow {} builder emissions are cancellable by default.", replaceWith = @s0(expression = "currentCoroutineContext().isActive", imports = {}))
    public static /* synthetic */ void l(f fVar) {
    }

    @kotlin.k(level = DeprecationLevel.WARNING, message = "SharedFlow never completes, so this operator has no effect.", replaceWith = @s0(expression = "this", imports = {}))
    @sh.f
    private static final <T> e<T> m(n<? extends T> nVar, long j10, yh.p<? super Throwable, ? super kotlin.coroutines.c<? super Boolean>, ? extends Object> pVar) {
        return g.v1(nVar, j10, pVar);
    }

    static /* synthetic */ e n(n nVar, long j10, yh.p pVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = Long.MAX_VALUE;
        }
        if ((i10 & 2) != 0) {
            pVar = new LintKt$retry$1(null);
        }
        return g.v1(nVar, j10, pVar);
    }

    @kotlin.k(level = DeprecationLevel.WARNING, message = "SharedFlow never completes, so this operator has no effect.", replaceWith = @s0(expression = "this", imports = {}))
    @sh.f
    private static final <T> e<T> o(n<? extends T> nVar, yh.r<? super f<? super T>, ? super Throwable, ? super Long, ? super kotlin.coroutines.c<? super Boolean>, ? extends Object> rVar) {
        return g.x1(nVar, rVar);
    }

    @kotlin.k(level = DeprecationLevel.WARNING, message = "SharedFlow never completes, so this terminal operation never completes.")
    @sh.f
    private static final <T> Object p(n<? extends T> nVar, kotlin.coroutines.c<? super List<? extends T>> cVar) {
        c0.e(0);
        Object objC = FlowKt__CollectionKt.c(nVar, null, cVar, 1, null);
        c0.e(1);
        return objC;
    }

    @kotlin.k(level = DeprecationLevel.WARNING, message = "SharedFlow never completes, so this terminal operation never completes.")
    @sh.f
    private static final <T> Object q(n<? extends T> nVar, kotlin.coroutines.c<? super Set<? extends T>> cVar) {
        c0.e(0);
        Object objE = FlowKt__CollectionKt.e(nVar, null, cVar, 1, null);
        c0.e(1);
        return objE;
    }
}
