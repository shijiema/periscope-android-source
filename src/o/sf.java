// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package o;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

// Referenced classes of package o:
//            sg

public final class sf
    implements ThreadFactory
{

    private String RL;
    private AtomicLong RM;

    public sf(String s, AtomicLong atomiclong)
    {
        RL = s;
        RM = atomiclong;
        super();
    }

    public final Thread newThread(Runnable runnable)
    {
        runnable = Executors.defaultThreadFactory().newThread(new sg(this, runnable));
        runnable.setName((new StringBuilder()).append(RL).append(RM.getAndIncrement()).toString());
        return runnable;
    }
}
