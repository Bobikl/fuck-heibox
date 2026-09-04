package je;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: AlphaInAnimationAdapter.java */
/* JADX INFO: loaded from: classes2.dex */
public class a extends c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final float f124324h = 0.0f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final float f124325g;

    public a(RecyclerView.Adapter adapter) {
        this(adapter, 0.0f);
    }

    public a(RecyclerView.Adapter adapter, float f10) {
        super(adapter);
        this.f124325g = f10;
    }

    @Override // je.c
    public Animator[] m(View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.l.Ih, new Class[]{View.class}, Animator[].class);
        return patchProxyResultProxy.isSupported ? (Animator[]) patchProxyResultProxy.result : new Animator[]{ObjectAnimator.ofFloat(view, "alpha", this.f124325g, 1.0f)};
    }
}
