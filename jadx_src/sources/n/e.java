package n;

import android.os.SystemClock;
import android.util.Pair;
import com.tencent.msdk.dns.core.rank.IpRankItem;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: compiled from: IpRankTask.java */
/* JADX INFO: loaded from: classes.dex */
public class e implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f131918b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String[] f131919c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public IpRankItem f131920d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a f131921e;

    public e(String str, String[] strArr, IpRankItem ipRankItem, a aVar) {
        this.f131918b = str;
        this.f131919c = strArr;
        this.f131920d = ipRankItem;
        this.f131921e = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        String[] strArr;
        int[] iArr = new int[this.f131919c.length];
        int i10 = 0;
        while (true) {
            strArr = this.f131919c;
            if (i10 >= strArr.length) {
                break;
            }
            String str = strArr[i10];
            int port = this.f131920d.getPort();
            Socket socket = new Socket();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long jElapsedRealtime2 = ((long) 10000) + jElapsedRealtime;
            try {
                socket.connect(new InetSocketAddress(str, port), 10000);
                jElapsedRealtime2 = SystemClock.elapsedRealtime();
            } catch (IOException e10) {
                e10.printStackTrace();
            }
            iArr[i10] = (int) (jElapsedRealtime2 - jElapsedRealtime);
            i10++;
        }
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < strArr.length; i11++) {
            arrayList.add(new Pair(strArr[i11], Integer.valueOf(iArr[i11])));
        }
        Collections.sort(arrayList, new d(this));
        String[] strArr2 = new String[arrayList.size()];
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            strArr2[i12] = (String) ((Pair) arrayList.get(i12)).first;
        }
        a aVar = this.f131921e;
        if (aVar != null) {
            aVar.a(this.f131918b, strArr2);
        }
    }
}
