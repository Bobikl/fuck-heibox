package m1;

import androidx.constraintlayout.core.motion.utils.w;
import com.google.android.exoplayer2.text.ttml.d;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import dl.e;
import java.text.BreakIterator;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: WordIterator.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u000eB)\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u0019\u001a\u00020\u0002\u0012\u0006\u0010\u001a\u001a\u00020\u0002\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0018\u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u001f"}, d2 = {"Lm1/b;", "", "", w.c.R, "", "getPrevWordBeginningOnTwoWordsBoundary", "b", "getNextWordEndOnTwoWordBoundary", ak.aF, "m", "l", RXScreenCaptureService.KEY_HEIGHT, "j", "Lkotlin/b2;", ak.av, "n", "o", "e", "d", "f", "g", "i", "k", "", "charSequence", d.f49798o0, d.f49800p0, "Ljava/util/Locale;", "locale", "<init>", "(Ljava/lang/CharSequence;IILjava/util/Locale;)V", "ui-text_release"}, k = 1, mv = {1, 7, 1})
public final class b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    public static final a f131436e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f131437f = 50;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final CharSequence f131438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f131439b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f131440c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private final BreakIterator f131441d;

    /* JADX INFO: compiled from: WordIterator.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lm1/b$a;", "", "", h5.b.f119115m, "", ak.av, "(I)Z", "WINDOW_WIDTH", "I", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        public final boolean a(int cp) {
            int type = Character.getType(cp);
            return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
        }
    }

    public b(@dl.d CharSequence charSequence, int i10, int i11, @e Locale locale) {
        f0.p(charSequence, "charSequence");
        this.f131438a = charSequence;
        if (!(i10 >= 0 && i10 <= charSequence.length())) {
            throw new IllegalArgumentException("input start index is outside the CharSequence".toString());
        }
        if (!(i11 >= 0 && i11 <= charSequence.length())) {
            throw new IllegalArgumentException("input end index is outside the CharSequence".toString());
        }
        BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
        f0.o(wordInstance, "getWordInstance(locale)");
        this.f131441d = wordInstance;
        this.f131439b = Math.max(0, i10 - 50);
        this.f131440c = Math.min(charSequence.length(), i11 + 50);
        wordInstance.setText(new androidx.compose.ui.text.android.e(charSequence, i10, i11));
    }

    private final void a(int i10) {
        int i11 = this.f131439b;
        boolean z10 = false;
        if (i10 <= this.f131440c && i11 <= i10) {
            z10 = true;
        }
        if (z10) {
            return;
        }
        throw new IllegalArgumentException(("Invalid offset: " + i10 + ". Valid range is [" + this.f131439b + " , " + this.f131440c + ']').toString());
    }

    private final int b(int offset, boolean getPrevWordBeginningOnTwoWordsBoundary) {
        a(offset);
        if (j(offset)) {
            return (!this.f131441d.isBoundary(offset) || (h(offset) && getPrevWordBeginningOnTwoWordsBoundary)) ? this.f131441d.preceding(offset) : offset;
        }
        if (h(offset)) {
            return this.f131441d.preceding(offset);
        }
        return -1;
    }

    private final int c(int offset, boolean getNextWordEndOnTwoWordBoundary) {
        a(offset);
        if (h(offset)) {
            return (!this.f131441d.isBoundary(offset) || (j(offset) && getNextWordEndOnTwoWordBoundary)) ? this.f131441d.following(offset) : offset;
        }
        if (j(offset)) {
            return this.f131441d.following(offset);
        }
        return -1;
    }

    private final boolean h(int offset) {
        return (offset <= this.f131440c && this.f131439b + 1 <= offset) && Character.isLetterOrDigit(Character.codePointBefore(this.f131438a, offset));
    }

    private final boolean j(int offset) {
        return (offset < this.f131440c && this.f131439b <= offset) && Character.isLetterOrDigit(Character.codePointAt(this.f131438a, offset));
    }

    private final boolean l(int offset) {
        return !k(offset) && i(offset);
    }

    private final boolean m(int offset) {
        return k(offset) && !i(offset);
    }

    public final int d(int offset) {
        return c(offset, true);
    }

    public final int e(int offset) {
        return b(offset, true);
    }

    public final int f(int offset) {
        a(offset);
        while (offset != -1 && !m(offset)) {
            offset = o(offset);
        }
        return offset;
    }

    public final int g(int offset) {
        a(offset);
        while (offset != -1 && !l(offset)) {
            offset = n(offset);
        }
        return offset;
    }

    public final boolean i(int offset) {
        if (offset <= this.f131440c && this.f131439b + 1 <= offset) {
            return f131436e.a(Character.codePointBefore(this.f131438a, offset));
        }
        return false;
    }

    public final boolean k(int offset) {
        if (offset < this.f131440c && this.f131439b <= offset) {
            return f131436e.a(Character.codePointAt(this.f131438a, offset));
        }
        return false;
    }

    public final int n(int offset) {
        a(offset);
        return this.f131441d.following(offset);
    }

    public final int o(int offset) {
        a(offset);
        return this.f131441d.preceding(offset);
    }
}
