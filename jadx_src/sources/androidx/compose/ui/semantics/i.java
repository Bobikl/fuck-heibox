package androidx.compose.ui.semantics;

import androidx.compose.ui.text.TextLayoutResult;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: SemanticsProperties.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b8\u00109R5\u0010\f\u001a \u0012\u001c\u0012\u001a\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u00070\u00040\u00030\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR)\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\r0\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\u000f\u0010\u000bR)\u0010\u0013\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\r0\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\t\u001a\u0004\b\u0012\u0010\u000bRS\u0010\u001c\u001a>\u0012:\u00128\u00124\u00122\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u00070\u00140\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\t\u001a\u0004\b\u001b\u0010\u000bR/\u0010 \u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00070\u00040\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\t\u001a\u0004\b\u001f\u0010\u000bR>\u0010#\u001a)\u0012%\u0012#\u0012\u001f\u0012\u001d\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(!\u0012\u0004\u0012\u00020\u00070\u00040\u00030\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\t\u001a\u0004\b\"\u0010\u000bR;\u0010&\u001a&\u0012\"\u0012 \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070$0\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\t\u001a\u0004\b%\u0010\u000bR/\u0010)\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u00070\u00040\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\t\u001a\u0004\b(\u0010\u000bR)\u0010+\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\r0\u00030\u00028\u0006¢\u0006\f\n\u0004\b*\u0010\t\u001a\u0004\b\b\u0010\u000bR)\u0010-\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\r0\u00030\u00028\u0006¢\u0006\f\n\u0004\b,\u0010\t\u001a\u0004\b\u0011\u0010\u000bR)\u0010.\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\r0\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\t\u001a\u0004\b*\u0010\u000bR)\u0010/\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\r0\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\t\u001a\u0004\b\u001e\u0010\u000bR)\u00101\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\r0\u00030\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\t\u001a\u0004\b0\u0010\u000bR)\u00102\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\r0\u00030\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\t\u001a\u0004\b\u001a\u0010\u000bR)\u00103\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\r0\u00030\u00028\u0006¢\u0006\f\n\u0004\b(\u0010\t\u001a\u0004\b,\u0010\u000bR#\u00107\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u000205040\u00028\u0006¢\u0006\f\n\u0004\b6\u0010\t\u001a\u0004\b\u000e\u0010\u000b¨\u0006:"}, d2 = {"Landroidx/compose/ui/semantics/i;", "", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "Landroidx/compose/ui/semantics/a;", "Lkotlin/Function1;", "", "Landroidx/compose/ui/text/i0;", "", "b", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "g", "()Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "GetTextLayoutResult", "Lkotlin/Function0;", ak.aF, RXScreenCaptureService.KEY_HEIGHT, "OnClick", "d", "i", "OnLongClick", "Lkotlin/Function2;", "", "Lkotlin/m0;", "name", "x", "y", "e", "l", "ScrollBy", "", "f", "m", "ScrollToIndex", "progress", "n", "SetProgress", "Lkotlin/Function3;", "o", "SetSelection", "Landroidx/compose/ui/text/d;", "p", "SetText", "j", "CopyText", "k", "CutText", "PasteText", "Expand", ak.av, "Collapse", "Dismiss", "RequestFocus", "", "Landroidx/compose/ui/semantics/d;", "q", "CustomActions", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final i f16129a = new i();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private static final SemanticsPropertyKey<AccessibilityAction<yh.l<List<TextLayoutResult>, Boolean>>> GetTextLayoutResult;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private static final SemanticsPropertyKey<AccessibilityAction<yh.a<Boolean>>> OnClick;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private static final SemanticsPropertyKey<AccessibilityAction<yh.a<Boolean>>> OnLongClick;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private static final SemanticsPropertyKey<AccessibilityAction<yh.p<Float, Float, Boolean>>> ScrollBy;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private static final SemanticsPropertyKey<AccessibilityAction<yh.l<Integer, Boolean>>> ScrollToIndex;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private static final SemanticsPropertyKey<AccessibilityAction<yh.l<Float, Boolean>>> SetProgress;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private static final SemanticsPropertyKey<AccessibilityAction<yh.q<Integer, Integer, Boolean, Boolean>>> SetSelection;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private static final SemanticsPropertyKey<AccessibilityAction<yh.l<androidx.compose.ui.text.d, Boolean>>> SetText;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private static final SemanticsPropertyKey<AccessibilityAction<yh.a<Boolean>>> CopyText;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private static final SemanticsPropertyKey<AccessibilityAction<yh.a<Boolean>>> CutText;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private static final SemanticsPropertyKey<AccessibilityAction<yh.a<Boolean>>> PasteText;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private static final SemanticsPropertyKey<AccessibilityAction<yh.a<Boolean>>> Expand;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private static final SemanticsPropertyKey<AccessibilityAction<yh.a<Boolean>>> Collapse;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private static final SemanticsPropertyKey<AccessibilityAction<yh.a<Boolean>>> Dismiss;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private static final SemanticsPropertyKey<AccessibilityAction<yh.a<Boolean>>> RequestFocus;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private static final SemanticsPropertyKey<List<CustomAccessibilityAction>> CustomActions;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f16146r = 0;

    static {
        SemanticsPropertiesKt$ActionPropertyKey$1 semanticsPropertiesKt$ActionPropertyKey$1 = SemanticsPropertiesKt$ActionPropertyKey$1.f16088b;
        GetTextLayoutResult = new SemanticsPropertyKey<>("GetTextLayoutResult", semanticsPropertiesKt$ActionPropertyKey$1);
        OnClick = new SemanticsPropertyKey<>("OnClick", semanticsPropertiesKt$ActionPropertyKey$1);
        OnLongClick = new SemanticsPropertyKey<>("OnLongClick", semanticsPropertiesKt$ActionPropertyKey$1);
        ScrollBy = new SemanticsPropertyKey<>("ScrollBy", semanticsPropertiesKt$ActionPropertyKey$1);
        ScrollToIndex = new SemanticsPropertyKey<>("ScrollToIndex", semanticsPropertiesKt$ActionPropertyKey$1);
        SetProgress = new SemanticsPropertyKey<>("SetProgress", semanticsPropertiesKt$ActionPropertyKey$1);
        SetSelection = new SemanticsPropertyKey<>("SetSelection", semanticsPropertiesKt$ActionPropertyKey$1);
        SetText = new SemanticsPropertyKey<>("SetText", semanticsPropertiesKt$ActionPropertyKey$1);
        CopyText = new SemanticsPropertyKey<>("CopyText", semanticsPropertiesKt$ActionPropertyKey$1);
        CutText = new SemanticsPropertyKey<>("CutText", semanticsPropertiesKt$ActionPropertyKey$1);
        PasteText = new SemanticsPropertyKey<>("PasteText", semanticsPropertiesKt$ActionPropertyKey$1);
        Expand = new SemanticsPropertyKey<>("Expand", semanticsPropertiesKt$ActionPropertyKey$1);
        Collapse = new SemanticsPropertyKey<>("Collapse", semanticsPropertiesKt$ActionPropertyKey$1);
        Dismiss = new SemanticsPropertyKey<>("Dismiss", semanticsPropertiesKt$ActionPropertyKey$1);
        RequestFocus = new SemanticsPropertyKey<>("RequestFocus", semanticsPropertiesKt$ActionPropertyKey$1);
        CustomActions = new SemanticsPropertyKey<>("CustomActions", null, 2, null);
    }

    private i() {
    }

    @dl.d
    public final SemanticsPropertyKey<AccessibilityAction<yh.a<Boolean>>> a() {
        return Collapse;
    }

    @dl.d
    public final SemanticsPropertyKey<AccessibilityAction<yh.a<Boolean>>> b() {
        return CopyText;
    }

    @dl.d
    public final SemanticsPropertyKey<List<CustomAccessibilityAction>> c() {
        return CustomActions;
    }

    @dl.d
    public final SemanticsPropertyKey<AccessibilityAction<yh.a<Boolean>>> d() {
        return CutText;
    }

    @dl.d
    public final SemanticsPropertyKey<AccessibilityAction<yh.a<Boolean>>> e() {
        return Dismiss;
    }

    @dl.d
    public final SemanticsPropertyKey<AccessibilityAction<yh.a<Boolean>>> f() {
        return Expand;
    }

    @dl.d
    public final SemanticsPropertyKey<AccessibilityAction<yh.l<List<TextLayoutResult>, Boolean>>> g() {
        return GetTextLayoutResult;
    }

    @dl.d
    public final SemanticsPropertyKey<AccessibilityAction<yh.a<Boolean>>> h() {
        return OnClick;
    }

    @dl.d
    public final SemanticsPropertyKey<AccessibilityAction<yh.a<Boolean>>> i() {
        return OnLongClick;
    }

    @dl.d
    public final SemanticsPropertyKey<AccessibilityAction<yh.a<Boolean>>> j() {
        return PasteText;
    }

    @dl.d
    public final SemanticsPropertyKey<AccessibilityAction<yh.a<Boolean>>> k() {
        return RequestFocus;
    }

    @dl.d
    public final SemanticsPropertyKey<AccessibilityAction<yh.p<Float, Float, Boolean>>> l() {
        return ScrollBy;
    }

    @dl.d
    public final SemanticsPropertyKey<AccessibilityAction<yh.l<Integer, Boolean>>> m() {
        return ScrollToIndex;
    }

    @dl.d
    public final SemanticsPropertyKey<AccessibilityAction<yh.l<Float, Boolean>>> n() {
        return SetProgress;
    }

    @dl.d
    public final SemanticsPropertyKey<AccessibilityAction<yh.q<Integer, Integer, Boolean, Boolean>>> o() {
        return SetSelection;
    }

    @dl.d
    public final SemanticsPropertyKey<AccessibilityAction<yh.l<androidx.compose.ui.text.d, Boolean>>> p() {
        return SetText;
    }
}
