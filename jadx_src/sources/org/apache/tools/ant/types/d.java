package org.apache.tools.ant.types;

import java.util.function.Predicate;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class d implements Predicate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Class f136125a;

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        return this.f136125a.isInstance((org.apache.tools.ant.types.selectors.v) obj);
    }
}
