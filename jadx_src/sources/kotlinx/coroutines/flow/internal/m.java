package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlin.b2;
import kotlinx.coroutines.channels.b0;
import kotlinx.coroutines.z1;

/* JADX INFO: compiled from: SendingCollector.kt */
/* JADX INFO: loaded from: classes5.dex */
@z1
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Lkotlinx/coroutines/flow/internal/m;", androidx.exifinterface.media.a.f23244d5, "Lkotlinx/coroutines/flow/f;", "value", "Lkotlin/b2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/b0;", "b", "Lkotlinx/coroutines/channels/b0;", "channel", "<init>", "(Lkotlinx/coroutines/channels/b0;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class m<T> implements kotlinx.coroutines.flow.f<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final b0<T> channel;

    /* JADX WARN: Multi-variable type inference failed */
    public m(@dl.d b0<? super T> b0Var) {
        this.channel = b0Var;
    }

    @Override // kotlinx.coroutines.flow.f
    @dl.e
    public Object emit(T t10, @dl.d kotlin.coroutines.c<? super b2> cVar) {
        Object objX = this.channel.X(t10, cVar);
        return objX == kotlin.coroutines.intrinsics.b.h() ? objX : b2.f124493a;
    }
}
