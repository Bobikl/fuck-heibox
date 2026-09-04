package com.max.xiaoheihe.module.bbs.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import xh.i;
import yh.a;

/* JADX INFO: compiled from: OverlayTouchDownDetectView.kt */
/* JADX INFO: loaded from: classes10.dex */
@o(parameters = 0)
public final class OverlayTouchDownDetectView extends View {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f83503c = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @e
    private a<b2> f83504b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @i
    public OverlayTouchDownDetectView(@d Context context) {
        this(context, null, 0, 6, null);
        f0.p(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @i
    public OverlayTouchDownDetectView(@d Context context, @e AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        f0.p(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @i
    public OverlayTouchDownDetectView(@d Context context, @e AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        f0.p(context, "context");
    }

    public /* synthetic */ OverlayTouchDownDetectView(Context context, AttributeSet attributeSet, int i10, int i11, u uVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(@e MotionEvent motionEvent) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{motionEvent}, this, changeQuickRedirect, false, 31345, new Class[]{MotionEvent.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        a<b2> aVar = this.f83504b;
        if (aVar != null) {
            aVar.invoke();
        }
        return false;
    }

    public final void setOnTouchDownEventDetector(@d a<b2> touchEventDetector) {
        if (PatchProxy.proxy(new Object[]{touchEventDetector}, this, changeQuickRedirect, false, 31344, new Class[]{a.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(touchEventDetector, "touchEventDetector");
        this.f83504b = touchEventDetector;
    }
}
