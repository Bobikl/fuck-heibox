package fb;

import android.app.Dialog;
import android.content.Context;
import android.util.SparseArray;
import android.view.MotionEvent;
import androidx.annotation.n0;
import bb.c;
import com.max.hbcommon.component.curtain.f;
import com.max.hbcommon.utils.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: NoInterceptViewAlertDialog.java */
/* JADX INFO: loaded from: classes9.dex */
public class b extends Dialog {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f118822c = "NoInterceptViewAlertDialog";
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SparseArray<f> f118823b;

    public b(@n0 Context context, int i10, SparseArray<f> sparseArray) {
        super(context, i10);
        this.f118823b = sparseArray;
    }

    private boolean a(MotionEvent motionEvent, f fVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{motionEvent, fVar}, this, changeQuickRedirect, false, c.d.Dp, new Class[]{MotionEvent.class, f.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        int[] iArr = new int[2];
        fVar.f67559c.getLocationOnScreen(iArr);
        int width = iArr[0] + fVar.f67559c.getWidth();
        int height = iArr[1] + fVar.f67559c.getHeight();
        boolean z10 = motionEvent.getRawX() > ((float) iArr[0]) && motionEvent.getRawX() < ((float) width);
        boolean z11 = motionEvent.getRawY() > ((float) iArr[1]) && motionEvent.getRawY() < ((float) height);
        d.b(f118822c, " eventRawX " + motionEvent.getRawX() + " eventRawY " + motionEvent.getRawY());
        d.b(f118822c, " inX " + z10 + " inY " + z11);
        return z10 && z11;
    }

    private boolean b(MotionEvent motionEvent) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{motionEvent}, this, changeQuickRedirect, false, c.d.Cp, new Class[]{MotionEvent.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        int size = this.f118823b.size();
        for (int i10 = 0; i10 < size; i10++) {
            f fVarValueAt = this.f118823b.valueAt(i10);
            if (a(motionEvent, fVarValueAt)) {
                return fVarValueAt.f67559c.dispatchTouchEvent(motionEvent);
            }
        }
        return false;
    }

    @Override // android.app.Dialog
    public boolean onTouchEvent(@n0 MotionEvent motionEvent) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{motionEvent}, this, changeQuickRedirect, false, c.d.Bp, new Class[]{MotionEvent.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return super.onTouchEvent(motionEvent) || b(motionEvent);
    }
}
