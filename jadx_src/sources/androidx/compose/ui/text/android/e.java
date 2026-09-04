package androidx.compose.ui.text.android;

import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.umeng.analytics.pro.ak;
import com.umeng.socialize.net.dplus.CommonNetImpl;
import java.text.CharacterIterator;
import kotlin.Metadata;

/* JADX INFO: compiled from: CharSequenceCharacterIterator.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\r\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\u0006\u0010\u0016\u001a\u00020\b\u0012\u0006\u0010\u0018\u001a\u00020\b¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\t\u0010\u0006\u001a\u00020\u0002H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\bH\u0016J\b\u0010\f\u001a\u00020\bH\u0016J\b\u0010\r\u001a\u00020\bH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016R\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015R\u0016\u0010\u001a\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0015¨\u0006\u001d"}, d2 = {"Landroidx/compose/ui/text/android/e;", "Ljava/text/CharacterIterator;", "", "first", "last", org.apache.tools.ant.taskdefs.optional.vss.g.H2, "next", "previous", "", CommonNetImpl.POSITION, "setIndex", "getBeginIndex", "getEndIndex", "getIndex", "", "clone", "", "b", "Ljava/lang/CharSequence;", "charSequence", ak.aF, "I", com.google.android.exoplayer2.text.ttml.d.f49798o0, "d", com.google.android.exoplayer2.text.ttml.d.f49800p0, "e", UCropPlusActivity.ARG_INDEX, "<init>", "(Ljava/lang/CharSequence;II)V", "ui-text_release"}, k = 1, mv = {1, 7, 1})
public final class e implements CharacterIterator {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final CharSequence charSequence;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int start;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int end;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int index;

    public e(@dl.d CharSequence charSequence, int i10, int i11) {
        kotlin.jvm.internal.f0.p(charSequence, "charSequence");
        this.charSequence = charSequence;
        this.start = i10;
        this.end = i11;
        this.index = i10;
    }

    @Override // java.text.CharacterIterator
    @dl.d
    public Object clone() {
        try {
            Object objClone = super.clone();
            kotlin.jvm.internal.f0.o(objClone, "{\n            @Suppress(…  super.clone()\n        }");
            return objClone;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // java.text.CharacterIterator
    public char current() {
        int i10 = this.index;
        return i10 == this.end ? kotlin.jvm.internal.p.f124952c : this.charSequence.charAt(i10);
    }

    @Override // java.text.CharacterIterator
    public char first() {
        this.index = this.start;
        return current();
    }

    @Override // java.text.CharacterIterator
    public int getBeginIndex() {
        return this.start;
    }

    @Override // java.text.CharacterIterator
    public int getEndIndex() {
        return this.end;
    }

    @Override // java.text.CharacterIterator
    public int getIndex() {
        return this.index;
    }

    @Override // java.text.CharacterIterator
    public char last() {
        int i10 = this.start;
        int i11 = this.end;
        if (i10 == i11) {
            this.index = i11;
            return kotlin.jvm.internal.p.f124952c;
        }
        int i12 = i11 - 1;
        this.index = i12;
        return this.charSequence.charAt(i12);
    }

    @Override // java.text.CharacterIterator
    public char next() {
        int i10 = this.index + 1;
        this.index = i10;
        int i11 = this.end;
        if (i10 < i11) {
            return this.charSequence.charAt(i10);
        }
        this.index = i11;
        return kotlin.jvm.internal.p.f124952c;
    }

    @Override // java.text.CharacterIterator
    public char previous() {
        int i10 = this.index;
        if (i10 <= this.start) {
            return kotlin.jvm.internal.p.f124952c;
        }
        int i11 = i10 - 1;
        this.index = i11;
        return this.charSequence.charAt(i11);
    }

    @Override // java.text.CharacterIterator
    public char setIndex(int position) {
        int i10 = this.start;
        boolean z10 = false;
        if (position <= this.end && i10 <= position) {
            z10 = true;
        }
        if (!z10) {
            throw new IllegalArgumentException("invalid position");
        }
        this.index = position;
        return current();
    }
}
