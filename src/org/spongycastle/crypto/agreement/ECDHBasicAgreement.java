// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.agreement;

import java.math.BigInteger;
import org.spongycastle.crypto.BasicAgreement;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.params.ECDomainParameters;
import org.spongycastle.crypto.params.ECKeyParameters;
import org.spongycastle.crypto.params.ECPrivateKeyParameters;
import org.spongycastle.crypto.params.ECPublicKeyParameters;
import org.spongycastle.math.ec.ECCurve;
import org.spongycastle.math.ec.ECFieldElement;
import org.spongycastle.math.ec.ECMultiplier;
import org.spongycastle.math.ec.ECPoint;

public class ECDHBasicAgreement
    implements BasicAgreement
{

    public ECPrivateKeyParameters amK;

    public ECDHBasicAgreement()
    {
    }

    public final int getFieldSize()
    {
        return (((ECKeyParameters) (amK)).aub.alm.getFieldSize() + 7) / 8;
    }

    public final void _mth02CA(CipherParameters cipherparameters)
    {
        amK = (ECPrivateKeyParameters)cipherparameters;
    }

    public final BigInteger _mth02CB(CipherParameters cipherparameters)
    {
        cipherparameters = ((ECPublicKeyParameters)cipherparameters).axk;
        BigInteger biginteger = amK.awZ;
        cipherparameters = cipherparameters.FF79().FE9F()._mth02CA(cipherparameters, biginteger)._mth0188();
        if (cipherparameters._mth021D())
        {
            throw new IllegalStateException("Infinity is not a valid agreement value for ECDH");
        } else
        {
            return cipherparameters.FF8A().toBigInteger();
        }
    }
}
