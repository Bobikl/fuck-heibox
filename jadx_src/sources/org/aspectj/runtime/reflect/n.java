package org.aspectj.runtime.reflect;

import java.lang.reflect.Modifier;
import kotlin.text.y;
import okhttp3.t;

/* JADX INFO: compiled from: StringMaker.java */
/* JADX INFO: loaded from: classes5.dex */
public class n {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static n f137765j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static n f137766k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    static n f137767l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    boolean f137768a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    boolean f137769b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f137770c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    boolean f137771d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    boolean f137772e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    boolean f137773f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    boolean f137774g = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    boolean f137775h = true;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    int f137776i;

    static {
        n nVar = new n();
        f137765j = nVar;
        nVar.f137768a = true;
        nVar.f137769b = false;
        nVar.f137770c = false;
        nVar.f137771d = false;
        nVar.f137772e = true;
        nVar.f137773f = false;
        nVar.f137774g = false;
        nVar.f137776i = 0;
        n nVar2 = new n();
        f137766k = nVar2;
        nVar2.f137768a = true;
        nVar2.f137769b = true;
        nVar2.f137770c = false;
        nVar2.f137771d = false;
        nVar2.f137772e = false;
        f137765j.f137776i = 1;
        n nVar3 = new n();
        f137767l = nVar3;
        nVar3.f137768a = false;
        nVar3.f137769b = true;
        nVar3.f137770c = false;
        nVar3.f137771d = true;
        nVar3.f137772e = false;
        nVar3.f137775h = false;
        nVar3.f137776i = 2;
    }

    n() {
    }

    public void a(StringBuffer stringBuffer, Class[] clsArr) {
        if (clsArr == null) {
            return;
        }
        if (this.f137769b) {
            stringBuffer.append("(");
            c(stringBuffer, clsArr);
            stringBuffer.append(")");
        } else if (clsArr.length == 0) {
            stringBuffer.append("()");
        } else {
            stringBuffer.append("(..)");
        }
    }

    public void b(StringBuffer stringBuffer, Class[] clsArr) {
        if (!this.f137770c || clsArr == null || clsArr.length == 0) {
            return;
        }
        stringBuffer.append(" throws ");
        c(stringBuffer, clsArr);
    }

    public void c(StringBuffer stringBuffer, Class[] clsArr) {
        for (int i10 = 0; i10 < clsArr.length; i10++) {
            if (i10 > 0) {
                stringBuffer.append(", ");
            }
            stringBuffer.append(g(clsArr[i10]));
        }
    }

    String d(String str) {
        int iLastIndexOf = str.lastIndexOf(45);
        return iLastIndexOf == -1 ? str : str.substring(iLastIndexOf + 1);
    }

    String e(int i10) {
        if (!this.f137771d) {
            return "";
        }
        String string = Modifier.toString(i10);
        if (string.length() == 0) {
            return "";
        }
        return string + " ";
    }

    public String f(Class cls, String str) {
        return h(cls, str, this.f137772e);
    }

    public String g(Class cls) {
        return h(cls, cls.getName(), this.f137768a);
    }

    String h(Class cls, String str, boolean z10) {
        if (cls == null) {
            return "ANONYMOUS";
        }
        if (!cls.isArray()) {
            return z10 ? i(str).replace(y.f128594c, lg.a.f131414g) : str.replace(y.f128594c, lg.a.f131414g);
        }
        Class<?> componentType = cls.getComponentType();
        return h(componentType, componentType.getName(), z10) + t.f132643o;
    }

    String i(String str) {
        int iLastIndexOf = str.lastIndexOf(46);
        return iLastIndexOf == -1 ? str : str.substring(iLastIndexOf + 1);
    }
}
