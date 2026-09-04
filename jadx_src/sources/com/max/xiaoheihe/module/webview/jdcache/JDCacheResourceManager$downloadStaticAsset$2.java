package com.max.xiaoheihe.module.webview.jdcache;

import android.text.TextUtils;
import com.max.hbcommon.utils.f;
import com.max.hbcommon.utils.r;
import com.max.heybox.hblog.g;
import com.max.network.holder.ServiceHolder;
import com.max.network.interfaces.ApiService;
import com.max.network.interfaces.ResultHandler;
import com.max.network.model.RemoteDataSource;
import com.max.network.utils.DownloadResultBuilder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.e;
import java.io.File;
import java.util.Arrays;
import kotlin.b2;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.c;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.f0;
import kotlin.t0;
import kotlinx.coroutines.e1;
import kotlinx.coroutines.k;
import kotlinx.coroutines.l0;
import kotlinx.coroutines.q0;
import kotlinx.coroutines.r0;
import okhttp3.d0;
import yh.l;
import yh.p;

/* JADX INFO: compiled from: JDCacheResourceManager.kt */
/* JADX INFO: loaded from: classes12.dex */
@d(c = "com.max.xiaoheihe.module.webview.jdcache.JDCacheResourceManager$downloadStaticAsset$2", f = "JDCacheResourceManager.kt", i = {}, l = {132}, m = "invokeSuspend", n = {}, s = {})
public final class JDCacheResourceManager$downloadStaticAsset$2 extends SuspendLambda implements p<q0, c<? super b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f94728b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f94729c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ String f94730d;

    /* JADX INFO: renamed from: com.max.xiaoheihe.module.webview.jdcache.JDCacheResourceManager$downloadStaticAsset$2$1, reason: invalid class name */
    /* JADX INFO: compiled from: JDCacheResourceManager.kt */
    @d(c = "com.max.xiaoheihe.module.webview.jdcache.JDCacheResourceManager$downloadStaticAsset$2$1", f = "JDCacheResourceManager.kt", i = {}, l = {137}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements l<c<? super d0>, Object> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f94731b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f94732c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(String str, c<? super AnonymousClass1> cVar) {
            super(1, cVar);
            this.f94732c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.d
        public final c<b2> create(@dl.d c<?> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cVar}, this, changeQuickRedirect, false, 47617, new Class[]{c.class}, c.class);
            return patchProxyResultProxy.isSupported ? (c) patchProxyResultProxy.result : new AnonymousClass1(this.f94732c, cVar);
        }

        @Override // yh.l
        public /* bridge */ /* synthetic */ Object invoke(c<? super d0> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cVar}, this, changeQuickRedirect, false, 47619, new Class[]{Object.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(cVar);
        }

        @e
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@e c<? super d0> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cVar}, this, changeQuickRedirect, false, 47618, new Class[]{c.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((AnonymousClass1) create(cVar)).invokeSuspend(b2.f124493a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @e
        public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 47616, new Class[]{Object.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            Object objH = b.h();
            int i10 = this.f94731b;
            if (i10 == 0) {
                t0.n(obj);
                ApiService apiService = ServiceHolder.Companion.getInstance().getApiService(new com.max.xiaoheihe.network.c().getGroup());
                String str = this.f94732c;
                this.f94731b = 1;
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
    JDCacheResourceManager$downloadStaticAsset$2(String str, String str2, c<? super JDCacheResourceManager$downloadStaticAsset$2> cVar) {
        super(2, cVar);
        this.f94729c = str;
        this.f94730d = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final c<b2> create(@e Object obj, @dl.d c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 47613, new Class[]{Object.class, c.class}, c.class);
        return patchProxyResultProxy.isSupported ? (c) patchProxyResultProxy.result : new JDCacheResourceManager$downloadStaticAsset$2(this.f94729c, this.f94730d, cVar);
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 47615, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d q0 q0Var, @e c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 47614, new Class[]{q0.class, c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((JDCacheResourceManager$downloadStaticAsset$2) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @e
    public final Object invokeSuspend(@dl.d Object obj) throws Exception {
        int i10 = 1;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 47612, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        Object objH = b.h();
        int i11 = this.f94728b;
        if (i11 == 0) {
            t0.n(obj);
            JDCacheResourceManager jDCacheResourceManager = JDCacheResourceManager.f94723a;
            final String strI = jDCacheResourceManager.i();
            File file = new File(strI);
            if (!file.exists() && !file.mkdirs()) {
                throw new Exception("static resource dir not exist");
            }
            ResultHandler resultHandler = null;
            Object[] objArr = 0;
            DownloadResultBuilder<String> downloadResultBuilder = new DownloadResultBuilder<>(null, 1, null);
            final String str = this.f94730d;
            final String str2 = this.f94729c;
            downloadResultBuilder.setOnSuccess(new l<String, b2>() { // from class: com.max.xiaoheihe.module.webview.jdcache.JDCacheResourceManager$downloadStaticAsset$2$listener$1$1
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX INFO: renamed from: com.max.xiaoheihe.module.webview.jdcache.JDCacheResourceManager$downloadStaticAsset$2$listener$1$1$1, reason: invalid class name */
                /* JADX INFO: compiled from: JDCacheResourceManager.kt */
                @d(c = "com.max.xiaoheihe.module.webview.jdcache.JDCacheResourceManager$downloadStaticAsset$2$listener$1$1$1", f = "JDCacheResourceManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                public static final class AnonymousClass1 extends SuspendLambda implements p<q0, c<? super b2>, Object> {
                    public static ChangeQuickRedirect changeQuickRedirect;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    int f94736b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    final /* synthetic */ String f94737c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    final /* synthetic */ String f94738d;

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    final /* synthetic */ String f94739e;

                    /* JADX INFO: renamed from: f, reason: collision with root package name */
                    final /* synthetic */ String f94740f;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(String str, String str2, String str3, String str4, c<? super AnonymousClass1> cVar) {
                        super(2, cVar);
                        this.f94737c = str;
                        this.f94738d = str2;
                        this.f94739e = str3;
                        this.f94740f = str4;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @dl.d
                    public final c<b2> create(@e Object obj, @dl.d c<?> cVar) {
                        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 47623, new Class[]{Object.class, c.class}, c.class);
                        return patchProxyResultProxy.isSupported ? (c) patchProxyResultProxy.result : new AnonymousClass1(this.f94737c, this.f94738d, this.f94739e, this.f94740f, cVar);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, c<? super b2> cVar) {
                        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 47625, new Class[]{Object.class, Object.class}, Object.class);
                        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
                    }

                    @e
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final Object invoke2(@dl.d q0 q0Var, @e c<? super b2> cVar) {
                        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 47624, new Class[]{q0.class, c.class}, Object.class);
                        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((AnonymousClass1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @e
                    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
                        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 47622, new Class[]{Object.class}, Object.class);
                        if (patchProxyResultProxy.isSupported) {
                            return patchProxyResultProxy.result;
                        }
                        b.h();
                        if (this.f94736b != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        t0.n(obj);
                        String str = this.f94737c;
                        if (str != null) {
                            String str2 = this.f94738d;
                            String str3 = this.f94739e;
                            String str4 = this.f94740f;
                            String str5 = str2 + str3 + File.separator;
                            g.a aVar = g.f74531b;
                            StringBuilder sb2 = new StringBuilder();
                            JDCacheResourceManager jDCacheResourceManager = JDCacheResourceManager.f94723a;
                            sb2.append(jDCacheResourceManager.k());
                            sb2.append(", unzip ");
                            sb2.append(str5);
                            aVar.q(sb2.toString());
                            r.f68262a.c(new File(str), str5, JDCacheResourceManager$downloadStaticAsset$2$listener$1$1$1$1$1.f94741b);
                            f.a(new File(str));
                            jDCacheResourceManager.o(str3, str4);
                        }
                        return b2.f124493a;
                    }
                }

                /* JADX INFO: compiled from: CoroutineExceptionHandler.kt */
                @kotlin.jvm.internal.t0({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 JDCacheResourceManager.kt\ncom/max/xiaoheihe/module/webview/jdcache/JDCacheResourceManager$downloadStaticAsset$2$listener$1$1\n*L\n1#1,110:1\n107#2,10:111\n*E\n"})
                public static final class a extends kotlin.coroutines.a implements l0 {
                    public static ChangeQuickRedirect changeQuickRedirect;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    final /* synthetic */ String f94742c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    final /* synthetic */ String f94743d;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public a(l0.Companion companion, String str, String str2) {
                        super(companion);
                        this.f94742c = str;
                        this.f94743d = str2;
                    }

                    @Override // kotlinx.coroutines.l0
                    public void C(@dl.d CoroutineContext coroutineContext, @dl.d Throwable th2) {
                        if (PatchProxy.proxy(new Object[]{coroutineContext, th2}, this, changeQuickRedirect, false, 47627, new Class[]{CoroutineContext.class, Throwable.class}, Void.TYPE).isSupported) {
                            return;
                        }
                        g.a aVar = g.f74531b;
                        StringBuilder sb2 = new StringBuilder();
                        JDCacheResourceManager jDCacheResourceManager = JDCacheResourceManager.f94723a;
                        sb2.append(jDCacheResourceManager.k());
                        sb2.append(", CoroutineExceptionHandler got ");
                        sb2.append(th2);
                        sb2.append(" with suppressed ");
                        String string = Arrays.toString(th2.getSuppressed());
                        f0.o(string, "toString(this)");
                        sb2.append(string);
                        aVar.q(sb2.toString());
                        int iA = JDCacheResourceManager.a(jDCacheResourceManager, this.f94742c);
                        aVar.q(jDCacheResourceManager.k() + ", retryCount == " + iA + ' ');
                        if (iA >= 2) {
                            jDCacheResourceManager.o(this.f94742c, this.f94743d);
                        } else {
                            JDCacheResourceManager.b(jDCacheResourceManager, this.f94742c, iA + 1);
                        }
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
                @Override // yh.l
                public /* bridge */ /* synthetic */ b2 invoke(String str3) {
                    PatchProxyResult patchProxyResultProxy2 = PatchProxy.proxy(new Object[]{str3}, this, changeQuickRedirect, false, 47621, new Class[]{Object.class}, Object.class);
                    if (patchProxyResultProxy2.isSupported) {
                        return patchProxyResultProxy2.result;
                    }
                    invoke2(str3);
                    return b2.f124493a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@e String str3) {
                    if (PatchProxy.proxy(new Object[]{str3}, this, changeQuickRedirect, false, 47620, new Class[]{String.class}, Void.TYPE).isSupported) {
                        return;
                    }
                    g.f74531b.q(JDCacheResourceManager.f94723a.k() + ", download zip success on " + str3);
                    k.f(r0.a(e1.c()), new a(l0.INSTANCE, str, str2), null, new AnonymousClass1(str3, strI, str, str2, null), 2, null);
                }
            });
            downloadResultBuilder.setOnError(new l<Throwable, b2>() { // from class: com.max.xiaoheihe.module.webview.jdcache.JDCacheResourceManager$downloadStaticAsset$2$listener$1$2
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
                @Override // yh.l
                public /* bridge */ /* synthetic */ b2 invoke(Throwable th2) throws Throwable {
                    PatchProxyResult patchProxyResultProxy2 = PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 47629, new Class[]{Object.class}, Object.class);
                    if (patchProxyResultProxy2.isSupported) {
                        return patchProxyResultProxy2.result;
                    }
                    invoke2(th2);
                    return b2.f124493a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@dl.d Throwable it) throws Throwable {
                    if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 47628, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                        return;
                    }
                    f0.p(it, "it");
                    throw it;
                }
            });
            if (!TextUtils.isEmpty(this.f94729c)) {
                RemoteDataSource remoteDataSource = new RemoteDataSource(resultHandler, i10, objArr == true ? 1 : 0);
                String strJ = jDCacheResourceManager.j(this.f94730d);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f94729c, null);
                this.f94728b = 1;
                if (remoteDataSource.downloadFile(strJ, downloadResultBuilder, anonymousClass1, this) == objH) {
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
