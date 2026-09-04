package kotlinx.coroutines.channels;

import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.s0;
import kotlinx.coroutines.internal.n0;
import kotlinx.coroutines.t1;

/* JADX INFO: compiled from: Channel.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u0002J\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H¦@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J&\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00072\u0006\u0010\u0003\u001a\u00028\u0000H&ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\b\u0010\tJ\u0014\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH&J-\u0010\u0012\u001a\u00020\u00042#\u0010\u0011\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\n¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u00040\u000eH'J\u0017\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00028\u0000H\u0017¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0019\u001a\u00020\f8&X§\u0004¢\u0006\f\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016R&\u0010\u001d\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00000\u001a8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u001e"}, d2 = {"Lkotlinx/coroutines/channels/b0;", androidx.exifinterface.media.a.S4, "", "element", "Lkotlin/b2;", "X", "(Ljava/lang/Object;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/n;", "v", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "cause", "", "U", "Lkotlin/Function1;", "Lkotlin/m0;", "name", "handler", "J", "offer", "(Ljava/lang/Object;)Z", "O", "()Z", "isClosedForSend$annotations", "()V", "isClosedForSend", "Lkotlinx/coroutines/selects/e;", "l", "()Lkotlinx/coroutines/selects/e;", "onSend", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public interface b0<E> {

    /* JADX INFO: compiled from: Channel.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class a {
        public static /* synthetic */ boolean a(b0 b0Var, Throwable th2, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: close");
            }
            if ((i10 & 1) != 0) {
                th2 = null;
            }
            return b0Var.U(th2);
        }

        @t1
        public static /* synthetic */ void b() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @kotlin.k(level = DeprecationLevel.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @s0(expression = "trySend(element).isSuccess", imports = {}))
        public static <E> boolean c(@dl.d b0<? super E> b0Var, E e10) throws Throwable {
            Object objV = b0Var.v(e10);
            if (n.m(objV)) {
                return true;
            }
            Throwable thF = n.f(objV);
            if (thF == null) {
                return false;
            }
            throw n0.p(thF);
        }
    }

    @t1
    void J(@dl.d yh.l<? super Throwable, b2> lVar);

    boolean O();

    boolean U(@dl.e Throwable cause);

    @dl.e
    Object X(E e10, @dl.d kotlin.coroutines.c<? super b2> cVar);

    @dl.d
    kotlinx.coroutines.selects.e<E, b0<E>> l();

    @kotlin.k(level = DeprecationLevel.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @s0(expression = "trySend(element).isSuccess", imports = {}))
    boolean offer(E element);

    @dl.d
    Object v(E element);
}
