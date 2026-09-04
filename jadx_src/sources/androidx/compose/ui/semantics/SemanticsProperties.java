package androidx.compose.ui.semantics;

import androidx.compose.ui.state.ToggleableState;
import androidx.compose.ui.text.o0;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.util.List;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: SemanticsProperties.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bN\u0010+R#\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0011\u0010\bR\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0006\u001a\u0004\b\u0015\u0010\bR\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00170\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0006\u001a\u0004\b\u0019\u0010\bR\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0006\u001a\u0004\b\u0005\u0010\bR\u001d\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00130\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0006\u001a\u0004\b\u001c\u0010\bR\u001d\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00130\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u0006\u001a\u0004\b\r\u0010\bR \u0010%\u001a\b\u0012\u0004\u0012\u00020\"0\u00028\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b#\u0010\u0006\u001a\u0004\b$\u0010\bR\u001d\u0010(\u001a\b\u0012\u0004\u0012\u00020&0\u00028\u0006¢\u0006\f\n\u0004\b'\u0010\u0006\u001a\u0004\b\u0018\u0010\bR&\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00130\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b)\u0010\u0006\u0012\u0004\b*\u0010+\u001a\u0004\b'\u0010\bR\u001d\u0010/\u001a\b\u0012\u0004\u0012\u00020-0\u00028\u0006¢\u0006\f\n\u0004\b.\u0010\u0006\u001a\u0004\b\u001e\u0010\bR\u001d\u00102\u001a\b\u0012\u0004\u0012\u00020-0\u00028\u0006¢\u0006\f\n\u0004\b0\u0010\u0006\u001a\u0004\b1\u0010\bR\u001d\u00103\u001a\b\u0012\u0004\u0012\u00020\u00130\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u0006\u001a\u0004\b0\u0010\bR\u001d\u00104\u001a\b\u0012\u0004\u0012\u00020\u00130\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b.\u0010\bR \u00108\u001a\b\u0012\u0004\u0012\u0002050\u00028\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b6\u0010\u0006\u001a\u0004\b7\u0010\bR\u001d\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b9\u0010\bR#\u0010=\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020;0\u00030\u00028\u0006¢\u0006\f\n\u0004\b7\u0010\u0006\u001a\u0004\b<\u0010\bR\u001d\u0010>\u001a\b\u0012\u0004\u0012\u00020;0\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0010\u0010\bR \u0010B\u001a\b\u0012\u0004\u0012\u00020?0\u00028\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b@\u0010\u0006\u001a\u0004\bA\u0010\bR \u0010D\u001a\b\u0012\u0004\u0012\u00020C0\u00028\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b \u0010\bR\u001d\u0010E\u001a\b\u0012\u0004\u0012\u00020&0\u00028\u0006¢\u0006\f\n\u0004\b9\u0010\u0006\u001a\u0004\b@\u0010\bR\u001d\u0010H\u001a\b\u0012\u0004\u0012\u00020F0\u00028\u0006¢\u0006\f\n\u0004\b<\u0010\u0006\u001a\u0004\bG\u0010\bR\u001d\u0010I\u001a\b\u0012\u0004\u0012\u00020\u00130\u00028\u0006¢\u0006\f\n\u0004\bA\u0010\u0006\u001a\u0004\b6\u0010\bR\u001d\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\bG\u0010\u0006\u001a\u0004\b\u0014\u0010\bR)\u0010M\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020L0K0\u00028\u0006¢\u0006\f\n\u0004\b1\u0010\u0006\u001a\u0004\b#\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006O"}, d2 = {"Landroidx/compose/ui/semantics/SemanticsProperties;", "", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "", "", "b", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", ak.aF, "()Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "ContentDescription", RXScreenCaptureService.KEY_WIDTH, "StateDescription", "Landroidx/compose/ui/semantics/f;", "d", ak.aB, "ProgressBarRangeInfo", "e", "q", "PaneTitle", "Lkotlin/b2;", "f", ak.aG, "SelectableGroup", "Landroidx/compose/ui/semantics/b;", "g", ak.av, "CollectionInfo", "Landroidx/compose/ui/semantics/c;", RXScreenCaptureService.KEY_HEIGHT, "CollectionItemInfo", "i", "Heading", "j", "Disabled", "Landroidx/compose/ui/semantics/e;", "k", "p", "LiveRegion", "", "l", "Focused", "m", "getInvisibleToUser$annotations", "()V", "InvisibleToUser", "Landroidx/compose/ui/semantics/h;", "n", "HorizontalScrollAxisRange", "o", "B", "VerticalScrollAxisRange", "IsPopup", "IsDialog", "Landroidx/compose/ui/semantics/g;", "r", "t", "Role", "x", "TestTag", "Landroidx/compose/ui/text/d;", "y", "Text", "EditableText", "Landroidx/compose/ui/text/o0;", "v", ak.aD, "TextSelectionRange", "Landroidx/compose/ui/text/input/o;", "ImeAction", "Selected", "Landroidx/compose/ui/state/ToggleableState;", androidx.exifinterface.media.a.W4, "ToggleableState", "Password", "Error", "Lkotlin/Function1;", "", "IndexForKey", "<init>", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class SemanticsProperties {
    public static final int C = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final SemanticsProperties f16032a = new SemanticsProperties();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private static final SemanticsPropertyKey<List<String>> ContentDescription = new SemanticsPropertyKey<>("ContentDescription", new yh.p<List<? extends String>, List<? extends String>, List<? extends String>>() { // from class: androidx.compose.ui.semantics.SemanticsProperties$ContentDescription$1
        @Override // yh.p
        @dl.e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<String> invoke(@dl.e List<String> list, @dl.d List<String> childValue) {
            List<String> listT5;
            f0.p(childValue, "childValue");
            if (list == null || (listT5 = CollectionsKt___CollectionsKt.T5(list)) == null) {
                return childValue;
            }
            listT5.addAll(childValue);
            return listT5;
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private static final SemanticsPropertyKey<String> StateDescription = new SemanticsPropertyKey<>("StateDescription", null, 2, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private static final SemanticsPropertyKey<ProgressBarRangeInfo> ProgressBarRangeInfo = new SemanticsPropertyKey<>("ProgressBarRangeInfo", null, 2, null);

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private static final SemanticsPropertyKey<String> PaneTitle = new SemanticsPropertyKey<>("PaneTitle", new yh.p<String, String, String>() { // from class: androidx.compose.ui.semantics.SemanticsProperties$PaneTitle$1
        @Override // yh.p
        @dl.e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@dl.e String str, @dl.d String str2) {
            f0.p(str2, "<anonymous parameter 1>");
            throw new IllegalStateException("merge function called on unmergeable property PaneTitle.");
        }
    });

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private static final SemanticsPropertyKey<b2> SelectableGroup = new SemanticsPropertyKey<>("SelectableGroup", null, 2, null);

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private static final SemanticsPropertyKey<b> CollectionInfo = new SemanticsPropertyKey<>("CollectionInfo", null, 2, null);

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private static final SemanticsPropertyKey<c> CollectionItemInfo = new SemanticsPropertyKey<>("CollectionItemInfo", null, 2, null);

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private static final SemanticsPropertyKey<b2> Heading = new SemanticsPropertyKey<>("Heading", null, 2, null);

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private static final SemanticsPropertyKey<b2> Disabled = new SemanticsPropertyKey<>("Disabled", null, 2, null);

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private static final SemanticsPropertyKey<e> LiveRegion = new SemanticsPropertyKey<>("LiveRegion", null, 2, null);

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private static final SemanticsPropertyKey<Boolean> Focused = new SemanticsPropertyKey<>("Focused", null, 2, null);

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private static final SemanticsPropertyKey<b2> InvisibleToUser = new SemanticsPropertyKey<>("InvisibleToUser", new yh.p<b2, b2, b2>() { // from class: androidx.compose.ui.semantics.SemanticsProperties$InvisibleToUser$1
        @Override // yh.p
        @dl.e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final b2 invoke(@dl.e b2 b2Var, @dl.d b2 b2Var2) {
            f0.p(b2Var2, "<anonymous parameter 1>");
            return b2Var;
        }
    });

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private static final SemanticsPropertyKey<ScrollAxisRange> HorizontalScrollAxisRange = new SemanticsPropertyKey<>("HorizontalScrollAxisRange", null, 2, null);

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private static final SemanticsPropertyKey<ScrollAxisRange> VerticalScrollAxisRange = new SemanticsPropertyKey<>("VerticalScrollAxisRange", null, 2, null);

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private static final SemanticsPropertyKey<b2> IsPopup = new SemanticsPropertyKey<>("IsPopup", new yh.p<b2, b2, b2>() { // from class: androidx.compose.ui.semantics.SemanticsProperties$IsPopup$1
        @Override // yh.p
        @dl.e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final b2 invoke(@dl.e b2 b2Var, @dl.d b2 b2Var2) {
            f0.p(b2Var2, "<anonymous parameter 1>");
            throw new IllegalStateException("merge function called on unmergeable property IsPopup. A popup should not be a child of a clickable/focusable node.");
        }
    });

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private static final SemanticsPropertyKey<b2> IsDialog = new SemanticsPropertyKey<>("IsDialog", new yh.p<b2, b2, b2>() { // from class: androidx.compose.ui.semantics.SemanticsProperties$IsDialog$1
        @Override // yh.p
        @dl.e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final b2 invoke(@dl.e b2 b2Var, @dl.d b2 b2Var2) {
            f0.p(b2Var2, "<anonymous parameter 1>");
            throw new IllegalStateException("merge function called on unmergeable property IsDialog. A dialog should not be a child of a clickable/focusable node.");
        }
    });

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private static final SemanticsPropertyKey<g> Role = new SemanticsPropertyKey<>("Role", new yh.p<g, g, g>() { // from class: androidx.compose.ui.semantics.SemanticsProperties$Role$1
        @dl.e
        public final g a(@dl.e g gVar, int i10) {
            return gVar;
        }

        @Override // yh.p
        public /* bridge */ /* synthetic */ g invoke(g gVar, g gVar2) {
            return a(gVar, gVar2.getValue());
        }
    });

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private static final SemanticsPropertyKey<String> TestTag = new SemanticsPropertyKey<>("TestTag", new yh.p<String, String, String>() { // from class: androidx.compose.ui.semantics.SemanticsProperties$TestTag$1
        @Override // yh.p
        @dl.e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@dl.e String str, @dl.d String str2) {
            f0.p(str2, "<anonymous parameter 1>");
            return str;
        }
    });

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private static final SemanticsPropertyKey<List<androidx.compose.ui.text.d>> Text = new SemanticsPropertyKey<>("Text", new yh.p<List<? extends androidx.compose.ui.text.d>, List<? extends androidx.compose.ui.text.d>, List<? extends androidx.compose.ui.text.d>>() { // from class: androidx.compose.ui.semantics.SemanticsProperties$Text$1
        @Override // yh.p
        @dl.e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<androidx.compose.ui.text.d> invoke(@dl.e List<androidx.compose.ui.text.d> list, @dl.d List<androidx.compose.ui.text.d> childValue) {
            List<androidx.compose.ui.text.d> listT5;
            f0.p(childValue, "childValue");
            if (list == null || (listT5 = CollectionsKt___CollectionsKt.T5(list)) == null) {
                return childValue;
            }
            listT5.addAll(childValue);
            return listT5;
        }
    });

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private static final SemanticsPropertyKey<androidx.compose.ui.text.d> EditableText = new SemanticsPropertyKey<>("EditableText", null, 2, null);

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private static final SemanticsPropertyKey<o0> TextSelectionRange = new SemanticsPropertyKey<>("TextSelectionRange", null, 2, null);

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private static final SemanticsPropertyKey<androidx.compose.ui.text.input.o> ImeAction = new SemanticsPropertyKey<>("ImeAction", null, 2, null);

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private static final SemanticsPropertyKey<Boolean> Selected = new SemanticsPropertyKey<>("Selected", null, 2, null);

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private static final SemanticsPropertyKey<ToggleableState> ToggleableState = new SemanticsPropertyKey<>("ToggleableState", null, 2, null);

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private static final SemanticsPropertyKey<b2> Password = new SemanticsPropertyKey<>("Password", null, 2, null);

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @dl.d
    private static final SemanticsPropertyKey<String> Error = new SemanticsPropertyKey<>("Error", null, 2, null);

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @dl.d
    private static final SemanticsPropertyKey<yh.l<Object, Integer>> IndexForKey = new SemanticsPropertyKey<>("IndexForKey", null, 2, null);

    private SemanticsProperties() {
    }

    @androidx.compose.ui.g
    public static /* synthetic */ void m() {
    }

    @dl.d
    public final SemanticsPropertyKey<ToggleableState> A() {
        return ToggleableState;
    }

    @dl.d
    public final SemanticsPropertyKey<ScrollAxisRange> B() {
        return VerticalScrollAxisRange;
    }

    @dl.d
    public final SemanticsPropertyKey<b> a() {
        return CollectionInfo;
    }

    @dl.d
    public final SemanticsPropertyKey<c> b() {
        return CollectionItemInfo;
    }

    @dl.d
    public final SemanticsPropertyKey<List<String>> c() {
        return ContentDescription;
    }

    @dl.d
    public final SemanticsPropertyKey<b2> d() {
        return Disabled;
    }

    @dl.d
    public final SemanticsPropertyKey<androidx.compose.ui.text.d> e() {
        return EditableText;
    }

    @dl.d
    public final SemanticsPropertyKey<String> f() {
        return Error;
    }

    @dl.d
    public final SemanticsPropertyKey<Boolean> g() {
        return Focused;
    }

    @dl.d
    public final SemanticsPropertyKey<b2> h() {
        return Heading;
    }

    @dl.d
    public final SemanticsPropertyKey<ScrollAxisRange> i() {
        return HorizontalScrollAxisRange;
    }

    @dl.d
    public final SemanticsPropertyKey<androidx.compose.ui.text.input.o> j() {
        return ImeAction;
    }

    @dl.d
    public final SemanticsPropertyKey<yh.l<Object, Integer>> k() {
        return IndexForKey;
    }

    @dl.d
    public final SemanticsPropertyKey<b2> l() {
        return InvisibleToUser;
    }

    @dl.d
    public final SemanticsPropertyKey<b2> n() {
        return IsDialog;
    }

    @dl.d
    public final SemanticsPropertyKey<b2> o() {
        return IsPopup;
    }

    @dl.d
    public final SemanticsPropertyKey<e> p() {
        return LiveRegion;
    }

    @dl.d
    public final SemanticsPropertyKey<String> q() {
        return PaneTitle;
    }

    @dl.d
    public final SemanticsPropertyKey<b2> r() {
        return Password;
    }

    @dl.d
    public final SemanticsPropertyKey<ProgressBarRangeInfo> s() {
        return ProgressBarRangeInfo;
    }

    @dl.d
    public final SemanticsPropertyKey<g> t() {
        return Role;
    }

    @dl.d
    public final SemanticsPropertyKey<b2> u() {
        return SelectableGroup;
    }

    @dl.d
    public final SemanticsPropertyKey<Boolean> v() {
        return Selected;
    }

    @dl.d
    public final SemanticsPropertyKey<String> w() {
        return StateDescription;
    }

    @dl.d
    public final SemanticsPropertyKey<String> x() {
        return TestTag;
    }

    @dl.d
    public final SemanticsPropertyKey<List<androidx.compose.ui.text.d>> y() {
        return Text;
    }

    @dl.d
    public final SemanticsPropertyKey<o0> z() {
        return TextSelectionRange;
    }
}
