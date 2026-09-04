package androidx.work.impl.model;

import android.annotation.SuppressLint;
import androidx.lifecycle.LiveData;
import androidx.room.f2;
import androidx.room.l2;
import androidx.room.q0;
import androidx.work.WorkInfo;
import com.max.xiaoheihe.module.game.EpicAddFreeGamesV2Activity;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.AnalyticsConfig;
import com.umeng.analytics.pro.ak;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: WorkSpecDao.kt */
/* JADX INFO: loaded from: classes6.dex */
@androidx.room.h
@Metadata(bv = {}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0011\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H'J\u0012\u0010\t\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u0006H'J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\n\u001a\u00020\u0006H'J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bH'J\u0014\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u000b0\u000fH'J\u0018\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u0006H'J\u0010\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H'J\u0018\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0016H'J\u0018\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0019H'J\u0010\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\u0006H'J\u0010\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\u0006H'J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0007\u001a\u00020\u0006H'J\u0012\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u0007\u001a\u00020\u0006H'J\u001c\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001f0\u000b2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bH'J\"\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u000b0\u000f2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bH'J\u0016\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001f0\u000b2\u0006\u0010$\u001a\u00020\u0006H'J\u001c\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u000b0\u000f2\u0006\u0010$\u001a\u00020\u0006H'J\u0016\u0010'\u001a\b\u0012\u0004\u0012\u00020\u001f0\u000b2\u0006\u0010\n\u001a\u00020\u0006H'J\u001c\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u000b0\u000f2\u0006\u0010\n\u001a\u00020\u0006H'J\u0016\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00160\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H'J\u0016\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b2\u0006\u0010$\u001a\u00020\u0006H'J\u0016\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b2\u0006\u0010\n\u001a\u00020\u0006H'J\u000e\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bH'J\b\u0010.\u001a\u00020-H'J\u0018\u00100\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010/\u001a\u00020\u0019H'J\u0016\u00101\u001a\b\u0012\u0004\u0012\u00020\u00190\u000f2\u0006\u0010\u0007\u001a\u00020\u0006H'J\b\u00102\u001a\u00020\u0013H'J\u0016\u00104\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b2\u0006\u00103\u001a\u00020\u0013H'J\u0016\u00106\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b2\u0006\u00105\u001a\u00020\u0013H'J\u000e\u00107\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH'J\u000e\u00108\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH'J\u0016\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b2\u0006\u00109\u001a\u00020\u0019H'J\b\u0010;\u001a\u00020\u0004H'J\u0010\u0010<\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H'J\u0010\u0010=\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¨\u0006>"}, d2 = {"Landroidx/work/impl/model/v;", "", "Landroidx/work/impl/model/u;", "workSpec", "Lkotlin/b2;", "e", "", "id", ak.av, ak.aD, "name", "", "Landroidx/work/impl/model/u$b;", "D", ak.aG, "Landroidx/lifecycle/LiveData;", "n", "Landroidx/work/WorkInfo$State;", "state", "", "m", "v", "Landroidx/work/e;", "output", "F", "", "enqueueTime", RXScreenCaptureService.KEY_HEIGHT, "I", ak.aB, "g", "Landroidx/work/impl/model/u$c;", "y", EpicAddFreeGamesV2Activity.f84073y1, "J", "t", "tag", "H", "p", "k", "o", "j", "i", "f", "q", "", "r", AnalyticsConfig.RTD_START_TIME, "C", androidx.exifinterface.media.a.W4, "B", "schedulerLimit", androidx.exifinterface.media.a.S4, "maxLimit", "l", "x", "G", "startingAt", RXScreenCaptureService.KEY_WIDTH, ak.aF, "d", "b", "work-runtime_release"}, k = 1, mv = {1, 7, 1})
@SuppressLint({"UnknownNullness"})
public interface v {
    @dl.d
    @q0("SELECT schedule_requested_at FROM workspec WHERE id=:id")
    LiveData<Long> A(@dl.d String id2);

    @q0("UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)")
    int B();

    @q0("UPDATE workspec SET schedule_requested_at=:startTime WHERE id=:id")
    int C(@dl.d String id2, long startTime);

    @dl.d
    @q0("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=:name)")
    List<u.IdAndState> D(@dl.d String name);

    @dl.d
    @q0("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(:schedulerLimit-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))")
    List<u> E(int schedulerLimit);

    @q0("UPDATE workspec SET output=:output WHERE id=:id")
    void F(@dl.d String str, @dl.d androidx.work.e eVar);

    @dl.d
    @q0("SELECT * FROM workspec WHERE state=1")
    List<u> G();

    @f2
    @dl.d
    @q0("SELECT id, state, output, run_attempt_count, generation FROM workspec WHERE id IN\n            (SELECT work_spec_id FROM worktag WHERE tag=:tag)")
    List<u.WorkInfoPojo> H(@dl.d String tag);

    @q0("UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=:id")
    int I(@dl.d String id2);

    @f2
    @dl.d
    @q0("SELECT id, state, output, run_attempt_count, generation FROM workspec WHERE id IN (:ids)")
    List<u.WorkInfoPojo> J(@dl.d List<String> ids);

    @q0("DELETE FROM workspec WHERE id=:id")
    void a(@dl.d String str);

    @l2
    void b(@dl.d u uVar);

    @q0("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))")
    void c();

    @q0("UPDATE workspec SET generation=generation+1 WHERE id=:id")
    void d(@dl.d String str);

    @androidx.room.c0(onConflict = 5)
    void e(@dl.d u uVar);

    @dl.d
    @q0("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=:name)")
    List<String> f(@dl.d String name);

    @dl.e
    @q0("SELECT state FROM workspec WHERE id=:id")
    WorkInfo.State g(@dl.d String id2);

    @q0("UPDATE workspec SET last_enqueue_time=:enqueueTime WHERE id=:id")
    void h(@dl.d String str, long j10);

    @dl.d
    @q0("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=:tag)")
    List<String> i(@dl.d String tag);

    @dl.d
    @q0("SELECT output FROM workspec WHERE id IN\n             (SELECT prerequisite_id FROM dependency WHERE work_spec_id=:id)")
    List<androidx.work.e> j(@dl.d String id2);

    @f2
    @dl.d
    @q0("SELECT id, state, output, run_attempt_count, generation FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=:name)")
    List<u.WorkInfoPojo> k(@dl.d String name);

    @dl.d
    @q0("SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT :maxLimit")
    List<u> l(int maxLimit);

    @q0("UPDATE workspec SET state=:state WHERE id=:id")
    int m(@dl.d WorkInfo.State state, @dl.d String id2);

    @f2
    @dl.d
    @q0("SELECT id FROM workspec")
    LiveData<List<String>> n();

    @f2
    @dl.d
    @q0("SELECT id, state, output, run_attempt_count, generation FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=:name)")
    LiveData<List<u.WorkInfoPojo>> o(@dl.d String name);

    @f2
    @dl.d
    @q0("SELECT id, state, output, run_attempt_count, generation FROM workspec WHERE id IN\n            (SELECT work_spec_id FROM worktag WHERE tag=:tag)")
    LiveData<List<u.WorkInfoPojo>> p(@dl.d String tag);

    @dl.d
    @q0("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5)")
    List<String> q();

    @q0("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1")
    boolean r();

    @q0("UPDATE workspec SET run_attempt_count=0 WHERE id=:id")
    int s(@dl.d String id2);

    @f2
    @dl.d
    @q0("SELECT id, state, output, run_attempt_count, generation FROM workspec WHERE id IN (:ids)")
    LiveData<List<u.WorkInfoPojo>> t(@dl.d List<String> ids);

    @dl.d
    @q0("SELECT id FROM workspec")
    List<String> u();

    @q0("UPDATE workspec SET period_count=period_count+1 WHERE id=:id")
    void v(@dl.d String str);

    @dl.d
    @q0("SELECT * FROM workspec WHERE last_enqueue_time >= :startingAt AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC")
    List<u> w(long startingAt);

    @dl.d
    @q0("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1")
    List<u> x();

    @f2
    @dl.e
    @q0("SELECT id, state, output, run_attempt_count, generation FROM workspec WHERE id=:id")
    u.WorkInfoPojo y(@dl.d String id2);

    @dl.e
    @q0("SELECT * FROM workspec WHERE id=:id")
    u z(@dl.d String id2);
}
