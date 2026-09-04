package org.apache.tools.ant.types.selectors.modifiedselector;

import java.io.File;
import java.io.FileReader;
import org.apache.tools.ant.util.j0;

/* JADX INFO: compiled from: HashvalueAlgorithm.java */
/* JADX INFO: loaded from: classes5.dex */
public class f implements a {
    @Override // org.apache.tools.ant.types.selectors.modifiedselector.a
    public String a(File file) {
        if (!file.canRead()) {
            return null;
        }
        try {
            FileReader fileReader = new FileReader(file);
            try {
                String string = Integer.toString(j0.j0(fileReader).hashCode());
                fileReader.close();
                return string;
            } catch (Throwable th2) {
                try {
                    fileReader.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // org.apache.tools.ant.types.selectors.modifiedselector.a
    public boolean isValid() {
        return true;
    }

    public String toString() {
        return "HashvalueAlgorithm";
    }
}
