package kotlinx.coroutines;

import com.max.hblogistics.AddressListActivity;
import kotlin.Metadata;

/* JADX INFO: compiled from: JobSupport.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B<\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\b\u0012\"\u0010\u000f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\fø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0096\u0002R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Lkotlinx/coroutines/a3;", androidx.exifinterface.media.a.f23244d5, "R", "Lkotlinx/coroutines/j2;", "", "cause", "Lkotlin/b2;", "j0", "Lkotlinx/coroutines/selects/f;", "f", "Lkotlinx/coroutines/selects/f;", AddressListActivity.N, "Lkotlin/Function2;", "Lkotlin/coroutines/c;", "", "block", "<init>", "(Lkotlinx/coroutines/selects/f;Lyh/p;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class a3<T, R> extends j2 {

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final kotlinx.coroutines.selects.f<R> select;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private final yh.p<T, kotlin.coroutines.c<? super R>, Object> f128721g;

    /* JADX WARN: Multi-variable type inference failed */
    public a3(@dl.d kotlinx.coroutines.selects.f<? super R> fVar, @dl.d yh.p<? super T, ? super kotlin.coroutines.c<? super R>, ? extends Object> pVar) {
        this.select = fVar;
        this.f128721g = pVar;
    }

    @Override // yh.l
    public /* bridge */ /* synthetic */ kotlin.b2 invoke(Throwable th2) throws Throwable {
        j0(th2);
        return kotlin.b2.f124493a;
    }

    @Override // kotlinx.coroutines.f0
    public void j0(@dl.e Throwable th2) throws Throwable {
        if (this.select.q()) {
            k0().t1(this.select, this.f128721g);
        }
    }
}
