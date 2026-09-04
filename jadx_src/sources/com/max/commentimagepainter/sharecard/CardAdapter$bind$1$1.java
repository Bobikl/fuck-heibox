package com.max.commentimagepainter.sharecard;

import android.content.res.Resources;
import android.graphics.Bitmap;
import com.bumptech.glide.Glide;
import com.bumptech.glide.i;
import com.bumptech.glide.load.resource.bitmap.b0;
import com.bumptech.glide.load.resource.bitmap.l;
import com.bumptech.glide.request.h;
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
import yh.p;

/* JADX INFO: compiled from: CardAdapter.kt */
/* JADX INFO: loaded from: classes8.dex */
@kotlin.coroutines.jvm.internal.d(c = "com.max.commentimagepainter.sharecard.CardAdapter$bind$1$1", f = "CardAdapter.kt", i = {}, l = {50}, m = "invokeSuspend", n = {}, s = {})
public final class CardAdapter$bind$1$1 extends SuspendLambda implements p<q0, kotlin.coroutines.c<? super b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f65256b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ d f65257c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ String f65258d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ CardAdapter f65259e;

    /* JADX INFO: renamed from: com.max.commentimagepainter.sharecard.CardAdapter$bind$1$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: CardAdapter.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.max.commentimagepainter.sharecard.CardAdapter$bind$1$1$1", f = "CardAdapter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements p<q0, kotlin.coroutines.c<? super b2>, Object> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f65260b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ CardAdapter f65261c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ d f65262d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(CardAdapter cardAdapter, d dVar, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.f65261c = cardAdapter;
            this.f65262d = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.d
        public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 1053, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
            return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new AnonymousClass1(this.f65261c, this.f65262d, cVar);
        }

        @Override // yh.p
        public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 1055, new Class[]{Object.class, Object.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
        }

        @dl.e
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 1054, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((AnonymousClass1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.e
        public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 1052, new Class[]{Object.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            kotlin.coroutines.intrinsics.b.h();
            if (this.f65260b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t0.n(obj);
            if (this.f65261c.r()) {
                this.f65262d.d().h();
            }
            return b2.f124493a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CardAdapter$bind$1$1(d dVar, String str, CardAdapter cardAdapter, kotlin.coroutines.c<? super CardAdapter$bind$1$1> cVar) {
        super(2, cVar);
        this.f65257c = dVar;
        this.f65258d = str;
        this.f65259e = cardAdapter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 1049, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
        return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new CardAdapter$bind$1$1(this.f65257c, this.f65258d, this.f65259e, cVar);
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 1051, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @dl.e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 1050, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((CardAdapter$bind$1$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 1048, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f65256b;
        if (i10 == 0) {
            t0.n(obj);
            i<Bitmap> iVarL = Glide.F(this.f65257c.a().getContext()).l();
            Resources resources = this.f65257c.a().getContext().getResources();
            f0.o(resources, "getResources(...)");
            int iE = ShareCardDrawUtilsKt.e(bb.c.b.f30919s1, resources);
            Resources resources2 = this.f65257c.a().getContext().getResources();
            f0.o(resources2, "getResources(...)");
            i iVarB0 = iVarL.B0(iE, ShareCardDrawUtilsKt.e(bb.c.b.f30943t3, resources2));
            h hVar = new h();
            Resources resources3 = this.f65257c.a().getContext().getResources();
            f0.o(resources3, "getResources(...)");
            iVarB0.i(hVar.Y0(new l(), new b0(ShareCardDrawUtilsKt.e(10, resources3)))).load(this.f65258d).C1(this.f65257c.a());
            n2 n2VarE = e1.e();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f65259e, this.f65257c, null);
            this.f65256b = 1;
            if (kotlinx.coroutines.i.h(n2VarE, anonymousClass1, this) == objH) {
                return objH;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t0.n(obj);
        }
        CardAdapter.m(this.f65259e, this.f65257c.g(), 10.0f, 5.0f);
        i<Bitmap> iVarL2 = Glide.F(this.f65257c.g().getContext()).l();
        Resources resources4 = this.f65257c.g().getContext().getResources();
        f0.o(resources4, "getResources(...)");
        int iE2 = ShareCardDrawUtilsKt.e(bb.c.b.f30919s1, resources4);
        Resources resources5 = this.f65257c.g().getContext().getResources();
        f0.o(resources5, "getResources(...)");
        i iVarB1 = iVarL2.B0(iE2, ShareCardDrawUtilsKt.e(bb.c.b.f30943t3, resources5));
        h hVar2 = new h();
        Resources resources6 = this.f65257c.g().getContext().getResources();
        f0.o(resources6, "getResources(...)");
        iVarB1.i(hVar2.Y0(new l(), new b0(ShareCardDrawUtilsKt.e(10, resources6)))).load("https://assets.codepen.io/13471/holo.png").C1(this.f65257c.g());
        this.f65257c.g().setAlpha(0.05f);
        CardAdapter.m(this.f65259e, this.f65257c.b(), 10.0f, 5.0f);
        i<com.bumptech.glide.load.resource.gif.c> iVarO = Glide.G(this.f65257c.b()).o();
        h hVar3 = new h();
        Resources resources7 = this.f65257c.b().getContext().getResources();
        f0.o(resources7, "getResources(...)");
        i<com.bumptech.glide.load.resource.gif.c> iVarI = iVarO.i(hVar3.Y0(new l(), new b0(ShareCardDrawUtilsKt.e(10, resources7))));
        Resources resources8 = this.f65257c.b().getContext().getResources();
        f0.o(resources8, "getResources(...)");
        int iE3 = ShareCardDrawUtilsKt.e(bb.c.b.f30919s1, resources8);
        Resources resources9 = this.f65257c.b().getContext().getResources();
        f0.o(resources9, "getResources(...)");
        iVarI.B0(iE3, ShareCardDrawUtilsKt.e(bb.c.b.f30943t3, resources9)).load("https://assets.codepen.io/13471/sparkles.gif").C1(this.f65257c.b());
        this.f65257c.b().setAlpha(0.15f);
        return b2.f124493a;
    }
}
