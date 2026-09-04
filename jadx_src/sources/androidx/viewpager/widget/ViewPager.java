package androidx.viewpager.widget;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.t0;
import androidx.annotation.v;
import androidx.core.view.accessibility.a0;
import androidx.core.view.j1;
import androidx.core.view.n3;
import androidx.core.view.z0;
import androidx.customview.view.AbsSavedState;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class ViewPager extends ViewGroup {
    private static final String G2 = "ViewPager";
    private static final boolean G3 = false;
    private static final int J3 = 1;
    private static final int K3 = 600;
    private static final int L3 = 25;
    private static final int M3 = 16;
    private static final int N3 = 400;
    private static final int R3 = -1;
    private static final int S3 = 2;
    private static final int T3 = 0;
    private static final int U3 = 1;
    private static final int V3 = 2;
    public static final int X3 = 0;
    public static final int Y3 = 1;
    public static final int Z3 = 2;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    private static final boolean f28237p3 = false;
    private boolean A;
    private int B;
    private int C;
    private int D;
    private float E;
    private float F;
    private float G;
    private float H;
    private int I;
    private VelocityTracker J;
    private int K;
    private int L;
    private int M;
    private int N;
    private boolean O;
    private long P;
    private EdgeEffect Q;
    private EdgeEffect R;
    private boolean S;
    private boolean T;
    private boolean U;
    private int V;
    private List<i> W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private i f28238a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f28239b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private i f28240b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayList<f> f28241c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private List<h> f28242c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final f f28243d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Rect f28244e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    androidx.viewpager.widget.a f28245f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f28246g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f28247h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Parcelable f28248i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private ClassLoader f28249j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Scroller f28250k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f28251l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private k f28252m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f28253n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Drawable f28254o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f28255p;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private j f28256p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    private ArrayList<View> f28257p2;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f28258q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private float f28259r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private float f28260s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f28261t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f28262u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f28263v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f28264w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f28265x;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    private int f28266x1;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private final Runnable f28267x2;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f28268y;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    private int f28269y1;

    /* JADX INFO: renamed from: y2, reason: collision with root package name */
    private int f28270y2;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f28271z;
    static final int[] O3 = {R.attr.layout_gravity};
    private static final Comparator<f> P3 = new a();
    private static final Interpolator Q3 = new b();
    private static final m W3 = new m();

    public static class LayoutParams extends ViewGroup.LayoutParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f28272a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f28273b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        float f28274c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f28275d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f28276e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f28277f;

        public LayoutParams() {
            super(-1, -1);
            this.f28274c = 0.0f;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f28274c = 0.0f;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ViewPager.O3);
            this.f28273b = typedArrayObtainStyledAttributes.getInteger(0, 48);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f28278b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Parcelable f28279c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        ClassLoader f28280d;

        public static final class a implements Parcelable.ClassLoaderCreator<SavedState> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.f28278b = parcel.readInt();
            this.f28279c = parcel.readParcelable(classLoader);
            this.f28280d = classLoader;
        }

        public SavedState(@n0 Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.f28278b + z5.g.f141884d;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f28278b);
            parcel.writeParcelable(this.f28279c, i10);
        }
    }

    public static final class a implements Comparator<f> {
        a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(f fVar, f fVar2) {
            return fVar.f28285b - fVar2.f28285b;
        }
    }

    public static final class b implements Interpolator {
        b() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            float f11 = f10 - 1.0f;
            return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    }

    public class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewPager.this.setScrollState(0);
            ViewPager.this.J();
        }
    }

    public class d implements z0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Rect f28282b = new Rect();

        d() {
        }

        @Override // androidx.core.view.z0
        public n3 a(View view, n3 n3Var) {
            n3 n3VarG1 = j1.g1(view, n3Var);
            if (n3VarG1.A()) {
                return n3VarG1;
            }
            Rect rect = this.f28282b;
            rect.left = n3VarG1.p();
            rect.top = n3VarG1.r();
            rect.right = n3VarG1.q();
            rect.bottom = n3VarG1.o();
            int childCount = ViewPager.this.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                n3 n3VarP = j1.p(ViewPager.this.getChildAt(i10), n3VarG1);
                rect.left = Math.min(n3VarP.p(), rect.left);
                rect.top = Math.min(n3VarP.r(), rect.top);
                rect.right = Math.min(n3VarP.q(), rect.right);
                rect.bottom = Math.min(n3VarP.o(), rect.bottom);
            }
            return n3VarG1.D(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    @Target({ElementType.TYPE})
    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    public @interface e {
    }

    public static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f28284a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f28285b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f28286c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        float f28287d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        float f28288e;

        f() {
        }
    }

    public class g extends androidx.core.view.a {
        g() {
        }

        private boolean a() {
            androidx.viewpager.widget.a aVar = ViewPager.this.f28245f;
            return aVar != null && aVar.getCount() > 1;
        }

        @Override // androidx.core.view.a
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            androidx.viewpager.widget.a aVar;
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName(ViewPager.class.getName());
            accessibilityEvent.setScrollable(a());
            if (accessibilityEvent.getEventType() != 4096 || (aVar = ViewPager.this.f28245f) == null) {
                return;
            }
            accessibilityEvent.setItemCount(aVar.getCount());
            accessibilityEvent.setFromIndex(ViewPager.this.f28246g);
            accessibilityEvent.setToIndex(ViewPager.this.f28246g);
        }

        @Override // androidx.core.view.a
        public void onInitializeAccessibilityNodeInfo(View view, a0 a0Var) {
            super.onInitializeAccessibilityNodeInfo(view, a0Var);
            a0Var.b1(ViewPager.class.getName());
            a0Var.M1(a());
            if (ViewPager.this.canScrollHorizontally(1)) {
                a0Var.a(4096);
            }
            if (ViewPager.this.canScrollHorizontally(-1)) {
                a0Var.a(8192);
            }
        }

        @Override // androidx.core.view.a
        public boolean performAccessibilityAction(View view, int i10, Bundle bundle) {
            if (super.performAccessibilityAction(view, i10, bundle)) {
                return true;
            }
            if (i10 == 4096) {
                if (!ViewPager.this.canScrollHorizontally(1)) {
                    return false;
                }
                ViewPager viewPager = ViewPager.this;
                viewPager.setCurrentItem(viewPager.f28246g + 1);
                return true;
            }
            if (i10 != 8192 || !ViewPager.this.canScrollHorizontally(-1)) {
                return false;
            }
            ViewPager viewPager2 = ViewPager.this;
            viewPager2.setCurrentItem(viewPager2.f28246g - 1);
            return true;
        }
    }

    public interface h {
        void b(@n0 ViewPager viewPager, @p0 androidx.viewpager.widget.a aVar, @p0 androidx.viewpager.widget.a aVar2);
    }

    public interface i {
        void onPageScrollStateChanged(int i10);

        void onPageScrolled(int i10, float f10, @t0 int i11);

        void onPageSelected(int i10);
    }

    public interface j {
        void transformPage(@n0 View view, float f10);
    }

    public class k extends DataSetObserver {
        k() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            ViewPager.this.j();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            ViewPager.this.j();
        }
    }

    public static class l implements i {
        @Override // androidx.viewpager.widget.ViewPager.i
        public void onPageScrollStateChanged(int i10) {
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public void onPageScrolled(int i10, float f10, int i11) {
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public void onPageSelected(int i10) {
        }
    }

    public static class m implements Comparator<View> {
        m() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(View view, View view2) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            LayoutParams layoutParams2 = (LayoutParams) view2.getLayoutParams();
            boolean z10 = layoutParams.f28272a;
            if (z10 != layoutParams2.f28272a) {
                return z10 ? 1 : -1;
            }
            return layoutParams.f28276e - layoutParams2.f28276e;
        }
    }

    public ViewPager(@n0 Context context) {
        super(context);
        this.f28241c = new ArrayList<>();
        this.f28243d = new f();
        this.f28244e = new Rect();
        this.f28247h = -1;
        this.f28248i = null;
        this.f28249j = null;
        this.f28259r = -3.4028235E38f;
        this.f28260s = Float.MAX_VALUE;
        this.f28268y = 1;
        this.I = -1;
        this.S = true;
        this.T = false;
        this.f28267x2 = new c();
        this.f28270y2 = 0;
        z();
    }

    public ViewPager(@n0 Context context, @p0 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f28241c = new ArrayList<>();
        this.f28243d = new f();
        this.f28244e = new Rect();
        this.f28247h = -1;
        this.f28248i = null;
        this.f28249j = null;
        this.f28259r = -3.4028235E38f;
        this.f28260s = Float.MAX_VALUE;
        this.f28268y = 1;
        this.I = -1;
        this.S = true;
        this.T = false;
        this.f28267x2 = new c();
        this.f28270y2 = 0;
        z();
    }

    private static boolean A(@n0 View view) {
        return view.getClass().getAnnotation(e.class) != null;
    }

    private boolean C(float f10, float f11) {
        return (f10 < ((float) this.C) && f11 > 0.0f) || (f10 > ((float) (getWidth() - this.C)) && f11 < 0.0f);
    }

    private void E(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.I) {
            int i10 = actionIndex == 0 ? 1 : 0;
            this.E = motionEvent.getX(i10);
            this.I = motionEvent.getPointerId(i10);
            VelocityTracker velocityTracker = this.J;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    private boolean H(int i10) {
        if (this.f28241c.size() == 0) {
            if (this.S) {
                return false;
            }
            this.U = false;
            D(0, 0.0f, 0);
            if (this.U) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        f fVarX = x();
        int clientWidth = getClientWidth();
        int i11 = this.f28253n;
        int i12 = clientWidth + i11;
        float f10 = clientWidth;
        int i13 = fVarX.f28285b;
        float f11 = ((i10 / f10) - fVarX.f28288e) / (fVarX.f28287d + (i11 / f10));
        this.U = false;
        D(i13, f11, (int) (i12 * f11));
        if (this.U) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    private boolean I(float f10) {
        boolean z10;
        boolean z11;
        float f11 = this.E - f10;
        this.E = f10;
        float scrollX = getScrollX() + f11;
        float clientWidth = getClientWidth();
        float f12 = this.f28259r * clientWidth;
        float f13 = this.f28260s * clientWidth;
        boolean z12 = false;
        f fVar = this.f28241c.get(0);
        ArrayList<f> arrayList = this.f28241c;
        f fVar2 = arrayList.get(arrayList.size() - 1);
        if (fVar.f28285b != 0) {
            f12 = fVar.f28288e * clientWidth;
            z10 = false;
        } else {
            z10 = true;
        }
        if (fVar2.f28285b != this.f28245f.getCount() - 1) {
            f13 = fVar2.f28288e * clientWidth;
            z11 = false;
        } else {
            z11 = true;
        }
        if (scrollX < f12) {
            if (z10) {
                this.Q.onPull(Math.abs(f12 - scrollX) / clientWidth);
                z12 = true;
            }
            scrollX = f12;
        } else if (scrollX > f13) {
            if (z11) {
                this.R.onPull(Math.abs(scrollX - f13) / clientWidth);
                z12 = true;
            }
            scrollX = f13;
        }
        int i10 = (int) scrollX;
        this.E += scrollX - i10;
        scrollTo(i10, getScrollY());
        H(i10);
        return z12;
    }

    private void L(int i10, int i11, int i12, int i13) {
        if (i11 > 0 && !this.f28241c.isEmpty()) {
            if (!this.f28250k.isFinished()) {
                this.f28250k.setFinalX(getCurrentItem() * getClientWidth());
                return;
            } else {
                scrollTo((int) ((getScrollX() / (((i11 - getPaddingLeft()) - getPaddingRight()) + i13)) * (((i10 - getPaddingLeft()) - getPaddingRight()) + i12)), getScrollY());
                return;
            }
        }
        f fVarY = y(this.f28246g);
        int iMin = (int) ((fVarY != null ? Math.min(fVarY.f28288e, this.f28260s) : 0.0f) * ((i10 - getPaddingLeft()) - getPaddingRight()));
        if (iMin != getScrollX()) {
            i(false);
            scrollTo(iMin, getScrollY());
        }
    }

    private void M() {
        int i10 = 0;
        while (i10 < getChildCount()) {
            if (!((LayoutParams) getChildAt(i10).getLayoutParams()).f28272a) {
                removeViewAt(i10);
                i10--;
            }
            i10++;
        }
    }

    private void P(boolean z10) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z10);
        }
    }

    private boolean Q() {
        this.I = -1;
        q();
        this.Q.onRelease();
        this.R.onRelease();
        return this.Q.isFinished() || this.R.isFinished();
    }

    private void R(int i10, boolean z10, int i11, boolean z11) {
        f fVarY = y(i10);
        int clientWidth = fVarY != null ? (int) (getClientWidth() * Math.max(this.f28259r, Math.min(fVarY.f28288e, this.f28260s))) : 0;
        if (z10) {
            W(clientWidth, 0, i11);
            if (z11) {
                m(i10);
                return;
            }
            return;
        }
        if (z11) {
            m(i10);
        }
        i(false);
        scrollTo(clientWidth, 0);
        H(clientWidth);
    }

    private void X() {
        if (this.f28269y1 != 0) {
            ArrayList<View> arrayList = this.f28257p2;
            if (arrayList == null) {
                this.f28257p2 = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                this.f28257p2.add(getChildAt(i10));
            }
            Collections.sort(this.f28257p2, W3);
        }
    }

    private void f(f fVar, int i10, f fVar2) {
        int i11;
        int i12;
        f fVar3;
        f fVar4;
        int count = this.f28245f.getCount();
        int clientWidth = getClientWidth();
        float f10 = clientWidth > 0 ? this.f28253n / clientWidth : 0.0f;
        if (fVar2 != null) {
            int i13 = fVar2.f28285b;
            int i14 = fVar.f28285b;
            if (i13 < i14) {
                float pageWidth = fVar2.f28288e + fVar2.f28287d + f10;
                int i15 = i13 + 1;
                int i16 = 0;
                while (i15 <= fVar.f28285b && i16 < this.f28241c.size()) {
                    f fVar5 = this.f28241c.get(i16);
                    while (true) {
                        fVar4 = fVar5;
                        if (i15 <= fVar4.f28285b || i16 >= this.f28241c.size() - 1) {
                            break;
                        }
                        i16++;
                        fVar5 = this.f28241c.get(i16);
                    }
                    while (i15 < fVar4.f28285b) {
                        pageWidth += this.f28245f.getPageWidth(i15) + f10;
                        i15++;
                    }
                    fVar4.f28288e = pageWidth;
                    pageWidth += fVar4.f28287d + f10;
                    i15++;
                }
            } else if (i13 > i14) {
                int size = this.f28241c.size() - 1;
                float pageWidth2 = fVar2.f28288e;
                while (true) {
                    i13--;
                    if (i13 < fVar.f28285b || size < 0) {
                        break;
                    }
                    f fVar6 = this.f28241c.get(size);
                    while (true) {
                        fVar3 = fVar6;
                        if (i13 >= fVar3.f28285b || size <= 0) {
                            break;
                        }
                        size--;
                        fVar6 = this.f28241c.get(size);
                    }
                    while (i13 > fVar3.f28285b) {
                        pageWidth2 -= this.f28245f.getPageWidth(i13) + f10;
                        i13--;
                    }
                    pageWidth2 -= fVar3.f28287d + f10;
                    fVar3.f28288e = pageWidth2;
                }
            }
        }
        int size2 = this.f28241c.size();
        float pageWidth3 = fVar.f28288e;
        int i17 = fVar.f28285b;
        int i18 = i17 - 1;
        this.f28259r = i17 == 0 ? pageWidth3 : -3.4028235E38f;
        int i19 = count - 1;
        this.f28260s = i17 == i19 ? (fVar.f28287d + pageWidth3) - 1.0f : Float.MAX_VALUE;
        int i20 = i10 - 1;
        while (i20 >= 0) {
            f fVar7 = this.f28241c.get(i20);
            while (true) {
                i12 = fVar7.f28285b;
                if (i18 <= i12) {
                    break;
                }
                pageWidth3 -= this.f28245f.getPageWidth(i18) + f10;
                i18--;
            }
            pageWidth3 -= fVar7.f28287d + f10;
            fVar7.f28288e = pageWidth3;
            if (i12 == 0) {
                this.f28259r = pageWidth3;
            }
            i20--;
            i18--;
        }
        float pageWidth4 = fVar.f28288e + fVar.f28287d + f10;
        int i21 = fVar.f28285b + 1;
        int i22 = i10 + 1;
        while (i22 < size2) {
            f fVar8 = this.f28241c.get(i22);
            while (true) {
                i11 = fVar8.f28285b;
                if (i21 >= i11) {
                    break;
                }
                pageWidth4 += this.f28245f.getPageWidth(i21) + f10;
                i21++;
            }
            if (i11 == i19) {
                this.f28260s = (fVar8.f28287d + pageWidth4) - 1.0f;
            }
            fVar8.f28288e = pageWidth4;
            pageWidth4 += fVar8.f28287d + f10;
            i22++;
            i21++;
        }
        this.T = false;
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private void i(boolean z10) {
        boolean z11 = this.f28270y2 == 2;
        if (z11) {
            setScrollingCacheEnabled(false);
            if (!this.f28250k.isFinished()) {
                this.f28250k.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.f28250k.getCurrX();
                int currY = this.f28250k.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        H(currX);
                    }
                }
            }
        }
        this.f28265x = false;
        for (int i10 = 0; i10 < this.f28241c.size(); i10++) {
            f fVar = this.f28241c.get(i10);
            if (fVar.f28286c) {
                fVar.f28286c = false;
                z11 = true;
            }
        }
        if (z11) {
            if (z10) {
                j1.p1(this, this.f28267x2);
            } else {
                this.f28267x2.run();
            }
        }
    }

    private int k(int i10, float f10, int i11, int i12) {
        if (Math.abs(i12) <= this.M || Math.abs(i11) <= this.K) {
            i10 += (int) (f10 + (i10 >= this.f28246g ? 0.4f : 0.6f));
        } else if (i11 <= 0) {
            i10++;
        }
        if (this.f28241c.size() <= 0) {
            return i10;
        }
        f fVar = this.f28241c.get(0);
        ArrayList<f> arrayList = this.f28241c;
        return Math.max(fVar.f28285b, Math.min(i10, arrayList.get(arrayList.size() - 1).f28285b));
    }

    private void l(int i10, float f10, int i11) {
        i iVar = this.f28238a0;
        if (iVar != null) {
            iVar.onPageScrolled(i10, f10, i11);
        }
        List<i> list = this.W;
        if (list != null) {
            int size = list.size();
            for (int i12 = 0; i12 < size; i12++) {
                i iVar2 = this.W.get(i12);
                if (iVar2 != null) {
                    iVar2.onPageScrolled(i10, f10, i11);
                }
            }
        }
        i iVar3 = this.f28240b0;
        if (iVar3 != null) {
            iVar3.onPageScrolled(i10, f10, i11);
        }
    }

    private void m(int i10) {
        i iVar = this.f28238a0;
        if (iVar != null) {
            iVar.onPageSelected(i10);
        }
        List<i> list = this.W;
        if (list != null) {
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                i iVar2 = this.W.get(i11);
                if (iVar2 != null) {
                    iVar2.onPageSelected(i10);
                }
            }
        }
        i iVar3 = this.f28240b0;
        if (iVar3 != null) {
            iVar3.onPageSelected(i10);
        }
    }

    private void n(int i10) {
        i iVar = this.f28238a0;
        if (iVar != null) {
            iVar.onPageScrollStateChanged(i10);
        }
        List<i> list = this.W;
        if (list != null) {
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                i iVar2 = this.W.get(i11);
                if (iVar2 != null) {
                    iVar2.onPageScrollStateChanged(i10);
                }
            }
        }
        i iVar3 = this.f28240b0;
        if (iVar3 != null) {
            iVar3.onPageScrollStateChanged(i10);
        }
    }

    private void p(boolean z10) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            getChildAt(i10).setLayerType(z10 ? this.f28266x1 : 0, null);
        }
    }

    private void q() {
        this.f28271z = false;
        this.A = false;
        VelocityTracker velocityTracker = this.J;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.J = null;
        }
    }

    private void setScrollingCacheEnabled(boolean z10) {
        if (this.f28264w != z10) {
            this.f28264w = z10;
        }
    }

    private Rect u(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left += viewGroup.getLeft();
            rect.right += viewGroup.getRight();
            rect.top += viewGroup.getTop();
            rect.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect;
    }

    private f x() {
        int i10;
        int clientWidth = getClientWidth();
        float f10 = 0.0f;
        float scrollX = clientWidth > 0 ? getScrollX() / clientWidth : 0.0f;
        float f11 = clientWidth > 0 ? this.f28253n / clientWidth : 0.0f;
        f fVar = null;
        int i11 = 0;
        int i12 = -1;
        boolean z10 = true;
        float f12 = 0.0f;
        while (i11 < this.f28241c.size()) {
            f fVar2 = this.f28241c.get(i11);
            if (!z10 && fVar2.f28285b != (i10 = i12 + 1)) {
                fVar2 = this.f28243d;
                fVar2.f28288e = f10 + f12 + f11;
                fVar2.f28285b = i10;
                fVar2.f28287d = this.f28245f.getPageWidth(i10);
                i11--;
            }
            f10 = fVar2.f28288e;
            float f13 = fVar2.f28287d + f10 + f11;
            if (!z10 && scrollX < f10) {
                return fVar;
            }
            if (scrollX < f13 || i11 == this.f28241c.size() - 1) {
                return fVar2;
            }
            i12 = fVar2.f28285b;
            f12 = fVar2.f28287d;
            i11++;
            z10 = false;
            fVar = fVar2;
        }
        return fVar;
    }

    public boolean B() {
        return this.O;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0064  */
    @androidx.annotation.i
    protected void D(int i10, float f10, int i11) {
        int iMax;
        int width;
        int left;
        if (this.V > 0) {
            int scrollX = getScrollX();
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int width2 = getWidth();
            int childCount = getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = getChildAt(i12);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.f28272a) {
                    int i13 = layoutParams.f28273b & 7;
                    if (i13 != 1) {
                        if (i13 == 3) {
                            width = childAt.getWidth() + paddingLeft;
                        } else if (i13 != 5) {
                            width = paddingLeft;
                        } else {
                            iMax = (width2 - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                        }
                        left = (paddingLeft + scrollX) - childAt.getLeft();
                        if (left != 0) {
                            childAt.offsetLeftAndRight(left);
                        }
                        paddingLeft = width;
                    } else {
                        iMax = Math.max((width2 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    }
                    int i14 = iMax;
                    width = paddingLeft;
                    paddingLeft = i14;
                    left = (paddingLeft + scrollX) - childAt.getLeft();
                    if (left != 0) {
                        childAt.offsetLeftAndRight(left);
                    }
                    paddingLeft = width;
                }
            }
        }
        l(i10, f10, i11);
        if (this.f28256p1 != null) {
            int scrollX2 = getScrollX();
            int childCount2 = getChildCount();
            for (int i15 = 0; i15 < childCount2; i15++) {
                View childAt2 = getChildAt(i15);
                if (!((LayoutParams) childAt2.getLayoutParams()).f28272a) {
                    this.f28256p1.transformPage(childAt2, (childAt2.getLeft() - scrollX2) / getClientWidth());
                }
            }
        }
        this.U = true;
    }

    boolean F() {
        int i10 = this.f28246g;
        if (i10 <= 0) {
            return false;
        }
        setCurrentItem(i10 - 1, true);
        return true;
    }

    boolean G() {
        androidx.viewpager.widget.a aVar = this.f28245f;
        if (aVar == null || this.f28246g >= aVar.getCount() - 1) {
            return false;
        }
        setCurrentItem(this.f28246g + 1, true);
        return true;
    }

    void J() {
        K(this.f28246g);
    }

    /* JADX WARN: Code duplicated, block: B:64:0x00f7 A[PHI: r7 r10 r15
  0x00f7: PHI (r7v6 int) = (r7v5 int), (r7v4 int), (r7v9 int) binds: [B:62:0x00ec, B:59:0x00d6, B:53:0x00c0] A[DONT_GENERATE, DONT_INLINE]
  0x00f7: PHI (r10v9 int) = (r10v1 int), (r10v8 int), (r10v12 int) binds: [B:62:0x00ec, B:59:0x00d6, B:53:0x00c0] A[DONT_GENERATE, DONT_INLINE]
  0x00f7: PHI (r15v7 float) = (r15v5 float), (r15v6 float), (r15v4 float) binds: [B:62:0x00ec, B:59:0x00d6, B:53:0x00c0] A[DONT_GENERATE, DONT_INLINE]] */
    void K(int i10) {
        f fVarY;
        String hexString;
        f fVarA;
        f fVarW;
        f fVar;
        int i11 = this.f28246g;
        if (i11 != i10) {
            fVarY = y(i11);
            this.f28246g = i10;
        } else {
            fVarY = null;
        }
        if (this.f28245f == null) {
            X();
            return;
        }
        if (this.f28265x) {
            X();
            return;
        }
        if (getWindowToken() == null) {
            return;
        }
        this.f28245f.startUpdate((ViewGroup) this);
        int i12 = this.f28268y;
        int iMax = Math.max(0, this.f28246g - i12);
        int count = this.f28245f.getCount();
        int iMin = Math.min(count - 1, this.f28246g + i12);
        if (count != this.f28239b) {
            try {
                hexString = getResources().getResourceName(getId());
            } catch (Resources.NotFoundException unused) {
                hexString = Integer.toHexString(getId());
            }
            throw new IllegalStateException("The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: " + this.f28239b + ", found: " + count + " Pager id: " + hexString + " Pager class: " + getClass() + " Problematic adapter: " + this.f28245f.getClass());
        }
        int i13 = 0;
        while (true) {
            if (i13 < this.f28241c.size()) {
                fVarA = this.f28241c.get(i13);
                int i14 = fVarA.f28285b;
                int i15 = this.f28246g;
                if (i14 >= i15) {
                    if (i14 != i15) {
                        break;
                    } else {
                        break;
                    }
                }
                i13++;
            }
            fVarA = null;
            break;
        }
        if (fVarA == null && count > 0) {
            fVarA = a(this.f28246g, i13);
        }
        if (fVarA != null) {
            int i16 = i13 - 1;
            f fVar2 = i16 >= 0 ? this.f28241c.get(i16) : null;
            int clientWidth = getClientWidth();
            float paddingLeft = clientWidth <= 0 ? 0.0f : (2.0f - fVarA.f28287d) + (getPaddingLeft() / clientWidth);
            float f10 = 0.0f;
            for (int i17 = this.f28246g - 1; i17 >= 0; i17--) {
                if (f10 < paddingLeft || i17 >= iMax) {
                    if (fVar2 == null || i17 != fVar2.f28285b) {
                        f10 += a(i17, i16 + 1).f28287d;
                        i13++;
                        if (i16 >= 0) {
                            fVar = this.f28241c.get(i16);
                        } else {
                            fVar = null;
                        }
                    } else {
                        f10 += fVar2.f28287d;
                        i16--;
                        if (i16 >= 0) {
                            fVar = this.f28241c.get(i16);
                        } else {
                            fVar = null;
                        }
                    }
                    fVar2 = fVar;
                } else {
                    if (fVar2 == null) {
                        break;
                    }
                    if (i17 == fVar2.f28285b && !fVar2.f28286c) {
                        this.f28241c.remove(i16);
                        this.f28245f.destroyItem((ViewGroup) this, i17, fVar2.f28284a);
                        i16--;
                        i13--;
                        if (i16 >= 0) {
                            fVar = this.f28241c.get(i16);
                        } else {
                            fVar = null;
                        }
                        fVar2 = fVar;
                    }
                }
            }
            float f11 = fVarA.f28287d;
            int i18 = i13 + 1;
            if (f11 < 2.0f) {
                f fVar3 = i18 < this.f28241c.size() ? this.f28241c.get(i18) : null;
                float paddingRight = clientWidth <= 0 ? 0.0f : (getPaddingRight() / clientWidth) + 2.0f;
                int i19 = this.f28246g;
                while (true) {
                    i19++;
                    if (i19 >= count) {
                        break;
                    }
                    if (f11 >= paddingRight && i19 > iMin) {
                        if (fVar3 == null) {
                            break;
                        }
                        if (i19 == fVar3.f28285b && !fVar3.f28286c) {
                            this.f28241c.remove(i18);
                            this.f28245f.destroyItem((ViewGroup) this, i19, fVar3.f28284a);
                            if (i18 < this.f28241c.size()) {
                                fVar3 = this.f28241c.get(i18);
                            }
                        }
                    } else if (fVar3 == null || i19 != fVar3.f28285b) {
                        f fVarA2 = a(i19, i18);
                        i18++;
                        f11 += fVarA2.f28287d;
                        fVar3 = i18 < this.f28241c.size() ? this.f28241c.get(i18) : null;
                    } else {
                        f11 += fVar3.f28287d;
                        i18++;
                        if (i18 < this.f28241c.size()) {
                            fVar3 = this.f28241c.get(i18);
                        }
                    }
                }
            }
            f(fVarA, i13, fVarY);
            this.f28245f.setPrimaryItem((ViewGroup) this, this.f28246g, fVarA.f28284a);
        }
        this.f28245f.finishUpdate((ViewGroup) this);
        int childCount = getChildCount();
        for (int i20 = 0; i20 < childCount; i20++) {
            View childAt = getChildAt(i20);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            layoutParams.f28277f = i20;
            if (!layoutParams.f28272a && layoutParams.f28274c == 0.0f && (fVarW = w(childAt)) != null) {
                layoutParams.f28274c = fVarW.f28287d;
                layoutParams.f28276e = fVarW.f28285b;
            }
        }
        X();
        if (hasFocus()) {
            View viewFindFocus = findFocus();
            f fVarV = viewFindFocus != null ? v(viewFindFocus) : null;
            if (fVarV == null || fVarV.f28285b != this.f28246g) {
                for (int i21 = 0; i21 < getChildCount(); i21++) {
                    View childAt2 = getChildAt(i21);
                    f fVarW2 = w(childAt2);
                    if (fVarW2 != null && fVarW2.f28285b == this.f28246g && childAt2.requestFocus(2)) {
                        return;
                    }
                }
            }
        }
    }

    public void N(@n0 h hVar) {
        List<h> list = this.f28242c0;
        if (list != null) {
            list.remove(hVar);
        }
    }

    public void O(@n0 i iVar) {
        List<i> list = this.W;
        if (list != null) {
            list.remove(iVar);
        }
    }

    void S(int i10, boolean z10, boolean z11) {
        T(i10, z10, z11, 0);
    }

    void T(int i10, boolean z10, boolean z11, int i11) {
        androidx.viewpager.widget.a aVar = this.f28245f;
        if (aVar == null || aVar.getCount() <= 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (!z11 && this.f28246g == i10 && this.f28241c.size() != 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (i10 < 0) {
            i10 = 0;
        } else if (i10 >= this.f28245f.getCount()) {
            i10 = this.f28245f.getCount() - 1;
        }
        int i12 = this.f28268y;
        int i13 = this.f28246g;
        if (i10 > i13 + i12 || i10 < i13 - i12) {
            for (int i14 = 0; i14 < this.f28241c.size(); i14++) {
                this.f28241c.get(i14).f28286c = true;
            }
        }
        boolean z12 = this.f28246g != i10;
        if (!this.S) {
            K(i10);
            R(i10, z10, i11, z12);
        } else {
            this.f28246g = i10;
            if (z12) {
                m(i10);
            }
            requestLayout();
        }
    }

    i U(i iVar) {
        i iVar2 = this.f28240b0;
        this.f28240b0 = iVar;
        return iVar2;
    }

    void V(int i10, int i11) {
        W(i10, i11, 0);
    }

    void W(int i10, int i11, int i12) {
        int scrollX;
        int iAbs;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        Scroller scroller = this.f28250k;
        if ((scroller == null || scroller.isFinished()) ? false : true) {
            scrollX = this.f28251l ? this.f28250k.getCurrX() : this.f28250k.getStartX();
            this.f28250k.abortAnimation();
            setScrollingCacheEnabled(false);
        } else {
            scrollX = getScrollX();
        }
        int i13 = scrollX;
        int scrollY = getScrollY();
        int i14 = i10 - i13;
        int i15 = i11 - scrollY;
        if (i14 == 0 && i15 == 0) {
            i(false);
            J();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        int i16 = clientWidth / 2;
        float f10 = clientWidth;
        float f11 = i16;
        float fO = f11 + (o(Math.min(1.0f, (Math.abs(i14) * 1.0f) / f10)) * f11);
        int iAbs2 = Math.abs(i12);
        if (iAbs2 > 0) {
            iAbs = Math.round(Math.abs(fO / iAbs2) * 1000.0f) * 4;
        } else {
            iAbs = (int) (((Math.abs(i14) / ((f10 * this.f28245f.getPageWidth(this.f28246g)) + this.f28253n)) + 1.0f) * 100.0f);
        }
        int iMin = Math.min(iAbs, 600);
        this.f28251l = false;
        this.f28250k.startScroll(i13, scrollY, i14, i15, iMin);
        j1.n1(this);
    }

    f a(int i10, int i11) {
        f fVar = new f();
        fVar.f28285b = i10;
        fVar.f28284a = this.f28245f.instantiateItem((ViewGroup) this, i10);
        fVar.f28287d = this.f28245f.getPageWidth(i10);
        if (i11 < 0 || i11 >= this.f28241c.size()) {
            this.f28241c.add(fVar);
        } else {
            this.f28241c.add(i11, fVar);
        }
        return fVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i10, int i11) {
        f fVarW;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i12 = 0; i12 < getChildCount(); i12++) {
                View childAt = getChildAt(i12);
                if (childAt.getVisibility() == 0 && (fVarW = w(childAt)) != null && fVarW.f28285b == this.f28246g) {
                    childAt.addFocusables(arrayList, i10, i11);
                }
            }
        }
        if ((descendantFocusability != 262144 || size == arrayList.size()) && isFocusable()) {
            if ((i11 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
                return;
            }
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addTouchables(ArrayList<View> arrayList) {
        f fVarW;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 0 && (fVarW = w(childAt)) != null && fVarW.f28285b == this.f28246g) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        LayoutParams layoutParams2 = (LayoutParams) layoutParams;
        boolean zA = layoutParams2.f28272a | A(view);
        layoutParams2.f28272a = zA;
        if (!this.f28263v) {
            super.addView(view, i10, layoutParams);
        } else {
            if (zA) {
                throw new IllegalStateException("Cannot add pager decor view during layout");
            }
            layoutParams2.f28275d = true;
            addViewInLayout(view, i10, layoutParams);
        }
    }

    public void b(@n0 h hVar) {
        if (this.f28242c0 == null) {
            this.f28242c0 = new ArrayList();
        }
        this.f28242c0.add(hVar);
    }

    public void c(@n0 i iVar) {
        if (this.W == null) {
            this.W = new ArrayList();
        }
        this.W.add(iVar);
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i10) {
        if (this.f28245f == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        if (i10 < 0) {
            return scrollX > ((int) (((float) clientWidth) * this.f28259r));
        }
        return i10 > 0 && scrollX < ((int) (((float) clientWidth) * this.f28260s));
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void computeScroll() {
        this.f28251l = true;
        if (this.f28250k.isFinished() || !this.f28250k.computeScrollOffset()) {
            i(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.f28250k.getCurrX();
        int currY = this.f28250k.getCurrY();
        if (scrollX != currX || scrollY != currY) {
            scrollTo(currX, currY);
            if (!H(currX)) {
                this.f28250k.abortAnimation();
                scrollTo(0, currY);
            }
        }
        j1.n1(this);
    }

    public boolean d(int i10) {
        boolean z10;
        boolean zRequestFocus;
        View viewFindFocus = findFocus();
        boolean zF = false;
        if (viewFindFocus == this) {
            viewFindFocus = null;
        } else if (viewFindFocus != null) {
            ViewParent parent = viewFindFocus.getParent();
            while (true) {
                if (!(parent instanceof ViewGroup)) {
                    z10 = false;
                    break;
                }
                if (parent == this) {
                    z10 = true;
                    break;
                }
                parent = parent.getParent();
            }
            if (!z10) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(viewFindFocus.getClass().getSimpleName());
                for (ViewParent parent2 = viewFindFocus.getParent(); parent2 instanceof ViewGroup; parent2 = parent2.getParent()) {
                    sb2.append(" => ");
                    sb2.append(parent2.getClass().getSimpleName());
                }
                Log.e(G2, "arrowScroll tried to find focus based on non-child current focused view " + sb2.toString());
                viewFindFocus = null;
            }
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i10);
        if (viewFindNextFocus != null && viewFindNextFocus != viewFindFocus) {
            if (i10 == 17) {
                zRequestFocus = (viewFindFocus == null || u(this.f28244e, viewFindNextFocus).left < u(this.f28244e, viewFindFocus).left) ? viewFindNextFocus.requestFocus() : F();
            } else if (i10 == 66) {
                zRequestFocus = (viewFindFocus == null || u(this.f28244e, viewFindNextFocus).left > u(this.f28244e, viewFindFocus).left) ? viewFindNextFocus.requestFocus() : G();
            }
            zF = zRequestFocus;
        } else if (i10 == 17 || i10 == 1) {
            zF = F();
        } else if (i10 == 66 || i10 == 2) {
            zF = G();
        }
        if (zF) {
            playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i10));
        }
        return zF;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || s(keyEvent);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        f fVarW;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 0 && (fVarW = w(childAt)) != null && fVarW.f28285b == this.f28246g && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        androidx.viewpager.widget.a aVar;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean zDraw = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (aVar = this.f28245f) != null && aVar.getCount() > 1)) {
            if (!this.Q.isFinished()) {
                int iSave = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate((-height) + getPaddingTop(), this.f28259r * width);
                this.Q.setSize(height, width);
                zDraw = false | this.Q.draw(canvas);
                canvas.restoreToCount(iSave);
            }
            if (!this.R.isFinished()) {
                int iSave2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.f28260s + 1.0f)) * width2);
                this.R.setSize(height2, width2);
                zDraw |= this.R.draw(canvas);
                canvas.restoreToCount(iSave2);
            }
        } else {
            this.Q.finish();
            this.R.finish();
        }
        if (zDraw) {
            j1.n1(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f28254o;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(getDrawableState());
    }

    public boolean e() {
        if (this.f28271z) {
            return false;
        }
        this.O = true;
        setScrollState(1);
        this.E = 0.0f;
        this.G = 0.0f;
        VelocityTracker velocityTracker = this.J;
        if (velocityTracker == null) {
            this.J = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, 0.0f, 0.0f, 0);
        this.J.addMovement(motionEventObtain);
        motionEventObtain.recycle();
        this.P = jUptimeMillis;
        return true;
    }

    protected boolean g(View view, boolean z10, int i10, int i11, int i12) {
        int i13;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i14 = i11 + scrollX;
                if (i14 >= childAt.getLeft() && i14 < childAt.getRight() && (i13 = i12 + scrollY) >= childAt.getTop() && i13 < childAt.getBottom() && g(childAt, true, i10, i14 - childAt.getLeft(), i13 - childAt.getTop())) {
                    return true;
                }
            }
        }
        return z10 && view.canScrollHorizontally(-i10);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    @p0
    public androidx.viewpager.widget.a getAdapter() {
        return this.f28245f;
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i10, int i11) {
        if (this.f28269y1 == 2) {
            i11 = (i10 - 1) - i11;
        }
        return ((LayoutParams) this.f28257p2.get(i11).getLayoutParams()).f28277f;
    }

    public int getCurrentItem() {
        return this.f28246g;
    }

    public int getOffscreenPageLimit() {
        return this.f28268y;
    }

    public int getPageMargin() {
        return this.f28253n;
    }

    public void h() {
        List<i> list = this.W;
        if (list != null) {
            list.clear();
        }
    }

    void j() {
        int count = this.f28245f.getCount();
        this.f28239b = count;
        boolean z10 = this.f28241c.size() < (this.f28268y * 2) + 1 && this.f28241c.size() < count;
        int iMax = this.f28246g;
        int i10 = 0;
        boolean z11 = false;
        while (i10 < this.f28241c.size()) {
            f fVar = this.f28241c.get(i10);
            int itemPosition = this.f28245f.getItemPosition(fVar.f28284a);
            if (itemPosition != -1) {
                if (itemPosition == -2) {
                    this.f28241c.remove(i10);
                    i10--;
                    if (!z11) {
                        this.f28245f.startUpdate((ViewGroup) this);
                        z11 = true;
                    }
                    this.f28245f.destroyItem((ViewGroup) this, fVar.f28285b, fVar.f28284a);
                    int i11 = this.f28246g;
                    if (i11 == fVar.f28285b) {
                        iMax = Math.max(0, Math.min(i11, count - 1));
                    }
                } else {
                    int i12 = fVar.f28285b;
                    if (i12 != itemPosition) {
                        if (i12 == this.f28246g) {
                            iMax = itemPosition;
                        }
                        fVar.f28285b = itemPosition;
                    }
                }
                z10 = true;
            }
            i10++;
        }
        if (z11) {
            this.f28245f.finishUpdate((ViewGroup) this);
        }
        Collections.sort(this.f28241c, P3);
        if (z10) {
            int childCount = getChildCount();
            for (int i13 = 0; i13 < childCount; i13++) {
                LayoutParams layoutParams = (LayoutParams) getChildAt(i13).getLayoutParams();
                if (!layoutParams.f28272a) {
                    layoutParams.f28274c = 0.0f;
                }
            }
            S(iMax, false, true);
            requestLayout();
        }
    }

    float o(float f10) {
        return (float) Math.sin((f10 - 0.5f) * 0.47123894f);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.S = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.f28267x2);
        Scroller scroller = this.f28250k;
        if (scroller != null && !scroller.isFinished()) {
            this.f28250k.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        int i10;
        float f10;
        super.onDraw(canvas);
        if (this.f28253n <= 0 || this.f28254o == null || this.f28241c.size() <= 0 || this.f28245f == null) {
            return;
        }
        int scrollX = getScrollX();
        int width = getWidth();
        float f11 = width;
        float f12 = this.f28253n / f11;
        int i11 = 0;
        f fVar = this.f28241c.get(0);
        float f13 = fVar.f28288e;
        int size = this.f28241c.size();
        int i12 = fVar.f28285b;
        int i13 = this.f28241c.get(size - 1).f28285b;
        while (i12 < i13) {
            while (true) {
                i10 = fVar.f28285b;
                if (i12 <= i10 || i11 >= size) {
                    break;
                }
                i11++;
                fVar = this.f28241c.get(i11);
            }
            if (i12 == i10) {
                float f14 = fVar.f28288e;
                float f15 = fVar.f28287d;
                f10 = (f14 + f15) * f11;
                f13 = f14 + f15 + f12;
            } else {
                float pageWidth = this.f28245f.getPageWidth(i12);
                f10 = (f13 + pageWidth) * f11;
                f13 += pageWidth + f12;
            }
            if (this.f28253n + f10 > scrollX) {
                this.f28254o.setBounds(Math.round(f10), this.f28255p, Math.round(this.f28253n + f10), this.f28258q);
                this.f28254o.draw(canvas);
            }
            if (f10 > scrollX + width) {
                return;
            }
            i12++;
            f12 = f12;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            Q();
            return false;
        }
        if (action != 0) {
            if (this.f28271z) {
                return true;
            }
            if (this.A) {
                return false;
            }
        }
        if (action == 0) {
            float x10 = motionEvent.getX();
            this.G = x10;
            this.E = x10;
            float y10 = motionEvent.getY();
            this.H = y10;
            this.F = y10;
            this.I = motionEvent.getPointerId(0);
            this.A = false;
            this.f28251l = true;
            this.f28250k.computeScrollOffset();
            if (this.f28270y2 != 2 || Math.abs(this.f28250k.getFinalX() - this.f28250k.getCurrX()) <= this.N) {
                i(false);
                this.f28271z = false;
            } else {
                this.f28250k.abortAnimation();
                this.f28265x = false;
                J();
                this.f28271z = true;
                P(true);
                setScrollState(1);
            }
        } else if (action == 2) {
            int i10 = this.I;
            if (i10 != -1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i10);
                float x11 = motionEvent.getX(iFindPointerIndex);
                float f10 = x11 - this.E;
                float fAbs = Math.abs(f10);
                float y11 = motionEvent.getY(iFindPointerIndex);
                float fAbs2 = Math.abs(y11 - this.H);
                if (f10 != 0.0f && !C(this.E, f10) && g(this, false, (int) f10, (int) x11, (int) y11)) {
                    this.E = x11;
                    this.F = y11;
                    this.A = true;
                    return false;
                }
                int i11 = this.D;
                if (fAbs > i11 && fAbs * 0.5f > fAbs2) {
                    this.f28271z = true;
                    P(true);
                    setScrollState(1);
                    float f11 = this.G;
                    float f12 = this.D;
                    this.E = f10 > 0.0f ? f11 + f12 : f11 - f12;
                    this.F = y11;
                    setScrollingCacheEnabled(true);
                } else if (fAbs2 > i11) {
                    this.A = true;
                }
                if (this.f28271z && I(x11)) {
                    j1.n1(this);
                }
            }
        } else if (action == 6) {
            E(motionEvent);
        }
        if (this.J == null) {
            this.J = VelocityTracker.obtain();
        }
        this.J.addMovement(motionEvent);
        return this.f28271z;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0071  */
    /* JADX WARN: Code duplicated, block: B:24:0x0075  */
    /* JADX WARN: Code duplicated, block: B:26:0x0079  */
    /* JADX WARN: Code duplicated, block: B:27:0x007b  */
    /* JADX WARN: Code duplicated, block: B:28:0x0088  */
    /* JADX WARN: Code duplicated, block: B:29:0x008e  */
    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean z11;
        f fVarW;
        int iMax;
        int measuredWidth;
        int iMax2;
        int measuredHeight;
        int childCount = getChildCount();
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int scrollX = getScrollX();
        int i16 = 0;
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt = getChildAt(i17);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.f28272a) {
                    int i18 = layoutParams.f28273b;
                    int i19 = i18 & 7;
                    int i20 = i18 & 112;
                    if (i19 != 1) {
                        if (i19 == 3) {
                            measuredWidth = childAt.getMeasuredWidth() + paddingLeft;
                        } else if (i19 != 5) {
                            measuredWidth = paddingLeft;
                        } else {
                            iMax = (i14 - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                        }
                        if (i20 != 16) {
                            if (i20 != 48) {
                                measuredHeight = childAt.getMeasuredHeight() + paddingTop;
                            } else if (i20 != 80) {
                                measuredHeight = paddingTop;
                            } else {
                                iMax2 = (i15 - paddingBottom) - childAt.getMeasuredHeight();
                                paddingBottom += childAt.getMeasuredHeight();
                            }
                            int i21 = paddingLeft + scrollX;
                            childAt.layout(i21, paddingTop, childAt.getMeasuredWidth() + i21, paddingTop + childAt.getMeasuredHeight());
                            i16++;
                            paddingTop = measuredHeight;
                            paddingLeft = measuredWidth;
                        } else {
                            iMax2 = Math.max((i15 - childAt.getMeasuredHeight()) / 2, paddingTop);
                        }
                        int i22 = iMax2;
                        measuredHeight = paddingTop;
                        paddingTop = i22;
                        int i23 = paddingLeft + scrollX;
                        childAt.layout(i23, paddingTop, childAt.getMeasuredWidth() + i23, paddingTop + childAt.getMeasuredHeight());
                        i16++;
                        paddingTop = measuredHeight;
                        paddingLeft = measuredWidth;
                    } else {
                        iMax = Math.max((i14 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    }
                    int i24 = iMax;
                    measuredWidth = paddingLeft;
                    paddingLeft = i24;
                    if (i20 != 16) {
                        if (i20 != 48) {
                            measuredHeight = childAt.getMeasuredHeight() + paddingTop;
                        } else if (i20 != 80) {
                            measuredHeight = paddingTop;
                        } else {
                            iMax2 = (i15 - paddingBottom) - childAt.getMeasuredHeight();
                            paddingBottom += childAt.getMeasuredHeight();
                        }
                        int i25 = paddingLeft + scrollX;
                        childAt.layout(i25, paddingTop, childAt.getMeasuredWidth() + i25, paddingTop + childAt.getMeasuredHeight());
                        i16++;
                        paddingTop = measuredHeight;
                        paddingLeft = measuredWidth;
                    } else {
                        iMax2 = Math.max((i15 - childAt.getMeasuredHeight()) / 2, paddingTop);
                    }
                    int i26 = iMax2;
                    measuredHeight = paddingTop;
                    paddingTop = i26;
                    int i27 = paddingLeft + scrollX;
                    childAt.layout(i27, paddingTop, childAt.getMeasuredWidth() + i27, paddingTop + childAt.getMeasuredHeight());
                    i16++;
                    paddingTop = measuredHeight;
                    paddingLeft = measuredWidth;
                }
            }
        }
        int i28 = (i14 - paddingLeft) - paddingRight;
        for (int i29 = 0; i29 < childCount; i29++) {
            View childAt2 = getChildAt(i29);
            if (childAt2.getVisibility() != 8) {
                LayoutParams layoutParams2 = (LayoutParams) childAt2.getLayoutParams();
                if (!layoutParams2.f28272a && (fVarW = w(childAt2)) != null) {
                    float f10 = i28;
                    int i30 = ((int) (fVarW.f28288e * f10)) + paddingLeft;
                    if (layoutParams2.f28275d) {
                        layoutParams2.f28275d = false;
                        childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (f10 * layoutParams2.f28274c), 1073741824), View.MeasureSpec.makeMeasureSpec((i15 - paddingTop) - paddingBottom, 1073741824));
                    }
                    childAt2.layout(i30, paddingTop, childAt2.getMeasuredWidth() + i30, childAt2.getMeasuredHeight() + paddingTop);
                }
            }
        }
        this.f28255p = paddingTop;
        this.f28258q = i15 - paddingBottom;
        this.V = i16;
        if (this.S) {
            z11 = false;
            R(this.f28246g, false, 0, false);
        } else {
            z11 = false;
        }
        this.S = z11;
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        LayoutParams layoutParams;
        LayoutParams layoutParams2;
        int i12;
        setMeasuredDimension(View.getDefaultSize(0, i10), View.getDefaultSize(0, i11));
        int measuredWidth = getMeasuredWidth();
        this.C = Math.min(measuredWidth / 10, this.B);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i13 = 0;
        while (true) {
            boolean z10 = true;
            int i14 = 1073741824;
            if (i13 >= childCount) {
                break;
            }
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8 && (layoutParams2 = (LayoutParams) childAt.getLayoutParams()) != null && layoutParams2.f28272a) {
                int i15 = layoutParams2.f28273b;
                int i16 = i15 & 7;
                int i17 = i15 & 112;
                boolean z11 = i17 == 48 || i17 == 80;
                if (i16 != 3 && i16 != 5) {
                    z10 = false;
                }
                int i18 = Integer.MIN_VALUE;
                if (z11) {
                    i12 = Integer.MIN_VALUE;
                    i18 = 1073741824;
                } else {
                    i12 = z10 ? 1073741824 : Integer.MIN_VALUE;
                }
                int i19 = ((ViewGroup.LayoutParams) layoutParams2).width;
                if (i19 != -2) {
                    if (i19 == -1) {
                        i19 = paddingLeft;
                    }
                    i18 = 1073741824;
                } else {
                    i19 = paddingLeft;
                }
                int i20 = ((ViewGroup.LayoutParams) layoutParams2).height;
                if (i20 == -2) {
                    i20 = measuredHeight;
                    i14 = i12;
                } else if (i20 == -1) {
                    i20 = measuredHeight;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i19, i18), View.MeasureSpec.makeMeasureSpec(i20, i14));
                if (z11) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z10) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
            i13++;
        }
        this.f28261t = View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.f28262u = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.f28263v = true;
        J();
        this.f28263v = false;
        int childCount2 = getChildCount();
        for (int i21 = 0; i21 < childCount2; i21++) {
            View childAt2 = getChildAt(i21);
            if (childAt2.getVisibility() != 8 && ((layoutParams = (LayoutParams) childAt2.getLayoutParams()) == null || !layoutParams.f28272a)) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * layoutParams.f28274c), 1073741824), this.f28262u);
            }
        }
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i10, Rect rect) {
        int i11;
        int i12;
        f fVarW;
        int childCount = getChildCount();
        int i13 = -1;
        if ((i10 & 2) != 0) {
            i13 = childCount;
            i11 = 0;
            i12 = 1;
        } else {
            i11 = childCount - 1;
            i12 = -1;
        }
        while (i11 != i13) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() == 0 && (fVarW = w(childAt)) != null && fVarW.f28285b == this.f28246g && childAt.requestFocus(i10, rect)) {
                return true;
            }
            i11 += i12;
        }
        return false;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        androidx.viewpager.widget.a aVar = this.f28245f;
        if (aVar != null) {
            aVar.restoreState(savedState.f28279c, savedState.f28280d);
            S(savedState.f28278b, false, true);
        } else {
            this.f28247h = savedState.f28278b;
            this.f28248i = savedState.f28279c;
            this.f28249j = savedState.f28280d;
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f28278b = this.f28246g;
        androidx.viewpager.widget.a aVar = this.f28245f;
        if (aVar != null) {
            savedState.f28279c = aVar.saveState();
        }
        return savedState;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 != i12) {
            int i14 = this.f28253n;
            L(i10, i12, i14, i14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00dc  */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        androidx.viewpager.widget.a aVar;
        if (this.O) {
            return true;
        }
        boolean zQ = false;
        if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (aVar = this.f28245f) == null || aVar.getCount() == 0) {
            return false;
        }
        if (this.J == null) {
            this.J = VelocityTracker.obtain();
        }
        this.J.addMovement(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.f28250k.abortAnimation();
            this.f28265x = false;
            J();
            float x10 = motionEvent.getX();
            this.G = x10;
            this.E = x10;
            float y10 = motionEvent.getY();
            this.H = y10;
            this.F = y10;
            this.I = motionEvent.getPointerId(0);
        } else if (action != 1) {
            if (action != 2) {
                if (action != 3) {
                    if (action == 5) {
                        int actionIndex = motionEvent.getActionIndex();
                        this.E = motionEvent.getX(actionIndex);
                        this.I = motionEvent.getPointerId(actionIndex);
                    } else if (action == 6) {
                        E(motionEvent);
                        this.E = motionEvent.getX(motionEvent.findPointerIndex(this.I));
                    }
                } else if (this.f28271z) {
                    R(this.f28246g, true, 0, false);
                    zQ = Q();
                }
            } else if (!this.f28271z) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.I);
                if (iFindPointerIndex == -1) {
                    zQ = Q();
                } else {
                    float x11 = motionEvent.getX(iFindPointerIndex);
                    float fAbs = Math.abs(x11 - this.E);
                    float y11 = motionEvent.getY(iFindPointerIndex);
                    float fAbs2 = Math.abs(y11 - this.F);
                    if (fAbs > this.D && fAbs > fAbs2) {
                        this.f28271z = true;
                        P(true);
                        float f10 = this.G;
                        this.E = x11 - f10 > 0.0f ? f10 + this.D : f10 - this.D;
                        this.F = y11;
                        setScrollState(1);
                        setScrollingCacheEnabled(true);
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                    if (this.f28271z) {
                        zQ = false | I(motionEvent.getX(motionEvent.findPointerIndex(this.I)));
                    }
                }
            } else if (this.f28271z) {
                zQ = false | I(motionEvent.getX(motionEvent.findPointerIndex(this.I)));
            }
        } else if (this.f28271z) {
            VelocityTracker velocityTracker = this.J;
            velocityTracker.computeCurrentVelocity(1000, this.L);
            int xVelocity = (int) velocityTracker.getXVelocity(this.I);
            this.f28265x = true;
            int clientWidth = getClientWidth();
            int scrollX = getScrollX();
            f fVarX = x();
            float f11 = clientWidth;
            T(k(fVarX.f28285b, ((scrollX / f11) - fVarX.f28288e) / (fVarX.f28287d + (this.f28253n / f11)), xVelocity, (int) (motionEvent.getX(motionEvent.findPointerIndex(this.I)) - this.G)), true, true, xVelocity);
            zQ = Q();
        }
        if (zQ) {
            j1.n1(this);
        }
        return true;
    }

    public void r() {
        if (!this.O) {
            throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
        }
        if (this.f28245f != null) {
            VelocityTracker velocityTracker = this.J;
            velocityTracker.computeCurrentVelocity(1000, this.L);
            int xVelocity = (int) velocityTracker.getXVelocity(this.I);
            this.f28265x = true;
            int clientWidth = getClientWidth();
            int scrollX = getScrollX();
            f fVarX = x();
            T(k(fVarX.f28285b, ((scrollX / clientWidth) - fVarX.f28288e) / fVarX.f28287d, xVelocity, (int) (this.E - this.G)), true, true, xVelocity);
        }
        q();
        this.O = false;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (this.f28263v) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public boolean s(@n0 KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 21) {
                return keyEvent.hasModifiers(2) ? F() : d(17);
            }
            if (keyCode == 22) {
                return keyEvent.hasModifiers(2) ? G() : d(66);
            }
            if (keyCode == 61) {
                if (keyEvent.hasNoModifiers()) {
                    return d(2);
                }
                if (keyEvent.hasModifiers(1)) {
                    return d(1);
                }
            }
        }
        return false;
    }

    public void setAdapter(@p0 androidx.viewpager.widget.a aVar) {
        androidx.viewpager.widget.a aVar2 = this.f28245f;
        if (aVar2 != null) {
            aVar2.setViewPagerObserver(null);
            this.f28245f.startUpdate((ViewGroup) this);
            for (int i10 = 0; i10 < this.f28241c.size(); i10++) {
                f fVar = this.f28241c.get(i10);
                this.f28245f.destroyItem((ViewGroup) this, fVar.f28285b, fVar.f28284a);
            }
            this.f28245f.finishUpdate((ViewGroup) this);
            this.f28241c.clear();
            M();
            this.f28246g = 0;
            scrollTo(0, 0);
        }
        androidx.viewpager.widget.a aVar3 = this.f28245f;
        this.f28245f = aVar;
        this.f28239b = 0;
        if (aVar != null) {
            if (this.f28252m == null) {
                this.f28252m = new k();
            }
            this.f28245f.setViewPagerObserver(this.f28252m);
            this.f28265x = false;
            boolean z10 = this.S;
            this.S = true;
            this.f28239b = this.f28245f.getCount();
            if (this.f28247h >= 0) {
                this.f28245f.restoreState(this.f28248i, this.f28249j);
                S(this.f28247h, false, true);
                this.f28247h = -1;
                this.f28248i = null;
                this.f28249j = null;
            } else if (z10) {
                requestLayout();
            } else {
                J();
            }
        }
        List<h> list = this.f28242c0;
        if (list == null || list.isEmpty()) {
            return;
        }
        int size = this.f28242c0.size();
        for (int i11 = 0; i11 < size; i11++) {
            this.f28242c0.get(i11).b(this, aVar3, aVar);
        }
    }

    public void setCurrentItem(int i10) {
        this.f28265x = false;
        S(i10, !this.S, false);
    }

    public void setCurrentItem(int i10, boolean z10) {
        this.f28265x = false;
        S(i10, z10, false);
    }

    public void setOffscreenPageLimit(int i10) {
        if (i10 < 1) {
            Log.w(G2, "Requested offscreen page limit " + i10 + " too small; defaulting to 1");
            i10 = 1;
        }
        if (i10 != this.f28268y) {
            this.f28268y = i10;
            J();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(i iVar) {
        this.f28238a0 = iVar;
    }

    public void setPageMargin(int i10) {
        int i11 = this.f28253n;
        this.f28253n = i10;
        int width = getWidth();
        L(width, width, i10, i11);
        requestLayout();
    }

    public void setPageMarginDrawable(@v int i10) {
        setPageMarginDrawable(androidx.core.content.d.i(getContext(), i10));
    }

    public void setPageMarginDrawable(@p0 Drawable drawable) {
        this.f28254o = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setPageTransformer(boolean z10, @p0 j jVar) {
        setPageTransformer(z10, jVar, 2);
    }

    public void setPageTransformer(boolean z10, @p0 j jVar, int i10) {
        boolean z11 = jVar != null;
        boolean z12 = z11 != (this.f28256p1 != null);
        this.f28256p1 = jVar;
        setChildrenDrawingOrderEnabled(z11);
        if (z11) {
            this.f28269y1 = z10 ? 2 : 1;
            this.f28266x1 = i10;
        } else {
            this.f28269y1 = 0;
        }
        if (z12) {
            J();
        }
    }

    void setScrollState(int i10) {
        if (this.f28270y2 == i10) {
            return;
        }
        this.f28270y2 = i10;
        if (this.f28256p1 != null) {
            p(i10 != 0);
        }
        n(i10);
    }

    public void t(float f10) {
        if (!this.O) {
            throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
        }
        if (this.f28245f == null) {
            return;
        }
        this.E += f10;
        float scrollX = getScrollX() - f10;
        float clientWidth = getClientWidth();
        float f11 = this.f28259r * clientWidth;
        float f12 = this.f28260s * clientWidth;
        f fVar = this.f28241c.get(0);
        ArrayList<f> arrayList = this.f28241c;
        f fVar2 = arrayList.get(arrayList.size() - 1);
        if (fVar.f28285b != 0) {
            f11 = fVar.f28288e * clientWidth;
        }
        if (fVar2.f28285b != this.f28245f.getCount() - 1) {
            f12 = fVar2.f28288e * clientWidth;
        }
        if (scrollX < f11) {
            scrollX = f11;
        } else if (scrollX > f12) {
            scrollX = f12;
        }
        int i10 = (int) scrollX;
        this.E += scrollX - i10;
        scrollTo(i10, getScrollY());
        H(i10);
        MotionEvent motionEventObtain = MotionEvent.obtain(this.P, SystemClock.uptimeMillis(), 2, this.E, 0.0f, 0);
        this.J.addMovement(motionEventObtain);
        motionEventObtain.recycle();
    }

    f v(View view) {
        while (true) {
            Object parent = view.getParent();
            if (parent == this) {
                return w(view);
            }
            if (parent == null || !(parent instanceof View)) {
                return null;
            }
            view = (View) parent;
        }
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f28254o;
    }

    f w(View view) {
        for (int i10 = 0; i10 < this.f28241c.size(); i10++) {
            f fVar = this.f28241c.get(i10);
            if (this.f28245f.isViewFromObject(view, fVar.f28284a)) {
                return fVar;
            }
        }
        return null;
    }

    f y(int i10) {
        for (int i11 = 0; i11 < this.f28241c.size(); i11++) {
            f fVar = this.f28241c.get(i11);
            if (fVar.f28285b == i10) {
                return fVar;
            }
        }
        return null;
    }

    void z() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.f28250k = new Scroller(context, Q3);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f10 = context.getResources().getDisplayMetrics().density;
        this.D = viewConfiguration.getScaledPagingTouchSlop();
        this.K = (int) (400.0f * f10);
        this.L = viewConfiguration.getScaledMaximumFlingVelocity();
        this.Q = new EdgeEffect(context);
        this.R = new EdgeEffect(context);
        this.M = (int) (25.0f * f10);
        this.N = (int) (2.0f * f10);
        this.B = (int) (f10 * 16.0f);
        j1.B1(this, new g());
        if (j1.V(this) == 0) {
            j1.R1(this, 1);
        }
        j1.a2(this, new d());
    }
}
