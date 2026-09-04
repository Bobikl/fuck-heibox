package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ActivityEditVoteBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class t implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final ScrollView f115732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final EditText f115733b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f115734c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final RadioButton f115735d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final RadioButton f115736e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final RadioGroup f115737f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f115738g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115739h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115740i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115741j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115742k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f115743l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f115744m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f115745n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f115746o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f115747p;

    private t(@androidx.annotation.n0 ScrollView scrollView, @androidx.annotation.n0 EditText editText, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 RadioButton radioButton, @androidx.annotation.n0 RadioButton radioButton2, @androidx.annotation.n0 RadioGroup radioGroup, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 RelativeLayout relativeLayout2, @androidx.annotation.n0 RelativeLayout relativeLayout3, @androidx.annotation.n0 RelativeLayout relativeLayout4) {
        this.f115732a = scrollView;
        this.f115733b = editText;
        this.f115734c = imageView;
        this.f115735d = radioButton;
        this.f115736e = radioButton2;
        this.f115737f = radioGroup;
        this.f115738g = recyclerView;
        this.f115739h = textView;
        this.f115740i = textView2;
        this.f115741j = textView3;
        this.f115742k = textView4;
        this.f115743l = linearLayout;
        this.f115744m = relativeLayout;
        this.f115745n = relativeLayout2;
        this.f115746o = relativeLayout3;
        this.f115747p = relativeLayout4;
    }

    @androidx.annotation.n0
    public static t a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 16316, new Class[]{View.class}, t.class);
        if (patchProxyResultProxy.isSupported) {
            return (t) patchProxyResultProxy.result;
        }
        int i10 = R.id.et_title;
        EditText editText = (EditText) l3.d.a(view, R.id.et_title);
        if (editText != null) {
            i10 = R.id.iv_icon;
            ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_icon);
            if (imageView != null) {
                i10 = R.id.rb_img;
                RadioButton radioButton = (RadioButton) l3.d.a(view, R.id.rb_img);
                if (radioButton != null) {
                    i10 = R.id.rb_text;
                    RadioButton radioButton2 = (RadioButton) l3.d.a(view, R.id.rb_text);
                    if (radioButton2 != null) {
                        i10 = R.id.rg_mode;
                        RadioGroup radioGroup = (RadioGroup) l3.d.a(view, R.id.rg_mode);
                        if (radioGroup != null) {
                            i10 = R.id.rv_options;
                            RecyclerView recyclerView = (RecyclerView) l3.d.a(view, R.id.rv_options);
                            if (recyclerView != null) {
                                i10 = R.id.tv_delete;
                                TextView textView = (TextView) l3.d.a(view, R.id.tv_delete);
                                if (textView != null) {
                                    i10 = R.id.tv_end_time;
                                    TextView textView2 = (TextView) l3.d.a(view, R.id.tv_end_time);
                                    if (textView2 != null) {
                                        i10 = R.id.tv_num;
                                        TextView textView3 = (TextView) l3.d.a(view, R.id.tv_num);
                                        if (textView3 != null) {
                                            i10 = R.id.tv_type;
                                            TextView textView4 = (TextView) l3.d.a(view, R.id.tv_type);
                                            if (textView4 != null) {
                                                i10 = R.id.vg_add;
                                                LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_add);
                                                if (linearLayout != null) {
                                                    i10 = R.id.vg_end_time;
                                                    RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.vg_end_time);
                                                    if (relativeLayout != null) {
                                                        i10 = R.id.vg_multi_num;
                                                        RelativeLayout relativeLayout2 = (RelativeLayout) l3.d.a(view, R.id.vg_multi_num);
                                                        if (relativeLayout2 != null) {
                                                            i10 = R.id.vg_title;
                                                            RelativeLayout relativeLayout3 = (RelativeLayout) l3.d.a(view, R.id.vg_title);
                                                            if (relativeLayout3 != null) {
                                                                i10 = R.id.vg_type;
                                                                RelativeLayout relativeLayout4 = (RelativeLayout) l3.d.a(view, R.id.vg_type);
                                                                if (relativeLayout4 != null) {
                                                                    return new t((ScrollView) view, editText, imageView, radioButton, radioButton2, radioGroup, recyclerView, textView, textView2, textView3, textView4, linearLayout, relativeLayout, relativeLayout2, relativeLayout3, relativeLayout4);
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
    public static t c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 16314, new Class[]{LayoutInflater.class}, t.class);
        return patchProxyResultProxy.isSupported ? (t) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static t d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 16315, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, t.class);
        if (patchProxyResultProxy.isSupported) {
            return (t) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.activity_edit_vote, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public ScrollView b() {
        return this.f115732a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16317, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
