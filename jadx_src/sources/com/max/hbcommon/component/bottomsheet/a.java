package com.max.hbcommon.component.bottomsheet;

import android.os.Bundle;
import android.text.SpannableString;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: BottomSheetsDefault.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class a {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final BottomSheetsParams f67249a = new BottomSheetsParams();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.e
    private View.OnClickListener f67250b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.e
    private View.OnClickListener f67251c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.e
    private View f67252d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.e
    private CharSequence f67253e;

    public static /* synthetic */ a q(a aVar, String str, boolean z10, View.OnClickListener onClickListener, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{aVar, str, new Byte(z10 ? (byte) 1 : (byte) 0), onClickListener, new Integer(i10), obj}, null, changeQuickRedirect, true, bb.c.d.Hi, new Class[]{a.class, String.class, Boolean.TYPE, View.OnClickListener.class, Integer.TYPE, Object.class}, a.class);
        if (patchProxyResultProxy.isSupported) {
            return (a) patchProxyResultProxy.result;
        }
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return aVar.p(str, z10, onClickListener);
    }

    public static /* synthetic */ a w(a aVar, String str, boolean z10, View.OnClickListener onClickListener, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{aVar, str, new Byte(z10 ? (byte) 1 : (byte) 0), onClickListener, new Integer(i10), obj}, null, changeQuickRedirect, true, bb.c.d.Fi, new Class[]{a.class, String.class, Boolean.TYPE, View.OnClickListener.class, Integer.TYPE, Object.class}, a.class);
        if (patchProxyResultProxy.isSupported) {
            return (a) patchProxyResultProxy.result;
        }
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return aVar.v(str, z10, onClickListener);
    }

    @dl.d
    public final q a() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.f31513ri, new Class[0], q.class);
        if (patchProxyResultProxy.isSupported) {
            return (q) patchProxyResultProxy.result;
        }
        q qVar = new q();
        Bundle bundle = new Bundle();
        bundle.putSerializable("ARG_PARAMS", this.f67249a);
        qVar.setArguments(bundle);
        qVar.w4(this.f67250b);
        qVar.x4(this.f67251c);
        qVar.u4(this.f67252d);
        qVar.v4(this.f67253e);
        return qVar;
    }

    @dl.d
    public final d b() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.f31535si, new Class[0], d.class);
        if (patchProxyResultProxy.isSupported) {
            return (d) patchProxyResultProxy.result;
        }
        d dVar = new d();
        Bundle bundle = new Bundle();
        bundle.putSerializable("ARG_PARAMS", this.f67249a);
        dVar.setArguments(bundle);
        dVar.w4(this.f67250b);
        dVar.x4(this.f67251c);
        dVar.v4(this.f67253e);
        return dVar;
    }

    @dl.e
    public final View c() {
        return this.f67252d;
    }

    @dl.e
    public final CharSequence d() {
        return this.f67253e;
    }

    @dl.e
    public final View.OnClickListener e() {
        return this.f67250b;
    }

    @dl.e
    public final View.OnClickListener f() {
        return this.f67251c;
    }

    @dl.d
    public final BottomSheetsParams g() {
        return this.f67249a;
    }

    @dl.d
    public final a h(@androidx.annotation.l int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.d.Di, new Class[]{Integer.TYPE}, a.class);
        if (patchProxyResultProxy.isSupported) {
            return (a) patchProxyResultProxy.result;
        }
        this.f67249a.n(Integer.valueOf(i10));
        return this;
    }

    @dl.d
    public final a i(@dl.e String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, bb.c.d.f31689zi, new Class[]{String.class}, a.class);
        if (patchProxyResultProxy.isSupported) {
            return (a) patchProxyResultProxy.result;
        }
        this.f67249a.o(str);
        return this;
    }

    @dl.d
    public final a j(@dl.d View bottomView) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bottomView}, this, changeQuickRedirect, false, bb.c.d.f31557ti, new Class[]{View.class}, a.class);
        if (patchProxyResultProxy.isSupported) {
            return (a) patchProxyResultProxy.result;
        }
        f0.p(bottomView, "bottomView");
        this.f67252d = bottomView;
        return this;
    }

    @dl.d
    public final a k(boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.d.Ai, new Class[]{Boolean.TYPE}, a.class);
        if (patchProxyResultProxy.isSupported) {
            return (a) patchProxyResultProxy.result;
        }
        this.f67249a.z(z10);
        return this;
    }

    @dl.d
    public final a l(@dl.d SpannableString desc) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{desc}, this, changeQuickRedirect, false, bb.c.d.Ci, new Class[]{SpannableString.class}, a.class);
        if (patchProxyResultProxy.isSupported) {
            return (a) patchProxyResultProxy.result;
        }
        f0.p(desc, "desc");
        this.f67253e = desc;
        return this;
    }

    @dl.d
    public final a m(boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.d.f31601vi, new Class[]{Boolean.TYPE}, a.class);
        if (patchProxyResultProxy.isSupported) {
            return (a) patchProxyResultProxy.result;
        }
        this.f67249a.r(z10);
        return this;
    }

    @dl.d
    public final a n(@androidx.annotation.l int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.d.f31645xi, new Class[]{Integer.TYPE}, a.class);
        if (patchProxyResultProxy.isSupported) {
            return (a) patchProxyResultProxy.result;
        }
        this.f67249a.s(Integer.valueOf(i10));
        return this;
    }

    @dl.d
    public final a o(@dl.e String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, bb.c.d.f31667yi, new Class[]{String.class}, a.class);
        if (patchProxyResultProxy.isSupported) {
            return (a) patchProxyResultProxy.result;
        }
        this.f67249a.t(str);
        return this;
    }

    @dl.d
    public final a p(@dl.e String str, boolean z10, @dl.d View.OnClickListener listener) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, new Byte(z10 ? (byte) 1 : (byte) 0), listener}, this, changeQuickRedirect, false, bb.c.d.Gi, new Class[]{String.class, Boolean.TYPE, View.OnClickListener.class}, a.class);
        if (patchProxyResultProxy.isSupported) {
            return (a) patchProxyResultProxy.result;
        }
        f0.p(listener, "listener");
        this.f67249a.u(str);
        this.f67250b = listener;
        this.f67249a.p(z10);
        return this;
    }

    public final void r(@dl.e View view) {
        this.f67252d = view;
    }

    public final void s(@dl.e CharSequence charSequence) {
        this.f67253e = charSequence;
    }

    public final void t(@dl.e View.OnClickListener onClickListener) {
        this.f67250b = onClickListener;
    }

    public final void u(@dl.e View.OnClickListener onClickListener) {
        this.f67251c = onClickListener;
    }

    @dl.d
    public final a v(@dl.e String str, boolean z10, @dl.d View.OnClickListener listener) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, new Byte(z10 ? (byte) 1 : (byte) 0), listener}, this, changeQuickRedirect, false, bb.c.d.Ei, new Class[]{String.class, Boolean.TYPE, View.OnClickListener.class}, a.class);
        if (patchProxyResultProxy.isSupported) {
            return (a) patchProxyResultProxy.result;
        }
        f0.p(listener, "listener");
        this.f67249a.v(str);
        this.f67251c = listener;
        this.f67249a.q(z10);
        return this;
    }

    @dl.d
    public final a x(boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.d.f31579ui, new Class[]{Boolean.TYPE}, a.class);
        if (patchProxyResultProxy.isSupported) {
            return (a) patchProxyResultProxy.result;
        }
        this.f67249a.w(z10);
        return this;
    }

    @dl.d
    public final a y(boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.d.f31623wi, new Class[]{Boolean.TYPE}, a.class);
        if (patchProxyResultProxy.isSupported) {
            return (a) patchProxyResultProxy.result;
        }
        this.f67249a.x(z10);
        return this;
    }

    @dl.d
    public final a z(@dl.d String title) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{title}, this, changeQuickRedirect, false, bb.c.d.Bi, new Class[]{String.class}, a.class);
        if (patchProxyResultProxy.isSupported) {
            return (a) patchProxyResultProxy.result;
        }
        f0.p(title, "title");
        this.f67249a.y(title);
        return this;
    }
}
