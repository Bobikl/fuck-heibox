package com.max.xiaoheihe.module.game.adapter.recommend.binder;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.max.hbcustomview.RippleView;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.MenuObj;
import com.max.xiaoheihe.bean.game.recommend.GameRecommendBaseObj;
import com.max.xiaoheihe.bean.game.recommend.MenuV2Obj;
import com.max.xiaoheihe.utils.i0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.File;
import java.io.FileInputStream;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: MenuV2VHB.kt */
/* JADX INFO: loaded from: classes11.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class h extends r {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.d
    public static final a f86131h = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f86132i = 8;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private RecommendVHBParam f86133g;

    /* JADX INFO: compiled from: MenuV2VHB.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: com.max.xiaoheihe.module.game.adapter.recommend.binder.h$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: MenuV2VHB.kt */
        public static final class C0779a extends com.max.hbcommon.base.adapter.s<MenuObj> {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Context f86134b;

            /* JADX INFO: renamed from: com.max.xiaoheihe.module.game.adapter.recommend.binder.h$a$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: MenuV2VHB.kt */
            public static final class ViewOnClickListenerC0780a implements View.OnClickListener {
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ Context f86135b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ MenuObj f86136c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ C0779a f86137d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                final /* synthetic */ com.max.hbcommon.base.adapter.s.e f86138e;

                ViewOnClickListenerC0780a(Context context, MenuObj menuObj, C0779a c0779a, com.max.hbcommon.base.adapter.s.e eVar) {
                    this.f86135b = context;
                    this.f86136c = menuObj;
                    this.f86137d = c0779a;
                    this.f86138e = eVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 35992, new Class[]{View.class}, Void.TYPE).isSupported) {
                        return;
                    }
                    i.f86151h.a(this.f86135b, this.f86136c);
                    if (i0.s()) {
                        com.max.hbcache.c.C("menu_v2_lottie" + this.f86136c.getLottie_key(), "" + System.currentTimeMillis());
                        this.f86137d.notifyItemChanged(this.f86138e.getAbsoluteAdapterPosition());
                    }
                }
            }

            /* JADX INFO: renamed from: com.max.xiaoheihe.module.game.adapter.recommend.binder.h$a$a$b */
            /* JADX INFO: compiled from: MenuV2VHB.kt */
            public static final class b implements ValueAnimator.AnimatorUpdateListener {
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ ViewGroup f86139b;

                b(ViewGroup viewGroup) {
                    this.f86139b = viewGroup;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(@dl.d ValueAnimator valueAnimator) {
                    if (PatchProxy.proxy(new Object[]{valueAnimator}, this, changeQuickRedirect, false, 35993, new Class[]{ValueAnimator.class}, Void.TYPE).isSupported) {
                        return;
                    }
                    f0.p(valueAnimator, "valueAnimator");
                    Object animatedValue = valueAnimator.getAnimatedValue();
                    f0.n(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                    this.f86139b.setTranslationY(((Float) animatedValue).floatValue());
                }
            }

            /* JADX INFO: renamed from: com.max.xiaoheihe.module.game.adapter.recommend.binder.h$a$a$c */
            /* JADX INFO: compiled from: MenuV2VHB.kt */
            public static final class c implements com.max.hbimage.b.q {
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ ImageView f86140a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ int f86141b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ int f86142c;

                c(ImageView imageView, int i10, int i11) {
                    this.f86140a = imageView;
                    this.f86141b = i10;
                    this.f86142c = i11;
                }

                @Override // com.max.hbimage.b.q
                public void a(@dl.e Drawable drawable) {
                    if (PatchProxy.proxy(new Object[]{drawable}, this, changeQuickRedirect, false, 35994, new Class[]{Drawable.class}, Void.TYPE).isSupported || drawable == null) {
                        return;
                    }
                    ImageView imageView = this.f86140a;
                    int i10 = this.f86141b;
                    int i11 = this.f86142c;
                    if (imageView != null) {
                        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                        float minimumWidth = drawable.getMinimumWidth() / drawable.getMinimumHeight();
                        if (minimumWidth > i10 / i11) {
                            layoutParams.width = i10;
                            layoutParams.height = (int) (i10 / minimumWidth);
                        } else {
                            layoutParams.height = i11;
                            layoutParams.width = (int) (i11 * minimumWidth);
                        }
                        imageView.setLayoutParams(layoutParams);
                        imageView.setImageDrawable(drawable);
                    }
                }

                @Override // com.max.hbimage.b.q
                public /* synthetic */ void b(Drawable drawable) {
                    com.max.hbimage.d.a(this, drawable);
                }

                @Override // com.max.hbimage.b.q
                public void onLoadFailed(@dl.e Drawable drawable) {
                }
            }

            /* JADX INFO: renamed from: com.max.xiaoheihe.module.game.adapter.recommend.binder.h$a$a$d */
            /* JADX INFO: compiled from: MenuV2VHB.kt */
            public static final class d implements View.OnClickListener {
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ Context f86143b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ MenuObj f86144c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ C0779a f86145d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                final /* synthetic */ com.max.hbcommon.base.adapter.s.e f86146e;

                d(Context context, MenuObj menuObj, C0779a c0779a, com.max.hbcommon.base.adapter.s.e eVar) {
                    this.f86143b = context;
                    this.f86144c = menuObj;
                    this.f86145d = c0779a;
                    this.f86146e = eVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 35995, new Class[]{View.class}, Void.TYPE).isSupported) {
                        return;
                    }
                    i.f86151h.a(this.f86143b, this.f86144c);
                    if (i0.s()) {
                        com.max.hbcache.c.C("menu_v2_animator" + this.f86144c.getKey(), "" + System.currentTimeMillis());
                        this.f86145d.notifyItemChanged(this.f86146e.getAbsoluteAdapterPosition());
                    }
                }
            }

            /* JADX INFO: renamed from: com.max.xiaoheihe.module.game.adapter.recommend.binder.h$a$a$e */
            /* JADX INFO: compiled from: MenuV2VHB.kt */
            public static final class e implements View.OnClickListener {
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ Context f86147b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ MenuObj f86148c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ C0779a f86149d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                final /* synthetic */ com.max.hbcommon.base.adapter.s.e f86150e;

                e(Context context, MenuObj menuObj, C0779a c0779a, com.max.hbcommon.base.adapter.s.e eVar) {
                    this.f86147b = context;
                    this.f86148c = menuObj;
                    this.f86149d = c0779a;
                    this.f86150e = eVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 35996, new Class[]{View.class}, Void.TYPE).isSupported) {
                        return;
                    }
                    i.f86151h.a(this.f86147b, this.f86148c);
                    if (i0.s()) {
                        this.f86149d.notifyItemChanged(this.f86150e.getAbsoluteAdapterPosition());
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0779a(Context context, List<MenuObj> list) {
                super(context, list, R.layout.item_menu_store_v2);
                this.f86134b = context;
            }

            public void m(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d MenuObj data) {
                if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 35990, new Class[]{com.max.hbcommon.base.adapter.s.e.class, MenuObj.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(viewHolder, "viewHolder");
                f0.p(data, "data");
                View viewI = viewHolder.i(R.id.vg_item);
                ImageView imageView = (ImageView) viewHolder.i(R.id.iv_icon);
                TextView textView = (TextView) viewHolder.i(R.id.tv_name);
                TextView textView2 = (TextView) viewHolder.i(R.id.tv_desc);
                RippleView rippleView = (RippleView) viewHolder.i(R.id.rip_circle);
                ImageView imageView2 = (ImageView) viewHolder.i(R.id.iv_animator);
                ViewGroup viewGroup = (ViewGroup) viewHolder.i(R.id.vg_animator);
                LottieAnimationView lottieAnimationView = (LottieAnimationView) viewHolder.i(R.id.lottie_animation_view);
                Context context = this.f86134b;
                viewI.setBackground(ViewUtils.P(ViewUtils.m(context, ViewUtils.L(context), ViewUtils.f(this.f86134b, 42.0f)), com.max.hbcommon.utils.l.a(R.color.background_layer_3_color), com.max.hbcommon.utils.l.a(R.color.background_card_1_color)));
                textView.setText(data.getDesc());
                if (data.getGameCenterBubbleObj() != null) {
                    textView2.setText(data.getGameCenterBubbleObj().getDesc());
                    textView2.setVisibility(0);
                } else {
                    textView2.setVisibility(8);
                }
                String lottie_key = data.getLottie_key();
                if (!(lottie_key == null || lottie_key.length() == 0) && com.max.hbcommon.utils.f.g(com.max.xiaoheihe.utils.r.p(data.getLottie_key()))) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("menu_v2_lottie");
                    sb2.append(data.getLottie_key());
                    boolean z10 = com.max.hbutils.utils.n.r(com.max.hbcache.c.o(sb2.toString(), "0")) - (com.max.hbutils.utils.n.r(data.getAnimator_timestamp()) * 1000) > 0;
                    viewGroup.setVisibility(8);
                    File file = new File(com.max.xiaoheihe.utils.r.p(data.getLottie_key()));
                    if (file.exists()) {
                        try {
                            lottieAnimationView.setFailureListener(com.max.xiaoheihe.utils.r.f95734k);
                            lottieAnimationView.setAnimation(new FileInputStream(file), data.getLottie_key());
                        } catch (Exception unused) {
                        }
                    }
                    if (z10) {
                        if (lottieAnimationView.A()) {
                            lottieAnimationView.p();
                        }
                        lottieAnimationView.setProgress(0.0f);
                        lottieAnimationView.setVisibility(8);
                        rippleView.setVisibility(8);
                        imageView.setVisibility(0);
                        com.max.hbimage.b.K(data.getImage_url(), imageView);
                    } else {
                        lottieAnimationView.setVisibility(0);
                        if (!lottieAnimationView.A()) {
                            lottieAnimationView.E();
                        }
                        rippleView.setVisibility(0);
                        imageView.setVisibility(8);
                    }
                    viewHolder.itemView.setOnClickListener(new ViewOnClickListenerC0780a(this.f86134b, data, this, viewHolder));
                    return;
                }
                lottieAnimationView.setVisibility(8);
                if (com.max.hbcommon.utils.c.u(data.getAnimator_image())) {
                    imageView.setVisibility(0);
                    rippleView.setVisibility(8);
                    viewGroup.setVisibility(8);
                    com.max.hbimage.b.K(data.getImage_url(), imageView);
                    viewHolder.itemView.setOnClickListener(new e(this.f86134b, data, this, viewHolder));
                    return;
                }
                StringBuilder sb3 = new StringBuilder();
                sb3.append("menu_v2_animator");
                sb3.append(data.getKey());
                boolean z11 = com.max.hbutils.utils.n.r(com.max.hbcache.c.o(sb3.toString(), "0")) - (com.max.hbutils.utils.n.r(data.getAnimator_timestamp()) * 1000) > 0;
                int i10 = -ViewUtils.f(this.f86134b, 5.0f);
                float f10 = i10;
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f10, 0.0f, f10);
                valueAnimatorOfFloat.setDuration(2000L);
                valueAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
                valueAnimatorOfFloat.addUpdateListener(new b(viewGroup));
                valueAnimatorOfFloat.setRepeatCount(-1);
                if (z11) {
                    rippleView.setVisibility(8);
                    imageView.setVisibility(0);
                    viewGroup.setVisibility(8);
                    com.max.hbimage.b.K(data.getImage_url(), imageView);
                    valueAnimatorOfFloat.cancel();
                    viewGroup.setTranslationY(i10 / 2);
                } else {
                    viewGroup.setVisibility(0);
                    rippleView.setVisibility(0);
                    imageView.setVisibility(8);
                    valueAnimatorOfFloat.start();
                }
                int iL = ((ViewUtils.L(this.f86134b) - ViewUtils.f(this.f86134b, 54.0f)) / 4) - ViewUtils.f(this.f86134b, 38.0f);
                com.max.hbimage.b.X(this.f86134b, imageView2, data.getAnimator_image(), new c(imageView2, iL, ViewUtils.f(this.f86134b, 22.0f)));
                viewGroup.getLayoutParams().width = iL;
                viewHolder.itemView.setOnClickListener(new d(this.f86134b, data, this, viewHolder));
            }

            @Override // com.max.hbcommon.base.adapter.s
            public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, MenuObj menuObj) {
                if (PatchProxy.proxy(new Object[]{eVar, menuObj}, this, changeQuickRedirect, false, 35991, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                    return;
                }
                m(eVar, menuObj);
            }
        }

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        @xh.m
        public final void a(@dl.d Context context, @dl.d RecyclerView containerLinearLayout, @dl.e List<MenuObj> list) {
            if (PatchProxy.proxy(new Object[]{context, containerLinearLayout, list}, this, changeQuickRedirect, false, 35989, new Class[]{Context.class, RecyclerView.class, List.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(context, "context");
            f0.p(containerLinearLayout, "containerLinearLayout");
            if (list == null || list.size() <= 0) {
                containerLinearLayout.setVisibility(8);
                return;
            }
            containerLinearLayout.setVisibility(0);
            containerLinearLayout.setLayoutManager(new GridLayoutManager(context, 4));
            containerLinearLayout.setAdapter(new C0779a(context, list));
        }
    }

    public h(@dl.d RecommendVHBParam param) {
        f0.p(param, "param");
        this.f86133g = param;
    }

    @xh.m
    public static final void w(@dl.d Context context, @dl.d RecyclerView recyclerView, @dl.e List<MenuObj> list) {
        if (PatchProxy.proxy(new Object[]{context, recyclerView, list}, null, changeQuickRedirect, true, 35988, new Class[]{Context.class, RecyclerView.class, List.class}, Void.TYPE).isSupported) {
            return;
        }
        f86131h.a(context, recyclerView, list);
    }

    @Override // com.max.xiaoheihe.module.game.adapter.recommend.binder.r
    public void g(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d GameRecommendBaseObj data) {
        if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 35987, new Class[]{com.max.hbcommon.base.adapter.s.e.class, GameRecommendBaseObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(viewHolder, "viewHolder");
        f0.p(data, "data");
        RecyclerView rv = (RecyclerView) viewHolder.i(R.id.rv);
        if (!(data instanceof MenuV2Obj) || f0.g(data, rv.getTag(R.id.rv))) {
            return;
        }
        rv.setTag(R.id.rv, data);
        a aVar = f86131h;
        Context contextB = this.f86133g.b();
        f0.o(rv, "rv");
        aVar.a(contextB, rv, ((MenuV2Obj) data).getItems());
    }

    @dl.d
    public final RecommendVHBParam v() {
        return this.f86133g;
    }

    public final void x(@dl.d RecommendVHBParam recommendVHBParam) {
        if (PatchProxy.proxy(new Object[]{recommendVHBParam}, this, changeQuickRedirect, false, 35986, new Class[]{RecommendVHBParam.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(recommendVHBParam, "<set-?>");
        this.f86133g = recommendVHBParam;
    }
}
