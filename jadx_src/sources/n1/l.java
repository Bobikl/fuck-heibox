package n1;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import com.umeng.analytics.pro.ak;
import com.umeng.socialize.net.utils.SocializeProtocolConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ShadowSpan.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u000b\u0012\u0006\u0010\u0012\u001a\u00020\u000b¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0010\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u000fR\u0017\u0010\u0012\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0013\u0010\u000f¨\u0006\u0016"}, d2 = {"Ln1/l;", "Landroid/text/style/CharacterStyle;", "Landroid/text/TextPaint;", SocializeProtocolConstants.PROTOCOL_KEY_REQUEST_TYPE, "Lkotlin/b2;", "updateDrawState", "", "color", "I", ak.av, "()I", "", com.max.mediaselector.lib.config.b.f75077e, "F", "b", "()F", com.max.mediaselector.lib.config.b.f75078f, ak.aF, "radius", "d", "<init>", "(IFFF)V", "ui-text_release"}, k = 1, mv = {1, 7, 1})
@androidx.compose.ui.text.android.g
public final class l extends CharacterStyle {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f131984e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f131985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f131986b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f131987c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f131988d;

    public l(int i10, float f10, float f11, float f12) {
        this.f131985a = i10;
        this.f131986b = f10;
        this.f131987c = f11;
        this.f131988d = f12;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getF131985a() {
        return this.f131985a;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final float getF131986b() {
        return this.f131986b;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final float getF131987c() {
        return this.f131987c;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final float getF131988d() {
        return this.f131988d;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(@dl.d TextPaint tp) {
        f0.p(tp, "tp");
        tp.setShadowLayer(this.f131988d, this.f131986b, this.f131987c, this.f131985a);
    }
}
