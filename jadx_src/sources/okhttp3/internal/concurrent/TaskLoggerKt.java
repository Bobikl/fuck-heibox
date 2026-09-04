package okhttp3.internal.concurrent;

import androidx.exifinterface.media.a;
import dl.d;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.c0;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.v0;

/* JADX INFO: compiled from: TaskLogger.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0003\u001a*\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0080\bø\u0001\u0000\u001a7\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0080\bø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a \u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0005H\u0002\u001a\u000e\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000f\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0012"}, d2 = {"Lokhttp3/internal/concurrent/Task;", "task", "Lokhttp3/internal/concurrent/TaskQueue;", "queue", "Lkotlin/Function0;", "", "messageBlock", "Lkotlin/b2;", "taskLog", a.f23244d5, "block", "logElapsed", "(Lokhttp3/internal/concurrent/Task;Lokhttp3/internal/concurrent/TaskQueue;Lyh/a;)Ljava/lang/Object;", "message", "log", "", "ns", "formatDuration", "okhttp"}, k = 2, mv = {1, 4, 0})
public final class TaskLoggerKt {
    @d
    public static final String formatDuration(long j10) {
        String str;
        if (j10 <= -999500000) {
            str = ((j10 - ((long) 500000000)) / ((long) 1000000000)) + " s ";
        } else if (j10 <= -999500) {
            str = ((j10 - ((long) 500000)) / ((long) 1000000)) + " ms";
        } else if (j10 <= 0) {
            str = ((j10 - ((long) 500)) / ((long) 1000)) + " µs";
        } else if (j10 < 999500) {
            str = ((j10 + ((long) 500)) / ((long) 1000)) + " µs";
        } else if (j10 < 999500000) {
            str = ((j10 + ((long) 500000)) / ((long) 1000000)) + " ms";
        } else {
            str = ((j10 + ((long) 500000000)) / ((long) 1000000000)) + " s ";
        }
        v0 v0Var = v0.f124986a;
        String str2 = String.format("%6s", Arrays.copyOf(new Object[]{str}, 1));
        f0.o(str2, "java.lang.String.format(format, *args)");
        return str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void log(Task task, TaskQueue taskQueue, String str) {
        Logger logger = TaskRunner.INSTANCE.getLogger();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(taskQueue.getName());
        sb2.append(' ');
        v0 v0Var = v0.f124986a;
        String str2 = String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1));
        f0.o(str2, "java.lang.String.format(format, *args)");
        sb2.append(str2);
        sb2.append(": ");
        sb2.append(task.getName());
        logger.fine(sb2.toString());
    }

    public static final <T> T logElapsed(@d Task task, @d TaskQueue queue, @d yh.a<? extends T> block) {
        long jNanoTime;
        f0.p(task, "task");
        f0.p(queue, "queue");
        f0.p(block, "block");
        boolean zIsLoggable = TaskRunner.INSTANCE.getLogger().isLoggable(Level.FINE);
        if (zIsLoggable) {
            jNanoTime = queue.getTaskRunner().getBackend().nanoTime();
            log(task, queue, "starting");
        } else {
            jNanoTime = -1;
        }
        try {
            T tInvoke = block.invoke();
            c0.d(1);
            if (zIsLoggable) {
                long jNanoTime2 = queue.getTaskRunner().getBackend().nanoTime() - jNanoTime;
                new StringBuilder().append("finished run in ");
            }
            return tInvoke;
        } finally {
            c0.d(1);
            if (zIsLoggable) {
                log(task, queue, "failed a run in " + formatDuration(queue.getTaskRunner().getBackend().nanoTime() - jNanoTime));
            }
            c0.c(1);
        }
    }

    public static final void taskLog(@d Task task, @d TaskQueue queue, @d yh.a<String> messageBlock) {
        f0.p(task, "task");
        f0.p(queue, "queue");
        f0.p(messageBlock, "messageBlock");
        if (TaskRunner.INSTANCE.getLogger().isLoggable(Level.FINE)) {
            log(task, queue, messageBlock.invoke());
        }
    }
}
