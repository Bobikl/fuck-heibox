package org.apache.tools.ant.taskdefs;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class y1 {
    public static /* synthetic */ String a(CharSequence charSequence, CharSequence[] charSequenceArr) {
        if (charSequence == null) {
            throw new NullPointerException(com.google.android.exoplayer2.text.ttml.d.f49783b0);
        }
        StringBuilder sb2 = new StringBuilder();
        if (charSequenceArr.length > 0) {
            sb2.append(charSequenceArr[0]);
            for (int i10 = 1; i10 < charSequenceArr.length; i10++) {
                sb2.append(charSequence);
                sb2.append(charSequenceArr[i10]);
            }
        }
        return sb2.toString();
    }
}
