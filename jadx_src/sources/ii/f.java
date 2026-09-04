package ii;

import com.tencent.qcloud.core.util.IOUtils;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.reflect.jvm.internal.impl.load.kotlin.o;

/* JADX INFO: compiled from: ReflectKotlinClass.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class f implements o {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    public static final a f119377c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final Class<?> f119378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final KotlinClassHeader f119379b;

    /* JADX INFO: compiled from: ReflectKotlinClass.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        @dl.e
        public final f a(@dl.d Class<?> klass) {
            f0.p(klass, "klass");
            kotlin.reflect.jvm.internal.impl.load.kotlin.header.a aVar = new kotlin.reflect.jvm.internal.impl.load.kotlin.header.a();
            c.f119375a.b(klass, aVar);
            KotlinClassHeader kotlinClassHeaderL = aVar.l();
            u uVar = null;
            if (kotlinClassHeaderL == null) {
                return null;
            }
            return new f(klass, kotlinClassHeaderL, uVar);
        }
    }

    private f(Class<?> cls, KotlinClassHeader kotlinClassHeader) {
        this.f119378a = cls;
        this.f119379b = kotlinClassHeader;
    }

    public /* synthetic */ f(Class cls, KotlinClassHeader kotlinClassHeader, u uVar) {
        this(cls, kotlinClassHeader);
    }

    @dl.d
    public final Class<?> a() {
        return this.f119378a;
    }

    public boolean equals(@dl.e Object obj) {
        return (obj instanceof f) && f0.g(this.f119378a, ((f) obj).f119378a);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.o
    @dl.d
    public kotlin.reflect.jvm.internal.impl.name.b f() {
        return ReflectClassUtilKt.a(this.f119378a);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.o
    public void g(@dl.d o.d visitor, @dl.e byte[] bArr) throws InvocationTargetException {
        f0.p(visitor, "visitor");
        c.f119375a.i(this.f119378a, visitor);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.o
    @dl.d
    public String getLocation() {
        StringBuilder sb2 = new StringBuilder();
        String name = this.f119378a.getName();
        f0.o(name, "klass.name");
        sb2.append(kotlin.text.u.k2(name, lg.a.f131414g, IOUtils.DIR_SEPARATOR_UNIX, false, 4, null));
        sb2.append(".class");
        return sb2.toString();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.o
    @dl.d
    public KotlinClassHeader h() {
        return this.f119379b;
    }

    public int hashCode() {
        return this.f119378a.hashCode();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.o
    public void i(@dl.d o.c visitor, @dl.e byte[] bArr) throws InvocationTargetException {
        f0.p(visitor, "visitor");
        c.f119375a.b(this.f119378a, visitor);
    }

    @dl.d
    public String toString() {
        return f.class.getName() + ": " + this.f119378a;
    }
}
