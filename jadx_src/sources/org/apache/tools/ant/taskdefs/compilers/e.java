package org.apache.tools.ant.taskdefs.compilers;

import java.io.File;
import java.util.function.Function;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class e implements Function {
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        return ((File) obj).getAbsolutePath();
    }
}
