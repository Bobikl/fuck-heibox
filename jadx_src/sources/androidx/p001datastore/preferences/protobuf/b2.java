package androidx.p001datastore.preferences.protobuf;

import com.meituan.robust.Constants;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import kotlin.text.y;
import lg.a;
import z5.g;

/* JADX INFO: compiled from: MessageLiteToString.java */
/* JADX INFO: loaded from: classes6.dex */
public final class b2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f22395a = "List";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f22396b = "OrBuilderList";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f22397c = "Map";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f22398d = "Bytes";

    b2() {
    }

    private static final String a(String str) {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (Character.isUpperCase(cCharAt)) {
                sb2.append(a.f131412e);
            }
            sb2.append(Character.toLowerCase(cCharAt));
        }
        return sb2.toString();
    }

    private static boolean b(Object obj) {
        if (obj instanceof Boolean) {
            return !((Boolean) obj).booleanValue();
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue() == 0;
        }
        if (obj instanceof Float) {
            return ((Float) obj).floatValue() == 0.0f;
        }
        if (obj instanceof Double) {
            return ((Double) obj).doubleValue() == 0.0d;
        }
        if (obj instanceof String) {
            return obj.equals("");
        }
        if (obj instanceof ByteString) {
            return obj.equals(ByteString.f22239f);
        }
        if (obj instanceof z1) {
            return obj == ((z1) obj).r();
        }
        return (obj instanceof Enum) && ((Enum) obj).ordinal() == 0;
    }

    static final void c(StringBuilder sb2, int i10, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                c(sb2, i10, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                c(sb2, i10, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb2.append('\n');
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            sb2.append(' ');
        }
        sb2.append(str);
        if (obj instanceof String) {
            sb2.append(": \"");
            sb2.append(k3.e((String) obj));
            sb2.append(y.f128593b);
            return;
        }
        if (obj instanceof ByteString) {
            sb2.append(": \"");
            sb2.append(k3.a((ByteString) obj));
            sb2.append(y.f128593b);
            return;
        }
        if (obj instanceof GeneratedMessageLite) {
            sb2.append(" {");
            d((GeneratedMessageLite) obj, sb2, i10 + 2);
            sb2.append("\n");
            while (i11 < i10) {
                sb2.append(' ');
                i11++;
            }
            sb2.append(g.f141884d);
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb2.append(": ");
            sb2.append(obj.toString());
            return;
        }
        sb2.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        int i13 = i10 + 2;
        c(sb2, i13, "key", entry.getKey());
        c(sb2, i13, "value", entry.getValue());
        sb2.append("\n");
        while (i11 < i10) {
            sb2.append(' ');
            i11++;
        }
        sb2.append(g.f141884d);
    }

    private static void d(z1 z1Var, StringBuilder sb2, int i10) {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        TreeSet<String> treeSet = new TreeSet();
        for (Method method : z1Var.getClass().getDeclaredMethods()) {
            map2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                map.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    treeSet.add(method.getName());
                }
            }
        }
        for (String str : treeSet) {
            String strReplaceFirst = str.replaceFirst("get", "");
            boolean zBooleanValue = true;
            if (strReplaceFirst.endsWith(f22395a) && !strReplaceFirst.endsWith(f22396b) && !strReplaceFirst.equals(f22395a)) {
                String str2 = strReplaceFirst.substring(0, 1).toLowerCase() + strReplaceFirst.substring(1, strReplaceFirst.length() - 4);
                Method method2 = (Method) map.get(str);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    c(sb2, i10, a(str2), GeneratedMessageLite.W1(method2, z1Var, new Object[0]));
                }
            }
            if (strReplaceFirst.endsWith(f22397c) && !strReplaceFirst.equals(f22397c)) {
                String str3 = strReplaceFirst.substring(0, 1).toLowerCase() + strReplaceFirst.substring(1, strReplaceFirst.length() - 3);
                Method method3 = (Method) map.get(str);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    c(sb2, i10, a(str3), GeneratedMessageLite.W1(method3, z1Var, new Object[0]));
                }
            }
            if (((Method) map2.get("set" + strReplaceFirst)) != null) {
                if (strReplaceFirst.endsWith(f22398d)) {
                    if (map.containsKey("get" + strReplaceFirst.substring(0, strReplaceFirst.length() - 5))) {
                    }
                }
                String str4 = strReplaceFirst.substring(0, 1).toLowerCase() + strReplaceFirst.substring(1);
                Method method4 = (Method) map.get("get" + strReplaceFirst);
                Method method5 = (Method) map.get("has" + strReplaceFirst);
                if (method4 != null) {
                    Object objW1 = GeneratedMessageLite.W1(method4, z1Var, new Object[0]);
                    if (method5 != null) {
                        zBooleanValue = ((Boolean) GeneratedMessageLite.W1(method5, z1Var, new Object[0])).booleanValue();
                    } else if (b(objW1)) {
                        zBooleanValue = false;
                    }
                    if (zBooleanValue) {
                        c(sb2, i10, a(str4), objW1);
                    }
                }
            }
        }
        if (z1Var instanceof GeneratedMessageLite.e) {
            Iterator<Map.Entry<T, Object>> itH = ((GeneratedMessageLite.e) z1Var).extensions.H();
            while (itH.hasNext()) {
                Map.Entry entry = (Map.Entry) itH.next();
                c(sb2, i10, Constants.ARRAY_TYPE + ((GeneratedMessageLite.g) entry.getKey()).getNumber() + "]", entry.getValue());
            }
        }
        w3 w3Var = ((GeneratedMessageLite) z1Var).unknownFields;
        if (w3Var != null) {
            w3Var.q(sb2, i10);
        }
    }

    static String e(z1 z1Var, String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(str);
        d(z1Var, sb2, 0);
        return sb2.toString();
    }
}
