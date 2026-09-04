package z9;

import android.content.Context;
import com.heytap.mcssdk.utils.g;
import com.heytap.msp.push.mode.DataMessage;
import com.heytap.msp.push.mode.MessageStat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: McsStatisticUtils.java */
/* JADX INFO: loaded from: classes7.dex */
public class a {
    public static boolean a(Context context, String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new MessageStat(context.getPackageName(), str));
        return g.c(context, arrayList);
    }

    public static boolean b(Context context, String str, DataMessage dataMessage) {
        ArrayList arrayList = new ArrayList();
        String packageName = context.getPackageName();
        arrayList.add(dataMessage == null ? new MessageStat(packageName, str) : new MessageStat(dataMessage.getMessageType(), packageName, dataMessage.getGlobalId(), dataMessage.getTaskID(), str, null, dataMessage.getStatisticsExtra(), dataMessage.getDataExtra()));
        return g.c(context, arrayList);
    }

    public static boolean c(Context context, List<String> list) {
        ArrayList arrayList = new ArrayList();
        String packageName = context.getPackageName();
        if (list != null && list.size() != 0) {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new MessageStat(packageName, it.next()));
            }
        }
        return g.c(context, arrayList);
    }
}
