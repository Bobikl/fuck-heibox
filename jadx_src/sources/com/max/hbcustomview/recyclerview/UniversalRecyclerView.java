package com.max.hbcustomview.recyclerview;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.max.hbcustomview.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import dl.e;
import kotlin.b2;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: UniversalRecyclerView.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class UniversalRecyclerView extends RecyclerView implements ec.a {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f69215b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f69216c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f69217d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private yh.a<b2> f69218e;

    /* JADX INFO: compiled from: UniversalRecyclerView.kt */
    public static final class a extends RecyclerView.OnScrollListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(@dl.d RecyclerView recyclerView, int i10, int i11) {
            Object[] objArr = {recyclerView, new Integer(i10), new Integer(i11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.Yl, new Class[]{RecyclerView.class, cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(recyclerView, "recyclerView");
            super.onScrolled(recyclerView, i10, i11);
            if (UniversalRecyclerView.this.getPreloadEnable()) {
                RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                int itemCount = layoutManager != null ? layoutManager.getItemCount() : 0;
                if (layoutManager instanceof LinearLayoutManager) {
                    if (itemCount - ((LinearLayoutManager) layoutManager).findLastVisibleItemPosition() > UniversalRecyclerView.this.getPreLoadGap() || i11 <= 0 || UniversalRecyclerView.this.c()) {
                        return;
                    }
                    UniversalRecyclerView.this.d();
                    return;
                }
                if (layoutManager instanceof StaggeredGridLayoutManager) {
                    StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
                    int[] iArrFindLastVisibleItemPositions = staggeredGridLayoutManager.findLastVisibleItemPositions(new int[staggeredGridLayoutManager.getSpanCount()]);
                    f0.m(iArrFindLastVisibleItemPositions);
                    Integer numPl = ArraysKt___ArraysKt.pl(iArrFindLastVisibleItemPositions);
                    if (staggeredGridLayoutManager.getItemCount() - (numPl != null ? numPl.intValue() : 0) > UniversalRecyclerView.this.getPreLoadGap() || i11 <= 0 || UniversalRecyclerView.this.c()) {
                        return;
                    }
                    UniversalRecyclerView.this.d();
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UniversalRecyclerView(@dl.d Context context) {
        super(context);
        f0.p(context, "context");
        this.f69218e = UniversalRecyclerView$preLoadAction$1.f69220b;
        e(null, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UniversalRecyclerView(@dl.d Context context, @e AttributeSet attributeSet) {
        super(context, attributeSet);
        f0.p(context, "context");
        this.f69218e = UniversalRecyclerView$preLoadAction$1.f69220b;
        e(attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UniversalRecyclerView(@dl.d Context context, @e AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        f0.p(context, "context");
        this.f69218e = UniversalRecyclerView$preLoadAction$1.f69220b;
        e(attributeSet, i10);
    }

    private final void e(AttributeSet attributeSet, int i10) {
        if (PatchProxy.proxy(new Object[]{attributeSet, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.Ul, new Class[]{AttributeSet.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.A3, i10, 0);
            f0.o(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
            setPreloadEnable(typedArrayObtainStyledAttributes.getBoolean(R.styleable.UniversalRecyclerView_preLoaded, false));
            typedArrayObtainStyledAttributes.recycle();
        }
        addOnScrollListener(new a());
    }

    @Override // ec.a
    public void b() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.Xl, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setPreLoading(false);
    }

    @Override // ec.a
    public boolean c() {
        return this.f69216c;
    }

    @Override // ec.a
    public void d() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.Wl, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setPreLoading(true);
        this.f69218e.invoke();
    }

    @dl.d
    public final yh.a<b2> getPreLoadAction() {
        return this.f69218e;
    }

    @Override // ec.a
    public int getPreLoadGap() {
        return this.f69217d;
    }

    @Override // ec.a
    public boolean getPreloadEnable() {
        return this.f69215b;
    }

    public final void setPreLoadAction(@dl.d yh.a<b2> aVar) {
        if (PatchProxy.proxy(new Object[]{aVar}, this, changeQuickRedirect, false, bb.c.f.Vl, new Class[]{yh.a.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(aVar, "<set-?>");
        this.f69218e = aVar;
    }

    @Override // ec.a
    public void setPreLoadGap(int i10) {
        this.f69217d = i10;
    }

    @Override // ec.a
    public void setPreLoading(boolean z10) {
        this.f69216c = z10;
    }

    @Override // ec.a
    public void setPreloadEnable(boolean z10) {
        this.f69215b = z10;
    }
}
