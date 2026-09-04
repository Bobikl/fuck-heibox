package tj;

import org.apache.tools.ant.types.o;

/* JADX INFO: compiled from: ImplementationSpecificArgument.java */
/* JADX INFO: loaded from: classes5.dex */
public class e extends o.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f140730h;

    public final String[] Q1(String str) {
        String str2 = this.f140730h;
        return (str2 == null || str2.equals(str)) ? super.D1() : new String[0];
    }

    public void R1(String str) {
        this.f140730h = str;
    }
}
