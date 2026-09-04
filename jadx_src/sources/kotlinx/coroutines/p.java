package kotlinx.coroutines;

import kotlin.Metadata;

/* JADX INFO: compiled from: CancellableContinuation.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002J%\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00028\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H'¢\u0006\u0004\b\u0006\u0010\u0007JH\u0010\u000f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00028\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042#\u0010\u000e\u001a\u001f\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r\u0018\u00010\bH'¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0011\u001a\u00020\tH'J\u0010\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0004H'J\b\u0010\u0015\u001a\u00020\rH'J\u0014\u0010\u0017\u001a\u00020\u00162\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\tH&J1\u0010\u001a\u001a\u00020\r2'\u0010\u0019\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\bj\u0002`\u0018H&J\u001b\u0010\u001c\u001a\u00020\r*\u00020\u001b2\u0006\u0010\u0003\u001a\u00028\u0000H'¢\u0006\u0004\b\u001c\u0010\u001dJ\u0014\u0010\u001e\u001a\u00020\r*\u00020\u001b2\u0006\u0010\u0011\u001a\u00020\tH'J<\u0010\u001f\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00028\u00002#\u0010\u000e\u001a\u001f\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r\u0018\u00010\bH'¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\u00168&X¦\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020\u00168&X¦\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\"R\u0014\u0010%\u001a\u00020\u00168&X¦\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\"¨\u0006&"}, d2 = {"Lkotlinx/coroutines/p;", androidx.exifinterface.media.a.f23244d5, "Lkotlin/coroutines/c;", "value", "", "idempotent", androidx.exifinterface.media.a.T4, "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlin/Function1;", "", "Lkotlin/m0;", "name", "cause", "Lkotlin/b2;", "onCancellation", "D", "(Ljava/lang/Object;Ljava/lang/Object;Lyh/l;)Ljava/lang/Object;", "exception", "c0", "token", androidx.exifinterface.media.a.X4, "F0", "", "b", "Lkotlinx/coroutines/CompletionHandler;", "handler", "L", "Lkotlinx/coroutines/CoroutineDispatcher;", "s0", "(Lkotlinx/coroutines/CoroutineDispatcher;Ljava/lang/Object;)V", "j", "I0", "(Ljava/lang/Object;Lyh/l;)V", "isActive", "()Z", "x", "isCompleted", "isCancelled", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public interface p<T> extends kotlin.coroutines.c<T> {

    /* JADX INFO: compiled from: CancellableContinuation.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class a {
        public static /* synthetic */ boolean a(p pVar, Throwable th2, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i10 & 1) != 0) {
                th2 = null;
            }
            return pVar.b(th2);
        }

        public static /* synthetic */ Object b(p pVar, Object obj, Object obj2, int i10, Object obj3) {
            if (obj3 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tryResume");
            }
            if ((i10 & 2) != 0) {
                obj2 = null;
            }
            return pVar.W(obj, obj2);
        }
    }

    @z1
    @dl.e
    Object D(T value, @dl.e Object idempotent, @dl.e yh.l<? super Throwable, kotlin.b2> onCancellation);

    @z1
    void F0();

    @t1
    void I0(T value, @dl.e yh.l<? super Throwable, kotlin.b2> onCancellation);

    void L(@dl.d yh.l<? super Throwable, kotlin.b2> lVar);

    @z1
    void V(@dl.d Object obj);

    @z1
    @dl.e
    Object W(T value, @dl.e Object idempotent);

    boolean b(@dl.e Throwable cause);

    @z1
    @dl.e
    Object c0(@dl.d Throwable exception);

    boolean isActive();

    boolean isCancelled();

    @t1
    void j(@dl.d CoroutineDispatcher coroutineDispatcher, @dl.d Throwable th2);

    @t1
    void s0(@dl.d CoroutineDispatcher coroutineDispatcher, T t10);

    boolean x();
}
