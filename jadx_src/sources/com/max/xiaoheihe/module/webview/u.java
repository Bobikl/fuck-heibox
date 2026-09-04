package com.max.xiaoheihe.module.webview;

import android.os.Bundle;
import com.max.xiaoheihe.bean.BgConfigObj;
import com.max.xiaoheihe.bean.WebProtocolObj;
import com.max.xiaoheihe.bean.mall.cart.MallOrderNotifyObj;
import com.max.xiaoheihe.bean.proxy.ProxyAddressObj;
import com.max.xiaoheihe.bean.webintercept.IpDirectObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: WebFragmentBuilder.kt */
/* JADX INFO: loaded from: classes12.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f94783b = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final v f94784a;

    public u(@dl.e String str) {
        v vVar = new v();
        this.f94784a = vVar;
        vVar.Z(str);
    }

    @dl.d
    public final u A(boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 47097, new Class[]{Boolean.TYPE}, u.class);
        if (patchProxyResultProxy.isSupported) {
            return (u) patchProxyResultProxy.result;
        }
        this.f94784a.a0(z10);
        return this;
    }

    @dl.d
    public final u B(@dl.e WebProtocolObj webProtocolObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{webProtocolObj}, this, changeQuickRedirect, false, 47095, new Class[]{WebProtocolObj.class}, u.class);
        if (patchProxyResultProxy.isSupported) {
            return (u) patchProxyResultProxy.result;
        }
        this.f94784a.c0(webProtocolObj);
        return this;
    }

    @dl.d
    public final u C(@dl.e String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 47106, new Class[]{String.class}, u.class);
        if (patchProxyResultProxy.isSupported) {
            return (u) patchProxyResultProxy.result;
        }
        this.f94784a.b0(str);
        return this;
    }

    @dl.d
    public final u D(boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 47108, new Class[]{Boolean.TYPE}, u.class);
        if (patchProxyResultProxy.isSupported) {
            return (u) patchProxyResultProxy.result;
        }
        this.f94784a.d0(z10);
        return this;
    }

    @dl.d
    public final WebviewFragment a() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47081, new Class[0], WebviewFragment.class);
        if (patchProxyResultProxy.isSupported) {
            return (WebviewFragment) patchProxyResultProxy.result;
        }
        WebviewFragment webviewFragment = new WebviewFragment();
        webviewFragment.setArguments(b());
        return webviewFragment;
    }

    @dl.d
    public final Bundle b() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47082, new Class[0], Bundle.class);
        if (patchProxyResultProxy.isSupported) {
            return (Bundle) patchProxyResultProxy.result;
        }
        Bundle bundle = new Bundle();
        bundle.putString("url", this.f94784a.w());
        bundle.putInt(WebviewFragment.f94370q4, this.f94784a.c());
        bundle.putString(WebviewFragment.f94371r4, this.f94784a.l());
        bundle.putBoolean(WebviewFragment.f94372s4, this.f94784a.q());
        bundle.putBoolean(WebviewFragment.f94373t4, this.f94784a.n());
        bundle.putBoolean(WebviewFragment.f94374u4, this.f94784a.b());
        bundle.putString("message", this.f94784a.m());
        bundle.putSerializable(WebviewFragment.f94376w4, this.f94784a.o());
        bundle.putString(WebviewFragment.f94377x4, this.f94784a.e());
        bundle.putString(WebviewFragment.f94378y4, this.f94784a.k());
        bundle.putString(WebviewFragment.f94379z4, this.f94784a.h());
        bundle.putSerializable(WebviewFragment.A4, this.f94784a.p());
        bundle.putBoolean(WebviewFragment.B4, this.f94784a.g());
        bundle.putSerializable("web_protocol", this.f94784a.z());
        bundle.putBoolean(WebviewFragment.D4, this.f94784a.j());
        bundle.putString("title", this.f94784a.u());
        bundle.putSerializable(WebviewFragment.I4, this.f94784a.i());
        bundle.putBoolean(WebviewFragment.G4, this.f94784a.B());
        bundle.putInt(WebviewFragment.H4, this.f94784a.f());
        bundle.putString(WebviewFragment.L4, this.f94784a.s());
        bundle.putString(WebviewFragment.M4, this.f94784a.t());
        bundle.putBoolean(WebviewFragment.N4, this.f94784a.r());
        bundle.putString(WebviewFragment.F4, this.f94784a.y());
        bundle.putBoolean(WebviewFragment.P4, this.f94784a.v());
        bundle.putString(WebviewFragment.Q4, this.f94784a.x() ? "1" : "0");
        bundle.putSerializable(WebviewFragment.R4, this.f94784a.d());
        bundle.putBoolean(WebviewFragment.S4, this.f94784a.A());
        bundle.putBoolean(WebviewFragment.T4, this.f94784a.a());
        return bundle;
    }

    @dl.d
    public final v c() {
        return this.f94784a;
    }

    @dl.d
    public final u d(boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 47109, new Class[]{Boolean.TYPE}, u.class);
        if (patchProxyResultProxy.isSupported) {
            return (u) patchProxyResultProxy.result;
        }
        this.f94784a.C(z10);
        return this;
    }

    @dl.d
    public final u e(boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 47087, new Class[]{Boolean.TYPE}, u.class);
        if (patchProxyResultProxy.isSupported) {
            return (u) patchProxyResultProxy.result;
        }
        this.f94784a.D(z10);
        return this;
    }

    @dl.d
    public final u f(int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 47083, new Class[]{Integer.TYPE}, u.class);
        if (patchProxyResultProxy.isSupported) {
            return (u) patchProxyResultProxy.result;
        }
        this.f94784a.E(i10);
        return this;
    }

    @dl.d
    public final u g(@dl.e BgConfigObj bgConfigObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bgConfigObj}, this, changeQuickRedirect, false, 47107, new Class[]{BgConfigObj.class}, u.class);
        if (patchProxyResultProxy.isSupported) {
            return (u) patchProxyResultProxy.result;
        }
        this.f94784a.F(bgConfigObj);
        return this;
    }

    @dl.d
    public final u h(@dl.e String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 47090, new Class[]{String.class}, u.class);
        if (patchProxyResultProxy.isSupported) {
            return (u) patchProxyResultProxy.result;
        }
        this.f94784a.G(str);
        return this;
    }

    @dl.d
    public final u i(int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 47101, new Class[]{Integer.TYPE}, u.class);
        if (patchProxyResultProxy.isSupported) {
            return (u) patchProxyResultProxy.result;
        }
        this.f94784a.I(i10);
        return this;
    }

    @dl.d
    public final u j(boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 47094, new Class[]{Boolean.TYPE}, u.class);
        if (patchProxyResultProxy.isSupported) {
            return (u) patchProxyResultProxy.result;
        }
        this.f94784a.J(z10);
        return this;
    }

    @dl.d
    public final u k(@dl.e String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 47092, new Class[]{String.class}, u.class);
        if (patchProxyResultProxy.isSupported) {
            return (u) patchProxyResultProxy.result;
        }
        this.f94784a.K(str);
        return this;
    }

    @dl.d
    public final u l(@dl.e IpDirectObj ipDirectObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{ipDirectObj}, this, changeQuickRedirect, false, 47099, new Class[]{IpDirectObj.class}, u.class);
        if (patchProxyResultProxy.isSupported) {
            return (u) patchProxyResultProxy.result;
        }
        this.f94784a.L(ipDirectObj);
        return this;
    }

    @dl.d
    public final u m(boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 47100, new Class[]{Boolean.TYPE}, u.class);
        if (patchProxyResultProxy.isSupported) {
            return (u) patchProxyResultProxy.result;
        }
        this.f94784a.H(z10);
        return this;
    }

    @dl.d
    public final u n(boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 47096, new Class[]{Boolean.TYPE}, u.class);
        if (patchProxyResultProxy.isSupported) {
            return (u) patchProxyResultProxy.result;
        }
        this.f94784a.M(z10);
        return this;
    }

    @dl.d
    public final u o(@dl.e String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 47091, new Class[]{String.class}, u.class);
        if (patchProxyResultProxy.isSupported) {
            return (u) patchProxyResultProxy.result;
        }
        this.f94784a.N(str);
        return this;
    }

    @dl.d
    public final u p(@dl.e String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 47084, new Class[]{String.class}, u.class);
        if (patchProxyResultProxy.isSupported) {
            return (u) patchProxyResultProxy.result;
        }
        this.f94784a.O(str);
        return this;
    }

    @dl.d
    public final u q(@dl.e String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 47088, new Class[]{String.class}, u.class);
        if (patchProxyResultProxy.isSupported) {
            return (u) patchProxyResultProxy.result;
        }
        this.f94784a.P(str);
        return this;
    }

    @dl.d
    public final u r(boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 47086, new Class[]{Boolean.TYPE}, u.class);
        if (patchProxyResultProxy.isSupported) {
            return (u) patchProxyResultProxy.result;
        }
        this.f94784a.Q(z10);
        return this;
    }

    @dl.d
    public final u s(@dl.e MallOrderNotifyObj mallOrderNotifyObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{mallOrderNotifyObj}, this, changeQuickRedirect, false, 47089, new Class[]{MallOrderNotifyObj.class}, u.class);
        if (patchProxyResultProxy.isSupported) {
            return (u) patchProxyResultProxy.result;
        }
        this.f94784a.R(mallOrderNotifyObj);
        return this;
    }

    @dl.d
    public final u t(@dl.e ProxyAddressObj proxyAddressObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{proxyAddressObj}, this, changeQuickRedirect, false, 47093, new Class[]{ProxyAddressObj.class}, u.class);
        if (patchProxyResultProxy.isSupported) {
            return (u) patchProxyResultProxy.result;
        }
        this.f94784a.S(proxyAddressObj);
        return this;
    }

    @dl.d
    public final u u(boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 47085, new Class[]{Boolean.TYPE}, u.class);
        if (patchProxyResultProxy.isSupported) {
            return (u) patchProxyResultProxy.result;
        }
        this.f94784a.T(z10);
        return this;
    }

    @dl.d
    public final u v(boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 47104, new Class[]{Boolean.TYPE}, u.class);
        if (patchProxyResultProxy.isSupported) {
            return (u) patchProxyResultProxy.result;
        }
        this.f94784a.U(z10);
        return this;
    }

    @dl.d
    public final u w(@dl.e String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 47102, new Class[]{String.class}, u.class);
        if (patchProxyResultProxy.isSupported) {
            return (u) patchProxyResultProxy.result;
        }
        this.f94784a.V(str);
        return this;
    }

    @dl.d
    public final u x(@dl.e String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 47103, new Class[]{String.class}, u.class);
        if (patchProxyResultProxy.isSupported) {
            return (u) patchProxyResultProxy.result;
        }
        this.f94784a.W(str);
        return this;
    }

    @dl.d
    public final u y(@dl.e String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 47098, new Class[]{String.class}, u.class);
        if (patchProxyResultProxy.isSupported) {
            return (u) patchProxyResultProxy.result;
        }
        this.f94784a.X(str);
        return this;
    }

    @dl.d
    public final u z(boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 47105, new Class[]{Boolean.TYPE}, u.class);
        if (patchProxyResultProxy.isSupported) {
            return (u) patchProxyResultProxy.result;
        }
        this.f94784a.Y(z10);
        return this;
    }
}
