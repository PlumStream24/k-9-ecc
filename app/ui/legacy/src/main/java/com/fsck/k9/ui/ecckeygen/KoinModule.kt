package com.fsck.k9.ui.ecckeygen

import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val eccKeygenModule = module {
    factory { (eccKeygenView: EccKeygenActivity) ->
        EccKeygenPresenter(
            get(),
            eccKeygenView,
        )
    }
    viewModel { EccKeygenViewModel() }
}
