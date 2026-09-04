package com.max.hbcustomview.viewpager2.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.n0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Locale;

/* JADX INFO: compiled from: HBScrollEventAdapter.java */
/* JADX INFO: loaded from: classes10.dex */
public final class g extends RecyclerView.OnScrollListener {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f69788o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f69789p = 1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int f69790q = 2;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int f69791r = 3;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final int f69792s = 4;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int f69793t = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HBViewPager2.i f69794b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @n0
    private final HBViewPager2 f69795c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @n0
    private final RecyclerView f69796d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @n0
    private final LinearLayoutManager f69797e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f69798f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f69799g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private b f69800h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f69801i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f69802j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f69803k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f69804l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f69805m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f69806n;

    /* JADX INFO: compiled from: HBScrollEventAdapter.java */
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    /* JADX INFO: compiled from: HBScrollEventAdapter.java */
    public static final class b {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f69807a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        float f69808b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f69809c;

        b() {
        }

        void a() {
            this.f69807a = -1;
            this.f69808b = 0.0f;
            this.f69809c = 0;
        }
    }

    g(@n0 HBViewPager2 hBViewPager2) {
        this.f69795c = hBViewPager2;
        RecyclerView recyclerView = hBViewPager2.f69738k;
        this.f69796d = recyclerView;
        this.f69797e = (LinearLayoutManager) recyclerView.getLayoutManager();
        this.f69800h = new b();
        resetState();
    }

    private void dispatchScrolled(int i10, float f10, int i11) {
        HBViewPager2.i iVar;
        Object[] objArr = {new Integer(i10), new Float(f10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.Ex, new Class[]{cls, Float.TYPE, cls}, Void.TYPE).isSupported || (iVar = this.f69794b) == null) {
            return;
        }
        iVar.b(i10, f10, i11);
    }

    private void dispatchSelected(int i10) {
        HBViewPager2.i iVar;
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.Dx, new Class[]{Integer.TYPE}, Void.TYPE).isSupported || (iVar = this.f69794b) == null) {
            return;
        }
        iVar.c(i10);
    }

    private void dispatchStateChanged(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.Cx, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if ((this.f69798f == 3 && this.f69799g == 0) || this.f69799g == i10) {
            return;
        }
        this.f69799g = i10;
        HBViewPager2.i iVar = this.f69794b;
        if (iVar != null) {
            iVar.a(i10);
        }
    }

    private int getPosition() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.Fx, new Class[0], Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : this.f69797e.findFirstVisibleItemPosition();
    }

    private boolean isInAnyDraggingState() {
        int i10 = this.f69798f;
        return i10 == 1 || i10 == 4;
    }

    private void resetState() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.tx, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f69798f = 0;
        this.f69799g = 0;
        this.f69800h.a();
        this.f69801i = -1;
        this.f69802j = -1;
        this.f69803k = false;
        this.f69804l = false;
        this.f69806n = false;
        this.f69805m = false;
    }

    private void startDrag(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.f.xx, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f69806n = z10;
        this.f69798f = z10 ? 4 : 1;
        int i10 = this.f69802j;
        if (i10 != -1) {
            this.f69801i = i10;
            this.f69802j = -1;
        } else if (this.f69801i == -1) {
            this.f69801i = getPosition();
        }
        dispatchStateChanged(1);
    }

    private void updateScrollEventValues() {
        int top;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.wx, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        b bVar = this.f69800h;
        int iFindFirstVisibleItemPosition = this.f69797e.findFirstVisibleItemPosition();
        bVar.f69807a = iFindFirstVisibleItemPosition;
        if (iFindFirstVisibleItemPosition == -1) {
            bVar.a();
            return;
        }
        View viewFindViewByPosition = this.f69797e.findViewByPosition(iFindFirstVisibleItemPosition);
        if (viewFindViewByPosition == null) {
            bVar.a();
            return;
        }
        int leftDecorationWidth = this.f69797e.getLeftDecorationWidth(viewFindViewByPosition);
        int rightDecorationWidth = this.f69797e.getRightDecorationWidth(viewFindViewByPosition);
        int topDecorationHeight = this.f69797e.getTopDecorationHeight(viewFindViewByPosition);
        int bottomDecorationHeight = this.f69797e.getBottomDecorationHeight(viewFindViewByPosition);
        ViewGroup.LayoutParams layoutParams = viewFindViewByPosition.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            leftDecorationWidth += marginLayoutParams.leftMargin;
            rightDecorationWidth += marginLayoutParams.rightMargin;
            topDecorationHeight += marginLayoutParams.topMargin;
            bottomDecorationHeight += marginLayoutParams.bottomMargin;
        }
        int height = viewFindViewByPosition.getHeight() + topDecorationHeight + bottomDecorationHeight;
        int width = viewFindViewByPosition.getWidth() + leftDecorationWidth + rightDecorationWidth;
        if (this.f69797e.getOrientation() == 0) {
            top = (viewFindViewByPosition.getLeft() - leftDecorationWidth) - this.f69796d.getPaddingLeft();
            if (this.f69795c.k()) {
                top = -top;
            }
            height = width;
        } else {
            top = (viewFindViewByPosition.getTop() - topDecorationHeight) - this.f69796d.getPaddingTop();
        }
        int i10 = -top;
        bVar.f69809c = i10;
        if (i10 >= 0) {
            bVar.f69808b = height == 0 ? 0.0f : i10 / height;
        } else {
            if (!new com.max.hbcustomview.viewpager2.widget.a(this.f69797e).d()) {
                throw new IllegalStateException(String.format(Locale.US, "Page can only be offset by a positive amount, not by %d", Integer.valueOf(bVar.f69809c)));
            }
            throw new IllegalStateException("Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started.");
        }
    }

    void c(HBViewPager2.i iVar) {
        this.f69794b = iVar;
    }

    double getRelativeScrollPosition() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.Bx, new Class[0], Double.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Double) patchProxyResultProxy.result).doubleValue();
        }
        updateScrollEventValues();
        b bVar = this.f69800h;
        return ((double) bVar.f69807a) + ((double) bVar.f69808b);
    }

    int getScrollState() {
        return this.f69799g;
    }

    boolean isDragging() {
        return this.f69799g == 1;
    }

    boolean isFakeDragging() {
        return this.f69806n;
    }

    boolean isIdle() {
        return this.f69799g == 0;
    }

    void notifyBeginFakeDrag() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.zx, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f69798f = 4;
        startDrag(true);
    }

    void notifyDataSetChangeHappened() {
        this.f69805m = true;
    }

    void notifyEndFakeDrag() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.Ax, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (!isDragging() || this.f69806n) {
            this.f69806n = false;
            updateScrollEventValues();
            b bVar = this.f69800h;
            if (bVar.f69809c != 0) {
                dispatchStateChanged(2);
                return;
            }
            int i10 = bVar.f69807a;
            if (i10 != this.f69801i) {
                dispatchSelected(i10);
            }
            dispatchStateChanged(0);
            resetState();
        }
    }

    void notifyProgrammaticScroll(int i10, boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10), new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.f.yx, new Class[]{Integer.TYPE, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f69798f = z10 ? 2 : 3;
        this.f69806n = false;
        boolean z11 = this.f69802j != i10;
        this.f69802j = i10;
        dispatchStateChanged(2);
        if (z11) {
            dispatchSelected(i10);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public void onScrollStateChanged(@n0 RecyclerView recyclerView, int i10) {
        boolean z10 = true;
        if (PatchProxy.proxy(new Object[]{recyclerView, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.ux, new Class[]{RecyclerView.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (!(this.f69798f == 1 && this.f69799g == 1) && i10 == 1) {
            startDrag(false);
            return;
        }
        if (isInAnyDraggingState() && i10 == 2) {
            if (this.f69804l) {
                dispatchStateChanged(2);
                this.f69803k = true;
                return;
            }
            return;
        }
        if (isInAnyDraggingState() && i10 == 0) {
            updateScrollEventValues();
            if (this.f69804l) {
                b bVar = this.f69800h;
                if (bVar.f69809c == 0) {
                    int i11 = this.f69801i;
                    int i12 = bVar.f69807a;
                    if (i11 != i12) {
                        dispatchSelected(i12);
                    }
                } else {
                    z10 = false;
                }
            } else {
                int i13 = this.f69800h.f69807a;
                if (i13 != -1) {
                    dispatchScrolled(i13, 0.0f, 0);
                }
            }
            if (z10) {
                dispatchStateChanged(0);
                resetState();
            }
        }
        if (this.f69798f == 2 && i10 == 0 && this.f69805m) {
            updateScrollEventValues();
            b bVar2 = this.f69800h;
            if (bVar2.f69809c == 0) {
                int i14 = this.f69802j;
                int i15 = bVar2.f69807a;
                if (i14 != i15) {
                    if (i15 == -1) {
                        i15 = 0;
                    }
                    dispatchSelected(i15);
                }
                dispatchStateChanged(0);
                resetState();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0053  */
    /* JADX WARN: Code duplicated, block: B:22:0x0060  */
    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public void onScrolled(@n0 RecyclerView recyclerView, int i10, int i11) {
        boolean z10;
        int i12;
        Object[] objArr = {recyclerView, new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.vx, new Class[]{RecyclerView.class, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        this.f69804l = true;
        updateScrollEventValues();
        if (this.f69803k) {
            this.f69803k = false;
            if (i11 > 0) {
                z10 = true;
            } else {
                if (i11 == 0) {
                    if ((i10 < 0) == this.f69795c.k()) {
                        z10 = true;
                    }
                }
                z10 = false;
            }
            if (z10) {
                b bVar = this.f69800h;
                if (bVar.f69809c != 0) {
                    i12 = bVar.f69807a + 1;
                } else {
                    i12 = this.f69800h.f69807a;
                }
            } else {
                i12 = this.f69800h.f69807a;
            }
            this.f69802j = i12;
            if (this.f69801i != i12) {
                dispatchSelected(i12);
            }
        } else if (this.f69798f == 0) {
            int i13 = this.f69800h.f69807a;
            if (i13 == -1) {
                i13 = 0;
            }
            dispatchSelected(i13);
        }
        b bVar2 = this.f69800h;
        int i14 = bVar2.f69807a;
        if (i14 == -1) {
            i14 = 0;
        }
        dispatchScrolled(i14, bVar2.f69808b, bVar2.f69809c);
        b bVar3 = this.f69800h;
        int i15 = bVar3.f69807a;
        int i16 = this.f69802j;
        if ((i15 == i16 || i16 == -1) && bVar3.f69809c == 0 && this.f69799g != 1) {
            dispatchStateChanged(0);
            resetState();
        }
    }
}
