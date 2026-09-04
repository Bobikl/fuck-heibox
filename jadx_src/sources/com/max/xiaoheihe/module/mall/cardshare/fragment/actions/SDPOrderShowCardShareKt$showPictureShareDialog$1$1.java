package com.max.xiaoheihe.module.mall.cardshare.fragment.actions;

import android.app.Activity;
import android.graphics.Bitmap;
import androidx.fragment.app.FragmentManager;
import com.max.commentimagepainter.sharecard.bean.CardObj;
import com.max.xiaoheihe.bean.ShareInfoObj;
import com.max.xiaoheihe.bean.ShareWindowObj;
import com.max.xiaoheihe.module.mall.direct_purchace.SDPOrderFragment;
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

/* JADX INFO: compiled from: SDPOrderShowCardShare.kt */
/* JADX INFO: loaded from: classes11.dex */
@d(c = "com.max.xiaoheihe.module.mall.cardshare.fragment.actions.SDPOrderShowCardShareKt$showPictureShareDialog$1$1", f = "SDPOrderShowCardShare.kt", i = {}, l = {81, 86}, m = "invokeSuspend", n = {}, s = {})
public final class SDPOrderShowCardShareKt$showPictureShareDialog$1$1 extends SuspendLambda implements p<q0, c<? super b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f90171b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ SDPOrderFragment f90172c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ Activity f90173d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ CardObj f90174e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ ShareInfoObj f90175f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ ShareWindowObj f90176g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final /* synthetic */ x70 f90177h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final /* synthetic */ FragmentManager f90178i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final /* synthetic */ SDPOrderFragment f90179j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final /* synthetic */ com.max.hbshare.c.b f90180k;

    /* JADX INFO: renamed from: com.max.xiaoheihe.module.mall.cardshare.fragment.actions.SDPOrderShowCardShareKt$showPictureShareDialog$1$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: SDPOrderShowCardShare.kt */
    @d(c = "com.max.xiaoheihe.module.mall.cardshare.fragment.actions.SDPOrderShowCardShareKt$showPictureShareDialog$1$1$1", f = "SDPOrderShowCardShare.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements p<q0, c<? super b2>, Object> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f90181b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ShareWindowObj f90182c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ x70 f90183d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ FragmentManager f90184e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Bitmap f90185f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ SDPOrderFragment f90186g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ CardObj f90187h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ ShareInfoObj f90188i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ com.max.hbshare.c.b f90189j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ShareWindowObj shareWindowObj, x70 x70Var, FragmentManager fragmentManager, Bitmap bitmap, SDPOrderFragment sDPOrderFragment, CardObj cardObj, ShareInfoObj shareInfoObj, com.max.hbshare.c.b bVar, c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.f90182c = shareWindowObj;
            this.f90183d = x70Var;
            this.f90184e = fragmentManager;
            this.f90185f = bitmap;
            this.f90186g = sDPOrderFragment;
            this.f90187h = cardObj;
            this.f90188i = shareInfoObj;
            this.f90189j = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.d
        public final c<b2> create(@e Object obj, @dl.d c<?> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 41348, new Class[]{Object.class, c.class}, c.class);
            return patchProxyResultProxy.isSupported ? (c) patchProxyResultProxy.result : new AnonymousClass1(this.f90182c, this.f90183d, this.f90184e, this.f90185f, this.f90186g, this.f90187h, this.f90188i, this.f90189j, cVar);
        }

        @Override // yh.p
        public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 41350, new Class[]{Object.class, Object.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
        }

        @e
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@dl.d q0 q0Var, @e c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 41349, new Class[]{q0.class, c.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((AnonymousClass1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @e
        public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 41347, new Class[]{Object.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            b.h();
            if (this.f90181b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t0.n(obj);
            vf.a.d(vf.a.h(vf.a.b(sf.b.b(this.f90182c, this.f90183d), this.f90184e), this.f90185f), this.f90185f, this.f90186g, this.f90183d, this.f90187h, this.f90188i, this.f90189j);
            return b2.f124493a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SDPOrderShowCardShareKt$showPictureShareDialog$1$1(SDPOrderFragment sDPOrderFragment, Activity activity, CardObj cardObj, ShareInfoObj shareInfoObj, ShareWindowObj shareWindowObj, x70 x70Var, FragmentManager fragmentManager, SDPOrderFragment sDPOrderFragment2, com.max.hbshare.c.b bVar, c<? super SDPOrderShowCardShareKt$showPictureShareDialog$1$1> cVar) {
        super(2, cVar);
        this.f90172c = sDPOrderFragment;
        this.f90173d = activity;
        this.f90174e = cardObj;
        this.f90175f = shareInfoObj;
        this.f90176g = shareWindowObj;
        this.f90177h = x70Var;
        this.f90178i = fragmentManager;
        this.f90179j = sDPOrderFragment2;
        this.f90180k = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final c<b2> create(@e Object obj, @dl.d c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 41344, new Class[]{Object.class, c.class}, c.class);
        return patchProxyResultProxy.isSupported ? (c) patchProxyResultProxy.result : new SDPOrderShowCardShareKt$showPictureShareDialog$1$1(this.f90172c, this.f90173d, this.f90174e, this.f90175f, this.f90176g, this.f90177h, this.f90178i, this.f90179j, this.f90180k, cVar);
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 41346, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d q0 q0Var, @e c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 41345, new Class[]{q0.class, c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((SDPOrderShowCardShareKt$showPictureShareDialog$1$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 41343, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        Object objH = b.h();
        int i10 = this.f90171b;
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
        SDPOrderFragment sDPOrderFragment = this.f90172c;
        Activity activity = this.f90173d;
        CardObj cardObj = this.f90174e;
        ShareInfoObj shareInfoObj = this.f90175f;
        this.f90171b = 1;
        obj = f.a(sDPOrderFragment, activity, cardObj, shareInfoObj, this);
        if (obj == objH) {
            return objH;
        }
        Bitmap bitmap = (Bitmap) obj;
        n2 n2VarE = e1.e();
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f90176g, this.f90177h, this.f90178i, bitmap, this.f90179j, this.f90174e, this.f90175f, this.f90180k, null);
        this.f90171b = 2;
        if (i.h(n2VarE, anonymousClass1, this) == objH) {
            return objH;
        }
        return b2.f124493a;
    }
}
