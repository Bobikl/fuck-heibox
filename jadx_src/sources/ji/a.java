package ji;

import dl.d;
import ki.b;
import ki.c;
import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.descriptors.g0;
import kotlin.reflect.jvm.internal.impl.incremental.components.Position;
import kotlin.reflect.jvm.internal.impl.incremental.components.ScopeKind;
import kotlin.reflect.jvm.internal.impl.name.f;

/* JADX INFO: compiled from: utils.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class a {
    public static final void a(@d c cVar, @d b from, @d kotlin.reflect.jvm.internal.impl.descriptors.d scopeOwner, @d f name) {
        ki.a location;
        f0.p(cVar, "<this>");
        f0.p(from, "from");
        f0.p(scopeOwner, "scopeOwner");
        f0.p(name, "name");
        if (cVar == c.a.f124469a || (location = from.getLocation()) == null) {
            return;
        }
        Position position = cVar.a() ? location.getPosition() : Position.f125948d.a();
        String filePath = location.getFilePath();
        String strB = kotlin.reflect.jvm.internal.impl.resolve.d.m(scopeOwner).b();
        f0.o(strB, "getFqName(scopeOwner).asString()");
        ScopeKind scopeKind = ScopeKind.CLASSIFIER;
        String strB2 = name.b();
        f0.o(strB2, "name.asString()");
        cVar.b(filePath, position, strB, scopeKind, strB2);
    }

    public static final void b(@d c cVar, @d b from, @d g0 scopeOwner, @d f name) {
        f0.p(cVar, "<this>");
        f0.p(from, "from");
        f0.p(scopeOwner, "scopeOwner");
        f0.p(name, "name");
        String strB = scopeOwner.e().b();
        f0.o(strB, "scopeOwner.fqName.asString()");
        String strB2 = name.b();
        f0.o(strB2, "name.asString()");
        c(cVar, from, strB, strB2);
    }

    public static final void c(@d c cVar, @d b from, @d String packageFqName, @d String name) {
        ki.a location;
        f0.p(cVar, "<this>");
        f0.p(from, "from");
        f0.p(packageFqName, "packageFqName");
        f0.p(name, "name");
        if (cVar == c.a.f124469a || (location = from.getLocation()) == null) {
            return;
        }
        cVar.b(location.getFilePath(), cVar.a() ? location.getPosition() : Position.f125948d.a(), packageFqName, ScopeKind.PACKAGE, name);
    }
}
