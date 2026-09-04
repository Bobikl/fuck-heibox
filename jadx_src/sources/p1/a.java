package p1;

import com.max.xiaoheihe.bean.game.GameObj;
import com.umeng.analytics.pro.ak;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: AndroidLocaleDelegate.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\nR\u0014\u0010\u000f\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\n¨\u0006\u0012"}, d2 = {"Lp1/a;", "Lp1/g;", "", ak.av, "Ljava/util/Locale;", "javaLocale", "Ljava/util/Locale;", "e", "()Ljava/util/Locale;", ak.aF, "()Ljava/lang/String;", ak.N, "b", GameObj.FILTER_HEAD_SCRIPT, "d", "region", "<init>", "(Ljava/util/Locale;)V", "ui-text_release"}, k = 1, mv = {1, 7, 1})
public final class a implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final Locale f138134a;

    public a(@dl.d Locale javaLocale) {
        f0.p(javaLocale, "javaLocale");
        this.f138134a = javaLocale;
    }

    @Override // p1.g
    @dl.d
    public String a() {
        String languageTag = this.f138134a.toLanguageTag();
        f0.o(languageTag, "javaLocale.toLanguageTag()");
        return languageTag;
    }

    @Override // p1.g
    @dl.d
    public String b() {
        String script = this.f138134a.getScript();
        f0.o(script, "javaLocale.script");
        return script;
    }

    @Override // p1.g
    @dl.d
    public String c() {
        String language = this.f138134a.getLanguage();
        f0.o(language, "javaLocale.language");
        return language;
    }

    @Override // p1.g
    @dl.d
    public String d() {
        String country = this.f138134a.getCountry();
        f0.o(country, "javaLocale.country");
        return country;
    }

    @dl.d
    /* JADX INFO: renamed from: e, reason: from getter */
    public final Locale getF138134a() {
        return this.f138134a;
    }
}
