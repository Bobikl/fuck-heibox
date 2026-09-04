package androidx.compose.ui.focus;

import androidx.compose.ui.unit.LayoutDirection;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import kotlin.s0;

/* JADX INFO: compiled from: FocusOrderModifier.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a%\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004H\u0007\u001a\u0014\u0010\t\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0007\u001a-\u0010\n\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004H\u0007\u001a)\u0010\u0010\u001a\u00020\u0007*\u00020\u000b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/n;", "Lkotlin/Function1;", "Landroidx/compose/ui/focus/i;", "Lkotlin/b2;", "Lkotlin/t;", "focusOrderReceiver", "d", "Landroidx/compose/ui/focus/FocusRequester;", "focusRequester", "b", ak.aF, "Landroidx/compose/ui/focus/FocusModifier;", "Landroidx/compose/ui/focus/b;", "focusDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", ak.av, "(Landroidx/compose/ui/focus/FocusModifier;ILandroidx/compose/ui/unit/LayoutDirection;)Landroidx/compose/ui/focus/FocusRequester;", "ui_release"}, k = 2, mv = {1, 7, 1})
public final class l {

    /* JADX INFO: compiled from: FocusOrderModifier.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f13592a;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            iArr[LayoutDirection.Ltr.ordinal()] = 1;
            iArr[LayoutDirection.Rtl.ordinal()] = 2;
            f13592a = iArr;
        }
    }

    @dl.d
    public static final FocusRequester a(@dl.d FocusModifier customFocusSearch, int i10, @dl.d LayoutDirection layoutDirection) {
        FocusRequester start;
        f0.p(customFocusSearch, "$this$customFocusSearch");
        f0.p(layoutDirection, "layoutDirection");
        b.Companion companion = b.INSTANCE;
        if (b.n(i10, companion.i())) {
            return customFocusSearch.getFocusProperties().getNext();
        }
        if (b.n(i10, companion.l())) {
            return customFocusSearch.getFocusProperties().getPrevious();
        }
        if (b.n(i10, companion.n())) {
            return customFocusSearch.getFocusProperties().getCom.umeng.socialize.net.dplus.CommonNetImpl.UP java.lang.String();
        }
        if (b.n(i10, companion.a())) {
            return customFocusSearch.getFocusProperties().getDown();
        }
        if (b.n(i10, companion.h())) {
            int i11 = a.f13592a[layoutDirection.ordinal()];
            if (i11 == 1) {
                start = customFocusSearch.getFocusProperties().getStart();
            } else {
                if (i11 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                start = customFocusSearch.getFocusProperties().getCom.google.android.exoplayer2.text.ttml.d.p0 java.lang.String();
            }
            if (f0.g(start, FocusRequester.INSTANCE.d())) {
                start = null;
            }
            if (start == null) {
                return customFocusSearch.getFocusProperties().getCom.google.android.exoplayer2.text.ttml.d.l0 java.lang.String();
            }
        } else {
            if (!b.n(i10, companion.m())) {
                if (b.n(i10, companion.b())) {
                    return customFocusSearch.getFocusProperties().S().invoke(b.k(i10));
                }
                if (b.n(i10, companion.d())) {
                    return customFocusSearch.getFocusProperties().I().invoke(b.k(i10));
                }
                throw new IllegalStateException("invalid FocusDirection".toString());
            }
            int i12 = a.f13592a[layoutDirection.ordinal()];
            if (i12 == 1) {
                start = customFocusSearch.getFocusProperties().getCom.google.android.exoplayer2.text.ttml.d.p0 java.lang.String();
            } else {
                if (i12 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                start = customFocusSearch.getFocusProperties().getStart();
            }
            if (f0.g(start, FocusRequester.INSTANCE.d())) {
                start = null;
            }
            if (start == null) {
                return customFocusSearch.getFocusProperties().getCom.google.android.exoplayer2.text.ttml.d.n0 java.lang.String();
            }
        }
        return start;
    }

    @dl.d
    @kotlin.k(message = "Use focusRequester() instead", replaceWith = @s0(expression = "this.focusRequester(focusRequester)", imports = {"androidx.compose.ui.focus.focusRequester"}))
    public static final androidx.compose.ui.n b(@dl.d androidx.compose.ui.n nVar, @dl.d FocusRequester focusRequester) {
        f0.p(nVar, "<this>");
        f0.p(focusRequester, "focusRequester");
        return FocusRequesterModifierKt.a(nVar, focusRequester);
    }

    @dl.d
    @kotlin.k(message = "Use focusProperties() and focusRequester() instead", replaceWith = @s0(expression = "this.focusRequester(focusRequester).focusProperties(focusOrderReceiver)", imports = {"androidx.compose.ui.focus.focusProperties, androidx.compose.ui.focus.focusRequester"}))
    public static final androidx.compose.ui.n c(@dl.d androidx.compose.ui.n nVar, @dl.d FocusRequester focusRequester, @dl.d yh.l<? super i, b2> focusOrderReceiver) {
        f0.p(nVar, "<this>");
        f0.p(focusRequester, "focusRequester");
        f0.p(focusOrderReceiver, "focusOrderReceiver");
        return FocusPropertiesKt.b(FocusRequesterModifierKt.a(nVar, focusRequester), new n(focusOrderReceiver));
    }

    @dl.d
    @kotlin.k(message = "Use focusProperties() instead", replaceWith = @s0(expression = "this.focusProperties(focusOrderReceiver)", imports = {"androidx.compose.ui.focus.focusProperties"}))
    public static final androidx.compose.ui.n d(@dl.d androidx.compose.ui.n nVar, @dl.d yh.l<? super i, b2> focusOrderReceiver) {
        f0.p(nVar, "<this>");
        f0.p(focusOrderReceiver, "focusOrderReceiver");
        return FocusPropertiesKt.b(nVar, new n(focusOrderReceiver));
    }
}
