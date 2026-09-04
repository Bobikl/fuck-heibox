package com.max.hbminiprogram.fragment;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.res.i;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.b1;
import androidx.lifecycle.j0;
import androidx.lifecycle.v;
import androidx.lifecycle.y;
import androidx.lifecycle.y0;
import androidx.navigation.fragment.NavHostFragment;
import com.google.gson.JsonObject;
import com.max.hbcommon.base.d;
import com.max.hbcommon.bean.ShareImageObj;
import com.max.hbcommon.component.TitleBar;
import com.max.hbminiprogram.R;
import com.max.hbminiprogram.bean.MiniProgramMenuInfoObj;
import com.max.hbminiprogram.bean.ScreenShotShareObj;
import com.max.hbminiprogram.bean.TopicInfoObj;
import com.max.hbminiprogram.f;
import com.max.hbminiprogram.h;
import com.max.hbshare.bean.HBShareProtocolData;
import com.max.hbutils.utils.ViewUtils;
import com.max.hbutils.utils.k;
import com.max.hbutils.utils.t;
import com.max.heybox.hblog.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.umeng.socialize.bean.SHARE_MEDIA;
import dl.e;
import kotlin.b2;
import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.t0;
import kotlin.jvm.internal.u;
import kotlin.z;
import kotlinx.coroutines.e1;
import kotlinx.coroutines.r0;
import pb.p;
import yh.l;

/* JADX INFO: compiled from: BaseLittleProgramFragment.kt */
/* JADX INFO: loaded from: classes11.dex */
@t0({"SMAP\nBaseLittleProgramFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseLittleProgramFragment.kt\ncom/max/hbminiprogram/fragment/BaseLittleProgramFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,435:1\n172#2,9:436\n252#3:445\n*S KotlinDebug\n*F\n+ 1 BaseLittleProgramFragment.kt\ncom/max/hbminiprogram/fragment/BaseLittleProgramFragment\n*L\n75#1:436,9\n258#1:445\n*E\n"})
public abstract class BaseLittleProgramFragment extends d {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.d
    public static final a f71248i = new a(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.d
    private static final String f71249j = "BaseLittleProgramFragment";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @dl.d
    public static final String f71250k = "/flutter/miniprogram_center";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @dl.d
    public static final String f71251l = "-9527";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final z f71252b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @e
    private String f71253c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f71254d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @e
    private Dialog f71255e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f71256f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f71257g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @e
    private HBShareProtocolData f71258h;

    /* JADX INFO: compiled from: BaseLittleProgramFragment.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: BaseLittleProgramFragment.kt */
    public static final class b implements Animation.AnimationListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f71259a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ BaseLittleProgramFragment f71260b;

        b(int i10, BaseLittleProgramFragment baseLittleProgramFragment) {
            this.f71259a = i10;
            this.f71260b = baseLittleProgramFragment;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(@e Animation animation) {
            if (PatchProxy.proxy(new Object[]{animation}, this, changeQuickRedirect, false, bb.c.i.f33410y0, new Class[]{Animation.class}, Void.TYPE).isSupported) {
                return;
            }
            g.f74531b.q("BaseLittleProgramFragment, onCreateAnimation, onAnimationEnd, nextAnim= " + this.f71259a);
            if (this.f71259a == R.anim.activity_open_enter_from_right) {
                this.f71260b.initData();
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(@e Animation animation) {
            if (PatchProxy.proxy(new Object[]{animation}, this, changeQuickRedirect, false, bb.c.i.f33415z0, new Class[]{Animation.class}, Void.TYPE).isSupported) {
                return;
            }
            g.f74531b.q("BaseLittleProgramFragment, onCreateAnimation, onAnimationRepeat");
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(@e Animation animation) {
            if (PatchProxy.proxy(new Object[]{animation}, this, changeQuickRedirect, false, bb.c.i.f33405x0, new Class[]{Animation.class}, Void.TYPE).isSupported) {
                return;
            }
            g.f74531b.q("BaseLittleProgramFragment, onCreateAnimation, onAnimationStart");
        }
    }

    /* JADX INFO: compiled from: BaseLittleProgramFragment.kt */
    public static final /* synthetic */ class c implements j0, a0 {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ l f71261a;

        c(l function) {
            f0.p(function, "function");
            this.f71261a = function;
        }

        @Override // androidx.lifecycle.j0
        public final /* synthetic */ void a(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.i.E0, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f71261a.invoke(obj);
        }

        @Override // kotlin.jvm.internal.a0
        @dl.d
        public final kotlin.u<?> b() {
            return this.f71261a;
        }

        public final boolean equals(@e Object obj) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.i.F0, new Class[]{Object.class}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            if ((obj instanceof j0) && (obj instanceof a0)) {
                return f0.g(b(), ((a0) obj).b());
            }
            return false;
        }

        public final int hashCode() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.i.G0, new Class[0], Integer.TYPE);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : b().hashCode();
        }
    }

    public BaseLittleProgramFragment() {
        final yh.a aVar = null;
        this.f71252b = FragmentViewModelLazyKt.h(this, n0.d(MiniProgramHostViewModel.class), new yh.a<b1>() { // from class: com.max.hbminiprogram.fragment.BaseLittleProgramFragment$special$$inlined$activityViewModels$default$1
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // yh.a
            @dl.d
            public final b1 invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.i.L0, new Class[0], b1.class);
                if (patchProxyResultProxy.isSupported) {
                    return (b1) patchProxyResultProxy.result;
                }
                b1 viewModelStore = this.requireActivity().getViewModelStore();
                f0.o(viewModelStore, "requireActivity().viewModelStore");
                return viewModelStore;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [androidx.lifecycle.b1, java.lang.Object] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ b1 invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.i.M0, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke();
            }
        }, new yh.a<u2.a>() { // from class: com.max.hbminiprogram.fragment.BaseLittleProgramFragment$special$$inlined$activityViewModels$default$2
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, u2.a] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ u2.a invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.i.O0, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke();
            }

            @Override // yh.a
            @dl.d
            public final u2.a invoke() {
                u2.a aVar2;
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.i.N0, new Class[0], u2.a.class);
                if (patchProxyResultProxy.isSupported) {
                    return (u2.a) patchProxyResultProxy.result;
                }
                yh.a aVar3 = aVar;
                if (aVar3 != null && (aVar2 = (u2.a) aVar3.invoke()) != null) {
                    return aVar2;
                }
                u2.a defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                f0.o(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
                return defaultViewModelCreationExtras;
            }
        }, new yh.a<y0.b>() { // from class: com.max.hbminiprogram.fragment.BaseLittleProgramFragment$special$$inlined$activityViewModels$default$3
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // yh.a
            @dl.d
            public final y0.b invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.i.P0, new Class[0], y0.b.class);
                if (patchProxyResultProxy.isSupported) {
                    return (y0.b) patchProxyResultProxy.result;
                }
                y0.b defaultViewModelProviderFactory = this.requireActivity().getDefaultViewModelProviderFactory();
                f0.o(defaultViewModelProviderFactory, "requireActivity().defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [androidx.lifecycle.y0$b, java.lang.Object] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ y0.b invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.i.Q0, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void U3(BaseLittleProgramFragment this$0, com.max.hbminiprogram.c callback, MiniProgramMenuInfoObj miniProgramMenuInfoObj) {
        if (PatchProxy.proxy(new Object[]{this$0, callback, miniProgramMenuInfoObj}, null, changeQuickRedirect, true, bb.c.i.f33335j0, new Class[]{BaseLittleProgramFragment.class, com.max.hbminiprogram.c.class, MiniProgramMenuInfoObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(this$0, "this$0");
        f0.p(callback, "$callback");
        this$0.f71258h = miniProgramMenuInfoObj != null ? miniProgramMenuInfoObj.getShare_info() : null;
        callback.a(miniProgramMenuInfoObj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i4(BaseLittleProgramFragment this$0, String str, MiniProgramMenuInfoObj miniProgramMenuInfoObj) {
        JsonObject jsonObject;
        if (PatchProxy.proxy(new Object[]{this$0, str, miniProgramMenuInfoObj}, null, changeQuickRedirect, true, bb.c.i.f33345l0, new Class[]{BaseLittleProgramFragment.class, String.class, MiniProgramMenuInfoObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(this$0, "this$0");
        if (miniProgramMenuInfoObj == null) {
            this$0.s4();
            return;
        }
        Bitmap bitmapX3 = this$0.X3();
        if (bitmapX3 != null) {
            ScreenShotShareObj screen_shot_share = miniProgramMenuInfoObj.getScreen_shot_share();
            if (screen_shot_share != null) {
                JsonObject screen_shot_share_info = screen_shot_share.getScreen_shot_share_info();
                if (screen_shot_share_info == null) {
                    screen_shot_share_info = new JsonObject();
                }
                screen_shot_share.setScreen_shot_share_info(screen_shot_share_info);
                JsonObject asJsonObject = screen_shot_share_info.getAsJsonObject("post_config");
                if (asJsonObject == null) {
                    asJsonObject = new JsonObject();
                }
                JsonObject asJsonObject2 = asJsonObject.getAsJsonObject("image_extra");
                if (asJsonObject2 == null) {
                    asJsonObject2 = new JsonObject();
                }
                asJsonObject2.addProperty("mini_program_id", this$0.f71253c);
                if (com.max.hbcommon.utils.c.u(str)) {
                    Bundle arguments = this$0.getArguments();
                    if (arguments != null && (jsonObject = (JsonObject) k.a(k.p(arguments), JsonObject.class)) != null) {
                        asJsonObject2.add("router_params", jsonObject.getAsJsonObject("mMap"));
                    }
                } else {
                    asJsonObject2.addProperty("web_url", str);
                }
                asJsonObject.add("image_extra", asJsonObject2);
                screen_shot_share_info.add("post_config", asJsonObject);
                JsonObject asJsonObject3 = screen_shot_share_info.getAsJsonObject("report");
                if (asJsonObject3 == null) {
                    asJsonObject3 = new JsonObject();
                }
                JsonObject asJsonObject4 = asJsonObject3.getAsJsonObject("extra");
                if (asJsonObject4 == null) {
                    asJsonObject4 = new JsonObject();
                }
                asJsonObject4.addProperty("mini_program_id", this$0.f71253c);
                asJsonObject3.add("extra", asJsonObject4);
                screen_shot_share_info.add("report", asJsonObject3);
                Log.d("image_extra", asJsonObject2.toString());
                Log.d("share_info", screen_shot_share_info.toString());
            }
            ScreenShotShareObj screen_shot_share2 = miniProgramMenuInfoObj.getScreen_shot_share();
            String strP = k.p(screen_shot_share2 != null ? screen_shot_share2.getScreen_shot_share_info() : null);
            ScreenShotShareObj screen_shot_share3 = miniProgramMenuInfoObj.getScreen_shot_share();
            kotlinx.coroutines.k.f(r0.a(e1.e()), null, null, new BaseLittleProgramFragment$onSystemScreenShot$1$1$2(this$0, new ShareImageObj(bitmapX3, strP, k.p(screen_shot_share3 != null ? screen_shot_share3.getStyle_info() : null)), null), 3, null);
        }
    }

    private final void k4(TitleBar titleBar, boolean z10) {
        if (PatchProxy.proxy(new Object[]{titleBar, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.i.Z, new Class[]{TitleBar.class, Boolean.TYPE}, Void.TYPE).isSupported || titleBar == null) {
            return;
        }
        int iE = z10 ? i.e(this.mContext.getResources(), R.color.text_primary_1_color, null) : i.e(this.mContext.getResources(), R.color.white_alpha70, null);
        TextView appbarLeftActionTextYView = titleBar.getAppbarLeftActionTextYView();
        if (appbarLeftActionTextYView != null) {
            appbarLeftActionTextYView.setTextColor(iE);
        }
        ImageView appbarLeftActionTextYArrowView = titleBar.getAppbarLeftActionTextYArrowView();
        if (appbarLeftActionTextYArrowView != null) {
            appbarLeftActionTextYArrowView.setColorFilter(iE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m4(TopicInfoObj topicInfoObj, BaseLittleProgramFragment this$0, View view) {
        if (PatchProxy.proxy(new Object[]{topicInfoObj, this$0, view}, null, changeQuickRedirect, true, bb.c.i.f33340k0, new Class[]{TopicInfoObj.class, BaseLittleProgramFragment.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(this$0, "this$0");
        String protocol = topicInfoObj.getProtocol();
        if (protocol != null) {
            p pVarP = ob.a.p();
            Activity mContext = this$0.mContext;
            f0.o(mContext, "mContext");
            pVarP.c(mContext, protocol);
        }
    }

    private final void s4() {
        Bitmap bitmapX3;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.i.f33325h0, new Class[0], Void.TYPE).isSupported || (bitmapX3 = X3()) == null) {
            return;
        }
        ShareImageObj shareImageObj = new ShareImageObj();
        shareImageObj.setBitmap(bitmapX3);
        kotlinx.coroutines.k.f(r0.a(e1.e()), null, null, new BaseLittleProgramFragment$showCommonScreenImage$1$1(this, shareImageObj, null), 3, null);
    }

    public final boolean P3() {
        return this.f71256f;
    }

    @e
    public final String Q3() {
        return this.f71253c;
    }

    public final boolean R3() {
        return this.f71257g;
    }

    @dl.d
    public final MiniProgramHostViewModel S3() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.i.I, new Class[0], MiniProgramHostViewModel.class);
        return patchProxyResultProxy.isSupported ? (MiniProgramHostViewModel) patchProxyResultProxy.result : (MiniProgramHostViewModel) this.f71252b.getValue();
    }

    public final void T3(@dl.d final com.max.hbminiprogram.c callback) {
        if (PatchProxy.proxy(new Object[]{callback}, this, changeQuickRedirect, false, bb.c.i.V, new Class[]{com.max.hbminiprogram.c.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(callback, "callback");
        if (!(getActivity() instanceof h)) {
            callback.a(null);
        }
        LayoutInflater.Factory activity = getActivity();
        f0.n(activity, "null cannot be cast to non-null type com.max.hbminiprogram.MiniProgramContext");
        com.max.hbminiprogram.i iVarK0 = ((h) activity).k0();
        if (iVarK0 != null) {
            iVarK0.b(new com.max.hbminiprogram.c() { // from class: com.max.hbminiprogram.fragment.b
                @Override // com.max.hbminiprogram.c
                public final void a(MiniProgramMenuInfoObj miniProgramMenuInfoObj) {
                    BaseLittleProgramFragment.U3(this.f71296a, callback, miniProgramMenuInfoObj);
                }
            });
        }
    }

    public final void V3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.i.P, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        androidx.lifecycle.z.a(this).f(new BaseLittleProgramFragment$getMiniProgramTopicInfo$1(this, null));
    }

    @e
    public final HBShareProtocolData W3() {
        return this.f71258h;
    }

    @e
    public Bitmap X3() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.i.f33330i0, new Class[0], Bitmap.class);
        return patchProxyResultProxy.isSupported ? (Bitmap) patchProxyResultProxy.result : ViewUtils.U(this.rootView);
    }

    @e
    public final String Y3(@e SHARE_MEDIA share_media) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{share_media}, this, changeQuickRedirect, false, bb.c.i.f33296c0, new Class[]{SHARE_MEDIA.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return ob.a.b().c(share_media != null ? share_media.name() : null);
    }

    public final boolean Z3() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.i.f33290b0, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (getContext() instanceof f) {
            return (getParentFragment() == null || (getParentFragment() instanceof NavHostFragment)) && !this.f71257g;
        }
        return false;
    }

    public void a4(@e View view, boolean z10) {
        if (PatchProxy.proxy(new Object[]{view, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.i.M, new Class[]{View.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        V3();
    }

    public final boolean b4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.i.W, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return f0.g(getTag(), f71251l) || f4();
    }

    public final boolean c4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.i.f33308e0, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return (getContext() instanceof h) && (getParentFragment() instanceof NavHostFragment);
    }

    public final boolean d4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.i.f33284a0, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (getContext() instanceof h) {
            return (getParentFragment() == null || (getParentFragment() instanceof NavHostFragment)) && !this.f71257g;
        }
        return false;
    }

    public abstract boolean e4();

    public final boolean f4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.i.f33314f0, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        try {
            return (d4() || Z3()) && androidx.navigation.fragment.e.a(this).a0() == null;
        } catch (Exception unused) {
            return false;
        }
    }

    public abstract void g4();

    public void h4(@e String str, @e final String str2) {
        if (PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, bb.c.i.f33320g0, new Class[]{String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        if (!(getActivity() instanceof h)) {
            s4();
            return;
        }
        if (com.max.hbcommon.utils.c.u(this.f71253c)) {
            s4();
            return;
        }
        LayoutInflater.Factory activity = getActivity();
        f0.n(activity, "null cannot be cast to non-null type com.max.hbminiprogram.MiniProgramContext");
        com.max.hbminiprogram.i iVarK0 = ((h) activity).k0();
        if (iVarK0 != null) {
            iVarK0.b(new com.max.hbminiprogram.c() { // from class: com.max.hbminiprogram.fragment.c
                @Override // com.max.hbminiprogram.c
                public final void a(MiniProgramMenuInfoObj miniProgramMenuInfoObj) {
                    BaseLittleProgramFragment.i4(this.f71298a, str2, miniProgramMenuInfoObj);
                }
            });
        }
    }

    @Override // com.max.hbcommon.base.d
    public void initData() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.i.T, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.initData();
        g.f74531b.s(f71249j, "initData, this = " + this + ", mMiniProgramId = " + this.f71253c);
    }

    @Override // com.max.hbcommon.base.d
    public final void installViews(@e View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.i.L, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        super.installViews(view);
        a4(view, this.f71254d);
        this.f71254d = true;
    }

    public int j4() {
        return 1;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0083  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void l4(@e TitleBar titleBar, @e final TopicInfoObj topicInfoObj, boolean z10) {
        ViewGroup appbarLeftActionVgYView;
        int iF;
        if (PatchProxy.proxy(new Object[]{titleBar, topicInfoObj, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.i.Y, new Class[]{TitleBar.class, TopicInfoObj.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        g.f74531b.q("BaseLittleProgramFragment, refreshTopicView, topicInfoObj = " + topicInfoObj);
        if (topicInfoObj == null || titleBar == null || (appbarLeftActionVgYView = titleBar.getAppbarLeftActionVgYView()) == null) {
            return;
        }
        ImageView appbarLeftActionButtonView = titleBar.getAppbarLeftActionButtonView();
        f0.o(appbarLeftActionButtonView, "getAppbarLeftActionButtonView(...)");
        if ((appbarLeftActionButtonView.getVisibility() == 0) == true) {
            iF = 0;
        } else {
            ImageView appbarLeftActionButtonXView = titleBar.getAppbarLeftActionButtonXView();
            f0.o(appbarLeftActionButtonXView, "getAppbarLeftActionButtonXView(...)");
            if (appbarLeftActionButtonXView.getVisibility() == 0) {
                iF = 0;
            } else {
                iF = ViewUtils.f(this.mContext, 12.0f);
            }
        }
        ViewGroup.LayoutParams layoutParams = appbarLeftActionVgYView.getLayoutParams();
        f0.n(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMarginStart(iF);
        appbarLeftActionVgYView.setLayoutParams(marginLayoutParams);
        appbarLeftActionVgYView.setVisibility(0);
        com.max.hbimage.b.d0(topicInfoObj.getPic_url(), titleBar.getAppbarLeftActionButtonYView(), ViewUtils.o(this.mContext, titleBar.getAppbarLeftActionButtonYView()));
        titleBar.getAppbarLeftActionTextYView().setText(topicInfoObj.getName());
        appbarLeftActionVgYView.setOnClickListener(new View.OnClickListener() { // from class: com.max.hbminiprogram.fragment.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BaseLittleProgramFragment.m4(topicInfoObj, this, view);
            }
        });
        k4(titleBar, z10);
    }

    @Override // com.max.hbcommon.base.d
    public void loadData() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.i.S, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (!f4()) {
            super.loadData();
        } else if (this.mIsPrepared && this.mIsFirst) {
            initData();
            this.mIsFirst = false;
        }
    }

    public final void n4(boolean z10) {
        this.f71256f = z10;
    }

    public final void o4(@e String str) {
        this.f71253c = str;
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onCreate(@e Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{bundle}, this, changeQuickRedirect, false, bb.c.i.J, new Class[]{Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onCreate(bundle);
        getLifecycle().a(new v() { // from class: com.max.hbminiprogram.fragment.BaseLittleProgramFragment.onCreate.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // androidx.lifecycle.v
            public void d(@dl.d y source, @dl.d Lifecycle.Event event) {
                if (PatchProxy.proxy(new Object[]{source, event}, this, changeQuickRedirect, false, bb.c.i.f33380s0, new Class[]{y.class, Lifecycle.Event.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(source, "source");
                f0.p(event, "event");
                g.f74531b.q("BaseLittleProgramFragment(" + BaseLittleProgramFragment.this + "), onStateChanged, event = " + event + " targetState = " + event.getTargetState());
            }
        });
        getViewLifecycleOwnerLiveData().k(this, new c(new l<y, b2>() { // from class: com.max.hbminiprogram.fragment.BaseLittleProgramFragment.onCreate.2
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(1);
            }

            public final void a(y yVar) {
                if (PatchProxy.proxy(new Object[]{yVar}, this, changeQuickRedirect, false, bb.c.i.f33385t0, new Class[]{y.class}, Void.TYPE).isSupported) {
                    return;
                }
                g.f74531b.q("BaseLittleProgramFragment(" + BaseLittleProgramFragment.this + "), viewLifecycleOwnerLiveData, currentState = " + yVar.getLifecycle().b());
            }

            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(y yVar) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{yVar}, this, changeQuickRedirect, false, bb.c.i.f33390u0, new Class[]{Object.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                a(yVar);
                return b2.f124493a;
            }
        }));
        S3().i().k(this, new c(new l<String, b2>() { // from class: com.max.hbminiprogram.fragment.BaseLittleProgramFragment.onCreate.3
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(1);
            }

            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(String str) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, bb.c.i.f33400w0, new Class[]{Object.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                invoke2(str);
                return b2.f124493a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(String str) {
                if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, bb.c.i.f33395v0, new Class[]{String.class}, Void.TYPE).isSupported) {
                    return;
                }
                BaseLittleProgramFragment.this.o4(str);
            }
        }));
    }

    @Override // androidx.fragment.app.Fragment
    @e
    public Animation onCreateAnimation(int i10, boolean z10, int i11) {
        Object[] objArr = {new Integer(i10), new Byte(z10 ? (byte) 1 : (byte) 0), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.i.Q, new Class[]{cls, Boolean.TYPE, cls}, Animation.class);
        if (patchProxyResultProxy.isSupported) {
            return (Animation) patchProxyResultProxy.result;
        }
        g.a aVar = g.f74531b;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("BaseLittleProgramFragment, onCreateAnimation, transit = ");
        sb2.append(i10);
        sb2.append(", enter = ");
        sb2.append(z10);
        sb2.append(", nextAnim = ");
        sb2.append(i11);
        sb2.append(", activity_open_enter_from_right = ");
        int i12 = R.anim.activity_open_enter_from_right;
        sb2.append(i12);
        aVar.q(sb2.toString());
        if (i11 != i12) {
            return super.onCreateAnimation(i10, z10, i11);
        }
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(getActivity(), i11);
        f0.o(animationLoadAnimation, "loadAnimation(...)");
        animationLoadAnimation.setAnimationListener(new b(i11, this));
        return animationLoadAnimation;
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    @e
    public View onCreateView(@dl.d LayoutInflater inflater, @e ViewGroup viewGroup, @e Bundle bundle) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{inflater, viewGroup, bundle}, this, changeQuickRedirect, false, bb.c.i.K, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        f0.p(inflater, "inflater");
        if (d4()) {
            this.isInFragmentStack = true;
            this.backIconInvisible = f4();
        }
        return super.onCreateView(inflater, viewGroup, bundle);
    }

    @Override // com.max.hbcommon.base.d
    public void onRefresh() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.i.U, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onRefresh();
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onResume() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.i.R, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onResume();
        g.f74531b.s(f71249j, "onResume, this = " + this + ", mMiniProgramId = " + this.f71253c);
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onStart() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.i.N, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onStart();
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onViewCreated(@dl.d View view, @e Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{view, bundle}, this, changeQuickRedirect, false, bb.c.i.O, new Class[]{View.class, Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(view, "view");
        super.onViewCreated(view, bundle);
        if (Z3()) {
            t.M(this.mContext, e4());
            if (getContext() instanceof Activity) {
                Context context = getContext();
                f0.n(context, "null cannot be cast to non-null type android.app.Activity");
                if (((Activity) context).getRequestedOrientation() != j4()) {
                    Context context2 = getContext();
                    f0.n(context2, "null cannot be cast to non-null type android.app.Activity");
                    ((Activity) context2).setRequestedOrientation(j4());
                }
            }
        }
    }

    public final void p4(boolean z10) {
        this.f71257g = z10;
    }

    public final void q4(@e HBShareProtocolData hBShareProtocolData) {
        this.f71258h = hBShareProtocolData;
    }

    public void r4(@e TopicInfoObj topicInfoObj, boolean z10) {
        if (PatchProxy.proxy(new Object[]{topicInfoObj, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.i.X, new Class[]{TopicInfoObj.class, Boolean.TYPE}, Void.TYPE).isSupported || topicInfoObj == null || topicInfoObj.getPic_url() == null) {
            return;
        }
        l4(this.mTitleBar, topicInfoObj, z10);
    }

    @Override // com.max.hbcommon.base.d
    public boolean shouldKeepViewOnDestroyView() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.i.f33302d0, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        g.f74531b.q("BaseLittleProgramFragment, shouldKeepviewOnDestroyView(" + this + "), parentFragment = " + getParentFragment());
        if (!(getContext() instanceof h)) {
            return false;
        }
        Object context = getContext();
        f0.n(context, "null cannot be cast to non-null type com.max.hbminiprogram.MiniProgramContext");
        return ((h) context).p();
    }
}
