package com.max.hbcommon.analytics;

import android.annotation.SuppressLint;
import com.max.hbcommon.bean.analytics.PageEventEntity;
import com.max.hbcommon.bean.analytics.ReportObj;
import com.max.hbutils.bean.Result;
import com.max.hbutils.core.BaseApplication;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlinx.coroutines.e1;
import kotlinx.coroutines.f3;
import kotlinx.coroutines.q0;
import kotlinx.coroutines.r0;

/* JADX INFO: compiled from: PageEventRepository.kt */
/* JADX INFO: loaded from: classes9.dex */
@t0({"SMAP\nPageEventRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PageEventRepository.kt\ncom/max/hbcommon/analytics/PageEventRepository\n+ 2 Extensions.kt\ncom/max/heybox/hblog/ExtensionsKt\n*L\n1#1,87:1\n27#2:88\n5#2,2:89\n22#2:91\n7#2:92\n27#2:93\n5#2,2:94\n22#2:96\n7#2:97\n*S KotlinDebug\n*F\n+ 1 PageEventRepository.kt\ncom/max/hbcommon/analytics/PageEventRepository\n*L\n38#1:88\n38#1:89,2\n38#1:91\n38#1:92\n59#1:93\n59#1:94,2\n59#1:96\n59#1:97\n*E\n"})
public final class PageEventRepository {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final AtomicBoolean f66506a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final q0 f66507b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final EventDataBase f66508c;

    /* JADX INFO: renamed from: com.max.hbcommon.analytics.PageEventRepository$1, reason: invalid class name */
    /* JADX INFO: compiled from: PageEventRepository.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.max.hbcommon.analytics.PageEventRepository$1", f = "PageEventRepository.kt", i = {}, l = {28}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements yh.p<q0, kotlin.coroutines.c<? super b2>, Object> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f66509b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f66510c;

        /* JADX INFO: renamed from: com.max.hbcommon.analytics.PageEventRepository$1$a */
        /* JADX INFO: compiled from: PageEventRepository.kt */
        @t0({"SMAP\nPageEventRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PageEventRepository.kt\ncom/max/hbcommon/analytics/PageEventRepository$1$1\n+ 2 Extensions.kt\ncom/max/heybox/hblog/ExtensionsKt\n*L\n1#1,87:1\n27#2:88\n5#2,2:89\n22#2:91\n7#2:92\n*S KotlinDebug\n*F\n+ 1 PageEventRepository.kt\ncom/max/hbcommon/analytics/PageEventRepository$1$1\n*L\n29#1:88\n29#1:89,2\n29#1:91\n29#1:92\n*E\n"})
        public static final class a<T> implements kotlinx.coroutines.flow.f {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ q0 f66512b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ PageEventRepository f66513c;

            a(q0 q0Var, PageEventRepository pageEventRepository) {
                this.f66512b = q0Var;
                this.f66513c = pageEventRepository;
            }

            @dl.e
            public final Object a(@dl.d List<PageEventEntity> list, @dl.d kotlin.coroutines.c<? super b2> cVar) {
                String name;
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{list, cVar}, this, changeQuickRedirect, false, bb.c.b.ct, new Class[]{List.class, kotlin.coroutines.c.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                String str = "PageEventRepository, getAllFlow, size = " + list.size() + ", atomicBoolean = " + this.f66513c.f66506a.get();
                com.max.heybox.hblog.g.a aVar = com.max.heybox.hblog.g.f74531b;
                StringBuilder sb2 = new StringBuilder();
                if (q0.class.isAnonymousClass()) {
                    name = q0.class.getName();
                    f0.m(name);
                } else {
                    name = q0.class.getSimpleName();
                    f0.m(name);
                }
                sb2.append(name);
                sb2.append(", ");
                sb2.append(str);
                aVar.M(sb2.toString());
                if (list.size() >= 5 && this.f66513c.f66506a.compareAndSet(false, true)) {
                    PageEventRepository.c(this.f66513c, list);
                }
                return b2.f124493a;
            }

            @Override // kotlinx.coroutines.flow.f
            public /* bridge */ /* synthetic */ Object emit(Object obj, kotlin.coroutines.c cVar) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, bb.c.b.dt, new Class[]{Object.class, kotlin.coroutines.c.class}, Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a((List) obj, cVar);
            }
        }

        AnonymousClass1(kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.d
        public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, bb.c.b.Zs, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
            if (patchProxyResultProxy.isSupported) {
                return (kotlin.coroutines.c) patchProxyResultProxy.result;
            }
            AnonymousClass1 anonymousClass1 = PageEventRepository.this.new AnonymousClass1(cVar);
            anonymousClass1.f66510c = obj;
            return anonymousClass1;
        }

        @Override // yh.p
        public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, bb.c.b.bt, new Class[]{Object.class, Object.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
        }

        @dl.e
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, bb.c.b.at, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((AnonymousClass1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.e
        public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.b.Ys, new Class[]{Object.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            Object objH = kotlin.coroutines.intrinsics.b.h();
            int i10 = this.f66509b;
            if (i10 == 0) {
                kotlin.t0.n(obj);
                q0 q0Var = (q0) this.f66510c;
                kotlinx.coroutines.flow.e<List<PageEventEntity>> eVarF = PageEventRepository.this.f66508c.S().f();
                a aVar = new a(q0Var, PageEventRepository.this);
                this.f66509b = 1;
                if (eVarF.a(aVar, this) == objH) {
                    return objH;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.t0.n(obj);
            }
            return b2.f124493a;
        }
    }

    public PageEventRepository() {
        q0 q0VarA = r0.a(f3.c(null, 1, null).I(e1.c()));
        this.f66507b = q0VarA;
        EventDataBase.a aVar = EventDataBase.f66502q;
        BaseApplication baseApplicationA = BaseApplication.a();
        f0.o(baseApplicationA, "getInstance(...)");
        this.f66508c = aVar.b(baseApplicationA);
        kotlinx.coroutines.k.f(q0VarA, null, null, new AnonymousClass1(null), 3, null);
    }

    public static final /* synthetic */ void c(PageEventRepository pageEventRepository, List list) {
        if (PatchProxy.proxy(new Object[]{pageEventRepository, list}, null, changeQuickRedirect, true, bb.c.b.Xs, new Class[]{PageEventRepository.class, List.class}, Void.TYPE).isSupported) {
            return;
        }
        pageEventRepository.f(list);
    }

    @SuppressLint({"CheckResult"})
    private final void f(final List<PageEventEntity> list) {
        String name;
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, bb.c.b.Ws, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        String strP = com.max.hbcommon.utils.c.w(list) ? null : com.max.hbutils.utils.k.p(new ReportObj(list));
        String str = "PageEventRepository, reportStagingEvents, size = " + list.size() + ", staging_page_event = " + com.max.hbutils.utils.k.p(strP) + ' ' + Thread.currentThread();
        com.max.heybox.hblog.g.a aVar = com.max.heybox.hblog.g.f74531b;
        StringBuilder sb2 = new StringBuilder();
        if (PageEventRepository.class.isAnonymousClass()) {
            name = PageEventRepository.class.getName();
            f0.m(name);
        } else {
            name = PageEventRepository.class.getSimpleName();
            f0.m(name);
        }
        sb2.append(name);
        sb2.append(", ");
        sb2.append(str);
        aVar.M(sb2.toString());
        if (strP != null) {
            d.p(strP, false).J5(new com.max.hbcommon.network.d<Result<?>>() { // from class: com.max.hbcommon.analytics.PageEventRepository$reportStagingEvents$1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.max.hbcommon.network.d, io.reactivex.g0
                public void onComplete() {
                    if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.kt, new Class[0], Void.TYPE).isSupported) {
                        return;
                    }
                    super.onComplete();
                    kotlinx.coroutines.k.f(this.f66516b.d(), null, null, new PageEventRepository$reportStagingEvents$1$onComplete$1(this.f66516b, list, null), 3, null);
                }

                @Override // com.max.hbcommon.network.d, io.reactivex.g0
                public void onError(@dl.d Throwable e10) {
                    if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, bb.c.b.jt, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                        return;
                    }
                    f0.p(e10, "e");
                    super.onError(e10);
                    this.f66516b.f66506a.compareAndSet(true, false);
                    com.max.heybox.hblog.g.f74531b.q("PageEventRepository, reportStagingEvents, onError");
                }
            });
        } else {
            this.f66506a.compareAndSet(true, false);
        }
    }

    @dl.d
    public final q0 d() {
        return this.f66507b;
    }

    public final void e() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.Vs, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        kotlinx.coroutines.k.f(this.f66507b, null, null, new PageEventRepository$reportImmediately$1(this, null), 3, null);
    }

    public final void g(@dl.d PageEventEntity event) {
        String name;
        if (PatchProxy.proxy(new Object[]{event}, this, changeQuickRedirect, false, bb.c.b.Us, new Class[]{PageEventEntity.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(event, "event");
        String str = "stagingPageEvent, pageEventObj = " + com.max.hbutils.utils.k.p(event);
        com.max.heybox.hblog.g.a aVar = com.max.heybox.hblog.g.f74531b;
        StringBuilder sb2 = new StringBuilder();
        if (PageEventRepository.class.isAnonymousClass()) {
            name = PageEventRepository.class.getName();
            f0.m(name);
        } else {
            name = PageEventRepository.class.getSimpleName();
            f0.m(name);
        }
        sb2.append(name);
        sb2.append(", ");
        sb2.append(str);
        aVar.M(sb2.toString());
        this.f66508c.S().d(event);
    }
}
