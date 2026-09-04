package kotlin.reflect.jvm.internal.calls;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import kotlin.z;

/* JADX INFO: loaded from: classes5.dex */
public class a implements InvocationHandler {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Class f125287b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f125288c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final z f125289d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final z f125290e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List f125291f;

    public a(Class cls, Map map, z zVar, z zVar2, List list) {
        this.f125287b = cls;
        this.f125288c = map;
        this.f125289d = zVar;
        this.f125290e = zVar2;
        this.f125291f = list;
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) {
        return AnnotationConstructorCallerKt.i(this.f125287b, this.f125288c, this.f125289d, this.f125290e, this.f125291f, obj, method, objArr);
    }
}
