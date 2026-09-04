package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: LayoutPlayerLeaderboardsHeaderDestiny2Binding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class v80 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f116712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f116713b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116714c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116715d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116716e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116717f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f116718g;

    private v80(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 LinearLayout linearLayout2) {
        this.f116712a = linearLayout;
        this.f116713b = imageView;
        this.f116714c = textView;
        this.f116715d = textView2;
        this.f116716e = textView3;
        this.f116717f = textView4;
        this.f116718g = linearLayout2;
    }

    @androidx.annotation.n0
    public static v80 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 20986, new Class[]{View.class}, v80.class);
        if (patchProxyResultProxy.isSupported) {
            return (v80) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_more;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_more);
        if (imageView != null) {
            i10 = R.id.tv_board_value_desc;
            TextView textView = (TextView) l3.d.a(view, R.id.tv_board_value_desc);
            if (textView != null) {
                i10 = R.id.tv_board_value_desc0;
                TextView textView2 = (TextView) l3.d.a(view, R.id.tv_board_value_desc0);
                if (textView2 != null) {
                    i10 = R.id.tv_nickname;
                    TextView textView3 = (TextView) l3.d.a(view, R.id.tv_nickname);
                    if (textView3 != null) {
                        i10 = R.id.tv_rank;
                        TextView textView4 = (TextView) l3.d.a(view, R.id.tv_rank);
                        if (textView4 != null) {
                            LinearLayout linearLayout = (LinearLayout) view;
                            return new v80(linearLayout, imageView, textView, textView2, textView3, textView4, linearLayout);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static v80 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 20984, new Class[]{LayoutInflater.class}, v80.class);
        return patchProxyResultProxy.isSupported ? (v80) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static v80 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 20985, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, v80.class);
        if (patchProxyResultProxy.isSupported) {
            return (v80) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_player_leaderboards_header_destiny2, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f116712a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 20987, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
