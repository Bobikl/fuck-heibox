package com.starlightc.ucropplus.ui;

import android.content.Context;
import android.net.Uri;
import com.max.hbcustomview.loadingdialog.LoadingDialog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.starlightc.ucropplus.enums.EDIT_MODE;
import com.starlightc.ucropplus.view.GestureCropImageView;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.t0;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.e1;
import kotlinx.coroutines.n2;
import kotlinx.coroutines.q0;

/* JADX INFO: compiled from: UCropPlusFragment.kt */
/* JADX INFO: loaded from: classes4.dex */
@kotlin.coroutines.jvm.internal.d(c = "com.starlightc.ucropplus.ui.UCropPlusFragment$applyCrop$1$onBitmapCropped$1", f = "UCropPlusFragment.kt", i = {}, l = {bb.c.b.Xc, bb.c.b.f30564cd}, m = "invokeSuspend", n = {}, s = {})
public final class UCropPlusFragment$applyCrop$1$onBitmapCropped$1 extends SuspendLambda implements yh.p<q0, kotlin.coroutines.c<? super b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;
    final /* synthetic */ boolean $showAnimator;
    final /* synthetic */ Uri $uriIn;
    final /* synthetic */ Uri $uriOut;
    int label;
    final /* synthetic */ UCropPlusFragment this$0;

    /* JADX INFO: renamed from: com.starlightc.ucropplus.ui.UCropPlusFragment$applyCrop$1$onBitmapCropped$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: UCropPlusFragment.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.starlightc.ucropplus.ui.UCropPlusFragment$applyCrop$1$onBitmapCropped$1$1", f = "UCropPlusFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements yh.p<q0, kotlin.coroutines.c<? super b2>, Object> {
        public static ChangeQuickRedirect changeQuickRedirect;
        int label;
        final /* synthetic */ UCropPlusFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(UCropPlusFragment uCropPlusFragment, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.this$0 = uCropPlusFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.d
        public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 50795, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
            return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new AnonymousClass1(this.this$0, cVar);
        }

        @Override // yh.p
        public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 50797, new Class[]{Object.class, Object.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
        }

        @dl.e
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 50796, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((AnonymousClass1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.e
        public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 50794, new Class[]{Object.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            kotlin.coroutines.intrinsics.b.h();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t0.n(obj);
            UCropPlusFragment.access$showCropViewAnimator(this.this$0, 500L);
            LoadingDialog loadingDialog = this.this$0.loadingDialog;
            if (loadingDialog != null) {
                loadingDialog.c();
            }
            UCropPlusFragment uCropPlusFragment = this.this$0;
            Context contextRequireContext = uCropPlusFragment.requireContext();
            kotlin.jvm.internal.f0.o(contextRequireContext, "requireContext(...)");
            uCropPlusFragment.loadingDialog = new LoadingDialog(contextRequireContext).r();
            return b2.f124493a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UCropPlusFragment$applyCrop$1$onBitmapCropped$1(boolean z10, UCropPlusFragment uCropPlusFragment, Uri uri, Uri uri2, kotlin.coroutines.c<? super UCropPlusFragment$applyCrop$1$onBitmapCropped$1> cVar) {
        super(2, cVar);
        this.$showAnimator = z10;
        this.this$0 = uCropPlusFragment;
        this.$uriIn = uri;
        this.$uriOut = uri2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 50791, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
        return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new UCropPlusFragment$applyCrop$1$onBitmapCropped$1(this.$showAnimator, this.this$0, this.$uriIn, this.$uriOut, cVar);
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 50793, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @dl.e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 50792, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((UCropPlusFragment$applyCrop$1$onBitmapCropped$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x006c  */
    /* JADX WARN: Code duplicated, block: B:27:0x0079  */
    /* JADX WARN: Code duplicated, block: B:30:0x0088  */
    /* JADX WARN: Code duplicated, block: B:33:0x009b  */
    /* JADX WARN: Code duplicated, block: B:34:0x009f  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Exception {
        GestureCropImageView gestureCropImageView;
        GestureCropImageView gestureCropImageView2;
        GestureCropImageView gestureCropImageView3;
        LoadingDialog loadingDialog;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 50790, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.label;
        GestureCropImageView gestureCropImageView4 = null;
        if (i10 == 0) {
            t0.n(obj);
            if (this.$showAnimator) {
                n2 n2VarE = e1.e();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                this.label = 1;
                if (kotlinx.coroutines.i.h(n2VarE, anonymousClass1, this) == objH) {
                    return objH;
                }
            }
            gestureCropImageView = this.this$0.gestureCropImageView;
            if (gestureCropImageView == null) {
                kotlin.jvm.internal.f0.S("gestureCropImageView");
                gestureCropImageView = null;
            }
            gestureCropImageView.reset();
            gestureCropImageView2 = this.this$0.gestureCropImageView;
            if (gestureCropImageView2 == null) {
                kotlin.jvm.internal.f0.S("gestureCropImageView");
                gestureCropImageView2 = null;
            }
            gestureCropImageView2.setImageUri(this.$uriIn, this.$uriOut);
            gestureCropImageView3 = this.this$0.gestureCropImageView;
            if (gestureCropImageView3 == null) {
                kotlin.jvm.internal.f0.S("gestureCropImageView");
            } else {
                gestureCropImageView4 = gestureCropImageView3;
            }
            gestureCropImageView4.setImageToWrapCropBounds(false);
            this.this$0.switchEditMode(EDIT_MODE.IDLE);
            return b2.f124493a;
        }
        if (i10 == 1) {
            t0.n(obj);
        } else {
            if (i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t0.n(obj);
        }
        loadingDialog = this.this$0.loadingDialog;
        if (loadingDialog != null) {
            loadingDialog.c();
        }
        gestureCropImageView = this.this$0.gestureCropImageView;
        if (gestureCropImageView == null) {
            kotlin.jvm.internal.f0.S("gestureCropImageView");
            gestureCropImageView = null;
        }
        gestureCropImageView.reset();
        gestureCropImageView2 = this.this$0.gestureCropImageView;
        if (gestureCropImageView2 == null) {
            kotlin.jvm.internal.f0.S("gestureCropImageView");
            gestureCropImageView2 = null;
        }
        gestureCropImageView2.setImageUri(this.$uriIn, this.$uriOut);
        gestureCropImageView3 = this.this$0.gestureCropImageView;
        if (gestureCropImageView3 == null) {
            kotlin.jvm.internal.f0.S("gestureCropImageView");
        } else {
            gestureCropImageView4 = gestureCropImageView3;
        }
        gestureCropImageView4.setImageToWrapCropBounds(false);
        this.this$0.switchEditMode(EDIT_MODE.IDLE);
        return b2.f124493a;
        this.label = 2;
        if (DelayKt.b(500L, this) == objH) {
            return objH;
        }
        loadingDialog = this.this$0.loadingDialog;
        if (loadingDialog != null) {
            loadingDialog.c();
        }
        gestureCropImageView = this.this$0.gestureCropImageView;
        if (gestureCropImageView == null) {
            kotlin.jvm.internal.f0.S("gestureCropImageView");
            gestureCropImageView = null;
        }
        gestureCropImageView.reset();
        gestureCropImageView2 = this.this$0.gestureCropImageView;
        if (gestureCropImageView2 == null) {
            kotlin.jvm.internal.f0.S("gestureCropImageView");
            gestureCropImageView2 = null;
        }
        gestureCropImageView2.setImageUri(this.$uriIn, this.$uriOut);
        gestureCropImageView3 = this.this$0.gestureCropImageView;
        if (gestureCropImageView3 == null) {
            kotlin.jvm.internal.f0.S("gestureCropImageView");
        } else {
            gestureCropImageView4 = gestureCropImageView3;
        }
        gestureCropImageView4.setImageToWrapCropBounds(false);
        this.this$0.switchEditMode(EDIT_MODE.IDLE);
        return b2.f124493a;
    }
}
