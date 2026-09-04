package androidx.viewpager.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.annotation.l;
import androidx.annotation.n;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.v;
import androidx.core.content.d;
import androidx.core.view.j1;

/* JADX INFO: loaded from: classes6.dex */
public class PagerTabStrip extends PagerTitleStrip {
    private static final String J = "PagerTabStrip";
    private static final int K = 3;
    private static final int L = 6;
    private static final int M = 16;
    private static final int N = 32;
    private static final int O = 64;
    private static final int P = 1;
    private static final int Q = 32;
    private final Rect A;
    private int B;
    private boolean C;
    private boolean D;
    private int E;
    private boolean F;
    private float G;
    private float H;
    private int I;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f28207t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f28208u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f28209v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f28210w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f28211x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f28212y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final Paint f28213z;

    public class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ViewPager viewPager = PagerTabStrip.this.f28220b;
            viewPager.setCurrentItem(viewPager.getCurrentItem() - 1);
        }
    }

    public class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ViewPager viewPager = PagerTabStrip.this.f28220b;
            viewPager.setCurrentItem(viewPager.getCurrentItem() + 1);
        }
    }

    public PagerTabStrip(@n0 Context context) {
        this(context, null);
    }

    public PagerTabStrip(@n0 Context context, @p0 AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint = new Paint();
        this.f28213z = paint;
        this.A = new Rect();
        this.B = 255;
        this.C = false;
        this.D = false;
        int i10 = this.f28233o;
        this.f28207t = i10;
        paint.setColor(i10);
        float f10 = context.getResources().getDisplayMetrics().density;
        this.f28208u = (int) ((3.0f * f10) + 0.5f);
        this.f28209v = (int) ((6.0f * f10) + 0.5f);
        this.f28210w = (int) (64.0f * f10);
        this.f28212y = (int) ((16.0f * f10) + 0.5f);
        this.E = (int) ((1.0f * f10) + 0.5f);
        this.f28211x = (int) ((f10 * 32.0f) + 0.5f);
        this.I = ViewConfiguration.get(context).getScaledTouchSlop();
        setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
        setTextSpacing(getTextSpacing());
        setWillNotDraw(false);
        this.f28221c.setFocusable(true);
        this.f28221c.setOnClickListener(new a());
        this.f28223e.setFocusable(true);
        this.f28223e.setOnClickListener(new b());
        if (getBackground() == null) {
            this.C = true;
        }
    }

    @Override // androidx.viewpager.widget.PagerTitleStrip
    void c(int i10, float f10, boolean z10) {
        Rect rect = this.A;
        int height = getHeight();
        int left = this.f28222d.getLeft() - this.f28212y;
        int right = this.f28222d.getRight() + this.f28212y;
        int i11 = height - this.f28208u;
        rect.set(left, i11, right, height);
        super.c(i10, f10, z10);
        this.B = (int) (Math.abs(f10 - 0.5f) * 2.0f * 255.0f);
        rect.union(this.f28222d.getLeft() - this.f28212y, i11, this.f28222d.getRight() + this.f28212y, height);
        invalidate(rect);
    }

    public boolean getDrawFullUnderline() {
        return this.C;
    }

    @Override // androidx.viewpager.widget.PagerTitleStrip
    int getMinHeight() {
        return Math.max(super.getMinHeight(), this.f28211x);
    }

    @l
    public int getTabIndicatorColor() {
        return this.f28207t;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight();
        int left = this.f28222d.getLeft() - this.f28212y;
        int right = this.f28222d.getRight() + this.f28212y;
        int i10 = height - this.f28208u;
        this.f28213z.setColor((this.B << 24) | (this.f28207t & 16777215));
        float f10 = height;
        canvas.drawRect(left, i10, right, f10, this.f28213z);
        if (this.C) {
            this.f28213z.setColor((-16777216) | (this.f28207t & 16777215));
            canvas.drawRect(getPaddingLeft(), height - this.E, getWidth() - getPaddingRight(), f10, this.f28213z);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0 && this.F) {
            return false;
        }
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        if (action == 0) {
            this.G = x10;
            this.H = y10;
            this.F = false;
        } else if (action != 1) {
            if (action == 2 && (Math.abs(x10 - this.G) > this.I || Math.abs(y10 - this.H) > this.I)) {
                this.F = true;
            }
        } else if (x10 < this.f28222d.getLeft() - this.f28212y) {
            ViewPager viewPager = this.f28220b;
            viewPager.setCurrentItem(viewPager.getCurrentItem() - 1);
        } else if (x10 > this.f28222d.getRight() + this.f28212y) {
            ViewPager viewPager2 = this.f28220b;
            viewPager2.setCurrentItem(viewPager2.getCurrentItem() + 1);
        }
        return true;
    }

    @Override // android.view.View
    public void setBackgroundColor(@l int i10) {
        super.setBackgroundColor(i10);
        if (this.D) {
            return;
        }
        this.C = (i10 & j1.f21601t) == 0;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.D) {
            return;
        }
        this.C = drawable == null;
    }

    @Override // android.view.View
    public void setBackgroundResource(@v int i10) {
        super.setBackgroundResource(i10);
        if (this.D) {
            return;
        }
        this.C = i10 == 0;
    }

    public void setDrawFullUnderline(boolean z10) {
        this.C = z10;
        this.D = true;
        invalidate();
    }

    @Override // android.view.View
    public void setPadding(int i10, int i11, int i12, int i13) {
        int i14 = this.f28209v;
        if (i13 < i14) {
            i13 = i14;
        }
        super.setPadding(i10, i11, i12, i13);
    }

    public void setTabIndicatorColor(@l int i10) {
        this.f28207t = i10;
        this.f28213z.setColor(i10);
        invalidate();
    }

    public void setTabIndicatorColorResource(@n int i10) {
        setTabIndicatorColor(d.f(getContext(), i10));
    }

    @Override // androidx.viewpager.widget.PagerTitleStrip
    public void setTextSpacing(int i10) {
        int i11 = this.f28210w;
        if (i10 < i11) {
            i10 = i11;
        }
        super.setTextSpacing(i10);
    }
}
