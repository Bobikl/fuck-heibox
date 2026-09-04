package kotlinx.coroutines;

import com.max.hblogistics.AddressListActivity;
import kotlin.Metadata;

/* JADX INFO: compiled from: CompletableDeferred.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00028\u00000\u0004B\u0011\u0012\b\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b\"\u0010#J\u000f\u0010\u0005\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\u0007\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJJ\u0010\u0011\u001a\u00020\u0010\"\u0004\b\u0001\u0010\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\n2\"\u0010\u000f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\fH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0017H\u0016R\u0014\u0010\u001c\u001a\u00020\u00148PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006$"}, d2 = {"Lkotlinx/coroutines/z;", androidx.exifinterface.media.a.f23244d5, "Lkotlinx/coroutines/JobSupport;", "Lkotlinx/coroutines/y;", "Lkotlinx/coroutines/selects/d;", "m", "()Ljava/lang/Object;", "p", "(Lkotlin/coroutines/c;)Ljava/lang/Object;", "R", "Lkotlinx/coroutines/selects/f;", AddressListActivity.N, "Lkotlin/Function2;", "Lkotlin/coroutines/c;", "", "block", "Lkotlin/b2;", "F", "(Lkotlinx/coroutines/selects/f;Lyh/p;)V", "value", "", androidx.exifinterface.media.a.W4, "(Ljava/lang/Object;)Z", "", "exception", "i", "Q0", "()Z", "onCancelComplete", "f0", "()Lkotlinx/coroutines/selects/d;", "onAwait", "Lkotlinx/coroutines/d2;", "parent", "<init>", "(Lkotlinx/coroutines/d2;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class z<T> extends JobSupport implements y<T>, kotlinx.coroutines.selects.d<T> {
    public z(@dl.e d2 d2Var) {
        super(true);
        W0(d2Var);
    }

    @Override // kotlinx.coroutines.y
    public boolean A(T value) {
        return e1(value);
    }

    @Override // kotlinx.coroutines.selects.d
    public <R> void F(@dl.d kotlinx.coroutines.selects.f<? super R> select, @dl.d yh.p<? super T, ? super kotlin.coroutines.c<? super R>, ? extends Object> block) {
        r1(select, block);
    }

    @Override // kotlinx.coroutines.JobSupport
    public boolean Q0() {
        return true;
    }

    @Override // kotlinx.coroutines.w0
    @dl.d
    public kotlinx.coroutines.selects.d<T> f0() {
        return this;
    }

    @Override // kotlinx.coroutines.y
    public boolean i(@dl.d Throwable exception) {
        return e1(new d0(exception, false, 2, null));
    }

    @Override // kotlinx.coroutines.w0
    public T m() {
        return (T) K0();
    }

    @Override // kotlinx.coroutines.w0
    @dl.e
    public Object p(@dl.d kotlin.coroutines.c<? super T> cVar) throws Throwable {
        Object objR0 = r0(cVar);
        kotlin.coroutines.intrinsics.b.h();
        return objR0;
    }
}
