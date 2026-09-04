package com.max.hbcustomview.loadingdialog;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.appcompat.app.i;
import bb.c;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.max.hbcustomview.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: LoadingDialog.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class LoadingDialog {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @d
    private Context f69180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f69181b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @d
    private i f69182c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public CircularProgressIndicator f69183d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f69184e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @e
    private String f69185f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @d
    private LoadingStyle f69186g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f69187h;

    /* JADX INFO: compiled from: LoadingDialog.kt */
    public enum LoadingStyle {
        Loading,
        Progress;

        private static final /* synthetic */ kotlin.enums.a $ENTRIES = EnumEntriesKt.b(values());
        public static ChangeQuickRedirect changeQuickRedirect;

        @d
        public static kotlin.enums.a<LoadingStyle> getEntries() {
            return $ENTRIES;
        }

        public static LoadingStyle valueOf(String str) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, c.f.f32294gl, new Class[]{String.class}, LoadingStyle.class);
            return (LoadingStyle) (patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : Enum.valueOf(LoadingStyle.class, str));
        }

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static LoadingStyle[] valuesCustom() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, c.f.f32271fl, new Class[0], LoadingStyle[].class);
            return (LoadingStyle[]) (patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : values().clone());
        }
    }

    /* JADX INFO: compiled from: LoadingDialog.kt */
    public final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f69188a;

        static {
            int[] iArr = new int[LoadingStyle.valuesCustom().length];
            try {
                iArr[LoadingStyle.Loading.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LoadingStyle.Progress.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f69188a = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LoadingDialog(@d Context context) {
        this(context, c6.a.f35595i);
        f0.p(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LoadingDialog(@d Context context, @e String str) {
        this(context, str, false);
        f0.p(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LoadingDialog(@d Context context, @e String str, boolean z10) {
        this(context, str, z10, LoadingStyle.Loading);
        f0.p(context, "context");
    }

    public LoadingDialog(@d Context context, @e String str, boolean z10, @d LoadingStyle style) {
        f0.p(context, "context");
        f0.p(style, "style");
        LoadingStyle loadingStyle = LoadingStyle.Loading;
        this.f69180a = context;
        this.f69185f = str;
        this.f69186g = style;
        this.f69187h = z10;
        this.f69182c = b(context);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x007c  */
    private final i b(Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, c.f.Xk, new Class[]{Context.class}, i.class);
        if (patchProxyResultProxy.isSupported) {
            return (i) patchProxyResultProxy.result;
        }
        i iVar = new i(context, R.style.smart_show_dialog);
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.layout_dialog_loading, (ViewGroup) null, false);
        View viewFindViewById = viewInflate.findViewById(R.id.tv_loading_description);
        f0.o(viewFindViewById, "findViewById(...)");
        q((TextView) viewFindViewById);
        h().setText(this.f69185f);
        ic.a aVar = ic.a.f119343a;
        int iA = aVar.a(context, 20.0f);
        int iA2 = aVar.a(context, 16.5f);
        String str = this.f69185f;
        if (str == null) {
            h().setVisibility(8);
            viewInflate.setPadding(iA2, iA2, iA2, iA2);
        } else {
            Integer numValueOf = str != null ? Integer.valueOf(str.length()) : null;
            f0.m(numValueOf);
            if (numValueOf.intValue() > 0) {
                h().setVisibility(0);
                viewInflate.setPadding(iA, iA2, iA, iA);
            } else {
                h().setVisibility(8);
                viewInflate.setPadding(iA2, iA2, iA2, iA2);
            }
        }
        View viewFindViewById2 = viewInflate.findViewById(R.id.progress_loading);
        f0.o(viewFindViewById2, "findViewById(...)");
        p((CircularProgressIndicator) viewFindViewById2);
        n(this.f69186g);
        Window window = iVar.getWindow();
        if (window != null) {
            window.clearFlags(2);
        }
        iVar.setCancelable(this.f69187h);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        Window window2 = iVar.getWindow();
        if (window2 != null) {
            window2.clearFlags(2);
        }
        iVar.setContentView(viewInflate, marginLayoutParams);
        return iVar;
    }

    @d
    public final LoadingDialog a() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.f.f32201cl, new Class[0], LoadingDialog.class);
        if (patchProxyResultProxy.isSupported) {
            return (LoadingDialog) patchProxyResultProxy.result;
        }
        this.f69182c.cancel();
        return this;
    }

    @d
    public final LoadingDialog c() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.f.f32178bl, new Class[0], LoadingDialog.class);
        if (patchProxyResultProxy.isSupported) {
            return (LoadingDialog) patchProxyResultProxy.result;
        }
        this.f69182c.dismiss();
        return this;
    }

    public final boolean d() {
        return this.f69181b;
    }

    @d
    public final Context e() {
        return this.f69180a;
    }

    @d
    public final i f() {
        return this.f69182c;
    }

    @d
    public final CircularProgressIndicator g() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.f.Tk, new Class[0], CircularProgressIndicator.class);
        if (patchProxyResultProxy.isSupported) {
            return (CircularProgressIndicator) patchProxyResultProxy.result;
        }
        CircularProgressIndicator circularProgressIndicator = this.f69183d;
        if (circularProgressIndicator != null) {
            return circularProgressIndicator;
        }
        f0.S("progress_loading");
        return null;
    }

    @d
    public final TextView h() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.f.Vk, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.f69184e;
        if (textView != null) {
            return textView;
        }
        f0.S("tv_loading_description");
        return null;
    }

    public final boolean i() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.f.f32225dl, new Class[0], Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : this.f69182c.isShowing();
    }

    public final void j(boolean z10) {
        this.f69181b = z10;
    }

    public final void k(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, c.f.f32248el, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f69187h = z10;
        i iVar = this.f69182c;
        if (iVar != null) {
            iVar.setCancelable(z10);
        }
    }

    public final void l(@d Context context) {
        if (PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, c.f.Rk, new Class[]{Context.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(context, "<set-?>");
        this.f69180a = context;
    }

    public final void m(@d i iVar) {
        if (PatchProxy.proxy(new Object[]{iVar}, this, changeQuickRedirect, false, c.f.Sk, new Class[]{i.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(iVar, "<set-?>");
        this.f69182c = iVar;
    }

    public final void n(@d LoadingStyle style) {
        if (PatchProxy.proxy(new Object[]{style}, this, changeQuickRedirect, false, c.f.Zk, new Class[]{LoadingStyle.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(style, "style");
        this.f69186g = style;
        int i10 = a.f69188a[style.ordinal()];
        if (i10 == 1) {
            g().p();
        } else {
            if (i10 != 2) {
                return;
            }
            g().j();
            g().setProgress(0);
        }
    }

    public final void o(@e String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, c.f.Yk, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        h().setText(str);
    }

    public final void p(@d CircularProgressIndicator circularProgressIndicator) {
        if (PatchProxy.proxy(new Object[]{circularProgressIndicator}, this, changeQuickRedirect, false, c.f.Uk, new Class[]{CircularProgressIndicator.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(circularProgressIndicator, "<set-?>");
        this.f69183d = circularProgressIndicator;
    }

    public final void q(@d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, c.f.Wk, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(textView, "<set-?>");
        this.f69184e = textView;
    }

    @d
    public final LoadingDialog r() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.f.f32155al, new Class[0], LoadingDialog.class);
        if (patchProxyResultProxy.isSupported) {
            return (LoadingDialog) patchProxyResultProxy.result;
        }
        this.f69182c.show();
        return this;
    }
}
