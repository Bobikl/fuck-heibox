package com.max.xiaoheihe.module.bbs;

import android.text.TextUtils;
import com.max.network.holder.ServiceHolder;
import com.max.network.interfaces.ApiService;
import com.max.network.interfaces.ResultHandler;
import com.max.network.model.RemoteDataSource;
import com.max.network.utils.DownloadResultBuilder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.File;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.t0;
import kotlinx.coroutines.e1;

/* JADX INFO: compiled from: StaticResourceManager.kt */
/* JADX INFO: loaded from: classes10.dex */
@kotlin.coroutines.jvm.internal.d(c = "com.max.xiaoheihe.module.bbs.StaticResourceManager$downloadStaticAsset$2", f = "StaticResourceManager.kt", i = {}, l = {97}, m = "invokeSuspend", n = {}, s = {})
public final class StaticResourceManager$downloadStaticAsset$2 extends SuspendLambda implements yh.p<kotlinx.coroutines.q0, kotlin.coroutines.c<? super b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f80068b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f80069c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ String f80070d;

    /* JADX INFO: renamed from: com.max.xiaoheihe.module.bbs.StaticResourceManager$downloadStaticAsset$2$1, reason: invalid class name */
    /* JADX INFO: compiled from: StaticResourceManager.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.max.xiaoheihe.module.bbs.StaticResourceManager$downloadStaticAsset$2$1", f = "StaticResourceManager.kt", i = {}, l = {102}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements yh.l<kotlin.coroutines.c<? super okhttp3.d0>, Object> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f80071b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f80072c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(String str, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(1, cVar);
            this.f80072c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.d
        public final kotlin.coroutines.c<b2> create(@dl.d kotlin.coroutines.c<?> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cVar}, this, changeQuickRedirect, false, 26822, new Class[]{kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
            return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new AnonymousClass1(this.f80072c, cVar);
        }

        @Override // yh.l
        public /* bridge */ /* synthetic */ Object invoke(kotlin.coroutines.c<? super okhttp3.d0> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cVar}, this, changeQuickRedirect, false, 26824, new Class[]{Object.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(cVar);
        }

        @dl.e
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@dl.e kotlin.coroutines.c<? super okhttp3.d0> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cVar}, this, changeQuickRedirect, false, 26823, new Class[]{kotlin.coroutines.c.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((AnonymousClass1) create(cVar)).invokeSuspend(b2.f124493a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.e
        public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 26821, new Class[]{Object.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            Object objH = kotlin.coroutines.intrinsics.b.h();
            int i10 = this.f80071b;
            if (i10 == 0) {
                t0.n(obj);
                ApiService apiService = ServiceHolder.Companion.getInstance().getApiService(new com.max.xiaoheihe.network.c().getGroup());
                String str = this.f80072c;
                this.f80071b = 1;
                obj = apiService.downloadFile(str, this);
                if (obj == objH) {
                    return objH;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t0.n(obj);
            }
            return obj;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StaticResourceManager$downloadStaticAsset$2(String str, String str2, kotlin.coroutines.c<? super StaticResourceManager$downloadStaticAsset$2> cVar) {
        super(2, cVar);
        this.f80069c = str;
        this.f80070d = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 26818, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
        return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new StaticResourceManager$downloadStaticAsset$2(this.f80069c, this.f80070d, cVar);
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(kotlinx.coroutines.q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 26820, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @dl.e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d kotlinx.coroutines.q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 26819, new Class[]{kotlinx.coroutines.q0.class, kotlin.coroutines.c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((StaticResourceManager$downloadStaticAsset$2) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Exception {
        int i10 = 1;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 26817, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i11 = this.f80068b;
        if (i11 == 0) {
            t0.n(obj);
            StaticResourceManager staticResourceManager = StaticResourceManager.f80064a;
            final String strD = staticResourceManager.d();
            File file = new File(strD);
            if (!file.exists() && !file.mkdirs()) {
                throw new Exception("static resource dir not exist");
            }
            ResultHandler resultHandler = null;
            Object[] objArr = 0;
            DownloadResultBuilder<String> downloadResultBuilder = new DownloadResultBuilder<>(null, 1, null);
            final String str = this.f80070d;
            downloadResultBuilder.setOnSuccess(new yh.l<String, b2>() { // from class: com.max.xiaoheihe.module.bbs.StaticResourceManager$downloadStaticAsset$2$listener$1$1
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX INFO: renamed from: com.max.xiaoheihe.module.bbs.StaticResourceManager$downloadStaticAsset$2$listener$1$1$1, reason: invalid class name */
                /* JADX INFO: compiled from: StaticResourceManager.kt */
                @kotlin.coroutines.jvm.internal.d(c = "com.max.xiaoheihe.module.bbs.StaticResourceManager$downloadStaticAsset$2$listener$1$1$1", f = "StaticResourceManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                public static final class AnonymousClass1 extends SuspendLambda implements yh.p<kotlinx.coroutines.q0, kotlin.coroutines.c<? super b2>, Object> {
                    public static ChangeQuickRedirect changeQuickRedirect;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    int f80075b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    final /* synthetic */ String f80076c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    final /* synthetic */ String f80077d;

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    final /* synthetic */ String f80078e;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(String str, String str2, String str3, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
                        super(2, cVar);
                        this.f80076c = str;
                        this.f80077d = str2;
                        this.f80078e = str3;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @dl.d
                    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
                        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 26828, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
                        return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new AnonymousClass1(this.f80076c, this.f80077d, this.f80078e, cVar);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ Object invoke(kotlinx.coroutines.q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
                        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 26830, new Class[]{Object.class, Object.class}, Object.class);
                        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
                    }

                    @dl.e
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final Object invoke2(@dl.d kotlinx.coroutines.q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
                        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 26829, new Class[]{kotlinx.coroutines.q0.class, kotlin.coroutines.c.class}, Object.class);
                        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((AnonymousClass1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @dl.e
                    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
                        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 26827, new Class[]{Object.class}, Object.class);
                        if (patchProxyResultProxy.isSupported) {
                            return patchProxyResultProxy.result;
                        }
                        kotlin.coroutines.intrinsics.b.h();
                        if (this.f80075b != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        t0.n(obj);
                        String str = this.f80076c;
                        if (str != null) {
                            String str2 = this.f80077d;
                            String str3 = this.f80078e;
                            com.max.hbcommon.utils.r.f68262a.c(new File(str), str2, StaticResourceManager$downloadStaticAsset$2$listener$1$1$1$1$1.f80079b);
                            com.max.hbcommon.utils.f.a(new File(str));
                            com.max.hbcache.c.z(com.max.hbcache.c.f66155w0, str3);
                        }
                        return b2.f124493a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
                @Override // yh.l
                public /* bridge */ /* synthetic */ b2 invoke(String str2) {
                    PatchProxyResult patchProxyResultProxy2 = PatchProxy.proxy(new Object[]{str2}, this, changeQuickRedirect, false, 26826, new Class[]{Object.class}, Object.class);
                    if (patchProxyResultProxy2.isSupported) {
                        return patchProxyResultProxy2.result;
                    }
                    invoke2(str2);
                    return b2.f124493a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@dl.e String str2) {
                    if (PatchProxy.proxy(new Object[]{str2}, this, changeQuickRedirect, false, 26825, new Class[]{String.class}, Void.TYPE).isSupported) {
                        return;
                    }
                    com.max.heybox.hblog.g.a aVar = com.max.heybox.hblog.g.f74531b;
                    StringBuilder sb2 = new StringBuilder();
                    StaticResourceManager staticResourceManager2 = StaticResourceManager.f80064a;
                    sb2.append(staticResourceManager2.f());
                    sb2.append(", download zip success on ");
                    sb2.append(str2);
                    aVar.q(sb2.toString());
                    kotlinx.coroutines.k.f(kotlinx.coroutines.r0.a(e1.c()), staticResourceManager2.c(), null, new AnonymousClass1(str2, strD, str, null), 2, null);
                }
            });
            downloadResultBuilder.setOnError(new yh.l<Throwable, b2>() { // from class: com.max.xiaoheihe.module.bbs.StaticResourceManager$downloadStaticAsset$2$listener$1$2
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
                @Override // yh.l
                public /* bridge */ /* synthetic */ b2 invoke(Throwable th2) throws Throwable {
                    PatchProxyResult patchProxyResultProxy2 = PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 26833, new Class[]{Object.class}, Object.class);
                    if (patchProxyResultProxy2.isSupported) {
                        return patchProxyResultProxy2.result;
                    }
                    invoke2(th2);
                    return b2.f124493a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@dl.d Throwable it) throws Throwable {
                    if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 26832, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                        return;
                    }
                    kotlin.jvm.internal.f0.p(it, "it");
                    throw it;
                }
            });
            if (!TextUtils.isEmpty(this.f80069c)) {
                RemoteDataSource remoteDataSource = new RemoteDataSource(resultHandler, i10, objArr == true ? 1 : 0);
                String strE = staticResourceManager.e(this.f80070d);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f80069c, null);
                this.f80068b = 1;
                if (remoteDataSource.downloadFile(strE, downloadResultBuilder, anonymousClass1, this) == objH) {
                    return objH;
                }
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t0.n(obj);
        }
        return b2.f124493a;
    }
}
