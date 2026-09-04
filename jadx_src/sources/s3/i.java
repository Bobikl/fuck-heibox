package s3;

import anetwork.channel.statist.StatisticData;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public interface i {
    Map<String, List<String>> C();

    byte[] b();

    int getStatusCode();

    Throwable q();

    String w();

    StatisticData z();
}
