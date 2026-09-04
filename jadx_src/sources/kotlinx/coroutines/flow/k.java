package kotlinx.coroutines.flow;

import com.umeng.analytics.pro.ak;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.d2;

/* JADX INFO: compiled from: Share.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00028\u00000\u0004B\u001f\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0096Aø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ&\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u00168\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0017\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, d2 = {"Lkotlinx/coroutines/flow/k;", androidx.exifinterface.media.a.f23244d5, "Lkotlinx/coroutines/flow/n;", "Lkotlinx/coroutines/flow/a;", "Lkotlinx/coroutines/flow/internal/i;", "Lkotlinx/coroutines/flow/f;", "collector", "", ak.av, "(Lkotlinx/coroutines/flow/f;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lkotlin/coroutines/CoroutineContext;", com.umeng.analytics.pro.d.R, "", "capacity", "Lkotlinx/coroutines/channels/BufferOverflow;", "onBufferOverflow", "Lkotlinx/coroutines/flow/e;", "f", "Lkotlinx/coroutines/d2;", "b", "Lkotlinx/coroutines/d2;", "job", "", "()Ljava/util/List;", "replayCache", "flow", "<init>", "(Lkotlinx/coroutines/flow/n;Lkotlinx/coroutines/d2;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class k<T> implements n<T>, a<T>, kotlinx.coroutines.flow.internal.i<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private final d2 job;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ n<T> f130089c;

    /* JADX WARN: Multi-variable type inference failed */
    public k(@dl.d n<? extends T> nVar, @dl.e d2 d2Var) {
        this.job = d2Var;
        this.f130089c = nVar;
    }

    @Override // kotlinx.coroutines.flow.n, kotlinx.coroutines.flow.e
    @dl.e
    public Object a(@dl.d f<? super T> fVar, @dl.d kotlin.coroutines.c<?> cVar) {
        return this.f130089c.a(fVar, cVar);
    }

    @Override // kotlinx.coroutines.flow.n
    @dl.d
    public List<T> b() {
        return this.f130089c.b();
    }

    @Override // kotlinx.coroutines.flow.internal.i
    @dl.d
    public e<T> f(@dl.d CoroutineContext context, int capacity, @dl.d BufferOverflow onBufferOverflow) {
        return o.e(this, context, capacity, onBufferOverflow);
    }
}
