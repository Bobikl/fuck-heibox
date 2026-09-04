package com.max.xiaoheihe.view.popupmenu;

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
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbcommon.base.adapter.s;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.List;

/* JADX INFO: compiled from: HbPopupMenu.java */
/* JADX INFO: loaded from: classes13.dex */
public class a {
    public static final float G = 12.0f;
    public static final float H = 10.0f;
    public static final float I = 5.0f;
    public static final float J = 10.0f;
    public static final float K = 5.0f;
    public static final int M = -411601033;
    public static final int N = 4;
    public static final int O = -1694498817;
    public static final float P = 0.5f;
    public static final float Q = 16.0f;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f96042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private PopupWindow f96043b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private View f96044c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private View f96045d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private View f96046e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private View f96047f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private List<String> f96048g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private g f96049h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private StateListDrawable f96050i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private StateListDrawable f96051j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private StateListDrawable f96052k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private ColorStateList f96053l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private GradientDrawable f96054m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f96055n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f96056o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f96057p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f96058q;
    public static final int E = com.max.xiaoheihe.utils.d.E(R.color.text_secondary_2_color);
    public static final int F = com.max.xiaoheihe.utils.d.E(R.color.text_secondary_2_color);
    public static final int L = com.max.xiaoheihe.utils.d.E(R.color.popup_list_bg);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f96059r = E;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f96060s = F;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private float f96061t = 12.0f;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f96062u = k(10.0f);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f96063v = k(5.0f);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f96064w = k(10.0f);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f96065x = k(5.0f);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f96066y = L;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f96067z = M;
    private int A = k(4.0f);
    private int B = O;
    private int C = k(0.5f);
    private int D = k(16.0f);

    /* JADX INFO: renamed from: com.max.xiaoheihe.view.popupmenu.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: HbPopupMenu.java */
    public class ViewOnTouchListenerC0910a implements View.OnTouchListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        ViewOnTouchListenerC0910a() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return false;
        }
    }

    /* JADX INFO: compiled from: HbPopupMenu.java */
    public class b implements AdapterView.OnItemLongClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // android.widget.AdapterView.OnItemLongClickListener
        public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i10, long j10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{adapterView, view, new Integer(i10), new Long(j10)}, this, changeQuickRedirect, false, 49628, new Class[]{AdapterView.class, View.class, Integer.TYPE, Long.TYPE}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            if (a.this.f96049h != null && !a.this.f96049h.b(adapterView, view)) {
                return false;
            }
            a.this.f96045d = adapterView;
            a.this.f96046e = view;
            a.f(a.this);
            return true;
        }
    }

    /* JADX INFO: compiled from: HbPopupMenu.java */
    public class c implements View.OnLongClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 49629, new Class[]{View.class}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            if (a.this.f96049h != null && !a.this.f96049h.b(view, view)) {
                return false;
            }
            a.this.f96046e = view;
            a.f(a.this);
            return true;
        }
    }

    /* JADX INFO: compiled from: HbPopupMenu.java */
    public class d extends s<String> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: com.max.xiaoheihe.view.popupmenu.a$d$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: HbPopupMenu.java */
        public class ViewOnClickListenerC0911a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f96072b;

            ViewOnClickListenerC0911a(int i10) {
                this.f96072b = i10;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 49632, new Class[]{View.class}, Void.TYPE).isSupported || a.this.f96049h == null) {
                    return;
                }
                a.this.f96049h.a(a.this.f96046e, this.f96072b);
                a.this.F();
            }
        }

        d(Context context, List list, int i10) {
            super(context, list, i10);
        }

        public void m(s.e eVar, String str) {
            if (PatchProxy.proxy(new Object[]{eVar, str}, this, changeQuickRedirect, false, 49630, new Class[]{s.e.class, String.class}, Void.TYPE).isSupported) {
                return;
            }
            TextView textView = (TextView) eVar.i(R.id.tv_menu);
            View viewI = eVar.i(R.id.v_divider);
            textView.setTextColor(a.this.f96053l);
            textView.setTextSize(1, a.this.f96061t);
            textView.setClickable(true);
            int adapterPosition = eVar.getAdapterPosition();
            if (adapterPosition != a.this.f96048g.size() - 1) {
                viewI.setVisibility(0);
            } else {
                viewI.setVisibility(8);
            }
            textView.setOnClickListener(new ViewOnClickListenerC0911a(adapterPosition));
            if (a.this.f96049h instanceof f) {
                textView.setText(((f) a.this.f96049h).d(a.this.f96045d, a.this.f96046e, adapterPosition, str));
            } else {
                textView.setText(str);
            }
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(s.e eVar, String str) {
            if (PatchProxy.proxy(new Object[]{eVar, str}, this, changeQuickRedirect, false, 49631, new Class[]{s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, str);
        }
    }

    /* JADX INFO: compiled from: HbPopupMenu.java */
    public class e extends Drawable {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f96074a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f96075b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f96076c;

        e(int i10, float f10, float f11) {
            this.f96074a = i10;
            this.f96075b = f10;
            this.f96076c = f11;
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            if (PatchProxy.proxy(new Object[]{canvas}, this, changeQuickRedirect, false, 49633, new Class[]{Canvas.class}, Void.TYPE).isSupported) {
                return;
            }
            Path path = new Path();
            Paint paint = new Paint();
            paint.setColor(this.f96074a);
            paint.setStyle(Paint.Style.FILL);
            path.moveTo(this.f96075b / 2.0f, 0.0f);
            path.lineTo(this.f96075b, this.f96076c);
            path.lineTo(0.0f, this.f96076c);
            path.close();
            canvas.drawPath(path, paint);
        }

        @Override // android.graphics.drawable.Drawable
        public int getIntrinsicHeight() {
            return (int) this.f96076c;
        }

        @Override // android.graphics.drawable.Drawable
        public int getIntrinsicWidth() {
            return (int) this.f96075b;
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

    /* JADX INFO: compiled from: HbPopupMenu.java */
    public interface f extends com.max.xiaoheihe.view.popuplist.a.h {
        String d(View view, View view2, int i10, String str);
    }

    /* JADX INFO: compiled from: HbPopupMenu.java */
    public interface g {
        void a(View view, int i10);

        boolean b(View view, View view2);
    }

    public a(Context context) {
        this.f96042a = context;
        this.f96047f = n(this.f96042a);
        G();
        H(this.f96060s, this.f96059r);
    }

    private int D(View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 49624, new Class[]{View.class}, Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        view.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        return view.getMeasuredHeight();
    }

    private int E(View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 49623, new Class[]{View.class}, Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        view.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        return view.getMeasuredWidth();
    }

    private void G() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 49610, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(this.f96067z);
        int i10 = this.A;
        gradientDrawable.setCornerRadii(new float[]{i10, i10, 0.0f, 0.0f, 0.0f, 0.0f, i10, i10});
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setColor(0);
        int i11 = this.A;
        gradientDrawable2.setCornerRadii(new float[]{i11, i11, 0.0f, 0.0f, 0.0f, 0.0f, i11, i11});
        StateListDrawable stateListDrawable = new StateListDrawable();
        this.f96050i = stateListDrawable;
        stateListDrawable.addState(new int[]{android.R.attr.state_pressed}, gradientDrawable);
        this.f96050i.addState(new int[0], gradientDrawable2);
        GradientDrawable gradientDrawable3 = new GradientDrawable();
        gradientDrawable3.setColor(this.f96067z);
        int i12 = this.A;
        gradientDrawable3.setCornerRadii(new float[]{0.0f, 0.0f, i12, i12, i12, i12, 0.0f, 0.0f});
        GradientDrawable gradientDrawable4 = new GradientDrawable();
        gradientDrawable4.setColor(0);
        int i13 = this.A;
        gradientDrawable4.setCornerRadii(new float[]{0.0f, 0.0f, i13, i13, i13, i13, 0.0f, 0.0f});
        StateListDrawable stateListDrawable2 = new StateListDrawable();
        this.f96051j = stateListDrawable2;
        stateListDrawable2.addState(new int[]{android.R.attr.state_pressed}, gradientDrawable3);
        this.f96051j.addState(new int[0], gradientDrawable4);
        GradientDrawable gradientDrawable5 = new GradientDrawable();
        gradientDrawable5.setColor(this.f96067z);
        gradientDrawable5.setCornerRadius(this.A);
        GradientDrawable gradientDrawable6 = new GradientDrawable();
        gradientDrawable6.setColor(0);
        gradientDrawable6.setCornerRadius(this.A);
        StateListDrawable stateListDrawable3 = new StateListDrawable();
        this.f96052k = stateListDrawable3;
        stateListDrawable3.addState(new int[]{android.R.attr.state_pressed}, gradientDrawable5);
        this.f96052k.addState(new int[0], gradientDrawable6);
        GradientDrawable gradientDrawable7 = new GradientDrawable();
        this.f96054m = gradientDrawable7;
        gradientDrawable7.setColor(this.f96066y);
        this.f96054m.setCornerRadius(this.A);
    }

    private void H(int i10, int i11) {
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 49612, new Class[]{cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        this.f96053l = new ColorStateList(new int[][]{new int[]{android.R.attr.state_pressed}, new int[0]}, new int[]{i10, i11});
    }

    private void Y() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 49609, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Context context = this.f96042a;
        if ((context instanceof Activity) && ((Activity) context).isFinishing()) {
            return;
        }
        if (this.f96043b == null || (this.f96049h instanceof f)) {
            LinearLayout linearLayout = new LinearLayout(this.f96042a);
            linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
            linearLayout.setOrientation(1);
            View view = this.f96047f;
            if (view != null) {
                LinearLayout.LayoutParams layoutParams = view.getLayoutParams() == null ? new LinearLayout.LayoutParams(-2, -2) : (LinearLayout.LayoutParams) this.f96047f.getLayoutParams();
                layoutParams.gravity = 17;
                this.f96047f.setLayoutParams(layoutParams);
                ViewParent parent = this.f96047f.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(this.f96047f);
                }
                linearLayout.addView(this.f96047f);
            }
            CardView cardView = new CardView(this.f96042a);
            cardView.setPadding(0, ViewUtils.f(this.f96042a, 4.0f), 0, ViewUtils.f(this.f96042a, 4.0f));
            cardView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
            cardView.setPreventCornerOverlap(false);
            cardView.setCardBackgroundColor(com.max.xiaoheihe.utils.d.E(R.color.popup_list_bg));
            cardView.setRadius(ViewUtils.f(this.f96042a, 4.0f));
            RecyclerView recyclerView = new RecyclerView(this.f96042a);
            recyclerView.setLayoutManager(new LinearLayoutManager(this.f96042a));
            recyclerView.setAdapter(new d(this.f96042a, this.f96048g, R.layout.item_heybox_popmenu));
            cardView.addView(recyclerView, new FrameLayout.LayoutParams(-2, -2));
            linearLayout.addView(cardView);
            if (this.f96057p == 0) {
                this.f96057p = ViewUtils.f(this.f96042a, 80.0f);
            }
            View view2 = this.f96047f;
            if (view2 != null && this.f96055n == 0) {
                if (view2.getLayoutParams().width > 0) {
                    this.f96055n = this.f96047f.getLayoutParams().width;
                } else {
                    this.f96055n = E(this.f96047f);
                }
            }
            View view3 = this.f96047f;
            if (view3 != null && this.f96056o == 0) {
                if (view3.getLayoutParams().height > 0) {
                    this.f96056o = this.f96047f.getLayoutParams().height;
                } else {
                    this.f96056o = D(this.f96047f);
                }
            }
            if (this.f96058q == 0) {
                this.f96058q = D(cardView) + this.f96056o;
            }
            PopupWindow popupWindow = new PopupWindow((View) linearLayout, this.f96057p, this.f96058q, true);
            this.f96043b = popupWindow;
            popupWindow.setTouchable(true);
            this.f96043b.setBackgroundDrawable(new BitmapDrawable());
        }
        int[] iArr = new int[2];
        this.f96044c.getLocationOnScreen(iArr);
        int iW = ViewUtils.W(this.f96044c) / 2;
        float f10 = this.f96042a.getResources().getDisplayMetrics().widthPixels - ViewUtils.f(this.f96042a, 12.0f);
        View view4 = this.f96047f;
        if (view4 != null) {
            int i10 = this.f96055n;
            int i11 = this.A;
            int i12 = this.f96057p;
            float f11 = ((i10 / 2.0f) + i11) - (i12 / 2.0f);
            float f12 = ((i12 / 2.0f) - (i10 / 2.0f)) - i11;
            int i13 = iArr[0];
            if (i13 + iW < i12 / 2.0f) {
                view4.setTranslationX(Math.max((i13 + iW) - (i12 / 2.0f), f11));
            } else if (i13 + iW + (i12 / 2.0f) > f10) {
                view4.setTranslationX(Math.min(((i13 + iW) + (i12 / 2.0f)) - f10, f12));
            } else {
                view4.setTranslationX(0.0f);
            }
        }
        if (this.f96043b.isShowing()) {
            return;
        }
        float f13 = iArr[0] + iW;
        int i14 = this.f96057p;
        int i15 = (int) ((f13 - (i14 / 2.0f)) + 0.5f);
        if (i15 + i14 > f10) {
            i15 = (int) ((f10 - i14) + 0.5f);
        }
        this.f96043b.showAtLocation(this.f96044c, 0, i15, iArr[1] + ViewUtils.W(this.f96044c) + ViewUtils.f(this.f96042a, 6.0f));
    }

    static /* synthetic */ void f(a aVar) {
        if (PatchProxy.proxy(new Object[]{aVar}, null, changeQuickRedirect, true, 49627, new Class[]{a.class}, Void.TYPE).isSupported) {
            return;
        }
        aVar.Y();
    }

    private StateListDrawable m() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 49611, new Class[0], StateListDrawable.class);
        if (patchProxyResultProxy.isSupported) {
            return (StateListDrawable) patchProxyResultProxy.result;
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(this.f96067z);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setColor(0);
        stateListDrawable.addState(new int[]{android.R.attr.state_pressed}, gradientDrawable);
        stateListDrawable.addState(new int[0], gradientDrawable2);
        return stateListDrawable;
    }

    public int A() {
        return this.f96063v;
    }

    public float B() {
        return this.f96061t;
    }

    public View C(Context context, float f10, float f11, int i10) {
        Object[] objArr = {context, new Float(f10), new Float(f11), new Integer(i10)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 49615, new Class[]{Context.class, cls, cls, Integer.TYPE}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        ImageView imageView = new ImageView(context);
        imageView.setImageDrawable(new e(i10, f10, f11));
        return imageView;
    }

    public void F() {
        PopupWindow popupWindow;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 49613, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Context context = this.f96042a;
        if (((context instanceof Activity) && ((Activity) context).isFinishing()) || (popupWindow = this.f96043b) == null || !popupWindow.isShowing()) {
            return;
        }
        this.f96043b.dismiss();
    }

    public void I(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 49621, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.A = i10;
        G();
    }

    public void J(int i10) {
        this.B = i10;
    }

    public void K(int i10) {
        this.D = i10;
    }

    public void L(int i10) {
        this.C = i10;
    }

    public void M(int i10, int i11) {
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 49616, new Class[]{cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        this.f96055n = i10;
        this.f96056o = i11;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.f96055n, this.f96056o);
        layoutParams.gravity = 17;
        View view = this.f96047f;
        if (view != null) {
            view.setLayoutParams(layoutParams);
        }
    }

    public void N(View view) {
        this.f96047f = view;
    }

    public void O(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 49619, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f96066y = i10;
        G();
    }

    public void P(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 49617, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f96059r = i10;
        H(this.f96060s, i10);
    }

    public void Q(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 49620, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f96067z = i10;
        G();
    }

    public void R(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 49618, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f96060s = i10;
        H(i10, this.f96059r);
    }

    public void S(int i10, int i11, int i12, int i13) {
        this.f96062u = i10;
        this.f96063v = i11;
        this.f96064w = i12;
        this.f96065x = i13;
    }

    public void T(int i10) {
        this.f96065x = i10;
    }

    public void U(int i10) {
        this.f96062u = i10;
    }

    public void V(int i10) {
        this.f96064w = i10;
    }

    public void W(int i10) {
        this.f96063v = i10;
    }

    public void X(float f10) {
        this.f96061t = f10;
    }

    public void Z(View view, List<String> list, g gVar) {
        if (PatchProxy.proxy(new Object[]{view, list, gVar}, this, changeQuickRedirect, false, 49608, new Class[]{View.class, List.class, g.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f96044c = view;
        this.f96048g = list;
        this.f96049h = gVar;
        this.f96043b = null;
        this.f96046e = view;
        if (gVar == null || gVar.b(view, view)) {
            this.f96044c.getLocationOnScreen(new int[2]);
            Y();
        }
    }

    public int a0(float f10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Float(f10)}, this, changeQuickRedirect, false, 49626, new Class[]{Float.TYPE}, Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : (int) TypedValue.applyDimension(2, f10, w().getDisplayMetrics());
    }

    public void j(View view, List<String> list, g gVar) {
        if (PatchProxy.proxy(new Object[]{view, list, gVar}, this, changeQuickRedirect, false, 49607, new Class[]{View.class, List.class, g.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f96044c = view;
        this.f96048g = list;
        this.f96049h = gVar;
        this.f96043b = null;
        view.setOnTouchListener(new ViewOnTouchListenerC0910a());
        View view2 = this.f96044c;
        if (view2 instanceof AbsListView) {
            ((AbsListView) view2).setOnItemLongClickListener(new b());
        } else {
            view2.setOnLongClickListener(new c());
        }
    }

    public int k(float f10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Float(f10)}, this, changeQuickRedirect, false, 49625, new Class[]{Float.TYPE}, Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : (int) TypedValue.applyDimension(1, f10, w().getDisplayMetrics());
    }

    public int l() {
        return this.A;
    }

    public View n(Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 49614, new Class[]{Context.class}, View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : C(context, k(12.0f), k(6.0f), L);
    }

    public int o() {
        return this.B;
    }

    public int p() {
        return this.D;
    }

    public int q() {
        return this.C;
    }

    public View r() {
        return this.f96047f;
    }

    public int s() {
        return this.f96066y;
    }

    public int t() {
        return this.f96059r;
    }

    public int u() {
        return this.f96067z;
    }

    public int v() {
        return this.f96060s;
    }

    public Resources w() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 49622, new Class[0], Resources.class);
        if (patchProxyResultProxy.isSupported) {
            return (Resources) patchProxyResultProxy.result;
        }
        Context context = this.f96042a;
        return context == null ? Resources.getSystem() : context.getResources();
    }

    public int x() {
        return this.f96065x;
    }

    public int y() {
        return this.f96062u;
    }

    public int z() {
        return this.f96064w;
    }
}
