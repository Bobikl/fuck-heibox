package vj;

import com.max.xiaoheihe.module.webview.WebviewFragment;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.script.Compilable;
import javax.script.CompiledScript;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.SimpleBindings;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Project;
import org.apache.tools.ant.j1;
import org.apache.tools.ant.util.s0;
import org.apache.tools.ant.util.x1;

/* JADX INFO: compiled from: JavaxScriptRunner.java */
/* JADX INFO: loaded from: classes5.dex */
public class e extends x1 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f140887k = "polyglot.js.allowAllAccess";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f140888l = "polyglot.js.nashorn-compat";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final List<String> f140889m = Arrays.asList(WebviewFragment.f94378y4, "javascript");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ScriptEngine f140890i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private CompiledScript f140891j;

    private void H(BiConsumer<String, Object> biConsumer) {
        Map<String, Object> mapK = k();
        if ("FX".equalsIgnoreCase(n())) {
            mapK = (Map) mapK.entrySet().stream().collect(Collectors.toMap(new Function() { // from class: vj.a
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return e.J((Map.Entry) obj);
                }
            }, new Function() { // from class: vj.b
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return ((Map.Entry) obj).getValue();
                }
            }));
        }
        mapK.forEach(biConsumer);
    }

    private ScriptEngine I() {
        ScriptEngine scriptEngine = this.f140890i;
        if (scriptEngine != null) {
            return scriptEngine;
        }
        if (K()) {
            M();
        }
        ScriptEngine engineByName = new ScriptEngineManager().getEngineByName(n());
        if (engineByName == null && s0.n("15") && K()) {
            p().M0("Java 15 has removed Nashorn, you must provide an engine for running JavaScript yourself. GraalVM JavaScript currently is the preferred option.", 1);
        }
        L(engineByName);
        if (engineByName != null && m()) {
            this.f140890i = engineByName;
        }
        return engineByName;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String J(Map.Entry entry) {
        return String.format("%s:%s", entry.getKey(), entry.getValue().getClass().getName());
    }

    private boolean K() {
        return f140889m.contains(n());
    }

    private void L(ScriptEngine scriptEngine) {
        if (scriptEngine == null || !scriptEngine.getClass().getName().contains("Graal")) {
            return;
        }
        scriptEngine.getBindings(100).put(f140887k, Boolean.TRUE);
    }

    private void M() {
        if (p() != null) {
            System.setProperty(f140888l, Project.t1(p().u0(j1.Q)) ? "false" : "true");
        }
    }

    private static BuildException N(Throwable th2) {
        BuildException buildException = th2 instanceof BuildException ? (BuildException) th2 : null;
        while (th2.getCause() != null) {
            th2 = th2.getCause();
            if (th2 instanceof BuildException) {
                buildException = (BuildException) th2;
            }
        }
        return buildException;
    }

    @Override // org.apache.tools.ant.util.x1
    public boolean F() {
        if (this.f140890i != null) {
            return true;
        }
        g();
        ClassLoader classLoaderW = w();
        try {
            return I() != null;
        } catch (Exception unused) {
            return false;
        } finally {
            x(classLoaderW);
        }
    }

    @Override // org.apache.tools.ant.util.x1
    public Object i(String str) throws BuildException {
        g();
        ClassLoader classLoaderW = w();
        try {
            try {
                try {
                    if (l()) {
                        String str2 = String.format("%s.%s.%d.%d", j1.f133481e, n(), Integer.valueOf(Objects.hashCode(q())), Integer.valueOf(Objects.hashCode(getClass().getClassLoader())));
                        if (this.f140891j == null) {
                            this.f140891j = (CompiledScript) p().w0(str2);
                        }
                        if (this.f140891j == null) {
                            Compilable compilableI = I();
                            if (compilableI == null) {
                                throw new BuildException("Unable to create javax script engine for %s", n());
                            }
                            if (compilableI instanceof Compilable) {
                                p().M0("compile script " + str, 3);
                                this.f140891j = compilableI.compile(q());
                            } else {
                                p().M0("script compilation not available for " + str, 3);
                                this.f140891j = null;
                            }
                            p().i(str2, this.f140891j);
                        }
                        if (this.f140891j != null) {
                            final SimpleBindings simpleBindings = new SimpleBindings();
                            H(new BiConsumer() { // from class: vj.c
                                @Override // java.util.function.BiConsumer
                                public final void accept(Object obj, Object obj2) {
                                    simpleBindings.put((String) obj, obj2);
                                }
                            });
                            p().M0("run compiled script " + str2, 4);
                            Object objEval = this.f140891j.eval(simpleBindings);
                            x(classLoaderW);
                            return objEval;
                        }
                    }
                    final ScriptEngine scriptEngineI = I();
                    if (scriptEngineI != null) {
                        H(new BiConsumer() { // from class: vj.d
                            @Override // java.util.function.BiConsumer
                            public final void accept(Object obj, Object obj2) {
                                scriptEngineI.put((String) obj, obj2);
                            }
                        });
                        Object objEval2 = scriptEngineI.eval(q());
                        x(classLoaderW);
                        return objEval2;
                    }
                    throw new BuildException("Unable to create javax script engine for " + n());
                } catch (Exception e10) {
                    e = e10;
                    Throwable cause = e.getCause();
                    if (cause != null) {
                        if (cause instanceof BuildException) {
                            throw ((BuildException) cause);
                        }
                        e = cause;
                    }
                    throw new BuildException(e);
                }
            } catch (BuildException e11) {
                throw N(e11);
            }
        } catch (Throwable th2) {
            x(classLoaderW);
            throw th2;
        }
    }

    @Override // org.apache.tools.ant.util.x1
    public void j(String str) throws BuildException {
        i(str);
    }

    @Override // org.apache.tools.ant.util.x1
    public String o() {
        return "javax";
    }
}
