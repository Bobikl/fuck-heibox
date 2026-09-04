package retrofit2;

import com.jd.jdcache.util.UrlHelper;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.net.URI;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import okhttp3.a0;

/* JADX INFO: compiled from: RequestFactory.java */
/* JADX INFO: loaded from: classes5.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Method f139062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final okhttp3.t f139063b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final String f139064c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private final String f139065d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private final okhttp3.s f139066e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private final okhttp3.v f139067f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f139068g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f139069h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f139070i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final n<?>[] f139071j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final boolean f139072k;

    /* JADX INFO: compiled from: RequestFactory.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final t f139076a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Method f139077b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final Annotation[] f139078c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final Annotation[][] f139079d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final Type[] f139080e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f139081f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        boolean f139082g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        boolean f139083h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        boolean f139084i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        boolean f139085j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        boolean f139086k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        boolean f139087l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        boolean f139088m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        @Nullable
        String f139089n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        boolean f139090o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        boolean f139091p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        boolean f139092q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        @Nullable
        String f139093r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        @Nullable
        okhttp3.s f139094s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        @Nullable
        okhttp3.v f139095t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        @Nullable
        Set<String> f139096u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        @Nullable
        n<?>[] f139097v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        boolean f139098w;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private static final Pattern f139074y = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private static final String f139073x = "[a-zA-Z][a-zA-Z0-9_-]*";

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private static final Pattern f139075z = Pattern.compile(f139073x);

        a(t tVar, Method method) {
            this.f139076a = tVar;
            this.f139077b = method;
            this.f139078c = method.getAnnotations();
            this.f139080e = method.getGenericParameterTypes();
            this.f139079d = method.getParameterAnnotations();
        }

        private static Class<?> a(Class<?> cls) {
            if (Boolean.TYPE == cls) {
                return Boolean.class;
            }
            if (Byte.TYPE == cls) {
                return Byte.class;
            }
            if (Character.TYPE == cls) {
                return Character.class;
            }
            if (Double.TYPE == cls) {
                return Double.class;
            }
            if (Float.TYPE == cls) {
                return Float.class;
            }
            if (Integer.TYPE == cls) {
                return Integer.class;
            }
            if (Long.TYPE == cls) {
                return Long.class;
            }
            return Short.TYPE == cls ? Short.class : cls;
        }

        private okhttp3.s c(String[] strArr) {
            okhttp3.s.a aVar = new okhttp3.s.a();
            for (String str : strArr) {
                int iIndexOf = str.indexOf(58);
                if (iIndexOf == -1 || iIndexOf == 0 || iIndexOf == str.length() - 1) {
                    throw x.m(this.f139077b, "@Headers value must be in the form \"Name: Value\". Found: \"%s\"", str);
                }
                String strSubstring = str.substring(0, iIndexOf);
                String strTrim = str.substring(iIndexOf + 1).trim();
                if ("Content-Type".equalsIgnoreCase(strSubstring)) {
                    try {
                        this.f139095t = okhttp3.v.h(strTrim);
                    } catch (IllegalArgumentException e10) {
                        throw x.n(this.f139077b, e10, "Malformed content type: %s", strTrim);
                    }
                } else {
                    aVar.b(strSubstring, strTrim);
                }
            }
            return aVar.i();
        }

        private void d(String str, String str2, boolean z10) {
            String str3 = this.f139089n;
            if (str3 != null) {
                throw x.m(this.f139077b, "Only one HTTP method is allowed. Found: %s and %s.", str3, str);
            }
            this.f139089n = str;
            this.f139090o = z10;
            if (str2.isEmpty()) {
                return;
            }
            int iIndexOf = str2.indexOf(63);
            if (iIndexOf != -1 && iIndexOf < str2.length() - 1) {
                String strSubstring = str2.substring(iIndexOf + 1);
                if (f139074y.matcher(strSubstring).find()) {
                    throw x.m(this.f139077b, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", strSubstring);
                }
            }
            this.f139093r = str2;
            this.f139096u = h(str2);
        }

        private void e(Annotation annotation) {
            if (annotation instanceof ll.b) {
                d("DELETE", ((ll.b) annotation).value(), false);
                return;
            }
            if (annotation instanceof ll.f) {
                d("GET", ((ll.f) annotation).value(), false);
                return;
            }
            if (annotation instanceof ll.g) {
                d("HEAD", ((ll.g) annotation).value(), false);
                return;
            }
            if (annotation instanceof ll.n) {
                d(UrlHelper.METHOD_PATCH, ((ll.n) annotation).value(), true);
                return;
            }
            if (annotation instanceof ll.o) {
                d("POST", ((ll.o) annotation).value(), true);
                return;
            }
            if (annotation instanceof ll.p) {
                d("PUT", ((ll.p) annotation).value(), true);
                return;
            }
            if (annotation instanceof ll.m) {
                d("OPTIONS", ((ll.m) annotation).value(), false);
                return;
            }
            if (annotation instanceof ll.h) {
                ll.h hVar = (ll.h) annotation;
                d(hVar.method(), hVar.path(), hVar.hasBody());
                return;
            }
            if (annotation instanceof ll.k) {
                String[] strArrValue = ((ll.k) annotation).value();
                if (strArrValue.length == 0) {
                    throw x.m(this.f139077b, "@Headers annotation is empty.", new Object[0]);
                }
                this.f139094s = c(strArrValue);
                return;
            }
            if (annotation instanceof ll.l) {
                if (this.f139091p) {
                    throw x.m(this.f139077b, "Only one encoding annotation is allowed.", new Object[0]);
                }
                this.f139092q = true;
            } else if (annotation instanceof ll.e) {
                if (this.f139092q) {
                    throw x.m(this.f139077b, "Only one encoding annotation is allowed.", new Object[0]);
                }
                this.f139091p = true;
            }
        }

        @Nullable
        private n<?> f(int i10, Type type, @Nullable Annotation[] annotationArr, boolean z10) {
            n<?> nVar;
            if (annotationArr != null) {
                nVar = null;
                for (Annotation annotation : annotationArr) {
                    n<?> nVarG = g(i10, type, annotationArr, annotation);
                    if (nVarG != null) {
                        if (nVar != null) {
                            throw x.o(this.f139077b, i10, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                        }
                        nVar = nVarG;
                    }
                }
            } else {
                nVar = null;
            }
            if (nVar != null) {
                return nVar;
            }
            if (z10) {
                try {
                    if (x.h(type) == kotlin.coroutines.c.class) {
                        this.f139098w = true;
                        return null;
                    }
                } catch (NoClassDefFoundError unused) {
                }
            }
            throw x.o(this.f139077b, i10, "No Retrofit annotation found.", new Object[0]);
        }

        @Nullable
        private n<?> g(int i10, Type type, Annotation[] annotationArr, Annotation annotation) {
            if (annotation instanceof ll.y) {
                j(i10, type);
                if (this.f139088m) {
                    throw x.o(this.f139077b, i10, "Multiple @Url method annotations found.", new Object[0]);
                }
                if (this.f139084i) {
                    throw x.o(this.f139077b, i10, "@Path parameters may not be used with @Url.", new Object[0]);
                }
                if (this.f139085j) {
                    throw x.o(this.f139077b, i10, "A @Url parameter must not come after a @Query.", new Object[0]);
                }
                if (this.f139086k) {
                    throw x.o(this.f139077b, i10, "A @Url parameter must not come after a @QueryName.", new Object[0]);
                }
                if (this.f139087l) {
                    throw x.o(this.f139077b, i10, "A @Url parameter must not come after a @QueryMap.", new Object[0]);
                }
                if (this.f139093r != null) {
                    throw x.o(this.f139077b, i10, "@Url cannot be used with @%s URL", this.f139089n);
                }
                this.f139088m = true;
                if (type == okhttp3.t.class || type == String.class || type == URI.class || ((type instanceof Class) && "android.net.Uri".equals(((Class) type).getName()))) {
                    return new n.p(this.f139077b, i10);
                }
                throw x.o(this.f139077b, i10, "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type.", new Object[0]);
            }
            if (annotation instanceof ll.s) {
                j(i10, type);
                if (this.f139085j) {
                    throw x.o(this.f139077b, i10, "A @Path parameter must not come after a @Query.", new Object[0]);
                }
                if (this.f139086k) {
                    throw x.o(this.f139077b, i10, "A @Path parameter must not come after a @QueryName.", new Object[0]);
                }
                if (this.f139087l) {
                    throw x.o(this.f139077b, i10, "A @Path parameter must not come after a @QueryMap.", new Object[0]);
                }
                if (this.f139088m) {
                    throw x.o(this.f139077b, i10, "@Path parameters may not be used with @Url.", new Object[0]);
                }
                if (this.f139093r == null) {
                    throw x.o(this.f139077b, i10, "@Path can only be used with relative url on @%s", this.f139089n);
                }
                this.f139084i = true;
                ll.s sVar = (ll.s) annotation;
                String strValue = sVar.value();
                i(i10, strValue);
                return new n.k(this.f139077b, i10, strValue, this.f139076a.o(type, annotationArr), sVar.encoded());
            }
            if (annotation instanceof ll.t) {
                j(i10, type);
                ll.t tVar = (ll.t) annotation;
                String strValue2 = tVar.value();
                boolean zEncoded = tVar.encoded();
                Class<?> clsH = x.h(type);
                this.f139085j = true;
                if (!Iterable.class.isAssignableFrom(clsH)) {
                    return clsH.isArray() ? new n.l(strValue2, this.f139076a.o(a(clsH.getComponentType()), annotationArr), zEncoded).b() : new n.l(strValue2, this.f139076a.o(type, annotationArr), zEncoded);
                }
                if (type instanceof ParameterizedType) {
                    return new n.l(strValue2, this.f139076a.o(x.g(0, (ParameterizedType) type), annotationArr), zEncoded).c();
                }
                throw x.o(this.f139077b, i10, clsH.getSimpleName() + " must include generic type (e.g., " + clsH.getSimpleName() + "<String>)", new Object[0]);
            }
            if (annotation instanceof ll.v) {
                j(i10, type);
                boolean zEncoded2 = ((ll.v) annotation).encoded();
                Class<?> clsH2 = x.h(type);
                this.f139086k = true;
                if (!Iterable.class.isAssignableFrom(clsH2)) {
                    return clsH2.isArray() ? new n.C1264n(this.f139076a.o(a(clsH2.getComponentType()), annotationArr), zEncoded2).b() : new n.C1264n(this.f139076a.o(type, annotationArr), zEncoded2);
                }
                if (type instanceof ParameterizedType) {
                    return new n.C1264n(this.f139076a.o(x.g(0, (ParameterizedType) type), annotationArr), zEncoded2).c();
                }
                throw x.o(this.f139077b, i10, clsH2.getSimpleName() + " must include generic type (e.g., " + clsH2.getSimpleName() + "<String>)", new Object[0]);
            }
            if (annotation instanceof ll.u) {
                j(i10, type);
                Class<?> clsH3 = x.h(type);
                this.f139087l = true;
                if (!Map.class.isAssignableFrom(clsH3)) {
                    throw x.o(this.f139077b, i10, "@QueryMap parameter type must be Map.", new Object[0]);
                }
                Type typeI = x.i(type, clsH3, Map.class);
                if (!(typeI instanceof ParameterizedType)) {
                    throw x.o(this.f139077b, i10, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                ParameterizedType parameterizedType = (ParameterizedType) typeI;
                Type typeG = x.g(0, parameterizedType);
                if (String.class == typeG) {
                    return new n.m(this.f139077b, i10, this.f139076a.o(x.g(1, parameterizedType), annotationArr), ((ll.u) annotation).encoded());
                }
                throw x.o(this.f139077b, i10, "@QueryMap keys must be of type String: " + typeG, new Object[0]);
            }
            if (annotation instanceof ll.i) {
                j(i10, type);
                String strValue3 = ((ll.i) annotation).value();
                Class<?> clsH4 = x.h(type);
                if (!Iterable.class.isAssignableFrom(clsH4)) {
                    return clsH4.isArray() ? new n.f(strValue3, this.f139076a.o(a(clsH4.getComponentType()), annotationArr)).b() : new n.f(strValue3, this.f139076a.o(type, annotationArr));
                }
                if (type instanceof ParameterizedType) {
                    return new n.f(strValue3, this.f139076a.o(x.g(0, (ParameterizedType) type), annotationArr)).c();
                }
                throw x.o(this.f139077b, i10, clsH4.getSimpleName() + " must include generic type (e.g., " + clsH4.getSimpleName() + "<String>)", new Object[0]);
            }
            if (annotation instanceof ll.j) {
                if (type == okhttp3.s.class) {
                    return new n.h(this.f139077b, i10);
                }
                j(i10, type);
                Class<?> clsH5 = x.h(type);
                if (!Map.class.isAssignableFrom(clsH5)) {
                    throw x.o(this.f139077b, i10, "@HeaderMap parameter type must be Map.", new Object[0]);
                }
                Type typeI2 = x.i(type, clsH5, Map.class);
                if (!(typeI2 instanceof ParameterizedType)) {
                    throw x.o(this.f139077b, i10, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                ParameterizedType parameterizedType2 = (ParameterizedType) typeI2;
                Type typeG2 = x.g(0, parameterizedType2);
                if (String.class == typeG2) {
                    return new n.g(this.f139077b, i10, this.f139076a.o(x.g(1, parameterizedType2), annotationArr));
                }
                throw x.o(this.f139077b, i10, "@HeaderMap keys must be of type String: " + typeG2, new Object[0]);
            }
            if (annotation instanceof ll.c) {
                j(i10, type);
                if (!this.f139091p) {
                    throw x.o(this.f139077b, i10, "@Field parameters can only be used with form encoding.", new Object[0]);
                }
                ll.c cVar = (ll.c) annotation;
                String strValue4 = cVar.value();
                boolean zEncoded3 = cVar.encoded();
                this.f139081f = true;
                Class<?> clsH6 = x.h(type);
                if (!Iterable.class.isAssignableFrom(clsH6)) {
                    return clsH6.isArray() ? new n.d(strValue4, this.f139076a.o(a(clsH6.getComponentType()), annotationArr), zEncoded3).b() : new n.d(strValue4, this.f139076a.o(type, annotationArr), zEncoded3);
                }
                if (type instanceof ParameterizedType) {
                    return new n.d(strValue4, this.f139076a.o(x.g(0, (ParameterizedType) type), annotationArr), zEncoded3).c();
                }
                throw x.o(this.f139077b, i10, clsH6.getSimpleName() + " must include generic type (e.g., " + clsH6.getSimpleName() + "<String>)", new Object[0]);
            }
            if (annotation instanceof ll.d) {
                j(i10, type);
                if (!this.f139091p) {
                    throw x.o(this.f139077b, i10, "@FieldMap parameters can only be used with form encoding.", new Object[0]);
                }
                Class<?> clsH7 = x.h(type);
                if (!Map.class.isAssignableFrom(clsH7)) {
                    throw x.o(this.f139077b, i10, "@FieldMap parameter type must be Map.", new Object[0]);
                }
                Type typeI3 = x.i(type, clsH7, Map.class);
                if (!(typeI3 instanceof ParameterizedType)) {
                    throw x.o(this.f139077b, i10, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                ParameterizedType parameterizedType3 = (ParameterizedType) typeI3;
                Type typeG3 = x.g(0, parameterizedType3);
                if (String.class == typeG3) {
                    f fVarO = this.f139076a.o(x.g(1, parameterizedType3), annotationArr);
                    this.f139081f = true;
                    return new n.e(this.f139077b, i10, fVarO, ((ll.d) annotation).encoded());
                }
                throw x.o(this.f139077b, i10, "@FieldMap keys must be of type String: " + typeG3, new Object[0]);
            }
            if (annotation instanceof ll.q) {
                j(i10, type);
                if (!this.f139092q) {
                    throw x.o(this.f139077b, i10, "@Part parameters can only be used with multipart encoding.", new Object[0]);
                }
                ll.q qVar = (ll.q) annotation;
                this.f139082g = true;
                String strValue5 = qVar.value();
                Class<?> clsH8 = x.h(type);
                if (strValue5.isEmpty()) {
                    if (!Iterable.class.isAssignableFrom(clsH8)) {
                        if (clsH8.isArray()) {
                            if (okhttp3.w.c.class.isAssignableFrom(clsH8.getComponentType())) {
                                return n.o.f139038a.b();
                            }
                            throw x.o(this.f139077b, i10, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                        }
                        if (okhttp3.w.c.class.isAssignableFrom(clsH8)) {
                            return n.o.f139038a;
                        }
                        throw x.o(this.f139077b, i10, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                    }
                    if (type instanceof ParameterizedType) {
                        if (okhttp3.w.c.class.isAssignableFrom(x.h(x.g(0, (ParameterizedType) type)))) {
                            return n.o.f139038a.c();
                        }
                        throw x.o(this.f139077b, i10, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                    }
                    throw x.o(this.f139077b, i10, clsH8.getSimpleName() + " must include generic type (e.g., " + clsH8.getSimpleName() + "<String>)", new Object[0]);
                }
                okhttp3.s sVarS = okhttp3.s.s("Content-Disposition", "form-data; name=\"" + strValue5 + "\"", "Content-Transfer-Encoding", qVar.encoding());
                if (!Iterable.class.isAssignableFrom(clsH8)) {
                    if (!clsH8.isArray()) {
                        if (okhttp3.w.c.class.isAssignableFrom(clsH8)) {
                            throw x.o(this.f139077b, i10, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                        }
                        return new n.i(this.f139077b, i10, sVarS, this.f139076a.m(type, annotationArr, this.f139078c));
                    }
                    Class<?> clsA = a(clsH8.getComponentType());
                    if (okhttp3.w.c.class.isAssignableFrom(clsA)) {
                        throw x.o(this.f139077b, i10, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                    }
                    return new n.i(this.f139077b, i10, sVarS, this.f139076a.m(clsA, annotationArr, this.f139078c)).b();
                }
                if (type instanceof ParameterizedType) {
                    Type typeG4 = x.g(0, (ParameterizedType) type);
                    if (okhttp3.w.c.class.isAssignableFrom(x.h(typeG4))) {
                        throw x.o(this.f139077b, i10, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                    }
                    return new n.i(this.f139077b, i10, sVarS, this.f139076a.m(typeG4, annotationArr, this.f139078c)).c();
                }
                throw x.o(this.f139077b, i10, clsH8.getSimpleName() + " must include generic type (e.g., " + clsH8.getSimpleName() + "<String>)", new Object[0]);
            }
            if (annotation instanceof ll.r) {
                j(i10, type);
                if (!this.f139092q) {
                    throw x.o(this.f139077b, i10, "@PartMap parameters can only be used with multipart encoding.", new Object[0]);
                }
                this.f139082g = true;
                Class<?> clsH9 = x.h(type);
                if (!Map.class.isAssignableFrom(clsH9)) {
                    throw x.o(this.f139077b, i10, "@PartMap parameter type must be Map.", new Object[0]);
                }
                Type typeI4 = x.i(type, clsH9, Map.class);
                if (!(typeI4 instanceof ParameterizedType)) {
                    throw x.o(this.f139077b, i10, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                ParameterizedType parameterizedType4 = (ParameterizedType) typeI4;
                Type typeG5 = x.g(0, parameterizedType4);
                if (String.class == typeG5) {
                    Type typeG6 = x.g(1, parameterizedType4);
                    if (okhttp3.w.c.class.isAssignableFrom(x.h(typeG6))) {
                        throw x.o(this.f139077b, i10, "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead.", new Object[0]);
                    }
                    return new n.j(this.f139077b, i10, this.f139076a.m(typeG6, annotationArr, this.f139078c), ((ll.r) annotation).encoding());
                }
                throw x.o(this.f139077b, i10, "@PartMap keys must be of type String: " + typeG5, new Object[0]);
            }
            if (annotation instanceof ll.a) {
                j(i10, type);
                if (this.f139091p || this.f139092q) {
                    throw x.o(this.f139077b, i10, "@Body parameters cannot be used with form or multi-part encoding.", new Object[0]);
                }
                if (this.f139083h) {
                    throw x.o(this.f139077b, i10, "Multiple @Body method annotations found.", new Object[0]);
                }
                try {
                    f fVarM = this.f139076a.m(type, annotationArr, this.f139078c);
                    this.f139083h = true;
                    return new n.c(this.f139077b, i10, fVarM);
                } catch (RuntimeException e10) {
                    throw x.p(this.f139077b, e10, i10, "Unable to create @Body converter for %s", type);
                }
            }
            if (!(annotation instanceof ll.x)) {
                return null;
            }
            j(i10, type);
            Class<?> clsH10 = x.h(type);
            for (int i11 = i10 - 1; i11 >= 0; i11--) {
                n<?> nVar = this.f139097v[i11];
                if ((nVar instanceof n.q) && ((n.q) nVar).f139041a.equals(clsH10)) {
                    throw x.o(this.f139077b, i10, "@Tag type " + clsH10.getName() + " is duplicate of parameter #" + (i11 + 1) + " and would always overwrite its value.", new Object[0]);
                }
            }
            return new n.q(clsH10);
        }

        static Set<String> h(String str) {
            Matcher matcher = f139074y.matcher(str);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            while (matcher.find()) {
                linkedHashSet.add(matcher.group(1));
            }
            return linkedHashSet;
        }

        private void i(int i10, String str) {
            if (!f139075z.matcher(str).matches()) {
                throw x.o(this.f139077b, i10, "@Path parameter name must match %s. Found: %s", f139074y.pattern(), str);
            }
            if (!this.f139096u.contains(str)) {
                throw x.o(this.f139077b, i10, "URL \"%s\" does not contain \"{%s}\".", this.f139093r, str);
            }
        }

        private void j(int i10, Type type) {
            if (x.j(type)) {
                throw x.o(this.f139077b, i10, "Parameter type must not include a type variable or wildcard: %s", type);
            }
        }

        r b() {
            for (Annotation annotation : this.f139078c) {
                e(annotation);
            }
            if (this.f139089n == null) {
                throw x.m(this.f139077b, "HTTP method annotation is required (e.g., @GET, @POST, etc.).", new Object[0]);
            }
            if (!this.f139090o) {
                if (this.f139092q) {
                    throw x.m(this.f139077b, "Multipart can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                }
                if (this.f139091p) {
                    throw x.m(this.f139077b, "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                }
            }
            int length = this.f139079d.length;
            this.f139097v = new n[length];
            int i10 = length - 1;
            int i11 = 0;
            while (true) {
                boolean z10 = true;
                if (i11 >= length) {
                    break;
                }
                n<?>[] nVarArr = this.f139097v;
                Type type = this.f139080e[i11];
                Annotation[] annotationArr = this.f139079d[i11];
                if (i11 != i10) {
                    z10 = false;
                }
                nVarArr[i11] = f(i11, type, annotationArr, z10);
                i11++;
            }
            if (this.f139093r == null && !this.f139088m) {
                throw x.m(this.f139077b, "Missing either @%s URL or @Url parameter.", this.f139089n);
            }
            boolean z11 = this.f139091p;
            if (!z11 && !this.f139092q && !this.f139090o && this.f139083h) {
                throw x.m(this.f139077b, "Non-body HTTP method cannot contain @Body.", new Object[0]);
            }
            if (z11 && !this.f139081f) {
                throw x.m(this.f139077b, "Form-encoded method must contain at least one @Field.", new Object[0]);
            }
            if (!this.f139092q || this.f139082g) {
                return new r(this);
            }
            throw x.m(this.f139077b, "Multipart method must contain at least one @Part.", new Object[0]);
        }
    }

    r(a aVar) {
        this.f139062a = aVar.f139077b;
        this.f139063b = aVar.f139076a.f139104c;
        this.f139064c = aVar.f139089n;
        this.f139065d = aVar.f139093r;
        this.f139066e = aVar.f139094s;
        this.f139067f = aVar.f139095t;
        this.f139068g = aVar.f139090o;
        this.f139069h = aVar.f139091p;
        this.f139070i = aVar.f139092q;
        this.f139071j = aVar.f139097v;
        this.f139072k = aVar.f139098w;
    }

    static r b(t tVar, Method method) {
        return new a(tVar, method).b();
    }

    a0 a(Object[] objArr) throws IOException {
        n<?>[] nVarArr = this.f139071j;
        int length = objArr.length;
        if (length != nVarArr.length) {
            throw new IllegalArgumentException("Argument count (" + length + ") doesn't match expected count (" + nVarArr.length + ")");
        }
        q qVar = new q(this.f139064c, this.f139063b, this.f139065d, this.f139066e, this.f139067f, this.f139068g, this.f139069h, this.f139070i);
        if (this.f139072k) {
            length--;
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i10 = 0; i10 < length; i10++) {
            arrayList.add(objArr[i10]);
            nVarArr[i10].a(qVar, objArr[i10]);
        }
        return qVar.k().z(k.class, new k(this.f139062a, arrayList)).b();
    }
}
