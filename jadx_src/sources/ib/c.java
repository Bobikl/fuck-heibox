package ib;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.max.hbcommon.R;
import com.max.hbcommon.utils.l;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: HBDialogText.kt */
/* JADX INFO: loaded from: classes9.dex */
public class c implements com.max.hbcommon.view.a.h {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f119338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f119339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.e
    private String f119340c;

    public c() {
        this(0.0f, 0, null, 7, null);
    }

    public c(float f10, int i10, @dl.e String str) {
        this.f119338a = f10;
        this.f119339b = i10;
        this.f119340c = str;
    }

    public /* synthetic */ c(float f10, int i10, String str, int i11, u uVar) {
        this((i11 & 1) != 0 ? 18.0f : f10, (i11 & 2) != 0 ? l.a(R.color.text_primary_1_color) : i10, (i11 & 4) != 0 ? null : str);
    }

    @Override // com.max.hbcommon.view.a.h
    public /* synthetic */ ViewGroup.LayoutParams a(Context context) {
        return com.max.hbcommon.view.b.a(this, context);
    }

    @Override // com.max.hbcommon.view.a.h
    @dl.d
    public View b(@dl.e Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, bb.c.d.Jp, new Class[]{Context.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        TextView textView = new TextView(context);
        textView.setIncludeFontPadding(false);
        textView.setGravity(17);
        textView.setTextSize(1, this.f119338a);
        textView.setTextColor(this.f119339b);
        textView.setText(this.f119340c);
        textView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return textView;
    }

    public final int c() {
        return this.f119339b;
    }

    public final float d() {
        return this.f119338a;
    }

    @dl.e
    public final String e() {
        return this.f119340c;
    }

    public final void f(int i10) {
        this.f119339b = i10;
    }

    public final void g(float f10) {
        this.f119338a = f10;
    }

    public final void h(@dl.e String str) {
        this.f119340c = str;
    }
}
