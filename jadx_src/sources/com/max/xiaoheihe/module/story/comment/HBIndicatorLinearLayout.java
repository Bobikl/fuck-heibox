package com.max.xiaoheihe.module.story.comment;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.o;
import com.max.accelworld.c;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.accelworld.l;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import dl.d;
import dl.e;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlin.jvm.internal.u;
import xh.i;

/* JADX INFO: compiled from: HBIndicatorLinearLayout.kt */
/* JADX INFO: loaded from: classes12.dex */
@t0({"SMAP\nHBIndicatorLinearLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HBIndicatorLinearLayout.kt\ncom/max/xiaoheihe/module/story/comment/HBIndicatorLinearLayout\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,106:1\n1864#2,3:107\n*S KotlinDebug\n*F\n+ 1 HBIndicatorLinearLayout.kt\ncom/max/xiaoheihe/module/story/comment/HBIndicatorLinearLayout\n*L\n31#1:107,3\n*E\n"})
@o(parameters = 0)
public class HBIndicatorLinearLayout extends LinearLayout {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f91955g = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f91956b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f91957c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f91958d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @e
    private Drawable f91959e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @e
    private Drawable f91960f;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @i
    public HBIndicatorLinearLayout(@d Context context) {
        this(context, null, 0, 6, null);
        f0.p(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @i
    public HBIndicatorLinearLayout(@d Context context, @e AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        f0.p(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @i
    public HBIndicatorLinearLayout(@d Context context, @e AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        f0.p(context, "context");
        this.f91956b = -1;
        this.f91957c = androidx.core.content.d.f(context, R.color.white_alpha80_day);
        this.f91958d = androidx.core.content.d.f(context, R.color.white_alpha20_day);
    }

    public /* synthetic */ HBIndicatorLinearLayout(Context context, AttributeSet attributeSet, int i10, int i11, u uVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    private final void a(LinearLayout.LayoutParams layoutParams, int i10, int i11) {
        int iA;
        Object[] objArr = {layoutParams, new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 43534, new Class[]{LinearLayout.LayoutParams.class, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        View view = new View(getContext());
        if (i10 == 0) {
            iA = 0;
        } else {
            Context context = view.getContext();
            f0.o(context, "context");
            iA = (int) c.a(2.0f, context);
        }
        layoutParams.setMargins(iA, 0, 0, 0);
        view.setLayoutParams(layoutParams);
        d(view, i10 == i11);
        addView(view);
    }

    private final void d(View view, boolean z10) {
        if (PatchProxy.proxy(new Object[]{view, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 43541, new Class[]{View.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (z10) {
            Drawable drawable = this.f91959e;
            if (drawable != null) {
                view.setBackground(drawable);
                return;
            } else {
                l.s(view, this.f91957c, 1.0f);
                return;
            }
        }
        Drawable drawable2 = this.f91960f;
        if (drawable2 != null) {
            view.setBackground(drawable2);
        } else {
            l.s(view, this.f91958d, 1.0f);
        }
    }

    private final void g() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43540, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        int childCount = getChildCount();
        int i10 = 0;
        while (i10 < childCount) {
            View childAt = getChildAt(i10);
            f0.o(childAt, "getChildAt(i)");
            d(childAt, i10 == this.f91956b);
            i10++;
        }
    }

    public final void b(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 43535, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f91956b = i10;
        g();
    }

    public final <T> void setItems(@d List<? extends T> items, int i10) {
        int i11 = 0;
        if (PatchProxy.proxy(new Object[]{items, new Integer(i10)}, this, changeQuickRedirect, false, 43533, new Class[]{List.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(items, "items");
        this.f91956b = i10;
        removeAllViews();
        LinearLayout.LayoutParams layoutParams = getOrientation() == 0 ? new LinearLayout.LayoutParams(0, -1, 1.0f) : new LinearLayout.LayoutParams(-1, 0, 1.0f);
        Iterator<T> it = items.iterator();
        while (it.hasNext()) {
            it.next();
            int i12 = i11 + 1;
            if (i11 < 0) {
                CollectionsKt__CollectionsKt.W();
            }
            a(layoutParams, i11, i10);
            i11 = i12;
        }
    }

    public final void setSelectedColor(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 43536, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f91957c = i10;
        g();
    }

    public final void setSelectedDrawable(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 43538, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f91959e = androidx.core.content.d.i(getContext(), i10);
        g();
    }

    public final void setUnselectedColor(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 43537, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f91958d = i10;
        g();
    }

    public final void setUnselectedDrawable(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 43539, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f91960f = androidx.core.content.d.i(getContext(), i10);
        g();
    }
}
