package com.lzy.okgo.request.base;

import android.text.TextUtils;
import bb.c;
import com.lzy.okgo.model.HttpParams;
import com.lzy.okgo.request.base.BodyRequest;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.File;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;
import la.d;
import okhttp3.a0;
import okhttp3.b0;
import okhttp3.v;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public abstract class BodyRequest<T, R extends BodyRequest> extends Request<T, R> implements a<R> {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -6459175248476927501L;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    protected transient v f64810r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    protected String f64811s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    protected byte[] f64812t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    protected transient File f64813u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    protected boolean f64814v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    protected boolean f64815w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    protected b0 f64816x;

    public BodyRequest(String str) {
        super(str);
        this.f64814v = false;
        this.f64815w = false;
    }

    private void I0(ObjectOutputStream objectOutputStream) throws IOException {
        if (PatchProxy.proxy(new Object[]{objectOutputStream}, this, changeQuickRedirect, false, c.b.L9, new Class[]{ObjectOutputStream.class}, Void.TYPE).isSupported) {
            return;
        }
        objectOutputStream.defaultWriteObject();
        v vVar = this.f64810r;
        objectOutputStream.writeObject(vVar == null ? "" : vVar.getMediaType());
    }

    private void x0(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        if (PatchProxy.proxy(new Object[]{objectInputStream}, this, changeQuickRedirect, false, c.b.M9, new Class[]{ObjectInputStream.class}, Void.TYPE).isSupported) {
            return;
        }
        objectInputStream.defaultReadObject();
        String str = (String) objectInputStream.readObject();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f64810r = v.j(str);
    }

    public R A0(File file) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{file}, this, changeQuickRedirect, false, c.b.I9, new Class[]{File.class}, BodyRequest.class);
        if (patchProxyResultProxy.isSupported) {
            return (R) patchProxyResultProxy.result;
        }
        this.f64813u = file;
        this.f64810r = la.b.i(file.getName());
        return this;
    }

    public R B0(File file, v vVar) {
        this.f64813u = file;
        this.f64810r = vVar;
        return this;
    }

    public R C0(String str) {
        this.f64811s = str;
        this.f64810r = HttpParams.f64762e;
        return this;
    }

    public R D0(JSONArray jSONArray) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{jSONArray}, this, changeQuickRedirect, false, c.b.H9, new Class[]{JSONArray.class}, BodyRequest.class);
        if (patchProxyResultProxy.isSupported) {
            return (R) patchProxyResultProxy.result;
        }
        this.f64811s = jSONArray.toString();
        this.f64810r = HttpParams.f64762e;
        return this;
    }

    public R E0(JSONObject jSONObject) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{jSONObject}, this, changeQuickRedirect, false, c.b.G9, new Class[]{JSONObject.class}, BodyRequest.class);
        if (patchProxyResultProxy.isSupported) {
            return (R) patchProxyResultProxy.result;
        }
        this.f64811s = jSONObject.toString();
        this.f64810r = HttpParams.f64762e;
        return this;
    }

    @Override // com.lzy.okgo.request.base.Request
    public b0 F() {
        v vVar;
        v vVar2;
        v vVar3;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.b.J9, new Class[0], b0.class);
        if (patchProxyResultProxy.isSupported) {
            return (b0) patchProxyResultProxy.result;
        }
        if (this.f64815w) {
            this.f64817b = la.b.c(this.f64818c, this.f64825j.f64765b);
        }
        b0 b0Var = this.f64816x;
        if (b0Var != null) {
            return b0Var;
        }
        String str = this.f64811s;
        if (str != null && (vVar3 = this.f64810r) != null) {
            return b0.create(vVar3, str);
        }
        byte[] bArr = this.f64812t;
        if (bArr != null && (vVar2 = this.f64810r) != null) {
            return b0.create(vVar2, bArr);
        }
        File file = this.f64813u;
        return (file == null || (vVar = this.f64810r) == null) ? la.b.e(this.f64825j, this.f64814v) : b0.create(vVar, file);
    }

    public R F0(b0 b0Var) {
        this.f64816x = b0Var;
        return this;
    }

    public R G0(String str) {
        this.f64811s = str;
        this.f64810r = HttpParams.f64761d;
        return this;
    }

    public R H0(String str, v vVar) {
        this.f64811s = str;
        this.f64810r = vVar;
        return this;
    }

    @Override // com.lzy.okgo.request.base.a
    public /* bridge */ /* synthetic */ Object a(b0 b0Var) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{b0Var}, this, changeQuickRedirect, false, c.b.f30538ba, new Class[]{b0.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : F0(b0Var);
    }

    @Override // com.lzy.okgo.request.base.a
    public /* bridge */ /* synthetic */ Object b(String str, File file) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, file}, this, changeQuickRedirect, false, c.b.f30515aa, new Class[]{String.class, File.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : u0(str, file);
    }

    @Override // com.lzy.okgo.request.base.a
    public /* bridge */ /* synthetic */ Object c(boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, c.b.f30561ca, new Class[]{Boolean.TYPE}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : t0(z10);
    }

    @Override // com.lzy.okgo.request.base.a
    public /* bridge */ /* synthetic */ Object d(String str, File file, String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, file, str2}, this, changeQuickRedirect, false, c.b.X9, new Class[]{String.class, File.class, String.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : v0(str, file, str2);
    }

    @Override // com.lzy.okgo.request.base.a
    public /* bridge */ /* synthetic */ Object e(JSONArray jSONArray) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{jSONArray}, this, changeQuickRedirect, false, c.b.R9, new Class[]{JSONArray.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : D0(jSONArray);
    }

    @Override // com.lzy.okgo.request.base.a
    public /* bridge */ /* synthetic */ Object f(JSONObject jSONObject) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{jSONObject}, this, changeQuickRedirect, false, c.b.S9, new Class[]{JSONObject.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : E0(jSONObject);
    }

    @Override // com.lzy.okgo.request.base.a
    public /* bridge */ /* synthetic */ Object g(String str, List list) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, list}, this, changeQuickRedirect, false, c.b.Z9, new Class[]{String.class, List.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : p0(str, list);
    }

    @Override // com.lzy.okgo.request.base.a
    public /* bridge */ /* synthetic */ Object h(String str, List list) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, list}, this, changeQuickRedirect, false, c.b.Y9, new Class[]{String.class, List.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : q0(str, list);
    }

    @Override // com.lzy.okgo.request.base.a
    public /* bridge */ /* synthetic */ Object i(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, c.b.V9, new Class[]{String.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : G0(str);
    }

    @Override // com.lzy.okgo.request.base.a
    public /* bridge */ /* synthetic */ Object j(byte[] bArr) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bArr}, this, changeQuickRedirect, false, c.b.Q9, new Class[]{byte[].class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : y0(bArr);
    }

    @Override // com.lzy.okgo.request.base.a
    public /* bridge */ /* synthetic */ Object k(byte[] bArr, v vVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bArr, vVar}, this, changeQuickRedirect, false, c.b.P9, new Class[]{byte[].class, v.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : z0(bArr, vVar);
    }

    @Override // com.lzy.okgo.request.base.a
    public /* bridge */ /* synthetic */ Object l(String str, File file, String str2, v vVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, file, str2, vVar}, this, changeQuickRedirect, false, c.b.W9, new Class[]{String.class, File.class, String.class, v.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : w0(str, file, str2, vVar);
    }

    @Override // com.lzy.okgo.request.base.a
    public /* bridge */ /* synthetic */ Object m(File file) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{file}, this, changeQuickRedirect, false, c.b.O9, new Class[]{File.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : A0(file);
    }

    @Override // com.lzy.okgo.request.base.a
    public /* bridge */ /* synthetic */ Object n(boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, c.b.f30585da, new Class[]{Boolean.TYPE}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : s0(z10);
    }

    @Override // com.lzy.okgo.request.base.a
    public /* bridge */ /* synthetic */ Object o(String str, v vVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, vVar}, this, changeQuickRedirect, false, c.b.U9, new Class[]{String.class, v.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : H0(str, vVar);
    }

    @Override // com.lzy.okgo.request.base.a
    public /* bridge */ /* synthetic */ Object p(File file, v vVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{file, vVar}, this, changeQuickRedirect, false, c.b.N9, new Class[]{File.class, v.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : B0(file, vVar);
    }

    public R p0(String str, List<File> list) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, list}, this, changeQuickRedirect, false, c.b.C9, new Class[]{String.class, List.class}, BodyRequest.class);
        if (patchProxyResultProxy.isSupported) {
            return (R) patchProxyResultProxy.result;
        }
        this.f64825j.p(str, list);
        return this;
    }

    @Override // com.lzy.okgo.request.base.a
    public /* bridge */ /* synthetic */ Object q(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, c.b.T9, new Class[]{String.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : C0(str);
    }

    public R q0(String str, List<HttpParams.FileWrapper> list) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, list}, this, changeQuickRedirect, false, c.b.D9, new Class[]{String.class, List.class}, BodyRequest.class);
        if (patchProxyResultProxy.isSupported) {
            return (R) patchProxyResultProxy.result;
        }
        this.f64825j.q(str, list);
        return this;
    }

    public a0.a r0(b0 b0Var) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{b0Var}, this, changeQuickRedirect, false, c.b.K9, new Class[]{b0.class}, a0.a.class);
        if (patchProxyResultProxy.isSupported) {
            return (a0.a) patchProxyResultProxy.result;
        }
        try {
            X("Content-Length", String.valueOf(b0Var.contentLength()));
        } catch (IOException e10) {
            d.i(e10);
        }
        return la.b.a(new a0.a(), this.f64826k);
    }

    public R s0(boolean z10) {
        this.f64814v = z10;
        return this;
    }

    public R t0(boolean z10) {
        this.f64815w = z10;
        return this;
    }

    public R u0(String str, File file) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, file}, this, changeQuickRedirect, false, c.b.B9, new Class[]{String.class, File.class}, BodyRequest.class);
        if (patchProxyResultProxy.isSupported) {
            return (R) patchProxyResultProxy.result;
        }
        this.f64825j.i(str, file);
        return this;
    }

    public R v0(String str, File file, String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, file, str2}, this, changeQuickRedirect, false, c.b.E9, new Class[]{String.class, File.class, String.class}, BodyRequest.class);
        if (patchProxyResultProxy.isSupported) {
            return (R) patchProxyResultProxy.result;
        }
        this.f64825j.j(str, file, str2);
        return this;
    }

    public R w0(String str, File file, String str2, v vVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, file, str2, vVar}, this, changeQuickRedirect, false, c.b.F9, new Class[]{String.class, File.class, String.class, v.class}, BodyRequest.class);
        if (patchProxyResultProxy.isSupported) {
            return (R) patchProxyResultProxy.result;
        }
        this.f64825j.k(str, file, str2, vVar);
        return this;
    }

    public R y0(byte[] bArr) {
        this.f64812t = bArr;
        this.f64810r = HttpParams.f64763f;
        return this;
    }

    public R z0(byte[] bArr, v vVar) {
        this.f64812t = bArr;
        this.f64810r = vVar;
        return this;
    }
}
