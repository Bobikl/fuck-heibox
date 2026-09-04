package kotlinx.coroutines;

import com.max.hblogistics.AddressListActivity;
import kotlin.Metadata;

/* JADX INFO: compiled from: JobSupport.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B6\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u001c\u0010\u000e\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000bø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0096\u0002R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Lkotlinx/coroutines/b3;", "R", "Lkotlinx/coroutines/j2;", "", "cause", "Lkotlin/b2;", "j0", "Lkotlinx/coroutines/selects/f;", "f", "Lkotlinx/coroutines/selects/f;", AddressListActivity.N, "Lkotlin/Function1;", "Lkotlin/coroutines/c;", "", "block", "<init>", "(Lkotlinx/coroutines/selects/f;Lyh/l;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class b3<R> extends j2 {

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final kotlinx.coroutines.selects.f<R> select;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private final yh.l<kotlin.coroutines.c<? super R>, Object> f128740g;

    /* JADX WARN: Multi-variable type inference failed */
    public b3(@dl.d kotlinx.coroutines.selects.f<? super R> fVar, @dl.d yh.l<? super kotlin.coroutines.c<? super R>, ? extends Object> lVar) {
        this.select = fVar;
        this.f128740g = lVar;
    }

    @Override // yh.l
    public /* bridge */ /* synthetic */ kotlin.b2 invoke(Throwable th2) throws Throwable {
        j0(th2);
        return kotlin.b2.f124493a;
    }

    @Override // kotlinx.coroutines.f0
    public void j0(@dl.e Throwable th2) throws Throwable {
        if (this.select.q()) {
            bj.a.d(this.f128740g, this.select.r());
        }
    }
}
