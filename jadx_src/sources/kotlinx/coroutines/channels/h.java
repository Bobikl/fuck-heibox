package kotlinx.coroutines.channels;

import com.umeng.analytics.pro.ak;
import java.util.concurrent.CancellationException;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.s0;
import kotlinx.coroutines.s2;

/* JADX INFO: compiled from: BroadcastChannel.kt */
/* JADX INFO: loaded from: classes5.dex */
@s2
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\bg\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H&J\u001a\u0010\t\u001a\u00020\b2\u0010\b\u0002\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006H&J\u0014\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\nH'¨\u0006\r"}, d2 = {"Lkotlinx/coroutines/channels/h;", androidx.exifinterface.media.a.S4, "Lkotlinx/coroutines/channels/b0;", "Lkotlinx/coroutines/channels/ReceiveChannel;", ak.aG, "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "cause", "Lkotlin/b2;", "e", "", "", "b", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public interface h<E> extends b0<E> {

    /* JADX INFO: compiled from: BroadcastChannel.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class a {
        public static /* synthetic */ void a(h hVar, CancellationException cancellationException, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i10 & 1) != 0) {
                cancellationException = null;
            }
            hVar.e(cancellationException);
        }

        public static /* synthetic */ boolean b(h hVar, Throwable th2, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i10 & 1) != 0) {
                th2 = null;
            }
            return hVar.b(th2);
        }

        @kotlin.k(level = DeprecationLevel.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @s0(expression = "trySend(element).isSuccess", imports = {}))
        public static <E> boolean c(@dl.d h<E> hVar, E e10) {
            return b0.a.c(hVar, e10);
        }
    }

    @kotlin.k(level = DeprecationLevel.HIDDEN, message = "Binary compatibility only")
    /* synthetic */ boolean b(Throwable cause);

    void e(@dl.e CancellationException cancellationException);

    @dl.d
    ReceiveChannel<E> u();
}
