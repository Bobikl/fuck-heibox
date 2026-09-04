package androidx.core.view;

/* JADX INFO: compiled from: NestedScrollingChild2.java */
/* JADX INFO: loaded from: classes.dex */
public interface r0 extends t0 {
    boolean dispatchNestedPreScroll(int i10, int i11, @androidx.annotation.p0 int[] iArr, @androidx.annotation.p0 int[] iArr2, int i12);

    boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, @androidx.annotation.p0 int[] iArr, int i14);

    boolean hasNestedScrollingParent(int i10);

    boolean startNestedScroll(int i10, int i11);

    void stopNestedScroll(int i10);
}
