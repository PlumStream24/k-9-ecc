package com.fsck.k9.ui.ecckeygen

import com.fsck.k9.Account
import com.fsck.k9.Preferences
import com.fsck.k9.ecdsa.EcKeyGenerator
import com.fsck.k9.ecdsa.EcKeyPair
import com.fsck.k9.ecdsa.curves.Secp256k1

class EccKeygenPresenter internal constructor(
    private val preferences: Preferences,
    private val view: EccKeygenActivity,
) {
    private lateinit var account: Account
    private var keyPair: EcKeyPair? = null

    fun initFromIntent(accountUuid: String?) {
        if (accountUuid == null) {
            view.finishWithInvalidAccountError()
            return
        }

        account = preferences.getAccount(accountUuid) ?: error("Account $accountUuid not found")
        keyPair = account.EccKeyPair
        if (keyPair != null) {
            view.setKeys(keyPair!!)
        }

    }

    fun onClickGenerateKey() {
        keyPair = EcKeyGenerator.newInstance(Secp256k1)
        account.EccKeyPair = keyPair
        view.setKeys(keyPair!!)
    }

    fun onClickHome() {
        view.finishAsCancelled()
    }

}
