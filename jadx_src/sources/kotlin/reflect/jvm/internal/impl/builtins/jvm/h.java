package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.e1;
import kotlin.collections.x;
import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;

/* JADX INFO: compiled from: JvmBuiltInsSignatures.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final h f125548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private static final Set<String> f125549b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private static final Set<String> f125550c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private static final Set<String> f125551d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private static final Set<String> f125552e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private static final Set<String> f125553f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private static final Set<String> f125554g;

    static {
        h hVar = new h();
        f125548a = hVar;
        SignatureBuildingComponents signatureBuildingComponents = SignatureBuildingComponents.f126464a;
        f125549b = e1.D(signatureBuildingComponents.f("Collection", "toArray()[Ljava/lang/Object;", "toArray([Ljava/lang/Object;)[Ljava/lang/Object;"), "java/lang/annotation/Annotation.annotationType()Ljava/lang/Class;");
        f125550c = e1.C(e1.C(e1.C(e1.C(e1.C(e1.C(hVar.b(), signatureBuildingComponents.f("List", "sort(Ljava/util/Comparator;)V")), signatureBuildingComponents.e("String", "codePointAt(I)I", "codePointBefore(I)I", "codePointCount(II)I", "compareToIgnoreCase(Ljava/lang/String;)I", "concat(Ljava/lang/String;)Ljava/lang/String;", "contains(Ljava/lang/CharSequence;)Z", "contentEquals(Ljava/lang/CharSequence;)Z", "contentEquals(Ljava/lang/StringBuffer;)Z", "endsWith(Ljava/lang/String;)Z", "equalsIgnoreCase(Ljava/lang/String;)Z", "getBytes()[B", "getBytes(II[BI)V", "getBytes(Ljava/lang/String;)[B", "getBytes(Ljava/nio/charset/Charset;)[B", "getChars(II[CI)V", "indexOf(I)I", "indexOf(II)I", "indexOf(Ljava/lang/String;)I", "indexOf(Ljava/lang/String;I)I", "intern()Ljava/lang/String;", "isEmpty()Z", "lastIndexOf(I)I", "lastIndexOf(II)I", "lastIndexOf(Ljava/lang/String;)I", "lastIndexOf(Ljava/lang/String;I)I", "matches(Ljava/lang/String;)Z", "offsetByCodePoints(II)I", "regionMatches(ILjava/lang/String;II)Z", "regionMatches(ZILjava/lang/String;II)Z", "replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "replace(CC)Ljava/lang/String;", "replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;", "split(Ljava/lang/String;I)[Ljava/lang/String;", "split(Ljava/lang/String;)[Ljava/lang/String;", "startsWith(Ljava/lang/String;I)Z", "startsWith(Ljava/lang/String;)Z", "substring(II)Ljava/lang/String;", "substring(I)Ljava/lang/String;", "toCharArray()[C", "toLowerCase()Ljava/lang/String;", "toLowerCase(Ljava/util/Locale;)Ljava/lang/String;", "toUpperCase()Ljava/lang/String;", "toUpperCase(Ljava/util/Locale;)Ljava/lang/String;", "trim()Ljava/lang/String;", "isBlank()Z", "lines()Ljava/util/stream/Stream;", "repeat(I)Ljava/lang/String;")), signatureBuildingComponents.e("Double", "isInfinite()Z", "isNaN()Z")), signatureBuildingComponents.e("Float", "isInfinite()Z", "isNaN()Z")), signatureBuildingComponents.e("Enum", "getDeclaringClass()Ljava/lang/Class;", "finalize()V")), signatureBuildingComponents.e("CharSequence", "isEmpty()Z"));
        f125551d = e1.C(e1.C(e1.C(e1.C(e1.C(e1.C(signatureBuildingComponents.e("CharSequence", "codePoints()Ljava/util/stream/IntStream;", "chars()Ljava/util/stream/IntStream;"), signatureBuildingComponents.f("Iterator", "forEachRemaining(Ljava/util/function/Consumer;)V")), signatureBuildingComponents.e("Iterable", "forEach(Ljava/util/function/Consumer;)V", "spliterator()Ljava/util/Spliterator;")), signatureBuildingComponents.e("Throwable", "setStackTrace([Ljava/lang/StackTraceElement;)V", "fillInStackTrace()Ljava/lang/Throwable;", "getLocalizedMessage()Ljava/lang/String;", "printStackTrace()V", "printStackTrace(Ljava/io/PrintStream;)V", "printStackTrace(Ljava/io/PrintWriter;)V", "getStackTrace()[Ljava/lang/StackTraceElement;", "initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "getSuppressed()[Ljava/lang/Throwable;", "addSuppressed(Ljava/lang/Throwable;)V")), signatureBuildingComponents.f("Collection", "spliterator()Ljava/util/Spliterator;", "parallelStream()Ljava/util/stream/Stream;", "stream()Ljava/util/stream/Stream;", "removeIf(Ljava/util/function/Predicate;)Z")), signatureBuildingComponents.f("List", "replaceAll(Ljava/util/function/UnaryOperator;)V")), signatureBuildingComponents.f("Map", "getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "forEach(Ljava/util/function/BiConsumer;)V", "replaceAll(Ljava/util/function/BiFunction;)V", "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z", "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;"));
        f125552e = e1.C(e1.C(signatureBuildingComponents.f("Collection", "removeIf(Ljava/util/function/Predicate;)Z"), signatureBuildingComponents.f("List", "replaceAll(Ljava/util/function/UnaryOperator;)V", "sort(Ljava/util/Comparator;)V")), signatureBuildingComponents.f("Map", "computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "remove(Ljava/lang/Object;Ljava/lang/Object;)Z", "replaceAll(Ljava/util/function/BiFunction;)V", "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z"));
        Set<String> setA = hVar.a();
        String[] strArrB = signatureBuildingComponents.b("D");
        Set setC = e1.C(setA, signatureBuildingComponents.e("Float", (String[]) Arrays.copyOf(strArrB, strArrB.length)));
        String[] strArrB2 = signatureBuildingComponents.b("[C", "[CII", "[III", "[BIILjava/lang/String;", "[BIILjava/nio/charset/Charset;", "[BLjava/lang/String;", "[BLjava/nio/charset/Charset;", "[BII", "[B", "Ljava/lang/StringBuffer;", "Ljava/lang/StringBuilder;");
        f125553f = e1.C(setC, signatureBuildingComponents.e("String", (String[]) Arrays.copyOf(strArrB2, strArrB2.length)));
        String[] strArrB3 = signatureBuildingComponents.b("Ljava/lang/String;Ljava/lang/Throwable;ZZ");
        f125554g = signatureBuildingComponents.e("Throwable", (String[]) Arrays.copyOf(strArrB3, strArrB3.length));
    }

    private h() {
    }

    private final Set<String> a() {
        SignatureBuildingComponents signatureBuildingComponents = SignatureBuildingComponents.f126464a;
        JvmPrimitiveType jvmPrimitiveType = JvmPrimitiveType.BYTE;
        List listL = CollectionsKt__CollectionsKt.L(JvmPrimitiveType.BOOLEAN, jvmPrimitiveType, JvmPrimitiveType.DOUBLE, JvmPrimitiveType.FLOAT, jvmPrimitiveType, JvmPrimitiveType.INT, JvmPrimitiveType.LONG, JvmPrimitiveType.SHORT);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = listL.iterator();
        while (it.hasNext()) {
            String strB = ((JvmPrimitiveType) it.next()).getWrapperFqName().g().b();
            f0.o(strB, "it.wrapperFqName.shortName().asString()");
            String[] strArrB = signatureBuildingComponents.b("Ljava/lang/String;");
            x.n0(linkedHashSet, signatureBuildingComponents.e(strB, (String[]) Arrays.copyOf(strArrB, strArrB.length)));
        }
        return linkedHashSet;
    }

    private final Set<String> b() {
        SignatureBuildingComponents signatureBuildingComponents = SignatureBuildingComponents.f126464a;
        List<JvmPrimitiveType> listL = CollectionsKt__CollectionsKt.L(JvmPrimitiveType.BOOLEAN, JvmPrimitiveType.CHAR);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (JvmPrimitiveType jvmPrimitiveType : listL) {
            String strB = jvmPrimitiveType.getWrapperFqName().g().b();
            f0.o(strB, "it.wrapperFqName.shortName().asString()");
            x.n0(linkedHashSet, signatureBuildingComponents.e(strB, jvmPrimitiveType.getJavaKeywordName() + "Value()" + jvmPrimitiveType.getDesc()));
        }
        return linkedHashSet;
    }

    @dl.d
    public final Set<String> c() {
        return f125549b;
    }

    @dl.d
    public final Set<String> d() {
        return f125553f;
    }

    @dl.d
    public final Set<String> e() {
        return f125550c;
    }

    @dl.d
    public final Set<String> f() {
        return f125552e;
    }

    @dl.d
    public final Set<String> g() {
        return f125554g;
    }

    @dl.d
    public final Set<String> h() {
        return f125551d;
    }

    public final boolean i(@dl.d kotlin.reflect.jvm.internal.impl.name.d fqName) {
        f0.p(fqName, "fqName");
        return f0.g(fqName, kotlin.reflect.jvm.internal.impl.builtins.h.a.f125434i) || kotlin.reflect.jvm.internal.impl.builtins.h.e(fqName);
    }

    public final boolean j(@dl.d kotlin.reflect.jvm.internal.impl.name.d fqName) {
        f0.p(fqName, "fqName");
        if (i(fqName)) {
            return true;
        }
        kotlin.reflect.jvm.internal.impl.name.b bVarN = c.f125524a.n(fqName);
        if (bVarN == null) {
            return false;
        }
        try {
            return Serializable.class.isAssignableFrom(Class.forName(bVarN.b().b()));
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }
}
