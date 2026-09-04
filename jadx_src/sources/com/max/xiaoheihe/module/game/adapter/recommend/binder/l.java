package com.max.xiaoheihe.module.game.adapter.recommend.binder;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableString;
import android.text.style.StrikethroughSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbcommon.base.adapter.w;
import com.max.hbcommon.bean.analytics.PathSrcNode;
import com.max.hbcommon.component.bottombutton.BottomButtonLeftItemView;
import com.max.hbcustomview.GradientTextView;
import com.max.hbcustomview.MaxHeightRecyclerView;
import com.max.hblayout.hbgame.GameSingleCardFrameLayout;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.hbview.CountDownTextView;
import com.max.hbwallet.bean.MallCouponObj;
import com.max.hbwallet.h1;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.app.HeyBoxApplication;
import com.max.xiaoheihe.bean.game.GameObj;
import com.max.xiaoheihe.bean.game.GamePriceObj;
import com.max.xiaoheihe.bean.game.recommend.CouponNewcomerObj;
import com.max.xiaoheihe.bean.game.recommend.GameRecommendBaseObj;
import com.max.xiaoheihe.bean.game.recommend.NewcomerCouponObj;
import com.max.xiaoheihe.bean.game.recommend.NewcomerCouponReceiveResult;
import com.max.xiaoheihe.module.game.r1;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import df.bw;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlin.jvm.internal.v0;

/* JADX INFO: compiled from: NewcomerCouponVHB.kt */
/* JADX INFO: loaded from: classes11.dex */
@t0({"SMAP\nNewcomerCouponVHB.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NewcomerCouponVHB.kt\ncom/max/xiaoheihe/module/game/adapter/recommend/binder/NewcomerCouponVHB\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,519:1\n1855#2,2:520\n*S KotlinDebug\n*F\n+ 1 NewcomerCouponVHB.kt\ncom/max/xiaoheihe/module/game/adapter/recommend/binder/NewcomerCouponVHB\n*L\n351#1:520,2\n*E\n"})
@androidx.compose.runtime.internal.o(parameters = 0)
public final class l extends r {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.d
    public static final a f86174i = new a(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f86175j = 8;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private RecommendVHBParam f86176g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.e
    private com.max.xiaoheihe.module.game.adapter.v<w> f86177h;

    /* JADX INFO: compiled from: NewcomerCouponVHB.kt */
    @t0({"SMAP\nNewcomerCouponVHB.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NewcomerCouponVHB.kt\ncom/max/xiaoheihe/module/game/adapter/recommend/binder/NewcomerCouponVHB$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,519:1\n13579#2,2:520\n*S KotlinDebug\n*F\n+ 1 NewcomerCouponVHB.kt\ncom/max/xiaoheihe/module/game/adapter/recommend/binder/NewcomerCouponVHB$Companion\n*L\n199#1:520,2\n*E\n"})
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        @androidx.annotation.l
        private static final int d(Context context) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, 36046, new Class[]{Context.class}, Integer.TYPE);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : com.max.accelworld.a.b(context.getColor(R.color.store_gradient_free_lottery_end_color), 0.01f);
        }

        @androidx.annotation.l
        private static final int e(Context context) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, 36045, new Class[]{Context.class}, Integer.TYPE);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : com.max.accelworld.a.b(context.getColor(R.color.store_gradient_free_lottery_start_color), 0.05f);
        }

        private static final void f(Context context, GradientTextView... gradientTextViewArr) {
            if (PatchProxy.proxy(new Object[]{context, gradientTextViewArr}, null, changeQuickRedirect, true, 36044, new Class[]{Context.class, GradientTextView[].class}, Void.TYPE).isSupported) {
                return;
            }
            for (GradientTextView gradientTextView : gradientTextViewArr) {
                gradientTextView.setColors(h(context), g(context), GradientDrawable.Orientation.LEFT_RIGHT);
            }
        }

        @androidx.annotation.l
        private static final int g(Context context) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, 36043, new Class[]{Context.class}, Integer.TYPE);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : com.max.accelworld.a.b(context.getColor(R.color.origin_price_end), 0.5f);
        }

        @androidx.annotation.l
        private static final int h(Context context) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, 36042, new Class[]{Context.class}, Integer.TYPE);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : com.max.accelworld.a.b(context.getColor(R.color.origin_price_start), 0.5f);
        }

        public final void a(@dl.d Context context, @dl.d bw cardBinding) {
            if (PatchProxy.proxy(new Object[]{context, cardBinding}, this, changeQuickRedirect, false, 36039, new Class[]{Context.class, bw.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(context, "context");
            f0.p(cardBinding, "cardBinding");
            cardBinding.f109058j.setBackground(ViewUtils.x(ViewUtils.f(context, 8.0f), com.max.hbcommon.utils.l.a(R.color.store_gradient_free_lottery_start_color), com.max.hbcommon.utils.l.a(R.color.store_gradient_free_lottery_end_color)));
            int iF = ViewUtils.f(context, 8.0f) - 2;
            cardBinding.f109057i.setCornerRadius(iF);
            cardBinding.f109060l.setCornerRadius(iF);
            cardBinding.f109060l.setBackground(ViewUtils.x(iF, com.max.hbcommon.utils.l.a(R.color.white), com.max.hbcommon.utils.l.a(R.color.white)));
            cardBinding.f109057i.setBackground(ViewUtils.x(iF, com.max.hbcommon.utils.l.a(R.color.store_gradient_free_lottery_start_color_alpha10), com.max.hbcommon.utils.l.a(R.color.store_gradient_free_lottery_end_color_alpha5)));
        }

        public final void b(@dl.d Context context, @dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d GameObj game) {
            String strK;
            String strK2;
            if (PatchProxy.proxy(new Object[]{context, viewHolder, game}, this, changeQuickRedirect, false, 36040, new Class[]{Context.class, com.max.hbcommon.base.adapter.s.e.class, GameObj.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(context, "context");
            f0.p(viewHolder, "viewHolder");
            f0.p(game, "game");
            ImageView imageView = (ImageView) viewHolder.i(R.id.iv_game_img);
            TextView textView = (TextView) viewHolder.i(R.id.tv_game_name);
            TextView textView2 = (TextView) viewHolder.i(R.id.tv_tag);
            GradientTextView gradientTextView = (GradientTextView) viewHolder.i(R.id.tv_current_price_symbol);
            GradientTextView gradientTextView2 = (GradientTextView) viewHolder.i(R.id.tv_current_price);
            TextView textView3 = (TextView) viewHolder.i(R.id.tv_origin_price_symbol);
            TextView textView4 = (TextView) viewHolder.i(R.id.tv_origin_price);
            gradientTextView.setColors(com.max.hbcommon.utils.l.a(R.color.store_gradient_free_lottery_start_color), com.max.hbcommon.utils.l.a(R.color.store_gradient_free_lottery_end_color), GradientDrawable.Orientation.LEFT_RIGHT);
            gradientTextView2.setColors(com.max.hbcommon.utils.l.a(R.color.store_gradient_free_lottery_start_color), com.max.hbcommon.utils.l.a(R.color.store_gradient_free_lottery_end_color), GradientDrawable.Orientation.LEFT_RIGHT);
            if (game.getHeybox_price() != null) {
                strK = r1.G(game.getHeybox_price().getCost_coin());
            } else {
                GamePriceObj price = game.getPrice();
                strK = r1.K(price != null ? price.getCurrent() : null);
            }
            if (strK == null) {
                strK = "";
            }
            if (game.getHeybox_price() != null) {
                strK2 = r1.G(game.getHeybox_price().getOriginal_coin());
            } else {
                GamePriceObj price2 = game.getPrice();
                strK2 = r1.K(price2 != null ? price2.getInitial() : null);
            }
            String str = strK2 != null ? strK2 : "";
            gradientTextView2.setText(strK);
            SpannableString spannableString = new SpannableString(str);
            spannableString.setSpan(new StrikethroughSpan(), 0, spannableString.length(), 33);
            textView4.setText(spannableString);
            SpannableString spannableString2 = new SpannableString(com.max.xiaoheihe.utils.d.n0(R.string.rmb_symbol));
            spannableString2.setSpan(new StrikethroughSpan(), 0, spannableString2.length(), 33);
            textView3.setText(spannableString2);
            textView.setText(game.getName());
            com.max.hbimage.b.K(game.getImage(), imageView);
            textView2.setText(game.getNewcomer_tag());
            textView2.setBackground(ViewUtils.x(ViewUtils.f(context, 2.0f), com.max.hbcommon.utils.l.a(R.color.store_gradient_free_lottery_start_color), com.max.hbcommon.utils.l.a(R.color.store_gradient_free_lottery_end_color)));
            r1.d2(viewHolder.itemView, game, null);
        }

        public final void c(@dl.d Context context, @dl.d GameSingleCardFrameLayout rootView, @dl.e GameObj gameObj) {
            String strK;
            String strK2;
            if (PatchProxy.proxy(new Object[]{context, rootView, gameObj}, this, changeQuickRedirect, false, 36041, new Class[]{Context.class, GameSingleCardFrameLayout.class, GameObj.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(context, "context");
            f0.p(rootView, "rootView");
            if (gameObj == null) {
                rootView.setVisibility(8);
                return;
            }
            vc.a binding = rootView.getBinding();
            binding.f140871f.setColors(context.getColor(R.color.store_gradient_free_lottery_start_color), context.getColor(R.color.store_gradient_free_lottery_end_color), GradientDrawable.Orientation.LEFT_RIGHT);
            binding.f140870e.setColors(context.getColor(R.color.store_gradient_free_lottery_start_color), context.getColor(R.color.store_gradient_free_lottery_end_color), GradientDrawable.Orientation.LEFT_RIGHT);
            if (gameObj.getHeybox_price() != null) {
                strK = r1.G(gameObj.getHeybox_price().getCost_coin());
            } else {
                GamePriceObj price = gameObj.getPrice();
                strK = r1.K(price != null ? price.getCurrent() : null);
            }
            if (strK == null) {
                strK = "";
            }
            if (gameObj.getHeybox_price() != null) {
                strK2 = r1.G(gameObj.getHeybox_price().getOriginal_coin());
            } else {
                GamePriceObj price2 = gameObj.getPrice();
                strK2 = r1.K(price2 != null ? price2.getInitial() : null);
            }
            String str = strK2 != null ? strK2 : "";
            binding.f140870e.setText(strK);
            GradientTextView gradientTextView = binding.f140873h;
            SpannableString spannableString = new SpannableString(str);
            spannableString.setSpan(new StrikethroughSpan(), 0, spannableString.length(), 33);
            gradientTextView.setText(spannableString);
            GradientTextView gradientTextView2 = binding.f140874i;
            SpannableString spannableString2 = new SpannableString(com.max.xiaoheihe.utils.d.n0(R.string.rmb_symbol));
            spannableString2.setSpan(new StrikethroughSpan(), 0, spannableString2.length(), 33);
            gradientTextView2.setText(spannableString2);
            GradientTextView tvOriginPriceSymbol = binding.f140874i;
            f0.o(tvOriginPriceSymbol, "tvOriginPriceSymbol");
            GradientTextView tvOriginPrice = binding.f140873h;
            f0.o(tvOriginPrice, "tvOriginPrice");
            f(context, tvOriginPriceSymbol, tvOriginPrice);
            binding.f140872g.setText(gameObj.getName());
            com.max.hbimage.b.K(gameObj.getImage(), binding.f140868c);
            binding.f140875j.setText(gameObj.getNewcomer_tag());
            binding.f140875j.setBackground(ViewUtils.x(ViewUtils.f(context, 2.0f), com.max.hbcommon.utils.l.a(R.color.store_gradient_free_lottery_start_color), com.max.hbcommon.utils.l.a(R.color.store_gradient_free_lottery_end_color)));
            LinearLayout linearLayout = binding.f140869d;
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColors(new int[]{e(context), d(context)});
            gradientDrawable.setOrientation(GradientDrawable.Orientation.BL_TR);
            gradientDrawable.setCornerRadius(com.max.accelworld.c.a(2.0f, context));
            linearLayout.setBackground(gradientDrawable);
            r1.d2(rootView, gameObj, null);
        }
    }

    /* JADX INFO: compiled from: NewcomerCouponVHB.kt */
    public static final class b implements CountDownTextView.c {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef<bw> f86178a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ l f86179b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ GameRecommendBaseObj f86180c;

        b(Ref.ObjectRef<bw> objectRef, l lVar, GameRecommendBaseObj gameRecommendBaseObj) {
            this.f86178a = objectRef;
            this.f86179b = lVar;
            this.f86180c = gameRecommendBaseObj;
        }

        @Override // com.max.hbview.CountDownTextView.c
        @dl.d
        public String a(long j10) {
            int i10;
            int i11;
            int i12;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Long(j10)}, this, changeQuickRedirect, false, 36047, new Class[]{Long.TYPE}, String.class);
            if (patchProxyResultProxy.isSupported) {
                return (String) patchProxyResultProxy.result;
            }
            if (j10 <= 0) {
                return "";
            }
            if (j10 > 86400000) {
                this.f86178a.f124891b.f109055g.setVisibility(0);
                this.f86178a.f124891b.f109056h.setVisibility(0);
                this.f86178a.f124891b.f109055g.setText(String.valueOf(j10 / 86400000));
                j10 %= 86400000;
            } else {
                this.f86178a.f124891b.f109055g.setVisibility(8);
                this.f86178a.f124891b.f109056h.setVisibility(8);
            }
            if (j10 > 3600000) {
                i10 = (int) (j10 / 3600000);
                j10 %= 3600000;
            } else {
                i10 = 0;
            }
            if (j10 > 60000) {
                i11 = (int) (j10 / 60000);
                j10 %= 60000;
            } else {
                i11 = 0;
            }
            if (j10 > 1000) {
                i12 = (int) (j10 / 1000);
                long j11 = j10 % 1000;
            } else {
                i12 = 0;
            }
            v0 v0Var = v0.f124986a;
            String str = String.format("%02d:%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12)}, 3));
            f0.o(str, "format(format, *args)");
            return str;
        }

        @Override // com.max.hbview.CountDownTextView.c
        public void onFinish() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36048, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            List<?> dataList = this.f86179b.y().a().getDataList();
            f0.o(dataList, "param.adapter.dataList");
            int iY2 = CollectionsKt___CollectionsKt.Y2(dataList, this.f86180c);
            this.f86179b.y().a().getDataList().remove(iY2);
            this.f86179b.y().a().notifyItemChanged(iY2);
        }
    }

    /* JADX INFO: compiled from: NewcomerCouponVHB.kt */
    public static final class c implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ GameRecommendBaseObj f86182c;

        c(GameRecommendBaseObj gameRecommendBaseObj) {
            this.f86182c = gameRecommendBaseObj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 36049, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.base.router.b.k0(l.this.y().b(), ((CouponNewcomerObj) this.f86182c).getProt());
        }
    }

    /* JADX INFO: compiled from: NewcomerCouponVHB.kt */
    public static final class d extends com.max.hbcommon.base.adapter.u<CouponWrapper> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ GameRecommendBaseObj f86183b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ l f86184c;

        /* JADX INFO: compiled from: NewcomerCouponVHB.kt */
        public static final class a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ l f86185b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ GameRecommendBaseObj f86186c;

            a(l lVar, GameRecommendBaseObj gameRecommendBaseObj) {
                this.f86185b = lVar;
                this.f86186c = gameRecommendBaseObj;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 36054, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                l.v(this.f86185b, (CouponNewcomerObj) this.f86186c);
            }
        }

        /* JADX INFO: compiled from: NewcomerCouponVHB.kt */
        public static final class b implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ l f86187b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ GameRecommendBaseObj f86188c;

            b(l lVar, GameRecommendBaseObj gameRecommendBaseObj) {
                this.f86187b = lVar;
                this.f86188c = gameRecommendBaseObj;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 36055, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                com.max.xiaoheihe.base.router.b.k0(this.f86187b.y().b(), ((CouponNewcomerObj) this.f86188c).getProt());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Ref.ObjectRef<ArrayList<CouponWrapper>> objectRef, GameRecommendBaseObj gameRecommendBaseObj, l lVar, Context context) {
            super(context, objectRef.f124891b);
            this.f86183b = gameRecommendBaseObj;
            this.f86184c = lVar;
        }

        @Override // com.max.hbcommon.base.adapter.u
        public /* bridge */ /* synthetic */ int m(int i10, CouponWrapper couponWrapper) {
            Object[] objArr = {new Integer(i10), couponWrapper};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 36053, new Class[]{cls, Object.class}, cls);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : n(i10, couponWrapper);
        }

        public int n(int i10, @dl.d CouponWrapper data) {
            Object[] objArr = {new Integer(i10), data};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 36051, new Class[]{cls, CouponWrapper.class}, cls);
            if (patchProxyResultProxy.isSupported) {
                return ((Integer) patchProxyResultProxy.result).intValue();
            }
            f0.p(data, "data");
            return data.e() != null ? R.layout.item_recommend_newcomer_card_coupon : R.layout.item_recommend_newcomer_card_game;
        }

        public void o(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d CouponWrapper wrapper) {
            if (PatchProxy.proxy(new Object[]{viewHolder, wrapper}, this, changeQuickRedirect, false, 36050, new Class[]{com.max.hbcommon.base.adapter.s.e.class, CouponWrapper.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(viewHolder, "viewHolder");
            f0.p(wrapper, "wrapper");
            if (viewHolder.d() != R.layout.item_recommend_newcomer_card_coupon) {
                a aVar = l.f86174i;
                Context contextB = this.f86184c.y().b();
                GameObj gameObjF = wrapper.f();
                f0.m(gameObjF);
                aVar.b(contextB, viewHolder, gameObjF);
                return;
            }
            NewcomerCouponObj newcomerCouponObjE = wrapper.e();
            f0.m(newcomerCouponObjE);
            TextView textView = (TextView) viewHolder.i(R.id.tv_action);
            TextView textView2 = (TextView) viewHolder.i(R.id.tv_desc);
            TextView textView3 = (TextView) viewHolder.i(R.id.tv_value);
            TextView textView4 = (TextView) viewHolder.i(R.id.tv_value_unit);
            if (f0.g("9", newcomerCouponObjE.getCoupon_type()) || f0.g("8", newcomerCouponObjE.getCoupon_type())) {
                if (com.max.hbutils.utils.n.q(newcomerCouponObjE.getValue()) % 10 == 0) {
                    textView3.setText(String.valueOf(com.max.hbutils.utils.n.q(newcomerCouponObjE.getValue()) / 10));
                } else {
                    textView3.setText(newcomerCouponObjE.getValue());
                }
                textView4.setText("折");
            } else {
                textView3.setText(newcomerCouponObjE.getValue());
                textView4.setText("元");
            }
            textView2.setText(wrapper.e().getSub_title());
            if (((CouponNewcomerObj) this.f86183b).getHas_get()) {
                textView.setText("去使用");
                textView.setOnClickListener(new b(this.f86184c, this.f86183b));
            } else {
                textView.setText("点击领取");
                textView.setOnClickListener(new a(this.f86184c, this.f86183b));
            }
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, Object obj) {
            if (PatchProxy.proxy(new Object[]{eVar, obj}, this, changeQuickRedirect, false, 36052, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            o(eVar, (CouponWrapper) obj);
        }
    }

    /* JADX INFO: compiled from: NewcomerCouponVHB.kt */
    public static final class e extends com.max.hbcommon.network.d<Result<NewcomerCouponReceiveResult>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ CouponNewcomerObj f86190c;

        e(CouponNewcomerObj couponNewcomerObj) {
            this.f86190c = couponNewcomerObj;
        }

        public void onNext(@dl.d Result<NewcomerCouponReceiveResult> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 36056, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            if (l.this.y().b() instanceof com.max.hbcommon.base.f) {
                Object objB = l.this.y().b();
                f0.n(objB, "null cannot be cast to non-null type com.max.hbcommon.base.BaseView");
                if (((com.max.hbcommon.base.f) objB).isActive()) {
                    List<?> dataList = l.this.y().a().getDataList();
                    f0.o(dataList, "param.adapter.dataList");
                    int iY2 = CollectionsKt___CollectionsKt.Y2(dataList, this.f86190c);
                    this.f86190c.setHas_get(true);
                    this.f86190c.setDeadline_ts(result.getResult().getDeadline_ts());
                    l.this.y().a().notifyItemChanged(iY2);
                }
            }
            NewcomerCouponReceiveResult result2 = result.getResult();
            if (result2 != null) {
                l.w(l.this, result2);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 36057, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<NewcomerCouponReceiveResult>) obj);
        }
    }

    /* JADX INFO: compiled from: NewcomerCouponVHB.kt */
    public static final class f extends h1 {
        f(Ref.ObjectRef<Activity> objectRef, Ref.ObjectRef<ArrayList<MallCouponObj>> objectRef2) {
            super(objectRef.f124891b, objectRef2.f124891b);
        }
    }

    /* JADX INFO: compiled from: NewcomerCouponVHB.kt */
    public static final class g implements h1.a {
        public static ChangeQuickRedirect changeQuickRedirect;

        g() {
        }

        @Override // com.max.hbwallet.h1.a
        public void a(@dl.e View view, @dl.d MallCouponObj data) {
            if (PatchProxy.proxy(new Object[]{view, data}, this, changeQuickRedirect, false, 36058, new Class[]{View.class, MallCouponObj.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(data, "data");
            if (com.max.hbcommon.utils.c.u(data.getProtocol())) {
                return;
            }
            com.max.xiaoheihe.base.router.b.k0(l.this.y().b(), data.getProtocol());
        }
    }

    /* JADX INFO: compiled from: NewcomerCouponVHB.kt */
    public static final class h implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ NewcomerCouponReceiveResult f86192b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ l f86193c;

        h(NewcomerCouponReceiveResult newcomerCouponReceiveResult, l lVar) {
            this.f86192b = newcomerCouponReceiveResult;
            this.f86193c = lVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 36059, new Class[]{View.class}, Void.TYPE).isSupported || com.max.hbcommon.utils.c.u(this.f86192b.getTo_wallet())) {
                return;
            }
            com.max.xiaoheihe.base.router.b.k0(this.f86193c.y().b(), this.f86192b.getTo_wallet());
        }
    }

    /* JADX INFO: compiled from: NewcomerCouponVHB.kt */
    public static final class i implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.max.hbcommon.component.bottomsheet.q f86194b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ NewcomerCouponReceiveResult f86195c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ l f86196d;

        i(com.max.hbcommon.component.bottomsheet.q qVar, NewcomerCouponReceiveResult newcomerCouponReceiveResult, l lVar) {
            this.f86194b = qVar;
            this.f86195c = newcomerCouponReceiveResult;
            this.f86196d = lVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 36060, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f86194b.dismiss();
            if (com.max.hbcommon.utils.c.u(this.f86195c.getTo_look())) {
                return;
            }
            com.max.xiaoheihe.base.router.b.k0(this.f86196d.y().b(), this.f86195c.getTo_look());
        }
    }

    public l(@dl.d RecommendVHBParam param) {
        f0.p(param, "param");
        this.f86176g = param;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [T, android.app.Activity] */
    /* JADX WARN: Type inference failed for: r9v2, types: [T, java.util.ArrayList] */
    private final void C(NewcomerCouponReceiveResult newcomerCouponReceiveResult) {
        if (PatchProxy.proxy(new Object[]{newcomerCouponReceiveResult}, this, changeQuickRedirect, false, 36036, new Class[]{NewcomerCouponReceiveResult.class}, Void.TYPE).isSupported) {
            return;
        }
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ?? E = HeyBoxApplication.C().E();
        objectRef.f124891b = E;
        if (E == 0 || E.isFinishing() || !(objectRef.f124891b instanceof FragmentActivity)) {
            return;
        }
        com.max.hbcommon.component.bottomsheet.a aVar = new com.max.hbcommon.component.bottomsheet.a();
        View viewInflate = LayoutInflater.from((Context) objectRef.f124891b).inflate(R.layout.layout_newcomer_coupon_receive_dialog, (ViewGroup) null);
        MaxHeightRecyclerView maxHeightRecyclerView = (MaxHeightRecyclerView) viewInflate.findViewById(R.id.rv);
        TextView textView = (TextView) viewInflate.findViewById(R.id.tv_action);
        BottomButtonLeftItemView bottomButtonLeftItemView = (BottomButtonLeftItemView) viewInflate.findViewById(R.id.btn_action);
        maxHeightRecyclerView.setLayoutManager(new LinearLayoutManager((Context) objectRef.f124891b));
        Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        objectRef2.f124891b = new ArrayList();
        if (!com.max.hbcommon.utils.c.w(newcomerCouponReceiveResult.getCoupon_list())) {
            ArrayList arrayList = (ArrayList) objectRef2.f124891b;
            ArrayList<MallCouponObj> coupon_list = newcomerCouponReceiveResult.getCoupon_list();
            f0.m(coupon_list);
            arrayList.add(coupon_list.get(0));
        }
        f fVar = new f(objectRef, objectRef2);
        fVar.B(new g());
        maxHeightRecyclerView.setAdapter(fVar);
        aVar.h(R.drawable.bottom_sheets_key_correct_red_28x28).n(R.drawable.bottom_sheets_broken_coupon_80x80).k(true).x(true).r(viewInflate);
        com.max.hbcommon.component.bottomsheet.q qVarA = aVar.a();
        textView.setOnClickListener(new h(newcomerCouponReceiveResult, this));
        bottomButtonLeftItemView.setOnClickListener(new i(qVarA, newcomerCouponReceiveResult, this));
        qVarA.M3(((FragmentActivity) objectRef.f124891b).getSupportFragmentManager(), "stack_coupon_bottom_dialog");
        if (qVarA.isViewCreated()) {
            View viewD4 = qVarA.d4();
            f0.n(viewD4, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
            ViewGroup.LayoutParams layoutParams = ((ConstraintLayout) viewD4).getLayoutParams();
            f0.n(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            ((ViewGroup.MarginLayoutParams) layoutParams2).height = -2;
            layoutParams2.T = (int) (ViewUtils.J(this.f86176g.b()) * 0.85f);
            qVarA.m4().setVisibility(8);
        }
    }

    public static final /* synthetic */ void v(l lVar, CouponNewcomerObj couponNewcomerObj) {
        if (PatchProxy.proxy(new Object[]{lVar, couponNewcomerObj}, null, changeQuickRedirect, true, 36037, new Class[]{l.class, CouponNewcomerObj.class}, Void.TYPE).isSupported) {
            return;
        }
        lVar.z(couponNewcomerObj);
    }

    public static final /* synthetic */ void w(l lVar, NewcomerCouponReceiveResult newcomerCouponReceiveResult) {
        if (PatchProxy.proxy(new Object[]{lVar, newcomerCouponReceiveResult}, null, changeQuickRedirect, true, 36038, new Class[]{l.class, NewcomerCouponReceiveResult.class}, Void.TYPE).isSupported) {
            return;
        }
        lVar.C(newcomerCouponReceiveResult);
    }

    private final void z(CouponNewcomerObj couponNewcomerObj) {
        if (PatchProxy.proxy(new Object[]{couponNewcomerObj}, this, changeQuickRedirect, false, 36035, new Class[]{CouponNewcomerObj.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.xiaoheihe.network.i.a().h6().I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).g(new e(couponNewcomerObj));
    }

    public final void A(@dl.e com.max.xiaoheihe.module.game.adapter.v<w> vVar) {
        this.f86177h = vVar;
    }

    public final void B(@dl.d RecommendVHBParam recommendVHBParam) {
        if (PatchProxy.proxy(new Object[]{recommendVHBParam}, this, changeQuickRedirect, false, 36032, new Class[]{RecommendVHBParam.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(recommendVHBParam, "<set-?>");
        this.f86176g = recommendVHBParam;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v2, types: [T, df.bw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v11, types: [T, java.util.ArrayList] */
    @Override // com.max.xiaoheihe.module.game.adapter.recommend.binder.r
    public void g(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d GameRecommendBaseObj data) {
        if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 36033, new Class[]{com.max.hbcommon.base.adapter.s.e.class, GameRecommendBaseObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(viewHolder, "viewHolder");
        f0.p(data, "data");
        if (data instanceof CouponNewcomerObj) {
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            ?? A = bw.a(viewHolder.itemView);
            f0.o(A, "bind(viewHolder.itemView)");
            objectRef.f124891b = A;
            f86174i.a(this.f86176g.b(), (bw) objectRef.f124891b);
            ((bw) objectRef.f124891b).f109059k.setBackground(ViewUtils.x(ViewUtils.f(this.f86176g.b(), 2.0f), com.max.hbcommon.utils.l.a(R.color.store_gradient_free_lottery_start_color_alpha8), com.max.hbcommon.utils.l.a(R.color.store_gradient_free_lottery_end_color_alpha8)));
            CouponNewcomerObj couponNewcomerObj = (CouponNewcomerObj) data;
            if (couponNewcomerObj.getDeadline_ts() != null) {
                long jR = com.max.hbutils.utils.n.r(couponNewcomerObj.getDeadline_ts()) * 1000;
                if (jR > 0) {
                    ((bw) objectRef.f124891b).f109050b.setVisibility(0);
                    ((bw) objectRef.f124891b).f109050b.setTargetTime(jR);
                    ((bw) objectRef.f124891b).f109050b.setTimeTransformer(new b(objectRef, this, data));
                    ((bw) objectRef.f124891b).f109050b.i();
                } else {
                    ((bw) objectRef.f124891b).f109050b.setVisibility(8);
                }
            } else {
                ((bw) objectRef.f124891b).f109050b.setVisibility(8);
            }
            T t10 = objectRef.f124891b;
            LinearLayout linearLayout = ((bw) t10).f109059k;
            ((bw) t10).f109053e.setLayoutManager(new LinearLayoutManager(this.f86176g.b(), 0, false));
            if (((bw) objectRef.f124891b).f109053e.getItemDecorationCount() <= 0) {
                ((bw) objectRef.f124891b).f109053e.addItemDecoration(new com.max.hbcustomview.d(ViewUtils.f(this.f86176g.b(), 6.0f), ViewUtils.f(this.f86176g.b(), 12.0f), 0));
            }
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            objectRef2.f124891b = new ArrayList();
            if (!com.max.hbcommon.utils.c.w(couponNewcomerObj.getCoupons())) {
                ArrayList arrayList = (ArrayList) objectRef2.f124891b;
                ArrayList<NewcomerCouponObj> coupons = couponNewcomerObj.getCoupons();
                f0.m(coupons);
                arrayList.add(new CouponWrapper(null, coupons.get(0)));
            }
            ArrayList<GameObj> games = couponNewcomerObj.getGames();
            if (games != null) {
                Iterator<T> it = games.iterator();
                while (it.hasNext()) {
                    ((ArrayList) objectRef2.f124891b).add(new CouponWrapper((GameObj) it.next(), null));
                }
            }
            w wVar = new w(this.f86176g.b(), new d(objectRef2, data, this, this.f86176g.b()), new c(data));
            wVar.J(-1);
            wVar.H(R.color.white);
            ((bw) objectRef.f124891b).f109053e.setAdapter(wVar);
            RecyclerView recyclerView = ((bw) objectRef.f124891b).f109053e;
            f0.o(recyclerView, "cardBinding.rvGames");
            this.f86177h = new com.max.xiaoheihe.module.game.adapter.v<>(null, recyclerView, false, null, 12, null);
        }
    }

    @Override // com.max.xiaoheihe.module.game.adapter.recommend.binder.r
    public void p(@dl.d View itemView, @dl.d List<PathSrcNode> shownList, @dl.d GameRecommendBaseObj data) {
        if (PatchProxy.proxy(new Object[]{itemView, shownList, data}, this, changeQuickRedirect, false, 36034, new Class[]{View.class, List.class, GameRecommendBaseObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(itemView, "itemView");
        f0.p(shownList, "shownList");
        f0.p(data, "data");
        if (data.isReported_exposure()) {
            return;
        }
        data.setReported_exposure(true);
        com.max.xiaoheihe.module.game.adapter.v<w> vVar = this.f86177h;
        if (vVar != null) {
            vVar.q();
        }
    }

    @dl.e
    public final com.max.xiaoheihe.module.game.adapter.v<w> x() {
        return this.f86177h;
    }

    @dl.d
    public final RecommendVHBParam y() {
        return this.f86176g;
    }
}
