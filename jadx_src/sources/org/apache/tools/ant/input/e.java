package org.apache.tools.ant.input;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Vector;

/* JADX INFO: compiled from: MultipleChoiceInputRequest.java */
/* JADX INFO: loaded from: classes5.dex */
public class e extends d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final LinkedHashSet<String> f133467d;

    public e(String str, Collection<String> collection) {
        super(str);
        if (collection == null) {
            throw new IllegalArgumentException("choices must not be null");
        }
        this.f133467d = new LinkedHashSet<>(collection);
    }

    @Deprecated
    public e(String str, Vector<String> vector) {
        this(str, (Collection<String>) vector);
    }

    @Override // org.apache.tools.ant.input.d
    public boolean d() {
        return this.f133467d.contains(b()) || (b().isEmpty() && a() != null);
    }

    public Vector<String> g() {
        return new Vector<>(this.f133467d);
    }
}
