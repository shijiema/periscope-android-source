// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.pqc.crypto.gmss;

import java.security.SecureRandom;
import org.spongycastle.crypto.KeyGenerationParameters;

// Referenced classes of package org.spongycastle.pqc.crypto.gmss:
//            GMSSParameters

public class GMSSKeyGenerationParameters extends KeyGenerationParameters
{

    GMSSParameters aKr;

    public GMSSKeyGenerationParameters(SecureRandom securerandom, GMSSParameters gmssparameters)
    {
        super(securerandom, 1);
        aKr = gmssparameters;
    }
}
