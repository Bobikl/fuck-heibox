package m1;

import androidx.compose.runtime.internal.o;
import androidx.compose.ui.text.android.g;
import androidx.constraintlayout.core.motion.utils.w;
import com.umeng.analytics.pro.ak;
import dl.d;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: WordBoundary.kt */
/* JADX INFO: loaded from: classes.dex */
@o(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\f"}, d2 = {"Lm1/a;", "", "", w.c.R, "b", ak.av, "Ljava/util/Locale;", "locale", "", "text", "<init>", "(Ljava/util/Locale;Ljava/lang/CharSequence;)V", "ui-text_release"}, k = 1, mv = {1, 7, 1})
@g
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f131434b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @d
    private final b f131435a;

    public a(@d Locale locale, @d CharSequence text) {
        f0.p(locale, "locale");
        f0.p(text, "text");
        this.f131435a = new b(text, 0, text.length(), locale);
    }

    public final int a(int offset) {
        int iG = this.f131435a.i(this.f131435a.n(offset)) ? this.f131435a.g(offset) : this.f131435a.d(offset);
        return iG == -1 ? offset : iG;
    }

    public final int b(int offset) {
        int iF = this.f131435a.k(this.f131435a.o(offset)) ? this.f131435a.f(offset) : this.f131435a.e(offset);
        return iF == -1 ? offset : iF;
    }
}
