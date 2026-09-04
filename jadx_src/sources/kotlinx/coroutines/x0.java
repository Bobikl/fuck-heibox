package kotlinx.coroutines;

import com.max.hblogistics.AddressListActivity;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: compiled from: Builders.common.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0012\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00028\u00000\u0004B\u0017\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u0005\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\u0007\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJJ\u0010\u0011\u001a\u00020\u0010\"\u0004\b\u0001\u0010\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\n2\"\u0010\u000f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\fH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, d2 = {"Lkotlinx/coroutines/x0;", androidx.exifinterface.media.a.f23244d5, "Lkotlinx/coroutines/a;", "Lkotlinx/coroutines/w0;", "Lkotlinx/coroutines/selects/d;", "m", "()Ljava/lang/Object;", "p", "(Lkotlin/coroutines/c;)Ljava/lang/Object;", "R", "Lkotlinx/coroutines/selects/f;", AddressListActivity.N, "Lkotlin/Function2;", "Lkotlin/coroutines/c;", "", "block", "Lkotlin/b2;", "F", "(Lkotlinx/coroutines/selects/f;Lyh/p;)V", "f0", "()Lkotlinx/coroutines/selects/d;", "onAwait", "Lkotlin/coroutines/CoroutineContext;", "parentContext", "", "active", "<init>", "(Lkotlin/coroutines/CoroutineContext;Z)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public class x0<T> extends a<T> implements w0<T>, kotlinx.coroutines.selects.d<T> {
    public x0(@dl.d CoroutineContext coroutineContext, boolean z10) {
        super(coroutineContext, true, z10);
    }

    static /* synthetic */ Object K1(x0 x0Var, kotlin.coroutines.c cVar) throws Throwable {
        Object objR0 = x0Var.r0(cVar);
        kotlin.coroutines.intrinsics.b.h();
        return objR0;
    }

    @Override // kotlinx.coroutines.selects.d
    public <R> void F(@dl.d kotlinx.coroutines.selects.f<? super R> select, @dl.d yh.p<? super T, ? super kotlin.coroutines.c<? super R>, ? extends Object> block) {
        r1(select, block);
    }

    @Override // kotlinx.coroutines.w0
    @dl.d
    public kotlinx.coroutines.selects.d<T> f0() {
        return this;
    }

    @Override // kotlinx.coroutines.w0
    public T m() {
        return (T) K0();
    }

    @Override // kotlinx.coroutines.w0
    @dl.e
    public Object p(@dl.d kotlin.coroutines.c<? super T> cVar) {
        return K1(this, cVar);
    }
}
