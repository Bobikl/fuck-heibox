package org.apache.tools.ant.taskdefs.optional;

import com.huawei.hms.framework.common.ContainerUtils;
import com.lzy.okgo.model.Progress;
import com.xiaomi.mipush.sdk.Constants;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Vector;
import java.util.function.Consumer;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.u2;
import org.apache.tools.ant.util.LayoutPreservingProperties;
import org.apache.tools.ant.util.j0;

/* JADX INFO: compiled from: PropertyFile.java */
/* JADX INFO: loaded from: classes5.dex */
public class u extends u2 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f135386k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Properties f135387l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private File f135388m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f135389n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Vector<a> f135390o = new Vector<>();

    /* JADX INFO: compiled from: PropertyFile.java */
    public static class a {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final int f135391i = 0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final String f135392j = "now";

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final String f135393k = "";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f135394a = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f135395b = 2;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f135396c = 2;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f135397d = null;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f135398e = null;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private String f135399f = null;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private String f135400g = null;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f135401h = 5;

        /* JADX INFO: renamed from: org.apache.tools.ant.taskdefs.optional.u$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: PropertyFile.java */
        public static class C1234a extends org.apache.tools.ant.types.w {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final int f135402c = 0;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static final int f135403d = 1;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public static final int f135404e = 2;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final int f135405f = 3;

            public static int h(String str) {
                if ("+".equals(str)) {
                    return 0;
                }
                if (Constants.ACCEPT_TIME_SEPARATOR_SERVER.equals(str)) {
                    return 1;
                }
                return "del".equals(str) ? 3 : 2;
            }

            @Override // org.apache.tools.ant.types.w
            public String[] e() {
                return new String[]{"+", Constants.ACCEPT_TIME_SEPARATOR_SERVER, ContainerUtils.KEY_VALUE_DELIMITER, "del"};
            }
        }

        /* JADX INFO: compiled from: PropertyFile.java */
        public static class b extends org.apache.tools.ant.types.w {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final int f135406c = 0;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static final int f135407d = 1;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public static final int f135408e = 2;

            public static int h(String str) {
                if (com.meituan.robust.Constants.INT.equals(str)) {
                    return 0;
                }
                return Progress.L.equals(str) ? 1 : 2;
            }

            @Override // org.apache.tools.ant.types.w
            public String[] e() {
                return new String[]{com.meituan.robust.Constants.INT, Progress.L, androidx.constraintlayout.core.motion.utils.w.b.f17895e};
            }
        }

        private void a() throws BuildException {
            int i10 = this.f135395b;
            if (i10 == 2 && this.f135396c == 1) {
                throw new BuildException("- is not supported for string properties (key:" + this.f135394a + ")");
            }
            if (this.f135397d == null && this.f135398e == null && this.f135396c != 3) {
                throw new BuildException("\"value\" and/or \"default\" attribute must be specified (key: %s)", this.f135394a);
            }
            if (this.f135394a == null) {
                throw new BuildException("key is mandatory");
            }
            if (i10 == 2 && this.f135400g != null) {
                throw new BuildException("pattern is not supported for string properties (key: %s)", this.f135394a);
            }
        }

        private void b(String str) throws BuildException {
            Calendar calendar = Calendar.getInstance();
            if (this.f135400g == null) {
                this.f135400g = "yyyy/MM/dd HH:mm";
            }
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(this.f135400g);
            String strF = f(str);
            if (strF == null) {
                strF = f135392j;
            }
            if (f135392j.equals(strF)) {
                calendar.setTime(new Date());
            } else {
                try {
                    calendar.setTime(simpleDateFormat.parse(strF));
                } catch (ParseException unused) {
                }
            }
            if (this.f135396c != 2) {
                try {
                    int i10 = Integer.parseInt(this.f135397d);
                    if (this.f135396c == 1) {
                        i10 *= -1;
                    }
                    calendar.add(this.f135401h, i10);
                } catch (NumberFormatException unused2) {
                    throw new BuildException("Value not an integer on " + this.f135394a);
                }
            }
            this.f135399f = simpleDateFormat.format(calendar.getTime());
        }

        private void c(String str) throws BuildException {
            int iIntValue;
            int iIntValue2;
            DecimalFormat decimalFormat = this.f135400g != null ? new DecimalFormat(this.f135400g) : new DecimalFormat();
            int i10 = 0;
            try {
                String strF = f(str);
                iIntValue = strF != null ? decimalFormat.parse(strF).intValue() : 0;
            } catch (NumberFormatException | ParseException unused) {
            }
            if (this.f135396c == 2) {
                i10 = iIntValue;
            } else {
                String str2 = this.f135397d;
                if (str2 != null) {
                    try {
                        iIntValue2 = decimalFormat.parse(str2).intValue();
                    } catch (NumberFormatException | ParseException unused2) {
                        iIntValue2 = 1;
                    }
                } else {
                    iIntValue2 = 1;
                }
                int i11 = this.f135396c;
                if (i11 == 0) {
                    i10 = iIntValue + iIntValue2;
                } else if (i11 == 1) {
                    i10 = iIntValue - iIntValue2;
                }
            }
            this.f135399f = decimalFormat.format(i10);
        }

        private void e(String str) throws BuildException {
            String strF = f(str);
            String str2 = "";
            if (strF == null) {
                strF = "";
            }
            int i10 = this.f135396c;
            if (i10 == 2) {
                str2 = strF;
            } else if (i10 == 0) {
                str2 = strF + this.f135397d;
            }
            this.f135399f = str2;
        }

        private String f(String str) {
            String str2;
            String str3;
            if (this.f135396c != 2) {
                if (str == null) {
                    str = this.f135398e;
                }
                return str;
            }
            String str4 = this.f135397d;
            String str5 = (str4 == null || this.f135398e != null) ? null : str4;
            if (str4 == null && this.f135398e != null && str != null) {
                str5 = str;
            }
            if (str4 == null && (str3 = this.f135398e) != null && str == null) {
                str5 = str3;
            }
            if (str4 != null && this.f135398e != null && str != null) {
                str5 = str4;
            }
            return (str4 == null || (str2 = this.f135398e) == null || str != null) ? str5 : str2;
        }

        protected void d(Properties properties) throws BuildException {
            a();
            if (this.f135396c == 3) {
                properties.remove(this.f135394a);
                return;
            }
            String str = (String) properties.get(this.f135394a);
            try {
                int i10 = this.f135395b;
                if (i10 == 0) {
                    c(str);
                } else if (i10 == 1) {
                    b(str);
                } else {
                    if (i10 != 2) {
                        throw new BuildException("Unknown operation type: %d", Integer.valueOf(this.f135395b));
                    }
                    e(str);
                }
            } catch (NullPointerException e10) {
                e10.printStackTrace();
            }
            if (this.f135399f == null) {
                this.f135399f = "";
            }
            properties.put(this.f135394a, this.f135399f);
        }

        public void g(String str) {
            this.f135398e = str;
        }

        public void h(String str) {
            this.f135394a = str;
        }

        public void i(C1234a c1234a) {
            this.f135396c = C1234a.h(c1234a.d());
        }

        public void j(String str) {
            this.f135400g = str;
        }

        public void k(b bVar) {
            this.f135395b = b.h(bVar.d());
        }

        public void l(b bVar) {
            this.f135401h = bVar.h();
        }

        public void m(String str) {
            this.f135397d = str;
        }
    }

    /* JADX INFO: compiled from: PropertyFile.java */
    public static class b extends org.apache.tools.ant.types.w {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final String f135409d = "millisecond";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final String f135410e = "second";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final String f135411f = "minute";

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final String f135412g = "hour";

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final String f135413h = "day";

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final String f135414i = "week";

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final String f135415j = "month";

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final String f135416k = "year";

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final String[] f135417l = {"millisecond", "second", "minute", "hour", "day", "week", f135415j, f135416k};

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Map<String, Integer> f135418c;

        public b() {
            HashMap map = new HashMap();
            this.f135418c = map;
            map.put("millisecond", 14);
            this.f135418c.put("second", 13);
            this.f135418c.put("minute", 12);
            this.f135418c.put("hour", 11);
            this.f135418c.put("day", 5);
            this.f135418c.put("week", 3);
            this.f135418c.put(f135415j, 2);
            this.f135418c.put(f135416k, 1);
        }

        @Override // org.apache.tools.ant.types.w
        public String[] e() {
            return f135417l;
        }

        public int h() {
            return this.f135418c.get(d().toLowerCase()).intValue();
        }
    }

    private boolean j2(File file) {
        return file != null;
    }

    private void k2() throws BuildException {
        if (!j2(this.f135388m)) {
            throw new BuildException("file token must not be null.", w1());
        }
    }

    private void m2() throws BuildException {
        this.f135390o.forEach(new Consumer() { // from class: org.apache.tools.ant.taskdefs.optional.t
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                this.f135368b.n2((u.a) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n2(a aVar) {
        aVar.d(this.f135387l);
    }

    private void o2() throws BuildException {
        if (this.f135389n) {
            this.f135387l = new Properties();
        } else {
            this.f135387l = new LayoutPreservingProperties();
        }
        try {
            if (!this.f135388m.exists()) {
                log("Creating new property file: " + this.f135388m.getAbsolutePath());
                OutputStream outputStreamNewOutputStream = Files.newOutputStream(this.f135388m.toPath(), new OpenOption[0]);
                try {
                    outputStreamNewOutputStream.flush();
                    outputStreamNewOutputStream.close();
                    return;
                } catch (Throwable th2) {
                    if (outputStreamNewOutputStream != null) {
                        try {
                            outputStreamNewOutputStream.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                    }
                    throw th2;
                }
            }
            log("Updating property file: " + this.f135388m.getAbsolutePath());
            InputStream inputStreamNewInputStream = Files.newInputStream(this.f135388m.toPath(), new OpenOption[0]);
            try {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStreamNewInputStream);
                try {
                    this.f135387l.load(bufferedInputStream);
                    bufferedInputStream.close();
                    if (inputStreamNewInputStream != null) {
                        inputStreamNewInputStream.close();
                        return;
                    }
                    return;
                } catch (Throwable th4) {
                    try {
                        bufferedInputStream.close();
                    } catch (Throwable th5) {
                        th4.addSuppressed(th5);
                    }
                    throw th4;
                }
            } catch (Throwable th6) {
                if (inputStreamNewInputStream != null) {
                    try {
                        inputStreamNewInputStream.close();
                    } catch (Throwable th7) {
                        th6.addSuppressed(th7);
                    }
                }
                throw th6;
            }
        } catch (IOException e10) {
            throw new BuildException(e10.toString());
        }
        throw new BuildException(e10.toString());
    }

    private void s2() throws BuildException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            this.f135387l.store(byteArrayOutputStream, this.f135386k);
            try {
                OutputStream outputStreamNewOutputStream = Files.newOutputStream(this.f135388m.toPath(), new OpenOption[0]);
                try {
                    outputStreamNewOutputStream.write(byteArrayOutputStream.toByteArray());
                    outputStreamNewOutputStream.close();
                } catch (Throwable th2) {
                    if (outputStreamNewOutputStream != null) {
                        try {
                            outputStreamNewOutputStream.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                    }
                    throw th2;
                }
            } catch (IOException e10) {
                try {
                    j0.O().t0(this.f135388m);
                    throw e10;
                } catch (IOException e11) {
                    throw new BuildException(e11, w1());
                }
            }
        } catch (IOException e12) {
            throw new BuildException(e12, w1());
        }
    }

    @Override // org.apache.tools.ant.u2
    public void D1() throws BuildException {
        k2();
        o2();
        m2();
        s2();
    }

    public a l2() {
        a aVar = new a();
        this.f135390o.addElement(aVar);
        return aVar;
    }

    public void p2(String str) {
        this.f135386k = str;
    }

    public void q2(File file) {
        this.f135388m = file;
    }

    public void r2(boolean z10) {
        this.f135389n = z10;
    }
}
