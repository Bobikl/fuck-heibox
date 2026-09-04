package com.max.xiaoheihe.module.webview;

import android.app.Activity;
import android.content.Context;
import com.max.hbcustomview.loadingdialog.LoadingDialog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.tencent.msdk.dns.MSDKDnsResolver;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.e1;
import kotlinx.coroutines.n2;

/* JADX INFO: compiled from: HostPingHelper.kt */
/* JADX INFO: loaded from: classes12.dex */
@kotlin.coroutines.jvm.internal.d(c = "com.max.xiaoheihe.module.webview.HostPingHelper$Companion$getValidHosts$1", f = "HostPingHelper.kt", i = {}, l = {68, 69}, m = "invokeSuspend", n = {}, s = {})
public final class HostPingHelper$Companion$getValidHosts$1 extends SuspendLambda implements yh.p<kotlinx.coroutines.q0, kotlin.coroutines.c<? super b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f94179b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private /* synthetic */ Object f94180c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ HashMap<String, ArrayList<String>> f94181d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ HashMap<String, String> f94182e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ Ref.LongRef f94183f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ Context f94184g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final /* synthetic */ Ref.ObjectRef<LoadingDialog> f94185h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final /* synthetic */ HostPingHelper.a f94186i;

    /* JADX INFO: renamed from: com.max.xiaoheihe.module.webview.HostPingHelper$Companion$getValidHosts$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: HostPingHelper.kt */
    @kotlin.jvm.internal.t0({"SMAP\nHostPingHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HostPingHelper.kt\ncom/max/xiaoheihe/module/webview/HostPingHelper$Companion$getValidHosts$1$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,142:1\n766#2:143\n857#2,2:144\n*S KotlinDebug\n*F\n+ 1 HostPingHelper.kt\ncom/max/xiaoheihe/module/webview/HostPingHelper$Companion$getValidHosts$1$1\n*L\n47#1:143\n47#1:144,2\n*E\n"})
    @kotlin.coroutines.jvm.internal.d(c = "com.max.xiaoheihe.module.webview.HostPingHelper$Companion$getValidHosts$1$1", f = "HostPingHelper.kt", i = {}, l = {64}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements yh.p<kotlinx.coroutines.q0, kotlin.coroutines.c<? super b2>, Object> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f94187b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ HashMap<String, ArrayList<String>> f94188c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f94189d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ HashMap<String, String> f94190e;

        /* JADX INFO: renamed from: com.max.xiaoheihe.module.webview.HostPingHelper$Companion$getValidHosts$1$1$2, reason: invalid class name */
        /* JADX INFO: compiled from: HostPingHelper.kt */
        @kotlin.coroutines.jvm.internal.d(c = "com.max.xiaoheihe.module.webview.HostPingHelper$Companion$getValidHosts$1$1$2", f = "HostPingHelper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class AnonymousClass2 extends SuspendLambda implements yh.p<kotlinx.coroutines.q0, kotlin.coroutines.c<? super b2>, Object> {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            int f94191b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private /* synthetic */ Object f94192c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ String f94193d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ HashMap<String, String> f94194e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ String f94195f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.q0 f94196g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(String str, HashMap<String, String> map, String str2, kotlinx.coroutines.q0 q0Var, kotlin.coroutines.c<? super AnonymousClass2> cVar) {
                super(2, cVar);
                this.f94193d = str;
                this.f94194e = map;
                this.f94195f = str2;
                this.f94196g = q0Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @dl.d
            public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 46883, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
                if (patchProxyResultProxy.isSupported) {
                    return (kotlin.coroutines.c) patchProxyResultProxy.result;
                }
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.f94193d, this.f94194e, this.f94195f, this.f94196g, cVar);
                anonymousClass2.f94192c = obj;
                return anonymousClass2;
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ Object invoke(kotlinx.coroutines.q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 46885, new Class[]{Object.class, Object.class}, Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
            }

            @dl.e
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(@dl.d kotlinx.coroutines.q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 46884, new Class[]{kotlinx.coroutines.q0.class, kotlin.coroutines.c.class}, Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((AnonymousClass2) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @dl.e
            public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 46882, new Class[]{Object.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                kotlin.coroutines.intrinsics.b.h();
                if (this.f94191b != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.t0.n(obj);
                kotlinx.coroutines.r0.j((kotlinx.coroutines.q0) this.f94192c);
                if (HostPingHelper.f94175a.c(this.f94193d, 1, 1) && this.f94194e.get(this.f94195f) == null) {
                    HashMap<String, String> map = this.f94194e;
                    String key = this.f94195f;
                    kotlin.jvm.internal.f0.o(key, "key");
                    String ip = this.f94193d;
                    kotlin.jvm.internal.f0.o(ip, "ip");
                    map.put(key, ip);
                    com.max.hbcommon.utils.d.b(HostPingHelper.f94178d, "ret map set " + this.f94193d);
                    kotlinx.coroutines.r0.f(this.f94196g, null, 1, null);
                }
                return b2.f124493a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(HashMap<String, ArrayList<String>> map, String str, HashMap<String, String> map2, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.f94188c = map;
            this.f94189d = str;
            this.f94190e = map2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.d
        public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 46879, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
            return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new AnonymousClass1(this.f94188c, this.f94189d, this.f94190e, cVar);
        }

        @Override // yh.p
        public /* bridge */ /* synthetic */ Object invoke(kotlinx.coroutines.q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 46881, new Class[]{Object.class, Object.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
        }

        @dl.e
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@dl.d kotlinx.coroutines.q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 46880, new Class[]{kotlinx.coroutines.q0.class, kotlin.coroutines.c.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((AnonymousClass1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v1, types: [T, java.util.ArrayList] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.e
        public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 46878, new Class[]{Object.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            Object objH = kotlin.coroutines.intrinsics.b.h();
            int i10 = this.f94187b;
            if (i10 == 0) {
                kotlin.t0.n(obj);
                Ref.ObjectRef objectRef = new Ref.ObjectRef();
                objectRef.f124891b = new ArrayList();
                ArrayList<String> arrayList = this.f94188c.get(this.f94189d);
                if (arrayList != null) {
                    kotlin.coroutines.jvm.internal.a.a(((ArrayList) objectRef.f124891b).addAll(arrayList));
                }
                String addrByName = MSDKDnsResolver.getInstance().getAddrByName(this.f94189d);
                kotlin.jvm.internal.f0.o(addrByName, "getInstance().getAddrByName(key)");
                List listU4 = StringsKt__StringsKt.U4(addrByName, new String[]{";"}, false, 0, 6, null);
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : listU4) {
                    String str = (String) obj2;
                    if ((str.length() > 0) && !kotlin.jvm.internal.f0.g(str, "0")) {
                        arrayList2.add(obj2);
                    }
                }
                ((ArrayList) objectRef.f124891b).addAll(arrayList2);
                com.max.hbcommon.utils.d.b(HostPingHelper.f94178d, "key== " + this.f94189d + "  ips ==" + objectRef.f124891b);
                kotlinx.coroutines.q0 q0VarA = kotlinx.coroutines.r0.a(e1.c());
                ArrayList arrayList3 = new ArrayList();
                Iterator it = ((ArrayList) objectRef.f124891b).iterator();
                while (it.hasNext()) {
                    arrayList3.add(kotlinx.coroutines.k.b(q0VarA, null, null, new AnonymousClass2((String) it.next(), this.f94190e, this.f94189d, q0VarA, null), 3, null));
                }
                this.f94187b = 1;
                if (AwaitKt.a(arrayList3, this) == objH) {
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

    /* JADX INFO: renamed from: com.max.xiaoheihe.module.webview.HostPingHelper$Companion$getValidHosts$1$2, reason: invalid class name */
    /* JADX INFO: compiled from: HostPingHelper.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.max.xiaoheihe.module.webview.HostPingHelper$Companion$getValidHosts$1$2", f = "HostPingHelper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements yh.p<kotlinx.coroutines.q0, kotlin.coroutines.c<? super b2>, Object> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f94197b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ HashMap<String, String> f94198c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Ref.LongRef f94199d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Context f94200e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef<LoadingDialog> f94201f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ HashMap<String, ArrayList<String>> f94202g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ HostPingHelper.a f94203h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(HashMap<String, String> map, Ref.LongRef longRef, Context context, Ref.ObjectRef<LoadingDialog> objectRef, HashMap<String, ArrayList<String>> map2, HostPingHelper.a aVar, kotlin.coroutines.c<? super AnonymousClass2> cVar) {
            super(2, cVar);
            this.f94198c = map;
            this.f94199d = longRef;
            this.f94200e = context;
            this.f94201f = objectRef;
            this.f94202g = map2;
            this.f94203h = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.d
        public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 46887, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
            return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new AnonymousClass2(this.f94198c, this.f94199d, this.f94200e, this.f94201f, this.f94202g, this.f94203h, cVar);
        }

        @Override // yh.p
        public /* bridge */ /* synthetic */ Object invoke(kotlinx.coroutines.q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 46889, new Class[]{Object.class, Object.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
        }

        @dl.e
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@dl.d kotlinx.coroutines.q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 46888, new Class[]{kotlinx.coroutines.q0.class, kotlin.coroutines.c.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((AnonymousClass2) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v5, types: [T, java.util.HashMap] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.e
        public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
            boolean z10 = false;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 46886, new Class[]{Object.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            kotlin.coroutines.intrinsics.b.h();
            if (this.f94197b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.t0.n(obj);
            com.max.hbcommon.utils.d.b(HostPingHelper.f94178d, "ping all host success ret=" + this.f94198c + " cost= " + (System.currentTimeMillis() - this.f94199d.f124890b));
            Context context = this.f94200e;
            if ((context instanceof Activity) && ((Activity) context).isFinishing()) {
                return b2.f124493a;
            }
            this.f94201f.f124891b.c();
            for (String key : this.f94202g.keySet()) {
                if (this.f94198c.get(key) == null) {
                    HostPingHelper.Companion companion = HostPingHelper.f94175a;
                    kotlin.jvm.internal.f0.o(key, "key");
                    HostPingHelper.Companion.a(companion, key);
                    z10 = true;
                }
            }
            com.max.hbcommon.utils.d.b(HostPingHelper.f94178d, "ping all host success real ret=" + this.f94198c + ' ');
            if (z10) {
                HostPingHelper.a aVar = this.f94203h;
                if (aVar != null) {
                    aVar.a(null);
                }
            } else {
                Ref.ObjectRef objectRef = new Ref.ObjectRef();
                objectRef.f124891b = new HashMap();
                for (String str : this.f94198c.keySet()) {
                    String str2 = this.f94198c.get(str);
                    if (str2 != null) {
                    }
                }
                HostPingHelper.a aVar2 = this.f94203h;
                if (aVar2 != null) {
                    aVar2.a((HashMap) objectRef.f124891b);
                }
            }
            return b2.f124493a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HostPingHelper$Companion$getValidHosts$1(HashMap<String, ArrayList<String>> map, HashMap<String, String> map2, Ref.LongRef longRef, Context context, Ref.ObjectRef<LoadingDialog> objectRef, HostPingHelper.a aVar, kotlin.coroutines.c<? super HostPingHelper$Companion$getValidHosts$1> cVar) {
        super(2, cVar);
        this.f94181d = map;
        this.f94182e = map2;
        this.f94183f = longRef;
        this.f94184g = context;
        this.f94185h = objectRef;
        this.f94186i = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 46875, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
        if (patchProxyResultProxy.isSupported) {
            return (kotlin.coroutines.c) patchProxyResultProxy.result;
        }
        HostPingHelper$Companion$getValidHosts$1 hostPingHelper$Companion$getValidHosts$1 = new HostPingHelper$Companion$getValidHosts$1(this.f94181d, this.f94182e, this.f94183f, this.f94184g, this.f94185h, this.f94186i, cVar);
        hostPingHelper$Companion$getValidHosts$1.f94180c = obj;
        return hostPingHelper$Companion$getValidHosts$1;
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(kotlinx.coroutines.q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 46877, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @dl.e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d kotlinx.coroutines.q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 46876, new Class[]{kotlinx.coroutines.q0.class, kotlin.coroutines.c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((HostPingHelper$Companion$getValidHosts$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 46874, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f94179b;
        if (i10 != 0) {
            if (i10 == 1) {
                kotlin.t0.n(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.t0.n(obj);
            }
            return b2.f124493a;
        }
        kotlin.t0.n(obj);
        kotlinx.coroutines.q0 q0Var = (kotlinx.coroutines.q0) this.f94180c;
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = this.f94181d.keySet().iterator();
        while (it.hasNext()) {
            arrayList.add(kotlinx.coroutines.k.f(q0Var, null, null, new AnonymousClass1(this.f94181d, it.next(), this.f94182e, null), 3, null));
        }
        this.f94179b = 1;
        if (AwaitKt.c(arrayList, this) == objH) {
            return objH;
        }
        n2 n2VarE = e1.e();
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.f94182e, this.f94183f, this.f94184g, this.f94185h, this.f94181d, this.f94186i, null);
        this.f94179b = 2;
        if (kotlinx.coroutines.i.h(n2VarE, anonymousClass2, this) == objH) {
            return objH;
        }
        return b2.f124493a;
    }
}
