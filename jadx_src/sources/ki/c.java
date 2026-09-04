package ki;

import dl.d;
import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.incremental.components.Position;
import kotlin.reflect.jvm.internal.impl.incremental.components.ScopeKind;

/* JADX INFO: compiled from: LookupTracker.kt */
/* JADX INFO: loaded from: classes5.dex */
public interface c {

    /* JADX INFO: compiled from: LookupTracker.kt */
    public static final class a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @d
        public static final a f124469a = new a();

        private a() {
        }

        @Override // ki.c
        public boolean a() {
            return false;
        }

        @Override // ki.c
        public void b(@d String filePath, @d Position position, @d String scopeFqName, @d ScopeKind scopeKind, @d String name) {
            f0.p(filePath, "filePath");
            f0.p(position, "position");
            f0.p(scopeFqName, "scopeFqName");
            f0.p(scopeKind, "scopeKind");
            f0.p(name, "name");
        }
    }

    boolean a();

    void b(@d String str, @d Position position, @d String str2, @d ScopeKind scopeKind, @d String str3);
}
