package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.RestrictTo;
import androidx.core.view.c1;
import androidx.core.view.j1;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: FragmentTransitionImpl.java */
/* JADX INFO: loaded from: classes6.dex */
@SuppressLint({"UnknownNullness"})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public abstract class t0 {

    /* JADX INFO: compiled from: FragmentTransitionImpl.java */
    public class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f23855b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ArrayList f23856c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ ArrayList f23857d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ ArrayList f23858e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ ArrayList f23859f;

        a(int i10, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
            this.f23855b = i10;
            this.f23856c = arrayList;
            this.f23857d = arrayList2;
            this.f23858e = arrayList3;
            this.f23859f = arrayList4;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (int i10 = 0; i10 < this.f23855b; i10++) {
                j1.t2((View) this.f23856c.get(i10), (String) this.f23857d.get(i10));
                j1.t2((View) this.f23858e.get(i10), (String) this.f23859f.get(i10));
            }
        }
    }

    protected static void d(List<View> list, View view) {
        int size = list.size();
        if (g(list, view, size)) {
            return;
        }
        if (j1.x0(view) != null) {
            list.add(view);
        }
        for (int i10 = size; i10 < list.size(); i10++) {
            View view2 = list.get(i10);
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                int childCount = viewGroup.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = viewGroup.getChildAt(i11);
                    if (!g(list, childAt, size) && j1.x0(childAt) != null) {
                        list.add(childAt);
                    }
                }
            }
        }
    }

    private static boolean g(List<View> list, View view, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (list.get(i11) == view) {
                return true;
            }
        }
        return false;
    }

    protected static boolean i(List list) {
        return list == null || list.isEmpty();
    }

    public abstract void a(@androidx.annotation.n0 Object obj, @androidx.annotation.n0 View view);

    public abstract void b(@androidx.annotation.n0 Object obj, @androidx.annotation.n0 ArrayList<View> arrayList);

    public abstract void c(@androidx.annotation.n0 ViewGroup viewGroup, @androidx.annotation.p0 Object obj);

    public abstract boolean e(@androidx.annotation.n0 Object obj);

    public abstract Object f(@androidx.annotation.p0 Object obj);

    protected void h(View view, Rect rect) {
        if (j1.O0(view)) {
            RectF rectF = new RectF();
            rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
            view.getMatrix().mapRect(rectF);
            rectF.offset(view.getLeft(), view.getTop());
            Object parent = view.getParent();
            while (parent instanceof View) {
                View view2 = (View) parent;
                rectF.offset(-view2.getScrollX(), -view2.getScrollY());
                view2.getMatrix().mapRect(rectF);
                rectF.offset(view2.getLeft(), view2.getTop());
                parent = view2.getParent();
            }
            int[] iArr = new int[2];
            view.getRootView().getLocationOnScreen(iArr);
            rectF.offset(iArr[0], iArr[1]);
            rect.set(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
        }
    }

    public abstract Object j(@androidx.annotation.p0 Object obj, @androidx.annotation.p0 Object obj2, @androidx.annotation.p0 Object obj3);

    public abstract Object k(@androidx.annotation.p0 Object obj, @androidx.annotation.p0 Object obj2, @androidx.annotation.p0 Object obj3);

    ArrayList<String> l(ArrayList<View> arrayList) {
        ArrayList<String> arrayList2 = new ArrayList<>();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            View view = arrayList.get(i10);
            arrayList2.add(j1.x0(view));
            j1.t2(view, null);
        }
        return arrayList2;
    }

    public abstract void m(@androidx.annotation.n0 Object obj, @androidx.annotation.n0 View view);

    public abstract void n(@androidx.annotation.n0 Object obj, @SuppressLint({"UnknownNullness"}) ArrayList<View> arrayList, @SuppressLint({"UnknownNullness"}) ArrayList<View> arrayList2);

    public abstract void o(@androidx.annotation.n0 Object obj, @androidx.annotation.n0 View view, @androidx.annotation.n0 ArrayList<View> arrayList);

    public abstract void p(@androidx.annotation.n0 Object obj, @androidx.annotation.p0 Object obj2, @androidx.annotation.p0 ArrayList<View> arrayList, @androidx.annotation.p0 Object obj3, @androidx.annotation.p0 ArrayList<View> arrayList2, @androidx.annotation.p0 Object obj4, @androidx.annotation.p0 ArrayList<View> arrayList3);

    public abstract void q(@androidx.annotation.n0 Object obj, @androidx.annotation.n0 Rect rect);

    public abstract void r(@androidx.annotation.n0 Object obj, @androidx.annotation.p0 View view);

    public void s(@androidx.annotation.n0 Fragment fragment, @androidx.annotation.n0 Object obj, @androidx.annotation.n0 androidx.core.os.f fVar, @androidx.annotation.n0 Runnable runnable) {
        runnable.run();
    }

    void t(View view, ArrayList<View> arrayList, ArrayList<View> arrayList2, ArrayList<String> arrayList3, Map<String, String> map) {
        int size = arrayList2.size();
        ArrayList arrayList4 = new ArrayList();
        for (int i10 = 0; i10 < size; i10++) {
            View view2 = arrayList.get(i10);
            String strX0 = j1.x0(view2);
            arrayList4.add(strX0);
            if (strX0 != null) {
                j1.t2(view2, null);
                String str = map.get(strX0);
                for (int i11 = 0; i11 < size; i11++) {
                    if (str.equals(arrayList3.get(i11))) {
                        j1.t2(arrayList2.get(i11), strX0);
                        break;
                    }
                }
            }
        }
        c1.a(view, new a(size, arrayList2, arrayList3, arrayList, arrayList4));
    }

    public abstract void u(@androidx.annotation.n0 Object obj, @androidx.annotation.n0 View view, @androidx.annotation.n0 ArrayList<View> arrayList);

    public abstract void v(@androidx.annotation.p0 Object obj, @androidx.annotation.p0 ArrayList<View> arrayList, @androidx.annotation.p0 ArrayList<View> arrayList2);

    public abstract Object w(@androidx.annotation.p0 Object obj);
}
