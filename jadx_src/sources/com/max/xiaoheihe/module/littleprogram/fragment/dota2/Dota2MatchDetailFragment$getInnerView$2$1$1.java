package com.max.xiaoheihe.module.littleprogram.fragment.dota2;

import android.app.Activity;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.core.widget.NestedScrollView;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.bean.game.dota2.Dota2MatchDetailObj;
import com.max.xiaoheihe.module.account.ShareImageDialogFragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.umeng.socialize.UMShareListener;
import com.umeng.socialize.bean.SHARE_MEDIA;
import df.b40;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.f0;
import kotlin.t0;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.q0;
import mb.s0;
import yh.p;

/* JADX INFO: compiled from: Dota2MatchDetailFragment.kt */
/* JADX INFO: loaded from: classes11.dex */
@kotlin.coroutines.jvm.internal.d(c = "com.max.xiaoheihe.module.littleprogram.fragment.dota2.Dota2MatchDetailFragment$getInnerView$2$1$1", f = "Dota2MatchDetailFragment.kt", i = {0, 0, 1, 1}, l = {133, 135}, m = "invokeSuspend", n = {"shareImageDialogFragment", "shareBinding", "shareImageDialogFragment", "shareBinding"}, s = {"L$0", "L$1", "L$0", "L$1"})
public final class Dota2MatchDetailFragment$getInnerView$2$1$1 extends SuspendLambda implements p<q0, kotlin.coroutines.c<? super b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f89002b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Object f89003c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f89004d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ Dota2MatchDetailFragment f89005e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ Dota2MatchDetailObj f89006f;

    /* JADX INFO: compiled from: Dota2MatchDetailFragment.kt */
    public static final class a extends com.max.hbshare.c.b {
        a(b bVar) {
            super("dota2", bVar);
        }
    }

    /* JADX INFO: compiled from: Dota2MatchDetailFragment.kt */
    public static final class b implements UMShareListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onCancel(@dl.e SHARE_MEDIA share_media) {
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onError(@dl.e SHARE_MEDIA share_media, @dl.e Throwable th2) {
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onResult(@dl.e SHARE_MEDIA share_media) {
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onStart(@dl.e SHARE_MEDIA share_media) {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Dota2MatchDetailFragment$getInnerView$2$1$1(Dota2MatchDetailFragment dota2MatchDetailFragment, Dota2MatchDetailObj dota2MatchDetailObj, kotlin.coroutines.c<? super Dota2MatchDetailFragment$getInnerView$2$1$1> cVar) {
        super(2, cVar);
        this.f89005e = dota2MatchDetailFragment;
        this.f89006f = dota2MatchDetailObj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 39222, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
        return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new Dota2MatchDetailFragment$getInnerView$2$1$1(this.f89005e, this.f89006f, cVar);
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 39224, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @dl.e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 39223, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((Dota2MatchDetailFragment$getInnerView$2$1$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        ShareImageDialogFragment shareImageDialogFragment;
        b40 b40Var;
        b40 b40Var2;
        ShareImageDialogFragment shareImageDialogFragment2;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 39221, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f89004d;
        if (i10 != 0) {
            if (i10 == 1) {
                b40Var = (b40) this.f89003c;
                shareImageDialogFragment = (ShareImageDialogFragment) this.f89002b;
                t0.n(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                b40Var2 = (b40) this.f89003c;
                shareImageDialogFragment2 = (ShareImageDialogFragment) this.f89002b;
                t0.n(obj);
            }
            RelativeLayout relativeLayout = b40Var2.f108789d;
            shareImageDialogFragment2.A4(com.max.hbimage.b.l(relativeLayout, relativeLayout.getMeasuredWidth(), b40Var2.f108789d.getMeasuredHeight()));
            shareImageDialogFragment2.V4(false);
            this.f89005e.e5().f111676g.removeView(b40Var2.b());
            Dota2MatchDetailFragment.Y4(this.f89005e);
            Dota2MatchDetailFragment.Z4(this.f89005e);
            shareImageDialogFragment2.show(this.f89005e.getChildFragmentManager(), "share_dota2_match_detail");
            return b2.f124493a;
        }
        t0.n(obj);
        Dota2MatchDetailFragment.c5(this.f89005e);
        Dota2MatchDetailFragment.d5(this.f89005e);
        ShareImageDialogFragment shareImageDialogFragmentX4 = ShareImageDialogFragment.x4();
        shareImageDialogFragmentX4.Q4(com.max.hbimage.image.c.d(((com.max.hbcommon.base.d) this.f89005e).mContext));
        shareImageDialogFragmentX4.S4(new a(new b()));
        Dota2MatchDetailObj dota2MatchDetailObjG5 = this.f89005e.g5();
        shareImageDialogFragmentX4.N4(dota2MatchDetailObjG5 != null ? dota2MatchDetailObjG5.getTool_card_ids() : null);
        b40 b40VarC = b40.c(((com.max.hbcommon.base.d) this.f89005e).mInflater);
        f0.o(b40VarC, "inflate(mInflater)");
        ViewGroup.LayoutParams layoutParams = b40VarC.f108787b.getLayoutParams();
        layoutParams.width = ViewUtils.J(this.f89005e.getContext());
        layoutParams.height = ViewUtils.J(this.f89005e.getContext());
        b40VarC.f108787b.setLayoutParams(layoutParams);
        b40VarC.f108787b.setScaleX(3.0f);
        b40VarC.f108787b.setScaleY(3.0f);
        com.max.xiaoheihe.module.littleprogram.fragment.dota2.b.a aVar = com.max.xiaoheihe.module.littleprogram.fragment.dota2.b.f89090j;
        Activity mContext = ((com.max.hbcommon.base.d) this.f89005e).mContext;
        f0.o(mContext, "mContext");
        Dota2MatchDetailObj dota2MatchDetailObjG6 = this.f89005e.g5();
        f0.m(dota2MatchDetailObjG6);
        ImageView imageView = b40VarC.f108788c;
        f0.o(imageView, "shareBinding.ivHeader");
        LinearLayout linearLayoutB = b40VarC.f108790e.b();
        f0.o(linearLayoutB, "shareBinding.vgTop.root");
        NestedScrollView nestedScrollViewB = b40VarC.b();
        f0.o(nestedScrollViewB, "shareBinding.root");
        FrameLayout frameLayoutB = this.f89005e.e5().b();
        f0.o(frameLayoutB, "binding.root");
        aVar.i(mContext, dota2MatchDetailObjG6, imageView, linearLayoutB, nestedScrollViewB, frameLayoutB, true);
        Activity mContext2 = ((com.max.hbcommon.base.d) this.f89005e).mContext;
        f0.o(mContext2, "mContext");
        Dota2MatchDetailObj dota2MatchDetailObj = this.f89006f;
        s0 s0Var = b40VarC.f108790e.f109617f;
        f0.o(s0Var, "shareBinding.vgTop.vgBanPick");
        aVar.d(mContext2, dota2MatchDetailObj, s0Var);
        this.f89002b = shareImageDialogFragmentX4;
        this.f89003c = b40VarC;
        this.f89004d = 1;
        if (DelayKt.b(100L, this) == objH) {
            return objH;
        }
        shareImageDialogFragment = shareImageDialogFragmentX4;
        b40Var = b40VarC;
        this.f89005e.e5().f111676g.addView(b40Var.b());
        this.f89002b = shareImageDialogFragment;
        this.f89003c = b40Var;
        this.f89004d = 2;
        if (DelayKt.b(300L, this) == objH) {
            return objH;
        }
        b40Var2 = b40Var;
        shareImageDialogFragment2 = shareImageDialogFragment;
        RelativeLayout relativeLayout2 = b40Var2.f108789d;
        shareImageDialogFragment2.A4(com.max.hbimage.b.l(relativeLayout2, relativeLayout2.getMeasuredWidth(), b40Var2.f108789d.getMeasuredHeight()));
        shareImageDialogFragment2.V4(false);
        this.f89005e.e5().f111676g.removeView(b40Var2.b());
        Dota2MatchDetailFragment.Y4(this.f89005e);
        Dota2MatchDetailFragment.Z4(this.f89005e);
        shareImageDialogFragment2.show(this.f89005e.getChildFragmentManager(), "share_dota2_match_detail");
        return b2.f124493a;
    }
}
