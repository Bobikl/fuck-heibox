package androidx.transition;

import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
@SuppressLint({"ViewConstructor"})
public class GhostViewHolder extends FrameLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    private ViewGroup f27708b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f27709c;

    GhostViewHolder(ViewGroup viewGroup) {
        super(viewGroup.getContext());
        setClipChildren(false);
        this.f27708b = viewGroup;
        viewGroup.setTag(R.id.ghost_view_holder, this);
        h0.b(this.f27708b).c(this);
        this.f27709c = true;
    }

    static GhostViewHolder b(@androidx.annotation.n0 ViewGroup viewGroup) {
        return (GhostViewHolder) viewGroup.getTag(R.id.ghost_view_holder);
    }

    private int c(ArrayList<View> arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int childCount = getChildCount() - 1;
        int i10 = 0;
        while (i10 <= childCount) {
            int i11 = (i10 + childCount) / 2;
            d(((GhostViewPort) getChildAt(i11)).f27712d, arrayList2);
            if (f(arrayList, arrayList2)) {
                i10 = i11 + 1;
            } else {
                childCount = i11 - 1;
            }
            arrayList2.clear();
        }
        return i10;
    }

    private static void d(View view, ArrayList<View> arrayList) {
        Object parent = view.getParent();
        if (parent instanceof ViewGroup) {
            d((View) parent, arrayList);
        }
        arrayList.add(view);
    }

    private static boolean e(View view, View view2) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        int childCount = viewGroup.getChildCount();
        if (view.getZ() != view2.getZ()) {
            return view.getZ() > view2.getZ();
        }
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(h0.a(viewGroup, i10));
            if (childAt == view) {
                return false;
            }
            if (childAt == view2) {
                break;
            }
        }
        return true;
    }

    private static boolean f(ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        if (arrayList.isEmpty() || arrayList2.isEmpty() || arrayList.get(0) != arrayList2.get(0)) {
            return true;
        }
        int iMin = Math.min(arrayList.size(), arrayList2.size());
        for (int i10 = 1; i10 < iMin; i10++) {
            View view = arrayList.get(i10);
            View view2 = arrayList2.get(i10);
            if (view != view2) {
                return e(view, view2);
            }
        }
        return arrayList2.size() == iMin;
    }

    void a(GhostViewPort ghostViewPort) {
        ArrayList<View> arrayList = new ArrayList<>();
        d(ghostViewPort.f27712d, arrayList);
        int iC = c(arrayList);
        if (iC < 0 || iC >= getChildCount()) {
            addView(ghostViewPort);
        } else {
            addView(ghostViewPort, iC);
        }
    }

    void g() {
        if (!this.f27709c) {
            throw new IllegalStateException("This GhostViewHolder is detached!");
        }
        h0.b(this.f27708b).d(this);
        h0.b(this.f27708b).c(this);
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        if (!this.f27709c) {
            throw new IllegalStateException("This GhostViewHolder is detached!");
        }
        super.onViewAdded(view);
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if ((getChildCount() == 1 && getChildAt(0) == view) || getChildCount() == 0) {
            this.f27708b.setTag(R.id.ghost_view_holder, null);
            h0.b(this.f27708b).d(this);
            this.f27709c = false;
        }
    }
}
