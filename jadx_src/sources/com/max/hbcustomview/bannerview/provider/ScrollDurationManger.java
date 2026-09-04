package com.max.hbcustomview.bannerview.provider;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.core.view.accessibility.a0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes10.dex */
public class ScrollDurationManger extends LinearLayoutManager {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final LinearLayoutManager f69031b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f69032c;

    public class a extends LinearSmoothScroller {
        public static ChangeQuickRedirect changeQuickRedirect;

        a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.LinearSmoothScroller
        public int calculateTimeForDeceleration(int i10) {
            Object[] objArr = {new Integer(i10)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.f32652wh, new Class[]{cls}, cls);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : ScrollDurationManger.this.f69032c;
        }
    }

    public ScrollDurationManger(ViewPager2 viewPager2, int i10, LinearLayoutManager linearLayoutManager) {
        super(viewPager2.getContext(), linearLayoutManager.getOrientation(), false);
        this.f69032c = i10;
        this.f69031b = linearLayoutManager;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void calculateExtraLayoutSpace(@n0 RecyclerView.State state, @n0 int[] iArr) {
        if (PatchProxy.proxy(new Object[]{state, iArr}, this, changeQuickRedirect, false, bb.c.f.f32630vh, new Class[]{RecyclerView.State.class, int[].class}, Void.TYPE).isSupported) {
            return;
        }
        try {
            Method declaredMethod = this.f69031b.getClass().getDeclaredMethod("calculateExtraLayoutSpace", state.getClass(), iArr.getClass());
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(this.f69031b, state, iArr);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e10) {
            e10.printStackTrace();
            xb.a.e(e10.getMessage());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onInitializeAccessibilityNodeInfo(@n0 RecyclerView.Recycler recycler, @n0 RecyclerView.State state, @n0 a0 a0Var) {
        if (PatchProxy.proxy(new Object[]{recycler, state, a0Var}, this, changeQuickRedirect, false, bb.c.f.f32608uh, new Class[]{RecyclerView.Recycler.class, RecyclerView.State.class, a0.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f69031b.onInitializeAccessibilityNodeInfo(recycler, state, a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean performAccessibilityAction(@n0 RecyclerView.Recycler recycler, @n0 RecyclerView.State state, int i10, @p0 Bundle bundle) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{recycler, state, new Integer(i10), bundle}, this, changeQuickRedirect, false, bb.c.f.f32586th, new Class[]{RecyclerView.Recycler.class, RecyclerView.State.class, Integer.TYPE, Bundle.class}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : this.f69031b.performAccessibilityAction(recycler, state, i10, bundle);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean requestChildRectangleOnScreen(@n0 RecyclerView recyclerView, @n0 View view, @n0 Rect rect, boolean z10, boolean z11) {
        return false;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i10) {
        if (PatchProxy.proxy(new Object[]{recyclerView, state, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.f32564sh, new Class[]{RecyclerView.class, RecyclerView.State.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        a aVar = new a(recyclerView.getContext());
        aVar.setTargetPosition(i10);
        startSmoothScroll(aVar);
    }
}
