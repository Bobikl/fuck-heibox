package kotlin.reflect.jvm.internal.impl.metadata;

import com.ss.bytertc.engine.type.ErrorCode;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* JADX INFO: loaded from: classes5.dex */
public final class ProtoBuf {

    public static final class Annotation extends GeneratedMessageLite implements c {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final Annotation f126583i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static kotlin.reflect.jvm.internal.impl.protobuf.p<Annotation> f126584j = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final kotlin.reflect.jvm.internal.impl.protobuf.d f126585c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f126586d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f126587e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private List<Argument> f126588f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private byte f126589g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f126590h;

        public static final class Argument extends GeneratedMessageLite implements kotlin.reflect.jvm.internal.impl.metadata.b {

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private static final Argument f126591i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public static kotlin.reflect.jvm.internal.impl.protobuf.p<Argument> f126592j = new a();

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final kotlin.reflect.jvm.internal.impl.protobuf.d f126593c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f126594d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private int f126595e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private Value f126596f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private byte f126597g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private int f126598h;

            public static final class Value extends GeneratedMessageLite implements kotlin.reflect.jvm.internal.impl.metadata.a {

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                private static final Value f126599r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                public static kotlin.reflect.jvm.internal.impl.protobuf.p<Value> f126600s = new a();

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private final kotlin.reflect.jvm.internal.impl.protobuf.d f126601c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                private int f126602d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                private Type f126603e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                private long f126604f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                private float f126605g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                private double f126606h;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                private int f126607i;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                private int f126608j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                private int f126609k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                private Annotation f126610l;

                /* JADX INFO: renamed from: m, reason: collision with root package name */
                private List<Value> f126611m;

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                private int f126612n;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                private int f126613o;

                /* JADX INFO: renamed from: p, reason: collision with root package name */
                private byte f126614p;

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                private int f126615q;

                public enum Type implements kotlin.reflect.jvm.internal.impl.protobuf.h.a {
                    BYTE(0, 0),
                    CHAR(1, 1),
                    SHORT(2, 2),
                    INT(3, 3),
                    LONG(4, 4),
                    FLOAT(5, 5),
                    DOUBLE(6, 6),
                    BOOLEAN(7, 7),
                    STRING(8, 8),
                    CLASS(9, 9),
                    ENUM(10, 10),
                    ANNOTATION(11, 11),
                    ARRAY(12, 12);

                    private static kotlin.reflect.jvm.internal.impl.protobuf.h.b<Type> internalValueMap = new a();
                    private final int value;

                    public static final class a implements kotlin.reflect.jvm.internal.impl.protobuf.h.b<Type> {
                        a() {
                        }

                        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
                        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                        public Type a(int i10) {
                            return Type.valueOf(i10);
                        }
                    }

                    Type(int i10, int i11) {
                        this.value = i11;
                    }

                    public static Type valueOf(int i10) {
                        switch (i10) {
                            case 0:
                                return BYTE;
                            case 1:
                                return CHAR;
                            case 2:
                                return SHORT;
                            case 3:
                                return INT;
                            case 4:
                                return LONG;
                            case 5:
                                return FLOAT;
                            case 6:
                                return DOUBLE;
                            case 7:
                                return BOOLEAN;
                            case 8:
                                return STRING;
                            case 9:
                                return CLASS;
                            case 10:
                                return ENUM;
                            case 11:
                                return ANNOTATION;
                            case 12:
                                return ARRAY;
                            default:
                                return null;
                        }
                    }

                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.a
                    public final int getNumber() {
                        return this.value;
                    }
                }

                public static final class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<Value> {
                    a() {
                    }

                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
                    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
                    public Value d(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws InvalidProtocolBufferException {
                        return new Value(eVar, fVar);
                    }
                }

                public static final class b extends GeneratedMessageLite.b<Value, b> implements kotlin.reflect.jvm.internal.impl.metadata.a {

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    private int f126616c;

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    private long f126618e;

                    /* JADX INFO: renamed from: f, reason: collision with root package name */
                    private float f126619f;

                    /* JADX INFO: renamed from: g, reason: collision with root package name */
                    private double f126620g;

                    /* JADX INFO: renamed from: h, reason: collision with root package name */
                    private int f126621h;

                    /* JADX INFO: renamed from: i, reason: collision with root package name */
                    private int f126622i;

                    /* JADX INFO: renamed from: j, reason: collision with root package name */
                    private int f126623j;

                    /* JADX INFO: renamed from: m, reason: collision with root package name */
                    private int f126626m;

                    /* JADX INFO: renamed from: n, reason: collision with root package name */
                    private int f126627n;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    private Type f126617d = Type.BYTE;

                    /* JADX INFO: renamed from: k, reason: collision with root package name */
                    private Annotation f126624k = Annotation.z();

                    /* JADX INFO: renamed from: l, reason: collision with root package name */
                    private List<Value> f126625l = Collections.emptyList();

                    private b() {
                        B();
                    }

                    private void B() {
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static b o() {
                        return new b();
                    }

                    private void p() {
                        if ((this.f126616c & 256) != 256) {
                            this.f126625l = new ArrayList(this.f126625l);
                            this.f126616c |= 256;
                        }
                    }

                    public b C(Annotation annotation) {
                        if ((this.f126616c & 128) != 128 || this.f126624k == Annotation.z()) {
                            this.f126624k = annotation;
                        } else {
                            this.f126624k = Annotation.F(this.f126624k).h(annotation).m();
                        }
                        this.f126616c |= 128;
                        return this;
                    }

                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b
                    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
                    public b h(Value value) {
                        if (value == Value.M()) {
                            return this;
                        }
                        if (value.e0()) {
                            Q(value.U());
                        }
                        if (value.c0()) {
                            O(value.S());
                        }
                        if (value.b0()) {
                            M(value.R());
                        }
                        if (value.Y()) {
                            H(value.O());
                        }
                        if (value.d0()) {
                            P(value.T());
                        }
                        if (value.X()) {
                            G(value.L());
                        }
                        if (value.Z()) {
                            J(value.P());
                        }
                        if (value.V()) {
                            C(value.F());
                        }
                        if (!value.f126611m.isEmpty()) {
                            if (this.f126625l.isEmpty()) {
                                this.f126625l = value.f126611m;
                                this.f126616c &= -257;
                            } else {
                                p();
                                this.f126625l.addAll(value.f126611m);
                            }
                        }
                        if (value.W()) {
                            F(value.G());
                        }
                        if (value.a0()) {
                            K(value.Q());
                        }
                        i(g().b(value.f126601c));
                        return this;
                    }

                    /* JADX WARN: Code duplicated, block: B:15:0x001d  */
                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC1169a
                    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
                    public b c(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws Throwable {
                        Value value = null;
                        try {
                            try {
                                Value valueD = Value.f126600s.d(eVar, fVar);
                                if (valueD != null) {
                                    h(valueD);
                                }
                                return this;
                            } catch (InvalidProtocolBufferException e10) {
                                Value value2 = (Value) e10.a();
                                try {
                                    throw e10;
                                } catch (Throwable th2) {
                                    th = th2;
                                    value = value2;
                                    if (value != null) {
                                        h(value);
                                    }
                                    throw th;
                                }
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            if (value != null) {
                                h(value);
                            }
                            throw th;
                        }
                    }

                    public b F(int i10) {
                        this.f126616c |= 512;
                        this.f126626m = i10;
                        return this;
                    }

                    public b G(int i10) {
                        this.f126616c |= 32;
                        this.f126622i = i10;
                        return this;
                    }

                    public b H(double d10) {
                        this.f126616c |= 8;
                        this.f126620g = d10;
                        return this;
                    }

                    public b J(int i10) {
                        this.f126616c |= 64;
                        this.f126623j = i10;
                        return this;
                    }

                    public b K(int i10) {
                        this.f126616c |= 1024;
                        this.f126627n = i10;
                        return this;
                    }

                    public b M(float f10) {
                        this.f126616c |= 4;
                        this.f126619f = f10;
                        return this;
                    }

                    public b O(long j10) {
                        this.f126616c |= 2;
                        this.f126618e = j10;
                        return this;
                    }

                    public b P(int i10) {
                        this.f126616c |= 16;
                        this.f126621h = i10;
                        return this;
                    }

                    public b Q(Type type) {
                        type.getClass();
                        this.f126616c |= 1;
                        this.f126617d = type;
                        return this;
                    }

                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.n.a
                    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
                    public Value build() {
                        Value valueM = m();
                        if (valueM.l()) {
                            return valueM;
                        }
                        throw kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC1169a.d(valueM);
                    }

                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
                    public final boolean l() {
                        if (z() && !q().l()) {
                            return false;
                        }
                        for (int i10 = 0; i10 < x(); i10++) {
                            if (!s(i10).l()) {
                                return false;
                            }
                        }
                        return true;
                    }

                    public Value m() {
                        Value value = new Value(this);
                        int i10 = this.f126616c;
                        int i11 = (i10 & 1) != 1 ? 0 : 1;
                        value.f126603e = this.f126617d;
                        if ((i10 & 2) == 2) {
                            i11 |= 2;
                        }
                        value.f126604f = this.f126618e;
                        if ((i10 & 4) == 4) {
                            i11 |= 4;
                        }
                        value.f126605g = this.f126619f;
                        if ((i10 & 8) == 8) {
                            i11 |= 8;
                        }
                        value.f126606h = this.f126620g;
                        if ((i10 & 16) == 16) {
                            i11 |= 16;
                        }
                        value.f126607i = this.f126621h;
                        if ((i10 & 32) == 32) {
                            i11 |= 32;
                        }
                        value.f126608j = this.f126622i;
                        if ((i10 & 64) == 64) {
                            i11 |= 64;
                        }
                        value.f126609k = this.f126623j;
                        if ((i10 & 128) == 128) {
                            i11 |= 128;
                        }
                        value.f126610l = this.f126624k;
                        if ((this.f126616c & 256) == 256) {
                            this.f126625l = Collections.unmodifiableList(this.f126625l);
                            this.f126616c &= -257;
                        }
                        value.f126611m = this.f126625l;
                        if ((i10 & 512) == 512) {
                            i11 |= 256;
                        }
                        value.f126612n = this.f126626m;
                        if ((i10 & 1024) == 1024) {
                            i11 |= 512;
                        }
                        value.f126613o = this.f126627n;
                        value.f126602d = i11;
                        return value;
                    }

                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b
                    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
                    public b m() {
                        return o().h(m());
                    }

                    public Annotation q() {
                        return this.f126624k;
                    }

                    public Value s(int i10) {
                        return this.f126625l.get(i10);
                    }

                    public int x() {
                        return this.f126625l.size();
                    }

                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b, kotlin.reflect.jvm.internal.impl.protobuf.o
                    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
                    public Value r() {
                        return Value.M();
                    }

                    public boolean z() {
                        return (this.f126616c & 128) == 128;
                    }
                }

                static {
                    Value value = new Value(true);
                    f126599r = value;
                    value.f0();
                }

                private Value(GeneratedMessageLite.b bVar) {
                    super(bVar);
                    this.f126614p = (byte) -1;
                    this.f126615q = -1;
                    this.f126601c = bVar.g();
                }

                private Value(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws InvalidProtocolBufferException {
                    this.f126614p = (byte) -1;
                    this.f126615q = -1;
                    f0();
                    kotlin.reflect.jvm.internal.impl.protobuf.d.b bVarU = kotlin.reflect.jvm.internal.impl.protobuf.d.u();
                    CodedOutputStream codedOutputStreamJ = CodedOutputStream.J(bVarU, 1);
                    boolean z10 = false;
                    int i10 = 0;
                    while (!z10) {
                        try {
                            try {
                                int iK = eVar.K();
                                switch (iK) {
                                    case 0:
                                        break;
                                    case 8:
                                        int iN = eVar.n();
                                        Type typeValueOf = Type.valueOf(iN);
                                        if (typeValueOf == null) {
                                            codedOutputStreamJ.o0(iK);
                                            codedOutputStreamJ.o0(iN);
                                        } else {
                                            this.f126602d |= 1;
                                            this.f126603e = typeValueOf;
                                            continue;
                                        }
                                        break;
                                    case 16:
                                        this.f126602d |= 2;
                                        this.f126604f = eVar.H();
                                        continue;
                                    case 29:
                                        this.f126602d |= 4;
                                        this.f126605g = eVar.q();
                                        continue;
                                    case 33:
                                        this.f126602d |= 8;
                                        this.f126606h = eVar.m();
                                        continue;
                                    case 40:
                                        this.f126602d |= 16;
                                        this.f126607i = eVar.s();
                                        continue;
                                    case 48:
                                        this.f126602d |= 32;
                                        this.f126608j = eVar.s();
                                        continue;
                                    case 56:
                                        this.f126602d |= 64;
                                        this.f126609k = eVar.s();
                                        continue;
                                    case 66:
                                        b bVarT = (this.f126602d & 128) == 128 ? this.f126610l.t() : null;
                                        Annotation annotation = (Annotation) eVar.u(Annotation.f126584j, fVar);
                                        this.f126610l = annotation;
                                        if (bVarT != null) {
                                            bVarT.h(annotation);
                                            this.f126610l = bVarT.m();
                                        }
                                        this.f126602d |= 128;
                                        continue;
                                    case 74:
                                        if ((i10 & 256) != 256) {
                                            this.f126611m = new ArrayList();
                                            i10 |= 256;
                                        }
                                        this.f126611m.add((Value) eVar.u(f126600s, fVar));
                                        continue;
                                    case 80:
                                        this.f126602d |= 512;
                                        this.f126613o = eVar.s();
                                        continue;
                                    case 88:
                                        this.f126602d |= 256;
                                        this.f126612n = eVar.s();
                                        continue;
                                    default:
                                        if (!j(eVar, codedOutputStreamJ, fVar, iK)) {
                                            break;
                                        }
                                        break;
                                }
                                z10 = true;
                            } catch (InvalidProtocolBufferException e10) {
                                throw e10.i(this);
                            } catch (IOException e11) {
                                throw new InvalidProtocolBufferException(e11.getMessage()).i(this);
                            }
                        } catch (Throwable th2) {
                            if ((i10 & 256) == 256) {
                                this.f126611m = Collections.unmodifiableList(this.f126611m);
                            }
                            try {
                                codedOutputStreamJ.I();
                            } catch (IOException unused) {
                            } finally {
                                this.f126601c = bVarU.e();
                            }
                            g();
                            throw th2;
                        }
                    }
                    if ((i10 & 256) == 256) {
                        this.f126611m = Collections.unmodifiableList(this.f126611m);
                    }
                    try {
                        codedOutputStreamJ.I();
                    } catch (IOException unused2) {
                    } finally {
                        this.f126601c = bVarU.e();
                    }
                    g();
                }

                private Value(boolean z10) {
                    this.f126614p = (byte) -1;
                    this.f126615q = -1;
                    this.f126601c = kotlin.reflect.jvm.internal.impl.protobuf.d.f127320b;
                }

                public static Value M() {
                    return f126599r;
                }

                private void f0() {
                    this.f126603e = Type.BYTE;
                    this.f126604f = 0L;
                    this.f126605g = 0.0f;
                    this.f126606h = 0.0d;
                    this.f126607i = 0;
                    this.f126608j = 0;
                    this.f126609k = 0;
                    this.f126610l = Annotation.z();
                    this.f126611m = Collections.emptyList();
                    this.f126612n = 0;
                    this.f126613o = 0;
                }

                public static b g0() {
                    return b.o();
                }

                public static b h0(Value value) {
                    return g0().h(value);
                }

                public Annotation F() {
                    return this.f126610l;
                }

                public int G() {
                    return this.f126612n;
                }

                public Value H(int i10) {
                    return this.f126611m.get(i10);
                }

                public int J() {
                    return this.f126611m.size();
                }

                public List<Value> K() {
                    return this.f126611m;
                }

                public int L() {
                    return this.f126608j;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
                /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
                public Value r() {
                    return f126599r;
                }

                public double O() {
                    return this.f126606h;
                }

                public int P() {
                    return this.f126609k;
                }

                public int Q() {
                    return this.f126613o;
                }

                public float R() {
                    return this.f126605g;
                }

                public long S() {
                    return this.f126604f;
                }

                public int T() {
                    return this.f126607i;
                }

                public Type U() {
                    return this.f126603e;
                }

                public boolean V() {
                    return (this.f126602d & 128) == 128;
                }

                public boolean W() {
                    return (this.f126602d & 256) == 256;
                }

                public boolean X() {
                    return (this.f126602d & 32) == 32;
                }

                public boolean Y() {
                    return (this.f126602d & 8) == 8;
                }

                public boolean Z() {
                    return (this.f126602d & 64) == 64;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
                public void a(CodedOutputStream codedOutputStream) throws IOException {
                    u();
                    if ((this.f126602d & 1) == 1) {
                        codedOutputStream.S(1, this.f126603e.getNumber());
                    }
                    if ((this.f126602d & 2) == 2) {
                        codedOutputStream.t0(2, this.f126604f);
                    }
                    if ((this.f126602d & 4) == 4) {
                        codedOutputStream.W(3, this.f126605g);
                    }
                    if ((this.f126602d & 8) == 8) {
                        codedOutputStream.Q(4, this.f126606h);
                    }
                    if ((this.f126602d & 16) == 16) {
                        codedOutputStream.a0(5, this.f126607i);
                    }
                    if ((this.f126602d & 32) == 32) {
                        codedOutputStream.a0(6, this.f126608j);
                    }
                    if ((this.f126602d & 64) == 64) {
                        codedOutputStream.a0(7, this.f126609k);
                    }
                    if ((this.f126602d & 128) == 128) {
                        codedOutputStream.d0(8, this.f126610l);
                    }
                    for (int i10 = 0; i10 < this.f126611m.size(); i10++) {
                        codedOutputStream.d0(9, this.f126611m.get(i10));
                    }
                    if ((this.f126602d & 512) == 512) {
                        codedOutputStream.a0(10, this.f126613o);
                    }
                    if ((this.f126602d & 256) == 256) {
                        codedOutputStream.a0(11, this.f126612n);
                    }
                    codedOutputStream.i0(this.f126601c);
                }

                public boolean a0() {
                    return (this.f126602d & 512) == 512;
                }

                public boolean b0() {
                    return (this.f126602d & 4) == 4;
                }

                public boolean c0() {
                    return (this.f126602d & 2) == 2;
                }

                public boolean d0() {
                    return (this.f126602d & 16) == 16;
                }

                public boolean e0() {
                    return (this.f126602d & 1) == 1;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
                /* JADX INFO: renamed from: i0, reason: merged with bridge method [inline-methods] */
                public b v() {
                    return g0();
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
                /* JADX INFO: renamed from: j0, reason: merged with bridge method [inline-methods] */
                public b t() {
                    return h0(this);
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
                public final boolean l() {
                    byte b10 = this.f126614p;
                    if (b10 == 1) {
                        return true;
                    }
                    if (b10 == 0) {
                        return false;
                    }
                    if (V() && !F().l()) {
                        this.f126614p = (byte) 0;
                        return false;
                    }
                    for (int i10 = 0; i10 < J(); i10++) {
                        if (!H(i10).l()) {
                            this.f126614p = (byte) 0;
                            return false;
                        }
                    }
                    this.f126614p = (byte) 1;
                    return true;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
                public int u() {
                    int i10 = this.f126615q;
                    if (i10 != -1) {
                        return i10;
                    }
                    int iH = (this.f126602d & 1) == 1 ? CodedOutputStream.h(1, this.f126603e.getNumber()) + 0 : 0;
                    if ((this.f126602d & 2) == 2) {
                        iH += CodedOutputStream.A(2, this.f126604f);
                    }
                    if ((this.f126602d & 4) == 4) {
                        iH += CodedOutputStream.l(3, this.f126605g);
                    }
                    if ((this.f126602d & 8) == 8) {
                        iH += CodedOutputStream.f(4, this.f126606h);
                    }
                    if ((this.f126602d & 16) == 16) {
                        iH += CodedOutputStream.o(5, this.f126607i);
                    }
                    if ((this.f126602d & 32) == 32) {
                        iH += CodedOutputStream.o(6, this.f126608j);
                    }
                    if ((this.f126602d & 64) == 64) {
                        iH += CodedOutputStream.o(7, this.f126609k);
                    }
                    if ((this.f126602d & 128) == 128) {
                        iH += CodedOutputStream.s(8, this.f126610l);
                    }
                    for (int i11 = 0; i11 < this.f126611m.size(); i11++) {
                        iH += CodedOutputStream.s(9, this.f126611m.get(i11));
                    }
                    if ((this.f126602d & 512) == 512) {
                        iH += CodedOutputStream.o(10, this.f126613o);
                    }
                    if ((this.f126602d & 256) == 256) {
                        iH += CodedOutputStream.o(11, this.f126612n);
                    }
                    int size = iH + this.f126601c.size();
                    this.f126615q = size;
                    return size;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.n
                public kotlin.reflect.jvm.internal.impl.protobuf.p<Value> w() {
                    return f126600s;
                }
            }

            public static final class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<Argument> {
                a() {
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
                /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
                public Argument d(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws InvalidProtocolBufferException {
                    return new Argument(eVar, fVar);
                }
            }

            public static final class b extends GeneratedMessageLite.b<Argument, b> implements kotlin.reflect.jvm.internal.impl.metadata.b {

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private int f126628c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                private int f126629d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                private Value f126630e = Value.M();

                private b() {
                    y();
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static b o() {
                    return new b();
                }

                private void y() {
                }

                /* JADX WARN: Code duplicated, block: B:15:0x001d  */
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC1169a
                /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
                public b c(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws Throwable {
                    Argument argument = null;
                    try {
                        try {
                            Argument argumentD = Argument.f126592j.d(eVar, fVar);
                            if (argumentD != null) {
                                h(argumentD);
                            }
                            return this;
                        } catch (InvalidProtocolBufferException e10) {
                            Argument argument2 = (Argument) e10.a();
                            try {
                                throw e10;
                            } catch (Throwable th2) {
                                th = th2;
                                argument = argument2;
                                if (argument != null) {
                                    h(argument);
                                }
                                throw th;
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        if (argument != null) {
                            h(argument);
                        }
                        throw th;
                    }
                }

                public b C(Value value) {
                    if ((this.f126628c & 2) != 2 || this.f126630e == Value.M()) {
                        this.f126630e = value;
                    } else {
                        this.f126630e = Value.h0(this.f126630e).h(value).m();
                    }
                    this.f126628c |= 2;
                    return this;
                }

                public b D(int i10) {
                    this.f126628c |= 1;
                    this.f126629d = i10;
                    return this;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.n.a
                /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
                public Argument build() {
                    Argument argumentM = m();
                    if (argumentM.l()) {
                        return argumentM;
                    }
                    throw kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC1169a.d(argumentM);
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
                public final boolean l() {
                    return s() && x() && q().l();
                }

                public Argument m() {
                    Argument argument = new Argument(this);
                    int i10 = this.f126628c;
                    int i11 = (i10 & 1) != 1 ? 0 : 1;
                    argument.f126595e = this.f126629d;
                    if ((i10 & 2) == 2) {
                        i11 |= 2;
                    }
                    argument.f126596f = this.f126630e;
                    argument.f126594d = i11;
                    return argument;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
                public b m() {
                    return o().h(m());
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b, kotlin.reflect.jvm.internal.impl.protobuf.o
                /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
                public Argument r() {
                    return Argument.q();
                }

                public Value q() {
                    return this.f126630e;
                }

                public boolean s() {
                    return (this.f126628c & 1) == 1;
                }

                public boolean x() {
                    return (this.f126628c & 2) == 2;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b
                /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
                public b h(Argument argument) {
                    if (argument == Argument.q()) {
                        return this;
                    }
                    if (argument.z()) {
                        D(argument.x());
                    }
                    if (argument.A()) {
                        C(argument.y());
                    }
                    i(g().b(argument.f126593c));
                    return this;
                }
            }

            static {
                Argument argument = new Argument(true);
                f126591i = argument;
                argument.B();
            }

            private Argument(GeneratedMessageLite.b bVar) {
                super(bVar);
                this.f126597g = (byte) -1;
                this.f126598h = -1;
                this.f126593c = bVar.g();
            }

            private Argument(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws InvalidProtocolBufferException {
                this.f126597g = (byte) -1;
                this.f126598h = -1;
                B();
                kotlin.reflect.jvm.internal.impl.protobuf.d.b bVarU = kotlin.reflect.jvm.internal.impl.protobuf.d.u();
                CodedOutputStream codedOutputStreamJ = CodedOutputStream.J(bVarU, 1);
                boolean z10 = false;
                while (!z10) {
                    try {
                        try {
                            try {
                                int iK = eVar.K();
                                if (iK != 0) {
                                    if (iK == 8) {
                                        this.f126594d |= 1;
                                        this.f126595e = eVar.s();
                                    } else if (iK == 18) {
                                        Value.b bVarT = (this.f126594d & 2) == 2 ? this.f126596f.t() : null;
                                        Value value = (Value) eVar.u(Value.f126600s, fVar);
                                        this.f126596f = value;
                                        if (bVarT != null) {
                                            bVarT.h(value);
                                            this.f126596f = bVarT.m();
                                        }
                                        this.f126594d |= 2;
                                    } else if (!j(eVar, codedOutputStreamJ, fVar, iK)) {
                                    }
                                }
                                z10 = true;
                            } catch (InvalidProtocolBufferException e10) {
                                throw e10.i(this);
                            }
                        } catch (IOException e11) {
                            throw new InvalidProtocolBufferException(e11.getMessage()).i(this);
                        }
                    } catch (Throwable th2) {
                        try {
                            codedOutputStreamJ.I();
                        } catch (IOException unused) {
                        } finally {
                            this.f126593c = bVarU.e();
                        }
                        g();
                        throw th2;
                    }
                }
                try {
                    codedOutputStreamJ.I();
                } catch (IOException unused2) {
                } finally {
                    this.f126593c = bVarU.e();
                }
                g();
            }

            private Argument(boolean z10) {
                this.f126597g = (byte) -1;
                this.f126598h = -1;
                this.f126593c = kotlin.reflect.jvm.internal.impl.protobuf.d.f127320b;
            }

            private void B() {
                this.f126595e = 0;
                this.f126596f = Value.M();
            }

            public static b C() {
                return b.o();
            }

            public static b D(Argument argument) {
                return C().h(argument);
            }

            public static Argument q() {
                return f126591i;
            }

            public boolean A() {
                return (this.f126594d & 2) == 2;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
            /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
            public b v() {
                return C();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
            /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
            public b t() {
                return D(this);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
            public void a(CodedOutputStream codedOutputStream) throws IOException {
                u();
                if ((this.f126594d & 1) == 1) {
                    codedOutputStream.a0(1, this.f126595e);
                }
                if ((this.f126594d & 2) == 2) {
                    codedOutputStream.d0(2, this.f126596f);
                }
                codedOutputStream.i0(this.f126593c);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
            public final boolean l() {
                byte b10 = this.f126597g;
                if (b10 == 1) {
                    return true;
                }
                if (b10 == 0) {
                    return false;
                }
                if (!z()) {
                    this.f126597g = (byte) 0;
                    return false;
                }
                if (!A()) {
                    this.f126597g = (byte) 0;
                    return false;
                }
                if (y().l()) {
                    this.f126597g = (byte) 1;
                    return true;
                }
                this.f126597g = (byte) 0;
                return false;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
            /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
            public Argument r() {
                return f126591i;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
            public int u() {
                int i10 = this.f126598h;
                if (i10 != -1) {
                    return i10;
                }
                int iO = (this.f126594d & 1) == 1 ? 0 + CodedOutputStream.o(1, this.f126595e) : 0;
                if ((this.f126594d & 2) == 2) {
                    iO += CodedOutputStream.s(2, this.f126596f);
                }
                int size = iO + this.f126593c.size();
                this.f126598h = size;
                return size;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.n
            public kotlin.reflect.jvm.internal.impl.protobuf.p<Argument> w() {
                return f126592j;
            }

            public int x() {
                return this.f126595e;
            }

            public Value y() {
                return this.f126596f;
            }

            public boolean z() {
                return (this.f126594d & 1) == 1;
            }
        }

        public static final class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<Annotation> {
            a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public Annotation d(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws InvalidProtocolBufferException {
                return new Annotation(eVar, fVar);
            }
        }

        public static final class b extends GeneratedMessageLite.b<Annotation, b> implements c {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private int f126631c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f126632d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private List<Argument> f126633e = Collections.emptyList();

            private b() {
                z();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static b o() {
                return new b();
            }

            private void p() {
                if ((this.f126631c & 2) != 2) {
                    this.f126633e = new ArrayList(this.f126633e);
                    this.f126631c |= 2;
                }
            }

            private void z() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b
            /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
            public b h(Annotation annotation) {
                if (annotation == Annotation.z()) {
                    return this;
                }
                if (annotation.C()) {
                    D(annotation.B());
                }
                if (!annotation.f126588f.isEmpty()) {
                    if (this.f126633e.isEmpty()) {
                        this.f126633e = annotation.f126588f;
                        this.f126631c &= -3;
                    } else {
                        p();
                        this.f126633e.addAll(annotation.f126588f);
                    }
                }
                i(g().b(annotation.f126585c));
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC1169a
            /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
            public b c(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws Throwable {
                Annotation annotation = null;
                try {
                    try {
                        Annotation annotationD = Annotation.f126584j.d(eVar, fVar);
                        if (annotationD != null) {
                            h(annotationD);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e10) {
                        Annotation annotation2 = (Annotation) e10.a();
                        try {
                            throw e10;
                        } catch (Throwable th2) {
                            th = th2;
                            annotation = annotation2;
                            if (annotation != null) {
                                h(annotation);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (annotation != null) {
                        h(annotation);
                    }
                    throw th;
                }
            }

            public b D(int i10) {
                this.f126631c |= 1;
                this.f126632d = i10;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.n.a
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public Annotation build() {
                Annotation annotationM = m();
                if (annotationM.l()) {
                    return annotationM;
                }
                throw kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC1169a.d(annotationM);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
            public final boolean l() {
                if (!y()) {
                    return false;
                }
                for (int i10 = 0; i10 < s(); i10++) {
                    if (!q(i10).l()) {
                        return false;
                    }
                }
                return true;
            }

            public Annotation m() {
                Annotation annotation = new Annotation(this);
                int i10 = (this.f126631c & 1) != 1 ? 0 : 1;
                annotation.f126587e = this.f126632d;
                if ((this.f126631c & 2) == 2) {
                    this.f126633e = Collections.unmodifiableList(this.f126633e);
                    this.f126631c &= -3;
                }
                annotation.f126588f = this.f126633e;
                annotation.f126586d = i10;
                return annotation;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public b m() {
                return o().h(m());
            }

            public Argument q(int i10) {
                return this.f126633e.get(i10);
            }

            public int s() {
                return this.f126633e.size();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b, kotlin.reflect.jvm.internal.impl.protobuf.o
            /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
            public Annotation r() {
                return Annotation.z();
            }

            public boolean y() {
                return (this.f126631c & 1) == 1;
            }
        }

        static {
            Annotation annotation = new Annotation(true);
            f126583i = annotation;
            annotation.D();
        }

        private Annotation(GeneratedMessageLite.b bVar) {
            super(bVar);
            this.f126589g = (byte) -1;
            this.f126590h = -1;
            this.f126585c = bVar.g();
        }

        private Annotation(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws InvalidProtocolBufferException {
            this.f126589g = (byte) -1;
            this.f126590h = -1;
            D();
            kotlin.reflect.jvm.internal.impl.protobuf.d.b bVarU = kotlin.reflect.jvm.internal.impl.protobuf.d.u();
            CodedOutputStream codedOutputStreamJ = CodedOutputStream.J(bVarU, 1);
            boolean z10 = false;
            int i10 = 0;
            while (!z10) {
                try {
                    try {
                        int iK = eVar.K();
                        if (iK != 0) {
                            if (iK == 8) {
                                this.f126586d |= 1;
                                this.f126587e = eVar.s();
                            } else if (iK == 18) {
                                if ((i10 & 2) != 2) {
                                    this.f126588f = new ArrayList();
                                    i10 |= 2;
                                }
                                this.f126588f.add((Argument) eVar.u(Argument.f126592j, fVar));
                            } else if (!j(eVar, codedOutputStreamJ, fVar, iK)) {
                            }
                        }
                        z10 = true;
                    } catch (Throwable th2) {
                        if ((i10 & 2) == 2) {
                            this.f126588f = Collections.unmodifiableList(this.f126588f);
                        }
                        try {
                            codedOutputStreamJ.I();
                        } catch (IOException unused) {
                        } finally {
                            this.f126585c = bVarU.e();
                        }
                        g();
                        throw th2;
                    }
                } catch (InvalidProtocolBufferException e10) {
                    throw e10.i(this);
                } catch (IOException e11) {
                    throw new InvalidProtocolBufferException(e11.getMessage()).i(this);
                }
            }
            if ((i10 & 2) == 2) {
                this.f126588f = Collections.unmodifiableList(this.f126588f);
            }
            try {
                codedOutputStreamJ.I();
            } catch (IOException unused2) {
            } finally {
                this.f126585c = bVarU.e();
            }
            g();
        }

        private Annotation(boolean z10) {
            this.f126589g = (byte) -1;
            this.f126590h = -1;
            this.f126585c = kotlin.reflect.jvm.internal.impl.protobuf.d.f127320b;
        }

        private void D() {
            this.f126587e = 0;
            this.f126588f = Collections.emptyList();
        }

        public static b E() {
            return b.o();
        }

        public static b F(Annotation annotation) {
            return E().h(annotation);
        }

        public static Annotation z() {
            return f126583i;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
        public Annotation r() {
            return f126583i;
        }

        public int B() {
            return this.f126587e;
        }

        public boolean C() {
            return (this.f126586d & 1) == 1;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
        public b v() {
            return E();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public b t() {
            return F(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        public void a(CodedOutputStream codedOutputStream) throws IOException {
            u();
            if ((this.f126586d & 1) == 1) {
                codedOutputStream.a0(1, this.f126587e);
            }
            for (int i10 = 0; i10 < this.f126588f.size(); i10++) {
                codedOutputStream.d0(2, this.f126588f.get(i10));
            }
            codedOutputStream.i0(this.f126585c);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public final boolean l() {
            byte b10 = this.f126589g;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            if (!C()) {
                this.f126589g = (byte) 0;
                return false;
            }
            for (int i10 = 0; i10 < x(); i10++) {
                if (!s(i10).l()) {
                    this.f126589g = (byte) 0;
                    return false;
                }
            }
            this.f126589g = (byte) 1;
            return true;
        }

        public Argument s(int i10) {
            return this.f126588f.get(i10);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        public int u() {
            int i10 = this.f126590h;
            if (i10 != -1) {
                return i10;
            }
            int iO = (this.f126586d & 1) == 1 ? CodedOutputStream.o(1, this.f126587e) + 0 : 0;
            for (int i11 = 0; i11 < this.f126588f.size(); i11++) {
                iO += CodedOutputStream.s(2, this.f126588f.get(i11));
            }
            int size = iO + this.f126585c.size();
            this.f126590h = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.n
        public kotlin.reflect.jvm.internal.impl.protobuf.p<Annotation> w() {
            return f126584j;
        }

        public int x() {
            return this.f126588f.size();
        }

        public List<Argument> y() {
            return this.f126588f;
        }
    }

    public static final class Class extends GeneratedMessageLite.ExtendableMessage<Class> implements d {
        private static final Class L;
        public static kotlin.reflect.jvm.internal.impl.protobuf.p<Class> M = new a();
        private int A;
        private List<Integer> B;
        private int C;
        private List<Type> D;
        private List<Integer> E;
        private int F;
        private TypeTable G;
        private List<Integer> H;
        private VersionRequirementTable I;
        private byte J;
        private int K;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final kotlin.reflect.jvm.internal.impl.protobuf.d f126634d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f126635e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f126636f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f126637g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f126638h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private List<TypeParameter> f126639i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private List<Type> f126640j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private List<Integer> f126641k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f126642l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private List<Integer> f126643m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private int f126644n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private List<Type> f126645o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private List<Integer> f126646p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private int f126647q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private List<Constructor> f126648r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private List<Function> f126649s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private List<Property> f126650t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private List<TypeAlias> f126651u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private List<EnumEntry> f126652v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private List<Integer> f126653w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private int f126654x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private int f126655y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private Type f126656z;

        public enum Kind implements kotlin.reflect.jvm.internal.impl.protobuf.h.a {
            CLASS(0, 0),
            INTERFACE(1, 1),
            ENUM_CLASS(2, 2),
            ENUM_ENTRY(3, 3),
            ANNOTATION_CLASS(4, 4),
            OBJECT(5, 5),
            COMPANION_OBJECT(6, 6);

            private static kotlin.reflect.jvm.internal.impl.protobuf.h.b<Kind> internalValueMap = new a();
            private final int value;

            public static final class a implements kotlin.reflect.jvm.internal.impl.protobuf.h.b<Kind> {
                a() {
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public Kind a(int i10) {
                    return Kind.valueOf(i10);
                }
            }

            Kind(int i10, int i11) {
                this.value = i11;
            }

            public static Kind valueOf(int i10) {
                switch (i10) {
                    case 0:
                        return CLASS;
                    case 1:
                        return INTERFACE;
                    case 2:
                        return ENUM_CLASS;
                    case 3:
                        return ENUM_ENTRY;
                    case 4:
                        return ANNOTATION_CLASS;
                    case 5:
                        return OBJECT;
                    case 6:
                        return COMPANION_OBJECT;
                    default:
                        return null;
                }
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.a
            public final int getNumber() {
                return this.value;
            }
        }

        public static final class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<Class> {
            a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public Class d(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws InvalidProtocolBufferException {
                return new Class(eVar, fVar);
            }
        }

        public static final class b extends GeneratedMessageLite.c<Class, b> implements d {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private int f126657e;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private int f126659g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private int f126660h;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            private int f126673u;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            private int f126675w;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private int f126658f = 6;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private List<TypeParameter> f126661i = Collections.emptyList();

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            private List<Type> f126662j = Collections.emptyList();

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            private List<Integer> f126663k = Collections.emptyList();

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            private List<Integer> f126664l = Collections.emptyList();

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            private List<Type> f126665m = Collections.emptyList();

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private List<Integer> f126666n = Collections.emptyList();

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            private List<Constructor> f126667o = Collections.emptyList();

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            private List<Function> f126668p = Collections.emptyList();

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            private List<Property> f126669q = Collections.emptyList();

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            private List<TypeAlias> f126670r = Collections.emptyList();

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            private List<EnumEntry> f126671s = Collections.emptyList();

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            private List<Integer> f126672t = Collections.emptyList();

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            private Type f126674v = Type.Y();

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            private List<Integer> f126676x = Collections.emptyList();

            /* JADX INFO: renamed from: y, reason: collision with root package name */
            private List<Type> f126677y = Collections.emptyList();

            /* JADX INFO: renamed from: z, reason: collision with root package name */
            private List<Integer> f126678z = Collections.emptyList();
            private TypeTable A = TypeTable.s();
            private List<Integer> B = Collections.emptyList();
            private VersionRequirementTable C = VersionRequirementTable.p();

            private b() {
                u0();
            }

            private void B() {
                if ((this.f126657e & 512) != 512) {
                    this.f126667o = new ArrayList(this.f126667o);
                    this.f126657e |= 512;
                }
            }

            private void C() {
                if ((this.f126657e & 256) != 256) {
                    this.f126666n = new ArrayList(this.f126666n);
                    this.f126657e |= 256;
                }
            }

            private void D() {
                if ((this.f126657e & 128) != 128) {
                    this.f126665m = new ArrayList(this.f126665m);
                    this.f126657e |= 128;
                }
            }

            private void E() {
                if ((this.f126657e & 8192) != 8192) {
                    this.f126671s = new ArrayList(this.f126671s);
                    this.f126657e |= 8192;
                }
            }

            private void F() {
                if ((this.f126657e & 1024) != 1024) {
                    this.f126668p = new ArrayList(this.f126668p);
                    this.f126657e |= 1024;
                }
            }

            private void G() {
                if ((this.f126657e & 262144) != 262144) {
                    this.f126676x = new ArrayList(this.f126676x);
                    this.f126657e |= 262144;
                }
            }

            private void H() {
                if ((this.f126657e & 1048576) != 1048576) {
                    this.f126678z = new ArrayList(this.f126678z);
                    this.f126657e |= 1048576;
                }
            }

            private void J() {
                if ((this.f126657e & 524288) != 524288) {
                    this.f126677y = new ArrayList(this.f126677y);
                    this.f126657e |= 524288;
                }
            }

            private void K() {
                if ((this.f126657e & 64) != 64) {
                    this.f126664l = new ArrayList(this.f126664l);
                    this.f126657e |= 64;
                }
            }

            private void M() {
                if ((this.f126657e & 2048) != 2048) {
                    this.f126669q = new ArrayList(this.f126669q);
                    this.f126657e |= 2048;
                }
            }

            private void O() {
                if ((this.f126657e & 16384) != 16384) {
                    this.f126672t = new ArrayList(this.f126672t);
                    this.f126657e |= 16384;
                }
            }

            private void P() {
                if ((this.f126657e & 32) != 32) {
                    this.f126663k = new ArrayList(this.f126663k);
                    this.f126657e |= 32;
                }
            }

            private void Q() {
                if ((this.f126657e & 16) != 16) {
                    this.f126662j = new ArrayList(this.f126662j);
                    this.f126657e |= 16;
                }
            }

            private void R() {
                if ((this.f126657e & 4096) != 4096) {
                    this.f126670r = new ArrayList(this.f126670r);
                    this.f126657e |= 4096;
                }
            }

            private void S() {
                if ((this.f126657e & 8) != 8) {
                    this.f126661i = new ArrayList(this.f126661i);
                    this.f126657e |= 8;
                }
            }

            private void T() {
                if ((this.f126657e & 4194304) != 4194304) {
                    this.B = new ArrayList(this.B);
                    this.f126657e |= 4194304;
                }
            }

            private void u0() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static b z() {
                return new b();
            }

            public b A0(int i10) {
                this.f126657e |= 4;
                this.f126660h = i10;
                return this;
            }

            public b B0(int i10) {
                this.f126657e |= 1;
                this.f126658f = i10;
                return this;
            }

            public b E0(int i10) {
                this.f126657e |= 2;
                this.f126659g = i10;
                return this;
            }

            public b F0(int i10) {
                this.f126657e |= 32768;
                this.f126673u = i10;
                return this;
            }

            public b H0(int i10) {
                this.f126657e |= 131072;
                this.f126675w = i10;
                return this;
            }

            public Constructor U(int i10) {
                return this.f126667o.get(i10);
            }

            public int V() {
                return this.f126667o.size();
            }

            public Type X(int i10) {
                return this.f126665m.get(i10);
            }

            public int Y() {
                return this.f126665m.size();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b, kotlin.reflect.jvm.internal.impl.protobuf.o
            /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] */
            public Class r() {
                return Class.z0();
            }

            public EnumEntry b0(int i10) {
                return this.f126671s.get(i10);
            }

            public int c0() {
                return this.f126671s.size();
            }

            public Function d0(int i10) {
                return this.f126668p.get(i10);
            }

            public int e0() {
                return this.f126668p.size();
            }

            public Type f0() {
                return this.f126674v;
            }

            public Type g0(int i10) {
                return this.f126677y.get(i10);
            }

            public int h0() {
                return this.f126677y.size();
            }

            public Property i0(int i10) {
                return this.f126669q.get(i10);
            }

            public int j0() {
                return this.f126669q.size();
            }

            public Type k0(int i10) {
                return this.f126662j.get(i10);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
            public final boolean l() {
                if (!r0()) {
                    return false;
                }
                for (int i10 = 0; i10 < p0(); i10++) {
                    if (!o0(i10).l()) {
                        return false;
                    }
                }
                for (int i11 = 0; i11 < l0(); i11++) {
                    if (!k0(i11).l()) {
                        return false;
                    }
                }
                for (int i12 = 0; i12 < Y(); i12++) {
                    if (!X(i12).l()) {
                        return false;
                    }
                }
                for (int i13 = 0; i13 < V(); i13++) {
                    if (!U(i13).l()) {
                        return false;
                    }
                }
                for (int i14 = 0; i14 < e0(); i14++) {
                    if (!d0(i14).l()) {
                        return false;
                    }
                }
                for (int i15 = 0; i15 < j0(); i15++) {
                    if (!i0(i15).l()) {
                        return false;
                    }
                }
                for (int i16 = 0; i16 < n0(); i16++) {
                    if (!m0(i16).l()) {
                        return false;
                    }
                }
                for (int i17 = 0; i17 < c0(); i17++) {
                    if (!b0(i17).l()) {
                        return false;
                    }
                }
                if (s0() && !f0().l()) {
                    return false;
                }
                for (int i18 = 0; i18 < h0(); i18++) {
                    if (!g0(i18).l()) {
                        return false;
                    }
                }
                return (!t0() || q0().l()) && o();
            }

            public int l0() {
                return this.f126662j.size();
            }

            public TypeAlias m0(int i10) {
                return this.f126670r.get(i10);
            }

            public int n0() {
                return this.f126670r.size();
            }

            public TypeParameter o0(int i10) {
                return this.f126661i.get(i10);
            }

            public int p0() {
                return this.f126661i.size();
            }

            public TypeTable q0() {
                return this.A;
            }

            public boolean r0() {
                return (this.f126657e & 2) == 2;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.n.a
            /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
            public Class build() {
                Class classX = x();
                if (classX.l()) {
                    return classX;
                }
                throw kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC1169a.d(classX);
            }

            public boolean s0() {
                return (this.f126657e & 65536) == 65536;
            }

            public boolean t0() {
                return (this.f126657e & 2097152) == 2097152;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b
            /* JADX INFO: renamed from: v0, reason: merged with bridge method [inline-methods] */
            public b h(Class r10) {
                if (r10 == Class.z0()) {
                    return this;
                }
                if (r10.m1()) {
                    B0(r10.E0());
                }
                if (r10.n1()) {
                    E0(r10.F0());
                }
                if (r10.l1()) {
                    A0(r10.r0());
                }
                if (!r10.f126639i.isEmpty()) {
                    if (this.f126661i.isEmpty()) {
                        this.f126661i = r10.f126639i;
                        this.f126657e &= -9;
                    } else {
                        S();
                        this.f126661i.addAll(r10.f126639i);
                    }
                }
                if (!r10.f126640j.isEmpty()) {
                    if (this.f126662j.isEmpty()) {
                        this.f126662j = r10.f126640j;
                        this.f126657e &= -17;
                    } else {
                        Q();
                        this.f126662j.addAll(r10.f126640j);
                    }
                }
                if (!r10.f126641k.isEmpty()) {
                    if (this.f126663k.isEmpty()) {
                        this.f126663k = r10.f126641k;
                        this.f126657e &= -33;
                    } else {
                        P();
                        this.f126663k.addAll(r10.f126641k);
                    }
                }
                if (!r10.f126643m.isEmpty()) {
                    if (this.f126664l.isEmpty()) {
                        this.f126664l = r10.f126643m;
                        this.f126657e &= -65;
                    } else {
                        K();
                        this.f126664l.addAll(r10.f126643m);
                    }
                }
                if (!r10.f126645o.isEmpty()) {
                    if (this.f126665m.isEmpty()) {
                        this.f126665m = r10.f126645o;
                        this.f126657e &= -129;
                    } else {
                        D();
                        this.f126665m.addAll(r10.f126645o);
                    }
                }
                if (!r10.f126646p.isEmpty()) {
                    if (this.f126666n.isEmpty()) {
                        this.f126666n = r10.f126646p;
                        this.f126657e &= -257;
                    } else {
                        C();
                        this.f126666n.addAll(r10.f126646p);
                    }
                }
                if (!r10.f126648r.isEmpty()) {
                    if (this.f126667o.isEmpty()) {
                        this.f126667o = r10.f126648r;
                        this.f126657e &= -513;
                    } else {
                        B();
                        this.f126667o.addAll(r10.f126648r);
                    }
                }
                if (!r10.f126649s.isEmpty()) {
                    if (this.f126668p.isEmpty()) {
                        this.f126668p = r10.f126649s;
                        this.f126657e &= ErrorCode.ERROR_CODE_JOIN_ROOM_ROOM_FORBIDDEN;
                    } else {
                        F();
                        this.f126668p.addAll(r10.f126649s);
                    }
                }
                if (!r10.f126650t.isEmpty()) {
                    if (this.f126669q.isEmpty()) {
                        this.f126669q = r10.f126650t;
                        this.f126657e &= -2049;
                    } else {
                        M();
                        this.f126669q.addAll(r10.f126650t);
                    }
                }
                if (!r10.f126651u.isEmpty()) {
                    if (this.f126670r.isEmpty()) {
                        this.f126670r = r10.f126651u;
                        this.f126657e &= -4097;
                    } else {
                        R();
                        this.f126670r.addAll(r10.f126651u);
                    }
                }
                if (!r10.f126652v.isEmpty()) {
                    if (this.f126671s.isEmpty()) {
                        this.f126671s = r10.f126652v;
                        this.f126657e &= -8193;
                    } else {
                        E();
                        this.f126671s.addAll(r10.f126652v);
                    }
                }
                if (!r10.f126653w.isEmpty()) {
                    if (this.f126672t.isEmpty()) {
                        this.f126672t = r10.f126653w;
                        this.f126657e &= -16385;
                    } else {
                        O();
                        this.f126672t.addAll(r10.f126653w);
                    }
                }
                if (r10.o1()) {
                    F0(r10.J0());
                }
                if (r10.p1()) {
                    x0(r10.K0());
                }
                if (r10.q1()) {
                    H0(r10.L0());
                }
                if (!r10.B.isEmpty()) {
                    if (this.f126676x.isEmpty()) {
                        this.f126676x = r10.B;
                        this.f126657e &= -262145;
                    } else {
                        G();
                        this.f126676x.addAll(r10.B);
                    }
                }
                if (!r10.D.isEmpty()) {
                    if (this.f126677y.isEmpty()) {
                        this.f126677y = r10.D;
                        this.f126657e &= -524289;
                    } else {
                        J();
                        this.f126677y.addAll(r10.D);
                    }
                }
                if (!r10.E.isEmpty()) {
                    if (this.f126678z.isEmpty()) {
                        this.f126678z = r10.E;
                        this.f126657e &= -1048577;
                    } else {
                        H();
                        this.f126678z.addAll(r10.E);
                    }
                }
                if (r10.r1()) {
                    y0(r10.i1());
                }
                if (!r10.H.isEmpty()) {
                    if (this.B.isEmpty()) {
                        this.B = r10.H;
                        this.f126657e &= -4194305;
                    } else {
                        T();
                        this.B.addAll(r10.H);
                    }
                }
                if (r10.s1()) {
                    z0(r10.k1());
                }
                p(r10);
                i(g().b(r10.f126634d));
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC1169a
            /* JADX INFO: renamed from: w0, reason: merged with bridge method [inline-methods] */
            public b c(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws Throwable {
                Class r10 = null;
                try {
                    try {
                        Class classD = Class.M.d(eVar, fVar);
                        if (classD != null) {
                            h(classD);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e10) {
                        Class r11 = (Class) e10.a();
                        try {
                            throw e10;
                        } catch (Throwable th2) {
                            th = th2;
                            r10 = r11;
                            if (r10 != null) {
                                h(r10);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (r10 != null) {
                        h(r10);
                    }
                    throw th;
                }
            }

            public Class x() {
                Class r10 = new Class(this);
                int i10 = this.f126657e;
                int i11 = (i10 & 1) != 1 ? 0 : 1;
                r10.f126636f = this.f126658f;
                if ((i10 & 2) == 2) {
                    i11 |= 2;
                }
                r10.f126637g = this.f126659g;
                if ((i10 & 4) == 4) {
                    i11 |= 4;
                }
                r10.f126638h = this.f126660h;
                if ((this.f126657e & 8) == 8) {
                    this.f126661i = Collections.unmodifiableList(this.f126661i);
                    this.f126657e &= -9;
                }
                r10.f126639i = this.f126661i;
                if ((this.f126657e & 16) == 16) {
                    this.f126662j = Collections.unmodifiableList(this.f126662j);
                    this.f126657e &= -17;
                }
                r10.f126640j = this.f126662j;
                if ((this.f126657e & 32) == 32) {
                    this.f126663k = Collections.unmodifiableList(this.f126663k);
                    this.f126657e &= -33;
                }
                r10.f126641k = this.f126663k;
                if ((this.f126657e & 64) == 64) {
                    this.f126664l = Collections.unmodifiableList(this.f126664l);
                    this.f126657e &= -65;
                }
                r10.f126643m = this.f126664l;
                if ((this.f126657e & 128) == 128) {
                    this.f126665m = Collections.unmodifiableList(this.f126665m);
                    this.f126657e &= -129;
                }
                r10.f126645o = this.f126665m;
                if ((this.f126657e & 256) == 256) {
                    this.f126666n = Collections.unmodifiableList(this.f126666n);
                    this.f126657e &= -257;
                }
                r10.f126646p = this.f126666n;
                if ((this.f126657e & 512) == 512) {
                    this.f126667o = Collections.unmodifiableList(this.f126667o);
                    this.f126657e &= -513;
                }
                r10.f126648r = this.f126667o;
                if ((this.f126657e & 1024) == 1024) {
                    this.f126668p = Collections.unmodifiableList(this.f126668p);
                    this.f126657e &= ErrorCode.ERROR_CODE_JOIN_ROOM_ROOM_FORBIDDEN;
                }
                r10.f126649s = this.f126668p;
                if ((this.f126657e & 2048) == 2048) {
                    this.f126669q = Collections.unmodifiableList(this.f126669q);
                    this.f126657e &= -2049;
                }
                r10.f126650t = this.f126669q;
                if ((this.f126657e & 4096) == 4096) {
                    this.f126670r = Collections.unmodifiableList(this.f126670r);
                    this.f126657e &= -4097;
                }
                r10.f126651u = this.f126670r;
                if ((this.f126657e & 8192) == 8192) {
                    this.f126671s = Collections.unmodifiableList(this.f126671s);
                    this.f126657e &= -8193;
                }
                r10.f126652v = this.f126671s;
                if ((this.f126657e & 16384) == 16384) {
                    this.f126672t = Collections.unmodifiableList(this.f126672t);
                    this.f126657e &= -16385;
                }
                r10.f126653w = this.f126672t;
                if ((i10 & 32768) == 32768) {
                    i11 |= 8;
                }
                r10.f126655y = this.f126673u;
                if ((i10 & 65536) == 65536) {
                    i11 |= 16;
                }
                r10.f126656z = this.f126674v;
                if ((i10 & 131072) == 131072) {
                    i11 |= 32;
                }
                r10.A = this.f126675w;
                if ((this.f126657e & 262144) == 262144) {
                    this.f126676x = Collections.unmodifiableList(this.f126676x);
                    this.f126657e &= -262145;
                }
                r10.B = this.f126676x;
                if ((this.f126657e & 524288) == 524288) {
                    this.f126677y = Collections.unmodifiableList(this.f126677y);
                    this.f126657e &= -524289;
                }
                r10.D = this.f126677y;
                if ((this.f126657e & 1048576) == 1048576) {
                    this.f126678z = Collections.unmodifiableList(this.f126678z);
                    this.f126657e &= -1048577;
                }
                r10.E = this.f126678z;
                if ((i10 & 2097152) == 2097152) {
                    i11 |= 64;
                }
                r10.G = this.A;
                if ((this.f126657e & 4194304) == 4194304) {
                    this.B = Collections.unmodifiableList(this.B);
                    this.f126657e &= -4194305;
                }
                r10.H = this.B;
                if ((i10 & 8388608) == 8388608) {
                    i11 |= 128;
                }
                r10.I = this.C;
                r10.f126635e = i11;
                return r10;
            }

            public b x0(Type type) {
                if ((this.f126657e & 65536) != 65536 || this.f126674v == Type.Y()) {
                    this.f126674v = type;
                } else {
                    this.f126674v = Type.z0(this.f126674v).h(type).x();
                }
                this.f126657e |= 65536;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.c
            /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
            public b m() {
                return z().h(x());
            }

            public b y0(TypeTable typeTable) {
                if ((this.f126657e & 2097152) != 2097152 || this.A == TypeTable.s()) {
                    this.A = typeTable;
                } else {
                    this.A = TypeTable.F(this.A).h(typeTable).m();
                }
                this.f126657e |= 2097152;
                return this;
            }

            public b z0(VersionRequirementTable versionRequirementTable) {
                if ((this.f126657e & 8388608) != 8388608 || this.C == VersionRequirementTable.p()) {
                    this.C = versionRequirementTable;
                } else {
                    this.C = VersionRequirementTable.A(this.C).h(versionRequirementTable).m();
                }
                this.f126657e |= 8388608;
                return this;
            }
        }

        static {
            Class r10 = new Class(true);
            L = r10;
            r10.t1();
        }

        private Class(GeneratedMessageLite.c<Class, ?> cVar) {
            super(cVar);
            this.f126642l = -1;
            this.f126644n = -1;
            this.f126647q = -1;
            this.f126654x = -1;
            this.C = -1;
            this.F = -1;
            this.J = (byte) -1;
            this.K = -1;
            this.f126634d = cVar.g();
        }

        /* JADX WARN: Multi-variable type inference failed */
        private Class(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws InvalidProtocolBufferException {
            boolean z10;
            this.f126642l = -1;
            this.f126644n = -1;
            this.f126647q = -1;
            this.f126654x = -1;
            this.C = -1;
            this.F = -1;
            this.J = (byte) -1;
            this.K = -1;
            t1();
            kotlin.reflect.jvm.internal.impl.protobuf.d.b bVarU = kotlin.reflect.jvm.internal.impl.protobuf.d.u();
            CodedOutputStream codedOutputStreamJ = CodedOutputStream.J(bVarU, 1);
            boolean z11 = false;
            int i10 = 0;
            while (!z11) {
                try {
                    try {
                        int iK = eVar.K();
                        switch (iK) {
                            case 0:
                                z10 = true;
                                z11 = z10;
                                break;
                            case 8:
                                z10 = true;
                                this.f126635e |= 1;
                                this.f126636f = eVar.s();
                                break;
                            case 16:
                                if ((i10 & 32) != 32) {
                                    this.f126641k = new ArrayList();
                                    i10 |= 32;
                                }
                                this.f126641k.add(Integer.valueOf(eVar.s()));
                                z10 = true;
                                break;
                            case 18:
                                int iJ = eVar.j(eVar.A());
                                if ((i10 & 32) != 32 && eVar.e() > 0) {
                                    this.f126641k = new ArrayList();
                                    i10 |= 32;
                                }
                                while (eVar.e() > 0) {
                                    this.f126641k.add(Integer.valueOf(eVar.s()));
                                }
                                eVar.i(iJ);
                                z10 = true;
                                break;
                            case 24:
                                this.f126635e |= 2;
                                this.f126637g = eVar.s();
                                z10 = true;
                                break;
                            case 32:
                                this.f126635e |= 4;
                                this.f126638h = eVar.s();
                                z10 = true;
                                break;
                            case 42:
                                if ((i10 & 8) != 8) {
                                    this.f126639i = new ArrayList();
                                    i10 |= 8;
                                }
                                this.f126639i.add((TypeParameter) eVar.u(TypeParameter.f126952p, fVar));
                                z10 = true;
                                break;
                            case 50:
                                if ((i10 & 16) != 16) {
                                    this.f126640j = new ArrayList();
                                    i10 |= 16;
                                }
                                this.f126640j.add((Type) eVar.u(Type.f126879w, fVar));
                                z10 = true;
                                break;
                            case 56:
                                if ((i10 & 64) != 64) {
                                    this.f126643m = new ArrayList();
                                    i10 |= 64;
                                }
                                this.f126643m.add(Integer.valueOf(eVar.s()));
                                z10 = true;
                                break;
                            case 58:
                                int iJ2 = eVar.j(eVar.A());
                                if ((i10 & 64) != 64 && eVar.e() > 0) {
                                    this.f126643m = new ArrayList();
                                    i10 |= 64;
                                }
                                while (eVar.e() > 0) {
                                    this.f126643m.add(Integer.valueOf(eVar.s()));
                                }
                                eVar.i(iJ2);
                                z10 = true;
                                break;
                            case 66:
                                if ((i10 & 512) != 512) {
                                    this.f126648r = new ArrayList();
                                    i10 |= 512;
                                }
                                this.f126648r.add((Constructor) eVar.u(Constructor.f126680l, fVar));
                                z10 = true;
                                break;
                            case 74:
                                if ((i10 & 1024) != 1024) {
                                    this.f126649s = new ArrayList();
                                    i10 |= 1024;
                                }
                                this.f126649s.add((Function) eVar.u(Function.f126746x, fVar));
                                z10 = true;
                                break;
                            case 82:
                                if ((i10 & 2048) != 2048) {
                                    this.f126650t = new ArrayList();
                                    i10 |= 2048;
                                }
                                this.f126650t.add((Property) eVar.u(Property.f126814x, fVar));
                                z10 = true;
                                break;
                            case 90:
                                if ((i10 & 4096) != 4096) {
                                    this.f126651u = new ArrayList();
                                    i10 |= 4096;
                                }
                                this.f126651u.add((TypeAlias) eVar.u(TypeAlias.f126927r, fVar));
                                z10 = true;
                                break;
                            case 106:
                                if ((i10 & 8192) != 8192) {
                                    this.f126652v = new ArrayList();
                                    i10 |= 8192;
                                }
                                this.f126652v.add((EnumEntry) eVar.u(EnumEntry.f126716j, fVar));
                                z10 = true;
                                break;
                            case 128:
                                if ((i10 & 16384) != 16384) {
                                    this.f126653w = new ArrayList();
                                    i10 |= 16384;
                                }
                                this.f126653w.add(Integer.valueOf(eVar.s()));
                                z10 = true;
                                break;
                            case 130:
                                int iJ3 = eVar.j(eVar.A());
                                if ((i10 & 16384) != 16384 && eVar.e() > 0) {
                                    this.f126653w = new ArrayList();
                                    i10 |= 16384;
                                }
                                while (eVar.e() > 0) {
                                    this.f126653w.add(Integer.valueOf(eVar.s()));
                                }
                                eVar.i(iJ3);
                                z10 = true;
                                break;
                            case 136:
                                this.f126635e |= 8;
                                this.f126655y = eVar.s();
                                z10 = true;
                                break;
                            case 146:
                                Type.b bVarT = (this.f126635e & 16) == 16 ? this.f126656z.t() : null;
                                Type type = (Type) eVar.u(Type.f126879w, fVar);
                                this.f126656z = type;
                                if (bVarT != 0) {
                                    bVarT.h(type);
                                    this.f126656z = bVarT.x();
                                }
                                this.f126635e |= 16;
                                z10 = true;
                                break;
                            case 152:
                                this.f126635e |= 32;
                                this.A = eVar.s();
                                z10 = true;
                                break;
                            case 162:
                                if ((i10 & 128) != 128) {
                                    this.f126645o = new ArrayList();
                                    i10 |= 128;
                                }
                                this.f126645o.add((Type) eVar.u(Type.f126879w, fVar));
                                z10 = true;
                                break;
                            case bb.c.b.f30782m0 /* 168 */:
                                if ((i10 & 256) != 256) {
                                    this.f126646p = new ArrayList();
                                    i10 |= 256;
                                }
                                this.f126646p.add(Integer.valueOf(eVar.s()));
                                z10 = true;
                                break;
                            case bb.c.b.f30828o0 /* 170 */:
                                int iJ4 = eVar.j(eVar.A());
                                if ((i10 & 256) != 256 && eVar.e() > 0) {
                                    this.f126646p = new ArrayList();
                                    i10 |= 256;
                                }
                                while (eVar.e() > 0) {
                                    this.f126646p.add(Integer.valueOf(eVar.s()));
                                }
                                eVar.i(iJ4);
                                z10 = true;
                                break;
                            case 176:
                                if ((i10 & 262144) != 262144) {
                                    this.B = new ArrayList();
                                    i10 |= 262144;
                                }
                                this.B.add(Integer.valueOf(eVar.s()));
                                z10 = true;
                                break;
                            case 178:
                                int iJ5 = eVar.j(eVar.A());
                                if ((i10 & 262144) != 262144 && eVar.e() > 0) {
                                    this.B = new ArrayList();
                                    i10 |= 262144;
                                }
                                while (eVar.e() > 0) {
                                    this.B.add(Integer.valueOf(eVar.s()));
                                }
                                eVar.i(iJ5);
                                z10 = true;
                                break;
                            case bb.c.b.E0 /* 186 */:
                                if ((i10 & 524288) != 524288) {
                                    this.D = new ArrayList();
                                    i10 |= 524288;
                                }
                                this.D.add((Type) eVar.u(Type.f126879w, fVar));
                                z10 = true;
                                break;
                            case 192:
                                if ((i10 & 1048576) != 1048576) {
                                    this.E = new ArrayList();
                                    i10 |= 1048576;
                                }
                                this.E.add(Integer.valueOf(eVar.s()));
                                z10 = true;
                                break;
                            case 194:
                                int iJ6 = eVar.j(eVar.A());
                                if ((i10 & 1048576) != 1048576 && eVar.e() > 0) {
                                    this.E = new ArrayList();
                                    i10 |= 1048576;
                                }
                                while (eVar.e() > 0) {
                                    this.E.add(Integer.valueOf(eVar.s()));
                                }
                                eVar.i(iJ6);
                                z10 = true;
                                break;
                            case bb.c.b.I1 /* 242 */:
                                TypeTable.b bVarT2 = (this.f126635e & 64) == 64 ? this.G.t() : null;
                                TypeTable typeTable = (TypeTable) eVar.u(TypeTable.f126972j, fVar);
                                this.G = typeTable;
                                if (bVarT2 != 0) {
                                    bVarT2.h(typeTable);
                                    this.G = bVarT2.m();
                                }
                                this.f126635e |= 64;
                                z10 = true;
                                break;
                            case bb.c.b.O1 /* 248 */:
                                if ((i10 & 4194304) != 4194304) {
                                    this.H = new ArrayList();
                                    i10 |= 4194304;
                                }
                                this.H.add(Integer.valueOf(eVar.s()));
                                z10 = true;
                                break;
                            case 250:
                                int iJ7 = eVar.j(eVar.A());
                                if ((i10 & 4194304) != 4194304 && eVar.e() > 0) {
                                    this.H = new ArrayList();
                                    i10 |= 4194304;
                                }
                                while (eVar.e() > 0) {
                                    this.H.add(Integer.valueOf(eVar.s()));
                                }
                                eVar.i(iJ7);
                                z10 = true;
                                break;
                            case 258:
                                VersionRequirementTable.b bVarT3 = (this.f126635e & 128) == 128 ? this.I.t() : null;
                                VersionRequirementTable versionRequirementTable = (VersionRequirementTable) eVar.u(VersionRequirementTable.f127021h, fVar);
                                this.I = versionRequirementTable;
                                if (bVarT3 != 0) {
                                    bVarT3.h(versionRequirementTable);
                                    this.I = bVarT3.m();
                                }
                                this.f126635e |= 128;
                                z10 = true;
                                break;
                            default:
                                z10 = true;
                                if (!j(eVar, codedOutputStreamJ, fVar, iK)) {
                                    z11 = z10;
                                }
                                break;
                        }
                    } catch (InvalidProtocolBufferException e10) {
                        throw e10.i(this);
                    } catch (IOException e11) {
                        throw new InvalidProtocolBufferException(e11.getMessage()).i(this);
                    }
                } catch (Throwable th2) {
                    if ((i10 & 32) == 32) {
                        this.f126641k = Collections.unmodifiableList(this.f126641k);
                    }
                    if ((i10 & 8) == 8) {
                        this.f126639i = Collections.unmodifiableList(this.f126639i);
                    }
                    if ((i10 & 16) == 16) {
                        this.f126640j = Collections.unmodifiableList(this.f126640j);
                    }
                    if ((i10 & 64) == 64) {
                        this.f126643m = Collections.unmodifiableList(this.f126643m);
                    }
                    if ((i10 & 512) == 512) {
                        this.f126648r = Collections.unmodifiableList(this.f126648r);
                    }
                    if ((i10 & 1024) == 1024) {
                        this.f126649s = Collections.unmodifiableList(this.f126649s);
                    }
                    if ((i10 & 2048) == 2048) {
                        this.f126650t = Collections.unmodifiableList(this.f126650t);
                    }
                    if ((i10 & 4096) == 4096) {
                        this.f126651u = Collections.unmodifiableList(this.f126651u);
                    }
                    if ((i10 & 8192) == 8192) {
                        this.f126652v = Collections.unmodifiableList(this.f126652v);
                    }
                    if ((i10 & 16384) == 16384) {
                        this.f126653w = Collections.unmodifiableList(this.f126653w);
                    }
                    if ((i10 & 128) == 128) {
                        this.f126645o = Collections.unmodifiableList(this.f126645o);
                    }
                    if ((i10 & 256) == 256) {
                        this.f126646p = Collections.unmodifiableList(this.f126646p);
                    }
                    if ((i10 & 262144) == 262144) {
                        this.B = Collections.unmodifiableList(this.B);
                    }
                    if ((i10 & 524288) == 524288) {
                        this.D = Collections.unmodifiableList(this.D);
                    }
                    if ((i10 & 1048576) == 1048576) {
                        this.E = Collections.unmodifiableList(this.E);
                    }
                    if ((i10 & 4194304) == 4194304) {
                        this.H = Collections.unmodifiableList(this.H);
                    }
                    try {
                        codedOutputStreamJ.I();
                    } catch (IOException unused) {
                    } finally {
                        this.f126634d = bVarU.e();
                    }
                    g();
                    throw th2;
                }
            }
            if ((i10 & 32) == 32) {
                this.f126641k = Collections.unmodifiableList(this.f126641k);
            }
            if ((i10 & 8) == 8) {
                this.f126639i = Collections.unmodifiableList(this.f126639i);
            }
            if ((i10 & 16) == 16) {
                this.f126640j = Collections.unmodifiableList(this.f126640j);
            }
            if ((i10 & 64) == 64) {
                this.f126643m = Collections.unmodifiableList(this.f126643m);
            }
            if ((i10 & 512) == 512) {
                this.f126648r = Collections.unmodifiableList(this.f126648r);
            }
            if ((i10 & 1024) == 1024) {
                this.f126649s = Collections.unmodifiableList(this.f126649s);
            }
            if ((i10 & 2048) == 2048) {
                this.f126650t = Collections.unmodifiableList(this.f126650t);
            }
            if ((i10 & 4096) == 4096) {
                this.f126651u = Collections.unmodifiableList(this.f126651u);
            }
            if ((i10 & 8192) == 8192) {
                this.f126652v = Collections.unmodifiableList(this.f126652v);
            }
            if ((i10 & 16384) == 16384) {
                this.f126653w = Collections.unmodifiableList(this.f126653w);
            }
            if ((i10 & 128) == 128) {
                this.f126645o = Collections.unmodifiableList(this.f126645o);
            }
            if ((i10 & 256) == 256) {
                this.f126646p = Collections.unmodifiableList(this.f126646p);
            }
            if ((i10 & 262144) == 262144) {
                this.B = Collections.unmodifiableList(this.B);
            }
            if ((i10 & 524288) == 524288) {
                this.D = Collections.unmodifiableList(this.D);
            }
            if ((i10 & 1048576) == 1048576) {
                this.E = Collections.unmodifiableList(this.E);
            }
            if ((i10 & 4194304) == 4194304) {
                this.H = Collections.unmodifiableList(this.H);
            }
            try {
                codedOutputStreamJ.I();
            } catch (IOException unused2) {
            } finally {
                this.f126634d = bVarU.e();
            }
            g();
        }

        private Class(boolean z10) {
            this.f126642l = -1;
            this.f126644n = -1;
            this.f126647q = -1;
            this.f126654x = -1;
            this.C = -1;
            this.F = -1;
            this.J = (byte) -1;
            this.K = -1;
            this.f126634d = kotlin.reflect.jvm.internal.impl.protobuf.d.f127320b;
        }

        private void t1() {
            this.f126636f = 6;
            this.f126637g = 0;
            this.f126638h = 0;
            this.f126639i = Collections.emptyList();
            this.f126640j = Collections.emptyList();
            this.f126641k = Collections.emptyList();
            this.f126643m = Collections.emptyList();
            this.f126645o = Collections.emptyList();
            this.f126646p = Collections.emptyList();
            this.f126648r = Collections.emptyList();
            this.f126649s = Collections.emptyList();
            this.f126650t = Collections.emptyList();
            this.f126651u = Collections.emptyList();
            this.f126652v = Collections.emptyList();
            this.f126653w = Collections.emptyList();
            this.f126655y = 0;
            this.f126656z = Type.Y();
            this.A = 0;
            this.B = Collections.emptyList();
            this.D = Collections.emptyList();
            this.E = Collections.emptyList();
            this.G = TypeTable.s();
            this.H = Collections.emptyList();
            this.I = VersionRequirementTable.p();
        }

        public static b u1() {
            return b.z();
        }

        public static b v1(Class r10) {
            return u1().h(r10);
        }

        public static Class x1(InputStream inputStream, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws IOException {
            return M.b(inputStream, fVar);
        }

        public static Class z0() {
            return L;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        /* JADX INFO: renamed from: A0, reason: merged with bridge method [inline-methods] */
        public Class r() {
            return L;
        }

        public EnumEntry B0(int i10) {
            return this.f126652v.get(i10);
        }

        public int C0() {
            return this.f126652v.size();
        }

        public List<EnumEntry> D0() {
            return this.f126652v;
        }

        public int E0() {
            return this.f126636f;
        }

        public int F0() {
            return this.f126637g;
        }

        public Function G0(int i10) {
            return this.f126649s.get(i10);
        }

        public int H0() {
            return this.f126649s.size();
        }

        public List<Function> I0() {
            return this.f126649s;
        }

        public int J0() {
            return this.f126655y;
        }

        public Type K0() {
            return this.f126656z;
        }

        public int L0() {
            return this.A;
        }

        public int M0() {
            return this.B.size();
        }

        public List<Integer> N0() {
            return this.B;
        }

        public Type O0(int i10) {
            return this.D.get(i10);
        }

        public int P0() {
            return this.D.size();
        }

        public int Q0() {
            return this.E.size();
        }

        public List<Integer> R0() {
            return this.E;
        }

        public List<Type> S0() {
            return this.D;
        }

        public List<Integer> T0() {
            return this.f126643m;
        }

        public Property U0(int i10) {
            return this.f126650t.get(i10);
        }

        public int V0() {
            return this.f126650t.size();
        }

        public List<Property> W0() {
            return this.f126650t;
        }

        public List<Integer> X0() {
            return this.f126653w;
        }

        public Type Y0(int i10) {
            return this.f126640j.get(i10);
        }

        public int Z0() {
            return this.f126640j.size();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        public void a(CodedOutputStream codedOutputStream) throws IOException {
            u();
            GeneratedMessageLite.ExtendableMessage<MessageType>.a aVarY = y();
            if ((this.f126635e & 1) == 1) {
                codedOutputStream.a0(1, this.f126636f);
            }
            if (a1().size() > 0) {
                codedOutputStream.o0(18);
                codedOutputStream.o0(this.f126642l);
            }
            for (int i10 = 0; i10 < this.f126641k.size(); i10++) {
                codedOutputStream.b0(this.f126641k.get(i10).intValue());
            }
            if ((this.f126635e & 2) == 2) {
                codedOutputStream.a0(3, this.f126637g);
            }
            if ((this.f126635e & 4) == 4) {
                codedOutputStream.a0(4, this.f126638h);
            }
            for (int i11 = 0; i11 < this.f126639i.size(); i11++) {
                codedOutputStream.d0(5, this.f126639i.get(i11));
            }
            for (int i12 = 0; i12 < this.f126640j.size(); i12++) {
                codedOutputStream.d0(6, this.f126640j.get(i12));
            }
            if (T0().size() > 0) {
                codedOutputStream.o0(58);
                codedOutputStream.o0(this.f126644n);
            }
            for (int i13 = 0; i13 < this.f126643m.size(); i13++) {
                codedOutputStream.b0(this.f126643m.get(i13).intValue());
            }
            for (int i14 = 0; i14 < this.f126648r.size(); i14++) {
                codedOutputStream.d0(8, this.f126648r.get(i14));
            }
            for (int i15 = 0; i15 < this.f126649s.size(); i15++) {
                codedOutputStream.d0(9, this.f126649s.get(i15));
            }
            for (int i16 = 0; i16 < this.f126650t.size(); i16++) {
                codedOutputStream.d0(10, this.f126650t.get(i16));
            }
            for (int i17 = 0; i17 < this.f126651u.size(); i17++) {
                codedOutputStream.d0(11, this.f126651u.get(i17));
            }
            for (int i18 = 0; i18 < this.f126652v.size(); i18++) {
                codedOutputStream.d0(13, this.f126652v.get(i18));
            }
            if (X0().size() > 0) {
                codedOutputStream.o0(130);
                codedOutputStream.o0(this.f126654x);
            }
            for (int i19 = 0; i19 < this.f126653w.size(); i19++) {
                codedOutputStream.b0(this.f126653w.get(i19).intValue());
            }
            if ((this.f126635e & 8) == 8) {
                codedOutputStream.a0(17, this.f126655y);
            }
            if ((this.f126635e & 16) == 16) {
                codedOutputStream.d0(18, this.f126656z);
            }
            if ((this.f126635e & 32) == 32) {
                codedOutputStream.a0(19, this.A);
            }
            for (int i20 = 0; i20 < this.f126645o.size(); i20++) {
                codedOutputStream.d0(20, this.f126645o.get(i20));
            }
            if (x0().size() > 0) {
                codedOutputStream.o0(bb.c.b.f30828o0);
                codedOutputStream.o0(this.f126647q);
            }
            for (int i21 = 0; i21 < this.f126646p.size(); i21++) {
                codedOutputStream.b0(this.f126646p.get(i21).intValue());
            }
            if (N0().size() > 0) {
                codedOutputStream.o0(178);
                codedOutputStream.o0(this.C);
            }
            for (int i22 = 0; i22 < this.B.size(); i22++) {
                codedOutputStream.b0(this.B.get(i22).intValue());
            }
            for (int i23 = 0; i23 < this.D.size(); i23++) {
                codedOutputStream.d0(23, this.D.get(i23));
            }
            if (R0().size() > 0) {
                codedOutputStream.o0(194);
                codedOutputStream.o0(this.F);
            }
            for (int i24 = 0; i24 < this.E.size(); i24++) {
                codedOutputStream.b0(this.E.get(i24).intValue());
            }
            if ((this.f126635e & 64) == 64) {
                codedOutputStream.d0(30, this.G);
            }
            for (int i25 = 0; i25 < this.H.size(); i25++) {
                codedOutputStream.a0(31, this.H.get(i25).intValue());
            }
            if ((this.f126635e & 128) == 128) {
                codedOutputStream.d0(32, this.I);
            }
            aVarY.a(19000, codedOutputStream);
            codedOutputStream.i0(this.f126634d);
        }

        public List<Integer> a1() {
            return this.f126641k;
        }

        public List<Type> b1() {
            return this.f126640j;
        }

        public TypeAlias c1(int i10) {
            return this.f126651u.get(i10);
        }

        public int d1() {
            return this.f126651u.size();
        }

        public List<TypeAlias> e1() {
            return this.f126651u;
        }

        public TypeParameter f1(int i10) {
            return this.f126639i.get(i10);
        }

        public int g1() {
            return this.f126639i.size();
        }

        public List<TypeParameter> h1() {
            return this.f126639i;
        }

        public TypeTable i1() {
            return this.G;
        }

        public List<Integer> j1() {
            return this.H;
        }

        public VersionRequirementTable k1() {
            return this.I;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public final boolean l() {
            byte b10 = this.J;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            if (!n1()) {
                this.J = (byte) 0;
                return false;
            }
            for (int i10 = 0; i10 < g1(); i10++) {
                if (!f1(i10).l()) {
                    this.J = (byte) 0;
                    return false;
                }
            }
            for (int i11 = 0; i11 < Z0(); i11++) {
                if (!Y0(i11).l()) {
                    this.J = (byte) 0;
                    return false;
                }
            }
            for (int i12 = 0; i12 < w0(); i12++) {
                if (!v0(i12).l()) {
                    this.J = (byte) 0;
                    return false;
                }
            }
            for (int i13 = 0; i13 < t0(); i13++) {
                if (!s0(i13).l()) {
                    this.J = (byte) 0;
                    return false;
                }
            }
            for (int i14 = 0; i14 < H0(); i14++) {
                if (!G0(i14).l()) {
                    this.J = (byte) 0;
                    return false;
                }
            }
            for (int i15 = 0; i15 < V0(); i15++) {
                if (!U0(i15).l()) {
                    this.J = (byte) 0;
                    return false;
                }
            }
            for (int i16 = 0; i16 < d1(); i16++) {
                if (!c1(i16).l()) {
                    this.J = (byte) 0;
                    return false;
                }
            }
            for (int i17 = 0; i17 < C0(); i17++) {
                if (!B0(i17).l()) {
                    this.J = (byte) 0;
                    return false;
                }
            }
            if (p1() && !K0().l()) {
                this.J = (byte) 0;
                return false;
            }
            for (int i18 = 0; i18 < P0(); i18++) {
                if (!O0(i18).l()) {
                    this.J = (byte) 0;
                    return false;
                }
            }
            if (r1() && !i1().l()) {
                this.J = (byte) 0;
                return false;
            }
            if (n()) {
                this.J = (byte) 1;
                return true;
            }
            this.J = (byte) 0;
            return false;
        }

        public boolean l1() {
            return (this.f126635e & 4) == 4;
        }

        public boolean m1() {
            return (this.f126635e & 1) == 1;
        }

        public boolean n1() {
            return (this.f126635e & 2) == 2;
        }

        public boolean o1() {
            return (this.f126635e & 8) == 8;
        }

        public boolean p1() {
            return (this.f126635e & 16) == 16;
        }

        public boolean q1() {
            return (this.f126635e & 32) == 32;
        }

        public int r0() {
            return this.f126638h;
        }

        public boolean r1() {
            return (this.f126635e & 64) == 64;
        }

        public Constructor s0(int i10) {
            return this.f126648r.get(i10);
        }

        public boolean s1() {
            return (this.f126635e & 128) == 128;
        }

        public int t0() {
            return this.f126648r.size();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        public int u() {
            int i10 = this.K;
            if (i10 != -1) {
                return i10;
            }
            int iO = (this.f126635e & 1) == 1 ? CodedOutputStream.o(1, this.f126636f) + 0 : 0;
            int iP = 0;
            for (int i11 = 0; i11 < this.f126641k.size(); i11++) {
                iP += CodedOutputStream.p(this.f126641k.get(i11).intValue());
            }
            int iS = iO + iP;
            if (!a1().isEmpty()) {
                iS = iS + 1 + CodedOutputStream.p(iP);
            }
            this.f126642l = iP;
            if ((this.f126635e & 2) == 2) {
                iS += CodedOutputStream.o(3, this.f126637g);
            }
            if ((this.f126635e & 4) == 4) {
                iS += CodedOutputStream.o(4, this.f126638h);
            }
            for (int i12 = 0; i12 < this.f126639i.size(); i12++) {
                iS += CodedOutputStream.s(5, this.f126639i.get(i12));
            }
            for (int i13 = 0; i13 < this.f126640j.size(); i13++) {
                iS += CodedOutputStream.s(6, this.f126640j.get(i13));
            }
            int iP2 = 0;
            for (int i14 = 0; i14 < this.f126643m.size(); i14++) {
                iP2 += CodedOutputStream.p(this.f126643m.get(i14).intValue());
            }
            int iS2 = iS + iP2;
            if (!T0().isEmpty()) {
                iS2 = iS2 + 1 + CodedOutputStream.p(iP2);
            }
            this.f126644n = iP2;
            for (int i15 = 0; i15 < this.f126648r.size(); i15++) {
                iS2 += CodedOutputStream.s(8, this.f126648r.get(i15));
            }
            for (int i16 = 0; i16 < this.f126649s.size(); i16++) {
                iS2 += CodedOutputStream.s(9, this.f126649s.get(i16));
            }
            for (int i17 = 0; i17 < this.f126650t.size(); i17++) {
                iS2 += CodedOutputStream.s(10, this.f126650t.get(i17));
            }
            for (int i18 = 0; i18 < this.f126651u.size(); i18++) {
                iS2 += CodedOutputStream.s(11, this.f126651u.get(i18));
            }
            for (int i19 = 0; i19 < this.f126652v.size(); i19++) {
                iS2 += CodedOutputStream.s(13, this.f126652v.get(i19));
            }
            int iP3 = 0;
            for (int i20 = 0; i20 < this.f126653w.size(); i20++) {
                iP3 += CodedOutputStream.p(this.f126653w.get(i20).intValue());
            }
            int iS3 = iS2 + iP3;
            if (!X0().isEmpty()) {
                iS3 = iS3 + 2 + CodedOutputStream.p(iP3);
            }
            this.f126654x = iP3;
            if ((this.f126635e & 8) == 8) {
                iS3 += CodedOutputStream.o(17, this.f126655y);
            }
            if ((this.f126635e & 16) == 16) {
                iS3 += CodedOutputStream.s(18, this.f126656z);
            }
            if ((this.f126635e & 32) == 32) {
                iS3 += CodedOutputStream.o(19, this.A);
            }
            for (int i21 = 0; i21 < this.f126645o.size(); i21++) {
                iS3 += CodedOutputStream.s(20, this.f126645o.get(i21));
            }
            int iP4 = 0;
            for (int i22 = 0; i22 < this.f126646p.size(); i22++) {
                iP4 += CodedOutputStream.p(this.f126646p.get(i22).intValue());
            }
            int iP5 = iS3 + iP4;
            if (!x0().isEmpty()) {
                iP5 = iP5 + 2 + CodedOutputStream.p(iP4);
            }
            this.f126647q = iP4;
            int iP6 = 0;
            for (int i23 = 0; i23 < this.B.size(); i23++) {
                iP6 += CodedOutputStream.p(this.B.get(i23).intValue());
            }
            int iS4 = iP5 + iP6;
            if (!N0().isEmpty()) {
                iS4 = iS4 + 2 + CodedOutputStream.p(iP6);
            }
            this.C = iP6;
            for (int i24 = 0; i24 < this.D.size(); i24++) {
                iS4 += CodedOutputStream.s(23, this.D.get(i24));
            }
            int iP7 = 0;
            for (int i25 = 0; i25 < this.E.size(); i25++) {
                iP7 += CodedOutputStream.p(this.E.get(i25).intValue());
            }
            int iS5 = iS4 + iP7;
            if (!R0().isEmpty()) {
                iS5 = iS5 + 2 + CodedOutputStream.p(iP7);
            }
            this.F = iP7;
            if ((this.f126635e & 64) == 64) {
                iS5 += CodedOutputStream.s(30, this.G);
            }
            int iP8 = 0;
            for (int i26 = 0; i26 < this.H.size(); i26++) {
                iP8 += CodedOutputStream.p(this.H.get(i26).intValue());
            }
            int size = iS5 + iP8 + (j1().size() * 2);
            if ((this.f126635e & 128) == 128) {
                size += CodedOutputStream.s(32, this.I);
            }
            int iO2 = size + o() + this.f126634d.size();
            this.K = iO2;
            return iO2;
        }

        public List<Constructor> u0() {
            return this.f126648r;
        }

        public Type v0(int i10) {
            return this.f126645o.get(i10);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.n
        public kotlin.reflect.jvm.internal.impl.protobuf.p<Class> w() {
            return M;
        }

        public int w0() {
            return this.f126645o.size();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        /* JADX INFO: renamed from: w1, reason: merged with bridge method [inline-methods] */
        public b v() {
            return u1();
        }

        public List<Integer> x0() {
            return this.f126646p;
        }

        public List<Type> y0() {
            return this.f126645o;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        /* JADX INFO: renamed from: y1, reason: merged with bridge method [inline-methods] */
        public b t() {
            return v1(this);
        }
    }

    public static final class Constructor extends GeneratedMessageLite.ExtendableMessage<Constructor> implements e {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final Constructor f126679k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static kotlin.reflect.jvm.internal.impl.protobuf.p<Constructor> f126680l = new a();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final kotlin.reflect.jvm.internal.impl.protobuf.d f126681d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f126682e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f126683f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private List<ValueParameter> f126684g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private List<Integer> f126685h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private byte f126686i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f126687j;

        public static final class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<Constructor> {
            a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public Constructor d(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws InvalidProtocolBufferException {
                return new Constructor(eVar, fVar);
            }
        }

        public static final class b extends GeneratedMessageLite.c<Constructor, b> implements e {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private int f126688e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private int f126689f = 6;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private List<ValueParameter> f126690g = Collections.emptyList();

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private List<Integer> f126691h = Collections.emptyList();

            private b() {
                G();
            }

            private void B() {
                if ((this.f126688e & 2) != 2) {
                    this.f126690g = new ArrayList(this.f126690g);
                    this.f126688e |= 2;
                }
            }

            private void C() {
                if ((this.f126688e & 4) != 4) {
                    this.f126691h = new ArrayList(this.f126691h);
                    this.f126688e |= 4;
                }
            }

            private void G() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static b z() {
                return new b();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b, kotlin.reflect.jvm.internal.impl.protobuf.o
            /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
            public Constructor r() {
                return Constructor.H();
            }

            public ValueParameter E(int i10) {
                return this.f126690g.get(i10);
            }

            public int F() {
                return this.f126690g.size();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b
            /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
            public b h(Constructor constructor) {
                if (constructor == Constructor.H()) {
                    return this;
                }
                if (constructor.P()) {
                    K(constructor.K());
                }
                if (!constructor.f126684g.isEmpty()) {
                    if (this.f126690g.isEmpty()) {
                        this.f126690g = constructor.f126684g;
                        this.f126688e &= -3;
                    } else {
                        B();
                        this.f126690g.addAll(constructor.f126684g);
                    }
                }
                if (!constructor.f126685h.isEmpty()) {
                    if (this.f126691h.isEmpty()) {
                        this.f126691h = constructor.f126685h;
                        this.f126688e &= -5;
                    } else {
                        C();
                        this.f126691h.addAll(constructor.f126685h);
                    }
                }
                p(constructor);
                i(g().b(constructor.f126681d));
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC1169a
            /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
            public b c(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws Throwable {
                Constructor constructor = null;
                try {
                    try {
                        Constructor constructorD = Constructor.f126680l.d(eVar, fVar);
                        if (constructorD != null) {
                            h(constructorD);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e10) {
                        Constructor constructor2 = (Constructor) e10.a();
                        try {
                            throw e10;
                        } catch (Throwable th2) {
                            th = th2;
                            constructor = constructor2;
                            if (constructor != null) {
                                h(constructor);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (constructor != null) {
                        h(constructor);
                    }
                    throw th;
                }
            }

            public b K(int i10) {
                this.f126688e |= 1;
                this.f126689f = i10;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
            public final boolean l() {
                for (int i10 = 0; i10 < F(); i10++) {
                    if (!E(i10).l()) {
                        return false;
                    }
                }
                return o();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.n.a
            /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
            public Constructor build() {
                Constructor constructorX = x();
                if (constructorX.l()) {
                    return constructorX;
                }
                throw kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC1169a.d(constructorX);
            }

            public Constructor x() {
                Constructor constructor = new Constructor(this);
                int i10 = (this.f126688e & 1) != 1 ? 0 : 1;
                constructor.f126683f = this.f126689f;
                if ((this.f126688e & 2) == 2) {
                    this.f126690g = Collections.unmodifiableList(this.f126690g);
                    this.f126688e &= -3;
                }
                constructor.f126684g = this.f126690g;
                if ((this.f126688e & 4) == 4) {
                    this.f126691h = Collections.unmodifiableList(this.f126691h);
                    this.f126688e &= -5;
                }
                constructor.f126685h = this.f126691h;
                constructor.f126682e = i10;
                return constructor;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.c
            /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
            public b m() {
                return z().h(x());
            }
        }

        static {
            Constructor constructor = new Constructor(true);
            f126679k = constructor;
            constructor.Q();
        }

        private Constructor(GeneratedMessageLite.c<Constructor, ?> cVar) {
            super(cVar);
            this.f126686i = (byte) -1;
            this.f126687j = -1;
            this.f126681d = cVar.g();
        }

        private Constructor(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws InvalidProtocolBufferException {
            this.f126686i = (byte) -1;
            this.f126687j = -1;
            Q();
            kotlin.reflect.jvm.internal.impl.protobuf.d.b bVarU = kotlin.reflect.jvm.internal.impl.protobuf.d.u();
            CodedOutputStream codedOutputStreamJ = CodedOutputStream.J(bVarU, 1);
            boolean z10 = false;
            int i10 = 0;
            while (!z10) {
                try {
                    try {
                        try {
                            int iK = eVar.K();
                            if (iK != 0) {
                                if (iK == 8) {
                                    this.f126682e |= 1;
                                    this.f126683f = eVar.s();
                                } else if (iK == 18) {
                                    if ((i10 & 2) != 2) {
                                        this.f126684g = new ArrayList();
                                        i10 |= 2;
                                    }
                                    this.f126684g.add((ValueParameter) eVar.u(ValueParameter.f126983o, fVar));
                                } else if (iK == 248) {
                                    if ((i10 & 4) != 4) {
                                        this.f126685h = new ArrayList();
                                        i10 |= 4;
                                    }
                                    this.f126685h.add(Integer.valueOf(eVar.s()));
                                } else if (iK == 250) {
                                    int iJ = eVar.j(eVar.A());
                                    if ((i10 & 4) != 4 && eVar.e() > 0) {
                                        this.f126685h = new ArrayList();
                                        i10 |= 4;
                                    }
                                    while (eVar.e() > 0) {
                                        this.f126685h.add(Integer.valueOf(eVar.s()));
                                    }
                                    eVar.i(iJ);
                                } else if (!j(eVar, codedOutputStreamJ, fVar, iK)) {
                                }
                            }
                            z10 = true;
                        } catch (InvalidProtocolBufferException e10) {
                            throw e10.i(this);
                        }
                    } catch (IOException e11) {
                        throw new InvalidProtocolBufferException(e11.getMessage()).i(this);
                    }
                } catch (Throwable th2) {
                    if ((i10 & 2) == 2) {
                        this.f126684g = Collections.unmodifiableList(this.f126684g);
                    }
                    if ((i10 & 4) == 4) {
                        this.f126685h = Collections.unmodifiableList(this.f126685h);
                    }
                    try {
                        codedOutputStreamJ.I();
                    } catch (IOException unused) {
                    } finally {
                        this.f126681d = bVarU.e();
                    }
                    g();
                    throw th2;
                }
            }
            if ((i10 & 2) == 2) {
                this.f126684g = Collections.unmodifiableList(this.f126684g);
            }
            if ((i10 & 4) == 4) {
                this.f126685h = Collections.unmodifiableList(this.f126685h);
            }
            try {
                codedOutputStreamJ.I();
            } catch (IOException unused2) {
            } finally {
                this.f126681d = bVarU.e();
            }
            g();
        }

        private Constructor(boolean z10) {
            this.f126686i = (byte) -1;
            this.f126687j = -1;
            this.f126681d = kotlin.reflect.jvm.internal.impl.protobuf.d.f127320b;
        }

        public static Constructor H() {
            return f126679k;
        }

        private void Q() {
            this.f126683f = 6;
            this.f126684g = Collections.emptyList();
            this.f126685h = Collections.emptyList();
        }

        public static b R() {
            return b.z();
        }

        public static b S(Constructor constructor) {
            return R().h(constructor);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
        public Constructor r() {
            return f126679k;
        }

        public int K() {
            return this.f126683f;
        }

        public ValueParameter L(int i10) {
            return this.f126684g.get(i10);
        }

        public int M() {
            return this.f126684g.size();
        }

        public List<ValueParameter> N() {
            return this.f126684g;
        }

        public List<Integer> O() {
            return this.f126685h;
        }

        public boolean P() {
            return (this.f126682e & 1) == 1;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
        public b v() {
            return R();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
        public b t() {
            return S(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        public void a(CodedOutputStream codedOutputStream) throws IOException {
            u();
            GeneratedMessageLite.ExtendableMessage<MessageType>.a aVarY = y();
            if ((this.f126682e & 1) == 1) {
                codedOutputStream.a0(1, this.f126683f);
            }
            for (int i10 = 0; i10 < this.f126684g.size(); i10++) {
                codedOutputStream.d0(2, this.f126684g.get(i10));
            }
            for (int i11 = 0; i11 < this.f126685h.size(); i11++) {
                codedOutputStream.a0(31, this.f126685h.get(i11).intValue());
            }
            aVarY.a(19000, codedOutputStream);
            codedOutputStream.i0(this.f126681d);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public final boolean l() {
            byte b10 = this.f126686i;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            for (int i10 = 0; i10 < M(); i10++) {
                if (!L(i10).l()) {
                    this.f126686i = (byte) 0;
                    return false;
                }
            }
            if (n()) {
                this.f126686i = (byte) 1;
                return true;
            }
            this.f126686i = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        public int u() {
            int i10 = this.f126687j;
            if (i10 != -1) {
                return i10;
            }
            int iO = (this.f126682e & 1) == 1 ? CodedOutputStream.o(1, this.f126683f) + 0 : 0;
            for (int i11 = 0; i11 < this.f126684g.size(); i11++) {
                iO += CodedOutputStream.s(2, this.f126684g.get(i11));
            }
            int iP = 0;
            for (int i12 = 0; i12 < this.f126685h.size(); i12++) {
                iP += CodedOutputStream.p(this.f126685h.get(i12).intValue());
            }
            int size = iO + iP + (O().size() * 2) + o() + this.f126681d.size();
            this.f126687j = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.n
        public kotlin.reflect.jvm.internal.impl.protobuf.p<Constructor> w() {
            return f126680l;
        }
    }

    public static final class Contract extends GeneratedMessageLite implements f {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final Contract f126692g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static kotlin.reflect.jvm.internal.impl.protobuf.p<Contract> f126693h = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final kotlin.reflect.jvm.internal.impl.protobuf.d f126694c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private List<Effect> f126695d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private byte f126696e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f126697f;

        public static final class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<Contract> {
            a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public Contract d(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws InvalidProtocolBufferException {
                return new Contract(eVar, fVar);
            }
        }

        public static final class b extends GeneratedMessageLite.b<Contract, b> implements f {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private int f126698c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private List<Effect> f126699d = Collections.emptyList();

            private b() {
                y();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static b o() {
                return new b();
            }

            private void p() {
                if ((this.f126698c & 1) != 1) {
                    this.f126699d = new ArrayList(this.f126699d);
                    this.f126698c |= 1;
                }
            }

            private void y() {
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC1169a
            /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
            public b c(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws Throwable {
                Contract contract = null;
                try {
                    try {
                        Contract contractD = Contract.f126693h.d(eVar, fVar);
                        if (contractD != null) {
                            h(contractD);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e10) {
                        Contract contract2 = (Contract) e10.a();
                        try {
                            throw e10;
                        } catch (Throwable th2) {
                            th = th2;
                            contract = contract2;
                            if (contract != null) {
                                h(contract);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (contract != null) {
                        h(contract);
                    }
                    throw th;
                }
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.n.a
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public Contract build() {
                Contract contractM = m();
                if (contractM.l()) {
                    return contractM;
                }
                throw kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC1169a.d(contractM);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
            public final boolean l() {
                for (int i10 = 0; i10 < x(); i10++) {
                    if (!s(i10).l()) {
                        return false;
                    }
                }
                return true;
            }

            public Contract m() {
                Contract contract = new Contract(this);
                if ((this.f126698c & 1) == 1) {
                    this.f126699d = Collections.unmodifiableList(this.f126699d);
                    this.f126698c &= -2;
                }
                contract.f126695d = this.f126699d;
                return contract;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
            public b m() {
                return o().h(m());
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b, kotlin.reflect.jvm.internal.impl.protobuf.o
            /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
            public Contract r() {
                return Contract.p();
            }

            public Effect s(int i10) {
                return this.f126699d.get(i10);
            }

            public int x() {
                return this.f126699d.size();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b
            /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
            public b h(Contract contract) {
                if (contract == Contract.p()) {
                    return this;
                }
                if (!contract.f126695d.isEmpty()) {
                    if (this.f126699d.isEmpty()) {
                        this.f126699d = contract.f126695d;
                        this.f126698c &= -2;
                    } else {
                        p();
                        this.f126699d.addAll(contract.f126695d);
                    }
                }
                i(g().b(contract.f126694c));
                return this;
            }
        }

        static {
            Contract contract = new Contract(true);
            f126692g = contract;
            contract.y();
        }

        private Contract(GeneratedMessageLite.b bVar) {
            super(bVar);
            this.f126696e = (byte) -1;
            this.f126697f = -1;
            this.f126694c = bVar.g();
        }

        private Contract(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws InvalidProtocolBufferException {
            this.f126696e = (byte) -1;
            this.f126697f = -1;
            y();
            kotlin.reflect.jvm.internal.impl.protobuf.d.b bVarU = kotlin.reflect.jvm.internal.impl.protobuf.d.u();
            CodedOutputStream codedOutputStreamJ = CodedOutputStream.J(bVarU, 1);
            boolean z10 = false;
            boolean z11 = false;
            while (!z10) {
                try {
                    try {
                        int iK = eVar.K();
                        if (iK != 0) {
                            if (iK == 10) {
                                if (!(z11 & true)) {
                                    this.f126695d = new ArrayList();
                                    z11 |= true;
                                }
                                this.f126695d.add((Effect) eVar.u(Effect.f126701l, fVar));
                            } else if (!j(eVar, codedOutputStreamJ, fVar, iK)) {
                            }
                        }
                        z10 = true;
                    } catch (Throwable th2) {
                        if (z11 & true) {
                            this.f126695d = Collections.unmodifiableList(this.f126695d);
                        }
                        try {
                            codedOutputStreamJ.I();
                        } catch (IOException unused) {
                        } finally {
                            this.f126694c = bVarU.e();
                        }
                        g();
                        throw th2;
                    }
                } catch (InvalidProtocolBufferException e10) {
                    throw e10.i(this);
                } catch (IOException e11) {
                    throw new InvalidProtocolBufferException(e11.getMessage()).i(this);
                }
            }
            if (z11 & true) {
                this.f126695d = Collections.unmodifiableList(this.f126695d);
            }
            try {
                codedOutputStreamJ.I();
            } catch (IOException unused2) {
            } finally {
                this.f126694c = bVarU.e();
            }
            g();
        }

        private Contract(boolean z10) {
            this.f126696e = (byte) -1;
            this.f126697f = -1;
            this.f126694c = kotlin.reflect.jvm.internal.impl.protobuf.d.f127320b;
        }

        public static b A(Contract contract) {
            return z().h(contract);
        }

        public static Contract p() {
            return f126692g;
        }

        private void y() {
            this.f126695d = Collections.emptyList();
        }

        public static b z() {
            return b.o();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
        public b v() {
            return z();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
        public b t() {
            return A(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        public void a(CodedOutputStream codedOutputStream) throws IOException {
            u();
            for (int i10 = 0; i10 < this.f126695d.size(); i10++) {
                codedOutputStream.d0(1, this.f126695d.get(i10));
            }
            codedOutputStream.i0(this.f126694c);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public final boolean l() {
            byte b10 = this.f126696e;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            for (int i10 = 0; i10 < x(); i10++) {
                if (!s(i10).l()) {
                    this.f126696e = (byte) 0;
                    return false;
                }
            }
            this.f126696e = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public Contract r() {
            return f126692g;
        }

        public Effect s(int i10) {
            return this.f126695d.get(i10);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        public int u() {
            int i10 = this.f126697f;
            if (i10 != -1) {
                return i10;
            }
            int iS = 0;
            for (int i11 = 0; i11 < this.f126695d.size(); i11++) {
                iS += CodedOutputStream.s(1, this.f126695d.get(i11));
            }
            int size = iS + this.f126694c.size();
            this.f126697f = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.n
        public kotlin.reflect.jvm.internal.impl.protobuf.p<Contract> w() {
            return f126693h;
        }

        public int x() {
            return this.f126695d.size();
        }
    }

    public static final class Effect extends GeneratedMessageLite implements g {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final Effect f126700k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static kotlin.reflect.jvm.internal.impl.protobuf.p<Effect> f126701l = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final kotlin.reflect.jvm.internal.impl.protobuf.d f126702c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f126703d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private EffectType f126704e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private List<Expression> f126705f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Expression f126706g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private InvocationKind f126707h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private byte f126708i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f126709j;

        public enum EffectType implements kotlin.reflect.jvm.internal.impl.protobuf.h.a {
            RETURNS_CONSTANT(0, 0),
            CALLS(1, 1),
            RETURNS_NOT_NULL(2, 2);

            private static kotlin.reflect.jvm.internal.impl.protobuf.h.b<EffectType> internalValueMap = new a();
            private final int value;

            public static final class a implements kotlin.reflect.jvm.internal.impl.protobuf.h.b<EffectType> {
                a() {
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public EffectType a(int i10) {
                    return EffectType.valueOf(i10);
                }
            }

            EffectType(int i10, int i11) {
                this.value = i11;
            }

            public static EffectType valueOf(int i10) {
                if (i10 == 0) {
                    return RETURNS_CONSTANT;
                }
                if (i10 == 1) {
                    return CALLS;
                }
                if (i10 != 2) {
                    return null;
                }
                return RETURNS_NOT_NULL;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.a
            public final int getNumber() {
                return this.value;
            }
        }

        public enum InvocationKind implements kotlin.reflect.jvm.internal.impl.protobuf.h.a {
            AT_MOST_ONCE(0, 0),
            EXACTLY_ONCE(1, 1),
            AT_LEAST_ONCE(2, 2);

            private static kotlin.reflect.jvm.internal.impl.protobuf.h.b<InvocationKind> internalValueMap = new a();
            private final int value;

            public static final class a implements kotlin.reflect.jvm.internal.impl.protobuf.h.b<InvocationKind> {
                a() {
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public InvocationKind a(int i10) {
                    return InvocationKind.valueOf(i10);
                }
            }

            InvocationKind(int i10, int i11) {
                this.value = i11;
            }

            public static InvocationKind valueOf(int i10) {
                if (i10 == 0) {
                    return AT_MOST_ONCE;
                }
                if (i10 == 1) {
                    return EXACTLY_ONCE;
                }
                if (i10 != 2) {
                    return null;
                }
                return AT_LEAST_ONCE;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.a
            public final int getNumber() {
                return this.value;
            }
        }

        public static final class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<Effect> {
            a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public Effect d(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws InvalidProtocolBufferException {
                return new Effect(eVar, fVar);
            }
        }

        public static final class b extends GeneratedMessageLite.b<Effect, b> implements g {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private int f126710c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private EffectType f126711d = EffectType.RETURNS_CONSTANT;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private List<Expression> f126712e = Collections.emptyList();

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private Expression f126713f = Expression.F();

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private InvocationKind f126714g = InvocationKind.AT_MOST_ONCE;

            private b() {
                B();
            }

            private void B() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static b o() {
                return new b();
            }

            private void p() {
                if ((this.f126710c & 2) != 2) {
                    this.f126712e = new ArrayList(this.f126712e);
                    this.f126710c |= 2;
                }
            }

            public b C(Expression expression) {
                if ((this.f126710c & 4) != 4 || this.f126713f == Expression.F()) {
                    this.f126713f = expression;
                } else {
                    this.f126713f = Expression.V(this.f126713f).h(expression).m();
                }
                this.f126710c |= 4;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b
            /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
            public b h(Effect effect) {
                if (effect == Effect.z()) {
                    return this;
                }
                if (effect.G()) {
                    F(effect.D());
                }
                if (!effect.f126705f.isEmpty()) {
                    if (this.f126712e.isEmpty()) {
                        this.f126712e = effect.f126705f;
                        this.f126710c &= -3;
                    } else {
                        p();
                        this.f126712e.addAll(effect.f126705f);
                    }
                }
                if (effect.F()) {
                    C(effect.y());
                }
                if (effect.H()) {
                    G(effect.E());
                }
                i(g().b(effect.f126702c));
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC1169a
            /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
            public b c(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws Throwable {
                Effect effect = null;
                try {
                    try {
                        Effect effectD = Effect.f126701l.d(eVar, fVar);
                        if (effectD != null) {
                            h(effectD);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e10) {
                        Effect effect2 = (Effect) e10.a();
                        try {
                            throw e10;
                        } catch (Throwable th2) {
                            th = th2;
                            effect = effect2;
                            if (effect != null) {
                                h(effect);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (effect != null) {
                        h(effect);
                    }
                    throw th;
                }
            }

            public b F(EffectType effectType) {
                effectType.getClass();
                this.f126710c |= 1;
                this.f126711d = effectType;
                return this;
            }

            public b G(InvocationKind invocationKind) {
                invocationKind.getClass();
                this.f126710c |= 8;
                this.f126714g = invocationKind;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.n.a
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public Effect build() {
                Effect effectM = m();
                if (effectM.l()) {
                    return effectM;
                }
                throw kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC1169a.d(effectM);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
            public final boolean l() {
                for (int i10 = 0; i10 < y(); i10++) {
                    if (!x(i10).l()) {
                        return false;
                    }
                }
                return !z() || q().l();
            }

            public Effect m() {
                Effect effect = new Effect(this);
                int i10 = this.f126710c;
                int i11 = (i10 & 1) != 1 ? 0 : 1;
                effect.f126704e = this.f126711d;
                if ((this.f126710c & 2) == 2) {
                    this.f126712e = Collections.unmodifiableList(this.f126712e);
                    this.f126710c &= -3;
                }
                effect.f126705f = this.f126712e;
                if ((i10 & 4) == 4) {
                    i11 |= 2;
                }
                effect.f126706g = this.f126713f;
                if ((i10 & 8) == 8) {
                    i11 |= 4;
                }
                effect.f126707h = this.f126714g;
                effect.f126703d = i11;
                return effect;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public b m() {
                return o().h(m());
            }

            public Expression q() {
                return this.f126713f;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b, kotlin.reflect.jvm.internal.impl.protobuf.o
            /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
            public Effect r() {
                return Effect.z();
            }

            public Expression x(int i10) {
                return this.f126712e.get(i10);
            }

            public int y() {
                return this.f126712e.size();
            }

            public boolean z() {
                return (this.f126710c & 4) == 4;
            }
        }

        static {
            Effect effect = new Effect(true);
            f126700k = effect;
            effect.J();
        }

        private Effect(GeneratedMessageLite.b bVar) {
            super(bVar);
            this.f126708i = (byte) -1;
            this.f126709j = -1;
            this.f126702c = bVar.g();
        }

        private Effect(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws InvalidProtocolBufferException {
            this.f126708i = (byte) -1;
            this.f126709j = -1;
            J();
            kotlin.reflect.jvm.internal.impl.protobuf.d.b bVarU = kotlin.reflect.jvm.internal.impl.protobuf.d.u();
            CodedOutputStream codedOutputStreamJ = CodedOutputStream.J(bVarU, 1);
            boolean z10 = false;
            int i10 = 0;
            while (!z10) {
                try {
                    try {
                        int iK = eVar.K();
                        if (iK != 0) {
                            if (iK == 8) {
                                int iN = eVar.n();
                                EffectType effectTypeValueOf = EffectType.valueOf(iN);
                                if (effectTypeValueOf == null) {
                                    codedOutputStreamJ.o0(iK);
                                    codedOutputStreamJ.o0(iN);
                                } else {
                                    this.f126703d |= 1;
                                    this.f126704e = effectTypeValueOf;
                                }
                            } else if (iK == 18) {
                                if ((i10 & 2) != 2) {
                                    this.f126705f = new ArrayList();
                                    i10 |= 2;
                                }
                                this.f126705f.add((Expression) eVar.u(Expression.f126725o, fVar));
                            } else if (iK == 26) {
                                Expression.b bVarT = (this.f126703d & 2) == 2 ? this.f126706g.t() : null;
                                Expression expression = (Expression) eVar.u(Expression.f126725o, fVar);
                                this.f126706g = expression;
                                if (bVarT != null) {
                                    bVarT.h(expression);
                                    this.f126706g = bVarT.m();
                                }
                                this.f126703d |= 2;
                            } else if (iK == 32) {
                                int iN2 = eVar.n();
                                InvocationKind invocationKindValueOf = InvocationKind.valueOf(iN2);
                                if (invocationKindValueOf == null) {
                                    codedOutputStreamJ.o0(iK);
                                    codedOutputStreamJ.o0(iN2);
                                } else {
                                    this.f126703d |= 4;
                                    this.f126707h = invocationKindValueOf;
                                }
                            } else if (!j(eVar, codedOutputStreamJ, fVar, iK)) {
                            }
                        }
                        z10 = true;
                    } catch (Throwable th2) {
                        if ((i10 & 2) == 2) {
                            this.f126705f = Collections.unmodifiableList(this.f126705f);
                        }
                        try {
                            codedOutputStreamJ.I();
                        } catch (IOException unused) {
                        } finally {
                            this.f126702c = bVarU.e();
                        }
                        g();
                        throw th2;
                    }
                } catch (InvalidProtocolBufferException e10) {
                    throw e10.i(this);
                } catch (IOException e11) {
                    throw new InvalidProtocolBufferException(e11.getMessage()).i(this);
                }
            }
            if ((i10 & 2) == 2) {
                this.f126705f = Collections.unmodifiableList(this.f126705f);
            }
            try {
                codedOutputStreamJ.I();
            } catch (IOException unused2) {
            } finally {
                this.f126702c = bVarU.e();
            }
            g();
        }

        private Effect(boolean z10) {
            this.f126708i = (byte) -1;
            this.f126709j = -1;
            this.f126702c = kotlin.reflect.jvm.internal.impl.protobuf.d.f127320b;
        }

        private void J() {
            this.f126704e = EffectType.RETURNS_CONSTANT;
            this.f126705f = Collections.emptyList();
            this.f126706g = Expression.F();
            this.f126707h = InvocationKind.AT_MOST_ONCE;
        }

        public static b K() {
            return b.o();
        }

        public static b L(Effect effect) {
            return K().h(effect);
        }

        public static Effect z() {
            return f126700k;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
        public Effect r() {
            return f126700k;
        }

        public Expression B(int i10) {
            return this.f126705f.get(i10);
        }

        public int C() {
            return this.f126705f.size();
        }

        public EffectType D() {
            return this.f126704e;
        }

        public InvocationKind E() {
            return this.f126707h;
        }

        public boolean F() {
            return (this.f126703d & 2) == 2;
        }

        public boolean G() {
            return (this.f126703d & 1) == 1;
        }

        public boolean H() {
            return (this.f126703d & 4) == 4;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public b v() {
            return K();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public b t() {
            return L(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        public void a(CodedOutputStream codedOutputStream) throws IOException {
            u();
            if ((this.f126703d & 1) == 1) {
                codedOutputStream.S(1, this.f126704e.getNumber());
            }
            for (int i10 = 0; i10 < this.f126705f.size(); i10++) {
                codedOutputStream.d0(2, this.f126705f.get(i10));
            }
            if ((this.f126703d & 2) == 2) {
                codedOutputStream.d0(3, this.f126706g);
            }
            if ((this.f126703d & 4) == 4) {
                codedOutputStream.S(4, this.f126707h.getNumber());
            }
            codedOutputStream.i0(this.f126702c);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public final boolean l() {
            byte b10 = this.f126708i;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            for (int i10 = 0; i10 < C(); i10++) {
                if (!B(i10).l()) {
                    this.f126708i = (byte) 0;
                    return false;
                }
            }
            if (!F() || y().l()) {
                this.f126708i = (byte) 1;
                return true;
            }
            this.f126708i = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        public int u() {
            int i10 = this.f126709j;
            if (i10 != -1) {
                return i10;
            }
            int iH = (this.f126703d & 1) == 1 ? CodedOutputStream.h(1, this.f126704e.getNumber()) + 0 : 0;
            for (int i11 = 0; i11 < this.f126705f.size(); i11++) {
                iH += CodedOutputStream.s(2, this.f126705f.get(i11));
            }
            if ((this.f126703d & 2) == 2) {
                iH += CodedOutputStream.s(3, this.f126706g);
            }
            if ((this.f126703d & 4) == 4) {
                iH += CodedOutputStream.h(4, this.f126707h.getNumber());
            }
            int size = iH + this.f126702c.size();
            this.f126709j = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.n
        public kotlin.reflect.jvm.internal.impl.protobuf.p<Effect> w() {
            return f126701l;
        }

        public Expression y() {
            return this.f126706g;
        }
    }

    public static final class EnumEntry extends GeneratedMessageLite.ExtendableMessage<EnumEntry> implements h {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final EnumEntry f126715i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static kotlin.reflect.jvm.internal.impl.protobuf.p<EnumEntry> f126716j = new a();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final kotlin.reflect.jvm.internal.impl.protobuf.d f126717d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f126718e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f126719f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private byte f126720g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f126721h;

        public static final class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<EnumEntry> {
            a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public EnumEntry d(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws InvalidProtocolBufferException {
                return new EnumEntry(eVar, fVar);
            }
        }

        public static final class b extends GeneratedMessageLite.c<EnumEntry, b> implements h {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private int f126722e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private int f126723f;

            private b() {
                C();
            }

            private void C() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static b z() {
                return new b();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b, kotlin.reflect.jvm.internal.impl.protobuf.o
            /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
            public EnumEntry r() {
                return EnumEntry.D();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b
            /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
            public b h(EnumEntry enumEntry) {
                if (enumEntry == EnumEntry.D()) {
                    return this;
                }
                if (enumEntry.G()) {
                    F(enumEntry.F());
                }
                p(enumEntry);
                i(g().b(enumEntry.f126717d));
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC1169a
            /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
            public b c(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws Throwable {
                EnumEntry enumEntry = null;
                try {
                    try {
                        EnumEntry enumEntryD = EnumEntry.f126716j.d(eVar, fVar);
                        if (enumEntryD != null) {
                            h(enumEntryD);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e10) {
                        EnumEntry enumEntry2 = (EnumEntry) e10.a();
                        try {
                            throw e10;
                        } catch (Throwable th2) {
                            th = th2;
                            enumEntry = enumEntry2;
                            if (enumEntry != null) {
                                h(enumEntry);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (enumEntry != null) {
                        h(enumEntry);
                    }
                    throw th;
                }
            }

            public b F(int i10) {
                this.f126722e |= 1;
                this.f126723f = i10;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
            public final boolean l() {
                return o();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.n.a
            /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
            public EnumEntry build() {
                EnumEntry enumEntryX = x();
                if (enumEntryX.l()) {
                    return enumEntryX;
                }
                throw kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC1169a.d(enumEntryX);
            }

            public EnumEntry x() {
                EnumEntry enumEntry = new EnumEntry(this);
                int i10 = (this.f126722e & 1) != 1 ? 0 : 1;
                enumEntry.f126719f = this.f126723f;
                enumEntry.f126718e = i10;
                return enumEntry;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.c
            /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
            public b m() {
                return z().h(x());
            }
        }

        static {
            EnumEntry enumEntry = new EnumEntry(true);
            f126715i = enumEntry;
            enumEntry.H();
        }

        private EnumEntry(GeneratedMessageLite.c<EnumEntry, ?> cVar) {
            super(cVar);
            this.f126720g = (byte) -1;
            this.f126721h = -1;
            this.f126717d = cVar.g();
        }

        private EnumEntry(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws InvalidProtocolBufferException {
            this.f126720g = (byte) -1;
            this.f126721h = -1;
            H();
            kotlin.reflect.jvm.internal.impl.protobuf.d.b bVarU = kotlin.reflect.jvm.internal.impl.protobuf.d.u();
            CodedOutputStream codedOutputStreamJ = CodedOutputStream.J(bVarU, 1);
            boolean z10 = false;
            while (!z10) {
                try {
                    try {
                        int iK = eVar.K();
                        if (iK != 0) {
                            if (iK == 8) {
                                this.f126718e |= 1;
                                this.f126719f = eVar.s();
                            } else if (!j(eVar, codedOutputStreamJ, fVar, iK)) {
                            }
                        }
                        z10 = true;
                    } catch (InvalidProtocolBufferException e10) {
                        throw e10.i(this);
                    } catch (IOException e11) {
                        throw new InvalidProtocolBufferException(e11.getMessage()).i(this);
                    }
                } catch (Throwable th2) {
                    try {
                        codedOutputStreamJ.I();
                    } catch (IOException unused) {
                    } finally {
                        this.f126717d = bVarU.e();
                    }
                    g();
                    throw th2;
                }
            }
            try {
                codedOutputStreamJ.I();
            } catch (IOException unused2) {
            } finally {
                this.f126717d = bVarU.e();
            }
            g();
        }

        private EnumEntry(boolean z10) {
            this.f126720g = (byte) -1;
            this.f126721h = -1;
            this.f126717d = kotlin.reflect.jvm.internal.impl.protobuf.d.f127320b;
        }

        public static EnumEntry D() {
            return f126715i;
        }

        private void H() {
            this.f126719f = 0;
        }

        public static b J() {
            return b.z();
        }

        public static b K(EnumEntry enumEntry) {
            return J().h(enumEntry);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
        public EnumEntry r() {
            return f126715i;
        }

        public int F() {
            return this.f126719f;
        }

        public boolean G() {
            return (this.f126718e & 1) == 1;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
        public b v() {
            return J();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public b t() {
            return K(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        public void a(CodedOutputStream codedOutputStream) throws IOException {
            u();
            GeneratedMessageLite.ExtendableMessage<MessageType>.a aVarY = y();
            if ((this.f126718e & 1) == 1) {
                codedOutputStream.a0(1, this.f126719f);
            }
            aVarY.a(200, codedOutputStream);
            codedOutputStream.i0(this.f126717d);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public final boolean l() {
            byte b10 = this.f126720g;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            if (n()) {
                this.f126720g = (byte) 1;
                return true;
            }
            this.f126720g = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        public int u() {
            int i10 = this.f126721h;
            if (i10 != -1) {
                return i10;
            }
            int iO = ((this.f126718e & 1) == 1 ? 0 + CodedOutputStream.o(1, this.f126719f) : 0) + o() + this.f126717d.size();
            this.f126721h = iO;
            return iO;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.n
        public kotlin.reflect.jvm.internal.impl.protobuf.p<EnumEntry> w() {
            return f126716j;
        }
    }

    public static final class Expression extends GeneratedMessageLite implements i {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final Expression f126724n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static kotlin.reflect.jvm.internal.impl.protobuf.p<Expression> f126725o = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final kotlin.reflect.jvm.internal.impl.protobuf.d f126726c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f126727d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f126728e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f126729f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private ConstantValue f126730g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private Type f126731h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f126732i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private List<Expression> f126733j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private List<Expression> f126734k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private byte f126735l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f126736m;

        public enum ConstantValue implements kotlin.reflect.jvm.internal.impl.protobuf.h.a {
            TRUE(0, 0),
            FALSE(1, 1),
            NULL(2, 2);

            private static kotlin.reflect.jvm.internal.impl.protobuf.h.b<ConstantValue> internalValueMap = new a();
            private final int value;

            public static final class a implements kotlin.reflect.jvm.internal.impl.protobuf.h.b<ConstantValue> {
                a() {
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public ConstantValue a(int i10) {
                    return ConstantValue.valueOf(i10);
                }
            }

            ConstantValue(int i10, int i11) {
                this.value = i11;
            }

            public static ConstantValue valueOf(int i10) {
                if (i10 == 0) {
                    return TRUE;
                }
                if (i10 == 1) {
                    return FALSE;
                }
                if (i10 != 2) {
                    return null;
                }
                return NULL;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.a
            public final int getNumber() {
                return this.value;
            }
        }

        public static final class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<Expression> {
            a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public Expression d(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws InvalidProtocolBufferException {
                return new Expression(eVar, fVar);
            }
        }

        public static final class b extends GeneratedMessageLite.b<Expression, b> implements i {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private int f126737c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f126738d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private int f126739e;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private int f126742h;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private ConstantValue f126740f = ConstantValue.TRUE;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private Type f126741g = Type.Y();

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private List<Expression> f126743i = Collections.emptyList();

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            private List<Expression> f126744j = Collections.emptyList();

            private b() {
                E();
            }

            private void E() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static b o() {
                return new b();
            }

            private void p() {
                if ((this.f126737c & 32) != 32) {
                    this.f126743i = new ArrayList(this.f126743i);
                    this.f126737c |= 32;
                }
            }

            private void q() {
                if ((this.f126737c & 64) != 64) {
                    this.f126744j = new ArrayList(this.f126744j);
                    this.f126737c |= 64;
                }
            }

            public Expression B(int i10) {
                return this.f126744j.get(i10);
            }

            public int C() {
                return this.f126744j.size();
            }

            public boolean D() {
                return (this.f126737c & 8) == 8;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b
            /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
            public b h(Expression expression) {
                if (expression == Expression.F()) {
                    return this;
                }
                if (expression.P()) {
                    K(expression.H());
                }
                if (expression.S()) {
                    O(expression.N());
                }
                if (expression.O()) {
                    J(expression.E());
                }
                if (expression.Q()) {
                    H(expression.J());
                }
                if (expression.R()) {
                    M(expression.K());
                }
                if (!expression.f126733j.isEmpty()) {
                    if (this.f126743i.isEmpty()) {
                        this.f126743i = expression.f126733j;
                        this.f126737c &= -33;
                    } else {
                        p();
                        this.f126743i.addAll(expression.f126733j);
                    }
                }
                if (!expression.f126734k.isEmpty()) {
                    if (this.f126744j.isEmpty()) {
                        this.f126744j = expression.f126734k;
                        this.f126737c &= -65;
                    } else {
                        q();
                        this.f126744j.addAll(expression.f126734k);
                    }
                }
                i(g().b(expression.f126726c));
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC1169a
            /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
            public b c(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws Throwable {
                Expression expression = null;
                try {
                    try {
                        Expression expressionD = Expression.f126725o.d(eVar, fVar);
                        if (expressionD != null) {
                            h(expressionD);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e10) {
                        Expression expression2 = (Expression) e10.a();
                        try {
                            throw e10;
                        } catch (Throwable th2) {
                            th = th2;
                            expression = expression2;
                            if (expression != null) {
                                h(expression);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (expression != null) {
                        h(expression);
                    }
                    throw th;
                }
            }

            public b H(Type type) {
                if ((this.f126737c & 8) != 8 || this.f126741g == Type.Y()) {
                    this.f126741g = type;
                } else {
                    this.f126741g = Type.z0(this.f126741g).h(type).x();
                }
                this.f126737c |= 8;
                return this;
            }

            public b J(ConstantValue constantValue) {
                constantValue.getClass();
                this.f126737c |= 4;
                this.f126740f = constantValue;
                return this;
            }

            public b K(int i10) {
                this.f126737c |= 1;
                this.f126738d = i10;
                return this;
            }

            public b M(int i10) {
                this.f126737c |= 16;
                this.f126742h = i10;
                return this;
            }

            public b O(int i10) {
                this.f126737c |= 2;
                this.f126739e = i10;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.n.a
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public Expression build() {
                Expression expressionM = m();
                if (expressionM.l()) {
                    return expressionM;
                }
                throw kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC1169a.d(expressionM);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
            public final boolean l() {
                if (D() && !z().l()) {
                    return false;
                }
                for (int i10 = 0; i10 < x(); i10++) {
                    if (!s(i10).l()) {
                        return false;
                    }
                }
                for (int i11 = 0; i11 < C(); i11++) {
                    if (!B(i11).l()) {
                        return false;
                    }
                }
                return true;
            }

            public Expression m() {
                Expression expression = new Expression(this);
                int i10 = this.f126737c;
                int i11 = (i10 & 1) != 1 ? 0 : 1;
                expression.f126728e = this.f126738d;
                if ((i10 & 2) == 2) {
                    i11 |= 2;
                }
                expression.f126729f = this.f126739e;
                if ((i10 & 4) == 4) {
                    i11 |= 4;
                }
                expression.f126730g = this.f126740f;
                if ((i10 & 8) == 8) {
                    i11 |= 8;
                }
                expression.f126731h = this.f126741g;
                if ((i10 & 16) == 16) {
                    i11 |= 16;
                }
                expression.f126732i = this.f126742h;
                if ((this.f126737c & 32) == 32) {
                    this.f126743i = Collections.unmodifiableList(this.f126743i);
                    this.f126737c &= -33;
                }
                expression.f126733j = this.f126743i;
                if ((this.f126737c & 64) == 64) {
                    this.f126744j = Collections.unmodifiableList(this.f126744j);
                    this.f126737c &= -65;
                }
                expression.f126734k = this.f126744j;
                expression.f126727d = i11;
                return expression;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public b m() {
                return o().h(m());
            }

            public Expression s(int i10) {
                return this.f126743i.get(i10);
            }

            public int x() {
                return this.f126743i.size();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b, kotlin.reflect.jvm.internal.impl.protobuf.o
            /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
            public Expression r() {
                return Expression.F();
            }

            public Type z() {
                return this.f126741g;
            }
        }

        static {
            Expression expression = new Expression(true);
            f126724n = expression;
            expression.T();
        }

        private Expression(GeneratedMessageLite.b bVar) {
            super(bVar);
            this.f126735l = (byte) -1;
            this.f126736m = -1;
            this.f126726c = bVar.g();
        }

        private Expression(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws InvalidProtocolBufferException {
            this.f126735l = (byte) -1;
            this.f126736m = -1;
            T();
            kotlin.reflect.jvm.internal.impl.protobuf.d.b bVarU = kotlin.reflect.jvm.internal.impl.protobuf.d.u();
            CodedOutputStream codedOutputStreamJ = CodedOutputStream.J(bVarU, 1);
            boolean z10 = false;
            int i10 = 0;
            while (!z10) {
                try {
                    try {
                        int iK = eVar.K();
                        if (iK != 0) {
                            if (iK == 8) {
                                this.f126727d |= 1;
                                this.f126728e = eVar.s();
                            } else if (iK == 16) {
                                this.f126727d |= 2;
                                this.f126729f = eVar.s();
                            } else if (iK == 24) {
                                int iN = eVar.n();
                                ConstantValue constantValueValueOf = ConstantValue.valueOf(iN);
                                if (constantValueValueOf == null) {
                                    codedOutputStreamJ.o0(iK);
                                    codedOutputStreamJ.o0(iN);
                                } else {
                                    this.f126727d |= 4;
                                    this.f126730g = constantValueValueOf;
                                }
                            } else if (iK == 34) {
                                Type.b bVarT = (this.f126727d & 8) == 8 ? this.f126731h.t() : null;
                                Type type = (Type) eVar.u(Type.f126879w, fVar);
                                this.f126731h = type;
                                if (bVarT != null) {
                                    bVarT.h(type);
                                    this.f126731h = bVarT.x();
                                }
                                this.f126727d |= 8;
                            } else if (iK == 40) {
                                this.f126727d |= 16;
                                this.f126732i = eVar.s();
                            } else if (iK == 50) {
                                if ((i10 & 32) != 32) {
                                    this.f126733j = new ArrayList();
                                    i10 |= 32;
                                }
                                this.f126733j.add((Expression) eVar.u(f126725o, fVar));
                            } else if (iK == 58) {
                                if ((i10 & 64) != 64) {
                                    this.f126734k = new ArrayList();
                                    i10 |= 64;
                                }
                                this.f126734k.add((Expression) eVar.u(f126725o, fVar));
                            } else if (!j(eVar, codedOutputStreamJ, fVar, iK)) {
                            }
                        }
                        z10 = true;
                    } catch (InvalidProtocolBufferException e10) {
                        throw e10.i(this);
                    } catch (IOException e11) {
                        throw new InvalidProtocolBufferException(e11.getMessage()).i(this);
                    }
                } catch (Throwable th2) {
                    if ((i10 & 32) == 32) {
                        this.f126733j = Collections.unmodifiableList(this.f126733j);
                    }
                    if ((i10 & 64) == 64) {
                        this.f126734k = Collections.unmodifiableList(this.f126734k);
                    }
                    try {
                        codedOutputStreamJ.I();
                    } catch (IOException unused) {
                    } finally {
                        this.f126726c = bVarU.e();
                    }
                    g();
                    throw th2;
                }
            }
            if ((i10 & 32) == 32) {
                this.f126733j = Collections.unmodifiableList(this.f126733j);
            }
            if ((i10 & 64) == 64) {
                this.f126734k = Collections.unmodifiableList(this.f126734k);
            }
            try {
                codedOutputStreamJ.I();
            } catch (IOException unused2) {
            } finally {
                this.f126726c = bVarU.e();
            }
            g();
        }

        private Expression(boolean z10) {
            this.f126735l = (byte) -1;
            this.f126736m = -1;
            this.f126726c = kotlin.reflect.jvm.internal.impl.protobuf.d.f127320b;
        }

        public static Expression F() {
            return f126724n;
        }

        private void T() {
            this.f126728e = 0;
            this.f126729f = 0;
            this.f126730g = ConstantValue.TRUE;
            this.f126731h = Type.Y();
            this.f126732i = 0;
            this.f126733j = Collections.emptyList();
            this.f126734k = Collections.emptyList();
        }

        public static b U() {
            return b.o();
        }

        public static b V(Expression expression) {
            return U().h(expression);
        }

        public Expression C(int i10) {
            return this.f126733j.get(i10);
        }

        public int D() {
            return this.f126733j.size();
        }

        public ConstantValue E() {
            return this.f126730g;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
        public Expression r() {
            return f126724n;
        }

        public int H() {
            return this.f126728e;
        }

        public Type J() {
            return this.f126731h;
        }

        public int K() {
            return this.f126732i;
        }

        public Expression L(int i10) {
            return this.f126734k.get(i10);
        }

        public int M() {
            return this.f126734k.size();
        }

        public int N() {
            return this.f126729f;
        }

        public boolean O() {
            return (this.f126727d & 4) == 4;
        }

        public boolean P() {
            return (this.f126727d & 1) == 1;
        }

        public boolean Q() {
            return (this.f126727d & 8) == 8;
        }

        public boolean R() {
            return (this.f126727d & 16) == 16;
        }

        public boolean S() {
            return (this.f126727d & 2) == 2;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
        public b v() {
            return U();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
        public b t() {
            return V(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        public void a(CodedOutputStream codedOutputStream) throws IOException {
            u();
            if ((this.f126727d & 1) == 1) {
                codedOutputStream.a0(1, this.f126728e);
            }
            if ((this.f126727d & 2) == 2) {
                codedOutputStream.a0(2, this.f126729f);
            }
            if ((this.f126727d & 4) == 4) {
                codedOutputStream.S(3, this.f126730g.getNumber());
            }
            if ((this.f126727d & 8) == 8) {
                codedOutputStream.d0(4, this.f126731h);
            }
            if ((this.f126727d & 16) == 16) {
                codedOutputStream.a0(5, this.f126732i);
            }
            for (int i10 = 0; i10 < this.f126733j.size(); i10++) {
                codedOutputStream.d0(6, this.f126733j.get(i10));
            }
            for (int i11 = 0; i11 < this.f126734k.size(); i11++) {
                codedOutputStream.d0(7, this.f126734k.get(i11));
            }
            codedOutputStream.i0(this.f126726c);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public final boolean l() {
            byte b10 = this.f126735l;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            if (Q() && !J().l()) {
                this.f126735l = (byte) 0;
                return false;
            }
            for (int i10 = 0; i10 < D(); i10++) {
                if (!C(i10).l()) {
                    this.f126735l = (byte) 0;
                    return false;
                }
            }
            for (int i11 = 0; i11 < M(); i11++) {
                if (!L(i11).l()) {
                    this.f126735l = (byte) 0;
                    return false;
                }
            }
            this.f126735l = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        public int u() {
            int i10 = this.f126736m;
            if (i10 != -1) {
                return i10;
            }
            int iO = (this.f126727d & 1) == 1 ? CodedOutputStream.o(1, this.f126728e) + 0 : 0;
            if ((this.f126727d & 2) == 2) {
                iO += CodedOutputStream.o(2, this.f126729f);
            }
            if ((this.f126727d & 4) == 4) {
                iO += CodedOutputStream.h(3, this.f126730g.getNumber());
            }
            if ((this.f126727d & 8) == 8) {
                iO += CodedOutputStream.s(4, this.f126731h);
            }
            if ((this.f126727d & 16) == 16) {
                iO += CodedOutputStream.o(5, this.f126732i);
            }
            for (int i11 = 0; i11 < this.f126733j.size(); i11++) {
                iO += CodedOutputStream.s(6, this.f126733j.get(i11));
            }
            for (int i12 = 0; i12 < this.f126734k.size(); i12++) {
                iO += CodedOutputStream.s(7, this.f126734k.get(i12));
            }
            int size = iO + this.f126726c.size();
            this.f126736m = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.n
        public kotlin.reflect.jvm.internal.impl.protobuf.p<Expression> w() {
            return f126725o;
        }
    }

    public static final class Function extends GeneratedMessageLite.ExtendableMessage<Function> implements j {

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private static final Function f126745w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public static kotlin.reflect.jvm.internal.impl.protobuf.p<Function> f126746x = new a();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final kotlin.reflect.jvm.internal.impl.protobuf.d f126747d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f126748e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f126749f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f126750g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f126751h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private Type f126752i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f126753j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private List<TypeParameter> f126754k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private Type f126755l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f126756m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private List<Type> f126757n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private List<Integer> f126758o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private int f126759p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private List<ValueParameter> f126760q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private TypeTable f126761r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private List<Integer> f126762s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private Contract f126763t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private byte f126764u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private int f126765v;

        public static final class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<Function> {
            a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public Function d(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws InvalidProtocolBufferException {
                return new Function(eVar, fVar);
            }
        }

        public static final class b extends GeneratedMessageLite.c<Function, b> implements j {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private int f126766e;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private int f126769h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            private int f126771j;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            private int f126774m;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private int f126767f = 6;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private int f126768g = 6;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private Type f126770i = Type.Y();

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            private List<TypeParameter> f126772k = Collections.emptyList();

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            private Type f126773l = Type.Y();

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private List<Type> f126775n = Collections.emptyList();

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            private List<Integer> f126776o = Collections.emptyList();

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            private List<ValueParameter> f126777p = Collections.emptyList();

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            private TypeTable f126778q = TypeTable.s();

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            private List<Integer> f126779r = Collections.emptyList();

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            private Contract f126780s = Contract.p();

            private b() {
                b0();
            }

            private void B() {
                if ((this.f126766e & 512) != 512) {
                    this.f126776o = new ArrayList(this.f126776o);
                    this.f126766e |= 512;
                }
            }

            private void C() {
                if ((this.f126766e & 256) != 256) {
                    this.f126775n = new ArrayList(this.f126775n);
                    this.f126766e |= 256;
                }
            }

            private void D() {
                if ((this.f126766e & 32) != 32) {
                    this.f126772k = new ArrayList(this.f126772k);
                    this.f126766e |= 32;
                }
            }

            private void E() {
                if ((this.f126766e & 1024) != 1024) {
                    this.f126777p = new ArrayList(this.f126777p);
                    this.f126766e |= 1024;
                }
            }

            private void F() {
                if ((this.f126766e & 4096) != 4096) {
                    this.f126779r = new ArrayList(this.f126779r);
                    this.f126766e |= 4096;
                }
            }

            private void b0() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static b z() {
                return new b();
            }

            public Type G(int i10) {
                return this.f126775n.get(i10);
            }

            public int H() {
                return this.f126775n.size();
            }

            public Contract J() {
                return this.f126780s;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b, kotlin.reflect.jvm.internal.impl.protobuf.o
            /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
            public Function r() {
                return Function.b0();
            }

            public Type M() {
                return this.f126773l;
            }

            public Type O() {
                return this.f126770i;
            }

            public TypeParameter P(int i10) {
                return this.f126772k.get(i10);
            }

            public int Q() {
                return this.f126772k.size();
            }

            public TypeTable R() {
                return this.f126778q;
            }

            public ValueParameter S(int i10) {
                return this.f126777p.get(i10);
            }

            public int T() {
                return this.f126777p.size();
            }

            public boolean U() {
                return (this.f126766e & 8192) == 8192;
            }

            public boolean V() {
                return (this.f126766e & 4) == 4;
            }

            public boolean X() {
                return (this.f126766e & 64) == 64;
            }

            public boolean Y() {
                return (this.f126766e & 8) == 8;
            }

            public boolean Z() {
                return (this.f126766e & 2048) == 2048;
            }

            public b c0(Contract contract) {
                if ((this.f126766e & 8192) != 8192 || this.f126780s == Contract.p()) {
                    this.f126780s = contract;
                } else {
                    this.f126780s = Contract.A(this.f126780s).h(contract).m();
                }
                this.f126766e |= 8192;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b
            /* JADX INFO: renamed from: d0, reason: merged with bridge method [inline-methods] */
            public b h(Function function) {
                if (function == Function.b0()) {
                    return this;
                }
                if (function.t0()) {
                    i0(function.d0());
                }
                if (function.v0()) {
                    k0(function.f0());
                }
                if (function.u0()) {
                    j0(function.e0());
                }
                if (function.y0()) {
                    g0(function.i0());
                }
                if (function.z0()) {
                    m0(function.j0());
                }
                if (!function.f126754k.isEmpty()) {
                    if (this.f126772k.isEmpty()) {
                        this.f126772k = function.f126754k;
                        this.f126766e &= -33;
                    } else {
                        D();
                        this.f126772k.addAll(function.f126754k);
                    }
                }
                if (function.w0()) {
                    f0(function.g0());
                }
                if (function.x0()) {
                    l0(function.h0());
                }
                if (!function.f126757n.isEmpty()) {
                    if (this.f126775n.isEmpty()) {
                        this.f126775n = function.f126757n;
                        this.f126766e &= -257;
                    } else {
                        C();
                        this.f126775n.addAll(function.f126757n);
                    }
                }
                if (!function.f126758o.isEmpty()) {
                    if (this.f126776o.isEmpty()) {
                        this.f126776o = function.f126758o;
                        this.f126766e &= -513;
                    } else {
                        B();
                        this.f126776o.addAll(function.f126758o);
                    }
                }
                if (!function.f126760q.isEmpty()) {
                    if (this.f126777p.isEmpty()) {
                        this.f126777p = function.f126760q;
                        this.f126766e &= ErrorCode.ERROR_CODE_JOIN_ROOM_ROOM_FORBIDDEN;
                    } else {
                        E();
                        this.f126777p.addAll(function.f126760q);
                    }
                }
                if (function.A0()) {
                    h0(function.n0());
                }
                if (!function.f126762s.isEmpty()) {
                    if (this.f126779r.isEmpty()) {
                        this.f126779r = function.f126762s;
                        this.f126766e &= -4097;
                    } else {
                        F();
                        this.f126779r.addAll(function.f126762s);
                    }
                }
                if (function.s0()) {
                    c0(function.a0());
                }
                p(function);
                i(g().b(function.f126747d));
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC1169a
            /* JADX INFO: renamed from: e0, reason: merged with bridge method [inline-methods] */
            public b c(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws Throwable {
                Function function = null;
                try {
                    try {
                        Function functionD = Function.f126746x.d(eVar, fVar);
                        if (functionD != null) {
                            h(functionD);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e10) {
                        Function function2 = (Function) e10.a();
                        try {
                            throw e10;
                        } catch (Throwable th2) {
                            th = th2;
                            function = function2;
                            if (function != null) {
                                h(function);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (function != null) {
                        h(function);
                    }
                    throw th;
                }
            }

            public b f0(Type type) {
                if ((this.f126766e & 64) != 64 || this.f126773l == Type.Y()) {
                    this.f126773l = type;
                } else {
                    this.f126773l = Type.z0(this.f126773l).h(type).x();
                }
                this.f126766e |= 64;
                return this;
            }

            public b g0(Type type) {
                if ((this.f126766e & 8) != 8 || this.f126770i == Type.Y()) {
                    this.f126770i = type;
                } else {
                    this.f126770i = Type.z0(this.f126770i).h(type).x();
                }
                this.f126766e |= 8;
                return this;
            }

            public b h0(TypeTable typeTable) {
                if ((this.f126766e & 2048) != 2048 || this.f126778q == TypeTable.s()) {
                    this.f126778q = typeTable;
                } else {
                    this.f126778q = TypeTable.F(this.f126778q).h(typeTable).m();
                }
                this.f126766e |= 2048;
                return this;
            }

            public b i0(int i10) {
                this.f126766e |= 1;
                this.f126767f = i10;
                return this;
            }

            public b j0(int i10) {
                this.f126766e |= 4;
                this.f126769h = i10;
                return this;
            }

            public b k0(int i10) {
                this.f126766e |= 2;
                this.f126768g = i10;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
            public final boolean l() {
                if (!V()) {
                    return false;
                }
                if (Y() && !O().l()) {
                    return false;
                }
                for (int i10 = 0; i10 < Q(); i10++) {
                    if (!P(i10).l()) {
                        return false;
                    }
                }
                if (X() && !M().l()) {
                    return false;
                }
                for (int i11 = 0; i11 < H(); i11++) {
                    if (!G(i11).l()) {
                        return false;
                    }
                }
                for (int i12 = 0; i12 < T(); i12++) {
                    if (!S(i12).l()) {
                        return false;
                    }
                }
                if (!Z() || R().l()) {
                    return (!U() || J().l()) && o();
                }
                return false;
            }

            public b l0(int i10) {
                this.f126766e |= 128;
                this.f126774m = i10;
                return this;
            }

            public b m0(int i10) {
                this.f126766e |= 16;
                this.f126771j = i10;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.n.a
            /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
            public Function build() {
                Function functionX = x();
                if (functionX.l()) {
                    return functionX;
                }
                throw kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC1169a.d(functionX);
            }

            public Function x() {
                Function function = new Function(this);
                int i10 = this.f126766e;
                int i11 = (i10 & 1) != 1 ? 0 : 1;
                function.f126749f = this.f126767f;
                if ((i10 & 2) == 2) {
                    i11 |= 2;
                }
                function.f126750g = this.f126768g;
                if ((i10 & 4) == 4) {
                    i11 |= 4;
                }
                function.f126751h = this.f126769h;
                if ((i10 & 8) == 8) {
                    i11 |= 8;
                }
                function.f126752i = this.f126770i;
                if ((i10 & 16) == 16) {
                    i11 |= 16;
                }
                function.f126753j = this.f126771j;
                if ((this.f126766e & 32) == 32) {
                    this.f126772k = Collections.unmodifiableList(this.f126772k);
                    this.f126766e &= -33;
                }
                function.f126754k = this.f126772k;
                if ((i10 & 64) == 64) {
                    i11 |= 32;
                }
                function.f126755l = this.f126773l;
                if ((i10 & 128) == 128) {
                    i11 |= 64;
                }
                function.f126756m = this.f126774m;
                if ((this.f126766e & 256) == 256) {
                    this.f126775n = Collections.unmodifiableList(this.f126775n);
                    this.f126766e &= -257;
                }
                function.f126757n = this.f126775n;
                if ((this.f126766e & 512) == 512) {
                    this.f126776o = Collections.unmodifiableList(this.f126776o);
                    this.f126766e &= -513;
                }
                function.f126758o = this.f126776o;
                if ((this.f126766e & 1024) == 1024) {
                    this.f126777p = Collections.unmodifiableList(this.f126777p);
                    this.f126766e &= ErrorCode.ERROR_CODE_JOIN_ROOM_ROOM_FORBIDDEN;
                }
                function.f126760q = this.f126777p;
                if ((i10 & 2048) == 2048) {
                    i11 |= 128;
                }
                function.f126761r = this.f126778q;
                if ((this.f126766e & 4096) == 4096) {
                    this.f126779r = Collections.unmodifiableList(this.f126779r);
                    this.f126766e &= -4097;
                }
                function.f126762s = this.f126779r;
                if ((i10 & 8192) == 8192) {
                    i11 |= 256;
                }
                function.f126763t = this.f126780s;
                function.f126748e = i11;
                return function;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.c
            /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
            public b m() {
                return z().h(x());
            }
        }

        static {
            Function function = new Function(true);
            f126745w = function;
            function.B0();
        }

        private Function(GeneratedMessageLite.c<Function, ?> cVar) {
            super(cVar);
            this.f126759p = -1;
            this.f126764u = (byte) -1;
            this.f126765v = -1;
            this.f126747d = cVar.g();
        }

        private Function(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws InvalidProtocolBufferException {
            this.f126759p = -1;
            this.f126764u = (byte) -1;
            this.f126765v = -1;
            B0();
            kotlin.reflect.jvm.internal.impl.protobuf.d.b bVarU = kotlin.reflect.jvm.internal.impl.protobuf.d.u();
            CodedOutputStream codedOutputStreamJ = CodedOutputStream.J(bVarU, 1);
            boolean z10 = false;
            int i10 = 0;
            while (!z10) {
                try {
                    try {
                        try {
                            int iK = eVar.K();
                            switch (iK) {
                                case 0:
                                    break;
                                case 8:
                                    this.f126748e |= 2;
                                    this.f126750g = eVar.s();
                                    continue;
                                case 16:
                                    this.f126748e |= 4;
                                    this.f126751h = eVar.s();
                                    continue;
                                case 26:
                                    Type.b bVarT = (this.f126748e & 8) == 8 ? this.f126752i.t() : null;
                                    Type type = (Type) eVar.u(Type.f126879w, fVar);
                                    this.f126752i = type;
                                    if (bVarT != null) {
                                        bVarT.h(type);
                                        this.f126752i = bVarT.x();
                                    }
                                    this.f126748e |= 8;
                                    continue;
                                case 34:
                                    int i11 = (i10 == true ? 1 : 0) & 32;
                                    i10 = i10;
                                    if (i11 != 32) {
                                        this.f126754k = new ArrayList();
                                        i10 = (i10 == true ? 1 : 0) | 32;
                                    }
                                    this.f126754k.add((TypeParameter) eVar.u(TypeParameter.f126952p, fVar));
                                    continue;
                                case 42:
                                    Type.b bVarT2 = (this.f126748e & 32) == 32 ? this.f126755l.t() : null;
                                    Type type2 = (Type) eVar.u(Type.f126879w, fVar);
                                    this.f126755l = type2;
                                    if (bVarT2 != null) {
                                        bVarT2.h(type2);
                                        this.f126755l = bVarT2.x();
                                    }
                                    this.f126748e |= 32;
                                    continue;
                                case 50:
                                    int i12 = (i10 == true ? 1 : 0) & 1024;
                                    i10 = i10;
                                    if (i12 != 1024) {
                                        this.f126760q = new ArrayList();
                                        i10 = (i10 == true ? 1 : 0) | 1024;
                                    }
                                    this.f126760q.add((ValueParameter) eVar.u(ValueParameter.f126983o, fVar));
                                    continue;
                                case 56:
                                    this.f126748e |= 16;
                                    this.f126753j = eVar.s();
                                    continue;
                                case 64:
                                    this.f126748e |= 64;
                                    this.f126756m = eVar.s();
                                    continue;
                                case 72:
                                    this.f126748e |= 1;
                                    this.f126749f = eVar.s();
                                    continue;
                                case 82:
                                    int i13 = (i10 == true ? 1 : 0) & 256;
                                    i10 = i10;
                                    if (i13 != 256) {
                                        this.f126757n = new ArrayList();
                                        i10 = (i10 == true ? 1 : 0) | 256;
                                    }
                                    this.f126757n.add((Type) eVar.u(Type.f126879w, fVar));
                                    continue;
                                case 88:
                                    int i14 = (i10 == true ? 1 : 0) & 512;
                                    i10 = i10;
                                    if (i14 != 512) {
                                        this.f126758o = new ArrayList();
                                        i10 = (i10 == true ? 1 : 0) | 512;
                                    }
                                    this.f126758o.add(Integer.valueOf(eVar.s()));
                                    continue;
                                case 90:
                                    int iJ = eVar.j(eVar.A());
                                    int i15 = (i10 == true ? 1 : 0) & 512;
                                    i10 = i10;
                                    if (i15 != 512 && eVar.e() > 0) {
                                        i10 = i10;
                                        this.f126758o = new ArrayList();
                                        i10 = (i10 == true ? 1 : 0) | 512;
                                    }
                                    i10 = i10;
                                    while (eVar.e() > 0) {
                                        this.f126758o.add(Integer.valueOf(eVar.s()));
                                    }
                                    eVar.i(iJ);
                                    continue;
                                case bb.c.b.I1 /* 242 */:
                                    TypeTable.b bVarT3 = (this.f126748e & 128) == 128 ? this.f126761r.t() : null;
                                    TypeTable typeTable = (TypeTable) eVar.u(TypeTable.f126972j, fVar);
                                    this.f126761r = typeTable;
                                    if (bVarT3 != null) {
                                        bVarT3.h(typeTable);
                                        this.f126761r = bVarT3.m();
                                    }
                                    this.f126748e |= 128;
                                    continue;
                                case bb.c.b.O1 /* 248 */:
                                    int i16 = (i10 == true ? 1 : 0) & 4096;
                                    i10 = i10;
                                    if (i16 != 4096) {
                                        this.f126762s = new ArrayList();
                                        i10 = (i10 == true ? 1 : 0) | 4096;
                                    }
                                    this.f126762s.add(Integer.valueOf(eVar.s()));
                                    continue;
                                case 250:
                                    int iJ2 = eVar.j(eVar.A());
                                    int i17 = (i10 == true ? 1 : 0) & 4096;
                                    i10 = i10;
                                    if (i17 != 4096 && eVar.e() > 0) {
                                        i10 = i10;
                                        this.f126762s = new ArrayList();
                                        i10 = (i10 == true ? 1 : 0) | 4096;
                                    }
                                    i10 = i10;
                                    while (eVar.e() > 0) {
                                        this.f126762s.add(Integer.valueOf(eVar.s()));
                                    }
                                    eVar.i(iJ2);
                                    continue;
                                case 258:
                                    Contract.b bVarT4 = (this.f126748e & 256) == 256 ? this.f126763t.t() : null;
                                    Contract contract = (Contract) eVar.u(Contract.f126693h, fVar);
                                    this.f126763t = contract;
                                    if (bVarT4 != null) {
                                        bVarT4.h(contract);
                                        this.f126763t = bVarT4.m();
                                    }
                                    this.f126748e |= 256;
                                    continue;
                                default:
                                    if (!j(eVar, codedOutputStreamJ, fVar, iK)) {
                                        break;
                                    }
                                    break;
                            }
                            z10 = true;
                        } catch (IOException e10) {
                            throw new InvalidProtocolBufferException(e10.getMessage()).i(this);
                        }
                    } catch (InvalidProtocolBufferException e11) {
                        throw e11.i(this);
                    }
                } catch (Throwable th2) {
                    if (((i10 == true ? 1 : 0) & 32) == 32) {
                        this.f126754k = Collections.unmodifiableList(this.f126754k);
                    }
                    if (((i10 == true ? 1 : 0) & 1024) == 1024) {
                        this.f126760q = Collections.unmodifiableList(this.f126760q);
                    }
                    if (((i10 == true ? 1 : 0) & 256) == 256) {
                        this.f126757n = Collections.unmodifiableList(this.f126757n);
                    }
                    if (((i10 == true ? 1 : 0) & 512) == 512) {
                        this.f126758o = Collections.unmodifiableList(this.f126758o);
                    }
                    if (((i10 == true ? 1 : 0) & 4096) == 4096) {
                        this.f126762s = Collections.unmodifiableList(this.f126762s);
                    }
                    try {
                        codedOutputStreamJ.I();
                    } catch (IOException unused) {
                    } finally {
                        this.f126747d = bVarU.e();
                    }
                    g();
                    throw th2;
                }
            }
            if (((i10 == true ? 1 : 0) & 32) == 32) {
                this.f126754k = Collections.unmodifiableList(this.f126754k);
            }
            if (((i10 == true ? 1 : 0) & 1024) == 1024) {
                this.f126760q = Collections.unmodifiableList(this.f126760q);
            }
            if (((i10 == true ? 1 : 0) & 256) == 256) {
                this.f126757n = Collections.unmodifiableList(this.f126757n);
            }
            if (((i10 == true ? 1 : 0) & 512) == 512) {
                this.f126758o = Collections.unmodifiableList(this.f126758o);
            }
            if (((i10 == true ? 1 : 0) & 4096) == 4096) {
                this.f126762s = Collections.unmodifiableList(this.f126762s);
            }
            try {
                codedOutputStreamJ.I();
            } catch (IOException unused2) {
            } finally {
                this.f126747d = bVarU.e();
            }
            g();
        }

        private Function(boolean z10) {
            this.f126759p = -1;
            this.f126764u = (byte) -1;
            this.f126765v = -1;
            this.f126747d = kotlin.reflect.jvm.internal.impl.protobuf.d.f127320b;
        }

        private void B0() {
            this.f126749f = 6;
            this.f126750g = 6;
            this.f126751h = 0;
            this.f126752i = Type.Y();
            this.f126753j = 0;
            this.f126754k = Collections.emptyList();
            this.f126755l = Type.Y();
            this.f126756m = 0;
            this.f126757n = Collections.emptyList();
            this.f126758o = Collections.emptyList();
            this.f126760q = Collections.emptyList();
            this.f126761r = TypeTable.s();
            this.f126762s = Collections.emptyList();
            this.f126763t = Contract.p();
        }

        public static b C0() {
            return b.z();
        }

        public static b D0(Function function) {
            return C0().h(function);
        }

        public static Function F0(InputStream inputStream, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws IOException {
            return f126746x.b(inputStream, fVar);
        }

        public static Function b0() {
            return f126745w;
        }

        public boolean A0() {
            return (this.f126748e & 128) == 128;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        /* JADX INFO: renamed from: E0, reason: merged with bridge method [inline-methods] */
        public b v() {
            return C0();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        /* JADX INFO: renamed from: G0, reason: merged with bridge method [inline-methods] */
        public b t() {
            return D0(this);
        }

        public Type W(int i10) {
            return this.f126757n.get(i10);
        }

        public int X() {
            return this.f126757n.size();
        }

        public List<Integer> Y() {
            return this.f126758o;
        }

        public List<Type> Z() {
            return this.f126757n;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        public void a(CodedOutputStream codedOutputStream) throws IOException {
            u();
            GeneratedMessageLite.ExtendableMessage<MessageType>.a aVarY = y();
            if ((this.f126748e & 2) == 2) {
                codedOutputStream.a0(1, this.f126750g);
            }
            if ((this.f126748e & 4) == 4) {
                codedOutputStream.a0(2, this.f126751h);
            }
            if ((this.f126748e & 8) == 8) {
                codedOutputStream.d0(3, this.f126752i);
            }
            for (int i10 = 0; i10 < this.f126754k.size(); i10++) {
                codedOutputStream.d0(4, this.f126754k.get(i10));
            }
            if ((this.f126748e & 32) == 32) {
                codedOutputStream.d0(5, this.f126755l);
            }
            for (int i11 = 0; i11 < this.f126760q.size(); i11++) {
                codedOutputStream.d0(6, this.f126760q.get(i11));
            }
            if ((this.f126748e & 16) == 16) {
                codedOutputStream.a0(7, this.f126753j);
            }
            if ((this.f126748e & 64) == 64) {
                codedOutputStream.a0(8, this.f126756m);
            }
            if ((this.f126748e & 1) == 1) {
                codedOutputStream.a0(9, this.f126749f);
            }
            for (int i12 = 0; i12 < this.f126757n.size(); i12++) {
                codedOutputStream.d0(10, this.f126757n.get(i12));
            }
            if (Y().size() > 0) {
                codedOutputStream.o0(90);
                codedOutputStream.o0(this.f126759p);
            }
            for (int i13 = 0; i13 < this.f126758o.size(); i13++) {
                codedOutputStream.b0(this.f126758o.get(i13).intValue());
            }
            if ((this.f126748e & 128) == 128) {
                codedOutputStream.d0(30, this.f126761r);
            }
            for (int i14 = 0; i14 < this.f126762s.size(); i14++) {
                codedOutputStream.a0(31, this.f126762s.get(i14).intValue());
            }
            if ((this.f126748e & 256) == 256) {
                codedOutputStream.d0(32, this.f126763t);
            }
            aVarY.a(19000, codedOutputStream);
            codedOutputStream.i0(this.f126747d);
        }

        public Contract a0() {
            return this.f126763t;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        /* JADX INFO: renamed from: c0, reason: merged with bridge method [inline-methods] */
        public Function r() {
            return f126745w;
        }

        public int d0() {
            return this.f126749f;
        }

        public int e0() {
            return this.f126751h;
        }

        public int f0() {
            return this.f126750g;
        }

        public Type g0() {
            return this.f126755l;
        }

        public int h0() {
            return this.f126756m;
        }

        public Type i0() {
            return this.f126752i;
        }

        public int j0() {
            return this.f126753j;
        }

        public TypeParameter k0(int i10) {
            return this.f126754k.get(i10);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public final boolean l() {
            byte b10 = this.f126764u;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            if (!u0()) {
                this.f126764u = (byte) 0;
                return false;
            }
            if (y0() && !i0().l()) {
                this.f126764u = (byte) 0;
                return false;
            }
            for (int i10 = 0; i10 < l0(); i10++) {
                if (!k0(i10).l()) {
                    this.f126764u = (byte) 0;
                    return false;
                }
            }
            if (w0() && !g0().l()) {
                this.f126764u = (byte) 0;
                return false;
            }
            for (int i11 = 0; i11 < X(); i11++) {
                if (!W(i11).l()) {
                    this.f126764u = (byte) 0;
                    return false;
                }
            }
            for (int i12 = 0; i12 < p0(); i12++) {
                if (!o0(i12).l()) {
                    this.f126764u = (byte) 0;
                    return false;
                }
            }
            if (A0() && !n0().l()) {
                this.f126764u = (byte) 0;
                return false;
            }
            if (s0() && !a0().l()) {
                this.f126764u = (byte) 0;
                return false;
            }
            if (n()) {
                this.f126764u = (byte) 1;
                return true;
            }
            this.f126764u = (byte) 0;
            return false;
        }

        public int l0() {
            return this.f126754k.size();
        }

        public List<TypeParameter> m0() {
            return this.f126754k;
        }

        public TypeTable n0() {
            return this.f126761r;
        }

        public ValueParameter o0(int i10) {
            return this.f126760q.get(i10);
        }

        public int p0() {
            return this.f126760q.size();
        }

        public List<ValueParameter> q0() {
            return this.f126760q;
        }

        public List<Integer> r0() {
            return this.f126762s;
        }

        public boolean s0() {
            return (this.f126748e & 256) == 256;
        }

        public boolean t0() {
            return (this.f126748e & 1) == 1;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        public int u() {
            int i10 = this.f126765v;
            if (i10 != -1) {
                return i10;
            }
            int iO = (this.f126748e & 2) == 2 ? CodedOutputStream.o(1, this.f126750g) + 0 : 0;
            if ((this.f126748e & 4) == 4) {
                iO += CodedOutputStream.o(2, this.f126751h);
            }
            if ((this.f126748e & 8) == 8) {
                iO += CodedOutputStream.s(3, this.f126752i);
            }
            for (int i11 = 0; i11 < this.f126754k.size(); i11++) {
                iO += CodedOutputStream.s(4, this.f126754k.get(i11));
            }
            if ((this.f126748e & 32) == 32) {
                iO += CodedOutputStream.s(5, this.f126755l);
            }
            for (int i12 = 0; i12 < this.f126760q.size(); i12++) {
                iO += CodedOutputStream.s(6, this.f126760q.get(i12));
            }
            if ((this.f126748e & 16) == 16) {
                iO += CodedOutputStream.o(7, this.f126753j);
            }
            if ((this.f126748e & 64) == 64) {
                iO += CodedOutputStream.o(8, this.f126756m);
            }
            if ((this.f126748e & 1) == 1) {
                iO += CodedOutputStream.o(9, this.f126749f);
            }
            for (int i13 = 0; i13 < this.f126757n.size(); i13++) {
                iO += CodedOutputStream.s(10, this.f126757n.get(i13));
            }
            int iP = 0;
            for (int i14 = 0; i14 < this.f126758o.size(); i14++) {
                iP += CodedOutputStream.p(this.f126758o.get(i14).intValue());
            }
            int iS = iO + iP;
            if (!Y().isEmpty()) {
                iS = iS + 1 + CodedOutputStream.p(iP);
            }
            this.f126759p = iP;
            if ((this.f126748e & 128) == 128) {
                iS += CodedOutputStream.s(30, this.f126761r);
            }
            int iP2 = 0;
            for (int i15 = 0; i15 < this.f126762s.size(); i15++) {
                iP2 += CodedOutputStream.p(this.f126762s.get(i15).intValue());
            }
            int size = iS + iP2 + (r0().size() * 2);
            if ((this.f126748e & 256) == 256) {
                size += CodedOutputStream.s(32, this.f126763t);
            }
            int iO2 = size + o() + this.f126747d.size();
            this.f126765v = iO2;
            return iO2;
        }

        public boolean u0() {
            return (this.f126748e & 4) == 4;
        }

        public boolean v0() {
            return (this.f126748e & 2) == 2;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.n
        public kotlin.reflect.jvm.internal.impl.protobuf.p<Function> w() {
            return f126746x;
        }

        public boolean w0() {
            return (this.f126748e & 32) == 32;
        }

        public boolean x0() {
            return (this.f126748e & 64) == 64;
        }

        public boolean y0() {
            return (this.f126748e & 8) == 8;
        }

        public boolean z0() {
            return (this.f126748e & 16) == 16;
        }
    }

    public enum MemberKind implements kotlin.reflect.jvm.internal.impl.protobuf.h.a {
        DECLARATION(0, 0),
        FAKE_OVERRIDE(1, 1),
        DELEGATION(2, 2),
        SYNTHESIZED(3, 3);

        private static kotlin.reflect.jvm.internal.impl.protobuf.h.b<MemberKind> internalValueMap = new a();
        private final int value;

        public static final class a implements kotlin.reflect.jvm.internal.impl.protobuf.h.b<MemberKind> {
            a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public MemberKind a(int i10) {
                return MemberKind.valueOf(i10);
            }
        }

        MemberKind(int i10, int i11) {
            this.value = i11;
        }

        public static MemberKind valueOf(int i10) {
            if (i10 == 0) {
                return DECLARATION;
            }
            if (i10 == 1) {
                return FAKE_OVERRIDE;
            }
            if (i10 == 2) {
                return DELEGATION;
            }
            if (i10 != 3) {
                return null;
            }
            return SYNTHESIZED;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.a
        public final int getNumber() {
            return this.value;
        }
    }

    public enum Modality implements kotlin.reflect.jvm.internal.impl.protobuf.h.a {
        FINAL(0, 0),
        OPEN(1, 1),
        ABSTRACT(2, 2),
        SEALED(3, 3);

        private static kotlin.reflect.jvm.internal.impl.protobuf.h.b<Modality> internalValueMap = new a();
        private final int value;

        public static final class a implements kotlin.reflect.jvm.internal.impl.protobuf.h.b<Modality> {
            a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Modality a(int i10) {
                return Modality.valueOf(i10);
            }
        }

        Modality(int i10, int i11) {
            this.value = i11;
        }

        public static Modality valueOf(int i10) {
            if (i10 == 0) {
                return FINAL;
            }
            if (i10 == 1) {
                return OPEN;
            }
            if (i10 == 2) {
                return ABSTRACT;
            }
            if (i10 != 3) {
                return null;
            }
            return SEALED;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.a
        public final int getNumber() {
            return this.value;
        }
    }

    public static final class Package extends GeneratedMessageLite.ExtendableMessage<Package> implements l {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final Package f126781m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static kotlin.reflect.jvm.internal.impl.protobuf.p<Package> f126782n = new a();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final kotlin.reflect.jvm.internal.impl.protobuf.d f126783d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f126784e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private List<Function> f126785f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private List<Property> f126786g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private List<TypeAlias> f126787h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private TypeTable f126788i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private VersionRequirementTable f126789j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private byte f126790k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f126791l;

        public static final class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<Package> {
            a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public Package d(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws InvalidProtocolBufferException {
                return new Package(eVar, fVar);
            }
        }

        public static final class b extends GeneratedMessageLite.c<Package, b> implements l {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private int f126792e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private List<Function> f126793f = Collections.emptyList();

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private List<Property> f126794g = Collections.emptyList();

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private List<TypeAlias> f126795h = Collections.emptyList();

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private TypeTable f126796i = TypeTable.s();

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            private VersionRequirementTable f126797j = VersionRequirementTable.p();

            private b() {
                Q();
            }

            private void B() {
                if ((this.f126792e & 1) != 1) {
                    this.f126793f = new ArrayList(this.f126793f);
                    this.f126792e |= 1;
                }
            }

            private void C() {
                if ((this.f126792e & 2) != 2) {
                    this.f126794g = new ArrayList(this.f126794g);
                    this.f126792e |= 2;
                }
            }

            private void D() {
                if ((this.f126792e & 4) != 4) {
                    this.f126795h = new ArrayList(this.f126795h);
                    this.f126792e |= 4;
                }
            }

            private void Q() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static b z() {
                return new b();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b, kotlin.reflect.jvm.internal.impl.protobuf.o
            /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
            public Package r() {
                return Package.L();
            }

            public Function F(int i10) {
                return this.f126793f.get(i10);
            }

            public int G() {
                return this.f126793f.size();
            }

            public Property H(int i10) {
                return this.f126794g.get(i10);
            }

            public int J() {
                return this.f126794g.size();
            }

            public TypeAlias K(int i10) {
                return this.f126795h.get(i10);
            }

            public int M() {
                return this.f126795h.size();
            }

            public TypeTable O() {
                return this.f126796i;
            }

            public boolean P() {
                return (this.f126792e & 8) == 8;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b
            /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
            public b h(Package r10) {
                if (r10 == Package.L()) {
                    return this;
                }
                if (!r10.f126785f.isEmpty()) {
                    if (this.f126793f.isEmpty()) {
                        this.f126793f = r10.f126785f;
                        this.f126792e &= -2;
                    } else {
                        B();
                        this.f126793f.addAll(r10.f126785f);
                    }
                }
                if (!r10.f126786g.isEmpty()) {
                    if (this.f126794g.isEmpty()) {
                        this.f126794g = r10.f126786g;
                        this.f126792e &= -3;
                    } else {
                        C();
                        this.f126794g.addAll(r10.f126786g);
                    }
                }
                if (!r10.f126787h.isEmpty()) {
                    if (this.f126795h.isEmpty()) {
                        this.f126795h = r10.f126787h;
                        this.f126792e &= -5;
                    } else {
                        D();
                        this.f126795h.addAll(r10.f126787h);
                    }
                }
                if (r10.Y()) {
                    T(r10.W());
                }
                if (r10.Z()) {
                    U(r10.X());
                }
                p(r10);
                i(g().b(r10.f126783d));
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC1169a
            /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
            public b c(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws Throwable {
                Package r10 = null;
                try {
                    try {
                        Package packageD = Package.f126782n.d(eVar, fVar);
                        if (packageD != null) {
                            h(packageD);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e10) {
                        Package r11 = (Package) e10.a();
                        try {
                            throw e10;
                        } catch (Throwable th2) {
                            th = th2;
                            r10 = r11;
                            if (r10 != null) {
                                h(r10);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (r10 != null) {
                        h(r10);
                    }
                    throw th;
                }
            }

            public b T(TypeTable typeTable) {
                if ((this.f126792e & 8) != 8 || this.f126796i == TypeTable.s()) {
                    this.f126796i = typeTable;
                } else {
                    this.f126796i = TypeTable.F(this.f126796i).h(typeTable).m();
                }
                this.f126792e |= 8;
                return this;
            }

            public b U(VersionRequirementTable versionRequirementTable) {
                if ((this.f126792e & 16) != 16 || this.f126797j == VersionRequirementTable.p()) {
                    this.f126797j = versionRequirementTable;
                } else {
                    this.f126797j = VersionRequirementTable.A(this.f126797j).h(versionRequirementTable).m();
                }
                this.f126792e |= 16;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
            public final boolean l() {
                for (int i10 = 0; i10 < G(); i10++) {
                    if (!F(i10).l()) {
                        return false;
                    }
                }
                for (int i11 = 0; i11 < J(); i11++) {
                    if (!H(i11).l()) {
                        return false;
                    }
                }
                for (int i12 = 0; i12 < M(); i12++) {
                    if (!K(i12).l()) {
                        return false;
                    }
                }
                return (!P() || O().l()) && o();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.n.a
            /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
            public Package build() {
                Package packageX = x();
                if (packageX.l()) {
                    return packageX;
                }
                throw kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC1169a.d(packageX);
            }

            public Package x() {
                Package r10 = new Package(this);
                int i10 = this.f126792e;
                if ((i10 & 1) == 1) {
                    this.f126793f = Collections.unmodifiableList(this.f126793f);
                    this.f126792e &= -2;
                }
                r10.f126785f = this.f126793f;
                if ((this.f126792e & 2) == 2) {
                    this.f126794g = Collections.unmodifiableList(this.f126794g);
                    this.f126792e &= -3;
                }
                r10.f126786g = this.f126794g;
                if ((this.f126792e & 4) == 4) {
                    this.f126795h = Collections.unmodifiableList(this.f126795h);
                    this.f126792e &= -5;
                }
                r10.f126787h = this.f126795h;
                int i11 = (i10 & 8) != 8 ? 0 : 1;
                r10.f126788i = this.f126796i;
                if ((i10 & 16) == 16) {
                    i11 |= 2;
                }
                r10.f126789j = this.f126797j;
                r10.f126784e = i11;
                return r10;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.c
            /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
            public b m() {
                return z().h(x());
            }
        }

        static {
            Package r10 = new Package(true);
            f126781m = r10;
            r10.a0();
        }

        private Package(GeneratedMessageLite.c<Package, ?> cVar) {
            super(cVar);
            this.f126790k = (byte) -1;
            this.f126791l = -1;
            this.f126783d = cVar.g();
        }

        private Package(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws InvalidProtocolBufferException {
            this.f126790k = (byte) -1;
            this.f126791l = -1;
            a0();
            kotlin.reflect.jvm.internal.impl.protobuf.d.b bVarU = kotlin.reflect.jvm.internal.impl.protobuf.d.u();
            CodedOutputStream codedOutputStreamJ = CodedOutputStream.J(bVarU, 1);
            boolean z10 = false;
            int i10 = 0;
            while (!z10) {
                try {
                    try {
                        try {
                            int iK = eVar.K();
                            if (iK != 0) {
                                if (iK == 26) {
                                    int i11 = (i10 == true ? 1 : 0) & 1;
                                    i10 = i10;
                                    if (i11 != 1) {
                                        this.f126785f = new ArrayList();
                                        i10 = (i10 == true ? 1 : 0) | 1;
                                    }
                                    this.f126785f.add((Function) eVar.u(Function.f126746x, fVar));
                                } else if (iK == 34) {
                                    int i12 = (i10 == true ? 1 : 0) & 2;
                                    i10 = i10;
                                    if (i12 != 2) {
                                        this.f126786g = new ArrayList();
                                        i10 = (i10 == true ? 1 : 0) | 2;
                                    }
                                    this.f126786g.add((Property) eVar.u(Property.f126814x, fVar));
                                } else if (iK != 42) {
                                    if (iK == 242) {
                                        TypeTable.b bVarT = (this.f126784e & 1) == 1 ? this.f126788i.t() : null;
                                        TypeTable typeTable = (TypeTable) eVar.u(TypeTable.f126972j, fVar);
                                        this.f126788i = typeTable;
                                        if (bVarT != null) {
                                            bVarT.h(typeTable);
                                            this.f126788i = bVarT.m();
                                        }
                                        this.f126784e |= 1;
                                    } else if (iK == 258) {
                                        VersionRequirementTable.b bVarT2 = (this.f126784e & 2) == 2 ? this.f126789j.t() : null;
                                        VersionRequirementTable versionRequirementTable = (VersionRequirementTable) eVar.u(VersionRequirementTable.f127021h, fVar);
                                        this.f126789j = versionRequirementTable;
                                        if (bVarT2 != null) {
                                            bVarT2.h(versionRequirementTable);
                                            this.f126789j = bVarT2.m();
                                        }
                                        this.f126784e |= 2;
                                    } else if (!j(eVar, codedOutputStreamJ, fVar, iK)) {
                                    }
                                } else {
                                    int i13 = (i10 == true ? 1 : 0) & 4;
                                    i10 = i10;
                                    if (i13 != 4) {
                                        this.f126787h = new ArrayList();
                                        i10 = (i10 == true ? 1 : 0) | 4;
                                    }
                                    this.f126787h.add((TypeAlias) eVar.u(TypeAlias.f126927r, fVar));
                                }
                            }
                            z10 = true;
                        } catch (InvalidProtocolBufferException e10) {
                            throw e10.i(this);
                        }
                    } catch (IOException e11) {
                        throw new InvalidProtocolBufferException(e11.getMessage()).i(this);
                    }
                } catch (Throwable th2) {
                    if (((i10 == true ? 1 : 0) & 1) == 1) {
                        this.f126785f = Collections.unmodifiableList(this.f126785f);
                    }
                    if (((i10 == true ? 1 : 0) & 2) == 2) {
                        this.f126786g = Collections.unmodifiableList(this.f126786g);
                    }
                    if (((i10 == true ? 1 : 0) & 4) == 4) {
                        this.f126787h = Collections.unmodifiableList(this.f126787h);
                    }
                    try {
                        codedOutputStreamJ.I();
                    } catch (IOException unused) {
                    } finally {
                        this.f126783d = bVarU.e();
                    }
                    g();
                    throw th2;
                }
            }
            if (((i10 == true ? 1 : 0) & 1) == 1) {
                this.f126785f = Collections.unmodifiableList(this.f126785f);
            }
            if (((i10 == true ? 1 : 0) & 2) == 2) {
                this.f126786g = Collections.unmodifiableList(this.f126786g);
            }
            if (((i10 == true ? 1 : 0) & 4) == 4) {
                this.f126787h = Collections.unmodifiableList(this.f126787h);
            }
            try {
                codedOutputStreamJ.I();
            } catch (IOException unused2) {
            } finally {
                this.f126783d = bVarU.e();
            }
            g();
        }

        private Package(boolean z10) {
            this.f126790k = (byte) -1;
            this.f126791l = -1;
            this.f126783d = kotlin.reflect.jvm.internal.impl.protobuf.d.f127320b;
        }

        public static Package L() {
            return f126781m;
        }

        private void a0() {
            this.f126785f = Collections.emptyList();
            this.f126786g = Collections.emptyList();
            this.f126787h = Collections.emptyList();
            this.f126788i = TypeTable.s();
            this.f126789j = VersionRequirementTable.p();
        }

        public static b b0() {
            return b.z();
        }

        public static b c0(Package r10) {
            return b0().h(r10);
        }

        public static Package e0(InputStream inputStream, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws IOException {
            return f126782n.b(inputStream, fVar);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public Package r() {
            return f126781m;
        }

        public Function N(int i10) {
            return this.f126785f.get(i10);
        }

        public int O() {
            return this.f126785f.size();
        }

        public List<Function> P() {
            return this.f126785f;
        }

        public Property Q(int i10) {
            return this.f126786g.get(i10);
        }

        public int R() {
            return this.f126786g.size();
        }

        public List<Property> S() {
            return this.f126786g;
        }

        public TypeAlias T(int i10) {
            return this.f126787h.get(i10);
        }

        public int U() {
            return this.f126787h.size();
        }

        public List<TypeAlias> V() {
            return this.f126787h;
        }

        public TypeTable W() {
            return this.f126788i;
        }

        public VersionRequirementTable X() {
            return this.f126789j;
        }

        public boolean Y() {
            return (this.f126784e & 1) == 1;
        }

        public boolean Z() {
            return (this.f126784e & 2) == 2;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        public void a(CodedOutputStream codedOutputStream) throws IOException {
            u();
            GeneratedMessageLite.ExtendableMessage<MessageType>.a aVarY = y();
            for (int i10 = 0; i10 < this.f126785f.size(); i10++) {
                codedOutputStream.d0(3, this.f126785f.get(i10));
            }
            for (int i11 = 0; i11 < this.f126786g.size(); i11++) {
                codedOutputStream.d0(4, this.f126786g.get(i11));
            }
            for (int i12 = 0; i12 < this.f126787h.size(); i12++) {
                codedOutputStream.d0(5, this.f126787h.get(i12));
            }
            if ((this.f126784e & 1) == 1) {
                codedOutputStream.d0(30, this.f126788i);
            }
            if ((this.f126784e & 2) == 2) {
                codedOutputStream.d0(32, this.f126789j);
            }
            aVarY.a(200, codedOutputStream);
            codedOutputStream.i0(this.f126783d);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        /* JADX INFO: renamed from: d0, reason: merged with bridge method [inline-methods] */
        public b v() {
            return b0();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        /* JADX INFO: renamed from: f0, reason: merged with bridge method [inline-methods] */
        public b t() {
            return c0(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public final boolean l() {
            byte b10 = this.f126790k;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            for (int i10 = 0; i10 < O(); i10++) {
                if (!N(i10).l()) {
                    this.f126790k = (byte) 0;
                    return false;
                }
            }
            for (int i11 = 0; i11 < R(); i11++) {
                if (!Q(i11).l()) {
                    this.f126790k = (byte) 0;
                    return false;
                }
            }
            for (int i12 = 0; i12 < U(); i12++) {
                if (!T(i12).l()) {
                    this.f126790k = (byte) 0;
                    return false;
                }
            }
            if (Y() && !W().l()) {
                this.f126790k = (byte) 0;
                return false;
            }
            if (n()) {
                this.f126790k = (byte) 1;
                return true;
            }
            this.f126790k = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        public int u() {
            int i10 = this.f126791l;
            if (i10 != -1) {
                return i10;
            }
            int iS = 0;
            for (int i11 = 0; i11 < this.f126785f.size(); i11++) {
                iS += CodedOutputStream.s(3, this.f126785f.get(i11));
            }
            for (int i12 = 0; i12 < this.f126786g.size(); i12++) {
                iS += CodedOutputStream.s(4, this.f126786g.get(i12));
            }
            for (int i13 = 0; i13 < this.f126787h.size(); i13++) {
                iS += CodedOutputStream.s(5, this.f126787h.get(i13));
            }
            if ((this.f126784e & 1) == 1) {
                iS += CodedOutputStream.s(30, this.f126788i);
            }
            if ((this.f126784e & 2) == 2) {
                iS += CodedOutputStream.s(32, this.f126789j);
            }
            int iO = iS + o() + this.f126783d.size();
            this.f126791l = iO;
            return iO;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.n
        public kotlin.reflect.jvm.internal.impl.protobuf.p<Package> w() {
            return f126782n;
        }
    }

    public static final class PackageFragment extends GeneratedMessageLite.ExtendableMessage<PackageFragment> implements k {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final PackageFragment f126798l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static kotlin.reflect.jvm.internal.impl.protobuf.p<PackageFragment> f126799m = new a();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final kotlin.reflect.jvm.internal.impl.protobuf.d f126800d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f126801e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private StringTable f126802f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private QualifiedNameTable f126803g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private Package f126804h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private List<Class> f126805i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private byte f126806j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f126807k;

        public static final class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<PackageFragment> {
            a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public PackageFragment d(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws InvalidProtocolBufferException {
                return new PackageFragment(eVar, fVar);
            }
        }

        public static final class b extends GeneratedMessageLite.c<PackageFragment, b> implements k {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private int f126808e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private StringTable f126809f = StringTable.p();

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private QualifiedNameTable f126810g = QualifiedNameTable.p();

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private Package f126811h = Package.L();

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private List<Class> f126812i = Collections.emptyList();

            private b() {
                K();
            }

            private void B() {
                if ((this.f126808e & 8) != 8) {
                    this.f126812i = new ArrayList(this.f126812i);
                    this.f126808e |= 8;
                }
            }

            private void K() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static b z() {
                return new b();
            }

            public Class C(int i10) {
                return this.f126812i.get(i10);
            }

            public int D() {
                return this.f126812i.size();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b, kotlin.reflect.jvm.internal.impl.protobuf.o
            /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
            public PackageFragment r() {
                return PackageFragment.L();
            }

            public Package F() {
                return this.f126811h;
            }

            public QualifiedNameTable G() {
                return this.f126810g;
            }

            public boolean H() {
                return (this.f126808e & 4) == 4;
            }

            public boolean J() {
                return (this.f126808e & 2) == 2;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b
            /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
            public b h(PackageFragment packageFragment) {
                if (packageFragment == PackageFragment.L()) {
                    return this;
                }
                if (packageFragment.S()) {
                    R(packageFragment.P());
                }
                if (packageFragment.R()) {
                    Q(packageFragment.O());
                }
                if (packageFragment.Q()) {
                    P(packageFragment.N());
                }
                if (!packageFragment.f126805i.isEmpty()) {
                    if (this.f126812i.isEmpty()) {
                        this.f126812i = packageFragment.f126805i;
                        this.f126808e &= -9;
                    } else {
                        B();
                        this.f126812i.addAll(packageFragment.f126805i);
                    }
                }
                p(packageFragment);
                i(g().b(packageFragment.f126800d));
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC1169a
            /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
            public b c(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws Throwable {
                PackageFragment packageFragment = null;
                try {
                    try {
                        PackageFragment packageFragmentD = PackageFragment.f126799m.d(eVar, fVar);
                        if (packageFragmentD != null) {
                            h(packageFragmentD);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e10) {
                        PackageFragment packageFragment2 = (PackageFragment) e10.a();
                        try {
                            throw e10;
                        } catch (Throwable th2) {
                            th = th2;
                            packageFragment = packageFragment2;
                            if (packageFragment != null) {
                                h(packageFragment);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (packageFragment != null) {
                        h(packageFragment);
                    }
                    throw th;
                }
            }

            public b P(Package r10) {
                if ((this.f126808e & 4) != 4 || this.f126811h == Package.L()) {
                    this.f126811h = r10;
                } else {
                    this.f126811h = Package.c0(this.f126811h).h(r10).x();
                }
                this.f126808e |= 4;
                return this;
            }

            public b Q(QualifiedNameTable qualifiedNameTable) {
                if ((this.f126808e & 2) != 2 || this.f126810g == QualifiedNameTable.p()) {
                    this.f126810g = qualifiedNameTable;
                } else {
                    this.f126810g = QualifiedNameTable.A(this.f126810g).h(qualifiedNameTable).m();
                }
                this.f126808e |= 2;
                return this;
            }

            public b R(StringTable stringTable) {
                if ((this.f126808e & 1) != 1 || this.f126809f == StringTable.p()) {
                    this.f126809f = stringTable;
                } else {
                    this.f126809f = StringTable.A(this.f126809f).h(stringTable).m();
                }
                this.f126808e |= 1;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
            public final boolean l() {
                if (J() && !G().l()) {
                    return false;
                }
                if (H() && !F().l()) {
                    return false;
                }
                for (int i10 = 0; i10 < D(); i10++) {
                    if (!C(i10).l()) {
                        return false;
                    }
                }
                return o();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.n.a
            /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
            public PackageFragment build() {
                PackageFragment packageFragmentX = x();
                if (packageFragmentX.l()) {
                    return packageFragmentX;
                }
                throw kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC1169a.d(packageFragmentX);
            }

            public PackageFragment x() {
                PackageFragment packageFragment = new PackageFragment(this);
                int i10 = this.f126808e;
                int i11 = (i10 & 1) != 1 ? 0 : 1;
                packageFragment.f126802f = this.f126809f;
                if ((i10 & 2) == 2) {
                    i11 |= 2;
                }
                packageFragment.f126803g = this.f126810g;
                if ((i10 & 4) == 4) {
                    i11 |= 4;
                }
                packageFragment.f126804h = this.f126811h;
                if ((this.f126808e & 8) == 8) {
                    this.f126812i = Collections.unmodifiableList(this.f126812i);
                    this.f126808e &= -9;
                }
                packageFragment.f126805i = this.f126812i;
                packageFragment.f126801e = i11;
                return packageFragment;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.c
            /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
            public b m() {
                return z().h(x());
            }
        }

        static {
            PackageFragment packageFragment = new PackageFragment(true);
            f126798l = packageFragment;
            packageFragment.T();
        }

        private PackageFragment(GeneratedMessageLite.c<PackageFragment, ?> cVar) {
            super(cVar);
            this.f126806j = (byte) -1;
            this.f126807k = -1;
            this.f126800d = cVar.g();
        }

        private PackageFragment(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws InvalidProtocolBufferException {
            this.f126806j = (byte) -1;
            this.f126807k = -1;
            T();
            kotlin.reflect.jvm.internal.impl.protobuf.d.b bVarU = kotlin.reflect.jvm.internal.impl.protobuf.d.u();
            CodedOutputStream codedOutputStreamJ = CodedOutputStream.J(bVarU, 1);
            boolean z10 = false;
            int i10 = 0;
            while (!z10) {
                try {
                    try {
                        try {
                            int iK = eVar.K();
                            if (iK != 0) {
                                if (iK == 10) {
                                    StringTable.b bVarT = (this.f126801e & 1) == 1 ? this.f126802f.t() : null;
                                    StringTable stringTable = (StringTable) eVar.u(StringTable.f126871h, fVar);
                                    this.f126802f = stringTable;
                                    if (bVarT != null) {
                                        bVarT.h(stringTable);
                                        this.f126802f = bVarT.m();
                                    }
                                    this.f126801e |= 1;
                                } else if (iK == 18) {
                                    QualifiedNameTable.b bVarT2 = (this.f126801e & 2) == 2 ? this.f126803g.t() : null;
                                    QualifiedNameTable qualifiedNameTable = (QualifiedNameTable) eVar.u(QualifiedNameTable.f126850h, fVar);
                                    this.f126803g = qualifiedNameTable;
                                    if (bVarT2 != null) {
                                        bVarT2.h(qualifiedNameTable);
                                        this.f126803g = bVarT2.m();
                                    }
                                    this.f126801e |= 2;
                                } else if (iK == 26) {
                                    Package.b bVarT3 = (this.f126801e & 4) == 4 ? this.f126804h.t() : null;
                                    Package r10 = (Package) eVar.u(Package.f126782n, fVar);
                                    this.f126804h = r10;
                                    if (bVarT3 != null) {
                                        bVarT3.h(r10);
                                        this.f126804h = bVarT3.x();
                                    }
                                    this.f126801e |= 4;
                                } else if (iK == 34) {
                                    int i11 = (i10 == true ? 1 : 0) & 8;
                                    i10 = i10;
                                    if (i11 != 8) {
                                        this.f126805i = new ArrayList();
                                        i10 = (i10 == true ? 1 : 0) | 8;
                                    }
                                    this.f126805i.add((Class) eVar.u(Class.M, fVar));
                                } else if (!j(eVar, codedOutputStreamJ, fVar, iK)) {
                                }
                            }
                            z10 = true;
                        } catch (IOException e10) {
                            throw new InvalidProtocolBufferException(e10.getMessage()).i(this);
                        }
                    } catch (InvalidProtocolBufferException e11) {
                        throw e11.i(this);
                    }
                } catch (Throwable th2) {
                    if (((i10 == true ? 1 : 0) & 8) == 8) {
                        this.f126805i = Collections.unmodifiableList(this.f126805i);
                    }
                    try {
                        codedOutputStreamJ.I();
                    } catch (IOException unused) {
                    } finally {
                        this.f126800d = bVarU.e();
                    }
                    g();
                    throw th2;
                }
            }
            if (((i10 == true ? 1 : 0) & 8) == 8) {
                this.f126805i = Collections.unmodifiableList(this.f126805i);
            }
            try {
                codedOutputStreamJ.I();
            } catch (IOException unused2) {
            } finally {
                this.f126800d = bVarU.e();
            }
            g();
        }

        private PackageFragment(boolean z10) {
            this.f126806j = (byte) -1;
            this.f126807k = -1;
            this.f126800d = kotlin.reflect.jvm.internal.impl.protobuf.d.f127320b;
        }

        public static PackageFragment L() {
            return f126798l;
        }

        private void T() {
            this.f126802f = StringTable.p();
            this.f126803g = QualifiedNameTable.p();
            this.f126804h = Package.L();
            this.f126805i = Collections.emptyList();
        }

        public static b U() {
            return b.z();
        }

        public static b V(PackageFragment packageFragment) {
            return U().h(packageFragment);
        }

        public static PackageFragment X(InputStream inputStream, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws IOException {
            return f126799m.b(inputStream, fVar);
        }

        public Class H(int i10) {
            return this.f126805i.get(i10);
        }

        public int J() {
            return this.f126805i.size();
        }

        public List<Class> K() {
            return this.f126805i;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public PackageFragment r() {
            return f126798l;
        }

        public Package N() {
            return this.f126804h;
        }

        public QualifiedNameTable O() {
            return this.f126803g;
        }

        public StringTable P() {
            return this.f126802f;
        }

        public boolean Q() {
            return (this.f126801e & 4) == 4;
        }

        public boolean R() {
            return (this.f126801e & 2) == 2;
        }

        public boolean S() {
            return (this.f126801e & 1) == 1;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
        public b v() {
            return U();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
        public b t() {
            return V(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        public void a(CodedOutputStream codedOutputStream) throws IOException {
            u();
            GeneratedMessageLite.ExtendableMessage<MessageType>.a aVarY = y();
            if ((this.f126801e & 1) == 1) {
                codedOutputStream.d0(1, this.f126802f);
            }
            if ((this.f126801e & 2) == 2) {
                codedOutputStream.d0(2, this.f126803g);
            }
            if ((this.f126801e & 4) == 4) {
                codedOutputStream.d0(3, this.f126804h);
            }
            for (int i10 = 0; i10 < this.f126805i.size(); i10++) {
                codedOutputStream.d0(4, this.f126805i.get(i10));
            }
            aVarY.a(200, codedOutputStream);
            codedOutputStream.i0(this.f126800d);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public final boolean l() {
            byte b10 = this.f126806j;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            if (R() && !O().l()) {
                this.f126806j = (byte) 0;
                return false;
            }
            if (Q() && !N().l()) {
                this.f126806j = (byte) 0;
                return false;
            }
            for (int i10 = 0; i10 < J(); i10++) {
                if (!H(i10).l()) {
                    this.f126806j = (byte) 0;
                    return false;
                }
            }
            if (n()) {
                this.f126806j = (byte) 1;
                return true;
            }
            this.f126806j = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        public int u() {
            int i10 = this.f126807k;
            if (i10 != -1) {
                return i10;
            }
            int iS = (this.f126801e & 1) == 1 ? CodedOutputStream.s(1, this.f126802f) + 0 : 0;
            if ((this.f126801e & 2) == 2) {
                iS += CodedOutputStream.s(2, this.f126803g);
            }
            if ((this.f126801e & 4) == 4) {
                iS += CodedOutputStream.s(3, this.f126804h);
            }
            for (int i11 = 0; i11 < this.f126805i.size(); i11++) {
                iS += CodedOutputStream.s(4, this.f126805i.get(i11));
            }
            int iO = iS + o() + this.f126800d.size();
            this.f126807k = iO;
            return iO;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.n
        public kotlin.reflect.jvm.internal.impl.protobuf.p<PackageFragment> w() {
            return f126799m;
        }
    }

    public static final class Property extends GeneratedMessageLite.ExtendableMessage<Property> implements m {

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private static final Property f126813w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public static kotlin.reflect.jvm.internal.impl.protobuf.p<Property> f126814x = new a();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final kotlin.reflect.jvm.internal.impl.protobuf.d f126815d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f126816e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f126817f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f126818g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f126819h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private Type f126820i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f126821j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private List<TypeParameter> f126822k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private Type f126823l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f126824m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private List<Type> f126825n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private List<Integer> f126826o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private int f126827p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private ValueParameter f126828q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private int f126829r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private int f126830s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private List<Integer> f126831t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private byte f126832u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private int f126833v;

        public static final class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<Property> {
            a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public Property d(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws InvalidProtocolBufferException {
                return new Property(eVar, fVar);
            }
        }

        public static final class b extends GeneratedMessageLite.c<Property, b> implements m {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private int f126834e;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private int f126837h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            private int f126839j;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            private int f126842m;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            private int f126846q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            private int f126847r;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private int f126835f = bb.c.b.Y6;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private int f126836g = bb.c.d.f31670z;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private Type f126838i = Type.Y();

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            private List<TypeParameter> f126840k = Collections.emptyList();

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            private Type f126841l = Type.Y();

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private List<Type> f126843n = Collections.emptyList();

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            private List<Integer> f126844o = Collections.emptyList();

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            private ValueParameter f126845p = ValueParameter.J();

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            private List<Integer> f126848s = Collections.emptyList();

            private b() {
                U();
            }

            private void B() {
                if ((this.f126834e & 512) != 512) {
                    this.f126844o = new ArrayList(this.f126844o);
                    this.f126834e |= 512;
                }
            }

            private void C() {
                if ((this.f126834e & 256) != 256) {
                    this.f126843n = new ArrayList(this.f126843n);
                    this.f126834e |= 256;
                }
            }

            private void D() {
                if ((this.f126834e & 32) != 32) {
                    this.f126840k = new ArrayList(this.f126840k);
                    this.f126834e |= 32;
                }
            }

            private void E() {
                if ((this.f126834e & 8192) != 8192) {
                    this.f126848s = new ArrayList(this.f126848s);
                    this.f126834e |= 8192;
                }
            }

            private void U() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static b z() {
                return new b();
            }

            public Type F(int i10) {
                return this.f126843n.get(i10);
            }

            public int G() {
                return this.f126843n.size();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b, kotlin.reflect.jvm.internal.impl.protobuf.o
            /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
            public Property r() {
                return Property.Z();
            }

            public Type J() {
                return this.f126841l;
            }

            public Type K() {
                return this.f126838i;
            }

            public ValueParameter M() {
                return this.f126845p;
            }

            public TypeParameter O(int i10) {
                return this.f126840k.get(i10);
            }

            public int P() {
                return this.f126840k.size();
            }

            public boolean Q() {
                return (this.f126834e & 4) == 4;
            }

            public boolean R() {
                return (this.f126834e & 64) == 64;
            }

            public boolean S() {
                return (this.f126834e & 8) == 8;
            }

            public boolean T() {
                return (this.f126834e & 1024) == 1024;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b
            /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
            public b h(Property property) {
                if (property == Property.Z()) {
                    return this;
                }
                if (property.p0()) {
                    c0(property.b0());
                }
                if (property.s0()) {
                    f0(property.e0());
                }
                if (property.r0()) {
                    e0(property.d0());
                }
                if (property.v0()) {
                    Z(property.h0());
                }
                if (property.w0()) {
                    h0(property.i0());
                }
                if (!property.f126822k.isEmpty()) {
                    if (this.f126840k.isEmpty()) {
                        this.f126840k = property.f126822k;
                        this.f126834e &= -33;
                    } else {
                        D();
                        this.f126840k.addAll(property.f126822k);
                    }
                }
                if (property.t0()) {
                    Y(property.f0());
                }
                if (property.u0()) {
                    g0(property.g0());
                }
                if (!property.f126825n.isEmpty()) {
                    if (this.f126843n.isEmpty()) {
                        this.f126843n = property.f126825n;
                        this.f126834e &= -257;
                    } else {
                        C();
                        this.f126843n.addAll(property.f126825n);
                    }
                }
                if (!property.f126826o.isEmpty()) {
                    if (this.f126844o.isEmpty()) {
                        this.f126844o = property.f126826o;
                        this.f126834e &= -513;
                    } else {
                        B();
                        this.f126844o.addAll(property.f126826o);
                    }
                }
                if (property.y0()) {
                    b0(property.k0());
                }
                if (property.q0()) {
                    d0(property.c0());
                }
                if (property.x0()) {
                    i0(property.j0());
                }
                if (!property.f126831t.isEmpty()) {
                    if (this.f126848s.isEmpty()) {
                        this.f126848s = property.f126831t;
                        this.f126834e &= -8193;
                    } else {
                        E();
                        this.f126848s.addAll(property.f126831t);
                    }
                }
                p(property);
                i(g().b(property.f126815d));
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC1169a
            /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
            public b c(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws Throwable {
                Property property = null;
                try {
                    try {
                        Property propertyD = Property.f126814x.d(eVar, fVar);
                        if (propertyD != null) {
                            h(propertyD);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e10) {
                        Property property2 = (Property) e10.a();
                        try {
                            throw e10;
                        } catch (Throwable th2) {
                            th = th2;
                            property = property2;
                            if (property != null) {
                                h(property);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (property != null) {
                        h(property);
                    }
                    throw th;
                }
            }

            public b Y(Type type) {
                if ((this.f126834e & 64) != 64 || this.f126841l == Type.Y()) {
                    this.f126841l = type;
                } else {
                    this.f126841l = Type.z0(this.f126841l).h(type).x();
                }
                this.f126834e |= 64;
                return this;
            }

            public b Z(Type type) {
                if ((this.f126834e & 8) != 8 || this.f126838i == Type.Y()) {
                    this.f126838i = type;
                } else {
                    this.f126838i = Type.z0(this.f126838i).h(type).x();
                }
                this.f126834e |= 8;
                return this;
            }

            public b b0(ValueParameter valueParameter) {
                if ((this.f126834e & 1024) != 1024 || this.f126845p == ValueParameter.J()) {
                    this.f126845p = valueParameter;
                } else {
                    this.f126845p = ValueParameter.Z(this.f126845p).h(valueParameter).x();
                }
                this.f126834e |= 1024;
                return this;
            }

            public b c0(int i10) {
                this.f126834e |= 1;
                this.f126835f = i10;
                return this;
            }

            public b d0(int i10) {
                this.f126834e |= 2048;
                this.f126846q = i10;
                return this;
            }

            public b e0(int i10) {
                this.f126834e |= 4;
                this.f126837h = i10;
                return this;
            }

            public b f0(int i10) {
                this.f126834e |= 2;
                this.f126836g = i10;
                return this;
            }

            public b g0(int i10) {
                this.f126834e |= 128;
                this.f126842m = i10;
                return this;
            }

            public b h0(int i10) {
                this.f126834e |= 16;
                this.f126839j = i10;
                return this;
            }

            public b i0(int i10) {
                this.f126834e |= 4096;
                this.f126847r = i10;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
            public final boolean l() {
                if (!Q()) {
                    return false;
                }
                if (S() && !K().l()) {
                    return false;
                }
                for (int i10 = 0; i10 < P(); i10++) {
                    if (!O(i10).l()) {
                        return false;
                    }
                }
                if (R() && !J().l()) {
                    return false;
                }
                for (int i11 = 0; i11 < G(); i11++) {
                    if (!F(i11).l()) {
                        return false;
                    }
                }
                return (!T() || M().l()) && o();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.n.a
            /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
            public Property build() {
                Property propertyX = x();
                if (propertyX.l()) {
                    return propertyX;
                }
                throw kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC1169a.d(propertyX);
            }

            public Property x() {
                Property property = new Property(this);
                int i10 = this.f126834e;
                int i11 = (i10 & 1) != 1 ? 0 : 1;
                property.f126817f = this.f126835f;
                if ((i10 & 2) == 2) {
                    i11 |= 2;
                }
                property.f126818g = this.f126836g;
                if ((i10 & 4) == 4) {
                    i11 |= 4;
                }
                property.f126819h = this.f126837h;
                if ((i10 & 8) == 8) {
                    i11 |= 8;
                }
                property.f126820i = this.f126838i;
                if ((i10 & 16) == 16) {
                    i11 |= 16;
                }
                property.f126821j = this.f126839j;
                if ((this.f126834e & 32) == 32) {
                    this.f126840k = Collections.unmodifiableList(this.f126840k);
                    this.f126834e &= -33;
                }
                property.f126822k = this.f126840k;
                if ((i10 & 64) == 64) {
                    i11 |= 32;
                }
                property.f126823l = this.f126841l;
                if ((i10 & 128) == 128) {
                    i11 |= 64;
                }
                property.f126824m = this.f126842m;
                if ((this.f126834e & 256) == 256) {
                    this.f126843n = Collections.unmodifiableList(this.f126843n);
                    this.f126834e &= -257;
                }
                property.f126825n = this.f126843n;
                if ((this.f126834e & 512) == 512) {
                    this.f126844o = Collections.unmodifiableList(this.f126844o);
                    this.f126834e &= -513;
                }
                property.f126826o = this.f126844o;
                if ((i10 & 1024) == 1024) {
                    i11 |= 128;
                }
                property.f126828q = this.f126845p;
                if ((i10 & 2048) == 2048) {
                    i11 |= 256;
                }
                property.f126829r = this.f126846q;
                if ((i10 & 4096) == 4096) {
                    i11 |= 512;
                }
                property.f126830s = this.f126847r;
                if ((this.f126834e & 8192) == 8192) {
                    this.f126848s = Collections.unmodifiableList(this.f126848s);
                    this.f126834e &= -8193;
                }
                property.f126831t = this.f126848s;
                property.f126816e = i11;
                return property;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.c
            /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
            public b m() {
                return z().h(x());
            }
        }

        static {
            Property property = new Property(true);
            f126813w = property;
            property.z0();
        }

        private Property(GeneratedMessageLite.c<Property, ?> cVar) {
            super(cVar);
            this.f126827p = -1;
            this.f126832u = (byte) -1;
            this.f126833v = -1;
            this.f126815d = cVar.g();
        }

        private Property(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws InvalidProtocolBufferException {
            this.f126827p = -1;
            this.f126832u = (byte) -1;
            this.f126833v = -1;
            z0();
            kotlin.reflect.jvm.internal.impl.protobuf.d.b bVarU = kotlin.reflect.jvm.internal.impl.protobuf.d.u();
            CodedOutputStream codedOutputStreamJ = CodedOutputStream.J(bVarU, 1);
            boolean z10 = false;
            int i10 = 0;
            while (!z10) {
                try {
                    try {
                        try {
                            int iK = eVar.K();
                            switch (iK) {
                                case 0:
                                    break;
                                case 8:
                                    this.f126816e |= 2;
                                    this.f126818g = eVar.s();
                                    continue;
                                case 16:
                                    this.f126816e |= 4;
                                    this.f126819h = eVar.s();
                                    continue;
                                case 26:
                                    Type.b bVarT = (this.f126816e & 8) == 8 ? this.f126820i.t() : null;
                                    Type type = (Type) eVar.u(Type.f126879w, fVar);
                                    this.f126820i = type;
                                    if (bVarT != null) {
                                        bVarT.h(type);
                                        this.f126820i = bVarT.x();
                                    }
                                    this.f126816e |= 8;
                                    continue;
                                case 34:
                                    int i11 = (i10 == true ? 1 : 0) & 32;
                                    i10 = i10;
                                    if (i11 != 32) {
                                        this.f126822k = new ArrayList();
                                        i10 = (i10 == true ? 1 : 0) | 32;
                                    }
                                    this.f126822k.add((TypeParameter) eVar.u(TypeParameter.f126952p, fVar));
                                    continue;
                                case 42:
                                    Type.b bVarT2 = (this.f126816e & 32) == 32 ? this.f126823l.t() : null;
                                    Type type2 = (Type) eVar.u(Type.f126879w, fVar);
                                    this.f126823l = type2;
                                    if (bVarT2 != null) {
                                        bVarT2.h(type2);
                                        this.f126823l = bVarT2.x();
                                    }
                                    this.f126816e |= 32;
                                    continue;
                                case 50:
                                    ValueParameter.b bVarT3 = (this.f126816e & 128) == 128 ? this.f126828q.t() : null;
                                    ValueParameter valueParameter = (ValueParameter) eVar.u(ValueParameter.f126983o, fVar);
                                    this.f126828q = valueParameter;
                                    if (bVarT3 != null) {
                                        bVarT3.h(valueParameter);
                                        this.f126828q = bVarT3.x();
                                    }
                                    this.f126816e |= 128;
                                    continue;
                                case 56:
                                    this.f126816e |= 256;
                                    this.f126829r = eVar.s();
                                    continue;
                                case 64:
                                    this.f126816e |= 512;
                                    this.f126830s = eVar.s();
                                    continue;
                                case 72:
                                    this.f126816e |= 16;
                                    this.f126821j = eVar.s();
                                    continue;
                                case 80:
                                    this.f126816e |= 64;
                                    this.f126824m = eVar.s();
                                    continue;
                                case 88:
                                    this.f126816e |= 1;
                                    this.f126817f = eVar.s();
                                    continue;
                                case 98:
                                    int i12 = (i10 == true ? 1 : 0) & 256;
                                    i10 = i10;
                                    if (i12 != 256) {
                                        this.f126825n = new ArrayList();
                                        i10 = (i10 == true ? 1 : 0) | 256;
                                    }
                                    this.f126825n.add((Type) eVar.u(Type.f126879w, fVar));
                                    continue;
                                case 104:
                                    int i13 = (i10 == true ? 1 : 0) & 512;
                                    i10 = i10;
                                    if (i13 != 512) {
                                        this.f126826o = new ArrayList();
                                        i10 = (i10 == true ? 1 : 0) | 512;
                                    }
                                    this.f126826o.add(Integer.valueOf(eVar.s()));
                                    continue;
                                case 106:
                                    int iJ = eVar.j(eVar.A());
                                    int i14 = (i10 == true ? 1 : 0) & 512;
                                    i10 = i10;
                                    if (i14 != 512 && eVar.e() > 0) {
                                        i10 = i10;
                                        this.f126826o = new ArrayList();
                                        i10 = (i10 == true ? 1 : 0) | 512;
                                    }
                                    i10 = i10;
                                    while (eVar.e() > 0) {
                                        this.f126826o.add(Integer.valueOf(eVar.s()));
                                    }
                                    eVar.i(iJ);
                                    continue;
                                case bb.c.b.O1 /* 248 */:
                                    int i15 = (i10 == true ? 1 : 0) & 8192;
                                    i10 = i10;
                                    if (i15 != 8192) {
                                        this.f126831t = new ArrayList();
                                        i10 = (i10 == true ? 1 : 0) | 8192;
                                    }
                                    this.f126831t.add(Integer.valueOf(eVar.s()));
                                    continue;
                                case 250:
                                    int iJ2 = eVar.j(eVar.A());
                                    int i16 = (i10 == true ? 1 : 0) & 8192;
                                    i10 = i10;
                                    if (i16 != 8192 && eVar.e() > 0) {
                                        i10 = i10;
                                        this.f126831t = new ArrayList();
                                        i10 = (i10 == true ? 1 : 0) | 8192;
                                    }
                                    i10 = i10;
                                    while (eVar.e() > 0) {
                                        this.f126831t.add(Integer.valueOf(eVar.s()));
                                    }
                                    eVar.i(iJ2);
                                    continue;
                                default:
                                    if (!j(eVar, codedOutputStreamJ, fVar, iK)) {
                                        break;
                                    }
                                    break;
                            }
                            z10 = true;
                        } catch (InvalidProtocolBufferException e10) {
                            throw e10.i(this);
                        }
                    } catch (IOException e11) {
                        throw new InvalidProtocolBufferException(e11.getMessage()).i(this);
                    }
                } catch (Throwable th2) {
                    if (((i10 == true ? 1 : 0) & 32) == 32) {
                        this.f126822k = Collections.unmodifiableList(this.f126822k);
                    }
                    if (((i10 == true ? 1 : 0) & 256) == 256) {
                        this.f126825n = Collections.unmodifiableList(this.f126825n);
                    }
                    if (((i10 == true ? 1 : 0) & 512) == 512) {
                        this.f126826o = Collections.unmodifiableList(this.f126826o);
                    }
                    if (((i10 == true ? 1 : 0) & 8192) == 8192) {
                        this.f126831t = Collections.unmodifiableList(this.f126831t);
                    }
                    try {
                        codedOutputStreamJ.I();
                    } catch (IOException unused) {
                    } finally {
                        this.f126815d = bVarU.e();
                    }
                    g();
                    throw th2;
                }
            }
            if (((i10 == true ? 1 : 0) & 32) == 32) {
                this.f126822k = Collections.unmodifiableList(this.f126822k);
            }
            if (((i10 == true ? 1 : 0) & 256) == 256) {
                this.f126825n = Collections.unmodifiableList(this.f126825n);
            }
            if (((i10 == true ? 1 : 0) & 512) == 512) {
                this.f126826o = Collections.unmodifiableList(this.f126826o);
            }
            if (((i10 == true ? 1 : 0) & 8192) == 8192) {
                this.f126831t = Collections.unmodifiableList(this.f126831t);
            }
            try {
                codedOutputStreamJ.I();
            } catch (IOException unused2) {
            } finally {
                this.f126815d = bVarU.e();
            }
            g();
        }

        private Property(boolean z10) {
            this.f126827p = -1;
            this.f126832u = (byte) -1;
            this.f126833v = -1;
            this.f126815d = kotlin.reflect.jvm.internal.impl.protobuf.d.f127320b;
        }

        public static b A0() {
            return b.z();
        }

        public static b B0(Property property) {
            return A0().h(property);
        }

        public static Property Z() {
            return f126813w;
        }

        private void z0() {
            this.f126817f = bb.c.b.Y6;
            this.f126818g = bb.c.d.f31670z;
            this.f126819h = 0;
            this.f126820i = Type.Y();
            this.f126821j = 0;
            this.f126822k = Collections.emptyList();
            this.f126823l = Type.Y();
            this.f126824m = 0;
            this.f126825n = Collections.emptyList();
            this.f126826o = Collections.emptyList();
            this.f126828q = ValueParameter.J();
            this.f126829r = 0;
            this.f126830s = 0;
            this.f126831t = Collections.emptyList();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        /* JADX INFO: renamed from: C0, reason: merged with bridge method [inline-methods] */
        public b v() {
            return A0();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        /* JADX INFO: renamed from: D0, reason: merged with bridge method [inline-methods] */
        public b t() {
            return B0(this);
        }

        public Type V(int i10) {
            return this.f126825n.get(i10);
        }

        public int W() {
            return this.f126825n.size();
        }

        public List<Integer> X() {
            return this.f126826o;
        }

        public List<Type> Y() {
            return this.f126825n;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        public void a(CodedOutputStream codedOutputStream) throws IOException {
            u();
            GeneratedMessageLite.ExtendableMessage<MessageType>.a aVarY = y();
            if ((this.f126816e & 2) == 2) {
                codedOutputStream.a0(1, this.f126818g);
            }
            if ((this.f126816e & 4) == 4) {
                codedOutputStream.a0(2, this.f126819h);
            }
            if ((this.f126816e & 8) == 8) {
                codedOutputStream.d0(3, this.f126820i);
            }
            for (int i10 = 0; i10 < this.f126822k.size(); i10++) {
                codedOutputStream.d0(4, this.f126822k.get(i10));
            }
            if ((this.f126816e & 32) == 32) {
                codedOutputStream.d0(5, this.f126823l);
            }
            if ((this.f126816e & 128) == 128) {
                codedOutputStream.d0(6, this.f126828q);
            }
            if ((this.f126816e & 256) == 256) {
                codedOutputStream.a0(7, this.f126829r);
            }
            if ((this.f126816e & 512) == 512) {
                codedOutputStream.a0(8, this.f126830s);
            }
            if ((this.f126816e & 16) == 16) {
                codedOutputStream.a0(9, this.f126821j);
            }
            if ((this.f126816e & 64) == 64) {
                codedOutputStream.a0(10, this.f126824m);
            }
            if ((this.f126816e & 1) == 1) {
                codedOutputStream.a0(11, this.f126817f);
            }
            for (int i11 = 0; i11 < this.f126825n.size(); i11++) {
                codedOutputStream.d0(12, this.f126825n.get(i11));
            }
            if (X().size() > 0) {
                codedOutputStream.o0(106);
                codedOutputStream.o0(this.f126827p);
            }
            for (int i12 = 0; i12 < this.f126826o.size(); i12++) {
                codedOutputStream.b0(this.f126826o.get(i12).intValue());
            }
            for (int i13 = 0; i13 < this.f126831t.size(); i13++) {
                codedOutputStream.a0(31, this.f126831t.get(i13).intValue());
            }
            aVarY.a(19000, codedOutputStream);
            codedOutputStream.i0(this.f126815d);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        /* JADX INFO: renamed from: a0, reason: merged with bridge method [inline-methods] */
        public Property r() {
            return f126813w;
        }

        public int b0() {
            return this.f126817f;
        }

        public int c0() {
            return this.f126829r;
        }

        public int d0() {
            return this.f126819h;
        }

        public int e0() {
            return this.f126818g;
        }

        public Type f0() {
            return this.f126823l;
        }

        public int g0() {
            return this.f126824m;
        }

        public Type h0() {
            return this.f126820i;
        }

        public int i0() {
            return this.f126821j;
        }

        public int j0() {
            return this.f126830s;
        }

        public ValueParameter k0() {
            return this.f126828q;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public final boolean l() {
            byte b10 = this.f126832u;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            if (!r0()) {
                this.f126832u = (byte) 0;
                return false;
            }
            if (v0() && !h0().l()) {
                this.f126832u = (byte) 0;
                return false;
            }
            for (int i10 = 0; i10 < m0(); i10++) {
                if (!l0(i10).l()) {
                    this.f126832u = (byte) 0;
                    return false;
                }
            }
            if (t0() && !f0().l()) {
                this.f126832u = (byte) 0;
                return false;
            }
            for (int i11 = 0; i11 < W(); i11++) {
                if (!V(i11).l()) {
                    this.f126832u = (byte) 0;
                    return false;
                }
            }
            if (y0() && !k0().l()) {
                this.f126832u = (byte) 0;
                return false;
            }
            if (n()) {
                this.f126832u = (byte) 1;
                return true;
            }
            this.f126832u = (byte) 0;
            return false;
        }

        public TypeParameter l0(int i10) {
            return this.f126822k.get(i10);
        }

        public int m0() {
            return this.f126822k.size();
        }

        public List<TypeParameter> n0() {
            return this.f126822k;
        }

        public List<Integer> o0() {
            return this.f126831t;
        }

        public boolean p0() {
            return (this.f126816e & 1) == 1;
        }

        public boolean q0() {
            return (this.f126816e & 256) == 256;
        }

        public boolean r0() {
            return (this.f126816e & 4) == 4;
        }

        public boolean s0() {
            return (this.f126816e & 2) == 2;
        }

        public boolean t0() {
            return (this.f126816e & 32) == 32;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        public int u() {
            int i10 = this.f126833v;
            if (i10 != -1) {
                return i10;
            }
            int iO = (this.f126816e & 2) == 2 ? CodedOutputStream.o(1, this.f126818g) + 0 : 0;
            if ((this.f126816e & 4) == 4) {
                iO += CodedOutputStream.o(2, this.f126819h);
            }
            if ((this.f126816e & 8) == 8) {
                iO += CodedOutputStream.s(3, this.f126820i);
            }
            for (int i11 = 0; i11 < this.f126822k.size(); i11++) {
                iO += CodedOutputStream.s(4, this.f126822k.get(i11));
            }
            if ((this.f126816e & 32) == 32) {
                iO += CodedOutputStream.s(5, this.f126823l);
            }
            if ((this.f126816e & 128) == 128) {
                iO += CodedOutputStream.s(6, this.f126828q);
            }
            if ((this.f126816e & 256) == 256) {
                iO += CodedOutputStream.o(7, this.f126829r);
            }
            if ((this.f126816e & 512) == 512) {
                iO += CodedOutputStream.o(8, this.f126830s);
            }
            if ((this.f126816e & 16) == 16) {
                iO += CodedOutputStream.o(9, this.f126821j);
            }
            if ((this.f126816e & 64) == 64) {
                iO += CodedOutputStream.o(10, this.f126824m);
            }
            if ((this.f126816e & 1) == 1) {
                iO += CodedOutputStream.o(11, this.f126817f);
            }
            for (int i12 = 0; i12 < this.f126825n.size(); i12++) {
                iO += CodedOutputStream.s(12, this.f126825n.get(i12));
            }
            int iP = 0;
            for (int i13 = 0; i13 < this.f126826o.size(); i13++) {
                iP += CodedOutputStream.p(this.f126826o.get(i13).intValue());
            }
            int iP2 = iO + iP;
            if (!X().isEmpty()) {
                iP2 = iP2 + 1 + CodedOutputStream.p(iP);
            }
            this.f126827p = iP;
            int iP3 = 0;
            for (int i14 = 0; i14 < this.f126831t.size(); i14++) {
                iP3 += CodedOutputStream.p(this.f126831t.get(i14).intValue());
            }
            int size = iP2 + iP3 + (o0().size() * 2) + o() + this.f126815d.size();
            this.f126833v = size;
            return size;
        }

        public boolean u0() {
            return (this.f126816e & 64) == 64;
        }

        public boolean v0() {
            return (this.f126816e & 8) == 8;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.n
        public kotlin.reflect.jvm.internal.impl.protobuf.p<Property> w() {
            return f126814x;
        }

        public boolean w0() {
            return (this.f126816e & 16) == 16;
        }

        public boolean x0() {
            return (this.f126816e & 512) == 512;
        }

        public boolean y0() {
            return (this.f126816e & 128) == 128;
        }
    }

    public static final class QualifiedNameTable extends GeneratedMessageLite implements o {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final QualifiedNameTable f126849g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static kotlin.reflect.jvm.internal.impl.protobuf.p<QualifiedNameTable> f126850h = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final kotlin.reflect.jvm.internal.impl.protobuf.d f126851c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private List<QualifiedName> f126852d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private byte f126853e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f126854f;

        public static final class QualifiedName extends GeneratedMessageLite implements n {

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            private static final QualifiedName f126855j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            public static kotlin.reflect.jvm.internal.impl.protobuf.p<QualifiedName> f126856k = new a();

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final kotlin.reflect.jvm.internal.impl.protobuf.d f126857c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f126858d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private int f126859e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private int f126860f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private Kind f126861g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private byte f126862h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private int f126863i;

            public enum Kind implements kotlin.reflect.jvm.internal.impl.protobuf.h.a {
                CLASS(0, 0),
                PACKAGE(1, 1),
                LOCAL(2, 2);

                private static kotlin.reflect.jvm.internal.impl.protobuf.h.b<Kind> internalValueMap = new a();
                private final int value;

                public static final class a implements kotlin.reflect.jvm.internal.impl.protobuf.h.b<Kind> {
                    a() {
                    }

                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
                    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                    public Kind a(int i10) {
                        return Kind.valueOf(i10);
                    }
                }

                Kind(int i10, int i11) {
                    this.value = i11;
                }

                public static Kind valueOf(int i10) {
                    if (i10 == 0) {
                        return CLASS;
                    }
                    if (i10 == 1) {
                        return PACKAGE;
                    }
                    if (i10 != 2) {
                        return null;
                    }
                    return LOCAL;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.a
                public final int getNumber() {
                    return this.value;
                }
            }

            public static final class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<QualifiedName> {
                a() {
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
                /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
                public QualifiedName d(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws InvalidProtocolBufferException {
                    return new QualifiedName(eVar, fVar);
                }
            }

            public static final class b extends GeneratedMessageLite.b<QualifiedName, b> implements n {

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private int f126864c;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                private int f126866e;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                private int f126865d = -1;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                private Kind f126867f = Kind.PACKAGE;

                private b() {
                    s();
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static b o() {
                    return new b();
                }

                private void s() {
                }

                public b B(int i10) {
                    this.f126864c |= 1;
                    this.f126865d = i10;
                    return this;
                }

                public b C(int i10) {
                    this.f126864c |= 2;
                    this.f126866e = i10;
                    return this;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.n.a
                /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
                public QualifiedName build() {
                    QualifiedName qualifiedNameM = m();
                    if (qualifiedNameM.l()) {
                        return qualifiedNameM;
                    }
                    throw kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC1169a.d(qualifiedNameM);
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
                public final boolean l() {
                    return q();
                }

                public QualifiedName m() {
                    QualifiedName qualifiedName = new QualifiedName(this);
                    int i10 = this.f126864c;
                    int i11 = (i10 & 1) != 1 ? 0 : 1;
                    qualifiedName.f126859e = this.f126865d;
                    if ((i10 & 2) == 2) {
                        i11 |= 2;
                    }
                    qualifiedName.f126860f = this.f126866e;
                    if ((i10 & 4) == 4) {
                        i11 |= 4;
                    }
                    qualifiedName.f126861g = this.f126867f;
                    qualifiedName.f126858d = i11;
                    return qualifiedName;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public b m() {
                    return o().h(m());
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b, kotlin.reflect.jvm.internal.impl.protobuf.o
                /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
                public QualifiedName r() {
                    return QualifiedName.s();
                }

                public boolean q() {
                    return (this.f126864c & 2) == 2;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b
                /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
                public b h(QualifiedName qualifiedName) {
                    if (qualifiedName == QualifiedName.s()) {
                        return this;
                    }
                    if (qualifiedName.C()) {
                        B(qualifiedName.z());
                    }
                    if (qualifiedName.D()) {
                        C(qualifiedName.A());
                    }
                    if (qualifiedName.B()) {
                        z(qualifiedName.y());
                    }
                    i(g().b(qualifiedName.f126857c));
                    return this;
                }

                /* JADX WARN: Code duplicated, block: B:15:0x001d  */
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC1169a
                /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
                public b c(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws Throwable {
                    QualifiedName qualifiedName = null;
                    try {
                        try {
                            QualifiedName qualifiedNameD = QualifiedName.f126856k.d(eVar, fVar);
                            if (qualifiedNameD != null) {
                                h(qualifiedNameD);
                            }
                            return this;
                        } catch (InvalidProtocolBufferException e10) {
                            QualifiedName qualifiedName2 = (QualifiedName) e10.a();
                            try {
                                throw e10;
                            } catch (Throwable th2) {
                                th = th2;
                                qualifiedName = qualifiedName2;
                                if (qualifiedName != null) {
                                    h(qualifiedName);
                                }
                                throw th;
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        if (qualifiedName != null) {
                            h(qualifiedName);
                        }
                        throw th;
                    }
                }

                public b z(Kind kind) {
                    kind.getClass();
                    this.f126864c |= 4;
                    this.f126867f = kind;
                    return this;
                }
            }

            static {
                QualifiedName qualifiedName = new QualifiedName(true);
                f126855j = qualifiedName;
                qualifiedName.E();
            }

            private QualifiedName(GeneratedMessageLite.b bVar) {
                super(bVar);
                this.f126862h = (byte) -1;
                this.f126863i = -1;
                this.f126857c = bVar.g();
            }

            private QualifiedName(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws InvalidProtocolBufferException {
                this.f126862h = (byte) -1;
                this.f126863i = -1;
                E();
                kotlin.reflect.jvm.internal.impl.protobuf.d.b bVarU = kotlin.reflect.jvm.internal.impl.protobuf.d.u();
                CodedOutputStream codedOutputStreamJ = CodedOutputStream.J(bVarU, 1);
                boolean z10 = false;
                while (!z10) {
                    try {
                        try {
                            int iK = eVar.K();
                            if (iK != 0) {
                                if (iK == 8) {
                                    this.f126858d |= 1;
                                    this.f126859e = eVar.s();
                                } else if (iK == 16) {
                                    this.f126858d |= 2;
                                    this.f126860f = eVar.s();
                                } else if (iK == 24) {
                                    int iN = eVar.n();
                                    Kind kindValueOf = Kind.valueOf(iN);
                                    if (kindValueOf == null) {
                                        codedOutputStreamJ.o0(iK);
                                        codedOutputStreamJ.o0(iN);
                                    } else {
                                        this.f126858d |= 4;
                                        this.f126861g = kindValueOf;
                                    }
                                } else if (!j(eVar, codedOutputStreamJ, fVar, iK)) {
                                }
                            }
                            z10 = true;
                        } catch (InvalidProtocolBufferException e10) {
                            throw e10.i(this);
                        } catch (IOException e11) {
                            throw new InvalidProtocolBufferException(e11.getMessage()).i(this);
                        }
                    } catch (Throwable th2) {
                        try {
                            codedOutputStreamJ.I();
                        } catch (IOException unused) {
                        } finally {
                            this.f126857c = bVarU.e();
                        }
                        g();
                        throw th2;
                    }
                }
                try {
                    codedOutputStreamJ.I();
                } catch (IOException unused2) {
                } finally {
                    this.f126857c = bVarU.e();
                }
                g();
            }

            private QualifiedName(boolean z10) {
                this.f126862h = (byte) -1;
                this.f126863i = -1;
                this.f126857c = kotlin.reflect.jvm.internal.impl.protobuf.d.f127320b;
            }

            private void E() {
                this.f126859e = -1;
                this.f126860f = 0;
                this.f126861g = Kind.PACKAGE;
            }

            public static b F() {
                return b.o();
            }

            public static b G(QualifiedName qualifiedName) {
                return F().h(qualifiedName);
            }

            public static QualifiedName s() {
                return f126855j;
            }

            public int A() {
                return this.f126860f;
            }

            public boolean B() {
                return (this.f126858d & 4) == 4;
            }

            public boolean C() {
                return (this.f126858d & 1) == 1;
            }

            public boolean D() {
                return (this.f126858d & 2) == 2;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
            /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
            public b v() {
                return F();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
            /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
            public b t() {
                return G(this);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
            public void a(CodedOutputStream codedOutputStream) throws IOException {
                u();
                if ((this.f126858d & 1) == 1) {
                    codedOutputStream.a0(1, this.f126859e);
                }
                if ((this.f126858d & 2) == 2) {
                    codedOutputStream.a0(2, this.f126860f);
                }
                if ((this.f126858d & 4) == 4) {
                    codedOutputStream.S(3, this.f126861g.getNumber());
                }
                codedOutputStream.i0(this.f126857c);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
            public final boolean l() {
                byte b10 = this.f126862h;
                if (b10 == 1) {
                    return true;
                }
                if (b10 == 0) {
                    return false;
                }
                if (D()) {
                    this.f126862h = (byte) 1;
                    return true;
                }
                this.f126862h = (byte) 0;
                return false;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
            public int u() {
                int i10 = this.f126863i;
                if (i10 != -1) {
                    return i10;
                }
                int iO = (this.f126858d & 1) == 1 ? 0 + CodedOutputStream.o(1, this.f126859e) : 0;
                if ((this.f126858d & 2) == 2) {
                    iO += CodedOutputStream.o(2, this.f126860f);
                }
                if ((this.f126858d & 4) == 4) {
                    iO += CodedOutputStream.h(3, this.f126861g.getNumber());
                }
                int size = iO + this.f126857c.size();
                this.f126863i = size;
                return size;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.n
            public kotlin.reflect.jvm.internal.impl.protobuf.p<QualifiedName> w() {
                return f126856k;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
            /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
            public QualifiedName r() {
                return f126855j;
            }

            public Kind y() {
                return this.f126861g;
            }

            public int z() {
                return this.f126859e;
            }
        }

        public static final class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<QualifiedNameTable> {
            a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public QualifiedNameTable d(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws InvalidProtocolBufferException {
                return new QualifiedNameTable(eVar, fVar);
            }
        }

        public static final class b extends GeneratedMessageLite.b<QualifiedNameTable, b> implements o {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private int f126868c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private List<QualifiedName> f126869d = Collections.emptyList();

            private b() {
                y();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static b o() {
                return new b();
            }

            private void p() {
                if ((this.f126868c & 1) != 1) {
                    this.f126869d = new ArrayList(this.f126869d);
                    this.f126868c |= 1;
                }
            }

            private void y() {
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC1169a
            /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
            public b c(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws Throwable {
                QualifiedNameTable qualifiedNameTable = null;
                try {
                    try {
                        QualifiedNameTable qualifiedNameTableD = QualifiedNameTable.f126850h.d(eVar, fVar);
                        if (qualifiedNameTableD != null) {
                            h(qualifiedNameTableD);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e10) {
                        QualifiedNameTable qualifiedNameTable2 = (QualifiedNameTable) e10.a();
                        try {
                            throw e10;
                        } catch (Throwable th2) {
                            th = th2;
                            qualifiedNameTable = qualifiedNameTable2;
                            if (qualifiedNameTable != null) {
                                h(qualifiedNameTable);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (qualifiedNameTable != null) {
                        h(qualifiedNameTable);
                    }
                    throw th;
                }
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.n.a
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public QualifiedNameTable build() {
                QualifiedNameTable qualifiedNameTableM = m();
                if (qualifiedNameTableM.l()) {
                    return qualifiedNameTableM;
                }
                throw kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC1169a.d(qualifiedNameTableM);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
            public final boolean l() {
                for (int i10 = 0; i10 < x(); i10++) {
                    if (!s(i10).l()) {
                        return false;
                    }
                }
                return true;
            }

            public QualifiedNameTable m() {
                QualifiedNameTable qualifiedNameTable = new QualifiedNameTable(this);
                if ((this.f126868c & 1) == 1) {
                    this.f126869d = Collections.unmodifiableList(this.f126869d);
                    this.f126868c &= -2;
                }
                qualifiedNameTable.f126852d = this.f126869d;
                return qualifiedNameTable;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public b m() {
                return o().h(m());
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b, kotlin.reflect.jvm.internal.impl.protobuf.o
            /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
            public QualifiedNameTable r() {
                return QualifiedNameTable.p();
            }

            public QualifiedName s(int i10) {
                return this.f126869d.get(i10);
            }

            public int x() {
                return this.f126869d.size();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b
            /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
            public b h(QualifiedNameTable qualifiedNameTable) {
                if (qualifiedNameTable == QualifiedNameTable.p()) {
                    return this;
                }
                if (!qualifiedNameTable.f126852d.isEmpty()) {
                    if (this.f126869d.isEmpty()) {
                        this.f126869d = qualifiedNameTable.f126852d;
                        this.f126868c &= -2;
                    } else {
                        p();
                        this.f126869d.addAll(qualifiedNameTable.f126852d);
                    }
                }
                i(g().b(qualifiedNameTable.f126851c));
                return this;
            }
        }

        static {
            QualifiedNameTable qualifiedNameTable = new QualifiedNameTable(true);
            f126849g = qualifiedNameTable;
            qualifiedNameTable.y();
        }

        private QualifiedNameTable(GeneratedMessageLite.b bVar) {
            super(bVar);
            this.f126853e = (byte) -1;
            this.f126854f = -1;
            this.f126851c = bVar.g();
        }

        private QualifiedNameTable(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws InvalidProtocolBufferException {
            this.f126853e = (byte) -1;
            this.f126854f = -1;
            y();
            kotlin.reflect.jvm.internal.impl.protobuf.d.b bVarU = kotlin.reflect.jvm.internal.impl.protobuf.d.u();
            CodedOutputStream codedOutputStreamJ = CodedOutputStream.J(bVarU, 1);
            boolean z10 = false;
            boolean z11 = false;
            while (!z10) {
                try {
                    try {
                        int iK = eVar.K();
                        if (iK != 0) {
                            if (iK == 10) {
                                if (!(z11 & true)) {
                                    this.f126852d = new ArrayList();
                                    z11 |= true;
                                }
                                this.f126852d.add((QualifiedName) eVar.u(QualifiedName.f126856k, fVar));
                            } else if (!j(eVar, codedOutputStreamJ, fVar, iK)) {
                            }
                        }
                        z10 = true;
                    } catch (Throwable th2) {
                        if (z11 & true) {
                            this.f126852d = Collections.unmodifiableList(this.f126852d);
                        }
                        try {
                            codedOutputStreamJ.I();
                        } catch (IOException unused) {
                        } finally {
                            this.f126851c = bVarU.e();
                        }
                        g();
                        throw th2;
                    }
                } catch (InvalidProtocolBufferException e10) {
                    throw e10.i(this);
                } catch (IOException e11) {
                    throw new InvalidProtocolBufferException(e11.getMessage()).i(this);
                }
            }
            if (z11 & true) {
                this.f126852d = Collections.unmodifiableList(this.f126852d);
            }
            try {
                codedOutputStreamJ.I();
            } catch (IOException unused2) {
            } finally {
                this.f126851c = bVarU.e();
            }
            g();
        }

        private QualifiedNameTable(boolean z10) {
            this.f126853e = (byte) -1;
            this.f126854f = -1;
            this.f126851c = kotlin.reflect.jvm.internal.impl.protobuf.d.f127320b;
        }

        public static b A(QualifiedNameTable qualifiedNameTable) {
            return z().h(qualifiedNameTable);
        }

        public static QualifiedNameTable p() {
            return f126849g;
        }

        private void y() {
            this.f126852d = Collections.emptyList();
        }

        public static b z() {
            return b.o();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
        public b v() {
            return z();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
        public b t() {
            return A(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        public void a(CodedOutputStream codedOutputStream) throws IOException {
            u();
            for (int i10 = 0; i10 < this.f126852d.size(); i10++) {
                codedOutputStream.d0(1, this.f126852d.get(i10));
            }
            codedOutputStream.i0(this.f126851c);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public final boolean l() {
            byte b10 = this.f126853e;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            for (int i10 = 0; i10 < x(); i10++) {
                if (!s(i10).l()) {
                    this.f126853e = (byte) 0;
                    return false;
                }
            }
            this.f126853e = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public QualifiedNameTable r() {
            return f126849g;
        }

        public QualifiedName s(int i10) {
            return this.f126852d.get(i10);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        public int u() {
            int i10 = this.f126854f;
            if (i10 != -1) {
                return i10;
            }
            int iS = 0;
            for (int i11 = 0; i11 < this.f126852d.size(); i11++) {
                iS += CodedOutputStream.s(1, this.f126852d.get(i11));
            }
            int size = iS + this.f126851c.size();
            this.f126854f = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.n
        public kotlin.reflect.jvm.internal.impl.protobuf.p<QualifiedNameTable> w() {
            return f126850h;
        }

        public int x() {
            return this.f126852d.size();
        }
    }

    public static final class StringTable extends GeneratedMessageLite implements p {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final StringTable f126870g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static kotlin.reflect.jvm.internal.impl.protobuf.p<StringTable> f126871h = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final kotlin.reflect.jvm.internal.impl.protobuf.d f126872c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private kotlin.reflect.jvm.internal.impl.protobuf.l f126873d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private byte f126874e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f126875f;

        public static final class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<StringTable> {
            a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public StringTable d(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws InvalidProtocolBufferException {
                return new StringTable(eVar, fVar);
            }
        }

        public static final class b extends GeneratedMessageLite.b<StringTable, b> implements p {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private int f126876c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private kotlin.reflect.jvm.internal.impl.protobuf.l f126877d = kotlin.reflect.jvm.internal.impl.protobuf.k.f127362c;

            private b() {
                s();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static b o() {
                return new b();
            }

            private void p() {
                if ((this.f126876c & 1) != 1) {
                    this.f126877d = new kotlin.reflect.jvm.internal.impl.protobuf.k(this.f126877d);
                    this.f126876c |= 1;
                }
            }

            private void s() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.n.a
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public StringTable build() {
                StringTable stringTableM = m();
                if (stringTableM.l()) {
                    return stringTableM;
                }
                throw kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC1169a.d(stringTableM);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
            public final boolean l() {
                return true;
            }

            public StringTable m() {
                StringTable stringTable = new StringTable(this);
                if ((this.f126876c & 1) == 1) {
                    this.f126877d = this.f126877d.n();
                    this.f126876c &= -2;
                }
                stringTable.f126873d = this.f126877d;
                return stringTable;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public b m() {
                return o().h(m());
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b, kotlin.reflect.jvm.internal.impl.protobuf.o
            /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
            public StringTable r() {
                return StringTable.p();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b
            /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
            public b h(StringTable stringTable) {
                if (stringTable == StringTable.p()) {
                    return this;
                }
                if (!stringTable.f126873d.isEmpty()) {
                    if (this.f126877d.isEmpty()) {
                        this.f126877d = stringTable.f126873d;
                        this.f126876c &= -2;
                    } else {
                        p();
                        this.f126877d.addAll(stringTable.f126873d);
                    }
                }
                i(g().b(stringTable.f126872c));
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC1169a
            /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
            public b c(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws Throwable {
                StringTable stringTable = null;
                try {
                    try {
                        StringTable stringTableD = StringTable.f126871h.d(eVar, fVar);
                        if (stringTableD != null) {
                            h(stringTableD);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e10) {
                        StringTable stringTable2 = (StringTable) e10.a();
                        try {
                            throw e10;
                        } catch (Throwable th2) {
                            th = th2;
                            stringTable = stringTable2;
                            if (stringTable != null) {
                                h(stringTable);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (stringTable != null) {
                        h(stringTable);
                    }
                    throw th;
                }
            }
        }

        static {
            StringTable stringTable = new StringTable(true);
            f126870g = stringTable;
            stringTable.y();
        }

        private StringTable(GeneratedMessageLite.b bVar) {
            super(bVar);
            this.f126874e = (byte) -1;
            this.f126875f = -1;
            this.f126872c = bVar.g();
        }

        private StringTable(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws InvalidProtocolBufferException {
            this.f126874e = (byte) -1;
            this.f126875f = -1;
            y();
            kotlin.reflect.jvm.internal.impl.protobuf.d.b bVarU = kotlin.reflect.jvm.internal.impl.protobuf.d.u();
            CodedOutputStream codedOutputStreamJ = CodedOutputStream.J(bVarU, 1);
            boolean z10 = false;
            boolean z11 = false;
            while (!z10) {
                try {
                    try {
                        try {
                            int iK = eVar.K();
                            if (iK != 0) {
                                if (iK == 10) {
                                    kotlin.reflect.jvm.internal.impl.protobuf.d dVarL = eVar.l();
                                    if (!(z11 & true)) {
                                        this.f126873d = new kotlin.reflect.jvm.internal.impl.protobuf.k();
                                        z11 |= true;
                                    }
                                    this.f126873d.i1(dVarL);
                                } else if (!j(eVar, codedOutputStreamJ, fVar, iK)) {
                                }
                            }
                            z10 = true;
                        } catch (InvalidProtocolBufferException e10) {
                            throw e10.i(this);
                        }
                    } catch (IOException e11) {
                        throw new InvalidProtocolBufferException(e11.getMessage()).i(this);
                    }
                } catch (Throwable th2) {
                    if (z11 & true) {
                        this.f126873d = this.f126873d.n();
                    }
                    try {
                        codedOutputStreamJ.I();
                    } catch (IOException unused) {
                    } finally {
                        this.f126872c = bVarU.e();
                    }
                    g();
                    throw th2;
                }
            }
            if (z11 & true) {
                this.f126873d = this.f126873d.n();
            }
            try {
                codedOutputStreamJ.I();
            } catch (IOException unused2) {
            } finally {
                this.f126872c = bVarU.e();
            }
            g();
        }

        private StringTable(boolean z10) {
            this.f126874e = (byte) -1;
            this.f126875f = -1;
            this.f126872c = kotlin.reflect.jvm.internal.impl.protobuf.d.f127320b;
        }

        public static b A(StringTable stringTable) {
            return z().h(stringTable);
        }

        public static StringTable p() {
            return f126870g;
        }

        private void y() {
            this.f126873d = kotlin.reflect.jvm.internal.impl.protobuf.k.f127362c;
        }

        public static b z() {
            return b.o();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
        public b v() {
            return z();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
        public b t() {
            return A(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        public void a(CodedOutputStream codedOutputStream) throws IOException {
            u();
            for (int i10 = 0; i10 < this.f126873d.size(); i10++) {
                codedOutputStream.O(1, this.f126873d.r(i10));
            }
            codedOutputStream.i0(this.f126872c);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public final boolean l() {
            byte b10 = this.f126874e;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.f126874e = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public StringTable r() {
            return f126870g;
        }

        public String s(int i10) {
            return this.f126873d.get(i10);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        public int u() {
            int i10 = this.f126875f;
            if (i10 != -1) {
                return i10;
            }
            int iE = 0;
            for (int i11 = 0; i11 < this.f126873d.size(); i11++) {
                iE += CodedOutputStream.e(this.f126873d.r(i11));
            }
            int size = 0 + iE + (x().size() * 1) + this.f126872c.size();
            this.f126875f = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.n
        public kotlin.reflect.jvm.internal.impl.protobuf.p<StringTable> w() {
            return f126871h;
        }

        public kotlin.reflect.jvm.internal.impl.protobuf.q x() {
            return this.f126873d;
        }
    }

    public static final class Type extends GeneratedMessageLite.ExtendableMessage<Type> implements s {

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private static final Type f126878v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public static kotlin.reflect.jvm.internal.impl.protobuf.p<Type> f126879w = new a();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final kotlin.reflect.jvm.internal.impl.protobuf.d f126880d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f126881e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private List<Argument> f126882f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f126883g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f126884h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private Type f126885i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f126886j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f126887k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f126888l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f126889m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private int f126890n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private Type f126891o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private int f126892p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private Type f126893q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private int f126894r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private int f126895s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private byte f126896t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private int f126897u;

        public static final class Argument extends GeneratedMessageLite implements q {

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            private static final Argument f126898j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            public static kotlin.reflect.jvm.internal.impl.protobuf.p<Argument> f126899k = new a();

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final kotlin.reflect.jvm.internal.impl.protobuf.d f126900c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f126901d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private Projection f126902e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private Type f126903f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private int f126904g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private byte f126905h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private int f126906i;

            public enum Projection implements kotlin.reflect.jvm.internal.impl.protobuf.h.a {
                IN(0, 0),
                OUT(1, 1),
                INV(2, 2),
                STAR(3, 3);

                private static kotlin.reflect.jvm.internal.impl.protobuf.h.b<Projection> internalValueMap = new a();
                private final int value;

                public static final class a implements kotlin.reflect.jvm.internal.impl.protobuf.h.b<Projection> {
                    a() {
                    }

                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
                    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                    public Projection a(int i10) {
                        return Projection.valueOf(i10);
                    }
                }

                Projection(int i10, int i11) {
                    this.value = i11;
                }

                public static Projection valueOf(int i10) {
                    if (i10 == 0) {
                        return IN;
                    }
                    if (i10 == 1) {
                        return OUT;
                    }
                    if (i10 == 2) {
                        return INV;
                    }
                    if (i10 != 3) {
                        return null;
                    }
                    return STAR;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.a
                public final int getNumber() {
                    return this.value;
                }
            }

            public static final class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<Argument> {
                a() {
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
                /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
                public Argument d(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws InvalidProtocolBufferException {
                    return new Argument(eVar, fVar);
                }
            }

            public static final class b extends GeneratedMessageLite.b<Argument, b> implements q {

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private int f126907c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                private Projection f126908d = Projection.INV;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                private Type f126909e = Type.Y();

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                private int f126910f;

                private b() {
                    x();
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static b o() {
                    return new b();
                }

                private void x() {
                }

                public b B(Type type) {
                    if ((this.f126907c & 2) != 2 || this.f126909e == Type.Y()) {
                        this.f126909e = type;
                    } else {
                        this.f126909e = Type.z0(this.f126909e).h(type).x();
                    }
                    this.f126907c |= 2;
                    return this;
                }

                public b C(Projection projection) {
                    projection.getClass();
                    this.f126907c |= 1;
                    this.f126908d = projection;
                    return this;
                }

                public b D(int i10) {
                    this.f126907c |= 4;
                    this.f126910f = i10;
                    return this;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.n.a
                /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
                public Argument build() {
                    Argument argumentM = m();
                    if (argumentM.l()) {
                        return argumentM;
                    }
                    throw kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC1169a.d(argumentM);
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
                public final boolean l() {
                    return !s() || q().l();
                }

                public Argument m() {
                    Argument argument = new Argument(this);
                    int i10 = this.f126907c;
                    int i11 = (i10 & 1) != 1 ? 0 : 1;
                    argument.f126902e = this.f126908d;
                    if ((i10 & 2) == 2) {
                        i11 |= 2;
                    }
                    argument.f126903f = this.f126909e;
                    if ((i10 & 4) == 4) {
                        i11 |= 4;
                    }
                    argument.f126904g = this.f126910f;
                    argument.f126901d = i11;
                    return argument;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public b m() {
                    return o().h(m());
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b, kotlin.reflect.jvm.internal.impl.protobuf.o
                /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
                public Argument r() {
                    return Argument.s();
                }

                public Type q() {
                    return this.f126909e;
                }

                public boolean s() {
                    return (this.f126907c & 2) == 2;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b
                /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
                public b h(Argument argument) {
                    if (argument == Argument.s()) {
                        return this;
                    }
                    if (argument.B()) {
                        C(argument.y());
                    }
                    if (argument.C()) {
                        B(argument.z());
                    }
                    if (argument.D()) {
                        D(argument.A());
                    }
                    i(g().b(argument.f126900c));
                    return this;
                }

                /* JADX WARN: Code duplicated, block: B:15:0x001d  */
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC1169a
                /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
                public b c(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws Throwable {
                    Argument argument = null;
                    try {
                        try {
                            Argument argumentD = Argument.f126899k.d(eVar, fVar);
                            if (argumentD != null) {
                                h(argumentD);
                            }
                            return this;
                        } catch (InvalidProtocolBufferException e10) {
                            Argument argument2 = (Argument) e10.a();
                            try {
                                throw e10;
                            } catch (Throwable th2) {
                                th = th2;
                                argument = argument2;
                                if (argument != null) {
                                    h(argument);
                                }
                                throw th;
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        if (argument != null) {
                            h(argument);
                        }
                        throw th;
                    }
                }
            }

            static {
                Argument argument = new Argument(true);
                f126898j = argument;
                argument.E();
            }

            private Argument(GeneratedMessageLite.b bVar) {
                super(bVar);
                this.f126905h = (byte) -1;
                this.f126906i = -1;
                this.f126900c = bVar.g();
            }

            private Argument(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws InvalidProtocolBufferException {
                this.f126905h = (byte) -1;
                this.f126906i = -1;
                E();
                kotlin.reflect.jvm.internal.impl.protobuf.d.b bVarU = kotlin.reflect.jvm.internal.impl.protobuf.d.u();
                CodedOutputStream codedOutputStreamJ = CodedOutputStream.J(bVarU, 1);
                boolean z10 = false;
                while (!z10) {
                    try {
                        try {
                            try {
                                int iK = eVar.K();
                                if (iK != 0) {
                                    if (iK == 8) {
                                        int iN = eVar.n();
                                        Projection projectionValueOf = Projection.valueOf(iN);
                                        if (projectionValueOf == null) {
                                            codedOutputStreamJ.o0(iK);
                                            codedOutputStreamJ.o0(iN);
                                        } else {
                                            this.f126901d |= 1;
                                            this.f126902e = projectionValueOf;
                                        }
                                    } else if (iK == 18) {
                                        b bVarT = (this.f126901d & 2) == 2 ? this.f126903f.t() : null;
                                        Type type = (Type) eVar.u(Type.f126879w, fVar);
                                        this.f126903f = type;
                                        if (bVarT != null) {
                                            bVarT.h(type);
                                            this.f126903f = bVarT.x();
                                        }
                                        this.f126901d |= 2;
                                    } else if (iK == 24) {
                                        this.f126901d |= 4;
                                        this.f126904g = eVar.s();
                                    } else if (!j(eVar, codedOutputStreamJ, fVar, iK)) {
                                    }
                                }
                                z10 = true;
                            } catch (InvalidProtocolBufferException e10) {
                                throw e10.i(this);
                            }
                        } catch (IOException e11) {
                            throw new InvalidProtocolBufferException(e11.getMessage()).i(this);
                        }
                    } catch (Throwable th2) {
                        try {
                            codedOutputStreamJ.I();
                        } catch (IOException unused) {
                        } finally {
                            this.f126900c = bVarU.e();
                        }
                        g();
                        throw th2;
                    }
                }
                try {
                    codedOutputStreamJ.I();
                } catch (IOException unused2) {
                } finally {
                    this.f126900c = bVarU.e();
                }
                g();
            }

            private Argument(boolean z10) {
                this.f126905h = (byte) -1;
                this.f126906i = -1;
                this.f126900c = kotlin.reflect.jvm.internal.impl.protobuf.d.f127320b;
            }

            private void E() {
                this.f126902e = Projection.INV;
                this.f126903f = Type.Y();
                this.f126904g = 0;
            }

            public static b F() {
                return b.o();
            }

            public static b G(Argument argument) {
                return F().h(argument);
            }

            public static Argument s() {
                return f126898j;
            }

            public int A() {
                return this.f126904g;
            }

            public boolean B() {
                return (this.f126901d & 1) == 1;
            }

            public boolean C() {
                return (this.f126901d & 2) == 2;
            }

            public boolean D() {
                return (this.f126901d & 4) == 4;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
            /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
            public b v() {
                return F();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
            /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
            public b t() {
                return G(this);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
            public void a(CodedOutputStream codedOutputStream) throws IOException {
                u();
                if ((this.f126901d & 1) == 1) {
                    codedOutputStream.S(1, this.f126902e.getNumber());
                }
                if ((this.f126901d & 2) == 2) {
                    codedOutputStream.d0(2, this.f126903f);
                }
                if ((this.f126901d & 4) == 4) {
                    codedOutputStream.a0(3, this.f126904g);
                }
                codedOutputStream.i0(this.f126900c);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
            public final boolean l() {
                byte b10 = this.f126905h;
                if (b10 == 1) {
                    return true;
                }
                if (b10 == 0) {
                    return false;
                }
                if (!C() || z().l()) {
                    this.f126905h = (byte) 1;
                    return true;
                }
                this.f126905h = (byte) 0;
                return false;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
            public int u() {
                int i10 = this.f126906i;
                if (i10 != -1) {
                    return i10;
                }
                int iH = (this.f126901d & 1) == 1 ? 0 + CodedOutputStream.h(1, this.f126902e.getNumber()) : 0;
                if ((this.f126901d & 2) == 2) {
                    iH += CodedOutputStream.s(2, this.f126903f);
                }
                if ((this.f126901d & 4) == 4) {
                    iH += CodedOutputStream.o(3, this.f126904g);
                }
                int size = iH + this.f126900c.size();
                this.f126906i = size;
                return size;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.n
            public kotlin.reflect.jvm.internal.impl.protobuf.p<Argument> w() {
                return f126899k;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
            /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
            public Argument r() {
                return f126898j;
            }

            public Projection y() {
                return this.f126902e;
            }

            public Type z() {
                return this.f126903f;
            }
        }

        public static final class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<Type> {
            a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public Type d(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws InvalidProtocolBufferException {
                return new Type(eVar, fVar);
            }
        }

        public static final class b extends GeneratedMessageLite.c<Type, b> implements s {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private int f126911e;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private boolean f126913g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private int f126914h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            private int f126916j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            private int f126917k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            private int f126918l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            private int f126919m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private int f126920n;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            private int f126922p;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            private int f126924r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            private int f126925s;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private List<Argument> f126912f = Collections.emptyList();

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private Type f126915i = Type.Y();

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            private Type f126921o = Type.Y();

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            private Type f126923q = Type.Y();

            private b() {
                O();
            }

            private void B() {
                if ((this.f126911e & 1) != 1) {
                    this.f126912f = new ArrayList(this.f126912f);
                    this.f126911e |= 1;
                }
            }

            private void O() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static b z() {
                return new b();
            }

            public Type C() {
                return this.f126923q;
            }

            public Argument D(int i10) {
                return this.f126912f.get(i10);
            }

            public int E() {
                return this.f126912f.size();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b, kotlin.reflect.jvm.internal.impl.protobuf.o
            /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
            public Type r() {
                return Type.Y();
            }

            public Type G() {
                return this.f126915i;
            }

            public Type H() {
                return this.f126921o;
            }

            public boolean J() {
                return (this.f126911e & 2048) == 2048;
            }

            public boolean K() {
                return (this.f126911e & 8) == 8;
            }

            public boolean M() {
                return (this.f126911e & 512) == 512;
            }

            public b P(Type type) {
                if ((this.f126911e & 2048) != 2048 || this.f126923q == Type.Y()) {
                    this.f126923q = type;
                } else {
                    this.f126923q = Type.z0(this.f126923q).h(type).x();
                }
                this.f126911e |= 2048;
                return this;
            }

            public b Q(Type type) {
                if ((this.f126911e & 8) != 8 || this.f126915i == Type.Y()) {
                    this.f126915i = type;
                } else {
                    this.f126915i = Type.z0(this.f126915i).h(type).x();
                }
                this.f126911e |= 8;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b
            /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
            public b h(Type type) {
                if (type == Type.Y()) {
                    return this;
                }
                if (!type.f126882f.isEmpty()) {
                    if (this.f126912f.isEmpty()) {
                        this.f126912f = type.f126882f;
                        this.f126911e &= -2;
                    } else {
                        B();
                        this.f126912f.addAll(type.f126882f);
                    }
                }
                if (type.r0()) {
                    b0(type.e0());
                }
                if (type.o0()) {
                    Y(type.b0());
                }
                if (type.p0()) {
                    Q(type.c0());
                }
                if (type.q0()) {
                    Z(type.d0());
                }
                if (type.m0()) {
                    V(type.X());
                }
                if (type.v0()) {
                    e0(type.i0());
                }
                if (type.w0()) {
                    f0(type.j0());
                }
                if (type.u0()) {
                    d0(type.h0());
                }
                if (type.s0()) {
                    T(type.f0());
                }
                if (type.t0()) {
                    c0(type.g0());
                }
                if (type.k0()) {
                    P(type.S());
                }
                if (type.l0()) {
                    U(type.T());
                }
                if (type.n0()) {
                    X(type.a0());
                }
                p(type);
                i(g().b(type.f126880d));
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC1169a
            /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
            public b c(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws Throwable {
                Type type = null;
                try {
                    try {
                        Type typeD = Type.f126879w.d(eVar, fVar);
                        if (typeD != null) {
                            h(typeD);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e10) {
                        Type type2 = (Type) e10.a();
                        try {
                            throw e10;
                        } catch (Throwable th2) {
                            th = th2;
                            type = type2;
                            if (type != null) {
                                h(type);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (type != null) {
                        h(type);
                    }
                    throw th;
                }
            }

            public b T(Type type) {
                if ((this.f126911e & 512) != 512 || this.f126921o == Type.Y()) {
                    this.f126921o = type;
                } else {
                    this.f126921o = Type.z0(this.f126921o).h(type).x();
                }
                this.f126911e |= 512;
                return this;
            }

            public b U(int i10) {
                this.f126911e |= 4096;
                this.f126924r = i10;
                return this;
            }

            public b V(int i10) {
                this.f126911e |= 32;
                this.f126917k = i10;
                return this;
            }

            public b X(int i10) {
                this.f126911e |= 8192;
                this.f126925s = i10;
                return this;
            }

            public b Y(int i10) {
                this.f126911e |= 4;
                this.f126914h = i10;
                return this;
            }

            public b Z(int i10) {
                this.f126911e |= 16;
                this.f126916j = i10;
                return this;
            }

            public b b0(boolean z10) {
                this.f126911e |= 2;
                this.f126913g = z10;
                return this;
            }

            public b c0(int i10) {
                this.f126911e |= 1024;
                this.f126922p = i10;
                return this;
            }

            public b d0(int i10) {
                this.f126911e |= 256;
                this.f126920n = i10;
                return this;
            }

            public b e0(int i10) {
                this.f126911e |= 64;
                this.f126918l = i10;
                return this;
            }

            public b f0(int i10) {
                this.f126911e |= 128;
                this.f126919m = i10;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
            public final boolean l() {
                for (int i10 = 0; i10 < E(); i10++) {
                    if (!D(i10).l()) {
                        return false;
                    }
                }
                if (K() && !G().l()) {
                    return false;
                }
                if (!M() || H().l()) {
                    return (!J() || C().l()) && o();
                }
                return false;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.n.a
            /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
            public Type build() {
                Type typeX = x();
                if (typeX.l()) {
                    return typeX;
                }
                throw kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC1169a.d(typeX);
            }

            public Type x() {
                Type type = new Type(this);
                int i10 = this.f126911e;
                if ((i10 & 1) == 1) {
                    this.f126912f = Collections.unmodifiableList(this.f126912f);
                    this.f126911e &= -2;
                }
                type.f126882f = this.f126912f;
                int i11 = (i10 & 2) != 2 ? 0 : 1;
                type.f126883g = this.f126913g;
                if ((i10 & 4) == 4) {
                    i11 |= 2;
                }
                type.f126884h = this.f126914h;
                if ((i10 & 8) == 8) {
                    i11 |= 4;
                }
                type.f126885i = this.f126915i;
                if ((i10 & 16) == 16) {
                    i11 |= 8;
                }
                type.f126886j = this.f126916j;
                if ((i10 & 32) == 32) {
                    i11 |= 16;
                }
                type.f126887k = this.f126917k;
                if ((i10 & 64) == 64) {
                    i11 |= 32;
                }
                type.f126888l = this.f126918l;
                if ((i10 & 128) == 128) {
                    i11 |= 64;
                }
                type.f126889m = this.f126919m;
                if ((i10 & 256) == 256) {
                    i11 |= 128;
                }
                type.f126890n = this.f126920n;
                if ((i10 & 512) == 512) {
                    i11 |= 256;
                }
                type.f126891o = this.f126921o;
                if ((i10 & 1024) == 1024) {
                    i11 |= 512;
                }
                type.f126892p = this.f126922p;
                if ((i10 & 2048) == 2048) {
                    i11 |= 1024;
                }
                type.f126893q = this.f126923q;
                if ((i10 & 4096) == 4096) {
                    i11 |= 2048;
                }
                type.f126894r = this.f126924r;
                if ((i10 & 8192) == 8192) {
                    i11 |= 4096;
                }
                type.f126895s = this.f126925s;
                type.f126881e = i11;
                return type;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.c
            /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
            public b m() {
                return z().h(x());
            }
        }

        static {
            Type type = new Type(true);
            f126878v = type;
            type.x0();
        }

        private Type(GeneratedMessageLite.c<Type, ?> cVar) {
            super(cVar);
            this.f126896t = (byte) -1;
            this.f126897u = -1;
            this.f126880d = cVar.g();
        }

        private Type(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws InvalidProtocolBufferException {
            b bVarT;
            this.f126896t = (byte) -1;
            this.f126897u = -1;
            x0();
            kotlin.reflect.jvm.internal.impl.protobuf.d.b bVarU = kotlin.reflect.jvm.internal.impl.protobuf.d.u();
            CodedOutputStream codedOutputStreamJ = CodedOutputStream.J(bVarU, 1);
            boolean z10 = false;
            boolean z11 = false;
            while (!z10) {
                try {
                    try {
                        int iK = eVar.K();
                        switch (iK) {
                            case 0:
                                break;
                            case 8:
                                this.f126881e |= 4096;
                                this.f126895s = eVar.s();
                                continue;
                            case 18:
                                if (!(z11 & true)) {
                                    this.f126882f = new ArrayList();
                                    z11 |= true;
                                }
                                this.f126882f.add((Argument) eVar.u(Argument.f126899k, fVar));
                                continue;
                            case 24:
                                this.f126881e |= 1;
                                this.f126883g = eVar.k();
                                continue;
                            case 32:
                                this.f126881e |= 2;
                                this.f126884h = eVar.s();
                                continue;
                            case 42:
                                bVarT = (this.f126881e & 4) == 4 ? this.f126885i.t() : null;
                                Type type = (Type) eVar.u(f126879w, fVar);
                                this.f126885i = type;
                                if (bVarT != null) {
                                    bVarT.h(type);
                                    this.f126885i = bVarT.x();
                                }
                                this.f126881e |= 4;
                                continue;
                            case 48:
                                this.f126881e |= 16;
                                this.f126887k = eVar.s();
                                continue;
                            case 56:
                                this.f126881e |= 32;
                                this.f126888l = eVar.s();
                                continue;
                            case 64:
                                this.f126881e |= 8;
                                this.f126886j = eVar.s();
                                continue;
                            case 72:
                                this.f126881e |= 64;
                                this.f126889m = eVar.s();
                                continue;
                            case 82:
                                bVarT = (this.f126881e & 256) == 256 ? this.f126891o.t() : null;
                                Type type2 = (Type) eVar.u(f126879w, fVar);
                                this.f126891o = type2;
                                if (bVarT != null) {
                                    bVarT.h(type2);
                                    this.f126891o = bVarT.x();
                                }
                                this.f126881e |= 256;
                                continue;
                            case 88:
                                this.f126881e |= 512;
                                this.f126892p = eVar.s();
                                continue;
                            case 96:
                                this.f126881e |= 128;
                                this.f126890n = eVar.s();
                                continue;
                            case 106:
                                bVarT = (this.f126881e & 1024) == 1024 ? this.f126893q.t() : null;
                                Type type3 = (Type) eVar.u(f126879w, fVar);
                                this.f126893q = type3;
                                if (bVarT != null) {
                                    bVarT.h(type3);
                                    this.f126893q = bVarT.x();
                                }
                                this.f126881e |= 1024;
                                continue;
                            case 112:
                                this.f126881e |= 2048;
                                this.f126894r = eVar.s();
                                continue;
                            default:
                                if (!j(eVar, codedOutputStreamJ, fVar, iK)) {
                                    break;
                                }
                                break;
                        }
                        z10 = true;
                    } catch (InvalidProtocolBufferException e10) {
                        throw e10.i(this);
                    } catch (IOException e11) {
                        throw new InvalidProtocolBufferException(e11.getMessage()).i(this);
                    }
                } catch (Throwable th2) {
                    if (z11 & true) {
                        this.f126882f = Collections.unmodifiableList(this.f126882f);
                    }
                    try {
                        codedOutputStreamJ.I();
                    } catch (IOException unused) {
                    } finally {
                        this.f126880d = bVarU.e();
                    }
                    g();
                    throw th2;
                }
            }
            if (z11 & true) {
                this.f126882f = Collections.unmodifiableList(this.f126882f);
            }
            try {
                codedOutputStreamJ.I();
            } catch (IOException unused2) {
            } finally {
                this.f126880d = bVarU.e();
            }
            g();
        }

        private Type(boolean z10) {
            this.f126896t = (byte) -1;
            this.f126897u = -1;
            this.f126880d = kotlin.reflect.jvm.internal.impl.protobuf.d.f127320b;
        }

        public static Type Y() {
            return f126878v;
        }

        private void x0() {
            this.f126882f = Collections.emptyList();
            this.f126883g = false;
            this.f126884h = 0;
            this.f126885i = Y();
            this.f126886j = 0;
            this.f126887k = 0;
            this.f126888l = 0;
            this.f126889m = 0;
            this.f126890n = 0;
            this.f126891o = Y();
            this.f126892p = 0;
            this.f126893q = Y();
            this.f126894r = 0;
            this.f126895s = 0;
        }

        public static b y0() {
            return b.z();
        }

        public static b z0(Type type) {
            return y0().h(type);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        /* JADX INFO: renamed from: A0, reason: merged with bridge method [inline-methods] */
        public b v() {
            return y0();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        /* JADX INFO: renamed from: B0, reason: merged with bridge method [inline-methods] */
        public b t() {
            return z0(this);
        }

        public Type S() {
            return this.f126893q;
        }

        public int T() {
            return this.f126894r;
        }

        public Argument U(int i10) {
            return this.f126882f.get(i10);
        }

        public int V() {
            return this.f126882f.size();
        }

        public List<Argument> W() {
            return this.f126882f;
        }

        public int X() {
            return this.f126887k;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] */
        public Type r() {
            return f126878v;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        public void a(CodedOutputStream codedOutputStream) throws IOException {
            u();
            GeneratedMessageLite.ExtendableMessage<MessageType>.a aVarY = y();
            if ((this.f126881e & 4096) == 4096) {
                codedOutputStream.a0(1, this.f126895s);
            }
            for (int i10 = 0; i10 < this.f126882f.size(); i10++) {
                codedOutputStream.d0(2, this.f126882f.get(i10));
            }
            if ((this.f126881e & 1) == 1) {
                codedOutputStream.L(3, this.f126883g);
            }
            if ((this.f126881e & 2) == 2) {
                codedOutputStream.a0(4, this.f126884h);
            }
            if ((this.f126881e & 4) == 4) {
                codedOutputStream.d0(5, this.f126885i);
            }
            if ((this.f126881e & 16) == 16) {
                codedOutputStream.a0(6, this.f126887k);
            }
            if ((this.f126881e & 32) == 32) {
                codedOutputStream.a0(7, this.f126888l);
            }
            if ((this.f126881e & 8) == 8) {
                codedOutputStream.a0(8, this.f126886j);
            }
            if ((this.f126881e & 64) == 64) {
                codedOutputStream.a0(9, this.f126889m);
            }
            if ((this.f126881e & 256) == 256) {
                codedOutputStream.d0(10, this.f126891o);
            }
            if ((this.f126881e & 512) == 512) {
                codedOutputStream.a0(11, this.f126892p);
            }
            if ((this.f126881e & 128) == 128) {
                codedOutputStream.a0(12, this.f126890n);
            }
            if ((this.f126881e & 1024) == 1024) {
                codedOutputStream.d0(13, this.f126893q);
            }
            if ((this.f126881e & 2048) == 2048) {
                codedOutputStream.a0(14, this.f126894r);
            }
            aVarY.a(200, codedOutputStream);
            codedOutputStream.i0(this.f126880d);
        }

        public int a0() {
            return this.f126895s;
        }

        public int b0() {
            return this.f126884h;
        }

        public Type c0() {
            return this.f126885i;
        }

        public int d0() {
            return this.f126886j;
        }

        public boolean e0() {
            return this.f126883g;
        }

        public Type f0() {
            return this.f126891o;
        }

        public int g0() {
            return this.f126892p;
        }

        public int h0() {
            return this.f126890n;
        }

        public int i0() {
            return this.f126888l;
        }

        public int j0() {
            return this.f126889m;
        }

        public boolean k0() {
            return (this.f126881e & 1024) == 1024;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public final boolean l() {
            byte b10 = this.f126896t;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            for (int i10 = 0; i10 < V(); i10++) {
                if (!U(i10).l()) {
                    this.f126896t = (byte) 0;
                    return false;
                }
            }
            if (p0() && !c0().l()) {
                this.f126896t = (byte) 0;
                return false;
            }
            if (s0() && !f0().l()) {
                this.f126896t = (byte) 0;
                return false;
            }
            if (k0() && !S().l()) {
                this.f126896t = (byte) 0;
                return false;
            }
            if (n()) {
                this.f126896t = (byte) 1;
                return true;
            }
            this.f126896t = (byte) 0;
            return false;
        }

        public boolean l0() {
            return (this.f126881e & 2048) == 2048;
        }

        public boolean m0() {
            return (this.f126881e & 16) == 16;
        }

        public boolean n0() {
            return (this.f126881e & 4096) == 4096;
        }

        public boolean o0() {
            return (this.f126881e & 2) == 2;
        }

        public boolean p0() {
            return (this.f126881e & 4) == 4;
        }

        public boolean q0() {
            return (this.f126881e & 8) == 8;
        }

        public boolean r0() {
            return (this.f126881e & 1) == 1;
        }

        public boolean s0() {
            return (this.f126881e & 256) == 256;
        }

        public boolean t0() {
            return (this.f126881e & 512) == 512;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        public int u() {
            int i10 = this.f126897u;
            if (i10 != -1) {
                return i10;
            }
            int iO = (this.f126881e & 4096) == 4096 ? CodedOutputStream.o(1, this.f126895s) + 0 : 0;
            for (int i11 = 0; i11 < this.f126882f.size(); i11++) {
                iO += CodedOutputStream.s(2, this.f126882f.get(i11));
            }
            if ((this.f126881e & 1) == 1) {
                iO += CodedOutputStream.a(3, this.f126883g);
            }
            if ((this.f126881e & 2) == 2) {
                iO += CodedOutputStream.o(4, this.f126884h);
            }
            if ((this.f126881e & 4) == 4) {
                iO += CodedOutputStream.s(5, this.f126885i);
            }
            if ((this.f126881e & 16) == 16) {
                iO += CodedOutputStream.o(6, this.f126887k);
            }
            if ((this.f126881e & 32) == 32) {
                iO += CodedOutputStream.o(7, this.f126888l);
            }
            if ((this.f126881e & 8) == 8) {
                iO += CodedOutputStream.o(8, this.f126886j);
            }
            if ((this.f126881e & 64) == 64) {
                iO += CodedOutputStream.o(9, this.f126889m);
            }
            if ((this.f126881e & 256) == 256) {
                iO += CodedOutputStream.s(10, this.f126891o);
            }
            if ((this.f126881e & 512) == 512) {
                iO += CodedOutputStream.o(11, this.f126892p);
            }
            if ((this.f126881e & 128) == 128) {
                iO += CodedOutputStream.o(12, this.f126890n);
            }
            if ((this.f126881e & 1024) == 1024) {
                iO += CodedOutputStream.s(13, this.f126893q);
            }
            if ((this.f126881e & 2048) == 2048) {
                iO += CodedOutputStream.o(14, this.f126894r);
            }
            int iO2 = iO + o() + this.f126880d.size();
            this.f126897u = iO2;
            return iO2;
        }

        public boolean u0() {
            return (this.f126881e & 128) == 128;
        }

        public boolean v0() {
            return (this.f126881e & 32) == 32;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.n
        public kotlin.reflect.jvm.internal.impl.protobuf.p<Type> w() {
            return f126879w;
        }

        public boolean w0() {
            return (this.f126881e & 64) == 64;
        }
    }

    public static final class TypeAlias extends GeneratedMessageLite.ExtendableMessage<TypeAlias> implements r {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private static final TypeAlias f126926q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static kotlin.reflect.jvm.internal.impl.protobuf.p<TypeAlias> f126927r = new a();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final kotlin.reflect.jvm.internal.impl.protobuf.d f126928d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f126929e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f126930f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f126931g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private List<TypeParameter> f126932h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private Type f126933i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f126934j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private Type f126935k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f126936l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private List<Annotation> f126937m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private List<Integer> f126938n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private byte f126939o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private int f126940p;

        public static final class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<TypeAlias> {
            a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public TypeAlias d(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws InvalidProtocolBufferException {
                return new TypeAlias(eVar, fVar);
            }
        }

        public static final class b extends GeneratedMessageLite.c<TypeAlias, b> implements r {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private int f126941e;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private int f126943g;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            private int f126946j;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            private int f126948l;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private int f126942f = 6;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private List<TypeParameter> f126944h = Collections.emptyList();

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private Type f126945i = Type.Y();

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            private Type f126947k = Type.Y();

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            private List<Annotation> f126949m = Collections.emptyList();

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private List<Integer> f126950n = Collections.emptyList();

            private b() {
                R();
            }

            private void B() {
                if ((this.f126941e & 128) != 128) {
                    this.f126949m = new ArrayList(this.f126949m);
                    this.f126941e |= 128;
                }
            }

            private void C() {
                if ((this.f126941e & 4) != 4) {
                    this.f126944h = new ArrayList(this.f126944h);
                    this.f126941e |= 4;
                }
            }

            private void D() {
                if ((this.f126941e & 256) != 256) {
                    this.f126950n = new ArrayList(this.f126950n);
                    this.f126941e |= 256;
                }
            }

            private void R() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static b z() {
                return new b();
            }

            public Annotation E(int i10) {
                return this.f126949m.get(i10);
            }

            public int F() {
                return this.f126949m.size();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b, kotlin.reflect.jvm.internal.impl.protobuf.o
            /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
            public TypeAlias r() {
                return TypeAlias.S();
            }

            public Type H() {
                return this.f126947k;
            }

            public TypeParameter J(int i10) {
                return this.f126944h.get(i10);
            }

            public int K() {
                return this.f126944h.size();
            }

            public Type M() {
                return this.f126945i;
            }

            public boolean O() {
                return (this.f126941e & 32) == 32;
            }

            public boolean P() {
                return (this.f126941e & 2) == 2;
            }

            public boolean Q() {
                return (this.f126941e & 8) == 8;
            }

            public b S(Type type) {
                if ((this.f126941e & 32) != 32 || this.f126947k == Type.Y()) {
                    this.f126947k = type;
                } else {
                    this.f126947k = Type.z0(this.f126947k).h(type).x();
                }
                this.f126941e |= 32;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b
            /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
            public b h(TypeAlias typeAlias) {
                if (typeAlias == TypeAlias.S()) {
                    return this;
                }
                if (typeAlias.g0()) {
                    Y(typeAlias.W());
                }
                if (typeAlias.h0()) {
                    Z(typeAlias.X());
                }
                if (!typeAlias.f126932h.isEmpty()) {
                    if (this.f126944h.isEmpty()) {
                        this.f126944h = typeAlias.f126932h;
                        this.f126941e &= -5;
                    } else {
                        C();
                        this.f126944h.addAll(typeAlias.f126932h);
                    }
                }
                if (typeAlias.i0()) {
                    V(typeAlias.b0());
                }
                if (typeAlias.j0()) {
                    b0(typeAlias.c0());
                }
                if (typeAlias.e0()) {
                    S(typeAlias.U());
                }
                if (typeAlias.f0()) {
                    X(typeAlias.V());
                }
                if (!typeAlias.f126937m.isEmpty()) {
                    if (this.f126949m.isEmpty()) {
                        this.f126949m = typeAlias.f126937m;
                        this.f126941e &= -129;
                    } else {
                        B();
                        this.f126949m.addAll(typeAlias.f126937m);
                    }
                }
                if (!typeAlias.f126938n.isEmpty()) {
                    if (this.f126950n.isEmpty()) {
                        this.f126950n = typeAlias.f126938n;
                        this.f126941e &= -257;
                    } else {
                        D();
                        this.f126950n.addAll(typeAlias.f126938n);
                    }
                }
                p(typeAlias);
                i(g().b(typeAlias.f126928d));
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC1169a
            /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
            public b c(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws Throwable {
                TypeAlias typeAlias = null;
                try {
                    try {
                        TypeAlias typeAliasD = TypeAlias.f126927r.d(eVar, fVar);
                        if (typeAliasD != null) {
                            h(typeAliasD);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e10) {
                        TypeAlias typeAlias2 = (TypeAlias) e10.a();
                        try {
                            throw e10;
                        } catch (Throwable th2) {
                            th = th2;
                            typeAlias = typeAlias2;
                            if (typeAlias != null) {
                                h(typeAlias);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (typeAlias != null) {
                        h(typeAlias);
                    }
                    throw th;
                }
            }

            public b V(Type type) {
                if ((this.f126941e & 8) != 8 || this.f126945i == Type.Y()) {
                    this.f126945i = type;
                } else {
                    this.f126945i = Type.z0(this.f126945i).h(type).x();
                }
                this.f126941e |= 8;
                return this;
            }

            public b X(int i10) {
                this.f126941e |= 64;
                this.f126948l = i10;
                return this;
            }

            public b Y(int i10) {
                this.f126941e |= 1;
                this.f126942f = i10;
                return this;
            }

            public b Z(int i10) {
                this.f126941e |= 2;
                this.f126943g = i10;
                return this;
            }

            public b b0(int i10) {
                this.f126941e |= 16;
                this.f126946j = i10;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
            public final boolean l() {
                if (!P()) {
                    return false;
                }
                for (int i10 = 0; i10 < K(); i10++) {
                    if (!J(i10).l()) {
                        return false;
                    }
                }
                if (Q() && !M().l()) {
                    return false;
                }
                if (O() && !H().l()) {
                    return false;
                }
                for (int i11 = 0; i11 < F(); i11++) {
                    if (!E(i11).l()) {
                        return false;
                    }
                }
                return o();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.n.a
            /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
            public TypeAlias build() {
                TypeAlias typeAliasX = x();
                if (typeAliasX.l()) {
                    return typeAliasX;
                }
                throw kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC1169a.d(typeAliasX);
            }

            public TypeAlias x() {
                TypeAlias typeAlias = new TypeAlias(this);
                int i10 = this.f126941e;
                int i11 = (i10 & 1) != 1 ? 0 : 1;
                typeAlias.f126930f = this.f126942f;
                if ((i10 & 2) == 2) {
                    i11 |= 2;
                }
                typeAlias.f126931g = this.f126943g;
                if ((this.f126941e & 4) == 4) {
                    this.f126944h = Collections.unmodifiableList(this.f126944h);
                    this.f126941e &= -5;
                }
                typeAlias.f126932h = this.f126944h;
                if ((i10 & 8) == 8) {
                    i11 |= 4;
                }
                typeAlias.f126933i = this.f126945i;
                if ((i10 & 16) == 16) {
                    i11 |= 8;
                }
                typeAlias.f126934j = this.f126946j;
                if ((i10 & 32) == 32) {
                    i11 |= 16;
                }
                typeAlias.f126935k = this.f126947k;
                if ((i10 & 64) == 64) {
                    i11 |= 32;
                }
                typeAlias.f126936l = this.f126948l;
                if ((this.f126941e & 128) == 128) {
                    this.f126949m = Collections.unmodifiableList(this.f126949m);
                    this.f126941e &= -129;
                }
                typeAlias.f126937m = this.f126949m;
                if ((this.f126941e & 256) == 256) {
                    this.f126950n = Collections.unmodifiableList(this.f126950n);
                    this.f126941e &= -257;
                }
                typeAlias.f126938n = this.f126950n;
                typeAlias.f126929e = i11;
                return typeAlias;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.c
            /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
            public b m() {
                return z().h(x());
            }
        }

        static {
            TypeAlias typeAlias = new TypeAlias(true);
            f126926q = typeAlias;
            typeAlias.k0();
        }

        private TypeAlias(GeneratedMessageLite.c<TypeAlias, ?> cVar) {
            super(cVar);
            this.f126939o = (byte) -1;
            this.f126940p = -1;
            this.f126928d = cVar.g();
        }

        private TypeAlias(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws InvalidProtocolBufferException {
            Type.b bVarT;
            this.f126939o = (byte) -1;
            this.f126940p = -1;
            k0();
            kotlin.reflect.jvm.internal.impl.protobuf.d.b bVarU = kotlin.reflect.jvm.internal.impl.protobuf.d.u();
            CodedOutputStream codedOutputStreamJ = CodedOutputStream.J(bVarU, 1);
            boolean z10 = false;
            int i10 = 0;
            while (!z10) {
                try {
                    try {
                        try {
                            int iK = eVar.K();
                            switch (iK) {
                                case 0:
                                    break;
                                case 8:
                                    this.f126929e |= 1;
                                    this.f126930f = eVar.s();
                                    continue;
                                case 16:
                                    this.f126929e |= 2;
                                    this.f126931g = eVar.s();
                                    continue;
                                case 26:
                                    if ((i10 & 4) != 4) {
                                        this.f126932h = new ArrayList();
                                        i10 |= 4;
                                    }
                                    this.f126932h.add((TypeParameter) eVar.u(TypeParameter.f126952p, fVar));
                                    continue;
                                case 34:
                                    bVarT = (this.f126929e & 4) == 4 ? this.f126933i.t() : null;
                                    Type type = (Type) eVar.u(Type.f126879w, fVar);
                                    this.f126933i = type;
                                    if (bVarT != null) {
                                        bVarT.h(type);
                                        this.f126933i = bVarT.x();
                                    }
                                    this.f126929e |= 4;
                                    continue;
                                case 40:
                                    this.f126929e |= 8;
                                    this.f126934j = eVar.s();
                                    continue;
                                case 50:
                                    bVarT = (this.f126929e & 16) == 16 ? this.f126935k.t() : null;
                                    Type type2 = (Type) eVar.u(Type.f126879w, fVar);
                                    this.f126935k = type2;
                                    if (bVarT != null) {
                                        bVarT.h(type2);
                                        this.f126935k = bVarT.x();
                                    }
                                    this.f126929e |= 16;
                                    continue;
                                case 56:
                                    this.f126929e |= 32;
                                    this.f126936l = eVar.s();
                                    continue;
                                case 66:
                                    if ((i10 & 128) != 128) {
                                        this.f126937m = new ArrayList();
                                        i10 |= 128;
                                    }
                                    this.f126937m.add((Annotation) eVar.u(Annotation.f126584j, fVar));
                                    continue;
                                case bb.c.b.O1 /* 248 */:
                                    if ((i10 & 256) != 256) {
                                        this.f126938n = new ArrayList();
                                        i10 |= 256;
                                    }
                                    this.f126938n.add(Integer.valueOf(eVar.s()));
                                    continue;
                                case 250:
                                    int iJ = eVar.j(eVar.A());
                                    if ((i10 & 256) != 256 && eVar.e() > 0) {
                                        this.f126938n = new ArrayList();
                                        i10 |= 256;
                                    }
                                    while (eVar.e() > 0) {
                                        this.f126938n.add(Integer.valueOf(eVar.s()));
                                    }
                                    eVar.i(iJ);
                                    continue;
                                default:
                                    if (!j(eVar, codedOutputStreamJ, fVar, iK)) {
                                        break;
                                    }
                                    break;
                            }
                            z10 = true;
                        } catch (IOException e10) {
                            throw new InvalidProtocolBufferException(e10.getMessage()).i(this);
                        }
                    } catch (InvalidProtocolBufferException e11) {
                        throw e11.i(this);
                    }
                } catch (Throwable th2) {
                    if ((i10 & 4) == 4) {
                        this.f126932h = Collections.unmodifiableList(this.f126932h);
                    }
                    if ((i10 & 128) == 128) {
                        this.f126937m = Collections.unmodifiableList(this.f126937m);
                    }
                    if ((i10 & 256) == 256) {
                        this.f126938n = Collections.unmodifiableList(this.f126938n);
                    }
                    try {
                        codedOutputStreamJ.I();
                    } catch (IOException unused) {
                    } finally {
                        this.f126928d = bVarU.e();
                    }
                    g();
                    throw th2;
                }
            }
            if ((i10 & 4) == 4) {
                this.f126932h = Collections.unmodifiableList(this.f126932h);
            }
            if ((i10 & 128) == 128) {
                this.f126937m = Collections.unmodifiableList(this.f126937m);
            }
            if ((i10 & 256) == 256) {
                this.f126938n = Collections.unmodifiableList(this.f126938n);
            }
            try {
                codedOutputStreamJ.I();
            } catch (IOException unused2) {
            } finally {
                this.f126928d = bVarU.e();
            }
            g();
        }

        private TypeAlias(boolean z10) {
            this.f126939o = (byte) -1;
            this.f126940p = -1;
            this.f126928d = kotlin.reflect.jvm.internal.impl.protobuf.d.f127320b;
        }

        public static TypeAlias S() {
            return f126926q;
        }

        private void k0() {
            this.f126930f = 6;
            this.f126931g = 0;
            this.f126932h = Collections.emptyList();
            this.f126933i = Type.Y();
            this.f126934j = 0;
            this.f126935k = Type.Y();
            this.f126936l = 0;
            this.f126937m = Collections.emptyList();
            this.f126938n = Collections.emptyList();
        }

        public static b l0() {
            return b.z();
        }

        public static b m0(TypeAlias typeAlias) {
            return l0().h(typeAlias);
        }

        public static TypeAlias o0(InputStream inputStream, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws IOException {
            return f126927r.a(inputStream, fVar);
        }

        public Annotation P(int i10) {
            return this.f126937m.get(i10);
        }

        public int Q() {
            return this.f126937m.size();
        }

        public List<Annotation> R() {
            return this.f126937m;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
        public TypeAlias r() {
            return f126926q;
        }

        public Type U() {
            return this.f126935k;
        }

        public int V() {
            return this.f126936l;
        }

        public int W() {
            return this.f126930f;
        }

        public int X() {
            return this.f126931g;
        }

        public TypeParameter Y(int i10) {
            return this.f126932h.get(i10);
        }

        public int Z() {
            return this.f126932h.size();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        public void a(CodedOutputStream codedOutputStream) throws IOException {
            u();
            GeneratedMessageLite.ExtendableMessage<MessageType>.a aVarY = y();
            if ((this.f126929e & 1) == 1) {
                codedOutputStream.a0(1, this.f126930f);
            }
            if ((this.f126929e & 2) == 2) {
                codedOutputStream.a0(2, this.f126931g);
            }
            for (int i10 = 0; i10 < this.f126932h.size(); i10++) {
                codedOutputStream.d0(3, this.f126932h.get(i10));
            }
            if ((this.f126929e & 4) == 4) {
                codedOutputStream.d0(4, this.f126933i);
            }
            if ((this.f126929e & 8) == 8) {
                codedOutputStream.a0(5, this.f126934j);
            }
            if ((this.f126929e & 16) == 16) {
                codedOutputStream.d0(6, this.f126935k);
            }
            if ((this.f126929e & 32) == 32) {
                codedOutputStream.a0(7, this.f126936l);
            }
            for (int i11 = 0; i11 < this.f126937m.size(); i11++) {
                codedOutputStream.d0(8, this.f126937m.get(i11));
            }
            for (int i12 = 0; i12 < this.f126938n.size(); i12++) {
                codedOutputStream.a0(31, this.f126938n.get(i12).intValue());
            }
            aVarY.a(200, codedOutputStream);
            codedOutputStream.i0(this.f126928d);
        }

        public List<TypeParameter> a0() {
            return this.f126932h;
        }

        public Type b0() {
            return this.f126933i;
        }

        public int c0() {
            return this.f126934j;
        }

        public List<Integer> d0() {
            return this.f126938n;
        }

        public boolean e0() {
            return (this.f126929e & 16) == 16;
        }

        public boolean f0() {
            return (this.f126929e & 32) == 32;
        }

        public boolean g0() {
            return (this.f126929e & 1) == 1;
        }

        public boolean h0() {
            return (this.f126929e & 2) == 2;
        }

        public boolean i0() {
            return (this.f126929e & 4) == 4;
        }

        public boolean j0() {
            return (this.f126929e & 8) == 8;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public final boolean l() {
            byte b10 = this.f126939o;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            if (!h0()) {
                this.f126939o = (byte) 0;
                return false;
            }
            for (int i10 = 0; i10 < Z(); i10++) {
                if (!Y(i10).l()) {
                    this.f126939o = (byte) 0;
                    return false;
                }
            }
            if (i0() && !b0().l()) {
                this.f126939o = (byte) 0;
                return false;
            }
            if (e0() && !U().l()) {
                this.f126939o = (byte) 0;
                return false;
            }
            for (int i11 = 0; i11 < Q(); i11++) {
                if (!P(i11).l()) {
                    this.f126939o = (byte) 0;
                    return false;
                }
            }
            if (n()) {
                this.f126939o = (byte) 1;
                return true;
            }
            this.f126939o = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        /* JADX INFO: renamed from: n0, reason: merged with bridge method [inline-methods] */
        public b v() {
            return l0();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        /* JADX INFO: renamed from: p0, reason: merged with bridge method [inline-methods] */
        public b t() {
            return m0(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        public int u() {
            int i10 = this.f126940p;
            if (i10 != -1) {
                return i10;
            }
            int iO = (this.f126929e & 1) == 1 ? CodedOutputStream.o(1, this.f126930f) + 0 : 0;
            if ((this.f126929e & 2) == 2) {
                iO += CodedOutputStream.o(2, this.f126931g);
            }
            for (int i11 = 0; i11 < this.f126932h.size(); i11++) {
                iO += CodedOutputStream.s(3, this.f126932h.get(i11));
            }
            if ((this.f126929e & 4) == 4) {
                iO += CodedOutputStream.s(4, this.f126933i);
            }
            if ((this.f126929e & 8) == 8) {
                iO += CodedOutputStream.o(5, this.f126934j);
            }
            if ((this.f126929e & 16) == 16) {
                iO += CodedOutputStream.s(6, this.f126935k);
            }
            if ((this.f126929e & 32) == 32) {
                iO += CodedOutputStream.o(7, this.f126936l);
            }
            for (int i12 = 0; i12 < this.f126937m.size(); i12++) {
                iO += CodedOutputStream.s(8, this.f126937m.get(i12));
            }
            int iP = 0;
            for (int i13 = 0; i13 < this.f126938n.size(); i13++) {
                iP += CodedOutputStream.p(this.f126938n.get(i13).intValue());
            }
            int size = iO + iP + (d0().size() * 2) + o() + this.f126928d.size();
            this.f126940p = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.n
        public kotlin.reflect.jvm.internal.impl.protobuf.p<TypeAlias> w() {
            return f126927r;
        }
    }

    public static final class TypeParameter extends GeneratedMessageLite.ExtendableMessage<TypeParameter> implements t {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static final TypeParameter f126951o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static kotlin.reflect.jvm.internal.impl.protobuf.p<TypeParameter> f126952p = new a();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final kotlin.reflect.jvm.internal.impl.protobuf.d f126953d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f126954e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f126955f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f126956g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f126957h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private Variance f126958i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private List<Type> f126959j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private List<Integer> f126960k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f126961l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private byte f126962m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private int f126963n;

        public enum Variance implements kotlin.reflect.jvm.internal.impl.protobuf.h.a {
            IN(0, 0),
            OUT(1, 1),
            INV(2, 2);

            private static kotlin.reflect.jvm.internal.impl.protobuf.h.b<Variance> internalValueMap = new a();
            private final int value;

            public static final class a implements kotlin.reflect.jvm.internal.impl.protobuf.h.b<Variance> {
                a() {
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public Variance a(int i10) {
                    return Variance.valueOf(i10);
                }
            }

            Variance(int i10, int i11) {
                this.value = i11;
            }

            public static Variance valueOf(int i10) {
                if (i10 == 0) {
                    return IN;
                }
                if (i10 == 1) {
                    return OUT;
                }
                if (i10 != 2) {
                    return null;
                }
                return INV;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.a
            public final int getNumber() {
                return this.value;
            }
        }

        public static final class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<TypeParameter> {
            a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public TypeParameter d(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws InvalidProtocolBufferException {
                return new TypeParameter(eVar, fVar);
            }
        }

        public static final class b extends GeneratedMessageLite.c<TypeParameter, b> implements t {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private int f126964e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private int f126965f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private int f126966g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private boolean f126967h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private Variance f126968i = Variance.INV;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            private List<Type> f126969j = Collections.emptyList();

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            private List<Integer> f126970k = Collections.emptyList();

            private b() {
                J();
            }

            private void B() {
                if ((this.f126964e & 32) != 32) {
                    this.f126970k = new ArrayList(this.f126970k);
                    this.f126964e |= 32;
                }
            }

            private void C() {
                if ((this.f126964e & 16) != 16) {
                    this.f126969j = new ArrayList(this.f126969j);
                    this.f126964e |= 16;
                }
            }

            private void J() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static b z() {
                return new b();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b, kotlin.reflect.jvm.internal.impl.protobuf.o
            /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
            public TypeParameter r() {
                return TypeParameter.L();
            }

            public Type E(int i10) {
                return this.f126969j.get(i10);
            }

            public int F() {
                return this.f126969j.size();
            }

            public boolean G() {
                return (this.f126964e & 1) == 1;
            }

            public boolean H() {
                return (this.f126964e & 2) == 2;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b
            /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
            public b h(TypeParameter typeParameter) {
                if (typeParameter == TypeParameter.L()) {
                    return this;
                }
                if (typeParameter.V()) {
                    O(typeParameter.N());
                }
                if (typeParameter.W()) {
                    P(typeParameter.O());
                }
                if (typeParameter.X()) {
                    Q(typeParameter.P());
                }
                if (typeParameter.Y()) {
                    R(typeParameter.U());
                }
                if (!typeParameter.f126959j.isEmpty()) {
                    if (this.f126969j.isEmpty()) {
                        this.f126969j = typeParameter.f126959j;
                        this.f126964e &= -17;
                    } else {
                        C();
                        this.f126969j.addAll(typeParameter.f126959j);
                    }
                }
                if (!typeParameter.f126960k.isEmpty()) {
                    if (this.f126970k.isEmpty()) {
                        this.f126970k = typeParameter.f126960k;
                        this.f126964e &= -33;
                    } else {
                        B();
                        this.f126970k.addAll(typeParameter.f126960k);
                    }
                }
                p(typeParameter);
                i(g().b(typeParameter.f126953d));
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC1169a
            /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
            public b c(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws Throwable {
                TypeParameter typeParameter = null;
                try {
                    try {
                        TypeParameter typeParameterD = TypeParameter.f126952p.d(eVar, fVar);
                        if (typeParameterD != null) {
                            h(typeParameterD);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e10) {
                        TypeParameter typeParameter2 = (TypeParameter) e10.a();
                        try {
                            throw e10;
                        } catch (Throwable th2) {
                            th = th2;
                            typeParameter = typeParameter2;
                            if (typeParameter != null) {
                                h(typeParameter);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (typeParameter != null) {
                        h(typeParameter);
                    }
                    throw th;
                }
            }

            public b O(int i10) {
                this.f126964e |= 1;
                this.f126965f = i10;
                return this;
            }

            public b P(int i10) {
                this.f126964e |= 2;
                this.f126966g = i10;
                return this;
            }

            public b Q(boolean z10) {
                this.f126964e |= 4;
                this.f126967h = z10;
                return this;
            }

            public b R(Variance variance) {
                variance.getClass();
                this.f126964e |= 8;
                this.f126968i = variance;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
            public final boolean l() {
                if (!G() || !H()) {
                    return false;
                }
                for (int i10 = 0; i10 < F(); i10++) {
                    if (!E(i10).l()) {
                        return false;
                    }
                }
                return o();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.n.a
            /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
            public TypeParameter build() {
                TypeParameter typeParameterX = x();
                if (typeParameterX.l()) {
                    return typeParameterX;
                }
                throw kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC1169a.d(typeParameterX);
            }

            public TypeParameter x() {
                TypeParameter typeParameter = new TypeParameter(this);
                int i10 = this.f126964e;
                int i11 = (i10 & 1) != 1 ? 0 : 1;
                typeParameter.f126955f = this.f126965f;
                if ((i10 & 2) == 2) {
                    i11 |= 2;
                }
                typeParameter.f126956g = this.f126966g;
                if ((i10 & 4) == 4) {
                    i11 |= 4;
                }
                typeParameter.f126957h = this.f126967h;
                if ((i10 & 8) == 8) {
                    i11 |= 8;
                }
                typeParameter.f126958i = this.f126968i;
                if ((this.f126964e & 16) == 16) {
                    this.f126969j = Collections.unmodifiableList(this.f126969j);
                    this.f126964e &= -17;
                }
                typeParameter.f126959j = this.f126969j;
                if ((this.f126964e & 32) == 32) {
                    this.f126970k = Collections.unmodifiableList(this.f126970k);
                    this.f126964e &= -33;
                }
                typeParameter.f126960k = this.f126970k;
                typeParameter.f126954e = i11;
                return typeParameter;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.c
            /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
            public b m() {
                return z().h(x());
            }
        }

        static {
            TypeParameter typeParameter = new TypeParameter(true);
            f126951o = typeParameter;
            typeParameter.Z();
        }

        private TypeParameter(GeneratedMessageLite.c<TypeParameter, ?> cVar) {
            super(cVar);
            this.f126961l = -1;
            this.f126962m = (byte) -1;
            this.f126963n = -1;
            this.f126953d = cVar.g();
        }

        private TypeParameter(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws InvalidProtocolBufferException {
            this.f126961l = -1;
            this.f126962m = (byte) -1;
            this.f126963n = -1;
            Z();
            kotlin.reflect.jvm.internal.impl.protobuf.d.b bVarU = kotlin.reflect.jvm.internal.impl.protobuf.d.u();
            CodedOutputStream codedOutputStreamJ = CodedOutputStream.J(bVarU, 1);
            boolean z10 = false;
            int i10 = 0;
            while (!z10) {
                try {
                    try {
                        try {
                            int iK = eVar.K();
                            if (iK != 0) {
                                if (iK == 8) {
                                    this.f126954e |= 1;
                                    this.f126955f = eVar.s();
                                } else if (iK == 16) {
                                    this.f126954e |= 2;
                                    this.f126956g = eVar.s();
                                } else if (iK == 24) {
                                    this.f126954e |= 4;
                                    this.f126957h = eVar.k();
                                } else if (iK == 32) {
                                    int iN = eVar.n();
                                    Variance varianceValueOf = Variance.valueOf(iN);
                                    if (varianceValueOf == null) {
                                        codedOutputStreamJ.o0(iK);
                                        codedOutputStreamJ.o0(iN);
                                    } else {
                                        this.f126954e |= 8;
                                        this.f126958i = varianceValueOf;
                                    }
                                } else if (iK == 42) {
                                    if ((i10 & 16) != 16) {
                                        this.f126959j = new ArrayList();
                                        i10 |= 16;
                                    }
                                    this.f126959j.add((Type) eVar.u(Type.f126879w, fVar));
                                } else if (iK == 48) {
                                    if ((i10 & 32) != 32) {
                                        this.f126960k = new ArrayList();
                                        i10 |= 32;
                                    }
                                    this.f126960k.add(Integer.valueOf(eVar.s()));
                                } else if (iK == 50) {
                                    int iJ = eVar.j(eVar.A());
                                    if ((i10 & 32) != 32 && eVar.e() > 0) {
                                        this.f126960k = new ArrayList();
                                        i10 |= 32;
                                    }
                                    while (eVar.e() > 0) {
                                        this.f126960k.add(Integer.valueOf(eVar.s()));
                                    }
                                    eVar.i(iJ);
                                } else if (!j(eVar, codedOutputStreamJ, fVar, iK)) {
                                }
                            }
                            z10 = true;
                        } catch (IOException e10) {
                            throw new InvalidProtocolBufferException(e10.getMessage()).i(this);
                        }
                    } catch (InvalidProtocolBufferException e11) {
                        throw e11.i(this);
                    }
                } catch (Throwable th2) {
                    if ((i10 & 16) == 16) {
                        this.f126959j = Collections.unmodifiableList(this.f126959j);
                    }
                    if ((i10 & 32) == 32) {
                        this.f126960k = Collections.unmodifiableList(this.f126960k);
                    }
                    try {
                        codedOutputStreamJ.I();
                    } catch (IOException unused) {
                    } finally {
                        this.f126953d = bVarU.e();
                    }
                    g();
                    throw th2;
                }
            }
            if ((i10 & 16) == 16) {
                this.f126959j = Collections.unmodifiableList(this.f126959j);
            }
            if ((i10 & 32) == 32) {
                this.f126960k = Collections.unmodifiableList(this.f126960k);
            }
            try {
                codedOutputStreamJ.I();
            } catch (IOException unused2) {
            } finally {
                this.f126953d = bVarU.e();
            }
            g();
        }

        private TypeParameter(boolean z10) {
            this.f126961l = -1;
            this.f126962m = (byte) -1;
            this.f126963n = -1;
            this.f126953d = kotlin.reflect.jvm.internal.impl.protobuf.d.f127320b;
        }

        public static TypeParameter L() {
            return f126951o;
        }

        private void Z() {
            this.f126955f = 0;
            this.f126956g = 0;
            this.f126957h = false;
            this.f126958i = Variance.INV;
            this.f126959j = Collections.emptyList();
            this.f126960k = Collections.emptyList();
        }

        public static b a0() {
            return b.z();
        }

        public static b b0(TypeParameter typeParameter) {
            return a0().h(typeParameter);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public TypeParameter r() {
            return f126951o;
        }

        public int N() {
            return this.f126955f;
        }

        public int O() {
            return this.f126956g;
        }

        public boolean P() {
            return this.f126957h;
        }

        public Type Q(int i10) {
            return this.f126959j.get(i10);
        }

        public int R() {
            return this.f126959j.size();
        }

        public List<Integer> S() {
            return this.f126960k;
        }

        public List<Type> T() {
            return this.f126959j;
        }

        public Variance U() {
            return this.f126958i;
        }

        public boolean V() {
            return (this.f126954e & 1) == 1;
        }

        public boolean W() {
            return (this.f126954e & 2) == 2;
        }

        public boolean X() {
            return (this.f126954e & 4) == 4;
        }

        public boolean Y() {
            return (this.f126954e & 8) == 8;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        public void a(CodedOutputStream codedOutputStream) throws IOException {
            u();
            GeneratedMessageLite.ExtendableMessage<MessageType>.a aVarY = y();
            if ((this.f126954e & 1) == 1) {
                codedOutputStream.a0(1, this.f126955f);
            }
            if ((this.f126954e & 2) == 2) {
                codedOutputStream.a0(2, this.f126956g);
            }
            if ((this.f126954e & 4) == 4) {
                codedOutputStream.L(3, this.f126957h);
            }
            if ((this.f126954e & 8) == 8) {
                codedOutputStream.S(4, this.f126958i.getNumber());
            }
            for (int i10 = 0; i10 < this.f126959j.size(); i10++) {
                codedOutputStream.d0(5, this.f126959j.get(i10));
            }
            if (S().size() > 0) {
                codedOutputStream.o0(50);
                codedOutputStream.o0(this.f126961l);
            }
            for (int i11 = 0; i11 < this.f126960k.size(); i11++) {
                codedOutputStream.b0(this.f126960k.get(i11).intValue());
            }
            aVarY.a(1000, codedOutputStream);
            codedOutputStream.i0(this.f126953d);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        /* JADX INFO: renamed from: c0, reason: merged with bridge method [inline-methods] */
        public b v() {
            return a0();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        /* JADX INFO: renamed from: d0, reason: merged with bridge method [inline-methods] */
        public b t() {
            return b0(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public final boolean l() {
            byte b10 = this.f126962m;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            if (!V()) {
                this.f126962m = (byte) 0;
                return false;
            }
            if (!W()) {
                this.f126962m = (byte) 0;
                return false;
            }
            for (int i10 = 0; i10 < R(); i10++) {
                if (!Q(i10).l()) {
                    this.f126962m = (byte) 0;
                    return false;
                }
            }
            if (n()) {
                this.f126962m = (byte) 1;
                return true;
            }
            this.f126962m = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        public int u() {
            int i10 = this.f126963n;
            if (i10 != -1) {
                return i10;
            }
            int iO = (this.f126954e & 1) == 1 ? CodedOutputStream.o(1, this.f126955f) + 0 : 0;
            if ((this.f126954e & 2) == 2) {
                iO += CodedOutputStream.o(2, this.f126956g);
            }
            if ((this.f126954e & 4) == 4) {
                iO += CodedOutputStream.a(3, this.f126957h);
            }
            if ((this.f126954e & 8) == 8) {
                iO += CodedOutputStream.h(4, this.f126958i.getNumber());
            }
            for (int i11 = 0; i11 < this.f126959j.size(); i11++) {
                iO += CodedOutputStream.s(5, this.f126959j.get(i11));
            }
            int iP = 0;
            for (int i12 = 0; i12 < this.f126960k.size(); i12++) {
                iP += CodedOutputStream.p(this.f126960k.get(i12).intValue());
            }
            int iP2 = iO + iP;
            if (!S().isEmpty()) {
                iP2 = iP2 + 1 + CodedOutputStream.p(iP);
            }
            this.f126961l = iP;
            int iO2 = iP2 + o() + this.f126953d.size();
            this.f126963n = iO2;
            return iO2;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.n
        public kotlin.reflect.jvm.internal.impl.protobuf.p<TypeParameter> w() {
            return f126952p;
        }
    }

    public static final class TypeTable extends GeneratedMessageLite implements u {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final TypeTable f126971i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static kotlin.reflect.jvm.internal.impl.protobuf.p<TypeTable> f126972j = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final kotlin.reflect.jvm.internal.impl.protobuf.d f126973c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f126974d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private List<Type> f126975e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f126976f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private byte f126977g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f126978h;

        public static final class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<TypeTable> {
            a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public TypeTable d(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws InvalidProtocolBufferException {
                return new TypeTable(eVar, fVar);
            }
        }

        public static final class b extends GeneratedMessageLite.b<TypeTable, b> implements u {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private int f126979c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private List<Type> f126980d = Collections.emptyList();

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private int f126981e = -1;

            private b() {
                y();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static b o() {
                return new b();
            }

            private void p() {
                if ((this.f126979c & 1) != 1) {
                    this.f126980d = new ArrayList(this.f126980d);
                    this.f126979c |= 1;
                }
            }

            private void y() {
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC1169a
            /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
            public b c(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws Throwable {
                TypeTable typeTable = null;
                try {
                    try {
                        TypeTable typeTableD = TypeTable.f126972j.d(eVar, fVar);
                        if (typeTableD != null) {
                            h(typeTableD);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e10) {
                        TypeTable typeTable2 = (TypeTable) e10.a();
                        try {
                            throw e10;
                        } catch (Throwable th2) {
                            th = th2;
                            typeTable = typeTable2;
                            if (typeTable != null) {
                                h(typeTable);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (typeTable != null) {
                        h(typeTable);
                    }
                    throw th;
                }
            }

            public b C(int i10) {
                this.f126979c |= 2;
                this.f126981e = i10;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.n.a
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public TypeTable build() {
                TypeTable typeTableM = m();
                if (typeTableM.l()) {
                    return typeTableM;
                }
                throw kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC1169a.d(typeTableM);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
            public final boolean l() {
                for (int i10 = 0; i10 < x(); i10++) {
                    if (!s(i10).l()) {
                        return false;
                    }
                }
                return true;
            }

            public TypeTable m() {
                TypeTable typeTable = new TypeTable(this);
                int i10 = this.f126979c;
                if ((i10 & 1) == 1) {
                    this.f126980d = Collections.unmodifiableList(this.f126980d);
                    this.f126979c &= -2;
                }
                typeTable.f126975e = this.f126980d;
                int i11 = (i10 & 2) != 2 ? 0 : 1;
                typeTable.f126976f = this.f126981e;
                typeTable.f126974d = i11;
                return typeTable;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public b m() {
                return o().h(m());
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b, kotlin.reflect.jvm.internal.impl.protobuf.o
            /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
            public TypeTable r() {
                return TypeTable.s();
            }

            public Type s(int i10) {
                return this.f126980d.get(i10);
            }

            public int x() {
                return this.f126980d.size();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b
            /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
            public b h(TypeTable typeTable) {
                if (typeTable == TypeTable.s()) {
                    return this;
                }
                if (!typeTable.f126975e.isEmpty()) {
                    if (this.f126980d.isEmpty()) {
                        this.f126980d = typeTable.f126975e;
                        this.f126979c &= -2;
                    } else {
                        p();
                        this.f126980d.addAll(typeTable.f126975e);
                    }
                }
                if (typeTable.C()) {
                    C(typeTable.y());
                }
                i(g().b(typeTable.f126973c));
                return this;
            }
        }

        static {
            TypeTable typeTable = new TypeTable(true);
            f126971i = typeTable;
            typeTable.D();
        }

        private TypeTable(GeneratedMessageLite.b bVar) {
            super(bVar);
            this.f126977g = (byte) -1;
            this.f126978h = -1;
            this.f126973c = bVar.g();
        }

        private TypeTable(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws InvalidProtocolBufferException {
            this.f126977g = (byte) -1;
            this.f126978h = -1;
            D();
            kotlin.reflect.jvm.internal.impl.protobuf.d.b bVarU = kotlin.reflect.jvm.internal.impl.protobuf.d.u();
            CodedOutputStream codedOutputStreamJ = CodedOutputStream.J(bVarU, 1);
            boolean z10 = false;
            boolean z11 = false;
            while (!z10) {
                try {
                    try {
                        int iK = eVar.K();
                        if (iK != 0) {
                            if (iK == 10) {
                                if (!(z11 & true)) {
                                    this.f126975e = new ArrayList();
                                    z11 |= true;
                                }
                                this.f126975e.add((Type) eVar.u(Type.f126879w, fVar));
                            } else if (iK == 16) {
                                this.f126974d |= 1;
                                this.f126976f = eVar.s();
                            } else if (!j(eVar, codedOutputStreamJ, fVar, iK)) {
                            }
                        }
                        z10 = true;
                    } catch (Throwable th2) {
                        if (z11 & true) {
                            this.f126975e = Collections.unmodifiableList(this.f126975e);
                        }
                        try {
                            codedOutputStreamJ.I();
                        } catch (IOException unused) {
                        } finally {
                            this.f126973c = bVarU.e();
                        }
                        g();
                        throw th2;
                    }
                } catch (InvalidProtocolBufferException e10) {
                    throw e10.i(this);
                } catch (IOException e11) {
                    throw new InvalidProtocolBufferException(e11.getMessage()).i(this);
                }
            }
            if (z11 & true) {
                this.f126975e = Collections.unmodifiableList(this.f126975e);
            }
            try {
                codedOutputStreamJ.I();
            } catch (IOException unused2) {
            } finally {
                this.f126973c = bVarU.e();
            }
            g();
        }

        private TypeTable(boolean z10) {
            this.f126977g = (byte) -1;
            this.f126978h = -1;
            this.f126973c = kotlin.reflect.jvm.internal.impl.protobuf.d.f127320b;
        }

        private void D() {
            this.f126975e = Collections.emptyList();
            this.f126976f = -1;
        }

        public static b E() {
            return b.o();
        }

        public static b F(TypeTable typeTable) {
            return E().h(typeTable);
        }

        public static TypeTable s() {
            return f126971i;
        }

        public int A() {
            return this.f126975e.size();
        }

        public List<Type> B() {
            return this.f126975e;
        }

        public boolean C() {
            return (this.f126974d & 1) == 1;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
        public b v() {
            return E();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public b t() {
            return F(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        public void a(CodedOutputStream codedOutputStream) throws IOException {
            u();
            for (int i10 = 0; i10 < this.f126975e.size(); i10++) {
                codedOutputStream.d0(1, this.f126975e.get(i10));
            }
            if ((this.f126974d & 1) == 1) {
                codedOutputStream.a0(2, this.f126976f);
            }
            codedOutputStream.i0(this.f126973c);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public final boolean l() {
            byte b10 = this.f126977g;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            for (int i10 = 0; i10 < A(); i10++) {
                if (!z(i10).l()) {
                    this.f126977g = (byte) 0;
                    return false;
                }
            }
            this.f126977g = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        public int u() {
            int i10 = this.f126978h;
            if (i10 != -1) {
                return i10;
            }
            int iO = 0;
            for (int i11 = 0; i11 < this.f126975e.size(); i11++) {
                iO += CodedOutputStream.s(1, this.f126975e.get(i11));
            }
            if ((this.f126974d & 1) == 1) {
                iO += CodedOutputStream.o(2, this.f126976f);
            }
            int size = iO + this.f126973c.size();
            this.f126978h = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.n
        public kotlin.reflect.jvm.internal.impl.protobuf.p<TypeTable> w() {
            return f126972j;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
        public TypeTable r() {
            return f126971i;
        }

        public int y() {
            return this.f126976f;
        }

        public Type z(int i10) {
            return this.f126975e.get(i10);
        }
    }

    public static final class ValueParameter extends GeneratedMessageLite.ExtendableMessage<ValueParameter> implements v {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final ValueParameter f126982n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static kotlin.reflect.jvm.internal.impl.protobuf.p<ValueParameter> f126983o = new a();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final kotlin.reflect.jvm.internal.impl.protobuf.d f126984d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f126985e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f126986f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f126987g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private Type f126988h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f126989i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private Type f126990j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f126991k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private byte f126992l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f126993m;

        public static final class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<ValueParameter> {
            a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public ValueParameter d(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws InvalidProtocolBufferException {
                return new ValueParameter(eVar, fVar);
            }
        }

        public static final class b extends GeneratedMessageLite.c<ValueParameter, b> implements v {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private int f126994e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private int f126995f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private int f126996g;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private int f126998i;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            private int f127000k;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private Type f126997h = Type.Y();

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            private Type f126999j = Type.Y();

            private b() {
                H();
            }

            private void H() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static b z() {
                return new b();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b, kotlin.reflect.jvm.internal.impl.protobuf.o
            /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
            public ValueParameter r() {
                return ValueParameter.J();
            }

            public Type C() {
                return this.f126997h;
            }

            public Type D() {
                return this.f126999j;
            }

            public boolean E() {
                return (this.f126994e & 2) == 2;
            }

            public boolean F() {
                return (this.f126994e & 4) == 4;
            }

            public boolean G() {
                return (this.f126994e & 16) == 16;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b
            /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
            public b h(ValueParameter valueParameter) {
                if (valueParameter == ValueParameter.J()) {
                    return this;
                }
                if (valueParameter.R()) {
                    P(valueParameter.L());
                }
                if (valueParameter.S()) {
                    Q(valueParameter.M());
                }
                if (valueParameter.T()) {
                    M(valueParameter.N());
                }
                if (valueParameter.U()) {
                    R(valueParameter.O());
                }
                if (valueParameter.V()) {
                    O(valueParameter.P());
                }
                if (valueParameter.W()) {
                    S(valueParameter.Q());
                }
                p(valueParameter);
                i(g().b(valueParameter.f126984d));
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC1169a
            /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
            public b c(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws Throwable {
                ValueParameter valueParameter = null;
                try {
                    try {
                        ValueParameter valueParameterD = ValueParameter.f126983o.d(eVar, fVar);
                        if (valueParameterD != null) {
                            h(valueParameterD);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e10) {
                        ValueParameter valueParameter2 = (ValueParameter) e10.a();
                        try {
                            throw e10;
                        } catch (Throwable th2) {
                            th = th2;
                            valueParameter = valueParameter2;
                            if (valueParameter != null) {
                                h(valueParameter);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (valueParameter != null) {
                        h(valueParameter);
                    }
                    throw th;
                }
            }

            public b M(Type type) {
                if ((this.f126994e & 4) != 4 || this.f126997h == Type.Y()) {
                    this.f126997h = type;
                } else {
                    this.f126997h = Type.z0(this.f126997h).h(type).x();
                }
                this.f126994e |= 4;
                return this;
            }

            public b O(Type type) {
                if ((this.f126994e & 16) != 16 || this.f126999j == Type.Y()) {
                    this.f126999j = type;
                } else {
                    this.f126999j = Type.z0(this.f126999j).h(type).x();
                }
                this.f126994e |= 16;
                return this;
            }

            public b P(int i10) {
                this.f126994e |= 1;
                this.f126995f = i10;
                return this;
            }

            public b Q(int i10) {
                this.f126994e |= 2;
                this.f126996g = i10;
                return this;
            }

            public b R(int i10) {
                this.f126994e |= 8;
                this.f126998i = i10;
                return this;
            }

            public b S(int i10) {
                this.f126994e |= 32;
                this.f127000k = i10;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
            public final boolean l() {
                if (!E()) {
                    return false;
                }
                if (!F() || C().l()) {
                    return (!G() || D().l()) && o();
                }
                return false;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.n.a
            /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
            public ValueParameter build() {
                ValueParameter valueParameterX = x();
                if (valueParameterX.l()) {
                    return valueParameterX;
                }
                throw kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC1169a.d(valueParameterX);
            }

            public ValueParameter x() {
                ValueParameter valueParameter = new ValueParameter(this);
                int i10 = this.f126994e;
                int i11 = (i10 & 1) != 1 ? 0 : 1;
                valueParameter.f126986f = this.f126995f;
                if ((i10 & 2) == 2) {
                    i11 |= 2;
                }
                valueParameter.f126987g = this.f126996g;
                if ((i10 & 4) == 4) {
                    i11 |= 4;
                }
                valueParameter.f126988h = this.f126997h;
                if ((i10 & 8) == 8) {
                    i11 |= 8;
                }
                valueParameter.f126989i = this.f126998i;
                if ((i10 & 16) == 16) {
                    i11 |= 16;
                }
                valueParameter.f126990j = this.f126999j;
                if ((i10 & 32) == 32) {
                    i11 |= 32;
                }
                valueParameter.f126991k = this.f127000k;
                valueParameter.f126985e = i11;
                return valueParameter;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.c
            /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
            public b m() {
                return z().h(x());
            }
        }

        static {
            ValueParameter valueParameter = new ValueParameter(true);
            f126982n = valueParameter;
            valueParameter.X();
        }

        private ValueParameter(GeneratedMessageLite.c<ValueParameter, ?> cVar) {
            super(cVar);
            this.f126992l = (byte) -1;
            this.f126993m = -1;
            this.f126984d = cVar.g();
        }

        private ValueParameter(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws InvalidProtocolBufferException {
            Type.b bVarT;
            this.f126992l = (byte) -1;
            this.f126993m = -1;
            X();
            kotlin.reflect.jvm.internal.impl.protobuf.d.b bVarU = kotlin.reflect.jvm.internal.impl.protobuf.d.u();
            CodedOutputStream codedOutputStreamJ = CodedOutputStream.J(bVarU, 1);
            boolean z10 = false;
            while (!z10) {
                try {
                    try {
                        try {
                            int iK = eVar.K();
                            if (iK != 0) {
                                if (iK == 8) {
                                    this.f126985e |= 1;
                                    this.f126986f = eVar.s();
                                } else if (iK != 16) {
                                    if (iK == 26) {
                                        bVarT = (this.f126985e & 4) == 4 ? this.f126988h.t() : null;
                                        Type type = (Type) eVar.u(Type.f126879w, fVar);
                                        this.f126988h = type;
                                        if (bVarT != null) {
                                            bVarT.h(type);
                                            this.f126988h = bVarT.x();
                                        }
                                        this.f126985e |= 4;
                                    } else if (iK == 34) {
                                        bVarT = (this.f126985e & 16) == 16 ? this.f126990j.t() : null;
                                        Type type2 = (Type) eVar.u(Type.f126879w, fVar);
                                        this.f126990j = type2;
                                        if (bVarT != null) {
                                            bVarT.h(type2);
                                            this.f126990j = bVarT.x();
                                        }
                                        this.f126985e |= 16;
                                    } else if (iK == 40) {
                                        this.f126985e |= 8;
                                        this.f126989i = eVar.s();
                                    } else if (iK == 48) {
                                        this.f126985e |= 32;
                                        this.f126991k = eVar.s();
                                    } else if (!j(eVar, codedOutputStreamJ, fVar, iK)) {
                                    }
                                } else {
                                    this.f126985e |= 2;
                                    this.f126987g = eVar.s();
                                }
                            }
                            z10 = true;
                        } catch (IOException e10) {
                            throw new InvalidProtocolBufferException(e10.getMessage()).i(this);
                        }
                    } catch (InvalidProtocolBufferException e11) {
                        throw e11.i(this);
                    }
                } catch (Throwable th2) {
                    try {
                        codedOutputStreamJ.I();
                    } catch (IOException unused) {
                    } finally {
                        this.f126984d = bVarU.e();
                    }
                    g();
                    throw th2;
                }
            }
            try {
                codedOutputStreamJ.I();
            } catch (IOException unused2) {
            } finally {
                this.f126984d = bVarU.e();
            }
            g();
        }

        private ValueParameter(boolean z10) {
            this.f126992l = (byte) -1;
            this.f126993m = -1;
            this.f126984d = kotlin.reflect.jvm.internal.impl.protobuf.d.f127320b;
        }

        public static ValueParameter J() {
            return f126982n;
        }

        private void X() {
            this.f126986f = 0;
            this.f126987g = 0;
            this.f126988h = Type.Y();
            this.f126989i = 0;
            this.f126990j = Type.Y();
            this.f126991k = 0;
        }

        public static b Y() {
            return b.z();
        }

        public static b Z(ValueParameter valueParameter) {
            return Y().h(valueParameter);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
        public ValueParameter r() {
            return f126982n;
        }

        public int L() {
            return this.f126986f;
        }

        public int M() {
            return this.f126987g;
        }

        public Type N() {
            return this.f126988h;
        }

        public int O() {
            return this.f126989i;
        }

        public Type P() {
            return this.f126990j;
        }

        public int Q() {
            return this.f126991k;
        }

        public boolean R() {
            return (this.f126985e & 1) == 1;
        }

        public boolean S() {
            return (this.f126985e & 2) == 2;
        }

        public boolean T() {
            return (this.f126985e & 4) == 4;
        }

        public boolean U() {
            return (this.f126985e & 8) == 8;
        }

        public boolean V() {
            return (this.f126985e & 16) == 16;
        }

        public boolean W() {
            return (this.f126985e & 32) == 32;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        public void a(CodedOutputStream codedOutputStream) throws IOException {
            u();
            GeneratedMessageLite.ExtendableMessage<MessageType>.a aVarY = y();
            if ((this.f126985e & 1) == 1) {
                codedOutputStream.a0(1, this.f126986f);
            }
            if ((this.f126985e & 2) == 2) {
                codedOutputStream.a0(2, this.f126987g);
            }
            if ((this.f126985e & 4) == 4) {
                codedOutputStream.d0(3, this.f126988h);
            }
            if ((this.f126985e & 16) == 16) {
                codedOutputStream.d0(4, this.f126990j);
            }
            if ((this.f126985e & 8) == 8) {
                codedOutputStream.a0(5, this.f126989i);
            }
            if ((this.f126985e & 32) == 32) {
                codedOutputStream.a0(6, this.f126991k);
            }
            aVarY.a(200, codedOutputStream);
            codedOutputStream.i0(this.f126984d);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        /* JADX INFO: renamed from: a0, reason: merged with bridge method [inline-methods] */
        public b v() {
            return Y();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        /* JADX INFO: renamed from: b0, reason: merged with bridge method [inline-methods] */
        public b t() {
            return Z(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public final boolean l() {
            byte b10 = this.f126992l;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            if (!S()) {
                this.f126992l = (byte) 0;
                return false;
            }
            if (T() && !N().l()) {
                this.f126992l = (byte) 0;
                return false;
            }
            if (V() && !P().l()) {
                this.f126992l = (byte) 0;
                return false;
            }
            if (n()) {
                this.f126992l = (byte) 1;
                return true;
            }
            this.f126992l = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        public int u() {
            int i10 = this.f126993m;
            if (i10 != -1) {
                return i10;
            }
            int iO = (this.f126985e & 1) == 1 ? 0 + CodedOutputStream.o(1, this.f126986f) : 0;
            if ((this.f126985e & 2) == 2) {
                iO += CodedOutputStream.o(2, this.f126987g);
            }
            if ((this.f126985e & 4) == 4) {
                iO += CodedOutputStream.s(3, this.f126988h);
            }
            if ((this.f126985e & 16) == 16) {
                iO += CodedOutputStream.s(4, this.f126990j);
            }
            if ((this.f126985e & 8) == 8) {
                iO += CodedOutputStream.o(5, this.f126989i);
            }
            if ((this.f126985e & 32) == 32) {
                iO += CodedOutputStream.o(6, this.f126991k);
            }
            int iO2 = iO + o() + this.f126984d.size();
            this.f126993m = iO2;
            return iO2;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.n
        public kotlin.reflect.jvm.internal.impl.protobuf.p<ValueParameter> w() {
            return f126983o;
        }
    }

    public static final class VersionRequirement extends GeneratedMessageLite implements w {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final VersionRequirement f127001m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static kotlin.reflect.jvm.internal.impl.protobuf.p<VersionRequirement> f127002n = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final kotlin.reflect.jvm.internal.impl.protobuf.d f127003c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f127004d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f127005e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f127006f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Level f127007g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f127008h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f127009i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private VersionKind f127010j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private byte f127011k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f127012l;

        public enum Level implements kotlin.reflect.jvm.internal.impl.protobuf.h.a {
            WARNING(0, 0),
            ERROR(1, 1),
            HIDDEN(2, 2);

            private static kotlin.reflect.jvm.internal.impl.protobuf.h.b<Level> internalValueMap = new a();
            private final int value;

            public static final class a implements kotlin.reflect.jvm.internal.impl.protobuf.h.b<Level> {
                a() {
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public Level a(int i10) {
                    return Level.valueOf(i10);
                }
            }

            Level(int i10, int i11) {
                this.value = i11;
            }

            public static Level valueOf(int i10) {
                if (i10 == 0) {
                    return WARNING;
                }
                if (i10 == 1) {
                    return ERROR;
                }
                if (i10 != 2) {
                    return null;
                }
                return HIDDEN;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.a
            public final int getNumber() {
                return this.value;
            }
        }

        public enum VersionKind implements kotlin.reflect.jvm.internal.impl.protobuf.h.a {
            LANGUAGE_VERSION(0, 0),
            COMPILER_VERSION(1, 1),
            API_VERSION(2, 2);

            private static kotlin.reflect.jvm.internal.impl.protobuf.h.b<VersionKind> internalValueMap = new a();
            private final int value;

            public static final class a implements kotlin.reflect.jvm.internal.impl.protobuf.h.b<VersionKind> {
                a() {
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public VersionKind a(int i10) {
                    return VersionKind.valueOf(i10);
                }
            }

            VersionKind(int i10, int i11) {
                this.value = i11;
            }

            public static VersionKind valueOf(int i10) {
                if (i10 == 0) {
                    return LANGUAGE_VERSION;
                }
                if (i10 == 1) {
                    return COMPILER_VERSION;
                }
                if (i10 != 2) {
                    return null;
                }
                return API_VERSION;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.a
            public final int getNumber() {
                return this.value;
            }
        }

        public static final class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<VersionRequirement> {
            a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public VersionRequirement d(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws InvalidProtocolBufferException {
                return new VersionRequirement(eVar, fVar);
            }
        }

        public static final class b extends GeneratedMessageLite.b<VersionRequirement, b> implements w {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private int f127013c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f127014d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private int f127015e;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private int f127017g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private int f127018h;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private Level f127016f = Level.ERROR;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private VersionKind f127019i = VersionKind.LANGUAGE_VERSION;

            private b() {
                q();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static b o() {
                return new b();
            }

            private void q() {
            }

            public b B(int i10) {
                this.f127013c |= 16;
                this.f127018h = i10;
                return this;
            }

            public b C(int i10) {
                this.f127013c |= 1;
                this.f127014d = i10;
                return this;
            }

            public b D(int i10) {
                this.f127013c |= 2;
                this.f127015e = i10;
                return this;
            }

            public b E(VersionKind versionKind) {
                versionKind.getClass();
                this.f127013c |= 32;
                this.f127019i = versionKind;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.n.a
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public VersionRequirement build() {
                VersionRequirement versionRequirementM = m();
                if (versionRequirementM.l()) {
                    return versionRequirementM;
                }
                throw kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC1169a.d(versionRequirementM);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
            public final boolean l() {
                return true;
            }

            public VersionRequirement m() {
                VersionRequirement versionRequirement = new VersionRequirement(this);
                int i10 = this.f127013c;
                int i11 = (i10 & 1) != 1 ? 0 : 1;
                versionRequirement.f127005e = this.f127014d;
                if ((i10 & 2) == 2) {
                    i11 |= 2;
                }
                versionRequirement.f127006f = this.f127015e;
                if ((i10 & 4) == 4) {
                    i11 |= 4;
                }
                versionRequirement.f127007g = this.f127016f;
                if ((i10 & 8) == 8) {
                    i11 |= 8;
                }
                versionRequirement.f127008h = this.f127017g;
                if ((i10 & 16) == 16) {
                    i11 |= 16;
                }
                versionRequirement.f127009i = this.f127018h;
                if ((i10 & 32) == 32) {
                    i11 |= 32;
                }
                versionRequirement.f127010j = this.f127019i;
                versionRequirement.f127004d = i11;
                return versionRequirement;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public b m() {
                return o().h(m());
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b, kotlin.reflect.jvm.internal.impl.protobuf.o
            /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
            public VersionRequirement r() {
                return VersionRequirement.z();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b
            /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
            public b h(VersionRequirement versionRequirement) {
                if (versionRequirement == VersionRequirement.z()) {
                    return this;
                }
                if (versionRequirement.L()) {
                    C(versionRequirement.E());
                }
                if (versionRequirement.M()) {
                    D(versionRequirement.F());
                }
                if (versionRequirement.J()) {
                    z(versionRequirement.C());
                }
                if (versionRequirement.H()) {
                    y(versionRequirement.B());
                }
                if (versionRequirement.K()) {
                    B(versionRequirement.D());
                }
                if (versionRequirement.N()) {
                    E(versionRequirement.G());
                }
                i(g().b(versionRequirement.f127003c));
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC1169a
            /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
            public b c(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws Throwable {
                VersionRequirement versionRequirement = null;
                try {
                    try {
                        VersionRequirement versionRequirementD = VersionRequirement.f127002n.d(eVar, fVar);
                        if (versionRequirementD != null) {
                            h(versionRequirementD);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e10) {
                        VersionRequirement versionRequirement2 = (VersionRequirement) e10.a();
                        try {
                            throw e10;
                        } catch (Throwable th2) {
                            th = th2;
                            versionRequirement = versionRequirement2;
                            if (versionRequirement != null) {
                                h(versionRequirement);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (versionRequirement != null) {
                        h(versionRequirement);
                    }
                    throw th;
                }
            }

            public b y(int i10) {
                this.f127013c |= 8;
                this.f127017g = i10;
                return this;
            }

            public b z(Level level) {
                level.getClass();
                this.f127013c |= 4;
                this.f127016f = level;
                return this;
            }
        }

        static {
            VersionRequirement versionRequirement = new VersionRequirement(true);
            f127001m = versionRequirement;
            versionRequirement.O();
        }

        private VersionRequirement(GeneratedMessageLite.b bVar) {
            super(bVar);
            this.f127011k = (byte) -1;
            this.f127012l = -1;
            this.f127003c = bVar.g();
        }

        private VersionRequirement(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws InvalidProtocolBufferException {
            this.f127011k = (byte) -1;
            this.f127012l = -1;
            O();
            kotlin.reflect.jvm.internal.impl.protobuf.d.b bVarU = kotlin.reflect.jvm.internal.impl.protobuf.d.u();
            CodedOutputStream codedOutputStreamJ = CodedOutputStream.J(bVarU, 1);
            boolean z10 = false;
            while (!z10) {
                try {
                    try {
                        int iK = eVar.K();
                        if (iK != 0) {
                            if (iK == 8) {
                                this.f127004d |= 1;
                                this.f127005e = eVar.s();
                            } else if (iK == 16) {
                                this.f127004d |= 2;
                                this.f127006f = eVar.s();
                            } else if (iK == 24) {
                                int iN = eVar.n();
                                Level levelValueOf = Level.valueOf(iN);
                                if (levelValueOf == null) {
                                    codedOutputStreamJ.o0(iK);
                                    codedOutputStreamJ.o0(iN);
                                } else {
                                    this.f127004d |= 4;
                                    this.f127007g = levelValueOf;
                                }
                            } else if (iK == 32) {
                                this.f127004d |= 8;
                                this.f127008h = eVar.s();
                            } else if (iK == 40) {
                                this.f127004d |= 16;
                                this.f127009i = eVar.s();
                            } else if (iK == 48) {
                                int iN2 = eVar.n();
                                VersionKind versionKindValueOf = VersionKind.valueOf(iN2);
                                if (versionKindValueOf == null) {
                                    codedOutputStreamJ.o0(iK);
                                    codedOutputStreamJ.o0(iN2);
                                } else {
                                    this.f127004d |= 32;
                                    this.f127010j = versionKindValueOf;
                                }
                            } else if (!j(eVar, codedOutputStreamJ, fVar, iK)) {
                            }
                        }
                        z10 = true;
                    } catch (InvalidProtocolBufferException e10) {
                        throw e10.i(this);
                    } catch (IOException e11) {
                        throw new InvalidProtocolBufferException(e11.getMessage()).i(this);
                    }
                } catch (Throwable th2) {
                    try {
                        codedOutputStreamJ.I();
                    } catch (IOException unused) {
                    } finally {
                        this.f127003c = bVarU.e();
                    }
                    g();
                    throw th2;
                }
            }
            try {
                codedOutputStreamJ.I();
            } catch (IOException unused2) {
            } finally {
                this.f127003c = bVarU.e();
            }
            g();
        }

        private VersionRequirement(boolean z10) {
            this.f127011k = (byte) -1;
            this.f127012l = -1;
            this.f127003c = kotlin.reflect.jvm.internal.impl.protobuf.d.f127320b;
        }

        private void O() {
            this.f127005e = 0;
            this.f127006f = 0;
            this.f127007g = Level.ERROR;
            this.f127008h = 0;
            this.f127009i = 0;
            this.f127010j = VersionKind.LANGUAGE_VERSION;
        }

        public static b P() {
            return b.o();
        }

        public static b Q(VersionRequirement versionRequirement) {
            return P().h(versionRequirement);
        }

        public static VersionRequirement z() {
            return f127001m;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
        public VersionRequirement r() {
            return f127001m;
        }

        public int B() {
            return this.f127008h;
        }

        public Level C() {
            return this.f127007g;
        }

        public int D() {
            return this.f127009i;
        }

        public int E() {
            return this.f127005e;
        }

        public int F() {
            return this.f127006f;
        }

        public VersionKind G() {
            return this.f127010j;
        }

        public boolean H() {
            return (this.f127004d & 8) == 8;
        }

        public boolean J() {
            return (this.f127004d & 4) == 4;
        }

        public boolean K() {
            return (this.f127004d & 16) == 16;
        }

        public boolean L() {
            return (this.f127004d & 1) == 1;
        }

        public boolean M() {
            return (this.f127004d & 2) == 2;
        }

        public boolean N() {
            return (this.f127004d & 32) == 32;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
        public b v() {
            return P();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
        public b t() {
            return Q(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        public void a(CodedOutputStream codedOutputStream) throws IOException {
            u();
            if ((this.f127004d & 1) == 1) {
                codedOutputStream.a0(1, this.f127005e);
            }
            if ((this.f127004d & 2) == 2) {
                codedOutputStream.a0(2, this.f127006f);
            }
            if ((this.f127004d & 4) == 4) {
                codedOutputStream.S(3, this.f127007g.getNumber());
            }
            if ((this.f127004d & 8) == 8) {
                codedOutputStream.a0(4, this.f127008h);
            }
            if ((this.f127004d & 16) == 16) {
                codedOutputStream.a0(5, this.f127009i);
            }
            if ((this.f127004d & 32) == 32) {
                codedOutputStream.S(6, this.f127010j.getNumber());
            }
            codedOutputStream.i0(this.f127003c);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public final boolean l() {
            byte b10 = this.f127011k;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.f127011k = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        public int u() {
            int i10 = this.f127012l;
            if (i10 != -1) {
                return i10;
            }
            int iO = (this.f127004d & 1) == 1 ? 0 + CodedOutputStream.o(1, this.f127005e) : 0;
            if ((this.f127004d & 2) == 2) {
                iO += CodedOutputStream.o(2, this.f127006f);
            }
            if ((this.f127004d & 4) == 4) {
                iO += CodedOutputStream.h(3, this.f127007g.getNumber());
            }
            if ((this.f127004d & 8) == 8) {
                iO += CodedOutputStream.o(4, this.f127008h);
            }
            if ((this.f127004d & 16) == 16) {
                iO += CodedOutputStream.o(5, this.f127009i);
            }
            if ((this.f127004d & 32) == 32) {
                iO += CodedOutputStream.h(6, this.f127010j.getNumber());
            }
            int size = iO + this.f127003c.size();
            this.f127012l = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.n
        public kotlin.reflect.jvm.internal.impl.protobuf.p<VersionRequirement> w() {
            return f127002n;
        }
    }

    public static final class VersionRequirementTable extends GeneratedMessageLite implements x {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final VersionRequirementTable f127020g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static kotlin.reflect.jvm.internal.impl.protobuf.p<VersionRequirementTable> f127021h = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final kotlin.reflect.jvm.internal.impl.protobuf.d f127022c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private List<VersionRequirement> f127023d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private byte f127024e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f127025f;

        public static final class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<VersionRequirementTable> {
            a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public VersionRequirementTable d(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws InvalidProtocolBufferException {
                return new VersionRequirementTable(eVar, fVar);
            }
        }

        public static final class b extends GeneratedMessageLite.b<VersionRequirementTable, b> implements x {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private int f127026c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private List<VersionRequirement> f127027d = Collections.emptyList();

            private b() {
                s();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static b o() {
                return new b();
            }

            private void p() {
                if ((this.f127026c & 1) != 1) {
                    this.f127027d = new ArrayList(this.f127027d);
                    this.f127026c |= 1;
                }
            }

            private void s() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.n.a
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public VersionRequirementTable build() {
                VersionRequirementTable versionRequirementTableM = m();
                if (versionRequirementTableM.l()) {
                    return versionRequirementTableM;
                }
                throw kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC1169a.d(versionRequirementTableM);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
            public final boolean l() {
                return true;
            }

            public VersionRequirementTable m() {
                VersionRequirementTable versionRequirementTable = new VersionRequirementTable(this);
                if ((this.f127026c & 1) == 1) {
                    this.f127027d = Collections.unmodifiableList(this.f127027d);
                    this.f127026c &= -2;
                }
                versionRequirementTable.f127023d = this.f127027d;
                return versionRequirementTable;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public b m() {
                return o().h(m());
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b, kotlin.reflect.jvm.internal.impl.protobuf.o
            /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
            public VersionRequirementTable r() {
                return VersionRequirementTable.p();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b
            /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
            public b h(VersionRequirementTable versionRequirementTable) {
                if (versionRequirementTable == VersionRequirementTable.p()) {
                    return this;
                }
                if (!versionRequirementTable.f127023d.isEmpty()) {
                    if (this.f127027d.isEmpty()) {
                        this.f127027d = versionRequirementTable.f127023d;
                        this.f127026c &= -2;
                    } else {
                        p();
                        this.f127027d.addAll(versionRequirementTable.f127023d);
                    }
                }
                i(g().b(versionRequirementTable.f127022c));
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC1169a
            /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
            public b c(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws Throwable {
                VersionRequirementTable versionRequirementTable = null;
                try {
                    try {
                        VersionRequirementTable versionRequirementTableD = VersionRequirementTable.f127021h.d(eVar, fVar);
                        if (versionRequirementTableD != null) {
                            h(versionRequirementTableD);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e10) {
                        VersionRequirementTable versionRequirementTable2 = (VersionRequirementTable) e10.a();
                        try {
                            throw e10;
                        } catch (Throwable th2) {
                            th = th2;
                            versionRequirementTable = versionRequirementTable2;
                            if (versionRequirementTable != null) {
                                h(versionRequirementTable);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (versionRequirementTable != null) {
                        h(versionRequirementTable);
                    }
                    throw th;
                }
            }
        }

        static {
            VersionRequirementTable versionRequirementTable = new VersionRequirementTable(true);
            f127020g = versionRequirementTable;
            versionRequirementTable.y();
        }

        private VersionRequirementTable(GeneratedMessageLite.b bVar) {
            super(bVar);
            this.f127024e = (byte) -1;
            this.f127025f = -1;
            this.f127022c = bVar.g();
        }

        private VersionRequirementTable(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws InvalidProtocolBufferException {
            this.f127024e = (byte) -1;
            this.f127025f = -1;
            y();
            kotlin.reflect.jvm.internal.impl.protobuf.d.b bVarU = kotlin.reflect.jvm.internal.impl.protobuf.d.u();
            CodedOutputStream codedOutputStreamJ = CodedOutputStream.J(bVarU, 1);
            boolean z10 = false;
            boolean z11 = false;
            while (!z10) {
                try {
                    try {
                        int iK = eVar.K();
                        if (iK != 0) {
                            if (iK == 10) {
                                if (!(z11 & true)) {
                                    this.f127023d = new ArrayList();
                                    z11 |= true;
                                }
                                this.f127023d.add((VersionRequirement) eVar.u(VersionRequirement.f127002n, fVar));
                            } else if (!j(eVar, codedOutputStreamJ, fVar, iK)) {
                            }
                        }
                        z10 = true;
                    } catch (Throwable th2) {
                        if (z11 & true) {
                            this.f127023d = Collections.unmodifiableList(this.f127023d);
                        }
                        try {
                            codedOutputStreamJ.I();
                        } catch (IOException unused) {
                        } finally {
                            this.f127022c = bVarU.e();
                        }
                        g();
                        throw th2;
                    }
                } catch (InvalidProtocolBufferException e10) {
                    throw e10.i(this);
                } catch (IOException e11) {
                    throw new InvalidProtocolBufferException(e11.getMessage()).i(this);
                }
            }
            if (z11 & true) {
                this.f127023d = Collections.unmodifiableList(this.f127023d);
            }
            try {
                codedOutputStreamJ.I();
            } catch (IOException unused2) {
            } finally {
                this.f127022c = bVarU.e();
            }
            g();
        }

        private VersionRequirementTable(boolean z10) {
            this.f127024e = (byte) -1;
            this.f127025f = -1;
            this.f127022c = kotlin.reflect.jvm.internal.impl.protobuf.d.f127320b;
        }

        public static b A(VersionRequirementTable versionRequirementTable) {
            return z().h(versionRequirementTable);
        }

        public static VersionRequirementTable p() {
            return f127020g;
        }

        private void y() {
            this.f127023d = Collections.emptyList();
        }

        public static b z() {
            return b.o();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
        public b v() {
            return z();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
        public b t() {
            return A(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        public void a(CodedOutputStream codedOutputStream) throws IOException {
            u();
            for (int i10 = 0; i10 < this.f127023d.size(); i10++) {
                codedOutputStream.d0(1, this.f127023d.get(i10));
            }
            codedOutputStream.i0(this.f127022c);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public final boolean l() {
            byte b10 = this.f127024e;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.f127024e = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public VersionRequirementTable r() {
            return f127020g;
        }

        public int s() {
            return this.f127023d.size();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        public int u() {
            int i10 = this.f127025f;
            if (i10 != -1) {
                return i10;
            }
            int iS = 0;
            for (int i11 = 0; i11 < this.f127023d.size(); i11++) {
                iS += CodedOutputStream.s(1, this.f127023d.get(i11));
            }
            int size = iS + this.f127022c.size();
            this.f127025f = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.n
        public kotlin.reflect.jvm.internal.impl.protobuf.p<VersionRequirementTable> w() {
            return f127021h;
        }

        public List<VersionRequirement> x() {
            return this.f127023d;
        }
    }

    public enum Visibility implements kotlin.reflect.jvm.internal.impl.protobuf.h.a {
        INTERNAL(0, 0),
        PRIVATE(1, 1),
        PROTECTED(2, 2),
        PUBLIC(3, 3),
        PRIVATE_TO_THIS(4, 4),
        LOCAL(5, 5);

        private static kotlin.reflect.jvm.internal.impl.protobuf.h.b<Visibility> internalValueMap = new a();
        private final int value;

        public static final class a implements kotlin.reflect.jvm.internal.impl.protobuf.h.b<Visibility> {
            a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Visibility a(int i10) {
                return Visibility.valueOf(i10);
            }
        }

        Visibility(int i10, int i11) {
            this.value = i11;
        }

        public static Visibility valueOf(int i10) {
            if (i10 == 0) {
                return INTERNAL;
            }
            if (i10 == 1) {
                return PRIVATE;
            }
            if (i10 == 2) {
                return PROTECTED;
            }
            if (i10 == 3) {
                return PUBLIC;
            }
            if (i10 == 4) {
                return PRIVATE_TO_THIS;
            }
            if (i10 != 5) {
                return null;
            }
            return LOCAL;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.a
        public final int getNumber() {
            return this.value;
        }
    }
}
