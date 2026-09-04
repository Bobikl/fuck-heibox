package hg;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.n0;
import com.sankuai.waimai.router.core.e;
import com.sankuai.waimai.router.exception.DefaultServiceException;
import java.util.List;
import mg.c;
import mg.d;
import mg.f;
import mg.g;
import mg.h;
import mg.i;
import mg.j;
import mg.k;

/* JADX INFO: compiled from: Router.java */
/* JADX INFO: loaded from: classes8.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f119169a = "hblink";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f119170b = "universal";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f119171c = "hblink://universal";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static e f119172d;

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> T a(String str, Object... objArr) {
        switch (objArr.length) {
            case 0:
                return (T) ((mg.a) j(mg.a.class, str)).call();
            case 1:
                return (T) ((mg.b) j(mg.b.class, str)).a(objArr[0]);
            case 2:
                return (T) ((c) j(c.class, str)).i(objArr[0], objArr[1]);
            case 3:
                return (T) ((d) j(d.class, str)).g(objArr[0], objArr[1], objArr[2]);
            case 4:
                return (T) ((mg.e) j(mg.e.class, str)).h(objArr[0], objArr[1], objArr[2], objArr[3]);
            case 5:
                return (T) ((f) j(f.class, str)).b(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4]);
            case 6:
                return (T) ((g) j(g.class, str)).f(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4], objArr[5]);
            case 7:
                return (T) ((h) j(h.class, str)).e(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4], objArr[5], objArr[6]);
            case 8:
                return (T) ((i) j(i.class, str)).c(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4], objArr[5], objArr[6], objArr[7]);
            case 9:
                return (T) ((j) j(j.class, str)).d(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4], objArr[5], objArr[6], objArr[7], objArr[8]);
            default:
                return (T) ((k) j(k.class, str)).call(objArr);
        }
    }

    public static <I, T extends I> List<Class<T>> b(Class<I> cls) {
        return com.sankuai.waimai.router.service.g.k(cls).h();
    }

    public static <I, T extends I> List<T> c(Class<I> cls) {
        return com.sankuai.waimai.router.service.g.k(cls).e();
    }

    public static <I, T extends I> List<T> d(Class<I> cls, Context context) {
        return com.sankuai.waimai.router.service.g.k(cls).f(context);
    }

    public static <I, T extends I> List<T> e(Class<I> cls, com.sankuai.waimai.router.service.d dVar) {
        return com.sankuai.waimai.router.service.g.k(cls).g(dVar);
    }

    public static e f() {
        e eVar = f119172d;
        if (eVar != null) {
            return eVar;
        }
        throw new RuntimeException("请先调用init初始化UriRouter");
    }

    public static <I, T extends I> I g(Class<I> cls) {
        I i10 = (I) com.sankuai.waimai.router.service.g.k(cls).b(com.sankuai.waimai.router.service.f.f96549g);
        if (i10 != null) {
            return i10;
        }
        List listC = c(cls);
        if (listC.size() == 1) {
            return (I) listC.get(0);
        }
        if (listC.size() <= 1) {
            return null;
        }
        com.sankuai.waimai.router.core.c.e(DefaultServiceException.a(cls));
        return null;
    }

    public static <I, T extends I> I h(Class<I> cls, Context context) {
        I i10 = (I) com.sankuai.waimai.router.service.g.k(cls).c(com.sankuai.waimai.router.service.f.f96549g, context);
        if (i10 != null) {
            return i10;
        }
        List listD = d(cls, context);
        if (listD.size() == 1) {
            return (I) listD.get(0);
        }
        if (listD.size() <= 1) {
            return null;
        }
        com.sankuai.waimai.router.core.c.e(DefaultServiceException.a(cls));
        return null;
    }

    public static <I, T extends I> I i(Class<I> cls, com.sankuai.waimai.router.service.d dVar) {
        I i10 = (I) com.sankuai.waimai.router.service.g.k(cls).d(com.sankuai.waimai.router.service.f.f96549g, dVar);
        if (i10 != null) {
            return i10;
        }
        List listE = e(cls, dVar);
        if (listE.size() == 1) {
            return (I) listE.get(0);
        }
        if (listE.size() <= 1) {
            return null;
        }
        com.sankuai.waimai.router.core.c.e(DefaultServiceException.a(cls));
        return null;
    }

    public static <I, T extends I> T j(Class<I> cls, String str) {
        return (T) com.sankuai.waimai.router.service.g.k(cls).b(str);
    }

    public static <I, T extends I> T k(Class<I> cls, String str, Context context) {
        return (T) com.sankuai.waimai.router.service.g.k(cls).c(str, context);
    }

    public static <I, T extends I> T l(Class<I> cls, String str, com.sankuai.waimai.router.service.d dVar) {
        return (T) com.sankuai.waimai.router.service.g.k(cls).d(str, dVar);
    }

    public static <I, T extends I> Class<T> m(Class<I> cls, String str) {
        return com.sankuai.waimai.router.service.g.k(cls).i(str);
    }

    public static void n(@n0 e eVar) {
        if (!com.sankuai.waimai.router.core.c.i()) {
            Log.w("WMRouter", "!!当前未设置Logger,建议通过 Debugger.setLogger()方法设置Logger");
            Log.w("WMRouter", "!!并在测试环境通过 Debugger.EnableLog(true)方法开启日志");
            Log.w("WMRouter", "!!通过Debugger.setEnableDebug(true)方法在测试环境及时抛出严重类型异常");
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            com.sankuai.waimai.router.core.c.d("初始化方法init应该在主线程调用", new Object[0]);
        }
        if (f119172d == null) {
            f119172d = eVar;
        } else {
            com.sankuai.waimai.router.core.c.d("请勿重复初始化UriRouter", new Object[0]);
        }
    }

    public static void o() {
        com.sankuai.waimai.router.service.g.j();
        f().r();
    }

    public static <T> com.sankuai.waimai.router.service.g<T> p(Class<T> cls) {
        return com.sankuai.waimai.router.service.g.k(cls);
    }

    public static void q(Context context, String str) {
        f().v(new com.sankuai.waimai.router.core.i(context, f119171c + str));
    }

    public static void r(Context context, String str) {
        s(context, com.sankuai.waimai.router.common.k.f96432h + str);
    }

    public static void s(Context context, String str) {
        f().v(new com.sankuai.waimai.router.core.i(context, str));
    }

    public static void t(Context context, String str, com.sankuai.waimai.router.core.d dVar) {
        f().v(new com.sankuai.waimai.router.core.i(context, str).q(dVar));
    }

    public static void u(com.sankuai.waimai.router.core.i iVar) {
        f().v(iVar);
    }
}
