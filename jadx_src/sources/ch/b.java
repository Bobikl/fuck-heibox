package ch;

import android.graphics.Color;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: IndicatorOptions.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b1\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b?\u0010@J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0006J\u0016\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002R\"\u0010\u000e\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u0014\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013R\"\u0010\u0017\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u000f\u001a\u0004\b\u0018\u0010\u0011\"\u0004\b\u0019\u0010\u0013R\"\u0010\u001a\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u000f\u001a\u0004\b\u001b\u0010\u0011\"\u0004\b\u001c\u0010\u0013R\"\u0010\u001d\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u000f\u001a\u0004\b\u001e\u0010\u0011\"\u0004\b\u001f\u0010\u0013R\"\u0010 \u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010\u000f\u001a\u0004\b!\u0010\u0011\"\u0004\b\"\u0010\u0013R\"\u0010#\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\"\u0010)\u001a\u00020\u00068F@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010$\u001a\u0004\b*\u0010&\"\u0004\b+\u0010(R\"\u0010,\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010$\u001a\u0004\b-\u0010&\"\u0004\b.\u0010(R\"\u0010/\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u0010$\u001a\u0004\b0\u0010&\"\u0004\b1\u0010(R\"\u00102\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u0010\u000f\u001a\u0004\b3\u0010\u0011\"\u0004\b4\u0010\u0013R\"\u00105\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u0010$\u001a\u0004\b6\u0010&\"\u0004\b7\u0010(R\"\u00109\u001a\u0002088\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>¨\u0006A"}, d2 = {"Lch/b;", "", "", "checkedColor", "Lkotlin/b2;", "n", "", "normalIndicatorWidth", "checkedIndicatorWidth", "D", "sliderWidth", "C", "normalColor", ak.aD, "orientation", "I", "g", "()I", ak.aG, "(I)V", "indicatorStyle", "d", "r", "slideMode", "j", "x", "pageSize", RXScreenCaptureService.KEY_HEIGHT, "v", "normalSliderColor", "e", ak.aB, "checkedSliderColor", ak.av, "o", "sliderGap", "F", "l", "()F", androidx.exifinterface.media.a.W4, "(F)V", "sliderHeight", "m", "B", "normalSliderWidth", "f", "t", "checkedSliderWidth", "b", "p", "currentPosition", ak.aF, "q", "slideProgress", "k", "y", "", "showIndicatorOneItem", "Z", "i", "()Z", RXScreenCaptureService.KEY_WIDTH, "(Z)V", "<init>", "()V", "indicator_release"}, k = 1, mv = {1, 4, 0})
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f35648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f35649b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f35650c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f35651d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f35652e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f35653f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f35654g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f35655h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f35656i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f35657j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f35658k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f35659l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f35660m;

    public b() {
        float fA = dh.a.a(8.0f);
        this.f35656i = fA;
        this.f35657j = fA;
        this.f35654g = fA;
        this.f35652e = Color.parseColor("#8C18171C");
        this.f35653f = Color.parseColor("#8C6C6D72");
        this.f35650c = 0;
    }

    public final void A(float f10) {
        this.f35654g = f10;
    }

    public final void B(float f10) {
        this.f35655h = f10;
    }

    public final void C(float f10) {
        D(f10, f10);
    }

    public final void D(float f10, float f11) {
        this.f35656i = f10;
        this.f35657j = f11;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getF35653f() {
        return this.f35653f;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final float getF35657j() {
        return this.f35657j;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getF35658k() {
        return this.f35658k;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getF35649b() {
        return this.f35649b;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getF35652e() {
        return this.f35652e;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final float getF35656i() {
        return this.f35656i;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getF35648a() {
        return this.f35648a;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final int getF35651d() {
        return this.f35651d;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getF35660m() {
        return this.f35660m;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final int getF35650c() {
        return this.f35650c;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final float getF35659l() {
        return this.f35659l;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final float getF35654g() {
        return this.f35654g;
    }

    public final float m() {
        float f10 = this.f35655h;
        return f10 > ((float) 0) ? f10 : this.f35656i / 2;
    }

    public final void n(int i10) {
        this.f35653f = i10;
    }

    public final void o(int i10) {
        this.f35653f = i10;
    }

    public final void p(float f10) {
        this.f35657j = f10;
    }

    public final void q(int i10) {
        this.f35658k = i10;
    }

    public final void r(int i10) {
        this.f35649b = i10;
    }

    public final void s(int i10) {
        this.f35652e = i10;
    }

    public final void t(float f10) {
        this.f35656i = f10;
    }

    public final void u(int i10) {
        this.f35648a = i10;
    }

    public final void v(int i10) {
        this.f35651d = i10;
    }

    public final void w(boolean z10) {
        this.f35660m = z10;
    }

    public final void x(int i10) {
        this.f35650c = i10;
    }

    public final void y(float f10) {
        this.f35659l = f10;
    }

    public final void z(int i10, int i11) {
        this.f35652e = i10;
        this.f35653f = i11;
    }
}
