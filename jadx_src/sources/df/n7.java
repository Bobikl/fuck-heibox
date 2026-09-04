package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: FragmentChooseTopicOrHashtagNewEntryBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class n7 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f113714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ConstraintLayout f113715b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final EditText f113716c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f113717d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f113718e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113719f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f113720g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final ViewStub f113721h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final ViewStub f113722i;

    private n7(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 ConstraintLayout constraintLayout, @androidx.annotation.n0 EditText editText, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 ViewStub viewStub, @androidx.annotation.n0 ViewStub viewStub2) {
        this.f113714a = linearLayout;
        this.f113715b = constraintLayout;
        this.f113716c = editText;
        this.f113717d = imageView;
        this.f113718e = imageView2;
        this.f113719f = textView;
        this.f113720g = relativeLayout;
        this.f113721h = viewStub;
        this.f113722i = viewStub2;
    }

    @androidx.annotation.n0
    public static n7 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 17124, new Class[]{View.class}, n7.class);
        if (patchProxyResultProxy.isSupported) {
            return (n7) patchProxyResultProxy.result;
        }
        int i10 = R.id.cl_content;
        ConstraintLayout constraintLayout = (ConstraintLayout) l3.d.a(view, R.id.cl_content);
        if (constraintLayout != null) {
            i10 = R.id.et_search;
            EditText editText = (EditText) l3.d.a(view, R.id.et_search);
            if (editText != null) {
                i10 = R.id.iv_del;
                ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_del);
                if (imageView != null) {
                    i10 = R.id.iv_search_icon;
                    ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_search_icon);
                    if (imageView2 != null) {
                        i10 = R.id.tv_title_w500;
                        TextView textView = (TextView) l3.d.a(view, R.id.tv_title_w500);
                        if (textView != null) {
                            i10 = R.id.vg_search;
                            RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.vg_search);
                            if (relativeLayout != null) {
                                i10 = R.id.vs_hashtag_choose_entry;
                                ViewStub viewStub = (ViewStub) l3.d.a(view, R.id.vs_hashtag_choose_entry);
                                if (viewStub != null) {
                                    i10 = R.id.vs_topic_choose_entry;
                                    ViewStub viewStub2 = (ViewStub) l3.d.a(view, R.id.vs_topic_choose_entry);
                                    if (viewStub2 != null) {
                                        return new n7((LinearLayout) view, constraintLayout, editText, imageView, imageView2, textView, relativeLayout, viewStub, viewStub2);
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
    public static n7 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 17122, new Class[]{LayoutInflater.class}, n7.class);
        return patchProxyResultProxy.isSupported ? (n7) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static n7 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 17123, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, n7.class);
        if (patchProxyResultProxy.isSupported) {
            return (n7) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.fragment_choose_topic_or_hashtag_new_entry, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f113714a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17125, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
