package kotlin.reflect.jvm.internal.impl.metadata.jvm;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.WireFormat;
import kotlin.reflect.jvm.internal.impl.protobuf.f;
import kotlin.reflect.jvm.internal.impl.protobuf.h;
import kotlin.reflect.jvm.internal.impl.protobuf.p;

/* JADX INFO: loaded from: classes5.dex */
public final class JvmProtoBuf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final GeneratedMessageLite.f<ProtoBuf.Constructor, JvmMethodSignature> f127070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final GeneratedMessageLite.f<ProtoBuf.Function, JvmMethodSignature> f127071b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final GeneratedMessageLite.f<ProtoBuf.Function, Integer> f127072c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final GeneratedMessageLite.f<ProtoBuf.Property, JvmPropertySignature> f127073d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final GeneratedMessageLite.f<ProtoBuf.Property, Integer> f127074e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final GeneratedMessageLite.f<ProtoBuf.Type, List<ProtoBuf.Annotation>> f127075f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final GeneratedMessageLite.f<ProtoBuf.Type, Boolean> f127076g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final GeneratedMessageLite.f<ProtoBuf.TypeParameter, List<ProtoBuf.Annotation>> f127077h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final GeneratedMessageLite.f<ProtoBuf.Class, Integer> f127078i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final GeneratedMessageLite.f<ProtoBuf.Class, List<ProtoBuf.Property>> f127079j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final GeneratedMessageLite.f<ProtoBuf.Class, Integer> f127080k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final GeneratedMessageLite.f<ProtoBuf.Class, Integer> f127081l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final GeneratedMessageLite.f<ProtoBuf.Package, Integer> f127082m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final GeneratedMessageLite.f<ProtoBuf.Package, List<ProtoBuf.Property>> f127083n;

    public static final class JvmFieldSignature extends GeneratedMessageLite implements kotlin.reflect.jvm.internal.impl.metadata.jvm.a {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final JvmFieldSignature f127084i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static p<JvmFieldSignature> f127085j = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final kotlin.reflect.jvm.internal.impl.protobuf.d f127086c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f127087d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f127088e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f127089f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private byte f127090g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f127091h;

        public static final class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<JvmFieldSignature> {
            a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public JvmFieldSignature d(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, f fVar) throws InvalidProtocolBufferException {
                return new JvmFieldSignature(eVar, fVar);
            }
        }

        public static final class b extends GeneratedMessageLite.b<JvmFieldSignature, b> implements kotlin.reflect.jvm.internal.impl.metadata.jvm.a {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private int f127092c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f127093d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private int f127094e;

            private b() {
                q();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static b o() {
                return new b();
            }

            private void q() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.n.a
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public JvmFieldSignature build() {
                JvmFieldSignature jvmFieldSignatureM = m();
                if (jvmFieldSignatureM.l()) {
                    return jvmFieldSignatureM;
                }
                throw kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC1169a.d(jvmFieldSignatureM);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
            public final boolean l() {
                return true;
            }

            public JvmFieldSignature m() {
                JvmFieldSignature jvmFieldSignature = new JvmFieldSignature(this);
                int i10 = this.f127092c;
                int i11 = (i10 & 1) != 1 ? 0 : 1;
                jvmFieldSignature.f127088e = this.f127093d;
                if ((i10 & 2) == 2) {
                    i11 |= 2;
                }
                jvmFieldSignature.f127089f = this.f127094e;
                jvmFieldSignature.f127087d = i11;
                return jvmFieldSignature;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public b m() {
                return o().h(m());
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b, kotlin.reflect.jvm.internal.impl.protobuf.o
            /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
            public JvmFieldSignature r() {
                return JvmFieldSignature.q();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b
            /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
            public b h(JvmFieldSignature jvmFieldSignature) {
                if (jvmFieldSignature == JvmFieldSignature.q()) {
                    return this;
                }
                if (jvmFieldSignature.A()) {
                    z(jvmFieldSignature.y());
                }
                if (jvmFieldSignature.z()) {
                    y(jvmFieldSignature.x());
                }
                i(g().b(jvmFieldSignature.f127086c));
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC1169a
            /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
            public b c(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, f fVar) throws Throwable {
                JvmFieldSignature jvmFieldSignature = null;
                try {
                    try {
                        JvmFieldSignature jvmFieldSignatureD = JvmFieldSignature.f127085j.d(eVar, fVar);
                        if (jvmFieldSignatureD != null) {
                            h(jvmFieldSignatureD);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e10) {
                        JvmFieldSignature jvmFieldSignature2 = (JvmFieldSignature) e10.a();
                        try {
                            throw e10;
                        } catch (Throwable th2) {
                            th = th2;
                            jvmFieldSignature = jvmFieldSignature2;
                            if (jvmFieldSignature != null) {
                                h(jvmFieldSignature);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (jvmFieldSignature != null) {
                        h(jvmFieldSignature);
                    }
                    throw th;
                }
            }

            public b y(int i10) {
                this.f127092c |= 2;
                this.f127094e = i10;
                return this;
            }

            public b z(int i10) {
                this.f127092c |= 1;
                this.f127093d = i10;
                return this;
            }
        }

        static {
            JvmFieldSignature jvmFieldSignature = new JvmFieldSignature(true);
            f127084i = jvmFieldSignature;
            jvmFieldSignature.B();
        }

        private JvmFieldSignature(GeneratedMessageLite.b bVar) {
            super(bVar);
            this.f127090g = (byte) -1;
            this.f127091h = -1;
            this.f127086c = bVar.g();
        }

        private JvmFieldSignature(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, f fVar) throws InvalidProtocolBufferException {
            this.f127090g = (byte) -1;
            this.f127091h = -1;
            B();
            kotlin.reflect.jvm.internal.impl.protobuf.d.b bVarU = kotlin.reflect.jvm.internal.impl.protobuf.d.u();
            CodedOutputStream codedOutputStreamJ = CodedOutputStream.J(bVarU, 1);
            boolean z10 = false;
            while (!z10) {
                try {
                    try {
                        int iK = eVar.K();
                        if (iK != 0) {
                            if (iK == 8) {
                                this.f127087d |= 1;
                                this.f127088e = eVar.s();
                            } else if (iK == 16) {
                                this.f127087d |= 2;
                                this.f127089f = eVar.s();
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
                        this.f127086c = bVarU.e();
                    }
                    g();
                    throw th2;
                }
            }
            try {
                codedOutputStreamJ.I();
            } catch (IOException unused2) {
            } finally {
                this.f127086c = bVarU.e();
            }
            g();
        }

        private JvmFieldSignature(boolean z10) {
            this.f127090g = (byte) -1;
            this.f127091h = -1;
            this.f127086c = kotlin.reflect.jvm.internal.impl.protobuf.d.f127320b;
        }

        private void B() {
            this.f127088e = 0;
            this.f127089f = 0;
        }

        public static b C() {
            return b.o();
        }

        public static b D(JvmFieldSignature jvmFieldSignature) {
            return C().h(jvmFieldSignature);
        }

        public static JvmFieldSignature q() {
            return f127084i;
        }

        public boolean A() {
            return (this.f127087d & 1) == 1;
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
            if ((this.f127087d & 1) == 1) {
                codedOutputStream.a0(1, this.f127088e);
            }
            if ((this.f127087d & 2) == 2) {
                codedOutputStream.a0(2, this.f127089f);
            }
            codedOutputStream.i0(this.f127086c);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public final boolean l() {
            byte b10 = this.f127090g;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.f127090g = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public JvmFieldSignature r() {
            return f127084i;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        public int u() {
            int i10 = this.f127091h;
            if (i10 != -1) {
                return i10;
            }
            int iO = (this.f127087d & 1) == 1 ? 0 + CodedOutputStream.o(1, this.f127088e) : 0;
            if ((this.f127087d & 2) == 2) {
                iO += CodedOutputStream.o(2, this.f127089f);
            }
            int size = iO + this.f127086c.size();
            this.f127091h = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.n
        public p<JvmFieldSignature> w() {
            return f127085j;
        }

        public int x() {
            return this.f127089f;
        }

        public int y() {
            return this.f127088e;
        }

        public boolean z() {
            return (this.f127087d & 2) == 2;
        }
    }

    public static final class JvmMethodSignature extends GeneratedMessageLite implements kotlin.reflect.jvm.internal.impl.metadata.jvm.b {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final JvmMethodSignature f127095i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static p<JvmMethodSignature> f127096j = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final kotlin.reflect.jvm.internal.impl.protobuf.d f127097c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f127098d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f127099e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f127100f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private byte f127101g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f127102h;

        public static final class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<JvmMethodSignature> {
            a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public JvmMethodSignature d(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, f fVar) throws InvalidProtocolBufferException {
                return new JvmMethodSignature(eVar, fVar);
            }
        }

        public static final class b extends GeneratedMessageLite.b<JvmMethodSignature, b> implements kotlin.reflect.jvm.internal.impl.metadata.jvm.b {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private int f127103c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f127104d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private int f127105e;

            private b() {
                q();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static b o() {
                return new b();
            }

            private void q() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.n.a
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public JvmMethodSignature build() {
                JvmMethodSignature jvmMethodSignatureM = m();
                if (jvmMethodSignatureM.l()) {
                    return jvmMethodSignatureM;
                }
                throw kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC1169a.d(jvmMethodSignatureM);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
            public final boolean l() {
                return true;
            }

            public JvmMethodSignature m() {
                JvmMethodSignature jvmMethodSignature = new JvmMethodSignature(this);
                int i10 = this.f127103c;
                int i11 = (i10 & 1) != 1 ? 0 : 1;
                jvmMethodSignature.f127099e = this.f127104d;
                if ((i10 & 2) == 2) {
                    i11 |= 2;
                }
                jvmMethodSignature.f127100f = this.f127105e;
                jvmMethodSignature.f127098d = i11;
                return jvmMethodSignature;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public b m() {
                return o().h(m());
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b, kotlin.reflect.jvm.internal.impl.protobuf.o
            /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
            public JvmMethodSignature r() {
                return JvmMethodSignature.q();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b
            /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
            public b h(JvmMethodSignature jvmMethodSignature) {
                if (jvmMethodSignature == JvmMethodSignature.q()) {
                    return this;
                }
                if (jvmMethodSignature.A()) {
                    z(jvmMethodSignature.y());
                }
                if (jvmMethodSignature.z()) {
                    y(jvmMethodSignature.x());
                }
                i(g().b(jvmMethodSignature.f127097c));
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC1169a
            /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
            public b c(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, f fVar) throws Throwable {
                JvmMethodSignature jvmMethodSignature = null;
                try {
                    try {
                        JvmMethodSignature jvmMethodSignatureD = JvmMethodSignature.f127096j.d(eVar, fVar);
                        if (jvmMethodSignatureD != null) {
                            h(jvmMethodSignatureD);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e10) {
                        JvmMethodSignature jvmMethodSignature2 = (JvmMethodSignature) e10.a();
                        try {
                            throw e10;
                        } catch (Throwable th2) {
                            th = th2;
                            jvmMethodSignature = jvmMethodSignature2;
                            if (jvmMethodSignature != null) {
                                h(jvmMethodSignature);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (jvmMethodSignature != null) {
                        h(jvmMethodSignature);
                    }
                    throw th;
                }
            }

            public b y(int i10) {
                this.f127103c |= 2;
                this.f127105e = i10;
                return this;
            }

            public b z(int i10) {
                this.f127103c |= 1;
                this.f127104d = i10;
                return this;
            }
        }

        static {
            JvmMethodSignature jvmMethodSignature = new JvmMethodSignature(true);
            f127095i = jvmMethodSignature;
            jvmMethodSignature.B();
        }

        private JvmMethodSignature(GeneratedMessageLite.b bVar) {
            super(bVar);
            this.f127101g = (byte) -1;
            this.f127102h = -1;
            this.f127097c = bVar.g();
        }

        private JvmMethodSignature(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, f fVar) throws InvalidProtocolBufferException {
            this.f127101g = (byte) -1;
            this.f127102h = -1;
            B();
            kotlin.reflect.jvm.internal.impl.protobuf.d.b bVarU = kotlin.reflect.jvm.internal.impl.protobuf.d.u();
            CodedOutputStream codedOutputStreamJ = CodedOutputStream.J(bVarU, 1);
            boolean z10 = false;
            while (!z10) {
                try {
                    try {
                        int iK = eVar.K();
                        if (iK != 0) {
                            if (iK == 8) {
                                this.f127098d |= 1;
                                this.f127099e = eVar.s();
                            } else if (iK == 16) {
                                this.f127098d |= 2;
                                this.f127100f = eVar.s();
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
                        this.f127097c = bVarU.e();
                    }
                    g();
                    throw th2;
                }
            }
            try {
                codedOutputStreamJ.I();
            } catch (IOException unused2) {
            } finally {
                this.f127097c = bVarU.e();
            }
            g();
        }

        private JvmMethodSignature(boolean z10) {
            this.f127101g = (byte) -1;
            this.f127102h = -1;
            this.f127097c = kotlin.reflect.jvm.internal.impl.protobuf.d.f127320b;
        }

        private void B() {
            this.f127099e = 0;
            this.f127100f = 0;
        }

        public static b C() {
            return b.o();
        }

        public static b D(JvmMethodSignature jvmMethodSignature) {
            return C().h(jvmMethodSignature);
        }

        public static JvmMethodSignature q() {
            return f127095i;
        }

        public boolean A() {
            return (this.f127098d & 1) == 1;
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
            if ((this.f127098d & 1) == 1) {
                codedOutputStream.a0(1, this.f127099e);
            }
            if ((this.f127098d & 2) == 2) {
                codedOutputStream.a0(2, this.f127100f);
            }
            codedOutputStream.i0(this.f127097c);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public final boolean l() {
            byte b10 = this.f127101g;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.f127101g = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public JvmMethodSignature r() {
            return f127095i;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        public int u() {
            int i10 = this.f127102h;
            if (i10 != -1) {
                return i10;
            }
            int iO = (this.f127098d & 1) == 1 ? 0 + CodedOutputStream.o(1, this.f127099e) : 0;
            if ((this.f127098d & 2) == 2) {
                iO += CodedOutputStream.o(2, this.f127100f);
            }
            int size = iO + this.f127097c.size();
            this.f127102h = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.n
        public p<JvmMethodSignature> w() {
            return f127096j;
        }

        public int x() {
            return this.f127100f;
        }

        public int y() {
            return this.f127099e;
        }

        public boolean z() {
            return (this.f127098d & 2) == 2;
        }
    }

    public static final class JvmPropertySignature extends GeneratedMessageLite implements c {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final JvmPropertySignature f127106l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static p<JvmPropertySignature> f127107m = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final kotlin.reflect.jvm.internal.impl.protobuf.d f127108c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f127109d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private JvmFieldSignature f127110e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private JvmMethodSignature f127111f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private JvmMethodSignature f127112g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private JvmMethodSignature f127113h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private JvmMethodSignature f127114i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private byte f127115j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f127116k;

        public static final class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<JvmPropertySignature> {
            a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public JvmPropertySignature d(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, f fVar) throws InvalidProtocolBufferException {
                return new JvmPropertySignature(eVar, fVar);
            }
        }

        public static final class b extends GeneratedMessageLite.b<JvmPropertySignature, b> implements c {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private int f127117c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private JvmFieldSignature f127118d = JvmFieldSignature.q();

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private JvmMethodSignature f127119e = JvmMethodSignature.q();

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private JvmMethodSignature f127120f = JvmMethodSignature.q();

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private JvmMethodSignature f127121g = JvmMethodSignature.q();

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private JvmMethodSignature f127122h = JvmMethodSignature.q();

            private b() {
                q();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static b o() {
                return new b();
            }

            private void q() {
            }

            public b B(JvmMethodSignature jvmMethodSignature) {
                if ((this.f127117c & 4) != 4 || this.f127120f == JvmMethodSignature.q()) {
                    this.f127120f = jvmMethodSignature;
                } else {
                    this.f127120f = JvmMethodSignature.D(this.f127120f).h(jvmMethodSignature).m();
                }
                this.f127117c |= 4;
                return this;
            }

            public b C(JvmMethodSignature jvmMethodSignature) {
                if ((this.f127117c & 8) != 8 || this.f127121g == JvmMethodSignature.q()) {
                    this.f127121g = jvmMethodSignature;
                } else {
                    this.f127121g = JvmMethodSignature.D(this.f127121g).h(jvmMethodSignature).m();
                }
                this.f127117c |= 8;
                return this;
            }

            public b D(JvmMethodSignature jvmMethodSignature) {
                if ((this.f127117c & 2) != 2 || this.f127119e == JvmMethodSignature.q()) {
                    this.f127119e = jvmMethodSignature;
                } else {
                    this.f127119e = JvmMethodSignature.D(this.f127119e).h(jvmMethodSignature).m();
                }
                this.f127117c |= 2;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.n.a
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public JvmPropertySignature build() {
                JvmPropertySignature jvmPropertySignatureM = m();
                if (jvmPropertySignatureM.l()) {
                    return jvmPropertySignatureM;
                }
                throw kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC1169a.d(jvmPropertySignatureM);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
            public final boolean l() {
                return true;
            }

            public JvmPropertySignature m() {
                JvmPropertySignature jvmPropertySignature = new JvmPropertySignature(this);
                int i10 = this.f127117c;
                int i11 = (i10 & 1) != 1 ? 0 : 1;
                jvmPropertySignature.f127110e = this.f127118d;
                if ((i10 & 2) == 2) {
                    i11 |= 2;
                }
                jvmPropertySignature.f127111f = this.f127119e;
                if ((i10 & 4) == 4) {
                    i11 |= 4;
                }
                jvmPropertySignature.f127112g = this.f127120f;
                if ((i10 & 8) == 8) {
                    i11 |= 8;
                }
                jvmPropertySignature.f127113h = this.f127121g;
                if ((i10 & 16) == 16) {
                    i11 |= 16;
                }
                jvmPropertySignature.f127114i = this.f127122h;
                jvmPropertySignature.f127109d = i11;
                return jvmPropertySignature;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public b m() {
                return o().h(m());
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b, kotlin.reflect.jvm.internal.impl.protobuf.o
            /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
            public JvmPropertySignature r() {
                return JvmPropertySignature.y();
            }

            public b s(JvmMethodSignature jvmMethodSignature) {
                if ((this.f127117c & 16) != 16 || this.f127122h == JvmMethodSignature.q()) {
                    this.f127122h = jvmMethodSignature;
                } else {
                    this.f127122h = JvmMethodSignature.D(this.f127122h).h(jvmMethodSignature).m();
                }
                this.f127117c |= 16;
                return this;
            }

            public b x(JvmFieldSignature jvmFieldSignature) {
                if ((this.f127117c & 1) != 1 || this.f127118d == JvmFieldSignature.q()) {
                    this.f127118d = jvmFieldSignature;
                } else {
                    this.f127118d = JvmFieldSignature.D(this.f127118d).h(jvmFieldSignature).m();
                }
                this.f127117c |= 1;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b
            /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
            public b h(JvmPropertySignature jvmPropertySignature) {
                if (jvmPropertySignature == JvmPropertySignature.y()) {
                    return this;
                }
                if (jvmPropertySignature.G()) {
                    x(jvmPropertySignature.B());
                }
                if (jvmPropertySignature.K()) {
                    D(jvmPropertySignature.E());
                }
                if (jvmPropertySignature.H()) {
                    B(jvmPropertySignature.C());
                }
                if (jvmPropertySignature.J()) {
                    C(jvmPropertySignature.D());
                }
                if (jvmPropertySignature.F()) {
                    s(jvmPropertySignature.A());
                }
                i(g().b(jvmPropertySignature.f127108c));
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC1169a
            /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
            public b c(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, f fVar) throws Throwable {
                JvmPropertySignature jvmPropertySignature = null;
                try {
                    try {
                        JvmPropertySignature jvmPropertySignatureD = JvmPropertySignature.f127107m.d(eVar, fVar);
                        if (jvmPropertySignatureD != null) {
                            h(jvmPropertySignatureD);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e10) {
                        JvmPropertySignature jvmPropertySignature2 = (JvmPropertySignature) e10.a();
                        try {
                            throw e10;
                        } catch (Throwable th2) {
                            th = th2;
                            jvmPropertySignature = jvmPropertySignature2;
                            if (jvmPropertySignature != null) {
                                h(jvmPropertySignature);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (jvmPropertySignature != null) {
                        h(jvmPropertySignature);
                    }
                    throw th;
                }
            }
        }

        static {
            JvmPropertySignature jvmPropertySignature = new JvmPropertySignature(true);
            f127106l = jvmPropertySignature;
            jvmPropertySignature.L();
        }

        private JvmPropertySignature(GeneratedMessageLite.b bVar) {
            super(bVar);
            this.f127115j = (byte) -1;
            this.f127116k = -1;
            this.f127108c = bVar.g();
        }

        private JvmPropertySignature(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, f fVar) throws InvalidProtocolBufferException {
            this.f127115j = (byte) -1;
            this.f127116k = -1;
            L();
            kotlin.reflect.jvm.internal.impl.protobuf.d.b bVarU = kotlin.reflect.jvm.internal.impl.protobuf.d.u();
            CodedOutputStream codedOutputStreamJ = CodedOutputStream.J(bVarU, 1);
            boolean z10 = false;
            while (!z10) {
                try {
                    try {
                        int iK = eVar.K();
                        if (iK != 0) {
                            if (iK == 10) {
                                JvmFieldSignature.b bVarT = (this.f127109d & 1) == 1 ? this.f127110e.t() : null;
                                JvmFieldSignature jvmFieldSignature = (JvmFieldSignature) eVar.u(JvmFieldSignature.f127085j, fVar);
                                this.f127110e = jvmFieldSignature;
                                if (bVarT != null) {
                                    bVarT.h(jvmFieldSignature);
                                    this.f127110e = bVarT.m();
                                }
                                this.f127109d |= 1;
                            } else if (iK == 18) {
                                JvmMethodSignature.b bVarT2 = (this.f127109d & 2) == 2 ? this.f127111f.t() : null;
                                JvmMethodSignature jvmMethodSignature = (JvmMethodSignature) eVar.u(JvmMethodSignature.f127096j, fVar);
                                this.f127111f = jvmMethodSignature;
                                if (bVarT2 != null) {
                                    bVarT2.h(jvmMethodSignature);
                                    this.f127111f = bVarT2.m();
                                }
                                this.f127109d |= 2;
                            } else if (iK == 26) {
                                JvmMethodSignature.b bVarT3 = (this.f127109d & 4) == 4 ? this.f127112g.t() : null;
                                JvmMethodSignature jvmMethodSignature2 = (JvmMethodSignature) eVar.u(JvmMethodSignature.f127096j, fVar);
                                this.f127112g = jvmMethodSignature2;
                                if (bVarT3 != null) {
                                    bVarT3.h(jvmMethodSignature2);
                                    this.f127112g = bVarT3.m();
                                }
                                this.f127109d |= 4;
                            } else if (iK == 34) {
                                JvmMethodSignature.b bVarT4 = (this.f127109d & 8) == 8 ? this.f127113h.t() : null;
                                JvmMethodSignature jvmMethodSignature3 = (JvmMethodSignature) eVar.u(JvmMethodSignature.f127096j, fVar);
                                this.f127113h = jvmMethodSignature3;
                                if (bVarT4 != null) {
                                    bVarT4.h(jvmMethodSignature3);
                                    this.f127113h = bVarT4.m();
                                }
                                this.f127109d |= 8;
                            } else if (iK == 42) {
                                JvmMethodSignature.b bVarT5 = (this.f127109d & 16) == 16 ? this.f127114i.t() : null;
                                JvmMethodSignature jvmMethodSignature4 = (JvmMethodSignature) eVar.u(JvmMethodSignature.f127096j, fVar);
                                this.f127114i = jvmMethodSignature4;
                                if (bVarT5 != null) {
                                    bVarT5.h(jvmMethodSignature4);
                                    this.f127114i = bVarT5.m();
                                }
                                this.f127109d |= 16;
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
                        this.f127108c = bVarU.e();
                    }
                    g();
                    throw th2;
                }
            }
            try {
                codedOutputStreamJ.I();
            } catch (IOException unused2) {
            } finally {
                this.f127108c = bVarU.e();
            }
            g();
        }

        private JvmPropertySignature(boolean z10) {
            this.f127115j = (byte) -1;
            this.f127116k = -1;
            this.f127108c = kotlin.reflect.jvm.internal.impl.protobuf.d.f127320b;
        }

        private void L() {
            this.f127110e = JvmFieldSignature.q();
            this.f127111f = JvmMethodSignature.q();
            this.f127112g = JvmMethodSignature.q();
            this.f127113h = JvmMethodSignature.q();
            this.f127114i = JvmMethodSignature.q();
        }

        public static b M() {
            return b.o();
        }

        public static b N(JvmPropertySignature jvmPropertySignature) {
            return M().h(jvmPropertySignature);
        }

        public static JvmPropertySignature y() {
            return f127106l;
        }

        public JvmMethodSignature A() {
            return this.f127114i;
        }

        public JvmFieldSignature B() {
            return this.f127110e;
        }

        public JvmMethodSignature C() {
            return this.f127112g;
        }

        public JvmMethodSignature D() {
            return this.f127113h;
        }

        public JvmMethodSignature E() {
            return this.f127111f;
        }

        public boolean F() {
            return (this.f127109d & 16) == 16;
        }

        public boolean G() {
            return (this.f127109d & 1) == 1;
        }

        public boolean H() {
            return (this.f127109d & 4) == 4;
        }

        public boolean J() {
            return (this.f127109d & 8) == 8;
        }

        public boolean K() {
            return (this.f127109d & 2) == 2;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public b v() {
            return M();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
        public b t() {
            return N(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        public void a(CodedOutputStream codedOutputStream) throws IOException {
            u();
            if ((this.f127109d & 1) == 1) {
                codedOutputStream.d0(1, this.f127110e);
            }
            if ((this.f127109d & 2) == 2) {
                codedOutputStream.d0(2, this.f127111f);
            }
            if ((this.f127109d & 4) == 4) {
                codedOutputStream.d0(3, this.f127112g);
            }
            if ((this.f127109d & 8) == 8) {
                codedOutputStream.d0(4, this.f127113h);
            }
            if ((this.f127109d & 16) == 16) {
                codedOutputStream.d0(5, this.f127114i);
            }
            codedOutputStream.i0(this.f127108c);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public final boolean l() {
            byte b10 = this.f127115j;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.f127115j = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        public int u() {
            int i10 = this.f127116k;
            if (i10 != -1) {
                return i10;
            }
            int iS = (this.f127109d & 1) == 1 ? 0 + CodedOutputStream.s(1, this.f127110e) : 0;
            if ((this.f127109d & 2) == 2) {
                iS += CodedOutputStream.s(2, this.f127111f);
            }
            if ((this.f127109d & 4) == 4) {
                iS += CodedOutputStream.s(3, this.f127112g);
            }
            if ((this.f127109d & 8) == 8) {
                iS += CodedOutputStream.s(4, this.f127113h);
            }
            if ((this.f127109d & 16) == 16) {
                iS += CodedOutputStream.s(5, this.f127114i);
            }
            int size = iS + this.f127108c.size();
            this.f127116k = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.n
        public p<JvmPropertySignature> w() {
            return f127107m;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
        public JvmPropertySignature r() {
            return f127106l;
        }
    }

    public static final class StringTableTypes extends GeneratedMessageLite implements e {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final StringTableTypes f127123i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static p<StringTableTypes> f127124j = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final kotlin.reflect.jvm.internal.impl.protobuf.d f127125c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private List<Record> f127126d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private List<Integer> f127127e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f127128f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private byte f127129g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f127130h;

        public static final class Record extends GeneratedMessageLite implements d {

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            private static final Record f127131o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            public static p<Record> f127132p = new a();

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final kotlin.reflect.jvm.internal.impl.protobuf.d f127133c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f127134d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private int f127135e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private int f127136f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private Object f127137g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private Operation f127138h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private List<Integer> f127139i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            private int f127140j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            private List<Integer> f127141k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            private int f127142l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            private byte f127143m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private int f127144n;

            public enum Operation implements h.a {
                NONE(0, 0),
                INTERNAL_TO_CLASS_ID(1, 1),
                DESC_TO_CLASS_ID(2, 2);

                private static h.b<Operation> internalValueMap = new a();
                private final int value;

                public static final class a implements h.b<Operation> {
                    a() {
                    }

                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
                    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                    public Operation a(int i10) {
                        return Operation.valueOf(i10);
                    }
                }

                Operation(int i10, int i11) {
                    this.value = i11;
                }

                public static Operation valueOf(int i10) {
                    if (i10 == 0) {
                        return NONE;
                    }
                    if (i10 == 1) {
                        return INTERNAL_TO_CLASS_ID;
                    }
                    if (i10 != 2) {
                        return null;
                    }
                    return DESC_TO_CLASS_ID;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.a
                public final int getNumber() {
                    return this.value;
                }
            }

            public static final class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<Record> {
                a() {
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
                /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
                public Record d(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, f fVar) throws InvalidProtocolBufferException {
                    return new Record(eVar, fVar);
                }
            }

            public static final class b extends GeneratedMessageLite.b<Record, b> implements d {

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private int f127145c;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                private int f127147e;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                private int f127146d = 1;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                private Object f127148f = "";

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                private Operation f127149g = Operation.NONE;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                private List<Integer> f127150h = Collections.emptyList();

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                private List<Integer> f127151i = Collections.emptyList();

                private b() {
                    x();
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static b o() {
                    return new b();
                }

                private void p() {
                    if ((this.f127145c & 32) != 32) {
                        this.f127151i = new ArrayList(this.f127151i);
                        this.f127145c |= 32;
                    }
                }

                private void q() {
                    if ((this.f127145c & 16) != 16) {
                        this.f127150h = new ArrayList(this.f127150h);
                        this.f127145c |= 16;
                    }
                }

                private void x() {
                }

                public b B(Operation operation) {
                    operation.getClass();
                    this.f127145c |= 8;
                    this.f127149g = operation;
                    return this;
                }

                public b C(int i10) {
                    this.f127145c |= 2;
                    this.f127147e = i10;
                    return this;
                }

                public b D(int i10) {
                    this.f127145c |= 1;
                    this.f127146d = i10;
                    return this;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.n.a
                /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
                public Record build() {
                    Record recordM = m();
                    if (recordM.l()) {
                        return recordM;
                    }
                    throw kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC1169a.d(recordM);
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
                public final boolean l() {
                    return true;
                }

                public Record m() {
                    Record record = new Record(this);
                    int i10 = this.f127145c;
                    int i11 = (i10 & 1) != 1 ? 0 : 1;
                    record.f127135e = this.f127146d;
                    if ((i10 & 2) == 2) {
                        i11 |= 2;
                    }
                    record.f127136f = this.f127147e;
                    if ((i10 & 4) == 4) {
                        i11 |= 4;
                    }
                    record.f127137g = this.f127148f;
                    if ((i10 & 8) == 8) {
                        i11 |= 8;
                    }
                    record.f127138h = this.f127149g;
                    if ((this.f127145c & 16) == 16) {
                        this.f127150h = Collections.unmodifiableList(this.f127150h);
                        this.f127145c &= -17;
                    }
                    record.f127139i = this.f127150h;
                    if ((this.f127145c & 32) == 32) {
                        this.f127151i = Collections.unmodifiableList(this.f127151i);
                        this.f127145c &= -33;
                    }
                    record.f127141k = this.f127151i;
                    record.f127134d = i11;
                    return record;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public b m() {
                    return o().h(m());
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b, kotlin.reflect.jvm.internal.impl.protobuf.o
                /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
                public Record r() {
                    return Record.C();
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b
                /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
                public b h(Record record) {
                    if (record == Record.C()) {
                        return this;
                    }
                    if (record.Q()) {
                        D(record.G());
                    }
                    if (record.P()) {
                        C(record.F());
                    }
                    if (record.R()) {
                        this.f127145c |= 4;
                        this.f127148f = record.f127137g;
                    }
                    if (record.O()) {
                        B(record.E());
                    }
                    if (!record.f127139i.isEmpty()) {
                        if (this.f127150h.isEmpty()) {
                            this.f127150h = record.f127139i;
                            this.f127145c &= -17;
                        } else {
                            q();
                            this.f127150h.addAll(record.f127139i);
                        }
                    }
                    if (!record.f127141k.isEmpty()) {
                        if (this.f127151i.isEmpty()) {
                            this.f127151i = record.f127141k;
                            this.f127145c &= -33;
                        } else {
                            p();
                            this.f127151i.addAll(record.f127141k);
                        }
                    }
                    i(g().b(record.f127133c));
                    return this;
                }

                /* JADX WARN: Code duplicated, block: B:15:0x001d  */
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC1169a
                /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
                public b c(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, f fVar) throws Throwable {
                    Record record = null;
                    try {
                        try {
                            Record recordD = Record.f127132p.d(eVar, fVar);
                            if (recordD != null) {
                                h(recordD);
                            }
                            return this;
                        } catch (InvalidProtocolBufferException e10) {
                            Record record2 = (Record) e10.a();
                            try {
                                throw e10;
                            } catch (Throwable th2) {
                                th = th2;
                                record = record2;
                                if (record != null) {
                                    h(record);
                                }
                                throw th;
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        if (record != null) {
                            h(record);
                        }
                        throw th;
                    }
                }
            }

            static {
                Record record = new Record(true);
                f127131o = record;
                record.S();
            }

            private Record(GeneratedMessageLite.b bVar) {
                super(bVar);
                this.f127140j = -1;
                this.f127142l = -1;
                this.f127143m = (byte) -1;
                this.f127144n = -1;
                this.f127133c = bVar.g();
            }

            private Record(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, f fVar) throws InvalidProtocolBufferException {
                this.f127140j = -1;
                this.f127142l = -1;
                this.f127143m = (byte) -1;
                this.f127144n = -1;
                S();
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
                                    this.f127134d |= 1;
                                    this.f127135e = eVar.s();
                                } else if (iK == 16) {
                                    this.f127134d |= 2;
                                    this.f127136f = eVar.s();
                                } else if (iK == 24) {
                                    int iN = eVar.n();
                                    Operation operationValueOf = Operation.valueOf(iN);
                                    if (operationValueOf == null) {
                                        codedOutputStreamJ.o0(iK);
                                        codedOutputStreamJ.o0(iN);
                                    } else {
                                        this.f127134d |= 8;
                                        this.f127138h = operationValueOf;
                                    }
                                } else if (iK == 32) {
                                    if ((i10 & 16) != 16) {
                                        this.f127139i = new ArrayList();
                                        i10 |= 16;
                                    }
                                    this.f127139i.add(Integer.valueOf(eVar.s()));
                                } else if (iK == 34) {
                                    int iJ = eVar.j(eVar.A());
                                    if ((i10 & 16) != 16 && eVar.e() > 0) {
                                        this.f127139i = new ArrayList();
                                        i10 |= 16;
                                    }
                                    while (eVar.e() > 0) {
                                        this.f127139i.add(Integer.valueOf(eVar.s()));
                                    }
                                    eVar.i(iJ);
                                } else if (iK == 40) {
                                    if ((i10 & 32) != 32) {
                                        this.f127141k = new ArrayList();
                                        i10 |= 32;
                                    }
                                    this.f127141k.add(Integer.valueOf(eVar.s()));
                                } else if (iK == 42) {
                                    int iJ2 = eVar.j(eVar.A());
                                    if ((i10 & 32) != 32 && eVar.e() > 0) {
                                        this.f127141k = new ArrayList();
                                        i10 |= 32;
                                    }
                                    while (eVar.e() > 0) {
                                        this.f127141k.add(Integer.valueOf(eVar.s()));
                                    }
                                    eVar.i(iJ2);
                                } else if (iK == 50) {
                                    kotlin.reflect.jvm.internal.impl.protobuf.d dVarL = eVar.l();
                                    this.f127134d |= 4;
                                    this.f127137g = dVarL;
                                } else if (!j(eVar, codedOutputStreamJ, fVar, iK)) {
                                }
                            }
                            z10 = true;
                        } catch (Throwable th2) {
                            if ((i10 & 16) == 16) {
                                this.f127139i = Collections.unmodifiableList(this.f127139i);
                            }
                            if ((i10 & 32) == 32) {
                                this.f127141k = Collections.unmodifiableList(this.f127141k);
                            }
                            try {
                                codedOutputStreamJ.I();
                            } catch (IOException unused) {
                            } finally {
                                this.f127133c = bVarU.e();
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
                if ((i10 & 16) == 16) {
                    this.f127139i = Collections.unmodifiableList(this.f127139i);
                }
                if ((i10 & 32) == 32) {
                    this.f127141k = Collections.unmodifiableList(this.f127141k);
                }
                try {
                    codedOutputStreamJ.I();
                } catch (IOException unused2) {
                } finally {
                    this.f127133c = bVarU.e();
                }
                g();
            }

            private Record(boolean z10) {
                this.f127140j = -1;
                this.f127142l = -1;
                this.f127143m = (byte) -1;
                this.f127144n = -1;
                this.f127133c = kotlin.reflect.jvm.internal.impl.protobuf.d.f127320b;
            }

            public static Record C() {
                return f127131o;
            }

            private void S() {
                this.f127135e = 1;
                this.f127136f = 0;
                this.f127137g = "";
                this.f127138h = Operation.NONE;
                this.f127139i = Collections.emptyList();
                this.f127141k = Collections.emptyList();
            }

            public static b T() {
                return b.o();
            }

            public static b U(Record record) {
                return T().h(record);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
            /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
            public Record r() {
                return f127131o;
            }

            public Operation E() {
                return this.f127138h;
            }

            public int F() {
                return this.f127136f;
            }

            public int G() {
                return this.f127135e;
            }

            public int H() {
                return this.f127141k.size();
            }

            public List<Integer> J() {
                return this.f127141k;
            }

            public String K() {
                Object obj = this.f127137g;
                if (obj instanceof String) {
                    return (String) obj;
                }
                kotlin.reflect.jvm.internal.impl.protobuf.d dVar = (kotlin.reflect.jvm.internal.impl.protobuf.d) obj;
                String strB = dVar.B();
                if (dVar.q()) {
                    this.f127137g = strB;
                }
                return strB;
            }

            public kotlin.reflect.jvm.internal.impl.protobuf.d L() {
                Object obj = this.f127137g;
                if (!(obj instanceof String)) {
                    return (kotlin.reflect.jvm.internal.impl.protobuf.d) obj;
                }
                kotlin.reflect.jvm.internal.impl.protobuf.d dVarI = kotlin.reflect.jvm.internal.impl.protobuf.d.i((String) obj);
                this.f127137g = dVarI;
                return dVarI;
            }

            public int M() {
                return this.f127139i.size();
            }

            public List<Integer> N() {
                return this.f127139i;
            }

            public boolean O() {
                return (this.f127134d & 8) == 8;
            }

            public boolean P() {
                return (this.f127134d & 2) == 2;
            }

            public boolean Q() {
                return (this.f127134d & 1) == 1;
            }

            public boolean R() {
                return (this.f127134d & 4) == 4;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
            /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
            public b v() {
                return T();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
            /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
            public b t() {
                return U(this);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
            public void a(CodedOutputStream codedOutputStream) throws IOException {
                u();
                if ((this.f127134d & 1) == 1) {
                    codedOutputStream.a0(1, this.f127135e);
                }
                if ((this.f127134d & 2) == 2) {
                    codedOutputStream.a0(2, this.f127136f);
                }
                if ((this.f127134d & 8) == 8) {
                    codedOutputStream.S(3, this.f127138h.getNumber());
                }
                if (N().size() > 0) {
                    codedOutputStream.o0(34);
                    codedOutputStream.o0(this.f127140j);
                }
                for (int i10 = 0; i10 < this.f127139i.size(); i10++) {
                    codedOutputStream.b0(this.f127139i.get(i10).intValue());
                }
                if (J().size() > 0) {
                    codedOutputStream.o0(42);
                    codedOutputStream.o0(this.f127142l);
                }
                for (int i11 = 0; i11 < this.f127141k.size(); i11++) {
                    codedOutputStream.b0(this.f127141k.get(i11).intValue());
                }
                if ((this.f127134d & 4) == 4) {
                    codedOutputStream.O(6, L());
                }
                codedOutputStream.i0(this.f127133c);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
            public final boolean l() {
                byte b10 = this.f127143m;
                if (b10 == 1) {
                    return true;
                }
                if (b10 == 0) {
                    return false;
                }
                this.f127143m = (byte) 1;
                return true;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
            public int u() {
                int i10 = this.f127144n;
                if (i10 != -1) {
                    return i10;
                }
                int iO = (this.f127134d & 1) == 1 ? CodedOutputStream.o(1, this.f127135e) + 0 : 0;
                if ((this.f127134d & 2) == 2) {
                    iO += CodedOutputStream.o(2, this.f127136f);
                }
                if ((this.f127134d & 8) == 8) {
                    iO += CodedOutputStream.h(3, this.f127138h.getNumber());
                }
                int iP = 0;
                for (int i11 = 0; i11 < this.f127139i.size(); i11++) {
                    iP += CodedOutputStream.p(this.f127139i.get(i11).intValue());
                }
                int iP2 = iO + iP;
                if (!N().isEmpty()) {
                    iP2 = iP2 + 1 + CodedOutputStream.p(iP);
                }
                this.f127140j = iP;
                int iP3 = 0;
                for (int i12 = 0; i12 < this.f127141k.size(); i12++) {
                    iP3 += CodedOutputStream.p(this.f127141k.get(i12).intValue());
                }
                int iD = iP2 + iP3;
                if (!J().isEmpty()) {
                    iD = iD + 1 + CodedOutputStream.p(iP3);
                }
                this.f127142l = iP3;
                if ((this.f127134d & 4) == 4) {
                    iD += CodedOutputStream.d(6, L());
                }
                int size = iD + this.f127133c.size();
                this.f127144n = size;
                return size;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.n
            public p<Record> w() {
                return f127132p;
            }
        }

        public static final class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<StringTableTypes> {
            a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public StringTableTypes d(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, f fVar) throws InvalidProtocolBufferException {
                return new StringTableTypes(eVar, fVar);
            }
        }

        public static final class b extends GeneratedMessageLite.b<StringTableTypes, b> implements e {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private int f127152c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private List<Record> f127153d = Collections.emptyList();

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private List<Integer> f127154e = Collections.emptyList();

            private b() {
                x();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static b o() {
                return new b();
            }

            private void p() {
                if ((this.f127152c & 2) != 2) {
                    this.f127154e = new ArrayList(this.f127154e);
                    this.f127152c |= 2;
                }
            }

            private void q() {
                if ((this.f127152c & 1) != 1) {
                    this.f127153d = new ArrayList(this.f127153d);
                    this.f127152c |= 1;
                }
            }

            private void x() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.n.a
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public StringTableTypes build() {
                StringTableTypes stringTableTypesM = m();
                if (stringTableTypesM.l()) {
                    return stringTableTypesM;
                }
                throw kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC1169a.d(stringTableTypesM);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
            public final boolean l() {
                return true;
            }

            public StringTableTypes m() {
                StringTableTypes stringTableTypes = new StringTableTypes(this);
                if ((this.f127152c & 1) == 1) {
                    this.f127153d = Collections.unmodifiableList(this.f127153d);
                    this.f127152c &= -2;
                }
                stringTableTypes.f127126d = this.f127153d;
                if ((this.f127152c & 2) == 2) {
                    this.f127154e = Collections.unmodifiableList(this.f127154e);
                    this.f127152c &= -3;
                }
                stringTableTypes.f127127e = this.f127154e;
                return stringTableTypes;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public b m() {
                return o().h(m());
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b, kotlin.reflect.jvm.internal.impl.protobuf.o
            /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
            public StringTableTypes r() {
                return StringTableTypes.s();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b
            /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
            public b h(StringTableTypes stringTableTypes) {
                if (stringTableTypes == StringTableTypes.s()) {
                    return this;
                }
                if (!stringTableTypes.f127126d.isEmpty()) {
                    if (this.f127153d.isEmpty()) {
                        this.f127153d = stringTableTypes.f127126d;
                        this.f127152c &= -2;
                    } else {
                        q();
                        this.f127153d.addAll(stringTableTypes.f127126d);
                    }
                }
                if (!stringTableTypes.f127127e.isEmpty()) {
                    if (this.f127154e.isEmpty()) {
                        this.f127154e = stringTableTypes.f127127e;
                        this.f127152c &= -3;
                    } else {
                        p();
                        this.f127154e.addAll(stringTableTypes.f127127e);
                    }
                }
                i(g().b(stringTableTypes.f127125c));
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC1169a
            /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
            public b c(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, f fVar) throws Throwable {
                StringTableTypes stringTableTypes = null;
                try {
                    try {
                        StringTableTypes stringTableTypesD = StringTableTypes.f127124j.d(eVar, fVar);
                        if (stringTableTypesD != null) {
                            h(stringTableTypesD);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e10) {
                        StringTableTypes stringTableTypes2 = (StringTableTypes) e10.a();
                        try {
                            throw e10;
                        } catch (Throwable th2) {
                            th = th2;
                            stringTableTypes = stringTableTypes2;
                            if (stringTableTypes != null) {
                                h(stringTableTypes);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (stringTableTypes != null) {
                        h(stringTableTypes);
                    }
                    throw th;
                }
            }
        }

        static {
            StringTableTypes stringTableTypes = new StringTableTypes(true);
            f127123i = stringTableTypes;
            stringTableTypes.A();
        }

        private StringTableTypes(GeneratedMessageLite.b bVar) {
            super(bVar);
            this.f127128f = -1;
            this.f127129g = (byte) -1;
            this.f127130h = -1;
            this.f127125c = bVar.g();
        }

        private StringTableTypes(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, f fVar) throws InvalidProtocolBufferException {
            this.f127128f = -1;
            this.f127129g = (byte) -1;
            this.f127130h = -1;
            A();
            kotlin.reflect.jvm.internal.impl.protobuf.d.b bVarU = kotlin.reflect.jvm.internal.impl.protobuf.d.u();
            CodedOutputStream codedOutputStreamJ = CodedOutputStream.J(bVarU, 1);
            boolean z10 = false;
            int i10 = 0;
            while (!z10) {
                try {
                    try {
                        int iK = eVar.K();
                        if (iK != 0) {
                            if (iK == 10) {
                                if ((i10 & 1) != 1) {
                                    this.f127126d = new ArrayList();
                                    i10 |= 1;
                                }
                                this.f127126d.add((Record) eVar.u(Record.f127132p, fVar));
                            } else if (iK == 40) {
                                if ((i10 & 2) != 2) {
                                    this.f127127e = new ArrayList();
                                    i10 |= 2;
                                }
                                this.f127127e.add(Integer.valueOf(eVar.s()));
                            } else if (iK == 42) {
                                int iJ = eVar.j(eVar.A());
                                if ((i10 & 2) != 2 && eVar.e() > 0) {
                                    this.f127127e = new ArrayList();
                                    i10 |= 2;
                                }
                                while (eVar.e() > 0) {
                                    this.f127127e.add(Integer.valueOf(eVar.s()));
                                }
                                eVar.i(iJ);
                            } else if (!j(eVar, codedOutputStreamJ, fVar, iK)) {
                            }
                        }
                        z10 = true;
                    } catch (Throwable th2) {
                        if ((i10 & 1) == 1) {
                            this.f127126d = Collections.unmodifiableList(this.f127126d);
                        }
                        if ((i10 & 2) == 2) {
                            this.f127127e = Collections.unmodifiableList(this.f127127e);
                        }
                        try {
                            codedOutputStreamJ.I();
                        } catch (IOException unused) {
                        } finally {
                            this.f127125c = bVarU.e();
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
            if ((i10 & 1) == 1) {
                this.f127126d = Collections.unmodifiableList(this.f127126d);
            }
            if ((i10 & 2) == 2) {
                this.f127127e = Collections.unmodifiableList(this.f127127e);
            }
            try {
                codedOutputStreamJ.I();
            } catch (IOException unused2) {
            } finally {
                this.f127125c = bVarU.e();
            }
            g();
        }

        private StringTableTypes(boolean z10) {
            this.f127128f = -1;
            this.f127129g = (byte) -1;
            this.f127130h = -1;
            this.f127125c = kotlin.reflect.jvm.internal.impl.protobuf.d.f127320b;
        }

        private void A() {
            this.f127126d = Collections.emptyList();
            this.f127127e = Collections.emptyList();
        }

        public static b B() {
            return b.o();
        }

        public static b C(StringTableTypes stringTableTypes) {
            return B().h(stringTableTypes);
        }

        public static StringTableTypes E(InputStream inputStream, f fVar) throws IOException {
            return f127124j.a(inputStream, fVar);
        }

        public static StringTableTypes s() {
            return f127123i;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
        public b v() {
            return B();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
        public b t() {
            return C(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        public void a(CodedOutputStream codedOutputStream) throws IOException {
            u();
            for (int i10 = 0; i10 < this.f127126d.size(); i10++) {
                codedOutputStream.d0(1, this.f127126d.get(i10));
            }
            if (y().size() > 0) {
                codedOutputStream.o0(42);
                codedOutputStream.o0(this.f127128f);
            }
            for (int i11 = 0; i11 < this.f127127e.size(); i11++) {
                codedOutputStream.b0(this.f127127e.get(i11).intValue());
            }
            codedOutputStream.i0(this.f127125c);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public final boolean l() {
            byte b10 = this.f127129g;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.f127129g = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        public int u() {
            int i10 = this.f127130h;
            if (i10 != -1) {
                return i10;
            }
            int iS = 0;
            for (int i11 = 0; i11 < this.f127126d.size(); i11++) {
                iS += CodedOutputStream.s(1, this.f127126d.get(i11));
            }
            int iP = 0;
            for (int i12 = 0; i12 < this.f127127e.size(); i12++) {
                iP += CodedOutputStream.p(this.f127127e.get(i12).intValue());
            }
            int iP2 = iS + iP;
            if (!y().isEmpty()) {
                iP2 = iP2 + 1 + CodedOutputStream.p(iP);
            }
            this.f127128f = iP;
            int size = iP2 + this.f127125c.size();
            this.f127130h = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.n
        public p<StringTableTypes> w() {
            return f127124j;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
        public StringTableTypes r() {
            return f127123i;
        }

        public List<Integer> y() {
            return this.f127127e;
        }

        public List<Record> z() {
            return this.f127126d;
        }
    }

    static {
        ProtoBuf.Constructor constructorH = ProtoBuf.Constructor.H();
        JvmMethodSignature jvmMethodSignatureQ = JvmMethodSignature.q();
        JvmMethodSignature jvmMethodSignatureQ2 = JvmMethodSignature.q();
        WireFormat.FieldType fieldType = WireFormat.FieldType.MESSAGE;
        f127070a = GeneratedMessageLite.i(constructorH, jvmMethodSignatureQ, jvmMethodSignatureQ2, null, 100, fieldType, JvmMethodSignature.class);
        f127071b = GeneratedMessageLite.i(ProtoBuf.Function.b0(), JvmMethodSignature.q(), JvmMethodSignature.q(), null, 100, fieldType, JvmMethodSignature.class);
        ProtoBuf.Function functionB0 = ProtoBuf.Function.b0();
        WireFormat.FieldType fieldType2 = WireFormat.FieldType.INT32;
        f127072c = GeneratedMessageLite.i(functionB0, 0, null, null, 101, fieldType2, Integer.class);
        f127073d = GeneratedMessageLite.i(ProtoBuf.Property.Z(), JvmPropertySignature.y(), JvmPropertySignature.y(), null, 100, fieldType, JvmPropertySignature.class);
        f127074e = GeneratedMessageLite.i(ProtoBuf.Property.Z(), 0, null, null, 101, fieldType2, Integer.class);
        f127075f = GeneratedMessageLite.h(ProtoBuf.Type.Y(), ProtoBuf.Annotation.z(), null, 100, fieldType, false, ProtoBuf.Annotation.class);
        f127076g = GeneratedMessageLite.i(ProtoBuf.Type.Y(), Boolean.FALSE, null, null, 101, WireFormat.FieldType.BOOL, Boolean.class);
        f127077h = GeneratedMessageLite.h(ProtoBuf.TypeParameter.L(), ProtoBuf.Annotation.z(), null, 100, fieldType, false, ProtoBuf.Annotation.class);
        f127078i = GeneratedMessageLite.i(ProtoBuf.Class.z0(), 0, null, null, 101, fieldType2, Integer.class);
        f127079j = GeneratedMessageLite.h(ProtoBuf.Class.z0(), ProtoBuf.Property.Z(), null, 102, fieldType, false, ProtoBuf.Property.class);
        f127080k = GeneratedMessageLite.i(ProtoBuf.Class.z0(), 0, null, null, 103, fieldType2, Integer.class);
        f127081l = GeneratedMessageLite.i(ProtoBuf.Class.z0(), 0, null, null, 104, fieldType2, Integer.class);
        f127082m = GeneratedMessageLite.i(ProtoBuf.Package.L(), 0, null, null, 101, fieldType2, Integer.class);
        f127083n = GeneratedMessageLite.h(ProtoBuf.Package.L(), ProtoBuf.Property.Z(), null, 102, fieldType, false, ProtoBuf.Property.class);
    }

    public static void a(f fVar) {
        fVar.a(f127070a);
        fVar.a(f127071b);
        fVar.a(f127072c);
        fVar.a(f127073d);
        fVar.a(f127074e);
        fVar.a(f127075f);
        fVar.a(f127076g);
        fVar.a(f127077h);
        fVar.a(f127078i);
        fVar.a(f127079j);
        fVar.a(f127080k);
        fVar.a(f127081l);
        fVar.a(f127082m);
        fVar.a(f127083n);
    }
}
