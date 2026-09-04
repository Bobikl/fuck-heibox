package org.apache.tools.ant.types;

import java.util.stream.Stream;

/* JADX INFO: compiled from: ResourceCollection.java */
/* JADX INFO: loaded from: classes5.dex */
public interface u1 extends Iterable<s1> {
    boolean O();

    boolean isEmpty();

    int size();

    Stream<? extends s1> stream();
}
