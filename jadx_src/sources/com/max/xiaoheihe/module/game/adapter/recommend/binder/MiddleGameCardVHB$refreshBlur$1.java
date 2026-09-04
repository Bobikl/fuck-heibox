package com.max.xiaoheihe.module.game.adapter.recommend.binder;

import android.graphics.Bitmap;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.module.game.component.MiddleGameCardView;
import com.max.xiaoheihe.module.webview.WebviewFragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.f0;
import kotlin.t0;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.e1;
import kotlinx.coroutines.n2;
import kotlinx.coroutines.q0;

/* JADX INFO: compiled from: MiddleGameCardVHB.kt */
/* JADX INFO: loaded from: classes11.dex */
@kotlin.coroutines.jvm.internal.d(c = "com.max.xiaoheihe.module.game.adapter.recommend.binder.MiddleGameCardVHB$refreshBlur$1", f = "MiddleGameCardVHB.kt", i = {}, l = {86}, m = "invokeSuspend", n = {}, s = {})
public final class MiddleGameCardVHB$refreshBlur$1 extends SuspendLambda implements yh.p<q0, kotlin.coroutines.c<? super b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f86034b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ MiddleGameCardView f86035c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ int f86036d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ MiddleGameCardVHB f86037e;

    /* JADX INFO: renamed from: com.max.xiaoheihe.module.game.adapter.recommend.binder.MiddleGameCardVHB$refreshBlur$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: MiddleGameCardVHB.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.max.xiaoheihe.module.game.adapter.recommend.binder.MiddleGameCardVHB$refreshBlur$1$1", f = "MiddleGameCardVHB.kt", i = {}, l = {94}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements yh.p<q0, kotlin.coroutines.c<? super b2>, Object> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f86038b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ MiddleGameCardView f86039c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f86040d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ MiddleGameCardVHB f86041e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(MiddleGameCardView middleGameCardView, int i10, MiddleGameCardVHB middleGameCardVHB, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.f86039c = middleGameCardView;
            this.f86040d = i10;
            this.f86041e = middleGameCardVHB;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.d
        public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 36019, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
            return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new AnonymousClass1(this.f86039c, this.f86040d, this.f86041e, cVar);
        }

        @Override // yh.p
        public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 36021, new Class[]{Object.class, Object.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
        }

        @dl.e
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 36020, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((AnonymousClass1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.e
        public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 36018, new Class[]{Object.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            Object objH = kotlin.coroutines.intrinsics.b.h();
            int i10 = this.f86038b;
            if (i10 == 0) {
                t0.n(obj);
                if (this.f86039c.getIv_bg().getMeasuredWidth() <= 0 || this.f86039c.getIv_bg().getMeasuredHeight() <= 0) {
                    this.f86038b = 1;
                    if (DelayKt.b(16L, this) == objH) {
                        return objH;
                    }
                } else {
                    MiddleGameCardView middleGameCardView = this.f86039c;
                    int i11 = this.f86040d;
                    Bitmap bitmapR6 = WebviewFragment.R6(middleGameCardView.getIv_bg());
                    f0.o(bitmapR6, "getViewBitmap(game_card.iv_bg)");
                    middleGameCardView.setBottomBlur(i11, bitmapR6, this.f86041e.f86030h - ViewUtils.f(this.f86041e.x().b(), 56.0f));
                }
                return b2.f124493a;
            }
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t0.n(obj);
            MiddleGameCardVHB.w(this.f86041e, this.f86039c, this.f86040d);
            return b2.f124493a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MiddleGameCardVHB$refreshBlur$1(MiddleGameCardView middleGameCardView, int i10, MiddleGameCardVHB middleGameCardVHB, kotlin.coroutines.c<? super MiddleGameCardVHB$refreshBlur$1> cVar) {
        super(2, cVar);
        this.f86035c = middleGameCardView;
        this.f86036d = i10;
        this.f86037e = middleGameCardVHB;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 36015, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
        return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new MiddleGameCardVHB$refreshBlur$1(this.f86035c, this.f86036d, this.f86037e, cVar);
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 36017, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @dl.e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 36016, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((MiddleGameCardVHB$refreshBlur$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 36014, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f86034b;
        if (i10 == 0) {
            t0.n(obj);
            n2 n2VarE = e1.e();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f86035c, this.f86036d, this.f86037e, null);
            this.f86034b = 1;
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
