package org.apache.tools.ant.types;

import com.huawei.hms.framework.common.ContainerUtils;
import java.io.File;
import java.util.Vector;
import java.util.function.Function;
import java.util.function.IntFunction;
import org.apache.tools.ant.BuildException;

/* JADX INFO: compiled from: Environment.java */
/* JADX INFO: loaded from: classes5.dex */
public class z {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected Vector<a> f136680b = new Vector<>();

    /* JADX INFO: compiled from: Environment.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f136681a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f136682b;

        public String a() throws BuildException {
            h();
            return this.f136681a.trim() + ContainerUtils.KEY_VALUE_DELIMITER + this.f136682b.trim();
        }

        public String b() {
            return this.f136681a;
        }

        public String c() {
            return this.f136682b;
        }

        public void d(File file) {
            this.f136682b = file.getAbsolutePath();
        }

        public void e(String str) {
            this.f136681a = str;
        }

        public void f(o0 o0Var) {
            this.f136682b = o0Var.toString();
        }

        public void g(String str) {
            this.f136682b = str;
        }

        public void h() {
            if (this.f136681a == null || this.f136682b == null) {
                throw new BuildException("key and value must be specified for environment variables.");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String[] e(int i10) {
        return new String[i10];
    }

    public void b(a aVar) {
        this.f136680b.addElement(aVar);
    }

    public String[] c() throws BuildException {
        if (this.f136680b.isEmpty()) {
            return null;
        }
        return (String[]) this.f136680b.stream().map(new Function() { // from class: org.apache.tools.ant.types.x
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((z.a) obj).a();
            }
        }).toArray(new IntFunction() { // from class: org.apache.tools.ant.types.y
            @Override // java.util.function.IntFunction
            public final Object apply(int i10) {
                return z.e(i10);
            }
        });
    }

    public Vector<a> d() {
        return this.f136680b;
    }
}
