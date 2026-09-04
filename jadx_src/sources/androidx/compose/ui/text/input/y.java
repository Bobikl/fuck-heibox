package androidx.compose.ui.text.input;

import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: GapBuffer.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.ui.text.h
@androidx.compose.runtime.internal.o(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\u000bB\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u001b\u0010\u0011J\u001e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005J\u0011\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0086\u0002J\b\u0010\f\u001a\u00020\u0005H\u0016R\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0017\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0016R\u0016\u0010\u0018\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u0016R\u0011\u0010\u001a\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0019¨\u0006\u001c"}, d2 = {"Landroidx/compose/ui/text/input/y;", "", "", com.google.android.exoplayer2.text.ttml.d.f49798o0, com.google.android.exoplayer2.text.ttml.d.f49800p0, "", "text", "Lkotlin/b2;", "d", UCropPlusActivity.ARG_INDEX, "", ak.av, "toString", "Ljava/lang/String;", ak.aF, "()Ljava/lang/String;", "e", "(Ljava/lang/String;)V", "Landroidx/compose/ui/text/input/l;", "b", "Landroidx/compose/ui/text/input/l;", "buffer", "I", "bufStart", "bufEnd", "()I", com.google.android.exoplayer2.source.rtsp.k0.f48801p, "<init>", "ui-text_release"}, k = 1, mv = {1, 7, 1})
public final class y {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f16794f = 8;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f16795g = 255;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f16796h = 64;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f16797i = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private String text;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private l buffer;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int bufStart;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int bufEnd;

    public y(@dl.d String text) {
        kotlin.jvm.internal.f0.p(text, "text");
        this.text = text;
        this.bufStart = -1;
        this.bufEnd = -1;
    }

    public final char a(int index) {
        l lVar = this.buffer;
        if (lVar != null && index >= this.bufStart) {
            int iE = lVar.e();
            int i10 = this.bufStart;
            return index < iE + i10 ? lVar.d(index - i10) : this.text.charAt(index - ((iE - this.bufEnd) + i10));
        }
        return this.text.charAt(index);
    }

    public final int b() {
        l lVar = this.buffer;
        return lVar == null ? this.text.length() : (this.text.length() - (this.bufEnd - this.bufStart)) + lVar.e();
    }

    @dl.d
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getText() {
        return this.text;
    }

    public final void d(int i10, int i11, @dl.d String text) {
        kotlin.jvm.internal.f0.p(text, "text");
        if (!(i10 <= i11)) {
            throw new IllegalArgumentException(("start index must be less than or equal to end index: " + i10 + " > " + i11).toString());
        }
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("start must be non-negative, but was " + i10).toString());
        }
        l lVar = this.buffer;
        if (lVar != null) {
            int i12 = this.bufStart;
            int i13 = i10 - i12;
            int i14 = i11 - i12;
            if (i13 >= 0 && i14 <= lVar.e()) {
                lVar.g(i13, i14, text);
                return;
            }
            this.text = toString();
            this.buffer = null;
            this.bufStart = -1;
            this.bufEnd = -1;
            d(i10, i11, text);
            return;
        }
        int iMax = Math.max(255, text.length() + 128);
        char[] cArr = new char[iMax];
        int iMin = Math.min(i10, 64);
        int iMin2 = Math.min(this.text.length() - i11, 64);
        int i15 = i10 - iMin;
        n.a(this.text, cArr, 0, i15, i10);
        int i16 = iMax - iMin2;
        int i17 = iMin2 + i11;
        n.a(this.text, cArr, i16, i11, i17);
        m.b(text, cArr, iMin);
        this.buffer = new l(cArr, iMin + text.length(), i16);
        this.bufStart = i15;
        this.bufEnd = i17;
    }

    public final void e(@dl.d String str) {
        kotlin.jvm.internal.f0.p(str, "<set-?>");
        this.text = str;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @dl.d
    public String toString() {
        l lVar = this.buffer;
        if (lVar == null) {
            return this.text;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) this.text, 0, this.bufStart);
        lVar.a(sb2);
        String str = this.text;
        sb2.append((CharSequence) str, this.bufEnd, str.length());
        String string = sb2.toString();
        kotlin.jvm.internal.f0.o(string, "sb.toString()");
        return string;
    }
}
