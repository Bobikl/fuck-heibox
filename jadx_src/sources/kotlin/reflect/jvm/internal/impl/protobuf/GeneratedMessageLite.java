package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public abstract class GeneratedMessageLite extends kotlin.reflect.jvm.internal.impl.protobuf.a implements Serializable {

    public static abstract class ExtendableMessage<MessageType extends ExtendableMessage<MessageType>> extends GeneratedMessageLite implements d<MessageType> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final g<e> f127286c;

        public class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Iterator<Map.Entry<e, Object>> f127287a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private Map.Entry<e, Object> f127288b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final boolean f127289c;

            private a(boolean z10) {
                Iterator<Map.Entry<e, Object>> itP = ExtendableMessage.this.f127286c.p();
                this.f127287a = itP;
                if (itP.hasNext()) {
                    this.f127288b = itP.next();
                }
                this.f127289c = z10;
            }

            /* synthetic */ a(ExtendableMessage extendableMessage, boolean z10, a aVar) {
                this(z10);
            }

            public void a(int i10, CodedOutputStream codedOutputStream) throws IOException {
                while (true) {
                    Map.Entry<e, Object> entry = this.f127288b;
                    if (entry == null || entry.getKey().getNumber() >= i10) {
                        return;
                    }
                    e key = this.f127288b.getKey();
                    if (this.f127289c && key.F() == WireFormat.JavaType.MESSAGE && !key.H()) {
                        codedOutputStream.f0(key.getNumber(), (n) this.f127288b.getValue());
                    } else {
                        g.z(key, this.f127288b.getValue(), codedOutputStream);
                    }
                    if (this.f127287a.hasNext()) {
                        this.f127288b = this.f127287a.next();
                    } else {
                        this.f127288b = null;
                    }
                }
            }
        }

        protected ExtendableMessage() {
            this.f127286c = g.t();
        }

        protected ExtendableMessage(c<MessageType, ?> cVar) {
            this.f127286c = cVar.k();
        }

        private void z(f<MessageType, ?> fVar) {
            if (fVar.b() != r()) {
                throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
        protected void g() {
            this.f127286c.q();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
        protected boolean j(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, CodedOutputStream codedOutputStream, kotlin.reflect.jvm.internal.impl.protobuf.f fVar, int i10) throws IOException {
            return GeneratedMessageLite.k(this.f127286c, r(), eVar, codedOutputStream, fVar, i10);
        }

        protected boolean n() {
            return this.f127286c.n();
        }

        protected int o() {
            return this.f127286c.k();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final <Type> Type p(f<MessageType, Type> fVar) {
            z(fVar);
            Object objH = this.f127286c.h(fVar.f127303d);
            return objH == null ? fVar.f127301b : (Type) fVar.a(objH);
        }

        public final <Type> Type q(f<MessageType, List<Type>> fVar, int i10) {
            z(fVar);
            return (Type) fVar.e(this.f127286c.i(fVar.f127303d, i10));
        }

        public final <Type> int s(f<MessageType, List<Type>> fVar) {
            z(fVar);
            return this.f127286c.j(fVar.f127303d);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final <Type> boolean x(f<MessageType, Type> fVar) {
            z(fVar);
            return this.f127286c.m(fVar.f127303d);
        }

        protected ExtendableMessage<MessageType>.a y() {
            return new a(this, false, null);
        }
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f127291a;

        static {
            int[] iArr = new int[WireFormat.JavaType.values().length];
            f127291a = iArr;
            try {
                iArr[WireFormat.JavaType.MESSAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f127291a[WireFormat.JavaType.ENUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static abstract class b<MessageType extends GeneratedMessageLite, BuilderType extends b> extends kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC1169a<BuilderType> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private kotlin.reflect.jvm.internal.impl.protobuf.d f127292b = kotlin.reflect.jvm.internal.impl.protobuf.d.f127320b;

        protected b() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC1169a
        /* JADX INFO: renamed from: e */
        public BuilderType m() {
            throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        /* JADX INFO: renamed from: f */
        public abstract MessageType r();

        public final kotlin.reflect.jvm.internal.impl.protobuf.d g() {
            return this.f127292b;
        }

        public abstract BuilderType h(MessageType messagetype);

        public final BuilderType i(kotlin.reflect.jvm.internal.impl.protobuf.d dVar) {
            this.f127292b = dVar;
            return this;
        }
    }

    public static abstract class c<MessageType extends ExtendableMessage<MessageType>, BuilderType extends c<MessageType, BuilderType>> extends b<MessageType, BuilderType> implements d<MessageType> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private g<e> f127293c = g.g();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f127294d;

        protected c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public g<e> k() {
            this.f127293c.q();
            this.f127294d = false;
            return this.f127293c;
        }

        private void n() {
            if (this.f127294d) {
                return;
            }
            this.f127293c = this.f127293c.clone();
            this.f127294d = true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b
        public BuilderType m() {
            throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
        }

        protected boolean o() {
            return this.f127293c.n();
        }

        protected final void p(MessageType messagetype) {
            n();
            this.f127293c.r(((ExtendableMessage) messagetype).f127286c);
        }
    }

    public interface d<MessageType extends ExtendableMessage> extends o {
    }

    public static final class e implements g.b<e> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final h.b<?> f127295b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f127296c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final WireFormat.FieldType f127297d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final boolean f127298e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final boolean f127299f;

        e(h.b<?> bVar, int i10, WireFormat.FieldType fieldType, boolean z10, boolean z11) {
            this.f127295b = bVar;
            this.f127296c = i10;
            this.f127297d = fieldType;
            this.f127298e = z10;
            this.f127299f = z11;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.g.b
        public WireFormat.FieldType E() {
            return this.f127297d;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.g.b
        public WireFormat.JavaType F() {
            return this.f127297d.getJavaType();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.g.b
        public boolean H() {
            return this.f127298e;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.g.b
        public n.a Q0(n.a aVar, n nVar) {
            return ((b) aVar).h((GeneratedMessageLite) nVar);
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(e eVar) {
            return this.f127296c - eVar.f127296c;
        }

        public h.b<?> b() {
            return this.f127295b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.g.b
        public int getNumber() {
            return this.f127296c;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.g.b
        public boolean isPacked() {
            return this.f127299f;
        }
    }

    public static class f<ContainingType extends n, Type> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final ContainingType f127300a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Type f127301b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final n f127302c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final e f127303d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final Class f127304e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final Method f127305f;

        f(ContainingType containingtype, Type type, n nVar, e eVar, Class cls) {
            if (containingtype == null) {
                throw new IllegalArgumentException("Null containingTypeDefaultInstance");
            }
            if (eVar.E() == WireFormat.FieldType.MESSAGE && nVar == null) {
                throw new IllegalArgumentException("Null messageDefaultInstance");
            }
            this.f127300a = containingtype;
            this.f127301b = type;
            this.f127302c = nVar;
            this.f127303d = eVar;
            this.f127304e = cls;
            if (h.a.class.isAssignableFrom(cls)) {
                this.f127305f = GeneratedMessageLite.e(cls, "valueOf", Integer.TYPE);
            } else {
                this.f127305f = null;
            }
        }

        Object a(Object obj) {
            if (!this.f127303d.H()) {
                return e(obj);
            }
            if (this.f127303d.F() != WireFormat.JavaType.ENUM) {
                return obj;
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                arrayList.add(e(it.next()));
            }
            return arrayList;
        }

        public ContainingType b() {
            return this.f127300a;
        }

        public n c() {
            return this.f127302c;
        }

        public int d() {
            return this.f127303d.getNumber();
        }

        Object e(Object obj) {
            return this.f127303d.F() == WireFormat.JavaType.ENUM ? GeneratedMessageLite.f(this.f127305f, null, (Integer) obj) : obj;
        }

        Object f(Object obj) {
            return this.f127303d.F() == WireFormat.JavaType.ENUM ? Integer.valueOf(((h.a) obj).getNumber()) : obj;
        }
    }

    protected GeneratedMessageLite() {
    }

    protected GeneratedMessageLite(b bVar) {
    }

    static Method e(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e10) {
            String name = cls.getName();
            String strValueOf = String.valueOf(str);
            StringBuilder sb2 = new StringBuilder(name.length() + 45 + strValueOf.length());
            sb2.append("Generated message class \"");
            sb2.append(name);
            sb2.append("\" missing method \"");
            sb2.append(strValueOf);
            sb2.append("\".");
            throw new RuntimeException(sb2.toString(), e10);
        }
    }

    static Object f(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static <ContainingType extends n, Type> f<ContainingType, Type> h(ContainingType containingtype, n nVar, h.b<?> bVar, int i10, WireFormat.FieldType fieldType, boolean z10, Class cls) {
        return new f<>(containingtype, Collections.emptyList(), nVar, new e(bVar, i10, fieldType, true, z10), cls);
    }

    public static <ContainingType extends n, Type> f<ContainingType, Type> i(ContainingType containingtype, Type type, n nVar, h.b<?> bVar, int i10, WireFormat.FieldType fieldType, Class cls) {
        return new f<>(containingtype, type, nVar, new e(bVar, i10, fieldType, false, false), cls);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:4:0x0010  */
    public static <MessageType extends n> boolean k(g<e> gVar, MessageType messagetype, kotlin.reflect.jvm.internal.impl.protobuf.e eVar, CodedOutputStream codedOutputStream, kotlin.reflect.jvm.internal.impl.protobuf.f fVar, int i10) throws IOException {
        boolean z10;
        boolean z11;
        Object objBuild;
        n nVar;
        int iB = WireFormat.b(i10);
        f fVarB = fVar.b(messagetype, WireFormat.a(i10));
        if (fVarB == null) {
            z11 = false;
            z10 = true;
        } else if (iB == g.l(fVarB.f127303d.E(), false)) {
            z10 = false;
            z11 = false;
        } else {
            e eVar2 = fVarB.f127303d;
            if (eVar2.f127298e && eVar2.f127297d.isPackable() && iB == g.l(fVarB.f127303d.E(), true)) {
                z10 = false;
                z11 = true;
            } else {
                z11 = false;
                z10 = true;
            }
        }
        if (z10) {
            return eVar.P(i10, codedOutputStream);
        }
        if (z11) {
            int iJ = eVar.j(eVar.A());
            if (fVarB.f127303d.E() == WireFormat.FieldType.ENUM) {
                while (eVar.e() > 0) {
                    h.a aVarA = fVarB.f127303d.b().a(eVar.n());
                    if (aVarA == null) {
                        return true;
                    }
                    gVar.a(fVarB.f127303d, fVarB.f(aVarA));
                }
            } else {
                while (eVar.e() > 0) {
                    gVar.a(fVarB.f127303d, g.u(eVar, fVarB.f127303d.E(), false));
                }
            }
            eVar.i(iJ);
        } else {
            int i11 = a.f127291a[fVarB.f127303d.F().ordinal()];
            if (i11 == 1) {
                n.a aVarV = null;
                if (!fVarB.f127303d.H() && (nVar = (n) gVar.h(fVarB.f127303d)) != null) {
                    aVarV = nVar.t();
                }
                if (aVarV == null) {
                    aVarV = fVarB.c().v();
                }
                if (fVarB.f127303d.E() == WireFormat.FieldType.GROUP) {
                    eVar.r(fVarB.d(), aVarV, fVar);
                } else {
                    eVar.v(aVarV, fVar);
                }
                objBuild = aVarV.build();
            } else if (i11 != 2) {
                objBuild = g.u(eVar, fVarB.f127303d.E(), false);
            } else {
                int iN = eVar.n();
                h.a aVarA2 = fVarB.f127303d.b().a(iN);
                if (aVarA2 == null) {
                    codedOutputStream.o0(i10);
                    codedOutputStream.y0(iN);
                    return true;
                }
                objBuild = aVarA2;
            }
            if (fVarB.f127303d.H()) {
                gVar.a(fVarB.f127303d, fVarB.f(objBuild));
            } else {
                gVar.v(fVarB.f127303d, fVarB.f(objBuild));
            }
        }
        return true;
    }

    protected void g() {
    }

    protected boolean j(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, CodedOutputStream codedOutputStream, kotlin.reflect.jvm.internal.impl.protobuf.f fVar, int i10) throws IOException {
        return eVar.P(i10, codedOutputStream);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
    public p<? extends n> w() {
        throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
    }
}
