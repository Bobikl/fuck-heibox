package com.max.xiaoheihe.module.bbs.post.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: RecordLastDownEventLayout.kt */
/* JADX INFO: loaded from: classes10.dex */
@o(parameters = 0)
public final class RecordLastDownEventLayout extends LinearLayout {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f81570c = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @e
    private MotionEvent f81571b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecordLastDownEventLayout(@d Context context) {
        super(context);
        f0.p(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecordLastDownEventLayout(@d Context context, @e AttributeSet attributeSet) {
        super(context, attributeSet);
        f0.p(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecordLastDownEventLayout(@d Context context, @e AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        f0.p(context, "context");
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(@e MotionEvent motionEvent) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{motionEvent}, this, changeQuickRedirect, false, 28549, new Class[]{MotionEvent.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (motionEvent != null) {
            MotionEvent motionEvent2 = (motionEvent.getAction() & 255) == 0 ? motionEvent : null;
            if (motionEvent2 != null) {
                MotionEvent motionEvent3 = this.f81571b;
                if (motionEvent3 != null) {
                    motionEvent3.recycle();
                }
                this.f81571b = MotionEvent.obtain(motionEvent2);
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @e
    public final MotionEvent getLastDownEvent() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28550, new Class[0], MotionEvent.class);
        if (patchProxyResultProxy.isSupported) {
            return (MotionEvent) patchProxyResultProxy.result;
        }
        MotionEvent motionEvent = this.f81571b;
        if (motionEvent != null) {
            return MotionEvent.obtain(motionEvent);
        }
        return null;
    }
}
