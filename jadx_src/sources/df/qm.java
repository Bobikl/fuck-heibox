package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemGamePreviewBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class qm implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f114928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final CardView f114929b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f114930c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f114931d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final ProgressBar f114932e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114933f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114934g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114935h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114936i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f114937j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f114938k;

    private qm(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 CardView cardView, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 ProgressBar progressBar, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 LinearLayout linearLayout3) {
        this.f114928a = relativeLayout;
        this.f114929b = cardView;
        this.f114930c = imageView;
        this.f114931d = linearLayout;
        this.f114932e = progressBar;
        this.f114933f = textView;
        this.f114934g = textView2;
        this.f114935h = textView3;
        this.f114936i = textView4;
        this.f114937j = linearLayout2;
        this.f114938k = linearLayout3;
    }

    @androidx.annotation.n0
    public static qm a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 18692, new Class[]{View.class}, qm.class);
        if (patchProxyResultProxy.isSupported) {
            return (qm) patchProxyResultProxy.result;
        }
        int i10 = R.id.cv_img;
        CardView cardView = (CardView) l3.d.a(view, R.id.cv_img);
        if (cardView != null) {
            i10 = R.id.iv_img;
            ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_img);
            if (imageView != null) {
                i10 = R.id.ll_platform_icon;
                LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.ll_platform_icon);
                if (linearLayout != null) {
                    i10 = R.id.pb_number;
                    ProgressBar progressBar = (ProgressBar) l3.d.a(view, R.id.pb_number);
                    if (progressBar != null) {
                        i10 = R.id.tv_count;
                        TextView textView = (TextView) l3.d.a(view, R.id.tv_count);
                        if (textView != null) {
                            i10 = R.id.tv_deadline_date;
                            TextView textView2 = (TextView) l3.d.a(view, R.id.tv_deadline_date);
                            if (textView2 != null) {
                                i10 = R.id.tv_name;
                                TextView textView3 = (TextView) l3.d.a(view, R.id.tv_name);
                                if (textView3 != null) {
                                    i10 = R.id.tv_state;
                                    TextView textView4 = (TextView) l3.d.a(view, R.id.tv_state);
                                    if (textView4 != null) {
                                        i10 = R.id.vg_name;
                                        LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.vg_name);
                                        if (linearLayout2 != null) {
                                            i10 = R.id.vg_preview_info;
                                            LinearLayout linearLayout3 = (LinearLayout) l3.d.a(view, R.id.vg_preview_info);
                                            if (linearLayout3 != null) {
                                                return new qm((RelativeLayout) view, cardView, imageView, linearLayout, progressBar, textView, textView2, textView3, textView4, linearLayout2, linearLayout3);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static qm c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 18690, new Class[]{LayoutInflater.class}, qm.class);
        return patchProxyResultProxy.isSupported ? (qm) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static qm d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 18691, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, qm.class);
        if (patchProxyResultProxy.isSupported) {
            return (qm) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_game_preview, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f114928a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 18693, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
