package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.b1;
import kotlin.reflect.jvm.internal.impl.descriptors.d1;
import kotlin.reflect.jvm.internal.impl.descriptors.r0;
import kotlin.reflect.jvm.internal.impl.descriptors.t0;
import kotlin.reflect.jvm.internal.impl.descriptors.y0;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.f1;
import org.apache.tools.ant.types.x1;

/* JADX INFO: compiled from: FunctionDescriptorImpl.java */
/* JADX INFO: loaded from: classes5.dex */
public abstract class o extends j implements kotlin.reflect.jvm.internal.impl.descriptors.w {
    private volatile yh.a<Collection<kotlin.reflect.jvm.internal.impl.descriptors.w>> A;
    private final kotlin.reflect.jvm.internal.impl.descriptors.w B;
    private final CallableMemberDescriptor.Kind C;

    @dl.e
    private kotlin.reflect.jvm.internal.impl.descriptors.w D;
    protected Map<kotlin.reflect.jvm.internal.impl.descriptors.a.InterfaceC1142a<?>, Object> E;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private List<y0> f125744f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private List<b1> f125745g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private kotlin.reflect.jvm.internal.impl.types.d0 f125746h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private List<r0> f125747i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private r0 f125748j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private r0 f125749k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Modality f125750l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private kotlin.reflect.jvm.internal.impl.descriptors.s f125751m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f125752n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f125753o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f125754p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f125755q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f125756r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f125757s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f125758t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f125759u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f125760v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f125761w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f125762x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f125763y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.w> f125764z;

    /* JADX INFO: compiled from: FunctionDescriptorImpl.java */
    public class a implements yh.a<Collection<kotlin.reflect.jvm.internal.impl.descriptors.w>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ TypeSubstitutor f125765b;

        a(TypeSubstitutor typeSubstitutor) {
            this.f125765b = typeSubstitutor;
        }

        @Override // yh.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Collection<kotlin.reflect.jvm.internal.impl.descriptors.w> invoke() {
            kotlin.reflect.jvm.internal.impl.utils.d dVar = new kotlin.reflect.jvm.internal.impl.utils.d();
            Iterator<? extends kotlin.reflect.jvm.internal.impl.descriptors.w> it = o.this.f().iterator();
            while (it.hasNext()) {
                dVar.add(it.next().d(this.f125765b));
            }
            return dVar;
        }
    }

    /* JADX INFO: compiled from: FunctionDescriptorImpl.java */
    public static final class b implements yh.a<List<d1>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ List f125767b;

        b(List list) {
            this.f125767b = list;
        }

        @Override // yh.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<d1> invoke() {
            return this.f125767b;
        }
    }

    /* JADX INFO: compiled from: FunctionDescriptorImpl.java */
    public class c implements kotlin.reflect.jvm.internal.impl.descriptors.w.a<kotlin.reflect.jvm.internal.impl.descriptors.w> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @dl.d
        protected f1 f125768a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dl.d
        protected kotlin.reflect.jvm.internal.impl.descriptors.k f125769b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @dl.d
        protected Modality f125770c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @dl.d
        protected kotlin.reflect.jvm.internal.impl.descriptors.s f125771d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @dl.e
        protected kotlin.reflect.jvm.internal.impl.descriptors.w f125772e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @dl.d
        protected CallableMemberDescriptor.Kind f125773f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @dl.d
        protected List<b1> f125774g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @dl.d
        protected List<r0> f125775h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @dl.e
        protected r0 f125776i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @dl.e
        protected r0 f125777j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @dl.d
        protected kotlin.reflect.jvm.internal.impl.types.d0 f125778k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        @dl.e
        protected kotlin.reflect.jvm.internal.impl.name.f f125779l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        protected boolean f125780m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        protected boolean f125781n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        protected boolean f125782o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        protected boolean f125783p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private boolean f125784q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private List<y0> f125785r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private kotlin.reflect.jvm.internal.impl.descriptors.annotations.e f125786s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private boolean f125787t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private Map<kotlin.reflect.jvm.internal.impl.descriptors.a.InterfaceC1142a<?>, Object> f125788u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private Boolean f125789v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        protected boolean f125790w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        final /* synthetic */ o f125791x;

        public c(@dl.d o oVar, @dl.d f1 f1Var, @dl.d kotlin.reflect.jvm.internal.impl.descriptors.k kVar, @dl.d Modality modality, @dl.d kotlin.reflect.jvm.internal.impl.descriptors.s sVar, @dl.d CallableMemberDescriptor.Kind kind, @dl.d List<b1> list, @dl.e List<r0> list2, @dl.d r0 r0Var, @dl.e kotlin.reflect.jvm.internal.impl.types.d0 d0Var, kotlin.reflect.jvm.internal.impl.name.f fVar) {
            if (f1Var == null) {
                u(0);
            }
            if (kVar == null) {
                u(1);
            }
            if (modality == null) {
                u(2);
            }
            if (sVar == null) {
                u(3);
            }
            if (kind == null) {
                u(4);
            }
            if (list == null) {
                u(5);
            }
            if (list2 == null) {
                u(6);
            }
            if (d0Var == null) {
                u(7);
            }
            this.f125791x = oVar;
            this.f125772e = null;
            this.f125777j = oVar.f125749k;
            this.f125780m = true;
            this.f125781n = false;
            this.f125782o = false;
            this.f125783p = false;
            this.f125784q = oVar.J0();
            this.f125785r = null;
            this.f125786s = null;
            this.f125787t = oVar.Y();
            this.f125788u = new LinkedHashMap();
            this.f125789v = null;
            this.f125790w = false;
            this.f125768a = f1Var;
            this.f125769b = kVar;
            this.f125770c = modality;
            this.f125771d = sVar;
            this.f125773f = kind;
            this.f125774g = list;
            this.f125775h = list2;
            this.f125776i = r0Var;
            this.f125778k = d0Var;
            this.f125779l = fVar;
        }

        private static /* synthetic */ void u(int i10) {
            String str;
            int i11;
            switch (i10) {
                case 9:
                case 11:
                case 13:
                case 15:
                case 16:
                case 18:
                case 20:
                case 22:
                case 24:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 36:
                case 38:
                case 40:
                case 41:
                case 42:
                    str = "@NotNull method %s.%s must not return null";
                    break;
                case 10:
                case 12:
                case 14:
                case 17:
                case 19:
                case 21:
                case 23:
                case 25:
                case 35:
                case 37:
                case 39:
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
            switch (i10) {
                case 9:
                case 11:
                case 13:
                case 15:
                case 16:
                case 18:
                case 20:
                case 22:
                case 24:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 36:
                case 38:
                case 40:
                case 41:
                case 42:
                    i11 = 2;
                    break;
                case 10:
                case 12:
                case 14:
                case 17:
                case 19:
                case 21:
                case 23:
                case 25:
                case 35:
                case 37:
                case 39:
                default:
                    i11 = 3;
                    break;
            }
            Object[] objArr = new Object[i11];
            switch (i10) {
                case 1:
                    objArr[0] = "newOwner";
                    break;
                case 2:
                    objArr[0] = "newModality";
                    break;
                case 3:
                    objArr[0] = "newVisibility";
                    break;
                case 4:
                case 14:
                    objArr[0] = "kind";
                    break;
                case 5:
                    objArr[0] = "newValueParameterDescriptors";
                    break;
                case 6:
                    objArr[0] = "newContextReceiverParameters";
                    break;
                case 7:
                    objArr[0] = "newReturnType";
                    break;
                case 8:
                    objArr[0] = "owner";
                    break;
                case 9:
                case 11:
                case 13:
                case 15:
                case 16:
                case 18:
                case 20:
                case 22:
                case 24:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 36:
                case 38:
                case 40:
                case 41:
                case 42:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl$CopyConfiguration";
                    break;
                case 10:
                    objArr[0] = "modality";
                    break;
                case 12:
                    objArr[0] = "visibility";
                    break;
                case 17:
                    objArr[0] = "name";
                    break;
                case 19:
                case 21:
                    objArr[0] = "parameters";
                    break;
                case 23:
                    objArr[0] = "type";
                    break;
                case 25:
                    objArr[0] = "contextReceiverParameters";
                    break;
                case 35:
                    objArr[0] = "additionalAnnotations";
                    break;
                case 37:
                default:
                    objArr[0] = x1.f136677h;
                    break;
                case 39:
                    objArr[0] = "userDataKey";
                    break;
            }
            switch (i10) {
                case 9:
                    objArr[1] = "setOwner";
                    break;
                case 10:
                case 12:
                case 14:
                case 17:
                case 19:
                case 21:
                case 23:
                case 25:
                case 35:
                case 37:
                case 39:
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl$CopyConfiguration";
                    break;
                case 11:
                    objArr[1] = "setModality";
                    break;
                case 13:
                    objArr[1] = "setVisibility";
                    break;
                case 15:
                    objArr[1] = "setKind";
                    break;
                case 16:
                    objArr[1] = "setCopyOverrides";
                    break;
                case 18:
                    objArr[1] = "setName";
                    break;
                case 20:
                    objArr[1] = "setValueParameters";
                    break;
                case 22:
                    objArr[1] = "setTypeParameters";
                    break;
                case 24:
                    objArr[1] = "setReturnType";
                    break;
                case 26:
                    objArr[1] = "setContextReceiverParameters";
                    break;
                case 27:
                    objArr[1] = "setExtensionReceiverParameter";
                    break;
                case 28:
                    objArr[1] = "setDispatchReceiverParameter";
                    break;
                case 29:
                    objArr[1] = "setOriginal";
                    break;
                case 30:
                    objArr[1] = "setSignatureChange";
                    break;
                case 31:
                    objArr[1] = "setPreserveSourceElement";
                    break;
                case 32:
                    objArr[1] = "setDropOriginalInContainingParts";
                    break;
                case 33:
                    objArr[1] = "setHiddenToOvercomeSignatureClash";
                    break;
                case 34:
                    objArr[1] = "setHiddenForResolutionEverywhereBesideSupercalls";
                    break;
                case 36:
                    objArr[1] = "setAdditionalAnnotations";
                    break;
                case 38:
                    objArr[1] = "setSubstitution";
                    break;
                case 40:
                    objArr[1] = "putUserData";
                    break;
                case 41:
                    objArr[1] = "getSubstitution";
                    break;
                case 42:
                    objArr[1] = "setJustForTypeSubstitution";
                    break;
            }
            switch (i10) {
                case 8:
                    objArr[2] = "setOwner";
                    break;
                case 9:
                case 11:
                case 13:
                case 15:
                case 16:
                case 18:
                case 20:
                case 22:
                case 24:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 36:
                case 38:
                case 40:
                case 41:
                case 42:
                    break;
                case 10:
                    objArr[2] = "setModality";
                    break;
                case 12:
                    objArr[2] = "setVisibility";
                    break;
                case 14:
                    objArr[2] = "setKind";
                    break;
                case 17:
                    objArr[2] = "setName";
                    break;
                case 19:
                    objArr[2] = "setValueParameters";
                    break;
                case 21:
                    objArr[2] = "setTypeParameters";
                    break;
                case 23:
                    objArr[2] = "setReturnType";
                    break;
                case 25:
                    objArr[2] = "setContextReceiverParameters";
                    break;
                case 35:
                    objArr[2] = "setAdditionalAnnotations";
                    break;
                case 37:
                    objArr[2] = "setSubstitution";
                    break;
                case 39:
                    objArr[2] = "putUserData";
                    break;
                default:
                    objArr[2] = "<init>";
                    break;
            }
            String str2 = String.format(str, objArr);
            switch (i10) {
                case 9:
                case 11:
                case 13:
                case 15:
                case 16:
                case 18:
                case 20:
                case 22:
                case 24:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 36:
                case 38:
                case 40:
                case 41:
                case 42:
                    throw new IllegalStateException(str2);
                case 10:
                case 12:
                case 14:
                case 17:
                case 19:
                case 21:
                case 23:
                case 25:
                case 35:
                case 37:
                case 39:
                default:
                    throw new IllegalArgumentException(str2);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.w.a
        @dl.d
        /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
        public c l(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.e eVar) {
            if (eVar == null) {
                u(35);
            }
            this.f125786s = eVar;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.w.a
        @dl.d
        /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
        public c j(boolean z10) {
            this.f125780m = z10;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.w.a
        @dl.d
        /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
        public c a(@dl.e r0 r0Var) {
            this.f125777j = r0Var;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.w.a
        @dl.d
        /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
        public c m() {
            this.f125783p = true;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.w.a
        @dl.d
        /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
        public c b(@dl.e r0 r0Var) {
            this.f125776i = r0Var;
            return this;
        }

        public c G(boolean z10) {
            this.f125789v = Boolean.valueOf(z10);
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.w.a
        @dl.d
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public c o() {
            this.f125787t = true;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.w.a
        @dl.d
        /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
        public c e() {
            this.f125784q = true;
            return this;
        }

        @dl.d
        public c J(boolean z10) {
            this.f125790w = z10;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.w.a
        @dl.d
        /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
        public c s(@dl.d CallableMemberDescriptor.Kind kind) {
            if (kind == null) {
                u(14);
            }
            this.f125773f = kind;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.w.a
        @dl.d
        /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
        public c q(@dl.d Modality modality) {
            if (modality == null) {
                u(10);
            }
            this.f125770c = modality;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.w.a
        @dl.d
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public c f(@dl.d kotlin.reflect.jvm.internal.impl.name.f fVar) {
            if (fVar == null) {
                u(17);
            }
            this.f125779l = fVar;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.w.a
        @dl.d
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public c i(@dl.e CallableMemberDescriptor callableMemberDescriptor) {
            this.f125772e = (kotlin.reflect.jvm.internal.impl.descriptors.w) callableMemberDescriptor;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.w.a
        @dl.d
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public c r(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.k kVar) {
            if (kVar == null) {
                u(8);
            }
            this.f125769b = kVar;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.w.a
        @dl.d
        /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
        public c g() {
            this.f125782o = true;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.w.a
        @dl.d
        /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
        public c h(@dl.d kotlin.reflect.jvm.internal.impl.types.d0 d0Var) {
            if (d0Var == null) {
                u(23);
            }
            this.f125778k = d0Var;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.w.a
        @dl.d
        /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
        public c t() {
            this.f125781n = true;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.w.a
        @dl.d
        /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
        public c c(@dl.d f1 f1Var) {
            if (f1Var == null) {
                u(37);
            }
            this.f125768a = f1Var;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.w.a
        @dl.d
        /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
        public c k(@dl.d List<y0> list) {
            if (list == null) {
                u(21);
            }
            this.f125785r = list;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.w.a
        @dl.d
        /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
        public c n(@dl.d List<b1> list) {
            if (list == null) {
                u(19);
            }
            this.f125774g = list;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.w.a
        @dl.d
        /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
        public c p(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.s sVar) {
            if (sVar == null) {
                u(12);
            }
            this.f125771d = sVar;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.w.a
        @dl.e
        public kotlin.reflect.jvm.internal.impl.descriptors.w build() {
            return this.f125791x.N0(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.w.a
        @dl.d
        public <V> kotlin.reflect.jvm.internal.impl.descriptors.w.a<kotlin.reflect.jvm.internal.impl.descriptors.w> d(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.a.InterfaceC1142a<V> interfaceC1142a, V v10) {
            if (interfaceC1142a == null) {
                u(39);
            }
            this.f125788u.put(interfaceC1142a, v10);
            return this;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected o(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.k kVar, @dl.e kotlin.reflect.jvm.internal.impl.descriptors.w wVar, @dl.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.e eVar, @dl.d kotlin.reflect.jvm.internal.impl.name.f fVar, @dl.d CallableMemberDescriptor.Kind kind, @dl.d t0 t0Var) {
        super(kVar, eVar, fVar, t0Var);
        if (kVar == null) {
            Z(0);
        }
        if (eVar == null) {
            Z(1);
        }
        if (fVar == null) {
            Z(2);
        }
        if (kind == null) {
            Z(3);
        }
        if (t0Var == null) {
            Z(4);
        }
        this.f125751m = kotlin.reflect.jvm.internal.impl.descriptors.r.f125872i;
        this.f125752n = false;
        this.f125753o = false;
        this.f125754p = false;
        this.f125755q = false;
        this.f125756r = false;
        this.f125757s = false;
        this.f125758t = false;
        this.f125759u = false;
        this.f125760v = false;
        this.f125761w = false;
        this.f125762x = true;
        this.f125763y = false;
        this.f125764z = null;
        this.A = null;
        this.D = null;
        this.E = null;
        this.B = wVar == null ? this : wVar;
        this.C = kind;
    }

    @dl.d
    private t0 O0(boolean z10, @dl.e kotlin.reflect.jvm.internal.impl.descriptors.w wVar) {
        t0 t0VarJ;
        if (z10) {
            if (wVar == null) {
                wVar = a();
            }
            t0VarJ = wVar.j();
        } else {
            t0VarJ = t0.f125942a;
        }
        if (t0VarJ == null) {
            Z(27);
        }
        return t0VarJ;
    }

    @dl.e
    public static List<b1> P0(kotlin.reflect.jvm.internal.impl.descriptors.w wVar, @dl.d List<b1> list, @dl.d TypeSubstitutor typeSubstitutor) {
        if (list == null) {
            Z(28);
        }
        if (typeSubstitutor == null) {
            Z(29);
        }
        return Q0(wVar, list, typeSubstitutor, false, false, null);
    }

    @dl.e
    public static List<b1> Q0(kotlin.reflect.jvm.internal.impl.descriptors.w wVar, @dl.d List<b1> list, @dl.d TypeSubstitutor typeSubstitutor, boolean z10, boolean z11, @dl.e boolean[] zArr) {
        if (list == null) {
            Z(30);
        }
        if (typeSubstitutor == null) {
            Z(31);
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (b1 b1Var : list) {
            kotlin.reflect.jvm.internal.impl.types.d0 type = b1Var.getType();
            Variance variance = Variance.IN_VARIANCE;
            kotlin.reflect.jvm.internal.impl.types.d0 d0VarP = typeSubstitutor.p(type, variance);
            kotlin.reflect.jvm.internal.impl.types.d0 d0VarF0 = b1Var.F0();
            kotlin.reflect.jvm.internal.impl.types.d0 d0VarP2 = d0VarF0 == null ? null : typeSubstitutor.p(d0VarF0, variance);
            if (d0VarP == null) {
                return null;
            }
            if ((d0VarP != b1Var.getType() || d0VarF0 != d0VarP2) && zArr != null) {
                zArr[0] = true;
            }
            arrayList.add(ValueParameterDescriptorImpl.M0(wVar, z10 ? null : b1Var, b1Var.getIndex(), b1Var.getAnnotations(), b1Var.getName(), d0VarP, b1Var.W(), b1Var.C0(), b1Var.A0(), d0VarP2, z11 ? b1Var.j() : t0.f125942a, b1Var instanceof ValueParameterDescriptorImpl.WithDestructuringDeclaration ? new b(((ValueParameterDescriptorImpl.WithDestructuringDeclaration) b1Var).P0()) : null));
        }
        return arrayList;
    }

    private void U0() {
        yh.a<Collection<kotlin.reflect.jvm.internal.impl.descriptors.w>> aVar = this.A;
        if (aVar != null) {
            this.f125764z = aVar.invoke();
            this.A = null;
        }
    }

    private static /* synthetic */ void Z(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 10:
            case 11:
            case 12:
            case 17:
            case 22:
            case 24:
            case 25:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                i11 = 2;
                break;
            case 10:
            case 11:
            case 12:
            case 17:
            case 22:
            case 24:
            case 25:
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "kind";
                break;
            case 4:
                objArr[0] = "source";
                break;
            case 5:
                objArr[0] = "contextReceiverParameters";
                break;
            case 6:
                objArr[0] = "typeParameters";
                break;
            case 7:
            case 28:
            case 30:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 8:
            case 10:
                objArr[0] = "visibility";
                break;
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl";
                break;
            case 11:
                objArr[0] = "unsubstitutedReturnType";
                break;
            case 12:
                objArr[0] = "extensionReceiverParameter";
                break;
            case 17:
                objArr[0] = "overriddenDescriptors";
                break;
            case 22:
                objArr[0] = "originalSubstitutor";
                break;
            case 24:
            case 29:
            case 31:
                objArr[0] = "substitutor";
                break;
            case 25:
                objArr[0] = "configuration";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i10) {
            case 9:
                objArr[1] = "initialize";
                break;
            case 10:
            case 11:
            case 12:
            case 17:
            case 22:
            case 24:
            case 25:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl";
                break;
            case 13:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 14:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 15:
                objArr[1] = "getModality";
                break;
            case 16:
                objArr[1] = "getVisibility";
                break;
            case 18:
                objArr[1] = "getTypeParameters";
                break;
            case 19:
                objArr[1] = "getValueParameters";
                break;
            case 20:
                objArr[1] = "getOriginal";
                break;
            case 21:
                objArr[1] = "getKind";
                break;
            case 23:
                objArr[1] = "newCopyBuilder";
                break;
            case 26:
                objArr[1] = "copy";
                break;
            case 27:
                objArr[1] = "getSourceToUseForCopy";
                break;
        }
        switch (i10) {
            case 5:
            case 6:
            case 7:
            case 8:
                objArr[2] = "initialize";
                break;
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                break;
            case 10:
                objArr[2] = "setVisibility";
                break;
            case 11:
                objArr[2] = "setReturnType";
                break;
            case 12:
                objArr[2] = "setExtensionReceiverParameter";
                break;
            case 17:
                objArr[2] = "setOverriddenDescriptors";
                break;
            case 22:
                objArr[2] = "substitute";
                break;
            case 24:
                objArr[2] = "newCopyBuilder";
                break;
            case 25:
                objArr[2] = "doSubstitute";
                break;
            case 28:
            case 29:
            case 30:
            case 31:
                objArr[2] = "getSubstitutedValueParameters";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i10) {
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                throw new IllegalStateException(str2);
            case 10:
            case 11:
            case 12:
            case 17:
            case 22:
            case 24:
            case 25:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    private void b1(boolean z10) {
        this.f125760v = z10;
    }

    private void c1(boolean z10) {
        this.f125759u = z10;
    }

    private void e1(@dl.e kotlin.reflect.jvm.internal.impl.descriptors.w wVar) {
        this.D = wVar;
    }

    public boolean B() {
        return this.f125754p;
    }

    public boolean C() {
        return this.f125756r;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.w
    @dl.e
    public kotlin.reflect.jvm.internal.impl.descriptors.w D0() {
        return this.D;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    @dl.d
    public List<r0> G0() {
        List<r0> list = this.f125747i;
        if (list == null) {
            Z(13);
        }
        return list;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.w
    public boolean J0() {
        return this.f125759u;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.w
    public boolean K() {
        if (this.f125753o) {
            return true;
        }
        Iterator<? extends kotlin.reflect.jvm.internal.impl.descriptors.w> it = a().f().iterator();
        while (it.hasNext()) {
            if (it.next().K()) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    @dl.d
    /* JADX INFO: renamed from: L0 */
    public kotlin.reflect.jvm.internal.impl.descriptors.w k0(kotlin.reflect.jvm.internal.impl.descriptors.k kVar, Modality modality, kotlin.reflect.jvm.internal.impl.descriptors.s sVar, CallableMemberDescriptor.Kind kind, boolean z10) {
        kotlin.reflect.jvm.internal.impl.descriptors.w wVarBuild = q().r(kVar).q(modality).p(sVar).s(kind).j(z10).build();
        if (wVarBuild == null) {
            Z(26);
        }
        return wVarBuild;
    }

    @dl.d
    protected abstract o M0(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.k kVar, @dl.e kotlin.reflect.jvm.internal.impl.descriptors.w wVar, @dl.d CallableMemberDescriptor.Kind kind, @dl.e kotlin.reflect.jvm.internal.impl.name.f fVar, @dl.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.e eVar, @dl.d t0 t0Var);

    @dl.e
    protected kotlin.reflect.jvm.internal.impl.descriptors.w N0(@dl.d c cVar) {
        c0 c0Var;
        r0 r0Var;
        kotlin.reflect.jvm.internal.impl.types.d0 d0VarP;
        if (cVar == null) {
            Z(25);
        }
        boolean[] zArr = new boolean[1];
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.e eVarA = cVar.f125786s != null ? kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.a(getAnnotations(), cVar.f125786s) : getAnnotations();
        kotlin.reflect.jvm.internal.impl.descriptors.k kVar = cVar.f125769b;
        kotlin.reflect.jvm.internal.impl.descriptors.w wVar = cVar.f125772e;
        o oVarM0 = M0(kVar, wVar, cVar.f125773f, cVar.f125779l, eVarA, O0(cVar.f125782o, wVar));
        List<y0> typeParameters = cVar.f125785r == null ? getTypeParameters() : cVar.f125785r;
        zArr[0] = zArr[0] | (!typeParameters.isEmpty());
        ArrayList arrayList = new ArrayList(typeParameters.size());
        TypeSubstitutor typeSubstitutorC = kotlin.reflect.jvm.internal.impl.types.r.c(typeParameters, cVar.f125768a, oVarM0, arrayList, zArr);
        if (typeSubstitutorC == null) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        if (!cVar.f125775h.isEmpty()) {
            for (r0 r0Var2 : cVar.f125775h) {
                kotlin.reflect.jvm.internal.impl.types.d0 d0VarP2 = typeSubstitutorC.p(r0Var2.getType(), Variance.IN_VARIANCE);
                if (d0VarP2 == null) {
                    return null;
                }
                arrayList2.add(kotlin.reflect.jvm.internal.impl.resolve.c.b(oVarM0, d0VarP2, ((kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.f) r0Var2.getValue()).a(), r0Var2.getAnnotations()));
                zArr[0] = (d0VarP2 != r0Var2.getType()) | zArr[0];
            }
        }
        r0 r0Var3 = cVar.f125776i;
        if (r0Var3 != null) {
            kotlin.reflect.jvm.internal.impl.types.d0 d0VarP3 = typeSubstitutorC.p(r0Var3.getType(), Variance.IN_VARIANCE);
            if (d0VarP3 == null) {
                return null;
            }
            c0 c0Var2 = new c0(oVarM0, new kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.d(oVarM0, d0VarP3, cVar.f125776i.getValue()), cVar.f125776i.getAnnotations());
            zArr[0] = (d0VarP3 != cVar.f125776i.getType()) | zArr[0];
            c0Var = c0Var2;
        } else {
            c0Var = null;
        }
        r0 r0Var4 = cVar.f125777j;
        if (r0Var4 != null) {
            r0 r0VarD = r0Var4.d(typeSubstitutorC);
            if (r0VarD == null) {
                return null;
            }
            zArr[0] = zArr[0] | (r0VarD != cVar.f125777j);
            r0Var = r0VarD;
        } else {
            r0Var = null;
        }
        List<b1> listQ0 = Q0(oVarM0, cVar.f125774g, typeSubstitutorC, cVar.f125783p, cVar.f125782o, zArr);
        if (listQ0 == null || (d0VarP = typeSubstitutorC.p(cVar.f125778k, Variance.OUT_VARIANCE)) == null) {
            return null;
        }
        boolean z10 = zArr[0] | (d0VarP != cVar.f125778k);
        zArr[0] = z10;
        if (!z10 && cVar.f125790w) {
            return this;
        }
        oVarM0.S0(c0Var, r0Var, arrayList2, arrayList, listQ0, d0VarP, cVar.f125770c, cVar.f125771d);
        oVarM0.g1(this.f125752n);
        oVarM0.d1(this.f125753o);
        oVarM0.Y0(this.f125754p);
        oVarM0.f1(this.f125755q);
        oVarM0.j1(this.f125756r);
        oVarM0.i1(this.f125761w);
        oVarM0.X0(this.f125757s);
        oVarM0.W0(this.f125758t);
        oVarM0.Z0(this.f125762x);
        oVarM0.c1(cVar.f125784q);
        oVarM0.b1(cVar.f125787t);
        oVarM0.a1(cVar.f125789v != null ? cVar.f125789v.booleanValue() : this.f125763y);
        if (!cVar.f125788u.isEmpty() || this.E != null) {
            Map<kotlin.reflect.jvm.internal.impl.descriptors.a.InterfaceC1142a<?>, Object> map = cVar.f125788u;
            Map<kotlin.reflect.jvm.internal.impl.descriptors.a.InterfaceC1142a<?>, Object> map2 = this.E;
            if (map2 != null) {
                for (Map.Entry<kotlin.reflect.jvm.internal.impl.descriptors.a.InterfaceC1142a<?>, Object> entry : map2.entrySet()) {
                    if (!map.containsKey(entry.getKey())) {
                        map.put(entry.getKey(), entry.getValue());
                    }
                }
            }
            if (map.size() == 1) {
                oVarM0.E = Collections.singletonMap(map.keySet().iterator().next(), map.values().iterator().next());
            } else {
                oVarM0.E = map;
            }
        }
        if (cVar.f125781n || D0() != null) {
            oVarM0.e1((D0() != null ? D0() : this).d(typeSubstitutorC));
        }
        if (cVar.f125780m && !a().f().isEmpty()) {
            if (cVar.f125768a.f()) {
                yh.a<Collection<kotlin.reflect.jvm.internal.impl.descriptors.w>> aVar = this.A;
                if (aVar != null) {
                    oVarM0.A = aVar;
                } else {
                    oVarM0.X(f());
                }
            } else {
                oVarM0.A = new a(typeSubstitutorC);
            }
        }
        return oVarM0;
    }

    public boolean R0() {
        return this.f125762x;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    public <V> V S(kotlin.reflect.jvm.internal.impl.descriptors.a.InterfaceC1142a<V> interfaceC1142a) {
        Map<kotlin.reflect.jvm.internal.impl.descriptors.a.InterfaceC1142a<?>, Object> map = this.E;
        if (map == null) {
            return null;
        }
        return (V) map.get(interfaceC1142a);
    }

    @dl.d
    public o S0(@dl.e r0 r0Var, @dl.e r0 r0Var2, @dl.d List<r0> list, @dl.d List<? extends y0> list2, @dl.d List<b1> list3, @dl.e kotlin.reflect.jvm.internal.impl.types.d0 d0Var, @dl.e Modality modality, @dl.d kotlin.reflect.jvm.internal.impl.descriptors.s sVar) {
        if (list == null) {
            Z(5);
        }
        if (list2 == null) {
            Z(6);
        }
        if (list3 == null) {
            Z(7);
        }
        if (sVar == null) {
            Z(8);
        }
        this.f125744f = CollectionsKt___CollectionsKt.Q5(list2);
        this.f125745g = CollectionsKt___CollectionsKt.Q5(list3);
        this.f125746h = d0Var;
        this.f125750l = modality;
        this.f125751m = sVar;
        this.f125748j = r0Var;
        this.f125749k = r0Var2;
        this.f125747i = list;
        for (int i10 = 0; i10 < list2.size(); i10++) {
            y0 y0Var = list2.get(i10);
            if (y0Var.getIndex() != i10) {
                throw new IllegalStateException(y0Var + " index is " + y0Var.getIndex() + " but position is " + i10);
            }
        }
        for (int i11 = 0; i11 < list3.size(); i11++) {
            b1 b1Var = list3.get(i11);
            if (b1Var.getIndex() != i11 + 0) {
                throw new IllegalStateException(b1Var + "index is " + b1Var.getIndex() + " but position is " + i11);
            }
        }
        return this;
    }

    @dl.d
    protected c T0(@dl.d TypeSubstitutor typeSubstitutor) {
        if (typeSubstitutor == null) {
            Z(24);
        }
        return new c(this, typeSubstitutor.j(), c(), l(), getVisibility(), b(), i(), G0(), l0(), getReturnType(), null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.w
    public boolean U() {
        if (this.f125752n) {
            return true;
        }
        Iterator<? extends kotlin.reflect.jvm.internal.impl.descriptors.w> it = a().f().iterator();
        while (it.hasNext()) {
            if (it.next().U()) {
                return true;
            }
        }
        return false;
    }

    public <V> void V0(kotlin.reflect.jvm.internal.impl.descriptors.a.InterfaceC1142a<V> interfaceC1142a, Object obj) {
        if (this.E == null) {
            this.E = new LinkedHashMap();
        }
        this.E.put(interfaceC1142a, obj);
    }

    public void W0(boolean z10) {
        this.f125758t = z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void X(@dl.d Collection<? extends CallableMemberDescriptor> collection) {
        if (collection == 0) {
            Z(17);
        }
        this.f125764z = collection;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (((kotlin.reflect.jvm.internal.impl.descriptors.w) it.next()).Y()) {
                this.f125760v = true;
                return;
            }
        }
    }

    public void X0(boolean z10) {
        this.f125757s = z10;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.w
    public boolean Y() {
        return this.f125760v;
    }

    public void Y0(boolean z10) {
        this.f125754p = z10;
    }

    public void Z0(boolean z10) {
        this.f125762x = z10;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.j
    @dl.d
    public kotlin.reflect.jvm.internal.impl.descriptors.w a() {
        kotlin.reflect.jvm.internal.impl.descriptors.w wVar = this.B;
        kotlin.reflect.jvm.internal.impl.descriptors.w wVarA = wVar == this ? this : wVar.a();
        if (wVarA == null) {
            Z(20);
        }
        return wVarA;
    }

    public void a1(boolean z10) {
        this.f125763y = z10;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    @dl.d
    public CallableMemberDescriptor.Kind b() {
        CallableMemberDescriptor.Kind kind = this.C;
        if (kind == null) {
            Z(21);
        }
        return kind;
    }

    public <R, D> R c0(kotlin.reflect.jvm.internal.impl.descriptors.m<R, D> mVar, D d10) {
        return mVar.l(this, d10);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.w, kotlin.reflect.jvm.internal.impl.descriptors.v0
    public kotlin.reflect.jvm.internal.impl.descriptors.w d(@dl.d TypeSubstitutor typeSubstitutor) {
        if (typeSubstitutor == null) {
            Z(22);
        }
        return typeSubstitutor.k() ? this : T0(typeSubstitutor).i(a()).g().J(true).build();
    }

    public void d1(boolean z10) {
        this.f125753o = z10;
    }

    @dl.d
    public Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.w> f() {
        U0();
        Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.w> collectionEmptyList = this.f125764z;
        if (collectionEmptyList == null) {
            collectionEmptyList = Collections.emptyList();
        }
        if (collectionEmptyList == null) {
            Z(14);
        }
        return collectionEmptyList;
    }

    public void f1(boolean z10) {
        this.f125755q = z10;
    }

    public boolean g() {
        return this.f125755q;
    }

    public void g1(boolean z10) {
        this.f125752n = z10;
    }

    public kotlin.reflect.jvm.internal.impl.types.d0 getReturnType() {
        return this.f125746h;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    @dl.d
    public List<y0> getTypeParameters() {
        List<y0> list = this.f125744f;
        if (list != null) {
            return list;
        }
        throw new IllegalStateException("typeParameters == null for " + this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.o, kotlin.reflect.jvm.internal.impl.descriptors.a0
    @dl.d
    public kotlin.reflect.jvm.internal.impl.descriptors.s getVisibility() {
        kotlin.reflect.jvm.internal.impl.descriptors.s sVar = this.f125751m;
        if (sVar == null) {
            Z(16);
        }
        return sVar;
    }

    public void h1(@dl.d kotlin.reflect.jvm.internal.impl.types.d0 d0Var) {
        if (d0Var == null) {
            Z(11);
        }
        this.f125746h = d0Var;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    @dl.d
    public List<b1> i() {
        List<b1> list = this.f125745g;
        if (list == null) {
            Z(19);
        }
        return list;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    @dl.e
    public r0 i0() {
        return this.f125749k;
    }

    public void i1(boolean z10) {
        this.f125761w = z10;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.w
    public boolean isSuspend() {
        return this.f125761w;
    }

    public void j1(boolean z10) {
        this.f125756r = z10;
    }

    public void k1(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.s sVar) {
        if (sVar == null) {
            Z(10);
        }
        this.f125751m = sVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a0
    @dl.d
    public Modality l() {
        Modality modality = this.f125750l;
        if (modality == null) {
            Z(15);
        }
        return modality;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    @dl.e
    public r0 l0() {
        return this.f125748j;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a0
    public boolean o0() {
        return this.f125758t;
    }

    @dl.d
    public kotlin.reflect.jvm.internal.impl.descriptors.w.a<? extends kotlin.reflect.jvm.internal.impl.descriptors.w> q() {
        c cVarT0 = T0(TypeSubstitutor.f128039b);
        if (cVarT0 == null) {
            Z(23);
        }
        return cVarT0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    public boolean t0() {
        return this.f125763y;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a0
    public boolean w0() {
        return this.f125757s;
    }
}
