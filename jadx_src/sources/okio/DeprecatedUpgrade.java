package okio;

import dl.d;
import kotlin.Metadata;
import xh.h;

/* JADX INFO: renamed from: okio.-DeprecatedUpgrade, reason: invalid class name */
/* JADX INFO: compiled from: -DeprecatedUpgrade.kt */
/* JADX INFO: loaded from: classes5.dex */
@h(name = "-DeprecatedUpgrade")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0011\u0010\u0000\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Okio", "Lokio/-DeprecatedOkio;", "getOkio", "()Lokio/-DeprecatedOkio;", "Utf8", "Lokio/-DeprecatedUtf8;", "getUtf8", "()Lokio/-DeprecatedUtf8;", "okio"}, k = 2, mv = {1, 4, 0})
public final class DeprecatedUpgrade {

    @d
    private static final DeprecatedOkio Okio = DeprecatedOkio.INSTANCE;

    @d
    private static final DeprecatedUtf8 Utf8 = DeprecatedUtf8.INSTANCE;

    @d
    public static final DeprecatedOkio getOkio() {
        return Okio;
    }

    @d
    public static final DeprecatedUtf8 getUtf8() {
        return Utf8;
    }
}
