package com.max.xiaoheihe.module.upload;

import com.max.hbexpression.ExpressionAssetManager;
import com.max.hbutils.core.BaseApplication;
import com.max.xiaoheihe.bean.upload.UploadInfoObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.File;
import java.util.List;
import java.util.Map;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.f0;
import kotlin.t0;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.k;
import kotlinx.coroutines.q0;
import kotlinx.coroutines.r0;
import yh.p;

/* JADX INFO: compiled from: MaxUploadManager.kt */
/* JADX INFO: loaded from: classes12.dex */
@kotlin.coroutines.jvm.internal.d(c = "com.max.xiaoheihe.module.upload.MaxUploadManager$upload$1", f = "MaxUploadManager.kt", i = {}, l = {60}, m = "invokeSuspend", n = {}, s = {})
public final class MaxUploadManager$upload$1 extends SuspendLambda implements p<q0, kotlin.coroutines.c<? super b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f93450b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ MaxUploadManager f93451c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ List<File> f93452d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ g.e f93453e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ String f93454f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ String f93455g;

    /* JADX INFO: renamed from: com.max.xiaoheihe.module.upload.MaxUploadManager$upload$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: MaxUploadManager.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.max.xiaoheihe.module.upload.MaxUploadManager$upload$1$1", f = "MaxUploadManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements p<q0, kotlin.coroutines.c<? super b2>, Object> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f93456b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f93457c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ List<File> f93458d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ MaxUploadManager f93459e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ g.e f93460f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f93461g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f93462h;

        /* JADX INFO: renamed from: com.max.xiaoheihe.module.upload.MaxUploadManager$upload$1$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: MaxUploadManager.kt */
        @kotlin.coroutines.jvm.internal.d(c = "com.max.xiaoheihe.module.upload.MaxUploadManager$upload$1$1$1", f = "MaxUploadManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C08741 extends SuspendLambda implements p<q0, kotlin.coroutines.c<? super b2>, Object> {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            int f93463b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ List<File> f93464c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ int f93465d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ MaxUploadManager f93466e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ g.e f93467f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ String f93468g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ String f93469h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C08741(List<File> list, int i10, MaxUploadManager maxUploadManager, g.e eVar, String str, String str2, kotlin.coroutines.c<? super C08741> cVar) {
                super(2, cVar);
                this.f93464c = list;
                this.f93465d = i10;
                this.f93466e = maxUploadManager;
                this.f93467f = eVar;
                this.f93468g = str;
                this.f93469h = str2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @dl.d
            public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 46165, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
                return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new C08741(this.f93464c, this.f93465d, this.f93466e, this.f93467f, this.f93468g, this.f93469h, cVar);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 46167, new Class[]{Object.class, Object.class}, Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
            }

            @dl.e
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 46166, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((C08741) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @dl.e
            public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 46164, new Class[]{Object.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                kotlin.coroutines.intrinsics.b.h();
                if (this.f93463b != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t0.n(obj);
                File file = this.f93464c.get(this.f93465d);
                if (f0.g("image/heic", com.max.hbcommon.utils.f.f(file))) {
                    this.f93466e.d();
                    File fileH = com.max.hbimage.b.h(BaseApplication.a(), file.getAbsolutePath());
                    if (fileH != null && fileH.exists()) {
                        this.f93464c.remove(this.f93465d);
                        this.f93464c.add(this.f93465d, fileH);
                        file = fileH;
                    }
                }
                String path = file.getPath();
                f0.o(path, "path");
                if (StringsKt__StringsKt.W2(path, ExpressionAssetManager.f69919a.l(), false, 2, null)) {
                    Map<Integer, String> map = this.f93466e.f93438h;
                    f0.m(map);
                    map.put(kotlin.coroutines.jvm.internal.a.f(this.f93465d), mc.a.a().get(path));
                } else {
                    if (this.f93467f.b()) {
                        c.a aVar = c.f93473c;
                        if (!aVar.b().e(path, this.f93468g)) {
                            aVar.b().d(new UploadInfoObj(path, null, this.f93468g, this.f93469h));
                        }
                    }
                    this.f93466e.f93439i++;
                }
                return b2.f124493a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(List<File> list, MaxUploadManager maxUploadManager, g.e eVar, String str, String str2, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.f93458d = list;
            this.f93459e = maxUploadManager;
            this.f93460f = eVar;
            this.f93461g = str;
            this.f93462h = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.d
        public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 46161, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
            if (patchProxyResultProxy.isSupported) {
                return (kotlin.coroutines.c) patchProxyResultProxy.result;
            }
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f93458d, this.f93459e, this.f93460f, this.f93461g, this.f93462h, cVar);
            anonymousClass1.f93457c = obj;
            return anonymousClass1;
        }

        @Override // yh.p
        public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 46163, new Class[]{Object.class, Object.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
        }

        @dl.e
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 46162, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((AnonymousClass1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.e
        public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 46160, new Class[]{Object.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            kotlin.coroutines.intrinsics.b.h();
            if (this.f93456b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t0.n(obj);
            q0 q0Var = (q0) this.f93457c;
            int size = this.f93458d.size();
            for (int i10 = 0; i10 < size; i10++) {
                k.f(q0Var, null, null, new C08741(this.f93458d, i10, this.f93459e, this.f93460f, this.f93461g, this.f93462h, null), 3, null);
            }
            return b2.f124493a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MaxUploadManager$upload$1(MaxUploadManager maxUploadManager, List<File> list, g.e eVar, String str, String str2, kotlin.coroutines.c<? super MaxUploadManager$upload$1> cVar) {
        super(2, cVar);
        this.f93451c = maxUploadManager;
        this.f93452d = list;
        this.f93453e = eVar;
        this.f93454f = str;
        this.f93455g = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 46157, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
        return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new MaxUploadManager$upload$1(this.f93451c, this.f93452d, this.f93453e, this.f93454f, this.f93455g, cVar);
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 46159, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @dl.e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 46158, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((MaxUploadManager$upload$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 46156, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f93450b;
        if (i10 == 0) {
            t0.n(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f93452d, this.f93451c, this.f93453e, this.f93454f, this.f93455g, null);
            this.f93450b = 1;
            if (r0.g(anonymousClass1, this) == objH) {
                return objH;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t0.n(obj);
        }
        this.f93451c.c();
        this.f93451c.b();
        return b2.f124493a;
    }
}
