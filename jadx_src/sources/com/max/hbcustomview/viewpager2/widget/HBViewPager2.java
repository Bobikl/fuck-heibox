package com.max.hbcustomview.viewpager2.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.RestrictTo;
import androidx.annotation.f0;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.t0;
import androidx.annotation.w0;
import androidx.core.view.accessibility.a0;
import androidx.core.view.accessibility.e0;
import androidx.core.view.j1;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes10.dex */
public final class HBViewPager2 extends ViewGroup {
    public static final int A = 1;
    public static final int B = 2;
    public static final int C = -1;
    static boolean D = true;
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f69726x = 0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f69727y = 1;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f69728z = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Rect f69729b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Rect f69730c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.max.hbcustomview.viewpager2.widget.b f69731d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f69732e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    boolean f69733f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private RecyclerView.AdapterDataObserver f69734g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private LinearLayoutManager f69735h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f69736i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Parcelable f69737j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    RecyclerView f69738k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private PagerSnapHelper f69739l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    com.max.hbcustomview.viewpager2.widget.g f69740m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private com.max.hbcustomview.viewpager2.widget.b f69741n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private com.max.hbcustomview.viewpager2.widget.d f69742o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private com.max.hbcustomview.viewpager2.widget.f f69743p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private RecyclerView.ItemAnimator f69744q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f69745r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f69746s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f69747t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    e f69748u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f69749v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f69750w;

    public class LinearLayoutManagerImpl extends LinearLayoutManager {
        public static ChangeQuickRedirect changeQuickRedirect;

        LinearLayoutManagerImpl(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        public void calculateExtraLayoutSpace(@n0 RecyclerView.State state, @n0 int[] iArr) {
            if (PatchProxy.proxy(new Object[]{state, iArr}, this, changeQuickRedirect, false, bb.c.f.Xy, new Class[]{RecyclerView.State.class, int[].class}, Void.TYPE).isSupported) {
                return;
            }
            int offscreenPageLimit = HBViewPager2.this.getOffscreenPageLimit();
            if (offscreenPageLimit == -1) {
                super.calculateExtraLayoutSpace(state, iArr);
                return;
            }
            int pageSize = HBViewPager2.this.getPageSize() * offscreenPageLimit;
            iArr[0] = pageSize;
            iArr[1] = pageSize;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
        public void onInitializeAccessibilityNodeInfo(@n0 RecyclerView.Recycler recycler, @n0 RecyclerView.State state, @n0 a0 a0Var) {
            if (PatchProxy.proxy(new Object[]{recycler, state, a0Var}, this, changeQuickRedirect, false, bb.c.f.Wy, new Class[]{RecyclerView.Recycler.class, RecyclerView.State.class, a0.class}, Void.TYPE).isSupported) {
                return;
            }
            super.onInitializeAccessibilityNodeInfo(recycler, state, a0Var);
            HBViewPager2.this.f69748u.j(a0Var);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
        public boolean performAccessibilityAction(@n0 RecyclerView.Recycler recycler, @n0 RecyclerView.State state, int i10, @p0 Bundle bundle) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{recycler, state, new Integer(i10), bundle}, this, changeQuickRedirect, false, bb.c.f.Vy, new Class[]{RecyclerView.Recycler.class, RecyclerView.State.class, Integer.TYPE, Bundle.class}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            return HBViewPager2.this.f69748u.b(i10) ? HBViewPager2.this.f69748u.k(i10) : super.performAccessibilityAction(recycler, state, i10, bundle);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
        public boolean requestChildRectangleOnScreen(@n0 RecyclerView recyclerView, @n0 View view, @n0 Rect rect, boolean z10, boolean z11) {
            return false;
        }
    }

    public class RecyclerViewImpl extends RecyclerView {
        public static ChangeQuickRedirect changeQuickRedirect;

        RecyclerViewImpl(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
        @w0(23)
        public CharSequence getAccessibilityClassName() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.sz, new Class[0], CharSequence.class);
            if (patchProxyResultProxy.isSupported) {
                return (CharSequence) patchProxyResultProxy.result;
            }
            return HBViewPager2.this.f69748u.d() ? HBViewPager2.this.f69748u.n() : super.getAccessibilityClassName();
        }

        @Override // android.view.View
        public void onInitializeAccessibilityEvent(@n0 AccessibilityEvent accessibilityEvent) {
            if (PatchProxy.proxy(new Object[]{accessibilityEvent}, this, changeQuickRedirect, false, bb.c.f.tz, new Class[]{AccessibilityEvent.class}, Void.TYPE).isSupported) {
                return;
            }
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setFromIndex(HBViewPager2.this.f69732e);
            accessibilityEvent.setToIndex(HBViewPager2.this.f69732e);
            HBViewPager2.this.f69748u.o(accessibilityEvent);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{motionEvent}, this, changeQuickRedirect, false, bb.c.f.vz, new Class[]{MotionEvent.class}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            return HBViewPager2.this.l() && super.onInterceptTouchEvent(motionEvent);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
        @SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouchEvent(MotionEvent motionEvent) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{motionEvent}, this, changeQuickRedirect, false, bb.c.f.uz, new Class[]{MotionEvent.class}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            return HBViewPager2.this.l() && super.onTouchEvent(motionEvent);
        }
    }

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f69753b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f69754c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Parcelable f69755d;

        public class a implements Parcelable.ClassLoaderCreator<SavedState> {
            public static ChangeQuickRedirect changeQuickRedirect;

            a() {
            }

            public SavedState a(Parcel parcel) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{parcel}, this, changeQuickRedirect, false, bb.c.f.zz, new Class[]{Parcel.class}, SavedState.class);
                return patchProxyResultProxy.isSupported ? (SavedState) patchProxyResultProxy.result : b(parcel, null);
            }

            public SavedState b(Parcel parcel, ClassLoader classLoader) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{parcel, classLoader}, this, changeQuickRedirect, false, bb.c.f.yz, new Class[]{Parcel.class, ClassLoader.class}, SavedState.class);
                if (patchProxyResultProxy.isSupported) {
                    return (SavedState) patchProxyResultProxy.result;
                }
                return Build.VERSION.SDK_INT >= 24 ? new SavedState(parcel, classLoader) : new SavedState(parcel);
            }

            public SavedState[] c(int i10) {
                return new SavedState[i10];
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{parcel}, this, changeQuickRedirect, false, bb.c.f.Cz, new Class[]{Parcel.class}, Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a(parcel);
            }

            /* JADX WARN: Type inference failed for: r9v2, types: [com.max.hbcustomview.viewpager2.widget.HBViewPager2$SavedState, java.lang.Object] */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public /* bridge */ /* synthetic */ SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{parcel, classLoader}, this, changeQuickRedirect, false, bb.c.f.Az, new Class[]{Parcel.class, ClassLoader.class}, Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : b(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ Object[] newArray(int i10) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.Bz, new Class[]{Integer.TYPE}, Object[].class);
                return patchProxyResultProxy.isSupported ? (Object[]) patchProxyResultProxy.result : c(i10);
            }
        }

        SavedState(Parcel parcel) {
            super(parcel);
            a(parcel, null);
        }

        @w0(24)
        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            a(parcel, classLoader);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private void a(Parcel parcel, ClassLoader classLoader) {
            if (PatchProxy.proxy(new Object[]{parcel, classLoader}, this, changeQuickRedirect, false, bb.c.f.wz, new Class[]{Parcel.class, ClassLoader.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f69753b = parcel.readInt();
            this.f69754c = parcel.readInt();
            this.f69755d = parcel.readParcelable(classLoader);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            if (PatchProxy.proxy(new Object[]{parcel, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.xz, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f69753b);
            parcel.writeInt(this.f69754c);
            parcel.writeParcelable(this.f69755d, i10);
        }
    }

    public class a extends g {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
            super(null);
        }

        @Override // com.max.hbcustomview.viewpager2.widget.HBViewPager2.g, androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onChanged() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.Dy, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            HBViewPager2 hBViewPager2 = HBViewPager2.this;
            hBViewPager2.f69733f = true;
            hBViewPager2.f69740m.notifyDataSetChangeHappened();
        }
    }

    public class b extends i {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // com.max.hbcustomview.viewpager2.widget.HBViewPager2.i
        public void a(int i10) {
            if (!PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.Fy, new Class[]{Integer.TYPE}, Void.TYPE).isSupported && i10 == 0) {
                HBViewPager2.this.x();
            }
        }

        @Override // com.max.hbcustomview.viewpager2.widget.HBViewPager2.i
        public void c(int i10) {
            if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.Ey, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            HBViewPager2 hBViewPager2 = HBViewPager2.this;
            if (hBViewPager2.f69732e != i10) {
                hBViewPager2.f69732e = i10;
                hBViewPager2.f69748u.q();
            }
        }
    }

    public class c extends i {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // com.max.hbcustomview.viewpager2.widget.HBViewPager2.i
        public void c(int i10) {
            if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.Gy, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            HBViewPager2.this.clearFocus();
            if (HBViewPager2.this.hasFocus()) {
                HBViewPager2.this.f69738k.requestFocus(2);
            }
        }
    }

    public class d implements RecyclerView.OnChildAttachStateChangeListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
        public void onChildViewAttachedToWindow(@n0 View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.f.Hy, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            if (((ViewGroup.MarginLayoutParams) layoutParams).width != -1 || ((ViewGroup.MarginLayoutParams) layoutParams).height != -1) {
                throw new IllegalStateException("Pages must fill the whole ViewPager2 (use match_parent)");
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
        public void onChildViewDetachedFromWindow(@n0 View view) {
        }
    }

    public abstract class e {
        public static ChangeQuickRedirect changeQuickRedirect;

        private e() {
        }

        /* synthetic */ e(HBViewPager2 hBViewPager2, a aVar) {
            this();
        }

        boolean a() {
            return false;
        }

        boolean b(int i10) {
            return false;
        }

        boolean c(int i10, Bundle bundle) {
            return false;
        }

        boolean d() {
            return false;
        }

        void e(@p0 RecyclerView.Adapter<?> adapter) {
        }

        void f(@p0 RecyclerView.Adapter<?> adapter) {
        }

        String g() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.Iy, new Class[0], String.class);
            if (patchProxyResultProxy.isSupported) {
                return (String) patchProxyResultProxy.result;
            }
            throw new IllegalStateException("Not implemented.");
        }

        void h(@n0 com.max.hbcustomview.viewpager2.widget.b bVar, @n0 RecyclerView recyclerView) {
        }

        void i(AccessibilityNodeInfo accessibilityNodeInfo) {
        }

        void j(@n0 a0 a0Var) {
        }

        boolean k(int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.Ky, new Class[]{Integer.TYPE}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            throw new IllegalStateException("Not implemented.");
        }

        boolean l(int i10, Bundle bundle) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10), bundle}, this, changeQuickRedirect, false, bb.c.f.Jy, new Class[]{Integer.TYPE, Bundle.class}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            throw new IllegalStateException("Not implemented.");
        }

        void m() {
        }

        CharSequence n() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.Ly, new Class[0], CharSequence.class);
            if (patchProxyResultProxy.isSupported) {
                return (CharSequence) patchProxyResultProxy.result;
            }
            throw new IllegalStateException("Not implemented.");
        }

        void o(@n0 AccessibilityEvent accessibilityEvent) {
        }

        void p() {
        }

        void q() {
        }

        void r() {
        }

        void s() {
        }
    }

    public class f extends e {
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
            super(HBViewPager2.this, null);
        }

        @Override // com.max.hbcustomview.viewpager2.widget.HBViewPager2.e
        public boolean b(int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.My, new Class[]{Integer.TYPE}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            return (i10 == 8192 || i10 == 4096) && !HBViewPager2.this.l();
        }

        @Override // com.max.hbcustomview.viewpager2.widget.HBViewPager2.e
        public boolean d() {
            return true;
        }

        @Override // com.max.hbcustomview.viewpager2.widget.HBViewPager2.e
        public void j(@n0 a0 a0Var) {
            if (PatchProxy.proxy(new Object[]{a0Var}, this, changeQuickRedirect, false, bb.c.f.Oy, new Class[]{a0.class}, Void.TYPE).isSupported || HBViewPager2.this.l()) {
                return;
            }
            a0Var.P0(a0.a.f21389s);
            a0Var.P0(a0.a.f21388r);
            a0Var.M1(false);
        }

        @Override // com.max.hbcustomview.viewpager2.widget.HBViewPager2.e
        public boolean k(int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.Ny, new Class[]{Integer.TYPE}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            if (b(i10)) {
                return false;
            }
            throw new IllegalStateException();
        }

        @Override // com.max.hbcustomview.viewpager2.widget.HBViewPager2.e
        public CharSequence n() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.Py, new Class[0], CharSequence.class);
            if (patchProxyResultProxy.isSupported) {
                return (CharSequence) patchProxyResultProxy.result;
            }
            if (d()) {
                return "androidx.viewpager.widget.ViewPager";
            }
            throw new IllegalStateException();
        }
    }

    public static abstract class g extends RecyclerView.AdapterDataObserver {
        public static ChangeQuickRedirect changeQuickRedirect;

        private g() {
        }

        /* synthetic */ g(a aVar) {
            this();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public abstract void onChanged();

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeChanged(int i10, int i11) {
            Object[] objArr = {new Integer(i10), new Integer(i11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.Qy, new Class[]{cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeChanged(int i10, int i11, @p0 Object obj) {
            Object[] objArr = {new Integer(i10), new Integer(i11), obj};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.Ry, new Class[]{cls, cls, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeInserted(int i10, int i11) {
            Object[] objArr = {new Integer(i10), new Integer(i11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.Sy, new Class[]{cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeMoved(int i10, int i11, int i12) {
            Object[] objArr = {new Integer(i10), new Integer(i11), new Integer(i12)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.Uy, new Class[]{cls, cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeRemoved(int i10, int i11) {
            Object[] objArr = {new Integer(i10), new Integer(i11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.Ty, new Class[]{cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            onChanged();
        }
    }

    @f0(from = 1)
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface h {
    }

    public static abstract class i {
        public static ChangeQuickRedirect changeQuickRedirect;

        public void a(int i10) {
        }

        public void b(int i10, float f10, @t0 int i11) {
        }

        public void c(int i10) {
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface j {
    }

    public class k extends e {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final e0 f69762b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final e0 f69763c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private RecyclerView.AdapterDataObserver f69764d;

        public class a implements e0 {
            public static ChangeQuickRedirect changeQuickRedirect;

            a() {
            }

            @Override // androidx.core.view.accessibility.e0
            public boolean perform(@n0 View view, @p0 e0.a aVar) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view, aVar}, this, changeQuickRedirect, false, bb.c.f.oz, new Class[]{View.class, e0.a.class}, Boolean.TYPE);
                if (patchProxyResultProxy.isSupported) {
                    return ((Boolean) patchProxyResultProxy.result).booleanValue();
                }
                k.this.v(((HBViewPager2) view).getCurrentItem() + 1);
                return true;
            }
        }

        public class b implements e0 {
            public static ChangeQuickRedirect changeQuickRedirect;

            b() {
            }

            @Override // androidx.core.view.accessibility.e0
            public boolean perform(@n0 View view, @p0 e0.a aVar) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view, aVar}, this, changeQuickRedirect, false, bb.c.f.pz, new Class[]{View.class, e0.a.class}, Boolean.TYPE);
                if (patchProxyResultProxy.isSupported) {
                    return ((Boolean) patchProxyResultProxy.result).booleanValue();
                }
                k.this.v(((HBViewPager2) view).getCurrentItem() - 1);
                return true;
            }
        }

        public class c extends g {
            public static ChangeQuickRedirect changeQuickRedirect;

            c() {
                super(null);
            }

            @Override // com.max.hbcustomview.viewpager2.widget.HBViewPager2.g, androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
            public void onChanged() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.qz, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                k.this.w();
            }
        }

        k() {
            super(HBViewPager2.this, null);
            this.f69762b = new a();
            this.f69763c = new b();
        }

        private void t(AccessibilityNodeInfo accessibilityNodeInfo) {
            int itemCount;
            int itemCount2;
            if (PatchProxy.proxy(new Object[]{accessibilityNodeInfo}, this, changeQuickRedirect, false, bb.c.f.mz, new Class[]{AccessibilityNodeInfo.class}, Void.TYPE).isSupported) {
                return;
            }
            if (HBViewPager2.this.getAdapter() == null) {
                itemCount = 0;
                itemCount2 = 0;
            } else if (HBViewPager2.this.getOrientation() == 1) {
                itemCount = HBViewPager2.this.getAdapter().getItemCount();
                itemCount2 = 0;
            } else {
                itemCount2 = HBViewPager2.this.getAdapter().getItemCount();
                itemCount = 0;
            }
            a0.g2(accessibilityNodeInfo).d1(a0.d.f(itemCount, itemCount2, false, 0));
        }

        private void u(AccessibilityNodeInfo accessibilityNodeInfo) {
            RecyclerView.Adapter adapter;
            int itemCount;
            if (PatchProxy.proxy(new Object[]{accessibilityNodeInfo}, this, changeQuickRedirect, false, bb.c.f.nz, new Class[]{AccessibilityNodeInfo.class}, Void.TYPE).isSupported || (adapter = HBViewPager2.this.getAdapter()) == null || (itemCount = adapter.getItemCount()) == 0 || !HBViewPager2.this.l()) {
                return;
            }
            if (HBViewPager2.this.f69732e > 0) {
                accessibilityNodeInfo.addAction(8192);
            }
            if (HBViewPager2.this.f69732e < itemCount - 1) {
                accessibilityNodeInfo.addAction(4096);
            }
            accessibilityNodeInfo.setScrollable(true);
        }

        @Override // com.max.hbcustomview.viewpager2.widget.HBViewPager2.e
        public boolean a() {
            return true;
        }

        @Override // com.max.hbcustomview.viewpager2.widget.HBViewPager2.e
        public boolean c(int i10, Bundle bundle) {
            return i10 == 8192 || i10 == 4096;
        }

        @Override // com.max.hbcustomview.viewpager2.widget.HBViewPager2.e
        public void e(@p0 RecyclerView.Adapter<?> adapter) {
            if (PatchProxy.proxy(new Object[]{adapter}, this, changeQuickRedirect, false, bb.c.f.bz, new Class[]{RecyclerView.Adapter.class}, Void.TYPE).isSupported) {
                return;
            }
            w();
            if (adapter != null) {
                adapter.registerAdapterDataObserver(this.f69764d);
            }
        }

        @Override // com.max.hbcustomview.viewpager2.widget.HBViewPager2.e
        public void f(@p0 RecyclerView.Adapter<?> adapter) {
            if (PatchProxy.proxy(new Object[]{adapter}, this, changeQuickRedirect, false, bb.c.f.cz, new Class[]{RecyclerView.Adapter.class}, Void.TYPE).isSupported || adapter == null) {
                return;
            }
            adapter.unregisterAdapterDataObserver(this.f69764d);
        }

        @Override // com.max.hbcustomview.viewpager2.widget.HBViewPager2.e
        public String g() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.Zy, new Class[0], String.class);
            if (patchProxyResultProxy.isSupported) {
                return (String) patchProxyResultProxy.result;
            }
            if (a()) {
                return "androidx.viewpager.widget.ViewPager";
            }
            throw new IllegalStateException();
        }

        @Override // com.max.hbcustomview.viewpager2.widget.HBViewPager2.e
        public void h(@n0 com.max.hbcustomview.viewpager2.widget.b bVar, @n0 RecyclerView recyclerView) {
            if (PatchProxy.proxy(new Object[]{bVar, recyclerView}, this, changeQuickRedirect, false, bb.c.f.Yy, new Class[]{com.max.hbcustomview.viewpager2.widget.b.class, RecyclerView.class}, Void.TYPE).isSupported) {
                return;
            }
            j1.R1(recyclerView, 2);
            this.f69764d = new c();
            if (j1.V(HBViewPager2.this) == 0) {
                j1.R1(HBViewPager2.this, 1);
            }
        }

        @Override // com.max.hbcustomview.viewpager2.widget.HBViewPager2.e
        public void i(AccessibilityNodeInfo accessibilityNodeInfo) {
            if (PatchProxy.proxy(new Object[]{accessibilityNodeInfo}, this, changeQuickRedirect, false, bb.c.f.hz, new Class[]{AccessibilityNodeInfo.class}, Void.TYPE).isSupported) {
                return;
            }
            t(accessibilityNodeInfo);
            u(accessibilityNodeInfo);
        }

        @Override // com.max.hbcustomview.viewpager2.widget.HBViewPager2.e
        public boolean l(int i10, Bundle bundle) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10), bundle}, this, changeQuickRedirect, false, bb.c.f.iz, new Class[]{Integer.TYPE, Bundle.class}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            if (!c(i10, bundle)) {
                throw new IllegalStateException();
            }
            v(i10 == 8192 ? HBViewPager2.this.getCurrentItem() - 1 : HBViewPager2.this.getCurrentItem() + 1);
            return true;
        }

        @Override // com.max.hbcustomview.viewpager2.widget.HBViewPager2.e
        public void m() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.az, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            w();
        }

        @Override // com.max.hbcustomview.viewpager2.widget.HBViewPager2.e
        public void o(@n0 AccessibilityEvent accessibilityEvent) {
            if (PatchProxy.proxy(new Object[]{accessibilityEvent}, this, changeQuickRedirect, false, bb.c.f.jz, new Class[]{AccessibilityEvent.class}, Void.TYPE).isSupported) {
                return;
            }
            accessibilityEvent.setSource(HBViewPager2.this);
            accessibilityEvent.setClassName(g());
        }

        @Override // com.max.hbcustomview.viewpager2.widget.HBViewPager2.e
        public void p() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.gz, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            w();
        }

        @Override // com.max.hbcustomview.viewpager2.widget.HBViewPager2.e
        public void q() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.ez, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            w();
        }

        @Override // com.max.hbcustomview.viewpager2.widget.HBViewPager2.e
        public void r() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.dz, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            w();
        }

        @Override // com.max.hbcustomview.viewpager2.widget.HBViewPager2.e
        public void s() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.fz, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            w();
        }

        void v(int i10) {
            if (!PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.kz, new Class[]{Integer.TYPE}, Void.TYPE).isSupported && HBViewPager2.this.l()) {
                HBViewPager2.this.s(i10, true);
            }
        }

        void w() {
            int itemCount;
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.lz, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            HBViewPager2 hBViewPager2 = HBViewPager2.this;
            int i10 = R.id.accessibilityActionPageLeft;
            j1.r1(hBViewPager2, R.id.accessibilityActionPageLeft);
            j1.r1(hBViewPager2, R.id.accessibilityActionPageRight);
            j1.r1(hBViewPager2, R.id.accessibilityActionPageUp);
            j1.r1(hBViewPager2, R.id.accessibilityActionPageDown);
            if (HBViewPager2.this.getAdapter() == null || (itemCount = HBViewPager2.this.getAdapter().getItemCount()) == 0 || !HBViewPager2.this.l()) {
                return;
            }
            if (HBViewPager2.this.getOrientation() != 0) {
                if (HBViewPager2.this.f69732e < itemCount - 1) {
                    j1.u1(hBViewPager2, new a0.a(R.id.accessibilityActionPageDown, null), null, this.f69762b);
                }
                if (HBViewPager2.this.f69732e > 0) {
                    j1.u1(hBViewPager2, new a0.a(R.id.accessibilityActionPageUp, null), null, this.f69763c);
                    return;
                }
                return;
            }
            boolean zK = HBViewPager2.this.k();
            int i11 = zK ? 16908360 : 16908361;
            if (zK) {
                i10 = 16908361;
            }
            if (HBViewPager2.this.f69732e < itemCount - 1) {
                j1.u1(hBViewPager2, new a0.a(i11, null), null, this.f69762b);
            }
            if (HBViewPager2.this.f69732e > 0) {
                j1.u1(hBViewPager2, new a0.a(i10, null), null, this.f69763c);
            }
        }
    }

    public interface l {
        void transformPage(@n0 View view, float f10);
    }

    public class m extends PagerSnapHelper {
        public static ChangeQuickRedirect changeQuickRedirect;

        m() {
        }

        @Override // androidx.recyclerview.widget.PagerSnapHelper, androidx.recyclerview.widget.SnapHelper
        @p0
        public View findSnapView(RecyclerView.LayoutManager layoutManager) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutManager}, this, changeQuickRedirect, false, bb.c.f.rz, new Class[]{RecyclerView.LayoutManager.class}, View.class);
            if (patchProxyResultProxy.isSupported) {
                return (View) patchProxyResultProxy.result;
            }
            if (HBViewPager2.this.j()) {
                return null;
            }
            return super.findSnapView(layoutManager);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface n {
    }

    public static class o implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f69770b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final RecyclerView f69771c;

        o(int i10, RecyclerView recyclerView) {
            this.f69770b = i10;
            this.f69771c = recyclerView;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.Dz, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            this.f69771c.smoothScrollToPosition(this.f69770b);
        }
    }

    public HBViewPager2(@n0 Context context) {
        super(context);
        this.f69729b = new Rect();
        this.f69730c = new Rect();
        this.f69731d = new com.max.hbcustomview.viewpager2.widget.b(3);
        this.f69733f = false;
        this.f69734g = new a();
        this.f69736i = -1;
        this.f69744q = null;
        this.f69745r = false;
        this.f69746s = true;
        this.f69747t = -1;
        this.f69749v = 3;
        this.f69750w = 0;
        h(context, null);
    }

    public HBViewPager2(@n0 Context context, @p0 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f69729b = new Rect();
        this.f69730c = new Rect();
        this.f69731d = new com.max.hbcustomview.viewpager2.widget.b(3);
        this.f69733f = false;
        this.f69734g = new a();
        this.f69736i = -1;
        this.f69744q = null;
        this.f69745r = false;
        this.f69746s = true;
        this.f69747t = -1;
        this.f69749v = 3;
        this.f69750w = 0;
        h(context, attributeSet);
    }

    public HBViewPager2(@n0 Context context, @p0 AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f69729b = new Rect();
        this.f69730c = new Rect();
        this.f69731d = new com.max.hbcustomview.viewpager2.widget.b(3);
        this.f69733f = false;
        this.f69734g = new a();
        this.f69736i = -1;
        this.f69744q = null;
        this.f69745r = false;
        this.f69746s = true;
        this.f69747t = -1;
        this.f69749v = 3;
        this.f69750w = 0;
        h(context, attributeSet);
    }

    @w0(21)
    public HBViewPager2(@n0 Context context, @p0 AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f69729b = new Rect();
        this.f69730c = new Rect();
        this.f69731d = new com.max.hbcustomview.viewpager2.widget.b(3);
        this.f69733f = false;
        this.f69734g = new a();
        this.f69736i = -1;
        this.f69744q = null;
        this.f69745r = false;
        this.f69746s = true;
        this.f69747t = -1;
        this.f69749v = 3;
        this.f69750w = 0;
        h(context, attributeSet);
    }

    private RecyclerView.OnChildAttachStateChangeListener e() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.Hx, new Class[0], RecyclerView.OnChildAttachStateChangeListener.class);
        return patchProxyResultProxy.isSupported ? (RecyclerView.OnChildAttachStateChangeListener) patchProxyResultProxy.result : new d();
    }

    private void h(Context context, AttributeSet attributeSet) {
        if (PatchProxy.proxy(new Object[]{context, attributeSet}, this, changeQuickRedirect, false, bb.c.f.Gx, new Class[]{Context.class, AttributeSet.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f69748u = D ? new k() : new f();
        RecyclerViewImpl recyclerViewImpl = new RecyclerViewImpl(context);
        this.f69738k = recyclerViewImpl;
        recyclerViewImpl.setId(j1.D());
        this.f69738k.setDescendantFocusability(131072);
        LinearLayoutManagerImpl linearLayoutManagerImpl = new LinearLayoutManagerImpl(context);
        this.f69735h = linearLayoutManagerImpl;
        this.f69738k.setLayoutManager(linearLayoutManagerImpl);
        this.f69738k.setScrollingTouchSlop(1);
        t(context, attributeSet);
        this.f69738k.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.f69738k.addOnChildAttachStateChangeListener(e());
        com.max.hbcustomview.viewpager2.widget.g gVar = new com.max.hbcustomview.viewpager2.widget.g(this);
        this.f69740m = gVar;
        this.f69742o = new com.max.hbcustomview.viewpager2.widget.d(this, gVar, this.f69738k);
        m mVar = new m();
        this.f69739l = mVar;
        mVar.attachToRecyclerView(this.f69738k);
        this.f69738k.addOnScrollListener(this.f69740m);
        com.max.hbcustomview.viewpager2.widget.b bVar = new com.max.hbcustomview.viewpager2.widget.b(3);
        this.f69741n = bVar;
        this.f69740m.c(bVar);
        b bVar2 = new b();
        c cVar = new c();
        this.f69741n.d(bVar2);
        this.f69741n.d(cVar);
        this.f69748u.h(this.f69741n, this.f69738k);
        this.f69741n.d(this.f69731d);
        com.max.hbcustomview.viewpager2.widget.f fVar = new com.max.hbcustomview.viewpager2.widget.f(this.f69735h);
        this.f69743p = fVar;
        this.f69741n.d(fVar);
        RecyclerView recyclerView = this.f69738k;
        attachViewToParent(recyclerView, 0, recyclerView.getLayoutParams());
    }

    private void m(@p0 RecyclerView.Adapter<?> adapter) {
        if (PatchProxy.proxy(new Object[]{adapter}, this, changeQuickRedirect, false, bb.c.f.Px, new Class[]{RecyclerView.Adapter.class}, Void.TYPE).isSupported || adapter == null) {
            return;
        }
        adapter.registerAdapterDataObserver(this.f69734g);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void r() {
        RecyclerView.Adapter adapter;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.Mx, new Class[0], Void.TYPE).isSupported || this.f69736i == -1 || (adapter = getAdapter()) == 0) {
            return;
        }
        Parcelable parcelable = this.f69737j;
        if (parcelable != null) {
            if (adapter instanceof com.max.hbcustomview.viewpager2.adapter.b) {
                ((com.max.hbcustomview.viewpager2.adapter.b) adapter).restoreState(parcelable);
            }
            this.f69737j = null;
        }
        int iMax = Math.max(0, Math.min(this.f69736i, adapter.getItemCount() - 1));
        this.f69732e = iMax;
        this.f69736i = -1;
        this.f69738k.scrollToPosition(iMax);
        this.f69748u.m();
    }

    private void t(Context context, AttributeSet attributeSet) {
        if (PatchProxy.proxy(new Object[]{context, attributeSet}, this, changeQuickRedirect, false, bb.c.f.Jx, new Class[]{Context.class, AttributeSet.class}, Void.TYPE).isSupported) {
            return;
        }
        int[] iArr = com.max.hbcustomview.R.styleable.F3;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, typedArrayObtainStyledAttributes, 0, 0);
        }
        try {
            setOrientation(typedArrayObtainStyledAttributes.getInt(com.max.hbcustomview.R.styleable.ViewPager2_android_orientation, 0));
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    private void v(@p0 RecyclerView.Adapter<?> adapter) {
        if (PatchProxy.proxy(new Object[]{adapter}, this, changeQuickRedirect, false, bb.c.f.Qx, new Class[]{RecyclerView.Adapter.class}, Void.TYPE).isSupported || adapter == null) {
            return;
        }
        adapter.unregisterAdapterDataObserver(this.f69734g);
    }

    public void a(@n0 RecyclerView.ItemDecoration itemDecoration) {
        if (PatchProxy.proxy(new Object[]{itemDecoration}, this, changeQuickRedirect, false, bb.c.f.wy, new Class[]{RecyclerView.ItemDecoration.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f69738k.addItemDecoration(itemDecoration);
    }

    public void b(@n0 RecyclerView.ItemDecoration itemDecoration, int i10) {
        if (PatchProxy.proxy(new Object[]{itemDecoration, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.xy, new Class[]{RecyclerView.ItemDecoration.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f69738k.addItemDecoration(itemDecoration, i10);
    }

    public boolean c() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.fy, new Class[0], Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : this.f69742o.b();
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.my, new Class[]{Integer.TYPE}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : this.f69738k.canScrollHorizontally(i10);
    }

    @Override // android.view.View
    public boolean canScrollVertically(int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.ny, new Class[]{Integer.TYPE}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : this.f69738k.canScrollVertically(i10);
    }

    public boolean d() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.hy, new Class[0], Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : this.f69742o.d();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        if (PatchProxy.proxy(new Object[]{sparseArray}, this, changeQuickRedirect, false, bb.c.f.Nx, new Class[]{SparseArray.class}, Void.TYPE).isSupported) {
            return;
        }
        Parcelable parcelable = sparseArray.get(getId());
        if (parcelable instanceof SavedState) {
            int i10 = ((SavedState) parcelable).f69753b;
            sparseArray.put(this.f69738k.getId(), sparseArray.get(i10));
            sparseArray.remove(i10);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        r();
    }

    public boolean f(@SuppressLint({"SupportAnnotationUsage"}) @t0 float f10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Float(f10)}, this, changeQuickRedirect, false, bb.c.f.gy, new Class[]{Float.TYPE}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : this.f69742o.e(f10);
    }

    @n0
    public RecyclerView.ItemDecoration g(int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.yy, new Class[]{Integer.TYPE}, RecyclerView.ItemDecoration.class);
        return patchProxyResultProxy.isSupported ? (RecyclerView.ItemDecoration) patchProxyResultProxy.result : this.f69738k.getItemDecorationAt(i10);
    }

    @Override // android.view.ViewGroup, android.view.View
    @w0(23)
    public CharSequence getAccessibilityClassName() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.Ix, new Class[0], CharSequence.class);
        if (patchProxyResultProxy.isSupported) {
            return (CharSequence) patchProxyResultProxy.result;
        }
        return this.f69748u.a() ? this.f69748u.g() : super.getAccessibilityClassName();
    }

    @p0
    public RecyclerView.Adapter getAdapter() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.Rx, new Class[0], RecyclerView.Adapter.class);
        return patchProxyResultProxy.isSupported ? (RecyclerView.Adapter) patchProxyResultProxy.result : this.f69738k.getAdapter();
    }

    public int getAlreadySelectCurrentPosition() {
        return this.f69750w;
    }

    public int getCurrentItem() {
        return this.f69732e;
    }

    public int getItemDecorationCount() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.zy, new Class[0], Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : this.f69738k.getItemDecorationCount();
    }

    public int getMaxOverScrollPages() {
        return this.f69749v;
    }

    public int getOffscreenPageLimit() {
        return this.f69747t;
    }

    public int getOrientation() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.Yx, new Class[0], Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : this.f69735h.getOrientation();
    }

    int getPageSize() {
        int height;
        int paddingBottom;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.Wx, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        RecyclerView recyclerView = this.f69738k;
        if (getOrientation() == 0) {
            height = recyclerView.getWidth() - recyclerView.getPaddingLeft();
            paddingBottom = recyclerView.getPaddingRight();
        } else {
            height = recyclerView.getHeight() - recyclerView.getPaddingTop();
            paddingBottom = recyclerView.getPaddingBottom();
        }
        return height - paddingBottom;
    }

    public l getPageTransformer() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.ry, new Class[0], l.class);
        if (patchProxyResultProxy.isSupported) {
            return (l) patchProxyResultProxy.result;
        }
        com.max.hbcustomview.viewpager2.widget.f fVar = this.f69743p;
        if (fVar != null) {
            return fVar.d();
        }
        return null;
    }

    public int getScrollState() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.ey, new Class[0], Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : this.f69740m.getScrollState();
    }

    public void i() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.Ay, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f69738k.invalidateItemDecorations();
    }

    public boolean j() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.iy, new Class[0], Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : this.f69742o.f();
    }

    boolean k() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.Zx, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return this.f69735h.getLayoutDirection() == 1;
    }

    public boolean l() {
        return this.f69746s;
    }

    public void n(@n0 i iVar) {
        if (PatchProxy.proxy(new Object[]{iVar}, this, changeQuickRedirect, false, bb.c.f.oy, new Class[]{i.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f69731d.d(iVar);
    }

    public void o(@n0 RecyclerView.ItemDecoration itemDecoration) {
        if (PatchProxy.proxy(new Object[]{itemDecoration}, this, changeQuickRedirect, false, bb.c.f.Cy, new Class[]{RecyclerView.ItemDecoration.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f69738k.removeItemDecoration(itemDecoration);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        if (PatchProxy.proxy(new Object[]{accessibilityNodeInfo}, this, changeQuickRedirect, false, bb.c.f.uy, new Class[]{AccessibilityNodeInfo.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f69748u.i(accessibilityNodeInfo);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        Object[] objArr = {new Byte(z10 ? (byte) 1 : (byte) 0), new Integer(i10), new Integer(i11), new Integer(i12), new Integer(i13)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.Ux, new Class[]{Boolean.TYPE, cls, cls, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        int measuredWidth = this.f69738k.getMeasuredWidth();
        int measuredHeight = this.f69738k.getMeasuredHeight();
        this.f69729b.left = getPaddingLeft();
        this.f69729b.right = (i12 - i10) - getPaddingRight();
        this.f69729b.top = getPaddingTop();
        this.f69729b.bottom = (i13 - i11) - getPaddingBottom();
        Gravity.apply(8388659, measuredWidth, measuredHeight, this.f69729b, this.f69730c);
        RecyclerView recyclerView = this.f69738k;
        Rect rect = this.f69730c;
        recyclerView.layout(rect.left, rect.top, rect.right, rect.bottom);
        if (this.f69733f) {
            x();
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.Tx, new Class[]{cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        measureChild(this.f69738k, i10, i11);
        int measuredWidth = this.f69738k.getMeasuredWidth();
        int measuredHeight = this.f69738k.getMeasuredHeight();
        int measuredState = this.f69738k.getMeasuredState();
        setMeasuredDimension(View.resolveSizeAndState(Math.max(measuredWidth + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i10, measuredState), View.resolveSizeAndState(Math.max(measuredHeight + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i11, measuredState << 16));
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (PatchProxy.proxy(new Object[]{parcelable}, this, changeQuickRedirect, false, bb.c.f.Lx, new Class[]{Parcelable.class}, Void.TYPE).isSupported) {
            return;
        }
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f69736i = savedState.f69754c;
        this.f69737j = savedState.f69755d;
    }

    @Override // android.view.View
    @p0
    public Parcelable onSaveInstanceState() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.Kx, new Class[0], Parcelable.class);
        if (patchProxyResultProxy.isSupported) {
            return (Parcelable) patchProxyResultProxy.result;
        }
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f69753b = this.f69738k.getId();
        int i10 = this.f69736i;
        if (i10 == -1) {
            i10 = this.f69732e;
        }
        savedState.f69754c = i10;
        Parcelable parcelable = this.f69737j;
        if (parcelable != null) {
            savedState.f69755d = parcelable;
        } else {
            Object adapter = this.f69738k.getAdapter();
            if (adapter instanceof com.max.hbcustomview.viewpager2.adapter.b) {
                savedState.f69755d = ((com.max.hbcustomview.viewpager2.adapter.b) adapter).saveState();
            }
        }
        return savedState;
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.f.Sx, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        throw new IllegalStateException(HBViewPager2.class.getSimpleName() + " does not support direct child views");
    }

    public void p(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.By, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f69738k.removeItemDecorationAt(i10);
    }

    @Override // android.view.View
    @w0(16)
    public boolean performAccessibilityAction(int i10, Bundle bundle) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10), bundle}, this, changeQuickRedirect, false, bb.c.f.vy, new Class[]{Integer.TYPE, Bundle.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return this.f69748u.c(i10, bundle) ? this.f69748u.l(i10, bundle) : super.performAccessibilityAction(i10, bundle);
    }

    public void q() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.sy, new Class[0], Void.TYPE).isSupported || this.f69743p.d() == null) {
            return;
        }
        double relativeScrollPosition = this.f69740m.getRelativeScrollPosition();
        int i10 = (int) relativeScrollPosition;
        float f10 = (float) (relativeScrollPosition - ((double) i10));
        this.f69743p.b(i10, f10, Math.round(getPageSize() * f10));
    }

    void s(int i10, boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10), new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.f.dy, new Class[]{Integer.TYPE, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        RecyclerView.Adapter adapter = getAdapter();
        if (adapter == null) {
            if (this.f69736i != -1) {
                this.f69736i = Math.max(i10, 0);
                return;
            }
            return;
        }
        if (adapter.getItemCount() <= 0) {
            return;
        }
        int iMin = Math.min(Math.max(i10, 0), adapter.getItemCount() - 1);
        if (iMin == this.f69732e && this.f69740m.isIdle()) {
            return;
        }
        int i11 = this.f69732e;
        if (iMin == i11 && z10) {
            return;
        }
        double relativeScrollPosition = i11;
        this.f69732e = iMin;
        this.f69748u.q();
        if (!this.f69740m.isIdle()) {
            relativeScrollPosition = this.f69740m.getRelativeScrollPosition();
        }
        this.f69740m.notifyProgrammaticScroll(iMin, z10);
        if (!z10) {
            this.f69738k.scrollToPosition(iMin);
            return;
        }
        double d10 = iMin;
        double dAbs = Math.abs(d10 - relativeScrollPosition);
        int i12 = this.f69749v;
        if (dAbs <= i12) {
            this.f69738k.smoothScrollToPosition(iMin);
            return;
        }
        this.f69738k.scrollToPosition(d10 > relativeScrollPosition ? iMin - i12 : i12 + iMin);
        RecyclerView recyclerView = this.f69738k;
        recyclerView.post(new o(iMin, recyclerView));
    }

    public void setAdapter(@p0 RecyclerView.Adapter adapter) {
        if (PatchProxy.proxy(new Object[]{adapter}, this, changeQuickRedirect, false, bb.c.f.Ox, new Class[]{RecyclerView.Adapter.class}, Void.TYPE).isSupported) {
            return;
        }
        RecyclerView.Adapter adapter2 = this.f69738k.getAdapter();
        this.f69748u.f(adapter2);
        v(adapter2);
        this.f69738k.setAdapter(adapter);
        this.f69732e = 0;
        r();
        this.f69748u.e(adapter);
        m(adapter);
    }

    public void setCurrentItem(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.ay, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        setCurrentItem(i10, true);
    }

    public void setCurrentItem(int i10, boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10), new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.f.cy, new Class[]{Integer.TYPE, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f69750w = i10;
        if (j()) {
            throw new IllegalStateException("Cannot change current item when ViewPager2 is fake dragging");
        }
        s(i10, z10);
    }

    @Override // android.view.View
    @w0(17)
    public void setLayoutDirection(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.ty, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        super.setLayoutDirection(i10);
        this.f69748u.p();
    }

    public void setMaxOverScrollPages(int i10) {
        this.f69749v = i10;
    }

    public void setOffscreenPageLimit(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.ly, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (i10 < 1 && i10 != -1) {
            throw new IllegalArgumentException("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
        }
        this.f69747t = i10;
        this.f69738k.requestLayout();
    }

    public void setOrientation(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.Xx, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f69735h.setOrientation(i10);
        this.f69748u.r();
    }

    public void setPageTransformer(@p0 l lVar) {
        if (PatchProxy.proxy(new Object[]{lVar}, this, changeQuickRedirect, false, bb.c.f.qy, new Class[]{l.class}, Void.TYPE).isSupported) {
            return;
        }
        if (lVar != null) {
            if (!this.f69745r) {
                this.f69744q = this.f69738k.getItemAnimator();
                this.f69745r = true;
            }
            this.f69738k.setItemAnimator(null);
        } else if (this.f69745r) {
            this.f69738k.setItemAnimator(this.f69744q);
            this.f69744q = null;
            this.f69745r = false;
        }
        if (lVar == this.f69743p.d()) {
            return;
        }
        this.f69743p.e(lVar);
        q();
    }

    public void setUserInputEnabled(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.f.ky, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f69746s = z10;
        this.f69748u.s();
    }

    void u() {
        View viewFindSnapView;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.jy, new Class[0], Void.TYPE).isSupported || (viewFindSnapView = this.f69739l.findSnapView(this.f69735h)) == null) {
            return;
        }
        int[] iArrCalculateDistanceToFinalSnap = this.f69739l.calculateDistanceToFinalSnap(this.f69735h, viewFindSnapView);
        int i10 = iArrCalculateDistanceToFinalSnap[0];
        if (i10 == 0 && iArrCalculateDistanceToFinalSnap[1] == 0) {
            return;
        }
        this.f69738k.smoothScrollBy(i10, iArrCalculateDistanceToFinalSnap[1]);
    }

    public void w(@n0 i iVar) {
        if (PatchProxy.proxy(new Object[]{iVar}, this, changeQuickRedirect, false, bb.c.f.py, new Class[]{i.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f69731d.e(iVar);
    }

    void x() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.Vx, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        PagerSnapHelper pagerSnapHelper = this.f69739l;
        if (pagerSnapHelper == null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        View viewFindSnapView = pagerSnapHelper.findSnapView(this.f69735h);
        if (viewFindSnapView == null) {
            return;
        }
        int position = this.f69735h.getPosition(viewFindSnapView);
        if (position != this.f69732e && getScrollState() == 0) {
            this.f69741n.c(position);
        }
        this.f69733f = false;
    }
}
