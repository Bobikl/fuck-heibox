package kotlinx.coroutines.channels;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.b2;

/* JADX INFO: compiled from: Channel.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aX\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012#\u0010\u0007\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00028\u00000\u0002H\u0086\bø\u0001\u0000ø\u0001\u0001\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0000¢\u0006\u0004\b\b\u0010\t\u001a\\\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012!\u0010\f\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0002H\u0086\bø\u0001\u0000ø\u0001\u0001\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0000¢\u0006\u0004\b\r\u0010\t\u001a^\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012#\u0010\f\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u000b0\u0002H\u0086\bø\u0001\u0000ø\u0001\u0001\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0000¢\u0006\u0004\b\u000e\u0010\t\u001a^\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012#\u0010\f\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u000b0\u0002H\u0086\bø\u0001\u0000ø\u0001\u0001\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0000¢\u0006\u0004\b\u000f\u0010\t\u001a>\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016\"\u0004\b\u0000\u0010\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\u0016\b\u0002\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0002\u001a\u001e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016\"\u0004\b\u0000\u0010\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0007\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0019"}, d2 = {androidx.exifinterface.media.a.f23244d5, "Lkotlinx/coroutines/channels/n;", "Lkotlin/Function1;", "", "Lkotlin/m0;", "name", "exception", "onFailure", "e", "(Ljava/lang/Object;Lyh/l;)Ljava/lang/Object;", "value", "Lkotlin/b2;", "action", RXScreenCaptureService.KEY_HEIGHT, "g", "f", androidx.exifinterface.media.a.S4, "", "capacity", "Lkotlinx/coroutines/channels/BufferOverflow;", "onBufferOverflow", "onUndeliveredElement", "Lkotlinx/coroutines/channels/k;", "b", ak.av, "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
public final class m {
    @kotlin.k(level = DeprecationLevel.HIDDEN, message = "Since 1.4.0, binary compatibility with earlier versions")
    public static final /* synthetic */ k a(int i10) {
        return d(i10, null, null, 6, null);
    }

    @dl.d
    public static final <E> k<E> b(int i10, @dl.d BufferOverflow bufferOverflow, @dl.e yh.l<? super E, b2> lVar) {
        if (i10 == -2) {
            return new g(bufferOverflow == BufferOverflow.SUSPEND ? k.INSTANCE.a() : 1, bufferOverflow, lVar);
        }
        if (i10 == -1) {
            if ((bufferOverflow != BufferOverflow.SUSPEND ? 0 : 1) != 0) {
                return new r(lVar);
            }
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow".toString());
        }
        if (i10 == 0) {
            return bufferOverflow == BufferOverflow.SUSPEND ? new z(lVar) : new g(1, bufferOverflow, lVar);
        }
        if (i10 != Integer.MAX_VALUE) {
            return (i10 == 1 && bufferOverflow == BufferOverflow.DROP_OLDEST) ? new r(lVar) : new g(i10, bufferOverflow, lVar);
        }
        return new u(lVar);
    }

    public static /* synthetic */ k c(int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        return a(i10);
    }

    public static /* synthetic */ k d(int i10, BufferOverflow bufferOverflow, yh.l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        if ((i11 & 2) != 0) {
            bufferOverflow = BufferOverflow.SUSPEND;
        }
        if ((i11 & 4) != 0) {
            lVar = null;
        }
        return b(i10, bufferOverflow, lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> T e(@dl.d Object obj, @dl.d yh.l<? super Throwable, ? extends T> lVar) {
        return obj instanceof n.c ? lVar.invoke(n.f(obj)) : obj;
    }

    @dl.d
    public static final <T> Object f(@dl.d Object obj, @dl.d yh.l<? super Throwable, b2> lVar) {
        if (obj instanceof n.Closed) {
            lVar.invoke(n.f(obj));
        }
        return obj;
    }

    @dl.d
    public static final <T> Object g(@dl.d Object obj, @dl.d yh.l<? super Throwable, b2> lVar) {
        if (obj instanceof n.c) {
            lVar.invoke(n.f(obj));
        }
        return obj;
    }

    @dl.d
    public static final <T> Object h(@dl.d Object obj, @dl.d yh.l<? super T, b2> lVar) {
        if (!(obj instanceof n.c)) {
            lVar.invoke(obj);
        }
        return obj;
    }
}
