package com.fsck.k9.ecdsa

import java.math.BigInteger


/**
 * A class to store public and private keys in a keypair.
 *
 * @property publicKey The public key corresponding to the private key
 * @property privateKey The private key of the keypair.
 */
class EcKeyPair (val publicKey : EcPoint, val privateKey: BigInteger)
