package com.max.hbcommon.component.bottomsheet;

import android.graphics.Bitmap;
import com.max.commentimagepainter.sharecard.GameOrderCassetteView;
import com.max.hbcustomview.loadingdialog.LoadingDialog;
import com.max.hbutils.utils.ViewUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.f0;
import kotlin.t0;
import kotlinx.coroutines.e1;
import kotlinx.coroutines.n2;
import kotlinx.coroutines.q0;

/* JADX INFO: compiled from: BottomSheetsPictureShare.kt */
/* JADX INFO: loaded from: classes9.dex */
@kotlin.coroutines.jvm.internal.d(c = "com.max.hbcommon.component.bottomsheet.BottomSheetsPictureShare$loadShareGameOrderCassetteBitmap$1$1", f = "BottomSheetsPictureShare.kt", i = {}, l = {150}, m = "invokeSuspend", n = {}, s = {})
public final class BottomSheetsPictureShare$loadShareGameOrderCassetteBitmap$1$1 extends SuspendLambda implements yh.p<q0, kotlin.coroutines.c<? super b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f67241b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ GameOrderCassetteView f67242c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ BottomSheetsPictureShare f67243d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ yh.l<Bitmap, b2> f67244e;

    /* JADX INFO: renamed from: com.max.hbcommon.component.bottomsheet.BottomSheetsPictureShare$loadShareGameOrderCassetteBitmap$1$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: BottomSheetsPictureShare.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.max.hbcommon.component.bottomsheet.BottomSheetsPictureShare$loadShareGameOrderCassetteBitmap$1$1$1", f = "BottomSheetsPictureShare.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements yh.p<q0, kotlin.coroutines.c<? super b2>, Object> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f67245b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ BottomSheetsPictureShare f67246c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ yh.l<Bitmap, b2> f67247d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Bitmap f67248e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(BottomSheetsPictureShare bottomSheetsPictureShare, yh.l<? super Bitmap, b2> lVar, Bitmap bitmap, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.f67246c = bottomSheetsPictureShare;
            this.f67247d = lVar;
            this.f67248e = bitmap;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.d
        public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, bb.c.d.f31194dk, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
            return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new AnonymousClass1(this.f67246c, this.f67247d, this.f67248e, cVar);
        }

        @Override // yh.p
        public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, bb.c.d.f31240fk, new Class[]{Object.class, Object.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
        }

        @dl.e
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, bb.c.d.f31217ek, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((AnonymousClass1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.e
        public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.d.f31170ck, new Class[]{Object.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            kotlin.coroutines.intrinsics.b.h();
            if (this.f67245b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t0.n(obj);
            LoadingDialog loadingDialog = this.f67246c.f67237i;
            if (loadingDialog != null) {
                loadingDialog.c();
            }
            yh.l<Bitmap, b2> lVar = this.f67247d;
            Bitmap bitmap = this.f67248e;
            f0.o(bitmap, "$bitmap");
            lVar.invoke(bitmap);
            return b2.f124493a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    BottomSheetsPictureShare$loadShareGameOrderCassetteBitmap$1$1(GameOrderCassetteView gameOrderCassetteView, BottomSheetsPictureShare bottomSheetsPictureShare, yh.l<? super Bitmap, b2> lVar, kotlin.coroutines.c<? super BottomSheetsPictureShare$loadShareGameOrderCassetteBitmap$1$1> cVar) {
        super(2, cVar);
        this.f67242c = gameOrderCassetteView;
        this.f67243d = bottomSheetsPictureShare;
        this.f67244e = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, bb.c.d.Zj, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
        return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new BottomSheetsPictureShare$loadShareGameOrderCassetteBitmap$1$1(this.f67242c, this.f67243d, this.f67244e, cVar);
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, bb.c.d.f31147bk, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @dl.e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, bb.c.d.f31124ak, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((BottomSheetsPictureShare$loadShareGameOrderCassetteBitmap$1$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.d.Yj, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f67241b;
        if (i10 == 0) {
            t0.n(obj);
            Bitmap bitmapU = ViewUtils.U(this.f67242c);
            n2 n2VarE = e1.e();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f67243d, this.f67244e, bitmapU, null);
            this.f67241b = 1;
            if (kotlinx.coroutines.i.h(n2VarE, anonymousClass1, this) == objH) {
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
