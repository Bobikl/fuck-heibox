package org.apache.tools.ant.types.selectors;

import java.io.File;

/* JADX INFO: compiled from: DependSelector.java */
/* JADX INFO: loaded from: classes5.dex */
public class n extends y {
    @Override // org.apache.tools.ant.types.selectors.y
    public boolean m2(File file, File file2) {
        return m0.e(file, file2, this.f136645l);
    }

    @Override // org.apache.tools.ant.types.s
    public String toString() {
        StringBuilder sb2 = new StringBuilder("{dependselector targetdir: ");
        File file = this.f136642i;
        if (file == null) {
            sb2.append("NOT YET SET");
        } else {
            sb2.append(file.getName());
        }
        sb2.append(" granularity: ");
        sb2.append(this.f136645l);
        if (this.f136644k != null) {
            sb2.append(" mapper: ");
            sb2.append(this.f136644k.toString());
        } else if (this.f136643j != null) {
            sb2.append(" mapper: ");
            sb2.append(this.f136643j.toString());
        }
        sb2.append(z5.g.f141884d);
        return sb2.toString();
    }
}
