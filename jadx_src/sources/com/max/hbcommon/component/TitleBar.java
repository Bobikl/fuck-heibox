package com.max.hbcommon.component;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.d1;
import androidx.annotation.e1;
import androidx.appcompat.widget.Toolbar;
import com.flyco.tablayout.SlidingTabLayout;
import com.max.hbcommon.R;
import com.max.hbutils.utils.ViewUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: loaded from: classes9.dex */
public class TitleBar extends Toolbar {
    public static ChangeQuickRedirect changeQuickRedirect;
    protected TextView G2;
    protected ImageView G3;
    protected ImageView J3;
    protected TextView K3;
    protected TextView L3;
    protected ViewGroup M3;
    protected ViewStub N3;
    protected SearchView O3;
    protected LinearLayout P3;
    protected ViewGroup Q3;
    protected SlidingTabLayout R3;
    protected CharSequence S3;
    private LayoutInflater T;
    protected int T3;
    protected RelativeLayout U;
    protected int U3;
    protected TextView V;
    protected CharSequence V3;
    protected ImageView W;
    protected CharSequence W3;
    protected boolean X3;
    protected boolean Y3;
    public boolean Z3;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    protected ImageView f67181a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    protected View f67182b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    protected ImageView f67183c0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    protected ImageView f67184p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    protected TextView f67185p2;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    protected ImageView f67186p3;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    protected ViewGroup f67187x1;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    protected ImageView f67188x2;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    protected ImageView f67189y1;

    /* JADX INFO: renamed from: y2, reason: collision with root package name */
    protected TextView f67190y2;

    public class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.d.f31328jg, new Class[]{View.class}, Void.TYPE).isSupported && (TitleBar.this.getContext() instanceof Activity)) {
                TitleBar titleBar = TitleBar.this;
                if (titleBar.Y3) {
                    ((Activity) titleBar.getContext()).onBackPressed();
                } else {
                    ((Activity) titleBar.getContext()).finish();
                }
            }
        }
    }

    public class b implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.d.f31351kg, new Class[]{View.class}, Void.TYPE).isSupported && (TitleBar.this.getContext() instanceof Activity)) {
                ob.a aVar = ob.a.f132240a;
                ob.a.l().k(TitleBar.this.getContext(), lb.d.f131153e4);
            }
        }
    }

    public TitleBar(Context context) {
        super(context);
        this.X3 = false;
        this.Y3 = false;
        this.Z3 = false;
        W(context);
    }

    public TitleBar(Context context, @androidx.annotation.p0 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.X3 = false;
        this.Y3 = false;
        this.Z3 = false;
        W(context);
    }

    public TitleBar(Context context, @androidx.annotation.p0 AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.X3 = false;
        this.Y3 = false;
        this.Z3 = false;
        W(context);
    }

    public static ImageView Q(Context context, @androidx.annotation.l int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, new Integer(i10)}, null, changeQuickRedirect, true, bb.c.d.Ze, new Class[]{Context.class, Integer.TYPE}, ImageView.class);
        if (patchProxyResultProxy.isSupported) {
            return (ImageView) patchProxyResultProxy.result;
        }
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.common_bottom_logo_51x18);
        imageView.setColorFilter(i10);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setLayoutParams(new ViewGroup.LayoutParams(ViewUtils.f(context, 54.0f), ViewUtils.f(context, 16.0f)));
        return imageView;
    }

    public static ImageView R(Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, bb.c.d.Ye, new Class[]{Context.class}, ImageView.class);
        if (patchProxyResultProxy.isSupported) {
            return (ImageView) patchProxyResultProxy.result;
        }
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.common_max_bottom_logo_62x16);
        imageView.setLayoutParams(new ViewGroup.LayoutParams(ViewUtils.f(context, 62.0f), ViewUtils.f(context, 16.0f)));
        return imageView;
    }

    private void S(Context context) {
        if (PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, bb.c.d.f31142bf, new Class[]{Context.class}, Void.TYPE).isSupported) {
            return;
        }
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        this.T = layoutInflaterFrom;
        RelativeLayout relativeLayout = (RelativeLayout) layoutInflaterFrom.inflate(R.layout.title_bar_default, (ViewGroup) null);
        this.U = relativeLayout;
        addView(relativeLayout);
        this.V = (TextView) findViewById(R.id.tv_appbar_title);
        this.W = (ImageView) findViewById(R.id.iv_appbar_logo);
        this.f67181a0 = (ImageView) findViewById(R.id.iv_appbar_nav_button);
        this.f67182b0 = findViewById(R.id.iv_new_msg);
        this.f67183c0 = (ImageView) findViewById(R.id.iv_appbar_left_action_button);
        this.f67184p1 = (ImageView) findViewById(R.id.iv_appbar_left_action_button_x);
        this.f67187x1 = (ViewGroup) findViewById(R.id.vg_appbar_left_action_button_y);
        this.f67189y1 = (ImageView) findViewById(R.id.iv_appbar_left_action_button_y);
        this.f67185p2 = (TextView) findViewById(R.id.tv_appbar_left_action_button_y);
        this.f67188x2 = (ImageView) findViewById(R.id.iv_appbar_left_action_button_y_arrow);
        this.f67190y2 = (TextView) findViewById(R.id.tv_appbar_left_action);
        this.G2 = (TextView) findViewById(R.id.tv_appbar_left_action_x);
        this.f67186p3 = (ImageView) findViewById(R.id.iv_appbar_action_button);
        this.G3 = (ImageView) findViewById(R.id.iv_appbar_action_button_x);
        this.J3 = (ImageView) findViewById(R.id.iv_appbar_action_button_more);
        this.K3 = (TextView) findViewById(R.id.tv_appbar_action);
        this.L3 = (TextView) findViewById(R.id.tv_appbar_action_x);
        this.M3 = (ViewGroup) findViewById(R.id.vg_action_x);
        this.N3 = (ViewStub) findViewById(R.id.vs_tab_layout);
        this.O3 = (SearchView) findViewById(R.id.vg_search);
        this.P3 = (LinearLayout) findViewById(R.id.ll_content);
        this.Q3 = (ViewGroup) findViewById(R.id.button_right);
        setContentInsetsAbsolute(0, 0);
    }

    private void X() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.f31304ig, new Class[0], Void.TYPE).isSupported || !this.Z3 || this.R3 == null) {
            return;
        }
        int iE = androidx.core.content.res.i.e(getResources(), R.color.white, null);
        this.R3.setTextSelectColor(iE);
        this.R3.setTextUnselectColor(androidx.core.content.res.i.e(getResources(), R.color.white_alpha60, null));
        this.R3.setIndicatorColor(iE);
    }

    public void O() {
        TextView textView;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.Ef, new Class[0], Void.TYPE).isSupported || (textView = this.K3) == null) {
            return;
        }
        textView.setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71895c));
    }

    public void P() {
        TextView textView;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.f31189df, new Class[0], Void.TYPE).isSupported || (textView = this.V) == null) {
            return;
        }
        textView.setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71895c));
    }

    public void T() {
        View viewFindViewById;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.Yf, new Class[0], Void.TYPE).isSupported || (viewFindViewById = findViewById(R.id.iv_action_point)) == null) {
            return;
        }
        viewFindViewById.setVisibility(8);
    }

    public void U() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.Vf, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.Q3.setVisibility(8);
    }

    public View V(int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.d.Tf, new Class[]{Integer.TYPE}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        this.N3.setLayoutResource(i10);
        return this.N3.inflate();
    }

    public void W(Context context) {
        if (PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, bb.c.d.f31119af, new Class[]{Context.class}, Void.TYPE).isSupported) {
            return;
        }
        S(context);
    }

    public void Y() {
        View viewFindViewById;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.Xf, new Class[0], Void.TYPE).isSupported || (viewFindViewById = findViewById(R.id.iv_action_point)) == null) {
            return;
        }
        viewFindViewById.setVisibility(0);
    }

    public void Z() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.Uf, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        ImageView imageView = this.W;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        TextView textView = this.V;
        if (textView != null) {
            textView.setVisibility(8);
        }
        if (getVisibility() != 0) {
            setVisibility(0);
        }
    }

    public void a0() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.Wf, new Class[0], Void.TYPE).isSupported || this.X3) {
            return;
        }
        setNavigationIcon(R.drawable.appbar_back);
        ImageView imageView = this.f67181a0;
        if (imageView != null) {
            imageView.setPadding(ViewUtils.f(getContext(), 10.0f), 0, ViewUtils.f(getContext(), 10.0f), 0);
            this.f67181a0.setOnClickListener(new a());
        }
    }

    public void b0() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.f31120ag, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setActionIcon(R.drawable.common_set);
        ImageView imageView = this.f67186p3;
        if (imageView != null) {
            imageView.setOnClickListener(new b());
        }
    }

    public void c0() {
        TextView textView;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.Ff, new Class[0], Void.TYPE).isSupported || (textView = this.K3) == null) {
            return;
        }
        textView.setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71894b));
    }

    public void d0() {
        TextView textView;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.f31212ef, new Class[0], Void.TYPE).isSupported || (textView = this.V) == null) {
            return;
        }
        textView.setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71894b));
    }

    public CharSequence getAction() {
        return this.V3;
    }

    public CharSequence getActionX() {
        return this.W3;
    }

    public ImageView getAppbarActionButtonMoreView() {
        return this.J3;
    }

    public ImageView getAppbarActionButtonView() {
        return this.f67186p3;
    }

    public ImageView getAppbarActionButtonXView() {
        return this.G3;
    }

    public TextView getAppbarActionTextView() {
        return this.K3;
    }

    public TextView getAppbarActionXTextView() {
        return this.L3;
    }

    public ImageView getAppbarLeftActionButtonView() {
        return this.f67183c0;
    }

    public ImageView getAppbarLeftActionButtonXView() {
        return this.f67184p1;
    }

    public ImageView getAppbarLeftActionButtonYView() {
        return this.f67189y1;
    }

    public ImageView getAppbarLeftActionTextYArrowView() {
        return this.f67188x2;
    }

    public TextView getAppbarLeftActionTextYView() {
        return this.f67185p2;
    }

    public ViewGroup getAppbarLeftActionVgYView() {
        return this.f67187x1;
    }

    public ImageView getAppbarNavButtonView() {
        return this.f67181a0;
    }

    public TextView getAppbarTitleTextView() {
        return this.V;
    }

    public ViewGroup getButtonRight() {
        return this.Q3;
    }

    public RelativeLayout getCustomLayout() {
        return this.U;
    }

    @Override // androidx.appcompat.widget.Toolbar
    @androidx.annotation.p0
    public CharSequence getNavigationContentDescription() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.f3if, new Class[0], CharSequence.class);
        if (patchProxyResultProxy.isSupported) {
            return (CharSequence) patchProxyResultProxy.result;
        }
        ImageView imageView = this.f67181a0;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public EditText getSearchEditText() {
        return this.O3.f67174d;
    }

    public SearchView getSearchView() {
        return this.O3;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public CharSequence getTitle() {
        return this.S3;
    }

    public SlidingTabLayout getTitleTabLayout() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.Sf, new Class[0], SlidingTabLayout.class);
        if (patchProxyResultProxy.isSupported) {
            return (SlidingTabLayout) patchProxyResultProxy.result;
        }
        if (this.R3 == null) {
            this.N3.setLayoutResource(R.layout.layout_title_tab_layout);
            this.R3 = (SlidingTabLayout) this.N3.inflate().findViewById(R.id.tab_title);
            X();
        }
        return this.R3;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public void setAction(@d1 int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.d.Jf, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        setAction(getContext().getText(i10));
    }

    public void setAction(CharSequence charSequence) {
        if (PatchProxy.proxy(new Object[]{charSequence}, this, changeQuickRedirect, false, bb.c.d.Gf, new Class[]{CharSequence.class}, Void.TYPE).isSupported) {
            return;
        }
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.K3;
            if (textView != null) {
                textView.setVisibility(8);
            }
        } else {
            TextView textView2 = this.K3;
            if (textView2 != null) {
                textView2.setText(charSequence);
                this.K3.setVisibility(0);
            }
        }
        this.V3 = charSequence;
    }

    public void setActionEnabled(boolean z10) {
        TextView textView;
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.d.Hf, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported || (textView = this.K3) == null) {
            return;
        }
        textView.setEnabled(z10);
    }

    public void setActionIcon(@androidx.annotation.v int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.d.f31576uf, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        setActionIcon(b0.a.b(getContext(), i10));
    }

    public void setActionIcon(@androidx.annotation.p0 Drawable drawable) {
        if (PatchProxy.proxy(new Object[]{drawable}, this, changeQuickRedirect, false, bb.c.d.f31598vf, new Class[]{Drawable.class}, Void.TYPE).isSupported) {
            return;
        }
        setActionIcon(this.f67186p3, drawable);
    }

    public void setActionIcon(ImageView imageView, @androidx.annotation.p0 Drawable drawable) {
        ImageView imageView2;
        if (PatchProxy.proxy(new Object[]{imageView, drawable}, this, changeQuickRedirect, false, bb.c.d.f31686zf, new Class[]{ImageView.class, Drawable.class}, Void.TYPE).isSupported) {
            return;
        }
        if (drawable != null) {
            if (imageView != null) {
                imageView.setImageDrawable(drawable);
                imageView.setVisibility(0);
            }
        } else if (imageView != null) {
            imageView.setVisibility(8);
        }
        if ((imageView == this.f67183c0 || imageView == this.f67184p1) && (imageView2 = this.f67181a0) != null) {
            imageView2.setVisibility(8);
        }
        if (getVisibility() != 0) {
            setVisibility(0);
        }
    }

    public void setActionIconOnClickListener(View.OnClickListener onClickListener) {
        ImageView imageView;
        if (PatchProxy.proxy(new Object[]{onClickListener}, this, changeQuickRedirect, false, bb.c.d.f31620wf, new Class[]{View.OnClickListener.class}, Void.TYPE).isSupported || (imageView = this.f67186p3) == null) {
            return;
        }
        imageView.setOnClickListener(onClickListener);
    }

    public void setActionMoreIcon(@androidx.annotation.v int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.d.Bf, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        setActionMoreIcon(b0.a.b(getContext(), i10));
    }

    public void setActionMoreIcon(@androidx.annotation.p0 Drawable drawable) {
        if (PatchProxy.proxy(new Object[]{drawable}, this, changeQuickRedirect, false, bb.c.d.Cf, new Class[]{Drawable.class}, Void.TYPE).isSupported) {
            return;
        }
        if (drawable != null) {
            ImageView imageView = this.J3;
            if (imageView != null) {
                imageView.setImageDrawable(drawable);
                this.J3.setVisibility(0);
            }
        } else {
            ImageView imageView2 = this.J3;
            if (imageView2 != null) {
                imageView2.setVisibility(8);
            }
        }
        if (getVisibility() != 0) {
            setVisibility(0);
        }
    }

    public void setActionMoreIconOnClickListener(View.OnClickListener onClickListener) {
        ImageView imageView;
        if (PatchProxy.proxy(new Object[]{onClickListener}, this, changeQuickRedirect, false, bb.c.d.Df, new Class[]{View.OnClickListener.class}, Void.TYPE).isSupported || (imageView = this.J3) == null) {
            return;
        }
        imageView.setOnClickListener(onClickListener);
    }

    public void setActionOnClickListener(View.OnClickListener onClickListener) {
        TextView textView;
        if (PatchProxy.proxy(new Object[]{onClickListener}, this, changeQuickRedirect, false, bb.c.d.If, new Class[]{View.OnClickListener.class}, Void.TYPE).isSupported || (textView = this.K3) == null) {
            return;
        }
        textView.setOnClickListener(onClickListener);
    }

    public void setActionTextAppearance(Context context, @e1 int i10) {
        TextView textView;
        if (PatchProxy.proxy(new Object[]{context, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.d.Kf, new Class[]{Context.class, Integer.TYPE}, Void.TYPE).isSupported || (textView = this.K3) == null) {
            return;
        }
        textView.setTextAppearance(context, i10);
    }

    public void setActionTextColor(@androidx.annotation.l int i10) {
        TextView textView;
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.d.Lf, new Class[]{Integer.TYPE}, Void.TYPE).isSupported || (textView = this.K3) == null) {
            return;
        }
        textView.setTextColor(i10);
    }

    public void setActionX(@d1 int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.d.Pf, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        setActionX(getContext().getText(i10));
    }

    public void setActionX(CharSequence charSequence) {
        if (PatchProxy.proxy(new Object[]{charSequence}, this, changeQuickRedirect, false, bb.c.d.Mf, new Class[]{CharSequence.class}, Void.TYPE).isSupported) {
            return;
        }
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.L3;
            if (textView != null) {
                textView.setVisibility(8);
            }
        } else {
            TextView textView2 = this.L3;
            if (textView2 != null) {
                textView2.setText(charSequence);
                this.L3.setVisibility(0);
            }
        }
        this.W3 = charSequence;
    }

    public void setActionXEnabled(boolean z10) {
        TextView textView;
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.d.Nf, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported || (textView = this.L3) == null) {
            return;
        }
        textView.setEnabled(z10);
    }

    public void setActionXIcon(@androidx.annotation.v int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.d.f31642xf, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        setActionXIcon(b0.a.b(getContext(), i10));
    }

    public void setActionXIcon(@androidx.annotation.p0 Drawable drawable) {
        if (PatchProxy.proxy(new Object[]{drawable}, this, changeQuickRedirect, false, bb.c.d.f31664yf, new Class[]{Drawable.class}, Void.TYPE).isSupported) {
            return;
        }
        setActionIcon(this.G3, drawable);
    }

    public void setActionXIconOnClickListener(View.OnClickListener onClickListener) {
        ImageView imageView;
        if (PatchProxy.proxy(new Object[]{onClickListener}, this, changeQuickRedirect, false, bb.c.d.Af, new Class[]{View.OnClickListener.class}, Void.TYPE).isSupported || (imageView = this.G3) == null) {
            return;
        }
        imageView.setOnClickListener(onClickListener);
    }

    public void setActionXOnClickListener(View.OnClickListener onClickListener) {
        TextView textView;
        if (PatchProxy.proxy(new Object[]{onClickListener}, this, changeQuickRedirect, false, bb.c.d.Of, new Class[]{View.OnClickListener.class}, Void.TYPE).isSupported || (textView = this.L3) == null) {
            return;
        }
        textView.setOnClickListener(onClickListener);
    }

    public void setActionXTextAppearance(Context context, @e1 int i10) {
        TextView textView;
        if (PatchProxy.proxy(new Object[]{context, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.d.Qf, new Class[]{Context.class, Integer.TYPE}, Void.TYPE).isSupported || (textView = this.L3) == null) {
            return;
        }
        textView.setTextAppearance(context, i10);
    }

    public void setActionXTextColor(@androidx.annotation.l int i10) {
        TextView textView;
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.d.Rf, new Class[]{Integer.TYPE}, Void.TYPE).isSupported || (textView = this.L3) == null) {
            return;
        }
        textView.setTextColor(i10);
    }

    public void setActionXView(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.d.Zf, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        this.M3.addView(view);
    }

    public void setBackIconInvisible() {
        this.X3 = true;
    }

    public void setContentView(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.d.f31143bg, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        setContentView(view, 17);
    }

    public void setContentView(View view, int i10) {
        LinearLayout linearLayout;
        if (PatchProxy.proxy(new Object[]{view, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.d.f31166cg, new Class[]{View.class, Integer.TYPE}, Void.TYPE).isSupported || view == null || (linearLayout = this.P3) == null) {
            return;
        }
        linearLayout.removeAllViews();
        this.P3.setGravity(i10);
        this.P3.addView(view);
        this.P3.setVisibility(0);
        if (getVisibility() != 0) {
            setVisibility(0);
        }
        TextView textView = this.V;
        if (textView != null) {
            textView.setVisibility(8);
        }
        ImageView imageView = this.f67181a0;
        if (imageView == null || imageView.getVisibility() == 0) {
            return;
        }
        a0();
    }

    public void setInStack() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.f31190dg, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setInStack(Boolean.TRUE);
    }

    public void setInStack(Boolean bool) {
        if (PatchProxy.proxy(new Object[]{bool}, this, changeQuickRedirect, false, bb.c.d.f31213eg, new Class[]{Boolean.class}, Void.TYPE).isSupported) {
            return;
        }
        this.Y3 = bool.booleanValue();
    }

    public void setLeftActionIcon(@androidx.annotation.v int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.d.f31442of, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        setLeftActionIcon(b0.a.b(getContext(), i10));
    }

    public void setLeftActionIcon(@androidx.annotation.p0 Drawable drawable) {
        if (PatchProxy.proxy(new Object[]{drawable}, this, changeQuickRedirect, false, bb.c.d.f31465pf, new Class[]{Drawable.class}, Void.TYPE).isSupported) {
            return;
        }
        setActionIcon(this.f67183c0, drawable);
    }

    public void setLeftActionIconOnClickListener(View.OnClickListener onClickListener) {
        ImageView imageView;
        if (PatchProxy.proxy(new Object[]{onClickListener}, this, changeQuickRedirect, false, bb.c.d.f31488qf, new Class[]{View.OnClickListener.class}, Void.TYPE).isSupported || (imageView = this.f67183c0) == null) {
            return;
        }
        imageView.setOnClickListener(onClickListener);
    }

    public void setLeftActionXIcon(@androidx.annotation.v int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.d.f31510rf, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        setLeftActionXIcon(b0.a.b(getContext(), i10));
    }

    public void setLeftActionXIcon(@androidx.annotation.p0 Drawable drawable) {
        if (PatchProxy.proxy(new Object[]{drawable}, this, changeQuickRedirect, false, bb.c.d.f31532sf, new Class[]{Drawable.class}, Void.TYPE).isSupported) {
            return;
        }
        setActionIcon(this.f67184p1, drawable);
    }

    public void setLeftActionXIconOnClickListener(View.OnClickListener onClickListener) {
        ImageView imageView;
        if (PatchProxy.proxy(new Object[]{onClickListener}, this, changeQuickRedirect, false, bb.c.d.f31554tf, new Class[]{View.OnClickListener.class}, Void.TYPE).isSupported || (imageView = this.f67184p1) == null) {
            return;
        }
        imageView.setOnClickListener(onClickListener);
    }

    public void setMaxStyle(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.d.f31236fg, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.Z3 = true;
        setBackgroundResource(R.color.max_main_color);
        setThemeColor(androidx.core.content.res.i.e(getResources(), R.color.white, null));
        X();
        this.O3.setMaxStyle();
        if (z10) {
            setContentView(R(getContext()));
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationContentDescription(@d1 int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.d.f31327jf, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        setNavigationContentDescription(i10 != 0 ? getContext().getText(i10) : null);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationContentDescription(@androidx.annotation.p0 CharSequence charSequence) {
        ImageView imageView;
        if (PatchProxy.proxy(new Object[]{charSequence}, this, changeQuickRedirect, false, bb.c.d.f31350kf, new Class[]{CharSequence.class}, Void.TYPE).isSupported || (imageView = this.f67181a0) == null) {
            return;
        }
        imageView.setContentDescription(charSequence);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(@androidx.annotation.v int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.d.f31373lf, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        setNavigationIcon(b0.a.b(getContext(), i10));
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(@androidx.annotation.p0 Drawable drawable) {
        if (PatchProxy.proxy(new Object[]{drawable}, this, changeQuickRedirect, false, bb.c.d.f31396mf, new Class[]{Drawable.class}, Void.TYPE).isSupported) {
            return;
        }
        if (drawable != null) {
            ImageView imageView = this.f67181a0;
            if (imageView != null) {
                imageView.setImageDrawable(drawable);
                this.f67181a0.setVisibility(0);
            }
        } else {
            ImageView imageView2 = this.f67181a0;
            if (imageView2 != null) {
                imageView2.setVisibility(8);
            }
        }
        ImageView imageView3 = this.f67183c0;
        if (imageView3 != null) {
            imageView3.setVisibility(8);
        }
        ImageView imageView4 = this.f67184p1;
        if (imageView4 != null) {
            imageView4.setVisibility(8);
        }
        if (getVisibility() != 0) {
            setVisibility(0);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        if (PatchProxy.proxy(new Object[]{onClickListener}, this, changeQuickRedirect, false, bb.c.d.f31419nf, new Class[]{View.OnClickListener.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f67181a0.setOnClickListener(onClickListener);
    }

    public void setPureLightStyle() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.f31259gg, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.Z3 = true;
        setThemeColor(androidx.core.content.res.i.e(getResources(), R.color.white, null));
        X();
    }

    public void setThemeColor(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.d.f31282hg, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f67181a0.setColorFilter(i10);
        this.f67186p3.setColorFilter(i10);
        this.G3.setColorFilter(i10);
        this.J3.setColorFilter(i10);
        this.f67183c0.setColorFilter(i10);
        this.f67184p1.setColorFilter(i10);
        this.K3.setTextColor(i10);
        this.L3.setTextColor(i10);
        this.V.setTextColor(i10);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(@d1 int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.d.f31235ff, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        setTitle(getContext().getText(i10));
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
        if (PatchProxy.proxy(new Object[]{charSequence}, this, changeQuickRedirect, false, bb.c.d.f31165cf, new Class[]{CharSequence.class}, Void.TYPE).isSupported) {
            return;
        }
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.V;
            if (textView != null) {
                textView.setVisibility(8);
            }
        } else {
            TextView textView2 = this.V;
            if (textView2 != null) {
                textView2.setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71895c));
                this.V.setText(charSequence);
                this.V.setVisibility(0);
            }
        }
        this.S3 = charSequence;
        if (getVisibility() != 0) {
            setVisibility(0);
        }
        ImageView imageView = this.f67181a0;
        if (imageView == null || imageView.getVisibility() == 0) {
            return;
        }
        a0();
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitleTextAppearance(Context context, @e1 int i10) {
        if (PatchProxy.proxy(new Object[]{context, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.d.f31258gf, new Class[]{Context.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.T3 = i10;
        TextView textView = this.V;
        if (textView != null) {
            textView.setTextAppearance(context, i10);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitleTextColor(@androidx.annotation.l int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.d.f31281hf, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.U3 = i10;
        TextView textView = this.V;
        if (textView != null) {
            textView.setTextColor(i10);
        }
    }
}
