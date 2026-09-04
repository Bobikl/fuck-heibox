package androidx.viewpager.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.text.method.SingleLineTransformationMethod;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.annotation.l;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.x;
import androidx.core.widget.q;
import com.google.android.material.color.utilities.d;
import java.lang.ref.WeakReference;
import java.util.Locale;

/* JADX INFO: loaded from: classes6.dex */
@ViewPager.e
public class PagerTitleStrip extends ViewGroup {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int[] f28216p = {R.attr.textAppearance, R.attr.textSize, R.attr.textColor, R.attr.gravity};

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int[] f28217q = {R.attr.textAllCaps};

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final float f28218r = 0.6f;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final int f28219s = 16;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    ViewPager f28220b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    TextView f28221c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    TextView f28222d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    TextView f28223e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f28224f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    float f28225g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f28226h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f28227i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f28228j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f28229k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final a f28230l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private WeakReference<androidx.viewpager.widget.a> f28231m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f28232n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    int f28233o;

    public class a extends DataSetObserver implements ViewPager.i, ViewPager.h {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f28234b;

        a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.h
        public void b(ViewPager viewPager, androidx.viewpager.widget.a aVar, androidx.viewpager.widget.a aVar2) {
            PagerTitleStrip.this.a(aVar, aVar2);
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            PagerTitleStrip pagerTitleStrip = PagerTitleStrip.this;
            pagerTitleStrip.b(pagerTitleStrip.f28220b.getCurrentItem(), PagerTitleStrip.this.f28220b.getAdapter());
            PagerTitleStrip pagerTitleStrip2 = PagerTitleStrip.this;
            float f10 = pagerTitleStrip2.f28225g;
            if (f10 < 0.0f) {
                f10 = 0.0f;
            }
            pagerTitleStrip2.c(pagerTitleStrip2.f28220b.getCurrentItem(), f10, true);
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public void onPageScrollStateChanged(int i10) {
            this.f28234b = i10;
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public void onPageScrolled(int i10, float f10, int i11) {
            if (f10 > 0.5f) {
                i10++;
            }
            PagerTitleStrip.this.c(i10, f10, false);
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public void onPageSelected(int i10) {
            if (this.f28234b == 0) {
                PagerTitleStrip pagerTitleStrip = PagerTitleStrip.this;
                pagerTitleStrip.b(pagerTitleStrip.f28220b.getCurrentItem(), PagerTitleStrip.this.f28220b.getAdapter());
                PagerTitleStrip pagerTitleStrip2 = PagerTitleStrip.this;
                float f10 = pagerTitleStrip2.f28225g;
                if (f10 < 0.0f) {
                    f10 = 0.0f;
                }
                pagerTitleStrip2.c(pagerTitleStrip2.f28220b.getCurrentItem(), f10, true);
            }
        }
    }

    public static class b extends SingleLineTransformationMethod {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Locale f28236b;

        b(Context context) {
            this.f28236b = context.getResources().getConfiguration().locale;
        }

        @Override // android.text.method.ReplacementTransformationMethod, android.text.method.TransformationMethod
        public CharSequence getTransformation(CharSequence charSequence, View view) {
            CharSequence transformation = super.getTransformation(charSequence, view);
            if (transformation != null) {
                return transformation.toString().toUpperCase(this.f28236b);
            }
            return null;
        }
    }

    public PagerTitleStrip(@n0 Context context) {
        this(context, null);
    }

    public PagerTitleStrip(@n0 Context context, @p0 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f28224f = -1;
        this.f28225g = -1.0f;
        this.f28230l = new a();
        TextView textView = new TextView(context);
        this.f28221c = textView;
        addView(textView);
        TextView textView2 = new TextView(context);
        this.f28222d = textView2;
        addView(textView2);
        TextView textView3 = new TextView(context);
        this.f28223e = textView3;
        addView(textView3);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f28216p);
        boolean z10 = false;
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            q.E(this.f28221c, resourceId);
            q.E(this.f28222d, resourceId);
            q.E(this.f28223e, resourceId);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        if (dimensionPixelSize != 0) {
            setTextSize(0, dimensionPixelSize);
        }
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            int color = typedArrayObtainStyledAttributes.getColor(2, 0);
            this.f28221c.setTextColor(color);
            this.f28222d.setTextColor(color);
            this.f28223e.setTextColor(color);
        }
        this.f28227i = typedArrayObtainStyledAttributes.getInteger(3, 80);
        typedArrayObtainStyledAttributes.recycle();
        this.f28233o = this.f28222d.getTextColors().getDefaultColor();
        setNonPrimaryAlpha(f28218r);
        this.f28221c.setEllipsize(TextUtils.TruncateAt.END);
        this.f28222d.setEllipsize(TextUtils.TruncateAt.END);
        this.f28223e.setEllipsize(TextUtils.TruncateAt.END);
        if (resourceId != 0) {
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(resourceId, f28217q);
            z10 = typedArrayObtainStyledAttributes2.getBoolean(0, false);
            typedArrayObtainStyledAttributes2.recycle();
        }
        if (z10) {
            setSingleLineAllCaps(this.f28221c);
            setSingleLineAllCaps(this.f28222d);
            setSingleLineAllCaps(this.f28223e);
        } else {
            this.f28221c.setSingleLine();
            this.f28222d.setSingleLine();
            this.f28223e.setSingleLine();
        }
        this.f28226h = (int) (context.getResources().getDisplayMetrics().density * 16.0f);
    }

    private static void setSingleLineAllCaps(TextView textView) {
        textView.setTransformationMethod(new b(textView.getContext()));
    }

    void a(androidx.viewpager.widget.a aVar, androidx.viewpager.widget.a aVar2) {
        if (aVar != null) {
            aVar.unregisterDataSetObserver(this.f28230l);
            this.f28231m = null;
        }
        if (aVar2 != null) {
            aVar2.registerDataSetObserver(this.f28230l);
            this.f28231m = new WeakReference<>(aVar2);
        }
        ViewPager viewPager = this.f28220b;
        if (viewPager != null) {
            this.f28224f = -1;
            this.f28225g = -1.0f;
            b(viewPager.getCurrentItem(), aVar2);
            requestLayout();
        }
    }

    void b(int i10, androidx.viewpager.widget.a aVar) {
        int count = aVar != null ? aVar.getCount() : 0;
        this.f28228j = true;
        CharSequence pageTitle = null;
        this.f28221c.setText((i10 < 1 || aVar == null) ? null : aVar.getPageTitle(i10 - 1));
        this.f28222d.setText((aVar == null || i10 >= count) ? null : aVar.getPageTitle(i10));
        int i11 = i10 + 1;
        if (i11 < count && aVar != null) {
            pageTitle = aVar.getPageTitle(i11);
        }
        this.f28223e.setText(pageTitle);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, (int) (((getWidth() - getPaddingLeft()) - getPaddingRight()) * 0.8f)), Integer.MIN_VALUE);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(Math.max(0, (getHeight() - getPaddingTop()) - getPaddingBottom()), Integer.MIN_VALUE);
        this.f28221c.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        this.f28222d.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        this.f28223e.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        this.f28224f = i10;
        if (!this.f28229k) {
            c(i10, this.f28225g, false);
        }
        this.f28228j = false;
    }

    void c(int i10, float f10, boolean z10) {
        int i11;
        int i12;
        int i13;
        int i14;
        if (i10 != this.f28224f) {
            b(i10, this.f28220b.getAdapter());
        } else if (!z10 && f10 == this.f28225g) {
            return;
        }
        this.f28229k = true;
        int measuredWidth = this.f28221c.getMeasuredWidth();
        int measuredWidth2 = this.f28222d.getMeasuredWidth();
        int measuredWidth3 = this.f28223e.getMeasuredWidth();
        int i15 = measuredWidth2 / 2;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i16 = paddingRight + i15;
        int i17 = (width - (paddingLeft + i15)) - i16;
        float f11 = 0.5f + f10;
        if (f11 > 1.0f) {
            f11 -= 1.0f;
        }
        int i18 = ((width - i16) - ((int) (i17 * f11))) - i15;
        int i19 = measuredWidth2 + i18;
        int baseline = this.f28221c.getBaseline();
        int baseline2 = this.f28222d.getBaseline();
        int baseline3 = this.f28223e.getBaseline();
        int iMax = Math.max(Math.max(baseline, baseline2), baseline3);
        int i20 = iMax - baseline;
        int i21 = iMax - baseline2;
        int i22 = iMax - baseline3;
        int iMax2 = Math.max(Math.max(this.f28221c.getMeasuredHeight() + i20, this.f28222d.getMeasuredHeight() + i21), this.f28223e.getMeasuredHeight() + i22);
        int i23 = this.f28227i & 112;
        if (i23 != 16) {
            if (i23 != 80) {
                i12 = i20 + paddingTop;
                i13 = i21 + paddingTop;
                i14 = paddingTop + i22;
            } else {
                i11 = (height - paddingBottom) - iMax2;
            }
            TextView textView = this.f28222d;
            textView.layout(i18, i13, i19, textView.getMeasuredHeight() + i13);
            int iMin = Math.min(paddingLeft, (i18 - this.f28226h) - measuredWidth);
            TextView textView2 = this.f28221c;
            textView2.layout(iMin, i12, measuredWidth + iMin, textView2.getMeasuredHeight() + i12);
            int iMax3 = Math.max((width - paddingRight) - measuredWidth3, i19 + this.f28226h);
            TextView textView3 = this.f28223e;
            textView3.layout(iMax3, i14, iMax3 + measuredWidth3, textView3.getMeasuredHeight() + i14);
            this.f28225g = f10;
            this.f28229k = false;
        }
        i11 = (((height - paddingTop) - paddingBottom) - iMax2) / 2;
        i12 = i20 + i11;
        i13 = i21 + i11;
        i14 = i11 + i22;
        TextView textView4 = this.f28222d;
        textView4.layout(i18, i13, i19, textView4.getMeasuredHeight() + i13);
        int iMin2 = Math.min(paddingLeft, (i18 - this.f28226h) - measuredWidth);
        TextView textView5 = this.f28221c;
        textView5.layout(iMin2, i12, measuredWidth + iMin2, textView5.getMeasuredHeight() + i12);
        int iMax4 = Math.max((width - paddingRight) - measuredWidth3, i19 + this.f28226h);
        TextView textView6 = this.f28223e;
        textView6.layout(iMax4, i14, iMax4 + measuredWidth3, textView6.getMeasuredHeight() + i14);
        this.f28225g = f10;
        this.f28229k = false;
    }

    int getMinHeight() {
        Drawable background = getBackground();
        if (background != null) {
            return background.getIntrinsicHeight();
        }
        return 0;
    }

    public int getTextSpacing() {
        return this.f28226h;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (!(parent instanceof ViewPager)) {
            throw new IllegalStateException("PagerTitleStrip must be a direct child of a ViewPager.");
        }
        ViewPager viewPager = (ViewPager) parent;
        androidx.viewpager.widget.a adapter = viewPager.getAdapter();
        viewPager.U(this.f28230l);
        viewPager.b(this.f28230l);
        this.f28220b = viewPager;
        WeakReference<androidx.viewpager.widget.a> weakReference = this.f28231m;
        a(weakReference != null ? weakReference.get() : null, adapter);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ViewPager viewPager = this.f28220b;
        if (viewPager != null) {
            a(viewPager.getAdapter(), null);
            this.f28220b.U(null);
            this.f28220b.N(this.f28230l);
            this.f28220b = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        if (this.f28220b != null) {
            float f10 = this.f28225g;
            if (f10 < 0.0f) {
                f10 = 0.0f;
            }
            c(this.f28224f, f10, true);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        int iMax;
        if (View.MeasureSpec.getMode(i10) != 1073741824) {
            throw new IllegalStateException("Must measure with an exact width");
        }
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i11, paddingTop, -2);
        int size = View.MeasureSpec.getSize(i10);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i10, (int) (size * 0.2f), -2);
        this.f28221c.measure(childMeasureSpec2, childMeasureSpec);
        this.f28222d.measure(childMeasureSpec2, childMeasureSpec);
        this.f28223e.measure(childMeasureSpec2, childMeasureSpec);
        if (View.MeasureSpec.getMode(i11) == 1073741824) {
            iMax = View.MeasureSpec.getSize(i11);
        } else {
            iMax = Math.max(getMinHeight(), this.f28222d.getMeasuredHeight() + paddingTop);
        }
        setMeasuredDimension(size, View.resolveSizeAndState(iMax, i11, this.f28222d.getMeasuredState() << 16));
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.f28228j) {
            return;
        }
        super.requestLayout();
    }

    public void setGravity(int i10) {
        this.f28227i = i10;
        requestLayout();
    }

    public void setNonPrimaryAlpha(@x(from = 0.0d, to = d.f53848a) float f10) {
        int i10 = ((int) (f10 * 255.0f)) & 255;
        this.f28232n = i10;
        int i11 = (i10 << 24) | (this.f28233o & 16777215);
        this.f28221c.setTextColor(i11);
        this.f28223e.setTextColor(i11);
    }

    public void setTextColor(@l int i10) {
        this.f28233o = i10;
        this.f28222d.setTextColor(i10);
        int i11 = (this.f28232n << 24) | (this.f28233o & 16777215);
        this.f28221c.setTextColor(i11);
        this.f28223e.setTextColor(i11);
    }

    public void setTextSize(int i10, float f10) {
        this.f28221c.setTextSize(i10, f10);
        this.f28222d.setTextSize(i10, f10);
        this.f28223e.setTextSize(i10, f10);
    }

    public void setTextSpacing(int i10) {
        this.f28226h = i10;
        requestLayout();
    }
}
