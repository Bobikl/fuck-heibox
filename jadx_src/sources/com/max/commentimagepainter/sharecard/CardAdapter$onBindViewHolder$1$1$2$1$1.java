package com.max.commentimagepainter.sharecard;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.max.commentimagepainter.AccelWorldKt;
import com.max.commentimagepainter.sharecard.bean.CardObj;
import com.max.commentimagepainter.sharecard.bean.ColorInfoObj;
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

/* JADX INFO: compiled from: CardAdapter.kt */
/* JADX INFO: loaded from: classes8.dex */
@kotlin.coroutines.jvm.internal.d(c = "com.max.commentimagepainter.sharecard.CardAdapter$onBindViewHolder$1$1$2$1$1", f = "CardAdapter.kt", i = {0}, l = {138, 148}, m = "invokeSuspend", n = {com.umeng.analytics.pro.d.R}, s = {"L$0"})
public final class CardAdapter$onBindViewHolder$1$1$2$1$1 extends SuspendLambda implements p<q0, kotlin.coroutines.c<? super b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f65263b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f65264c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ d f65265d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ String f65266e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ CardObj f65267f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ CardAdapter f65268g;

    /* JADX INFO: renamed from: com.max.commentimagepainter.sharecard.CardAdapter$onBindViewHolder$1$1$2$1$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: CardAdapter.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.max.commentimagepainter.sharecard.CardAdapter$onBindViewHolder$1$1$2$1$1$1", f = "CardAdapter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements p<q0, kotlin.coroutines.c<? super b2>, Object> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f65269b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ d f65270c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Bitmap f65271d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(d dVar, Bitmap bitmap, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.f65270c = dVar;
            this.f65271d = bitmap;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.d
        public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, bb.c.b.f31001vh, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
            return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new AnonymousClass1(this.f65270c, this.f65271d, cVar);
        }

        @Override // yh.p
        public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, bb.c.b.f31045xh, new Class[]{Object.class, Object.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
        }

        @dl.e
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, bb.c.b.f31023wh, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((AnonymousClass1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.e
        public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 1060, new Class[]{Object.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            kotlin.coroutines.intrinsics.b.h();
            if (this.f65269b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t0.n(obj);
            this.f65270c.i().setBackground(new BitmapDrawable(this.f65270c.i().getContext().getResources(), this.f65271d));
            return b2.f124493a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CardAdapter$onBindViewHolder$1$1$2$1$1(d dVar, String str, CardObj cardObj, CardAdapter cardAdapter, kotlin.coroutines.c<? super CardAdapter$onBindViewHolder$1$1$2$1$1> cVar) {
        super(2, cVar);
        this.f65265d = dVar;
        this.f65266e = str;
        this.f65267f = cardObj;
        this.f65268g = cardAdapter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 1057, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
        return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new CardAdapter$onBindViewHolder$1$1$2$1$1(this.f65265d, this.f65266e, this.f65267f, this.f65268g, cVar);
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 1059, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @dl.e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 1058, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((CardAdapter$onBindViewHolder$1$1$2$1$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        Context context;
        String bottom_grad;
        Object objF;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 1056, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f65264c;
        if (i10 != 0) {
            if (i10 == 1) {
                Context context2 = (Context) this.f65263b;
                t0.n(obj);
                context = context2;
                objF = obj;
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t0.n(obj);
            }
            return b2.f124493a;
        }
        t0.n(obj);
        context = this.f65265d.i().getContext();
        f0.m(context);
        String str = this.f65266e;
        ColorInfoObj color_v2 = this.f65267f.getColor_v2();
        if (color_v2 == null || (bottom_grad = color_v2.getBottom_grad()) == null) {
            bottom_grad = "#00000000";
        }
        int iD = com.max.hbutils.utils.a.d(bottom_grad);
        int iE = ShareCardDrawUtilsKt.e(85, this.f65268g.p());
        this.f65263b = context;
        this.f65264c = 1;
        objF = AccelWorldKt.f(context, str, iD, iE, 0.6f, 0, 0, this, 96, null);
        if (objF == objH) {
            return objH;
        }
        Bitmap bitmap = (Bitmap) objF;
        if (bitmap != null) {
            f0.m(context);
            Bitmap bitmapB = AccelWorldKt.b(bitmap, context);
            if (bitmapB != null) {
                n2 n2VarE = e1.e();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f65265d, bitmapB, null);
                this.f65263b = null;
                this.f65264c = 2;
                if (i.h(n2VarE, anonymousClass1, this) == objH) {
                    return objH;
                }
            }
        }
        return b2.f124493a;
    }
}
