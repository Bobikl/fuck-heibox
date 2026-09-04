package androidx.core.os;

import androidx.annotation.p0;
import java.util.Locale;

/* JADX INFO: compiled from: LocaleListInterface.java */
/* JADX INFO: loaded from: classes.dex */
public interface q {
    String a();

    Object b();

    @p0
    Locale c(@androidx.annotation.n0 String[] strArr);

    @androidx.annotation.f0(from = -1)
    int d(Locale locale);

    Locale get(int i10);

    boolean isEmpty();

    @androidx.annotation.f0(from = 0)
    int size();
}
