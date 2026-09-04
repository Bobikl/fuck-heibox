package org.apache.tools.ant.taskdefs.optional.ejb;

import java.util.function.Function;
import java.util.jar.JarEntry;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class x implements Function {
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        return ((JarEntry) obj).getName();
    }
}
