package org.apache.tools.ant.types.optional;

import java.util.ArrayList;
import org.apache.tools.ant.util.g0;

/* JADX INFO: compiled from: ScriptMapper.java */
/* JADX INFO: loaded from: classes5.dex */
public class d extends a implements g0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ArrayList<String> f136256g;

    public void U1(String str) {
        this.f136256g.add(str);
    }

    public void clear() {
        this.f136256g = new ArrayList<>(1);
    }

    @Override // org.apache.tools.ant.util.g0
    public void n0(String str) {
    }

    @Override // org.apache.tools.ant.util.g0
    public void q0(String str) {
    }

    @Override // org.apache.tools.ant.util.g0
    public String[] y0(String str) {
        I1();
        H1().s("source", str);
        clear();
        G1("ant_mapper");
        if (this.f136256g.isEmpty()) {
            return null;
        }
        ArrayList<String> arrayList = this.f136256g;
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }
}
