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

/* JADX INFO: compiled from: ItemSteamGameShotFolderBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class yy implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f118090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f118091b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f118092c;

    private yy(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 TextView textView) {
        this.f118090a = linearLayout;
        this.f118091b = imageView;
        this.f118092c = textView;
    }

    @androidx.annotation.n0
    public static yy a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 19964, new Class[]{View.class}, yy.class);
        if (patchProxyResultProxy.isSupported) {
            return (yy) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_folder_icon;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_folder_icon);
        if (imageView != null) {
            i10 = R.id.tv_folder_name;
            TextView textView = (TextView) l3.d.a(view, R.id.tv_folder_name);
            if (textView != null) {
                return new yy((LinearLayout) view, imageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static yy c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 19962, new Class[]{LayoutInflater.class}, yy.class);
        return patchProxyResultProxy.isSupported ? (yy) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static yy d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 19963, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, yy.class);
        if (patchProxyResultProxy.isSupported) {
            return (yy) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_steam_game_shot_folder, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f118090a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 19965, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
