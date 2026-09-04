package org.apache.tools.ant;

/* JADX INFO: compiled from: DefaultDefinitions.java */
/* JADX INFO: loaded from: classes5.dex */
public final class v {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f137049b = "ant:if";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f137050c = "ant:unless";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u f137051a;

    public v(u uVar) {
        this.f137051a = uVar;
    }

    private void a(String str) {
        h hVar = new h();
        hVar.t(e2.w(str));
        hVar.s("org.apache.tools.ant.attribute.AttributeNamespace");
        hVar.r(v.class.getClassLoader());
        hVar.u(true);
        this.f137051a.h(hVar);
    }

    private void b(String str, String str2, String str3) {
        h hVar = new h();
        hVar.t(e2.l(str, str2));
        hVar.s(str3);
        hVar.r(v.class.getClassLoader());
        hVar.u(true);
        this.f137051a.h(hVar);
    }

    private void d(String str, String str2) {
        String str3 = "org.apache.tools.ant.attribute." + str2;
        b(f137049b, str, str3);
        b(f137050c, str, str3 + "$Unless");
    }

    public void c() {
        a(f137049b);
        a(f137050c);
        d("true", "IfTrueAttribute");
        d("set", "IfSetAttribute");
        d("blank", "IfBlankAttribute");
    }
}
