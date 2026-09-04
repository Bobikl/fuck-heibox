package p1;

import com.umeng.analytics.pro.ak;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.s;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: AndroidLocaleDelegate.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lp1/b;", "Lp1/h;", "", "languageTag", "Lp1/g;", ak.av, "", "getCurrent", "()Ljava/util/List;", org.apache.tools.ant.taskdefs.optional.vss.g.H2, "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 7, 1})
public final class b implements h {
    @Override // p1.h
    @dl.d
    public g a(@dl.d String languageTag) {
        f0.p(languageTag, "languageTag");
        Locale localeForLanguageTag = Locale.forLanguageTag(languageTag);
        f0.o(localeForLanguageTag, "forLanguageTag(languageTag)");
        return new a(localeForLanguageTag);
    }

    @Override // p1.h
    @dl.d
    public List<g> getCurrent() {
        Locale locale = Locale.getDefault();
        f0.o(locale, "getDefault()");
        return s.k(new a(locale));
    }
}
