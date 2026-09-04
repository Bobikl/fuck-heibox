package androidx.core.os;

import android.os.LocaleList;
import androidx.annotation.p0;
import androidx.annotation.w0;
import java.util.Locale;

/* JADX INFO: compiled from: LocaleListPlatformWrapper.java */
/* JADX INFO: loaded from: classes.dex */
@w0(24)
public final class r implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LocaleList f20991a;

    r(Object obj) {
        this.f20991a = (LocaleList) obj;
    }

    @Override // androidx.core.os.q
    public String a() {
        return this.f20991a.toLanguageTags();
    }

    @Override // androidx.core.os.q
    public Object b() {
        return this.f20991a;
    }

    @Override // androidx.core.os.q
    @p0
    public Locale c(@androidx.annotation.n0 String[] strArr) {
        return this.f20991a.getFirstMatch(strArr);
    }

    @Override // androidx.core.os.q
    public int d(Locale locale) {
        return this.f20991a.indexOf(locale);
    }

    public boolean equals(Object obj) {
        return this.f20991a.equals(((q) obj).b());
    }

    @Override // androidx.core.os.q
    public Locale get(int i10) {
        return this.f20991a.get(i10);
    }

    public int hashCode() {
        return this.f20991a.hashCode();
    }

    @Override // androidx.core.os.q
    public boolean isEmpty() {
        return this.f20991a.isEmpty();
    }

    @Override // androidx.core.os.q
    public int size() {
        return this.f20991a.size();
    }

    public String toString() {
        return this.f20991a.toString();
    }
}
