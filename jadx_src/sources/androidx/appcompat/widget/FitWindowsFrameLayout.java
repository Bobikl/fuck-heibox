package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class FitWindowsFrameLayout extends FrameLayout implements e0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private e0.a f2496b;

    public FitWindowsFrameLayout(@androidx.annotation.n0 Context context) {
        super(context);
    }

    public FitWindowsFrameLayout(@androidx.annotation.n0 Context context, @androidx.annotation.p0 AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    protected boolean fitSystemWindows(Rect rect) {
        e0.a aVar = this.f2496b;
        if (aVar != null) {
            aVar.a(rect);
        }
        return super.fitSystemWindows(rect);
    }

    @Override // androidx.appcompat.widget.e0
    public void setOnFitSystemWindowsListener(e0.a aVar) {
        this.f2496b = aVar;
    }
}
