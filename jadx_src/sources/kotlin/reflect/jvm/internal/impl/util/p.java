package kotlin.reflect.jvm.internal.impl.util;

import com.umeng.analytics.pro.ak;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import kotlin.reflect.jvm.internal.impl.descriptors.w;

/* JADX INFO: compiled from: modifierChecks.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class p implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final String f128276a;

    /* JADX INFO: compiled from: modifierChecks.kt */
    public static final class a extends p {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f128277b;

        public a(int i10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("must have at least ");
            sb2.append(i10);
            sb2.append(" value parameter");
            sb2.append(i10 > 1 ? ak.aB : "");
            super(sb2.toString(), null);
            this.f128277b = i10;
        }

        @Override // kotlin.reflect.jvm.internal.impl.util.f
        public boolean b(@dl.d w functionDescriptor) {
            f0.p(functionDescriptor, "functionDescriptor");
            return functionDescriptor.i().size() >= this.f128277b;
        }
    }

    /* JADX INFO: compiled from: modifierChecks.kt */
    public static final class b extends p {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f128278b;

        public b(int i10) {
            super("must have exactly " + i10 + " value parameters", null);
            this.f128278b = i10;
        }

        @Override // kotlin.reflect.jvm.internal.impl.util.f
        public boolean b(@dl.d w functionDescriptor) {
            f0.p(functionDescriptor, "functionDescriptor");
            return functionDescriptor.i().size() == this.f128278b;
        }
    }

    /* JADX INFO: compiled from: modifierChecks.kt */
    public static final class c extends p {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dl.d
        public static final c f128279b = new c();

        private c() {
            super("must have no value parameters", null);
        }

        @Override // kotlin.reflect.jvm.internal.impl.util.f
        public boolean b(@dl.d w functionDescriptor) {
            f0.p(functionDescriptor, "functionDescriptor");
            return functionDescriptor.i().isEmpty();
        }
    }

    /* JADX INFO: compiled from: modifierChecks.kt */
    public static final class d extends p {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dl.d
        public static final d f128280b = new d();

        private d() {
            super("must have a single value parameter", null);
        }

        @Override // kotlin.reflect.jvm.internal.impl.util.f
        public boolean b(@dl.d w functionDescriptor) {
            f0.p(functionDescriptor, "functionDescriptor");
            return functionDescriptor.i().size() == 1;
        }
    }

    private p(String str) {
        this.f128276a = str;
    }

    public /* synthetic */ p(String str, u uVar) {
        this(str);
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.f
    @dl.e
    public String a(@dl.d w wVar) {
        return f.a.a(this, wVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.f
    @dl.d
    public String getDescription() {
        return this.f128276a;
    }
}
