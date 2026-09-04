package n;

import com.tencent.msdk.dns.DnsService;
import com.tencent.msdk.dns.core.rank.IpRankItem;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: IpRankHelper.java */
/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Set<String> f131916b = new HashSet();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set<IpRankItem> f131917a = DnsService.getDnsConfig().ipRankItems;
}
