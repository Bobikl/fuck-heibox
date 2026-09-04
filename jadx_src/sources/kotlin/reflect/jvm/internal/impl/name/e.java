package kotlin.reflect.jvm.internal.impl.name;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.f0;
import kotlin.text.u;

/* JADX INFO: compiled from: FqNamesUtil.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class e {

    /* JADX INFO: compiled from: FqNamesUtil.kt */
    public final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f127204a;

        static {
            int[] iArr = new int[State.values().length];
            try {
                iArr[State.BEGINNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[State.AFTER_DOT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[State.MIDDLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f127204a = iArr;
        }
    }

    @dl.e
    public static final <V> V a(@dl.d c cVar, @dl.d Map<c, ? extends V> values) {
        Object next;
        f0.p(cVar, "<this>");
        f0.p(values, "values");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<Map.Entry<c, ? extends V>> it = values.entrySet().iterator();
        while (true) {
            boolean z10 = true;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry<c, ? extends V> next2 = it.next();
            c key = next2.getKey();
            if (!f0.g(cVar, key) && !b(cVar, key)) {
                z10 = false;
            }
            if (z10) {
                linkedHashMap.put(next2.getKey(), next2.getValue());
            }
        }
        if (!(!linkedHashMap.isEmpty())) {
            linkedHashMap = null;
        }
        if (linkedHashMap == null) {
            return null;
        }
        Iterator it2 = linkedHashMap.entrySet().iterator();
        if (it2.hasNext()) {
            next = it2.next();
            if (it2.hasNext()) {
                int length = g((c) ((Map.Entry) next).getKey(), cVar).b().length();
                do {
                    Object next3 = it2.next();
                    int length2 = g((c) ((Map.Entry) next3).getKey(), cVar).b().length();
                    if (length > length2) {
                        next = next3;
                        length = length2;
                    }
                } while (it2.hasNext());
            }
        } else {
            next = null;
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return (V) entry.getValue();
        }
        return null;
    }

    public static final boolean b(@dl.d c cVar, @dl.d c packageName) {
        f0.p(cVar, "<this>");
        f0.p(packageName, "packageName");
        return f0.g(f(cVar), packageName);
    }

    private static final boolean c(String str, String str2) {
        return u.v2(str, str2, false, 2, null) && str.charAt(str2.length()) == '.';
    }

    public static final boolean d(@dl.d c cVar, @dl.d c packageName) {
        f0.p(cVar, "<this>");
        f0.p(packageName, "packageName");
        if (f0.g(cVar, packageName) || packageName.d()) {
            return true;
        }
        String strB = cVar.b();
        f0.o(strB, "this.asString()");
        String strB2 = packageName.b();
        f0.o(strB2, "packageName.asString()");
        return c(strB, strB2);
    }

    public static final boolean e(@dl.e String str) {
        if (str == null) {
            return false;
        }
        State state = State.BEGINNING;
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            int i11 = a.f127204a[state.ordinal()];
            if (i11 == 1 || i11 == 2) {
                if (!Character.isJavaIdentifierPart(cCharAt)) {
                    return false;
                }
                state = State.MIDDLE;
            } else if (i11 != 3) {
                continue;
            } else if (cCharAt == '.') {
                state = State.AFTER_DOT;
            } else if (!Character.isJavaIdentifierPart(cCharAt)) {
                return false;
            }
        }
        return state != State.AFTER_DOT;
    }

    @dl.e
    public static final c f(@dl.d c cVar) {
        f0.p(cVar, "<this>");
        if (cVar.d()) {
            return null;
        }
        return cVar.e();
    }

    @dl.d
    public static final c g(@dl.d c cVar, @dl.d c prefix) {
        f0.p(cVar, "<this>");
        f0.p(prefix, "prefix");
        if (!d(cVar, prefix) || prefix.d()) {
            return cVar;
        }
        if (f0.g(cVar, prefix)) {
            c ROOT = c.f127194c;
            f0.o(ROOT, "ROOT");
            return ROOT;
        }
        String strB = cVar.b();
        f0.o(strB, "asString()");
        String strSubstring = strB.substring(prefix.b().length() + 1);
        f0.o(strSubstring, "this as java.lang.String).substring(startIndex)");
        return new c(strSubstring);
    }
}
