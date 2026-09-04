package com.max.xiaoheihe.module.bbs.post_edit;

import android.content.Context;
import com.max.mediaselector.lib.entity.LocalMedia;
import com.max.xiaoheihe.module.bbs.adapter.GalleryPagingAdapter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: PostToolV2Fragment.kt */
/* JADX INFO: loaded from: classes10.dex */
@kotlin.coroutines.jvm.internal.d(c = "com.max.xiaoheihe.module.bbs.post_edit.PostToolV2Fragment$initViewModelForGallery$1$onChanged$1", f = "PostToolV2Fragment.kt", i = {}, l = {210}, m = "invokeSuspend", n = {}, s = {})
public final class PostToolV2Fragment$initViewModelForGallery$1$onChanged$1 extends SuspendLambda implements yh.p<kotlinx.coroutines.q0, kotlin.coroutines.c<? super b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f82699b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ PostToolV2Fragment f82700c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ Context f82701d;

    /* JADX INFO: compiled from: PostToolV2Fragment.kt */
    public static final class a implements kotlinx.coroutines.flow.f<androidx.paging.o0<LocalMedia>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ PostToolV2Fragment f82702b;

        a(PostToolV2Fragment postToolV2Fragment) {
            this.f82702b = postToolV2Fragment;
        }

        @dl.e
        public final Object a(@dl.d androidx.paging.o0<LocalMedia> o0Var, @dl.d kotlin.coroutines.c<? super b2> cVar) {
            Object objV;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{o0Var, cVar}, this, changeQuickRedirect, false, 30745, new Class[]{androidx.paging.o0.class, kotlin.coroutines.c.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            GalleryPagingAdapter galleryPagingAdapter = this.f82702b.f82654g;
            return (galleryPagingAdapter == null || (objV = galleryPagingAdapter.v(o0Var, cVar)) != kotlin.coroutines.intrinsics.b.h()) ? b2.f124493a : objV;
        }

        @Override // kotlinx.coroutines.flow.f
        public /* bridge */ /* synthetic */ Object emit(androidx.paging.o0<LocalMedia> o0Var, kotlin.coroutines.c cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{o0Var, cVar}, this, changeQuickRedirect, false, 30746, new Class[]{Object.class, kotlin.coroutines.c.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a(o0Var, cVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PostToolV2Fragment$initViewModelForGallery$1$onChanged$1(PostToolV2Fragment postToolV2Fragment, Context context, kotlin.coroutines.c<? super PostToolV2Fragment$initViewModelForGallery$1$onChanged$1> cVar) {
        super(2, cVar);
        this.f82700c = postToolV2Fragment;
        this.f82701d = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 30742, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
        return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new PostToolV2Fragment$initViewModelForGallery$1$onChanged$1(this.f82700c, this.f82701d, cVar);
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(kotlinx.coroutines.q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 30744, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @dl.e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d kotlinx.coroutines.q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 30743, new Class[]{kotlinx.coroutines.q0.class, kotlin.coroutines.c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((PostToolV2Fragment$initViewModelForGallery$1$onChanged$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 30741, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f82699b;
        if (i10 == 0) {
            kotlin.t0.n(obj);
            kotlinx.coroutines.flow.e<androidx.paging.o0<LocalMedia>> eVarM = PostToolV2Fragment.W3(this.f82700c).m(this.f82701d);
            a aVar = new a(this.f82700c);
            this.f82699b = 1;
            if (eVarM.a(aVar, this) == objH) {
                return objH;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.t0.n(obj);
        }
        return b2.f124493a;
    }
}
