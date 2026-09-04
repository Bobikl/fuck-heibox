package d9;

import android.R;
import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.annotation.RestrictTo;
import androidx.annotation.n0;

/* JADX INFO: compiled from: InsetDialogOnTouchListener.java */
/* JADX INFO: loaded from: classes7.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class a implements View.OnTouchListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @n0
    private final Dialog f108164b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f108165c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f108166d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f108167e;

    public a(@n0 Dialog dialog, @n0 Rect rect) {
        this.f108164b = dialog;
        this.f108165c = rect.left;
        this.f108166d = rect.top;
        this.f108167e = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(@n0 View view, @n0 MotionEvent motionEvent) {
        View viewFindViewById = view.findViewById(R.id.content);
        int left = this.f108165c + viewFindViewById.getLeft();
        int width = viewFindViewById.getWidth() + left;
        int top = this.f108166d + viewFindViewById.getTop();
        if (new RectF(left, top, width, viewFindViewById.getHeight() + top).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            motionEventObtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            motionEventObtain.setAction(0);
            int i10 = this.f108167e;
            motionEventObtain.setLocation((-i10) - 1, (-i10) - 1);
        }
        view.performClick();
        return this.f108164b.onTouchEvent(motionEventObtain);
    }
}
