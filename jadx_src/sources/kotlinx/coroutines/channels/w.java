package kotlinx.coroutines.channels;

import com.umeng.analytics.pro.ak;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.s0;
import kotlinx.coroutines.q0;

/* JADX INFO: compiled from: Produce.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lkotlinx/coroutines/channels/w;", androidx.exifinterface.media.a.S4, "Lkotlinx/coroutines/q0;", "Lkotlinx/coroutines/channels/b0;", ak.aF, "()Lkotlinx/coroutines/channels/b0;", "channel", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public interface w<E> extends q0, b0<E> {

    /* JADX INFO: compiled from: Produce.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class a {
        @kotlin.k(level = DeprecationLevel.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @s0(expression = "trySend(element).isSuccess", imports = {}))
        public static <E> boolean a(@dl.d w<? super E> wVar, E e10) {
            return b0.a.c(wVar, e10);
        }
    }

    @dl.d
    b0<E> c();
}
