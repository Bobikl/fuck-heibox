package dg;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.n0;
import androidx.annotation.p0;
import com.permissionx.guolindev.R;
import l3.c;
import l3.d;

/* JADX INFO: compiled from: PermissionxPermissionItemBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @n0
    private final LinearLayout f118513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @n0
    public final ImageView f118514b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @n0
    public final TextView f118515c;

    private b(@n0 LinearLayout linearLayout, @n0 ImageView imageView, @n0 TextView textView) {
        this.f118513a = linearLayout;
        this.f118514b = imageView;
        this.f118515c = textView;
    }

    @n0
    public static b a(@n0 View view) {
        int i10 = R.id.permissionIcon;
        ImageView imageView = (ImageView) d.a(view, i10);
        if (imageView != null) {
            i10 = R.id.permissionText;
            TextView textView = (TextView) d.a(view, i10);
            if (textView != null) {
                return new b((LinearLayout) view, imageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @n0
    public static b c(@n0 LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @n0
    public static b d(@n0 LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.permissionx_permission_item, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // l3.c
    @n0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f118513a;
    }
}
