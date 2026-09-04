package com.heybox.imageviewer.adapter;

import androidx.lifecycle.i0;
import androidx.paging.PagingState;
import androidx.paging.q0;
import com.heybox.imageviewer.core.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.e;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.b2;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlinx.coroutines.p;
import kotlinx.coroutines.q;
import yh.l;

/* JADX INFO: compiled from: Repository.kt */
/* JADX INFO: loaded from: classes7.dex */
@t0({"SMAP\nRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Repository.kt\ncom/heybox/imageviewer/adapter/Repository$dataSource$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,58:1\n1#2:59\n314#3,11:60\n314#3,11:71\n*S KotlinDebug\n*F\n+ 1 Repository.kt\ncom/heybox/imageviewer/adapter/Repository$dataSource$1\n*L\n26#1:60,11\n35#1:71,11\n*E\n"})
public final class Repository$dataSource$1 extends q0<Long, d> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ Repository f59708c;

    Repository$dataSource$1(Repository repository) {
        this.f59708c = repository;
    }

    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Long, java.lang.Object] */
    @Override // androidx.paging.q0
    public /* bridge */ /* synthetic */ Long f(PagingState<Long, d> pagingState) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{pagingState}, this, changeQuickRedirect, false, 111, new Class[]{PagingState.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : k(pagingState);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0039  */
    /* JADX WARN: Code duplicated, block: B:44:0x012a  */
    /* JADX WARN: Code duplicated, block: B:45:0x0133  */
    /* JADX WARN: Code duplicated, block: B:48:0x013c  */
    /* JADX WARN: Code duplicated, block: B:61:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:62:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:65:0x01bf  */
    @Override // androidx.paging.q0
    @e
    public Object h(@dl.d q0.a<Long> aVar, @dl.d kotlin.coroutines.c<? super q0.b<Long, d>> cVar) throws Throwable {
        Repository$dataSource$1$load$1 repository$dataSource$1$load$1;
        Repository$dataSource$1 repository$dataSource$1;
        Repository$dataSource$1 repository$dataSource$2;
        d dVar;
        Long lG;
        d dVar2;
        Long lG2;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{aVar, cVar}, this, changeQuickRedirect, false, 110, new Class[]{q0.a.class, kotlin.coroutines.c.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        if (cVar instanceof Repository$dataSource$1$load$1) {
            repository$dataSource$1$load$1 = (Repository$dataSource$1$load$1) cVar;
            int i10 = repository$dataSource$1$load$1.f59714g;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                repository$dataSource$1$load$1.f59714g = i10 - Integer.MIN_VALUE;
            } else {
                repository$dataSource$1$load$1 = new Repository$dataSource$1$load$1(this, cVar);
            }
        } else {
            repository$dataSource$1$load$1 = new Repository$dataSource$1$load$1(this, cVar);
        }
        Object objT = repository$dataSource$1$load$1.f59712e;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i11 = repository$dataSource$1$load$1.f59714g;
        if (i11 != 0) {
            if (i11 == 1) {
                repository$dataSource$2 = (Repository$dataSource$1) repository$dataSource$1$load$1.f59709b;
                kotlin.t0.n(objT);
                List list = (List) objT;
                i0 i0Var = repository$dataSource$2.f59708c.f59705b;
                List listT5 = CollectionsKt___CollectionsKt.T5(repository$dataSource$2.f59708c.g());
                listT5.addAll(list);
                i0Var.r(listT5);
                dVar = (d) CollectionsKt___CollectionsKt.B2(list);
                if (dVar != null) {
                    lG = kotlin.coroutines.jvm.internal.a.g(dVar.id());
                } else {
                    lG = null;
                }
                d dVar3 = (d) CollectionsKt___CollectionsKt.q3(list);
                return new q0.b.Page(list, lG, dVar3 != null ? kotlin.coroutines.jvm.internal.a.g(dVar3.id()) : null);
            }
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            repository$dataSource$1 = (Repository$dataSource$1) repository$dataSource$1$load$1.f59709b;
            kotlin.t0.n(objT);
            List list2 = (List) objT;
            i0 i0Var2 = repository$dataSource$1.f59708c.f59705b;
            List listT6 = CollectionsKt___CollectionsKt.T5(repository$dataSource$1.f59708c.g());
            listT6.addAll(0, list2);
            i0Var2.r(listT6);
            dVar2 = (d) CollectionsKt___CollectionsKt.B2(list2);
            if (dVar2 != null) {
                lG2 = kotlin.coroutines.jvm.internal.a.g(dVar2.id());
            } else {
                lG2 = null;
            }
            d dVar4 = (d) CollectionsKt___CollectionsKt.q3(list2);
            return new q0.b.Page(list2, lG2, dVar4 != null ? kotlin.coroutines.jvm.internal.a.g(dVar4.id()) : null);
        }
        kotlin.t0.n(objT);
        if (aVar instanceof q0.a.d) {
            List<d> listG = this.f59708c.g();
            Repository repository = this.f59708c;
            if (listG.isEmpty()) {
                listG = Repository.c(repository).d();
            }
            this.f59708c.f59705b.r(listG);
            d dVar5 = (d) CollectionsKt___CollectionsKt.B2(listG);
            Long lG3 = dVar5 != null ? kotlin.coroutines.jvm.internal.a.g(dVar5.id()) : null;
            d dVar6 = (d) CollectionsKt___CollectionsKt.q3(listG);
            return new q0.b.Page(listG, lG3, dVar6 != null ? kotlin.coroutines.jvm.internal.a.g(dVar6.id()) : null);
        }
        if (aVar instanceof q0.a.C0204a) {
            Repository repository2 = this.f59708c;
            repository$dataSource$1$load$1.f59709b = this;
            repository$dataSource$1$load$1.f59710c = aVar;
            repository$dataSource$1$load$1.f59711d = repository2;
            repository$dataSource$1$load$1.f59714g = 1;
            final q qVar = new q(IntrinsicsKt__IntrinsicsJvmKt.d(repository$dataSource$1$load$1), 1);
            qVar.F0();
            Repository.c(repository2).c(((Number) ((q0.a.C0204a) aVar).a()).longValue(), new l<List<? extends d>, b2>() { // from class: com.heybox.imageviewer.adapter.Repository$dataSource$1$load$list$2$1
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                public final void a(@dl.d List<? extends d> it) {
                    if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 113, new Class[]{List.class}, Void.TYPE).isSupported) {
                        return;
                    }
                    f0.p(it, "it");
                    p<List<? extends d>> pVar = qVar;
                    Result.a aVar2 = Result.f124476c;
                    pVar.resumeWith(Result.b(it));
                }

                /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
                @Override // yh.l
                public /* bridge */ /* synthetic */ b2 invoke(List<? extends d> list3) {
                    PatchProxyResult patchProxyResultProxy2 = PatchProxy.proxy(new Object[]{list3}, this, changeQuickRedirect, false, 114, new Class[]{Object.class}, Object.class);
                    if (patchProxyResultProxy2.isSupported) {
                        return patchProxyResultProxy2.result;
                    }
                    a(list3);
                    return b2.f124493a;
                }
            });
            objT = qVar.t();
            if (objT == kotlin.coroutines.intrinsics.b.h()) {
                f.c(repository$dataSource$1$load$1);
            }
            if (objT == objH) {
                return objH;
            }
            repository$dataSource$2 = this;
            List list3 = (List) objT;
            i0 i0Var3 = repository$dataSource$2.f59708c.f59705b;
            List listT7 = CollectionsKt___CollectionsKt.T5(repository$dataSource$2.f59708c.g());
            listT7.addAll(list3);
            i0Var3.r(listT7);
            dVar = (d) CollectionsKt___CollectionsKt.B2(list3);
            if (dVar != null) {
                lG = kotlin.coroutines.jvm.internal.a.g(dVar.id());
            } else {
                lG = null;
            }
            d dVar7 = (d) CollectionsKt___CollectionsKt.q3(list3);
            return new q0.b.Page(list3, lG, dVar7 != null ? kotlin.coroutines.jvm.internal.a.g(dVar7.id()) : null);
        }
        if (!(aVar instanceof q0.a.c)) {
            throw new NoWhenBranchMatchedException();
        }
        Repository repository3 = this.f59708c;
        repository$dataSource$1$load$1.f59709b = this;
        repository$dataSource$1$load$1.f59710c = aVar;
        repository$dataSource$1$load$1.f59711d = repository3;
        repository$dataSource$1$load$1.f59714g = 2;
        final q qVar2 = new q(IntrinsicsKt__IntrinsicsJvmKt.d(repository$dataSource$1$load$1), 1);
        qVar2.F0();
        Repository.c(repository3).e(((Number) ((q0.a.c) aVar).a()).longValue(), new l<List<? extends d>, b2>() { // from class: com.heybox.imageviewer.adapter.Repository$dataSource$1$load$list$3$1
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            public final void a(@dl.d List<? extends d> it) {
                if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 115, new Class[]{List.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(it, "it");
                p<List<? extends d>> pVar = qVar2;
                Result.a aVar2 = Result.f124476c;
                pVar.resumeWith(Result.b(it));
            }

            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(List<? extends d> list4) {
                PatchProxyResult patchProxyResultProxy2 = PatchProxy.proxy(new Object[]{list4}, this, changeQuickRedirect, false, 116, new Class[]{Object.class}, Object.class);
                if (patchProxyResultProxy2.isSupported) {
                    return patchProxyResultProxy2.result;
                }
                a(list4);
                return b2.f124493a;
            }
        });
        objT = qVar2.t();
        if (objT == kotlin.coroutines.intrinsics.b.h()) {
            f.c(repository$dataSource$1$load$1);
        }
        if (objT == objH) {
            return objH;
        }
        repository$dataSource$1 = this;
        List list4 = (List) objT;
        i0 i0Var4 = repository$dataSource$1.f59708c.f59705b;
        List listT8 = CollectionsKt___CollectionsKt.T5(repository$dataSource$1.f59708c.g());
        listT8.addAll(0, list4);
        i0Var4.r(listT8);
        dVar2 = (d) CollectionsKt___CollectionsKt.B2(list4);
        if (dVar2 != null) {
            lG2 = kotlin.coroutines.jvm.internal.a.g(dVar2.id());
        } else {
            lG2 = null;
        }
        d dVar8 = (d) CollectionsKt___CollectionsKt.q3(list4);
        return new q0.b.Page(list4, lG2, dVar8 != null ? kotlin.coroutines.jvm.internal.a.g(dVar8.id()) : null);
    }

    @e
    public Long k(@dl.d PagingState<Long, d> state) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{state}, this, changeQuickRedirect, false, 109, new Class[]{PagingState.class}, Long.class);
        if (patchProxyResultProxy.isSupported) {
            return (Long) patchProxyResultProxy.result;
        }
        f0.p(state, "state");
        return null;
    }
}
