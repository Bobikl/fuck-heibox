package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.max.hbcustomview.video.VideoViewX;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ActivityTxVideoTestBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class x2 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final ConstraintLayout f117348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117349b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117350c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f117351d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final VideoViewX f117352e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final VideoViewX f117353f;

    private x2(@androidx.annotation.n0 ConstraintLayout constraintLayout, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 VideoViewX videoViewX, @androidx.annotation.n0 VideoViewX videoViewX2) {
        this.f117348a = constraintLayout;
        this.f117349b = textView;
        this.f117350c = textView2;
        this.f117351d = relativeLayout;
        this.f117352e = videoViewX;
        this.f117353f = videoViewX2;
    }

    @androidx.annotation.n0
    public static x2 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 16644, new Class[]{View.class}, x2.class);
        if (patchProxyResultProxy.isSupported) {
            return (x2) patchProxyResultProxy.result;
        }
        int i10 = R.id.tv_countdown;
        TextView textView = (TextView) l3.d.a(view, R.id.tv_countdown);
        if (textView != null) {
            i10 = R.id.tv_plain;
            TextView textView2 = (TextView) l3.d.a(view, R.id.tv_plain);
            if (textView2 != null) {
                i10 = R.id.vg_video;
                RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.vg_video);
                if (relativeLayout != null) {
                    i10 = R.id.video;
                    VideoViewX videoViewX = (VideoViewX) l3.d.a(view, R.id.video);
                    if (videoViewX != null) {
                        i10 = R.id.video_countdown;
                        VideoViewX videoViewX2 = (VideoViewX) l3.d.a(view, R.id.video_countdown);
                        if (videoViewX2 != null) {
                            return new x2((ConstraintLayout) view, textView, textView2, relativeLayout, videoViewX, videoViewX2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static x2 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 16642, new Class[]{LayoutInflater.class}, x2.class);
        return patchProxyResultProxy.isSupported ? (x2) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static x2 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 16643, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, x2.class);
        if (patchProxyResultProxy.isSupported) {
            return (x2) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.activity_tx_video_test, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public ConstraintLayout b() {
        return this.f117348a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16645, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
