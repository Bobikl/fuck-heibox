package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: LayoutPubgWeaponProficiencyBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class s90 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f115514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f115515b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115516c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f115517d;

    private s90(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 LinearLayout linearLayout3) {
        this.f115514a = linearLayout;
        this.f115515b = linearLayout2;
        this.f115516c = textView;
        this.f115517d = linearLayout3;
    }

    @androidx.annotation.n0
    public static s90 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21078, new Class[]{View.class}, s90.class);
        if (patchProxyResultProxy.isSupported) {
            return (s90) patchProxyResultProxy.result;
        }
        int i10 = R.id.ll_weapon_list;
        LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.ll_weapon_list);
        if (linearLayout != null) {
            i10 = R.id.tv_all_weapon_expand;
            TextView textView = (TextView) l3.d.a(view, R.id.tv_all_weapon_expand);
            if (textView != null) {
                LinearLayout linearLayout2 = (LinearLayout) view;
                return new s90(linearLayout2, linearLayout, textView, linearLayout2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static s90 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21076, new Class[]{LayoutInflater.class}, s90.class);
        return patchProxyResultProxy.isSupported ? (s90) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static s90 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21077, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, s90.class);
        if (patchProxyResultProxy.isSupported) {
            return (s90) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_pubg_weapon_proficiency, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f115514a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21079, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
