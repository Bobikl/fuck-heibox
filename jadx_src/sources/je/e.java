package je;

import android.view.View;
import androidx.core.view.j1;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: compiled from: ViewHelper.java */
/* JADX INFO: loaded from: classes2.dex */
public final class e {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static void a(View view) {
        if (PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, bb.c.l.Wh, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        view.setAlpha(1.0f);
        view.setScaleY(1.0f);
        view.setScaleX(1.0f);
        view.setTranslationY(0.0f);
        view.setTranslationX(0.0f);
        view.setRotation(0.0f);
        view.setRotationY(0.0f);
        view.setRotationX(0.0f);
        view.setPivotY(view.getMeasuredHeight() / 2);
        view.setPivotX(view.getMeasuredWidth() / 2);
        j1.g(view).t(null).w(0L);
    }
}
