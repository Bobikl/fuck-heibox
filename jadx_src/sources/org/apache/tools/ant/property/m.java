package org.apache.tools.ant.property;

import com.google.auto.common.s;
import java.text.ParsePosition;
import java.util.Collection;
import java.util.function.Function;
import java.util.function.Predicate;
import org.apache.tools.ant.Project;

/* JADX INFO: compiled from: ParseProperties.java */
/* JADX INFO: loaded from: classes5.dex */
public class m implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Project f133584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f133585b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Collection<n> f133586c;

    public m(Project project, Collection<n> collection, a aVar) {
        this.f133584a = project;
        this.f133586c = collection;
        this.f133585b = aVar;
    }

    private Object e(String str) {
        return this.f133585b.getProperty(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String f(String str, ParsePosition parsePosition, n nVar) {
        return nVar.e(str, parsePosition, this);
    }

    private String h(final String str, final ParsePosition parsePosition) {
        return (String) this.f133586c.stream().map(new Function() { // from class: org.apache.tools.ant.property.k
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f133581a.f(str, parsePosition, (n) obj);
            }
        }).filter(new Predicate() { // from class: org.apache.tools.ant.property.l
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return s.a((String) obj);
            }
        }).findFirst().orElse(null);
    }

    @Override // org.apache.tools.ant.property.j
    public Object a(String str, ParsePosition parsePosition) {
        String strH;
        int index = parsePosition.getIndex();
        if (index > str.length() || (strH = h(str, parsePosition)) == null) {
            return null;
        }
        Object objE = e(strH);
        if (objE != null) {
            return objE;
        }
        Project project = this.f133584a;
        if (project != null) {
            project.M0("Property \"" + strH + "\" has not been set", 3);
        }
        return str.substring(index, parsePosition.getIndex());
    }

    @Override // org.apache.tools.ant.property.j
    public Project b() {
        return this.f133584a;
    }

    public boolean d(String str) {
        if (str == null) {
            return false;
        }
        int length = str.length();
        ParsePosition parsePosition = new ParsePosition(0);
        while (parsePosition.getIndex() < length) {
            if (h(str, parsePosition) != null) {
                return true;
            }
            parsePosition.setIndex(parsePosition.getIndex() + 1);
        }
        return false;
    }

    public Object g(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        int length = str.length();
        ParsePosition parsePosition = new ParsePosition(0);
        Object objA = a(str, parsePosition);
        if (objA != null && parsePosition.getIndex() >= length) {
            return objA;
        }
        StringBuilder sb2 = new StringBuilder(length * 2);
        if (objA == null) {
            sb2.append(str.charAt(parsePosition.getIndex()));
            parsePosition.setIndex(parsePosition.getIndex() + 1);
        } else {
            sb2.append(objA);
        }
        while (parsePosition.getIndex() < length) {
            Object objA2 = a(str, parsePosition);
            if (objA2 == null) {
                sb2.append(str.charAt(parsePosition.getIndex()));
                parsePosition.setIndex(parsePosition.getIndex() + 1);
            } else {
                sb2.append(objA2);
            }
        }
        return sb2.toString();
    }
}
