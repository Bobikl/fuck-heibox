package com.max.commentimagepainter.sharecard;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
import android.icu.text.NumberFormat;
import android.text.SpannableString;
import android.text.style.StrikethroughSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.l;
import androidx.lifecycle.LifecycleCoroutineScope;
import com.max.commentimagepainter.sharecard.bean.AccountInfoObj;
import com.max.commentimagepainter.sharecard.bean.CardBottomInfoObj;
import com.max.commentimagepainter.sharecard.bean.CardObjV2;
import com.max.commentimagepainter.sharecard.bean.ColorInfoObj;
import com.max.commentimagepainter.sharecard.bean.PayPriceDescObj;
import com.max.hbcustomview.HBSearchTextLogoView;
import com.max.hbcustomview.neonlightvfx.BoxAutoPlayView;
import com.max.hbcustomview.roundedview.HBRoundedCornerImageView;
import com.max.hbutils.R;
import com.max.hbutils.utils.ViewUtils;
import com.max.hbutils.utils.n;
import com.max.heybox.hblog.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.e1;
import kotlinx.coroutines.k;
import xh.i;

/* JADX INFO: compiled from: GameOrderCassetteView.kt */
/* JADX INFO: loaded from: classes8.dex */
@t0({"SMAP\nGameOrderCassetteView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GameOrderCassetteView.kt\ncom/max/commentimagepainter/sharecard/GameOrderCassetteView\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,266:1\n254#2,2:267\n254#2,2:269\n254#2,2:271\n254#2,2:273\n254#2,2:275\n254#2,2:277\n254#2,2:279\n254#2,2:281\n254#2,2:283\n254#2,2:285\n254#2,2:287\n254#2,2:289\n*S KotlinDebug\n*F\n+ 1 GameOrderCassetteView.kt\ncom/max/commentimagepainter/sharecard/GameOrderCassetteView\n*L\n75#1:267,2\n76#1:269,2\n128#1:271,2\n130#1:273,2\n192#1:275,2\n194#1:277,2\n204#1:279,2\n209#1:281,2\n217#1:283,2\n230#1:285,2\n238#1:287,2\n250#1:289,2\n*E\n"})
public final class GameOrderCassetteView extends FrameLayout {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final pa.b f65291b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @i
    public GameOrderCassetteView(@dl.d Context context) {
        this(context, null, 0, 6, null);
        f0.p(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @i
    public GameOrderCassetteView(@dl.d Context context, @dl.e AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        f0.p(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @i
    public GameOrderCassetteView(@dl.d Context context, @dl.e AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        f0.p(context, "context");
        pa.b bVarD = pa.b.d(LayoutInflater.from(context), this, true);
        f0.o(bVarD, "inflate(...)");
        this.f65291b = bVarD;
    }

    public /* synthetic */ GameOrderCassetteView(Context context, AttributeSet attributeSet, int i10, int i11, u uVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    @l
    private final int c(boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.b.Zh, new Class[]{Boolean.TYPE}, Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        return z10 ? getContext().getColor(R.color.text_primary_1_color) : getContext().getColor(R.color.white);
    }

    private final String d(int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.b.f30593di, new Class[]{Integer.TYPE}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        String str = n.f("#.##").format(((double) i10) / 1000.0d);
        f0.o(str, "format(...)");
        return str;
    }

    private final void e(ColorInfoObj colorInfoObj, boolean z10, boolean z11) {
        Object[] objArr = {colorInfoObj, new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z11 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.b.Yh, new Class[]{ColorInfoObj.class, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        this.f65291b.f138222c.setDashLineColor(c(z10));
        this.f65291b.f138222c.setTopBottomColor(com.max.hbutils.utils.a.d(colorInfoObj != null ? colorInfoObj.getTop() : null), com.max.hbutils.utils.a.d(colorInfoObj != null ? colorInfoObj.getBottom() : null));
        this.f65291b.f138222c.setBottomCreaseSpaceSize(z11 ? 75.0f : 57.0f);
    }

    private final void f(CardObjV2 cardObjV2, boolean z10, boolean z11, String str) {
        b2 b2Var;
        Object[] objArr = {cardObjV2, new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z11 ? (byte) 1 : (byte) 0), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.b.f30569ci, new Class[]{CardObjV2.class, cls, cls, String.class}, Void.TYPE).isSupported) {
            return;
        }
        pa.b bVar = this.f65291b;
        if (!z11 || str == null) {
            HBRoundedCornerImageView ivQrCode = bVar.f138228i;
            f0.o(ivQrCode, "ivQrCode");
            ivQrCode.setVisibility(8);
        } else {
            HBRoundedCornerImageView ivQrCode2 = bVar.f138228i;
            f0.o(ivQrCode2, "ivQrCode");
            ivQrCode2.setVisibility(0);
            Resources resources = getContext().getResources();
            f0.o(resources, "getResources(...)");
            Bitmap bitmapB = ob.a.b().b(str, ShareCardDrawUtilsKt.e(40, resources));
            if (bitmapB != null) {
                bVar.f138228i.setImageBitmap(bitmapB);
                b2Var = b2.f124493a;
            } else {
                b2Var = null;
            }
            if (b2Var == null) {
                g.f74531b.v("[GameOrderCassetteView][refreshBottomView] qrBitmap is null, create fail");
            }
        }
        HBSearchTextLogoView hBSearchTextLogoView = bVar.f138231l;
        CardBottomInfoObj bottom_info = cardObjV2.getBottom_info();
        hBSearchTextLogoView.b(z10, bottom_info != null ? bottom_info.getApp_desc() : null);
        TextView textView = bVar.f138233n;
        CardBottomInfoObj bottom_info2 = cardObjV2.getBottom_info();
        textView.setText(bottom_info2 != null ? bottom_info2.getAdditional_desc() : null);
        bVar.f138233n.setTextColor(c(z10));
        bVar.f138233n.setGravity(z11 ? androidx.core.view.n.f21701b : 1);
        TextView tvAdditionalDesc = bVar.f138233n;
        f0.o(tvAdditionalDesc, "tvAdditionalDesc");
        tvAdditionalDesc.setVisibility(z11 && str != null ? 0 : 8);
        ViewGroup.LayoutParams layoutParams = bVar.f138232m.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (!z11 || str == null) {
            if (marginLayoutParams != null) {
                marginLayoutParams.bottomMargin = ViewUtils.f(getContext(), 57.0f);
            }
        } else if (marginLayoutParams != null) {
            marginLayoutParams.bottomMargin = ViewUtils.f(getContext(), 75.0f);
        }
        bVar.f138232m.setLayoutParams(marginLayoutParams);
    }

    public static /* synthetic */ void h(GameOrderCassetteView gameOrderCassetteView, CardObjV2 cardObjV2, LifecycleCoroutineScope lifecycleCoroutineScope, boolean z10, String str, int i10, Object obj) {
        if (PatchProxy.proxy(new Object[]{gameOrderCassetteView, cardObjV2, lifecycleCoroutineScope, new Byte(z10 ? (byte) 1 : (byte) 0), str, new Integer(i10), obj}, null, changeQuickRedirect, true, bb.c.b.Wh, new Class[]{GameOrderCassetteView.class, CardObjV2.class, LifecycleCoroutineScope.class, Boolean.TYPE, String.class, Integer.TYPE, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        gameOrderCassetteView.g(cardObjV2, lifecycleCoroutineScope, z10, (i10 & 8) != 0 ? null : str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(BoxAutoPlayView this_apply) {
        if (PatchProxy.proxy(new Object[]{this_apply}, null, changeQuickRedirect, true, bb.c.b.f30616ei, new Class[]{BoxAutoPlayView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(this_apply, "$this_apply");
        this_apply.c(this_apply.getMeasuredHeight(), this_apply.getMeasuredWidth());
        this_apply.e();
    }

    private final void j(CardObjV2 cardObjV2, boolean z10, LifecycleCoroutineScope lifecycleCoroutineScope) {
        if (PatchProxy.proxy(new Object[]{cardObjV2, new Byte(z10 ? (byte) 1 : (byte) 0), lifecycleCoroutineScope}, this, changeQuickRedirect, false, bb.c.b.f30523ai, new Class[]{CardObjV2.class, Boolean.TYPE, LifecycleCoroutineScope.class}, Void.TYPE).isSupported) {
            return;
        }
        TextView textView = this.f65291b.f138236q;
        textView.setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71895c));
        textView.setText(cardObjV2.getName());
        if (f0.g(cardObjV2.getPay_price(), cardObjV2.getInitial_price())) {
            TextView tvOriginalPrice = this.f65291b.f138237r;
            f0.o(tvOriginalPrice, "tvOriginalPrice");
            tvOriginalPrice.setVisibility(8);
        } else {
            TextView tvOriginalPrice2 = this.f65291b.f138237r;
            f0.o(tvOriginalPrice2, "tvOriginalPrice");
            tvOriginalPrice2.setVisibility(0);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("原价:");
            sb2.append(getContext().getString(R.string.rmb_symbol));
            Integer initial_price = cardObjV2.getInitial_price();
            sb2.append(d(initial_price != null ? initial_price.intValue() : 0));
            SpannableString spannableString = new SpannableString(sb2.toString());
            spannableString.setSpan(new StrikethroughSpan(), 0, spannableString.length(), 33);
            this.f65291b.f138237r.setText(spannableString);
        }
        String img = cardObjV2.getImg();
        if (img != null) {
            com.max.hbimage.b.d0(img, this.f65291b.f138227h, ViewUtils.f(getContext(), 8.0f));
            k.f(lifecycleCoroutineScope, e1.a(), null, new GameOrderCassetteView$refreshImageCoverInfo$2$1(this, img, cardObjV2, null), 2, null);
        }
        BoxAutoPlayView boxAutoPlayView = this.f65291b.f138221b;
        boxAutoPlayView.setmResId(R.drawable.game_prefect_achieve_580x30);
        boxAutoPlayView.setDoublePicture(true);
        boxAutoPlayView.setRadiusZone(5);
        boxAutoPlayView.setRadius(ViewUtils.f(boxAutoPlayView.getContext(), 8.0f));
        boxAutoPlayView.c(ViewUtils.f(boxAutoPlayView.getContext(), 285.0f), ViewUtils.f(boxAutoPlayView.getContext(), 207.0f));
        boxAutoPlayView.e();
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [android.icu.text.DecimalFormat] */
    private final void k(CardObjV2 cardObjV2, boolean z10, @l int[] iArr) {
        if (PatchProxy.proxy(new Object[]{cardObjV2, new Byte(z10 ? (byte) 1 : (byte) 0), iArr}, this, changeQuickRedirect, false, bb.c.b.f30546bi, new Class[]{CardObjV2.class, Boolean.TYPE, int[].class}, Void.TYPE).isSupported) {
            return;
        }
        int iC = c(z10);
        AccountInfoObj account_info = cardObjV2.getAccount_info();
        b2 b2Var = null;
        com.max.hbimage.b.I(account_info != null ? account_info.getAvatar() : null, this.f65291b.f138223d, R.drawable.common_default_avatar_40x40);
        pa.b bVar = this.f65291b;
        TextView textView = bVar.f138244y;
        AccountInfoObj account_info2 = cardObjV2.getAccount_info();
        textView.setText(account_info2 != null ? account_info2.getUsername() : null);
        bVar.f138244y.setTextColor(iC);
        bVar.f138244y.setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71895c));
        bVar.f138243x.setTextColor(iC);
        bVar.f138242w.setTextColor(iC);
        Integer initial_price = cardObjV2.getInitial_price();
        int iIntValue = initial_price != null ? initial_price.intValue() : 0;
        Integer pay_price = cardObjV2.getPay_price();
        int iIntValue2 = pay_price != null ? pay_price.intValue() : 0;
        bVar.f138238s.setText(d(iIntValue2));
        bVar.f138238s.setTextColor(iC);
        if (iIntValue2 == iIntValue) {
            TextView tvDiscountPercent = bVar.f138235p;
            f0.o(tvDiscountPercent, "tvDiscountPercent");
            tvDiscountPercent.setVisibility(8);
        } else {
            TextView tvDiscountPercent2 = bVar.f138235p;
            f0.o(tvDiscountPercent2, "tvDiscountPercent");
            tvDiscountPercent2.setVisibility(0);
            float fCeil = (float) Math.ceil(((iIntValue - iIntValue2) / iIntValue) * 100.0f);
            TextView textView2 = bVar.f138235p;
            StringBuilder sb2 = new StringBuilder();
            final String str = "#";
            sb2.append(new NumberFormat(str) { // from class: android.icu.text.DecimalFormat
                static {
                    throw new NoClassDefFoundError();
                }
            }.format(Float.valueOf(-fCeil)));
            sb2.append('%');
            textView2.setText(sb2.toString());
            GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BL_TR, iArr);
            gradientDrawable.setCornerRadius(ViewUtils.f(getContext(), 2.0f));
            bVar.f138235p.setBackground(gradientDrawable);
            if (fCeil < 1.0f) {
                TextView tvDiscountPercent3 = bVar.f138235p;
                f0.o(tvDiscountPercent3, "tvDiscountPercent");
                tvDiscountPercent3.setVisibility(8);
            }
        }
        PayPriceDescObj pay_price_desc = cardObjV2.getPay_price_desc();
        if (pay_price_desc != null) {
            LinearLayout llPayPriceDesc = bVar.f138230k;
            f0.o(llPayPriceDesc, "llPayPriceDesc");
            llPayPriceDesc.setVisibility(0);
            bVar.f138240u.setText(pay_price_desc.getPrefix());
            bVar.f138240u.setTextColor(iC);
            bVar.f138239t.setText(pay_price_desc.getPercent());
            bVar.f138239t.setTextColor(iC);
            bVar.f138241v.setText(pay_price_desc.getSuffix());
            bVar.f138241v.setTextColor(iC);
            b2Var = b2.f124493a;
        }
        if (b2Var == null) {
            LinearLayout llPayPriceDesc2 = bVar.f138230k;
            f0.o(llPayPriceDesc2, "llPayPriceDesc");
            llPayPriceDesc2.setVisibility(8);
        }
    }

    public final void g(@dl.d CardObjV2 cardObjV2, @dl.d LifecycleCoroutineScope lifecycleCoroutineScope, boolean z10, @dl.e String str) {
        boolean z11 = false;
        if (PatchProxy.proxy(new Object[]{cardObjV2, lifecycleCoroutineScope, new Byte(z10 ? (byte) 1 : (byte) 0), str}, this, changeQuickRedirect, false, bb.c.b.Vh, new Class[]{CardObjV2.class, LifecycleCoroutineScope.class, Boolean.TYPE, String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(cardObjV2, "cardObjV2");
        f0.p(lifecycleCoroutineScope, "lifecycleCoroutineScope");
        boolean z12 = f0.g(cardObjV2.is_dark_theme(), "1") || f0.g(cardObjV2.is_dark_theme(), "true");
        int[] iArr = {com.max.hbutils.utils.a.d("#FFD000"), com.max.hbutils.utils.a.d("#B0FF6D"), com.max.hbutils.utils.a.d("#66B9FF")};
        final BoxAutoPlayView boxAutoPlayView = this.f65291b.f138226g;
        boxAutoPlayView.setmResId(R.drawable.game_prefect_achieve_580x30);
        boxAutoPlayView.setDoublePicture(true);
        boxAutoPlayView.post(new Runnable() { // from class: com.max.commentimagepainter.sharecard.e
            @Override // java.lang.Runnable
            public final void run() {
                GameOrderCassetteView.i(boxAutoPlayView);
            }
        });
        ColorInfoObj background_color = cardObjV2.getBackground_color();
        if (z10 && str != null) {
            z11 = true;
        }
        e(background_color, z12, z11);
        j(cardObjV2, z12, lifecycleCoroutineScope);
        k(cardObjV2, z12, iArr);
        f(cardObjV2, z12, z10, str);
    }

    public final void l(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.b.Xh, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        HBRoundedCornerImageView ivQrCode = this.f65291b.f138228i;
        f0.o(ivQrCode, "ivQrCode");
        ivQrCode.setVisibility(z10 ? 0 : 8);
        TextView tvAdditionalDesc = this.f65291b.f138233n;
        f0.o(tvAdditionalDesc, "tvAdditionalDesc");
        tvAdditionalDesc.setVisibility(z10 ? 0 : 8);
        this.f65291b.f138222c.setBottomCreaseSpaceSize(z10 ? 75.0f : 57.0f);
        ViewGroup.LayoutParams layoutParams = this.f65291b.f138232m.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (z10) {
            if (marginLayoutParams != null) {
                marginLayoutParams.bottomMargin = ViewUtils.f(getContext(), 75.0f);
            }
        } else if (marginLayoutParams != null) {
            marginLayoutParams.bottomMargin = ViewUtils.f(getContext(), 57.0f);
        }
        this.f65291b.f138232m.setLayoutParams(marginLayoutParams);
        requestLayout();
    }
}
