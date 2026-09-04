package com.max.xiaoheihe.module.littleprogram.fragment.dota2;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.o;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.n0;
import androidx.lifecycle.y;
import androidx.lifecycle.z;
import androidx.transition.v;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.google.gson.JsonObject;
import com.max.hbcommon.analytics.m;
import com.max.hbcustomview.loadingdialog.LoadingDialog;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.hbutils.utils.q;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.dota2.Dota2MatchDetailObj;
import com.max.xiaoheihe.module.webview.WebFragmentDialog;
import com.max.xiaoheihe.module.webview.WebviewFragment;
import com.max.xiaoheihe.network.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import df.i8;
import java.util.Map;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.e1;
import kotlinx.coroutines.k;
import kotlinx.coroutines.q0;
import kotlinx.coroutines.r0;

/* JADX INFO: compiled from: Dota2MatchDetailFragment.kt */
/* JADX INFO: loaded from: classes11.dex */
@m(path = lb.d.U3)
@o(parameters = 0)
@n9.a({com.max.hbminiprogram.d.class})
public final class Dota2MatchDetailFragment extends com.max.xiaoheihe.module.littleprogram.fragment.dota2.a implements com.max.xiaoheihe.module.littleprogram.fragment.dota2.b.InterfaceC0813b {

    @dl.d
    public static final a D = new a(null);
    public static final int E = 8;

    @dl.d
    public static final String F = "match_id";
    public static ChangeQuickRedirect changeQuickRedirect;

    @dl.e
    private Dota2MatchDetailObj A;

    @dl.e
    private ImageView B;

    @dl.e
    private LoadingDialog C;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public i8 f88992u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @dl.d
    private final q0 f88993v = r0.a(e1.e());

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @dl.e
    private String f88994w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @dl.e
    private String f88995x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @dl.e
    private String f88996y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private long f88997z;

    /* JADX INFO: compiled from: Dota2MatchDetailFragment.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        @dl.d
        public final Fragment a(@dl.e Map<String, ? extends Object> map) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{map}, this, changeQuickRedirect, false, 39219, new Class[]{Map.class}, Fragment.class);
            if (patchProxyResultProxy.isSupported) {
                return (Fragment) patchProxyResultProxy.result;
            }
            Bundle bundle = new Bundle();
            String str = (String) (map != null ? map.get(Dota2GameDetailFragment.C.b()) : null);
            String str2 = (String) (map != null ? map.get(Dota2GameDetailFragment.C.a()) : null);
            Object obj = map != null ? map.get(Dota2MatchDetailFragment.F) : null;
            Dota2GameDetailFragment.a aVar = Dota2GameDetailFragment.C;
            bundle.putString(aVar.b(), str);
            bundle.putString(aVar.a(), str2);
            bundle.putString(Dota2MatchDetailFragment.F, (String) obj);
            Dota2MatchDetailFragment dota2MatchDetailFragment = new Dota2MatchDetailFragment();
            dota2MatchDetailFragment.setArguments(bundle);
            return dota2MatchDetailFragment;
        }
    }

    /* JADX INFO: compiled from: Dota2MatchDetailFragment.kt */
    public static final class b implements ViewPager.i {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public void onPageScrollStateChanged(int i10) {
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public void onPageScrolled(int i10, float f10, int i11) {
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public void onPageSelected(int i10) {
            if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 39236, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            v.a(Dota2MatchDetailFragment.this.e5().b());
            if (i10 == 0) {
                Dota2MatchDetailFragment.this.e5().f111675f.setAlpha(1.0f);
                Dota2MatchDetailFragment.this.e5().f111673d.setAlpha(0.0f);
            } else {
                Dota2MatchDetailFragment.this.e5().f111675f.setAlpha(0.0f);
                Dota2MatchDetailFragment.this.e5().f111673d.setAlpha(1.0f);
            }
        }
    }

    /* JADX INFO: compiled from: Dota2MatchDetailFragment.kt */
    public static final class c extends n0 {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ boolean f89000m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(boolean z10, FragmentManager fragmentManager) {
            super(fragmentManager);
            this.f89000m = z10;
        }

        @Override // androidx.viewpager.widget.a
        public int getCount() {
            return this.f89000m ? 2 : 1;
        }

        @Override // androidx.fragment.app.n0
        @dl.d
        public Fragment getItem(int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 39237, new Class[]{Integer.TYPE}, Fragment.class);
            if (patchProxyResultProxy.isSupported) {
                return (Fragment) patchProxyResultProxy.result;
            }
            if (i10 == 0) {
                return com.max.xiaoheihe.module.littleprogram.fragment.dota2.b.f89090j.e(Dota2MatchDetailFragment.this.g5());
            }
            Dota2MatchDetailObj dota2MatchDetailObjG5 = Dota2MatchDetailFragment.this.g5();
            WebviewFragment webviewFragmentA = new com.max.xiaoheihe.module.webview.u(dota2MatchDetailObjG5 != null ? dota2MatchDetailObjG5.getRep_url() : null).f(0).u(false).j(false).n(false).m(true).y(null).z(true).a();
            webviewFragmentA.n4(true);
            return webviewFragmentA;
        }

        @Override // androidx.viewpager.widget.a
        public int getItemPosition(@dl.d Object object) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{object}, this, changeQuickRedirect, false, 39238, new Class[]{Object.class}, Integer.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Integer) patchProxyResultProxy.result).intValue();
            }
            f0.p(object, "object");
            return -2;
        }

        @Override // androidx.viewpager.widget.a
        @dl.e
        public CharSequence getPageTitle(int i10) {
            return i10 == 0 ? "比赛数据" : "时间轴";
        }
    }

    public static final /* synthetic */ void Y4(Dota2MatchDetailFragment dota2MatchDetailFragment) {
        if (PatchProxy.proxy(new Object[]{dota2MatchDetailFragment}, null, changeQuickRedirect, true, 39216, new Class[]{Dota2MatchDetailFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        dota2MatchDetailFragment.j5();
    }

    public static final /* synthetic */ void Z4(Dota2MatchDetailFragment dota2MatchDetailFragment) {
        if (PatchProxy.proxy(new Object[]{dota2MatchDetailFragment}, null, changeQuickRedirect, true, 39217, new Class[]{Dota2MatchDetailFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        dota2MatchDetailFragment.k5();
    }

    public static final /* synthetic */ void a5(Dota2MatchDetailFragment dota2MatchDetailFragment) {
        if (PatchProxy.proxy(new Object[]{dota2MatchDetailFragment}, null, changeQuickRedirect, true, 39218, new Class[]{Dota2MatchDetailFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        dota2MatchDetailFragment.l5();
    }

    public static final /* synthetic */ void c5(Dota2MatchDetailFragment dota2MatchDetailFragment) {
        if (PatchProxy.proxy(new Object[]{dota2MatchDetailFragment}, null, changeQuickRedirect, true, 39214, new Class[]{Dota2MatchDetailFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        dota2MatchDetailFragment.o5();
    }

    public static final /* synthetic */ void d5(Dota2MatchDetailFragment dota2MatchDetailFragment) {
        if (PatchProxy.proxy(new Object[]{dota2MatchDetailFragment}, null, changeQuickRedirect, true, 39215, new Class[]{Dota2MatchDetailFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        dota2MatchDetailFragment.p5();
    }

    private final void j5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39208, new Class[0], Void.TYPE).isSupported || !isActive() || this.B == null) {
            return;
        }
        this.mContext.getWindowManager().removeView(this.B);
        this.B = null;
    }

    private final void k5() {
        LoadingDialog loadingDialog;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39210, new Class[0], Void.TYPE).isSupported || (loadingDialog = this.C) == null) {
            return;
        }
        loadingDialog.c();
    }

    private final void l5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39203, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Dota2MatchDetailObj dota2MatchDetailObj = this.A;
        boolean z10 = !com.max.hbcommon.utils.c.u(dota2MatchDetailObj != null ? dota2MatchDetailObj.getRep_url() : null);
        e5().f111672c.setVisibility(z10 ? 0 : 8);
        e5().f111678i.setAdapter(new c(z10, getChildFragmentManager()));
        e5().f111672c.setupWithViewPager(e5().f111678i);
        e5().f111678i.c(new b());
    }

    private final void o5() {
        Bitmap bitmapR6;
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39207, new Class[0], Void.TYPE).isSupported && isActive() && this.B == null) {
            this.B = new ImageView(this.mContext);
            if (getParentFragment() instanceof WebFragmentDialog) {
                WebFragmentDialog webFragmentDialog = (WebFragmentDialog) getParentFragment();
                f0.m(webFragmentDialog);
                Dialog dialog = webFragmentDialog.getDialog();
                f0.m(dialog);
                Window window = dialog.getWindow();
                f0.m(window);
                bitmapR6 = WebviewFragment.R6(window.getDecorView());
                f0.o(bitmapR6, "{\n                    We…orView)\n                }");
            } else {
                bitmapR6 = WebviewFragment.R6(this.mContext.getWindow().getDecorView());
                f0.o(bitmapR6, "{\n                    We…orView)\n                }");
            }
            ImageView imageView = this.B;
            if (imageView != null) {
                imageView.setImageBitmap(bitmapR6);
            }
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(2, 134219544, -2);
            layoutParams.width = -1;
            layoutParams.height = ViewUtils.u(this.mContext);
            layoutParams.gravity = 51;
            layoutParams.y = 0;
            layoutParams.x = 0;
            this.mContext.getWindowManager().addView(this.B, layoutParams);
        }
    }

    private final void p5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39209, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (this.C == null) {
            Activity mContext = this.mContext;
            f0.o(mContext, "mContext");
            this.C = new LoadingDialog(mContext, "");
        }
        LoadingDialog loadingDialog = this.C;
        if (loadingDialog != null) {
            loadingDialog.r();
        }
    }

    @Override // com.max.xiaoheihe.module.littleprogram.fragment.dota2.b.InterfaceC0813b
    @SuppressLint({"AutoDispose"})
    public void I2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39202, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) i.a().g9(this.f88994w, this.f88995x, this.f88996y).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new com.max.hbcommon.network.d<Result<Dota2MatchDetailObj>>() { // from class: com.max.xiaoheihe.module.littleprogram.fragment.dota2.Dota2MatchDetailFragment$getMatchDetail$1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.max.hbcommon.network.d, io.reactivex.g0
            public void onError(@dl.d Throwable e10) {
                if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 39225, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(e10, "e");
                super.onError(e10);
                if (this.f89007b.isActive()) {
                    y viewLifecycleOwner = this.f89007b.getViewLifecycleOwner();
                    f0.o(viewLifecycleOwner, "viewLifecycleOwner");
                    k.f(z.a(viewLifecycleOwner), null, null, new Dota2MatchDetailFragment$getMatchDetail$1$onError$1(this.f89007b, null), 3, null);
                }
            }

            public void onNext(@dl.d Result<Dota2MatchDetailObj> result) {
                if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 39226, new Class[]{Result.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(result, "result");
                if (this.f89007b.isActive()) {
                    y viewLifecycleOwner = this.f89007b.getViewLifecycleOwner();
                    f0.o(viewLifecycleOwner, "viewLifecycleOwner");
                    k.f(z.a(viewLifecycleOwner), null, null, new Dota2MatchDetailFragment$getMatchDetail$1$onNext$1(this.f89007b, result, null), 3, null);
                }
            }

            @Override // com.max.hbcommon.network.d, io.reactivex.g0
            public /* bridge */ /* synthetic */ void onNext(Object obj) {
                if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 39227, new Class[]{Object.class}, Void.TYPE).isSupported) {
                    return;
                }
                onNext((Result<Dota2MatchDetailObj>) obj);
            }
        }));
    }

    @Override // com.max.xiaoheihe.module.littleprogram.fragment.dota2.d
    @dl.d
    public View K4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39201, new Class[0], View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        i8 i8VarC = i8.c(this.mInflater);
        f0.o(i8VarC, "inflate(mInflater)");
        m5(i8VarC);
        Bundle arguments = getArguments();
        if (arguments != null) {
            Dota2GameDetailFragment.a aVar = Dota2GameDetailFragment.C;
            this.f88995x = arguments.getString(aVar.b());
            this.f88996y = arguments.getString(aVar.a());
            this.f88994w = arguments.getString(F);
        }
        this.f88997z = System.currentTimeMillis();
        e5().f111678i.setOffscreenPageLimit(1);
        e5().f111675f.setBackground(q.o(this.mContext, R.color.dota2_share_icon_red, 27.0f));
        e5().f111675f.setOnClickListener(new View.OnClickListener() { // from class: com.max.xiaoheihe.module.littleprogram.fragment.dota2.Dota2MatchDetailFragment$getInnerView$2
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Dota2MatchDetailObj dota2MatchDetailObjG5;
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 39220, new Class[]{View.class}, Void.TYPE).isSupported || this.f89001b.B != null || (dota2MatchDetailObjG5 = this.f89001b.g5()) == null) {
                    return;
                }
                Dota2MatchDetailFragment dota2MatchDetailFragment = this.f89001b;
                k.f(dota2MatchDetailFragment.f88993v, null, null, new Dota2MatchDetailFragment$getInnerView$2$1$1(dota2MatchDetailFragment, dota2MatchDetailObjG5, null), 3, null);
            }
        });
        CircularProgressIndicator circularProgressIndicator = J4().f111334f;
        circularProgressIndicator.setTrackColor(this.mContext.getColor(R.color.white_alpha30));
        circularProgressIndicator.setIndicatorColor(this.mContext.getColor(R.color.divider_primary_1_color));
        circularProgressIndicator.p();
        I2();
        FrameLayout frameLayoutB = e5().b();
        f0.o(frameLayoutB, "binding.root");
        return frameLayoutB;
    }

    @Override // com.max.hbminiprogram.NativeLittleProgramFragment, com.max.hbminiprogram.d
    @dl.d
    public Fragment a2(@dl.e Map<String, ? extends Object> map) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{map}, this, changeQuickRedirect, false, 39211, new Class[]{Map.class}, Fragment.class);
        return patchProxyResultProxy.isSupported ? (Fragment) patchProxyResultProxy.result : D.a(map);
    }

    @Override // com.max.xiaoheihe.module.littleprogram.fragment.dota2.d, com.max.hbminiprogram.NativeLittleProgramFragment, com.max.hbminiprogram.fragment.BaseLittleProgramFragment
    public boolean e4() {
        return false;
    }

    @dl.d
    public final i8 e5() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39199, new Class[0], i8.class);
        if (patchProxyResultProxy.isSupported) {
            return (i8) patchProxyResultProxy.result;
        }
        i8 i8Var = this.f88992u;
        if (i8Var != null) {
            return i8Var;
        }
        f0.S("binding");
        return null;
    }

    @dl.d
    public final ImageView f5() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39206, new Class[0], ImageView.class);
        if (patchProxyResultProxy.isSupported) {
            return (ImageView) patchProxyResultProxy.result;
        }
        ImageView imageView = J4().f111331c;
        f0.o(imageView, "baseBinding.ivHeader");
        return imageView;
    }

    @dl.e
    public final Dota2MatchDetailObj g5() {
        return this.A;
    }

    @Override // com.max.hbcommon.base.d, com.max.hbcommon.analytics.d.f
    @dl.e
    public String getPageAdditional() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39212, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty(F, this.f88994w);
        Dota2GameDetailFragment.a aVar = Dota2GameDetailFragment.C;
        jsonObject.addProperty(aVar.b(), this.f88995x);
        jsonObject.addProperty(aVar.a(), this.f88996y);
        return jsonObject.toString();
    }

    @Override // com.max.hbminiprogram.fragment.BaseLittleProgramFragment
    public void h4(@dl.e String str, @dl.e String str2) {
        if (PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 39213, new Class[]{String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        y viewLifecycleOwner = getViewLifecycleOwner();
        f0.o(viewLifecycleOwner, "viewLifecycleOwner");
        k.f(z.a(viewLifecycleOwner), null, null, new Dota2MatchDetailFragment$onSystemScreenShot$1(this, null), 3, null);
    }

    @dl.e
    public final com.max.xiaoheihe.module.littleprogram.fragment.dota2.b h5() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39204, new Class[0], com.max.xiaoheihe.module.littleprogram.fragment.dota2.b.class);
        if (patchProxyResultProxy.isSupported) {
            return (com.max.xiaoheihe.module.littleprogram.fragment.dota2.b) patchProxyResultProxy.result;
        }
        for (Fragment fragment : getChildFragmentManager().J0()) {
            if (fragment instanceof com.max.xiaoheihe.module.littleprogram.fragment.dota2.b) {
                return (com.max.xiaoheihe.module.littleprogram.fragment.dota2.b) fragment;
            }
        }
        return null;
    }

    @dl.d
    public final ViewGroup i5() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39205, new Class[0], ViewGroup.class);
        if (patchProxyResultProxy.isSupported) {
            return (ViewGroup) patchProxyResultProxy.result;
        }
        LinearLayout linearLayoutB = e5().f111677h.b();
        f0.o(linearLayoutB, "binding.vgTop.root");
        return linearLayoutB;
    }

    public final void m5(@dl.d i8 i8Var) {
        if (PatchProxy.proxy(new Object[]{i8Var}, this, changeQuickRedirect, false, 39200, new Class[]{i8.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(i8Var, "<set-?>");
        this.f88992u = i8Var;
    }

    public final void n5(@dl.e Dota2MatchDetailObj dota2MatchDetailObj) {
        this.A = dota2MatchDetailObj;
    }
}
