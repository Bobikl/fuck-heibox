package com.max.commentimagepainter.sharecard;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.Glide;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.Result;
import kotlin.b2;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlinx.coroutines.q;
import kotlinx.coroutines.q0;
import yh.p;

/* JADX INFO: compiled from: ShareCardDrawUtils.kt */
/* JADX INFO: loaded from: classes8.dex */
@t0({"SMAP\nShareCardDrawUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShareCardDrawUtils.kt\ncom/max/commentimagepainter/sharecard/ShareCardDrawUtilsKt$getBitmapFromGlide$1\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,720:1\n314#2,11:721\n*S KotlinDebug\n*F\n+ 1 ShareCardDrawUtils.kt\ncom/max/commentimagepainter/sharecard/ShareCardDrawUtilsKt$getBitmapFromGlide$1\n*L\n591#1:721,11\n*E\n"})
@kotlin.coroutines.jvm.internal.d(c = "com.max.commentimagepainter.sharecard.ShareCardDrawUtilsKt$getBitmapFromGlide$1", f = "ShareCardDrawUtils.kt", i = {}, l = {bb.c.b.Ta}, m = "invokeSuspend", n = {}, s = {})
public final class ShareCardDrawUtilsKt$getBitmapFromGlide$1 extends SuspendLambda implements p<q0, kotlin.coroutines.c<? super Bitmap>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f65319b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Object f65320c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f65321d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ Context f65322e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ String f65323f;

    /* JADX INFO: compiled from: ShareCardDrawUtils.kt */
    public static final class a extends com.bumptech.glide.request.target.e<Bitmap> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.p<Bitmap> f65324b;

        /* JADX WARN: Multi-variable type inference failed */
        a(kotlinx.coroutines.p<? super Bitmap> pVar) {
            this.f65324b = pVar;
        }

        @Override // com.bumptech.glide.request.target.p
        public void onLoadCleared(@dl.e Drawable drawable) {
        }

        @Override // com.bumptech.glide.request.target.e, com.bumptech.glide.request.target.p
        public void onLoadFailed(@dl.e Drawable drawable) {
            if (PatchProxy.proxy(new Object[]{drawable}, this, changeQuickRedirect, false, bb.c.b.Li, new Class[]{Drawable.class}, Void.TYPE).isSupported) {
                return;
            }
            super.onLoadFailed(drawable);
            kotlinx.coroutines.p<Bitmap> pVar = this.f65324b;
            Result.a aVar = Result.f124476c;
            pVar.resumeWith(Result.b(null));
        }

        public void onResourceReady(@dl.d Bitmap resource, @dl.e com.bumptech.glide.request.transition.f<? super Bitmap> fVar) {
            if (PatchProxy.proxy(new Object[]{resource, fVar}, this, changeQuickRedirect, false, bb.c.b.Ki, new Class[]{Bitmap.class, com.bumptech.glide.request.transition.f.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(resource, "resource");
            kotlinx.coroutines.p<Bitmap> pVar = this.f65324b;
            Result.a aVar = Result.f124476c;
            pVar.resumeWith(Result.b(resource));
        }

        @Override // com.bumptech.glide.request.target.p
        public /* bridge */ /* synthetic */ void onResourceReady(Object obj, com.bumptech.glide.request.transition.f fVar) {
            if (PatchProxy.proxy(new Object[]{obj, fVar}, this, changeQuickRedirect, false, bb.c.b.Mi, new Class[]{Object.class, com.bumptech.glide.request.transition.f.class}, Void.TYPE).isSupported) {
                return;
            }
            onResourceReady((Bitmap) obj, (com.bumptech.glide.request.transition.f<? super Bitmap>) fVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ShareCardDrawUtilsKt$getBitmapFromGlide$1(Context context, String str, kotlin.coroutines.c<? super ShareCardDrawUtilsKt$getBitmapFromGlide$1> cVar) {
        super(2, cVar);
        this.f65322e = context;
        this.f65323f = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, bb.c.b.Hi, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
        return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new ShareCardDrawUtilsKt$getBitmapFromGlide$1(this.f65322e, this.f65323f, cVar);
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super Bitmap> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, bb.c.b.Ji, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @dl.e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super Bitmap> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, bb.c.b.Ii, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((ShareCardDrawUtilsKt$getBitmapFromGlide$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.b.Gi, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f65321d;
        if (i10 == 0) {
            kotlin.t0.n(obj);
            Context context = this.f65322e;
            String str = this.f65323f;
            this.f65319b = context;
            this.f65320c = str;
            this.f65321d = 1;
            q qVar = new q(IntrinsicsKt__IntrinsicsJvmKt.d(this), 1);
            qVar.F0();
            Glide.F(context).l().load(str).z1(new a(qVar));
            obj = qVar.t();
            if (obj == kotlin.coroutines.intrinsics.b.h()) {
                kotlin.coroutines.jvm.internal.f.c(this);
            }
            if (obj == objH) {
                return objH;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.t0.n(obj);
        }
        return obj;
    }
}
