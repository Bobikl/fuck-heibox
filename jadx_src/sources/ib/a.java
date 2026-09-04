package ib;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: HBDialogImg.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class a implements com.max.hbcommon.view.a.h {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f119333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f119334b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f119335c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.e
    private String f119336d;

    public a() {
        this(0, 0, 0, null, 15, null);
    }

    public a(int i10, int i11, int i12, @dl.e String str) {
        this.f119333a = i10;
        this.f119334b = i11;
        this.f119335c = i12;
        this.f119336d = str;
    }

    public /* synthetic */ a(int i10, int i11, int i12, String str, int i13, u uVar) {
        this((i13 & 1) != 0 ? -1 : i10, (i13 & 2) != 0 ? -2 : i11, (i13 & 4) != 0 ? -1 : i12, (i13 & 8) != 0 ? null : str);
    }

    @Override // com.max.hbcommon.view.a.h
    @dl.d
    public ViewGroup.LayoutParams a(@dl.e Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, bb.c.d.Hp, new Class[]{Context.class}, ViewGroup.LayoutParams.class);
        return patchProxyResultProxy.isSupported ? (ViewGroup.LayoutParams) patchProxyResultProxy.result : new ViewGroup.LayoutParams(this.f119333a, this.f119334b);
    }

    @Override // com.max.hbcommon.view.a.h
    @dl.d
    public View b(@dl.e Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, bb.c.d.Gp, new Class[]{Context.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        ImageView imageView = new ImageView(context);
        if (com.max.hbcommon.utils.c.u(this.f119336d)) {
            imageView.setImageResource(this.f119335c);
        } else {
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            com.max.hbimage.b.K(this.f119336d, imageView);
        }
        return imageView;
    }

    @dl.e
    public final String c() {
        return this.f119336d;
    }

    public final int d() {
        return this.f119335c;
    }

    public final int e() {
        return this.f119334b;
    }

    public final int f() {
        return this.f119333a;
    }

    public final void g(@dl.e String str) {
        this.f119336d = str;
    }

    public final void h(int i10) {
        this.f119335c = i10;
    }

    public final void i(int i10) {
        this.f119334b = i10;
    }

    public final void j(int i10) {
        this.f119333a = i10;
    }
}
