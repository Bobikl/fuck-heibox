package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: LayoutSubjectListHeaderBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class hb0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f111383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f111384b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f111385c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final RadioButton f111386d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final RadioButton f111387e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final RadioButton f111388f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final RadioGroup f111389g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f111390h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111391i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111392j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111393k;

    private hb0(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 RadioButton radioButton, @androidx.annotation.n0 RadioButton radioButton2, @androidx.annotation.n0 RadioButton radioButton3, @androidx.annotation.n0 RadioGroup radioGroup, @androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3) {
        this.f111383a = linearLayout;
        this.f111384b = imageView;
        this.f111385c = linearLayout2;
        this.f111386d = radioButton;
        this.f111387e = radioButton2;
        this.f111388f = radioButton3;
        this.f111389g = radioGroup;
        this.f111390h = relativeLayout;
        this.f111391i = textView;
        this.f111392j = textView2;
        this.f111393k = textView3;
    }

    @androidx.annotation.n0
    public static hb0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21237, new Class[]{View.class}, hb0.class);
        if (patchProxyResultProxy.isSupported) {
            return (hb0) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_img;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_img);
        if (imageView != null) {
            i10 = R.id.ll_time_visit;
            LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.ll_time_visit);
            if (linearLayout != null) {
                i10 = R.id.rb_all;
                RadioButton radioButton = (RadioButton) l3.d.a(view, R.id.rb_all);
                if (radioButton != null) {
                    i10 = R.id.rb_news;
                    RadioButton radioButton2 = (RadioButton) l3.d.a(view, R.id.rb_news);
                    if (radioButton2 != null) {
                        i10 = R.id.rb_videos;
                        RadioButton radioButton3 = (RadioButton) l3.d.a(view, R.id.rb_videos);
                        if (radioButton3 != null) {
                            i10 = R.id.rg_subject_page;
                            RadioGroup radioGroup = (RadioGroup) l3.d.a(view, R.id.rg_subject_page);
                            if (radioGroup != null) {
                                i10 = R.id.rl_bg;
                                RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.rl_bg);
                                if (relativeLayout != null) {
                                    i10 = R.id.tv_time;
                                    TextView textView = (TextView) l3.d.a(view, R.id.tv_time);
                                    if (textView != null) {
                                        i10 = R.id.tv_title;
                                        TextView textView2 = (TextView) l3.d.a(view, R.id.tv_title);
                                        if (textView2 != null) {
                                            i10 = R.id.tv_visits;
                                            TextView textView3 = (TextView) l3.d.a(view, R.id.tv_visits);
                                            if (textView3 != null) {
                                                return new hb0((LinearLayout) view, imageView, linearLayout, radioButton, radioButton2, radioButton3, radioGroup, relativeLayout, textView, textView2, textView3);
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
    public static hb0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21235, new Class[]{LayoutInflater.class}, hb0.class);
        return patchProxyResultProxy.isSupported ? (hb0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static hb0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21236, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, hb0.class);
        if (patchProxyResultProxy.isSupported) {
            return (hb0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_subject_list_header, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f111383a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21238, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
