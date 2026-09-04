package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.max.hbcommon.component.ListSectionHeader;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: FragmentChooseTopicHashtagBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class m7 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final ConstraintLayout f113306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ConstraintLayout f113307b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final EditText f113308c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final CircularProgressIndicator f113309d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f113310e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f113311f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final ListSectionHeader f113312g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final ListSectionHeader f113313h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final ListSectionHeader f113314i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f113315j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f113316k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f113317l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f113318m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f113319n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f113320o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f113321p;

    private m7(@androidx.annotation.n0 ConstraintLayout constraintLayout, @androidx.annotation.n0 ConstraintLayout constraintLayout2, @androidx.annotation.n0 EditText editText, @androidx.annotation.n0 CircularProgressIndicator circularProgressIndicator, @androidx.annotation.n0 FrameLayout frameLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ListSectionHeader listSectionHeader, @androidx.annotation.n0 ListSectionHeader listSectionHeader2, @androidx.annotation.n0 ListSectionHeader listSectionHeader3, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 RecyclerView recyclerView2, @androidx.annotation.n0 RecyclerView recyclerView3, @androidx.annotation.n0 RecyclerView recyclerView4, @androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 FrameLayout frameLayout2, @androidx.annotation.n0 FrameLayout frameLayout3) {
        this.f113306a = constraintLayout;
        this.f113307b = constraintLayout2;
        this.f113308c = editText;
        this.f113309d = circularProgressIndicator;
        this.f113310e = frameLayout;
        this.f113311f = imageView;
        this.f113312g = listSectionHeader;
        this.f113313h = listSectionHeader2;
        this.f113314i = listSectionHeader3;
        this.f113315j = recyclerView;
        this.f113316k = recyclerView2;
        this.f113317l = recyclerView3;
        this.f113318m = recyclerView4;
        this.f113319n = relativeLayout;
        this.f113320o = frameLayout2;
        this.f113321p = frameLayout3;
    }

    @androidx.annotation.n0
    public static m7 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 17120, new Class[]{View.class}, m7.class);
        if (patchProxyResultProxy.isSupported) {
            return (m7) patchProxyResultProxy.result;
        }
        int i10 = R.id.cl_content;
        ConstraintLayout constraintLayout = (ConstraintLayout) l3.d.a(view, R.id.cl_content);
        if (constraintLayout != null) {
            i10 = R.id.et_search;
            EditText editText = (EditText) l3.d.a(view, R.id.et_search);
            if (editText != null) {
                i10 = R.id.hashtag_loading;
                CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) l3.d.a(view, R.id.hashtag_loading);
                if (circularProgressIndicator != null) {
                    i10 = R.id.hashtag_status;
                    FrameLayout frameLayout = (FrameLayout) l3.d.a(view, R.id.hashtag_status);
                    if (frameLayout != null) {
                        i10 = R.id.iv_del;
                        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_del);
                        if (imageView != null) {
                            i10 = R.id.lsh_checked;
                            ListSectionHeader listSectionHeader = (ListSectionHeader) l3.d.a(view, R.id.lsh_checked);
                            if (listSectionHeader != null) {
                                i10 = R.id.lsh_hashtag;
                                ListSectionHeader listSectionHeader2 = (ListSectionHeader) l3.d.a(view, R.id.lsh_hashtag);
                                if (listSectionHeader2 != null) {
                                    i10 = R.id.lsh_topic;
                                    ListSectionHeader listSectionHeader3 = (ListSectionHeader) l3.d.a(view, R.id.lsh_topic);
                                    if (listSectionHeader3 != null) {
                                        i10 = R.id.rv_checked;
                                        RecyclerView recyclerView = (RecyclerView) l3.d.a(view, R.id.rv_checked);
                                        if (recyclerView != null) {
                                            i10 = R.id.rv_hashtag;
                                            RecyclerView recyclerView2 = (RecyclerView) l3.d.a(view, R.id.rv_hashtag);
                                            if (recyclerView2 != null) {
                                                i10 = R.id.rv_search;
                                                RecyclerView recyclerView3 = (RecyclerView) l3.d.a(view, R.id.rv_search);
                                                if (recyclerView3 != null) {
                                                    i10 = R.id.rv_topic;
                                                    RecyclerView recyclerView4 = (RecyclerView) l3.d.a(view, R.id.rv_topic);
                                                    if (recyclerView4 != null) {
                                                        i10 = R.id.vg_search;
                                                        RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.vg_search);
                                                        if (relativeLayout != null) {
                                                            i10 = R.id.vg_tips;
                                                            FrameLayout frameLayout2 = (FrameLayout) l3.d.a(view, R.id.vg_tips);
                                                            if (frameLayout2 != null) {
                                                                i10 = R.id.vg_topic;
                                                                FrameLayout frameLayout3 = (FrameLayout) l3.d.a(view, R.id.vg_topic);
                                                                if (frameLayout3 != null) {
                                                                    return new m7((ConstraintLayout) view, constraintLayout, editText, circularProgressIndicator, frameLayout, imageView, listSectionHeader, listSectionHeader2, listSectionHeader3, recyclerView, recyclerView2, recyclerView3, recyclerView4, relativeLayout, frameLayout2, frameLayout3);
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
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static m7 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 17118, new Class[]{LayoutInflater.class}, m7.class);
        return patchProxyResultProxy.isSupported ? (m7) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static m7 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 17119, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, m7.class);
        if (patchProxyResultProxy.isSupported) {
            return (m7) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.fragment_choose_topic_hashtag, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public ConstraintLayout b() {
        return this.f113306a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17121, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
