package kotlinx.coroutines.channels;

import com.umeng.analytics.pro.ak;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.s0;
import kotlinx.coroutines.q0;
import kotlinx.coroutines.s2;

/* JADX INFO: compiled from: Actor.kt */
/* JADX INFO: loaded from: classes5.dex */
@s2
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lkotlinx/coroutines/channels/e;", androidx.exifinterface.media.a.S4, "Lkotlinx/coroutines/q0;", "Lkotlinx/coroutines/channels/ReceiveChannel;", "Lkotlinx/coroutines/channels/k;", ak.aF, "()Lkotlinx/coroutines/channels/k;", "channel", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public interface e<E> extends q0, ReceiveChannel<E> {

    /* JADX INFO: compiled from: Actor.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class a {
        @dl.d
        public static <E> kotlinx.coroutines.selects.d<E> b(@dl.d e<E> eVar) {
            return ReceiveChannel.DefaultImpls.d(eVar);
        }

        @kotlin.k(level = DeprecationLevel.ERROR, message = "Deprecated in the favour of 'tryReceive'. Please note that the provided replacement does not rethrow channel's close cause as 'poll' did, for the precise replacement please refer to the 'poll' documentation", replaceWith = @s0(expression = "tryReceive().getOrNull()", imports = {}))
        @dl.e
        public static <E> E c(@dl.d e<E> eVar) {
            return (E) ReceiveChannel.DefaultImpls.h(eVar);
        }

        @kotlin.k(level = DeprecationLevel.ERROR, message = "Deprecated in favor of 'receiveCatching'. Please note that the provided replacement does not rethrow channel's close cause as 'receiveOrNull' did, for the detailed replacement please refer to the 'receiveOrNull' documentation", replaceWith = @s0(expression = "receiveCatching().getOrNull()", imports = {}))
        @sh.h
        @dl.e
        public static <E> Object d(@dl.d e<E> eVar, @dl.d kotlin.coroutines.c<? super E> cVar) {
            return ReceiveChannel.DefaultImpls.i(eVar, cVar);
        }
    }

    @dl.d
    k<E> c();
}
