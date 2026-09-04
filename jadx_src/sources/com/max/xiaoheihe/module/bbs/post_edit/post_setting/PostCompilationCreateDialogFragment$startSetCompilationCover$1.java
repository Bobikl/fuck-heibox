package com.max.xiaoheihe.module.bbs.post_edit.post_setting;

import android.net.Uri;
import android.widget.ImageView;
import androidx.fragment.app.FragmentActivity;
import com.max.mediaselector.lib.entity.LocalMedia;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import df.c6;
import dl.e;
import java.io.File;
import java.util.List;
import kotlin.Result;
import kotlin.b2;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.c;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlinx.coroutines.q0;
import yh.p;

/* JADX INFO: compiled from: PostCompilationCreateDialogFragment.kt */
/* JADX INFO: loaded from: classes10.dex */
@t0({"SMAP\nPostCompilationCreateDialogFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PostCompilationCreateDialogFragment.kt\ncom/max/xiaoheihe/module/bbs/post_edit/post_setting/PostCompilationCreateDialogFragment$startSetCompilationCover$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,310:1\n262#2,2:311\n262#2,2:313\n262#2,2:315\n*S KotlinDebug\n*F\n+ 1 PostCompilationCreateDialogFragment.kt\ncom/max/xiaoheihe/module/bbs/post_edit/post_setting/PostCompilationCreateDialogFragment$startSetCompilationCover$1\n*L\n215#1:311,2\n216#1:313,2\n217#1:315,2\n*E\n"})
@d(c = "com.max.xiaoheihe.module.bbs.post_edit.post_setting.PostCompilationCreateDialogFragment$startSetCompilationCover$1", f = "PostCompilationCreateDialogFragment.kt", i = {0}, l = {212}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
public final class PostCompilationCreateDialogFragment$startSetCompilationCover$1 extends SuspendLambda implements p<q0, c<? super b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f83069b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private /* synthetic */ Object f83070c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ FragmentActivity f83071d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ PostCompilationCreateDialogFragment f83072e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PostCompilationCreateDialogFragment$startSetCompilationCover$1(FragmentActivity fragmentActivity, PostCompilationCreateDialogFragment postCompilationCreateDialogFragment, c<? super PostCompilationCreateDialogFragment$startSetCompilationCover$1> cVar) {
        super(2, cVar);
        this.f83071d = fragmentActivity;
        this.f83072e = postCompilationCreateDialogFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final c<b2> create(@e Object obj, @dl.d c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 30980, new Class[]{Object.class, c.class}, c.class);
        if (patchProxyResultProxy.isSupported) {
            return (c) patchProxyResultProxy.result;
        }
        PostCompilationCreateDialogFragment$startSetCompilationCover$1 postCompilationCreateDialogFragment$startSetCompilationCover$1 = new PostCompilationCreateDialogFragment$startSetCompilationCover$1(this.f83071d, this.f83072e, cVar);
        postCompilationCreateDialogFragment$startSetCompilationCover$1.f83070c = obj;
        return postCompilationCreateDialogFragment$startSetCompilationCover$1;
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 30982, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d q0 q0Var, @e c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 30981, new Class[]{q0.class, c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((PostCompilationCreateDialogFragment$startSetCompilationCover$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        Object objH;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 30979, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        Object objH2 = b.h();
        int i10 = this.f83069b;
        if (i10 == 0) {
            kotlin.t0.n(obj);
            q0 q0Var = (q0) this.f83070c;
            FragmentActivity fragmentActivity = this.f83071d;
            this.f83070c = q0Var;
            this.f83069b = 1;
            objH = com.max.xiaoheihe.accelworld.b.h(fragmentActivity, 1, false, false, false, this, 12, null);
            if (objH == objH2) {
                return objH2;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.t0.n(obj);
            objH = obj;
        }
        LocalMedia localMedia = (LocalMedia) CollectionsKt___CollectionsKt.B2((List) objH);
        if (localMedia != null) {
            PostCompilationCreateDialogFragment postCompilationCreateDialogFragment = this.f83072e;
            FragmentActivity fragmentActivity2 = this.f83071d;
            try {
                Result.a aVar = Result.f124476c;
                Uri uriFromFile = Uri.fromFile(new File(localMedia.G()));
                f0.o(uriFromFile, "fromFile(coverFile)");
                PostCompilationCreateDialogFragment.X3(postCompilationCreateDialogFragment, CollectionsKt__CollectionsKt.r(uriFromFile), fragmentActivity2);
                Result.b(b2.f124493a);
            } catch (Throwable th2) {
                Result.a aVar2 = Result.f124476c;
                Result.b(kotlin.t0.a(th2));
            }
            return b2.f124493a;
        }
        c6 c6Var = this.f83072e.f83053l;
        c6 c6Var2 = null;
        if (c6Var == null) {
            f0.S("binding");
            c6Var = null;
        }
        ImageView imageView = c6Var.f109166f;
        f0.o(imageView, "binding.ivAdd");
        imageView.setVisibility(0);
        c6 c6Var3 = this.f83072e.f83053l;
        if (c6Var3 == null) {
            f0.S("binding");
            c6Var3 = null;
        }
        ImageView imageView2 = c6Var3.f109168h;
        f0.o(imageView2, "binding.ivImg");
        imageView2.setVisibility(8);
        c6 c6Var4 = this.f83072e.f83053l;
        if (c6Var4 == null) {
            f0.S("binding");
        } else {
            c6Var2 = c6Var4;
        }
        ImageView imageView3 = c6Var2.f109167g;
        f0.o(imageView3, "binding.ivClear");
        imageView3.setVisibility(8);
        return b2.f124493a;
    }
}
