package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R;
import androidx.core.view.j1;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class ListPopupWindow implements androidx.appcompat.view.menu.p {
    private static final String H = "ListPopupWindow";
    private static final boolean I = false;
    static final int J = 250;
    private static Method K = null;
    private static Method L = null;
    private static Method M = null;
    public static final int N = 0;
    public static final int O = 1;
    public static final int P = -1;
    public static final int Q = -2;
    public static final int R = 0;
    public static final int S = 1;
    public static final int T = 2;
    private final f A;
    private Runnable B;
    final Handler C;
    private final Rect D;
    private Rect E;
    private boolean F;
    PopupWindow G;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f2523b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ListAdapter f2524c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    DropDownListView f2525d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f2526e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f2527f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f2528g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f2529h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f2530i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f2531j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f2532k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f2533l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f2534m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f2535n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f2536o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    int f2537p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private View f2538q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f2539r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private DataSetObserver f2540s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private View f2541t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private Drawable f2542u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private AdapterView.OnItemClickListener f2543v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private AdapterView.OnItemSelectedListener f2544w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    final j f2545x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final i f2546y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final h f2547z;

    public class a extends f0 {
        a(View view) {
            super(view);
        }

        @Override // androidx.appcompat.widget.f0
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public ListPopupWindow b() {
            return ListPopupWindow.this;
        }
    }

    public class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            View viewU = ListPopupWindow.this.u();
            if (viewU == null || viewU.getWindowToken() == null) {
                return;
            }
            ListPopupWindow.this.show();
        }
    }

    public class c implements AdapterView.OnItemSelectedListener {
        c() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j10) {
            DropDownListView dropDownListView;
            if (i10 == -1 || (dropDownListView = ListPopupWindow.this.f2525d) == null) {
                return;
            }
            dropDownListView.setListSelectionHidden(false);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    @androidx.annotation.w0(24)
    public static class d {
        private d() {
        }

        @androidx.annotation.u
        static int a(PopupWindow popupWindow, View view, int i10, boolean z10) {
            return popupWindow.getMaxAvailableHeight(view, i10, z10);
        }
    }

    @androidx.annotation.w0(29)
    public static class e {
        private e() {
        }

        @androidx.annotation.u
        static void a(PopupWindow popupWindow, Rect rect) {
            popupWindow.setEpicenterBounds(rect);
        }

        @androidx.annotation.u
        static void b(PopupWindow popupWindow, boolean z10) {
            popupWindow.setIsClippedToScreen(z10);
        }
    }

    public class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ListPopupWindow.this.r();
        }
    }

    public class g extends DataSetObserver {
        g() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            if (ListPopupWindow.this.b()) {
                ListPopupWindow.this.show();
            }
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            ListPopupWindow.this.dismiss();
        }
    }

    public class h implements AbsListView.OnScrollListener {
        h() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i10, int i11, int i12) {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i10) {
            if (i10 != 1 || ListPopupWindow.this.J() || ListPopupWindow.this.G.getContentView() == null) {
                return;
            }
            ListPopupWindow listPopupWindow = ListPopupWindow.this;
            listPopupWindow.C.removeCallbacks(listPopupWindow.f2545x);
            ListPopupWindow.this.f2545x.run();
        }
    }

    public class i implements View.OnTouchListener {
        i() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            if (action == 0 && (popupWindow = ListPopupWindow.this.G) != null && popupWindow.isShowing() && x10 >= 0 && x10 < ListPopupWindow.this.G.getWidth() && y10 >= 0 && y10 < ListPopupWindow.this.G.getHeight()) {
                ListPopupWindow listPopupWindow = ListPopupWindow.this;
                listPopupWindow.C.postDelayed(listPopupWindow.f2545x, 250L);
                return false;
            }
            if (action != 1) {
                return false;
            }
            ListPopupWindow listPopupWindow2 = ListPopupWindow.this;
            listPopupWindow2.C.removeCallbacks(listPopupWindow2.f2545x);
            return false;
        }
    }

    public class j implements Runnable {
        j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            DropDownListView dropDownListView = ListPopupWindow.this.f2525d;
            if (dropDownListView == null || !j1.O0(dropDownListView) || ListPopupWindow.this.f2525d.getCount() <= ListPopupWindow.this.f2525d.getChildCount()) {
                return;
            }
            int childCount = ListPopupWindow.this.f2525d.getChildCount();
            ListPopupWindow listPopupWindow = ListPopupWindow.this;
            if (childCount <= listPopupWindow.f2537p) {
                listPopupWindow.G.setInputMethodMode(2);
                ListPopupWindow.this.show();
            }
        }
    }

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                K = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i(H, "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                M = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i(H, "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            try {
                L = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, Boolean.TYPE);
            } catch (NoSuchMethodException unused3) {
                Log.i(H, "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
            }
        }
    }

    public ListPopupWindow(@androidx.annotation.n0 Context context) {
        this(context, null, R.attr.listPopupWindowStyle);
    }

    public ListPopupWindow(@androidx.annotation.n0 Context context, @androidx.annotation.p0 AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listPopupWindowStyle);
    }

    public ListPopupWindow(@androidx.annotation.n0 Context context, @androidx.annotation.p0 AttributeSet attributeSet, @androidx.annotation.f int i10) {
        this(context, attributeSet, i10, 0);
    }

    public ListPopupWindow(@androidx.annotation.n0 Context context, @androidx.annotation.p0 AttributeSet attributeSet, @androidx.annotation.f int i10, @androidx.annotation.e1 int i11) {
        this.f2526e = -2;
        this.f2527f = -2;
        this.f2530i = 1002;
        this.f2534m = 0;
        this.f2535n = false;
        this.f2536o = false;
        this.f2537p = Integer.MAX_VALUE;
        this.f2539r = 0;
        this.f2545x = new j();
        this.f2546y = new i();
        this.f2547z = new h();
        this.A = new f();
        this.D = new Rect();
        this.f2523b = context;
        this.C = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.f1587t, i10, i11);
        this.f2528g = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.ListPopupWindow_android_dropDownHorizontalOffset, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.ListPopupWindow_android_dropDownVerticalOffset, 0);
        this.f2529h = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f2531j = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        AppCompatPopupWindow appCompatPopupWindow = new AppCompatPopupWindow(context, attributeSet, i10, i11);
        this.G = appCompatPopupWindow;
        appCompatPopupWindow.setInputMethodMode(1);
    }

    private static boolean H(int i10) {
        return i10 == 66 || i10 == 23;
    }

    private void Q() {
        View view = this.f2538q;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f2538q);
            }
        }
    }

    private void h0(boolean z10) {
        if (Build.VERSION.SDK_INT > 28) {
            e.b(this.G, z10);
            return;
        }
        Method method = K;
        if (method != null) {
            try {
                method.invoke(this.G, Boolean.valueOf(z10));
            } catch (Exception unused) {
                Log.i(H, "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
        }
    }

    private int q() {
        int measuredHeight;
        int i10;
        int iMakeMeasureSpec;
        View view;
        int i11;
        if (this.f2525d == null) {
            Context context = this.f2523b;
            this.B = new b();
            DropDownListView dropDownListViewT = t(context, !this.F);
            this.f2525d = dropDownListViewT;
            Drawable drawable = this.f2542u;
            if (drawable != null) {
                dropDownListViewT.setSelector(drawable);
            }
            this.f2525d.setAdapter(this.f2524c);
            this.f2525d.setOnItemClickListener(this.f2543v);
            this.f2525d.setFocusable(true);
            this.f2525d.setFocusableInTouchMode(true);
            this.f2525d.setOnItemSelectedListener(new c());
            this.f2525d.setOnScrollListener(this.f2547z);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f2544w;
            if (onItemSelectedListener != null) {
                this.f2525d.setOnItemSelectedListener(onItemSelectedListener);
            }
            DropDownListView dropDownListView = this.f2525d;
            View view2 = this.f2538q;
            if (view2 != null) {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0, 1.0f);
                int i12 = this.f2539r;
                if (i12 == 0) {
                    linearLayout.addView(view2);
                    linearLayout.addView(dropDownListView, layoutParams);
                } else if (i12 != 1) {
                    Log.e(H, "Invalid hint position " + this.f2539r);
                } else {
                    linearLayout.addView(dropDownListView, layoutParams);
                    linearLayout.addView(view2);
                }
                int i13 = this.f2527f;
                if (i13 >= 0) {
                    i11 = Integer.MIN_VALUE;
                } else {
                    i13 = 0;
                    i11 = 0;
                }
                view2.measure(View.MeasureSpec.makeMeasureSpec(i13, i11), 0);
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) view2.getLayoutParams();
                measuredHeight = view2.getMeasuredHeight() + layoutParams2.topMargin + layoutParams2.bottomMargin;
                view = linearLayout;
            } else {
                measuredHeight = 0;
                view = dropDownListView;
            }
            this.G.setContentView(view);
        } else {
            View view3 = this.f2538q;
            if (view3 != null) {
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) view3.getLayoutParams();
                measuredHeight = view3.getMeasuredHeight() + layoutParams3.topMargin + layoutParams3.bottomMargin;
            } else {
                measuredHeight = 0;
            }
        }
        Drawable background = this.G.getBackground();
        if (background != null) {
            background.getPadding(this.D);
            Rect rect = this.D;
            int i14 = rect.top;
            i10 = rect.bottom + i14;
            if (!this.f2531j) {
                this.f2529h = -i14;
            }
        } else {
            this.D.setEmpty();
            i10 = 0;
        }
        int iZ = z(u(), this.f2529h, this.G.getInputMethodMode() == 2);
        if (this.f2535n || this.f2526e == -1) {
            return iZ + i10;
        }
        int i15 = this.f2527f;
        if (i15 == -2) {
            int i16 = this.f2523b.getResources().getDisplayMetrics().widthPixels;
            Rect rect2 = this.D;
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i16 - (rect2.left + rect2.right), Integer.MIN_VALUE);
        } else if (i15 != -1) {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i15, 1073741824);
        } else {
            int i17 = this.f2523b.getResources().getDisplayMetrics().widthPixels;
            Rect rect3 = this.D;
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i17 - (rect3.left + rect3.right), 1073741824);
        }
        int iE = this.f2525d.e(iMakeMeasureSpec, 0, -1, iZ - measuredHeight, -1);
        if (iE > 0) {
            measuredHeight += i10 + this.f2525d.getPaddingTop() + this.f2525d.getPaddingBottom();
        }
        return iE + measuredHeight;
    }

    private int z(View view, int i10, boolean z10) {
        if (Build.VERSION.SDK_INT > 23) {
            return d.a(this.G, view, i10, z10);
        }
        Method method = L;
        if (method != null) {
            try {
                return ((Integer) method.invoke(this.G, view, Integer.valueOf(i10), Boolean.valueOf(z10))).intValue();
            } catch (Exception unused) {
                Log.i(H, "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
            }
        }
        return this.G.getMaxAvailableHeight(view, i10);
    }

    public int A() {
        return this.f2539r;
    }

    @androidx.annotation.p0
    public Object B() {
        if (b()) {
            return this.f2525d.getSelectedItem();
        }
        return null;
    }

    public long C() {
        if (b()) {
            return this.f2525d.getSelectedItemId();
        }
        return Long.MIN_VALUE;
    }

    public int D() {
        if (b()) {
            return this.f2525d.getSelectedItemPosition();
        }
        return -1;
    }

    @androidx.annotation.p0
    public View E() {
        if (b()) {
            return this.f2525d.getSelectedView();
        }
        return null;
    }

    public int F() {
        return this.G.getSoftInputMode();
    }

    public int G() {
        return this.f2527f;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public boolean I() {
        return this.f2535n;
    }

    public boolean J() {
        return this.G.getInputMethodMode() == 2;
    }

    public boolean K() {
        return this.F;
    }

    public boolean L(int i10, @androidx.annotation.n0 KeyEvent keyEvent) {
        if (b() && i10 != 62 && (this.f2525d.getSelectedItemPosition() >= 0 || !H(i10))) {
            int selectedItemPosition = this.f2525d.getSelectedItemPosition();
            boolean z10 = !this.G.isAboveAnchor();
            ListAdapter listAdapter = this.f2524c;
            int i11 = Integer.MAX_VALUE;
            int i12 = Integer.MIN_VALUE;
            if (listAdapter != null) {
                boolean zAreAllItemsEnabled = listAdapter.areAllItemsEnabled();
                int iD = zAreAllItemsEnabled ? 0 : this.f2525d.d(0, true);
                int count = zAreAllItemsEnabled ? listAdapter.getCount() - 1 : this.f2525d.d(listAdapter.getCount() - 1, false);
                i11 = iD;
                i12 = count;
            }
            if ((z10 && i10 == 19 && selectedItemPosition <= i11) || (!z10 && i10 == 20 && selectedItemPosition >= i12)) {
                r();
                this.G.setInputMethodMode(1);
                show();
                return true;
            }
            this.f2525d.setListSelectionHidden(false);
            if (this.f2525d.onKeyDown(i10, keyEvent)) {
                this.G.setInputMethodMode(2);
                this.f2525d.requestFocusFromTouch();
                show();
                if (i10 == 19 || i10 == 20 || i10 == 23 || i10 == 66) {
                    return true;
                }
            } else if (z10 && i10 == 20) {
                if (selectedItemPosition == i12) {
                    return true;
                }
            } else if (!z10 && i10 == 19 && selectedItemPosition == i11) {
                return true;
            }
        }
        return false;
    }

    public boolean M(int i10, @androidx.annotation.n0 KeyEvent keyEvent) {
        if (i10 != 4 || !b()) {
            return false;
        }
        View view = this.f2541t;
        if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
            KeyEvent.DispatcherState keyDispatcherState = view.getKeyDispatcherState();
            if (keyDispatcherState != null) {
                keyDispatcherState.startTracking(keyEvent, this);
            }
            return true;
        }
        if (keyEvent.getAction() != 1) {
            return false;
        }
        KeyEvent.DispatcherState keyDispatcherState2 = view.getKeyDispatcherState();
        if (keyDispatcherState2 != null) {
            keyDispatcherState2.handleUpEvent(keyEvent);
        }
        if (!keyEvent.isTracking() || keyEvent.isCanceled()) {
            return false;
        }
        dismiss();
        return true;
    }

    public boolean N(int i10, @androidx.annotation.n0 KeyEvent keyEvent) {
        if (!b() || this.f2525d.getSelectedItemPosition() < 0) {
            return false;
        }
        boolean zOnKeyUp = this.f2525d.onKeyUp(i10, keyEvent);
        if (zOnKeyUp && H(i10)) {
            dismiss();
        }
        return zOnKeyUp;
    }

    public boolean O(int i10) {
        if (!b()) {
            return false;
        }
        if (this.f2543v == null) {
            return true;
        }
        DropDownListView dropDownListView = this.f2525d;
        this.f2543v.onItemClick(dropDownListView, dropDownListView.getChildAt(i10 - dropDownListView.getFirstVisiblePosition()), i10, dropDownListView.getAdapter().getItemId(i10));
        return true;
    }

    public void P() {
        this.C.post(this.B);
    }

    public void R(@androidx.annotation.p0 View view) {
        this.f2541t = view;
    }

    public void S(@androidx.annotation.e1 int i10) {
        this.G.setAnimationStyle(i10);
    }

    public void T(int i10) {
        Drawable background = this.G.getBackground();
        if (background == null) {
            m0(i10);
            return;
        }
        background.getPadding(this.D);
        Rect rect = this.D;
        this.f2527f = rect.left + rect.right + i10;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void U(boolean z10) {
        this.f2535n = z10;
    }

    public void V(int i10) {
        this.f2534m = i10;
    }

    public void W(@androidx.annotation.p0 Rect rect) {
        this.E = rect != null ? new Rect(rect) : null;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void X(boolean z10) {
        this.f2536o = z10;
    }

    public void Y(int i10) {
        if (i10 < 0 && -2 != i10 && -1 != i10) {
            throw new IllegalArgumentException("Invalid height. Must be a positive value, MATCH_PARENT, or WRAP_CONTENT.");
        }
        this.f2526e = i10;
    }

    public void Z(int i10) {
        this.G.setInputMethodMode(i10);
    }

    public void a(@androidx.annotation.p0 Drawable drawable) {
        this.G.setBackgroundDrawable(drawable);
    }

    void a0(int i10) {
        this.f2537p = i10;
    }

    @Override // androidx.appcompat.view.menu.p
    public boolean b() {
        return this.G.isShowing();
    }

    public void b0(Drawable drawable) {
        this.f2542u = drawable;
    }

    public void c0(boolean z10) {
        this.F = z10;
        this.G.setFocusable(z10);
    }

    @androidx.annotation.p0
    public Drawable d() {
        return this.G.getBackground();
    }

    public void d0(@androidx.annotation.p0 PopupWindow.OnDismissListener onDismissListener) {
        this.G.setOnDismissListener(onDismissListener);
    }

    @Override // androidx.appcompat.view.menu.p
    public void dismiss() {
        this.G.dismiss();
        Q();
        this.G.setContentView(null);
        this.f2525d = null;
        this.C.removeCallbacks(this.f2545x);
    }

    public void e(int i10) {
        this.f2529h = i10;
        this.f2531j = true;
    }

    public void e0(@androidx.annotation.p0 AdapterView.OnItemClickListener onItemClickListener) {
        this.f2543v = onItemClickListener;
    }

    public void f0(@androidx.annotation.p0 AdapterView.OnItemSelectedListener onItemSelectedListener) {
        this.f2544w = onItemSelectedListener;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void g0(boolean z10) {
        this.f2533l = true;
        this.f2532k = z10;
    }

    public int h() {
        if (this.f2531j) {
            return this.f2529h;
        }
        return 0;
    }

    public void i0(int i10) {
        this.f2539r = i10;
    }

    @Override // androidx.appcompat.view.menu.p
    @androidx.annotation.p0
    public ListView j() {
        return this.f2525d;
    }

    public void j0(@androidx.annotation.p0 View view) {
        boolean zB = b();
        if (zB) {
            Q();
        }
        this.f2538q = view;
        if (zB) {
            show();
        }
    }

    public int k() {
        return this.f2528g;
    }

    public void k0(int i10) {
        DropDownListView dropDownListView = this.f2525d;
        if (!b() || dropDownListView == null) {
            return;
        }
        dropDownListView.setListSelectionHidden(false);
        dropDownListView.setSelection(i10);
        if (dropDownListView.getChoiceMode() != 0) {
            dropDownListView.setItemChecked(i10, true);
        }
    }

    public void l(int i10) {
        this.f2528g = i10;
    }

    public void l0(int i10) {
        this.G.setSoftInputMode(i10);
    }

    public void m0(int i10) {
        this.f2527f = i10;
    }

    public void n0(int i10) {
        this.f2530i = i10;
    }

    public void p(@androidx.annotation.p0 ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.f2540s;
        if (dataSetObserver == null) {
            this.f2540s = new g();
        } else {
            ListAdapter listAdapter2 = this.f2524c;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f2524c = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f2540s);
        }
        DropDownListView dropDownListView = this.f2525d;
        if (dropDownListView != null) {
            dropDownListView.setAdapter(this.f2524c);
        }
    }

    public void r() {
        DropDownListView dropDownListView = this.f2525d;
        if (dropDownListView != null) {
            dropDownListView.setListSelectionHidden(true);
            dropDownListView.requestLayout();
        }
    }

    public View.OnTouchListener s(View view) {
        return new a(view);
    }

    @Override // androidx.appcompat.view.menu.p
    public void show() {
        int iQ = q();
        boolean zJ = J();
        androidx.core.widget.o.d(this.G, this.f2530i);
        if (this.G.isShowing()) {
            if (j1.O0(u())) {
                int width = this.f2527f;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = u().getWidth();
                }
                int i10 = this.f2526e;
                if (i10 == -1) {
                    if (!zJ) {
                        iQ = -1;
                    }
                    if (zJ) {
                        this.G.setWidth(this.f2527f == -1 ? -1 : 0);
                        this.G.setHeight(0);
                    } else {
                        this.G.setWidth(this.f2527f == -1 ? -1 : 0);
                        this.G.setHeight(-1);
                    }
                } else if (i10 != -2) {
                    iQ = i10;
                }
                this.G.setOutsideTouchable((this.f2536o || this.f2535n) ? false : true);
                this.G.update(u(), this.f2528g, this.f2529h, width < 0 ? -1 : width, iQ < 0 ? -1 : iQ);
                return;
            }
            return;
        }
        int width2 = this.f2527f;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = u().getWidth();
        }
        int i11 = this.f2526e;
        if (i11 == -1) {
            iQ = -1;
        } else if (i11 != -2) {
            iQ = i11;
        }
        this.G.setWidth(width2);
        this.G.setHeight(iQ);
        h0(true);
        this.G.setOutsideTouchable((this.f2536o || this.f2535n) ? false : true);
        this.G.setTouchInterceptor(this.f2546y);
        if (this.f2533l) {
            androidx.core.widget.o.c(this.G, this.f2532k);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = M;
            if (method != null) {
                try {
                    method.invoke(this.G, this.E);
                } catch (Exception e10) {
                    Log.e(H, "Could not invoke setEpicenterBounds on PopupWindow", e10);
                }
            }
        } else {
            e.a(this.G, this.E);
        }
        androidx.core.widget.o.e(this.G, u(), this.f2528g, this.f2529h, this.f2534m);
        this.f2525d.setSelection(-1);
        if (!this.F || this.f2525d.isInTouchMode()) {
            r();
        }
        if (this.F) {
            return;
        }
        this.C.post(this.A);
    }

    @androidx.annotation.n0
    DropDownListView t(Context context, boolean z10) {
        return new DropDownListView(context, z10);
    }

    @androidx.annotation.p0
    public View u() {
        return this.f2541t;
    }

    @androidx.annotation.e1
    public int v() {
        return this.G.getAnimationStyle();
    }

    @androidx.annotation.p0
    public Rect w() {
        if (this.E != null) {
            return new Rect(this.E);
        }
        return null;
    }

    public int x() {
        return this.f2526e;
    }

    public int y() {
        return this.G.getInputMethodMode();
    }
}
