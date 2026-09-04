package androidx.browser.browseractions;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.RestrictTo;
import androidx.annotation.n0;
import androidx.browser.R;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
@Deprecated
public class BrowserActionsFallbackMenuView extends LinearLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f3045b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f3046c;

    public BrowserActionsFallbackMenuView(@n0 Context context, @n0 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3045b = getResources().getDimensionPixelOffset(R.dimen.browser_actions_context_menu_min_padding);
        this.f3046c = getResources().getDimensionPixelOffset(R.dimen.browser_actions_context_menu_max_width);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(getResources().getDisplayMetrics().widthPixels - (this.f3045b * 2), this.f3046c), 1073741824), i11);
    }
}
