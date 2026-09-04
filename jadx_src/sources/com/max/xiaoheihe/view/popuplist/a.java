package com.max.xiaoheihe.view.popuplist;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbcommon.base.adapter.s;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.List;

/* JADX INFO: compiled from: PopupList.java */
/* JADX INFO: loaded from: classes13.dex */
public class a {
    public static final float J = 12.0f;
    public static final float K = 10.0f;
    public static final float L = 5.0f;
    public static final float M = 10.0f;
    public static final float N = 5.0f;
    public static final int Q = 4;
    public static final float S = 0.5f;
    public static final float T = 16.0f;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f96003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private PopupWindow f96004b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private View f96005c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private View f96006d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private View f96007e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private View f96008f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private List<String> f96009g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private h f96010h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f96011i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f96012j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f96013k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private StateListDrawable f96014l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private StateListDrawable f96015m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private StateListDrawable f96016n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private ColorStateList f96017o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private GradientDrawable f96018p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f96019q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f96020r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f96021s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f96022t;
    public static final int H = com.max.xiaoheihe.utils.d.E(R.color.text_secondary_2_color);
    public static final int I = com.max.xiaoheihe.utils.d.E(R.color.text_secondary_2_color);
    public static final int O = com.max.xiaoheihe.utils.d.E(R.color.popup_list_bg);
    public static final int P = com.max.xiaoheihe.utils.d.E(R.color.popup_list_pressed_bg);
    public static final int R = com.max.xiaoheihe.utils.d.E(R.color.background_layer_2_color_alpha70);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f96023u = H;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f96024v = I;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private float f96025w = 12.0f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f96026x = r(10.0f);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f96027y = r(5.0f);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f96028z = r(10.0f);
    private int A = r(5.0f);
    private int B = O;
    private int C = P;
    private int D = r(4.0f);
    private int E = R;
    private int F = r(0.5f);
    private int G = r(16.0f);

    /* JADX INFO: renamed from: com.max.xiaoheihe.view.popuplist.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: PopupList.java */
    public class ViewOnTouchListenerC0908a implements View.OnTouchListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        ViewOnTouchListenerC0908a() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view, motionEvent}, this, changeQuickRedirect, false, 49596, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            a.this.f96012j = motionEvent.getX();
            a.this.f96013k = motionEvent.getY();
            return false;
        }
    }

    /* JADX INFO: compiled from: PopupList.java */
    public class b implements AdapterView.OnItemLongClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // android.widget.AdapterView.OnItemLongClickListener
        public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i10, long j10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{adapterView, view, new Integer(i10), new Long(j10)}, this, changeQuickRedirect, false, 49597, new Class[]{AdapterView.class, View.class, Integer.TYPE, Long.TYPE}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            if (a.this.f96010h != null && !a.this.f96010h.a(adapterView, view, i10)) {
                return false;
            }
            a.this.f96006d = adapterView;
            a.this.f96007e = view;
            a.this.f96011i = i10;
            a aVar = a.this;
            a.m(aVar, aVar.f96012j, a.this.f96013k);
            return true;
        }
    }

    /* JADX INFO: compiled from: PopupList.java */
    public class c implements View.OnLongClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 49598, new Class[]{View.class}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            if (a.this.f96010h != null && !a.this.f96010h.a(view, view, 0)) {
                return false;
            }
            a.this.f96007e = view;
            a.this.f96011i = 0;
            a aVar = a.this;
            a.m(aVar, aVar.f96012j, a.this.f96013k);
            return true;
        }
    }

    /* JADX INFO: compiled from: PopupList.java */
    public class d extends s<String> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f96032b;

        /* JADX INFO: renamed from: com.max.xiaoheihe.view.popuplist.a$d$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: PopupList.java */
        public class ViewOnClickListenerC0909a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f96034b;

            ViewOnClickListenerC0909a(int i10) {
                this.f96034b = i10;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 49601, new Class[]{View.class}, Void.TYPE).isSupported || a.this.f96010h == null) {
                    return;
                }
                a.this.f96010h.b(a.this.f96007e, a.this.f96011i, this.f96034b);
                a.this.M();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Context context, List list, int i10, int i11) {
            super(context, list, i10);
            this.f96032b = i11;
        }

        public void m(s.e eVar, String str) {
            if (PatchProxy.proxy(new Object[]{eVar, str}, this, changeQuickRedirect, false, 49599, new Class[]{s.e.class, String.class}, Void.TYPE).isSupported) {
                return;
            }
            TextView textView = (TextView) eVar.i(R.id.tv_menu);
            View viewI = eVar.i(R.id.v_divider_right);
            View viewI2 = eVar.i(R.id.v_divider_bottom);
            textView.setTextColor(a.this.f96017o);
            textView.setTextSize(1, a.this.f96025w);
            textView.setClickable(true);
            int adapterPosition = eVar.getAdapterPosition();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewI2.getLayoutParams();
            if ((adapterPosition + 1) % this.f96032b == 0 || adapterPosition == a.this.f96009g.size() - 1) {
                viewI.setVisibility(8);
                layoutParams.rightMargin = ViewUtils.f(a.this.f96003a, 10.0f);
            } else {
                viewI.setVisibility(0);
                layoutParams.rightMargin = ViewUtils.f(a.this.f96003a, 0.0f);
            }
            if (adapterPosition % this.f96032b == 0) {
                layoutParams.leftMargin = ViewUtils.f(a.this.f96003a, 10.0f);
            } else {
                layoutParams.leftMargin = ViewUtils.f(a.this.f96003a, 0.0f);
            }
            int size = a.this.f96009g.size();
            int i10 = this.f96032b;
            if (adapterPosition >= (size / i10) * i10) {
                viewI2.setVisibility(8);
            } else {
                viewI2.setVisibility(0);
            }
            textView.setOnClickListener(new ViewOnClickListenerC0909a(adapterPosition));
            if (a.this.f96010h instanceof g) {
                textView.setText(((g) a.this.f96010h).c(a.this.f96006d, a.this.f96007e, a.this.f96011i, adapterPosition, str));
            } else {
                textView.setText(str);
            }
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(s.e eVar, String str) {
            if (PatchProxy.proxy(new Object[]{eVar, str}, this, changeQuickRedirect, false, 49600, new Class[]{s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, str);
        }
    }

    /* JADX INFO: compiled from: PopupList.java */
    public class e implements PopupWindow.OnDismissListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 49602, new Class[0], Void.TYPE).isSupported || a.this.f96010h == null) {
                return;
            }
            a.this.f96010h.onDismiss();
        }
    }

    /* JADX INFO: compiled from: PopupList.java */
    public class f extends Drawable {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f96037a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f96038b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f96039c;

        f(int i10, float f10, float f11) {
            this.f96037a = i10;
            this.f96038b = f10;
            this.f96039c = f11;
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            if (PatchProxy.proxy(new Object[]{canvas}, this, changeQuickRedirect, false, 49603, new Class[]{Canvas.class}, Void.TYPE).isSupported) {
                return;
            }
            Path path = new Path();
            Paint paint = new Paint();
            paint.setColor(this.f96037a);
            paint.setStyle(Paint.Style.FILL);
            path.moveTo(0.0f, 0.0f);
            path.lineTo(this.f96038b, 0.0f);
            path.lineTo(this.f96038b / 2.0f, this.f96039c);
            path.close();
            canvas.drawPath(path, paint);
        }

        @Override // android.graphics.drawable.Drawable
        public int getIntrinsicHeight() {
            return (int) this.f96039c;
        }

        @Override // android.graphics.drawable.Drawable
        public int getIntrinsicWidth() {
            return (int) this.f96038b;
        }

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
            return -3;
        }

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(int i10) {
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(ColorFilter colorFilter) {
        }
    }

    /* JADX INFO: compiled from: PopupList.java */
    public interface g extends h {
        String c(View view, View view2, int i10, int i11, String str);
    }

    /* JADX INFO: compiled from: PopupList.java */
    public interface h {
        boolean a(View view, View view2, int i10);

        void b(View view, int i10, int i11);

        void onDismiss();
    }

    public a(Context context) {
        this.f96003a = context;
        this.f96008f = u(this.f96003a);
        N();
        O(this.f96024v, this.f96023u);
    }

    private int K(View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 49592, new Class[]{View.class}, Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        view.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        return view.getMeasuredHeight();
    }

    private int L(View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 49591, new Class[]{View.class}, Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        view.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        return view.getMeasuredWidth();
    }

    private void N() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 49578, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(this.C);
        int i10 = this.D;
        gradientDrawable.setCornerRadii(new float[]{i10, i10, 0.0f, 0.0f, 0.0f, 0.0f, i10, i10});
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setColor(0);
        int i11 = this.D;
        gradientDrawable2.setCornerRadii(new float[]{i11, i11, 0.0f, 0.0f, 0.0f, 0.0f, i11, i11});
        StateListDrawable stateListDrawable = new StateListDrawable();
        this.f96014l = stateListDrawable;
        stateListDrawable.addState(new int[]{android.R.attr.state_pressed}, gradientDrawable);
        this.f96014l.addState(new int[0], gradientDrawable2);
        GradientDrawable gradientDrawable3 = new GradientDrawable();
        gradientDrawable3.setColor(this.C);
        int i12 = this.D;
        gradientDrawable3.setCornerRadii(new float[]{0.0f, 0.0f, i12, i12, i12, i12, 0.0f, 0.0f});
        GradientDrawable gradientDrawable4 = new GradientDrawable();
        gradientDrawable4.setColor(0);
        int i13 = this.D;
        gradientDrawable4.setCornerRadii(new float[]{0.0f, 0.0f, i13, i13, i13, i13, 0.0f, 0.0f});
        StateListDrawable stateListDrawable2 = new StateListDrawable();
        this.f96015m = stateListDrawable2;
        stateListDrawable2.addState(new int[]{android.R.attr.state_pressed}, gradientDrawable3);
        this.f96015m.addState(new int[0], gradientDrawable4);
        GradientDrawable gradientDrawable5 = new GradientDrawable();
        gradientDrawable5.setColor(this.C);
        gradientDrawable5.setCornerRadius(this.D);
        GradientDrawable gradientDrawable6 = new GradientDrawable();
        gradientDrawable6.setColor(0);
        gradientDrawable6.setCornerRadius(this.D);
        StateListDrawable stateListDrawable3 = new StateListDrawable();
        this.f96016n = stateListDrawable3;
        stateListDrawable3.addState(new int[]{android.R.attr.state_pressed}, gradientDrawable5);
        this.f96016n.addState(new int[0], gradientDrawable6);
        GradientDrawable gradientDrawable7 = new GradientDrawable();
        this.f96018p = gradientDrawable7;
        gradientDrawable7.setColor(this.B);
        this.f96018p.setCornerRadius(this.D);
    }

    private void O(int i10, int i11) {
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 49580, new Class[]{cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        this.f96017o = new ColorStateList(new int[][]{new int[]{android.R.attr.state_pressed}, new int[0]}, new int[]{i10, i11});
    }

    private void f0(float f10, float f11) {
        Object[] objArr = {new Float(f10), new Float(f11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 49577, new Class[]{cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        Context context = this.f96003a;
        if ((context instanceof Activity) && ((Activity) context).isFinishing()) {
            return;
        }
        if (this.f96004b == null || (this.f96010h instanceof g)) {
            LinearLayout linearLayout = new LinearLayout(this.f96003a);
            int iMin = Math.min(this.f96009g.size(), 5);
            linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
            linearLayout.setOrientation(1);
            CardView cardView = new CardView(this.f96003a);
            cardView.setPadding(0, ViewUtils.f(this.f96003a, 4.0f), 0, ViewUtils.f(this.f96003a, 4.0f));
            cardView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
            cardView.setPreventCornerOverlap(false);
            cardView.setCardBackgroundColor(com.max.xiaoheihe.utils.d.E(R.color.popup_list_bg));
            Context context2 = this.f96003a;
            cardView.setRadius(ViewUtils.m(context2, ViewUtils.f(context2, 62.0f) * iMin, (ViewUtils.f(this.f96003a, 40.0f) * (this.f96009g.size() + 4)) / 5));
            RecyclerView recyclerView = new RecyclerView(this.f96003a);
            recyclerView.setLayoutManager(new GridLayoutManager(this.f96003a, iMin));
            recyclerView.setAdapter(new d(this.f96003a, this.f96009g, R.layout.item_popuplist_menu, iMin));
            cardView.addView(recyclerView, new FrameLayout.LayoutParams(-2, -2));
            linearLayout.addView(cardView);
            View view = this.f96008f;
            if (view != null) {
                LinearLayout.LayoutParams layoutParams = view.getLayoutParams() == null ? new LinearLayout.LayoutParams(-2, -2) : (LinearLayout.LayoutParams) this.f96008f.getLayoutParams();
                layoutParams.gravity = 17;
                this.f96008f.setLayoutParams(layoutParams);
                ViewParent parent = this.f96008f.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(this.f96008f);
                }
                linearLayout.addView(this.f96008f);
            }
            if (this.f96021s == 0) {
                if (this.f96009g.size() >= iMin) {
                    this.f96021s = (ViewUtils.f(this.f96003a, 62.0f) * iMin) + ViewUtils.f(this.f96003a, 8.0f);
                } else {
                    this.f96021s = (ViewUtils.f(this.f96003a, 62.0f) * this.f96009g.size()) + ViewUtils.f(this.f96003a, 8.0f);
                }
            }
            View view2 = this.f96008f;
            if (view2 != null && this.f96019q == 0) {
                if (view2.getLayoutParams().width > 0) {
                    this.f96019q = this.f96008f.getLayoutParams().width;
                } else {
                    this.f96019q = L(this.f96008f);
                }
            }
            View view3 = this.f96008f;
            if (view3 != null && this.f96020r == 0) {
                if (view3.getLayoutParams().height > 0) {
                    this.f96020r = this.f96008f.getLayoutParams().height;
                } else {
                    this.f96020r = K(this.f96008f);
                }
            }
            if (this.f96022t == 0) {
                this.f96022t = K(cardView) + this.f96020r;
            }
            PopupWindow popupWindow = new PopupWindow((View) linearLayout, this.f96021s, this.f96022t, true);
            this.f96004b = popupWindow;
            popupWindow.setTouchable(true);
            this.f96004b.setBackgroundDrawable(new BitmapDrawable());
        }
        this.f96004b.setOnDismissListener(new e());
        int[] iArr = new int[2];
        this.f96005c.getLocationOnScreen(iArr);
        if (this.f96008f != null) {
            int i10 = this.f96019q;
            int i11 = this.D;
            int i12 = this.f96021s;
            float f12 = ((i10 / 2.0f) + i11) - (i12 / 2.0f);
            float f13 = ((i12 / 2.0f) - (i10 / 2.0f)) - i11;
            float f14 = this.f96003a.getResources().getDisplayMetrics().widthPixels;
            int i13 = iArr[0];
            float f15 = i13 + f10;
            int i14 = this.f96021s;
            if (f15 < i14 / 2.0f) {
                this.f96008f.setTranslationX(Math.max((i13 + f10) - (i14 / 2.0f), f12));
            } else if (i13 + f10 + (i14 / 2.0f) > f14) {
                this.f96008f.setTranslationX(Math.min(((i13 + f10) + (i14 / 2.0f)) - f14, f13));
            } else {
                this.f96008f.setTranslationX(0.0f);
            }
        }
        if (this.f96004b.isShowing()) {
            return;
        }
        this.f96004b.showAtLocation(this.f96005c, 0, (int) (((iArr[0] + f10) - (this.f96021s / 2.0f)) + 0.5f), (int) (((iArr[1] + f11) - this.f96022t) + 0.5f));
    }

    static /* synthetic */ void m(a aVar, float f10, float f11) {
        Object[] objArr = {aVar, new Float(f10), new Float(f11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 49595, new Class[]{a.class, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        aVar.f0(f10, f11);
    }

    private StateListDrawable t() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 49579, new Class[0], StateListDrawable.class);
        if (patchProxyResultProxy.isSupported) {
            return (StateListDrawable) patchProxyResultProxy.result;
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(this.C);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setColor(0);
        stateListDrawable.addState(new int[]{android.R.attr.state_pressed}, gradientDrawable);
        stateListDrawable.addState(new int[0], gradientDrawable2);
        return stateListDrawable;
    }

    public int A() {
        return this.f96023u;
    }

    public int B() {
        return this.C;
    }

    public int C() {
        return this.f96024v;
    }

    public Resources D() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 49590, new Class[0], Resources.class);
        if (patchProxyResultProxy.isSupported) {
            return (Resources) patchProxyResultProxy.result;
        }
        Context context = this.f96003a;
        return context == null ? Resources.getSystem() : context.getResources();
    }

    public int E() {
        return this.A;
    }

    public int F() {
        return this.f96026x;
    }

    public int G() {
        return this.f96028z;
    }

    public int H() {
        return this.f96027y;
    }

    public float I() {
        return this.f96025w;
    }

    public View J(Context context, float f10, float f11, int i10) {
        Object[] objArr = {context, new Float(f10), new Float(f11), new Integer(i10)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 49583, new Class[]{Context.class, cls, cls, Integer.TYPE}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        ImageView imageView = new ImageView(context);
        imageView.setImageDrawable(new f(i10, f10, f11));
        return imageView;
    }

    public void M() {
        PopupWindow popupWindow;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 49581, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Context context = this.f96003a;
        if (((context instanceof Activity) && ((Activity) context).isFinishing()) || (popupWindow = this.f96004b) == null || !popupWindow.isShowing()) {
            return;
        }
        this.f96004b.dismiss();
    }

    public void P(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 49589, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.D = i10;
        N();
    }

    public void Q(int i10) {
        this.E = i10;
    }

    public void R(int i10) {
        this.G = i10;
    }

    public void S(int i10) {
        this.F = i10;
    }

    public void T(int i10, int i11) {
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 49584, new Class[]{cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        this.f96019q = i10;
        this.f96020r = i11;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.f96019q, this.f96020r);
        layoutParams.gravity = 17;
        View view = this.f96008f;
        if (view != null) {
            view.setLayoutParams(layoutParams);
        }
    }

    public void U(View view) {
        this.f96008f = view;
    }

    public void V(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 49587, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.B = i10;
        N();
    }

    public void W(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 49585, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f96023u = i10;
        O(this.f96024v, i10);
    }

    public void X(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 49588, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.C = i10;
        N();
    }

    public void Y(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 49586, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f96024v = i10;
        O(i10, this.f96023u);
    }

    public void Z(int i10, int i11, int i12, int i13) {
        this.f96026x = i10;
        this.f96027y = i11;
        this.f96028z = i12;
        this.A = i13;
    }

    public void a0(int i10) {
        this.A = i10;
    }

    public void b0(int i10) {
        this.f96026x = i10;
    }

    public void c0(int i10) {
        this.f96028z = i10;
    }

    public void d0(int i10) {
        this.f96027y = i10;
    }

    public void e0(float f10) {
        this.f96025w = f10;
    }

    public void g0(View view, int i10, float f10, float f11, List<String> list, h hVar) {
        Object[] objArr = {view, new Integer(i10), new Float(f10), new Float(f11), list, hVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 49576, new Class[]{View.class, Integer.TYPE, cls, cls, List.class, h.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f96005c = view;
        this.f96011i = i10;
        this.f96009g = list;
        this.f96010h = hVar;
        this.f96004b = null;
        this.f96007e = view;
        if (hVar == null || hVar.a(view, view, i10)) {
            int[] iArr = new int[2];
            this.f96005c.getLocationOnScreen(iArr);
            f0(f10 - iArr[0], f11 - iArr[1]);
        }
    }

    public int h0(float f10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Float(f10)}, this, changeQuickRedirect, false, 49594, new Class[]{Float.TYPE}, Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : (int) TypedValue.applyDimension(2, f10, D().getDisplayMetrics());
    }

    public void q(View view, List<String> list, h hVar) {
        if (PatchProxy.proxy(new Object[]{view, list, hVar}, this, changeQuickRedirect, false, 49575, new Class[]{View.class, List.class, h.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f96005c = view;
        this.f96009g = list;
        this.f96010h = hVar;
        this.f96004b = null;
        view.setOnTouchListener(new ViewOnTouchListenerC0908a());
        View view2 = this.f96005c;
        if (view2 instanceof AbsListView) {
            ((AbsListView) view2).setOnItemLongClickListener(new b());
        } else {
            view2.setOnLongClickListener(new c());
        }
    }

    public int r(float f10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Float(f10)}, this, changeQuickRedirect, false, 49593, new Class[]{Float.TYPE}, Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : (int) TypedValue.applyDimension(1, f10, D().getDisplayMetrics());
    }

    public int s() {
        return this.D;
    }

    public View u(Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 49582, new Class[]{Context.class}, View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : J(context, r(12.0f), r(6.0f), O);
    }

    public int v() {
        return this.E;
    }

    public int w() {
        return this.G;
    }

    public int x() {
        return this.F;
    }

    public View y() {
        return this.f96008f;
    }

    public int z() {
        return this.B;
    }
}
