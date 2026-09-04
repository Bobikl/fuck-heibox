package androidx.media;

import androidx.annotation.RestrictTo;
import androidx.annotation.n0;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes6.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public interface AudioAttributesImpl extends androidx.versionedparcelable.g {

    public interface a {
        @n0
        a a(int i10);

        @n0
        a b(int i10);

        @n0
        AudioAttributesImpl build();

        @n0
        a c(int i10);

        @n0
        a setFlags(int i10);
    }

    int getContentType();

    int getFlags();

    @p0
    Object i();

    int j();

    int k();

    int l();

    int m();
}
