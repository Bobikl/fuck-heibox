package ye;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.e;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.v0;

/* JADX INFO: compiled from: FormatUtil.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final c f141793a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f141794b = 1024;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f141795c = 1048576;
    public static ChangeQuickRedirect changeQuickRedirect;

    private c() {
    }

    @e
    public final String a(int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.m.Lp, new Class[]{Integer.TYPE}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        if (i10 >= 1048576) {
            v0 v0Var = v0.f124986a;
            String str = String.format("%.2f%s", Arrays.copyOf(new Object[]{Float.valueOf(i10 / 1048576), "GB/s"}, 2));
            f0.o(str, "format(...)");
            return str;
        }
        if (i10 >= 1024) {
            v0 v0Var2 = v0.f124986a;
            String str2 = String.format("%.2f%s", Arrays.copyOf(new Object[]{Float.valueOf(i10 / 1024), "MB/s"}, 2));
            f0.o(str2, "format(...)");
            return str2;
        }
        if (i10 < 0) {
            return null;
        }
        return i10 + "KB/s";
    }

    @e
    public final String b(double d10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Double(d10)}, this, changeQuickRedirect, false, bb.c.m.Mp, new Class[]{Double.TYPE}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        NumberFormat percentInstance = NumberFormat.getPercentInstance(Locale.US);
        percentInstance.setMinimumFractionDigits(0);
        percentInstance.setMaximumFractionDigits(0);
        percentInstance.setGroupingUsed(false);
        return percentInstance.format(d10);
    }

    @dl.d
    public final String c(int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.m.Np, new Class[]{Integer.TYPE}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        int i11 = i10 / 3600;
        int i12 = (i10 % 3600) / 60;
        int i13 = i10 % 60;
        if (i10 <= 0) {
            return "--:--";
        }
        if (i11 >= 100) {
            v0 v0Var = v0.f124986a;
            String str = String.format(Locale.US, "%d:%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13)}, 3));
            f0.o(str, "format(...)");
            return str;
        }
        if (i11 > 0) {
            v0 v0Var2 = v0.f124986a;
            String str2 = String.format(Locale.US, "%02d:%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13)}, 3));
            f0.o(str2, "format(...)");
            return str2;
        }
        v0 v0Var3 = v0.f124986a;
        String str3 = String.format(Locale.US, "%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i12), Integer.valueOf(i13)}, 2));
        f0.o(str3, "format(...)");
        return str3;
    }

    @dl.d
    public final String d(long j10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Long(j10)}, this, changeQuickRedirect, false, bb.c.m.Op, new Class[]{Long.TYPE}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        long j11 = 3600;
        long j12 = j10 / j11;
        long j13 = 60;
        long j14 = (j10 % j11) / j13;
        long j15 = j10 % j13;
        if (j10 <= 0) {
            return "--:--";
        }
        if (j12 >= 100) {
            v0 v0Var = v0.f124986a;
            String str = String.format(Locale.US, "%d:%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j12), Long.valueOf(j14), Long.valueOf(j15)}, 3));
            f0.o(str, "format(...)");
            return str;
        }
        if (j12 > 0) {
            v0 v0Var2 = v0.f124986a;
            String str2 = String.format(Locale.US, "%02d:%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j12), Long.valueOf(j14), Long.valueOf(j15)}, 3));
            f0.o(str2, "format(...)");
            return str2;
        }
        v0 v0Var3 = v0.f124986a;
        String str3 = String.format(Locale.US, "%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j14), Long.valueOf(j15)}, 2));
        f0.o(str3, "format(...)");
        return str3;
    }
}
