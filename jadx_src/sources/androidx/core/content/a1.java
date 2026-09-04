package androidx.core.content;

import android.content.UriMatcher;
import android.net.Uri;

/* JADX INFO: compiled from: UriMatcherCompat.java */
/* JADX INFO: loaded from: classes.dex */
public class a1 {
    private a1() {
    }

    @androidx.annotation.n0
    public static androidx.core.util.w<Uri> b(@androidx.annotation.n0 final UriMatcher uriMatcher) {
        return new androidx.core.util.w() { // from class: androidx.core.content.z0
            @Override // androidx.core.util.w
            public /* synthetic */ androidx.core.util.w a(androidx.core.util.w wVar) {
                return androidx.core.util.v.a(this, wVar);
            }

            @Override // androidx.core.util.w
            public /* synthetic */ androidx.core.util.w b(androidx.core.util.w wVar) {
                return androidx.core.util.v.c(this, wVar);
            }

            @Override // androidx.core.util.w
            public /* synthetic */ androidx.core.util.w negate() {
                return androidx.core.util.v.b(this);
            }

            @Override // androidx.core.util.w
            public final boolean test(Object obj) {
                return a1.c(uriMatcher, (Uri) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean c(UriMatcher uriMatcher, Uri uri) {
        return uriMatcher.match(uri) != -1;
    }
}
