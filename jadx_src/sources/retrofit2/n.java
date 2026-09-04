package retrofit2;

import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;
import okhttp3.b0;

/* JADX INFO: compiled from: ParameterHandler.java */
/* JADX INFO: loaded from: classes5.dex */
public abstract class n<T> {

    /* JADX INFO: compiled from: ParameterHandler.java */
    public class a extends n<Iterable<T>> {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // retrofit2.n
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(retrofit2.q qVar, @Nullable Iterable<T> iterable) throws IOException {
            if (iterable == null) {
                return;
            }
            Iterator<T> it = iterable.iterator();
            while (it.hasNext()) {
                n.this.a(qVar, it.next());
            }
        }
    }

    /* JADX INFO: compiled from: ParameterHandler.java */
    public class b extends n<Object> {
        b() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // retrofit2.n
        void a(retrofit2.q qVar, @Nullable Object obj) throws IOException {
            if (obj == null) {
                return;
            }
            int length = Array.getLength(obj);
            for (int i10 = 0; i10 < length; i10++) {
                n.this.a(qVar, Array.get(obj, i10));
            }
        }
    }

    /* JADX INFO: compiled from: ParameterHandler.java */
    public static final class c<T> extends n<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Method f138999a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f139000b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final retrofit2.f<T, b0> f139001c;

        c(Method method, int i10, retrofit2.f<T, b0> fVar) {
            this.f138999a = method;
            this.f139000b = i10;
            this.f139001c = fVar;
        }

        @Override // retrofit2.n
        void a(retrofit2.q qVar, @Nullable T t10) {
            if (t10 == null) {
                throw x.o(this.f138999a, this.f139000b, "Body parameter value must not be null.", new Object[0]);
            }
            try {
                qVar.l(this.f139001c.convert(t10));
            } catch (IOException e10) {
                throw x.p(this.f138999a, e10, this.f139000b, "Unable to convert " + t10 + " to RequestBody", new Object[0]);
            }
        }
    }

    /* JADX INFO: compiled from: ParameterHandler.java */
    public static final class d<T> extends n<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f139002a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final retrofit2.f<T, String> f139003b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f139004c;

        d(String str, retrofit2.f<T, String> fVar, boolean z10) {
            Objects.requireNonNull(str, "name == null");
            this.f139002a = str;
            this.f139003b = fVar;
            this.f139004c = z10;
        }

        @Override // retrofit2.n
        void a(retrofit2.q qVar, @Nullable T t10) throws IOException {
            String strConvert;
            if (t10 == null || (strConvert = this.f139003b.convert(t10)) == null) {
                return;
            }
            qVar.a(this.f139002a, strConvert, this.f139004c);
        }
    }

    /* JADX INFO: compiled from: ParameterHandler.java */
    public static final class e<T> extends n<Map<String, T>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Method f139005a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f139006b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final retrofit2.f<T, String> f139007c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final boolean f139008d;

        e(Method method, int i10, retrofit2.f<T, String> fVar, boolean z10) {
            this.f139005a = method;
            this.f139006b = i10;
            this.f139007c = fVar;
            this.f139008d = z10;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // retrofit2.n
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(retrofit2.q qVar, @Nullable Map<String, T> map) throws IOException {
            if (map == null) {
                throw x.o(this.f139005a, this.f139006b, "Field map was null.", new Object[0]);
            }
            for (Map.Entry<String, T> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key == null) {
                    throw x.o(this.f139005a, this.f139006b, "Field map contained null key.", new Object[0]);
                }
                T value = entry.getValue();
                if (value == null) {
                    throw x.o(this.f139005a, this.f139006b, "Field map contained null value for key '" + key + "'.", new Object[0]);
                }
                String strConvert = this.f139007c.convert(value);
                if (strConvert == null) {
                    throw x.o(this.f139005a, this.f139006b, "Field map value '" + value + "' converted to null by " + this.f139007c.getClass().getName() + " for key '" + key + "'.", new Object[0]);
                }
                qVar.a(key, strConvert, this.f139008d);
            }
        }
    }

    /* JADX INFO: compiled from: ParameterHandler.java */
    public static final class f<T> extends n<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f139009a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final retrofit2.f<T, String> f139010b;

        f(String str, retrofit2.f<T, String> fVar) {
            Objects.requireNonNull(str, "name == null");
            this.f139009a = str;
            this.f139010b = fVar;
        }

        @Override // retrofit2.n
        void a(retrofit2.q qVar, @Nullable T t10) throws IOException {
            String strConvert;
            if (t10 == null || (strConvert = this.f139010b.convert(t10)) == null) {
                return;
            }
            qVar.b(this.f139009a, strConvert);
        }
    }

    /* JADX INFO: compiled from: ParameterHandler.java */
    public static final class g<T> extends n<Map<String, T>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Method f139011a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f139012b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final retrofit2.f<T, String> f139013c;

        g(Method method, int i10, retrofit2.f<T, String> fVar) {
            this.f139011a = method;
            this.f139012b = i10;
            this.f139013c = fVar;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // retrofit2.n
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(retrofit2.q qVar, @Nullable Map<String, T> map) throws IOException {
            if (map == null) {
                throw x.o(this.f139011a, this.f139012b, "Header map was null.", new Object[0]);
            }
            for (Map.Entry<String, T> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key == null) {
                    throw x.o(this.f139011a, this.f139012b, "Header map contained null key.", new Object[0]);
                }
                T value = entry.getValue();
                if (value == null) {
                    throw x.o(this.f139011a, this.f139012b, "Header map contained null value for key '" + key + "'.", new Object[0]);
                }
                qVar.b(key, this.f139013c.convert(value));
            }
        }
    }

    /* JADX INFO: compiled from: ParameterHandler.java */
    public static final class h extends n<okhttp3.s> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Method f139014a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f139015b;

        h(Method method, int i10) {
            this.f139014a = method;
            this.f139015b = i10;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // retrofit2.n
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(retrofit2.q qVar, @Nullable okhttp3.s sVar) {
            if (sVar == null) {
                throw x.o(this.f139014a, this.f139015b, "Headers parameter must not be null.", new Object[0]);
            }
            qVar.c(sVar);
        }
    }

    /* JADX INFO: compiled from: ParameterHandler.java */
    public static final class i<T> extends n<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Method f139016a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f139017b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final okhttp3.s f139018c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final retrofit2.f<T, b0> f139019d;

        i(Method method, int i10, okhttp3.s sVar, retrofit2.f<T, b0> fVar) {
            this.f139016a = method;
            this.f139017b = i10;
            this.f139018c = sVar;
            this.f139019d = fVar;
        }

        @Override // retrofit2.n
        void a(retrofit2.q qVar, @Nullable T t10) {
            if (t10 == null) {
                return;
            }
            try {
                qVar.d(this.f139018c, this.f139019d.convert(t10));
            } catch (IOException e10) {
                throw x.o(this.f139016a, this.f139017b, "Unable to convert " + t10 + " to RequestBody", e10);
            }
        }
    }

    /* JADX INFO: compiled from: ParameterHandler.java */
    public static final class j<T> extends n<Map<String, T>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Method f139020a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f139021b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final retrofit2.f<T, b0> f139022c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f139023d;

        j(Method method, int i10, retrofit2.f<T, b0> fVar, String str) {
            this.f139020a = method;
            this.f139021b = i10;
            this.f139022c = fVar;
            this.f139023d = str;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // retrofit2.n
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(retrofit2.q qVar, @Nullable Map<String, T> map) throws IOException {
            if (map == null) {
                throw x.o(this.f139020a, this.f139021b, "Part map was null.", new Object[0]);
            }
            for (Map.Entry<String, T> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key == null) {
                    throw x.o(this.f139020a, this.f139021b, "Part map contained null key.", new Object[0]);
                }
                T value = entry.getValue();
                if (value == null) {
                    throw x.o(this.f139020a, this.f139021b, "Part map contained null value for key '" + key + "'.", new Object[0]);
                }
                qVar.d(okhttp3.s.s("Content-Disposition", "form-data; name=\"" + key + "\"", "Content-Transfer-Encoding", this.f139023d), this.f139022c.convert(value));
            }
        }
    }

    /* JADX INFO: compiled from: ParameterHandler.java */
    public static final class k<T> extends n<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Method f139024a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f139025b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f139026c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final retrofit2.f<T, String> f139027d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final boolean f139028e;

        k(Method method, int i10, String str, retrofit2.f<T, String> fVar, boolean z10) {
            this.f139024a = method;
            this.f139025b = i10;
            Objects.requireNonNull(str, "name == null");
            this.f139026c = str;
            this.f139027d = fVar;
            this.f139028e = z10;
        }

        @Override // retrofit2.n
        void a(retrofit2.q qVar, @Nullable T t10) throws IOException {
            if (t10 != null) {
                qVar.f(this.f139026c, this.f139027d.convert(t10), this.f139028e);
                return;
            }
            throw x.o(this.f139024a, this.f139025b, "Path parameter \"" + this.f139026c + "\" value must not be null.", new Object[0]);
        }
    }

    /* JADX INFO: compiled from: ParameterHandler.java */
    public static final class l<T> extends n<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f139029a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final retrofit2.f<T, String> f139030b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f139031c;

        l(String str, retrofit2.f<T, String> fVar, boolean z10) {
            Objects.requireNonNull(str, "name == null");
            this.f139029a = str;
            this.f139030b = fVar;
            this.f139031c = z10;
        }

        @Override // retrofit2.n
        void a(retrofit2.q qVar, @Nullable T t10) throws IOException {
            String strConvert;
            if (t10 == null || (strConvert = this.f139030b.convert(t10)) == null) {
                return;
            }
            qVar.g(this.f139029a, strConvert, this.f139031c);
        }
    }

    /* JADX INFO: compiled from: ParameterHandler.java */
    public static final class m<T> extends n<Map<String, T>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Method f139032a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f139033b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final retrofit2.f<T, String> f139034c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final boolean f139035d;

        m(Method method, int i10, retrofit2.f<T, String> fVar, boolean z10) {
            this.f139032a = method;
            this.f139033b = i10;
            this.f139034c = fVar;
            this.f139035d = z10;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // retrofit2.n
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(retrofit2.q qVar, @Nullable Map<String, T> map) throws IOException {
            if (map == null) {
                throw x.o(this.f139032a, this.f139033b, "Query map was null", new Object[0]);
            }
            for (Map.Entry<String, T> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key == null) {
                    throw x.o(this.f139032a, this.f139033b, "Query map contained null key.", new Object[0]);
                }
                T value = entry.getValue();
                if (value == null) {
                    throw x.o(this.f139032a, this.f139033b, "Query map contained null value for key '" + key + "'.", new Object[0]);
                }
                String strConvert = this.f139034c.convert(value);
                if (strConvert == null) {
                    throw x.o(this.f139032a, this.f139033b, "Query map value '" + value + "' converted to null by " + this.f139034c.getClass().getName() + " for key '" + key + "'.", new Object[0]);
                }
                qVar.g(key, strConvert, this.f139035d);
            }
        }
    }

    /* JADX INFO: renamed from: retrofit2.n$n, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ParameterHandler.java */
    public static final class C1264n<T> extends n<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final retrofit2.f<T, String> f139036a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f139037b;

        C1264n(retrofit2.f<T, String> fVar, boolean z10) {
            this.f139036a = fVar;
            this.f139037b = z10;
        }

        @Override // retrofit2.n
        void a(retrofit2.q qVar, @Nullable T t10) throws IOException {
            if (t10 == null) {
                return;
            }
            qVar.g(this.f139036a.convert(t10), null, this.f139037b);
        }
    }

    /* JADX INFO: compiled from: ParameterHandler.java */
    public static final class o extends n<okhttp3.w.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final o f139038a = new o();

        private o() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // retrofit2.n
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(retrofit2.q qVar, @Nullable okhttp3.w.c cVar) {
            if (cVar != null) {
                qVar.e(cVar);
            }
        }
    }

    /* JADX INFO: compiled from: ParameterHandler.java */
    public static final class p extends n<Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Method f139039a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f139040b;

        p(Method method, int i10) {
            this.f139039a = method;
            this.f139040b = i10;
        }

        @Override // retrofit2.n
        void a(retrofit2.q qVar, @Nullable Object obj) {
            if (obj == null) {
                throw x.o(this.f139039a, this.f139040b, "@Url parameter is null.", new Object[0]);
            }
            qVar.m(obj);
        }
    }

    /* JADX INFO: compiled from: ParameterHandler.java */
    public static final class q<T> extends n<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Class<T> f139041a;

        q(Class<T> cls) {
            this.f139041a = cls;
        }

        @Override // retrofit2.n
        void a(retrofit2.q qVar, @Nullable T t10) {
            qVar.h(this.f139041a, t10);
        }
    }

    n() {
    }

    abstract void a(retrofit2.q qVar, @Nullable T t10) throws IOException;

    final n<Object> b() {
        return new b();
    }

    final n<Iterable<T>> c() {
        return new a();
    }
}
