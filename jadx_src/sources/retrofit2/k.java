package retrofit2;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: Invocation.java */
/* JADX INFO: loaded from: classes5.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Method f138977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<?> f138978b;

    k(Method method, List<?> list) {
        this.f138977a = method;
        this.f138978b = Collections.unmodifiableList(list);
    }

    public static k c(Method method, List<?> list) {
        Objects.requireNonNull(method, "method == null");
        Objects.requireNonNull(list, "arguments == null");
        return new k(method, new ArrayList(list));
    }

    public List<?> a() {
        return this.f138978b;
    }

    public Method b() {
        return this.f138977a;
    }

    public String toString() {
        return String.format("%s.%s() %s", this.f138977a.getDeclaringClass().getName(), this.f138977a.getName(), this.f138978b);
    }
}
