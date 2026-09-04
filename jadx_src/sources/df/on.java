package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemGameWithTimeBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class on implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f114281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f114282b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ProgressBar f114283c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114284d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114285e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114286f;

    private on(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ProgressBar progressBar, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3) {
        this.f114281a = linearLayout;
        this.f114282b = imageView;
        this.f114283c = progressBar;
        this.f114284d = textView;
        this.f114285e = textView2;
        this.f114286f = textView3;
    }

    @androidx.annotation.n0
    public static on a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 18788, new Class[]{View.class}, on.class);
        if (patchProxyResultProxy.isSupported) {
            return (on) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_item_game_with_time;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_item_game_with_time);
        if (imageView != null) {
            i10 = R.id.pb_item_game_with_time;
            ProgressBar progressBar = (ProgressBar) l3.d.a(view, R.id.pb_item_game_with_time);
            if (progressBar != null) {
                i10 = R.id.tv_item_game_with_time_name;
                TextView textView = (TextView) l3.d.a(view, R.id.tv_item_game_with_time_name);
                if (textView != null) {
                    i10 = R.id.tv_item_game_with_total_time;
                    TextView textView2 = (TextView) l3.d.a(view, R.id.tv_item_game_with_total_time);
                    if (textView2 != null) {
                        i10 = R.id.tv_item_game_with_two_weeks;
                        TextView textView3 = (TextView) l3.d.a(view, R.id.tv_item_game_with_two_weeks);
                        if (textView3 != null) {
                            return new on((LinearLayout) view, imageView, progressBar, textView, textView2, textView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static on c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 18786, new Class[]{LayoutInflater.class}, on.class);
        return patchProxyResultProxy.isSupported ? (on) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static on d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 18787, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, on.class);
        if (patchProxyResultProxy.isSupported) {
            return (on) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_game_with_time, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f114281a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 18789, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
