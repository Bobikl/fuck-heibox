package com.max.hbutils.utils;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import android.util.Pair;
import com.max.hbutils.bean.InProgressLargeObjHoldBinder;
import com.max.hbutils.bean.ModeImageObj;
import com.max.hbutils.core.BaseApplication;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.Result;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import org.json.JSONObject;

/* JADX INFO: compiled from: AccelWorld.kt */
/* JADX INFO: loaded from: classes13.dex */
@t0({"SMAP\nAccelWorld.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccelWorld.kt\ncom/max/hbutils/utils/AccelWorldKt\n*L\n1#1,176:1\n160#1,16:177\n*S KotlinDebug\n*F\n+ 1 AccelWorld.kt\ncom/max/hbutils/utils/AccelWorldKt\n*L\n156#1:177,16\n*E\n"})
public final class a {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX WARN: Code duplicated, block: B:13:0x0030  */
    @dl.e
    public static final String a(@dl.e String str) {
        boolean z10 = true;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.k.uo, new Class[]{String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        if (str != null) {
            try {
                if (!kotlin.text.u.v2(str, "http", false, 2, null)) {
                    z10 = false;
                }
            } catch (Throwable th2) {
                Log.e("fastGetModeImageUrl", "error: " + th2.getMessage() + "  return self: " + str);
                return str;
            }
        } else {
            z10 = false;
        }
        if (z10) {
            return str;
        }
        new JSONObject(str);
        ModeImageObj modeImageObj = (ModeImageObj) k.a(str, ModeImageObj.class);
        if (u.b(BaseApplication.a())) {
            if (modeImageObj != null) {
                return modeImageObj.getDark();
            }
        } else if (modeImageObj != null) {
            return modeImageObj.getLight();
        }
        return null;
    }

    public static final /* synthetic */ <T> T b(Intent intent, String name) {
        Bundle extras;
        Object objB;
        Object holdObj;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{intent, name}, null, changeQuickRedirect, true, bb.c.k.Co, new Class[]{Intent.class, String.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return (T) patchProxyResultProxy.result;
        }
        f0.p(name, "name");
        if (intent == null || (extras = intent.getExtras()) == null) {
            return null;
        }
        try {
            Result.a aVar = Result.f124476c;
            IBinder binder = extras.getBinder(name);
            if (binder == null) {
                return null;
            }
            f0.m(binder);
            if (binder.isBinderAlive() && (binder instanceof InProgressLargeObjHoldBinder)) {
                holdObj = ((InProgressLargeObjHoldBinder) binder).getHoldObj();
                f0.y(2, "T?");
            } else {
                holdObj = null;
            }
            objB = Result.b(holdObj);
        } catch (Throwable th2) {
            Result.a aVar2 = Result.f124476c;
            objB = Result.b(kotlin.t0.a(th2));
        }
        Throwable thE = Result.e(objB);
        if (thE != null) {
            com.max.heybox.hblog.g.f74531b.w("[AccelWorld-dbg][fastGetObjFromHoldBinder]\nthis: " + extras + ", key: " + name, thE);
        }
        Result.j(objB);
        if (Result.i(objB)) {
            return null;
        }
        return (T) objB;
    }

    public static final /* synthetic */ <T> T c(Bundle bundle, String key) {
        Object objB;
        IBinder binder;
        Object holdObj;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bundle, key}, null, changeQuickRedirect, true, bb.c.k.Do, new Class[]{Bundle.class, String.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return (T) patchProxyResultProxy.result;
        }
        f0.p(key, "key");
        try {
            Result.a aVar = Result.f124476c;
            if (bundle != null && (binder = bundle.getBinder(key)) != null) {
                f0.m(binder);
                if (binder.isBinderAlive() && (binder instanceof InProgressLargeObjHoldBinder)) {
                    holdObj = ((InProgressLargeObjHoldBinder) binder).getHoldObj();
                    f0.y(2, androidx.exifinterface.media.a.f23244d5);
                } else {
                    holdObj = null;
                }
                objB = Result.b(holdObj);
                Throwable thE = Result.e(objB);
                if (thE != null) {
                    com.max.heybox.hblog.g.f74531b.w("[AccelWorld-dbg][fastGetObjFromHoldBinder]\nthis: " + bundle + ", key: " + key, thE);
                }
                Result.j(objB);
                if (Result.i(objB)) {
                    return null;
                }
                return (T) objB;
            }
            return null;
        } catch (Throwable th2) {
            Result.a aVar2 = Result.f124476c;
            objB = Result.b(kotlin.t0.a(th2));
        }
    }

    public static final int d(@dl.e String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.k.wo, new Class[]{String.class}, Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        if (str == null) {
            return 0;
        }
        Pair<String, String> pairA = r.a(str);
        if (pairA == null) {
            return e(str);
        }
        return u.b(BaseApplication.a()) ? e((String) pairA.second) : e((String) pairA.first);
    }

    public static final int e(@dl.e String str) {
        int color;
        int color2 = 0;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.k.yo, new Class[]{String.class}, Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        if (str == null) {
            return 0;
        }
        try {
            if (f0.g(str, "")) {
                return 0;
            }
            if (str.charAt(0) == '#') {
                color = Color.parseColor(str);
            } else {
                color = Color.parseColor('#' + str);
            }
            return color;
        } catch (Exception e10) {
            try {
                color2 = Color.parseColor(str);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            e10.printStackTrace();
            return color2;
        }
    }

    public static final int f(@dl.e String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.k.xo, new Class[]{String.class}, Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        if (str == null || !kotlin.text.u.v2(str, "#", false, 2, null)) {
            return 0;
        }
        if (str.length() != 7 && str.length() != 9) {
            return 0;
        }
        try {
            int color = Color.parseColor(str);
            return Color.argb(Color.alpha(color), 255 - Color.red(color), 255 - Color.green(color), 255 - Color.blue(color));
        } catch (Throwable unused) {
            return 0;
        }
    }

    public static final int g(@dl.e String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.k.vo, new Class[]{String.class}, Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        if (str == null) {
            return 0;
        }
        Pair<String, String> pairA = r.a(str);
        if (pairA == null) {
            return u.b(BaseApplication.a()) ? f(str) : e(str);
        }
        return u.b(BaseApplication.a()) ? e((String) pairA.second) : e((String) pairA.first);
    }

    @dl.d
    public static final com.sankuai.waimai.router.common.c h(@dl.d com.sankuai.waimai.router.common.c cVar, @dl.d String name, @dl.e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cVar, name, obj}, null, changeQuickRedirect, true, bb.c.k.Ao, new Class[]{com.sankuai.waimai.router.common.c.class, String.class, Object.class}, com.sankuai.waimai.router.common.c.class);
        if (patchProxyResultProxy.isSupported) {
            return (com.sankuai.waimai.router.common.c) patchProxyResultProxy.result;
        }
        f0.p(cVar, "<this>");
        f0.p(name, "name");
        if (obj == null) {
            return cVar;
        }
        Bundle bundle = new Bundle();
        j(bundle, name, obj);
        cVar.i0(bundle);
        return cVar;
    }

    public static final void i(@dl.e Intent intent, @dl.d String name, @dl.e Object obj) {
        if (PatchProxy.proxy(new Object[]{intent, name, obj}, null, changeQuickRedirect, true, bb.c.k.zo, new Class[]{Intent.class, String.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(name, "name");
        if (intent == null || obj == null) {
            return;
        }
        Bundle bundle = new Bundle();
        j(bundle, name, obj);
        intent.putExtras(bundle);
    }

    public static final void j(@dl.e Bundle bundle, @dl.d String key, @dl.e Object obj) {
        if (PatchProxy.proxy(new Object[]{bundle, key, obj}, null, changeQuickRedirect, true, bb.c.k.Bo, new Class[]{Bundle.class, String.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(key, "key");
        if (bundle == null || obj == null) {
            return;
        }
        bundle.putBinder(key, new InProgressLargeObjHoldBinder(obj));
    }
}
