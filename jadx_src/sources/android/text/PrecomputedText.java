package android.text;

import android.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public /* synthetic */ class PrecomputedText implements Spannable {

    public final /* synthetic */ class Params {
        static {
            throw new NoClassDefFoundError();
        }

        public native /* synthetic */ int getBreakStrategy();

        public native /* synthetic */ int getHyphenationFrequency();

        @NonNull
        public native /* synthetic */ TextDirectionHeuristic getTextDirection();

        @NonNull
        public native /* synthetic */ TextPaint getTextPaint();
    }

    static {
        throw new NoClassDefFoundError();
    }

    public static native /* synthetic */ PrecomputedText create(@NonNull CharSequence charSequence, @NonNull Params params);

    public native /* synthetic */ int getParagraphCount();

    public native /* synthetic */ int getParagraphEnd(int i10);

    public native /* synthetic */ int getParagraphStart(int i10);

    @Override // android.text.Spanned
    public native /* synthetic */ <T> T[] getSpans(int i10, int i11, Class<T> cls);

    @Override // android.text.Spannable
    public native /* synthetic */ void removeSpan(Object obj);

    @Override // android.text.Spannable
    public native /* synthetic */ void setSpan(Object obj, int i10, int i11, int i12);
}
