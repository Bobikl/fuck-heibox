package org.apache.tools.ant.filters;

import java.io.StringReader;
import org.apache.tools.ant.util.i1;

/* JADX INFO: compiled from: StringInputStream.java */
/* JADX INFO: loaded from: classes5.dex */
public class s extends i1 {
    public s(String str) {
        super(new StringReader(str));
    }

    public s(String str, String str2) {
        super(new StringReader(str), str2);
    }
}
