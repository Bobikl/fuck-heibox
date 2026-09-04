package com.max.xiaoheihe.module.game.component;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.compose.runtime.internal.o;
import com.max.hbcommon.base.adapter.s;
import com.max.hbcommon.component.BlurView;
import com.max.hbcustomview.CustomHorizontalScrollView;
import com.max.hbutils.utils.ViewUtils;
import com.max.hbutils.utils.n;
import com.max.hbutils.utils.q;
import com.max.hbutils.utils.w;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.GameObj;
import com.max.xiaoheihe.bean.game.GamePriceObj;
import com.max.xiaoheihe.bean.rich.RichAttributeModelObj;
import com.max.xiaoheihe.module.game.r1;
import com.max.xiaoheihe.view.BoxAutoPlayView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: VerGameCardView.kt */
/* JADX INFO: loaded from: classes11.dex */
@o(parameters = 0)
public final class VerGameCardView extends CardView {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f86998x = 8;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public RelativeLayout f86999k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ImageView f87000l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public TextView f87001m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public GamePriceView f87002n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public BlurView f87003o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public CustomHorizontalScrollView f87004p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ImageView f87005q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public View f87006r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public TextView f87007s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public BoxAutoPlayView f87008t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public View f87009u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public LinearLayout f87010v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f87011w;

    /* JADX INFO: compiled from: VerGameCardView.kt */
    public enum Type {
        VERTICAL,
        HORIZONTAL;

        public static ChangeQuickRedirect changeQuickRedirect;

        public static Type valueOf(String str) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 37062, new Class[]{String.class}, Type.class);
            return (Type) (patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : Enum.valueOf(Type.class, str));
        }

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static Type[] valuesCustom() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 37061, new Class[0], Type[].class);
            return (Type[]) (patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : values().clone());
        }
    }

    /* JADX INFO: compiled from: VerGameCardView.kt */
    public final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f87012a;

        static {
            int[] iArr = new int[Type.valuesCustom().length];
            try {
                iArr[Type.VERTICAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Type.HORIZONTAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f87012a = iArr;
        }
    }

    public VerGameCardView(@e Context context) {
        this(context, null);
    }

    public VerGameCardView(@e Context context, @e AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerGameCardView(@e Context context, @e AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        f0.m(context);
        h();
        this.f87011w = ViewUtils.f(context, 176.0f);
    }

    private final void h() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37050, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setRadius(ViewUtils.f(getContext(), 4.0f));
        setCardElevation(0.0f);
        super.setCardBackgroundColor(getContext().getResources().getColor(R.color.transparent));
        View.inflate(getContext(), R.layout.view_recommend_ver_game_card, this);
        View viewFindViewById = findViewById(R.id.vg_container);
        f0.o(viewFindViewById, "findViewById(R.id.vg_container)");
        setVg_container((RelativeLayout) viewFindViewById);
        View viewFindViewById2 = findViewById(R.id.iv_bg);
        f0.o(viewFindViewById2, "findViewById(R.id.iv_bg)");
        setIv_bg((ImageView) viewFindViewById2);
        View viewFindViewById3 = findViewById(R.id.tv_game_name);
        f0.o(viewFindViewById3, "findViewById(R.id.tv_game_name)");
        setTv_game_name((TextView) viewFindViewById3);
        View viewFindViewById4 = findViewById(R.id.view_price);
        f0.o(viewFindViewById4, "findViewById(R.id.view_price)");
        setView_price((GamePriceView) viewFindViewById4);
        View viewFindViewById5 = findViewById(R.id.view_blur);
        f0.o(viewFindViewById5, "findViewById(R.id.view_blur)");
        setView_blur((BlurView) viewFindViewById5);
        View viewFindViewById6 = findViewById(R.id.hsv_tags);
        f0.o(viewFindViewById6, "findViewById(R.id.hsv_tags)");
        setHsv_tags((CustomHorizontalScrollView) viewFindViewById6);
        View viewFindViewById7 = findViewById(R.id.iv_middle);
        f0.o(viewFindViewById7, "findViewById(R.id.iv_middle)");
        setIv_middle((ImageView) viewFindViewById7);
        View viewFindViewById8 = findViewById(R.id.ll_platform_icon);
        f0.o(viewFindViewById8, "findViewById(R.id.ll_platform_icon)");
        setLl_platform_icon((LinearLayout) viewFindViewById8);
        View viewFindViewById9 = findViewById(R.id.vg_deadline_date);
        f0.o(viewFindViewById9, "findViewById(R.id.vg_deadline_date)");
        setVg_deadline_date(viewFindViewById9);
        View viewFindViewById10 = findViewById(R.id.bv_deadline_date);
        f0.o(viewFindViewById10, "findViewById(R.id.bv_deadline_date)");
        setBv_deadline_date((BoxAutoPlayView) viewFindViewById10);
        View viewFindViewById11 = findViewById(R.id.tv_deadline_date);
        f0.o(viewFindViewById11, "findViewById(R.id.tv_deadline_date)");
        setTv_deadline_date((TextView) viewFindViewById11);
        View viewFindViewById12 = findViewById(R.id.vg_score);
        f0.o(viewFindViewById12, "findViewById(R.id.vg_score)");
        setVg_score(viewFindViewById12);
    }

    @d
    public final BoxAutoPlayView getBv_deadline_date() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37044, new Class[0], BoxAutoPlayView.class);
        if (patchProxyResultProxy.isSupported) {
            return (BoxAutoPlayView) patchProxyResultProxy.result;
        }
        BoxAutoPlayView boxAutoPlayView = this.f87008t;
        if (boxAutoPlayView != null) {
            return boxAutoPlayView;
        }
        f0.S("bv_deadline_date");
        return null;
    }

    public final int getDesireWidth() {
        return this.f87011w;
    }

    @d
    public final CustomHorizontalScrollView getHsv_tags() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37036, new Class[0], CustomHorizontalScrollView.class);
        if (patchProxyResultProxy.isSupported) {
            return (CustomHorizontalScrollView) patchProxyResultProxy.result;
        }
        CustomHorizontalScrollView customHorizontalScrollView = this.f87004p;
        if (customHorizontalScrollView != null) {
            return customHorizontalScrollView;
        }
        f0.S("hsv_tags");
        return null;
    }

    @d
    public final ImageView getIv_bg() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37028, new Class[0], ImageView.class);
        if (patchProxyResultProxy.isSupported) {
            return (ImageView) patchProxyResultProxy.result;
        }
        ImageView imageView = this.f87000l;
        if (imageView != null) {
            return imageView;
        }
        f0.S("iv_bg");
        return null;
    }

    @d
    public final ImageView getIv_middle() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37038, new Class[0], ImageView.class);
        if (patchProxyResultProxy.isSupported) {
            return (ImageView) patchProxyResultProxy.result;
        }
        ImageView imageView = this.f87005q;
        if (imageView != null) {
            return imageView;
        }
        f0.S("iv_middle");
        return null;
    }

    @d
    public final LinearLayout getLl_platform_icon() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37048, new Class[0], LinearLayout.class);
        if (patchProxyResultProxy.isSupported) {
            return (LinearLayout) patchProxyResultProxy.result;
        }
        LinearLayout linearLayout = this.f87010v;
        if (linearLayout != null) {
            return linearLayout;
        }
        f0.S("ll_platform_icon");
        return null;
    }

    @d
    public final TextView getTv_deadline_date() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37042, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.f87007s;
        if (textView != null) {
            return textView;
        }
        f0.S("tv_deadline_date");
        return null;
    }

    @d
    public final TextView getTv_game_name() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37030, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.f87001m;
        if (textView != null) {
            return textView;
        }
        f0.S("tv_game_name");
        return null;
    }

    @d
    public final RelativeLayout getVg_container() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37026, new Class[0], RelativeLayout.class);
        if (patchProxyResultProxy.isSupported) {
            return (RelativeLayout) patchProxyResultProxy.result;
        }
        RelativeLayout relativeLayout = this.f86999k;
        if (relativeLayout != null) {
            return relativeLayout;
        }
        f0.S("vg_container");
        return null;
    }

    @d
    public final View getVg_deadline_date() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37046, new Class[0], View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        View view = this.f87009u;
        if (view != null) {
            return view;
        }
        f0.S("vg_deadline_date");
        return null;
    }

    @d
    public final View getVg_score() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37040, new Class[0], View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        View view = this.f87006r;
        if (view != null) {
            return view;
        }
        f0.S("vg_score");
        return null;
    }

    @d
    public final BlurView getView_blur() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37034, new Class[0], BlurView.class);
        if (patchProxyResultProxy.isSupported) {
            return (BlurView) patchProxyResultProxy.result;
        }
        BlurView blurView = this.f87003o;
        if (blurView != null) {
            return blurView;
        }
        f0.S("view_blur");
        return null;
    }

    @d
    public final GamePriceView getView_price() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37032, new Class[0], GamePriceView.class);
        if (patchProxyResultProxy.isSupported) {
            return (GamePriceView) patchProxyResultProxy.result;
        }
        GamePriceView gamePriceView = this.f87002n;
        if (gamePriceView != null) {
            return gamePriceView;
        }
        f0.S("view_price");
        return null;
    }

    public final void i(@e List<RichAttributeModelObj> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 37054, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        r1.N1(getHsv_tags(), list, this.f87011w);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37060, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onAttachedToWindow();
        if (getBv_deadline_date().getVisibility() == 0) {
            getBv_deadline_date().e();
        }
    }

    @Override // android.view.View
    public void setBackground(@e Drawable drawable) {
        if (PatchProxy.proxy(new Object[]{drawable}, this, changeQuickRedirect, false, 37051, new Class[]{Drawable.class}, Void.TYPE).isSupported) {
            return;
        }
        getVg_container().setBackground(drawable);
    }

    public final void setBottomBlur(int i10, @d Bitmap bitmap) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10), bitmap}, this, changeQuickRedirect, false, 37052, new Class[]{Integer.TYPE, Bitmap.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(bitmap, "bitmap");
        getView_blur().d(bitmap, i10, ViewUtils.f(getContext(), 140.0f), 0.6f);
    }

    public final void setBv_deadline_date(@d BoxAutoPlayView boxAutoPlayView) {
        if (PatchProxy.proxy(new Object[]{boxAutoPlayView}, this, changeQuickRedirect, false, 37045, new Class[]{BoxAutoPlayView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(boxAutoPlayView, "<set-?>");
        this.f87008t = boxAutoPlayView;
    }

    public final void setDeadlineDate(@e GamePriceObj gamePriceObj) {
        if (PatchProxy.proxy(new Object[]{gamePriceObj}, this, changeQuickRedirect, false, 37059, new Class[]{GamePriceObj.class}, Void.TYPE).isSupported) {
            return;
        }
        if (gamePriceObj == null) {
            getVg_deadline_date().setVisibility(8);
            return;
        }
        String[] strArrR = w.r(getContext(), n.r(gamePriceObj.getDeadline_timestamp()));
        if (com.max.hbcommon.utils.c.u(strArrR[0]) || com.max.hbcommon.utils.c.u(strArrR[1])) {
            getVg_deadline_date().setVisibility(8);
        } else {
            getVg_deadline_date().setVisibility(0);
            getTv_deadline_date().setText("折扣剩余" + strArrR[0] + strArrR[1]);
        }
        if (!gamePriceObj.isSuper_lowest()) {
            if (f0.g("1", gamePriceObj.getNew_lowest())) {
                getBv_deadline_date().setVisibility(8);
                getTv_deadline_date().setBackground(q.u(getContext(), R.color.emerald_green, 5.0f));
                return;
            } else {
                getBv_deadline_date().setVisibility(8);
                getTv_deadline_date().setBackground(q.u(getContext(), R.color.lowest_discount_color, 5.0f));
                return;
            }
        }
        getBv_deadline_date().setVisibility(0);
        getTv_deadline_date().setBackgroundResource(R.color.transparent);
        getBv_deadline_date().setmResId(R.drawable.game_lowest_price_167x16_1);
        getBv_deadline_date().setmScrollltr(true);
        getBv_deadline_date().setDoublePicture(true);
        getBv_deadline_date().setRadiusZone(6);
        int iW = ViewUtils.W(getVg_deadline_date());
        getBv_deadline_date().getLayoutParams().width = iW;
        getBv_deadline_date().setRadius(ViewUtils.f(getContext(), 5.0f));
        getBv_deadline_date().c(ViewUtils.f(getContext(), 19.0f), iW);
    }

    public final void setDesireWidth(int i10) {
        this.f87011w = i10;
    }

    public final void setGameName(@e String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 37053, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        getTv_game_name().setText(str);
    }

    public final void setGamePrice(@e GameObj gameObj) {
        if (PatchProxy.proxy(new Object[]{gameObj}, this, changeQuickRedirect, false, 37055, new Class[]{GameObj.class}, Void.TYPE).isSupported) {
            return;
        }
        if (gameObj == null) {
            getView_price().setVisibility(8);
        } else {
            getView_price().setVisibility(0);
            GamePriceView.k(getView_price(), gameObj, false, GamePriceView.ColorType.White, true, false, 16, null);
        }
    }

    public final void setHsv_tags(@d CustomHorizontalScrollView customHorizontalScrollView) {
        if (PatchProxy.proxy(new Object[]{customHorizontalScrollView}, this, changeQuickRedirect, false, 37037, new Class[]{CustomHorizontalScrollView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(customHorizontalScrollView, "<set-?>");
        this.f87004p = customHorizontalScrollView;
    }

    public final void setIv_bg(@d ImageView imageView) {
        if (PatchProxy.proxy(new Object[]{imageView}, this, changeQuickRedirect, false, 37029, new Class[]{ImageView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(imageView, "<set-?>");
        this.f87000l = imageView;
    }

    public final void setIv_middle(@d ImageView imageView) {
        if (PatchProxy.proxy(new Object[]{imageView}, this, changeQuickRedirect, false, 37039, new Class[]{ImageView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(imageView, "<set-?>");
        this.f87005q = imageView;
    }

    public final void setLl_platform_icon(@d LinearLayout linearLayout) {
        if (PatchProxy.proxy(new Object[]{linearLayout}, this, changeQuickRedirect, false, 37049, new Class[]{LinearLayout.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(linearLayout, "<set-?>");
        this.f87010v = linearLayout;
    }

    public final void setPlatformsIcon(@e List<String> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 37058, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        getLl_platform_icon().removeAllViews();
        if (com.max.hbcommon.utils.c.w(list)) {
            getLl_platform_icon().setVisibility(8);
            return;
        }
        getLl_platform_icon().setVisibility(0);
        f0.m(list);
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            ImageView imageViewN0 = r1.n0(getContext(), it.next(), ViewUtils.f(getContext(), 18.0f));
            if (imageViewN0 != null) {
                getLl_platform_icon().addView(imageViewN0);
            }
        }
    }

    public final void setScore(@e String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 37056, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        if (str == null) {
            getVg_score().setVisibility(8);
        } else {
            r1.S1(new s.e(R.layout.game_score, getVg_score()), null, str, null);
            getVg_score().setVisibility(0);
        }
    }

    public final void setTv_deadline_date(@d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 37043, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(textView, "<set-?>");
        this.f87007s = textView;
    }

    public final void setTv_game_name(@d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 37031, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(textView, "<set-?>");
        this.f87001m = textView;
    }

    public final void setType(@d Type type) {
        if (PatchProxy.proxy(new Object[]{type}, this, changeQuickRedirect, false, 37057, new Class[]{Type.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(type, "type");
        int i10 = a.f87012a[type.ordinal()];
        if (i10 == 1) {
            getIv_middle().setVisibility(8);
        } else {
            if (i10 != 2) {
                return;
            }
            getIv_middle().setVisibility(0);
        }
    }

    public final void setVg_container(@d RelativeLayout relativeLayout) {
        if (PatchProxy.proxy(new Object[]{relativeLayout}, this, changeQuickRedirect, false, 37027, new Class[]{RelativeLayout.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(relativeLayout, "<set-?>");
        this.f86999k = relativeLayout;
    }

    public final void setVg_deadline_date(@d View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 37047, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(view, "<set-?>");
        this.f87009u = view;
    }

    public final void setVg_score(@d View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 37041, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(view, "<set-?>");
        this.f87006r = view;
    }

    public final void setView_blur(@d BlurView blurView) {
        if (PatchProxy.proxy(new Object[]{blurView}, this, changeQuickRedirect, false, 37035, new Class[]{BlurView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(blurView, "<set-?>");
        this.f87003o = blurView;
    }

    public final void setView_price(@d GamePriceView gamePriceView) {
        if (PatchProxy.proxy(new Object[]{gamePriceView}, this, changeQuickRedirect, false, 37033, new Class[]{GamePriceView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(gamePriceView, "<set-?>");
        this.f87002n = gamePriceView;
    }
}
