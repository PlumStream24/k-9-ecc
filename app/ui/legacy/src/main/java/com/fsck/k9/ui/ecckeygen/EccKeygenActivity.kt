package com.fsck.k9.ui.ecckeygen

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.TextView
import com.fsck.k9.ecdsa.EcKeyPair
import com.fsck.k9.finishWithErrorToast
import com.fsck.k9.ui.R
import com.fsck.k9.ui.base.K9Activity
import org.koin.android.ext.android.inject
import org.koin.core.parameter.parametersOf

class EccKeygenActivity : K9Activity() {
    private val presenter: EccKeygenPresenter by inject { parametersOf(this, this) }

    private lateinit var generateKeyButton: View
    private lateinit var privKeyLayout: View
    private lateinit var pubKeyLayout: View
    private lateinit var privKey: TextView
    private lateinit var pubKey: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setLayout(R.layout.ecc_keygen)
        setTitle("Ecc Keygen")

        val accountUuid = intent.getStringExtra(EXTRA_ACCOUNT)

        supportActionBar!!.setDisplayHomeAsUpEnabled(true)

        generateKeyButton = findViewById(R.id.generateKeyButton)
        privKeyLayout = findViewById(R.id.privKeyLayout)
        pubKeyLayout = findViewById(R.id.pubKeyLayout)
        privKey = findViewById(R.id.privKey)
        pubKey = findViewById(R.id.pubKey)

        generateKeyButton.setOnClickListener { presenter.onClickGenerateKey() }

        presenter.initFromIntent(accountUuid)
    }

    fun finishWithInvalidAccountError() {
        finishWithErrorToast(R.string.toast_account_not_found)
    }

    fun setKeys(kp: EcKeyPair) {
        privKey.text = kp.privateKey.toString()
        pubKey.text = kp.publicKey.x.toString() + " " + kp.publicKey.y.toString()
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home) {
            presenter.onClickHome()
            return true
        } else {
            return super.onOptionsItemSelected(item)
        }
    }

    fun finishAsCancelled() {
        setResult(RESULT_CANCELED)
        finish()
    }

    companion object {
        private const val EXTRA_ACCOUNT = "account"
        private const val UX_DELAY_MS = 1200L

        fun createIntent(context: Context, accountUuid: String): Intent {
            val intent = Intent(context, EccKeygenActivity::class.java)
            intent.putExtra(EXTRA_ACCOUNT, accountUuid)
            return intent
        }
    }

}
