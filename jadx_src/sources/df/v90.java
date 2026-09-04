package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.FragmentContainerView;
import androidx.recyclerview.widget.RecyclerView;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.account.component.SettingItemView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: LayoutPushSettingBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class v90 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f116727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final FragmentContainerView f116728b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f116729c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f116730d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final SettingItemView f116731e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final CardView f116732f;

    private v90(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 FragmentContainerView fragmentContainerView, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 View view, @androidx.annotation.n0 SettingItemView settingItemView, @androidx.annotation.n0 CardView cardView) {
        this.f116727a = relativeLayout;
        this.f116728b = fragmentContainerView;
        this.f116729c = recyclerView;
        this.f116730d = view;
        this.f116731e = settingItemView;
        this.f116732f = cardView;
    }

    @androidx.annotation.n0
    public static v90 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21090, new Class[]{View.class}, v90.class);
        if (patchProxyResultProxy.isSupported) {
            return (v90) patchProxyResultProxy.result;
        }
        int i10 = R.id.push_state_group_fragment_container;
        FragmentContainerView fragmentContainerView = (FragmentContainerView) l3.d.a(view, R.id.push_state_group_fragment_container);
        if (fragmentContainerView != null) {
            i10 = R.id.rv;
            RecyclerView recyclerView = (RecyclerView) l3.d.a(view, R.id.rv);
            if (recyclerView != null) {
                i10 = R.id.v_mask;
                View viewA = l3.d.a(view, R.id.v_mask);
                if (viewA != null) {
                    i10 = R.id.vg_push_permission;
                    SettingItemView settingItemView = (SettingItemView) l3.d.a(view, R.id.vg_push_permission);
                    if (settingItemView != null) {
                        i10 = R.id.vg_push_permission_card;
                        CardView cardView = (CardView) l3.d.a(view, R.id.vg_push_permission_card);
                        if (cardView != null) {
                            return new v90((RelativeLayout) view, fragmentContainerView, recyclerView, viewA, settingItemView, cardView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static v90 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21088, new Class[]{LayoutInflater.class}, v90.class);
        return patchProxyResultProxy.isSupported ? (v90) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static v90 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21089, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, v90.class);
        if (patchProxyResultProxy.isSupported) {
            return (v90) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_push_setting, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f116727a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21091, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
