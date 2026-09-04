package com.google.android.material.bottomsheet;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.accessibility.a0;
import androidx.core.view.accessibility.e0;
import androidx.core.view.j1;
import com.google.android.material.R;

/* JADX INFO: loaded from: classes7.dex */
public class BottomSheetDragHandleView extends AppCompatImageView implements AccessibilityManager.AccessibilityStateChangeListener {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f53310k = R.style.Widget_Material3_BottomSheet_DragHandle;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @p0
    private final AccessibilityManager f53311b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @p0
    private BottomSheetBehavior<?> f53312c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f53313d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f53314e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f53315f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f53316g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f53317h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f53318i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final BottomSheetBehavior.f f53319j;

    public class a extends BottomSheetBehavior.f {
        a() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
        public void b(@n0 View view, float f10) {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
        public void c(@n0 View view, int i10) {
            BottomSheetDragHandleView.this.n(i10);
        }
    }

    public class b extends androidx.core.view.a {
        b() {
        }

        @Override // androidx.core.view.a
        public void onPopulateAccessibilityEvent(View view, @n0 AccessibilityEvent accessibilityEvent) {
            super.onPopulateAccessibilityEvent(view, accessibilityEvent);
            if (accessibilityEvent.getEventType() == 1) {
                BottomSheetDragHandleView.this.j();
            }
        }
    }

    public BottomSheetDragHandleView(@n0 Context context) {
        this(context, null);
    }

    public BottomSheetDragHandleView(@n0 Context context, @p0 AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.bottomSheetDragHandleStyle);
    }

    public BottomSheetDragHandleView(@n0 Context context, @p0 AttributeSet attributeSet, int i10) {
        super(j9.a.c(context, attributeSet, i10, f53310k), attributeSet, i10);
        this.f53316g = getResources().getString(R.string.bottomsheet_action_expand);
        this.f53317h = getResources().getString(R.string.bottomsheet_action_collapse);
        this.f53318i = getResources().getString(R.string.bottomsheet_drag_handle_clicked);
        this.f53319j = new a();
        this.f53311b = (AccessibilityManager) getContext().getSystemService("accessibility");
        o();
        j1.B1(this, new b());
    }

    private void i(String str) {
        if (this.f53311b == null) {
            return;
        }
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(16384);
        accessibilityEventObtain.getText().add(str);
        this.f53311b.sendAccessibilityEvent(accessibilityEventObtain);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean j() {
        boolean z10 = false;
        if (!this.f53314e) {
            return false;
        }
        i(this.f53318i);
        if (!this.f53312c.J0() && !this.f53312c.r1()) {
            z10 = true;
        }
        int state = this.f53312c.getState();
        int i10 = 6;
        int i11 = 3;
        if (state == 4) {
            if (!z10) {
                i10 = i11;
            }
        } else if (state != 3) {
            if (!this.f53315f) {
                i11 = 4;
            }
            i10 = i11;
        } else if (!z10) {
            i10 = 4;
        }
        this.f53312c.c(i10);
        return true;
    }

    @p0
    private BottomSheetBehavior<?> k() {
        View viewL = this;
        while (true) {
            viewL = l(viewL);
            if (viewL == null) {
                return null;
            }
            ViewGroup.LayoutParams layoutParams = viewL.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.f) {
                CoordinatorLayout.Behavior behaviorF = ((CoordinatorLayout.f) layoutParams).f();
                if (behaviorF instanceof BottomSheetBehavior) {
                    return (BottomSheetBehavior) behaviorF;
                }
            }
        }
    }

    @p0
    private static View l(View view) {
        Object parent = view.getParent();
        if (parent instanceof View) {
            return (View) parent;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean m(View view, e0.a aVar) {
        return j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n(int i10) {
        if (i10 == 4) {
            this.f53315f = true;
        } else if (i10 == 3) {
            this.f53315f = false;
        }
        j1.u1(this, a0.a.f21380j, this.f53315f ? this.f53316g : this.f53317h, new e0() { // from class: com.google.android.material.bottomsheet.c
            @Override // androidx.core.view.accessibility.e0
            public final boolean perform(View view, e0.a aVar) {
                return this.f53344a.m(view, aVar);
            }
        });
    }

    private void o() {
        this.f53314e = this.f53313d && this.f53312c != null;
        j1.R1(this, this.f53312c == null ? 2 : 1);
        setClickable(this.f53314e);
    }

    private void setBottomSheetBehavior(@p0 BottomSheetBehavior<?> bottomSheetBehavior) {
        BottomSheetBehavior<?> bottomSheetBehavior2 = this.f53312c;
        if (bottomSheetBehavior2 != null) {
            bottomSheetBehavior2.P0(this.f53319j);
            this.f53312c.U0(null);
        }
        this.f53312c = bottomSheetBehavior;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.U0(this);
            n(this.f53312c.getState());
            this.f53312c.d0(this.f53319j);
        }
        o();
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public void onAccessibilityStateChanged(boolean z10) {
        this.f53313d = z10;
        o();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        setBottomSheetBehavior(k());
        AccessibilityManager accessibilityManager = this.f53311b;
        if (accessibilityManager != null) {
            accessibilityManager.addAccessibilityStateChangeListener(this);
            onAccessibilityStateChanged(this.f53311b.isEnabled());
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        AccessibilityManager accessibilityManager = this.f53311b;
        if (accessibilityManager != null) {
            accessibilityManager.removeAccessibilityStateChangeListener(this);
        }
        setBottomSheetBehavior(null);
        super.onDetachedFromWindow();
    }
}
