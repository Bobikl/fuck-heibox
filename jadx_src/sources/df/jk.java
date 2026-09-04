package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.view.slicegradeview.SliceGradeView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemGameCommentMultiDimensionBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class jk implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final ConstraintLayout f112209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final EditText f112210b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f112211c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final SliceGradeView f112212d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112213e;

    private jk(@androidx.annotation.n0 ConstraintLayout constraintLayout, @androidx.annotation.n0 EditText editText, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 SliceGradeView sliceGradeView, @androidx.annotation.n0 TextView textView) {
        this.f112209a = constraintLayout;
        this.f112210b = editText;
        this.f112211c = imageView;
        this.f112212d = sliceGradeView;
        this.f112213e = textView;
    }

    @androidx.annotation.n0
    public static jk a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 18459, new Class[]{View.class}, jk.class);
        if (patchProxyResultProxy.isSupported) {
            return (jk) patchProxyResultProxy.result;
        }
        int i10 = R.id.et_label;
        EditText editText = (EditText) l3.d.a(view, R.id.et_label);
        if (editText != null) {
            i10 = R.id.iv_edit;
            ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_edit);
            if (imageView != null) {
                i10 = R.id.sgv_multi_dimension;
                SliceGradeView sliceGradeView = (SliceGradeView) l3.d.a(view, R.id.sgv_multi_dimension);
                if (sliceGradeView != null) {
                    i10 = R.id.tv_name;
                    TextView textView = (TextView) l3.d.a(view, R.id.tv_name);
                    if (textView != null) {
                        return new jk((ConstraintLayout) view, editText, imageView, sliceGradeView, textView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static jk c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 18457, new Class[]{LayoutInflater.class}, jk.class);
        return patchProxyResultProxy.isSupported ? (jk) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static jk d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 18458, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, jk.class);
        if (patchProxyResultProxy.isSupported) {
            return (jk) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_game_comment_multi_dimension, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public ConstraintLayout b() {
        return this.f112209a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 18460, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
