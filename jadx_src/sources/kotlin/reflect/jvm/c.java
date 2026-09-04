package kotlin.reflect.jvm;

import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.KClassImpl;
import xh.h;

/* JADX INFO: compiled from: KClassesJvm.kt */
/* JADX INFO: loaded from: classes5.dex */
@h(name = "KClassesJvm")
public final class c {
    @dl.d
    public static final String a(@dl.d kotlin.reflect.d<?> dVar) {
        f0.p(dVar, "<this>");
        String name = ((KClassImpl) dVar).i().getName();
        f0.o(name, "this as KClassImpl).jClass.name");
        return name;
    }
}
