package com.donkingliang.consecutivescroller;

import android.graphics.Rect;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import androidx.core.view.f1;
import androidx.core.view.j1;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: ScrollUtils.java */
/* JADX INFO: loaded from: classes6.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static Method f42396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static Method f42397b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static Method f42398c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Rect f42399d = new Rect();

    private static void a(List<View> list, View view, int i10, int i11) {
        if (t(view) && w(view, i10, i11)) {
            list.add(view);
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    a(list, viewGroup.getChildAt(i12), i10, i11);
                }
            }
        }
    }

    static boolean b(View view) {
        return t(view) && (view.canScrollHorizontally(1) || view.canScrollHorizontally(-1));
    }

    static boolean c(View view) {
        return t(view) && (d(view, 1) || d(view, -1));
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0069  */
    static boolean d(View view, int i10) {
        int itemCount;
        int i11;
        View viewP = p(view);
        if (viewP.getVisibility() == 8) {
            return false;
        }
        if (viewP instanceof AbsListView) {
            return ((AbsListView) viewP).canScrollList(i10);
        }
        if (!(viewP instanceof RecyclerView)) {
            return viewP.canScrollVertically(i10);
        }
        RecyclerView recyclerView = (RecyclerView) viewP;
        if ((recyclerView.canScrollHorizontally(1) || recyclerView.canScrollHorizontally(-1)) && !recyclerView.canScrollVertically(i10)) {
            return false;
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (layoutManager != null && adapter != null && adapter.getItemCount() > 0) {
            if (layoutManager instanceof LinearLayoutManager ? ((LinearLayoutManager) layoutManager).getReverseLayout() : layoutManager instanceof StaggeredGridLayoutManager ? ((StaggeredGridLayoutManager) layoutManager).getReverseLayout() : false) {
                if (i10 < 0) {
                    itemCount = adapter.getItemCount();
                    i11 = itemCount - 1;
                } else {
                    i11 = 0;
                }
            } else if (i10 > 0) {
                itemCount = adapter.getItemCount();
                i11 = itemCount - 1;
            } else {
                i11 = 0;
            }
            if (layoutManager.findViewByPosition(i11) == null) {
                return true;
            }
            int childCount = recyclerView.getChildCount();
            if (i10 > 0) {
                for (int i12 = childCount - 1; i12 >= 0; i12--) {
                    View childAt = recyclerView.getChildAt(i12);
                    Rect rect = f42399d;
                    recyclerView.getDecoratedBoundsWithMargins(childAt, rect);
                    if (rect.bottom > recyclerView.getHeight() - recyclerView.getPaddingBottom()) {
                        return true;
                    }
                }
                return false;
            }
            for (int i13 = 0; i13 < childCount; i13++) {
                View childAt2 = recyclerView.getChildAt(i13);
                Rect rect2 = f42399d;
                recyclerView.getDecoratedBoundsWithMargins(childAt2, rect2);
                if (rect2.top < recyclerView.getPaddingTop()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static int e(View view) {
        View viewP = p(view);
        if (viewP instanceof f1) {
            return ((f1) viewP).computeVerticalScrollExtent();
        }
        try {
            if (f42398c == null) {
                Method declaredMethod = View.class.getDeclaredMethod("computeVerticalScrollExtent", new Class[0]);
                f42398c = declaredMethod;
                declaredMethod.setAccessible(true);
            }
            Object objInvoke = f42398c.invoke(viewP, new Object[0]);
            if (objInvoke != null) {
                return ((Integer) objInvoke).intValue();
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return viewP.getHeight();
    }

    /* JADX WARN: Multi-variable type inference failed */
    static int f(View view) {
        View viewP = p(view);
        if (viewP instanceof f1) {
            return ((f1) viewP).computeVerticalScrollOffset();
        }
        try {
            if (f42396a == null) {
                Method declaredMethod = View.class.getDeclaredMethod("computeVerticalScrollOffset", new Class[0]);
                f42396a = declaredMethod;
                declaredMethod.setAccessible(true);
            }
            Object objInvoke = f42396a.invoke(viewP, new Object[0]);
            if (objInvoke != null) {
                return ((Integer) objInvoke).intValue();
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return viewP.getScrollY();
    }

    /* JADX WARN: Multi-variable type inference failed */
    static int g(View view) {
        View viewP = p(view);
        if (viewP instanceof f1) {
            return ((f1) viewP).computeVerticalScrollRange();
        }
        try {
            if (f42397b == null) {
                Method declaredMethod = View.class.getDeclaredMethod("computeVerticalScrollRange", new Class[0]);
                f42397b = declaredMethod;
                declaredMethod.setAccessible(true);
            }
            Object objInvoke = f42397b.invoke(viewP, new Object[0]);
            if (objInvoke != null) {
                return ((Integer) objInvoke).intValue();
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return viewP.getHeight();
    }

    static boolean h(List<Integer> list, List<Integer> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!list.get(i10).equals(list2.get(i10))) {
                return false;
            }
        }
        return true;
    }

    static List<ConsecutiveScrollerLayout> i(View view, int i10, int i11) {
        ArrayList arrayList = new ArrayList();
        for (View view2 : r(view, i10, i11)) {
            if (view2 instanceof ConsecutiveScrollerLayout) {
                arrayList.add((ConsecutiveScrollerLayout) view2);
            }
        }
        return arrayList;
    }

    static int j(View view, MotionEvent motionEvent, int i10) {
        float x10;
        if (Build.VERSION.SDK_INT >= 29) {
            x10 = motionEvent.getRawX(i10);
        } else {
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            x10 = iArr[0] + motionEvent.getX(i10);
        }
        return (int) x10;
    }

    static int k(View view, MotionEvent motionEvent, int i10) {
        float y10;
        if (Build.VERSION.SDK_INT >= 29) {
            y10 = motionEvent.getRawY(i10);
        } else {
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            y10 = iArr[1] + motionEvent.getY(i10);
        }
        return (int) y10;
    }

    static int l(View view) {
        if (t(view) && d(view, 1)) {
            return Math.max((g(view) - f(view)) - e(view), 1);
        }
        return 0;
    }

    static View m(View view) {
        int i10;
        View viewFindViewById;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if ((layoutParams instanceof ConsecutiveScrollerLayout.LayoutParams) && (i10 = ((ConsecutiveScrollerLayout.LayoutParams) layoutParams).f42339f) != -1 && (viewFindViewById = view.findViewById(i10)) != null) {
                return viewFindViewById;
            }
        }
        return view;
    }

    static List<Integer> n(List<View> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<View> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(f(it.next())));
        }
        return arrayList;
    }

    static int o(View view) {
        if (t(view) && d(view, -1)) {
            return Math.min(-f(view), -1);
        }
        return 0;
    }

    static View p(View view) {
        View viewM = m(view);
        while (viewM instanceof c) {
            View currentScrollerView = ((c) viewM).getCurrentScrollerView();
            if (viewM == currentScrollerView) {
                return currentScrollerView;
            }
            viewM = currentScrollerView;
        }
        return viewM;
    }

    static View q(ConsecutiveScrollerLayout consecutiveScrollerLayout, int i10, int i11) {
        int childCount = consecutiveScrollerLayout.getChildCount();
        View view = null;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = consecutiveScrollerLayout.getChildAt(i12);
            if (childAt.getVisibility() == 0 && w(childAt, i10, i11) && (view == null || j1.F0(childAt) > j1.F0(view) || (j1.F0(childAt) == j1.F0(view) && consecutiveScrollerLayout.F(childAt) > consecutiveScrollerLayout.F(view)))) {
                view = childAt;
            }
        }
        return view;
    }

    static List<View> r(View view, int i10, int i11) {
        ArrayList arrayList = new ArrayList();
        a(arrayList, view, i10, i11);
        return arrayList;
    }

    static boolean s(View view) {
        while ((view.getParent() instanceof ViewGroup) && !(view.getParent() instanceof ConsecutiveScrollerLayout)) {
            view = (View) view.getParent();
        }
        if (view.getParent() instanceof ConsecutiveScrollerLayout) {
            return t(view);
        }
        return false;
    }

    static boolean t(View view) {
        if (view == null) {
            return false;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ConsecutiveScrollerLayout.LayoutParams) {
            return ((ConsecutiveScrollerLayout.LayoutParams) layoutParams).f42334a;
        }
        return true;
    }

    static boolean u(View view, int i10, int i11) {
        for (View view2 : r(view, i10, i11)) {
            if (view2.canScrollHorizontally(1) || view2.canScrollHorizontally(-1)) {
                return true;
            }
        }
        return false;
    }

    static boolean v(View view, int i10, int i11) {
        List<ConsecutiveScrollerLayout> listI = i(view, i10, i11);
        for (int size = listI.size() - 1; size >= 0; size--) {
            ConsecutiveScrollerLayout consecutiveScrollerLayout = listI.get(size);
            View viewQ = q(consecutiveScrollerLayout, i10, i11);
            if (viewQ != null && consecutiveScrollerLayout.a0(viewQ) && consecutiveScrollerLayout.E0(viewQ) && !((ConsecutiveScrollerLayout.LayoutParams) viewQ.getLayoutParams()).f42337d) {
                return true;
            }
        }
        return false;
    }

    static boolean w(View view, int i10, int i11) {
        if (view == null) {
            return false;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i12 = iArr[0];
        int i13 = iArr[1];
        return i10 >= i12 && i10 <= view.getMeasuredWidth() + i12 && i11 >= i13 && i11 <= view.getMeasuredHeight() + i13;
    }

    static boolean x(RecyclerView recyclerView) {
        if ("InterceptRequestLayout".equals(recyclerView.getTag())) {
            try {
                Method declaredMethod = RecyclerView.class.getDeclaredMethod("startInterceptRequestLayout", new Class[0]);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(recyclerView, new Object[0]);
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    static void y(RecyclerView recyclerView) {
        if ("InterceptRequestLayout".equals(recyclerView.getTag())) {
            try {
                Method declaredMethod = RecyclerView.class.getDeclaredMethod("stopInterceptRequestLayout", Boolean.TYPE);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(recyclerView, Boolean.FALSE);
            } catch (Exception unused) {
            }
        }
    }
}
