package je;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: SlideInBottomAnimationAdapter.java */
/* JADX INFO: loaded from: classes2.dex */
public class d extends c {
    public static ChangeQuickRedirect changeQuickRedirect;

    public d(RecyclerView.Adapter adapter) {
        super(adapter);
    }

    @Override // je.c
    public Animator[] m(View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.l.Vh, new Class[]{View.class}, Animator[].class);
        return patchProxyResultProxy.isSupported ? (Animator[]) patchProxyResultProxy.result : new Animator[]{ObjectAnimator.ofFloat(view, "translationY", view.getMeasuredHeight(), 0.0f)};
    }
}
