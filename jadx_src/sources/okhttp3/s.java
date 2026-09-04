package okhttp3;

import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.umeng.analytics.pro.ak;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.c1;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.v0;
import kotlin.s0;
import kotlin.text.StringsKt__StringsKt;
import okhttp3.internal.Util;
import okhttp3.internal.http.DatesKt;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* JADX INFO: compiled from: Headers.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\"\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010(\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0007\u0018\u0000 (2\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u0002\u000b\u0015B\u0017\b\u0002\u0012\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00030\"¢\u0006\u0004\b&\u0010'J\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0086\u0002J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0004\u001a\u00020\u0003J\u0012\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0004\u001a\u00020\u0003H\u0007J\u000f\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u000e\u0010\u000e\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\nJ\u000e\u0010\u000f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\nJ\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u0010J\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u00122\u0006\u0010\u0004\u001a\u00020\u0003J\u0006\u0010\u0015\u001a\u00020\u0014J\u001b\u0010\u0017\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00020\u0016H\u0096\u0002J\u0006\u0010\u0019\u001a\u00020\u0018J\u0013\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0096\u0002J\b\u0010\u001e\u001a\u00020\nH\u0016J\b\u0010\u001f\u001a\u00020\u0003H\u0016J\u0018\u0010!\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00120 R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00030\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010#R\u0011\u0010%\u001a\u00020\n8G¢\u0006\u0006\u001a\u0004\b%\u0010\f¨\u0006)"}, d2 = {"Lokhttp3/s;", "", "Lkotlin/Pair;", "", "name", "e", "Ljava/util/Date;", "g", "Ljava/time/Instant;", RXScreenCaptureService.KEY_HEIGHT, "", ak.av, "()I", UCropPlusActivity.ARG_INDEX, "i", "v", "", "j", "", RXScreenCaptureService.KEY_WIDTH, "", "b", "", "iterator", "Lokhttp3/s$a;", "l", "", "other", "", "equals", "hashCode", "toString", "", ak.aG, "", "[Ljava/lang/String;", "namesAndValues", UiKitSpanObj.TYPE_SIZE, "<init>", "([Ljava/lang/String;)V", ak.aF, "okhttp"}, k = 1, mv = {1, 4, 0})
public final class s implements Iterable<Pair<? extends String, ? extends String>>, zh.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String[] namesAndValues;

    /* JADX INFO: compiled from: Headers.kt */
    @Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010!\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\t\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002J\u0016\u0010\n\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002J\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000bJ\u0016\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u000eJ\u0018\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0010H\u0007J\u0019\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u000eH\u0086\u0002J\u0019\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0010H\u0087\u0002J\u001f\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u000e\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0002J\u0019\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0086\u0002J\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0086\u0002J\u0006\u0010\u0019\u001a\u00020\u000bR \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00020\u001a8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006!"}, d2 = {"Lokhttp3/s$a;", "", "", "line", "f", "(Ljava/lang/String;)Lokhttp3/s$a;", ak.av, "name", "value", "b", RXScreenCaptureService.KEY_HEIGHT, "Lokhttp3/s;", "headers", "e", "Ljava/util/Date;", "d", "Ljava/time/Instant;", ak.aF, "o", "n", "g", "(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/s$a;", "l", "m", "j", "i", "", "Ljava/util/List;", "k", "()Ljava/util/List;", "namesAndValues", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final List<String> namesAndValues = new ArrayList(20);

        @dl.d
        public final a a(@dl.d String line) {
            kotlin.jvm.internal.f0.p(line, "line");
            int iR3 = StringsKt__StringsKt.r3(line, ':', 0, false, 6, null);
            if (!(iR3 != -1)) {
                throw new IllegalArgumentException(("Unexpected header: " + line).toString());
            }
            String strSubstring = line.substring(0, iR3);
            kotlin.jvm.internal.f0.o(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            if (strSubstring == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
            }
            String string = StringsKt__StringsKt.F5(strSubstring).toString();
            String strSubstring2 = line.substring(iR3 + 1);
            kotlin.jvm.internal.f0.o(strSubstring2, "(this as java.lang.String).substring(startIndex)");
            b(string, strSubstring2);
            return this;
        }

        @dl.d
        public final a b(@dl.d String name, @dl.d String value) {
            kotlin.jvm.internal.f0.p(name, "name");
            kotlin.jvm.internal.f0.p(value, "value");
            Companion companion = s.INSTANCE;
            companion.f(name);
            companion.g(value, name);
            g(name, value);
            return this;
        }

        @dl.d
        @IgnoreJRERequirement
        public final a c(@dl.d String name, @dl.d Instant value) {
            kotlin.jvm.internal.f0.p(name, "name");
            kotlin.jvm.internal.f0.p(value, "value");
            d(name, new Date(value.toEpochMilli()));
            return this;
        }

        @dl.d
        public final a d(@dl.d String name, @dl.d Date value) {
            kotlin.jvm.internal.f0.p(name, "name");
            kotlin.jvm.internal.f0.p(value, "value");
            b(name, DatesKt.toHttpDateString(value));
            return this;
        }

        @dl.d
        public final a e(@dl.d s headers) {
            kotlin.jvm.internal.f0.p(headers, "headers");
            int size = headers.size();
            for (int i10 = 0; i10 < size; i10++) {
                g(headers.i(i10), headers.v(i10));
            }
            return this;
        }

        @dl.d
        public final a f(@dl.d String line) {
            kotlin.jvm.internal.f0.p(line, "line");
            int iR3 = StringsKt__StringsKt.r3(line, ':', 1, false, 4, null);
            if (iR3 != -1) {
                String strSubstring = line.substring(0, iR3);
                kotlin.jvm.internal.f0.o(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                String strSubstring2 = line.substring(iR3 + 1);
                kotlin.jvm.internal.f0.o(strSubstring2, "(this as java.lang.String).substring(startIndex)");
                g(strSubstring, strSubstring2);
            } else if (line.charAt(0) == ':') {
                String strSubstring3 = line.substring(1);
                kotlin.jvm.internal.f0.o(strSubstring3, "(this as java.lang.String).substring(startIndex)");
                g("", strSubstring3);
            } else {
                g("", line);
            }
            return this;
        }

        @dl.d
        public final a g(@dl.d String name, @dl.d String value) {
            kotlin.jvm.internal.f0.p(name, "name");
            kotlin.jvm.internal.f0.p(value, "value");
            this.namesAndValues.add(name);
            this.namesAndValues.add(StringsKt__StringsKt.F5(value).toString());
            return this;
        }

        @dl.d
        public final a h(@dl.d String name, @dl.d String value) {
            kotlin.jvm.internal.f0.p(name, "name");
            kotlin.jvm.internal.f0.p(value, "value");
            s.INSTANCE.f(name);
            g(name, value);
            return this;
        }

        @dl.d
        public final s i() {
            Object[] array = this.namesAndValues.toArray(new String[0]);
            if (array != null) {
                return new s((String[]) array, null);
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }

        @dl.e
        public final String j(@dl.d String name) {
            kotlin.jvm.internal.f0.p(name, "name");
            fi.j jVarB1 = fi.u.B1(fi.u.k0(this.namesAndValues.size() - 2, 0), 2);
            int iH = jVarB1.h();
            int i10 = jVarB1.i();
            int iJ = jVarB1.j();
            if (iJ >= 0) {
                if (iH > i10) {
                    return null;
                }
            } else if (iH < i10) {
                return null;
            }
            while (!kotlin.text.u.L1(name, this.namesAndValues.get(iH), true)) {
                if (iH == i10) {
                    return null;
                }
                iH += iJ;
            }
            return this.namesAndValues.get(iH + 1);
        }

        @dl.d
        public final List<String> k() {
            return this.namesAndValues;
        }

        @dl.d
        public final a l(@dl.d String name) {
            kotlin.jvm.internal.f0.p(name, "name");
            int i10 = 0;
            while (i10 < this.namesAndValues.size()) {
                if (kotlin.text.u.L1(name, this.namesAndValues.get(i10), true)) {
                    this.namesAndValues.remove(i10);
                    this.namesAndValues.remove(i10);
                    i10 -= 2;
                }
                i10 += 2;
            }
            return this;
        }

        @dl.d
        public final a m(@dl.d String name, @dl.d String value) {
            kotlin.jvm.internal.f0.p(name, "name");
            kotlin.jvm.internal.f0.p(value, "value");
            Companion companion = s.INSTANCE;
            companion.f(name);
            companion.g(value, name);
            l(name);
            g(name, value);
            return this;
        }

        @dl.d
        @IgnoreJRERequirement
        public final a n(@dl.d String name, @dl.d Instant value) {
            kotlin.jvm.internal.f0.p(name, "name");
            kotlin.jvm.internal.f0.p(value, "value");
            return o(name, new Date(value.toEpochMilli()));
        }

        @dl.d
        public final a o(@dl.d String name, @dl.d Date value) {
            kotlin.jvm.internal.f0.p(name, "name");
            kotlin.jvm.internal.f0.p(value, "value");
            m(name, DatesKt.toHttpDateString(value));
            return this;
        }
    }

    /* JADX INFO: renamed from: okhttp3.s$b, reason: from kotlin metadata */
    /* JADX INFO: compiled from: Headers.kt */
    @Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u0006\u001a\u0004\u0018\u00010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0003H\u0002J\u0018\u0010\u000b\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002J#\u0010\r\u001a\u00020\f2\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\"\u00020\u0003H\u0007¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u000f\u001a\u00020\f2\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\"\u00020\u0003H\u0007¢\u0006\u0004\b\u000f\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\f*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0010H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0014\u001a\u00020\f2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0010H\u0007¢\u0006\u0004\b\u0014\u0010\u0012¨\u0006\u0017"}, d2 = {"Lokhttp3/s$b;", "", "", "", "namesAndValues", "name", RXScreenCaptureService.KEY_HEIGHT, "([Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Lkotlin/b2;", "f", "value", "g", "Lokhttp3/s;", "j", "([Ljava/lang/String;)Lokhttp3/s;", "b", "", "i", "(Ljava/util/Map;)Lokhttp3/s;", "headers", ak.av, "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.u uVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void f(String str) {
            if (!(str.length() > 0)) {
                throw new IllegalArgumentException("name is empty".toString());
            }
            int length = str.length();
            for (int i10 = 0; i10 < length; i10++) {
                char cCharAt = str.charAt(i10);
                if (!('!' <= cCharAt && '~' >= cCharAt)) {
                    throw new IllegalArgumentException(Util.format("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i10), str).toString());
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void g(String str, String str2) {
            int length = str.length();
            for (int i10 = 0; i10 < length; i10++) {
                char cCharAt = str.charAt(i10);
                if (!(cCharAt == '\t' || (' ' <= cCharAt && '~' >= cCharAt))) {
                    throw new IllegalArgumentException(Util.format("Unexpected char %#04x at %d in %s value: %s", Integer.valueOf(cCharAt), Integer.valueOf(i10), str2, str).toString());
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String h(String[] namesAndValues, String name) {
            fi.j jVarB1 = fi.u.B1(fi.u.k0(namesAndValues.length - 2, 0), 2);
            int iH = jVarB1.h();
            int i10 = jVarB1.i();
            int iJ = jVarB1.j();
            if (iJ >= 0) {
                if (iH > i10) {
                    return null;
                }
            } else if (iH < i10) {
                return null;
            }
            while (!kotlin.text.u.L1(name, namesAndValues[iH], true)) {
                if (iH == i10) {
                    return null;
                }
                iH += iJ;
            }
            return namesAndValues[iH + 1];
        }

        @dl.d
        @kotlin.k(level = DeprecationLevel.ERROR, message = "function moved to extension", replaceWith = @s0(expression = "headers.toHeaders()", imports = {}))
        @xh.h(name = "-deprecated_of")
        public final s a(@dl.d Map<String, String> headers) {
            kotlin.jvm.internal.f0.p(headers, "headers");
            return i(headers);
        }

        @dl.d
        @kotlin.k(level = DeprecationLevel.ERROR, message = "function name changed", replaceWith = @s0(expression = "headersOf(*namesAndValues)", imports = {}))
        @xh.h(name = "-deprecated_of")
        public final s b(@dl.d String... namesAndValues) {
            kotlin.jvm.internal.f0.p(namesAndValues, "namesAndValues");
            return j((String[]) Arrays.copyOf(namesAndValues, namesAndValues.length));
        }

        @dl.d
        @xh.h(name = "of")
        @xh.m
        public final s i(@dl.d Map<String, String> toHeaders) {
            kotlin.jvm.internal.f0.p(toHeaders, "$this$toHeaders");
            String[] strArr = new String[toHeaders.size() * 2];
            int i10 = 0;
            for (Map.Entry<String, String> entry : toHeaders.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (key == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
                }
                String string = StringsKt__StringsKt.F5(key).toString();
                if (value == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
                }
                String string2 = StringsKt__StringsKt.F5(value).toString();
                f(string);
                g(string2, string);
                strArr[i10] = string;
                strArr[i10 + 1] = string2;
                i10 += 2;
            }
            return new s(strArr, null);
        }

        @dl.d
        @xh.h(name = "of")
        @xh.m
        public final s j(@dl.d String... namesAndValues) throws CloneNotSupportedException {
            kotlin.jvm.internal.f0.p(namesAndValues, "namesAndValues");
            if (!(namesAndValues.length % 2 == 0)) {
                throw new IllegalArgumentException("Expected alternating header names and values".toString());
            }
            Object objClone = namesAndValues.clone();
            if (objClone == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.String>");
            }
            String[] strArr = (String[]) objClone;
            int length = strArr.length;
            for (int i10 = 0; i10 < length; i10++) {
                String str = strArr[i10];
                if (!(str != null)) {
                    throw new IllegalArgumentException("Headers cannot be null".toString());
                }
                if (str == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
                }
                strArr[i10] = StringsKt__StringsKt.F5(str).toString();
            }
            fi.j jVarB1 = fi.u.B1(fi.u.W1(0, strArr.length), 2);
            int iH = jVarB1.h();
            int i11 = jVarB1.i();
            int iJ = jVarB1.j();
            if (iJ < 0 ? iH >= i11 : iH <= i11) {
                while (true) {
                    String str2 = strArr[iH];
                    String str3 = strArr[iH + 1];
                    f(str2);
                    g(str3, str2);
                    if (iH == i11) {
                        break;
                    }
                    iH += iJ;
                }
            }
            return new s(strArr, null);
        }
    }

    private s(String[] strArr) {
        this.namesAndValues = strArr;
    }

    public /* synthetic */ s(String[] strArr, kotlin.jvm.internal.u uVar) {
        this(strArr);
    }

    @dl.d
    @xh.h(name = "of")
    @xh.m
    public static final s o(@dl.d Map<String, String> map) {
        return INSTANCE.i(map);
    }

    @dl.d
    @xh.h(name = "of")
    @xh.m
    public static final s s(@dl.d String... strArr) {
        return INSTANCE.j(strArr);
    }

    @kotlin.k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @s0(expression = UiKitSpanObj.TYPE_SIZE, imports = {}))
    @xh.h(name = "-deprecated_size")
    public final int a() {
        return size();
    }

    public final long b() {
        String[] strArr = this.namesAndValues;
        long length = strArr.length * 2;
        int length2 = strArr.length;
        for (int i10 = 0; i10 < length2; i10++) {
            length += (long) this.namesAndValues[i10].length();
        }
        return length;
    }

    @dl.e
    public final String e(@dl.d String name) {
        kotlin.jvm.internal.f0.p(name, "name");
        return INSTANCE.h(this.namesAndValues, name);
    }

    public boolean equals(@dl.e Object other) {
        return (other instanceof s) && Arrays.equals(this.namesAndValues, ((s) other).namesAndValues);
    }

    @dl.e
    public final Date g(@dl.d String name) {
        kotlin.jvm.internal.f0.p(name, "name");
        String strE = e(name);
        if (strE != null) {
            return DatesKt.toHttpDateOrNull(strE);
        }
        return null;
    }

    @dl.e
    @IgnoreJRERequirement
    public final Instant h(@dl.d String name) {
        kotlin.jvm.internal.f0.p(name, "name");
        Date dateG = g(name);
        if (dateG != null) {
            return dateG.toInstant();
        }
        return null;
    }

    public int hashCode() {
        return Arrays.hashCode(this.namesAndValues);
    }

    @dl.d
    public final String i(int index) {
        return this.namesAndValues[index * 2];
    }

    @Override // java.lang.Iterable
    @dl.d
    public Iterator<Pair<? extends String, ? extends String>> iterator() {
        int size = size();
        Pair[] pairArr = new Pair[size];
        for (int i10 = 0; i10 < size; i10++) {
            pairArr[i10] = c1.a(i(i10), v(i10));
        }
        return kotlin.jvm.internal.h.a(pairArr);
    }

    @dl.d
    public final Set<String> j() {
        TreeSet treeSet = new TreeSet(kotlin.text.u.T1(v0.f124986a));
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            treeSet.add(i(i10));
        }
        Set<String> setUnmodifiableSet = Collections.unmodifiableSet(treeSet);
        kotlin.jvm.internal.f0.o(setUnmodifiableSet, "Collections.unmodifiableSet(result)");
        return setUnmodifiableSet;
    }

    @dl.d
    public final a l() {
        a aVar = new a();
        kotlin.collections.x.p0(aVar.k(), this.namesAndValues);
        return aVar;
    }

    @xh.h(name = UiKitSpanObj.TYPE_SIZE)
    public final int size() {
        return this.namesAndValues.length / 2;
    }

    @dl.d
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            sb2.append(i(i10));
            sb2.append(": ");
            sb2.append(v(i10));
            sb2.append("\n");
        }
        String string = sb2.toString();
        kotlin.jvm.internal.f0.o(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    @dl.d
    public final Map<String, List<String>> u() {
        TreeMap treeMap = new TreeMap(kotlin.text.u.T1(v0.f124986a));
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            String strI = i(i10);
            Locale locale = Locale.US;
            kotlin.jvm.internal.f0.o(locale, "Locale.US");
            if (strI == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            String lowerCase = strI.toLowerCase(locale);
            kotlin.jvm.internal.f0.o(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
            List arrayList = (List) treeMap.get(lowerCase);
            if (arrayList == null) {
                arrayList = new ArrayList(2);
                treeMap.put(lowerCase, arrayList);
            }
            arrayList.add(v(i10));
        }
        return treeMap;
    }

    @dl.d
    public final String v(int index) {
        return this.namesAndValues[(index * 2) + 1];
    }

    @dl.d
    public final List<String> w(@dl.d String name) {
        kotlin.jvm.internal.f0.p(name, "name");
        int size = size();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < size; i10++) {
            if (kotlin.text.u.L1(name, i(i10), true)) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(v(i10));
            }
        }
        if (arrayList == null) {
            return CollectionsKt__CollectionsKt.E();
        }
        List<String> listUnmodifiableList = Collections.unmodifiableList(arrayList);
        kotlin.jvm.internal.f0.o(listUnmodifiableList, "Collections.unmodifiableList(result)");
        return listUnmodifiableList;
    }
}
