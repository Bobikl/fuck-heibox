package com.max.xiaoheihe.module.news.adapter;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.max.hbcustomview.seekbar.h;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.e;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.t0;
import kotlinx.coroutines.e1;
import kotlinx.coroutines.i;
import kotlinx.coroutines.n2;
import kotlinx.coroutines.q0;
import yh.p;

/* JADX INFO: compiled from: EventsHorAdapter.kt */
/* JADX INFO: loaded from: classes12.dex */
@kotlin.coroutines.jvm.internal.d(c = "com.max.xiaoheihe.module.news.adapter.EventsHorAdapter$onBindViewHolder$1$1$2$onResourceReady$2$1", f = "EventsHorAdapter.kt", i = {}, l = {64}, m = "invokeSuspend", n = {}, s = {})
public final class EventsHorAdapter$onBindViewHolder$1$1$2$onResourceReady$2$1 extends SuspendLambda implements p<q0, kotlin.coroutines.c<? super b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f91279b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ Drawable f91280c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ EventsHorAdapter f91281d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ ImageView f91282e;

    /* JADX INFO: renamed from: com.max.xiaoheihe.module.news.adapter.EventsHorAdapter$onBindViewHolder$1$1$2$onResourceReady$2$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: EventsHorAdapter.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.max.xiaoheihe.module.news.adapter.EventsHorAdapter$onBindViewHolder$1$1$2$onResourceReady$2$1$1", f = "EventsHorAdapter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements p<q0, kotlin.coroutines.c<? super b2>, Object> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f91283b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ImageView f91284c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Bitmap f91285d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ImageView imageView, Bitmap bitmap, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.f91284c = imageView;
            this.f91285d = bitmap;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.d
        public final kotlin.coroutines.c<b2> create(@e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 42591, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
            return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new AnonymousClass1(this.f91284c, this.f91285d, cVar);
        }

        @Override // yh.p
        public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 42593, new Class[]{Object.class, Object.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
        }

        @e
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@dl.d q0 q0Var, @e kotlin.coroutines.c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 42592, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((AnonymousClass1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @e
        public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 42590, new Class[]{Object.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            kotlin.coroutines.intrinsics.b.h();
            if (this.f91283b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t0.n(obj);
            this.f91284c.setAlpha(0.3f);
            this.f91284c.setImageBitmap(this.f91285d);
            return b2.f124493a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EventsHorAdapter$onBindViewHolder$1$1$2$onResourceReady$2$1(Drawable drawable, EventsHorAdapter eventsHorAdapter, ImageView imageView, kotlin.coroutines.c<? super EventsHorAdapter$onBindViewHolder$1$1$2$onResourceReady$2$1> cVar) {
        super(2, cVar);
        this.f91280c = drawable;
        this.f91281d = eventsHorAdapter;
        this.f91282e = imageView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 42587, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
        return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new EventsHorAdapter$onBindViewHolder$1$1$2$onResourceReady$2$1(this.f91280c, this.f91281d, this.f91282e, cVar);
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 42589, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d q0 q0Var, @e kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 42588, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((EventsHorAdapter$onBindViewHolder$1$1$2$onResourceReady$2$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 42586, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f91279b;
        if (i10 == 0) {
            t0.n(obj);
            Bitmap bitmapE = h.e(this.f91280c.getIntrinsicWidth(), this.f91280c.getIntrinsicHeight(), this.f91280c);
            zb.b bVar = new zb.b();
            bVar.f141959a = bitmapE.getWidth();
            bVar.f141960b = bitmapE.getHeight();
            bVar.f141962d = 6;
            Bitmap bitmapB = zb.a.b(this.f91281d.m(), bitmapE, bVar);
            n2 n2VarE = e1.e();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f91282e, bitmapB, null);
            this.f91279b = 1;
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
