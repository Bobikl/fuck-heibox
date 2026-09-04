package kotlinx.coroutines.channels;

import com.umeng.analytics.pro.ak;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.s0;

/* JADX INFO: compiled from: Channels.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a.\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a'\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\t"}, d2 = {androidx.exifinterface.media.a.S4, "Lkotlinx/coroutines/channels/b0;", "element", "Lkotlinx/coroutines/channels/n;", "Lkotlin/b2;", "b", "(Lkotlinx/coroutines/channels/b0;Ljava/lang/Object;)Ljava/lang/Object;", ak.av, "(Lkotlinx/coroutines/channels/b0;Ljava/lang/Object;)V", "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xs = "kotlinx/coroutines/channels/ChannelsKt")
public final /* synthetic */ class ChannelsKt__ChannelsKt {
    /* JADX WARN: Multi-variable type inference failed */
    @kotlin.k(level = DeprecationLevel.ERROR, message = "Deprecated in the favour of 'trySendBlocking'. Consider handling the result of 'trySendBlocking' explicitly and rethrow exception if necessary", replaceWith = @s0(expression = "trySendBlocking(element)", imports = {}))
    public static final <E> void a(@dl.d b0<? super E> b0Var, E e10) {
        if (n.m(b0Var.v(e10))) {
            return;
        }
        kotlinx.coroutines.j.b(null, new ChannelsKt__ChannelsKt$sendBlocking$1(b0Var, e10, null), 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @dl.d
    public static final <E> Object b(@dl.d b0<? super E> b0Var, E e10) {
        Object objV = b0Var.v(e10);
        if (objV instanceof n.c) {
            return ((n) kotlinx.coroutines.j.b(null, new ChannelsKt__ChannelsKt$trySendBlocking$2(b0Var, e10, null), 1, null)).getHolder();
        }
        return n.INSTANCE.c(b2.f124493a);
    }
}
