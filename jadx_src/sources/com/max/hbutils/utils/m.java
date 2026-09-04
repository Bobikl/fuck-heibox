package com.max.hbutils.utils;

import android.R;
import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: KeyBoardManager.kt */
/* JADX INFO: loaded from: classes13.dex */
public final class m {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f73552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private View f73553b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private FrameLayout.LayoutParams f73554c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f73555d;

    public m(@dl.d final Activity activity, boolean z10) {
        f0.p(activity, "activity");
        this.f73552a = z10;
        View viewFindViewById = activity.findViewById(R.id.content);
        f0.o(viewFindViewById, "findViewById(...)");
        View childAt = ((FrameLayout) viewFindViewById).getChildAt(0);
        f0.o(childAt, "getChildAt(...)");
        this.f73553b = childAt;
        childAt.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.max.hbutils.utils.l
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                m.b(this.f73550b, activity);
            }
        });
        ViewGroup.LayoutParams layoutParams = this.f73553b.getLayoutParams();
        f0.n(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        this.f73554c = (FrameLayout.LayoutParams) layoutParams;
    }

    public /* synthetic */ m(Activity activity, boolean z10, int i10, kotlin.jvm.internal.u uVar) {
        this(activity, (i10 & 2) != 0 ? true : z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(m this$0, Activity activity) {
        if (PatchProxy.proxy(new Object[]{this$0, activity}, null, changeQuickRedirect, true, bb.c.k.wp, new Class[]{m.class, Activity.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(this$0, "this$0");
        f0.p(activity, "$activity");
        this$0.d(activity);
    }

    private final int c() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.vp, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        Rect rect = new Rect();
        this.f73553b.getWindowVisibleDisplayFrame(rect);
        return this.f73552a ? rect.bottom : rect.bottom - rect.top;
    }

    private final void d(Activity activity) {
        int iC;
        if (PatchProxy.proxy(new Object[]{activity}, this, changeQuickRedirect, false, bb.c.k.up, new Class[]{Activity.class}, Void.TYPE).isSupported || (iC = c()) == this.f73555d) {
            return;
        }
        int height = this.f73553b.getRootView().getHeight();
        int i10 = height - iC;
        if (i10 < 0) {
            height = this.f73553b.getRootView().getWidth();
            i10 = height - iC;
        }
        if (i10 > height / 4) {
            this.f73554c.height = height - i10;
        } else if (i10 >= t.o(activity)) {
            this.f73554c.height = height - t.o(activity);
        } else {
            this.f73554c.height = iC;
        }
        this.f73553b.requestLayout();
        this.f73555d = iC;
    }
}
