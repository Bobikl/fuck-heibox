package androidx.window.core;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import com.xiaomi.mipush.sdk.Constants;
import java.math.BigInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.b0;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import kotlin.z;
import xh.m;

/* JADX INFO: compiled from: Version.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001!B)\b\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\u0006\u0010\u0012\u001a\u00020\u0005\u0012\u0006\u0010\u0015\u001a\u00020\u0005\u0012\u0006\u0010\u0019\u001a\u00020\u0002¢\u0006\u0004\b\u001f\u0010 J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0011\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0000H\u0096\u0002J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0007H\u0096\u0002J\b\u0010\n\u001a\u00020\u0005H\u0016R\u0017\u0010\u000f\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0012\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0011\u0010\u000eR\u0017\u0010\u0015\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0013\u0010\f\u001a\u0004\b\u0014\u0010\u000eR\u0017\u0010\u0019\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001d¨\u0006\""}, d2 = {"Landroidx/window/core/Version;", "", "", "toString", "other", "", "e", "", "", "equals", "hashCode", "b", "I", RXScreenCaptureService.KEY_HEIGHT, "()I", "major", ak.aF, "i", "minor", "d", "j", "patch", "Ljava/lang/String;", "g", "()Ljava/lang/String;", "description", "Ljava/math/BigInteger;", "f", "Lkotlin/z;", "()Ljava/math/BigInteger;", "bigInteger", "<init>", "(IIILjava/lang/String;)V", ak.av, "window_release"}, k = 1, mv = {1, 6, 0})
public final class Version implements Comparable<Version> {

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @dl.d
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.d
    private static final Version f28474h = new Version(0, 0, 0, "");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.d
    private static final Version f28475i = new Version(0, 1, 0, "");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.d
    private static final Version f28476j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @dl.d
    private static final Version f28477k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @dl.d
    private static final String f28478l = "(\\d+)(?:\\.(\\d+))(?:\\.(\\d+))(?:-(.+))?";

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int major;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int minor;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int patch;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final String description;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final z bigInteger;

    /* JADX INFO: renamed from: androidx.window.core.Version$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: Version.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0007\u001a\u0004\b\u000b\u0010\tR\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\u0007\u001a\u0004\b\r\u0010\tR\u0017\u0010\u000e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0007\u001a\u0004\b\u000f\u0010\tR\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Landroidx/window/core/Version$a;", "", "", "versionString", "Landroidx/window/core/Version;", "e", "UNKNOWN", "Landroidx/window/core/Version;", "b", "()Landroidx/window/core/Version;", "VERSION_0_1", ak.aF, "VERSION_1_0", "d", "CURRENT", ak.av, "VERSION_PATTERN_STRING", "Ljava/lang/String;", "<init>", "()V", "window_release"}, k = 1, mv = {1, 6, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(u uVar) {
            this();
        }

        @dl.d
        public final Version a() {
            return Version.f28477k;
        }

        @dl.d
        public final Version b() {
            return Version.f28474h;
        }

        @dl.d
        public final Version c() {
            return Version.f28475i;
        }

        @dl.d
        public final Version d() {
            return Version.f28476j;
        }

        @dl.e
        @m
        public final Version e(@dl.e String versionString) {
            if (versionString == null || kotlin.text.u.V1(versionString)) {
                return null;
            }
            Matcher matcher = Pattern.compile(Version.f28478l).matcher(versionString);
            if (!matcher.matches()) {
                return null;
            }
            String strGroup = matcher.group(1);
            Integer numValueOf = strGroup == null ? null : Integer.valueOf(Integer.parseInt(strGroup));
            if (numValueOf == null) {
                return null;
            }
            int iIntValue = numValueOf.intValue();
            String strGroup2 = matcher.group(2);
            Integer numValueOf2 = strGroup2 == null ? null : Integer.valueOf(Integer.parseInt(strGroup2));
            if (numValueOf2 == null) {
                return null;
            }
            int iIntValue2 = numValueOf2.intValue();
            String strGroup3 = matcher.group(3);
            Integer numValueOf3 = strGroup3 == null ? null : Integer.valueOf(Integer.parseInt(strGroup3));
            if (numValueOf3 == null) {
                return null;
            }
            int iIntValue3 = numValueOf3.intValue();
            String description = matcher.group(4) != null ? matcher.group(4) : "";
            f0.o(description, "description");
            return new Version(iIntValue, iIntValue2, iIntValue3, description, null);
        }
    }

    static {
        Version version = new Version(1, 0, 0, "");
        f28476j = version;
        f28477k = version;
    }

    private Version(int i10, int i11, int i12, String str) {
        this.major = i10;
        this.minor = i11;
        this.patch = i12;
        this.description = str;
        this.bigInteger = b0.c(new yh.a<BigInteger>() { // from class: androidx.window.core.Version$bigInteger$2
            {
                super(0);
            }

            @Override // yh.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final BigInteger invoke() {
                return BigInteger.valueOf(this.f28484b.getMajor()).shiftLeft(32).or(BigInteger.valueOf(this.f28484b.getMinor())).shiftLeft(32).or(BigInteger.valueOf(this.f28484b.getPatch()));
            }
        });
    }

    public /* synthetic */ Version(int i10, int i11, int i12, String str, u uVar) {
        this(i10, i11, i12, str);
    }

    private final BigInteger f() {
        Object value = this.bigInteger.getValue();
        f0.o(value, "<get-bigInteger>(...)");
        return (BigInteger) value;
    }

    @dl.e
    @m
    public static final Version k(@dl.e String str) {
        return INSTANCE.e(str);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public int compareTo(@dl.d Version other) {
        f0.p(other, "other");
        return f().compareTo(other.f());
    }

    public boolean equals(@dl.e Object other) {
        if (!(other instanceof Version)) {
            return false;
        }
        Version version = (Version) other;
        return this.major == version.major && this.minor == version.minor && this.patch == version.patch;
    }

    @dl.d
    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final int getMajor() {
        return this.major;
    }

    public int hashCode() {
        return ((((bb.c.b.f30674h7 + this.major) * 31) + this.minor) * 31) + this.patch;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final int getMinor() {
        return this.minor;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final int getPatch() {
        return this.patch;
    }

    @dl.d
    public String toString() {
        return this.major + lg.a.f131414g + this.minor + lg.a.f131414g + this.patch + (kotlin.text.u.V1(this.description) ^ true ? f0.C(Constants.ACCEPT_TIME_SEPARATOR_SERVER, this.description) : "");
    }
}
