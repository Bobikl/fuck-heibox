package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import com.meituan.robust.Constants;
import com.tencent.qcloud.core.util.IOUtils;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.f0;
import kotlin.text.u;
import kotlin.text.y;
import sh.n;
import xh.m;

/* JADX INFO: compiled from: ClassMapperLite.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final b f127157a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private static final String f127158b = CollectionsKt___CollectionsKt.h3(CollectionsKt__CollectionsKt.L('k', 'o', 't', 'l', 'i', 'n'), "", null, null, 0, null, null, 62, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private static final Map<String, String> f127159c;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List listL = CollectionsKt__CollectionsKt.L("Boolean", "Z", "Char", "C", "Byte", "B", "Short", androidx.exifinterface.media.a.R4, "Int", "I", "Float", "F", "Long", "J", "Double", "D");
        int iC = n.c(0, listL.size() - 1, 2);
        if (iC >= 0) {
            int i10 = 0;
            while (true) {
                StringBuilder sb2 = new StringBuilder();
                String str = f127158b;
                sb2.append(str);
                sb2.append(IOUtils.DIR_SEPARATOR_UNIX);
                sb2.append((String) listL.get(i10));
                int i11 = i10 + 1;
                linkedHashMap.put(sb2.toString(), listL.get(i11));
                linkedHashMap.put(str + IOUtils.DIR_SEPARATOR_UNIX + ((String) listL.get(i10)) + "Array", '[' + ((String) listL.get(i11)));
                if (i10 == iC) {
                    break;
                } else {
                    i10 += 2;
                }
            }
        }
        linkedHashMap.put(f127158b + "/Unit", androidx.exifinterface.media.a.X4);
        a(linkedHashMap, "Any", "java/lang/Object");
        a(linkedHashMap, "Nothing", "java/lang/Void");
        a(linkedHashMap, "Annotation", "java/lang/annotation/Annotation");
        for (String str2 : CollectionsKt__CollectionsKt.L("String", "CharSequence", "Throwable", "Cloneable", "Number", "Comparable", "Enum")) {
            a(linkedHashMap, str2, "java/lang/" + str2);
        }
        for (String str3 : CollectionsKt__CollectionsKt.L("Iterator", "Collection", "List", "Set", "Map", "ListIterator")) {
            a(linkedHashMap, "collections/" + str3, "java/util/" + str3);
            a(linkedHashMap, "collections/Mutable" + str3, "java/util/" + str3);
        }
        a(linkedHashMap, "collections/Iterable", "java/lang/Iterable");
        a(linkedHashMap, "collections/MutableIterable", "java/lang/Iterable");
        a(linkedHashMap, "collections/Map.Entry", "java/util/Map$Entry");
        a(linkedHashMap, "collections/MutableMap.MutableEntry", "java/util/Map$Entry");
        for (int i12 = 0; i12 < 23; i12++) {
            StringBuilder sb3 = new StringBuilder();
            String str4 = f127158b;
            sb3.append(str4);
            sb3.append("/jvm/functions/Function");
            sb3.append(i12);
            a(linkedHashMap, "Function" + i12, sb3.toString());
            a(linkedHashMap, "reflect/KFunction" + i12, str4 + "/reflect/KFunction");
        }
        for (String str5 : CollectionsKt__CollectionsKt.L("Char", "Byte", "Short", "Int", "Float", "Long", "Double", "String", "Enum")) {
            a(linkedHashMap, str5 + ".Companion", f127158b + "/jvm/internal/" + str5 + "CompanionObject");
        }
        f127159c = linkedHashMap;
    }

    private b() {
    }

    private static final void a(Map<String, String> map, String str, String str2) {
        map.put(f127158b + IOUtils.DIR_SEPARATOR_UNIX + str, Constants.OBJECT_TYPE + str2 + ';');
    }

    @dl.d
    @m
    public static final String b(@dl.d String classId) {
        f0.p(classId, "classId");
        String str = f127159c.get(classId);
        if (str != null) {
            return str;
        }
        return Constants.OBJECT_TYPE + u.k2(classId, lg.a.f131414g, y.f128594c, false, 4, null) + ';';
    }
}
