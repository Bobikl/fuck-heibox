package androidx.appcompat.widget;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R;

/* JADX INFO: compiled from: TooltipPopup.java */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class f1 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f2803h = "TooltipPopup";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f2804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final View f2805b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final TextView f2806c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final WindowManager.LayoutParams f2807d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Rect f2808e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int[] f2809f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int[] f2810g;

    f1(@androidx.annotation.n0 Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f2807d = layoutParams;
        this.f2808e = new Rect();
        this.f2809f = new int[2];
        this.f2810g = new int[2];
        this.f2804a = context;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.abc_tooltip, (ViewGroup) null);
        this.f2805b = viewInflate;
        this.f2806c = (TextView) viewInflate.findViewById(R.id.message);
        layoutParams.setTitle(getClass().getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = R.style.Animation_AppCompat_Tooltip;
        layoutParams.flags = 24;
    }

    private void a(View view, int i10, int i11, boolean z10, WindowManager.LayoutParams layoutParams) {
        int height;
        int i12;
        layoutParams.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = this.f2804a.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_threshold);
        if (view.getWidth() < dimensionPixelOffset) {
            i10 = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = this.f2804a.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_extra_offset);
            height = i11 + dimensionPixelOffset2;
            i12 = i11 - dimensionPixelOffset2;
        } else {
            height = view.getHeight();
            i12 = 0;
        }
        layoutParams.gravity = 49;
        int dimensionPixelOffset3 = this.f2804a.getResources().getDimensionPixelOffset(z10 ? R.dimen.tooltip_y_offset_touch : R.dimen.tooltip_y_offset_non_touch);
        View viewB = b(view);
        if (viewB == null) {
            Log.e(f2803h, "Cannot find app view");
            return;
        }
        viewB.getWindowVisibleDisplayFrame(this.f2808e);
        Rect rect = this.f2808e;
        if (rect.left < 0 && rect.top < 0) {
            Resources resources = this.f2804a.getResources();
            int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
            int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            this.f2808e.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
        }
        viewB.getLocationOnScreen(this.f2810g);
        view.getLocationOnScreen(this.f2809f);
        int[] iArr = this.f2809f;
        int i13 = iArr[0];
        int[] iArr2 = this.f2810g;
        int i14 = i13 - iArr2[0];
        iArr[0] = i14;
        iArr[1] = iArr[1] - iArr2[1];
        layoutParams.x = (i14 + i10) - (viewB.getWidth() / 2);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f2805b.measure(iMakeMeasureSpec, iMakeMeasureSpec);
        int measuredHeight = this.f2805b.getMeasuredHeight();
        int i15 = this.f2809f[1];
        int i16 = ((i12 + i15) - dimensionPixelOffset3) - measuredHeight;
        int i17 = i15 + height + dimensionPixelOffset3;
        if (z10) {
            if (i16 >= 0) {
                layoutParams.y = i16;
                return;
            } else {
                layoutParams.y = i17;
                return;
            }
        }
        if (measuredHeight + i17 <= this.f2808e.height()) {
            layoutParams.y = i17;
        } else {
            layoutParams.y = i16;
        }
    }

    private static View b(View view) {
        View rootView = view.getRootView();
        ViewGroup.LayoutParams layoutParams = rootView.getLayoutParams();
        if ((layoutParams instanceof WindowManager.LayoutParams) && ((WindowManager.LayoutParams) layoutParams).type == 2) {
            return rootView;
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return ((Activity) context).getWindow().getDecorView();
            }
        }
        return rootView;
    }

    void c() {
        if (d()) {
            ((WindowManager) this.f2804a.getSystemService("window")).removeView(this.f2805b);
        }
    }

    boolean d() {
        return this.f2805b.getParent() != null;
    }

    void e(View view, int i10, int i11, boolean z10, CharSequence charSequence) {
        if (d()) {
            c();
        }
        this.f2806c.setText(charSequence);
        a(view, i10, i11, z10, this.f2807d);
        ((WindowManager) this.f2804a.getSystemService("window")).addView(this.f2805b, this.f2807d);
    }
}
