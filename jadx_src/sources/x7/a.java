package x7;

import com.elvishew.xlog.internal.c;

/* JADX INFO: compiled from: DefaultStackTraceFormatter.java */
/* JADX INFO: loaded from: classes6.dex */
public class a implements b {
    @Override // r7.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public String a(StackTraceElement[] stackTraceElementArr) {
        StringBuilder sb2 = new StringBuilder(256);
        if (stackTraceElementArr == null || stackTraceElementArr.length == 0) {
            return null;
        }
        if (stackTraceElementArr.length == 1) {
            return "\t─ " + stackTraceElementArr[0].toString();
        }
        int length = stackTraceElementArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (i10 != length - 1) {
                sb2.append("\t├ ");
                sb2.append(stackTraceElementArr[i10].toString());
                sb2.append(c.f42912a);
            } else {
                sb2.append("\t└ ");
                sb2.append(stackTraceElementArr[i10].toString());
            }
        }
        return sb2.toString();
    }
}
