package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class FitWindowsLinearLayout extends LinearLayout implements e0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private e0.a f2497b;

    public FitWindowsLinearLayout(@androidx.annotation.n0 Context context) {
        super(context);
    }

    public FitWindowsLinearLayout(@androidx.annotation.n0 Context context, @androidx.annotation.p0 AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    protected boolean fitSystemWindows(Rect rect) {
        e0.a aVar = this.f2497b;
        if (aVar != null) {
            aVar.a(rect);
        }
        return super.fitSystemWindows(rect);
    }

    @Override // androidx.appcompat.widget.e0
    public void setOnFitSystemWindowsListener(e0.a aVar) {
        this.f2497b = aVar;
    }
}
