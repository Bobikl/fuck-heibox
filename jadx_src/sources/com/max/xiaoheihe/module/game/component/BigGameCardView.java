package com.max.xiaoheihe.module.game.component;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.compose.runtime.internal.o;
import com.max.hbcustomview.QMUIRadiusImageView;
import com.max.hbutils.utils.ViewUtils;
import com.max.hbutils.utils.q;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.accelworld.l;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;

/* JADX INFO: compiled from: BigGameCardView.kt */
/* JADX INFO: loaded from: classes11.dex */
@t0({"SMAP\nBigGameCardView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BigGameCardView.kt\ncom/max/xiaoheihe/module/game/component/BigGameCardView\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,154:1\n262#2,2:155\n262#2,2:157\n*S KotlinDebug\n*F\n+ 1 BigGameCardView.kt\ncom/max/xiaoheihe/module/game/component/BigGameCardView\n*L\n110#1:155,2\n114#1:157,2\n*E\n"})
@o(parameters = 0)
public final class BigGameCardView extends CardView {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f86562r = 8;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public RelativeLayout f86563k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public QMUIRadiusImageView f86564l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public TextView f86565m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public InnerGameItemView f86566n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ImageView f86567o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ImageView f86568p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @e
    private Type f86569q;

    /* JADX INFO: compiled from: BigGameCardView.kt */
    public enum Type {
        NORMAL,
        BORDER;

        public static ChangeQuickRedirect changeQuickRedirect;

        public static Type valueOf(String str) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 36256, new Class[]{String.class}, Type.class);
            return (Type) (patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : Enum.valueOf(Type.class, str));
        }

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static Type[] valuesCustom() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 36255, new Class[0], Type[].class);
            return (Type[]) (patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : values().clone());
        }
    }

    /* JADX INFO: compiled from: BigGameCardView.kt */
    public final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f86570a;

        static {
            int[] iArr = new int[Type.valuesCustom().length];
            try {
                iArr[Type.NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Type.BORDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f86570a = iArr;
        }
    }

    public BigGameCardView(@e Context context) {
        this(context, null);
    }

    public BigGameCardView(@e Context context, @e AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BigGameCardView(@e Context context, @e AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        f0.m(context);
        this.f86569q = Type.NORMAL;
        h();
    }

    private final void h() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36247, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setRadius(ViewUtils.f(getContext(), 8.0f));
        setCardElevation(0.0f);
        super.setCardBackgroundColor(getContext().getResources().getColor(R.color.transparent));
        View.inflate(getContext(), R.layout.view_big_game_card, this);
        View viewFindViewById = findViewById(R.id.vg_container);
        f0.o(viewFindViewById, "findViewById(R.id.vg_container)");
        setVg_container((RelativeLayout) viewFindViewById);
        View viewFindViewById2 = findViewById(R.id.iv_bg);
        f0.o(viewFindViewById2, "findViewById(R.id.iv_bg)");
        setIv_bg((QMUIRadiusImageView) viewFindViewById2);
        View viewFindViewById3 = findViewById(R.id.tv_left_top_label);
        f0.o(viewFindViewById3, "findViewById(R.id.tv_left_top_label)");
        setTv_left_top_label((TextView) viewFindViewById3);
        View viewFindViewById4 = findViewById(R.id.game_item);
        f0.o(viewFindViewById4, "findViewById(R.id.game_item)");
        setGame_item((InnerGameItemView) viewFindViewById4);
        View viewFindViewById5 = findViewById(R.id.iv_gradient);
        f0.o(viewFindViewById5, "findViewById(R.id.iv_gradient)");
        setIv_gradient((ImageView) viewFindViewById5);
        View viewFindViewById6 = findViewById(R.id.iv_gradient_top);
        f0.o(viewFindViewById6, "findViewById(R.id.iv_gradient_top)");
        setIv_gradient_top((ImageView) viewFindViewById6);
        getIv_gradient().setScaleType(ImageView.ScaleType.FIT_XY);
    }

    public static /* synthetic */ void setBottomGradientColor$default(BigGameCardView bigGameCardView, int i10, int i11, boolean z10, int i12, Object obj) {
        Object[] objArr = {bigGameCardView, new Integer(i10), new Integer(i11), new Byte(z10 ? (byte) 1 : (byte) 0), new Integer(i12), obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 36253, new Class[]{BigGameCardView.class, cls, cls, Boolean.TYPE, cls, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        bigGameCardView.setBottomGradientColor(i10, i11, z10);
    }

    @d
    public final InnerGameItemView getGame_item() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36241, new Class[0], InnerGameItemView.class);
        if (patchProxyResultProxy.isSupported) {
            return (InnerGameItemView) patchProxyResultProxy.result;
        }
        InnerGameItemView innerGameItemView = this.f86566n;
        if (innerGameItemView != null) {
            return innerGameItemView;
        }
        f0.S("game_item");
        return null;
    }

    @d
    public final QMUIRadiusImageView getIv_bg() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36237, new Class[0], QMUIRadiusImageView.class);
        if (patchProxyResultProxy.isSupported) {
            return (QMUIRadiusImageView) patchProxyResultProxy.result;
        }
        QMUIRadiusImageView qMUIRadiusImageView = this.f86564l;
        if (qMUIRadiusImageView != null) {
            return qMUIRadiusImageView;
        }
        f0.S("iv_bg");
        return null;
    }

    @d
    public final ImageView getIv_gradient() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36243, new Class[0], ImageView.class);
        if (patchProxyResultProxy.isSupported) {
            return (ImageView) patchProxyResultProxy.result;
        }
        ImageView imageView = this.f86567o;
        if (imageView != null) {
            return imageView;
        }
        f0.S("iv_gradient");
        return null;
    }

    @d
    public final ImageView getIv_gradient_top() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36245, new Class[0], ImageView.class);
        if (patchProxyResultProxy.isSupported) {
            return (ImageView) patchProxyResultProxy.result;
        }
        ImageView imageView = this.f86568p;
        if (imageView != null) {
            return imageView;
        }
        f0.S("iv_gradient_top");
        return null;
    }

    @d
    public final TextView getTv_left_top_label() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36239, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.f86565m;
        if (textView != null) {
            return textView;
        }
        f0.S("tv_left_top_label");
        return null;
    }

    @d
    public final RelativeLayout getVg_container() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36235, new Class[0], RelativeLayout.class);
        if (patchProxyResultProxy.isSupported) {
            return (RelativeLayout) patchProxyResultProxy.result;
        }
        RelativeLayout relativeLayout = this.f86563k;
        if (relativeLayout != null) {
            return relativeLayout;
        }
        f0.S("vg_container");
        return null;
    }

    @Override // android.view.View
    public void setBackground(@e Drawable drawable) {
        if (PatchProxy.proxy(new Object[]{drawable}, this, changeQuickRedirect, false, 36249, new Class[]{Drawable.class}, Void.TYPE).isSupported) {
            return;
        }
        getVg_container().setBackground(drawable);
    }

    public final void setBackgroundGradientColor(int i10, int i11) {
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 36248, new Class[]{cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        setBackground(ViewUtils.x(0, i10, i11));
    }

    public final void setBottomGradientColor(int i10, int i11, boolean z10) {
        Object[] objArr = {new Integer(i10), new Integer(i11), new Byte(z10 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 36252, new Class[]{cls, cls, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (z10) {
            Drawable drawableX = ViewUtils.x(0, i10, i11);
            drawableX.setBounds(0, 0, ViewUtils.L(getContext()), ViewUtils.L(getContext()));
            getIv_gradient().setImageBitmap(com.max.mediaselector.lib.utils.c.n(com.max.mediaselector.lib.utils.c.e(drawableX, ViewUtils.L(getContext()))));
            ViewGroup.LayoutParams layoutParams = getIv_gradient().getLayoutParams();
            Context context = getContext();
            f0.o(context, "context");
            layoutParams.height = l.c(74.0f, context);
            getIv_gradient().requestLayout();
            getIv_gradient_top().setVisibility(8);
            return;
        }
        int I = com.max.xiaoheihe.utils.d.I(0.0f, i10);
        int I2 = com.max.xiaoheihe.utils.d.I(0.9f, i11);
        getIv_gradient_top().setVisibility(0);
        getIv_gradient_top().setBackground(ViewUtils.P(0, I, I2));
        getIv_gradient().setImageDrawable(ViewUtils.P(0, I2, com.max.xiaoheihe.utils.d.I(0.95f, i11)));
        ViewGroup.LayoutParams layoutParams2 = getIv_gradient().getLayoutParams();
        Context context2 = getContext();
        f0.o(context2, "context");
        layoutParams2.height = l.c(60.0f, context2);
        getIv_gradient().requestLayout();
    }

    public final void setGame_item(@d InnerGameItemView innerGameItemView) {
        if (PatchProxy.proxy(new Object[]{innerGameItemView}, this, changeQuickRedirect, false, 36242, new Class[]{InnerGameItemView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(innerGameItemView, "<set-?>");
        this.f86566n = innerGameItemView;
    }

    public final void setIv_bg(@d QMUIRadiusImageView qMUIRadiusImageView) {
        if (PatchProxy.proxy(new Object[]{qMUIRadiusImageView}, this, changeQuickRedirect, false, 36238, new Class[]{QMUIRadiusImageView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(qMUIRadiusImageView, "<set-?>");
        this.f86564l = qMUIRadiusImageView;
    }

    public final void setIv_gradient(@d ImageView imageView) {
        if (PatchProxy.proxy(new Object[]{imageView}, this, changeQuickRedirect, false, 36244, new Class[]{ImageView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(imageView, "<set-?>");
        this.f86567o = imageView;
    }

    public final void setIv_gradient_top(@d ImageView imageView) {
        if (PatchProxy.proxy(new Object[]{imageView}, this, changeQuickRedirect, false, 36246, new Class[]{ImageView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(imageView, "<set-?>");
        this.f86568p = imageView;
    }

    public final void setLabelBackGroundColor(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 36250, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        getTv_left_top_label().setBackground(q.w(getContext(), i10, new float[]{4.0f, 4.0f, 0.0f, 0.0f, 6.0f, 6.0f, 0.0f, 0.0f}));
    }

    public final void setLabelText(@e String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 36251, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        getTv_left_top_label().setText(str);
    }

    public final void setTv_left_top_label(@d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 36240, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(textView, "<set-?>");
        this.f86565m = textView;
    }

    public final void setType(@d Type type) {
        if (PatchProxy.proxy(new Object[]{type}, this, changeQuickRedirect, false, 36254, new Class[]{Type.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(type, "type");
        this.f86569q = type;
        int i10 = a.f86570a[type.ordinal()];
        if (i10 == 1) {
            getVg_container().setPadding(0, 0, 0, 0);
            int iF = ViewUtils.f(getContext(), 12.0f);
            ViewGroup.LayoutParams layoutParams = getGame_item().getLayoutParams();
            f0.n(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = iF;
            ViewGroup.LayoutParams layoutParams2 = getGame_item().getLayoutParams();
            f0.n(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin = iF;
            ViewGroup.LayoutParams layoutParams3 = getGame_item().getLayoutParams();
            f0.n(layoutParams3, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((ViewGroup.MarginLayoutParams) layoutParams3).bottomMargin = iF;
            return;
        }
        if (i10 != 2) {
            return;
        }
        int iF2 = ViewUtils.f(getContext(), 3.0f);
        getVg_container().setPadding(iF2, iF2, iF2, iF2);
        int iF3 = ViewUtils.f(getContext(), 9.0f);
        ViewGroup.LayoutParams layoutParams4 = getGame_item().getLayoutParams();
        f0.n(layoutParams4, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams4).leftMargin = iF3;
        ViewGroup.LayoutParams layoutParams5 = getGame_item().getLayoutParams();
        f0.n(layoutParams5, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams5).rightMargin = iF3;
        ViewGroup.LayoutParams layoutParams6 = getGame_item().getLayoutParams();
        f0.n(layoutParams6, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams6).bottomMargin = iF3;
    }

    public final void setVg_container(@d RelativeLayout relativeLayout) {
        if (PatchProxy.proxy(new Object[]{relativeLayout}, this, changeQuickRedirect, false, 36236, new Class[]{RelativeLayout.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(relativeLayout, "<set-?>");
        this.f86563k = relativeLayout;
    }
}
