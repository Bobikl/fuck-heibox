package com.max.xiaoheihe.loader.dynamic_so;

import com.max.heybox.hblog.g;
import com.max.network.utils.DownloadResultBuilder;
import com.max.network.utils.HBNetworkDownloadExecutor;
import com.max.network.utils.HBNetworkExecutorBuilder;
import com.max.xiaoheihe.loader.bean.dynamic_so.DynamicSoInfoObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.e;
import java.io.File;
import kotlin.b2;
import kotlin.coroutines.c;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.f0;
import kotlin.t0;
import kotlin.text.u;
import kotlinx.coroutines.q0;
import okhttp3.d0;
import yh.l;
import yh.p;

/* JADX INFO: compiled from: DynamicSoManager.kt */
/* JADX INFO: loaded from: classes3.dex */
@d(c = "com.max.xiaoheihe.loader.dynamic_so.DynamicSoManager$downloadSo$1$1$1$1", f = "DynamicSoManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class DynamicSoManager$downloadSo$1$1$1$1 extends SuspendLambda implements p<q0, c<? super b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f77256b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f77257c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ String f77258d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ DynamicSoManager f77259e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ DynamicSoInfoObj f77260f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ int f77261g;

    /* JADX INFO: renamed from: com.max.xiaoheihe.loader.dynamic_so.DynamicSoManager$downloadSo$1$1$1$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: DynamicSoManager.kt */
    @d(c = "com.max.xiaoheihe.loader.dynamic_so.DynamicSoManager$downloadSo$1$1$1$1$1", f = "DynamicSoManager.kt", i = {}, l = {97}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements p<hf.a, c<? super d0>, Object> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f77262b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f77263c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f77264d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(String str, c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.f77264d = str;
        }

        @e
        public final Object a(@dl.d hf.a aVar, @e c<? super d0> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{aVar, cVar}, this, changeQuickRedirect, false, 22080, new Class[]{hf.a.class, c.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((AnonymousClass1) create(aVar, cVar)).invokeSuspend(b2.f124493a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.d
        public final c<b2> create(@e Object obj, @dl.d c<?> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 22079, new Class[]{Object.class, c.class}, c.class);
            if (patchProxyResultProxy.isSupported) {
                return (c) patchProxyResultProxy.result;
            }
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f77264d, cVar);
            anonymousClass1.f77263c = obj;
            return anonymousClass1;
        }

        @Override // yh.p
        public /* bridge */ /* synthetic */ Object invoke(hf.a aVar, c<? super d0> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{aVar, cVar}, this, changeQuickRedirect, false, 22081, new Class[]{Object.class, Object.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a(aVar, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @e
        public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 22078, new Class[]{Object.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            Object objH = b.h();
            int i10 = this.f77262b;
            if (i10 == 0) {
                t0.n(obj);
                hf.a aVar = (hf.a) this.f77263c;
                String str = this.f77264d;
                this.f77262b = 1;
                obj = aVar.downloadFile(str, this);
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
    DynamicSoManager$downloadSo$1$1$1$1(String str, String str2, DynamicSoManager dynamicSoManager, DynamicSoInfoObj dynamicSoInfoObj, int i10, c<? super DynamicSoManager$downloadSo$1$1$1$1> cVar) {
        super(2, cVar);
        this.f77257c = str;
        this.f77258d = str2;
        this.f77259e = dynamicSoManager;
        this.f77260f = dynamicSoInfoObj;
        this.f77261g = i10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final c<b2> create(@e Object obj, @dl.d c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 22075, new Class[]{Object.class, c.class}, c.class);
        return patchProxyResultProxy.isSupported ? (c) patchProxyResultProxy.result : new DynamicSoManager$downloadSo$1$1$1$1(this.f77257c, this.f77258d, this.f77259e, this.f77260f, this.f77261g, cVar);
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 22077, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d q0 q0Var, @e c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 22076, new Class[]{q0.class, c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((DynamicSoManager$downloadSo$1$1$1$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 22074, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        b.h();
        if (this.f77256b != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        t0.n(obj);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(DynamicSoManager.f77251f);
        sb2.append(this.f77257c);
        String str = this.f77258d;
        String str2 = DynamicSoManager.f77250e;
        if (!u.K1(str, DynamicSoManager.f77250e, false, 2, null)) {
            str2 = DynamicSoManager.f77249d;
        }
        sb2.append(str2);
        final String string = sb2.toString();
        HBNetworkDownloadExecutor hBNetworkDownloadExecutorBuildDownload = HBNetworkExecutorBuilder.Companion.with(new hf.b()).buildDownload(new AnonymousClass1(this.f77258d, null));
        final String str3 = this.f77257c;
        final DynamicSoManager dynamicSoManager = this.f77259e;
        final DynamicSoInfoObj dynamicSoInfoObj = this.f77260f;
        final String str4 = this.f77258d;
        final int i10 = this.f77261g;
        HBNetworkDownloadExecutor.downloadFileWithCoroutine$default(hBNetworkDownloadExecutorBuildDownload, null, string, new l<DownloadResultBuilder<String>, b2>() { // from class: com.max.xiaoheihe.loader.dynamic_so.DynamicSoManager$downloadSo$1$1$1$1.2
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(DownloadResultBuilder<String> downloadResultBuilder) {
                PatchProxyResult patchProxyResultProxy2 = PatchProxy.proxy(new Object[]{downloadResultBuilder}, this, changeQuickRedirect, false, 22083, new Class[]{Object.class}, Object.class);
                if (patchProxyResultProxy2.isSupported) {
                    return patchProxyResultProxy2.result;
                }
                invoke2(downloadResultBuilder);
                return b2.f124493a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@dl.d DownloadResultBuilder<String> downloadFileWithCoroutine) {
                if (PatchProxy.proxy(new Object[]{downloadFileWithCoroutine}, this, changeQuickRedirect, false, 22082, new Class[]{DownloadResultBuilder.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(downloadFileWithCoroutine, "$this$downloadFileWithCoroutine");
                final String str5 = str3;
                final String str6 = string;
                final DynamicSoManager dynamicSoManager2 = dynamicSoManager;
                final DynamicSoInfoObj dynamicSoInfoObj2 = dynamicSoInfoObj;
                final String str7 = str4;
                final int i11 = i10;
                downloadFileWithCoroutine.setOnSuccess(new l<String, b2>() { // from class: com.max.xiaoheihe.loader.dynamic_so.DynamicSoManager.downloadSo.1.1.1.1.2.1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
                    @Override // yh.l
                    public /* bridge */ /* synthetic */ b2 invoke(String str8) {
                        PatchProxyResult patchProxyResultProxy2 = PatchProxy.proxy(new Object[]{str8}, this, changeQuickRedirect, false, 22085, new Class[]{Object.class}, Object.class);
                        if (patchProxyResultProxy2.isSupported) {
                            return patchProxyResultProxy2.result;
                        }
                        invoke2(str8);
                        return b2.f124493a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@e String str8) {
                        if (PatchProxy.proxy(new Object[]{str8}, this, changeQuickRedirect, false, 22084, new Class[]{String.class}, Void.TYPE).isSupported) {
                            return;
                        }
                        try {
                            DynamicSoManager.f77247b.a().remove(str5);
                            dynamicSoManager2.n(new File(str6), dynamicSoInfoObj2);
                            g.f74531b.M("DynamicSoManager success url: " + str7 + "   reTryTimes: " + i11);
                        } catch (Exception e10) {
                            g.f74531b.v("DynamicSoManager url: " + str7 + "   reTryTimes: " + i11 + "   error: " + e10.getMessage());
                        }
                    }
                });
                final int i12 = i10;
                final DynamicSoManager dynamicSoManager3 = dynamicSoManager;
                final DynamicSoInfoObj dynamicSoInfoObj3 = dynamicSoInfoObj;
                final String str8 = str3;
                final String str9 = str4;
                downloadFileWithCoroutine.setOnError(new l<Throwable, b2>() { // from class: com.max.xiaoheihe.loader.dynamic_so.DynamicSoManager.downloadSo.1.1.1.1.2.2
                    public static ChangeQuickRedirect changeQuickRedirect;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
                    @Override // yh.l
                    public /* bridge */ /* synthetic */ b2 invoke(Throwable th2) {
                        PatchProxyResult patchProxyResultProxy2 = PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 22087, new Class[]{Object.class}, Object.class);
                        if (patchProxyResultProxy2.isSupported) {
                            return patchProxyResultProxy2.result;
                        }
                        invoke2(th2);
                        return b2.f124493a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@dl.d Throwable it) {
                        if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 22086, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                            return;
                        }
                        f0.p(it, "it");
                        int i13 = i12;
                        if (i13 < 2) {
                            dynamicSoManager3.g(dynamicSoInfoObj3, i13 + 1);
                        } else {
                            DynamicSoManager.f77247b.a().remove(str8);
                        }
                        g.f74531b.v("DynamicSoManager onError  url: " + str9 + "   reTryTimes: " + i12 + "   error: " + it.getMessage());
                    }
                });
            }
        }, 1, null);
        return b2.f124493a;
    }
}
