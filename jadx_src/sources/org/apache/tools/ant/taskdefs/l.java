package org.apache.tools.ant.taskdefs;

import java.io.File;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Project;

/* JADX INFO: compiled from: AntStructure.java */
/* JADX INFO: loaded from: classes5.dex */
public class l extends org.apache.tools.ant.u2 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private File f134434k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private c f134435l = new b();

    /* JADX INFO: compiled from: AntStructure.java */
    public static class b implements c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final String f134436b = "%boolean;";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final String f134437c = "%tasks;";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final String f134438d = "%types;";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Hashtable<String, String> f134439a;

        private b() {
            this.f134439a = new Hashtable<>();
        }

        public static final boolean e(String[] strArr) {
            for (String str : strArr) {
                if (!f(str)) {
                    return false;
                }
            }
            return true;
        }

        public static final boolean f(String str) {
            int length = str.length();
            for (int i10 = 0; i10 < length; i10++) {
                char cCharAt = str.charAt(i10);
                if (!Character.isLetterOrDigit(cCharAt) && cCharAt != '.' && cCharAt != '-' && cCharAt != '_' && cCharAt != ':') {
                    return false;
                }
            }
            return true;
        }

        private void g(PrintWriter printWriter, Set<String> set, Set<String> set2) {
            printWriter.println("<?xml version=\"1.0\" encoding=\"UTF-8\" ?>");
            printWriter.println("<!ENTITY % boolean \"(true|false|on|off|yes|no)\">");
            printWriter.println((String) set.stream().collect(Collectors.joining(" | ", "<!ENTITY % tasks \"", "\">")));
            printWriter.println((String) set2.stream().collect(Collectors.joining(" | ", "<!ENTITY % types \"", "\">")));
            printWriter.println();
            printWriter.print("<!ELEMENT project (target | extension-point | ");
            printWriter.print(f134437c);
            printWriter.print(" | ");
            printWriter.print(f134438d);
            printWriter.println(")*>");
            printWriter.println("<!ATTLIST project");
            printWriter.println("          name    CDATA #IMPLIED");
            printWriter.println("          default CDATA #IMPLIED");
            printWriter.println("          basedir CDATA #IMPLIED>");
            printWriter.println("");
        }

        private void h(PrintWriter printWriter, String str) {
            printWriter.print("<!ATTLIST ");
            printWriter.println(str);
            printWriter.println("          id                      ID    #IMPLIED");
            printWriter.println("          name                    CDATA #REQUIRED");
            printWriter.println("          if                      CDATA #IMPLIED");
            printWriter.println("          unless                  CDATA #IMPLIED");
            printWriter.println("          depends                 CDATA #IMPLIED");
            printWriter.println("          extensionOf             CDATA #IMPLIED");
            printWriter.println("          onMissingExtensionPoint CDATA #IMPLIED");
            printWriter.println("          description             CDATA #IMPLIED>");
            printWriter.println("");
        }

        @Override // org.apache.tools.ant.taskdefs.l.c
        public void a(PrintWriter printWriter, Project project, Hashtable<String, Class<?>> hashtable, Hashtable<String, Class<?>> hashtable2) {
            g(printWriter, hashtable.keySet(), hashtable2.keySet());
        }

        @Override // org.apache.tools.ant.taskdefs.l.c
        public void b(PrintWriter printWriter) {
            this.f134439a.clear();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r19v0, types: [java.io.PrintWriter] */
        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // org.apache.tools.ant.taskdefs.l.c
        public void c(PrintWriter printWriter, Project project, String str, Class<?> cls) {
            Iterator it;
            Class cls2;
            Class cls3 = org.apache.tools.ant.types.w.class;
            if (this.f134439a.containsKey(str)) {
                return;
            }
            this.f134439a.put(str, "");
            try {
                org.apache.tools.ant.i1 i1VarB = org.apache.tools.ant.i1.B(project, cls);
                StringBuilder sb2 = new StringBuilder("<!ELEMENT ");
                sb2.append(str);
                sb2.append(" ");
                int i10 = 1;
                if (org.apache.tools.ant.types.q1.class.equals(cls)) {
                    sb2.append(String.format("EMPTY>%n<!ATTLIST %s%n          id ID #IMPLIED%n          refid IDREF #IMPLIED>%n", str));
                    printWriter.println(sb2);
                    return;
                }
                ArrayList<String> arrayList = new ArrayList();
                if (i1VarB.N()) {
                    arrayList.add("#PCDATA");
                }
                if (org.apache.tools.ant.x2.class.isAssignableFrom(cls)) {
                    arrayList.add(f134437c);
                }
                arrayList.addAll(Collections.list(i1VarB.E()));
                Collector<CharSequence, ?, String> collectorJoining = Collectors.joining(" | ", "(", ")");
                if (arrayList.isEmpty()) {
                    sb2.append("EMPTY");
                } else {
                    sb2.append((String) arrayList.stream().collect(collectorJoining));
                    if (arrayList.size() > 1 || !"#PCDATA".equals(arrayList.get(0))) {
                        sb2.append(androidx.webkit.b.f28327e);
                    }
                }
                sb2.append(">");
                printWriter.println(sb2);
                StringBuilder sb3 = new StringBuilder();
                sb3.append(String.format("<!ATTLIST %s%n          id ID #IMPLIED", str));
                Iterator it2 = Collections.list(i1VarB.t()).iterator();
                while (it2.hasNext()) {
                    String str2 = (String) it2.next();
                    if (!"id".equals(str2)) {
                        Object[] objArr = new Object[i10];
                        objArr[0] = str2;
                        sb3.append(String.format("%n          %s ", objArr));
                        Class<?> clsS = i1VarB.s(str2);
                        if (clsS.equals(Boolean.class) || clsS.equals(Boolean.TYPE)) {
                            it = it2;
                            cls2 = cls3;
                            sb3.append(f134436b);
                            sb3.append(" ");
                        } else {
                            if (org.apache.tools.ant.types.q1.class.isAssignableFrom(clsS)) {
                                sb3.append("IDREF ");
                                it = it2;
                            } else if (cls3.isAssignableFrom(clsS)) {
                                try {
                                    it = it2;
                                    try {
                                        String[] strArrE = ((org.apache.tools.ant.types.w) clsS.asSubclass(cls3).getDeclaredConstructor(new Class[0]).newInstance(new Object[0])).e();
                                        if (strArrE == null || strArrE.length == 0 || !e(strArrE)) {
                                            sb3.append("CDATA ");
                                        } else {
                                            sb3.append((String) Stream.of((Object[]) strArrE).collect(collectorJoining));
                                            sb3.append(" ");
                                        }
                                    } catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException unused) {
                                        sb3.append("CDATA ");
                                    }
                                } catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException unused2) {
                                    it = it2;
                                }
                            } else {
                                it = it2;
                                if (Enum.class.isAssignableFrom(clsS)) {
                                    Class cls4 = cls3;
                                    try {
                                        Enum[] enumArr = (Enum[]) clsS.getMethod("values", new Class[0]).invoke(null, new Object[0]);
                                        if (enumArr.length == 0) {
                                            sb3.append("CDATA ");
                                            cls2 = cls4;
                                        } else {
                                            sb3.append((String) Stream.of((Object[]) enumArr).map(new Function() { // from class: org.apache.tools.ant.taskdefs.m
                                                @Override // java.util.function.Function
                                                public final Object apply(Object obj) {
                                                    return ((Enum) obj).name();
                                                }
                                            }).collect(collectorJoining));
                                            sb3.append(" ");
                                            cls2 = cls4;
                                        }
                                    } catch (Exception unused3) {
                                        sb3.append("CDATA ");
                                        cls2 = cls4;
                                    }
                                } else {
                                    cls2 = cls3;
                                    sb3.append("CDATA ");
                                }
                            }
                            cls2 = cls3;
                        }
                        sb3.append("#IMPLIED");
                        it2 = it;
                        cls3 = cls2;
                        i10 = 1;
                    }
                }
                sb3.append(String.format(">%n", new Object[0]));
                printWriter.println(sb3);
                for (String str3 : arrayList) {
                    if (!"#PCDATA".equals(str3) && !f134437c.equals(str3) && !f134438d.equals(str3)) {
                        c(printWriter, project, str3, i1VarB.x(str3));
                    }
                }
            } catch (Throwable unused4) {
            }
        }

        @Override // org.apache.tools.ant.taskdefs.l.c
        public void d(PrintWriter printWriter) {
            printWriter.print("<!ELEMENT target (");
            printWriter.print(f134437c);
            printWriter.print(" | ");
            printWriter.print(f134438d);
            printWriter.println(")*>");
            printWriter.println("");
            h(printWriter, "target");
            printWriter.println("<!ELEMENT extension-point EMPTY>");
            printWriter.println("");
            h(printWriter, "extension-point");
        }
    }

    /* JADX INFO: compiled from: AntStructure.java */
    public interface c {
        void a(PrintWriter printWriter, Project project, Hashtable<String, Class<?>> hashtable, Hashtable<String, Class<?>> hashtable2);

        void b(PrintWriter printWriter);

        void c(PrintWriter printWriter, Project project, String str, Class<?> cls);

        void d(PrintWriter printWriter);
    }

    @Override // org.apache.tools.ant.u2
    public void D1() throws BuildException {
        if (this.f134434k == null) {
            throw new BuildException("output attribute is required", w1());
        }
        try {
            PrintWriter printWriter = new PrintWriter(new OutputStreamWriter(Files.newOutputStream(this.f134434k.toPath(), new OpenOption[0]), StandardCharsets.UTF_8));
            try {
                this.f134435l.a(printWriter, b(), new Hashtable<>(b().z0()), new Hashtable<>(b().g0()));
                this.f134435l.d(printWriter);
                for (String str : b().b0().keySet()) {
                    this.f134435l.c(printWriter, b(), str, b().g0().get(str));
                }
                for (String str2 : b().e0().keySet()) {
                    this.f134435l.c(printWriter, b(), str2, b().z0().get(str2));
                }
                this.f134435l.b(printWriter);
                if (printWriter.checkError()) {
                    throw new IOException("Encountered an error writing Ant structure");
                }
                printWriter.close();
                return;
            } catch (Throwable th2) {
                try {
                    printWriter.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (IOException e10) {
            throw new BuildException("Error writing " + this.f134434k.getAbsolutePath(), e10, w1());
        }
        throw new BuildException("Error writing " + this.f134434k.getAbsolutePath(), e10, w1());
    }

    public void i2(c cVar) {
        this.f134435l = cVar;
    }

    protected boolean j2(String[] strArr) {
        return b.e(strArr);
    }

    protected boolean k2(String str) {
        return b.f(str);
    }

    public void l2(File file) {
        this.f134434k = file;
    }
}
