package tj;

import com.google.auto.common.s;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import org.apache.tools.ant.Project;
import org.apache.tools.ant.taskdefs.optional.o;
import org.apache.tools.ant.types.o0;

/* JADX INFO: compiled from: FacadeTaskHelper.java */
/* JADX INFO: loaded from: classes5.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<e> f140725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f140726b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f140727c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f140728d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private o0 f140729e;

    public d(String str) {
        this(str, null);
    }

    public d(String str, String str2) {
        this.f140725a = new ArrayList();
        this.f140728d = str;
        this.f140727c = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String[] i(String str, e eVar) {
        return eVar.Q1(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String[] j(int i10) {
        return new String[i10];
    }

    public void c(e eVar) {
        this.f140725a.add(eVar);
    }

    public String[] d() {
        final String strF = f();
        return (String[]) this.f140725a.stream().map(new Function() { // from class: tj.a
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return d.i(strF, (e) obj);
            }
        }).filter(new Predicate() { // from class: tj.b
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return s.a((String[]) obj);
            }
        }).flatMap(new o()).toArray(new IntFunction() { // from class: tj.c
            @Override // java.util.function.IntFunction
            public final Object apply(int i10) {
                return d.j(i10);
            }
        });
    }

    public String e() {
        return this.f140726b;
    }

    public String f() {
        String str = this.f140726b;
        if (str != null) {
            return str;
        }
        String str2 = this.f140727c;
        return str2 != null ? str2 : this.f140728d;
    }

    public o0 g(Project project) {
        if (this.f140729e == null) {
            this.f140729e = new o0(project);
        }
        return this.f140729e;
    }

    public boolean h() {
        return (this.f140726b == null && this.f140727c == null) ? false : true;
    }

    public void k(String str) {
        this.f140726b = str;
    }

    public void l(String str) {
        this.f140727c = str;
    }
}
