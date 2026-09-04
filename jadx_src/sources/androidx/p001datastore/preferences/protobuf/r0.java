package androidx.p001datastore.preferences.protobuf;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: ExtensionSchemaLite.java */
/* JADX INFO: loaded from: classes6.dex */
public final class r0 extends q0<GeneratedMessageLite.g> {

    /* JADX INFO: compiled from: ExtensionSchemaLite.java */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f22583a;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f22583a = iArr;
            try {
                iArr[WireFormat.FieldType.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22583a[WireFormat.FieldType.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22583a[WireFormat.FieldType.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22583a[WireFormat.FieldType.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22583a[WireFormat.FieldType.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f22583a[WireFormat.FieldType.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f22583a[WireFormat.FieldType.FIXED32.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f22583a[WireFormat.FieldType.BOOL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f22583a[WireFormat.FieldType.UINT32.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f22583a[WireFormat.FieldType.SFIXED32.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f22583a[WireFormat.FieldType.SFIXED64.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f22583a[WireFormat.FieldType.SINT32.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f22583a[WireFormat.FieldType.SINT64.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f22583a[WireFormat.FieldType.ENUM.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f22583a[WireFormat.FieldType.BYTES.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f22583a[WireFormat.FieldType.STRING.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f22583a[WireFormat.FieldType.GROUP.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f22583a[WireFormat.FieldType.MESSAGE.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    r0() {
    }

    @Override // androidx.p001datastore.preferences.protobuf.q0
    int a(Map.Entry<?, ?> entry) {
        return ((GeneratedMessageLite.g) entry.getKey()).getNumber();
    }

    @Override // androidx.p001datastore.preferences.protobuf.q0
    Object b(p0 p0Var, z1 z1Var, int i10) {
        return p0Var.c(z1Var, i10);
    }

    @Override // androidx.p001datastore.preferences.protobuf.q0
    y0<GeneratedMessageLite.g> c(Object obj) {
        return ((GeneratedMessageLite.e) obj).extensions;
    }

    @Override // androidx.p001datastore.preferences.protobuf.q0
    y0<GeneratedMessageLite.g> d(Object obj) {
        return ((GeneratedMessageLite.e) obj).I2();
    }

    @Override // androidx.p001datastore.preferences.protobuf.q0
    boolean e(z1 z1Var) {
        return z1Var instanceof GeneratedMessageLite.e;
    }

    @Override // androidx.p001datastore.preferences.protobuf.q0
    void f(Object obj) {
        c(obj).I();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // androidx.p001datastore.preferences.protobuf.q0
    <UT, UB> UB g(w2 w2Var, Object obj, p0 p0Var, y0<GeneratedMessageLite.g> y0Var, UB ub2, v3<UT, UB> v3Var) throws IOException {
        Object objU;
        ArrayList arrayList;
        GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
        int iD = hVar.d();
        if (hVar.f22313d.H() && hVar.f22313d.isPacked()) {
            switch (a.f22583a[hVar.b().ordinal()]) {
                case 1:
                    arrayList = new ArrayList();
                    w2Var.v(arrayList);
                    break;
                case 2:
                    arrayList = new ArrayList();
                    w2Var.r(arrayList);
                    break;
                case 3:
                    arrayList = new ArrayList();
                    w2Var.C(arrayList);
                    break;
                case 4:
                    arrayList = new ArrayList();
                    w2Var.B(arrayList);
                    break;
                case 5:
                    arrayList = new ArrayList();
                    w2Var.n(arrayList);
                    break;
                case 6:
                    arrayList = new ArrayList();
                    w2Var.H(arrayList);
                    break;
                case 7:
                    arrayList = new ArrayList();
                    w2Var.o(arrayList);
                    break;
                case 8:
                    arrayList = new ArrayList();
                    w2Var.f(arrayList);
                    break;
                case 9:
                    arrayList = new ArrayList();
                    w2Var.I(arrayList);
                    break;
                case 10:
                    arrayList = new ArrayList();
                    w2Var.z(arrayList);
                    break;
                case 11:
                    arrayList = new ArrayList();
                    w2Var.m(arrayList);
                    break;
                case 12:
                    arrayList = new ArrayList();
                    w2Var.i(arrayList);
                    break;
                case 13:
                    arrayList = new ArrayList();
                    w2Var.a(arrayList);
                    break;
                case 14:
                    arrayList = new ArrayList();
                    w2Var.D(arrayList);
                    ub2 = (UB) z2.B(iD, arrayList, hVar.f22313d.F0(), ub2, v3Var);
                    break;
                default:
                    throw new IllegalStateException("Type cannot be packed: " + hVar.f22313d.E());
            }
            y0Var.O(hVar.f22313d, arrayList);
        } else {
            Object objValueOf = null;
            if (hVar.b() != WireFormat.FieldType.ENUM) {
                switch (a.f22583a[hVar.b().ordinal()]) {
                    case 1:
                        objValueOf = Double.valueOf(w2Var.readDouble());
                        break;
                    case 2:
                        objValueOf = Float.valueOf(w2Var.readFloat());
                        break;
                    case 3:
                        objValueOf = Long.valueOf(w2Var.w());
                        break;
                    case 4:
                        objValueOf = Long.valueOf(w2Var.j());
                        break;
                    case 5:
                        objValueOf = Integer.valueOf(w2Var.F());
                        break;
                    case 6:
                        objValueOf = Long.valueOf(w2Var.y());
                        break;
                    case 7:
                        objValueOf = Integer.valueOf(w2Var.J());
                        break;
                    case 8:
                        objValueOf = Boolean.valueOf(w2Var.A());
                        break;
                    case 9:
                        objValueOf = Integer.valueOf(w2Var.c());
                        break;
                    case 10:
                        objValueOf = Integer.valueOf(w2Var.Q());
                        break;
                    case 11:
                        objValueOf = Long.valueOf(w2Var.b());
                        break;
                    case 12:
                        objValueOf = Integer.valueOf(w2Var.e());
                        break;
                    case 13:
                        objValueOf = Long.valueOf(w2Var.N());
                        break;
                    case 14:
                        throw new IllegalStateException("Shouldn't reach here.");
                    case 15:
                        objValueOf = w2Var.g();
                        break;
                    case 16:
                        objValueOf = w2Var.O();
                        break;
                    case 17:
                        objValueOf = w2Var.K(hVar.c().getClass(), p0Var);
                        break;
                    case 18:
                        objValueOf = w2Var.k(hVar.c().getClass(), p0Var);
                        break;
                }
            } else {
                int iF = w2Var.F();
                if (hVar.f22313d.F0().a(iF) == null) {
                    return (UB) z2.Q(iD, iF, ub2, v3Var);
                }
                objValueOf = Integer.valueOf(iF);
            }
            if (hVar.f()) {
                y0Var.h(hVar.f22313d, objValueOf);
            } else {
                int i10 = a.f22583a[hVar.b().ordinal()];
                if ((i10 == 17 || i10 == 18) && (objU = y0Var.u(hVar.f22313d)) != null) {
                    objValueOf = i1.v(objU, objValueOf);
                }
                y0Var.O(hVar.f22313d, objValueOf);
            }
        }
        return ub2;
    }

    @Override // androidx.p001datastore.preferences.protobuf.q0
    void h(w2 w2Var, Object obj, p0 p0Var, y0<GeneratedMessageLite.g> y0Var) throws IOException {
        GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
        y0Var.O(hVar.f22313d, w2Var.k(hVar.c().getClass(), p0Var));
    }

    @Override // androidx.p001datastore.preferences.protobuf.q0
    void i(ByteString byteString, Object obj, p0 p0Var, y0<GeneratedMessageLite.g> y0Var) throws IOException {
        GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
        z1 z1VarA1 = hVar.c().v().a1();
        m mVarT = m.T(ByteBuffer.wrap(byteString.d0()), true);
        r2.a().f(z1VarA1, mVarT, p0Var);
        y0Var.O(hVar.f22313d, z1VarA1);
        if (mVarT.p() != Integer.MAX_VALUE) {
            throw InvalidProtocolBufferException.b();
        }
    }

    @Override // androidx.p001datastore.preferences.protobuf.q0
    void j(Writer writer, Map.Entry<?, ?> entry) throws IOException {
        GeneratedMessageLite.g gVar = (GeneratedMessageLite.g) entry.getKey();
        if (!gVar.H()) {
            switch (a.f22583a[gVar.E().ordinal()]) {
                case 1:
                    writer.G(gVar.getNumber(), ((Double) entry.getValue()).doubleValue());
                    break;
                case 2:
                    writer.P(gVar.getNumber(), ((Float) entry.getValue()).floatValue());
                    break;
                case 3:
                    writer.L(gVar.getNumber(), ((Long) entry.getValue()).longValue());
                    break;
                case 4:
                    writer.f(gVar.getNumber(), ((Long) entry.getValue()).longValue());
                    break;
                case 5:
                    writer.h(gVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 6:
                    writer.q(gVar.getNumber(), ((Long) entry.getValue()).longValue());
                    break;
                case 7:
                    writer.c(gVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 8:
                    writer.s(gVar.getNumber(), ((Boolean) entry.getValue()).booleanValue());
                    break;
                case 9:
                    writer.o(gVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 10:
                    writer.t(gVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 11:
                    writer.C(gVar.getNumber(), ((Long) entry.getValue()).longValue());
                    break;
                case 12:
                    writer.S(gVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 13:
                    writer.m(gVar.getNumber(), ((Long) entry.getValue()).longValue());
                    break;
                case 14:
                    writer.h(gVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 15:
                    writer.i(gVar.getNumber(), (ByteString) entry.getValue());
                    break;
                case 16:
                    writer.e(gVar.getNumber(), (String) entry.getValue());
                    break;
                case 17:
                    writer.F(gVar.getNumber(), entry.getValue(), r2.a().i(entry.getValue().getClass()));
                    break;
                case 18:
                    writer.k(gVar.getNumber(), entry.getValue(), r2.a().i(entry.getValue().getClass()));
                    break;
            }
        }
        switch (a.f22583a[gVar.E().ordinal()]) {
            case 1:
                z2.Y(gVar.getNumber(), (List) entry.getValue(), writer, gVar.isPacked());
                break;
            case 2:
                z2.g0(gVar.getNumber(), (List) entry.getValue(), writer, gVar.isPacked());
                break;
            case 3:
                z2.m0(gVar.getNumber(), (List) entry.getValue(), writer, gVar.isPacked());
                break;
            case 4:
                z2.F0(gVar.getNumber(), (List) entry.getValue(), writer, gVar.isPacked());
                break;
            case 5:
                z2.k0(gVar.getNumber(), (List) entry.getValue(), writer, gVar.isPacked());
                break;
            case 6:
                z2.e0(gVar.getNumber(), (List) entry.getValue(), writer, gVar.isPacked());
                break;
            case 7:
                z2.c0(gVar.getNumber(), (List) entry.getValue(), writer, gVar.isPacked());
                break;
            case 8:
                z2.U(gVar.getNumber(), (List) entry.getValue(), writer, gVar.isPacked());
                break;
            case 9:
                z2.D0(gVar.getNumber(), (List) entry.getValue(), writer, gVar.isPacked());
                break;
            case 10:
                z2.s0(gVar.getNumber(), (List) entry.getValue(), writer, gVar.isPacked());
                break;
            case 11:
                z2.u0(gVar.getNumber(), (List) entry.getValue(), writer, gVar.isPacked());
                break;
            case 12:
                z2.w0(gVar.getNumber(), (List) entry.getValue(), writer, gVar.isPacked());
                break;
            case 13:
                z2.y0(gVar.getNumber(), (List) entry.getValue(), writer, gVar.isPacked());
                break;
            case 14:
                z2.k0(gVar.getNumber(), (List) entry.getValue(), writer, gVar.isPacked());
                break;
            case 15:
                z2.W(gVar.getNumber(), (List) entry.getValue(), writer);
                break;
            case 16:
                z2.B0(gVar.getNumber(), (List) entry.getValue(), writer);
                break;
            case 17:
                List list = (List) entry.getValue();
                if (list != null && !list.isEmpty()) {
                    z2.i0(gVar.getNumber(), (List) entry.getValue(), writer, r2.a().i(list.get(0).getClass()));
                    break;
                }
                break;
            case 18:
                List list2 = (List) entry.getValue();
                if (list2 != null && !list2.isEmpty()) {
                    z2.q0(gVar.getNumber(), (List) entry.getValue(), writer, r2.a().i(list2.get(0).getClass()));
                    break;
                }
                break;
        }
    }

    @Override // androidx.p001datastore.preferences.protobuf.q0
    void k(Object obj, y0<GeneratedMessageLite.g> y0Var) {
        ((GeneratedMessageLite.e) obj).extensions = y0Var;
    }
}
