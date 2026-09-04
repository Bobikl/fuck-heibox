package com.max.xiaoheihe.module.mall.cardshare.fragment.actions;

import android.app.Activity;
import android.graphics.Bitmap;
import androidx.fragment.app.FragmentManager;
import com.max.commentimagepainter.sharecard.bean.CardObj;
import com.max.xiaoheihe.bean.ShareInfoObj;
import com.max.xiaoheihe.bean.ShareWindowObj;
import com.max.xiaoheihe.module.mall.cart.ui.MallCartOrderDetailFragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import df.x70;
import dl.e;
import kotlin.b2;
import kotlin.coroutines.c;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.t0;
import kotlinx.coroutines.e1;
import kotlinx.coroutines.i;
import kotlinx.coroutines.n2;
import kotlinx.coroutines.q0;
import sf.f;
import yh.p;

/* JADX INFO: compiled from: MallCartOrderShowCardShare.kt */
/* JADX INFO: loaded from: classes11.dex */
@d(c = "com.max.xiaoheihe.module.mall.cardshare.fragment.actions.MallCartOrderShowCardShareKt$showPictureShareDialog$1$1", f = "MallCartOrderShowCardShare.kt", i = {}, l = {82, 87}, m = "invokeSuspend", n = {}, s = {})
public final class MallCartOrderShowCardShareKt$showPictureShareDialog$1$1 extends SuspendLambda implements p<q0, c<? super b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f90142b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ MallCartOrderDetailFragment f90143c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ Activity f90144d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ CardObj f90145e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ ShareInfoObj f90146f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ ShareWindowObj f90147g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final /* synthetic */ x70 f90148h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final /* synthetic */ FragmentManager f90149i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final /* synthetic */ MallCartOrderDetailFragment f90150j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final /* synthetic */ com.max.hbshare.c.b f90151k;

    /* JADX INFO: renamed from: com.max.xiaoheihe.module.mall.cardshare.fragment.actions.MallCartOrderShowCardShareKt$showPictureShareDialog$1$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: MallCartOrderShowCardShare.kt */
    @d(c = "com.max.xiaoheihe.module.mall.cardshare.fragment.actions.MallCartOrderShowCardShareKt$showPictureShareDialog$1$1$1", f = "MallCartOrderShowCardShare.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements p<q0, c<? super b2>, Object> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f90152b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ShareWindowObj f90153c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ x70 f90154d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ FragmentManager f90155e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Bitmap f90156f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ MallCartOrderDetailFragment f90157g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ CardObj f90158h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ ShareInfoObj f90159i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ com.max.hbshare.c.b f90160j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ShareWindowObj shareWindowObj, x70 x70Var, FragmentManager fragmentManager, Bitmap bitmap, MallCartOrderDetailFragment mallCartOrderDetailFragment, CardObj cardObj, ShareInfoObj shareInfoObj, com.max.hbshare.c.b bVar, c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.f90153c = shareWindowObj;
            this.f90154d = x70Var;
            this.f90155e = fragmentManager;
            this.f90156f = bitmap;
            this.f90157g = mallCartOrderDetailFragment;
            this.f90158h = cardObj;
            this.f90159i = shareInfoObj;
            this.f90160j = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.d
        public final c<b2> create(@e Object obj, @dl.d c<?> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 41326, new Class[]{Object.class, c.class}, c.class);
            return patchProxyResultProxy.isSupported ? (c) patchProxyResultProxy.result : new AnonymousClass1(this.f90153c, this.f90154d, this.f90155e, this.f90156f, this.f90157g, this.f90158h, this.f90159i, this.f90160j, cVar);
        }

        @Override // yh.p
        public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 41328, new Class[]{Object.class, Object.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
        }

        @e
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@dl.d q0 q0Var, @e c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 41327, new Class[]{q0.class, c.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((AnonymousClass1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @e
        public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 41325, new Class[]{Object.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            b.h();
            if (this.f90152b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t0.n(obj);
            vf.a.d(vf.a.h(vf.a.b(sf.b.b(this.f90153c, this.f90154d), this.f90155e), this.f90156f), this.f90156f, this.f90157g, this.f90154d, this.f90158h, this.f90159i, this.f90160j);
            return b2.f124493a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MallCartOrderShowCardShareKt$showPictureShareDialog$1$1(MallCartOrderDetailFragment mallCartOrderDetailFragment, Activity activity, CardObj cardObj, ShareInfoObj shareInfoObj, ShareWindowObj shareWindowObj, x70 x70Var, FragmentManager fragmentManager, MallCartOrderDetailFragment mallCartOrderDetailFragment2, com.max.hbshare.c.b bVar, c<? super MallCartOrderShowCardShareKt$showPictureShareDialog$1$1> cVar) {
        super(2, cVar);
        this.f90143c = mallCartOrderDetailFragment;
        this.f90144d = activity;
        this.f90145e = cardObj;
        this.f90146f = shareInfoObj;
        this.f90147g = shareWindowObj;
        this.f90148h = x70Var;
        this.f90149i = fragmentManager;
        this.f90150j = mallCartOrderDetailFragment2;
        this.f90151k = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final c<b2> create(@e Object obj, @dl.d c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 41322, new Class[]{Object.class, c.class}, c.class);
        return patchProxyResultProxy.isSupported ? (c) patchProxyResultProxy.result : new MallCartOrderShowCardShareKt$showPictureShareDialog$1$1(this.f90143c, this.f90144d, this.f90145e, this.f90146f, this.f90147g, this.f90148h, this.f90149i, this.f90150j, this.f90151k, cVar);
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 41324, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d q0 q0Var, @e c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 41323, new Class[]{q0.class, c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((MallCartOrderShowCardShareKt$showPictureShareDialog$1$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 41321, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        Object objH = b.h();
        int i10 = this.f90142b;
        if (i10 != 0) {
            if (i10 == 1) {
                t0.n(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t0.n(obj);
            }
            return b2.f124493a;
        }
        t0.n(obj);
        MallCartOrderDetailFragment mallCartOrderDetailFragment = this.f90143c;
        Activity activity = this.f90144d;
        CardObj cardObj = this.f90145e;
        ShareInfoObj shareInfoObj = this.f90146f;
        this.f90142b = 1;
        obj = f.a(mallCartOrderDetailFragment, activity, cardObj, shareInfoObj, this);
        if (obj == objH) {
            return objH;
        }
        Bitmap bitmap = (Bitmap) obj;
        n2 n2VarE = e1.e();
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f90147g, this.f90148h, this.f90149i, bitmap, this.f90150j, this.f90145e, this.f90146f, this.f90151k, null);
        this.f90142b = 2;
        if (i.h(n2VarE, anonymousClass1, this) == objH) {
            return objH;
        }
        return b2.f124493a;
    }
}
