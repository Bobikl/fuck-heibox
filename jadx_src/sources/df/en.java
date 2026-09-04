package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemGameShotFolderBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class en implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f110240a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f110241b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f110242c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110243d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110244e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f110245f;

    private en(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 View view) {
        this.f110240a = relativeLayout;
        this.f110241b = imageView;
        this.f110242c = imageView2;
        this.f110243d = textView;
        this.f110244e = textView2;
        this.f110245f = view;
    }

    @androidx.annotation.n0
    public static en a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 18748, new Class[]{View.class}, en.class);
        if (patchProxyResultProxy.isSupported) {
            return (en) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_folder_icon;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_folder_icon);
        if (imageView != null) {
            i10 = R.id.iv_folder_img;
            ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_folder_img);
            if (imageView2 != null) {
                i10 = R.id.tv_folder_name;
                TextView textView = (TextView) l3.d.a(view, R.id.tv_folder_name);
                if (textView != null) {
                    i10 = R.id.tv_pic_num;
                    TextView textView2 = (TextView) l3.d.a(view, R.id.tv_pic_num);
                    if (textView2 != null) {
                        i10 = R.id.v_div;
                        View viewA = l3.d.a(view, R.id.v_div);
                        if (viewA != null) {
                            return new en((RelativeLayout) view, imageView, imageView2, textView, textView2, viewA);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static en c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 18746, new Class[]{LayoutInflater.class}, en.class);
        return patchProxyResultProxy.isSupported ? (en) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static en d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 18747, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, en.class);
        if (patchProxyResultProxy.isSupported) {
            return (en) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_game_shot_folder, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f110240a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 18749, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
