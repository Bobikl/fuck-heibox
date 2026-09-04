package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Switch;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbcommon.component.ListSectionHeader;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ActivityNewsFavourBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class r1 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final NestedScrollView f115022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f115023b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ListSectionHeader f115024c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ListSectionHeader f115025d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f115026e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f115027f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final Switch f115028g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final Switch f115029h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115030i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115031j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115032k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115033l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f115034m;

    private r1(@androidx.annotation.n0 NestedScrollView nestedScrollView, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ListSectionHeader listSectionHeader, @androidx.annotation.n0 ListSectionHeader listSectionHeader2, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 RecyclerView recyclerView2, @androidx.annotation.n0 Switch r10, @androidx.annotation.n0 Switch r11, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 RelativeLayout relativeLayout) {
        this.f115022a = nestedScrollView;
        this.f115023b = imageView;
        this.f115024c = listSectionHeader;
        this.f115025d = listSectionHeader2;
        this.f115026e = recyclerView;
        this.f115027f = recyclerView2;
        this.f115028g = r10;
        this.f115029h = r11;
        this.f115030i = textView;
        this.f115031j = textView2;
        this.f115032k = textView3;
        this.f115033l = textView4;
        this.f115034m = relativeLayout;
    }

    @androidx.annotation.n0
    public static r1 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 16516, new Class[]{View.class}, r1.class);
        if (patchProxyResultProxy.isSupported) {
            return (r1) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_rec;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_rec);
        if (imageView != null) {
            i10 = R.id.lsh1;
            ListSectionHeader listSectionHeader = (ListSectionHeader) l3.d.a(view, R.id.lsh1);
            if (listSectionHeader != null) {
                i10 = R.id.lsh2;
                ListSectionHeader listSectionHeader2 = (ListSectionHeader) l3.d.a(view, R.id.lsh2);
                if (listSectionHeader2 != null) {
                    i10 = R.id.rv_selected;
                    RecyclerView recyclerView = (RecyclerView) l3.d.a(view, R.id.rv_selected);
                    if (recyclerView != null) {
                        i10 = R.id.rv_unselected;
                        RecyclerView recyclerView2 = (RecyclerView) l3.d.a(view, R.id.rv_unselected);
                        if (recyclerView2 != null) {
                            i10 = R.id.sb_mode;
                            Switch r10 = (Switch) l3.d.a(view, R.id.sb_mode);
                            if (r10 != null) {
                                i10 = R.id.sb_rec_switch;
                                Switch r11 = (Switch) l3.d.a(view, R.id.sb_rec_switch);
                                if (r11 != null) {
                                    i10 = R.id.tv_mode_desc;
                                    TextView textView = (TextView) l3.d.a(view, R.id.tv_mode_desc);
                                    if (textView != null) {
                                        i10 = R.id.tv_rec_desc;
                                        TextView textView2 = (TextView) l3.d.a(view, R.id.tv_rec_desc);
                                        if (textView2 != null) {
                                            i10 = R.id.tv_rec_switch_desc;
                                            TextView textView3 = (TextView) l3.d.a(view, R.id.tv_rec_switch_desc);
                                            if (textView3 != null) {
                                                i10 = R.id.tv_rec_title;
                                                TextView textView4 = (TextView) l3.d.a(view, R.id.tv_rec_title);
                                                if (textView4 != null) {
                                                    i10 = R.id.vg_rec;
                                                    RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.vg_rec);
                                                    if (relativeLayout != null) {
                                                        return new r1((NestedScrollView) view, imageView, listSectionHeader, listSectionHeader2, recyclerView, recyclerView2, r10, r11, textView, textView2, textView3, textView4, relativeLayout);
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
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static r1 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 16514, new Class[]{LayoutInflater.class}, r1.class);
        return patchProxyResultProxy.isSupported ? (r1) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static r1 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 16515, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, r1.class);
        if (patchProxyResultProxy.isSupported) {
            return (r1) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.activity_news_favour, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public NestedScrollView b() {
        return this.f115022a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16517, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
