package kotlinx.coroutines.channels;

import com.umeng.analytics.pro.ak;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.t0;

/* JADX INFO: compiled from: Channel.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002J\u0013\u0010\u0004\u001a\u00020\u0003H¦Bø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\u0006\u001a\u00028\u0000H\u0097@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0005J\u0010\u0010\u0007\u001a\u00028\u0000H¦\u0002¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\t"}, d2 = {"Lkotlinx/coroutines/channels/ChannelIterator;", androidx.exifinterface.media.a.S4, "", "", "b", "(Lkotlin/coroutines/c;)Ljava/lang/Object;", ak.av, "next", "()Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public interface ChannelIterator<E> {

    /* JADX INFO: compiled from: Channel.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class DefaultImpls {
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @kotlin.k(level = DeprecationLevel.HIDDEN, message = "Since 1.3.0, binary compatibility with versions <= 1.2.x")
        @xh.h(name = "next")
        public static /* synthetic */ Object a(ChannelIterator channelIterator, kotlin.coroutines.c cVar) throws Throwable {
            ChannelIterator$next0$1 channelIterator$next0$1;
            if (cVar instanceof ChannelIterator$next0$1) {
                channelIterator$next0$1 = (ChannelIterator$next0$1) cVar;
                int i10 = channelIterator$next0$1.f128779d;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    channelIterator$next0$1.f128779d = i10 - Integer.MIN_VALUE;
                } else {
                    channelIterator$next0$1 = new ChannelIterator$next0$1(cVar);
                }
            } else {
                channelIterator$next0$1 = new ChannelIterator$next0$1(cVar);
            }
            Object objB = channelIterator$next0$1.f128778c;
            Object objH = kotlin.coroutines.intrinsics.b.h();
            int i11 = channelIterator$next0$1.f128779d;
            if (i11 == 0) {
                t0.n(objB);
                channelIterator$next0$1.f128777b = channelIterator;
                channelIterator$next0$1.f128779d = 1;
                objB = channelIterator.b(channelIterator$next0$1);
                if (objB == objH) {
                    return objH;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                channelIterator = (ChannelIterator) channelIterator$next0$1.f128777b;
                t0.n(objB);
            }
            if (((Boolean) objB).booleanValue()) {
                return channelIterator.next();
            }
            throw new ClosedReceiveChannelException(o.f129069a);
        }
    }

    @kotlin.k(level = DeprecationLevel.HIDDEN, message = "Since 1.3.0, binary compatibility with versions <= 1.2.x")
    @xh.h(name = "next")
    /* synthetic */ Object a(kotlin.coroutines.c cVar);

    @dl.e
    Object b(@dl.d kotlin.coroutines.c<? super Boolean> cVar);

    E next();
}
