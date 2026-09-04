package com.max.hbcustomview.viewpager2.widget;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.n0;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: compiled from: HBAnimateLayoutChangeDetector.java */
/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ViewGroup.MarginLayoutParams f69772b;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private LinearLayoutManager f69773a;

    /* JADX INFO: renamed from: com.max.hbcustomview.viewpager2.widget.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: HBAnimateLayoutChangeDetector.java */
    public class C0566a implements Comparator<int[]> {
        public static ChangeQuickRedirect changeQuickRedirect;

        C0566a() {
        }

        public int a(int[] iArr, int[] iArr2) {
            return iArr[0] - iArr2[0];
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(int[] iArr, int[] iArr2) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{iArr, iArr2}, this, changeQuickRedirect, false, bb.c.f.ax, new Class[]{Object.class, Object.class}, Integer.TYPE);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : a(iArr, iArr2);
        }
    }

    static {
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -1);
        f69772b = marginLayoutParams;
        marginLayoutParams.setMargins(0, 0, 0, 0);
    }

    a(@n0 LinearLayoutManager linearLayoutManager) {
        this.f69773a = linearLayoutManager;
    }

    private boolean a() {
        int top;
        int i10;
        int bottom;
        int i11;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.Xw, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        int childCount = this.f69773a.getChildCount();
        if (childCount == 0) {
            return true;
        }
        boolean z10 = this.f69773a.getOrientation() == 0;
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, childCount, 2);
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = this.f69773a.getChildAt(i12);
            if (childAt == null) {
                throw new IllegalStateException("null view contained in the view hierarchy");
            }
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : f69772b;
            int[] iArr2 = iArr[i12];
            if (z10) {
                top = childAt.getLeft();
                i10 = marginLayoutParams.leftMargin;
            } else {
                top = childAt.getTop();
                i10 = marginLayoutParams.topMargin;
            }
            iArr2[0] = top - i10;
            int[] iArr3 = iArr[i12];
            if (z10) {
                bottom = childAt.getRight();
                i11 = marginLayoutParams.rightMargin;
            } else {
                bottom = childAt.getBottom();
                i11 = marginLayoutParams.bottomMargin;
            }
            iArr3[1] = bottom + i11;
        }
        Arrays.sort(iArr, new C0566a());
        for (int i13 = 1; i13 < childCount; i13++) {
            if (iArr[i13 - 1][1] != iArr[i13][0]) {
                return false;
            }
        }
        int[] iArr4 = iArr[0];
        int i14 = iArr4[1];
        int i15 = iArr4[0];
        return i15 <= 0 && iArr[childCount - 1][1] >= i14 - i15;
    }

    private boolean b() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.Yw, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        int childCount = this.f69773a.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            if (c(this.f69773a.getChildAt(i10))) {
                return true;
            }
        }
        return false;
    }

    private static boolean c(View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, bb.c.f.Zw, new Class[]{View.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            LayoutTransition layoutTransition = viewGroup.getLayoutTransition();
            if (layoutTransition != null && layoutTransition.isChangingLayout()) {
                return true;
            }
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                if (c(viewGroup.getChildAt(i10))) {
                    return true;
                }
            }
        }
        return false;
    }

    boolean d() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.Ww, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return (!a() || this.f69773a.getChildCount() <= 1) && b();
    }
}
