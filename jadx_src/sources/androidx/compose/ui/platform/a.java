package androidx.compose.ui.platform;

import android.graphics.Rect;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.umeng.analytics.pro.ak;
import java.text.BreakIterator;
import java.util.Locale;
import kotlin.Metadata;

/* JADX INFO: compiled from: AccessibilityIterators.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001:\u0007\u0004\u0005\u0006\u0007\b\t\nB\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/platform/a;", "", "<init>", "()V", ak.av, "b", ak.aF, "d", "e", "f", "g", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class a {

    /* JADX INFO: renamed from: androidx.compose.ui.platform.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AccessibilityIterators.android.kt */
    @androidx.compose.runtime.internal.o(parameters = 0)
    @Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\r\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001a\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0004R\"\u0010\u0003\u001a\u00020\u00028\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/platform/a$a;", "Landroidx/compose/ui/platform/a$f;", "", "text", "Lkotlin/b2;", "e", "", com.google.android.exoplayer2.text.ttml.d.f49798o0, com.google.android.exoplayer2.text.ttml.d.f49800p0, "", ak.aF, ak.av, "Ljava/lang/String;", "d", "()Ljava/lang/String;", "f", "(Ljava/lang/String;)V", "b", "[I", "segment", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 7, 1})
    public static abstract class AbstractC0095a implements f {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f15782c = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        protected String text;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final int[] segment = new int[2];

        @dl.e
        protected final int[] c(int start, int end) {
            if (start < 0 || end < 0 || start == end) {
                return null;
            }
            int[] iArr = this.segment;
            iArr[0] = start;
            iArr[1] = end;
            return iArr;
        }

        @dl.d
        protected final String d() {
            String str = this.text;
            if (str != null) {
                return str;
            }
            kotlin.jvm.internal.f0.S("text");
            return null;
        }

        public void e(@dl.d String text) {
            kotlin.jvm.internal.f0.p(text, "text");
            f(text);
        }

        protected final void f(@dl.d String str) {
            kotlin.jvm.internal.f0.p(str, "<set-?>");
            this.text = str;
        }
    }

    /* JADX INFO: compiled from: AccessibilityIterators.android.kt */
    @Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0017\u0018\u0000 \b2\u00020\u0001:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0012\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016J\u0012\u0010\r\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016R\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/platform/a$b;", "Landroidx/compose/ui/platform/a$a;", "Ljava/util/Locale;", "locale", "Lkotlin/b2;", "i", "", "text", "e", "", org.apache.tools.ant.taskdefs.optional.vss.g.H2, "", ak.av, "b", "Ljava/text/BreakIterator;", "d", "Ljava/text/BreakIterator;", "impl", "<init>", "(Ljava/util/Locale;)V", "ui_release"}, k = 1, mv = {1, 7, 1})
    @androidx.compose.runtime.internal.o(parameters = 0)
    public static class b extends AbstractC0095a {

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        @dl.d
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f15786f = 8;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @dl.e
        private static b f15787g;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private BreakIterator impl;

        /* JADX INFO: renamed from: androidx.compose.ui.platform.a$b$a, reason: collision with other inner class name and from kotlin metadata */
        /* JADX INFO: compiled from: AccessibilityIterators.android.kt */
        @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Landroidx/compose/ui/platform/a$b$a;", "", "Ljava/util/Locale;", "locale", "Landroidx/compose/ui/platform/a$b;", ak.av, "instance", "Landroidx/compose/ui/platform/a$b;", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 7, 1})
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.u uVar) {
                this();
            }

            @dl.d
            public final b a(@dl.d Locale locale) {
                kotlin.jvm.internal.f0.p(locale, "locale");
                if (b.f15787g == null) {
                    b.f15787g = new b(locale, null);
                }
                b bVar = b.f15787g;
                kotlin.jvm.internal.f0.n(bVar, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.CharacterTextSegmentIterator");
                return bVar;
            }
        }

        private b(Locale locale) {
            i(locale);
        }

        public /* synthetic */ b(Locale locale, kotlin.jvm.internal.u uVar) {
            this(locale);
        }

        private final void i(Locale locale) {
            BreakIterator characterInstance = BreakIterator.getCharacterInstance(locale);
            kotlin.jvm.internal.f0.o(characterInstance, "getCharacterInstance(locale)");
            this.impl = characterInstance;
        }

        @Override // androidx.compose.ui.platform.a.f
        @dl.e
        public int[] a(int current) {
            int length = d().length();
            if (length <= 0 || current >= length) {
                return null;
            }
            if (current < 0) {
                current = 0;
            }
            do {
                BreakIterator breakIterator = this.impl;
                if (breakIterator == null) {
                    kotlin.jvm.internal.f0.S("impl");
                    breakIterator = null;
                }
                if (breakIterator.isBoundary(current)) {
                    BreakIterator breakIterator2 = this.impl;
                    if (breakIterator2 == null) {
                        kotlin.jvm.internal.f0.S("impl");
                        breakIterator2 = null;
                    }
                    int iFollowing = breakIterator2.following(current);
                    if (iFollowing == -1) {
                        return null;
                    }
                    return c(current, iFollowing);
                }
                BreakIterator breakIterator3 = this.impl;
                if (breakIterator3 == null) {
                    kotlin.jvm.internal.f0.S("impl");
                    breakIterator3 = null;
                }
                current = breakIterator3.following(current);
            } while (current != -1);
            return null;
        }

        @Override // androidx.compose.ui.platform.a.f
        @dl.e
        public int[] b(int current) {
            int length = d().length();
            if (length <= 0 || current <= 0) {
                return null;
            }
            if (current > length) {
                current = length;
            }
            do {
                BreakIterator breakIterator = this.impl;
                if (breakIterator == null) {
                    kotlin.jvm.internal.f0.S("impl");
                    breakIterator = null;
                }
                if (breakIterator.isBoundary(current)) {
                    BreakIterator breakIterator2 = this.impl;
                    if (breakIterator2 == null) {
                        kotlin.jvm.internal.f0.S("impl");
                        breakIterator2 = null;
                    }
                    int iPreceding = breakIterator2.preceding(current);
                    if (iPreceding == -1) {
                        return null;
                    }
                    return c(iPreceding, current);
                }
                BreakIterator breakIterator3 = this.impl;
                if (breakIterator3 == null) {
                    kotlin.jvm.internal.f0.S("impl");
                    breakIterator3 = null;
                }
                current = breakIterator3.preceding(current);
            } while (current != -1);
            return null;
        }

        @Override // androidx.compose.ui.platform.a.AbstractC0095a
        public void e(@dl.d String text) {
            kotlin.jvm.internal.f0.p(text, "text");
            super.e(text);
            BreakIterator breakIterator = this.impl;
            if (breakIterator == null) {
                kotlin.jvm.internal.f0.S("impl");
                breakIterator = null;
            }
            breakIterator.setText(text);
        }
    }

    /* JADX INFO: compiled from: AccessibilityIterators.android.kt */
    @Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\b\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u000fB\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0016\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0016J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0016R\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/platform/a$c;", "Landroidx/compose/ui/platform/a$a;", "", "lineNumber", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, "i", "", "text", "Landroidx/compose/ui/text/i0;", "layoutResult", "Lkotlin/b2;", "j", org.apache.tools.ant.taskdefs.optional.vss.g.H2, "", ak.av, "b", "d", "Landroidx/compose/ui/text/i0;", "<init>", "()V", "e", "ui_release"}, k = 1, mv = {1, 7, 1})
    @androidx.compose.runtime.internal.o(parameters = 0)
    public static final class c extends AbstractC0095a {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @dl.e
        private static c f15791g;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private TextLayoutResult layoutResult;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        @dl.d
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f15790f = 8;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @dl.d
        private static final ResolvedTextDirection f15792h = ResolvedTextDirection.Rtl;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @dl.d
        private static final ResolvedTextDirection f15793i = ResolvedTextDirection.Ltr;

        /* JADX INFO: renamed from: androidx.compose.ui.platform.a$c$a, reason: collision with other inner class name and from kotlin metadata */
        /* JADX INFO: compiled from: AccessibilityIterators.android.kt */
        @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Landroidx/compose/ui/platform/a$c$a;", "", "Landroidx/compose/ui/platform/a$c;", ak.av, "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "DirectionEnd", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "DirectionStart", "lineInstance", "Landroidx/compose/ui/platform/a$c;", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 7, 1})
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.u uVar) {
                this();
            }

            @dl.d
            public final c a() {
                if (c.f15791g == null) {
                    c.f15791g = new c(null);
                }
                c cVar = c.f15791g;
                kotlin.jvm.internal.f0.n(cVar, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.LineTextSegmentIterator");
                return cVar;
            }
        }

        private c() {
        }

        public /* synthetic */ c(kotlin.jvm.internal.u uVar) {
            this();
        }

        private final int i(int lineNumber, ResolvedTextDirection direction) {
            TextLayoutResult textLayoutResult = this.layoutResult;
            TextLayoutResult textLayoutResult2 = null;
            if (textLayoutResult == null) {
                kotlin.jvm.internal.f0.S("layoutResult");
                textLayoutResult = null;
            }
            int iU = textLayoutResult.u(lineNumber);
            TextLayoutResult textLayoutResult3 = this.layoutResult;
            if (textLayoutResult3 == null) {
                kotlin.jvm.internal.f0.S("layoutResult");
                textLayoutResult3 = null;
            }
            if (direction != textLayoutResult3.y(iU)) {
                TextLayoutResult textLayoutResult4 = this.layoutResult;
                if (textLayoutResult4 == null) {
                    kotlin.jvm.internal.f0.S("layoutResult");
                } else {
                    textLayoutResult2 = textLayoutResult4;
                }
                return textLayoutResult2.u(lineNumber);
            }
            TextLayoutResult textLayoutResult5 = this.layoutResult;
            if (textLayoutResult5 == null) {
                kotlin.jvm.internal.f0.S("layoutResult");
                textLayoutResult5 = null;
            }
            return TextLayoutResult.p(textLayoutResult5, lineNumber, false, 2, null) - 1;
        }

        @Override // androidx.compose.ui.platform.a.f
        @dl.e
        public int[] a(int current) {
            int iQ;
            if (d().length() <= 0 || current >= d().length()) {
                return null;
            }
            if (current < 0) {
                TextLayoutResult textLayoutResult = this.layoutResult;
                if (textLayoutResult == null) {
                    kotlin.jvm.internal.f0.S("layoutResult");
                    textLayoutResult = null;
                }
                iQ = textLayoutResult.q(0);
            } else {
                TextLayoutResult textLayoutResult2 = this.layoutResult;
                if (textLayoutResult2 == null) {
                    kotlin.jvm.internal.f0.S("layoutResult");
                    textLayoutResult2 = null;
                }
                int iQ2 = textLayoutResult2.q(current);
                iQ = i(iQ2, f15792h) == current ? iQ2 : iQ2 + 1;
            }
            TextLayoutResult textLayoutResult3 = this.layoutResult;
            if (textLayoutResult3 == null) {
                kotlin.jvm.internal.f0.S("layoutResult");
                textLayoutResult3 = null;
            }
            if (iQ >= textLayoutResult3.n()) {
                return null;
            }
            return c(i(iQ, f15792h), i(iQ, f15793i) + 1);
        }

        @Override // androidx.compose.ui.platform.a.f
        @dl.e
        public int[] b(int current) {
            int iQ;
            if (d().length() <= 0 || current <= 0) {
                return null;
            }
            if (current > d().length()) {
                TextLayoutResult textLayoutResult = this.layoutResult;
                if (textLayoutResult == null) {
                    kotlin.jvm.internal.f0.S("layoutResult");
                    textLayoutResult = null;
                }
                iQ = textLayoutResult.q(d().length());
            } else {
                TextLayoutResult textLayoutResult2 = this.layoutResult;
                if (textLayoutResult2 == null) {
                    kotlin.jvm.internal.f0.S("layoutResult");
                    textLayoutResult2 = null;
                }
                int iQ2 = textLayoutResult2.q(current);
                iQ = i(iQ2, f15793i) + 1 == current ? iQ2 : iQ2 - 1;
            }
            if (iQ < 0) {
                return null;
            }
            return c(i(iQ, f15792h), i(iQ, f15793i) + 1);
        }

        public final void j(@dl.d String text, @dl.d TextLayoutResult layoutResult) {
            kotlin.jvm.internal.f0.p(text, "text");
            kotlin.jvm.internal.f0.p(layoutResult, "layoutResult");
            f(text);
            this.layoutResult = layoutResult;
        }
    }

    /* JADX INFO: compiled from: AccessibilityIterators.android.kt */
    @Metadata(bv = {}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0001\u0011B\t\b\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u001e\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000f\u001a\u00020\u0002H\u0016R\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001e"}, d2 = {"Landroidx/compose/ui/platform/a$d;", "Landroidx/compose/ui/platform/a$a;", "", "lineNumber", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, "i", "", "text", "Landroidx/compose/ui/text/i0;", "layoutResult", "Landroidx/compose/ui/semantics/SemanticsNode;", "node", "Lkotlin/b2;", "j", org.apache.tools.ant.taskdefs.optional.vss.g.H2, "", ak.av, "b", "d", "Landroidx/compose/ui/text/i0;", "e", "Landroidx/compose/ui/semantics/SemanticsNode;", "Landroid/graphics/Rect;", "f", "Landroid/graphics/Rect;", "tempRect", "<init>", "()V", "g", "ui_release"}, k = 1, mv = {1, 7, 1})
    @androidx.compose.runtime.internal.o(parameters = 0)
    public static final class d extends AbstractC0095a {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @dl.e
        private static d f15797i;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private TextLayoutResult layoutResult;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private SemanticsNode node;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private Rect tempRect;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        @dl.d
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f15796h = 8;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @dl.d
        private static final ResolvedTextDirection f15798j = ResolvedTextDirection.Rtl;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @dl.d
        private static final ResolvedTextDirection f15799k = ResolvedTextDirection.Ltr;

        /* JADX INFO: renamed from: androidx.compose.ui.platform.a$d$a, reason: collision with other inner class name and from kotlin metadata */
        /* JADX INFO: compiled from: AccessibilityIterators.android.kt */
        @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Landroidx/compose/ui/platform/a$d$a;", "", "Landroidx/compose/ui/platform/a$d;", ak.av, "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "DirectionEnd", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "DirectionStart", "pageInstance", "Landroidx/compose/ui/platform/a$d;", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 7, 1})
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.u uVar) {
                this();
            }

            @dl.d
            public final d a() {
                if (d.f15797i == null) {
                    d.f15797i = new d(null);
                }
                d dVar = d.f15797i;
                kotlin.jvm.internal.f0.n(dVar, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.PageTextSegmentIterator");
                return dVar;
            }
        }

        private d() {
            this.tempRect = new Rect();
        }

        public /* synthetic */ d(kotlin.jvm.internal.u uVar) {
            this();
        }

        private final int i(int lineNumber, ResolvedTextDirection direction) {
            TextLayoutResult textLayoutResult = this.layoutResult;
            TextLayoutResult textLayoutResult2 = null;
            if (textLayoutResult == null) {
                kotlin.jvm.internal.f0.S("layoutResult");
                textLayoutResult = null;
            }
            int iU = textLayoutResult.u(lineNumber);
            TextLayoutResult textLayoutResult3 = this.layoutResult;
            if (textLayoutResult3 == null) {
                kotlin.jvm.internal.f0.S("layoutResult");
                textLayoutResult3 = null;
            }
            if (direction != textLayoutResult3.y(iU)) {
                TextLayoutResult textLayoutResult4 = this.layoutResult;
                if (textLayoutResult4 == null) {
                    kotlin.jvm.internal.f0.S("layoutResult");
                } else {
                    textLayoutResult2 = textLayoutResult4;
                }
                return textLayoutResult2.u(lineNumber);
            }
            TextLayoutResult textLayoutResult5 = this.layoutResult;
            if (textLayoutResult5 == null) {
                kotlin.jvm.internal.f0.S("layoutResult");
                textLayoutResult5 = null;
            }
            return TextLayoutResult.p(textLayoutResult5, lineNumber, false, 2, null) - 1;
        }

        @Override // androidx.compose.ui.platform.a.f
        @dl.e
        public int[] a(int current) {
            int iN;
            TextLayoutResult textLayoutResult = null;
            if (d().length() <= 0 || current >= d().length()) {
                return null;
            }
            try {
                SemanticsNode semanticsNode = this.node;
                if (semanticsNode == null) {
                    kotlin.jvm.internal.f0.S("node");
                    semanticsNode = null;
                }
                int iL0 = di.d.L0(semanticsNode.g().r());
                int iU = fi.u.u(0, current);
                TextLayoutResult textLayoutResult2 = this.layoutResult;
                if (textLayoutResult2 == null) {
                    kotlin.jvm.internal.f0.S("layoutResult");
                    textLayoutResult2 = null;
                }
                int iQ = textLayoutResult2.q(iU);
                TextLayoutResult textLayoutResult3 = this.layoutResult;
                if (textLayoutResult3 == null) {
                    kotlin.jvm.internal.f0.S("layoutResult");
                    textLayoutResult3 = null;
                }
                float fV = textLayoutResult3.v(iQ) + iL0;
                TextLayoutResult textLayoutResult4 = this.layoutResult;
                if (textLayoutResult4 == null) {
                    kotlin.jvm.internal.f0.S("layoutResult");
                    textLayoutResult4 = null;
                }
                TextLayoutResult textLayoutResult5 = this.layoutResult;
                if (textLayoutResult5 == null) {
                    kotlin.jvm.internal.f0.S("layoutResult");
                    textLayoutResult5 = null;
                }
                if (fV < textLayoutResult4.v(textLayoutResult5.n() - 1)) {
                    TextLayoutResult textLayoutResult6 = this.layoutResult;
                    if (textLayoutResult6 == null) {
                        kotlin.jvm.internal.f0.S("layoutResult");
                    } else {
                        textLayoutResult = textLayoutResult6;
                    }
                    iN = textLayoutResult.r(fV);
                } else {
                    TextLayoutResult textLayoutResult7 = this.layoutResult;
                    if (textLayoutResult7 == null) {
                        kotlin.jvm.internal.f0.S("layoutResult");
                    } else {
                        textLayoutResult = textLayoutResult7;
                    }
                    iN = textLayoutResult.n();
                }
                return c(iU, i(iN - 1, f15799k) + 1);
            } catch (IllegalStateException unused) {
                return null;
            }
        }

        @Override // androidx.compose.ui.platform.a.f
        @dl.e
        public int[] b(int current) {
            int iR;
            TextLayoutResult textLayoutResult = null;
            if (d().length() <= 0 || current <= 0) {
                return null;
            }
            try {
                SemanticsNode semanticsNode = this.node;
                if (semanticsNode == null) {
                    kotlin.jvm.internal.f0.S("node");
                    semanticsNode = null;
                }
                int iL0 = di.d.L0(semanticsNode.g().r());
                int iB = fi.u.B(d().length(), current);
                TextLayoutResult textLayoutResult2 = this.layoutResult;
                if (textLayoutResult2 == null) {
                    kotlin.jvm.internal.f0.S("layoutResult");
                    textLayoutResult2 = null;
                }
                int iQ = textLayoutResult2.q(iB);
                TextLayoutResult textLayoutResult3 = this.layoutResult;
                if (textLayoutResult3 == null) {
                    kotlin.jvm.internal.f0.S("layoutResult");
                    textLayoutResult3 = null;
                }
                float fV = textLayoutResult3.v(iQ) - iL0;
                if (fV > 0.0f) {
                    TextLayoutResult textLayoutResult4 = this.layoutResult;
                    if (textLayoutResult4 == null) {
                        kotlin.jvm.internal.f0.S("layoutResult");
                    } else {
                        textLayoutResult = textLayoutResult4;
                    }
                    iR = textLayoutResult.r(fV);
                } else {
                    iR = 0;
                }
                if (iB == d().length() && iR < iQ) {
                    iR++;
                }
                return c(i(iR, f15798j), iB);
            } catch (IllegalStateException unused) {
                return null;
            }
        }

        public final void j(@dl.d String text, @dl.d TextLayoutResult layoutResult, @dl.d SemanticsNode node) {
            kotlin.jvm.internal.f0.p(text, "text");
            kotlin.jvm.internal.f0.p(layoutResult, "layoutResult");
            kotlin.jvm.internal.f0.p(node, "node");
            f(text);
            this.layoutResult = layoutResult;
            this.node = node;
        }
    }

    /* JADX INFO: compiled from: AccessibilityIterators.android.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0006\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\tB\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0012\u0010\n\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/platform/a$e;", "Landroidx/compose/ui/platform/a$a;", "", UCropPlusActivity.ARG_INDEX, "", "j", "i", org.apache.tools.ant.taskdefs.optional.vss.g.H2, "", ak.av, "b", "<init>", "()V", "d", "ui_release"}, k = 1, mv = {1, 7, 1})
    @androidx.compose.runtime.internal.o(parameters = 0)
    public static final class e extends AbstractC0095a {

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @dl.d
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f15804e = 0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @dl.e
        private static e f15805f;

        /* JADX INFO: renamed from: androidx.compose.ui.platform.a$e$a, reason: collision with other inner class name and from kotlin metadata */
        /* JADX INFO: compiled from: AccessibilityIterators.android.kt */
        @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\u0003\u001a\u00020\u0002R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Landroidx/compose/ui/platform/a$e$a;", "", "Landroidx/compose/ui/platform/a$e;", ak.av, "instance", "Landroidx/compose/ui/platform/a$e;", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 7, 1})
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.u uVar) {
                this();
            }

            @dl.d
            public final e a() {
                if (e.f15805f == null) {
                    e.f15805f = new e(null);
                }
                e eVar = e.f15805f;
                kotlin.jvm.internal.f0.n(eVar, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.ParagraphTextSegmentIterator");
                return eVar;
            }
        }

        private e() {
        }

        public /* synthetic */ e(kotlin.jvm.internal.u uVar) {
            this();
        }

        private final boolean i(int index) {
            return index > 0 && d().charAt(index + (-1)) != '\n' && (index == d().length() || d().charAt(index) == '\n');
        }

        private final boolean j(int index) {
            return d().charAt(index) != '\n' && (index == 0 || d().charAt(index - 1) == '\n');
        }

        @Override // androidx.compose.ui.platform.a.f
        @dl.e
        public int[] a(int current) {
            int length = d().length();
            if (length <= 0 || current >= length) {
                return null;
            }
            if (current < 0) {
                current = 0;
            }
            while (current < length && d().charAt(current) == '\n' && !j(current)) {
                current++;
            }
            if (current >= length) {
                return null;
            }
            int i10 = current + 1;
            while (i10 < length && !i(i10)) {
                i10++;
            }
            return c(current, i10);
        }

        @Override // androidx.compose.ui.platform.a.f
        @dl.e
        public int[] b(int current) {
            int length = d().length();
            if (length <= 0 || current <= 0) {
                return null;
            }
            if (current > length) {
                current = length;
            }
            while (current > 0 && d().charAt(current - 1) == '\n' && !i(current)) {
                current--;
            }
            if (current <= 0) {
                return null;
            }
            int i10 = current - 1;
            while (i10 > 0 && !j(i10)) {
                i10--;
            }
            return c(i10, current);
        }
    }

    /* JADX INFO: compiled from: AccessibilityIterators.android.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/platform/a$f;", "", "", org.apache.tools.ant.taskdefs.optional.vss.g.H2, "", ak.av, "b", "ui_release"}, k = 1, mv = {1, 7, 1})
    public interface f {
        @dl.e
        int[] a(int current);

        @dl.e
        int[] b(int current);
    }

    /* JADX INFO: compiled from: AccessibilityIterators.android.kt */
    @Metadata(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\u0011B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0016J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000f\u001a\u00020\u0006H\u0016J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000f\u001a\u00020\u0006H\u0016R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Landroidx/compose/ui/platform/a$g;", "Landroidx/compose/ui/platform/a$a;", "Ljava/util/Locale;", "locale", "Lkotlin/b2;", "l", "", UCropPlusActivity.ARG_INDEX, "", "k", "i", "j", "", "text", "e", org.apache.tools.ant.taskdefs.optional.vss.g.H2, "", ak.av, "b", "Ljava/text/BreakIterator;", "d", "Ljava/text/BreakIterator;", "impl", "<init>", "(Ljava/util/Locale;)V", "ui_release"}, k = 1, mv = {1, 7, 1})
    @androidx.compose.runtime.internal.o(parameters = 0)
    public static final class g extends AbstractC0095a {

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        @dl.d
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f15807f = 8;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @dl.e
        private static g f15808g;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private BreakIterator impl;

        /* JADX INFO: renamed from: androidx.compose.ui.platform.a$g$a, reason: collision with other inner class name and from kotlin metadata */
        /* JADX INFO: compiled from: AccessibilityIterators.android.kt */
        @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Landroidx/compose/ui/platform/a$g$a;", "", "Ljava/util/Locale;", "locale", "Landroidx/compose/ui/platform/a$g;", ak.av, "instance", "Landroidx/compose/ui/platform/a$g;", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 7, 1})
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.u uVar) {
                this();
            }

            @dl.d
            public final g a(@dl.d Locale locale) {
                kotlin.jvm.internal.f0.p(locale, "locale");
                if (g.f15808g == null) {
                    g.f15808g = new g(locale, null);
                }
                g gVar = g.f15808g;
                kotlin.jvm.internal.f0.n(gVar, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.WordTextSegmentIterator");
                return gVar;
            }
        }

        private g(Locale locale) {
            l(locale);
        }

        public /* synthetic */ g(Locale locale, kotlin.jvm.internal.u uVar) {
            this(locale);
        }

        private final boolean i(int index) {
            return index > 0 && j(index + (-1)) && (index == d().length() || !j(index));
        }

        private final boolean j(int index) {
            if (index < 0 || index >= d().length()) {
                return false;
            }
            return Character.isLetterOrDigit(d().codePointAt(index));
        }

        private final boolean k(int index) {
            return j(index) && (index == 0 || !j(index - 1));
        }

        private final void l(Locale locale) {
            BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
            kotlin.jvm.internal.f0.o(wordInstance, "getWordInstance(locale)");
            this.impl = wordInstance;
        }

        @Override // androidx.compose.ui.platform.a.f
        @dl.e
        public int[] a(int current) {
            if (d().length() <= 0 || current >= d().length()) {
                return null;
            }
            if (current < 0) {
                current = 0;
            }
            while (!j(current) && !k(current)) {
                BreakIterator breakIterator = this.impl;
                if (breakIterator == null) {
                    kotlin.jvm.internal.f0.S("impl");
                    breakIterator = null;
                }
                current = breakIterator.following(current);
                if (current == -1) {
                    return null;
                }
            }
            BreakIterator breakIterator2 = this.impl;
            if (breakIterator2 == null) {
                kotlin.jvm.internal.f0.S("impl");
                breakIterator2 = null;
            }
            int iFollowing = breakIterator2.following(current);
            if (iFollowing == -1 || !i(iFollowing)) {
                return null;
            }
            return c(current, iFollowing);
        }

        @Override // androidx.compose.ui.platform.a.f
        @dl.e
        public int[] b(int current) {
            int length = d().length();
            if (length <= 0 || current <= 0) {
                return null;
            }
            if (current > length) {
                current = length;
            }
            while (current > 0 && !j(current - 1) && !i(current)) {
                BreakIterator breakIterator = this.impl;
                if (breakIterator == null) {
                    kotlin.jvm.internal.f0.S("impl");
                    breakIterator = null;
                }
                current = breakIterator.preceding(current);
                if (current == -1) {
                    return null;
                }
            }
            BreakIterator breakIterator2 = this.impl;
            if (breakIterator2 == null) {
                kotlin.jvm.internal.f0.S("impl");
                breakIterator2 = null;
            }
            int iPreceding = breakIterator2.preceding(current);
            if (iPreceding == -1 || !k(iPreceding)) {
                return null;
            }
            return c(iPreceding, current);
        }

        @Override // androidx.compose.ui.platform.a.AbstractC0095a
        public void e(@dl.d String text) {
            kotlin.jvm.internal.f0.p(text, "text");
            super.e(text);
            BreakIterator breakIterator = this.impl;
            if (breakIterator == null) {
                kotlin.jvm.internal.f0.S("impl");
                breakIterator = null;
            }
            breakIterator.setText(text);
        }
    }
}
