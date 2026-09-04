package kotlin.reflect.jvm.internal.impl.load.kotlin;

import com.meituan.robust.Constants;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: typeSignatureMapping.kt */
/* JADX INFO: loaded from: classes5.dex */
public class h<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final k<T> f126496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f126497b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.e
    private T f126498c;

    public void a() {
    }

    public void b() {
        if (this.f126498c == null) {
            this.f126497b++;
        }
    }

    public void c(@dl.d T objectType) {
        f0.p(objectType, "objectType");
        d(objectType);
    }

    protected final void d(@dl.d T type) {
        f0.p(type, "type");
        if (this.f126498c == null) {
            if (this.f126497b > 0) {
                type = this.f126496a.a(kotlin.text.u.h2(Constants.ARRAY_TYPE, this.f126497b) + this.f126496a.e(type));
            }
            this.f126498c = type;
        }
    }

    public void e(@dl.d kotlin.reflect.jvm.internal.impl.name.f name, @dl.d T type) {
        f0.p(name, "name");
        f0.p(type, "type");
        d(type);
    }
}
