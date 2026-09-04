package anet.channel.appmonitor;

import ad.c;
import android.text.TextUtils;
import anet.channel.statist.AlarmObject;
import anet.channel.statist.CountObject;
import anet.channel.statist.Dimension;
import anet.channel.statist.Measure;
import anet.channel.statist.Monitor;
import anet.channel.statist.StatObject;
import anet.channel.util.ALog;
import anet.channel.util.StringUtils;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import t3.b;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public class a implements IAppMonitor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f29605a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Map<Class<?>, List<Field>> f29606b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Map<Class<?>, List<Field>> f29607c = new ConcurrentHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static Map<Field, String> f29608d = new ConcurrentHashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static Random f29609e = new Random();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static Set<Class<?>> f29610f = Collections.newSetFromMap(new ConcurrentHashMap());

    public a() {
        try {
            Class.forName("com.alibaba.mtl.appmonitor.AppMonitor");
            f29605a = true;
        } catch (Exception unused) {
            f29605a = false;
        }
    }

    synchronized void a(Class<?> cls) {
        if (cls != null) {
            if (f29605a) {
                try {
                    if (f29610f.contains(cls)) {
                        return;
                    }
                    Monitor monitor = (Monitor) cls.getAnnotation(Monitor.class);
                    if (monitor == null) {
                        return;
                    }
                    Field[] fields = cls.getFields();
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    DimensionSet dimensionSetCreate = DimensionSet.create();
                    MeasureSet measureSetCreate = MeasureSet.create();
                    for (Field field : fields) {
                        Dimension dimension = (Dimension) field.getAnnotation(Dimension.class);
                        if (dimension != null) {
                            field.setAccessible(true);
                            arrayList.add(field);
                            String name = dimension.name().equals("") ? field.getName() : dimension.name();
                            f29608d.put(field, name);
                            dimensionSetCreate.addDimension(name);
                        } else {
                            Measure measure = (Measure) field.getAnnotation(Measure.class);
                            if (measure != null) {
                                field.setAccessible(true);
                                arrayList2.add(field);
                                String name2 = measure.name().equals("") ? field.getName() : measure.name();
                                f29608d.put(field, name2);
                                if (measure.max() != Double.MAX_VALUE) {
                                    measureSetCreate.addMeasure(new com.alibaba.mtl.appmonitor.model.Measure(name2, Double.valueOf(measure.constantValue()), Double.valueOf(measure.min()), Double.valueOf(measure.max())));
                                } else {
                                    measureSetCreate.addMeasure(name2);
                                }
                            }
                        }
                    }
                    f29606b.put(cls, arrayList);
                    f29607c.put(cls, arrayList2);
                    com.alibaba.mtl.appmonitor.AppMonitor.register(monitor.module(), monitor.monitorPoint(), measureSetCreate, dimensionSetCreate);
                    f29610f.add(cls);
                } catch (Exception e10) {
                    ALog.e("awcn.DefaultAppMonitor", "register fail", null, e10, new Object[0]);
                }
            }
        }
    }

    @Override // anet.channel.appmonitor.IAppMonitor
    public void commitAlarm(AlarmObject alarmObject) {
        if (!f29605a || alarmObject == null || TextUtils.isEmpty(alarmObject.module) || TextUtils.isEmpty(alarmObject.modulePoint)) {
            return;
        }
        if (ALog.isPrintLog(1)) {
            ALog.d("awcn.DefaultAppMonitor", "commit alarm: " + alarmObject, null, new Object[0]);
        }
        if (alarmObject.isSuccess) {
            com.alibaba.mtl.appmonitor.AppMonitor.Alarm.commitSuccess(alarmObject.module, alarmObject.modulePoint, StringUtils.stringNull2Empty(alarmObject.arg));
        } else {
            com.alibaba.mtl.appmonitor.AppMonitor.Alarm.commitFail(alarmObject.module, alarmObject.modulePoint, StringUtils.stringNull2Empty(alarmObject.arg), StringUtils.stringNull2Empty(alarmObject.errorCode), StringUtils.stringNull2Empty(alarmObject.errorMsg));
        }
    }

    @Override // anet.channel.appmonitor.IAppMonitor
    public void commitCount(CountObject countObject) {
        if (!f29605a || countObject == null || TextUtils.isEmpty(countObject.module) || TextUtils.isEmpty(countObject.modulePoint)) {
            return;
        }
        if (ALog.isPrintLog(2)) {
            ALog.i("awcn.DefaultAppMonitor", "commit count: " + countObject, null, new Object[0]);
        }
        com.alibaba.mtl.appmonitor.AppMonitor.Counter.commit(countObject.module, countObject.modulePoint, StringUtils.stringNull2Empty(countObject.arg), countObject.value);
    }

    @Override // anet.channel.appmonitor.IAppMonitor
    public void commitStat(StatObject statObject) {
        if (!f29605a || statObject == null) {
            return;
        }
        Class<?> cls = statObject.getClass();
        Monitor monitor = (Monitor) cls.getAnnotation(Monitor.class);
        if (monitor == null) {
            return;
        }
        if (!f29610f.contains(cls)) {
            a(cls);
        }
        if (statObject.beforeCommit()) {
            if (monitor.monitorPoint().equals(c.f1243w)) {
                int iC = b.c();
                if (iC > 10000 || iC < 0) {
                    iC = 10000;
                }
                if (iC != 10000 && f29609e.nextInt(10000) >= iC) {
                    return;
                }
            }
            try {
                DimensionValueSet dimensionValueSetCreate = DimensionValueSet.create();
                MeasureValueSet measureValueSetCreate = MeasureValueSet.create();
                List<Field> list = f29606b.get(cls);
                HashMap map = ALog.isPrintLog(1) ? new HashMap() : null;
                if (list != null) {
                    for (Field field : list) {
                        Object obj = field.get(statObject);
                        dimensionValueSetCreate.setValue(f29608d.get(field), obj == null ? "" : obj.toString());
                    }
                    for (Field field2 : f29607c.get(cls)) {
                        Double dValueOf = Double.valueOf(field2.getDouble(statObject));
                        measureValueSetCreate.setValue(f29608d.get(field2), dValueOf.doubleValue());
                        if (map != null) {
                            map.put(f29608d.get(field2), dValueOf);
                        }
                    }
                }
                com.alibaba.mtl.appmonitor.AppMonitor.Stat.commit(monitor.module(), monitor.monitorPoint(), dimensionValueSetCreate, measureValueSetCreate);
                if (ALog.isPrintLog(1)) {
                    ALog.d("awcn.DefaultAppMonitor", "commit stat: " + monitor.monitorPoint(), null, "\nDimensions", dimensionValueSetCreate.getMap().toString(), "\nMeasures", map.toString());
                }
            } catch (Throwable th2) {
                ALog.e("awcn.DefaultAppMonitor", "commit monitor point failed", null, th2, new Object[0]);
            }
        }
    }

    @Override // anet.channel.appmonitor.IAppMonitor
    @Deprecated
    public void register() {
    }

    @Override // anet.channel.appmonitor.IAppMonitor
    @Deprecated
    public void register(Class<?> cls) {
    }
}
