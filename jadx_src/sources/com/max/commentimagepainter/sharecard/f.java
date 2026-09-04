package com.max.commentimagepainter.sharecard;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SnapHelper;
import com.max.commentimagepainter.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import yh.l;

/* JADX INFO: compiled from: HeightChangingScrollListener.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class f extends RecyclerView.OnScrollListener {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final SnapHelper f65378b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final LinearLayoutManager f65379c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private final l<Integer, b2> f65380d;

    /* JADX WARN: Multi-variable type inference failed */
    public f(@dl.d SnapHelper snapHelper, @dl.d LinearLayoutManager layoutManager, @dl.d l<? super Integer, b2> scrollStateIdLeCallback) {
        f0.p(snapHelper, "snapHelper");
        f0.p(layoutManager, "layoutManager");
        f0.p(scrollStateIdLeCallback, "scrollStateIdLeCallback");
        this.f65378b = snapHelper;
        this.f65379c = layoutManager;
        this.f65380d = scrollStateIdLeCallback;
    }

    @dl.d
    public final LinearLayoutManager c() {
        return this.f65379c;
    }

    @dl.d
    public final l<Integer, b2> e() {
        return this.f65380d;
    }

    @dl.d
    public final SnapHelper f() {
        return this.f65378b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public void onScrollStateChanged(@dl.d RecyclerView recyclerView, int i10) {
        CardImageView cardImageView;
        if (PatchProxy.proxy(new Object[]{recyclerView, new Integer(i10)}, this, changeQuickRedirect, false, 1106, new Class[]{RecyclerView.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(recyclerView, "recyclerView");
        super.onScrollStateChanged(recyclerView, i10);
        if (i10 == 0) {
            View viewFindSnapView = this.f65378b.findSnapView(this.f65379c);
            if (viewFindSnapView == null) {
                return;
            }
            this.f65380d.invoke(Integer.valueOf(this.f65379c.getPosition(viewFindSnapView)));
            CardImageView cardImageView2 = (CardImageView) viewFindSnapView.findViewById(R.id.card_view);
            if (cardImageView2 == null) {
                return;
            }
            cardImageView2.h();
            return;
        }
        if (i10 != 1) {
            return;
        }
        int childCount = this.f65379c.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = this.f65379c.getChildAt(i11);
            if (childAt != null && (cardImageView = (CardImageView) childAt.findViewById(R.id.card_view)) != null) {
                cardImageView.i();
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public void onScrolled(@dl.d RecyclerView recyclerView, int i10, int i11) {
        Object[] objArr = {recyclerView, new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 1105, new Class[]{RecyclerView.class, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(recyclerView, "recyclerView");
        super.onScrolled(recyclerView, i10, i11);
        int width = recyclerView.getWidth();
        int childCount = recyclerView.getChildCount();
        int width2 = recyclerView.getWidth() / 2;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = recyclerView.getChildAt(i12);
            Rect rect = new Rect();
            childAt.getGlobalVisibleRect(rect);
            float fAbs = Math.abs(((rect.left + rect.right) / 2) - width2);
            Resources resources = recyclerView.getResources();
            f0.o(resources, "getResources(...)");
            float fE = (width / 2.0f) - ShareCardDrawUtilsKt.e(38, resources);
            float fMin = Math.min(fAbs, fE);
            Resources resources2 = recyclerView.getResources();
            f0.o(resources2, "getResources(...)");
            float fE2 = ShareCardDrawUtilsKt.e(468, resources2);
            Resources resources3 = recyclerView.getResources();
            f0.o(resources3, "getResources(...)");
            float fE3 = fE2 - (((fE2 - ShareCardDrawUtilsKt.e(424, resources3)) * fMin) / fE);
            childAt.setScaleY(fE3 / fE2);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                marginLayoutParams.topMargin = 0 - ((int) ((fE2 - fE3) / 2.0f));
                childAt.setLayoutParams(marginLayoutParams);
            }
        }
    }
}
