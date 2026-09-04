package androidx.core.content.pm;

import androidx.annotation.RestrictTo;
import androidx.annotation.k1;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: ShortcutInfoCompatSaver.java */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public abstract class o<T> {

    /* JADX INFO: compiled from: ShortcutInfoCompatSaver.java */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static class a extends o<Void> {
        @Override // androidx.core.content.pm.o
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Void a(List<l> list) {
            return null;
        }

        @Override // androidx.core.content.pm.o
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Void c() {
            return null;
        }

        @Override // androidx.core.content.pm.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public Void d(List<String> list) {
            return null;
        }
    }

    @androidx.annotation.d
    public abstract T a(List<l> list);

    @k1
    public List<l> b() throws Exception {
        return new ArrayList();
    }

    @androidx.annotation.d
    public abstract T c();

    @androidx.annotation.d
    public abstract T d(List<String> list);
}
