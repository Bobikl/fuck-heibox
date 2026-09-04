package androidx.core.view;

import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* JADX INFO: compiled from: ViewGroup.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ViewGroupKt {

    /* JADX INFO: compiled from: ViewGroup.kt */
    public static final class a implements kotlin.sequences.m<View> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f21303a;

        a(ViewGroup viewGroup) {
            this.f21303a = viewGroup;
        }

        @Override // kotlin.sequences.m
        @dl.d
        public Iterator<View> iterator() {
            return ViewGroupKt.k(this.f21303a);
        }
    }

    /* JADX INFO: compiled from: ViewGroup.kt */
    public static final class b implements Iterator<View>, zh.d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f21304b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ViewGroup f21305c;

        b(ViewGroup viewGroup) {
            this.f21305c = viewGroup;
        }

        @Override // java.util.Iterator
        @dl.d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public View next() {
            ViewGroup viewGroup = this.f21305c;
            int i10 = this.f21304b;
            this.f21304b = i10 + 1;
            View childAt = viewGroup.getChildAt(i10);
            if (childAt != null) {
                return childAt;
            }
            throw new IndexOutOfBoundsException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f21304b < this.f21305c.getChildCount();
        }

        @Override // java.util.Iterator
        public void remove() {
            ViewGroup viewGroup = this.f21305c;
            int i10 = this.f21304b - 1;
            this.f21304b = i10;
            viewGroup.removeViewAt(i10);
        }
    }

    public static final boolean a(@dl.d ViewGroup viewGroup, @dl.d View view) {
        kotlin.jvm.internal.f0.p(viewGroup, "<this>");
        kotlin.jvm.internal.f0.p(view, "view");
        return viewGroup.indexOfChild(view) != -1;
    }

    public static final void b(@dl.d ViewGroup viewGroup, @dl.d yh.l<? super View, kotlin.b2> action) {
        kotlin.jvm.internal.f0.p(viewGroup, "<this>");
        kotlin.jvm.internal.f0.p(action, "action");
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            kotlin.jvm.internal.f0.o(childAt, "getChildAt(index)");
            action.invoke(childAt);
        }
    }

    public static final void c(@dl.d ViewGroup viewGroup, @dl.d yh.p<? super Integer, ? super View, kotlin.b2> action) {
        kotlin.jvm.internal.f0.p(viewGroup, "<this>");
        kotlin.jvm.internal.f0.p(action, "action");
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            Integer numValueOf = Integer.valueOf(i10);
            View childAt = viewGroup.getChildAt(i10);
            kotlin.jvm.internal.f0.o(childAt, "getChildAt(index)");
            action.invoke(numValueOf, childAt);
        }
    }

    @dl.d
    public static final View d(@dl.d ViewGroup viewGroup, int i10) {
        kotlin.jvm.internal.f0.p(viewGroup, "<this>");
        View childAt = viewGroup.getChildAt(i10);
        if (childAt != null) {
            return childAt;
        }
        throw new IndexOutOfBoundsException("Index: " + i10 + ", Size: " + viewGroup.getChildCount());
    }

    @dl.d
    public static final kotlin.sequences.m<View> e(@dl.d ViewGroup viewGroup) {
        kotlin.jvm.internal.f0.p(viewGroup, "<this>");
        return new a(viewGroup);
    }

    @dl.d
    public static final kotlin.sequences.m<View> f(@dl.d ViewGroup viewGroup) {
        kotlin.jvm.internal.f0.p(viewGroup, "<this>");
        return kotlin.sequences.q.b(new ViewGroupKt$descendants$1(viewGroup, null));
    }

    @dl.d
    public static final fi.l g(@dl.d ViewGroup viewGroup) {
        kotlin.jvm.internal.f0.p(viewGroup, "<this>");
        return fi.u.W1(0, viewGroup.getChildCount());
    }

    public static final int h(@dl.d ViewGroup viewGroup) {
        kotlin.jvm.internal.f0.p(viewGroup, "<this>");
        return viewGroup.getChildCount();
    }

    public static final boolean i(@dl.d ViewGroup viewGroup) {
        kotlin.jvm.internal.f0.p(viewGroup, "<this>");
        return viewGroup.getChildCount() == 0;
    }

    public static final boolean j(@dl.d ViewGroup viewGroup) {
        kotlin.jvm.internal.f0.p(viewGroup, "<this>");
        return viewGroup.getChildCount() != 0;
    }

    @dl.d
    public static final Iterator<View> k(@dl.d ViewGroup viewGroup) {
        kotlin.jvm.internal.f0.p(viewGroup, "<this>");
        return new b(viewGroup);
    }

    public static final void l(@dl.d ViewGroup viewGroup, @dl.d View view) {
        kotlin.jvm.internal.f0.p(viewGroup, "<this>");
        kotlin.jvm.internal.f0.p(view, "view");
        viewGroup.removeView(view);
    }

    public static final void m(@dl.d ViewGroup viewGroup, @dl.d View view) {
        kotlin.jvm.internal.f0.p(viewGroup, "<this>");
        kotlin.jvm.internal.f0.p(view, "view");
        viewGroup.addView(view);
    }

    public static final void n(@dl.d ViewGroup.MarginLayoutParams marginLayoutParams, @androidx.annotation.t0 int i10) {
        kotlin.jvm.internal.f0.p(marginLayoutParams, "<this>");
        marginLayoutParams.setMargins(i10, i10, i10, i10);
    }

    public static final void o(@dl.d ViewGroup.MarginLayoutParams marginLayoutParams, @androidx.annotation.t0 int i10, @androidx.annotation.t0 int i11, @androidx.annotation.t0 int i12, @androidx.annotation.t0 int i13) {
        kotlin.jvm.internal.f0.p(marginLayoutParams, "<this>");
        marginLayoutParams.setMargins(i10, i11, i12, i13);
    }

    public static /* synthetic */ void p(ViewGroup.MarginLayoutParams marginLayoutParams, int i10, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = marginLayoutParams.leftMargin;
        }
        if ((i14 & 2) != 0) {
            i11 = marginLayoutParams.topMargin;
        }
        if ((i14 & 4) != 0) {
            i12 = marginLayoutParams.rightMargin;
        }
        if ((i14 & 8) != 0) {
            i13 = marginLayoutParams.bottomMargin;
        }
        kotlin.jvm.internal.f0.p(marginLayoutParams, "<this>");
        marginLayoutParams.setMargins(i10, i11, i12, i13);
    }

    @androidx.annotation.w0(17)
    @SuppressLint({"ClassVerificationFailure"})
    public static final void q(@dl.d ViewGroup.MarginLayoutParams marginLayoutParams, @androidx.annotation.t0 int i10, @androidx.annotation.t0 int i11, @androidx.annotation.t0 int i12, @androidx.annotation.t0 int i13) {
        kotlin.jvm.internal.f0.p(marginLayoutParams, "<this>");
        marginLayoutParams.setMarginStart(i10);
        marginLayoutParams.topMargin = i11;
        marginLayoutParams.setMarginEnd(i12);
        marginLayoutParams.bottomMargin = i13;
    }

    public static /* synthetic */ void r(ViewGroup.MarginLayoutParams marginLayoutParams, int i10, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = marginLayoutParams.getMarginStart();
        }
        if ((i14 & 2) != 0) {
            i11 = marginLayoutParams.topMargin;
        }
        if ((i14 & 4) != 0) {
            i12 = marginLayoutParams.getMarginEnd();
        }
        if ((i14 & 8) != 0) {
            i13 = marginLayoutParams.bottomMargin;
        }
        kotlin.jvm.internal.f0.p(marginLayoutParams, "<this>");
        marginLayoutParams.setMarginStart(i10);
        marginLayoutParams.topMargin = i11;
        marginLayoutParams.setMarginEnd(i12);
        marginLayoutParams.bottomMargin = i13;
    }
}
