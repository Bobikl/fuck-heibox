package com.max.xiaoheihe.module.upload;

import android.content.Context;
import com.max.hbcustomview.loadingdialog.LoadingDialog;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.f0;
import kotlin.t0;
import kotlinx.coroutines.e1;
import kotlinx.coroutines.i;
import kotlinx.coroutines.n2;
import kotlinx.coroutines.q0;
import yh.p;

/* JADX INFO: compiled from: MaxUploadManager.kt */
/* JADX INFO: loaded from: classes12.dex */
@kotlin.coroutines.jvm.internal.d(c = "com.max.xiaoheihe.module.upload.MaxUploadManager$showLoading$1", f = "MaxUploadManager.kt", i = {}, l = {114}, m = "invokeSuspend", n = {}, s = {})
public final class MaxUploadManager$showLoading$1 extends SuspendLambda implements p<q0, kotlin.coroutines.c<? super b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f93446b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ MaxUploadManager f93447c;

    /* JADX INFO: renamed from: com.max.xiaoheihe.module.upload.MaxUploadManager$showLoading$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: MaxUploadManager.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.max.xiaoheihe.module.upload.MaxUploadManager$showLoading$1$1", f = "MaxUploadManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements p<q0, kotlin.coroutines.c<? super b2>, Object> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f93448b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ MaxUploadManager f93449c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(MaxUploadManager maxUploadManager, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.f93449c = maxUploadManager;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.d
        public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 46153, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
            return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new AnonymousClass1(this.f93449c, cVar);
        }

        @Override // yh.p
        public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 46155, new Class[]{Object.class, Object.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
        }

        @dl.e
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 46154, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((AnonymousClass1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
        }

        /* JADX WARN: Code duplicated, block: B:12:0x0039  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.e
        public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 46152, new Class[]{Object.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            kotlin.coroutines.intrinsics.b.h();
            if (this.f93448b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t0.n(obj);
            LoadingDialog loadingDialog = this.f93449c.f93440j;
            if (loadingDialog != null) {
                f0.m(loadingDialog);
                if (!loadingDialog.i()) {
                    MaxUploadManager maxUploadManager = this.f93449c;
                    Context context = maxUploadManager.f93431a;
                    f0.m(context);
                    maxUploadManager.f93440j = new LoadingDialog(context, com.max.xiaoheihe.utils.d.n0(R.string.loading_picture)).r();
                }
            } else {
                MaxUploadManager maxUploadManager2 = this.f93449c;
                Context context2 = maxUploadManager2.f93431a;
                f0.m(context2);
                maxUploadManager2.f93440j = new LoadingDialog(context2, com.max.xiaoheihe.utils.d.n0(R.string.loading_picture)).r();
            }
            return b2.f124493a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MaxUploadManager$showLoading$1(MaxUploadManager maxUploadManager, kotlin.coroutines.c<? super MaxUploadManager$showLoading$1> cVar) {
        super(2, cVar);
        this.f93447c = maxUploadManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 46149, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
        return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new MaxUploadManager$showLoading$1(this.f93447c, cVar);
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 46151, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @dl.e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 46150, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((MaxUploadManager$showLoading$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 46148, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f93446b;
        if (i10 == 0) {
            t0.n(obj);
            n2 n2VarE = e1.e();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f93447c, null);
            this.f93446b = 1;
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
