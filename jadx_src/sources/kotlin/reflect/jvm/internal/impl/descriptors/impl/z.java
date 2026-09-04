package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import com.max.xiaoheihe.bean.bbs.TopicHashtagWrapper;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.b1;
import kotlin.reflect.jvm.internal.impl.descriptors.n0;
import kotlin.reflect.jvm.internal.impl.descriptors.o0;
import kotlin.reflect.jvm.internal.impl.descriptors.p0;
import kotlin.reflect.jvm.internal.impl.descriptors.q0;
import kotlin.reflect.jvm.internal.impl.descriptors.r0;
import kotlin.reflect.jvm.internal.impl.descriptors.t0;
import kotlin.reflect.jvm.internal.impl.descriptors.y0;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.f1;
import org.apache.tools.ant.types.x1;

/* JADX INFO: compiled from: PropertyDescriptorImpl.java */
/* JADX INFO: loaded from: classes5.dex */
public class z extends i0 implements o0 {
    private a0 A;
    private q0 B;
    private boolean C;
    private kotlin.reflect.jvm.internal.impl.descriptors.v D;
    private kotlin.reflect.jvm.internal.impl.descriptors.v E;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Modality f125832l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private kotlin.reflect.jvm.internal.impl.descriptors.s f125833m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Collection<? extends o0> f125834n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final o0 f125835o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final CallableMemberDescriptor.Kind f125836p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final boolean f125837q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final boolean f125838r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final boolean f125839s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final boolean f125840t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final boolean f125841u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final boolean f125842v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private List<r0> f125843w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private r0 f125844x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private r0 f125845y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private List<y0> f125846z;

    /* JADX INFO: compiled from: PropertyDescriptorImpl.java */
    public class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private kotlin.reflect.jvm.internal.impl.descriptors.k f125847a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Modality f125848b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private kotlin.reflect.jvm.internal.impl.descriptors.s f125849c;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private CallableMemberDescriptor.Kind f125852f;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private r0 f125855i;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private kotlin.reflect.jvm.internal.impl.name.f f125857k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private kotlin.reflect.jvm.internal.impl.types.d0 f125858l;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private o0 f125850d = null;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f125851e = false;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private f1 f125853g = f1.f128131b;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f125854h = true;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private List<y0> f125856j = null;

        public a() {
            this.f125847a = z.this.c();
            this.f125848b = z.this.l();
            this.f125849c = z.this.getVisibility();
            this.f125852f = z.this.b();
            this.f125855i = z.this.f125844x;
            this.f125857k = z.this.getName();
            this.f125858l = z.this.getType();
        }

        private static /* synthetic */ void a(int i10) {
            String str = (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 5 || i10 == 7 || i10 == 9 || i10 == 11 || i10 == 19 || i10 == 13 || i10 == 14 || i10 == 16 || i10 == 17) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i10 == 1 || i10 == 2 || i10 == 3 || i10 == 5 || i10 == 7 || i10 == 9 || i10 == 11 || i10 == 19 || i10 == 13 || i10 == 14 || i10 == 16 || i10 == 17) ? 2 : 3];
            switch (i10) {
                case 1:
                case 2:
                case 3:
                case 5:
                case 7:
                case 9:
                case 11:
                case 13:
                case 14:
                case 16:
                case 17:
                case 19:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration";
                    break;
                case 4:
                    objArr[0] = "type";
                    break;
                case 6:
                    objArr[0] = "modality";
                    break;
                case 8:
                    objArr[0] = "visibility";
                    break;
                case 10:
                    objArr[0] = "kind";
                    break;
                case 12:
                    objArr[0] = "typeParameters";
                    break;
                case 15:
                    objArr[0] = x1.f136677h;
                    break;
                case 18:
                    objArr[0] = "name";
                    break;
                default:
                    objArr[0] = "owner";
                    break;
            }
            if (i10 == 1) {
                objArr[1] = "setOwner";
            } else if (i10 == 2) {
                objArr[1] = "setOriginal";
            } else if (i10 == 3) {
                objArr[1] = "setPreserveSourceElement";
            } else if (i10 == 5) {
                objArr[1] = "setReturnType";
            } else if (i10 == 7) {
                objArr[1] = "setModality";
            } else if (i10 == 9) {
                objArr[1] = "setVisibility";
            } else if (i10 == 11) {
                objArr[1] = "setKind";
            } else if (i10 == 19) {
                objArr[1] = "setName";
            } else if (i10 == 13) {
                objArr[1] = "setTypeParameters";
            } else if (i10 == 14) {
                objArr[1] = "setDispatchReceiverParameter";
            } else if (i10 == 16) {
                objArr[1] = "setSubstitution";
            } else if (i10 != 17) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration";
            } else {
                objArr[1] = "setCopyOverrides";
            }
            switch (i10) {
                case 1:
                case 2:
                case 3:
                case 5:
                case 7:
                case 9:
                case 11:
                case 13:
                case 14:
                case 16:
                case 17:
                case 19:
                    break;
                case 4:
                    objArr[2] = "setReturnType";
                    break;
                case 6:
                    objArr[2] = "setModality";
                    break;
                case 8:
                    objArr[2] = "setVisibility";
                    break;
                case 10:
                    objArr[2] = "setKind";
                    break;
                case 12:
                    objArr[2] = "setTypeParameters";
                    break;
                case 15:
                    objArr[2] = "setSubstitution";
                    break;
                case 18:
                    objArr[2] = "setName";
                    break;
                default:
                    objArr[2] = "setOwner";
                    break;
            }
            String str2 = String.format(str, objArr);
            if (i10 != 1 && i10 != 2 && i10 != 3 && i10 != 5 && i10 != 7 && i10 != 9 && i10 != 11 && i10 != 19 && i10 != 13 && i10 != 14 && i10 != 16 && i10 != 17) {
                throw new IllegalArgumentException(str2);
            }
            throw new IllegalStateException(str2);
        }

        @dl.e
        public o0 n() {
            return z.this.S0(this);
        }

        p0 o() {
            o0 o0Var = this.f125850d;
            if (o0Var == null) {
                return null;
            }
            return o0Var.getGetter();
        }

        q0 p() {
            o0 o0Var = this.f125850d;
            if (o0Var == null) {
                return null;
            }
            return o0Var.getSetter();
        }

        @dl.d
        public a q(boolean z10) {
            this.f125854h = z10;
            return this;
        }

        @dl.d
        public a r(@dl.d CallableMemberDescriptor.Kind kind) {
            if (kind == null) {
                a(10);
            }
            this.f125852f = kind;
            return this;
        }

        @dl.d
        public a s(@dl.d Modality modality) {
            if (modality == null) {
                a(6);
            }
            this.f125848b = modality;
            return this;
        }

        @dl.d
        public a t(@dl.e CallableMemberDescriptor callableMemberDescriptor) {
            this.f125850d = (o0) callableMemberDescriptor;
            return this;
        }

        @dl.d
        public a u(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.k kVar) {
            if (kVar == null) {
                a(0);
            }
            this.f125847a = kVar;
            return this;
        }

        @dl.d
        public a v(@dl.d f1 f1Var) {
            if (f1Var == null) {
                a(15);
            }
            this.f125853g = f1Var;
            return this;
        }

        @dl.d
        public a w(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.s sVar) {
            if (sVar == null) {
                a(8);
            }
            this.f125849c = sVar;
            return this;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected z(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.k kVar, @dl.e o0 o0Var, @dl.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.e eVar, @dl.d Modality modality, @dl.d kotlin.reflect.jvm.internal.impl.descriptors.s sVar, boolean z10, @dl.d kotlin.reflect.jvm.internal.impl.name.f fVar, @dl.d CallableMemberDescriptor.Kind kind, @dl.d t0 t0Var, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16) {
        super(kVar, eVar, fVar, null, z10, t0Var);
        if (kVar == null) {
            Z(0);
        }
        if (eVar == null) {
            Z(1);
        }
        if (modality == null) {
            Z(2);
        }
        if (sVar == null) {
            Z(3);
        }
        if (fVar == null) {
            Z(4);
        }
        if (kind == null) {
            Z(5);
        }
        if (t0Var == null) {
            Z(6);
        }
        this.f125834n = null;
        this.f125843w = Collections.emptyList();
        this.f125832l = modality;
        this.f125833m = sVar;
        this.f125835o = o0Var == null ? this : o0Var;
        this.f125836p = kind;
        this.f125837q = z11;
        this.f125838r = z12;
        this.f125839s = z13;
        this.f125840t = z14;
        this.f125841u = z15;
        this.f125842v = z16;
    }

    @dl.d
    public static z Q0(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.k kVar, @dl.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.e eVar, @dl.d Modality modality, @dl.d kotlin.reflect.jvm.internal.impl.descriptors.s sVar, boolean z10, @dl.d kotlin.reflect.jvm.internal.impl.name.f fVar, @dl.d CallableMemberDescriptor.Kind kind, @dl.d t0 t0Var, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16) {
        if (kVar == null) {
            Z(7);
        }
        if (eVar == null) {
            Z(8);
        }
        if (modality == null) {
            Z(9);
        }
        if (sVar == null) {
            Z(10);
        }
        if (fVar == null) {
            Z(11);
        }
        if (kind == null) {
            Z(12);
        }
        if (t0Var == null) {
            Z(13);
        }
        return new z(kVar, null, eVar, modality, sVar, z10, fVar, kind, t0Var, z11, z12, z13, z14, z15, z16);
    }

    @dl.d
    private t0 U0(boolean z10, @dl.e o0 o0Var) {
        t0 t0VarJ;
        if (z10) {
            if (o0Var == null) {
                o0Var = a();
            }
            t0VarJ = o0Var.j();
        } else {
            t0VarJ = t0.f125942a;
        }
        if (t0VarJ == null) {
            Z(28);
        }
        return t0VarJ;
    }

    private static kotlin.reflect.jvm.internal.impl.descriptors.w V0(@dl.d TypeSubstitutor typeSubstitutor, @dl.d n0 n0Var) {
        if (typeSubstitutor == null) {
            Z(30);
        }
        if (n0Var == null) {
            Z(31);
        }
        if (n0Var.D0() != null) {
            return n0Var.D0().d(typeSubstitutor);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001a  */
    private static /* synthetic */ void Z(int i10) {
        String str;
        int i11;
        if (i10 != 28 && i10 != 38 && i10 != 39 && i10 != 41 && i10 != 42) {
            switch (i10) {
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                    str = "@NotNull method %s.%s must not return null";
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i10 != 28 && i10 != 38 && i10 != 39 && i10 != 41 && i10 != 42) {
            switch (i10) {
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                    i11 = 2;
                    break;
                default:
                    i11 = 3;
                    break;
            }
        } else {
            i11 = 2;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
            case 8:
                objArr[0] = "annotations";
                break;
            case 2:
            case 9:
                objArr[0] = "modality";
                break;
            case 3:
            case 10:
            case 20:
                objArr[0] = "visibility";
                break;
            case 4:
            case 11:
                objArr[0] = "name";
                break;
            case 5:
            case 12:
            case 35:
                objArr[0] = "kind";
                break;
            case 6:
            case 13:
            case 37:
                objArr[0] = "source";
                break;
            case 7:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 14:
                objArr[0] = "inType";
                break;
            case 15:
            case 17:
                objArr[0] = "outType";
                break;
            case 16:
            case 18:
                objArr[0] = "typeParameters";
                break;
            case 19:
                objArr[0] = "contextReceiverParameters";
                break;
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 28:
            case 38:
            case 39:
            case 41:
            case 42:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl";
                break;
            case 27:
                objArr[0] = "originalSubstitutor";
                break;
            case 29:
                objArr[0] = "copyConfiguration";
                break;
            case 30:
                objArr[0] = "substitutor";
                break;
            case 31:
                objArr[0] = "accessorDescriptor";
                break;
            case 32:
                objArr[0] = "newOwner";
                break;
            case 33:
                objArr[0] = "newModality";
                break;
            case 34:
                objArr[0] = "newVisibility";
                break;
            case 36:
                objArr[0] = "newName";
                break;
            case 40:
                objArr[0] = "overriddenDescriptors";
                break;
        }
        if (i10 == 28) {
            objArr[1] = "getSourceToUseForCopy";
        } else if (i10 == 38) {
            objArr[1] = "getOriginal";
        } else if (i10 == 39) {
            objArr[1] = "getKind";
        } else if (i10 == 41) {
            objArr[1] = "getOverriddenDescriptors";
        } else if (i10 != 42) {
            switch (i10) {
                case 21:
                    objArr[1] = "getTypeParameters";
                    break;
                case 22:
                    objArr[1] = "getContextReceiverParameters";
                    break;
                case 23:
                    objArr[1] = "getReturnType";
                    break;
                case 24:
                    objArr[1] = "getModality";
                    break;
                case 25:
                    objArr[1] = "getVisibility";
                    break;
                case 26:
                    objArr[1] = "getAccessors";
                    break;
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl";
                    break;
            }
        } else {
            objArr[1] = "copy";
        }
        switch (i10) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                objArr[2] = TopicHashtagWrapper.TYPE_CREATE;
                break;
            case 14:
                objArr[2] = "setInType";
                break;
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                objArr[2] = "setType";
                break;
            case 20:
                objArr[2] = "setVisibility";
                break;
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 28:
            case 38:
            case 39:
            case 41:
            case 42:
                break;
            case 27:
                objArr[2] = "substitute";
                break;
            case 29:
                objArr[2] = "doSubstitute";
                break;
            case 30:
            case 31:
                objArr[2] = "getSubstitutedInitialSignatureDescriptor";
                break;
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 40:
                objArr[2] = "setOverriddenDescriptors";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 28 && i10 != 38 && i10 != 39 && i10 != 41 && i10 != 42) {
            switch (i10) {
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                    break;
                default:
                    throw new IllegalArgumentException(str2);
            }
        }
        throw new IllegalStateException(str2);
    }

    private static kotlin.reflect.jvm.internal.impl.descriptors.s a1(kotlin.reflect.jvm.internal.impl.descriptors.s sVar, CallableMemberDescriptor.Kind kind) {
        return (kind == CallableMemberDescriptor.Kind.FAKE_OVERRIDE && kotlin.reflect.jvm.internal.impl.descriptors.r.g(sVar.f())) ? kotlin.reflect.jvm.internal.impl.descriptors.r.f125871h : sVar;
    }

    private static r0 f1(TypeSubstitutor typeSubstitutor, o0 o0Var, r0 r0Var) {
        kotlin.reflect.jvm.internal.impl.types.d0 d0VarP = typeSubstitutor.p(r0Var.getType(), Variance.IN_VARIANCE);
        if (d0VarP == null) {
            return null;
        }
        return new c0(o0Var, new kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.c(o0Var, d0VarP, ((kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.f) r0Var.getValue()).a(), r0Var.getValue()), r0Var.getAnnotations());
    }

    private static r0 g1(TypeSubstitutor typeSubstitutor, o0 o0Var, r0 r0Var) {
        kotlin.reflect.jvm.internal.impl.types.d0 d0VarP = typeSubstitutor.p(r0Var.getType(), Variance.IN_VARIANCE);
        if (d0VarP == null) {
            return null;
        }
        return new c0(o0Var, new kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.d(o0Var, d0VarP, r0Var.getValue()), r0Var.getAnnotations());
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.o0
    @dl.d
    public List<n0> A() {
        ArrayList arrayList = new ArrayList(2);
        a0 a0Var = this.A;
        if (a0Var != null) {
            arrayList.add(a0Var);
        }
        q0 q0Var = this.B;
        if (q0Var != null) {
            arrayList.add(q0Var);
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a0
    public boolean B() {
        return this.f125841u;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.h0, kotlin.reflect.jvm.internal.impl.descriptors.a
    @dl.d
    public List<r0> G0() {
        List<r0> list = this.f125843w;
        if (list == null) {
            Z(22);
        }
        return list;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.o0
    @dl.e
    public kotlin.reflect.jvm.internal.impl.descriptors.v H() {
        return this.E;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d1
    public boolean H0() {
        return this.f125837q;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    @dl.d
    /* JADX INFO: renamed from: P0, reason: merged with bridge method [inline-methods] */
    public o0 k0(kotlin.reflect.jvm.internal.impl.descriptors.k kVar, Modality modality, kotlin.reflect.jvm.internal.impl.descriptors.s sVar, CallableMemberDescriptor.Kind kind, boolean z10) {
        o0 o0VarN = Z0().u(kVar).t(null).s(modality).w(sVar).r(kind).q(z10).n();
        if (o0VarN == null) {
            Z(42);
        }
        return o0VarN;
    }

    @dl.d
    protected z R0(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.k kVar, @dl.d Modality modality, @dl.d kotlin.reflect.jvm.internal.impl.descriptors.s sVar, @dl.e o0 o0Var, @dl.d CallableMemberDescriptor.Kind kind, @dl.d kotlin.reflect.jvm.internal.impl.name.f fVar, @dl.d t0 t0Var) {
        if (kVar == null) {
            Z(32);
        }
        if (modality == null) {
            Z(33);
        }
        if (sVar == null) {
            Z(34);
        }
        if (kind == null) {
            Z(35);
        }
        if (fVar == null) {
            Z(36);
        }
        if (t0Var == null) {
            Z(37);
        }
        return new z(kVar, o0Var, getAnnotations(), modality, sVar, G(), fVar, kind, t0Var, H0(), isConst(), w0(), o0(), B(), d0());
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.h0, kotlin.reflect.jvm.internal.impl.descriptors.a
    @dl.e
    public <V> V S(kotlin.reflect.jvm.internal.impl.descriptors.a.InterfaceC1142a<V> interfaceC1142a) {
        return null;
    }

    @dl.e
    protected o0 S0(@dl.d a aVar) {
        r0 r0Var;
        yh.a<kotlin.reflect.jvm.internal.impl.storage.i<kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>>> aVar2;
        if (aVar == null) {
            Z(29);
        }
        z zVarR0 = R0(aVar.f125847a, aVar.f125848b, aVar.f125849c, aVar.f125850d, aVar.f125852f, aVar.f125857k, U0(aVar.f125851e, aVar.f125850d));
        List<y0> typeParameters = aVar.f125856j == null ? getTypeParameters() : aVar.f125856j;
        ArrayList arrayList = new ArrayList(typeParameters.size());
        TypeSubstitutor typeSubstitutorB = kotlin.reflect.jvm.internal.impl.types.r.b(typeParameters, aVar.f125853g, zVarR0, arrayList);
        kotlin.reflect.jvm.internal.impl.types.d0 d0Var = aVar.f125858l;
        kotlin.reflect.jvm.internal.impl.types.d0 d0VarP = typeSubstitutorB.p(d0Var, Variance.OUT_VARIANCE);
        if (d0VarP == null) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.types.d0 d0VarP2 = typeSubstitutorB.p(d0Var, Variance.IN_VARIANCE);
        if (d0VarP2 != null) {
            zVarR0.b1(d0VarP2);
        }
        r0 r0Var2 = aVar.f125855i;
        if (r0Var2 != null) {
            r0 r0VarD = r0Var2.d(typeSubstitutorB);
            if (r0VarD == null) {
                return null;
            }
            r0Var = r0VarD;
        } else {
            r0Var = null;
        }
        r0 r0Var3 = this.f125845y;
        r0 r0VarG1 = r0Var3 != null ? g1(typeSubstitutorB, zVarR0, r0Var3) : null;
        ArrayList arrayList2 = new ArrayList();
        Iterator<r0> it = this.f125843w.iterator();
        while (it.hasNext()) {
            r0 r0VarF1 = f1(typeSubstitutorB, zVarR0, it.next());
            if (r0VarF1 != null) {
                arrayList2.add(r0VarF1);
            }
        }
        zVarR0.d1(d0VarP, arrayList, r0Var, r0VarG1, arrayList2);
        a0 a0Var = this.A == null ? null : new a0(zVarR0, this.A.getAnnotations(), aVar.f125848b, a1(this.A.getVisibility(), aVar.f125852f), this.A.e0(), this.A.B(), this.A.g(), aVar.f125852f, aVar.o(), t0.f125942a);
        if (a0Var != null) {
            kotlin.reflect.jvm.internal.impl.types.d0 returnType = this.A.getReturnType();
            a0Var.O0(V0(typeSubstitutorB, this.A));
            a0Var.R0(returnType != null ? typeSubstitutorB.p(returnType, Variance.OUT_VARIANCE) : null);
        }
        b0 b0Var = this.B == null ? null : new b0(zVarR0, this.B.getAnnotations(), aVar.f125848b, a1(this.B.getVisibility(), aVar.f125852f), this.B.e0(), this.B.B(), this.B.g(), aVar.f125852f, aVar.p(), t0.f125942a);
        if (b0Var != null) {
            List<b1> listQ0 = o.Q0(b0Var, this.B.i(), typeSubstitutorB, false, false, null);
            if (listQ0 == null) {
                zVarR0.c1(true);
                listQ0 = Collections.singletonList(b0.Q0(b0Var, DescriptorUtilsKt.j(aVar.f125847a).H(), this.B.i().get(0).getAnnotations()));
            }
            if (listQ0.size() != 1) {
                throw new IllegalStateException();
            }
            b0Var.O0(V0(typeSubstitutorB, this.B));
            b0Var.S0(listQ0.get(0));
        }
        kotlin.reflect.jvm.internal.impl.descriptors.v vVar = this.D;
        n nVar = vVar == null ? null : new n(vVar.getAnnotations(), zVarR0);
        kotlin.reflect.jvm.internal.impl.descriptors.v vVar2 = this.E;
        zVarR0.X0(a0Var, b0Var, nVar, vVar2 != null ? new n(vVar2.getAnnotations(), zVarR0) : null);
        if (aVar.f125854h) {
            kotlin.reflect.jvm.internal.impl.utils.e eVarA = kotlin.reflect.jvm.internal.impl.utils.e.a();
            Iterator<? extends o0> it2 = f().iterator();
            while (it2.hasNext()) {
                eVarA.add(it2.next().d(typeSubstitutorB));
            }
            zVarR0.X(eVarA);
        }
        if (isConst() && (aVar2 = this.f125722j) != null) {
            zVarR0.M0(this.f125721i, aVar2);
        }
        return zVarR0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.o0
    @dl.e
    public kotlin.reflect.jvm.internal.impl.descriptors.v T() {
        return this.D;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.o0
    @dl.e
    /* JADX INFO: renamed from: T0, reason: merged with bridge method [inline-methods] */
    public a0 getGetter() {
        return this.A;
    }

    public void W0(@dl.e a0 a0Var, @dl.e q0 q0Var) {
        X0(a0Var, q0Var, null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    public void X(@dl.d Collection<? extends CallableMemberDescriptor> collection) {
        if (collection == 0) {
            Z(40);
        }
        this.f125834n = collection;
    }

    public void X0(@dl.e a0 a0Var, @dl.e q0 q0Var, @dl.e kotlin.reflect.jvm.internal.impl.descriptors.v vVar, @dl.e kotlin.reflect.jvm.internal.impl.descriptors.v vVar2) {
        this.A = a0Var;
        this.B = q0Var;
        this.D = vVar;
        this.E = vVar2;
    }

    public boolean Y0() {
        return this.C;
    }

    @dl.d
    public a Z0() {
        return new a();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.h0, kotlin.reflect.jvm.internal.impl.descriptors.impl.j
    @dl.d
    public o0 a() {
        o0 o0Var = this.f125835o;
        o0 o0VarA = o0Var == this ? this : o0Var.a();
        if (o0VarA == null) {
            Z(38);
        }
        return o0VarA;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    @dl.d
    public CallableMemberDescriptor.Kind b() {
        CallableMemberDescriptor.Kind kind = this.f125836p;
        if (kind == null) {
            Z(39);
        }
        return kind;
    }

    public void b1(@dl.d kotlin.reflect.jvm.internal.impl.types.d0 d0Var) {
        if (d0Var == null) {
            Z(14);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.k
    public <R, D> R c0(kotlin.reflect.jvm.internal.impl.descriptors.m<R, D> mVar, D d10) {
        return mVar.c(this, d10);
    }

    public void c1(boolean z10) {
        this.C = z10;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.h0, kotlin.reflect.jvm.internal.impl.descriptors.d1, kotlin.reflect.jvm.internal.impl.descriptors.v0
    public o0 d(@dl.d TypeSubstitutor typeSubstitutor) {
        if (typeSubstitutor == null) {
            Z(27);
        }
        return typeSubstitutor.k() ? this : Z0().v(typeSubstitutor.j()).t(a()).n();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e1
    public boolean d0() {
        return this.f125842v;
    }

    public void d1(@dl.d kotlin.reflect.jvm.internal.impl.types.d0 d0Var, @dl.d List<? extends y0> list, @dl.e r0 r0Var, @dl.e r0 r0Var2, @dl.d List<r0> list2) {
        if (d0Var == null) {
            Z(17);
        }
        if (list == null) {
            Z(18);
        }
        if (list2 == null) {
            Z(19);
        }
        L0(d0Var);
        this.f125846z = new ArrayList(list);
        this.f125845y = r0Var2;
        this.f125844x = r0Var;
        this.f125843w = list2;
    }

    public void e1(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.s sVar) {
        if (sVar == null) {
            Z(20);
        }
        this.f125833m = sVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.h0, kotlin.reflect.jvm.internal.impl.descriptors.a
    @dl.d
    public Collection<? extends o0> f() {
        Collection<? extends o0> collectionEmptyList = this.f125834n;
        if (collectionEmptyList == null) {
            collectionEmptyList = Collections.emptyList();
        }
        if (collectionEmptyList == null) {
            Z(41);
        }
        return collectionEmptyList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.h0, kotlin.reflect.jvm.internal.impl.descriptors.a, kotlin.reflect.jvm.internal.impl.descriptors.j
    @dl.d
    public kotlin.reflect.jvm.internal.impl.types.d0 getReturnType() {
        kotlin.reflect.jvm.internal.impl.types.d0 type = getType();
        if (type == null) {
            Z(23);
        }
        return type;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.o0
    @dl.e
    public q0 getSetter() {
        return this.B;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.h0, kotlin.reflect.jvm.internal.impl.descriptors.a
    @dl.d
    public List<y0> getTypeParameters() {
        List<y0> list = this.f125846z;
        if (list != null) {
            return list;
        }
        throw new IllegalStateException("typeParameters == null for " + toString());
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.o, kotlin.reflect.jvm.internal.impl.descriptors.a0
    @dl.d
    public kotlin.reflect.jvm.internal.impl.descriptors.s getVisibility() {
        kotlin.reflect.jvm.internal.impl.descriptors.s sVar = this.f125833m;
        if (sVar == null) {
            Z(25);
        }
        return sVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.h0, kotlin.reflect.jvm.internal.impl.descriptors.a
    @dl.e
    public r0 i0() {
        return this.f125844x;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.h0, kotlin.reflect.jvm.internal.impl.descriptors.d1
    public boolean isConst() {
        return this.f125838r;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a0
    @dl.d
    public Modality l() {
        Modality modality = this.f125832l;
        if (modality == null) {
            Z(24);
        }
        return modality;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.h0, kotlin.reflect.jvm.internal.impl.descriptors.a
    @dl.e
    public r0 l0() {
        return this.f125845y;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a0
    public boolean o0() {
        return this.f125840t;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a0
    public boolean w0() {
        return this.f125839s;
    }
}
