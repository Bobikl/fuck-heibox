package com.max.hbcommon.component;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.max.hbcommon.R;
import com.max.hbutils.utils.ViewUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ListSectionHeader.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class ListSectionHeader extends RelativeLayout {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    public static final a f67141f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final float f67142g = 10.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private RelativeLayout f67143b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private TextView f67144c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f67145d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private MoreButton f67146e;

    /* JADX INFO: compiled from: ListSectionHeader.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        public final float a() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.Sc, new Class[0], Float.TYPE);
            return patchProxyResultProxy.isSupported ? ((Float) patchProxyResultProxy.result).floatValue() : ListSectionHeader.f67142g;
        }
    }

    public ListSectionHeader(@dl.e Context context) {
        this(context, null);
    }

    public ListSectionHeader(@dl.e Context context, @dl.e AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ListSectionHeader(@dl.e Context context, @dl.e AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public ListSectionHeader(@dl.e Context context, @dl.e AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        b(attributeSet);
    }

    private final void b(AttributeSet attributeSet) {
        if (PatchProxy.proxy(new Object[]{attributeSet}, this, changeQuickRedirect, false, bb.c.d.Cc, new Class[]{AttributeSet.class}, Void.TYPE).isSupported) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.B1);
        kotlin.jvm.internal.f0.o(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        int color = typedArrayObtainStyledAttributes.getColor(R.styleable.ListSectionHeader_titleColor, getContext().getResources().getColor(R.color.text_primary_1_color));
        String string = typedArrayObtainStyledAttributes.getString(R.styleable.ListSectionHeader_titleText);
        int i10 = R.styleable.ListSectionHeader_descColor;
        Resources resources = getContext().getResources();
        int i11 = R.color.text_secondary_1_color;
        int color2 = typedArrayObtainStyledAttributes.getColor(i10, resources.getColor(i11));
        String string2 = typedArrayObtainStyledAttributes.getString(R.styleable.ListSectionHeader_descText);
        int color3 = typedArrayObtainStyledAttributes.getColor(R.styleable.ListSectionHeader_moreColor, getContext().getResources().getColor(i11));
        String string3 = typedArrayObtainStyledAttributes.getString(R.styleable.ListSectionHeader_moreText);
        boolean z10 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.ListSectionHeader_showMoreText, true);
        boolean z11 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.ListSectionHeader_showMoreButton, true);
        float dimension = typedArrayObtainStyledAttributes.getDimension(R.styleable.ListSectionHeader_titleTextSize, ViewUtils.f(getContext(), 16.0f));
        int i12 = R.styleable.ListSectionHeader_titlePaddingTop;
        Context context = getContext();
        float f10 = f67142g;
        int dimension2 = (int) typedArrayObtainStyledAttributes.getDimension(i12, ViewUtils.f(context, f10));
        int dimension3 = (int) typedArrayObtainStyledAttributes.getDimension(R.styleable.ListSectionHeader_titlePaddingBottom, ViewUtils.f(getContext(), f10));
        this.f67143b = new RelativeLayout(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        RelativeLayout relativeLayout = this.f67143b;
        if (relativeLayout == null) {
            kotlin.jvm.internal.f0.S(com.google.android.exoplayer2.text.ttml.d.W);
            relativeLayout = null;
        }
        addView(relativeLayout, layoutParams);
        TextView textView = new TextView(getContext());
        this.f67144c = textView;
        int i13 = R.id.tv_title;
        textView.setId(i13);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, ViewUtils.f(getContext(), 22.0f));
        TextView textView2 = this.f67144c;
        if (textView2 == null) {
            kotlin.jvm.internal.f0.S("tv_title");
            textView2 = null;
        }
        textView2.setGravity(16);
        TextView textView3 = this.f67144c;
        if (textView3 == null) {
            kotlin.jvm.internal.f0.S("tv_title");
            textView3 = null;
        }
        textView3.setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71895c));
        layoutParams2.addRule(15);
        layoutParams2.leftMargin = ViewUtils.f(getContext(), 12.0f);
        RelativeLayout relativeLayout2 = this.f67143b;
        if (relativeLayout2 == null) {
            kotlin.jvm.internal.f0.S(com.google.android.exoplayer2.text.ttml.d.W);
            relativeLayout2 = null;
        }
        TextView textView4 = this.f67144c;
        if (textView4 == null) {
            kotlin.jvm.internal.f0.S("tv_title");
            textView4 = null;
        }
        relativeLayout2.addView(textView4, layoutParams2);
        setTv_desc(new TextView(getContext()));
        getTv_desc().setTextSize(ViewUtils.g(getContext(), 12.0f));
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams3.addRule(15);
        layoutParams3.addRule(1, i13);
        layoutParams3.leftMargin = ViewUtils.f(getContext(), 6.0f);
        RelativeLayout relativeLayout3 = this.f67143b;
        if (relativeLayout3 == null) {
            kotlin.jvm.internal.f0.S(com.google.android.exoplayer2.text.ttml.d.W);
            relativeLayout3 = null;
        }
        relativeLayout3.addView(getTv_desc(), layoutParams3);
        this.f67146e = new MoreButton(getContext());
        int iF = ViewUtils.f(getContext(), 10.0f);
        MoreButton moreButton = this.f67146e;
        if (moreButton == null) {
            kotlin.jvm.internal.f0.S("mb");
            moreButton = null;
        }
        moreButton.setPadding(iF, 0, iF, 0);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams4.addRule(15);
        layoutParams4.addRule(11);
        RelativeLayout relativeLayout4 = this.f67143b;
        if (relativeLayout4 == null) {
            kotlin.jvm.internal.f0.S(com.google.android.exoplayer2.text.ttml.d.W);
            relativeLayout4 = null;
        }
        MoreButton moreButton2 = this.f67146e;
        if (moreButton2 == null) {
            kotlin.jvm.internal.f0.S("mb");
            moreButton2 = null;
        }
        relativeLayout4.addView(moreButton2, layoutParams4);
        setTitleColor(color);
        setDescColor(color2);
        setMoreColor(color3);
        setTitleText(string);
        setDescText(string2);
        setMoreText(string3);
        setMoreTextVisible(z10);
        setMoreButtonVisible(z11);
        setTitleSize(ViewUtils.i0(getContext(), dimension));
        setTopPadding(dimension2);
        setBottomPadding(dimension3);
    }

    @dl.d
    public final TextView getTv_desc() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.Ac, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.f67145d;
        if (textView != null) {
            return textView;
        }
        kotlin.jvm.internal.f0.S("tv_desc");
        return null;
    }

    public final void setBottomPadding(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.d.Rc, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        RelativeLayout relativeLayout = this.f67143b;
        RelativeLayout relativeLayout2 = null;
        if (relativeLayout == null) {
            kotlin.jvm.internal.f0.S(com.google.android.exoplayer2.text.ttml.d.W);
            relativeLayout = null;
        }
        if (relativeLayout.getLayoutParams() == null) {
            RelativeLayout relativeLayout3 = this.f67143b;
            if (relativeLayout3 == null) {
                kotlin.jvm.internal.f0.S(com.google.android.exoplayer2.text.ttml.d.W);
                relativeLayout3 = null;
            }
            relativeLayout3.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
        }
        RelativeLayout relativeLayout4 = this.f67143b;
        if (relativeLayout4 == null) {
            kotlin.jvm.internal.f0.S(com.google.android.exoplayer2.text.ttml.d.W);
        } else {
            relativeLayout2 = relativeLayout4;
        }
        ViewGroup.LayoutParams layoutParams = relativeLayout2.getLayoutParams();
        kotlin.jvm.internal.f0.n(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = i10;
    }

    @qa.a(note = "设置底部空白高度")
    public final void setBottomPaddingDp(float f10) {
        if (PatchProxy.proxy(new Object[]{new Float(f10)}, this, changeQuickRedirect, false, bb.c.d.Qc, new Class[]{Float.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        setBottomPadding(ViewUtils.f(getContext(), f10));
    }

    @qa.a
    public final void setDescColor(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.d.Ec, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        getTv_desc().setTextColor(i10);
    }

    @qa.a
    public final void setDescText(@dl.e String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, bb.c.d.Hc, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        getTv_desc().setText(str);
    }

    @qa.a
    public final void setDescVisible(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.d.Mc, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (z10) {
            getTv_desc().setVisibility(0);
        } else {
            getTv_desc().setVisibility(8);
        }
    }

    @qa.a
    public final void setMoreButtonVisible(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.d.Lc, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        MoreButton moreButton = null;
        if (z10) {
            MoreButton moreButton2 = this.f67146e;
            if (moreButton2 == null) {
                kotlin.jvm.internal.f0.S("mb");
            } else {
                moreButton = moreButton2;
            }
            moreButton.setVisibility(0);
            return;
        }
        MoreButton moreButton3 = this.f67146e;
        if (moreButton3 == null) {
            kotlin.jvm.internal.f0.S("mb");
        } else {
            moreButton = moreButton3;
        }
        moreButton.setVisibility(8);
    }

    public final void setMoreClickListener(@dl.e View.OnClickListener onClickListener) {
        if (PatchProxy.proxy(new Object[]{onClickListener}, this, changeQuickRedirect, false, bb.c.d.Jc, new Class[]{View.OnClickListener.class}, Void.TYPE).isSupported) {
            return;
        }
        MoreButton moreButton = this.f67146e;
        if (moreButton == null) {
            kotlin.jvm.internal.f0.S("mb");
            moreButton = null;
        }
        moreButton.setOnClickListener(onClickListener);
    }

    @qa.a
    public final void setMoreColor(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.d.Fc, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        MoreButton moreButton = this.f67146e;
        if (moreButton == null) {
            kotlin.jvm.internal.f0.S("mb");
            moreButton = null;
        }
        moreButton.setColor(i10);
    }

    @qa.a
    public final void setMoreText(@dl.e String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, bb.c.d.Ic, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        MoreButton moreButton = this.f67146e;
        if (moreButton == null) {
            kotlin.jvm.internal.f0.S("mb");
            moreButton = null;
        }
        moreButton.setText(str);
    }

    @qa.a
    public final void setMoreTextVisible(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.d.Kc, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        MoreButton moreButton = this.f67146e;
        if (moreButton == null) {
            kotlin.jvm.internal.f0.S("mb");
            moreButton = null;
        }
        moreButton.setTextVisible(z10);
    }

    @qa.a
    public final void setTitleColor(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.d.Dc, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        TextView textView = this.f67144c;
        if (textView == null) {
            kotlin.jvm.internal.f0.S("tv_title");
            textView = null;
        }
        textView.setTextColor(i10);
    }

    @qa.a
    public final void setTitleSize(float f10) {
        if (PatchProxy.proxy(new Object[]{new Float(f10)}, this, changeQuickRedirect, false, bb.c.d.Nc, new Class[]{Float.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        TextView textView = this.f67144c;
        if (textView == null) {
            kotlin.jvm.internal.f0.S("tv_title");
            textView = null;
        }
        textView.setTextSize(f10);
    }

    @qa.a
    public final void setTitleText(@dl.e String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, bb.c.d.Gc, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        TextView textView = this.f67144c;
        if (textView == null) {
            kotlin.jvm.internal.f0.S("tv_title");
            textView = null;
        }
        textView.setText(str);
    }

    public final void setTopPadding(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.d.Pc, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        RelativeLayout relativeLayout = this.f67143b;
        RelativeLayout relativeLayout2 = null;
        if (relativeLayout == null) {
            kotlin.jvm.internal.f0.S(com.google.android.exoplayer2.text.ttml.d.W);
            relativeLayout = null;
        }
        if (relativeLayout.getLayoutParams() == null) {
            RelativeLayout relativeLayout3 = this.f67143b;
            if (relativeLayout3 == null) {
                kotlin.jvm.internal.f0.S(com.google.android.exoplayer2.text.ttml.d.W);
                relativeLayout3 = null;
            }
            relativeLayout3.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
        }
        RelativeLayout relativeLayout4 = this.f67143b;
        if (relativeLayout4 == null) {
            kotlin.jvm.internal.f0.S(com.google.android.exoplayer2.text.ttml.d.W);
        } else {
            relativeLayout2 = relativeLayout4;
        }
        ViewGroup.LayoutParams layoutParams = relativeLayout2.getLayoutParams();
        kotlin.jvm.internal.f0.n(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = i10;
    }

    @qa.a(note = "设置顶部空白高度")
    public final void setTopPaddingDp(float f10) {
        if (PatchProxy.proxy(new Object[]{new Float(f10)}, this, changeQuickRedirect, false, bb.c.d.Oc, new Class[]{Float.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        setTopPadding(ViewUtils.f(getContext(), f10));
    }

    public final void setTv_desc(@dl.d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, bb.c.d.Bc, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(textView, "<set-?>");
        this.f67145d = textView;
    }
}
