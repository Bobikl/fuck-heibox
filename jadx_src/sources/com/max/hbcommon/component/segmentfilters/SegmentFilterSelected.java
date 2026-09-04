package com.max.hbcommon.component.segmentfilters;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.max.hbcommon.R;
import com.max.hbutils.utils.ViewUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: SegmentFilterSelected.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class SegmentFilterSelected extends RelativeLayout {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.d
    public static final a f67864h = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final float f67865i = 8.0f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final float f67866j = 24.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private RelativeLayout f67867b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private LinearLayout f67868c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private HorizontalScrollView f67869d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private TextView f67870e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private View f67871f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f67872g;

    /* JADX INFO: compiled from: SegmentFilterSelected.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }
    }

    public SegmentFilterSelected(@dl.e Context context) {
        this(context, null);
    }

    public SegmentFilterSelected(@dl.e Context context, @dl.e AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SegmentFilterSelected(@dl.e Context context, @dl.e AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public SegmentFilterSelected(@dl.e Context context, @dl.e AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f67872g = 6.0f;
        h(attributeSet);
    }

    public static /* synthetic */ void f(SegmentFilterSelected segmentFilterSelected, String str, View.OnClickListener onClickListener, boolean z10, int i10, Object obj) {
        if (PatchProxy.proxy(new Object[]{segmentFilterSelected, str, onClickListener, new Byte(z10 ? (byte) 1 : (byte) 0), new Integer(i10), obj}, null, changeQuickRedirect, true, bb.c.e.I3, new Class[]{SegmentFilterSelected.class, String.class, View.OnClickListener.class, Boolean.TYPE, Integer.TYPE, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        segmentFilterSelected.e(str, onClickListener, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(ImageView imageView, View view, SegmentFilterSelected this$0, View.OnClickListener onClickListener, View view2) {
        if (PatchProxy.proxy(new Object[]{imageView, view, this$0, onClickListener, view2}, null, changeQuickRedirect, true, bb.c.e.P3, new Class[]{ImageView.class, View.class, SegmentFilterSelected.class, View.OnClickListener.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(this$0, "this$0");
        if (imageView.getVisibility() == 0) {
            LinearLayout linearLayout = null;
            ViewParent parent = view != null ? view.getParent() : null;
            LinearLayout linearLayout2 = this$0.f67868c;
            if (linearLayout2 == null) {
                f0.S("vg_checked_filter");
                linearLayout2 = null;
            }
            if (f0.g(parent, linearLayout2)) {
                LinearLayout linearLayout3 = this$0.f67868c;
                if (linearLayout3 == null) {
                    f0.S("vg_checked_filter");
                } else {
                    linearLayout = linearLayout3;
                }
                linearLayout.removeView(view);
                this$0.j();
            }
        }
        if (onClickListener != null) {
            onClickListener.onClick(view2);
        }
    }

    private final void h(AttributeSet attributeSet) {
        if (PatchProxy.proxy(new Object[]{attributeSet}, this, changeQuickRedirect, false, bb.c.e.E3, new Class[]{AttributeSet.class}, Void.TYPE).isSupported) {
            return;
        }
        RelativeLayout relativeLayout = null;
        View viewInflate = View.inflate(getContext(), R.layout.view_segment_filter_selected, null);
        f0.n(viewInflate, "null cannot be cast to non-null type android.widget.RelativeLayout");
        RelativeLayout relativeLayout2 = (RelativeLayout) viewInflate;
        this.f67867b = relativeLayout2;
        if (relativeLayout2 == null) {
            f0.S("content");
            relativeLayout2 = null;
        }
        addView(relativeLayout2);
        RelativeLayout relativeLayout3 = this.f67867b;
        if (relativeLayout3 == null) {
            f0.S("content");
        } else {
            relativeLayout = relativeLayout3;
        }
        relativeLayout.getLayoutParams().height = ViewUtils.f(getContext(), 24.0f);
        View viewFindViewById = findViewById(R.id.vg_checked_filter);
        f0.o(viewFindViewById, "findViewById(...)");
        this.f67868c = (LinearLayout) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.hsv_checked_filter);
        f0.o(viewFindViewById2, "findViewById(...)");
        this.f67869d = (HorizontalScrollView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.tv_reset_btn);
        f0.o(viewFindViewById3, "findViewById(...)");
        this.f67870e = (TextView) viewFindViewById3;
        View viewFindViewById4 = findViewById(R.id.v_shadow);
        f0.o(viewFindViewById4, "findViewById(...)");
        this.f67871f = viewFindViewById4;
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.P3);
        f0.o(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        int dimension = (int) typedArrayObtainStyledAttributes.getDimension(R.styleable.VerSpace_topSpace, ViewUtils.f(getContext(), 8.0f));
        int dimension2 = (int) typedArrayObtainStyledAttributes.getDimension(R.styleable.VerSpace_bottomSpace, ViewUtils.f(getContext(), 8.0f));
        setTopPadding(dimension);
        setBottomPadding(dimension2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(SegmentFilterSelected this$0) {
        if (PatchProxy.proxy(new Object[]{this$0}, null, changeQuickRedirect, true, bb.c.e.R3, new Class[]{SegmentFilterSelected.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(this$0, "this$0");
        LinearLayout linearLayout = this$0.f67868c;
        View view = null;
        if (linearLayout == null) {
            f0.S("vg_checked_filter");
            linearLayout = null;
        }
        int iW = ViewUtils.W(linearLayout);
        HorizontalScrollView horizontalScrollView = this$0.f67869d;
        if (horizontalScrollView == null) {
            f0.S("hsv_checked_filter");
            horizontalScrollView = null;
        }
        if (iW > ViewUtils.W(horizontalScrollView)) {
            View view2 = this$0.f67871f;
            if (view2 == null) {
                f0.S("v_shadow");
            } else {
                view = view2;
            }
            view.setVisibility(0);
            return;
        }
        View view3 = this$0.f67871f;
        if (view3 == null) {
            f0.S("v_shadow");
        } else {
            view = view3;
        }
        view.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(SegmentFilterSelected this$0, View.OnClickListener onClickListener, View view) {
        if (PatchProxy.proxy(new Object[]{this$0, onClickListener, view}, null, changeQuickRedirect, true, bb.c.e.Q3, new Class[]{SegmentFilterSelected.class, View.OnClickListener.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(this$0, "this$0");
        this$0.j();
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }

    @qa.a(note = "添加一个item")
    public final void d(@dl.e String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, bb.c.e.G3, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        e(str, null, true);
    }

    public final void e(@dl.e String str, @dl.e final View.OnClickListener onClickListener, boolean z10) {
        if (PatchProxy.proxy(new Object[]{str, onClickListener, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.e.H3, new Class[]{String.class, View.OnClickListener.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        int i10 = R.layout.item_segment_filter_selected;
        LinearLayout linearLayout = this.f67868c;
        LinearLayout linearLayout2 = null;
        if (linearLayout == null) {
            f0.S("vg_checked_filter");
            linearLayout = null;
        }
        final View viewInflate = layoutInflaterFrom.inflate(i10, (ViewGroup) linearLayout, false);
        TextView textView = (TextView) viewInflate.findViewById(R.id.tv_filter_name);
        final ImageView imageView = (ImageView) viewInflate.findViewById(R.id.iv_cancel);
        LinearLayout linearLayout3 = this.f67868c;
        if (linearLayout3 == null) {
            f0.S("vg_checked_filter");
            linearLayout3 = null;
        }
        if (linearLayout3.getChildCount() > 0) {
            ViewGroup.LayoutParams layoutParams = viewInflate.getLayoutParams();
            f0.n(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = ViewUtils.f(getContext(), this.f67872g);
        }
        textView.setText(str);
        imageView.setVisibility(z10 ? 0 : 8);
        viewInflate.setOnClickListener(new View.OnClickListener() { // from class: com.max.hbcommon.component.segmentfilters.r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SegmentFilterSelected.g(imageView, viewInflate, this, onClickListener, view);
            }
        });
        LinearLayout linearLayout4 = this.f67868c;
        if (linearLayout4 == null) {
            f0.S("vg_checked_filter");
        } else {
            linearLayout2 = linearLayout4;
        }
        linearLayout2.addView(viewInflate);
        viewInflate.getLayoutParams().height = ViewUtils.f(getContext(), 24.0f);
        j();
    }

    public final float getSpaceDp() {
        return this.f67872g;
    }

    public final void i() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.e.F3, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        LinearLayout linearLayout = this.f67868c;
        if (linearLayout == null) {
            f0.S("vg_checked_filter");
            linearLayout = null;
        }
        linearLayout.removeAllViews();
    }

    public final void j() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.e.K3, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        LinearLayout linearLayout = this.f67868c;
        LinearLayout linearLayout2 = null;
        if (linearLayout == null) {
            f0.S("vg_checked_filter");
            linearLayout = null;
        }
        if (linearLayout.getChildCount() <= 0) {
            setVisibility(8);
            return;
        }
        LinearLayout linearLayout3 = this.f67868c;
        if (linearLayout3 == null) {
            f0.S("vg_checked_filter");
        } else {
            linearLayout2 = linearLayout3;
        }
        linearLayout2.post(new Runnable() { // from class: com.max.hbcommon.component.segmentfilters.p
            @Override // java.lang.Runnable
            public final void run() {
                SegmentFilterSelected.k(this.f67910b);
            }
        });
        setVisibility(0);
    }

    public final void setBottomPadding(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.e.O3, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        RelativeLayout relativeLayout = this.f67867b;
        RelativeLayout relativeLayout2 = null;
        if (relativeLayout == null) {
            f0.S("content");
            relativeLayout = null;
        }
        if (relativeLayout.getLayoutParams() == null) {
            RelativeLayout relativeLayout3 = this.f67867b;
            if (relativeLayout3 == null) {
                f0.S("content");
                relativeLayout3 = null;
            }
            relativeLayout3.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
        }
        RelativeLayout relativeLayout4 = this.f67867b;
        if (relativeLayout4 == null) {
            f0.S("content");
        } else {
            relativeLayout2 = relativeLayout4;
        }
        ViewGroup.LayoutParams layoutParams = relativeLayout2.getLayoutParams();
        f0.n(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = i10;
    }

    @qa.a(note = "设置底部空白高度")
    public final void setBottomPaddingDp(float f10) {
        if (PatchProxy.proxy(new Object[]{new Float(f10)}, this, changeQuickRedirect, false, bb.c.e.N3, new Class[]{Float.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        setTopPadding(ViewUtils.f(getContext(), f10));
    }

    public final void setResetClickListener(@dl.e final View.OnClickListener onClickListener) {
        if (PatchProxy.proxy(new Object[]{onClickListener}, this, changeQuickRedirect, false, bb.c.e.J3, new Class[]{View.OnClickListener.class}, Void.TYPE).isSupported) {
            return;
        }
        TextView textView = this.f67870e;
        if (textView == null) {
            f0.S("tv_reset_btn");
            textView = null;
        }
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.max.hbcommon.component.segmentfilters.q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SegmentFilterSelected.l(this.f67911b, onClickListener, view);
            }
        });
    }

    public final void setSpaceDp(float f10) {
        this.f67872g = f10;
    }

    public final void setTopPadding(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.e.M3, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        RelativeLayout relativeLayout = this.f67867b;
        RelativeLayout relativeLayout2 = null;
        if (relativeLayout == null) {
            f0.S("content");
            relativeLayout = null;
        }
        if (relativeLayout.getLayoutParams() == null) {
            RelativeLayout relativeLayout3 = this.f67867b;
            if (relativeLayout3 == null) {
                f0.S("content");
                relativeLayout3 = null;
            }
            relativeLayout3.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
        }
        RelativeLayout relativeLayout4 = this.f67867b;
        if (relativeLayout4 == null) {
            f0.S("content");
        } else {
            relativeLayout2 = relativeLayout4;
        }
        ViewGroup.LayoutParams layoutParams = relativeLayout2.getLayoutParams();
        f0.n(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = i10;
    }

    @qa.a(note = "设置顶部空白高度")
    public final void setTopPaddingDp(float f10) {
        if (PatchProxy.proxy(new Object[]{new Float(f10)}, this, changeQuickRedirect, false, bb.c.e.L3, new Class[]{Float.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        setTopPadding(ViewUtils.f(getContext(), f10));
    }
}
