package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.a1;
import androidx.compose.runtime.e2;
import androidx.compose.runtime.h2;
import androidx.compose.runtime.j2;
import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.compose.ui.text.o0;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: TextFieldScroll.kt */
/* JADX INFO: loaded from: classes.dex */
@j2
@Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001e\b\u0001\u0018\u0000 %2\u00020\u0001:\u0001\u0015B\u0019\u0012\u0006\u0010)\u001a\u00020\u0002\u0012\b\b\u0002\u0010*\u001a\u00020\u000b¢\u0006\u0004\b+\u0010,B\t\b\u0016¢\u0006\u0004\b+\u0010-J&\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006J'\u0010\u000e\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013R+\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u000b8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR+\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u000b8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000e\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018\"\u0004\b\u001d\u0010\u001aR+\u0010$\u001a\u00020\u00108\u0006@\u0006X\u0086\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u0017\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R+\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0012\u0010\u0016\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006."}, d2 = {"Landroidx/compose/foundation/text/TextFieldScrollerPosition;", "", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "Lb1/i;", "cursorRect", "", "containerSize", "textFieldSize", "Lkotlin/b2;", "l", "", "cursorStart", "cursorEnd", "b", "(FFI)V", "Landroidx/compose/ui/text/o0;", "selection", "e", "(J)I", "<set-?>", ak.av, "Landroidx/compose/runtime/a1;", "d", "()F", "i", "(F)V", androidx.constraintlayout.core.motion.utils.w.c.R, ak.aF, RXScreenCaptureService.KEY_HEIGHT, "maximum", "J", "g", "()J", "k", "(J)V", "previousSelection", "f", "()Landroidx/compose/foundation/gestures/Orientation;", "j", "(Landroidx/compose/foundation/gestures/Orientation;)V", "initialOrientation", "initial", "<init>", "(Landroidx/compose/foundation/gestures/Orientation;F)V", "()V", "foundation_release"}, k = 1, mv = {1, 7, 1})
public final class TextFieldScrollerPosition {

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @dl.d
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private static final androidx.compose.runtime.saveable.e<TextFieldScrollerPosition, Object> f7999g = ListSaverKt.a(new yh.p<androidx.compose.runtime.saveable.f, TextFieldScrollerPosition, List<? extends Object>>() { // from class: androidx.compose.foundation.text.TextFieldScrollerPosition$Companion$Saver$1
        @Override // yh.p
        @dl.d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<Object> invoke(@dl.d androidx.compose.runtime.saveable.f listSaver, @dl.d TextFieldScrollerPosition it) {
            f0.p(listSaver, "$this$listSaver");
            f0.p(it, "it");
            Object[] objArr = new Object[2];
            objArr[0] = Float.valueOf(it.d());
            objArr[1] = Boolean.valueOf(it.f() == Orientation.Vertical);
            return CollectionsKt__CollectionsKt.L(objArr);
        }
    }, new yh.l<List<? extends Object>, TextFieldScrollerPosition>() { // from class: androidx.compose.foundation.text.TextFieldScrollerPosition$Companion$Saver$2
        @Override // yh.l
        @dl.e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final TextFieldScrollerPosition invoke(@dl.d List<? extends Object> restored) {
            f0.p(restored, "restored");
            Object obj = restored.get(1);
            f0.n(obj, "null cannot be cast to non-null type kotlin.Boolean");
            Orientation orientation = ((Boolean) obj).booleanValue() ? Orientation.Vertical : Orientation.Horizontal;
            Object obj2 = restored.get(0);
            f0.n(obj2, "null cannot be cast to non-null type kotlin.Float");
            return new TextFieldScrollerPosition(orientation, ((Float) obj2).floatValue());
        }
    });

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final a1 offset;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final a1 maximum;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private b1.i f8002c;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private long previousSelection;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final a1 orientation;

    /* JADX INFO: renamed from: androidx.compose.foundation.text.TextFieldScrollerPosition$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: TextFieldScroll.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR#\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Landroidx/compose/foundation/text/TextFieldScrollerPosition$a;", "", "Landroidx/compose/runtime/saveable/e;", "Landroidx/compose/foundation/text/TextFieldScrollerPosition;", "Saver", "Landroidx/compose/runtime/saveable/e;", ak.av, "()Landroidx/compose/runtime/saveable/e;", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.u uVar) {
            this();
        }

        @dl.d
        public final androidx.compose.runtime.saveable.e<TextFieldScrollerPosition, Object> a() {
            return TextFieldScrollerPosition.f7999g;
        }
    }

    public TextFieldScrollerPosition() {
        this(Orientation.Vertical, 0.0f, 2, null);
    }

    public TextFieldScrollerPosition(@dl.d Orientation initialOrientation, float f10) {
        f0.p(initialOrientation, "initialOrientation");
        this.offset = h2.g(Float.valueOf(f10), null, 2, null);
        this.maximum = h2.g(Float.valueOf(0.0f), null, 2, null);
        this.f8002c = b1.i.f30369e.a();
        this.previousSelection = o0.INSTANCE.a();
        this.orientation = e2.j(initialOrientation, e2.w());
    }

    public /* synthetic */ TextFieldScrollerPosition(Orientation orientation, float f10, int i10, kotlin.jvm.internal.u uVar) {
        this(orientation, (i10 & 2) != 0 ? 0.0f : f10);
    }

    private final void h(float f10) {
        this.maximum.setValue(Float.valueOf(f10));
    }

    public final void b(float cursorStart, float cursorEnd, int containerSize) {
        float f10;
        float fD = d();
        float f11 = containerSize;
        float f12 = fD + f11;
        if (cursorEnd <= f12 && (cursorStart >= fD || cursorEnd - cursorStart <= f11)) {
            f10 = (cursorStart >= fD || cursorEnd - cursorStart > f11) ? 0.0f : cursorStart - fD;
        } else {
            f10 = cursorEnd - f12;
        }
        i(d() + f10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final float c() {
        return ((Number) this.maximum.getValue()).floatValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final float d() {
        return ((Number) this.offset.getValue()).floatValue();
    }

    public final int e(long selection) {
        if (o0.n(selection) != o0.n(this.previousSelection)) {
            return o0.n(selection);
        }
        return o0.i(selection) != o0.i(this.previousSelection) ? o0.i(selection) : o0.l(selection);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @dl.d
    public final Orientation f() {
        return (Orientation) this.orientation.getValue();
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final long getPreviousSelection() {
        return this.previousSelection;
    }

    public final void i(float f10) {
        this.offset.setValue(Float.valueOf(f10));
    }

    public final void j(@dl.d Orientation orientation) {
        f0.p(orientation, "<set-?>");
        this.orientation.setValue(orientation);
    }

    public final void k(long j10) {
        this.previousSelection = j10;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0037  */
    /* JADX WARN: Code duplicated, block: B:15:0x003c  */
    /* JADX WARN: Code duplicated, block: B:17:0x003f  */
    /* JADX WARN: Code duplicated, block: B:18:0x0044  */
    /* JADX WARN: Code duplicated, block: B:20:0x004a  */
    /* JADX WARN: Code duplicated, block: B:21:0x004f  */
    public final void l(@dl.d Orientation orientation, @dl.d b1.i cursorRect, int i10, int i11) {
        boolean z10;
        float fT;
        float fX;
        f0.p(orientation, "orientation");
        f0.p(cursorRect, "cursorRect");
        float f10 = i11 - i10;
        h(f10);
        if (cursorRect.t() == this.f8002c.t()) {
            if (!(cursorRect.getF30372b() == this.f8002c.getF30372b())) {
                if (orientation == Orientation.Vertical) {
                }
                if (z10) {
                    fT = cursorRect.getF30372b();
                } else {
                    fT = cursorRect.t();
                }
                if (z10) {
                    fX = cursorRect.j();
                } else {
                    fX = cursorRect.x();
                }
                b(fT, fX, i10);
                this.f8002c = cursorRect;
            }
        } else {
            z10 = orientation == Orientation.Vertical;
            if (z10) {
                fT = cursorRect.getF30372b();
            } else {
                fT = cursorRect.t();
            }
            if (z10) {
                fX = cursorRect.j();
            } else {
                fX = cursorRect.x();
            }
            b(fT, fX, i10);
            this.f8002c = cursorRect;
        }
        i(fi.u.H(d(), 0.0f, f10));
    }
}
