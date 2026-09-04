package b7;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: CertContext.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b$\u0010%J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\b\u001a\u00020\u0002H\u0016R$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR*\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010\u001e\u001a\u00020\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006&"}, d2 = {"Lb7/d;", "", "", "key", "value", "Lkotlin/b2;", ak.av, "e", "toString", "entryToken", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "i", "(Ljava/lang/String;)V", "", "entryDataTypes", "[Ljava/lang/String;", ak.aF, "()[Ljava/lang/String;", RXScreenCaptureService.KEY_HEIGHT, "([Ljava/lang/String;)V", "", "entryCategory", "Ljava/lang/Integer;", "b", "()Ljava/lang/Integer;", "g", "(Ljava/lang/Integer;)V", "Lb7/f;", "timeAnchor", "Lb7/f;", "f", "()Lb7/f;", "j", "(Lb7/f;)V", "<init>", "()V", "basics_release"}, k = 1, mv = {1, 4, 0})
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.e
    private String f30429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.e
    private String[] f30430b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.e
    private Integer f30431c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private TimeAnchor f30432d = new TimeAnchor();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map<String, Object> f30433e = new LinkedHashMap();

    public final void a(@dl.d String key, @dl.e String str) {
        f0.q(key, "key");
        this.f30433e.put(key, str);
    }

    @dl.e
    /* JADX INFO: renamed from: b, reason: from getter */
    public final Integer getF30431c() {
        return this.f30431c;
    }

    @dl.e
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String[] getF30430b() {
        return this.f30430b;
    }

    @dl.e
    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getF30429a() {
        return this.f30429a;
    }

    @dl.e
    public final Object e(@dl.d String key) {
        f0.q(key, "key");
        return this.f30433e.get(key);
    }

    @dl.d
    /* JADX INFO: renamed from: f, reason: from getter */
    public final TimeAnchor getF30432d() {
        return this.f30432d;
    }

    public final void g(@dl.e Integer num) {
        this.f30431c = num;
    }

    public final void h(@dl.e String[] strArr) {
        this.f30430b = strArr;
    }

    public final void i(@dl.e String str) {
        this.f30429a = str;
    }

    public final void j(@dl.d TimeAnchor timeAnchor) {
        f0.q(timeAnchor, "<set-?>");
        this.f30432d = timeAnchor;
    }

    @dl.d
    public String toString() {
        String string;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[entryToken:");
        sb2.append(this.f30429a);
        sb2.append(";entryDataTypes:");
        String[] strArr = this.f30430b;
        if (strArr != null) {
            string = Arrays.toString(strArr);
            f0.h(string, "java.util.Arrays.toString(this)");
        } else {
            string = null;
        }
        sb2.append(string);
        sb2.append(";entryCategory:");
        sb2.append(this.f30431c);
        sb2.append(";entryExtraInfo:");
        sb2.append(this.f30433e);
        sb2.append(']');
        return sb2.toString();
    }
}
