package androidx.core.view;

/* JADX INFO: compiled from: NestedScrollingChild.java */
/* JADX INFO: loaded from: classes.dex */
public interface t0 {
    boolean dispatchNestedFling(float f10, float f11, boolean z10);

    boolean dispatchNestedPreFling(float f10, float f11);

    boolean dispatchNestedPreScroll(int i10, int i11, @androidx.annotation.p0 int[] iArr, @androidx.annotation.p0 int[] iArr2);

    boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, @androidx.annotation.p0 int[] iArr);

    boolean hasNestedScrollingParent();

    boolean isNestedScrollingEnabled();

    void setNestedScrollingEnabled(boolean z10);

    boolean startNestedScroll(int i10);

    void stopNestedScroll();
}
