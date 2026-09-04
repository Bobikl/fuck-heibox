package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.h0;
import kotlin.collections.r0;
import kotlin.collections.t;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.text.y;

/* JADX INFO: compiled from: JvmNameResolverBase.kt */
/* JADX INFO: loaded from: classes5.dex */
public class g implements kotlin.reflect.jvm.internal.impl.metadata.deserialization.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    public static final a f127173d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private static final String f127174e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private static final List<String> f127175f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private static final Map<String, Integer> f127176g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final String[] f127177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final Set<Integer> f127178b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final List<JvmProtoBuf.StringTableTypes.Record> f127179c;

    /* JADX INFO: compiled from: JvmNameResolverBase.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: JvmNameResolverBase.kt */
    public final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f127180a;

        static {
            int[] iArr = new int[JvmProtoBuf.StringTableTypes.Record.Operation.values().length];
            try {
                iArr[JvmProtoBuf.StringTableTypes.Record.Operation.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[JvmProtoBuf.StringTableTypes.Record.Operation.INTERNAL_TO_CLASS_ID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[JvmProtoBuf.StringTableTypes.Record.Operation.DESC_TO_CLASS_ID.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f127180a = iArr;
        }
    }

    static {
        String strH3 = CollectionsKt___CollectionsKt.h3(CollectionsKt__CollectionsKt.L('k', 'o', 't', 'l', 'i', 'n'), "", null, null, 0, null, null, 62, null);
        f127174e = strH3;
        List<String> listL = CollectionsKt__CollectionsKt.L(strH3 + "/Any", strH3 + "/Nothing", strH3 + "/Unit", strH3 + "/Throwable", strH3 + "/Number", strH3 + "/Byte", strH3 + "/Double", strH3 + "/Float", strH3 + "/Int", strH3 + "/Long", strH3 + "/Short", strH3 + "/Boolean", strH3 + "/Char", strH3 + "/CharSequence", strH3 + "/String", strH3 + "/Comparable", strH3 + "/Enum", strH3 + "/Array", strH3 + "/ByteArray", strH3 + "/DoubleArray", strH3 + "/FloatArray", strH3 + "/IntArray", strH3 + "/LongArray", strH3 + "/ShortArray", strH3 + "/BooleanArray", strH3 + "/CharArray", strH3 + "/Cloneable", strH3 + "/Annotation", strH3 + "/collections/Iterable", strH3 + "/collections/MutableIterable", strH3 + "/collections/Collection", strH3 + "/collections/MutableCollection", strH3 + "/collections/List", strH3 + "/collections/MutableList", strH3 + "/collections/Set", strH3 + "/collections/MutableSet", strH3 + "/collections/Map", strH3 + "/collections/MutableMap", strH3 + "/collections/Map.Entry", strH3 + "/collections/MutableMap.MutableEntry", strH3 + "/collections/Iterator", strH3 + "/collections/MutableIterator", strH3 + "/collections/ListIterator", strH3 + "/collections/MutableListIterator");
        f127175f = listL;
        Iterable<h0> iterableC6 = CollectionsKt___CollectionsKt.c6(listL);
        LinkedHashMap linkedHashMap = new LinkedHashMap(fi.u.u(r0.j(t.Y(iterableC6, 10)), 16));
        for (h0 h0Var : iterableC6) {
            linkedHashMap.put((String) h0Var.f(), Integer.valueOf(h0Var.e()));
        }
        f127176g = linkedHashMap;
    }

    public g(@dl.d String[] strings, @dl.d Set<Integer> localNameIndices, @dl.d List<JvmProtoBuf.StringTableTypes.Record> records) {
        f0.p(strings, "strings");
        f0.p(localNameIndices, "localNameIndices");
        f0.p(records, "records");
        this.f127177a = strings;
        this.f127178b = localNameIndices;
        this.f127179c = records;
    }

    @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.c
    @dl.d
    public String a(int i10) {
        return getString(i10);
    }

    @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.c
    public boolean b(int i10) {
        return this.f127178b.contains(Integer.valueOf(i10));
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003d  */
    @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.c
    @dl.d
    public String getString(int i10) {
        String string;
        JvmProtoBuf.StringTableTypes.Record record = this.f127179c.get(i10);
        if (record.R()) {
            string = record.K();
        } else if (record.P()) {
            List<String> list = f127175f;
            int size = list.size();
            int iF = record.F();
            if (iF >= 0 && iF < size) {
                string = list.get(record.F());
            } else {
                string = this.f127177a[i10];
            }
        } else {
            string = this.f127177a[i10];
        }
        if (record.M() >= 2) {
            List<Integer> substringIndexList = record.N();
            f0.o(substringIndexList, "substringIndexList");
            Integer begin = substringIndexList.get(0);
            Integer end = substringIndexList.get(1);
            f0.o(begin, "begin");
            if (begin.intValue() >= 0) {
                int iIntValue = begin.intValue();
                f0.o(end, "end");
                if (iIntValue <= end.intValue() && end.intValue() <= string.length()) {
                    f0.o(string, "string");
                    string = string.substring(begin.intValue(), end.intValue());
                    f0.o(string, "this as java.lang.String…ing(startIndex, endIndex)");
                }
            }
        }
        String string2 = string;
        if (record.H() >= 2) {
            List<Integer> replaceCharList = record.J();
            f0.o(replaceCharList, "replaceCharList");
            Integer num = replaceCharList.get(0);
            Integer num2 = replaceCharList.get(1);
            f0.o(string2, "string");
            string2 = kotlin.text.u.k2(string2, (char) num.intValue(), (char) num2.intValue(), false, 4, null);
        }
        String string3 = string2;
        JvmProtoBuf.StringTableTypes.Record.Operation operationE = record.E();
        if (operationE == null) {
            operationE = JvmProtoBuf.StringTableTypes.Record.Operation.NONE;
        }
        int i11 = b.f127180a[operationE.ordinal()];
        if (i11 == 2) {
            f0.o(string3, "string");
            string3 = kotlin.text.u.k2(string3, y.f128594c, lg.a.f131414g, false, 4, null);
        } else if (i11 == 3) {
            if (string3.length() >= 2) {
                f0.o(string3, "string");
                string3 = string3.substring(1, string3.length() - 1);
                f0.o(string3, "this as java.lang.String…ing(startIndex, endIndex)");
            }
            String string4 = string3;
            f0.o(string4, "string");
            string3 = kotlin.text.u.k2(string4, y.f128594c, lg.a.f131414g, false, 4, null);
        }
        f0.o(string3, "string");
        return string3;
    }
}
