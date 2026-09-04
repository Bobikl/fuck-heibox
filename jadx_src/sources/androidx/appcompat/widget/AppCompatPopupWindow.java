package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;
import androidx.appcompat.R;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatPopupWindow extends PopupWindow {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final boolean f2422b = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f2423a;

    public AppCompatPopupWindow(@androidx.annotation.n0 Context context, @androidx.annotation.p0 AttributeSet attributeSet, @androidx.annotation.f int i10) {
        super(context, attributeSet, i10);
        a(context, attributeSet, i10, 0);
    }

    public AppCompatPopupWindow(@androidx.annotation.n0 Context context, @androidx.annotation.p0 AttributeSet attributeSet, @androidx.annotation.f int i10, @androidx.annotation.e1 int i11) {
        super(context, attributeSet, i10, i11);
        a(context, attributeSet, i10, i11);
    }

    private void a(Context context, AttributeSet attributeSet, int i10, int i11) {
        x0 x0VarG = x0.G(context, attributeSet, R.styleable.f1591x, i10, i11);
        int i12 = R.styleable.PopupWindow_overlapAnchor;
        if (x0VarG.C(i12)) {
            b(x0VarG.a(i12, false));
        }
        setBackgroundDrawable(x0VarG.h(R.styleable.PopupWindow_android_popupBackground));
        x0VarG.I();
    }

    private void b(boolean z10) {
        if (f2422b) {
            this.f2423a = z10;
        } else {
            androidx.core.widget.o.c(this, z10);
        }
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i10, int i11) {
        if (f2422b && this.f2423a) {
            i11 -= view.getHeight();
        }
        super.showAsDropDown(view, i10, i11);
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i10, int i11, int i12) {
        if (f2422b && this.f2423a) {
            i11 -= view.getHeight();
        }
        super.showAsDropDown(view, i10, i11, i12);
    }

    @Override // android.widget.PopupWindow
    public void update(View view, int i10, int i11, int i12, int i13) {
        if (f2422b && this.f2423a) {
            i11 -= view.getHeight();
        }
        super.update(view, i10, i11, i12, i13);
    }
}
