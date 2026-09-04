package androidx.core.view;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ClipData;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContentInfo;
import android.view.Display;
import android.view.KeyEvent;
import android.view.OnReceiveContentListener;
import android.view.PointerIcon;
import android.view.View;
import android.view.View$OnUnhandledKeyEventListener;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.annotation.RestrictTo;
import androidx.core.R;
import com.meituan.robust.Constants;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: ViewCompat.java */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"PrivateConstructorForUtilityClass"})
public class j1 {
    public static final int A = 1;
    public static final int B = 1;
    public static final int C = 2;
    public static final int D = 4;
    public static final int E = 8;
    public static final int F = 16;
    public static final int G = 32;
    private static Field I = null;
    private static boolean J = false;
    private static Field K = null;
    private static boolean L = false;
    private static Method M = null;
    private static Method N = null;
    private static boolean O = false;
    private static WeakHashMap<View, String> P = null;
    private static Method R = null;
    private static Field S = null;
    private static ThreadLocal<Rect> U = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f21582a = "ViewCompat";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final int f21583b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final int f21584c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    public static final int f21585d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f21586e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f21587f = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f21588g = 2;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f21589h = 4;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f21590i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f21591j = 1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f21592k = 2;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Deprecated
    public static final int f21593l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Deprecated
    public static final int f21594m = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Deprecated
    public static final int f21595n = 2;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f21596o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f21597p = 1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f21598q = 2;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f21599r = 3;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Deprecated
    public static final int f21600s = 16777215;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Deprecated
    public static final int f21601t = -16777216;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @Deprecated
    public static final int f21602u = 16;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Deprecated
    public static final int f21603v = 16777216;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f21604w = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f21605x = 1;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f21606y = 2;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f21607z = 0;
    private static final AtomicInteger H = new AtomicInteger(1);
    private static WeakHashMap<View, c3> Q = null;
    private static boolean T = false;
    private static final int[] V = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
    private static final b1 W = new b1() { // from class: androidx.core.view.i1
        @Override // androidx.core.view.b1
        public final e a(e eVar) {
            return j1.c1(eVar);
        }
    };
    private static final e X = new e();

    /* JADX INFO: compiled from: ViewCompat.java */
    public class a extends f<Boolean> {
        a(int i10, Class cls, int i11) {
            super(i10, cls, i11);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.j1.f
        @androidx.annotation.w0(28)
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public Boolean d(@androidx.annotation.n0 View view) {
            return Boolean.valueOf(q.d(view));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.j1.f
        @androidx.annotation.w0(28)
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public void e(@androidx.annotation.n0 View view, Boolean bool) {
            q.i(view, bool.booleanValue());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.j1.f
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public boolean h(Boolean bool, Boolean bool2) {
            return !a(bool, bool2);
        }
    }

    /* JADX INFO: compiled from: ViewCompat.java */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface a0 {
    }

    /* JADX INFO: compiled from: ViewCompat.java */
    public class b extends f<CharSequence> {
        b(int i10, Class cls, int i11, int i12) {
            super(i10, cls, i11, i12);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.j1.f
        @androidx.annotation.w0(28)
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public CharSequence d(View view) {
            return q.b(view);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.j1.f
        @androidx.annotation.w0(28)
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public void e(View view, CharSequence charSequence) {
            q.h(view, charSequence);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.j1.f
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public boolean h(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    /* JADX INFO: compiled from: ViewCompat.java */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface b0 {
    }

    /* JADX INFO: compiled from: ViewCompat.java */
    public class c extends f<CharSequence> {
        c(int i10, Class cls, int i11, int i12) {
            super(i10, cls, i11, i12);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.j1.f
        @androidx.annotation.w0(30)
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public CharSequence d(View view) {
            return s.a(view);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.j1.f
        @androidx.annotation.w0(30)
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public void e(View view, CharSequence charSequence) {
            s.c(view, charSequence);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.j1.f
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public boolean h(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    /* JADX INFO: compiled from: ViewCompat.java */
    public static class c0 {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final ArrayList<WeakReference<View>> f21608d = new ArrayList<>();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @androidx.annotation.p0
        private WeakHashMap<View, Boolean> f21609a = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private SparseArray<WeakReference<View>> f21610b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private WeakReference<KeyEvent> f21611c = null;

        c0() {
        }

        static c0 a(View view) {
            int i10 = R.id.tag_unhandled_key_event_manager;
            c0 c0Var = (c0) view.getTag(i10);
            if (c0Var != null) {
                return c0Var;
            }
            c0 c0Var2 = new c0();
            view.setTag(i10, c0Var2);
            return c0Var2;
        }

        @androidx.annotation.p0
        private View c(View view, KeyEvent keyEvent) {
            WeakHashMap<View, Boolean> weakHashMap = this.f21609a;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View viewC = c(viewGroup.getChildAt(childCount), keyEvent);
                        if (viewC != null) {
                            return viewC;
                        }
                    }
                }
                if (e(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        private SparseArray<WeakReference<View>> d() {
            if (this.f21610b == null) {
                this.f21610b = new SparseArray<>();
            }
            return this.f21610b;
        }

        private boolean e(@androidx.annotation.n0 View view, @androidx.annotation.n0 KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_unhandled_key_listeners);
            if (arrayList == null) {
                return false;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (((z) arrayList.get(size)).onUnhandledKeyEvent(view, keyEvent)) {
                    return true;
                }
            }
            return false;
        }

        private void g() {
            WeakHashMap<View, Boolean> weakHashMap = this.f21609a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList<WeakReference<View>> arrayList = f21608d;
            if (arrayList.isEmpty()) {
                return;
            }
            synchronized (arrayList) {
                if (this.f21609a == null) {
                    this.f21609a = new WeakHashMap<>();
                }
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    ArrayList<WeakReference<View>> arrayList2 = f21608d;
                    View view = arrayList2.get(size).get();
                    if (view == null) {
                        arrayList2.remove(size);
                    } else {
                        this.f21609a.put(view, Boolean.TRUE);
                        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                            this.f21609a.put((View) parent, Boolean.TRUE);
                        }
                    }
                }
            }
        }

        static void h(View view) {
            ArrayList<WeakReference<View>> arrayList = f21608d;
            synchronized (arrayList) {
                Iterator<WeakReference<View>> it = arrayList.iterator();
                while (it.hasNext()) {
                    if (it.next().get() == view) {
                        return;
                    }
                }
                f21608d.add(new WeakReference<>(view));
            }
        }

        static void i(View view) {
            synchronized (f21608d) {
                int i10 = 0;
                while (true) {
                    ArrayList<WeakReference<View>> arrayList = f21608d;
                    if (i10 >= arrayList.size()) {
                        return;
                    }
                    if (arrayList.get(i10).get() == view) {
                        arrayList.remove(i10);
                        return;
                    }
                    i10++;
                }
            }
        }

        boolean b(View view, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                g();
            }
            View viewC = c(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (viewC != null && !KeyEvent.isModifierKey(keyCode)) {
                    d().put(keyCode, new WeakReference<>(viewC));
                }
            }
            return viewC != null;
        }

        boolean f(KeyEvent keyEvent) {
            int iIndexOfKey;
            WeakReference<KeyEvent> weakReference = this.f21611c;
            if (weakReference != null && weakReference.get() == keyEvent) {
                return false;
            }
            this.f21611c = new WeakReference<>(keyEvent);
            WeakReference<View> weakReferenceValueAt = null;
            SparseArray<WeakReference<View>> sparseArrayD = d();
            if (keyEvent.getAction() == 1 && (iIndexOfKey = sparseArrayD.indexOfKey(keyEvent.getKeyCode())) >= 0) {
                weakReferenceValueAt = sparseArrayD.valueAt(iIndexOfKey);
                sparseArrayD.removeAt(iIndexOfKey);
            }
            if (weakReferenceValueAt == null) {
                weakReferenceValueAt = sparseArrayD.get(keyEvent.getKeyCode());
            }
            if (weakReferenceValueAt == null) {
                return false;
            }
            View view = weakReferenceValueAt.get();
            if (view != null && j1.O0(view)) {
                e(view, keyEvent);
            }
            return true;
        }
    }

    /* JADX INFO: compiled from: ViewCompat.java */
    public class d extends f<Boolean> {
        d(int i10, Class cls, int i11) {
            super(i10, cls, i11);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.j1.f
        @androidx.annotation.w0(28)
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public Boolean d(View view) {
            return Boolean.valueOf(q.c(view));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.j1.f
        @androidx.annotation.w0(28)
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public void e(View view, Boolean bool) {
            q.g(view, bool.booleanValue());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.j1.f
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public boolean h(Boolean bool, Boolean bool2) {
            return !a(bool, bool2);
        }
    }

    /* JADX INFO: compiled from: ViewCompat.java */
    public static class e implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final WeakHashMap<View, Boolean> f21612b = new WeakHashMap<>();

        e() {
        }

        @androidx.annotation.w0(19)
        private void b(View view, boolean z10) {
            boolean z11 = view.isShown() && view.getWindowVisibility() == 0;
            if (z10 != z11) {
                j1.d1(view, z11 ? 16 : 32);
                this.f21612b.put(view, Boolean.valueOf(z11));
            }
        }

        @androidx.annotation.w0(19)
        private void c(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        @androidx.annotation.w0(19)
        private void e(View view) {
            h.o(view.getViewTreeObserver(), this);
        }

        @androidx.annotation.w0(19)
        void a(View view) {
            this.f21612b.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(this);
            if (k.b(view)) {
                c(view);
            }
        }

        @androidx.annotation.w0(19)
        void d(View view) {
            this.f21612b.remove(view);
            view.removeOnAttachStateChangeListener(this);
            e(view);
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        @androidx.annotation.w0(19)
        public void onGlobalLayout() {
            if (Build.VERSION.SDK_INT < 28) {
                for (Map.Entry<View, Boolean> entry : this.f21612b.entrySet()) {
                    b(entry.getKey(), entry.getValue().booleanValue());
                }
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        @androidx.annotation.w0(19)
        public void onViewAttachedToWindow(View view) {
            c(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* JADX INFO: compiled from: ViewCompat.java */
    public static abstract class f<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f21613a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Class<T> f21614b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f21615c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f21616d;

        f(int i10, Class<T> cls, int i11) {
            this(i10, cls, 0, i11);
        }

        f(int i10, Class<T> cls, int i11, int i12) {
            this.f21613a = i10;
            this.f21614b = cls;
            this.f21616d = i11;
            this.f21615c = i12;
        }

        private boolean b() {
            return true;
        }

        private boolean c() {
            return Build.VERSION.SDK_INT >= this.f21615c;
        }

        boolean a(Boolean bool, Boolean bool2) {
            return (bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue());
        }

        abstract T d(View view);

        abstract void e(View view, T t10);

        T f(View view) {
            if (c()) {
                return d(view);
            }
            if (!b()) {
                return null;
            }
            T t10 = (T) view.getTag(this.f21613a);
            if (this.f21614b.isInstance(t10)) {
                return t10;
            }
            return null;
        }

        void g(View view, T t10) {
            if (c()) {
                e(view, t10);
            } else if (b() && h(f(view), t10)) {
                j1.C(view);
                view.setTag(this.f21613a, t10);
                j1.d1(view, this.f21616d);
            }
        }

        boolean h(T t10, T t11) {
            return !t11.equals(t10);
        }
    }

    /* JADX INFO: compiled from: ViewCompat.java */
    @androidx.annotation.w0(15)
    public static class g {
        private g() {
        }

        @androidx.annotation.u
        static boolean a(@androidx.annotation.n0 View view) {
            return view.hasOnClickListeners();
        }
    }

    /* JADX INFO: compiled from: ViewCompat.java */
    @androidx.annotation.w0(16)
    public static class h {
        private h() {
        }

        @androidx.annotation.u
        static AccessibilityNodeProvider a(View view) {
            return view.getAccessibilityNodeProvider();
        }

        @androidx.annotation.u
        static boolean b(View view) {
            return view.getFitsSystemWindows();
        }

        @androidx.annotation.u
        static int c(View view) {
            return view.getImportantForAccessibility();
        }

        @androidx.annotation.u
        static int d(View view) {
            return view.getMinimumHeight();
        }

        @androidx.annotation.u
        static int e(View view) {
            return view.getMinimumWidth();
        }

        @androidx.annotation.u
        static ViewParent f(View view) {
            return view.getParentForAccessibility();
        }

        @androidx.annotation.u
        static int g(View view) {
            return view.getWindowSystemUiVisibility();
        }

        @androidx.annotation.u
        static boolean h(View view) {
            return view.hasOverlappingRendering();
        }

        @androidx.annotation.u
        static boolean i(View view) {
            return view.hasTransientState();
        }

        @androidx.annotation.u
        static boolean j(View view, int i10, Bundle bundle) {
            return view.performAccessibilityAction(i10, bundle);
        }

        @androidx.annotation.u
        static void k(View view) {
            view.postInvalidateOnAnimation();
        }

        @androidx.annotation.u
        static void l(View view, int i10, int i11, int i12, int i13) {
            view.postInvalidateOnAnimation(i10, i11, i12, i13);
        }

        @androidx.annotation.u
        static void m(View view, Runnable runnable) {
            view.postOnAnimation(runnable);
        }

        @androidx.annotation.u
        static void n(View view, Runnable runnable, long j10) {
            view.postOnAnimationDelayed(runnable, j10);
        }

        @androidx.annotation.u
        static void o(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }

        @androidx.annotation.u
        static void p(View view) {
            view.requestFitSystemWindows();
        }

        @androidx.annotation.u
        static void q(View view, Drawable drawable) {
            view.setBackground(drawable);
        }

        @androidx.annotation.u
        static void r(View view, boolean z10) {
            view.setHasTransientState(z10);
        }

        @androidx.annotation.u
        static void s(View view, int i10) {
            view.setImportantForAccessibility(i10);
        }
    }

    /* JADX INFO: compiled from: ViewCompat.java */
    @androidx.annotation.w0(17)
    public static class i {
        private i() {
        }

        @androidx.annotation.u
        static int a() {
            return View.generateViewId();
        }

        @androidx.annotation.u
        static Display b(@androidx.annotation.n0 View view) {
            return view.getDisplay();
        }

        @androidx.annotation.u
        static int c(View view) {
            return view.getLabelFor();
        }

        @androidx.annotation.u
        static int d(View view) {
            return view.getLayoutDirection();
        }

        @androidx.annotation.u
        static int e(View view) {
            return view.getPaddingEnd();
        }

        @androidx.annotation.u
        static int f(View view) {
            return view.getPaddingStart();
        }

        @androidx.annotation.u
        static boolean g(View view) {
            return view.isPaddingRelative();
        }

        @androidx.annotation.u
        static void h(View view, int i10) {
            view.setLabelFor(i10);
        }

        @androidx.annotation.u
        static void i(View view, Paint paint) {
            view.setLayerPaint(paint);
        }

        @androidx.annotation.u
        static void j(View view, int i10) {
            view.setLayoutDirection(i10);
        }

        @androidx.annotation.u
        static void k(View view, int i10, int i11, int i12, int i13) {
            view.setPaddingRelative(i10, i11, i12, i13);
        }
    }

    /* JADX INFO: compiled from: ViewCompat.java */
    @androidx.annotation.w0(18)
    public static class j {
        private j() {
        }

        @androidx.annotation.u
        static Rect a(@androidx.annotation.n0 View view) {
            return view.getClipBounds();
        }

        @androidx.annotation.u
        static boolean b(@androidx.annotation.n0 View view) {
            return view.isInLayout();
        }

        @androidx.annotation.u
        static void c(@androidx.annotation.n0 View view, Rect rect) {
            view.setClipBounds(rect);
        }
    }

    /* JADX INFO: compiled from: ViewCompat.java */
    @androidx.annotation.w0(19)
    public static class k {
        private k() {
        }

        @androidx.annotation.u
        static int a(View view) {
            return view.getAccessibilityLiveRegion();
        }

        @androidx.annotation.u
        static boolean b(@androidx.annotation.n0 View view) {
            return view.isAttachedToWindow();
        }

        @androidx.annotation.u
        static boolean c(@androidx.annotation.n0 View view) {
            return view.isLaidOut();
        }

        @androidx.annotation.u
        static boolean d(@androidx.annotation.n0 View view) {
            return view.isLayoutDirectionResolved();
        }

        @androidx.annotation.u
        static void e(ViewParent viewParent, View view, View view2, int i10) {
            viewParent.notifySubtreeAccessibilityStateChanged(view, view2, i10);
        }

        @androidx.annotation.u
        static void f(View view, int i10) {
            view.setAccessibilityLiveRegion(i10);
        }

        @androidx.annotation.u
        static void g(AccessibilityEvent accessibilityEvent, int i10) {
            accessibilityEvent.setContentChangeTypes(i10);
        }
    }

    /* JADX INFO: compiled from: ViewCompat.java */
    @androidx.annotation.w0(20)
    public static class l {
        private l() {
        }

        @androidx.annotation.u
        static WindowInsets a(View view, WindowInsets windowInsets) {
            return view.dispatchApplyWindowInsets(windowInsets);
        }

        @androidx.annotation.u
        static WindowInsets b(View view, WindowInsets windowInsets) {
            return view.onApplyWindowInsets(windowInsets);
        }

        @androidx.annotation.u
        static void c(View view) {
            view.requestApplyInsets();
        }
    }

    /* JADX INFO: compiled from: ViewCompat.java */
    @androidx.annotation.w0(21)
    public static class m {

        /* JADX INFO: compiled from: ViewCompat.java */
        public class a implements View.OnApplyWindowInsetsListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            n3 f21617a = null;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ View f21618b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ z0 f21619c;

            a(View view, z0 z0Var) {
                this.f21618b = view;
                this.f21619c = z0Var;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                n3 n3VarL = n3.L(windowInsets, view);
                int i10 = Build.VERSION.SDK_INT;
                if (i10 < 30) {
                    m.a(windowInsets, this.f21618b);
                    if (n3VarL.equals(this.f21617a)) {
                        return this.f21619c.a(view, n3VarL).J();
                    }
                }
                this.f21617a = n3VarL;
                n3 n3VarA = this.f21619c.a(view, n3VarL);
                if (i10 >= 30) {
                    return n3VarA.J();
                }
                j1.v1(view);
                return n3VarA.J();
            }
        }

        private m() {
        }

        @androidx.annotation.u
        static void a(@androidx.annotation.n0 WindowInsets windowInsets, @androidx.annotation.n0 View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        @androidx.annotation.u
        static n3 b(@androidx.annotation.n0 View view, @androidx.annotation.n0 n3 n3Var, @androidx.annotation.n0 Rect rect) {
            WindowInsets windowInsetsJ = n3Var.J();
            if (windowInsetsJ != null) {
                return n3.L(view.computeSystemWindowInsets(windowInsetsJ, rect), view);
            }
            rect.setEmpty();
            return n3Var;
        }

        @androidx.annotation.u
        static boolean c(@androidx.annotation.n0 View view, float f10, float f11, boolean z10) {
            return view.dispatchNestedFling(f10, f11, z10);
        }

        @androidx.annotation.u
        static boolean d(@androidx.annotation.n0 View view, float f10, float f11) {
            return view.dispatchNestedPreFling(f10, f11);
        }

        @androidx.annotation.u
        static boolean e(View view, int i10, int i11, int[] iArr, int[] iArr2) {
            return view.dispatchNestedPreScroll(i10, i11, iArr, iArr2);
        }

        @androidx.annotation.u
        static boolean f(View view, int i10, int i11, int i12, int i13, int[] iArr) {
            return view.dispatchNestedScroll(i10, i11, i12, i13, iArr);
        }

        @androidx.annotation.u
        static ColorStateList g(View view) {
            return view.getBackgroundTintList();
        }

        @androidx.annotation.u
        static PorterDuff.Mode h(View view) {
            return view.getBackgroundTintMode();
        }

        @androidx.annotation.u
        static float i(View view) {
            return view.getElevation();
        }

        @androidx.annotation.u
        @androidx.annotation.p0
        public static n3 j(@androidx.annotation.n0 View view) {
            return n3.a.a(view);
        }

        @androidx.annotation.u
        static String k(View view) {
            return view.getTransitionName();
        }

        @androidx.annotation.u
        static float l(View view) {
            return view.getTranslationZ();
        }

        @androidx.annotation.u
        static float m(@androidx.annotation.n0 View view) {
            return view.getZ();
        }

        @androidx.annotation.u
        static boolean n(View view) {
            return view.hasNestedScrollingParent();
        }

        @androidx.annotation.u
        static boolean o(View view) {
            return view.isImportantForAccessibility();
        }

        @androidx.annotation.u
        static boolean p(View view) {
            return view.isNestedScrollingEnabled();
        }

        @androidx.annotation.u
        static void q(View view, ColorStateList colorStateList) {
            view.setBackgroundTintList(colorStateList);
        }

        @androidx.annotation.u
        static void r(View view, PorterDuff.Mode mode) {
            view.setBackgroundTintMode(mode);
        }

        @androidx.annotation.u
        static void s(View view, float f10) {
            view.setElevation(f10);
        }

        @androidx.annotation.u
        static void t(View view, boolean z10) {
            view.setNestedScrollingEnabled(z10);
        }

        @androidx.annotation.u
        static void u(@androidx.annotation.n0 View view, @androidx.annotation.p0 z0 z0Var) {
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(R.id.tag_on_apply_window_listener, z0Var);
            }
            if (z0Var == null) {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
            } else {
                view.setOnApplyWindowInsetsListener(new a(view, z0Var));
            }
        }

        @androidx.annotation.u
        static void v(View view, String str) {
            view.setTransitionName(str);
        }

        @androidx.annotation.u
        static void w(View view, float f10) {
            view.setTranslationZ(f10);
        }

        @androidx.annotation.u
        static void x(@androidx.annotation.n0 View view, float f10) {
            view.setZ(f10);
        }

        @androidx.annotation.u
        static boolean y(View view, int i10) {
            return view.startNestedScroll(i10);
        }

        @androidx.annotation.u
        static void z(View view) {
            view.stopNestedScroll();
        }
    }

    /* JADX INFO: compiled from: ViewCompat.java */
    @androidx.annotation.w0(23)
    public static class n {
        private n() {
        }

        @androidx.annotation.p0
        public static n3 a(@androidx.annotation.n0 View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            n3 n3VarK = n3.K(rootWindowInsets);
            n3VarK.H(n3VarK);
            n3VarK.d(view.getRootView());
            return n3VarK;
        }

        @androidx.annotation.u
        static int b(@androidx.annotation.n0 View view) {
            return view.getScrollIndicators();
        }

        @androidx.annotation.u
        static void c(@androidx.annotation.n0 View view, int i10) {
            view.setScrollIndicators(i10);
        }

        @androidx.annotation.u
        static void d(@androidx.annotation.n0 View view, int i10, int i11) {
            view.setScrollIndicators(i10, i11);
        }
    }

    /* JADX INFO: compiled from: ViewCompat.java */
    @androidx.annotation.w0(24)
    public static class o {
        private o() {
        }

        @androidx.annotation.u
        static void a(@androidx.annotation.n0 View view) {
            view.cancelDragAndDrop();
        }

        @androidx.annotation.u
        static void b(View view) {
            view.dispatchFinishTemporaryDetach();
        }

        @androidx.annotation.u
        static void c(View view) {
            view.dispatchStartTemporaryDetach();
        }

        @androidx.annotation.u
        static void d(@androidx.annotation.n0 View view, PointerIcon pointerIcon) {
            view.setPointerIcon(pointerIcon);
        }

        @androidx.annotation.u
        static boolean e(@androidx.annotation.n0 View view, @androidx.annotation.p0 ClipData clipData, @androidx.annotation.n0 View.DragShadowBuilder dragShadowBuilder, @androidx.annotation.p0 Object obj, int i10) {
            return view.startDragAndDrop(clipData, dragShadowBuilder, obj, i10);
        }

        @androidx.annotation.u
        static void f(@androidx.annotation.n0 View view, @androidx.annotation.n0 View.DragShadowBuilder dragShadowBuilder) {
            view.updateDragShadow(dragShadowBuilder);
        }
    }

    /* JADX INFO: compiled from: ViewCompat.java */
    @androidx.annotation.w0(26)
    public static class p {
        private p() {
        }

        @androidx.annotation.u
        static void a(@androidx.annotation.n0 View view, Collection<View> collection, int i10) {
            view.addKeyboardNavigationClusters(collection, i10);
        }

        @androidx.annotation.u
        static int b(View view) {
            return view.getImportantForAutofill();
        }

        @androidx.annotation.u
        static int c(@androidx.annotation.n0 View view) {
            return view.getNextClusterForwardId();
        }

        @androidx.annotation.u
        static boolean d(@androidx.annotation.n0 View view) {
            return view.hasExplicitFocusable();
        }

        @androidx.annotation.u
        static boolean e(@androidx.annotation.n0 View view) {
            return view.isFocusedByDefault();
        }

        @androidx.annotation.u
        static boolean f(View view) {
            return view.isImportantForAutofill();
        }

        @androidx.annotation.u
        static boolean g(@androidx.annotation.n0 View view) {
            return view.isKeyboardNavigationCluster();
        }

        @androidx.annotation.u
        static View h(@androidx.annotation.n0 View view, View view2, int i10) {
            return view.keyboardNavigationClusterSearch(view2, i10);
        }

        @androidx.annotation.u
        static boolean i(@androidx.annotation.n0 View view) {
            return view.restoreDefaultFocus();
        }

        @androidx.annotation.u
        static void j(@androidx.annotation.n0 View view, String... strArr) {
            view.setAutofillHints(strArr);
        }

        @androidx.annotation.u
        static void k(@androidx.annotation.n0 View view, boolean z10) {
            view.setFocusedByDefault(z10);
        }

        @androidx.annotation.u
        static void l(View view, int i10) {
            view.setImportantForAutofill(i10);
        }

        @androidx.annotation.u
        static void m(@androidx.annotation.n0 View view, boolean z10) {
            view.setKeyboardNavigationCluster(z10);
        }

        @androidx.annotation.u
        static void n(View view, int i10) {
            view.setNextClusterForwardId(i10);
        }

        @androidx.annotation.u
        static void o(@androidx.annotation.n0 View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    /* JADX INFO: compiled from: ViewCompat.java */
    @androidx.annotation.w0(28)
    public static class q {
        private q() {
        }

        @androidx.annotation.u
        static void a(@androidx.annotation.n0 View view, @androidx.annotation.n0 final z zVar) {
            int i10 = R.id.tag_unhandled_key_listeners;
            androidx.collection.j2 j2Var = (androidx.collection.j2) view.getTag(i10);
            if (j2Var == null) {
                j2Var = new androidx.collection.j2();
                view.setTag(i10, j2Var);
            }
            Objects.requireNonNull(zVar);
            View$OnUnhandledKeyEventListener view$OnUnhandledKeyEventListener = new View$OnUnhandledKeyEventListener() { // from class: androidx.core.view.l2
                public final boolean onUnhandledKeyEvent(View view2, KeyEvent keyEvent) {
                    return zVar.onUnhandledKeyEvent(view2, keyEvent);
                }
            };
            j2Var.put(zVar, view$OnUnhandledKeyEventListener);
            view.addOnUnhandledKeyEventListener(view$OnUnhandledKeyEventListener);
        }

        @androidx.annotation.u
        static CharSequence b(View view) {
            return view.getAccessibilityPaneTitle();
        }

        @androidx.annotation.u
        static boolean c(View view) {
            return view.isAccessibilityHeading();
        }

        @androidx.annotation.u
        static boolean d(View view) {
            return view.isScreenReaderFocusable();
        }

        @androidx.annotation.u
        static void e(@androidx.annotation.n0 View view, @androidx.annotation.n0 z zVar) {
            View$OnUnhandledKeyEventListener view$OnUnhandledKeyEventListener;
            androidx.collection.j2 j2Var = (androidx.collection.j2) view.getTag(R.id.tag_unhandled_key_listeners);
            if (j2Var == null || (view$OnUnhandledKeyEventListener = (View$OnUnhandledKeyEventListener) j2Var.get(zVar)) == null) {
                return;
            }
            view.removeOnUnhandledKeyEventListener(view$OnUnhandledKeyEventListener);
        }

        @androidx.annotation.u
        static <T> T f(View view, int i10) {
            return (T) view.requireViewById(i10);
        }

        @androidx.annotation.u
        static void g(View view, boolean z10) {
            view.setAccessibilityHeading(z10);
        }

        @androidx.annotation.u
        static void h(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        @androidx.annotation.u
        static void i(View view, boolean z10) {
            view.setScreenReaderFocusable(z10);
        }
    }

    /* JADX INFO: compiled from: ViewCompat.java */
    @androidx.annotation.w0(29)
    public static class r {
        private r() {
        }

        @androidx.annotation.u
        static View.AccessibilityDelegate a(View view) {
            return view.getAccessibilityDelegate();
        }

        @androidx.annotation.u
        static List<Rect> b(View view) {
            return view.getSystemGestureExclusionRects();
        }

        @androidx.annotation.u
        static void c(@androidx.annotation.n0 View view, @androidx.annotation.n0 Context context, @androidx.annotation.n0 int[] iArr, @androidx.annotation.p0 AttributeSet attributeSet, @androidx.annotation.n0 TypedArray typedArray, int i10, int i11) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i10, i11);
        }

        @androidx.annotation.u
        static void d(View view, List<Rect> list) {
            view.setSystemGestureExclusionRects(list);
        }
    }

    /* JADX INFO: compiled from: ViewCompat.java */
    @androidx.annotation.w0(30)
    public static class s {
        private s() {
        }

        @androidx.annotation.u
        static CharSequence a(View view) {
            return view.getStateDescription();
        }

        @androidx.annotation.p0
        public static b4 b(@androidx.annotation.n0 View view) {
            WindowInsetsController windowInsetsController = view.getWindowInsetsController();
            if (windowInsetsController != null) {
                return b4.l(windowInsetsController);
            }
            return null;
        }

        @androidx.annotation.u
        static void c(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }
    }

    /* JADX INFO: compiled from: ViewCompat.java */
    @androidx.annotation.w0(31)
    public static final class t {
        private t() {
        }

        @androidx.annotation.u
        @androidx.annotation.p0
        public static String[] a(@androidx.annotation.n0 View view) {
            return view.getReceiveContentMimeTypes();
        }

        @androidx.annotation.u
        @androidx.annotation.p0
        public static androidx.core.view.e b(@androidx.annotation.n0 View view, @androidx.annotation.n0 androidx.core.view.e eVar) {
            ContentInfo contentInfoL = eVar.l();
            ContentInfo contentInfoPerformReceiveContent = view.performReceiveContent(contentInfoL);
            if (contentInfoPerformReceiveContent == null) {
                return null;
            }
            return contentInfoPerformReceiveContent == contentInfoL ? eVar : androidx.core.view.e.m(contentInfoPerformReceiveContent);
        }

        @androidx.annotation.u
        public static void c(@androidx.annotation.n0 View view, @androidx.annotation.p0 String[] strArr, @androidx.annotation.p0 a1 a1Var) {
            if (a1Var == null) {
                view.setOnReceiveContentListener(strArr, null);
            } else {
                view.setOnReceiveContentListener(strArr, new y(a1Var));
            }
        }
    }

    /* JADX INFO: compiled from: ViewCompat.java */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface u {
    }

    /* JADX INFO: compiled from: ViewCompat.java */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface v {
    }

    /* JADX INFO: compiled from: ViewCompat.java */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface w {
    }

    /* JADX INFO: compiled from: ViewCompat.java */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface x {
    }

    /* JADX INFO: compiled from: ViewCompat.java */
    @androidx.annotation.w0(31)
    public static final class y implements OnReceiveContentListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @androidx.annotation.n0
        private final a1 f21620a;

        y(@androidx.annotation.n0 a1 a1Var) {
            this.f21620a = a1Var;
        }

        @androidx.annotation.p0
        public ContentInfo onReceiveContent(@androidx.annotation.n0 View view, @androidx.annotation.n0 ContentInfo contentInfo) {
            androidx.core.view.e eVarM = androidx.core.view.e.m(contentInfo);
            androidx.core.view.e eVarA = this.f21620a.a(view, eVarM);
            if (eVarA == null) {
                return null;
            }
            return eVarA == eVarM ? contentInfo : eVarA.l();
        }
    }

    /* JADX INFO: compiled from: ViewCompat.java */
    public interface z {
        boolean onUnhandledKeyEvent(@androidx.annotation.n0 View view, @androidx.annotation.n0 KeyEvent keyEvent);
    }

    @Deprecated
    protected j1() {
    }

    @androidx.annotation.i1
    static boolean A(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return c0.a(view).f(keyEvent);
    }

    public static float A0(@androidx.annotation.n0 View view) {
        return m.l(view);
    }

    private static f<Boolean> A1() {
        return new a(R.id.tag_screen_reader_focusable, Boolean.class, 28);
    }

    @Deprecated
    public static void A2(View view, float f10) {
        view.setY(f10);
    }

    public static void B(@androidx.annotation.n0 View view) {
        C(view);
    }

    @androidx.annotation.p0
    @Deprecated
    public static b4 B0(@androidx.annotation.n0 View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            return s.b(view);
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                Window window = ((Activity) context).getWindow();
                if (window != null) {
                    return g3.a(window, view);
                }
                return null;
            }
        }
        return null;
    }

    public static void B1(@androidx.annotation.n0 View view, @androidx.annotation.p0 androidx.core.view.a aVar) {
        if (aVar == null && (F(view) instanceof androidx.core.view.a.C0144a)) {
            aVar = new androidx.core.view.a();
        }
        view.setAccessibilityDelegate(aVar == null ? null : aVar.getBridge());
    }

    public static void B2(@androidx.annotation.n0 View view, float f10) {
        m.x(view, f10);
    }

    static void C(@androidx.annotation.n0 View view) {
        androidx.core.view.a aVarE = E(view);
        if (aVarE == null) {
            aVarE = new androidx.core.view.a();
        }
        B1(view, aVarE);
    }

    @Deprecated
    public static int C0(@androidx.annotation.n0 View view) {
        return h.g(view);
    }

    @androidx.annotation.i1
    public static void C1(@androidx.annotation.n0 View view, boolean z10) {
        b().g(view, Boolean.valueOf(z10));
    }

    public static boolean C2(@androidx.annotation.n0 View view, @androidx.annotation.p0 ClipData clipData, @androidx.annotation.n0 View.DragShadowBuilder dragShadowBuilder, @androidx.annotation.p0 Object obj, int i10) {
        return Build.VERSION.SDK_INT >= 24 ? o.e(view, clipData, dragShadowBuilder, obj, i10) : view.startDrag(clipData, dragShadowBuilder, obj, i10);
    }

    public static int D() {
        return i.a();
    }

    @Deprecated
    public static float D0(View view) {
        return view.getX();
    }

    public static void D1(@androidx.annotation.n0 View view, int i10) {
        k.f(view, i10);
    }

    public static boolean D2(@androidx.annotation.n0 View view, int i10) {
        return m.y(view, i10);
    }

    @androidx.annotation.p0
    public static androidx.core.view.a E(@androidx.annotation.n0 View view) {
        View.AccessibilityDelegate accessibilityDelegateF = F(view);
        if (accessibilityDelegateF == null) {
            return null;
        }
        return accessibilityDelegateF instanceof androidx.core.view.a.C0144a ? ((androidx.core.view.a.C0144a) accessibilityDelegateF).f21326a : new androidx.core.view.a(accessibilityDelegateF);
    }

    @Deprecated
    public static float E0(View view) {
        return view.getY();
    }

    @androidx.annotation.i1
    public static void E1(@androidx.annotation.n0 View view, @androidx.annotation.p0 CharSequence charSequence) {
        k1().g(view, charSequence);
        if (charSequence != null) {
            X.a(view);
        } else {
            X.d(view);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean E2(@androidx.annotation.n0 View view, int i10, int i11) {
        if (view instanceof r0) {
            return ((r0) view).startNestedScroll(i10, i11);
        }
        if (i11 == 0) {
            return D2(view, i10);
        }
        return false;
    }

    @androidx.annotation.p0
    private static View.AccessibilityDelegate F(@androidx.annotation.n0 View view) {
        return Build.VERSION.SDK_INT >= 29 ? r.a(view) : G(view);
    }

    public static float F0(@androidx.annotation.n0 View view) {
        return m.m(view);
    }

    @Deprecated
    public static void F1(View view, boolean z10) {
        view.setActivated(z10);
    }

    private static f<CharSequence> F2() {
        return new c(R.id.tag_state_description, CharSequence.class, 64, 30);
    }

    @androidx.annotation.p0
    private static View.AccessibilityDelegate G(@androidx.annotation.n0 View view) {
        if (T) {
            return null;
        }
        if (S == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                S = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                T = true;
                return null;
            }
        }
        try {
            Object obj = S.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            T = true;
            return null;
        }
    }

    public static boolean G0(@androidx.annotation.n0 View view) {
        return F(view) != null;
    }

    @Deprecated
    public static void G1(View view, @androidx.annotation.x(from = 0.0d, to = com.google.android.material.color.utilities.d.f53848a) float f10) {
        view.setAlpha(f10);
    }

    public static void G2(@androidx.annotation.n0 View view) {
        m.z(view);
    }

    public static int H(@androidx.annotation.n0 View view) {
        return k.a(view);
    }

    public static boolean H0(@androidx.annotation.n0 View view) {
        return Build.VERSION.SDK_INT >= 26 ? p.d(view) : view.hasFocusable();
    }

    public static void H1(@androidx.annotation.n0 View view, @androidx.annotation.p0 String... strArr) {
        if (Build.VERSION.SDK_INT >= 26) {
            p.j(view, strArr);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void H2(@androidx.annotation.n0 View view, int i10) {
        if (view instanceof r0) {
            ((r0) view).stopNestedScroll(i10);
        } else if (i10 == 0) {
            G2(view);
        }
    }

    @androidx.annotation.p0
    public static androidx.core.view.accessibility.c0 I(@androidx.annotation.n0 View view) {
        AccessibilityNodeProvider accessibilityNodeProviderA = h.a(view);
        if (accessibilityNodeProviderA != null) {
            return new androidx.core.view.accessibility.c0(accessibilityNodeProviderA);
        }
        return null;
    }

    public static boolean I0(@androidx.annotation.n0 View view) {
        return m.n(view);
    }

    public static void I1(@androidx.annotation.n0 View view, @androidx.annotation.p0 Drawable drawable) {
        h.q(view, drawable);
    }

    private static void I2(View view) {
        float translationY = view.getTranslationY();
        view.setTranslationY(1.0f + translationY);
        view.setTranslationY(translationY);
    }

    @androidx.annotation.i1
    @androidx.annotation.p0
    public static CharSequence J(@androidx.annotation.n0 View view) {
        return k1().f(view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean J0(@androidx.annotation.n0 View view, int i10) {
        if (view instanceof r0) {
            ((r0) view).hasNestedScrollingParent(i10);
            return false;
        }
        if (i10 == 0) {
            return I0(view);
        }
        return false;
    }

    public static void J1(@androidx.annotation.n0 View view, @androidx.annotation.p0 ColorStateList colorStateList) {
        m.q(view, colorStateList);
    }

    public static void J2(@androidx.annotation.n0 View view, @androidx.annotation.n0 View.DragShadowBuilder dragShadowBuilder) {
        if (Build.VERSION.SDK_INT >= 24) {
            o.f(view, dragShadowBuilder);
        }
    }

    private static List<androidx.core.view.accessibility.a0.a> K(View view) {
        int i10 = R.id.tag_accessibility_actions;
        ArrayList arrayList = (ArrayList) view.getTag(i10);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(i10, arrayList2);
        return arrayList2;
    }

    public static boolean K0(@androidx.annotation.n0 View view) {
        return g.a(view);
    }

    public static void K1(@androidx.annotation.n0 View view, @androidx.annotation.p0 PorterDuff.Mode mode) {
        m.r(view, mode);
    }

    @Deprecated
    public static float L(View view) {
        return view.getAlpha();
    }

    public static boolean L0(@androidx.annotation.n0 View view) {
        return h.h(view);
    }

    @SuppressLint({"BanUncheckedReflection"})
    @Deprecated
    public static void L1(ViewGroup viewGroup, boolean z10) {
        if (R == null) {
            try {
                R = ViewGroup.class.getDeclaredMethod("setChildrenDrawingOrderEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException e10) {
                Log.e(f21582a, "Unable to find childrenDrawingOrderEnabled", e10);
            }
            R.setAccessible(true);
        }
        try {
            R.invoke(viewGroup, Boolean.valueOf(z10));
        } catch (IllegalAccessException e11) {
            Log.e(f21582a, "Unable to invoke childrenDrawingOrderEnabled", e11);
        } catch (IllegalArgumentException e12) {
            Log.e(f21582a, "Unable to invoke childrenDrawingOrderEnabled", e12);
        } catch (InvocationTargetException e13) {
            Log.e(f21582a, "Unable to invoke childrenDrawingOrderEnabled", e13);
        }
    }

    private static int M(View view, @androidx.annotation.n0 CharSequence charSequence) {
        List<androidx.core.view.accessibility.a0.a> listK = K(view);
        for (int i10 = 0; i10 < listK.size(); i10++) {
            if (TextUtils.equals(charSequence, listK.get(i10).c())) {
                return listK.get(i10).b();
            }
        }
        int i11 = -1;
        int i12 = 0;
        while (true) {
            int[] iArr = V;
            if (i12 >= iArr.length || i11 != -1) {
                break;
            }
            int i13 = iArr[i12];
            boolean z10 = true;
            for (int i14 = 0; i14 < listK.size(); i14++) {
                z10 &= listK.get(i14).b() != i13;
            }
            if (z10) {
                i11 = i13;
            }
            i12++;
        }
        return i11;
    }

    public static boolean M0(@androidx.annotation.n0 View view) {
        return h.i(view);
    }

    public static void M1(@androidx.annotation.n0 View view, @androidx.annotation.p0 Rect rect) {
        j.c(view, rect);
    }

    @androidx.annotation.p0
    public static ColorStateList N(@androidx.annotation.n0 View view) {
        return m.g(view);
    }

    @androidx.annotation.i1
    public static boolean N0(@androidx.annotation.n0 View view) {
        Boolean boolF = b().f(view);
        return boolF != null && boolF.booleanValue();
    }

    public static void N1(@androidx.annotation.n0 View view, float f10) {
        m.s(view, f10);
    }

    @androidx.annotation.p0
    public static PorterDuff.Mode O(@androidx.annotation.n0 View view) {
        return m.h(view);
    }

    public static boolean O0(@androidx.annotation.n0 View view) {
        return k.b(view);
    }

    @Deprecated
    public static void O1(View view, boolean z10) {
        view.setFitsSystemWindows(z10);
    }

    @androidx.annotation.p0
    public static Rect P(@androidx.annotation.n0 View view) {
        return j.a(view);
    }

    public static boolean P0(@androidx.annotation.n0 View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return p.e(view);
        }
        return false;
    }

    public static void P1(@androidx.annotation.n0 View view, boolean z10) {
        if (Build.VERSION.SDK_INT >= 26) {
            p.k(view, z10);
        }
    }

    @androidx.annotation.p0
    public static Display Q(@androidx.annotation.n0 View view) {
        return i.b(view);
    }

    public static boolean Q0(@androidx.annotation.n0 View view) {
        return m.o(view);
    }

    public static void Q1(@androidx.annotation.n0 View view, boolean z10) {
        h.r(view, z10);
    }

    public static float R(@androidx.annotation.n0 View view) {
        return m.i(view);
    }

    public static boolean R0(@androidx.annotation.n0 View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return p.f(view);
        }
        return true;
    }

    @androidx.annotation.i1
    public static void R1(@androidx.annotation.n0 View view, int i10) {
        h.s(view, i10);
    }

    private static Rect S() {
        if (U == null) {
            U = new ThreadLocal<>();
        }
        Rect rect = U.get();
        if (rect == null) {
            rect = new Rect();
            U.set(rect);
        }
        rect.setEmpty();
        return rect;
    }

    public static boolean S0(@androidx.annotation.n0 View view) {
        return j.b(view);
    }

    public static void S1(@androidx.annotation.n0 View view, int i10) {
        if (Build.VERSION.SDK_INT >= 26) {
            p.l(view, i10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static b1 T(@androidx.annotation.n0 View view) {
        return view instanceof b1 ? (b1) view : W;
    }

    public static boolean T0(@androidx.annotation.n0 View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return p.g(view);
        }
        return false;
    }

    public static void T1(@androidx.annotation.n0 View view, boolean z10) {
        if (Build.VERSION.SDK_INT >= 26) {
            p.m(view, z10);
        }
    }

    public static boolean U(@androidx.annotation.n0 View view) {
        return h.b(view);
    }

    public static boolean U0(@androidx.annotation.n0 View view) {
        return k.c(view);
    }

    public static void U1(@androidx.annotation.n0 View view, @androidx.annotation.d0 int i10) {
        i.h(view, i10);
    }

    public static int V(@androidx.annotation.n0 View view) {
        return h.c(view);
    }

    public static boolean V0(@androidx.annotation.n0 View view) {
        return k.d(view);
    }

    public static void V1(@androidx.annotation.n0 View view, @androidx.annotation.p0 Paint paint) {
        i.i(view, paint);
    }

    @SuppressLint({"InlinedApi"})
    public static int W(@androidx.annotation.n0 View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return p.b(view);
        }
        return 0;
    }

    public static boolean W0(@androidx.annotation.n0 View view) {
        return m.p(view);
    }

    @Deprecated
    public static void W1(View view, int i10, Paint paint) {
        view.setLayerType(i10, paint);
    }

    public static int X(@androidx.annotation.n0 View view) {
        return i.c(view);
    }

    @Deprecated
    public static boolean X0(View view) {
        return view.isOpaque();
    }

    public static void X1(@androidx.annotation.n0 View view, int i10) {
        i.j(view, i10);
    }

    @Deprecated
    public static int Y(View view) {
        return view.getLayerType();
    }

    public static boolean Y0(@androidx.annotation.n0 View view) {
        return i.g(view);
    }

    public static void Y1(@androidx.annotation.n0 View view, boolean z10) {
        m.t(view, z10);
    }

    public static int Z(@androidx.annotation.n0 View view) {
        return i.d(view);
    }

    @androidx.annotation.i1
    public static boolean Z0(@androidx.annotation.n0 View view) {
        Boolean boolF = A1().f(view);
        return boolF != null && boolF.booleanValue();
    }

    public static void Z1(@androidx.annotation.n0 View view, int i10) {
        if (Build.VERSION.SDK_INT >= 26) {
            p.n(view, i10);
        }
    }

    @androidx.annotation.p0
    @Deprecated
    public static Matrix a0(View view) {
        return view.getMatrix();
    }

    @Deprecated
    public static void a1(View view) {
        view.jumpDrawablesToCurrentState();
    }

    public static void a2(@androidx.annotation.n0 View view, @androidx.annotation.p0 z0 z0Var) {
        m.u(view, z0Var);
    }

    private static f<Boolean> b() {
        return new d(R.id.tag_accessibility_heading, Boolean.class, 28);
    }

    @Deprecated
    public static int b0(View view) {
        return view.getMeasuredHeightAndState();
    }

    @androidx.annotation.p0
    public static View b1(@androidx.annotation.n0 View view, @androidx.annotation.p0 View view2, int i10) {
        if (Build.VERSION.SDK_INT >= 26) {
            return p.h(view, view2, i10);
        }
        return null;
    }

    public static void b2(@androidx.annotation.n0 View view, @androidx.annotation.p0 String[] strArr, @androidx.annotation.p0 a1 a1Var) {
        if (Build.VERSION.SDK_INT >= 31) {
            t.c(view, strArr, a1Var);
            return;
        }
        if (strArr == null || strArr.length == 0) {
            strArr = null;
        }
        boolean z10 = false;
        if (a1Var != null) {
            androidx.core.util.o.b(strArr != null, "When the listener is set, MIME types must also be set");
        }
        if (strArr != null) {
            for (String str : strArr) {
                if (str.startsWith(androidx.webkit.b.f28327e)) {
                    z10 = true;
                    break;
                }
            }
            androidx.core.util.o.b(!z10, "A MIME type set here must not start with *: " + Arrays.toString(strArr));
        }
        view.setTag(R.id.tag_on_receive_content_mime_types, strArr);
        view.setTag(R.id.tag_on_receive_content_listener, a1Var);
    }

    public static int c(@androidx.annotation.n0 View view, @androidx.annotation.n0 CharSequence charSequence, @androidx.annotation.n0 androidx.core.view.accessibility.e0 e0Var) {
        int iM = M(view, charSequence);
        if (iM != -1) {
            d(view, new androidx.core.view.accessibility.a0.a(iM, charSequence, e0Var));
        }
        return iM;
    }

    @Deprecated
    public static int c0(View view) {
        return view.getMeasuredState();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ androidx.core.view.e c1(androidx.core.view.e eVar) {
        return eVar;
    }

    @Deprecated
    public static void c2(View view, int i10) {
        view.setOverScrollMode(i10);
    }

    private static void d(@androidx.annotation.n0 View view, @androidx.annotation.n0 androidx.core.view.accessibility.a0.a aVar) {
        C(view);
        s1(aVar.b(), view);
        K(view).add(aVar);
        d1(view, 0);
    }

    @Deprecated
    public static int d0(View view) {
        return view.getMeasuredWidthAndState();
    }

    @androidx.annotation.w0(19)
    static void d1(View view, int i10) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z10 = J(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (H(view) != 0 || z10) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(z10 ? 32 : 2048);
                k.g(accessibilityEventObtain, i10);
                if (z10) {
                    accessibilityEventObtain.getText().add(J(view));
                    x2(view);
                }
                view.sendAccessibilityEventUnchecked(accessibilityEventObtain);
                return;
            }
            if (i10 == 32) {
                AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(accessibilityEventObtain2);
                accessibilityEventObtain2.setEventType(32);
                k.g(accessibilityEventObtain2, i10);
                accessibilityEventObtain2.setSource(view);
                view.onPopulateAccessibilityEvent(accessibilityEventObtain2);
                accessibilityEventObtain2.getText().add(J(view));
                accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain2);
                return;
            }
            if (view.getParent() != null) {
                try {
                    k.e(view.getParent(), view, view, i10);
                } catch (AbstractMethodError e10) {
                    Log.e(f21582a, view.getParent().getClass().getSimpleName() + " does not fully implement ViewParent", e10);
                }
            }
        }
    }

    public static void d2(@androidx.annotation.n0 View view, @androidx.annotation.t0 int i10, @androidx.annotation.t0 int i11, @androidx.annotation.t0 int i12, @androidx.annotation.t0 int i13) {
        i.k(view, i10, i11, i12, i13);
    }

    public static void e(@androidx.annotation.n0 View view, @androidx.annotation.n0 Collection<View> collection, int i10) {
        if (Build.VERSION.SDK_INT >= 26) {
            p.a(view, collection, i10);
        }
    }

    public static int e0(@androidx.annotation.n0 View view) {
        return h.d(view);
    }

    public static void e1(@androidx.annotation.n0 View view, int i10) {
        view.offsetLeftAndRight(i10);
    }

    @Deprecated
    public static void e2(View view, float f10) {
        view.setPivotX(f10);
    }

    public static void f(@androidx.annotation.n0 View view, @androidx.annotation.n0 z zVar) {
        if (Build.VERSION.SDK_INT >= 28) {
            q.a(view, zVar);
            return;
        }
        int i10 = R.id.tag_unhandled_key_listeners;
        ArrayList arrayList = (ArrayList) view.getTag(i10);
        if (arrayList == null) {
            arrayList = new ArrayList();
            view.setTag(i10, arrayList);
        }
        arrayList.add(zVar);
        if (arrayList.size() == 1) {
            c0.h(view);
        }
    }

    public static int f0(@androidx.annotation.n0 View view) {
        return h.e(view);
    }

    public static void f1(@androidx.annotation.n0 View view, int i10) {
        view.offsetTopAndBottom(i10);
    }

    @Deprecated
    public static void f2(View view, float f10) {
        view.setPivotY(f10);
    }

    @androidx.annotation.n0
    public static c3 g(@androidx.annotation.n0 View view) {
        if (Q == null) {
            Q = new WeakHashMap<>();
        }
        c3 c3Var = Q.get(view);
        if (c3Var != null) {
            return c3Var;
        }
        c3 c3Var2 = new c3(view);
        Q.put(view, c3Var2);
        return c3Var2;
    }

    public static int g0(@androidx.annotation.n0 View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return p.c(view);
        }
        return -1;
    }

    @androidx.annotation.n0
    public static n3 g1(@androidx.annotation.n0 View view, @androidx.annotation.n0 n3 n3Var) {
        WindowInsets windowInsetsJ = n3Var.J();
        if (windowInsetsJ != null) {
            WindowInsets windowInsetsB = l.b(view, windowInsetsJ);
            if (!windowInsetsB.equals(windowInsetsJ)) {
                return n3.L(windowInsetsB, view);
            }
        }
        return n3Var;
    }

    public static void g2(@androidx.annotation.n0 View view, @androidx.annotation.p0 d1 d1Var) {
        if (Build.VERSION.SDK_INT >= 24) {
            o.d(view, (PointerIcon) (d1Var != null ? d1Var.b() : null));
        }
    }

    private static void h() {
        try {
            M = View.class.getDeclaredMethod("dispatchStartTemporaryDetach", new Class[0]);
            N = View.class.getDeclaredMethod("dispatchFinishTemporaryDetach", new Class[0]);
        } catch (NoSuchMethodException e10) {
            Log.e(f21582a, "Couldn't find method", e10);
        }
        O = true;
    }

    @androidx.annotation.p0
    public static String[] h0(@androidx.annotation.n0 View view) {
        return Build.VERSION.SDK_INT >= 31 ? t.a(view) : (String[]) view.getTag(R.id.tag_on_receive_content_mime_types);
    }

    @Deprecated
    public static void h1(View view, AccessibilityEvent accessibilityEvent) {
        view.onInitializeAccessibilityEvent(accessibilityEvent);
    }

    @Deprecated
    public static void h2(View view, float f10) {
        view.setRotation(f10);
    }

    @Deprecated
    public static boolean i(View view, int i10) {
        return view.canScrollHorizontally(i10);
    }

    @Deprecated
    public static int i0(View view) {
        return view.getOverScrollMode();
    }

    public static void i1(@androidx.annotation.n0 View view, @androidx.annotation.n0 androidx.core.view.accessibility.a0 a0Var) {
        view.onInitializeAccessibilityNodeInfo(a0Var.f2());
    }

    @Deprecated
    public static void i2(View view, float f10) {
        view.setRotationX(f10);
    }

    @Deprecated
    public static boolean j(View view, int i10) {
        return view.canScrollVertically(i10);
    }

    @androidx.annotation.t0
    public static int j0(@androidx.annotation.n0 View view) {
        return i.e(view);
    }

    @Deprecated
    public static void j1(View view, AccessibilityEvent accessibilityEvent) {
        view.onPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Deprecated
    public static void j2(View view, float f10) {
        view.setRotationY(f10);
    }

    public static void k(@androidx.annotation.n0 View view) {
        if (Build.VERSION.SDK_INT >= 24) {
            o.a(view);
        }
    }

    @androidx.annotation.t0
    public static int k0(@androidx.annotation.n0 View view) {
        return i.f(view);
    }

    private static f<CharSequence> k1() {
        return new b(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28);
    }

    @Deprecated
    public static void k2(View view, boolean z10) {
        view.setSaveFromParentEnabled(z10);
    }

    @Deprecated
    public static int l(int i10, int i11) {
        return View.combineMeasuredStates(i10, i11);
    }

    @androidx.annotation.p0
    public static ViewParent l0(@androidx.annotation.n0 View view) {
        return h.f(view);
    }

    public static boolean l1(@androidx.annotation.n0 View view, int i10, @androidx.annotation.p0 Bundle bundle) {
        return h.j(view, i10, bundle);
    }

    @Deprecated
    public static void l2(View view, float f10) {
        view.setScaleX(f10);
    }

    private static void m(View view, int i10) {
        view.offsetLeftAndRight(i10);
        if (view.getVisibility() == 0) {
            I2(view);
            Object parent = view.getParent();
            if (parent instanceof View) {
                I2((View) parent);
            }
        }
    }

    @Deprecated
    public static float m0(View view) {
        return view.getPivotX();
    }

    @androidx.annotation.p0
    public static androidx.core.view.e m1(@androidx.annotation.n0 View view, @androidx.annotation.n0 androidx.core.view.e eVar) {
        if (Log.isLoggable(f21582a, 3)) {
            Log.d(f21582a, "performReceiveContent: " + eVar + ", view=" + view.getClass().getSimpleName() + Constants.ARRAY_TYPE + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return t.b(view, eVar);
        }
        a1 a1Var = (a1) view.getTag(R.id.tag_on_receive_content_listener);
        if (a1Var == null) {
            return T(view).a(eVar);
        }
        androidx.core.view.e eVarA = a1Var.a(view, eVar);
        if (eVarA == null) {
            return null;
        }
        return T(view).a(eVarA);
    }

    @Deprecated
    public static void m2(View view, float f10) {
        view.setScaleY(f10);
    }

    private static void n(View view, int i10) {
        view.offsetTopAndBottom(i10);
        if (view.getVisibility() == 0) {
            I2(view);
            Object parent = view.getParent();
            if (parent instanceof View) {
                I2((View) parent);
            }
        }
    }

    @Deprecated
    public static float n0(View view) {
        return view.getPivotY();
    }

    public static void n1(@androidx.annotation.n0 View view) {
        h.k(view);
    }

    @androidx.annotation.i1
    public static void n2(@androidx.annotation.n0 View view, boolean z10) {
        A1().g(view, Boolean.valueOf(z10));
    }

    @androidx.annotation.n0
    public static n3 o(@androidx.annotation.n0 View view, @androidx.annotation.n0 n3 n3Var, @androidx.annotation.n0 Rect rect) {
        return m.b(view, n3Var, rect);
    }

    @androidx.annotation.p0
    public static n3 o0(@androidx.annotation.n0 View view) {
        return n.a(view);
    }

    public static void o1(@androidx.annotation.n0 View view, int i10, int i11, int i12, int i13) {
        h.l(view, i10, i11, i12, i13);
    }

    public static void o2(@androidx.annotation.n0 View view, int i10) {
        n.c(view, i10);
    }

    @androidx.annotation.n0
    public static n3 p(@androidx.annotation.n0 View view, @androidx.annotation.n0 n3 n3Var) {
        WindowInsets windowInsetsJ = n3Var.J();
        if (windowInsetsJ != null) {
            WindowInsets windowInsetsA = l.a(view, windowInsetsJ);
            if (!windowInsetsA.equals(windowInsetsJ)) {
                return n3.L(windowInsetsA, view);
            }
        }
        return n3Var;
    }

    @Deprecated
    public static float p0(View view) {
        return view.getRotation();
    }

    public static void p1(@androidx.annotation.n0 View view, @androidx.annotation.n0 Runnable runnable) {
        h.m(view, runnable);
    }

    public static void p2(@androidx.annotation.n0 View view, int i10, int i11) {
        n.d(view, i10, i11);
    }

    public static void q(@androidx.annotation.n0 View view) {
        if (Build.VERSION.SDK_INT >= 24) {
            o.b(view);
            return;
        }
        if (!O) {
            h();
        }
        Method method = N;
        if (method == null) {
            view.onFinishTemporaryDetach();
            return;
        }
        try {
            method.invoke(view, new Object[0]);
        } catch (Exception e10) {
            Log.d(f21582a, "Error calling dispatchFinishTemporaryDetach", e10);
        }
    }

    @Deprecated
    public static float q0(View view) {
        return view.getRotationX();
    }

    @SuppressLint({"LambdaLast"})
    public static void q1(@androidx.annotation.n0 View view, @androidx.annotation.n0 Runnable runnable, long j10) {
        h.n(view, runnable, j10);
    }

    @androidx.annotation.i1
    public static void q2(@androidx.annotation.n0 View view, @androidx.annotation.p0 CharSequence charSequence) {
        F2().g(view, charSequence);
    }

    public static boolean r(@androidx.annotation.n0 View view, float f10, float f11, boolean z10) {
        return m.c(view, f10, f11, z10);
    }

    @Deprecated
    public static float r0(View view) {
        return view.getRotationY();
    }

    public static void r1(@androidx.annotation.n0 View view, int i10) {
        s1(i10, view);
        d1(view, 0);
    }

    public static void r2(@androidx.annotation.n0 View view, @androidx.annotation.n0 List<Rect> list) {
        if (Build.VERSION.SDK_INT >= 29) {
            r.d(view, list);
        }
    }

    public static boolean s(@androidx.annotation.n0 View view, float f10, float f11) {
        return m.d(view, f10, f11);
    }

    @Deprecated
    public static float s0(View view) {
        return view.getScaleX();
    }

    private static void s1(int i10, View view) {
        List<androidx.core.view.accessibility.a0.a> listK = K(view);
        for (int i11 = 0; i11 < listK.size(); i11++) {
            if (listK.get(i11).b() == i10) {
                listK.remove(i11);
                return;
            }
        }
    }

    public static void s2(@androidx.annotation.n0 View view, @androidx.annotation.p0 CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            p.o(view, charSequence);
        }
    }

    public static boolean t(@androidx.annotation.n0 View view, int i10, int i11, @androidx.annotation.p0 int[] iArr, @androidx.annotation.p0 int[] iArr2) {
        return m.e(view, i10, i11, iArr, iArr2);
    }

    @Deprecated
    public static float t0(View view) {
        return view.getScaleY();
    }

    public static void t1(@androidx.annotation.n0 View view, @androidx.annotation.n0 z zVar) {
        if (Build.VERSION.SDK_INT >= 28) {
            q.e(view, zVar);
            return;
        }
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_unhandled_key_listeners);
        if (arrayList != null) {
            arrayList.remove(zVar);
            if (arrayList.size() == 0) {
                c0.i(view);
            }
        }
    }

    public static void t2(@androidx.annotation.n0 View view, @androidx.annotation.p0 String str) {
        m.v(view, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean u(@androidx.annotation.n0 View view, int i10, int i11, @androidx.annotation.p0 int[] iArr, @androidx.annotation.p0 int[] iArr2, int i12) {
        if (view instanceof r0) {
            return ((r0) view).dispatchNestedPreScroll(i10, i11, iArr, iArr2, i12);
        }
        if (i12 == 0) {
            return t(view, i10, i11, iArr, iArr2);
        }
        return false;
    }

    public static int u0(@androidx.annotation.n0 View view) {
        return n.b(view);
    }

    public static void u1(@androidx.annotation.n0 View view, @androidx.annotation.n0 androidx.core.view.accessibility.a0.a aVar, @androidx.annotation.p0 CharSequence charSequence, @androidx.annotation.p0 androidx.core.view.accessibility.e0 e0Var) {
        if (e0Var == null && charSequence == null) {
            r1(view, aVar.b());
        } else {
            d(view, aVar.a(charSequence, e0Var));
        }
    }

    @Deprecated
    public static void u2(View view, float f10) {
        view.setTranslationX(f10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void v(@androidx.annotation.n0 View view, int i10, int i11, int i12, int i13, @androidx.annotation.p0 int[] iArr, int i14, @androidx.annotation.n0 int[] iArr2) {
        if (view instanceof s0) {
            ((s0) view).dispatchNestedScroll(i10, i11, i12, i13, iArr, i14, iArr2);
        } else {
            x(view, i10, i11, i12, i13, iArr, i14);
        }
    }

    @androidx.annotation.i1
    @androidx.annotation.p0
    public static CharSequence v0(@androidx.annotation.n0 View view) {
        return F2().f(view);
    }

    public static void v1(@androidx.annotation.n0 View view) {
        l.c(view);
    }

    @Deprecated
    public static void v2(View view, float f10) {
        view.setTranslationY(f10);
    }

    public static boolean w(@androidx.annotation.n0 View view, int i10, int i11, int i12, int i13, @androidx.annotation.p0 int[] iArr) {
        return m.f(view, i10, i11, i12, i13, iArr);
    }

    @androidx.annotation.n0
    public static List<Rect> w0(@androidx.annotation.n0 View view) {
        return Build.VERSION.SDK_INT >= 29 ? r.b(view) : Collections.emptyList();
    }

    @androidx.annotation.n0
    public static <T extends View> T w1(@androidx.annotation.n0 View view, @androidx.annotation.d0 int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            return (T) q.f(view, i10);
        }
        T t10 = (T) view.findViewById(i10);
        if (t10 != null) {
            return t10;
        }
        throw new IllegalArgumentException("ID does not reference a View inside this View");
    }

    public static void w2(@androidx.annotation.n0 View view, float f10) {
        m.w(view, f10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean x(@androidx.annotation.n0 View view, int i10, int i11, int i12, int i13, @androidx.annotation.p0 int[] iArr, int i14) {
        if (view instanceof r0) {
            return ((r0) view).dispatchNestedScroll(i10, i11, i12, i13, iArr, i14);
        }
        if (i14 == 0) {
            return w(view, i10, i11, i12, i13, iArr);
        }
        return false;
    }

    @androidx.annotation.p0
    public static String x0(@androidx.annotation.n0 View view) {
        return m.k(view);
    }

    @Deprecated
    public static int x1(int i10, int i11, int i12) {
        return View.resolveSizeAndState(i10, i11, i12);
    }

    private static void x2(View view) {
        if (V(view) == 0) {
            R1(view, 1);
        }
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            if (V((View) parent) == 4) {
                R1(view, 2);
                return;
            }
        }
    }

    public static void y(@androidx.annotation.n0 View view) {
        if (Build.VERSION.SDK_INT >= 24) {
            o.c(view);
            return;
        }
        if (!O) {
            h();
        }
        Method method = M;
        if (method == null) {
            view.onStartTemporaryDetach();
            return;
        }
        try {
            method.invoke(view, new Object[0]);
        } catch (Exception e10) {
            Log.d(f21582a, "Error calling dispatchStartTemporaryDetach", e10);
        }
    }

    @Deprecated
    public static float y0(View view) {
        return view.getTranslationX();
    }

    public static boolean y1(@androidx.annotation.n0 View view) {
        return Build.VERSION.SDK_INT >= 26 ? p.i(view) : view.requestFocus();
    }

    public static void y2(@androidx.annotation.n0 View view, @androidx.annotation.p0 j3.b bVar) {
        j3.h(view, bVar);
    }

    @androidx.annotation.i1
    static boolean z(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return c0.a(view).b(view, keyEvent);
    }

    @Deprecated
    public static float z0(View view) {
        return view.getTranslationY();
    }

    public static void z1(@androidx.annotation.n0 View view, @androidx.annotation.n0 @SuppressLint({"ContextFirst"}) Context context, @androidx.annotation.n0 int[] iArr, @androidx.annotation.p0 AttributeSet attributeSet, @androidx.annotation.n0 TypedArray typedArray, int i10, int i11) {
        if (Build.VERSION.SDK_INT >= 29) {
            r.c(view, context, iArr, attributeSet, typedArray, i10, i11);
        }
    }

    @Deprecated
    public static void z2(View view, float f10) {
        view.setX(f10);
    }
}
