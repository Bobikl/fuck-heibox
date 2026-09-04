package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.annotation.i;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.j1;
import g9.b;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
@Deprecated
public abstract class ExpandableBehavior extends CoordinatorLayout.Behavior<View> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f55846g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f55847h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f55848i = 2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f55849f;

    public class a implements ViewTreeObserver.OnPreDrawListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f55850b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f55851c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ b f55852d;

        a(View view, int i10, b bVar) {
            this.f55850b = view;
            this.f55851c = i10;
            this.f55852d = bVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            this.f55850b.getViewTreeObserver().removeOnPreDrawListener(this);
            if (ExpandableBehavior.this.f55849f == this.f55851c) {
                ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
                b bVar = this.f55852d;
                expandableBehavior.N((View) bVar, this.f55850b, bVar.b(), false);
            }
            return false;
        }
    }

    public ExpandableBehavior() {
        this.f55849f = 0;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f55849f = 0;
    }

    private boolean K(boolean z10) {
        if (!z10) {
            return this.f55849f == 1;
        }
        int i10 = this.f55849f;
        return i10 == 0 || i10 == 2;
    }

    @p0
    public static <T extends ExpandableBehavior> T M(@n0 View view, @n0 Class<T> cls) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof CoordinatorLayout.f)) {
            throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
        }
        CoordinatorLayout.Behavior behaviorF = ((CoordinatorLayout.f) layoutParams).f();
        if (behaviorF instanceof ExpandableBehavior) {
            return cls.cast(behaviorF);
        }
        throw new IllegalArgumentException("The view is not associated with ExpandableBehavior");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @p0
    protected b L(@n0 CoordinatorLayout coordinatorLayout, @n0 View view) {
        List<View> listS = coordinatorLayout.s(view);
        int size = listS.size();
        for (int i10 = 0; i10 < size; i10++) {
            View view2 = listS.get(i10);
            if (i(coordinatorLayout, view, view2)) {
                return (b) view2;
            }
        }
        return null;
    }

    protected abstract boolean N(View view, View view2, boolean z10, boolean z11);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public abstract boolean i(CoordinatorLayout coordinatorLayout, View view, View view2);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    @i
    public boolean l(CoordinatorLayout coordinatorLayout, View view, View view2) {
        b bVar = (b) view2;
        if (!K(bVar.b())) {
            return false;
        }
        this.f55849f = bVar.b() ? 1 : 2;
        return N((View) bVar, view, bVar.b(), true);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    @i
    public boolean p(@n0 CoordinatorLayout coordinatorLayout, @n0 View view, int i10) {
        b bVarL;
        if (j1.U0(view) || (bVarL = L(coordinatorLayout, view)) == null || !K(bVarL.b())) {
            return false;
        }
        int i11 = bVarL.b() ? 1 : 2;
        this.f55849f = i11;
        view.getViewTreeObserver().addOnPreDrawListener(new a(view, i11, bVarL));
        return false;
    }
}
