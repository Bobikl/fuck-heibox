package db;

import android.view.View;
import bb.c;
import com.billy.android.swipe.consumer.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: compiled from: SlideDrawerConsumer.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class a extends f {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.billy.android.swipe.consumer.f, com.billy.android.swipe.f
    public void h1(int i10, int i11, int i12, int i13) {
        Object[] objArr = {new Integer(i10), new Integer(i11), new Integer(i12), new Integer(i13)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, c.d.X2, new Class[]{cls, cls, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        super.h1(i10, i11, i12, i13);
        View contentView = this.f40407b.getContentView();
        if (contentView != null) {
            contentView.scrollTo(-((int) (i10 * 0.5f)), 0);
        }
    }
}
