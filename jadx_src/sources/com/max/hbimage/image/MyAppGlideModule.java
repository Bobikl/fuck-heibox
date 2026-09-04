package com.max.hbimage.image;

import android.content.Context;
import android.os.Build;
import androidx.annotation.p0;
import com.bumptech.glide.Glide;
import com.bumptech.glide.Registry;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.max.hbimage.bean.common.HBLocalThumbModel;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.xiaomi.mipush.sdk.PushMessageHelper;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import okhttp3.a0;
import okhttp3.c0;
import okhttp3.z;

/* JADX INFO: loaded from: classes10.dex */
@s6.c
public class MyAppGlideModule extends y6.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f70416a = "/image_load_error";
    public static ChangeQuickRedirect changeQuickRedirect;

    public class a implements com.bumptech.glide.request.g<Object> {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // com.bumptech.glide.request.g
        public boolean a(@p0 GlideException glideException, Object obj, com.bumptech.glide.request.target.p<Object> pVar, boolean z10) {
            Object[] objArr = {glideException, obj, pVar, new Byte(z10 ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Boolean.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.g.Ad, new Class[]{GlideException.class, Object.class, com.bumptech.glide.request.target.p.class, cls}, cls);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("[Glide] onLoadFailed: ");
            sb2.append(glideException != null ? glideException.getMessage() : "null");
            com.max.heybox.hblog.g.W(sb2.toString());
            if (glideException != null) {
                List<Throwable> listG = glideException.g();
                pb.h hVarF = ob.a.f();
                if (hVarF != null) {
                    String str = "";
                    String str2 = obj instanceof String ? (String) obj : "";
                    if (!listG.isEmpty()) {
                        int iE = 0;
                        for (Throwable th2 : listG) {
                            iE = ob.a.k().e(th2);
                            String message = th2.getMessage();
                            if (iE != 0) {
                                str = message;
                                break;
                            }
                            com.max.heybox.hblog.g.W("[Glide] onLoadFailed: rootCauses " + th2.getClass().getSimpleName() + "   " + th2.getMessage() + "  url: " + obj);
                            str = message;
                        }
                        JsonObject jsonObject = new JsonObject();
                        jsonObject.addProperty("url", str2);
                        jsonObject.addProperty("app_active", Boolean.valueOf(ob.a.b().f()));
                        jsonObject.addProperty(PushMessageHelper.ERROR_TYPE, Integer.valueOf(iE));
                        jsonObject.addProperty("error_reason", str);
                        jsonObject.addProperty("network_type", ob.a.b().u());
                        hVarF.b("3", MyAppGlideModule.f70416a, null, null, new Gson().toJson((JsonElement) jsonObject), true);
                    }
                }
            }
            return false;
        }

        @Override // com.bumptech.glide.request.g
        public boolean b(Object obj, Object obj2, com.bumptech.glide.request.target.p<Object> pVar, DataSource dataSource, boolean z10) {
            return false;
        }
    }

    public class b implements okhttp3.u {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // okhttp3.u
        public c0 intercept(okhttp3.u.a aVar) throws IOException {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{aVar}, this, changeQuickRedirect, false, bb.c.g.Bd, new Class[]{okhttp3.u.a.class}, c0.class);
            if (patchProxyResultProxy.isSupported) {
                return (c0) patchProxyResultProxy.result;
            }
            a0 a0VarRequest = aVar.request();
            if (a0VarRequest.q().getUrl().contains("cdn.maxjia.com")) {
                a0VarRequest = a0VarRequest.n().a("Referer", "http://api.maxjia.com/").b();
            }
            return aVar.proceed(a0VarRequest);
        }
    }

    @Override // y6.a, y6.b
    public void a(Context context, com.bumptech.glide.c cVar) {
        if (PatchProxy.proxy(new Object[]{context, cVar}, this, changeQuickRedirect, false, bb.c.g.f33215yd, new Class[]{Context.class, com.bumptech.glide.c.class}, Void.TYPE).isSupported) {
            return;
        }
        cVar.a(new a());
    }

    @Override // y6.d, y6.f
    public void b(Context context, Glide glide, Registry registry) {
        if (PatchProxy.proxy(new Object[]{context, glide, registry}, this, changeQuickRedirect, false, bb.c.g.f33235zd, new Class[]{Context.class, Glide.class, Registry.class}, Void.TYPE).isSupported) {
            return;
        }
        registry.d(com.bumptech.glide.load.model.h.class, InputStream.class, new n.a(new z.a().d(new b()).f()));
        if (Build.VERSION.SDK_INT >= 29) {
            registry.d(HBLocalThumbModel.class, InputStream.class, new sc.b());
        }
    }

    @Override // y6.a
    public boolean c() {
        return false;
    }
}
