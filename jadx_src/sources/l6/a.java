package l6;

import com.alipay.zoloz.jsoncodec.codec.e;
import com.alipay.zoloz.jsoncodec.codec.f;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: JSONCodec.java */
/* JADX INFO: loaded from: classes6.dex */
public abstract class a {
    public static final <T> List<T> a(String str, Type type) throws Exception {
        return (List) e.a(str, com.alipay.zoloz.jsoncodec.util.a.c(List.class, type));
    }

    public static final <K, V> Map<K, V> b(String str, Type type, Type type2) throws Exception {
        return (Map) e.a(str, com.alipay.zoloz.jsoncodec.util.a.c(Map.class, type, type2));
    }

    public static final Object c(String str, Type type) throws Exception {
        return e.a(str, type);
    }

    public static String d(Object obj) throws Exception {
        return f.e(obj);
    }
}
