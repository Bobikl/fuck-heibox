package com.max.xiaoheihe.module.bbs.post_edit;

import android.net.Uri;
import android.util.Log;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.File;
import java.util.Iterator;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: PictureVideoEditPostFragmentViewModel.kt */
/* JADX INFO: loaded from: classes10.dex */
@kotlin.jvm.internal.t0({"SMAP\nPictureVideoEditPostFragmentViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PictureVideoEditPostFragmentViewModel.kt\ncom/max/xiaoheihe/module/bbs/post_edit/PictureVideoEditPostFragmentViewModel$launchTaskAfterTriggerPost$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,411:1\n1855#2,2:412\n*S KotlinDebug\n*F\n+ 1 PictureVideoEditPostFragmentViewModel.kt\ncom/max/xiaoheihe/module/bbs/post_edit/PictureVideoEditPostFragmentViewModel$launchTaskAfterTriggerPost$1\n*L\n134#1:412,2\n*E\n"})
@kotlin.coroutines.jvm.internal.d(c = "com.max.xiaoheihe.module.bbs.post_edit.PictureVideoEditPostFragmentViewModel$launchTaskAfterTriggerPost$1", f = "PictureVideoEditPostFragmentViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class PictureVideoEditPostFragmentViewModel$launchTaskAfterTriggerPost$1 extends SuspendLambda implements yh.p<kotlinx.coroutines.q0, kotlin.coroutines.c<? super b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f82504b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ PictureVideoEditPostFragmentViewModel f82505c;

    /* JADX INFO: compiled from: PictureVideoEditPostFragmentViewModel.kt */
    public static final class a implements com.max.xiaoheihe.accelworld.v {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // com.max.xiaoheihe.accelworld.v
        public void a(@dl.e Uri uri) {
            if (PatchProxy.proxy(new Object[]{uri}, this, changeQuickRedirect, false, 30457, new Class[]{Uri.class}, Void.TYPE).isSupported) {
                return;
            }
            Log.d("PictureVideoEditPostFragmentViewModel", "[launchTaskAfterTriggerPost] onCopySuccess, uri: " + uri);
        }

        @Override // com.max.xiaoheihe.accelworld.v
        public void b(@dl.e Uri uri, @dl.e Throwable th2) {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PictureVideoEditPostFragmentViewModel$launchTaskAfterTriggerPost$1(PictureVideoEditPostFragmentViewModel pictureVideoEditPostFragmentViewModel, kotlin.coroutines.c<? super PictureVideoEditPostFragmentViewModel$launchTaskAfterTriggerPost$1> cVar) {
        super(2, cVar);
        this.f82505c = pictureVideoEditPostFragmentViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 30454, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
        return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new PictureVideoEditPostFragmentViewModel$launchTaskAfterTriggerPost$1(this.f82505c, cVar);
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(kotlinx.coroutines.q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 30456, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @dl.e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d kotlinx.coroutines.q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 30455, new Class[]{kotlinx.coroutines.q0.class, kotlin.coroutines.c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((PictureVideoEditPostFragmentViewModel$launchTaskAfterTriggerPost$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 30453, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        kotlin.coroutines.intrinsics.b.h();
        if (this.f82504b != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.t0.n(obj);
        Iterator it = this.f82505c.f82472e.iterator();
        while (it.hasNext()) {
            String path = ((Uri) it.next()).getPath();
            if (path == null || path.length() == 0) {
                com.max.heybox.hblog.g.f74531b.v("[PictureVideoEditPostFragmentViewModel][launchTaskAfterTriggerPost] invalid path: " + path);
            } else {
                com.max.xiaoheihe.accelworld.b.f(new File(path), null, new a(), 2, null);
            }
        }
        return b2.f124493a;
    }
}
