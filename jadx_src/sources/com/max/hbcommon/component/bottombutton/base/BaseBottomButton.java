package com.max.hbcommon.component.bottombutton.base;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.v;
import androidx.cardview.widget.CardView;
import bb.c;
import com.max.hbcommon.R;
import com.max.hbimage.b;
import com.max.hbutils.utils.ViewUtils;
import com.max.hbutils.utils.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;

/* JADX INFO: compiled from: BaseBottomButton.kt */
/* JADX INFO: loaded from: classes9.dex */
@t0({"SMAP\nBaseBottomButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseBottomButton.kt\ncom/max/hbcommon/component/bottombutton/base/BaseBottomButton\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,395:1\n1#2:396\n*E\n"})
public final class BaseBottomButton extends CardView {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public TextView f67213k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ViewGroup f67214l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ImageView f67215m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ViewGroup f67216n;

    /* JADX INFO: compiled from: BaseBottomButton.kt */
    public enum BaseBottomButtonStyle {
        BlackWhite,
        GrayBlack,
        Alpha10GrayBlack,
        WhiteGray,
        GrayWhite,
        GrayGray,
        Alpha10GrayGray,
        BlueWhite,
        GreenWhite,
        WhiteAlpha8;

        private static final /* synthetic */ kotlin.enums.a $ENTRIES = EnumEntriesKt.b(values());
        public static ChangeQuickRedirect changeQuickRedirect;

        @d
        public static kotlin.enums.a<BaseBottomButtonStyle> getEntries() {
            return $ENTRIES;
        }

        public static BaseBottomButtonStyle valueOf(String str) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, c.d.f31468pi, new Class[]{String.class}, BaseBottomButtonStyle.class);
            return (BaseBottomButtonStyle) (patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : Enum.valueOf(BaseBottomButtonStyle.class, str));
        }

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static BaseBottomButtonStyle[] valuesCustom() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, c.d.f31445oi, new Class[0], BaseBottomButtonStyle[].class);
            return (BaseBottomButtonStyle[]) (patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : values().clone());
        }
    }

    /* JADX INFO: compiled from: BaseBottomButton.kt */
    public final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f67217a;

        static {
            int[] iArr = new int[BaseBottomButtonStyle.valuesCustom().length];
            try {
                iArr[BaseBottomButtonStyle.BlackWhite.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BaseBottomButtonStyle.GrayBlack.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BaseBottomButtonStyle.Alpha10GrayBlack.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BaseBottomButtonStyle.WhiteGray.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[BaseBottomButtonStyle.GrayWhite.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[BaseBottomButtonStyle.GrayGray.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[BaseBottomButtonStyle.Alpha10GrayGray.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[BaseBottomButtonStyle.BlueWhite.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[BaseBottomButtonStyle.GreenWhite.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[BaseBottomButtonStyle.WhiteAlpha8.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            f67217a = iArr;
        }
    }

    public BaseBottomButton(@e Context context) {
        this(context, null);
    }

    public BaseBottomButton(@e Context context, @e AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseBottomButton(@e Context context, @e AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        f0.m(context);
        i(attributeSet);
    }

    private final void i(AttributeSet attributeSet) {
        ImageView iv_button;
        TextView tv_button;
        TextView tv_button2;
        ImageView iv_button2;
        if (PatchProxy.proxy(new Object[]{attributeSet}, this, changeQuickRedirect, false, c.d.Zh, new Class[]{AttributeSet.class}, Void.TYPE).isSupported) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.f66484z);
        f0.o(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        int color = typedArrayObtainStyledAttributes.getColor(R.styleable.BaseBottomButton_actionTextColor, -1);
        int color2 = typedArrayObtainStyledAttributes.getColor(R.styleable.BaseBottomButton_iconColor, -1);
        CharSequence text = typedArrayObtainStyledAttributes.getText(R.styleable.BaseBottomButton_text);
        boolean z10 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.BaseBottomButton_isShowIcon, false);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(R.styleable.BaseBottomButton_icon, -1);
        int i10 = typedArrayObtainStyledAttributes.getInt(R.styleable.BaseBottomButton_baseButtonStyle, -1);
        LayoutInflater.from(getContext()).inflate(R.layout.layout_base_bottom_button, this);
        View viewFindViewById = findViewById(R.id.tv_button);
        f0.o(viewFindViewById, "findViewById(...)");
        setTv_button((TextView) viewFindViewById);
        View viewFindViewById2 = findViewById(R.id.vg_button);
        f0.o(viewFindViewById2, "findViewById(...)");
        setVg_button((ViewGroup) viewFindViewById2);
        View viewFindViewById3 = findViewById(R.id.iv_button);
        f0.o(viewFindViewById3, "findViewById(...)");
        setIv_button((ImageView) viewFindViewById3);
        View viewFindViewById4 = findViewById(R.id.vg_left_view);
        f0.o(viewFindViewById4, "findViewById(...)");
        setVg_left_view((ViewGroup) viewFindViewById4);
        if (color2 != -1 && (iv_button2 = getIv_button()) != null) {
            iv_button2.setColorFilter(color2);
        }
        if (text != null && !com.max.hbcommon.utils.c.u(text.toString()) && (tv_button2 = getTv_button()) != null) {
            tv_button2.setText(text);
        }
        if (color != -1 && (tv_button = getTv_button()) != null) {
            tv_button.setTextColor(color);
        }
        if (z10) {
            ImageView iv_button3 = getIv_button();
            if (iv_button3 != null) {
                iv_button3.setVisibility(0);
            }
        } else {
            ImageView iv_button4 = getIv_button();
            if (iv_button4 != null) {
                iv_button4.setVisibility(8);
            }
        }
        if (resourceId != -1 && (iv_button = getIv_button()) != null) {
            iv_button.setImageResource(resourceId);
        }
        setButtonStyle(i10);
        setElevation(0.0f);
        setCardElevation(0.0f);
        super.setCardBackgroundColor(getContext().getResources().getColor(R.color.transparent));
    }

    @d
    public final ImageView getIv_button() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.d.Vh, new Class[0], ImageView.class);
        if (patchProxyResultProxy.isSupported) {
            return (ImageView) patchProxyResultProxy.result;
        }
        ImageView imageView = this.f67215m;
        if (imageView != null) {
            return imageView;
        }
        f0.S("iv_button");
        return null;
    }

    @d
    public final TextView getTv_button() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.d.Rh, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.f67213k;
        if (textView != null) {
            return textView;
        }
        f0.S("tv_button");
        return null;
    }

    @d
    public final ViewGroup getVg_button() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.d.Th, new Class[0], ViewGroup.class);
        if (patchProxyResultProxy.isSupported) {
            return (ViewGroup) patchProxyResultProxy.result;
        }
        ViewGroup viewGroup = this.f67214l;
        if (viewGroup != null) {
            return viewGroup;
        }
        f0.S("vg_button");
        return null;
    }

    @d
    public final ViewGroup getVg_left_view() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.d.Xh, new Class[0], ViewGroup.class);
        if (patchProxyResultProxy.isSupported) {
            return (ViewGroup) patchProxyResultProxy.result;
        }
        ViewGroup viewGroup = this.f67216n;
        if (viewGroup != null) {
            return viewGroup;
        }
        f0.S("vg_left_view");
        return null;
    }

    public final void h(@e View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, c.d.f31353ki, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        if (view == null) {
            getVg_left_view().removeAllViews();
            return;
        }
        if (f0.g(view.getParent(), getVg_left_view())) {
            return;
        }
        getVg_left_view().removeAllViews();
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        getVg_left_view().addView(view);
    }

    @Override // android.view.View
    public void setBackground(@e Drawable drawable) {
        if (PatchProxy.proxy(new Object[]{drawable}, this, changeQuickRedirect, false, c.d.f31399mi, new Class[]{Drawable.class}, Void.TYPE).isSupported) {
            return;
        }
        getVg_button().setBackground(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, c.d.f31422ni, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        getVg_button().setBackgroundColor(i10);
    }

    @qa.a(note = "设置按钮style 0-7")
    public final void setButtonStyle(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, c.d.f31122ai, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
        }
        switch (i10) {
            case 0:
                setButtonStyle(BaseBottomButtonStyle.BlackWhite);
                break;
            case 1:
                setButtonStyle(BaseBottomButtonStyle.GrayBlack);
                break;
            case 2:
                setButtonStyle(BaseBottomButtonStyle.WhiteGray);
                break;
            case 3:
                setButtonStyle(BaseBottomButtonStyle.GrayWhite);
                break;
            case 4:
                setButtonStyle(BaseBottomButtonStyle.BlueWhite);
                break;
            case 5:
                setButtonStyle(BaseBottomButtonStyle.GreenWhite);
                break;
            case 6:
                setButtonStyle(BaseBottomButtonStyle.GrayGray);
                break;
            case 7:
                setButtonStyle(BaseBottomButtonStyle.WhiteAlpha8);
                break;
        }
    }

    public final void setButtonStyle(@d BaseBottomButtonStyle style) {
        if (PatchProxy.proxy(new Object[]{style}, this, changeQuickRedirect, false, c.d.f31145bi, new Class[]{BaseBottomButtonStyle.class}, Void.TYPE).isSupported) {
        }
        f0.p(style, "style");
        float fM = ViewUtils.m(getContext(), ViewUtils.W(this), ViewUtils.f(getContext(), 44.0f));
        setRadius(fM);
        switch (a.f67217a[style.ordinal()]) {
            case 1:
                StateListDrawable stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(new int[]{android.R.attr.state_pressed}, ViewUtils.i(0, getContext().getResources().getColor(R.color.dialog_btn_black_color_alpha80), getContext().getResources().getColor(R.color.text_primary_1_color_alpha80)));
                stateListDrawable.addState(new int[0], ViewUtils.i(0, getContext().getResources().getColor(R.color.dialog_btn_black_color), getContext().getResources().getColor(R.color.text_primary_1_color)));
                getVg_button().setBackground(stateListDrawable);
                Resources resources = getContext().getResources();
                int i10 = R.color.background_layer_2_color;
                setIconColor(resources.getColor(i10));
                setTextColor(getContext().getResources().getColor(i10));
                break;
            case 2:
                ViewGroup vg_button = getVg_button();
                if (vg_button != null) {
                    vg_button.setBackgroundResource(R.color.divider_secondary_1_color);
                }
                Resources resources2 = getContext().getResources();
                int i11 = R.color.text_primary_1_color;
                setIconColor(resources2.getColor(i11));
                setTextColor(getContext().getResources().getColor(i11));
                break;
            case 3:
                getVg_button().setBackgroundResource(R.color.text_primary_1_color_alpha10);
                Resources resources3 = getContext().getResources();
                int i12 = R.color.text_primary_1_color;
                setIconColor(resources3.getColor(i12));
                setTextColor(getContext().getResources().getColor(i12));
                break;
            case 4:
                setRadius(0.0f);
                ViewGroup vg_button2 = getVg_button();
                if (vg_button2 != null) {
                    vg_button2.setBackground(ViewUtils.N(fM, ViewUtils.f(getContext(), 0.5f), getContext().getResources().getColor(R.color.divider_primary_1_color)));
                }
                Resources resources4 = getContext().getResources();
                int i13 = R.color.text_primary_2_color;
                setIconColor(resources4.getColor(i13));
                setTextColor(getContext().getResources().getColor(i13));
                break;
            case 5:
                ViewGroup vg_button3 = getVg_button();
                if (vg_button3 != null) {
                    vg_button3.setBackgroundResource(R.color.divider_secondary_1_color);
                }
                Resources resources5 = getContext().getResources();
                int i14 = R.color.background_layer_2_color;
                setIconColor(resources5.getColor(i14));
                setTextColor(getContext().getResources().getColor(i14));
                break;
            case 6:
                ViewGroup vg_button4 = getVg_button();
                if (vg_button4 != null) {
                    vg_button4.setBackgroundResource(R.color.divider_secondary_1_color);
                }
                Resources resources6 = getContext().getResources();
                int i15 = R.color.text_secondary_1_color;
                setIconColor(resources6.getColor(i15));
                setTextColor(getContext().getResources().getColor(i15));
                break;
            case 7:
                getVg_button().setBackgroundResource(R.color.text_primary_1_color_alpha10);
                Resources resources7 = getContext().getResources();
                int i16 = R.color.text_secondary_1_color;
                setIconColor(resources7.getColor(i16));
                setTextColor(getContext().getResources().getColor(i16));
                break;
            case 8:
                ViewGroup vg_button5 = getVg_button();
                if (vg_button5 != null) {
                    vg_button5.setBackgroundResource(R.color.steam_color);
                }
                Resources resources8 = getContext().getResources();
                int i17 = R.color.background_layer_2_color;
                setIconColor(resources8.getColor(i17));
                setTextColor(getContext().getResources().getColor(i17));
                break;
            case 9:
                ViewGroup vg_button6 = getVg_button();
                if (vg_button6 != null) {
                    vg_button6.setBackground(q.d(getContext(), R.color.lowest_discount_color, R.color.lowest_discount_color_alpha80, 0.0f));
                }
                Resources resources9 = getContext().getResources();
                int i18 = R.color.background_layer_2_color;
                setIconColor(resources9.getColor(i18));
                setTextColor(getContext().getResources().getColor(i18));
                break;
            case 10:
                ViewGroup vg_button7 = getVg_button();
                if (vg_button7 != null) {
                    vg_button7.setBackgroundResource(R.color.white_alpha8);
                }
                Resources resources10 = getContext().getResources();
                int i19 = R.color.white;
                setIconColor(resources10.getColor(i19));
                setTextColor(getContext().getResources().getColor(i19));
                break;
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, c.d.f31376li, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        getVg_button().setBackgroundColor(i10);
    }

    public final void setIcon(@v int i10) {
        ImageView iv_button;
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, c.d.f31238fi, new Class[]{Integer.TYPE}, Void.TYPE).isSupported || (iv_button = getIv_button()) == null) {
            return;
        }
        iv_button.setImageResource(i10);
    }

    public final void setIcon(@d Drawable drawable) {
        if (PatchProxy.proxy(new Object[]{drawable}, this, changeQuickRedirect, false, c.d.f31215ei, new Class[]{Drawable.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(drawable, "drawable");
        ImageView iv_button = getIv_button();
        if (iv_button != null) {
            iv_button.setImageDrawable(drawable);
        }
    }

    public final void setIcon(@e String str) {
        ImageView iv_button;
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, c.d.f31261gi, new Class[]{String.class}, Void.TYPE).isSupported || str == null || (iv_button = getIv_button()) == null) {
            return;
        }
        b.K(str, iv_button);
    }

    public final void setIconColor(int i10) {
        ImageView iv_button;
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, c.d.f31330ji, new Class[]{Integer.TYPE}, Void.TYPE).isSupported || (iv_button = getIv_button()) == null) {
            return;
        }
        iv_button.setColorFilter(i10);
    }

    @qa.a(note = "设置图标是否显示")
    public final void setIconVisible(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, c.d.f31284hi, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (z10) {
            ImageView iv_button = getIv_button();
            if (iv_button == null) {
                return;
            }
            iv_button.setVisibility(0);
            return;
        }
        ImageView iv_button2 = getIv_button();
        if (iv_button2 == null) {
            return;
        }
        iv_button2.setVisibility(8);
    }

    public final void setIv_button(@d ImageView imageView) {
        if (PatchProxy.proxy(new Object[]{imageView}, this, changeQuickRedirect, false, c.d.Wh, new Class[]{ImageView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(imageView, "<set-?>");
        this.f67215m = imageView;
    }

    @qa.a(note = "设置按钮文字")
    public final void setText(@e CharSequence charSequence) {
        TextView tv_button;
        if (PatchProxy.proxy(new Object[]{charSequence}, this, changeQuickRedirect, false, c.d.f31168ci, new Class[]{CharSequence.class}, Void.TYPE).isSupported || (tv_button = getTv_button()) == null) {
            return;
        }
        tv_button.setText(charSequence);
    }

    public final void setTextColor(int i10) {
        TextView tv_button;
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, c.d.f31306ii, new Class[]{Integer.TYPE}, Void.TYPE).isSupported || (tv_button = getTv_button()) == null) {
            return;
        }
        tv_button.setTextColor(i10);
    }

    public final void setTv_button(@d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, c.d.Sh, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(textView, "<set-?>");
        this.f67213k = textView;
    }

    public final void setTypeface(@e Typeface typeface) {
        if (PatchProxy.proxy(new Object[]{typeface}, this, changeQuickRedirect, false, c.d.f31192di, new Class[]{Typeface.class}, Void.TYPE).isSupported) {
            return;
        }
        getTv_button().setTypeface(typeface);
    }

    public final void setVg_button(@d ViewGroup viewGroup) {
        if (PatchProxy.proxy(new Object[]{viewGroup}, this, changeQuickRedirect, false, c.d.Uh, new Class[]{ViewGroup.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(viewGroup, "<set-?>");
        this.f67214l = viewGroup;
    }

    public final void setVg_left_view(@d ViewGroup viewGroup) {
        if (PatchProxy.proxy(new Object[]{viewGroup}, this, changeQuickRedirect, false, c.d.Yh, new Class[]{ViewGroup.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(viewGroup, "<set-?>");
        this.f67216n = viewGroup;
    }
}
