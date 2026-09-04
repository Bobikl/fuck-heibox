package bolts;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class AggregateException extends Exception {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f35452c = "There were multiple errors.";
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<Throwable> f35453b;

    public AggregateException(String str, List<? extends Throwable> list) {
        super(str, (list == null || list.size() <= 0) ? null : list.get(0));
        this.f35453b = Collections.unmodifiableList(list);
    }

    public AggregateException(String str, Throwable[] thArr) {
        this(str, (List<? extends Throwable>) Arrays.asList(thArr));
    }

    public AggregateException(List<? extends Throwable> list) {
        this(f35452c, list);
    }

    @Deprecated
    public Throwable[] a() {
        List<Throwable> list = this.f35453b;
        return (Throwable[]) list.toArray(new Throwable[list.size()]);
    }

    @Deprecated
    public List<Exception> b() {
        ArrayList arrayList = new ArrayList();
        List<Throwable> list = this.f35453b;
        if (list == null) {
            return arrayList;
        }
        for (Throwable th2 : list) {
            if (th2 instanceof Exception) {
                arrayList.add((Exception) th2);
            } else {
                arrayList.add(new Exception(th2));
            }
        }
        return arrayList;
    }

    public List<Throwable> c() {
        return this.f35453b;
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        super.printStackTrace(printStream);
        int i10 = -1;
        for (Throwable th2 : this.f35453b) {
            printStream.append("\n");
            printStream.append("  Inner throwable #");
            i10++;
            printStream.append((CharSequence) Integer.toString(i10));
            printStream.append(": ");
            th2.printStackTrace(printStream);
            printStream.append("\n");
        }
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        super.printStackTrace(printWriter);
        int i10 = -1;
        for (Throwable th2 : this.f35453b) {
            printWriter.append("\n");
            printWriter.append("  Inner throwable #");
            i10++;
            printWriter.append((CharSequence) Integer.toString(i10));
            printWriter.append(": ");
            th2.printStackTrace(printWriter);
            printWriter.append("\n");
        }
    }
}
