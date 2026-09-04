package dg;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.n0;
import androidx.annotation.p0;
import com.permissionx.guolindev.R;
import l3.c;
import l3.d;

/* JADX INFO: compiled from: PermissionxDefaultDialogLayoutBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @n0
    private final LinearLayout f118506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @n0
    public final TextView f118507b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @n0
    public final Button f118508c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @n0
    public final LinearLayout f118509d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @n0
    public final LinearLayout f118510e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @n0
    public final Button f118511f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @n0
    public final LinearLayout f118512g;

    private a(@n0 LinearLayout linearLayout, @n0 TextView textView, @n0 Button button, @n0 LinearLayout linearLayout2, @n0 LinearLayout linearLayout3, @n0 Button button2, @n0 LinearLayout linearLayout4) {
        this.f118506a = linearLayout;
        this.f118507b = textView;
        this.f118508c = button;
        this.f118509d = linearLayout2;
        this.f118510e = linearLayout3;
        this.f118511f = button2;
        this.f118512g = linearLayout4;
    }

    @n0
    public static a a(@n0 View view) {
        int i10 = R.id.messageText;
        TextView textView = (TextView) d.a(view, i10);
        if (textView != null) {
            i10 = R.id.negativeBtn;
            Button button = (Button) d.a(view, i10);
            if (button != null) {
                i10 = R.id.negativeLayout;
                LinearLayout linearLayout = (LinearLayout) d.a(view, i10);
                if (linearLayout != null) {
                    i10 = R.id.permissionsLayout;
                    LinearLayout linearLayout2 = (LinearLayout) d.a(view, i10);
                    if (linearLayout2 != null) {
                        i10 = R.id.positiveBtn;
                        Button button2 = (Button) d.a(view, i10);
                        if (button2 != null) {
                            i10 = R.id.positiveLayout;
                            LinearLayout linearLayout3 = (LinearLayout) d.a(view, i10);
                            if (linearLayout3 != null) {
                                return new a((LinearLayout) view, textView, button, linearLayout, linearLayout2, button2, linearLayout3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @n0
    public static a c(@n0 LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @n0
    public static a d(@n0 LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.permissionx_default_dialog_layout, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // l3.c
    @n0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f118506a;
    }
}
