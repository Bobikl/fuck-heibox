package androidx.paging;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import kotlin.b2;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: compiled from: AsyncPagingDataDiffer.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001JO\u0010\f\u001a\u0004\u0018\u00010\u00072\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0096@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000f\u001a\u00020\u000eH\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"androidx/paging/AsyncPagingDataDiffer$differBase$1", "Landroidx/paging/PagingDataDiffer;", "Landroidx/paging/b0;", "previousList", "newList", "Landroidx/paging/d;", "newCombinedLoadStates", "", "lastAccessedIndex", "Lkotlin/Function0;", "Lkotlin/b2;", "onListPresentable", "x", "(Landroidx/paging/b0;Landroidx/paging/b0;Landroidx/paging/d;ILyh/a;Lkotlin/coroutines/c;)Ljava/lang/Object;", "", RXScreenCaptureService.KEY_WIDTH, "paging-runtime_release"}, k = 1, mv = {1, 4, 2})
public final class AsyncPagingDataDiffer$differBase$1<T> extends PagingDataDiffer<T> {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final /* synthetic */ AsyncPagingDataDiffer f25384l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AsyncPagingDataDiffer$differBase$1(AsyncPagingDataDiffer asyncPagingDataDiffer, e eVar, CoroutineDispatcher coroutineDispatcher) {
        super(eVar, coroutineDispatcher);
        this.f25384l = asyncPagingDataDiffer;
    }

    @Override // androidx.paging.PagingDataDiffer
    public boolean w() {
        return this.f25384l.getInGetItem();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.paging.PagingDataDiffer
    @dl.e
    public Object x(@dl.d b0<T> b0Var, @dl.d b0<T> b0Var2, @dl.d CombinedLoadStates combinedLoadStates, int i10, @dl.d yh.a<b2> aVar, @dl.d kotlin.coroutines.c<? super Integer> cVar) throws Throwable {
        AsyncPagingDataDiffer$differBase$1$presentNewList$1 asyncPagingDataDiffer$differBase$1$presentNewList$1;
        AsyncPagingDataDiffer$differBase$1<T> asyncPagingDataDiffer$differBase$1;
        if (cVar instanceof AsyncPagingDataDiffer$differBase$1$presentNewList$1) {
            asyncPagingDataDiffer$differBase$1$presentNewList$1 = (AsyncPagingDataDiffer$differBase$1$presentNewList$1) cVar;
            int i11 = asyncPagingDataDiffer$differBase$1$presentNewList$1.f25386c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                asyncPagingDataDiffer$differBase$1$presentNewList$1.f25386c = i11 - Integer.MIN_VALUE;
            } else {
                asyncPagingDataDiffer$differBase$1$presentNewList$1 = new AsyncPagingDataDiffer$differBase$1$presentNewList$1(this, cVar);
            }
        } else {
            asyncPagingDataDiffer$differBase$1$presentNewList$1 = new AsyncPagingDataDiffer$differBase$1$presentNewList$1(this, cVar);
        }
        Object objH = asyncPagingDataDiffer$differBase$1$presentNewList$1.f25385b;
        Object objH2 = kotlin.coroutines.intrinsics.b.h();
        int i12 = asyncPagingDataDiffer$differBase$1$presentNewList$1.f25386c;
        if (i12 == 0) {
            kotlin.t0.n(objH);
            if (b0Var.a() == 0) {
                aVar.invoke();
                this.f25384l.getDifferCallback().onInserted(0, b0Var2.a());
                return null;
            }
            if (b0Var2.a() == 0) {
                aVar.invoke();
                this.f25384l.getDifferCallback().onRemoved(0, b0Var.a());
                return null;
            }
            CoroutineDispatcher coroutineDispatcher = this.f25384l.workerDispatcher;
            AsyncPagingDataDiffer$differBase$1$presentNewList$diffResult$1 asyncPagingDataDiffer$differBase$1$presentNewList$diffResult$1 = new AsyncPagingDataDiffer$differBase$1$presentNewList$diffResult$1(this, b0Var, b0Var2, null);
            asyncPagingDataDiffer$differBase$1$presentNewList$1.f25388e = this;
            asyncPagingDataDiffer$differBase$1$presentNewList$1.f25389f = b0Var;
            asyncPagingDataDiffer$differBase$1$presentNewList$1.f25390g = b0Var2;
            asyncPagingDataDiffer$differBase$1$presentNewList$1.f25391h = aVar;
            asyncPagingDataDiffer$differBase$1$presentNewList$1.f25392i = i10;
            asyncPagingDataDiffer$differBase$1$presentNewList$1.f25386c = 1;
            objH = kotlinx.coroutines.i.h(coroutineDispatcher, asyncPagingDataDiffer$differBase$1$presentNewList$diffResult$1, asyncPagingDataDiffer$differBase$1$presentNewList$1);
            if (objH == objH2) {
                return objH2;
            }
            asyncPagingDataDiffer$differBase$1 = this;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i10 = asyncPagingDataDiffer$differBase$1$presentNewList$1.f25392i;
            aVar = (yh.a) asyncPagingDataDiffer$differBase$1$presentNewList$1.f25391h;
            b0Var2 = (b0) asyncPagingDataDiffer$differBase$1$presentNewList$1.f25390g;
            b0Var = (b0) asyncPagingDataDiffer$differBase$1$presentNewList$1.f25389f;
            asyncPagingDataDiffer$differBase$1 = (AsyncPagingDataDiffer$differBase$1) asyncPagingDataDiffer$differBase$1$presentNewList$1.f25388e;
            kotlin.t0.n(objH);
        }
        a0 a0Var = (a0) objH;
        aVar.invoke();
        c0.b(b0Var, asyncPagingDataDiffer$differBase$1.f25384l.updateCallback, b0Var2, a0Var);
        return kotlin.coroutines.jvm.internal.a.f(c0.c(b0Var, a0Var, b0Var2, i10));
    }
}
