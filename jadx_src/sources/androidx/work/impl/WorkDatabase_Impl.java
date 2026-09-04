package androidx.work.impl;

import androidx.room.RoomDatabase;
import androidx.room.u1;
import androidx.room.v1;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class WorkDatabase_Impl extends WorkDatabase {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private volatile androidx.work.impl.model.v f28785r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private volatile androidx.work.impl.model.b f28786s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private volatile androidx.work.impl.model.z f28787t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private volatile androidx.work.impl.model.j f28788u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private volatile androidx.work.impl.model.o f28789v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private volatile androidx.work.impl.model.r f28790w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private volatile androidx.work.impl.model.e f28791x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private volatile androidx.work.impl.model.g f28792y;

    public class a extends v1.b {
        a(int i10) {
            super(i10);
        }

        @Override // androidx.room.v1.b
        public void a(j3.g gVar) {
            gVar.y0("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            gVar.y0("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
            gVar.y0("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
            gVar.y0("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `required_network_type` INTEGER NOT NULL, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
            gVar.y0("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
            gVar.y0("CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
            gVar.y0("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            gVar.y0("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
            gVar.y0("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `generation` INTEGER NOT NULL DEFAULT 0, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`, `generation`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            gVar.y0("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            gVar.y0("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
            gVar.y0("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            gVar.y0(androidx.work.impl.utils.r.f29369c);
            gVar.y0(u1.CREATE_QUERY);
            gVar.y0("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '5181942b9ebc31ce68dacb56c16fd79f')");
        }

        @Override // androidx.room.v1.b
        public void b(j3.g gVar) {
            gVar.y0("DROP TABLE IF EXISTS `Dependency`");
            gVar.y0("DROP TABLE IF EXISTS `WorkSpec`");
            gVar.y0("DROP TABLE IF EXISTS `WorkTag`");
            gVar.y0("DROP TABLE IF EXISTS `SystemIdInfo`");
            gVar.y0("DROP TABLE IF EXISTS `WorkName`");
            gVar.y0("DROP TABLE IF EXISTS `WorkProgress`");
            gVar.y0("DROP TABLE IF EXISTS `Preference`");
            if (((RoomDatabase) WorkDatabase_Impl.this).mCallbacks != null) {
                int size = ((RoomDatabase) WorkDatabase_Impl.this).mCallbacks.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((RoomDatabase.b) ((RoomDatabase) WorkDatabase_Impl.this).mCallbacks.get(i10)).b(gVar);
                }
            }
        }

        @Override // androidx.room.v1.b
        public void c(j3.g gVar) {
            if (((RoomDatabase) WorkDatabase_Impl.this).mCallbacks != null) {
                int size = ((RoomDatabase) WorkDatabase_Impl.this).mCallbacks.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((RoomDatabase.b) ((RoomDatabase) WorkDatabase_Impl.this).mCallbacks.get(i10)).a(gVar);
                }
            }
        }

        @Override // androidx.room.v1.b
        public void d(j3.g gVar) {
            ((RoomDatabase) WorkDatabase_Impl.this).f26958a = gVar;
            gVar.y0("PRAGMA foreign_keys = ON");
            WorkDatabase_Impl.this.D(gVar);
            if (((RoomDatabase) WorkDatabase_Impl.this).mCallbacks != null) {
                int size = ((RoomDatabase) WorkDatabase_Impl.this).mCallbacks.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((RoomDatabase.b) ((RoomDatabase) WorkDatabase_Impl.this).mCallbacks.get(i10)).c(gVar);
                }
            }
        }

        @Override // androidx.room.v1.b
        public void e(j3.g gVar) {
        }

        @Override // androidx.room.v1.b
        public void f(j3.g gVar) {
            androidx.room.util.b.b(gVar);
        }

        @Override // androidx.room.v1.b
        public v1.c g(j3.g gVar) {
            HashMap map = new HashMap(2);
            map.put("work_spec_id", new androidx.room.util.f.a("work_spec_id", "TEXT", true, 1, null, 1));
            map.put("prerequisite_id", new androidx.room.util.f.a("prerequisite_id", "TEXT", true, 2, null, 1));
            HashSet hashSet = new HashSet(2);
            hashSet.add(new androidx.room.util.f.d("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            hashSet.add(new androidx.room.util.f.d("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("prerequisite_id"), Arrays.asList("id")));
            HashSet hashSet2 = new HashSet(2);
            hashSet2.add(new androidx.room.util.f.C0217f("index_Dependency_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
            hashSet2.add(new androidx.room.util.f.C0217f("index_Dependency_prerequisite_id", false, Arrays.asList("prerequisite_id"), Arrays.asList("ASC")));
            androidx.room.util.f fVar = new androidx.room.util.f("Dependency", map, hashSet, hashSet2);
            androidx.room.util.f fVarA = androidx.room.util.f.a(gVar, "Dependency");
            if (!fVar.equals(fVarA)) {
                return new v1.c(false, "Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + fVar + "\n Found:\n" + fVarA);
            }
            HashMap map2 = new HashMap(27);
            map2.put("id", new androidx.room.util.f.a("id", "TEXT", true, 1, null, 1));
            map2.put("state", new androidx.room.util.f.a("state", "INTEGER", true, 0, null, 1));
            map2.put("worker_class_name", new androidx.room.util.f.a("worker_class_name", "TEXT", true, 0, null, 1));
            map2.put("input_merger_class_name", new androidx.room.util.f.a("input_merger_class_name", "TEXT", false, 0, null, 1));
            map2.put("input", new androidx.room.util.f.a("input", "BLOB", true, 0, null, 1));
            map2.put("output", new androidx.room.util.f.a("output", "BLOB", true, 0, null, 1));
            map2.put("initial_delay", new androidx.room.util.f.a("initial_delay", "INTEGER", true, 0, null, 1));
            map2.put("interval_duration", new androidx.room.util.f.a("interval_duration", "INTEGER", true, 0, null, 1));
            map2.put("flex_duration", new androidx.room.util.f.a("flex_duration", "INTEGER", true, 0, null, 1));
            map2.put("run_attempt_count", new androidx.room.util.f.a("run_attempt_count", "INTEGER", true, 0, null, 1));
            map2.put("backoff_policy", new androidx.room.util.f.a("backoff_policy", "INTEGER", true, 0, null, 1));
            map2.put("backoff_delay_duration", new androidx.room.util.f.a("backoff_delay_duration", "INTEGER", true, 0, null, 1));
            map2.put("last_enqueue_time", new androidx.room.util.f.a("last_enqueue_time", "INTEGER", true, 0, null, 1));
            map2.put("minimum_retention_duration", new androidx.room.util.f.a("minimum_retention_duration", "INTEGER", true, 0, null, 1));
            map2.put("schedule_requested_at", new androidx.room.util.f.a("schedule_requested_at", "INTEGER", true, 0, null, 1));
            map2.put("run_in_foreground", new androidx.room.util.f.a("run_in_foreground", "INTEGER", true, 0, null, 1));
            map2.put("out_of_quota_policy", new androidx.room.util.f.a("out_of_quota_policy", "INTEGER", true, 0, null, 1));
            map2.put("period_count", new androidx.room.util.f.a("period_count", "INTEGER", true, 0, "0", 1));
            map2.put("generation", new androidx.room.util.f.a("generation", "INTEGER", true, 0, "0", 1));
            map2.put("required_network_type", new androidx.room.util.f.a("required_network_type", "INTEGER", true, 0, null, 1));
            map2.put("requires_charging", new androidx.room.util.f.a("requires_charging", "INTEGER", true, 0, null, 1));
            map2.put("requires_device_idle", new androidx.room.util.f.a("requires_device_idle", "INTEGER", true, 0, null, 1));
            map2.put("requires_battery_not_low", new androidx.room.util.f.a("requires_battery_not_low", "INTEGER", true, 0, null, 1));
            map2.put("requires_storage_not_low", new androidx.room.util.f.a("requires_storage_not_low", "INTEGER", true, 0, null, 1));
            map2.put("trigger_content_update_delay", new androidx.room.util.f.a("trigger_content_update_delay", "INTEGER", true, 0, null, 1));
            map2.put("trigger_max_content_delay", new androidx.room.util.f.a("trigger_max_content_delay", "INTEGER", true, 0, null, 1));
            map2.put("content_uri_triggers", new androidx.room.util.f.a("content_uri_triggers", "BLOB", true, 0, null, 1));
            HashSet hashSet3 = new HashSet(0);
            HashSet hashSet4 = new HashSet(2);
            hashSet4.add(new androidx.room.util.f.C0217f("index_WorkSpec_schedule_requested_at", false, Arrays.asList("schedule_requested_at"), Arrays.asList("ASC")));
            hashSet4.add(new androidx.room.util.f.C0217f("index_WorkSpec_last_enqueue_time", false, Arrays.asList("last_enqueue_time"), Arrays.asList("ASC")));
            androidx.room.util.f fVar2 = new androidx.room.util.f("WorkSpec", map2, hashSet3, hashSet4);
            androidx.room.util.f fVarA2 = androidx.room.util.f.a(gVar, "WorkSpec");
            if (!fVar2.equals(fVarA2)) {
                return new v1.c(false, "WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + fVar2 + "\n Found:\n" + fVarA2);
            }
            HashMap map3 = new HashMap(2);
            map3.put("tag", new androidx.room.util.f.a("tag", "TEXT", true, 1, null, 1));
            map3.put("work_spec_id", new androidx.room.util.f.a("work_spec_id", "TEXT", true, 2, null, 1));
            HashSet hashSet5 = new HashSet(1);
            hashSet5.add(new androidx.room.util.f.d("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            HashSet hashSet6 = new HashSet(1);
            hashSet6.add(new androidx.room.util.f.C0217f("index_WorkTag_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
            androidx.room.util.f fVar3 = new androidx.room.util.f("WorkTag", map3, hashSet5, hashSet6);
            androidx.room.util.f fVarA3 = androidx.room.util.f.a(gVar, "WorkTag");
            if (!fVar3.equals(fVarA3)) {
                return new v1.c(false, "WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + fVar3 + "\n Found:\n" + fVarA3);
            }
            HashMap map4 = new HashMap(3);
            map4.put("work_spec_id", new androidx.room.util.f.a("work_spec_id", "TEXT", true, 1, null, 1));
            map4.put("generation", new androidx.room.util.f.a("generation", "INTEGER", true, 2, "0", 1));
            map4.put("system_id", new androidx.room.util.f.a("system_id", "INTEGER", true, 0, null, 1));
            HashSet hashSet7 = new HashSet(1);
            hashSet7.add(new androidx.room.util.f.d("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            androidx.room.util.f fVar4 = new androidx.room.util.f("SystemIdInfo", map4, hashSet7, new HashSet(0));
            androidx.room.util.f fVarA4 = androidx.room.util.f.a(gVar, "SystemIdInfo");
            if (!fVar4.equals(fVarA4)) {
                return new v1.c(false, "SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + fVar4 + "\n Found:\n" + fVarA4);
            }
            HashMap map5 = new HashMap(2);
            map5.put("name", new androidx.room.util.f.a("name", "TEXT", true, 1, null, 1));
            map5.put("work_spec_id", new androidx.room.util.f.a("work_spec_id", "TEXT", true, 2, null, 1));
            HashSet hashSet8 = new HashSet(1);
            hashSet8.add(new androidx.room.util.f.d("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            HashSet hashSet9 = new HashSet(1);
            hashSet9.add(new androidx.room.util.f.C0217f("index_WorkName_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
            androidx.room.util.f fVar5 = new androidx.room.util.f("WorkName", map5, hashSet8, hashSet9);
            androidx.room.util.f fVarA5 = androidx.room.util.f.a(gVar, "WorkName");
            if (!fVar5.equals(fVarA5)) {
                return new v1.c(false, "WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + fVar5 + "\n Found:\n" + fVarA5);
            }
            HashMap map6 = new HashMap(2);
            map6.put("work_spec_id", new androidx.room.util.f.a("work_spec_id", "TEXT", true, 1, null, 1));
            map6.put("progress", new androidx.room.util.f.a("progress", "BLOB", true, 0, null, 1));
            HashSet hashSet10 = new HashSet(1);
            hashSet10.add(new androidx.room.util.f.d("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            androidx.room.util.f fVar6 = new androidx.room.util.f("WorkProgress", map6, hashSet10, new HashSet(0));
            androidx.room.util.f fVarA6 = androidx.room.util.f.a(gVar, "WorkProgress");
            if (!fVar6.equals(fVarA6)) {
                return new v1.c(false, "WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n" + fVar6 + "\n Found:\n" + fVarA6);
            }
            HashMap map7 = new HashMap(2);
            map7.put("key", new androidx.room.util.f.a("key", "TEXT", true, 1, null, 1));
            map7.put("long_value", new androidx.room.util.f.a("long_value", "INTEGER", false, 0, null, 1));
            androidx.room.util.f fVar7 = new androidx.room.util.f("Preference", map7, new HashSet(0), new HashSet(0));
            androidx.room.util.f fVarA7 = androidx.room.util.f.a(gVar, "Preference");
            if (fVar7.equals(fVarA7)) {
                return new v1.c(true, null);
            }
            return new v1.c(false, "Preference(androidx.work.impl.model.Preference).\n Expected:\n" + fVar7 + "\n Found:\n" + fVarA7);
        }
    }

    @Override // androidx.work.impl.WorkDatabase
    public androidx.work.impl.model.b R() {
        androidx.work.impl.model.b bVar;
        if (this.f28786s != null) {
            return this.f28786s;
        }
        synchronized (this) {
            if (this.f28786s == null) {
                this.f28786s = new androidx.work.impl.model.c(this);
            }
            bVar = this.f28786s;
        }
        return bVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public androidx.work.impl.model.e S() {
        androidx.work.impl.model.e eVar;
        if (this.f28791x != null) {
            return this.f28791x;
        }
        synchronized (this) {
            if (this.f28791x == null) {
                this.f28791x = new androidx.work.impl.model.f(this);
            }
            eVar = this.f28791x;
        }
        return eVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public androidx.work.impl.model.g T() {
        androidx.work.impl.model.g gVar;
        if (this.f28792y != null) {
            return this.f28792y;
        }
        synchronized (this) {
            if (this.f28792y == null) {
                this.f28792y = new androidx.work.impl.model.h(this);
            }
            gVar = this.f28792y;
        }
        return gVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public androidx.work.impl.model.j U() {
        androidx.work.impl.model.j jVar;
        if (this.f28788u != null) {
            return this.f28788u;
        }
        synchronized (this) {
            if (this.f28788u == null) {
                this.f28788u = new androidx.work.impl.model.k(this);
            }
            jVar = this.f28788u;
        }
        return jVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public androidx.work.impl.model.o V() {
        androidx.work.impl.model.o oVar;
        if (this.f28789v != null) {
            return this.f28789v;
        }
        synchronized (this) {
            if (this.f28789v == null) {
                this.f28789v = new androidx.work.impl.model.p(this);
            }
            oVar = this.f28789v;
        }
        return oVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public androidx.work.impl.model.r W() {
        androidx.work.impl.model.r rVar;
        if (this.f28790w != null) {
            return this.f28790w;
        }
        synchronized (this) {
            if (this.f28790w == null) {
                this.f28790w = new androidx.work.impl.model.s(this);
            }
            rVar = this.f28790w;
        }
        return rVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public androidx.work.impl.model.v X() {
        androidx.work.impl.model.v vVar;
        if (this.f28785r != null) {
            return this.f28785r;
        }
        synchronized (this) {
            if (this.f28785r == null) {
                this.f28785r = new androidx.work.impl.model.w(this);
            }
            vVar = this.f28785r;
        }
        return vVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public androidx.work.impl.model.z Y() {
        androidx.work.impl.model.z zVar;
        if (this.f28787t != null) {
            return this.f28787t;
        }
        synchronized (this) {
            if (this.f28787t == null) {
                this.f28787t = new androidx.work.impl.model.a0(this);
            }
            zVar = this.f28787t;
        }
        return zVar;
    }

    @Override // androidx.room.RoomDatabase
    public void f() {
        super.c();
        j3.g writableDatabase = super.s().getWritableDatabase();
        try {
            super.e();
            writableDatabase.y0("PRAGMA defer_foreign_keys = TRUE");
            writableDatabase.y0("DELETE FROM `Dependency`");
            writableDatabase.y0("DELETE FROM `WorkSpec`");
            writableDatabase.y0("DELETE FROM `WorkTag`");
            writableDatabase.y0("DELETE FROM `SystemIdInfo`");
            writableDatabase.y0("DELETE FROM `WorkName`");
            writableDatabase.y0("DELETE FROM `WorkProgress`");
            writableDatabase.y0("DELETE FROM `Preference`");
            super.O();
        } finally {
            super.k();
            writableDatabase.D1("PRAGMA wal_checkpoint(FULL)").close();
            if (!writableDatabase.I1()) {
                writableDatabase.y0("VACUUM");
            }
        }
    }

    @Override // androidx.room.RoomDatabase
    protected androidx.room.f0 i() {
        return new androidx.room.f0(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override // androidx.room.RoomDatabase
    protected j3.h j(androidx.room.j jVar) {
        return jVar.f27197c.a(j3.h.b.a(jVar.context).d(jVar.name).c(new v1(jVar, new a(16), "5181942b9ebc31ce68dacb56c16fd79f", "ae2044fb577e65ee8bb576ca48a2f06e")).b());
    }

    @Override // androidx.room.RoomDatabase
    public List<f3.c> m(@androidx.annotation.n0 Map<Class<? extends f3.b>, f3.b> map) {
        return Arrays.asList(new e0(), new f0());
    }

    @Override // androidx.room.RoomDatabase
    public Set<Class<? extends f3.b>> u() {
        return new HashSet();
    }

    @Override // androidx.room.RoomDatabase
    protected Map<Class<?>, List<Class<?>>> v() {
        HashMap map = new HashMap();
        map.put(androidx.work.impl.model.v.class, androidx.work.impl.model.w.P());
        map.put(androidx.work.impl.model.b.class, androidx.work.impl.model.c.f());
        map.put(androidx.work.impl.model.z.class, androidx.work.impl.model.a0.f());
        map.put(androidx.work.impl.model.j.class, androidx.work.impl.model.k.h());
        map.put(androidx.work.impl.model.o.class, androidx.work.impl.model.p.d());
        map.put(androidx.work.impl.model.r.class, androidx.work.impl.model.s.e());
        map.put(androidx.work.impl.model.e.class, androidx.work.impl.model.f.e());
        map.put(androidx.work.impl.model.g.class, androidx.work.impl.model.h.h());
        return map;
    }
}
