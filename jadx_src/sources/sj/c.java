package sj;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.b2;

/* JADX INFO: compiled from: Service.java */
/* JADX INFO: loaded from: classes5.dex */
public class c extends b2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private List<a> f139403e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f139404f;

    public void B1(a aVar) {
        aVar.B1();
        this.f139403e.add(aVar);
    }

    public void D1() {
        String str = this.f139404f;
        if (str == null) {
            throw new BuildException("type attribute must be set for service element", w1());
        }
        if (str.isEmpty()) {
            throw new BuildException("Invalid empty type classname", w1());
        }
        if (this.f139403e.isEmpty()) {
            throw new BuildException("provider attribute or nested provider element must be set!", w1());
        }
    }

    public InputStream G1() throws IOException {
        return new ByteArrayInputStream(((String) this.f139403e.stream().map(new Function() { // from class: sj.b
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((a) obj).D1();
            }
        }).collect(Collectors.joining("\n"))).getBytes(StandardCharsets.UTF_8));
    }

    public String H1() {
        return this.f139404f;
    }

    public void I1(String str) {
        a aVar = new a();
        aVar.G1(str);
        this.f139403e.add(aVar);
    }

    public void K1(String str) {
        this.f139404f = str;
    }
}
