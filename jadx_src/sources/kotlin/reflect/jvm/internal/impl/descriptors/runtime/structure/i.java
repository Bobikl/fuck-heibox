package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ReflectJavaAnnotationArguments.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class i extends e implements mi.e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final Object[] f125917c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(@dl.e kotlin.reflect.jvm.internal.impl.name.f fVar, @dl.d Object[] values) {
        super(fVar, null);
        f0.p(values, "values");
        this.f125917c = values;
    }

    @Override // mi.e
    @dl.d
    public List<e> getElements() {
        Object[] objArr = this.f125917c;
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            e.a aVar = e.f125914b;
            f0.m(obj);
            arrayList.add(aVar.a(obj, null));
        }
        return arrayList;
    }
}
