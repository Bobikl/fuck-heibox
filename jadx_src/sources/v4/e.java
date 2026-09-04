package v4;

import com.meituan.robust.Constants;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static List<i> f140818a;

    static {
        ArrayList arrayList = new ArrayList();
        f140818a = arrayList;
        arrayList.add(new l());
        f140818a.add(new d());
        f140818a.add(new c());
        f140818a.add(new h());
        f140818a.add(new k());
        f140818a.add(new b());
        f140818a.add(new a());
        f140818a.add(new g());
    }

    public static final <T> T a(Object obj, Type type) {
        T t10;
        for (i iVar : f140818a) {
            if (iVar.a(x4.a.a(type)) && (t10 = (T) iVar.a(obj, type)) != null) {
                return t10;
            }
        }
        return null;
    }

    public static final Object b(String str, Type type) {
        Object bVar;
        if (str == null || str.length() == 0) {
            return null;
        }
        String strTrim = str.trim();
        if (strTrim.startsWith(Constants.ARRAY_TYPE) && strTrim.endsWith("]")) {
            bVar = new org.json.alipay.a(strTrim);
        } else {
            if (!strTrim.startsWith("{") || !strTrim.endsWith(z5.g.f141884d)) {
                return a(strTrim, type);
            }
            bVar = new org.json.alipay.b(strTrim);
        }
        return a(bVar, type);
    }
}
