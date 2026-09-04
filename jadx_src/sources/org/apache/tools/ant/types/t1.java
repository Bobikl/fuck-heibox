package org.apache.tools.ant.types;

import java.util.stream.Stream;

/* JADX INFO: compiled from: ResourceCollection.java */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class t1 {
    public static boolean a(u1 u1Var) {
        return u1Var.size() == 0;
    }

    public static Stream b(u1 u1Var) {
        Stream.Builder builder = Stream.builder();
        u1Var.forEach(builder);
        return builder.build();
    }
}
