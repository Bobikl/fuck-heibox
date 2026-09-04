package com.max.hbcommon.network;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.b2;
import kotlin.collections.t;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.t0;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.a0;
import kotlinx.coroutines.d2;
import kotlinx.coroutines.e1;
import kotlinx.coroutines.q0;
import kotlinx.coroutines.w0;
import kotlinx.coroutines.y;

/* JADX INFO: compiled from: DohDns.kt */
/* JADX INFO: loaded from: classes9.dex */
@kotlin.coroutines.jvm.internal.d(c = "com.max.hbcommon.network.DohDns$getFirstSuccessfulPing$1", f = "DohDns.kt", i = {}, l = {106}, m = "invokeSuspend", n = {}, s = {})
public final class DohDns$getFirstSuccessfulPing$1 extends SuspendLambda implements yh.p<q0, kotlin.coroutines.c<? super String>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f68028b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ long f68029c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ List<String> f68030d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ DohDns f68031e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ int f68032f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ int f68033g;

    /* JADX INFO: renamed from: com.max.hbcommon.network.DohDns$getFirstSuccessfulPing$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: DohDns.kt */
    @t0({"SMAP\nDohDns.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DohDns.kt\ncom/max/hbcommon/network/DohDns$getFirstSuccessfulPing$1$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,166:1\n1549#2:167\n1620#2,3:168\n1855#2,2:171\n1855#2,2:173\n*S KotlinDebug\n*F\n+ 1 DohDns.kt\ncom/max/hbcommon/network/DohDns$getFirstSuccessfulPing$1$1\n*L\n107#1:167\n107#1:168,3\n116#1:171,2\n132#1:173,2\n*E\n"})
    @kotlin.coroutines.jvm.internal.d(c = "com.max.hbcommon.network.DohDns$getFirstSuccessfulPing$1$1", f = "DohDns.kt", i = {0}, l = {131}, m = "invokeSuspend", n = {"deferredResults"}, s = {"L$0"})
    public static final class AnonymousClass1 extends SuspendLambda implements yh.p<q0, kotlin.coroutines.c<? super String>, Object> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f68034b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f68035c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ List<String> f68036d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ DohDns f68037e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f68038f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f68039g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(List<String> list, DohDns dohDns, int i10, int i11, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.f68036d = list;
            this.f68037e = dohDns;
            this.f68038f = i10;
            this.f68039g = i11;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.d
        public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, bb.c.e.f31959pc, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
            if (patchProxyResultProxy.isSupported) {
                return (kotlin.coroutines.c) patchProxyResultProxy.result;
            }
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f68036d, this.f68037e, this.f68038f, this.f68039g, cVar);
            anonymousClass1.f68035c = obj;
            return anonymousClass1;
        }

        @Override // yh.p
        public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super String> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, bb.c.e.f31993rc, new Class[]{Object.class, Object.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
        }

        @dl.e
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super String> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, bb.c.e.f31976qc, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((AnonymousClass1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.e
        public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
            Object objP;
            List list;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.e.f31942oc, new Class[]{Object.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            Object objH = kotlin.coroutines.intrinsics.b.h();
            int i10 = this.f68034b;
            if (i10 == 0) {
                kotlin.t0.n(obj);
                q0 q0Var = (q0) this.f68035c;
                List<String> list2 = this.f68036d;
                DohDns dohDns = this.f68037e;
                int i11 = this.f68038f;
                int i12 = this.f68039g;
                ArrayList arrayList = new ArrayList(t.Y(list2, 10));
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(kotlinx.coroutines.k.b(q0Var, e1.c(), null, new DohDns$getFirstSuccessfulPing$1$1$deferredResults$1$1(dohDns, (String) it.next(), i11, i12, null), 2, null));
                }
                y yVarC = a0.c(null, 1, null);
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    kotlinx.coroutines.k.f(q0Var, null, null, new DohDns$getFirstSuccessfulPing$1$1$1$1((w0) it2.next(), yVarC, null), 3, null);
                }
                this.f68035c = arrayList;
                this.f68034b = 1;
                objP = yVarC.p(this);
                if (objP == objH) {
                    return objH;
                }
                list = arrayList;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list = (List) this.f68035c;
                kotlin.t0.n(obj);
                objP = obj;
            }
            String str = (String) objP;
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                d2.a.b((w0) it3.next(), null, 1, null);
            }
            return str;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DohDns$getFirstSuccessfulPing$1(long j10, List<String> list, DohDns dohDns, int i10, int i11, kotlin.coroutines.c<? super DohDns$getFirstSuccessfulPing$1> cVar) {
        super(2, cVar);
        this.f68029c = j10;
        this.f68030d = list;
        this.f68031e = dohDns;
        this.f68032f = i10;
        this.f68033g = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, bb.c.e.f31891lc, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
        return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new DohDns$getFirstSuccessfulPing$1(this.f68029c, this.f68030d, this.f68031e, this.f68032f, this.f68033g, cVar);
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super String> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, bb.c.e.f31925nc, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @dl.e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super String> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, bb.c.e.f31908mc, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((DohDns$getFirstSuccessfulPing$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.e.f31874kc, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f68028b;
        try {
            if (i10 == 0) {
                kotlin.t0.n(obj);
                long j10 = this.f68029c;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f68030d, this.f68031e, this.f68032f, this.f68033g, null);
                this.f68028b = 1;
                obj = TimeoutKt.c(j10, anonymousClass1, this);
                if (obj == objH) {
                    return objH;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.t0.n(obj);
            }
            return (String) obj;
        } catch (TimeoutCancellationException e10) {
            com.max.heybox.hblog.g.f74531b.v("DohDns getFirstSuccessfulPing timed out " + e10.getMessage());
            return null;
        }
    }
}
