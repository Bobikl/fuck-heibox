package com.max.xiaoheihe.utils.imageviewer.ui;

import com.bumptech.glide.Glide;
import com.max.hbshare.bean.HBShareData;
import com.max.hbutils.core.BaseApplication;
import com.max.xiaoheihe.utils.imageviewer.MediaData;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.umeng.socialize.media.UMImage;
import dl.e;
import java.io.File;
import java.util.concurrent.TimeUnit;
import kotlin.b2;
import kotlin.coroutines.c;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.f0;
import kotlin.t0;
import kotlinx.coroutines.e1;
import kotlinx.coroutines.i;
import kotlinx.coroutines.n2;
import kotlinx.coroutines.q0;
import yh.p;

/* JADX INFO: compiled from: BaseResUICustomizer.kt */
/* JADX INFO: loaded from: classes13.dex */
@d(c = "com.max.xiaoheihe.utils.imageviewer.ui.BaseResUICustomizer$shareImg$1", f = "BaseResUICustomizer.kt", i = {}, l = {218}, m = "invokeSuspend", n = {}, s = {})
public final class BaseResUICustomizer$shareImg$1 extends SuspendLambda implements p<q0, c<? super b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f95587b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ MediaData f95588c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ Ref.ObjectRef<UMImage> f95589d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ BaseResUICustomizer f95590e;

    /* JADX INFO: renamed from: com.max.xiaoheihe.utils.imageviewer.ui.BaseResUICustomizer$shareImg$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: BaseResUICustomizer.kt */
    @d(c = "com.max.xiaoheihe.utils.imageviewer.ui.BaseResUICustomizer$shareImg$1$1", f = "BaseResUICustomizer.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements p<q0, c<? super b2>, Object> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f95591b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ BaseResUICustomizer f95592c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef<UMImage> f95593d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(BaseResUICustomizer baseResUICustomizer, Ref.ObjectRef<UMImage> objectRef, c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.f95592c = baseResUICustomizer;
            this.f95593d = objectRef;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.d
        public final c<b2> create(@e Object obj, @dl.d c<?> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 49297, new Class[]{Object.class, c.class}, c.class);
            return patchProxyResultProxy.isSupported ? (c) patchProxyResultProxy.result : new AnonymousClass1(this.f95592c, this.f95593d, cVar);
        }

        @Override // yh.p
        public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 49299, new Class[]{Object.class, Object.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
        }

        @e
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@dl.d q0 q0Var, @e c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 49298, new Class[]{q0.class, c.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((AnonymousClass1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @e
        public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 49296, new Class[]{Object.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            b.h();
            if (this.f95591b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t0.n(obj);
            com.max.hbshare.d.E(this.f95592c.q(), new HBShareData(true, false, null, null, null, null, this.f95593d.f124891b, this.f95592c.w(), null, null, null, null, null, bb.c.k.L0, null));
            return b2.f124493a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BaseResUICustomizer$shareImg$1(MediaData mediaData, Ref.ObjectRef<UMImage> objectRef, BaseResUICustomizer baseResUICustomizer, c<? super BaseResUICustomizer$shareImg$1> cVar) {
        super(2, cVar);
        this.f95588c = mediaData;
        this.f95589d = objectRef;
        this.f95590e = baseResUICustomizer;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final c<b2> create(@e Object obj, @dl.d c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 49293, new Class[]{Object.class, c.class}, c.class);
        return patchProxyResultProxy.isSupported ? (c) patchProxyResultProxy.result : new BaseResUICustomizer$shareImg$1(this.f95588c, this.f95589d, this.f95590e, cVar);
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 49295, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d q0 q0Var, @e c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 49294, new Class[]{q0.class, c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((BaseResUICustomizer$shareImg$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [T, com.umeng.socialize.media.UMImage] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        File fileH;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 49292, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        Object objH = b.h();
        int i10 = this.f95587b;
        if (i10 == 0) {
            t0.n(obj);
            com.bumptech.glide.request.d<File> dVarV1 = Glide.F(BaseApplication.a()).u().load(this.f95588c.D()).V1();
            f0.o(dVarV1, "with(BaseApplication.get…d(mediaData.url).submit()");
            File file = dVarV1.get(10L, TimeUnit.SECONDS);
            if (file != null && (fileH = com.max.hbimage.b.h(BaseApplication.a(), file.getAbsolutePath())) != null && fileH.exists()) {
                this.f95589d.f124891b = new UMImage(this.f95590e.q(), fileH);
            }
            n2 n2VarE = e1.e();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f95590e, this.f95589d, null);
            this.f95587b = 1;
            if (i.h(n2VarE, anonymousClass1, this) == objH) {
                return objH;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t0.n(obj);
        }
        return b2.f124493a;
    }
}
