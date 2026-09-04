package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.appcompat.R;
import androidx.core.view.c3;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class DropDownListView extends ListView {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f2474p = -1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f2475q = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Rect f2476b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f2477c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f2478d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f2479e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f2480f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f2481g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Field f2482h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private c f2483i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f2484j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f2485k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f2486l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private c3 f2487m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private androidx.core.widget.l f2488n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    d f2489o;

    @androidx.annotation.w0(21)
    public static class a {
        private a() {
        }

        @androidx.annotation.u
        static void a(View view, float f10, float f11) {
            view.drawableHotspotChanged(f10, f11);
        }
    }

    @androidx.annotation.w0(30)
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static Method f2490a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static Method f2491b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static Method f2492c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static boolean f2493d;

        static {
            try {
                Class cls = Integer.TYPE;
                Class cls2 = Float.TYPE;
                Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, Boolean.TYPE, cls2, cls2);
                f2490a = declaredMethod;
                declaredMethod.setAccessible(true);
                Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
                f2491b = declaredMethod2;
                declaredMethod2.setAccessible(true);
                Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
                f2492c = declaredMethod3;
                declaredMethod3.setAccessible(true);
                f2493d = true;
            } catch (NoSuchMethodException e10) {
                e10.printStackTrace();
            }
        }

        private b() {
        }

        static boolean a() {
            return f2493d;
        }

        @SuppressLint({"BanUncheckedReflection"})
        static void b(DropDownListView dropDownListView, int i10, View view) {
            try {
                f2490a.invoke(dropDownListView, Integer.valueOf(i10), view, Boolean.FALSE, -1, -1);
                f2491b.invoke(dropDownListView, Integer.valueOf(i10));
                f2492c.invoke(dropDownListView, Integer.valueOf(i10));
            } catch (IllegalAccessException e10) {
                e10.printStackTrace();
            } catch (InvocationTargetException e11) {
                e11.printStackTrace();
            }
        }
    }

    public static class c extends androidx.appcompat.graphics.drawable.c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f2494c;

        c(Drawable drawable) {
            super(drawable);
            this.f2494c = true;
        }

        void c(boolean z10) {
            this.f2494c = z10;
        }

        @Override // androidx.appcompat.graphics.drawable.c, android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            if (this.f2494c) {
                super.draw(canvas);
            }
        }

        @Override // androidx.appcompat.graphics.drawable.c, android.graphics.drawable.Drawable
        public void setHotspot(float f10, float f11) {
            if (this.f2494c) {
                super.setHotspot(f10, f11);
            }
        }

        @Override // androidx.appcompat.graphics.drawable.c, android.graphics.drawable.Drawable
        public void setHotspotBounds(int i10, int i11, int i12, int i13) {
            if (this.f2494c) {
                super.setHotspotBounds(i10, i11, i12, i13);
            }
        }

        @Override // androidx.appcompat.graphics.drawable.c, android.graphics.drawable.Drawable
        public boolean setState(int[] iArr) {
            if (this.f2494c) {
                return super.setState(iArr);
            }
            return false;
        }

        @Override // androidx.appcompat.graphics.drawable.c, android.graphics.drawable.Drawable
        public boolean setVisible(boolean z10, boolean z11) {
            if (this.f2494c) {
                return super.setVisible(z10, z11);
            }
            return false;
        }
    }

    public class d implements Runnable {
        d() {
        }

        public void a() {
            DropDownListView dropDownListView = DropDownListView.this;
            dropDownListView.f2489o = null;
            dropDownListView.removeCallbacks(this);
        }

        public void b() {
            DropDownListView.this.post(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            DropDownListView dropDownListView = DropDownListView.this;
            dropDownListView.f2489o = null;
            dropDownListView.drawableStateChanged();
        }
    }

    DropDownListView(@androidx.annotation.n0 Context context, boolean z10) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.f2476b = new Rect();
        this.f2477c = 0;
        this.f2478d = 0;
        this.f2479e = 0;
        this.f2480f = 0;
        this.f2485k = z10;
        setCacheColorHint(0);
        try {
            Field declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.f2482h = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e10) {
            e10.printStackTrace();
        }
    }

    private void a() {
        this.f2486l = false;
        setPressed(false);
        drawableStateChanged();
        View childAt = getChildAt(this.f2481g - getFirstVisiblePosition());
        if (childAt != null) {
            childAt.setPressed(false);
        }
        c3 c3Var = this.f2487m;
        if (c3Var != null) {
            c3Var.d();
            this.f2487m = null;
        }
    }

    private void b(View view, int i10) {
        performItemClick(view, i10, getItemIdAtPosition(i10));
    }

    private void c(Canvas canvas) {
        Drawable selector;
        if (this.f2476b.isEmpty() || (selector = getSelector()) == null) {
            return;
        }
        selector.setBounds(this.f2476b);
        selector.draw(canvas);
    }

    private void g(int i10, View view) {
        Rect rect = this.f2476b;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        rect.left -= this.f2477c;
        rect.top -= this.f2478d;
        rect.right += this.f2479e;
        rect.bottom += this.f2480f;
        try {
            boolean z10 = this.f2482h.getBoolean(this);
            if (view.isEnabled() != z10) {
                this.f2482h.set(this, Boolean.valueOf(!z10));
                if (i10 != -1) {
                    refreshDrawableState();
                }
            }
        } catch (IllegalAccessException e10) {
            e10.printStackTrace();
        }
    }

    private void h(int i10, View view) {
        Drawable selector = getSelector();
        boolean z10 = (selector == null || i10 == -1) ? false : true;
        if (z10) {
            selector.setVisible(false, false);
        }
        g(i10, view);
        if (z10) {
            Rect rect = this.f2476b;
            float fExactCenterX = rect.exactCenterX();
            float fExactCenterY = rect.exactCenterY();
            selector.setVisible(getVisibility() == 0, false);
            androidx.core.graphics.drawable.d.k(selector, fExactCenterX, fExactCenterY);
        }
    }

    private void i(int i10, View view, float f10, float f11) {
        h(i10, view);
        Drawable selector = getSelector();
        if (selector == null || i10 == -1) {
            return;
        }
        androidx.core.graphics.drawable.d.k(selector, f10, f11);
    }

    private void j(View view, int i10, float f10, float f11) {
        View childAt;
        this.f2486l = true;
        a.a(this, f10, f11);
        if (!isPressed()) {
            setPressed(true);
        }
        layoutChildren();
        int i11 = this.f2481g;
        if (i11 != -1 && (childAt = getChildAt(i11 - getFirstVisiblePosition())) != null && childAt != view && childAt.isPressed()) {
            childAt.setPressed(false);
        }
        this.f2481g = i10;
        a.a(view, f10 - view.getLeft(), f11 - view.getTop());
        if (!view.isPressed()) {
            view.setPressed(true);
        }
        i(i10, view, f10, f11);
        setSelectorEnabled(false);
        refreshDrawableState();
    }

    private boolean k() {
        return this.f2486l;
    }

    private void l() {
        Drawable selector = getSelector();
        if (selector != null && k() && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    private void setSelectorEnabled(boolean z10) {
        c cVar = this.f2483i;
        if (cVar != null) {
            cVar.c(z10);
        }
    }

    public int d(int i10, boolean z10) {
        int iMin;
        ListAdapter adapter = getAdapter();
        if (adapter != null && !isInTouchMode()) {
            int count = adapter.getCount();
            if (!getAdapter().areAllItemsEnabled()) {
                if (z10) {
                    iMin = Math.max(0, i10);
                    while (iMin < count && !adapter.isEnabled(iMin)) {
                        iMin++;
                    }
                } else {
                    iMin = Math.min(i10, count - 1);
                    while (iMin >= 0 && !adapter.isEnabled(iMin)) {
                        iMin--;
                    }
                }
                if (iMin < 0 || iMin >= count) {
                    return -1;
                }
                return iMin;
            }
            if (i10 >= 0 && i10 < count) {
                return i10;
            }
        }
        return -1;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        c(canvas);
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        if (this.f2489o != null) {
            return;
        }
        super.drawableStateChanged();
        setSelectorEnabled(true);
        l();
    }

    public int e(int i10, int i11, int i12, int i13, int i14) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int measuredHeight = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        View view = null;
        while (i15 < count) {
            int itemViewType = adapter.getItemViewType(i15);
            if (itemViewType != i16) {
                view = null;
                i16 = itemViewType;
            }
            view = adapter.getView(i15, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i18 = layoutParams.height;
            view.measure(i10, i18 > 0 ? View.MeasureSpec.makeMeasureSpec(i18, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i15 > 0) {
                measuredHeight += dividerHeight;
            }
            measuredHeight += view.getMeasuredHeight();
            if (measuredHeight >= i13) {
                return (i14 < 0 || i15 <= i14 || i17 <= 0 || measuredHeight == i13) ? i13 : i17;
            }
            if (i14 >= 0 && i15 >= i14) {
                i17 = measuredHeight;
            }
            i15++;
        }
        return measuredHeight;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x004a  */
    /* JADX WARN: Code duplicated, block: B:25:0x004f  */
    /* JADX WARN: Code duplicated, block: B:27:0x0053  */
    /* JADX WARN: Code duplicated, block: B:29:0x0065  */
    /* JADX WARN: Code duplicated, block: B:31:0x0069  */
    /* JADX WARN: Code duplicated, block: B:9:0x0011  */
    public boolean f(MotionEvent motionEvent, int i10) {
        boolean z10;
        boolean z11;
        androidx.core.widget.l lVar;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1) {
            z10 = false;
        } else {
            if (actionMasked != 2) {
                if (actionMasked != 3) {
                    z11 = false;
                    z10 = true;
                } else {
                    z11 = false;
                    z10 = false;
                }
                if (z10 || z11) {
                    a();
                }
                if (z10) {
                    if (this.f2488n == null) {
                        this.f2488n = new androidx.core.widget.l(this);
                    }
                    this.f2488n.o(true);
                    this.f2488n.onTouch(this, motionEvent);
                } else {
                    lVar = this.f2488n;
                    if (lVar != null) {
                        lVar.o(false);
                    }
                }
                return z10;
            }
            z10 = true;
        }
        int iFindPointerIndex = motionEvent.findPointerIndex(i10);
        if (iFindPointerIndex < 0) {
            z11 = false;
            z10 = false;
        } else {
            int x10 = (int) motionEvent.getX(iFindPointerIndex);
            int y10 = (int) motionEvent.getY(iFindPointerIndex);
            int iPointToPosition = pointToPosition(x10, y10);
            if (iPointToPosition == -1) {
                z11 = true;
            } else {
                View childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
                j(childAt, iPointToPosition, x10, y10);
                if (actionMasked == 1) {
                    b(childAt, iPointToPosition);
                }
                z11 = false;
                z10 = true;
            }
        }
        if (z10) {
            a();
        } else {
            a();
        }
        if (z10) {
            if (this.f2488n == null) {
                this.f2488n = new androidx.core.widget.l(this);
            }
            this.f2488n.o(true);
            this.f2488n.onTouch(this, motionEvent);
        } else {
            lVar = this.f2488n;
            if (lVar != null) {
                lVar.o(false);
            }
        }
        return z10;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean hasFocus() {
        return this.f2485k || super.hasFocus();
    }

    @Override // android.view.View
    public boolean hasWindowFocus() {
        return this.f2485k || super.hasWindowFocus();
    }

    @Override // android.view.View
    public boolean isFocused() {
        return this.f2485k || super.isFocused();
    }

    @Override // android.view.View
    public boolean isInTouchMode() {
        return (this.f2485k && this.f2484j) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        this.f2489o = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(@androidx.annotation.n0 MotionEvent motionEvent) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f2489o == null) {
            d dVar = new d();
            this.f2489o = dVar;
            dVar.b();
        }
        boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (iPointToPosition != -1 && iPointToPosition != getSelectedItemPosition()) {
                View childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    requestFocus();
                    if (i10 < 30 || !b.a()) {
                        setSelectionFromTop(iPointToPosition, childAt.getTop() - getTop());
                    } else {
                        b.b(this, iPointToPosition, childAt);
                    }
                }
                l();
            }
        } else {
            setSelection(-1);
        }
        return zOnHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f2481g = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        d dVar = this.f2489o;
        if (dVar != null) {
            dVar.a();
        }
        return super.onTouchEvent(motionEvent);
    }

    void setListSelectionHidden(boolean z10) {
        this.f2484j = z10;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        c cVar = drawable != null ? new c(drawable) : null;
        this.f2483i = cVar;
        super.setSelector(cVar);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f2477c = rect.left;
        this.f2478d = rect.top;
        this.f2479e = rect.right;
        this.f2480f = rect.bottom;
    }
}
