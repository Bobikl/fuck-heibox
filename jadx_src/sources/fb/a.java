package fb;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.view.MotionEvent;
import androidx.annotation.n0;
import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: NoInterceptActivityDialog.java */
/* JADX INFO: loaded from: classes9.dex */
public class a extends Dialog {
    public static ChangeQuickRedirect changeQuickRedirect;

    public a(@n0 Context context, int i10) {
        super(context, i10);
    }

    private boolean a(MotionEvent motionEvent) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{motionEvent}, this, changeQuickRedirect, false, c.d.Ap, new Class[]{MotionEvent.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        Activity ownerActivity = getOwnerActivity();
        if (ownerActivity != null) {
            return ownerActivity.dispatchTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // android.app.Dialog
    public boolean onTouchEvent(@n0 MotionEvent motionEvent) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{motionEvent}, this, changeQuickRedirect, false, c.d.zp, new Class[]{MotionEvent.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return super.onTouchEvent(motionEvent) || a(motionEvent);
    }
}
