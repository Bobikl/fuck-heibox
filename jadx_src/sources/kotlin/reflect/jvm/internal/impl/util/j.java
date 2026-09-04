package kotlin.reflect.jvm.internal.impl.util;

import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import kotlin.reflect.jvm.internal.impl.descriptors.w;

/* JADX INFO: compiled from: modifierChecks.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class j implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final String f128240a;

    /* JADX INFO: compiled from: modifierChecks.kt */
    public static final class a extends j {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dl.d
        public static final a f128241b = new a();

        private a() {
            super("must be a member function", null);
        }

        @Override // kotlin.reflect.jvm.internal.impl.util.f
        public boolean b(@dl.d w functionDescriptor) {
            f0.p(functionDescriptor, "functionDescriptor");
            return functionDescriptor.i0() != null;
        }
    }

    /* JADX INFO: compiled from: modifierChecks.kt */
    public static final class b extends j {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dl.d
        public static final b f128242b = new b();

        private b() {
            super("must be a member or an extension function", null);
        }

        @Override // kotlin.reflect.jvm.internal.impl.util.f
        public boolean b(@dl.d w functionDescriptor) {
            f0.p(functionDescriptor, "functionDescriptor");
            return (functionDescriptor.i0() == null && functionDescriptor.l0() == null) ? false : true;
        }
    }

    private j(String str) {
        this.f128240a = str;
    }

    public /* synthetic */ j(String str, u uVar) {
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
        return this.f128240a;
    }
}
