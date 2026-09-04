package com.max.xiaoheihe.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: loaded from: classes13.dex */
public class UpdatePointViewGroup extends RelativeLayout {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a f95908b;

    public interface a {
        void a(MotionEvent motionEvent);
    }

    public UpdatePointViewGroup(Context context) {
        super(context);
    }

    public UpdatePointViewGroup(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public UpdatePointViewGroup(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }

    public UpdatePointViewGroup(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{motionEvent}, this, changeQuickRedirect, false, 49556, new Class[]{MotionEvent.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        a aVar = this.f95908b;
        if (aVar != null) {
            aVar.a(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public a getListener() {
        return this.f95908b;
    }

    public void setListener(a aVar) {
        this.f95908b = aVar;
    }
}
