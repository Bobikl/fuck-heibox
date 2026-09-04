package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemUserNotifyListBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class z00 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f118125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final CardView f118126b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f118127c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f118128d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f118129e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f118130f;

    private z00(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 CardView cardView, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3) {
        this.f118125a = linearLayout;
        this.f118126b = cardView;
        this.f118127c = imageView;
        this.f118128d = textView;
        this.f118129e = textView2;
        this.f118130f = textView3;
    }

    @androidx.annotation.n0
    public static z00 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 20176, new Class[]{View.class}, z00.class);
        if (patchProxyResultProxy.isSupported) {
            return (z00) patchProxyResultProxy.result;
        }
        int i10 = R.id.cv_games;
        CardView cardView = (CardView) l3.d.a(view, R.id.cv_games);
        if (cardView != null) {
            i10 = R.id.iv_img;
            ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_img);
            if (imageView != null) {
                i10 = R.id.tv_create_at;
                TextView textView = (TextView) l3.d.a(view, R.id.tv_create_at);
                if (textView != null) {
                    i10 = R.id.tv_text;
                    TextView textView2 = (TextView) l3.d.a(view, R.id.tv_text);
                    if (textView2 != null) {
                        i10 = R.id.tv_title;
                        TextView textView3 = (TextView) l3.d.a(view, R.id.tv_title);
                        if (textView3 != null) {
                            return new z00((LinearLayout) view, cardView, imageView, textView, textView2, textView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static z00 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 20174, new Class[]{LayoutInflater.class}, z00.class);
        return patchProxyResultProxy.isSupported ? (z00) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static z00 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 20175, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, z00.class);
        if (patchProxyResultProxy.isSupported) {
            return (z00) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_user_notify_list, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f118125a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 20177, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
