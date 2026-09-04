package androidx.p001datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite.b;
import androidx.p001datastore.preferences.protobuf.GeneratedMessageLite;
import com.huawei.agconnect.config.impl.Utils;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes6.dex */
public abstract class GeneratedMessageLite<MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends b<MessageType, BuilderType>> extends androidx.p001datastore.preferences.protobuf.a<MessageType, BuilderType> {
    private static Map<Object, GeneratedMessageLite<?, ?>> defaultInstanceMap = new ConcurrentHashMap();
    protected w3 unknownFields = w3.e();
    protected int memoizedSerializedSize = -1;

    public enum MethodToInvoke {
        GET_MEMOIZED_IS_INITIALIZED,
        SET_MEMOIZED_IS_INITIALIZED,
        BUILD_MESSAGE_INFO,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER
    }

    public static final class SerializedForm implements Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Class<?> f22293b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f22294c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final byte[] f22295d;

        SerializedForm(z1 z1Var) {
            Class<?> cls = z1Var.getClass();
            this.f22293b = cls;
            this.f22294c = cls.getName();
            this.f22295d = z1Var.k();
        }

        public static SerializedForm a(z1 z1Var) {
            return new SerializedForm(z1Var);
        }

        @Deprecated
        private Object c() throws ObjectStreamException {
            try {
                Field declaredField = d().getDeclaredField("defaultInstance");
                declaredField.setAccessible(true);
                return ((z1) declaredField.get(null)).v().a0(this.f22295d).a1();
            } catch (InvalidProtocolBufferException e10) {
                throw new RuntimeException("Unable to understand proto buffer", e10);
            } catch (ClassNotFoundException e11) {
                throw new RuntimeException("Unable to find proto buffer class: " + this.f22294c, e11);
            } catch (IllegalAccessException e12) {
                throw new RuntimeException("Unable to call parsePartialFrom", e12);
            } catch (NoSuchFieldException e13) {
                throw new RuntimeException("Unable to find defaultInstance in " + this.f22294c, e13);
            } catch (SecurityException e14) {
                throw new RuntimeException("Unable to call defaultInstance in " + this.f22294c, e14);
            }
        }

        private Class<?> d() throws ClassNotFoundException {
            Class<?> cls = this.f22293b;
            return cls != null ? cls : Class.forName(this.f22294c);
        }

        protected Object b() throws ObjectStreamException {
            try {
                Field declaredField = d().getDeclaredField(Utils.DEFAULT_NAME);
                declaredField.setAccessible(true);
                return ((z1) declaredField.get(null)).v().a0(this.f22295d).a1();
            } catch (InvalidProtocolBufferException e10) {
                throw new RuntimeException("Unable to understand proto buffer", e10);
            } catch (ClassNotFoundException e11) {
                throw new RuntimeException("Unable to find proto buffer class: " + this.f22294c, e11);
            } catch (IllegalAccessException e12) {
                throw new RuntimeException("Unable to call parsePartialFrom", e12);
            } catch (NoSuchFieldException unused) {
                return c();
            } catch (SecurityException e13) {
                throw new RuntimeException("Unable to call DEFAULT_INSTANCE in " + this.f22294c, e13);
            }
        }
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f22296a;

        static {
            int[] iArr = new int[WireFormat.JavaType.values().length];
            f22296a = iArr;
            try {
                iArr[WireFormat.JavaType.MESSAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22296a[WireFormat.JavaType.ENUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static abstract class b<MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends b<MessageType, BuilderType>> extends androidx.p001datastore.preferences.protobuf.a.AbstractC0159a<MessageType, BuilderType> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final MessageType f22297b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        protected MessageType f22298c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        protected boolean f22299d = false;

        protected b(MessageType messagetype) {
            this.f22297b = messagetype;
            this.f22298c = (MessageType) messagetype.H1(MethodToInvoke.NEW_MUTABLE_INSTANCE);
        }

        private void a2(MessageType messagetype, MessageType messagetype2) {
            r2.a().j(messagetype).a(messagetype, messagetype2);
        }

        @Override // androidx.datastore.preferences.protobuf.z1.a
        /* JADX INFO: renamed from: O1, reason: merged with bridge method [inline-methods] */
        public final MessageType build() {
            MessageType messagetype = (MessageType) a1();
            if (messagetype.l()) {
                return messagetype;
            }
            throw androidx.p001datastore.preferences.protobuf.a.AbstractC0159a.N1(messagetype);
        }

        @Override // androidx.datastore.preferences.protobuf.z1.a
        /* JADX INFO: renamed from: Q1, reason: merged with bridge method [inline-methods] */
        public MessageType a1() {
            if (this.f22299d) {
                return this.f22298c;
            }
            this.f22298c.Y1();
            this.f22299d = true;
            return this.f22298c;
        }

        @Override // androidx.datastore.preferences.protobuf.z1.a
        /* JADX INFO: renamed from: R1, reason: merged with bridge method [inline-methods] */
        public final BuilderType clear() {
            this.f22298c = (MessageType) this.f22298c.H1(MethodToInvoke.NEW_MUTABLE_INSTANCE);
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.p001datastore.preferences.protobuf.a.AbstractC0159a
        /* JADX INFO: renamed from: S1, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public BuilderType mo8clone() {
            c0.b bVar = (BuilderType) r().v();
            bVar.X1(a1());
            return bVar;
        }

        protected void T1() {
            if (this.f22299d) {
                MessageType messagetype = (MessageType) this.f22298c.H1(MethodToInvoke.NEW_MUTABLE_INSTANCE);
                a2(messagetype, this.f22298c);
                this.f22298c = messagetype;
                this.f22299d = false;
            }
        }

        @Override // androidx.p001datastore.preferences.protobuf.a2
        /* JADX INFO: renamed from: U1, reason: merged with bridge method [inline-methods] */
        public MessageType r() {
            return this.f22297b;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.p001datastore.preferences.protobuf.a.AbstractC0159a
        /* JADX INFO: renamed from: V1, reason: merged with bridge method [inline-methods] */
        public BuilderType A1(MessageType messagetype) {
            return (BuilderType) X1(messagetype);
        }

        @Override // androidx.p001datastore.preferences.protobuf.a.AbstractC0159a, androidx.datastore.preferences.protobuf.z1.a
        /* JADX INFO: renamed from: W1, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public BuilderType b1(w wVar, p0 p0Var) throws IOException {
            T1();
            try {
                r2.a().j(this.f22298c).e(this.f22298c, x.S(wVar), p0Var);
                return this;
            } catch (RuntimeException e10) {
                if (e10.getCause() instanceof IOException) {
                    throw ((IOException) e10.getCause());
                }
                throw e10;
            }
        }

        public BuilderType X1(MessageType messagetype) {
            T1();
            a2(this.f22298c, messagetype);
            return this;
        }

        @Override // androidx.p001datastore.preferences.protobuf.a.AbstractC0159a, androidx.datastore.preferences.protobuf.z1.a
        /* JADX INFO: renamed from: Y1, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public BuilderType P1(byte[] bArr, int i10, int i11) throws InvalidProtocolBufferException {
            return (BuilderType) G0(bArr, i10, i11, p0.d());
        }

        @Override // androidx.p001datastore.preferences.protobuf.a.AbstractC0159a
        /* JADX INFO: renamed from: Z1, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public BuilderType K1(byte[] bArr, int i10, int i11, p0 p0Var) throws InvalidProtocolBufferException {
            T1();
            try {
                r2.a().j(this.f22298c).j(this.f22298c, bArr, i10, i10 + i11, new l.b(p0Var));
                return this;
            } catch (InvalidProtocolBufferException e10) {
                throw e10;
            } catch (IOException e11) {
                throw new RuntimeException("Reading from byte array should not throw IOException.", e11);
            } catch (IndexOutOfBoundsException unused) {
                throw InvalidProtocolBufferException.l();
            }
        }

        @Override // androidx.p001datastore.preferences.protobuf.a2
        public final boolean l() {
            return GeneratedMessageLite.X1(this.f22298c, false);
        }
    }

    public static class c<T extends GeneratedMessageLite<T, ?>> extends androidx.p001datastore.preferences.protobuf.b<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final T f22300b;

        public c(T t10) {
            this.f22300b = t10;
        }

        @Override // androidx.p001datastore.preferences.protobuf.p2
        /* JADX INFO: renamed from: b0, reason: merged with bridge method [inline-methods] */
        public T o(w wVar, p0 p0Var) throws InvalidProtocolBufferException {
            return (T) GeneratedMessageLite.B2(this.f22300b, wVar, p0Var);
        }

        @Override // androidx.p001datastore.preferences.protobuf.b, androidx.p001datastore.preferences.protobuf.p2
        /* JADX INFO: renamed from: c0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public T h(byte[] bArr, int i10, int i11, p0 p0Var) throws InvalidProtocolBufferException {
            return (T) GeneratedMessageLite.C2(this.f22300b, bArr, i10, i11, p0Var);
        }
    }

    public static abstract class d<MessageType extends e<MessageType, BuilderType>, BuilderType extends d<MessageType, BuilderType>> extends b<MessageType, BuilderType> implements f<MessageType, BuilderType> {
        protected d(MessageType messagetype) {
            super(messagetype);
        }

        private y0<g> e2() {
            y0<g> y0Var = ((e) this.f22298c).extensions;
            if (!y0Var.D()) {
                return y0Var;
            }
            y0 y0VarK = y0Var.clone();
            ((e) this.f22298c).extensions = y0VarK;
            return y0VarK;
        }

        private void i2(h<MessageType, ?> hVar) {
            if (hVar.h() != r()) {
                throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
            }
        }

        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite.f
        public final <Type> Type T(n0<MessageType, List<Type>> n0Var, int i10) {
            return (Type) ((e) this.f22298c).T(n0Var, i10);
        }

        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite.f
        public final <Type> boolean T0(n0<MessageType, Type> n0Var) {
            return ((e) this.f22298c).T0(n0Var);
        }

        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite.b
        protected void T1() {
            if (this.f22299d) {
                super.T1();
                MessageType messagetype = this.f22298c;
                ((e) messagetype).extensions = ((e) messagetype).extensions.clone();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite.f
        public final <Type> int X0(n0<MessageType, List<Type>> n0Var) {
            return ((e) this.f22298c).X0(n0Var);
        }

        public final <Type> BuilderType b2(n0<MessageType, List<Type>> n0Var, Type type) {
            h<MessageType, ?> hVarD1 = GeneratedMessageLite.D1(n0Var);
            i2(hVarD1);
            T1();
            e2().h(hVarD1.f22313d, hVarD1.j(type));
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite.b, androidx.datastore.preferences.protobuf.z1.a
        /* JADX INFO: renamed from: c2, reason: merged with bridge method [inline-methods] */
        public final MessageType a1() {
            if (this.f22299d) {
                return (MessageType) this.f22298c;
            }
            ((e) this.f22298c).extensions.I();
            return (MessageType) super.a1();
        }

        public final <Type> BuilderType d2(n0<MessageType, ?> n0Var) {
            h<MessageType, ?> hVarD1 = GeneratedMessageLite.D1(n0Var);
            i2(hVarD1);
            T1();
            e2().j(hVarD1.f22313d);
            return this;
        }

        void f2(y0<g> y0Var) {
            T1();
            ((e) this.f22298c).extensions = y0Var;
        }

        public final <Type> BuilderType g2(n0<MessageType, List<Type>> n0Var, int i10, Type type) {
            h<MessageType, ?> hVarD1 = GeneratedMessageLite.D1(n0Var);
            i2(hVarD1);
            T1();
            e2().P(hVarD1.f22313d, i10, hVarD1.j(type));
            return this;
        }

        public final <Type> BuilderType h2(n0<MessageType, Type> n0Var, Type type) {
            h<MessageType, ?> hVarD1 = GeneratedMessageLite.D1(n0Var);
            i2(hVarD1);
            T1();
            e2().O(hVarD1.f22313d, hVarD1.k(type));
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite.f
        public final <Type> Type w0(n0<MessageType, Type> n0Var) {
            return (Type) ((e) this.f22298c).w0(n0Var);
        }
    }

    public static abstract class e<MessageType extends e<MessageType, BuilderType>, BuilderType extends d<MessageType, BuilderType>> extends GeneratedMessageLite<MessageType, BuilderType> implements f<MessageType, BuilderType> {
        protected y0<g> extensions = y0.s();

        public class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Iterator<Map.Entry<g, Object>> f22301a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private Map.Entry<g, Object> f22302b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final boolean f22303c;

            private a(boolean z10) {
                Iterator itH = e.this.extensions.H();
                this.f22301a = itH;
                if (itH.hasNext()) {
                    this.f22302b = (Map.Entry) itH.next();
                }
                this.f22303c = z10;
            }

            /* synthetic */ a(e eVar, boolean z10, a aVar) {
                this(z10);
            }

            public void a(int i10, CodedOutputStream codedOutputStream) throws IOException {
                while (true) {
                    Map.Entry<g, Object> entry = this.f22302b;
                    if (entry == null || entry.getKey().getNumber() >= i10) {
                        return;
                    }
                    g key = this.f22302b.getKey();
                    if (this.f22303c && key.F() == WireFormat.JavaType.MESSAGE && !key.H()) {
                        codedOutputStream.P1(key.getNumber(), (z1) this.f22302b.getValue());
                    } else {
                        y0.T(key, this.f22302b.getValue(), codedOutputStream);
                    }
                    if (this.f22301a.hasNext()) {
                        this.f22302b = this.f22301a.next();
                    } else {
                        this.f22302b = null;
                    }
                }
            }
        }

        private void H2(w wVar, h<?, ?> hVar, p0 p0Var, int i10) throws IOException {
            R2(wVar, p0Var, hVar, WireFormat.c(i10, 2), i10);
        }

        private void N2(ByteString byteString, p0 p0Var, h<?, ?> hVar) throws IOException {
            z1 z1Var = (z1) this.extensions.u(hVar.f22313d);
            z1.a aVarT = z1Var != null ? z1Var.t() : null;
            if (aVarT == null) {
                aVarT = hVar.c().v();
            }
            aVarT.h1(byteString, p0Var);
            I2().O(hVar.f22313d, hVar.j(aVarT.build()));
        }

        private <MessageType extends z1> void O2(MessageType messagetype, w wVar, p0 p0Var) throws IOException {
            int iZ = 0;
            ByteString byteStringX = null;
            h<?, ?> hVarC = null;
            while (true) {
                int iY = wVar.Y();
                if (iY == 0) {
                    break;
                }
                if (iY == WireFormat.f22367s) {
                    iZ = wVar.Z();
                    if (iZ != 0) {
                        hVarC = p0Var.c(messagetype, iZ);
                    }
                } else if (iY == WireFormat.f22368t) {
                    if (iZ == 0 || hVarC == null) {
                        byteStringX = wVar.x();
                    } else {
                        H2(wVar, hVarC, p0Var, iZ);
                        byteStringX = null;
                    }
                } else if (!wVar.g0(iY)) {
                    break;
                }
            }
            wVar.a(WireFormat.f22366r);
            if (byteStringX == null || iZ == 0) {
                return;
            }
            if (hVarC != null) {
                N2(byteStringX, p0Var, hVarC);
            } else {
                Z1(iZ, byteStringX);
            }
        }

        /* JADX WARN: Code duplicated, block: B:4:0x0008  */
        private boolean R2(w wVar, p0 p0Var, h<?, ?> hVar, int i10, int i11) throws IOException {
            boolean z10;
            boolean z11;
            Object objBuild;
            z1 z1Var;
            int iB = WireFormat.b(i10);
            if (hVar == null) {
                z11 = false;
                z10 = true;
            } else if (iB == y0.A(hVar.f22313d.E(), false)) {
                z10 = false;
                z11 = false;
            } else {
                g gVar = hVar.f22313d;
                if (gVar.f22308e && gVar.f22307d.isPackable() && iB == y0.A(hVar.f22313d.E(), true)) {
                    z10 = false;
                    z11 = true;
                } else {
                    z11 = false;
                    z10 = true;
                }
            }
            if (z10) {
                return E2(i10, wVar);
            }
            I2();
            if (z11) {
                int iT = wVar.t(wVar.N());
                if (hVar.f22313d.E() == WireFormat.FieldType.ENUM) {
                    while (wVar.f() > 0) {
                        i1.c cVarA = hVar.f22313d.F0().a(wVar.z());
                        if (cVarA == null) {
                            return true;
                        }
                        this.extensions.h(hVar.f22313d, hVar.j(cVarA));
                    }
                } else {
                    while (wVar.f() > 0) {
                        this.extensions.h(hVar.f22313d, y0.N(wVar, hVar.f22313d.E(), false));
                    }
                }
                wVar.s(iT);
            } else {
                int i12 = a.f22296a[hVar.f22313d.F().ordinal()];
                if (i12 == 1) {
                    z1.a aVarV = null;
                    if (!hVar.f22313d.H() && (z1Var = (z1) this.extensions.u(hVar.f22313d)) != null) {
                        aVarV = z1Var.t();
                    }
                    if (aVarV == null) {
                        aVarV = hVar.c().v();
                    }
                    if (hVar.f22313d.E() == WireFormat.FieldType.GROUP) {
                        wVar.E(hVar.d(), aVarV, p0Var);
                    } else {
                        wVar.I(aVarV, p0Var);
                    }
                    objBuild = aVarV.build();
                } else if (i12 != 2) {
                    objBuild = y0.N(wVar, hVar.f22313d.E(), false);
                } else {
                    int iZ = wVar.z();
                    i1.c cVarA2 = hVar.f22313d.F0().a(iZ);
                    if (cVarA2 == null) {
                        b2(i11, iZ);
                        return true;
                    }
                    objBuild = cVarA2;
                }
                if (hVar.f22313d.H()) {
                    this.extensions.h(hVar.f22313d, hVar.j(objBuild));
                } else {
                    this.extensions.O(hVar.f22313d, hVar.j(objBuild));
                }
            }
            return true;
        }

        private void U2(h<MessageType, ?> hVar) {
            if (hVar.h() != r()) {
                throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
            }
        }

        y0<g> I2() {
            if (this.extensions.D()) {
                this.extensions = this.extensions.clone();
            }
            return this.extensions;
        }

        protected boolean J2() {
            return this.extensions.E();
        }

        protected int K2() {
            return this.extensions.z();
        }

        protected int L2() {
            return this.extensions.v();
        }

        protected final void M2(MessageType messagetype) {
            if (this.extensions.D()) {
                this.extensions = this.extensions.clone();
            }
            this.extensions.J(messagetype.extensions);
        }

        protected e<MessageType, BuilderType>.a P2() {
            return new a(this, false, null);
        }

        protected e<MessageType, BuilderType>.a Q2() {
            return new a(this, true, null);
        }

        protected <MessageType extends z1> boolean S2(MessageType messagetype, w wVar, p0 p0Var, int i10) throws IOException {
            int iA = WireFormat.a(i10);
            return R2(wVar, p0Var, p0Var.c(messagetype, iA), i10, iA);
        }

        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite.f
        public final <Type> Type T(n0<MessageType, List<Type>> n0Var, int i10) {
            h<MessageType, ?> hVarD1 = GeneratedMessageLite.D1(n0Var);
            U2(hVarD1);
            return (Type) hVarD1.i(this.extensions.x(hVarD1.f22313d, i10));
        }

        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite.f
        public final <Type> boolean T0(n0<MessageType, Type> n0Var) {
            h<MessageType, ?> hVarD1 = GeneratedMessageLite.D1(n0Var);
            U2(hVarD1);
            return this.extensions.B(hVarD1.f22313d);
        }

        protected <MessageType extends z1> boolean T2(MessageType messagetype, w wVar, p0 p0Var, int i10) throws IOException {
            if (i10 != WireFormat.f22365q) {
                return WireFormat.b(i10) == 2 ? S2(messagetype, wVar, p0Var, i10) : wVar.g0(i10);
            }
            O2(messagetype, wVar, p0Var);
            return true;
        }

        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite.f
        public final <Type> int X0(n0<MessageType, List<Type>> n0Var) {
            h<MessageType, ?> hVarD1 = GeneratedMessageLite.D1(n0Var);
            U2(hVarD1);
            return this.extensions.y(hVarD1.f22313d);
        }

        @Override // androidx.p001datastore.preferences.protobuf.GeneratedMessageLite, androidx.p001datastore.preferences.protobuf.a2
        public /* bridge */ /* synthetic */ z1 r() {
            return super.r();
        }

        @Override // androidx.p001datastore.preferences.protobuf.GeneratedMessageLite, androidx.p001datastore.preferences.protobuf.z1
        public /* bridge */ /* synthetic */ z1.a t() {
            return super.t();
        }

        @Override // androidx.p001datastore.preferences.protobuf.GeneratedMessageLite, androidx.p001datastore.preferences.protobuf.z1
        public /* bridge */ /* synthetic */ z1.a v() {
            return super.v();
        }

        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite.f
        public final <Type> Type w0(n0<MessageType, Type> n0Var) {
            h<MessageType, ?> hVarD1 = GeneratedMessageLite.D1(n0Var);
            U2(hVarD1);
            Object objU = this.extensions.u(hVarD1.f22313d);
            return objU == null ? hVarD1.f22311b : (Type) hVarD1.g(objU);
        }
    }

    public interface f<MessageType extends e<MessageType, BuilderType>, BuilderType extends d<MessageType, BuilderType>> extends a2 {
        <Type> Type T(n0<MessageType, List<Type>> n0Var, int i10);

        <Type> boolean T0(n0<MessageType, Type> n0Var);

        <Type> int X0(n0<MessageType, List<Type>> n0Var);

        <Type> Type w0(n0<MessageType, Type> n0Var);
    }

    public static final class g implements y0.c<g> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final i1.d<?> f22305b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f22306c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final WireFormat.FieldType f22307d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final boolean f22308e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final boolean f22309f;

        g(i1.d<?> dVar, int i10, WireFormat.FieldType fieldType, boolean z10, boolean z11) {
            this.f22305b = dVar;
            this.f22306c = i10;
            this.f22307d = fieldType;
            this.f22308e = z10;
            this.f22309f = z11;
        }

        @Override // androidx.datastore.preferences.protobuf.y0.c
        public WireFormat.FieldType E() {
            return this.f22307d;
        }

        @Override // androidx.datastore.preferences.protobuf.y0.c
        public WireFormat.JavaType F() {
            return this.f22307d.getJavaType();
        }

        @Override // androidx.datastore.preferences.protobuf.y0.c
        public i1.d<?> F0() {
            return this.f22305b;
        }

        @Override // androidx.datastore.preferences.protobuf.y0.c
        public boolean H() {
            return this.f22308e;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.datastore.preferences.protobuf.y0.c
        public z1.a T(z1.a aVar, z1 z1Var) {
            return ((b) aVar).X1((GeneratedMessageLite) z1Var);
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(g gVar) {
            return this.f22306c - gVar.f22306c;
        }

        @Override // androidx.datastore.preferences.protobuf.y0.c
        public int getNumber() {
            return this.f22306c;
        }

        @Override // androidx.datastore.preferences.protobuf.y0.c
        public boolean isPacked() {
            return this.f22309f;
        }
    }

    public static class h<ContainingType extends z1, Type> extends n0<ContainingType, Type> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final ContainingType f22310a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Type f22311b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final z1 f22312c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final g f22313d;

        h(ContainingType containingtype, Type type, z1 z1Var, g gVar, Class cls) {
            if (containingtype == null) {
                throw new IllegalArgumentException("Null containingTypeDefaultInstance");
            }
            if (gVar.E() == WireFormat.FieldType.MESSAGE && z1Var == null) {
                throw new IllegalArgumentException("Null messageDefaultInstance");
            }
            this.f22310a = containingtype;
            this.f22311b = type;
            this.f22312c = z1Var;
            this.f22313d = gVar;
        }

        @Override // androidx.p001datastore.preferences.protobuf.n0
        public Type a() {
            return this.f22311b;
        }

        @Override // androidx.p001datastore.preferences.protobuf.n0
        public WireFormat.FieldType b() {
            return this.f22313d.E();
        }

        @Override // androidx.p001datastore.preferences.protobuf.n0
        public z1 c() {
            return this.f22312c;
        }

        @Override // androidx.p001datastore.preferences.protobuf.n0
        public int d() {
            return this.f22313d.getNumber();
        }

        @Override // androidx.p001datastore.preferences.protobuf.n0
        public boolean f() {
            return this.f22313d.f22308e;
        }

        Object g(Object obj) {
            if (!this.f22313d.H()) {
                return i(obj);
            }
            if (this.f22313d.F() != WireFormat.JavaType.ENUM) {
                return obj;
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                arrayList.add(i(it.next()));
            }
            return arrayList;
        }

        public ContainingType h() {
            return this.f22310a;
        }

        Object i(Object obj) {
            return this.f22313d.F() == WireFormat.JavaType.ENUM ? this.f22313d.f22305b.a(((Integer) obj).intValue()) : obj;
        }

        Object j(Object obj) {
            return this.f22313d.F() == WireFormat.JavaType.ENUM ? Integer.valueOf(((i1.c) obj).getNumber()) : obj;
        }

        Object k(Object obj) {
            if (!this.f22313d.H()) {
                return j(obj);
            }
            if (this.f22313d.F() != WireFormat.JavaType.ENUM) {
                return obj;
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                arrayList.add(j(it.next()));
            }
            return arrayList;
        }
    }

    protected static <T extends GeneratedMessageLite<T, ?>> T A2(T t10, w wVar) throws InvalidProtocolBufferException {
        return (T) B2(t10, wVar, p0.d());
    }

    static <T extends GeneratedMessageLite<T, ?>> T B2(T t10, w wVar, p0 p0Var) throws InvalidProtocolBufferException {
        T t11 = (T) t10.H1(MethodToInvoke.NEW_MUTABLE_INSTANCE);
        try {
            x2 x2VarJ = r2.a().j(t11);
            x2VarJ.e(t11, x.S(wVar), p0Var);
            x2VarJ.f(t11);
            return t11;
        } catch (IOException e10) {
            if (e10.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e10.getCause());
            }
            throw new InvalidProtocolBufferException(e10.getMessage()).j(t11);
        } catch (RuntimeException e11) {
            if (e11.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e11.getCause());
            }
            throw e11;
        }
    }

    static <T extends GeneratedMessageLite<T, ?>> T C2(T t10, byte[] bArr, int i10, int i11, p0 p0Var) throws InvalidProtocolBufferException {
        T t11 = (T) t10.H1(MethodToInvoke.NEW_MUTABLE_INSTANCE);
        try {
            x2 x2VarJ = r2.a().j(t11);
            x2VarJ.j(t11, bArr, i10, i10 + i11, new l.b(p0Var));
            x2VarJ.f(t11);
            if (t11.memoizedHashCode == 0) {
                return t11;
            }
            throw new RuntimeException();
        } catch (IOException e10) {
            if (e10.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e10.getCause());
            }
            throw new InvalidProtocolBufferException(e10.getMessage()).j(t11);
        } catch (IndexOutOfBoundsException unused) {
            throw InvalidProtocolBufferException.l().j(t11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <MessageType extends e<MessageType, BuilderType>, BuilderType extends d<MessageType, BuilderType>, T> h<MessageType, T> D1(n0<MessageType, T> n0Var) {
        if (n0Var.e()) {
            return (h) n0Var;
        }
        throw new IllegalArgumentException("Expected a lite extension.");
    }

    private static <T extends GeneratedMessageLite<T, ?>> T D2(T t10, byte[] bArr, p0 p0Var) throws InvalidProtocolBufferException {
        return (T) E1(C2(t10, bArr, 0, bArr.length, p0Var));
    }

    private static <T extends GeneratedMessageLite<T, ?>> T E1(T t10) throws InvalidProtocolBufferException {
        if (t10 == null || t10.l()) {
            return t10;
        }
        throw t10.z1().a().j(t10);
    }

    protected static <T extends GeneratedMessageLite<?, ?>> void F2(Class<T> cls, T t10) {
        defaultInstanceMap.put(cls, t10);
    }

    protected static i1.a K1() {
        return q.h();
    }

    protected static i1.b L1() {
        return z.h();
    }

    protected static i1.f N1() {
        return z0.h();
    }

    protected static i1.g O1() {
        return h1.h();
    }

    protected static i1.i Q1() {
        return r1.h();
    }

    protected static <E> i1.k<E> R1() {
        return s2.e();
    }

    private final void S1() {
        if (this.unknownFields == w3.e()) {
            this.unknownFields = w3.p();
        }
    }

    static <T extends GeneratedMessageLite<?, ?>> T T1(Class<T> cls) {
        GeneratedMessageLite<?, ?> generatedMessageLite = defaultInstanceMap.get(cls);
        if (generatedMessageLite == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                generatedMessageLite = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (generatedMessageLite == null) {
            generatedMessageLite = (T) ((GeneratedMessageLite) z3.j(cls)).r();
            if (generatedMessageLite == null) {
                throw new IllegalStateException();
            }
            defaultInstanceMap.put(cls, generatedMessageLite);
        }
        return (T) generatedMessageLite;
    }

    static Method V1(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e10) {
            throw new RuntimeException("Generated message class \"" + cls.getName() + "\" missing method \"" + str + "\".", e10);
        }
    }

    static Object W1(Method method, Object obj, Object... objArr) {
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

    protected static final <T extends GeneratedMessageLite<T, ?>> boolean X1(T t10, boolean z10) {
        byte bByteValue = ((Byte) t10.H1(MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zB = r2.a().j(t10).b(t10);
        if (z10) {
            t10.I1(MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED, zB ? t10 : null);
        }
        return zB;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.datastore.preferences.protobuf.i1$a] */
    protected static i1.a c2(i1.a aVar) {
        int size = aVar.size();
        return aVar.d2(size == 0 ? 10 : size * 2);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.datastore.preferences.protobuf.i1$b] */
    protected static i1.b d2(i1.b bVar) {
        int size = bVar.size();
        return bVar.d2(size == 0 ? 10 : size * 2);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.datastore.preferences.protobuf.i1$f] */
    protected static i1.f e2(i1.f fVar) {
        int size = fVar.size();
        return fVar.d2(size == 0 ? 10 : size * 2);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.datastore.preferences.protobuf.i1$g] */
    protected static i1.g f2(i1.g gVar) {
        int size = gVar.size();
        return gVar.d2(size == 0 ? 10 : size * 2);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.datastore.preferences.protobuf.i1$i] */
    protected static i1.i g2(i1.i iVar) {
        int size = iVar.size();
        return iVar.d2(size == 0 ? 10 : size * 2);
    }

    protected static <E> i1.k<E> h2(i1.k<E> kVar) {
        int size = kVar.size();
        return kVar.d2(size == 0 ? 10 : size * 2);
    }

    protected static Object j2(z1 z1Var, String str, Object[] objArr) {
        return new v2(z1Var, str, objArr);
    }

    public static <ContainingType extends z1, Type> h<ContainingType, Type> k2(ContainingType containingtype, z1 z1Var, i1.d<?> dVar, int i10, WireFormat.FieldType fieldType, boolean z10, Class cls) {
        return new h<>(containingtype, Collections.emptyList(), z1Var, new g(dVar, i10, fieldType, true, z10), cls);
    }

    public static <ContainingType extends z1, Type> h<ContainingType, Type> l2(ContainingType containingtype, Type type, z1 z1Var, i1.d<?> dVar, int i10, WireFormat.FieldType fieldType, Class cls) {
        return new h<>(containingtype, type, z1Var, new g(dVar, i10, fieldType, false, false), cls);
    }

    protected static <T extends GeneratedMessageLite<T, ?>> T m2(T t10, InputStream inputStream) throws InvalidProtocolBufferException {
        return (T) E1(y2(t10, inputStream, p0.d()));
    }

    protected static <T extends GeneratedMessageLite<T, ?>> T n2(T t10, InputStream inputStream, p0 p0Var) throws InvalidProtocolBufferException {
        return (T) E1(y2(t10, inputStream, p0Var));
    }

    protected static <T extends GeneratedMessageLite<T, ?>> T o2(T t10, ByteString byteString) throws InvalidProtocolBufferException {
        return (T) E1(p2(t10, byteString, p0.d()));
    }

    protected static <T extends GeneratedMessageLite<T, ?>> T p2(T t10, ByteString byteString, p0 p0Var) throws InvalidProtocolBufferException {
        return (T) E1(z2(t10, byteString, p0Var));
    }

    protected static <T extends GeneratedMessageLite<T, ?>> T q2(T t10, w wVar) throws InvalidProtocolBufferException {
        return (T) r2(t10, wVar, p0.d());
    }

    protected static <T extends GeneratedMessageLite<T, ?>> T r2(T t10, w wVar, p0 p0Var) throws InvalidProtocolBufferException {
        return (T) E1(B2(t10, wVar, p0Var));
    }

    protected static <T extends GeneratedMessageLite<T, ?>> T s2(T t10, InputStream inputStream) throws InvalidProtocolBufferException {
        return (T) E1(B2(t10, w.j(inputStream), p0.d()));
    }

    protected static <T extends GeneratedMessageLite<T, ?>> T t2(T t10, InputStream inputStream, p0 p0Var) throws InvalidProtocolBufferException {
        return (T) E1(B2(t10, w.j(inputStream), p0Var));
    }

    protected static <T extends GeneratedMessageLite<T, ?>> T u2(T t10, ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (T) v2(t10, byteBuffer, p0.d());
    }

    protected static <T extends GeneratedMessageLite<T, ?>> T v2(T t10, ByteBuffer byteBuffer, p0 p0Var) throws InvalidProtocolBufferException {
        return (T) E1(r2(t10, w.n(byteBuffer), p0Var));
    }

    protected static <T extends GeneratedMessageLite<T, ?>> T w2(T t10, byte[] bArr) throws InvalidProtocolBufferException {
        return (T) E1(C2(t10, bArr, 0, bArr.length, p0.d()));
    }

    protected static <T extends GeneratedMessageLite<T, ?>> T x2(T t10, byte[] bArr, p0 p0Var) throws InvalidProtocolBufferException {
        return (T) E1(C2(t10, bArr, 0, bArr.length, p0Var));
    }

    private static <T extends GeneratedMessageLite<T, ?>> T y2(T t10, InputStream inputStream, p0 p0Var) throws InvalidProtocolBufferException {
        try {
            int i10 = inputStream.read();
            if (i10 == -1) {
                return null;
            }
            w wVarJ = w.j(new androidx.p001datastore.preferences.protobuf.a.AbstractC0159a.C0160a(inputStream, w.O(i10, inputStream)));
            T t11 = (T) B2(t10, wVarJ, p0Var);
            try {
                wVarJ.a(0);
                return t11;
            } catch (InvalidProtocolBufferException e10) {
                throw e10.j(t11);
            }
        } catch (IOException e11) {
            throw new InvalidProtocolBufferException(e11.getMessage());
        }
    }

    private static <T extends GeneratedMessageLite<T, ?>> T z2(T t10, ByteString byteString, p0 p0Var) throws InvalidProtocolBufferException {
        try {
            w wVarL = byteString.L();
            T t11 = (T) B2(t10, wVarL, p0Var);
            try {
                wVarL.a(0);
                return t11;
            } catch (InvalidProtocolBufferException e10) {
                throw e10.j(t11);
            }
        } catch (InvalidProtocolBufferException e11) {
            throw e11;
        }
    }

    @Override // androidx.p001datastore.preferences.protobuf.a
    void A1(int i10) {
        this.memoizedSerializedSize = i10;
    }

    Object C1() throws Exception {
        return H1(MethodToInvoke.BUILD_MESSAGE_INFO);
    }

    protected boolean E2(int i10, w wVar) throws IOException {
        if (WireFormat.b(i10) == 4) {
            return false;
        }
        S1();
        return this.unknownFields.k(i10, wVar);
    }

    protected final <MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends b<MessageType, BuilderType>> BuilderType F1() {
        return (BuilderType) H1(MethodToInvoke.NEW_BUILDER);
    }

    protected final <MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends b<MessageType, BuilderType>> BuilderType G1(MessageType messagetype) {
        return (BuilderType) F1().X1(messagetype);
    }

    @Override // androidx.p001datastore.preferences.protobuf.z1
    /* JADX INFO: renamed from: G2, reason: merged with bridge method [inline-methods] */
    public final BuilderType t() {
        BuilderType buildertype = (BuilderType) H1(MethodToInvoke.NEW_BUILDER);
        buildertype.X1(this);
        return buildertype;
    }

    protected Object H1(MethodToInvoke methodToInvoke) {
        return J1(methodToInvoke, null, null);
    }

    protected Object I1(MethodToInvoke methodToInvoke, Object obj) {
        return J1(methodToInvoke, obj, null);
    }

    protected abstract Object J1(MethodToInvoke methodToInvoke, Object obj, Object obj2);

    @Override // androidx.p001datastore.preferences.protobuf.a2
    /* JADX INFO: renamed from: U1, reason: merged with bridge method [inline-methods] */
    public final MessageType r() {
        return (MessageType) H1(MethodToInvoke.GET_DEFAULT_INSTANCE);
    }

    protected void Y1() {
        r2.a().j(this).f(this);
    }

    protected void Z1(int i10, ByteString byteString) {
        S1();
        this.unknownFields.m(i10, byteString);
    }

    protected final void a2(w3 w3Var) {
        this.unknownFields = w3.o(this.unknownFields, w3Var);
    }

    protected void b2(int i10, int i11) {
        S1();
        this.unknownFields.n(i10, i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (r().getClass().isInstance(obj)) {
            return r2.a().j(this).d(this, (GeneratedMessageLite) obj);
        }
        return false;
    }

    public int hashCode() {
        int i10 = this.memoizedHashCode;
        if (i10 != 0) {
            return i10;
        }
        int i11 = r2.a().j(this).i(this);
        this.memoizedHashCode = i11;
        return i11;
    }

    @Override // androidx.p001datastore.preferences.protobuf.z1
    /* JADX INFO: renamed from: i2, reason: merged with bridge method [inline-methods] */
    public final BuilderType v() {
        return (BuilderType) H1(MethodToInvoke.NEW_BUILDER);
    }

    @Override // androidx.p001datastore.preferences.protobuf.a2
    public final boolean l() {
        return X1(this, true);
    }

    @Override // androidx.p001datastore.preferences.protobuf.z1
    public void l0(CodedOutputStream codedOutputStream) throws IOException {
        r2.a().j(this).c(this, y.T(codedOutputStream));
    }

    public String toString() {
        return b2.e(this, super.toString());
    }

    @Override // androidx.p001datastore.preferences.protobuf.z1
    public int u() {
        if (this.memoizedSerializedSize == -1) {
            this.memoizedSerializedSize = r2.a().j(this).g(this);
        }
        return this.memoizedSerializedSize;
    }

    @Override // androidx.p001datastore.preferences.protobuf.z1
    public final p2<MessageType> w() {
        return (p2) H1(MethodToInvoke.GET_PARSER);
    }

    @Override // androidx.p001datastore.preferences.protobuf.a
    int w1() {
        return this.memoizedSerializedSize;
    }
}
