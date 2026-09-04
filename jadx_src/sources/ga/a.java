package ga;

import com.loper7.date_time_picker.ext.CalendarExtKt;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import dl.d;
import dl.e;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import org.apache.tools.ant.taskdefs.p7;

/* JADX INFO: compiled from: Lunar.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b'\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0018B?\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0005\u0012\u0006\u0010\u0017\u001a\u00020\u0002\u0012\u0006\u0010\u001a\u001a\u00020\u0002\u0012\u0006\u0010\u001d\u001a\u00020\u0002\u0012\u0006\u0010 \u001a\u00020\u0002¢\u0006\u0004\b,\u0010-J\u0006\u0010\u0003\u001a\u00020\u0002J\u0013\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\b\u001a\u00020\u0007H\u0016R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u000f\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\"\u0010\u0012\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0004\u0010\u0016R\"\u0010\u0017\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\n\u001a\u0004\b\u0018\u0010\f\"\u0004\b\u0019\u0010\u000eR\"\u0010\u001a\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\n\u001a\u0004\b\u001b\u0010\f\"\u0004\b\u001c\u0010\u000eR\"\u0010\u001d\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\n\u001a\u0004\b\u001e\u0010\f\"\u0004\b\u001f\u0010\u000eR\"\u0010 \u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010\n\u001a\u0004\b!\u0010\f\"\u0004\b\"\u0010\u000eR\u0011\u0010%\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0011\u0010'\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b&\u0010$R\u0011\u0010)\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b(\u0010$R\u0011\u0010+\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b*\u0010$¨\u0006."}, d2 = {"Lga/a;", "", "", "e", "o", "", "equals", "", "toString", "year", "I", "j", "()I", ak.aB, "(I)V", "month", "g", "q", "isLeapMonth", "Z", "l", "()Z", "(Z)V", p7.a.f135570h, ak.av, "m", p7.a.f135569g, ak.aF, "n", p7.a.f135568f, "f", "p", "seconds", "i", "r", "k", "()Ljava/lang/String;", "yearName", RXScreenCaptureService.KEY_HEIGHT, "monthName", "b", "dayName", "d", "hourName", "<init>", "(IIZIIII)V", "date_time_picker_release"}, k = 1, mv = {1, 5, 1})
public class a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @d
    public static final C1076a f118996h = new C1076a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f118997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f118998b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f118999c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f119000d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f119001e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f119002f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f119003g;

    /* JADX INFO: renamed from: ga.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Lunar.kt */
    @Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\r"}, d2 = {"Lga/a$a;", "", "", "timeInMillis", "Lga/a;", ak.av, "Ljava/util/Calendar;", "calendar", "b", "", "d", "<init>", "()V", "date_time_picker_release"}, k = 1, mv = {1, 5, 1})
    public static final class C1076a {
        private C1076a() {
        }

        public /* synthetic */ C1076a(u uVar) {
            this();
        }

        public static /* synthetic */ a c(C1076a c1076a, Calendar calendar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                calendar = Calendar.getInstance();
                f0.o(calendar, "getInstance()");
            }
            return c1076a.b(calendar);
        }

        @e
        public final a a(long timeInMillis) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(timeInMillis);
            f0.o(calendar, "calendar");
            return b(calendar);
        }

        /* JADX WARN: Code duplicated, block: B:33:0x007a  */
        /* JADX WARN: Code duplicated, block: B:35:0x007d A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:37:0x0080  */
        /* JADX WARN: Code duplicated, block: B:40:0x0088 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:42:0x008b A[LOOP:0: B:16:0x0055->B:42:0x008b, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:46:0x008d A[EDGE_INSN: B:46:0x008d->B:43:0x008d BREAK  A[LOOP:0: B:16:0x0055->B:42:0x008b], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:47:0x0073 A[SYNTHETIC] */
        /* JADX WARN: Multi-variable type inference failed */
        @e
        public final a b(@d Calendar calendar) {
            int i10;
            int i11;
            int i12;
            int i13;
            int i14;
            boolean z10;
            f0.p(calendar, "calendar");
            if (!d(calendar)) {
                return null;
            }
            int i15 = calendar.get(1);
            int i16 = calendar.get(11);
            int iC = calendar.get(6) - 1;
            b bVar = b.f119004a;
            int i17 = bVar.d()[i15 - 1899];
            int i18 = i17 & 255;
            if (i18 > iC) {
                i15--;
                iC += CalendarExtKt.c(new GregorianCalendar(), i15);
                i17 = bVar.d()[i15 - 1899];
                i18 = i17 & 255;
            }
            int i19 = (iC - i18) + 1;
            int i20 = (i17 >> 8) & 15;
            int i21 = i20 > 0 ? 13 : 12;
            int i22 = 0;
            if (i21 > 0) {
                int i23 = 0;
                while (true) {
                    int i24 = i23 + 1;
                    if (1 <= i20 && i20 <= i23) {
                        if (i23 == i20) {
                            i13 = i17 >> 12;
                        } else {
                            i12 = (24 - i23) + 1;
                        }
                        i14 = (i13 & 1) + 29;
                        i19 -= i14;
                        if (i19 <= 0) {
                            int i25 = i19 + i14;
                            if (1 <= i20 || i20 > i23) {
                                z10 = false;
                            } else {
                                z10 = true;
                            }
                            if (z10) {
                                i24--;
                                i22 = i23 != i20 ? 0 : 1;
                            }
                            i11 = i25;
                            i10 = i22;
                            i22 = i24;
                        } else {
                            if (i24 >= i21) {
                                break;
                            }
                            i23 = i24;
                        }
                    } else {
                        i12 = 24 - i23;
                    }
                    i13 = i17 >> i12;
                    i14 = (i13 & 1) + 29;
                    i19 -= i14;
                    if (i19 <= 0) {
                        int i26 = i19 + i14;
                        if (1 <= i20) {
                            z10 = false;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            i24--;
                            i22 = i23 != i20 ? 0 : 1;
                        }
                        i11 = i26;
                        i10 = i22;
                        i22 = i24;
                    } else {
                        if (i24 >= i21) {
                            break;
                            break;
                        }
                        i23 = i24;
                    }
                }
                i10 = 0;
                i11 = 0;
            } else {
                i10 = 0;
                i11 = 0;
            }
            return new a(i15, i22, i10, i11, i16, calendar.get(12), calendar.get(13));
        }

        public final boolean d(@d Calendar calendar) {
            f0.p(calendar, "calendar");
            try {
                int i10 = calendar.get(1);
                int i11 = calendar.get(6) - 1;
                int i12 = i10 - 1899;
                if (i12 >= 0) {
                    b bVar = b.f119004a;
                    if (i12 < bVar.d().length) {
                        if ((bVar.d()[i12] & 255) > i11) {
                            i10--;
                        }
                        return i10 >= 1899;
                    }
                }
                return false;
            } catch (Throwable th2) {
                th2.printStackTrace();
                return false;
            }
        }
    }

    public a(int i10, int i11, boolean z10, int i12, int i13, int i14, int i15) {
        this.f118997a = i10;
        this.f118998b = i11;
        this.f118999c = z10;
        this.f119000d = i12;
        this.f119001e = i13;
        this.f119002f = i14;
        this.f119003g = i15;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getF119000d() {
        return this.f119000d;
    }

    @d
    public final String b() {
        return b.f119004a.a()[this.f119000d - 1];
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getF119001e() {
        return this.f119001e;
    }

    @d
    public final String d() {
        return f0.C(b.f119004a.b()[((this.f119001e + 1) / 2) % 12], "时");
    }

    public final int e() {
        int i10 = b.f119004a.d()[this.f118997a - 1899];
        return ((this.f118999c ? i10 >> 12 : i10 >> ((24 - this.f118998b) + 1)) & 1) + 29;
    }

    public boolean equals(@e Object o10) {
        if (o10 == null || !(o10 instanceof a)) {
            return false;
        }
        a aVar = (a) o10;
        return aVar.f118997a == this.f118997a && aVar.f118998b == this.f118998b && aVar.f118999c == this.f118999c;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getF119002f() {
        return this.f119002f;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getF118998b() {
        return this.f118998b;
    }

    @d
    public final String h() {
        return f0.C(this.f118999c ? "闰" : "", b.f119004a.c()[this.f118998b - 1]);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final int getF119003g() {
        return this.f119003g;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final int getF118997a() {
        return this.f118997a;
    }

    @d
    public final String k() {
        b bVar = b.f119004a;
        return bVar.e()[(this.f118997a - 4) % 10] + bVar.b()[(this.f118997a - 4) % 12] + (char) 24180;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final boolean getF118999c() {
        return this.f118999c;
    }

    public final void m(int i10) {
        this.f119000d = i10;
    }

    public final void n(int i10) {
        this.f119001e = i10;
    }

    public final void o(boolean z10) {
        this.f118999c = z10;
    }

    public final void p(int i10) {
        this.f119002f = i10;
    }

    public final void q(int i10) {
        this.f118998b = i10;
    }

    public final void r(int i10) {
        this.f119003g = i10;
    }

    public final void s(int i10) {
        this.f118997a = i10;
    }

    @d
    public String toString() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("year", Integer.valueOf(this.f118997a));
        linkedHashMap.put("month", Integer.valueOf(this.f118998b));
        linkedHashMap.put(p7.a.f135570h, Integer.valueOf(this.f119000d));
        linkedHashMap.put(p7.a.f135569g, Integer.valueOf(this.f119001e));
        linkedHashMap.put(p7.a.f135568f, Integer.valueOf(this.f119002f));
        linkedHashMap.put("seconds", Integer.valueOf(this.f119003g));
        linkedHashMap.put("isLeapMonth", Boolean.valueOf(this.f118999c));
        linkedHashMap.put("yearName", k());
        linkedHashMap.put("monthName", h());
        linkedHashMap.put("dayName", b());
        linkedHashMap.put("hourName", d());
        return linkedHashMap.toString();
    }
}
