package androidx.core.view;

import android.view.View;

/* JADX INFO: compiled from: NestedScrollingParent.java */
/* JADX INFO: loaded from: classes.dex */
public interface x0 {
    int getNestedScrollAxes();

    boolean onNestedFling(@androidx.annotation.n0 View view, float f10, float f11, boolean z10);

    boolean onNestedPreFling(@androidx.annotation.n0 View view, float f10, float f11);

    void onNestedPreScroll(@androidx.annotation.n0 View view, int i10, int i11, @androidx.annotation.n0 int[] iArr);

    void onNestedScroll(@androidx.annotation.n0 View view, int i10, int i11, int i12, int i13);

    void onNestedScrollAccepted(@androidx.annotation.n0 View view, @androidx.annotation.n0 View view2, int i10);

    boolean onStartNestedScroll(@androidx.annotation.n0 View view, @androidx.annotation.n0 View view2, int i10);

    void onStopNestedScroll(@androidx.annotation.n0 View view);
}
