package androidx.compose.ui.text.font;

import kotlin.Metadata;

/* JADX INFO: renamed from: androidx.compose.ui.text.font.f, reason: from toString */
/* JADX INFO: compiled from: AndroidFontResolveInterceptor.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0003\u001a\u00020\u0002HÂ\u0003J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\u000b\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0010¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/text/font/f;", "Landroidx/compose/ui/text/font/s0;", "", "e", "Landroidx/compose/ui/text/font/k0;", com.google.android.exoplayer2.text.ttml.d.L, "b", "fontWeightAdjustment", "f", "", "toString", "hashCode", "", "other", "", "equals", "I", "<init>", "(I)V", "ui-text_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class AndroidFontResolveInterceptor implements s0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int fontWeightAdjustment;

    public AndroidFontResolveInterceptor(int i10) {
        this.fontWeightAdjustment = i10;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    private final int getFontWeightAdjustment() {
        return this.fontWeightAdjustment;
    }

    public static /* synthetic */ AndroidFontResolveInterceptor g(AndroidFontResolveInterceptor androidFontResolveInterceptor, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = androidFontResolveInterceptor.fontWeightAdjustment;
        }
        return androidFontResolveInterceptor.f(i10);
    }

    @Override // androidx.compose.ui.text.font.s0
    public /* synthetic */ v a(v vVar) {
        return r0.a(this, vVar);
    }

    @Override // androidx.compose.ui.text.font.s0
    @dl.d
    public FontWeight b(@dl.d FontWeight fontWeight) {
        kotlin.jvm.internal.f0.p(fontWeight, "fontWeight");
        int i10 = this.fontWeightAdjustment;
        return (i10 == 0 || i10 == Integer.MAX_VALUE) ? fontWeight : new FontWeight(fi.u.I(fontWeight.w() + this.fontWeightAdjustment, 1, 1000));
    }

    @Override // androidx.compose.ui.text.font.s0
    public /* synthetic */ int c(int i10) {
        return r0.b(this, i10);
    }

    @Override // androidx.compose.ui.text.font.s0
    public /* synthetic */ int d(int i10) {
        return r0.c(this, i10);
    }

    public boolean equals(@dl.e Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof AndroidFontResolveInterceptor) && this.fontWeightAdjustment == ((AndroidFontResolveInterceptor) other).fontWeightAdjustment;
    }

    @dl.d
    public final AndroidFontResolveInterceptor f(int fontWeightAdjustment) {
        return new AndroidFontResolveInterceptor(fontWeightAdjustment);
    }

    public int hashCode() {
        return this.fontWeightAdjustment;
    }

    @dl.d
    public String toString() {
        return "AndroidFontResolveInterceptor(fontWeightAdjustment=" + this.fontWeightAdjustment + ')';
    }
}
