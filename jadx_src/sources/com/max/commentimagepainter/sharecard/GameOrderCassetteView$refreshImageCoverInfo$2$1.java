package com.max.commentimagepainter.sharecard;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import com.max.commentimagepainter.AccelWorldKt;
import com.max.commentimagepainter.sharecard.bean.CardObjV2;
import com.max.commentimagepainter.sharecard.bean.ColorInfoObj;
import com.max.heybox.hblog.g;
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

/* JADX INFO: compiled from: GameOrderCassetteView.kt */
/* JADX INFO: loaded from: classes8.dex */
@kotlin.coroutines.jvm.internal.d(c = "com.max.commentimagepainter.sharecard.GameOrderCassetteView$refreshImageCoverInfo$2$1", f = "GameOrderCassetteView.kt", i = {}, l = {141, 150}, m = "invokeSuspend", n = {}, s = {})
public final class GameOrderCassetteView$refreshImageCoverInfo$2$1 extends SuspendLambda implements p<q0, kotlin.coroutines.c<? super b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f65292b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ GameOrderCassetteView f65293c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ String f65294d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ CardObjV2 f65295e;

    /* JADX INFO: renamed from: com.max.commentimagepainter.sharecard.GameOrderCassetteView$refreshImageCoverInfo$2$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: GameOrderCassetteView.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.max.commentimagepainter.sharecard.GameOrderCassetteView$refreshImageCoverInfo$2$1$1", f = "GameOrderCassetteView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements p<q0, kotlin.coroutines.c<? super b2>, Object> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f65296b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f65297c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Bitmap f65298d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ GameOrderCassetteView f65299e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Bitmap bitmap, GameOrderCassetteView gameOrderCassetteView, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.f65298d = bitmap;
            this.f65299e = gameOrderCassetteView;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.d
        public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 1102, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
            if (patchProxyResultProxy.isSupported) {
                return (kotlin.coroutines.c) patchProxyResultProxy.result;
            }
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f65298d, this.f65299e, cVar);
            anonymousClass1.f65297c = obj;
            return anonymousClass1;
        }

        @Override // yh.p
        public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 1104, new Class[]{Object.class, Object.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
        }

        @dl.e
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 1103, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((AnonymousClass1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.e
        public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
            b2 b2Var;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 1101, new Class[]{Object.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            kotlin.coroutines.intrinsics.b.h();
            if (this.f65296b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t0.n(obj);
            Bitmap bitmap = this.f65298d;
            if (bitmap != null) {
                this.f65299e.f65291b.f138224e.setImageBitmap(bitmap);
                b2Var = b2.f124493a;
            } else {
                b2Var = null;
            }
            if (b2Var == null) {
                g.f74531b.v("[GameOrderCassetteView][refreshImageCoverInfo] blurredBitmap is null, create fail");
            }
            this.f65299e.f65291b.f138221b.setVisibility(0);
            return b2.f124493a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GameOrderCassetteView$refreshImageCoverInfo$2$1(GameOrderCassetteView gameOrderCassetteView, String str, CardObjV2 cardObjV2, kotlin.coroutines.c<? super GameOrderCassetteView$refreshImageCoverInfo$2$1> cVar) {
        super(2, cVar);
        this.f65293c = gameOrderCassetteView;
        this.f65294d = str;
        this.f65295e = cardObjV2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, bb.c.b.f30662gi, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
        return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new GameOrderCassetteView$refreshImageCoverInfo$2$1(this.f65293c, this.f65294d, this.f65295e, cVar);
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 1100, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @dl.e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 1099, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((GameOrderCassetteView$refreshImageCoverInfo$2$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        String main;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.b.f30639fi, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f65292b;
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
        Context context = this.f65293c.getContext();
        f0.o(context, "getContext(...)");
        String str = this.f65294d;
        ColorInfoObj background_color = this.f65295e.getBackground_color();
        if (background_color == null || (main = background_color.getMain()) == null) {
            main = "#00000000";
        }
        int iD = com.max.hbutils.utils.a.d(main);
        Resources resources = this.f65293c.getResources();
        f0.o(resources, "getResources(...)");
        int iE = ShareCardDrawUtilsKt.e(92, resources);
        this.f65292b = 1;
        obj = AccelWorldKt.e(context, str, iD, iE, 0.6f, 199, bb.c.b.f30898r2, this);
        if (obj == objH) {
            return objH;
        }
        n2 n2VarE = e1.e();
        AnonymousClass1 anonymousClass1 = new AnonymousClass1((Bitmap) obj, this.f65293c, null);
        this.f65292b = 2;
        if (i.h(n2VarE, anonymousClass1, this) == objH) {
            return objH;
        }
        return b2.f124493a;
    }
}
