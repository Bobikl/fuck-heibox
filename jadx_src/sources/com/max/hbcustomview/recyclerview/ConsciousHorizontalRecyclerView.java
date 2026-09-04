package com.max.hbcustomview.recyclerview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbcustomview.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.e;
import kotlin.b0;
import kotlin.jvm.internal.f0;
import kotlin.z;

/* JADX INFO: compiled from: ConsciousHorizontalRecyclerView.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class ConsciousHorizontalRecyclerView extends RecyclerView {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final z f69203b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final z f69204c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f69205d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f69206e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f69207f;

    /* JADX INFO: compiled from: ConsciousHorizontalRecyclerView.kt */
    public static final class a extends RecyclerView.ItemDecoration {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(@dl.d Rect outRect, @dl.d View view, @dl.d RecyclerView parent, @dl.d RecyclerView.State state) {
            if (PatchProxy.proxy(new Object[]{outRect, view, parent, state}, this, changeQuickRedirect, false, bb.c.f.Fl, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(outRect, "outRect");
            f0.p(view, "view");
            f0.p(parent, "parent");
            f0.p(state, "state");
            super.getItemOffsets(outRect, view, parent, state);
            int childAdapterPosition = parent.getChildAdapterPosition(view);
            outRect.left = childAdapterPosition != 0 ? ConsciousHorizontalRecyclerView.this.getCalculatedItemSpace() : ConsciousHorizontalRecyclerView.this.getHorizontalSpace();
            if (ConsciousHorizontalRecyclerView.this.getNeedRightSpace()) {
                RecyclerView.Adapter adapter = ConsciousHorizontalRecyclerView.this.getAdapter();
                if (childAdapterPosition == (adapter != null ? adapter.getItemCount() : 0) - 1) {
                    outRect.right = ConsciousHorizontalRecyclerView.this.getHorizontalSpace();
                }
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ConsciousHorizontalRecyclerView(@dl.d Context context) {
        this(context, null);
        f0.p(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ConsciousHorizontalRecyclerView(@dl.d Context context, @e AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        f0.p(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConsciousHorizontalRecyclerView(@dl.d Context context, @e AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        f0.p(context, "context");
        this.f69203b = b0.c(new yh.a<Integer>() { // from class: com.max.hbcustomview.recyclerview.ConsciousHorizontalRecyclerView$minItemSpace$2
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(0);
            }

            @dl.d
            public final Integer a() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.Gl, new Class[0], Integer.class);
                if (patchProxyResultProxy.isSupported) {
                    return (Integer) patchProxyResultProxy.result;
                }
                ic.a aVar = ic.a.f119343a;
                Context context2 = this.f69211b.getContext();
                f0.o(context2, "getContext(...)");
                return Integer.valueOf(aVar.a(context2, 8.0f));
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Integer, java.lang.Object] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ Integer invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.Hl, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a();
            }
        });
        this.f69204c = b0.c(new yh.a<Integer>() { // from class: com.max.hbcustomview.recyclerview.ConsciousHorizontalRecyclerView$horizontalSpace$2
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(0);
            }

            @dl.d
            public final Integer a() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.Al, new Class[0], Integer.class);
                if (patchProxyResultProxy.isSupported) {
                    return (Integer) patchProxyResultProxy.result;
                }
                ic.a aVar = ic.a.f119343a;
                Context context2 = this.f69209b.getContext();
                f0.o(context2, "getContext(...)");
                return Integer.valueOf(aVar.a(context2, 9.0f));
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Integer, java.lang.Object] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ Integer invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.Bl, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a();
            }
        });
        this.f69205d = getMinItemSpace();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.f68640e0);
            f0.o(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
            try {
                setExceptedItemWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.ConsciousHorizontalRecyclerView_excepted_item_width, ic.a.f119343a.a(context, 60.0f)));
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th2) {
                typedArrayObtainStyledAttributes.recycle();
                throw th2;
            }
        }
        f();
    }

    public final int e(int i10, int i11) {
        int i12;
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.zl, new Class[]{cls, cls}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        int horizontalSpace = (i10 - (getHorizontalSpace() * 2)) - i11;
        int minItemSpace = (horizontalSpace / (getMinItemSpace() + i11)) + 1;
        if (horizontalSpace % (getMinItemSpace() + i11) == 0) {
            RecyclerView.Adapter adapter = getAdapter();
            if (minItemSpace == (adapter != null ? adapter.getItemCount() : 0)) {
                return getMinItemSpace();
            }
        }
        int horizontalSpace2 = (i10 - getHorizontalSpace()) - i11;
        int minItemSpace2 = (horizontalSpace2 / (getMinItemSpace() + i11)) + 1;
        int minItemSpace3 = horizontalSpace2 % (getMinItemSpace() + i11);
        int minItemSpace4 = (getMinItemSpace() + i11) - minItemSpace3;
        if (minItemSpace3 != 0) {
            minItemSpace2++;
        }
        if (minItemSpace2 <= 2) {
            return getMinItemSpace();
        }
        RecyclerView.Adapter adapter2 = getAdapter();
        this.f69206e = (adapter2 != null ? adapter2.getItemCount() : 0) >= minItemSpace2;
        int minItemSpace5 = getMinItemSpace();
        int i13 = i11 / 2;
        if (minItemSpace4 == i13) {
            return minItemSpace5;
        }
        if (minItemSpace4 < i13) {
            i12 = (i13 - minItemSpace4) / (minItemSpace2 - 1);
        } else {
            if (minItemSpace4 <= i13) {
                return minItemSpace5;
            }
            i12 = (i13 + minItemSpace3) / (minItemSpace2 - 2);
        }
        return minItemSpace5 + i12;
    }

    public final void f() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.yl, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        final Context context = getContext();
        setLayoutManager(new LinearLayoutManager(context) { // from class: com.max.hbcustomview.recyclerview.ConsciousHorizontalRecyclerView$initSetting$1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
            public boolean checkLayoutParams(@e RecyclerView.LayoutParams layoutParams) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutParams}, this, changeQuickRedirect, false, bb.c.f.Dl, new Class[]{RecyclerView.LayoutParams.class}, Boolean.TYPE);
                if (patchProxyResultProxy.isSupported) {
                    return ((Boolean) patchProxyResultProxy.result).booleanValue();
                }
                if (this.f69210b.getExceptedItemWidth() <= 0) {
                    return super.checkLayoutParams(layoutParams);
                }
                if (super.checkLayoutParams(layoutParams)) {
                    if (layoutParams != null && ((ViewGroup.MarginLayoutParams) layoutParams).width == this.f69210b.getExceptedItemWidth()) {
                        return true;
                    }
                }
                return false;
            }

            @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
            @dl.d
            public RecyclerView.LayoutParams generateLayoutParams(@e ViewGroup.LayoutParams layoutParams) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutParams}, this, changeQuickRedirect, false, bb.c.f.El, new Class[]{ViewGroup.LayoutParams.class}, RecyclerView.LayoutParams.class);
                if (patchProxyResultProxy.isSupported) {
                    return (RecyclerView.LayoutParams) patchProxyResultProxy.result;
                }
                if (this.f69210b.getExceptedItemWidth() > 0 && layoutParams != null) {
                    layoutParams.width = this.f69210b.getExceptedItemWidth();
                }
                RecyclerView.LayoutParams layoutParamsGenerateLayoutParams = super.generateLayoutParams(layoutParams);
                f0.o(layoutParamsGenerateLayoutParams, "generateLayoutParams(...)");
                return layoutParamsGenerateLayoutParams;
            }

            @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
            public void onMeasure(@dl.d RecyclerView.Recycler recycler, @dl.d RecyclerView.State state, int i10, int i11) {
                Object[] objArr = {recycler, state, new Integer(i10), new Integer(i11)};
                ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                Class cls = Integer.TYPE;
                if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.Cl, new Class[]{RecyclerView.Recycler.class, RecyclerView.State.class, cls, cls}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(recycler, "recycler");
                f0.p(state, "state");
                super.onMeasure(recycler, state, i10, i11);
                ConsciousHorizontalRecyclerView consciousHorizontalRecyclerView = this.f69210b;
                consciousHorizontalRecyclerView.setCalculatedItemSpace(consciousHorizontalRecyclerView.e(consciousHorizontalRecyclerView.getMeasuredWidth(), this.f69210b.getExceptedItemWidth()));
            }
        });
        addItemDecoration(new a());
    }

    public final int getCalculatedItemSpace() {
        return this.f69205d;
    }

    public final int getExceptedItemWidth() {
        return this.f69207f;
    }

    public final int getHorizontalSpace() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.vl, new Class[0], Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : ((Number) this.f69204c.getValue()).intValue();
    }

    public final int getMinItemSpace() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.ul, new Class[0], Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : ((Number) this.f69203b.getValue()).intValue();
    }

    public final boolean getNeedRightSpace() {
        return this.f69206e;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        Object[] objArr = {new Byte(z10 ? (byte) 1 : (byte) 0), new Integer(i10), new Integer(i11), new Integer(i12), new Integer(i13)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.xl, new Class[]{Boolean.TYPE, cls, cls, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        super.onLayout(z10, i10, i11, i12, i13);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public void onMeasure(int i10, int i11) {
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.wl, new Class[]{cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        super.onMeasure(i10, i11);
    }

    public final void setCalculatedItemSpace(int i10) {
        this.f69205d = i10;
    }

    public final void setExceptedItemWidth(int i10) {
        this.f69207f = i10;
    }

    public final void setNeedRightSpace(boolean z10) {
        this.f69206e = z10;
    }
}
