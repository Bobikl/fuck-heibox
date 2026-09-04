package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R;
import androidx.appcompat.app.ActionBar;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class ScrollingTabContainerView extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f2560m = "ScrollingTabContainerView";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Interpolator f2561n = new DecelerateInterpolator();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f2562o = 200;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Runnable f2563b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private c f2564c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    LinearLayoutCompat f2565d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Spinner f2566e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f2567f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f2568g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    int f2569h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f2570i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f2571j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected ViewPropertyAnimator f2572k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected final d f2573l;

    public class TabView extends LinearLayout {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final String f2574h = "androidx.appcompat.app.ActionBar$Tab";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int[] f2575b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private ActionBar.e f2576c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private TextView f2577d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private ImageView f2578e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private View f2579f;

        /* JADX WARN: Illegal instructions before constructor call */
        public TabView(Context context, ActionBar.e eVar, boolean z10) {
            int i10 = R.attr.actionBarTabStyle;
            super(context, null, i10);
            int[] iArr = {android.R.attr.background};
            this.f2575b = iArr;
            this.f2576c = eVar;
            x0 x0VarG = x0.G(context, null, iArr, i10, 0);
            if (x0VarG.C(0)) {
                setBackgroundDrawable(x0VarG.h(0));
            }
            x0VarG.I();
            if (z10) {
                setGravity(8388627);
            }
            b();
        }

        public void a(ActionBar.e eVar) {
            this.f2576c = eVar;
            b();
        }

        public void b() {
            ActionBar.e eVar = this.f2576c;
            View viewB = eVar.b();
            if (viewB != null) {
                ViewParent parent = viewB.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(viewB);
                    }
                    addView(viewB);
                }
                this.f2579f = viewB;
                TextView textView = this.f2577d;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f2578e;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f2578e.setImageDrawable(null);
                    return;
                }
                return;
            }
            View view = this.f2579f;
            if (view != null) {
                removeView(view);
                this.f2579f = null;
            }
            Drawable drawableC = eVar.c();
            CharSequence charSequenceF = eVar.f();
            if (drawableC != null) {
                if (this.f2578e == null) {
                    AppCompatImageView appCompatImageView = new AppCompatImageView(getContext());
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 16;
                    appCompatImageView.setLayoutParams(layoutParams);
                    addView(appCompatImageView, 0);
                    this.f2578e = appCompatImageView;
                }
                this.f2578e.setImageDrawable(drawableC);
                this.f2578e.setVisibility(0);
            } else {
                ImageView imageView2 = this.f2578e;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                    this.f2578e.setImageDrawable(null);
                }
            }
            boolean z10 = !TextUtils.isEmpty(charSequenceF);
            if (z10) {
                if (this.f2577d == null) {
                    AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null, R.attr.actionBarTabTextStyle);
                    appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams2.gravity = 16;
                    appCompatTextView.setLayoutParams(layoutParams2);
                    addView(appCompatTextView);
                    this.f2577d = appCompatTextView;
                }
                this.f2577d.setText(charSequenceF);
                this.f2577d.setVisibility(0);
            } else {
                TextView textView2 = this.f2577d;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                    this.f2577d.setText((CharSequence) null);
                }
            }
            ImageView imageView3 = this.f2578e;
            if (imageView3 != null) {
                imageView3.setContentDescription(eVar.a());
            }
            b1.a(this, z10 ? null : eVar.a());
        }

        public ActionBar.e getTab() {
            return this.f2576c;
        }

        @Override // android.view.View
        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName(f2574h);
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName(f2574h);
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i10, int i11) {
            super.onMeasure(i10, i11);
            if (ScrollingTabContainerView.this.f2568g > 0) {
                int measuredWidth = getMeasuredWidth();
                int i12 = ScrollingTabContainerView.this.f2568g;
                if (measuredWidth > i12) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), i11);
                }
            }
        }

        @Override // android.view.View
        public void setSelected(boolean z10) {
            boolean z11 = isSelected() != z10;
            super.setSelected(z10);
            if (z11 && z10) {
                sendAccessibilityEvent(4);
            }
        }
    }

    public class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f2581b;

        a(View view) {
            this.f2581b = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            ScrollingTabContainerView.this.smoothScrollTo(this.f2581b.getLeft() - ((ScrollingTabContainerView.this.getWidth() - this.f2581b.getWidth()) / 2), 0);
            ScrollingTabContainerView.this.f2563b = null;
        }
    }

    public class b extends BaseAdapter {
        b() {
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return ScrollingTabContainerView.this.f2565d.getChildCount();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i10) {
            return ((TabView) ScrollingTabContainerView.this.f2565d.getChildAt(i10)).getTab();
        }

        @Override // android.widget.Adapter
        public long getItemId(int i10) {
            return i10;
        }

        @Override // android.widget.Adapter
        public View getView(int i10, View view, ViewGroup viewGroup) {
            if (view == null) {
                return ScrollingTabContainerView.this.g((ActionBar.e) getItem(i10), true);
            }
            ((TabView) view).a((ActionBar.e) getItem(i10));
            return view;
        }
    }

    public class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ((TabView) view).getTab().g();
            int childCount = ScrollingTabContainerView.this.f2565d.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = ScrollingTabContainerView.this.f2565d.getChildAt(i10);
                childAt.setSelected(childAt == view);
            }
        }
    }

    public class d extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f2585b = false;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f2586c;

        protected d() {
        }

        public d a(ViewPropertyAnimator viewPropertyAnimator, int i10) {
            this.f2586c = i10;
            ScrollingTabContainerView.this.f2572k = viewPropertyAnimator;
            return this;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f2585b = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f2585b) {
                return;
            }
            ScrollingTabContainerView scrollingTabContainerView = ScrollingTabContainerView.this;
            scrollingTabContainerView.f2572k = null;
            scrollingTabContainerView.setVisibility(this.f2586c);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            ScrollingTabContainerView.this.setVisibility(0);
            this.f2585b = false;
        }
    }

    public ScrollingTabContainerView(@androidx.annotation.n0 Context context) {
        super(context);
        this.f2573l = new d();
        setHorizontalScrollBarEnabled(false);
        androidx.appcompat.view.a aVarB = androidx.appcompat.view.a.b(context);
        setContentHeight(aVarB.f());
        this.f2569h = aVarB.e();
        LinearLayoutCompat linearLayoutCompatF = f();
        this.f2565d = linearLayoutCompatF;
        addView(linearLayoutCompatF, new ViewGroup.LayoutParams(-2, -1));
    }

    private Spinner e() {
        AppCompatSpinner appCompatSpinner = new AppCompatSpinner(getContext(), null, R.attr.actionDropDownStyle);
        appCompatSpinner.setLayoutParams(new LinearLayoutCompat.LayoutParams(-2, -1));
        appCompatSpinner.setOnItemSelectedListener(this);
        return appCompatSpinner;
    }

    private LinearLayoutCompat f() {
        LinearLayoutCompat linearLayoutCompat = new LinearLayoutCompat(getContext(), null, R.attr.actionBarTabBarStyle);
        linearLayoutCompat.setMeasureWithLargestChildEnabled(true);
        linearLayoutCompat.setGravity(17);
        linearLayoutCompat.setLayoutParams(new LinearLayoutCompat.LayoutParams(-2, -1));
        return linearLayoutCompat;
    }

    private boolean h() {
        Spinner spinner = this.f2566e;
        return spinner != null && spinner.getParent() == this;
    }

    private void i() {
        if (h()) {
            return;
        }
        if (this.f2566e == null) {
            this.f2566e = e();
        }
        removeView(this.f2565d);
        addView(this.f2566e, new ViewGroup.LayoutParams(-2, -1));
        if (this.f2566e.getAdapter() == null) {
            this.f2566e.setAdapter((SpinnerAdapter) new b());
        }
        Runnable runnable = this.f2563b;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.f2563b = null;
        }
        this.f2566e.setSelection(this.f2571j);
    }

    private boolean j() {
        if (!h()) {
            return false;
        }
        removeView(this.f2566e);
        addView(this.f2565d, new ViewGroup.LayoutParams(-2, -1));
        setTabSelected(this.f2566e.getSelectedItemPosition());
        return false;
    }

    public void a(ActionBar.e eVar, int i10, boolean z10) {
        TabView tabViewG = g(eVar, false);
        this.f2565d.addView(tabViewG, i10, new LinearLayoutCompat.LayoutParams(0, -1, 1.0f));
        Spinner spinner = this.f2566e;
        if (spinner != null) {
            ((b) spinner.getAdapter()).notifyDataSetChanged();
        }
        if (z10) {
            tabViewG.setSelected(true);
        }
        if (this.f2567f) {
            requestLayout();
        }
    }

    public void b(ActionBar.e eVar, boolean z10) {
        TabView tabViewG = g(eVar, false);
        this.f2565d.addView(tabViewG, new LinearLayoutCompat.LayoutParams(0, -1, 1.0f));
        Spinner spinner = this.f2566e;
        if (spinner != null) {
            ((b) spinner.getAdapter()).notifyDataSetChanged();
        }
        if (z10) {
            tabViewG.setSelected(true);
        }
        if (this.f2567f) {
            requestLayout();
        }
    }

    public void c(int i10) {
        View childAt = this.f2565d.getChildAt(i10);
        Runnable runnable = this.f2563b;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        a aVar = new a(childAt);
        this.f2563b = aVar;
        post(aVar);
    }

    public void d(int i10) {
        ViewPropertyAnimator viewPropertyAnimator = this.f2572k;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        if (i10 != 0) {
            ViewPropertyAnimator viewPropertyAnimatorAlpha = animate().alpha(0.0f);
            viewPropertyAnimatorAlpha.setDuration(200L);
            viewPropertyAnimatorAlpha.setInterpolator(f2561n);
            viewPropertyAnimatorAlpha.setListener(this.f2573l.a(viewPropertyAnimatorAlpha, i10));
            viewPropertyAnimatorAlpha.start();
            return;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        ViewPropertyAnimator viewPropertyAnimatorAlpha2 = animate().alpha(1.0f);
        viewPropertyAnimatorAlpha2.setDuration(200L);
        viewPropertyAnimatorAlpha2.setInterpolator(f2561n);
        viewPropertyAnimatorAlpha2.setListener(this.f2573l.a(viewPropertyAnimatorAlpha2, i10));
        viewPropertyAnimatorAlpha2.start();
    }

    TabView g(ActionBar.e eVar, boolean z10) {
        TabView tabView = new TabView(getContext(), eVar, z10);
        if (z10) {
            tabView.setBackgroundDrawable(null);
            tabView.setLayoutParams(new AbsListView.LayoutParams(-1, this.f2570i));
        } else {
            tabView.setFocusable(true);
            if (this.f2564c == null) {
                this.f2564c = new c();
            }
            tabView.setOnClickListener(this.f2564c);
        }
        return tabView;
    }

    public void k() {
        this.f2565d.removeAllViews();
        Spinner spinner = this.f2566e;
        if (spinner != null) {
            ((b) spinner.getAdapter()).notifyDataSetChanged();
        }
        if (this.f2567f) {
            requestLayout();
        }
    }

    public void l(int i10) {
        this.f2565d.removeViewAt(i10);
        Spinner spinner = this.f2566e;
        if (spinner != null) {
            ((b) spinner.getAdapter()).notifyDataSetChanged();
        }
        if (this.f2567f) {
            requestLayout();
        }
    }

    public void m(int i10) {
        ((TabView) this.f2565d.getChildAt(i10)).b();
        Spinner spinner = this.f2566e;
        if (spinner != null) {
            ((b) spinner.getAdapter()).notifyDataSetChanged();
        }
        if (this.f2567f) {
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Runnable runnable = this.f2563b;
        if (runnable != null) {
            post(runnable);
        }
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        androidx.appcompat.view.a aVarB = androidx.appcompat.view.a.b(getContext());
        setContentHeight(aVarB.f());
        this.f2569h = aVarB.e();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.f2563b;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j10) {
        ((TabView) view).getTab().g();
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        boolean z10 = mode == 1073741824;
        setFillViewport(z10);
        int childCount = this.f2565d.getChildCount();
        if (childCount <= 1 || !(mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            this.f2568g = -1;
        } else {
            if (childCount > 2) {
                this.f2568g = (int) (View.MeasureSpec.getSize(i10) * 0.4f);
            } else {
                this.f2568g = View.MeasureSpec.getSize(i10) / 2;
            }
            this.f2568g = Math.min(this.f2568g, this.f2569h);
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f2570i, 1073741824);
        if (!z10 && this.f2567f) {
            this.f2565d.measure(0, iMakeMeasureSpec);
            if (this.f2565d.getMeasuredWidth() > View.MeasureSpec.getSize(i10)) {
                i();
            } else {
                j();
            }
        } else {
            j();
        }
        int measuredWidth = getMeasuredWidth();
        super.onMeasure(i10, iMakeMeasureSpec);
        int measuredWidth2 = getMeasuredWidth();
        if (!z10 || measuredWidth == measuredWidth2) {
            return;
        }
        setTabSelected(this.f2571j);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    public void setAllowCollapse(boolean z10) {
        this.f2567f = z10;
    }

    public void setContentHeight(int i10) {
        this.f2570i = i10;
        requestLayout();
    }

    public void setTabSelected(int i10) {
        this.f2571j = i10;
        int childCount = this.f2565d.getChildCount();
        int i11 = 0;
        while (i11 < childCount) {
            View childAt = this.f2565d.getChildAt(i11);
            boolean z10 = i11 == i10;
            childAt.setSelected(z10);
            if (z10) {
                c(i10);
            }
            i11++;
        }
        Spinner spinner = this.f2566e;
        if (spinner == null || i10 < 0) {
            return;
        }
        spinner.setSelection(i10);
    }
}
