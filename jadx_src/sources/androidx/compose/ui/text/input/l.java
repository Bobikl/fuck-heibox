package androidx.compose.ui.text.input;

import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: GapBuffer.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0019\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u001d\u001a\u00020\u0018\u0012\u0006\u0010\u001e\u001a\u00020\u0002\u0012\u0006\u0010\u001f\u001a\u00020\u0002¢\u0006\u0004\b \u0010!J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0002J\u0018\u0010\t\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0002J\u0011\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0002H\u0086\u0002J\u001e\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rJ\u0012\u0010\u0013\u001a\u00020\u00052\n\u0010\u0012\u001a\u00060\u0010j\u0002`\u0011J\u0006\u0010\u0014\u001a\u00020\u0002J\b\u0010\u0015\u001a\u00020\rH\u0016R\u0016\u0010\u0017\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0016R\u0016\u0010\u001a\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0019R\u0016\u0010\u001b\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016R\u0016\u0010\u001c\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0016¨\u0006\""}, d2 = {"Landroidx/compose/ui/text/input/l;", "", "", ak.aF, "requestSize", "Lkotlin/b2;", "f", com.google.android.exoplayer2.text.ttml.d.f49798o0, com.google.android.exoplayer2.text.ttml.d.f49800p0, "b", UCropPlusActivity.ARG_INDEX, "", "d", "", "text", "g", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "builder", ak.av, "e", "toString", "I", "capacity", "", "[C", "buffer", "gapStart", "gapEnd", "initBuffer", "initGapStart", "initGapEnd", "<init>", "([CII)V", "ui-text_release"}, k = 1, mv = {1, 7, 1})
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private int capacity;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private char[] buffer;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int gapStart;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int gapEnd;

    public l(@dl.d char[] initBuffer, int i10, int i11) {
        kotlin.jvm.internal.f0.p(initBuffer, "initBuffer");
        this.capacity = initBuffer.length;
        this.buffer = initBuffer;
        this.gapStart = i10;
        this.gapEnd = i11;
    }

    private final void b(int i10, int i11) {
        int i12 = this.gapStart;
        if (i10 < i12 && i11 <= i12) {
            int i13 = i12 - i11;
            char[] cArr = this.buffer;
            kotlin.collections.m.X0(cArr, cArr, this.gapEnd - i13, i11, i12);
            this.gapStart = i10;
            this.gapEnd -= i13;
            return;
        }
        if (i10 < i12 && i11 >= i12) {
            this.gapEnd = i11 + c();
            this.gapStart = i10;
            return;
        }
        int iC = i10 + c();
        int iC2 = i11 + c();
        int i14 = this.gapEnd;
        char[] cArr2 = this.buffer;
        kotlin.collections.m.X0(cArr2, cArr2, this.gapStart, i14, iC);
        this.gapStart += iC - i14;
        this.gapEnd = iC2;
    }

    private final int c() {
        return this.gapEnd - this.gapStart;
    }

    private final void f(int i10) {
        if (i10 <= c()) {
            return;
        }
        int iC = i10 - c();
        int i11 = this.capacity;
        do {
            i11 *= 2;
        } while (i11 - this.capacity < iC);
        char[] cArr = new char[i11];
        kotlin.collections.m.X0(this.buffer, cArr, 0, 0, this.gapStart);
        int i12 = this.capacity;
        int i13 = this.gapEnd;
        int i14 = i12 - i13;
        int i15 = i11 - i14;
        kotlin.collections.m.X0(this.buffer, cArr, i15, i13, i14 + i13);
        this.buffer = cArr;
        this.capacity = i11;
        this.gapEnd = i15;
    }

    public final void a(@dl.d StringBuilder builder) {
        kotlin.jvm.internal.f0.p(builder, "builder");
        builder.append(this.buffer, 0, this.gapStart);
        char[] cArr = this.buffer;
        int i10 = this.gapEnd;
        builder.append(cArr, i10, this.capacity - i10);
    }

    public final char d(int index) {
        int i10 = this.gapStart;
        return index < i10 ? this.buffer[index] : this.buffer[(index - i10) + this.gapEnd];
    }

    public final int e() {
        return this.capacity - c();
    }

    public final void g(int i10, int i11, @dl.d String text) {
        kotlin.jvm.internal.f0.p(text, "text");
        f(text.length() - (i11 - i10));
        b(i10, i11);
        m.b(text, this.buffer, this.gapStart);
        this.gapStart += text.length();
    }

    @dl.d
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) sb2);
        String string = sb2.toString();
        kotlin.jvm.internal.f0.o(string, "StringBuilder().apply { append(this) }.toString()");
        return string;
    }
}
