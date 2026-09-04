package com.max.xiaoheihe.module.game.component;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.StrikethroughSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.compose.runtime.internal.o;
import androidx.core.content.res.i;
import bb.d;
import com.max.hbutils.utils.ViewUtils;
import com.max.hbutils.utils.n;
import com.max.hbutils.utils.q;
import com.max.hbutils.utils.w;
import com.max.heybox.hblog.g;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.accelworld.l;
import com.max.xiaoheihe.bean.game.GameObj;
import com.max.xiaoheihe.bean.game.GamePlatformInfoObj;
import com.max.xiaoheihe.bean.game.GamePriceObj;
import com.max.xiaoheihe.module.game.r1;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlin.jvm.internal.v0;

/* JADX INFO: compiled from: GamePriceView.kt */
/* JADX INFO: loaded from: classes11.dex */
@t0({"SMAP\nGamePriceView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GamePriceView.kt\ncom/max/xiaoheihe/module/game/component/GamePriceView\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,611:1\n262#2,2:612\n262#2,2:614\n162#2,8:616\n162#2,8:624\n*S KotlinDebug\n*F\n+ 1 GamePriceView.kt\ncom/max/xiaoheihe/module/game/component/GamePriceView\n*L\n424#1:612,2\n435#1:614,2\n455#1:616,8\n461#1:624,8\n*E\n"})
@o(parameters = 0)
public final class GamePriceView extends CardView {
    public static final int G = 8;
    public static ChangeQuickRedirect changeQuickRedirect;
    private int A;
    private int B;
    private int C;
    private int D;
    private int E;
    private int F;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ViewGroup f86795k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public LinearLayout f86796l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ImageView f86797m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public TextView f86798n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public TextView f86799o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public TextView f86800p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public TextView f86801q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public TextView f86802r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ViewGroup f86803s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public TextView f86804t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public TextView f86805u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public TextView f86806v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @e
    private Drawable f86807w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f86808x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f86809y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f86810z;

    /* JADX INFO: compiled from: GamePriceView.kt */
    public enum ColorType {
        Light,
        Dark,
        White;

        public static ChangeQuickRedirect changeQuickRedirect;

        public static ColorType valueOf(String str) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 36687, new Class[]{String.class}, ColorType.class);
            return (ColorType) (patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : Enum.valueOf(ColorType.class, str));
        }

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static ColorType[] valuesCustom() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 36686, new Class[0], ColorType[].class);
            return (ColorType[]) (patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : values().clone());
        }
    }

    /* JADX INFO: compiled from: GamePriceView.kt */
    public enum DiscountType {
        None,
        Lowest,
        NewLowest,
        SuperLowest;

        public static ChangeQuickRedirect changeQuickRedirect;

        public static DiscountType valueOf(String str) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 36689, new Class[]{String.class}, DiscountType.class);
            return (DiscountType) (patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : Enum.valueOf(DiscountType.class, str));
        }

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static DiscountType[] valuesCustom() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 36688, new Class[0], DiscountType[].class);
            return (DiscountType[]) (patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : values().clone());
        }
    }

    /* JADX INFO: compiled from: GamePriceView.kt */
    public final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f86811a;

        static {
            int[] iArr = new int[ColorType.valuesCustom().length];
            try {
                iArr[ColorType.Dark.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ColorType.White.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ColorType.Light.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f86811a = iArr;
        }
    }

    public GamePriceView(@e Context context) {
        this(context, null);
    }

    public GamePriceView(@e Context context, @e AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GamePriceView(@e Context context, @e AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        f0.m(context);
        this.f86808x = -1;
        this.f86809y = -1;
        this.f86810z = -1;
        this.A = -1;
        this.B = -1;
        this.C = -1;
        this.D = -1;
        this.E = -1;
        this.F = -1;
        u();
        s(attributeSet);
    }

    private final void B(GameObj gameObj, ColorType colorType, boolean z10) {
        if (PatchProxy.proxy(new Object[]{gameObj, colorType, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 36671, new Class[]{GameObj.class, ColorType.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        getVg_heybox_price().setVisibility(8);
        getLl_price().setVisibility(8);
        if (!z10 || (com.max.hbcommon.utils.c.u(gameObj.getRelease_timestamp()) && com.max.hbcommon.utils.c.u(gameObj.getRelease_date()))) {
            getVg_release_date().setVisibility(8);
            getTv_no_price().setVisibility(0);
            z(colorType);
        } else {
            getVg_release_date().setVisibility(0);
            getTv_no_price().setVisibility(8);
            v(gameObj, colorType);
        }
    }

    public static /* synthetic */ boolean k(GamePriceView gamePriceView, GameObj gameObj, boolean z10, ColorType colorType, boolean z11, boolean z12, int i10, Object obj) {
        Object[] objArr = {gamePriceView, gameObj, new Byte(z10 ? (byte) 1 : (byte) 0), colorType, new Byte(z11 ? (byte) 1 : (byte) 0), new Byte(z12 ? (byte) 1 : (byte) 0), new Integer(i10), obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 36670, new Class[]{GamePriceView.class, GameObj.class, cls, ColorType.class, cls, cls, Integer.TYPE, Object.class}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return gamePriceView.j(gameObj, z10, colorType, (i10 & 8) != 0 ? false : z11 ? 1 : 0, (i10 & 16) != 0 ? true : z12 ? 1 : 0);
    }

    private final int l(ColorType colorType) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{colorType}, this, changeQuickRedirect, false, 36682, new Class[]{ColorType.class}, Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        return a.f86811a[colorType.ordinal()] == 2 ? l.h(getContext(), R.color.white_alpha90) : this.E;
    }

    private final int m(ColorType colorType) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{colorType}, this, changeQuickRedirect, false, 36681, new Class[]{ColorType.class}, Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        return a.f86811a[colorType.ordinal()] == 2 ? getContext().getResources().getColor(R.color.text_primary_1_not_change_color) : this.B;
    }

    private final int n(ColorType colorType) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{colorType}, this, changeQuickRedirect, false, 36677, new Class[]{ColorType.class}, Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        int i10 = a.f86811a[colorType.ordinal()];
        if (i10 != 1) {
            return i10 != 2 ? this.f86810z : this.f86809y;
        }
        return this.f86808x;
    }

    private final int o(ColorType colorType) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{colorType}, this, changeQuickRedirect, false, 36680, new Class[]{ColorType.class}, Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        int i10 = a.f86811a[colorType.ordinal()];
        if (i10 == 1) {
            return this.B;
        }
        if (i10 == 2) {
            return getContext().getResources().getColor(R.color.divider_primary_1_not_change_color);
        }
        if (i10 == 3) {
            return this.C;
        }
        throw new NoWhenBranchMatchedException();
    }

    private final int p(ColorType colorType) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{colorType}, this, changeQuickRedirect, false, 36678, new Class[]{ColorType.class}, Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        return a.f86811a[colorType.ordinal()] == 3 ? this.A : this.B;
    }

    private final int q(ColorType colorType) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{colorType}, this, changeQuickRedirect, false, 36679, new Class[]{ColorType.class}, Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        int i10 = a.f86811a[colorType.ordinal()];
        if (i10 == 1 || i10 == 2) {
            return this.B;
        }
        if (i10 == 3) {
            return this.C;
        }
        throw new NoWhenBranchMatchedException();
    }

    private final void s(AttributeSet attributeSet) {
        if (PatchProxy.proxy(new Object[]{attributeSet}, this, changeQuickRedirect, false, 36665, new Class[]{AttributeSet.class}, Void.TYPE).isSupported) {
            return;
        }
        LayoutInflater.from(getContext()).inflate(R.layout.view_game_price, this);
        View viewFindViewById = findViewById(R.id.ll_price);
        f0.o(viewFindViewById, "findViewById(R.id.ll_price)");
        setLl_price((LinearLayout) viewFindViewById);
        View viewFindViewById2 = findViewById(R.id.vg_heybox_price);
        f0.o(viewFindViewById2, "findViewById(R.id.vg_heybox_price)");
        setVg_heybox_price((ViewGroup) viewFindViewById2);
        View viewFindViewById3 = findViewById(R.id.iv_img);
        f0.o(viewFindViewById3, "findViewById(R.id.iv_img)");
        setIv_img((ImageView) viewFindViewById3);
        View viewFindViewById4 = findViewById(R.id.tv_current_price_symbol);
        f0.o(viewFindViewById4, "findViewById(R.id.tv_current_price_symbol)");
        setTv_current_price_symbol((TextView) viewFindViewById4);
        View viewFindViewById5 = findViewById(R.id.tv_current_price);
        f0.o(viewFindViewById5, "findViewById(R.id.tv_current_price)");
        setTv_current_price((TextView) viewFindViewById5);
        View viewFindViewById6 = findViewById(R.id.tv_original_price);
        f0.o(viewFindViewById6, "findViewById(R.id.tv_original_price)");
        setTv_original_price((TextView) viewFindViewById6);
        View viewFindViewById7 = findViewById(R.id.tv_country_flag);
        f0.o(viewFindViewById7, "findViewById(R.id.tv_country_flag)");
        setTv_country_flag((TextView) viewFindViewById7);
        View viewFindViewById8 = findViewById(R.id.tv_inner_discount);
        f0.o(viewFindViewById8, "findViewById(R.id.tv_inner_discount)");
        setTv_inner_discount((TextView) viewFindViewById8);
        View viewFindViewById9 = findViewById(R.id.vg_release_date);
        f0.o(viewFindViewById9, "findViewById(R.id.vg_release_date)");
        setVg_release_date((ViewGroup) viewFindViewById9);
        View viewFindViewById10 = findViewById(R.id.tv_release_date);
        f0.o(viewFindViewById10, "findViewById(R.id.tv_release_date)");
        setTv_release_date((TextView) viewFindViewById10);
        View viewFindViewById11 = findViewById(R.id.tv_release_date_desc);
        f0.o(viewFindViewById11, "findViewById(R.id.tv_release_date_desc)");
        setTv_release_date_desc((TextView) viewFindViewById11);
        View viewFindViewById12 = findViewById(R.id.tv_no_price);
        f0.o(viewFindViewById12, "findViewById(R.id.tv_no_price)");
        setTv_no_price((TextView) viewFindViewById12);
        setElevation(0.0f);
        setCardElevation(0.0f);
        setCardBackgroundColor(getContext().getResources().getColor(R.color.transparent));
        setRadius(ViewUtils.m(getContext(), ViewUtils.f(getContext(), 48.0f), ViewUtils.f(getContext(), 15.0f)));
    }

    private final void u() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36664, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f86807w = i.g(getContext().getResources(), R.drawable.ic_heybox_logo_small, null);
        this.f86808x = i.e(getContext().getResources(), R.color.text_primary_1_color_alpha40, null);
        this.f86809y = i.e(getContext().getResources(), R.color.white_alpha10, null);
        this.f86810z = i.e(getContext().getResources(), R.color.divider_secondary_1_color, null);
        this.A = i.e(getContext().getResources(), R.color.text_primary_1_color, null);
        this.B = i.e(getContext().getResources(), R.color.white, null);
        this.C = i.e(getContext().getResources(), R.color.text_secondary_1_color, null);
        this.D = i.e(getContext().getResources(), R.color.divider_primary_1_color, null);
        this.E = i.e(getContext().getResources(), R.color.discount_bg, null);
        this.F = ViewUtils.f(getContext(), 3.0f);
    }

    private final void v(GameObj gameObj, ColorType colorType) {
        if (PatchProxy.proxy(new Object[]{gameObj, colorType}, this, changeQuickRedirect, false, 36672, new Class[]{GameObj.class, ColorType.class}, Void.TYPE).isSupported) {
            return;
        }
        boolean z10 = !TextUtils.isEmpty(gameObj.getRelease_timestamp());
        if (z10) {
            getTv_release_date().setVisibility(0);
            getTv_release_date().setTextSize(ViewUtils.g(getContext(), 12.0f));
            getTv_release_date().setText(w.g(gameObj.getRelease_timestamp(), "."));
            d.d(getTv_release_date(), 4);
            getTv_release_date().setTranslationY(ViewUtils.f(getContext(), 1.0f));
            getTv_release_date_desc().setText("上线");
        } else {
            getTv_release_date().setVisibility(8);
            getTv_release_date_desc().setText(gameObj.getRelease_date());
        }
        if (colorType == ColorType.White) {
            getVg_release_date().setBackground(q.o(getContext(), R.color.white_alpha10, 2.0f));
            getTv_release_date().setTextColor(com.max.xiaoheihe.utils.d.E(R.color.white));
            getTv_release_date_desc().setTextColor(com.max.xiaoheihe.utils.d.E(R.color.white));
            return;
        }
        getVg_release_date().setBackground(q.o(getContext(), R.color.background_card_1_color, 2.0f));
        TextView tv_release_date = getTv_release_date();
        int i10 = R.color.text_primary_1_color;
        tv_release_date.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_primary_1_color));
        TextView tv_release_date_desc = getTv_release_date_desc();
        if (z10) {
            i10 = R.color.text_secondary_1_color;
        }
        tv_release_date_desc.setTextColor(com.max.xiaoheihe.utils.d.E(i10));
    }

    private final void z(ColorType colorType) {
        if (PatchProxy.proxy(new Object[]{colorType}, this, changeQuickRedirect, false, 36673, new Class[]{ColorType.class}, Void.TYPE).isSupported) {
            return;
        }
        if (colorType == ColorType.White) {
            getTv_no_price().setTextColor(com.max.xiaoheihe.utils.d.E(R.color.white));
            getTv_no_price().setBackground(q.o(getContext(), R.color.white_alpha10, 2.0f));
            getTv_no_price().setTextSize(1, 9.0f);
            Context context = getContext();
            f0.o(context, "context");
            int iA = (int) com.max.accelworld.c.a(4.0f, context);
            TextView tv_no_price = getTv_no_price();
            tv_no_price.setPadding(iA, tv_no_price.getPaddingTop(), iA, tv_no_price.getPaddingBottom());
            return;
        }
        getTv_no_price().setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_secondary_2_color));
        getTv_no_price().setBackground(q.o(getContext(), R.color.divider_secondary_1_color, 2.0f));
        getTv_no_price().setTextSize(1, 11.0f);
        Context context2 = getContext();
        f0.o(context2, "context");
        int iA2 = (int) com.max.accelworld.c.a(2.0f, context2);
        TextView tv_no_price2 = getTv_no_price();
        tv_no_price2.setPadding(iA2, tv_no_price2.getPaddingTop(), iA2, tv_no_price2.getPaddingBottom());
    }

    public final void A(@e List<? extends GamePlatformInfoObj> list, @dl.d ColorType colorType, boolean z10) {
        int i10 = 0;
        int i11 = 1;
        int i12 = 2;
        if (PatchProxy.proxy(new Object[]{list, colorType, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 36667, new Class[]{List.class, ColorType.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(colorType, "colorType");
        if (list == null || list.size() <= 0) {
            getLl_price().setVisibility(8);
            return;
        }
        getLl_price().setVisibility(0);
        getLl_price().removeAllViews();
        int size = list.size();
        int i13 = 0;
        while (i13 < size) {
            GamePlatformInfoObj gamePlatformInfoObj = list.get(i13);
            GamePriceObj gamePriceObj = gamePlatformInfoObj.getPrice();
            if (((gamePriceObj == null || (!gamePriceObj.isIs_free() && com.max.hbcommon.utils.c.u(gamePriceObj.getCurrent()))) ? i11 : i10) == 0) {
                GamePriceView gamePriceView = new GamePriceView(getContext());
                gamePriceView.getVg_heybox_price().setVisibility(i10);
                gamePriceView.getVg_heybox_price().setBackgroundColor(n(colorType));
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                layoutParams.rightMargin = i13 < list.size() - i11 ? ViewUtils.f(getContext(), 4.0f) : i10;
                getLl_price().addView(gamePriceView, layoutParams);
                if (com.max.hbcommon.utils.c.u(gamePriceObj != null ? gamePriceObj.getRegion_name() : null)) {
                    gamePriceView.getTv_country_flag().setVisibility(8);
                } else {
                    gamePriceView.getTv_country_flag().setVisibility(i10);
                    gamePriceView.getTv_country_flag().setText(gamePriceObj.getRegion_name());
                    gamePriceView.getTv_country_flag().setTextColor(colorType == ColorType.White ? l.h(getContext(), R.color.white) : l.h(getContext(), R.color.text_primary_1_color));
                }
                if (com.max.hbcommon.utils.c.u(gamePlatformInfoObj.getImg_url())) {
                    gamePriceView.getIv_img().setImageDrawable(getContext().getResources().getDrawable(R.drawable.ic_platform_steam));
                } else {
                    com.max.hbimage.b.K(gamePlatformInfoObj.getImg_url(), gamePriceView.getIv_img());
                }
                gamePriceView.getIv_img().setColorFilter(q(colorType));
                gamePriceView.getTv_current_price().setTextColor(q(colorType));
                gamePriceView.getTv_original_price().setTextColor(o(colorType));
                d.d(gamePriceView.getTv_current_price_symbol(), i12);
                d.d(gamePriceView.getTv_current_price(), i12);
                getTv_current_price().setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71895c));
                if (gamePriceObj.isIs_free()) {
                    gamePriceView.getTv_current_price_symbol().setText(getContext().getResources().getString(R.string.free));
                    gamePriceView.getTv_current_price_symbol().setTextColor(q(colorType));
                    gamePriceView.getTv_current_price().setText((CharSequence) null);
                    gamePriceView.getTv_current_price().setPadding(0, 0, ViewUtils.f(getContext(), 3.0f), 0);
                    gamePriceView.getTv_original_price().setVisibility(8);
                    gamePriceView.setDiscountType(DiscountType.None);
                    i10 = 0;
                } else {
                    gamePriceView.getTv_current_price_symbol().setText(com.max.hbcommon.utils.c.u(gamePriceObj.getCurrent()) ? null : getContext().getResources().getString(R.string.rmb_symbol));
                    gamePriceView.getTv_current_price_symbol().setTextColor(q(colorType));
                    gamePriceView.getTv_current_price().setText(r1.K(gamePriceObj.getCurrent()));
                    if (n.q(gamePriceObj.getInitial()) > n.q(gamePriceObj.getCurrent())) {
                        boolean zT = t(gamePlatformInfoObj.getKey());
                        gamePriceView.getTv_original_price().setVisibility(0);
                        gamePriceView.getTv_current_price().setPadding(0, 0, 0, 0);
                        d.d(gamePriceView.getTv_original_price(), i12);
                        v0 v0Var = v0.f124986a;
                        String str = String.format("￥%s", Arrays.copyOf(new Object[]{r1.K(gamePriceObj.getInitial())}, 1));
                        f0.o(str, "format(format, *args)");
                        SpannableString spannableString = new SpannableString(str);
                        spannableString.setSpan(new StrikethroughSpan(), 0, spannableString.length(), 33);
                        gamePriceView.getTv_original_price().setText(spannableString);
                        if (zT) {
                            d.d(gamePriceView.getTv_current_price_symbol(), 5);
                            d.d(gamePriceView.getTv_current_price(), 5);
                            if (colorType == ColorType.Light) {
                                int iE = com.max.xiaoheihe.utils.d.E(R.color.text_primary_1_color);
                                gamePriceView.getTv_current_price_symbol().setTextColor(iE);
                                gamePriceView.getTv_current_price().setTextColor(iE);
                                gamePriceView.getIv_img().setColorFilter(iE);
                            }
                        }
                        i10 = 0;
                    } else {
                        gamePriceView.getTv_original_price().setVisibility(8);
                        i10 = 0;
                        gamePriceView.getTv_current_price().setPadding(0, 0, ViewUtils.f(getContext(), 3.0f), 0);
                    }
                    f0.o(gamePriceObj, "gamePriceObj");
                    gamePriceView.setDiscountType(r(gamePriceObj));
                    if (z10) {
                        gamePriceView.getTv_inner_discount().setVisibility(i10);
                        gamePriceView.y(gamePriceObj, colorType);
                    } else {
                        gamePriceView.getTv_inner_discount().setVisibility(8);
                    }
                }
            }
            i13++;
            i11 = 1;
            i12 = 2;
        }
    }

    public final int getDiscount_bg() {
        return this.E;
    }

    public final int getDivider_color() {
        return this.f86810z;
    }

    public final int getDivider_primary_1_color() {
        return this.D;
    }

    @e
    public final Drawable getIc_heybox_logo_small() {
        return this.f86807w;
    }

    @dl.d
    public final ImageView getIv_img() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36644, new Class[0], ImageView.class);
        if (patchProxyResultProxy.isSupported) {
            return (ImageView) patchProxyResultProxy.result;
        }
        ImageView imageView = this.f86797m;
        if (imageView != null) {
            return imageView;
        }
        f0.S("iv_img");
        return null;
    }

    @dl.d
    public final LinearLayout getLl_price() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36642, new Class[0], LinearLayout.class);
        if (patchProxyResultProxy.isSupported) {
            return (LinearLayout) patchProxyResultProxy.result;
        }
        LinearLayout linearLayout = this.f86796l;
        if (linearLayout != null) {
            return linearLayout;
        }
        f0.S("ll_price");
        return null;
    }

    public final int getPx_dp3() {
        return this.F;
    }

    public final int getText_primary_1_color() {
        return this.A;
    }

    public final int getText_primary_1_color_alpha40() {
        return this.f86808x;
    }

    public final int getText_secondary_color() {
        return this.C;
    }

    @dl.d
    public final TextView getTv_country_flag() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36652, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.f86801q;
        if (textView != null) {
            return textView;
        }
        f0.S("tv_country_flag");
        return null;
    }

    @dl.d
    public final TextView getTv_current_price() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36648, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.f86799o;
        if (textView != null) {
            return textView;
        }
        f0.S("tv_current_price");
        return null;
    }

    @dl.d
    public final TextView getTv_current_price_symbol() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36646, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.f86798n;
        if (textView != null) {
            return textView;
        }
        f0.S("tv_current_price_symbol");
        return null;
    }

    @dl.d
    public final TextView getTv_inner_discount() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36654, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.f86802r;
        if (textView != null) {
            return textView;
        }
        f0.S("tv_inner_discount");
        return null;
    }

    @dl.d
    public final TextView getTv_no_price() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36662, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.f86806v;
        if (textView != null) {
            return textView;
        }
        f0.S("tv_no_price");
        return null;
    }

    @dl.d
    public final TextView getTv_original_price() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36650, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.f86800p;
        if (textView != null) {
            return textView;
        }
        f0.S("tv_original_price");
        return null;
    }

    @dl.d
    public final TextView getTv_release_date() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36658, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.f86804t;
        if (textView != null) {
            return textView;
        }
        f0.S("tv_release_date");
        return null;
    }

    @dl.d
    public final TextView getTv_release_date_desc() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36660, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.f86805u;
        if (textView != null) {
            return textView;
        }
        f0.S("tv_release_date_desc");
        return null;
    }

    @dl.d
    public final ViewGroup getVg_heybox_price() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36640, new Class[0], ViewGroup.class);
        if (patchProxyResultProxy.isSupported) {
            return (ViewGroup) patchProxyResultProxy.result;
        }
        ViewGroup viewGroup = this.f86795k;
        if (viewGroup != null) {
            return viewGroup;
        }
        f0.S("vg_heybox_price");
        return null;
    }

    @dl.d
    public final ViewGroup getVg_release_date() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36656, new Class[0], ViewGroup.class);
        if (patchProxyResultProxy.isSupported) {
            return (ViewGroup) patchProxyResultProxy.result;
        }
        ViewGroup viewGroup = this.f86803s;
        if (viewGroup != null) {
            return viewGroup;
        }
        f0.S("vg_release_date");
        return null;
    }

    public final int getWhite() {
        return this.B;
    }

    public final int getWhite_alpha10() {
        return this.f86809y;
    }

    @xh.i
    public final boolean h(@dl.d GameObj gameObj, boolean z10, @dl.d ColorType colorType) {
        Object[] objArr = {gameObj, new Byte(z10 ? (byte) 1 : (byte) 0), colorType};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 36685, new Class[]{GameObj.class, cls, ColorType.class}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        f0.p(gameObj, "gameObj");
        f0.p(colorType, "colorType");
        return k(this, gameObj, z10, colorType, false, false, 24, null);
    }

    @xh.i
    public final boolean i(@dl.d GameObj gameObj, boolean z10, @dl.d ColorType colorType, boolean z11) {
        Object[] objArr = {gameObj, new Byte(z10 ? (byte) 1 : (byte) 0), colorType, new Byte(z11 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 36684, new Class[]{GameObj.class, cls, ColorType.class, cls}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        f0.p(gameObj, "gameObj");
        f0.p(colorType, "colorType");
        return k(this, gameObj, z10, colorType, z11, false, 16, null);
    }

    @xh.i
    public final boolean j(@dl.d GameObj gameObj, boolean z10, @dl.d ColorType colorType, boolean z11, boolean z12) {
        Object[] objArr = {gameObj, new Byte(z10 ? (byte) 1 : (byte) 0), colorType, new Byte(z11 ? (byte) 1 : (byte) 0), new Byte(z12 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 36669, new Class[]{GameObj.class, cls, ColorType.class, cls, cls}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        f0.p(gameObj, "gameObj");
        f0.p(colorType, "colorType");
        List<GamePlatformInfoObj> platform_infos = gameObj.getPlatform_infos();
        GamePriceObj price = gameObj.getPrice();
        setVisibility(0);
        if (com.max.hbcommon.utils.c.w(platform_infos)) {
            if (gameObj.isIs_free() && price == null) {
                price = new GamePriceObj();
                price.setIs_free(true);
            } else if (price != null) {
                price.setIs_free(gameObj.isIs_free());
            }
            if (price != null) {
                if (com.max.hbcommon.utils.c.u(price.getDiscount_desc()) && r1.L0(price)) {
                    price.setDiscount_desc(getContext().getString(R.string.lowest_in_history));
                }
                String str = !com.max.hbcommon.utils.c.w(gameObj.getPlatforms_url()) ? gameObj.getPlatforms_url().get(0) : null;
                GamePlatformInfoObj gamePlatformInfoObj = new GamePlatformInfoObj();
                gamePlatformInfoObj.setImg_url(str);
                gamePlatformInfoObj.setPrice(price);
                platform_infos = new ArrayList<>();
                platform_infos.add(gamePlatformInfoObj);
            }
        }
        if (!z10 && gameObj.getHeybox_price() != null) {
            getVg_heybox_price().setVisibility(0);
            getLl_price().setVisibility(8);
            getVg_release_date().setVisibility(8);
            getTv_no_price().setVisibility(8);
            w(gameObj.getHeybox_price(), colorType, z11);
            return true;
        }
        if (com.max.hbcommon.utils.c.w(platform_infos)) {
            B(gameObj, colorType, z12);
            return false;
        }
        getVg_heybox_price().setVisibility(8);
        getLl_price().setVisibility(0);
        getVg_release_date().setVisibility(8);
        getTv_no_price().setVisibility(8);
        A(platform_infos, colorType, z11);
        if (getLl_price().getChildCount() <= 0) {
            B(gameObj, colorType, z12);
        }
        return getLl_price().getChildCount() > 0;
    }

    @dl.d
    public final DiscountType r(@dl.d GamePriceObj gamePriceObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{gamePriceObj}, this, changeQuickRedirect, false, 36683, new Class[]{GamePriceObj.class}, DiscountType.class);
        if (patchProxyResultProxy.isSupported) {
            return (DiscountType) patchProxyResultProxy.result;
        }
        f0.p(gamePriceObj, "gamePriceObj");
        if (gamePriceObj.isSuper_lowest()) {
            return DiscountType.SuperLowest;
        }
        if (f0.g("1", gamePriceObj.getNew_lowest())) {
            return DiscountType.NewLowest;
        }
        return f0.g("1", gamePriceObj.getIs_lowest()) ? DiscountType.Lowest : DiscountType.None;
    }

    public final void setDiscountType(@e DiscountType discountType) {
        if (PatchProxy.proxy(new Object[]{discountType}, this, changeQuickRedirect, false, 36676, new Class[]{DiscountType.class}, Void.TYPE).isSupported) {
            return;
        }
        ((PriceLowestTagView) findViewById(R.id.v_price_tag)).setDiscountType(discountType);
    }

    public final void setDiscount_bg(int i10) {
        this.E = i10;
    }

    public final void setDivider_color(int i10) {
        this.f86810z = i10;
    }

    public final void setDivider_primary_1_color(int i10) {
        this.D = i10;
    }

    public final void setIc_heybox_logo_small(@e Drawable drawable) {
        this.f86807w = drawable;
    }

    public final void setIv_img(@dl.d ImageView imageView) {
        if (PatchProxy.proxy(new Object[]{imageView}, this, changeQuickRedirect, false, 36645, new Class[]{ImageView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(imageView, "<set-?>");
        this.f86797m = imageView;
    }

    public final void setLl_price(@dl.d LinearLayout linearLayout) {
        if (PatchProxy.proxy(new Object[]{linearLayout}, this, changeQuickRedirect, false, 36643, new Class[]{LinearLayout.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(linearLayout, "<set-?>");
        this.f86796l = linearLayout;
    }

    public final void setPx_dp3(int i10) {
        this.F = i10;
    }

    public final void setText_primary_1_color(int i10) {
        this.A = i10;
    }

    public final void setText_primary_1_color_alpha40(int i10) {
        this.f86808x = i10;
    }

    public final void setText_secondary_color(int i10) {
        this.C = i10;
    }

    public final void setTv_country_flag(@dl.d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 36653, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(textView, "<set-?>");
        this.f86801q = textView;
    }

    public final void setTv_current_price(@dl.d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 36649, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(textView, "<set-?>");
        this.f86799o = textView;
    }

    public final void setTv_current_price_symbol(@dl.d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 36647, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(textView, "<set-?>");
        this.f86798n = textView;
    }

    public final void setTv_inner_discount(@dl.d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 36655, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(textView, "<set-?>");
        this.f86802r = textView;
    }

    public final void setTv_no_price(@dl.d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 36663, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(textView, "<set-?>");
        this.f86806v = textView;
    }

    public final void setTv_original_price(@dl.d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 36651, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(textView, "<set-?>");
        this.f86800p = textView;
    }

    public final void setTv_release_date(@dl.d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 36659, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(textView, "<set-?>");
        this.f86804t = textView;
    }

    public final void setTv_release_date_desc(@dl.d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 36661, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(textView, "<set-?>");
        this.f86805u = textView;
    }

    public final void setVg_heybox_price(@dl.d ViewGroup viewGroup) {
        if (PatchProxy.proxy(new Object[]{viewGroup}, this, changeQuickRedirect, false, 36641, new Class[]{ViewGroup.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(viewGroup, "<set-?>");
        this.f86795k = viewGroup;
    }

    public final void setVg_release_date(@dl.d ViewGroup viewGroup) {
        if (PatchProxy.proxy(new Object[]{viewGroup}, this, changeQuickRedirect, false, 36657, new Class[]{ViewGroup.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(viewGroup, "<set-?>");
        this.f86803s = viewGroup;
    }

    public final void setWhite(int i10) {
        this.B = i10;
    }

    public final void setWhite_alpha10(int i10) {
        this.f86809y = i10;
    }

    public final boolean t(@e String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 36668, new Class[]{String.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (str != null) {
            return GameObj.PLATFORM_SWITCH_NAMES.contains(str) || GameObj.PLATFORM_PSN_NAMES.contains(str) || GameObj.PLATFORM_XBOX_NAMES.contains(str);
        }
        return false;
    }

    public final void w(@e GamePriceObj gamePriceObj, @dl.d ColorType colorType, boolean z10) {
        if (PatchProxy.proxy(new Object[]{gamePriceObj, colorType, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 36666, new Class[]{GamePriceObj.class, ColorType.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(colorType, "colorType");
        Context context = getVg_heybox_price().getContext();
        getVg_heybox_price().setBackgroundColor(n(colorType));
        if (gamePriceObj == null || com.max.hbcommon.utils.c.u(gamePriceObj.getCost_coin())) {
            getVg_heybox_price().setVisibility(8);
            return;
        }
        getIv_img().setImageDrawable(this.f86807w);
        getIv_img().setColorFilter(p(colorType));
        getTv_current_price_symbol().setTextColor(p(colorType));
        getTv_current_price().setTextColor(p(colorType));
        getTv_original_price().setTextColor(o(colorType));
        getTv_current_price_symbol().setText(!com.max.hbcommon.utils.c.u(gamePriceObj.getCost_coin()) ? context.getResources().getString(R.string.rmb_symbol) : null);
        d.d(getTv_current_price(), 5);
        d.d(getTv_current_price_symbol(), 5);
        getTv_current_price().setText(r1.G(gamePriceObj.getCost_coin()));
        if (com.max.hbcommon.utils.c.u(gamePriceObj.getOriginal_coin()) || r1.G(gamePriceObj.getOriginal_coin()).equals(r1.G(gamePriceObj.getCost_coin()))) {
            getTv_original_price().setVisibility(8);
            getTv_current_price().setPadding(0, 0, this.F, 0);
        } else {
            d.d(getTv_original_price(), 2);
            getTv_current_price().setPadding(0, 0, 1, 0);
            SpannableString spannableString = new SpannableString(context.getResources().getString(R.string.rmb_symbol) + r1.G(gamePriceObj.getOriginal_coin()));
            spannableString.setSpan(new StrikethroughSpan(), 0, spannableString.length(), 33);
            getTv_original_price().setText(spannableString);
            getTv_original_price().setVisibility(0);
        }
        setDiscountType(r(gamePriceObj));
        if (z10) {
            getTv_inner_discount().setVisibility(0);
            y(gamePriceObj, colorType);
        } else {
            getTv_inner_discount().setVisibility(8);
        }
        getVg_heybox_price().setVisibility(0);
    }

    public final void x(@e GamePriceObj gamePriceObj) {
        if (PatchProxy.proxy(new Object[]{gamePriceObj}, this, changeQuickRedirect, false, 36674, new Class[]{GamePriceObj.class}, Void.TYPE).isSupported) {
            return;
        }
        y(gamePriceObj, ColorType.Light);
    }

    public final void y(@e GamePriceObj gamePriceObj, @dl.d ColorType type) {
        b2 b2Var;
        if (PatchProxy.proxy(new Object[]{gamePriceObj, type}, this, changeQuickRedirect, false, 36675, new Class[]{GamePriceObj.class, ColorType.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(type, "type");
        if (gamePriceObj == null || gamePriceObj.getDiscount() == null || f0.g(gamePriceObj.getDiscount(), "0")) {
            getTv_inner_discount().setVisibility(8);
            return;
        }
        TextView tv_inner_discount = getTv_inner_discount();
        v0 v0Var = v0.f124986a;
        String str = String.format("-%s%%", Arrays.copyOf(new Object[]{gamePriceObj.getDiscount()}, 1));
        f0.o(str, "format(format, *args)");
        tv_inner_discount.setText(str);
        Typeface typefaceB = d.a().b(5);
        if (typefaceB != null) {
            getTv_inner_discount().setTypeface(typefaceB);
            b2Var = b2.f124493a;
        } else {
            b2Var = null;
        }
        if (b2Var == null) {
            g.f74531b.v("[refreshInnerDiscountView] can not find FONT_TYPE_HELVETICA");
        }
        getTv_inner_discount().setVisibility(0);
        getTv_inner_discount().setBackgroundColor(l(type));
        getTv_inner_discount().setTextColor(m(type));
    }
}
